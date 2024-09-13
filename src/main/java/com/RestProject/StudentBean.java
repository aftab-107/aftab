package com.RestProject;

import java.awt.geom.Arc2D.Float;

public class StudentBean {
	private String name;
	private int roll;
	private float marks;
	
	
	public StudentBean(String name, int roll, float marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getRoll() {
		return roll;
	}


	public void setRoll(int roll) {
		this.roll = roll;
	}


	public float getMarks() {
		return marks;
	}


	public void setMarks(float marks) {
		this.marks = marks;
	}
	

}
