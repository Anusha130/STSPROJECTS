package com.devlop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cicd")
public class CICDplatform {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name = "platform Name", unique = true)
	private String platformName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlatformName() {
		return platformName;
	}

	public void setPlatformName(String platformName) {
		this.platformName = platformName;
	}

	public CICDplatform(int id, String platformName) {
		super();
		this.id = id;
		this.platformName = platformName;
	}

	public CICDplatform() {

	}

	@Override
	public String toString() {
		return "CICDplatform [id=" + id + ", platformName=" + platformName + "]";
	}

}
