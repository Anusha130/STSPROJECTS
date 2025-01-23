package com.devlop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tool")
public class ToolsModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name = "Tool Name", unique = true)
	private String toolName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToolName() {
		return toolName;
	}

	public void setToolName(String toolName) {
		this.toolName = toolName;
	}

	public ToolsModel(int id, String toolName) {
		super();
		this.id = id;
		this.toolName = toolName;
	}

	public ToolsModel() {

	}

	@Override
	public String toString() {
		return "ToolsModel [id=" + id + ", toolName=" + toolName + "]";
	}

}
