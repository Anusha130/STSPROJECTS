package com.file.csvToDb.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.file.csvToDb.entity.Customer;
import com.file.csvToDb.repo.CustomerRepo;

@Configuration
@EnableBatchProcessing
public class Batchconfig {


	private final CustomerRepo customerrepo;

    public Batchconfig(CustomerRepo customerrepo) {
        this.customerrepo = customerrepo;
    }

	

//this is the csv file location and skipping the line of heading 
	public FlatFileItemReader<Customer> itemReader() {
		FlatFileItemReader<Customer> itemReader = new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("src/main/resources/batch.csv"));
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());
		return itemReader;
	}

	public LineMapper<Customer> lineMapper() {
		DefaultLineMapper<Customer> linemapper = new DefaultLineMapper<>();

		DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
		tokenizer.setDelimiter(",");
		tokenizer.setNames(" id", "firstName", "lastName", "gender", "contactNo", "country", "village", "company");

		tokenizer.setStrict(false);

		BeanWrapperFieldSetMapper<Customer> mapper = new BeanWrapperFieldSetMapper<>();
		mapper.setTargetType(Customer.class);
		linemapper.setFieldSetMapper(mapper);
		linemapper.setLineTokenizer(tokenizer);
		return linemapper;

	}

	@Bean
	public CustomerProcessor processor() {
		return new CustomerProcessor();
	}
	
	@Bean
	public RepositoryItemWriter<Customer> itemwriter(){
		RepositoryItemWriter<Customer> writer = new RepositoryItemWriter<>();
		writer.setRepository(customerrepo);
		writer.setMethodName("save");
		return writer;
	}
	
	public Step step(JobRepository repository,PlatformTransactionManager manager) {
		return new StepBuilder("csv-step",repository)
				.<Customer,Customer>chunk(10,manager)
				.processor(processor())
				 .reader(itemReader())
				.writer(itemwriter())
				.build();
	}


	@Bean
	public Job job(JobRepository jobrepository ,PlatformTransactionManager manager) {
		return new JobBuilder("csv-job",jobrepository)
				.flow(step(jobrepository,manager)).end().build();
	}
	
	
}
