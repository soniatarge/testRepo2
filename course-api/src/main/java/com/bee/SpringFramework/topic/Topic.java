package com.bee.SpringFramework.topic;

public class Topic {

	private int id;
	private String name;
	private String Description;

	public Topic() {
	}
	public Topic(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		Description = description;
	}

	public int getId() {
		System.out.println("sadasd");
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

}
