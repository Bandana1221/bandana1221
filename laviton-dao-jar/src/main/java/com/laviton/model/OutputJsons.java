package com.laviton.model;

import java.io.Serializable;
import java.util.ArrayList;

public class OutputJsons implements Serializable {
	ArrayList<OutPutJson> out=new  ArrayList<OutPutJson>();
	String total;
	String error;

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public ArrayList<OutPutJson> getOut() {
		return out;
	}

	public void setOut(ArrayList<OutPutJson> out) {
		this.out = out;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}
	

}
