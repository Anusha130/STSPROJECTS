package com.file.csvToDb.controller;

import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	private final JobLauncher joblauncher;
	private  final Job job;
	
	
	public CustomerController(JobLauncher joblauncher, Job job) {
		super();
		this.joblauncher = joblauncher;
		this.job = job;
	}


	@GetMapping("/batch")
	public BatchStatus startBatch() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException {
		JobParameters jobparameters = new JobParametersBuilder().
				addLong("startAt",System.currentTimeMillis()).toJobParameters();
		
		JobExecution run = joblauncher.run(job,jobparameters);
		
		return run.getStatus();
						
	}
}
