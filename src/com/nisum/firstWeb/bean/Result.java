package com.nisum.firstWeb.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Result {

	private double value;
	private String unit;

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
