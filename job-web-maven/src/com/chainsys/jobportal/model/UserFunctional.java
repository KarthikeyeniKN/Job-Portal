package com.chainsys.jobportal.model;

import java.time.LocalDate;

public class UserFunctional {
	private String industry;
	private String functional;
	private String role;
	private String job_type;
	private String employment_type;
	private String location;
	private int user_id;
	private int created_by;
	private LocalDate created_date;
	private int modified_by;
	private LocalDate modified_date;

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}
	public String getFunctional() {
		return functional;
	}
	public void setFunctional(String functional) {
		this.functional = functional;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getEmployment_type() {
		return employment_type;
	}
	public void setEmployment_type(String employment_type) {
		this.employment_type = employment_type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
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
	public LocalDate getCreated_date() {
		return created_date;
	}
	public void setCreated_date(LocalDate created_date) {
		this.created_date = created_date;
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
		return "UserFunctional [industry=" + industry + ", functional=" + functional + ", role=" + role + ", job_type="
				+ job_type + ", employment_type=" + employment_type + ", location=" + location + ", user_id=" + user_id
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + created_by;
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((employment_type == null) ? 0 : employment_type.hashCode());
		result = prime * result + ((functional == null) ? 0 : functional.hashCode());
		result = prime * result + ((industry == null) ? 0 : industry.hashCode());
		result = prime * result + ((job_type == null) ? 0 : job_type.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + modified_by;
		result = prime * result + ((modified_date == null) ? 0 : modified_date.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + user_id;
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
		UserFunctional other = (UserFunctional) obj;
		if (created_by != other.created_by)
			return false;
		if (created_date == null) {
			if (other.created_date != null)
				return false;
		} else if (!created_date.equals(other.created_date))
			return false;
		if (employment_type == null) {
			if (other.employment_type != null)
				return false;
		} else if (!employment_type.equals(other.employment_type))
			return false;
		if (functional == null) {
			if (other.functional != null)
				return false;
		} else if (!functional.equals(other.functional))
			return false;
		if (industry == null) {
			if (other.industry != null)
				return false;
		} else if (!industry.equals(other.industry))
			return false;
		if (job_type == null) {
			if (other.job_type != null)
				return false;
		} else if (!job_type.equals(other.job_type))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (modified_by != other.modified_by)
			return false;
		if (modified_date == null) {
			if (other.modified_date != null)
				return false;
		} else if (!modified_date.equals(other.modified_date))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
}
