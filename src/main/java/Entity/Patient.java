package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

//
//@NoArgsConstructor
//@AllArgsConstructor

public class Patient {

 @Id
 @GeneratedValue
 private int   id;
 private String name;
 private String email;
 private String address;
 private byte[] photo;
 private int phone;
 


public Patient(int id, String name, String email, String address, byte[] photo, int phone) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.address = address;
	this.photo = photo;
	this.phone = phone;
}
public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public int getPatientId() {
	return id;
}
public void setPatientId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public byte[] getPhoto() {
	return photo;
}
public void setPhoto(byte[] photo) {
	this.photo = photo;
}
 
 
 
 
 

}
