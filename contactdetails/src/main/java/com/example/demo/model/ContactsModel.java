package com.example.demo.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contact")

public class ContactsModel implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id

	private int slNo;
	private String name;
	private long number;


	public ContactsModel() {
		
	}
	
	public int getSlNo() {
		return slNo;
	}

	public void setSlNo(int slNo) {
		this.slNo = slNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public ContactsModel(int slNo, String name, long number) {

		this.slNo = slNo;
		this.name = name;
		this.number = number;
	}

}
