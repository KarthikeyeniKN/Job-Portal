package com.chainsys.jobportal.model;

import java.time.LocalDate;

public class Profile {
private LocalDate dob;
private String gender;
private String address;
private int pincode;
private String marial_status;
private String education_degree;
private int yr_of_completion;
private String college_name;
private String relocate;
private int user_id;
private int created_by;
private LocalDate createddate;
private int modified_by;
private LocalDate modified_date;

public LocalDate getDob() {
	return dob;
}
public void setDob(LocalDate dob) {
	this.dob = dob;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getMarial_status() {
	return marial_status;
}
public void setMarial_status(String marial_status) {
	this.marial_status = marial_status;
}
public String getEducation_degree() {
	return education_degree;
}
public void setEducation_degree(String education_degree) {
	this.education_degree = education_degree;
}
public int getYr_of_completion() {
	return yr_of_completion;
}
public void setYr_of_completion(int yr_of_completion) {
	this.yr_of_completion = yr_of_completion;
}
public String getCollege_name() {
	return college_name;
}
public void setCollege_name(String college_name) {
	this.college_name = college_name;
}
public String getRelocate() {
	return relocate;
}
public void setRelocate(String relocate) {
	this.relocate = relocate;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public int getCreated_by() {
	return created_by;
}
public void setCreated_by(int created_by) {
	this.created_by = created_by;
}
public LocalDate getCreateddate() {
	return createddate;
}
public void setCreateddate(LocalDate createddate) {
	this.createddate = createddate;
}
public int getModified_by() {
	return modified_by;
}
public void setModified_by(int modified_by) {
	this.modified_by = modified_by;
}
public LocalDate getModified_date() {
	return modified_date;
}
public void setModified_date(LocalDate modified_date) {
	this.modified_date = modified_date;
}
@Override
public String toString() {
	return "Profile [dob=" + dob + ", gender=" + gender + ", address=" + address + ", pincode=" + pincode
			+ ", marial_status=" + marial_status + ", education_degree=" + education_degree + ", yr_of_completion="
			+ yr_of_completion + ", college_name=" + college_name + ", relocate=" + relocate + ", user_id=" + user_id
			+ ", created_by=" + created_by + ", createddate=" + createddate + ", modified_by=" + modified_by
			+ ", modified_date=" + modified_date + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((address == null) ? 0 : address.hashCode());
	result = prime * result + ((college_name == null) ? 0 : college_name.hashCode());
	result = prime * result + created_by;
	result = prime * result + ((createddate == null) ? 0 : createddate.hashCode());
	result = prime * result + ((dob == null) ? 0 : dob.hashCode());
	result = prime * result + ((education_degree == null) ? 0 : education_degree.hashCode());
	result = prime * result + ((gender == null) ? 0 : gender.hashCode());
	result = prime * result + ((marial_status == null) ? 0 : marial_status.hashCode());
	result = prime * result + modified_by;
	result = prime * result + ((modified_date == null) ? 0 : modified_date.hashCode());
	result = prime * result + pincode;
	result = prime * result + ((relocate == null) ? 0 : relocate.hashCode());
	result = prime * result + user_id;
	result = prime * result + yr_of_completion;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Profile other = (Profile) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (college_name == null) {
		if (other.college_name != null)
			return false;
	} else if (!college_name.equals(other.college_name))
		return false;
	if (created_by != other.created_by)
		return false;
	if (createddate == null) {
		if (other.createddate != null)
			return false;
	} else if (!createddate.equals(other.createddate))
		return false;
	if (dob == null) {
		if (other.dob != null)
			return false;
	} else if (!dob.equals(other.dob))
		return false;
	if (education_degree == null) {
		if (other.education_degree != null)
			return false;
	} else if (!education_degree.equals(other.education_degree))
		return false;
	if (gender == null) {
		if (other.gender != null)
			return false;
	} else if (!gender.equals(other.gender))
		return false;
	if (marial_status == null) {
		if (other.marial_status != null)
			return false;
	} else if (!marial_status.equals(other.marial_status))
		return false;
	if (modified_by != other.modified_by)
		return false;
	if (modified_date == null) {
		if (other.modified_date != null)
			return false;
	} else if (!modified_date.equals(other.modified_date))
		return false;
	if (pincode != other.pincode)
		return false;
	if (relocate == null) {
		if (other.relocate != null)
			return false;
	} else if (!relocate.equals(other.relocate))
		return false;
	if (user_id != other.user_id)
		return false;
	if (yr_of_completion != other.yr_of_completion)
		return false;
	return true;
}
}
