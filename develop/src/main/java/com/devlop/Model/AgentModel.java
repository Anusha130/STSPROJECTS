package com.devlop.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "agent")
public class AgentModel {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Id")
	private int id;
	@Column(name = "agent Name", unique = true)
	private String agentName;
	@Column(name = "pool Name", unique = true)
	private String poolName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getPoolName() {
		return poolName;
	}

	public void setPoolName(String poolName) {
		this.poolName = poolName;
	}

	public AgentModel(int id, String agentName, String poolName) {
		super();
		this.id = id;
		this.agentName = agentName;
		this.poolName = poolName;

	}

	public AgentModel() {

	}

	@Override
	public String toString() {
		return "AgentModel [id=" + id + ", agentName=" + agentName + ", poolName=" + poolName + "]";
	}

}
