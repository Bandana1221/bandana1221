package com.laviton.model;

import java.io.Serializable;
import java.util.ArrayList;

public class MonthlJson implements Serializable{
	ArrayList<Weekdatas> out=new  ArrayList<Weekdatas>();
	String total;
	String error;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public ArrayList<Weekdatas> getOut() {
		return out;
	}

	public void setOut(ArrayList<Weekdatas> out) {
		this.out = out;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	

}
