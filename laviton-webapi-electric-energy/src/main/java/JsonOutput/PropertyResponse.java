package JsonOutput;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class PropertyResponse implements Serializable {

String success;
String error;
String propertyid;
@JsonGetter
public String getSuccess() {
	return success;
}
@JsonSetter
public void setSuccess(String success) {
	this.success = success;
}
@JsonGetter
public String getError() {
	return error;
}
@JsonSetter
public void setError(String error) {
	this.error = error;
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
