package com.in28minutes.microservices.limits_service.beans;

public class Limits 
{
	private int minimum;
	private int maximum;
	
	public Limits() {
		super();
	}
	public Limits(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}
	public int getMinimun() {
		return minimum;
	}
	public void setMinimun(int minimun) {
		this.minimum = minimun;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
}
