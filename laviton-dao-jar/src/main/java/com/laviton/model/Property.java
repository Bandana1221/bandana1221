package com.laviton.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Property {
	@Id
	 @GeneratedValue(strategy= GenerationType.AUTO)
		@Column
		private int login_id;
		@Column
		private String property_name;
		@Column
		private String property_address;
		public int getLogin_id() {
			return login_id;
		}
		public void setLogin_id(int login_id) {
			this.login_id = login_id;
		}
		public String getProperty_name() {
			return property_name;
		}
		public void setProperty_name(String property_name) {
			this.property_name = property_name;
		}
		public String getProperty_address() {
			return property_address;
		}
		public void setProperty_address(String property_address) {
			this.property_address = property_address;
		}
		
}
