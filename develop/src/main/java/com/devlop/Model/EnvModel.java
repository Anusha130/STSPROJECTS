package com.devlop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "env")
public class EnvModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name = "env Name", unique = true)
	private String envName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEnvName() {
		return envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
	}

	public EnvModel(int id, String envName) {
		super();
		this.id = id;
		this.envName = envName;
	}

	public EnvModel() {

	}

	@Override
	public String toString() {
		return "EnvModel [id=" + id + ", envName=" + envName + "]";
	}

}
