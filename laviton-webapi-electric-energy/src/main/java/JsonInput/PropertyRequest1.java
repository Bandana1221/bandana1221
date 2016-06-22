package JsonInput;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PropertyRequest1 implements Serializable,Cloneable {
	String acesstoken;
	String propertyid;
	@JsonGetter
	public String getAcesstoken() {
		return acesstoken;
	}
	@JsonSetter
	public void setAcesstoken(String acesstoken) {
		this.acesstoken = acesstoken;
	}
	@JsonGetter
	public String getPropertyid() {
		return propertyid;
	}
	@JsonSetter
	public void setPropertyid(String propertyid) {
		this.propertyid = propertyid;
	}
	
	

}
