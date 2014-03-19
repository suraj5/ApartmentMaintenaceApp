package com.example.multistoredapartmentmaintenace;

public class ApartmentDetails {
private String ApartmentName;
private String Address;
private String City;
private String State;
private String pincode;
private int no_of_residents;
public ApartmentDetails(String apartmentname2, String apartmentAddress,
		String apartmentCity, String apartmentstate, String apartmentpincode,
		int apartmentresidentscount) {
	// TODO Auto-generated constructor stub
	ApartmentName=apartmentname2;
	Address=apartmentAddress;
	City=apartmentCity;
	State=apartmentstate;
	pincode=apartmentpincode;
	no_of_residents=apartmentresidentscount;
	
}
public String getApartmentName() {
	return ApartmentName;
}
public void setApartmentName(String apartmentName) {
	ApartmentName = apartmentName;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getPincode() {
	return pincode;
}
public void setPincode(String pincode) {
	this.pincode = pincode;
}
public int getNo_of_residents() {
	return no_of_residents;
}
public void setNo_of_residents(int no_of_residents) {
	this.no_of_residents = no_of_residents;
}

}
