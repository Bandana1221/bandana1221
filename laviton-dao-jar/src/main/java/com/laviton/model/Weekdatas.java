package com.laviton.model;

import java.io.Serializable;

public class Weekdatas  implements Serializable{
	 String Week;
	 String total;
	 String penergy;

	public String getDate() {
		return Week;
	}

	public void setDate(String date) {
		this.Week = date;
	}

	public String getPenergy() {
		return penergy;
	}

	public void setPenergy(String penergy) {
		this.penergy = penergy;
	}
	
	
}
