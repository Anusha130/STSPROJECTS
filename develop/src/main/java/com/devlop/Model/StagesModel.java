package com.devlop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "stage")
public class StagesModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name = "stage Name", unique = true)
	private String stageName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStageName() {
		return stageName;
	}

	public void setStageName(String stageName) {
		this.stageName = stageName;
	}

	public StagesModel(int id, String stageName) {
		super();
		this.id = id;
		this.stageName = stageName;
	}

	public StagesModel() {

	}

	@Override
	public String toString() {
		return "StagesModel [id=" + id + ", stageName=" + stageName + "]";
	}

}
