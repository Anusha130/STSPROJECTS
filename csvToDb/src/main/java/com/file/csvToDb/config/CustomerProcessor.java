package com.file.csvToDb.config;

import org.springframework.batch.item.ItemProcessor;

import com.file.csvToDb.entity.Customer;

//inbound and outbound
public class CustomerProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
// TODO Auto-generated method stub
	
		return item;
	}
//here one customer is for how did you map the our input to the required output

}
