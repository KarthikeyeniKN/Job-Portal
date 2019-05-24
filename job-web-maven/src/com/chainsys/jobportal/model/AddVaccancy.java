package com.chainsys.jobportal.model;

public class AddVaccancy {
	private int recruiters_id;
	private String recruiters_name;
	private String position;
	private String company_name;
	private String location;
	private String skill_required;
	private String vaccancy_position;
	private int vaccancy;
	private String about;
	private String criteria;
	private String perks;
	private String username;
	private String email;
	public int getRecruiters_id() {
		return recruiters_id;
	}
	public void setRecruiters_id(int recruiters_id) {
		this.recruiters_id = recruiters_id;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getCriteria() {
		return criteria;
	}
	public void setCriteria(String criteria) {
		this.criteria = criteria;
	}
	public String getPerks() {
		return perks;
	}
	public void setPerks(String perks) {
		this.perks = perks;
	}
	public String getRecruiters_name() {
		return recruiters_name;
	}
	public void setRecruiters_name(String recruiters_name) {
		this.recruiters_name = recruiters_name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSkill_required() {
		return skill_required;
	}
	public void setSkill_required(String skill_required) {
		this.skill_required = skill_required;
	}
	public String getVaccancy_position() {
		return vaccancy_position;
	}
	public void setVaccancy_position(String vaccancy_position) {
		this.vaccancy_position = vaccancy_position;
	}
	public int getVaccancy() {
		return vaccancy;
	}
	public void setVaccancy(int vaccancy) {
		this.vaccancy = vaccancy;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((about == null) ? 0 : about.hashCode());
		result = prime * result + ((company_name == null) ? 0 : company_name.hashCode());
		result = prime * result + ((criteria == null) ? 0 : criteria.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((perks == null) ? 0 : perks.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + recruiters_id;
		result = prime * result + ((recruiters_name == null) ? 0 : recruiters_name.hashCode());
		result = prime * result + ((skill_required == null) ? 0 : skill_required.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + vaccancy;
		result = prime * result + ((vaccancy_position == null) ? 0 : vaccancy_position.hashCode());
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
		AddVaccancy other = (AddVaccancy) obj;
		if (about == null) {
			if (other.about != null)
				return false;
		} else if (!about.equals(other.about))
			return false;
		if (company_name == null) {
			if (other.company_name != null)
				return false;
		} else if (!company_name.equals(other.company_name))
			return false;
		if (criteria == null) {
			if (other.criteria != null)
				return false;
		} else if (!criteria.equals(other.criteria))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (perks == null) {
			if (other.perks != null)
				return false;
		} else if (!perks.equals(other.perks))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (recruiters_id != other.recruiters_id)
			return false;
		if (recruiters_name == null) {
			if (other.recruiters_name != null)
				return false;
		} else if (!recruiters_name.equals(other.recruiters_name))
			return false;
		if (skill_required == null) {
			if (other.skill_required != null)
				return false;
		} else if (!skill_required.equals(other.skill_required))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (vaccancy != other.vaccancy)
			return false;
		if (vaccancy_position == null) {
			if (other.vaccancy_position != null)
				return false;
		} else if (!vaccancy_position.equals(other.vaccancy_position))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AddVaccancy [recruiters_id=" + recruiters_id + ", recruiters_name=" + recruiters_name + ", position="
				+ position + ", company_name=" + company_name + ", location=" + location + ", skill_required="
				+ skill_required + ", vaccancy_position=" + vaccancy_position + ", vaccancy=" + vaccancy + ", about="
				+ about + ", criteria=" + criteria + ", perks=" + perks + ", username=" + username + ", email=" + email
				+ "]";
	}	
}