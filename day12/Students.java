package com.techment.day12.newfeature;

public class Students {

	private String name;

	public Students(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Students [name=" + name + "]";
	}

	
	
}
