package JsonInput;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ProprtyRequest implements Serializable,Cloneable {
	String accesstoken;
	String propertyaddress;
	String propertyname;
	@JsonGetter
	public String getAccesstoken() {
		return accesstoken;
	}
	@JsonSetter
	public void setAccesstoken(String accesstoken) {
		this.accesstoken = accesstoken;
	}
	@JsonGetter
	public String getPropertyaddress() {
		return propertyaddress;
	}
	@JsonSetter
	public void setPropertyaddress(String propertyaddress) {
		this.propertyaddress = propertyaddress;
	}
	@JsonGetter
	public String getPropertyname() {
		return propertyname;
	}
	@JsonSetter
	public void setPropertyname(String propertyname) {
		this.propertyname = propertyname;
	}
	


}
