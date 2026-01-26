package com.springcore.standalone.collections;

import java.util.*;

public class Person {
	
	private List<String> cricketers;
	private Set<Integer> scores;
	private Map<String,String> teams;
	private Properties properties;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getCricketers() {
		return cricketers;
	}

	public void setCricketers(List<String> cricketers) {
		this.cricketers = cricketers;
	}
	
	

	public Set<Integer> getScores() {
		return scores;
	}

	public void setScores(Set<Integer> scores) {
		this.scores = scores;
	}

	public Map<String, String> getTeams() {
		return teams;
	}

	public void setTeams(Map<String, String> teams) {
		this.teams = teams;
	}

	public Properties getProperties() {
		return properties;
	}

	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Person [cricketers=" + cricketers + ", scores=" + scores + ", teams=" + teams + ", properties="
				+ properties + "]";
	}

}
