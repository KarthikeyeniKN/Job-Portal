package com.chainsys.jobportal.model;

import java.time.LocalDate;

public class UserLanguage {
	private String languageknown;
	private String proficiency;
	private int user_id;
	private int created_by;
	private LocalDate created_date;
	private int modified_by;
	private LocalDate modified_date;

	public String getLanguageknown() {
		return languageknown;
	}

	public void setLanguageknown(String languageknown) {
		this.languageknown = languageknown;
	}

	public String getProficiency() {
		return proficiency;
	}

	public void setProficiency(String proficiency) {
		this.proficiency = proficiency;
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
		return "UserLanguage [languageknown=" + languageknown + ", proficiency=" + proficiency + ", user_id=" + user_id
				+ ", created_by=" + created_by + ", created_date=" + created_date + ", modified_by=" + modified_by
				+ ", modified_date=" + modified_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + created_by;
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((languageknown == null) ? 0 : languageknown.hashCode());
		result = prime * result + modified_by;
		result = prime * result + ((modified_date == null) ? 0 : modified_date.hashCode());
		result = prime * result + ((proficiency == null) ? 0 : proficiency.hashCode());
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
		UserLanguage other = (UserLanguage) obj;
		if (created_by != other.created_by)
			return false;
		if (created_date == null) {
			if (other.created_date != null)
				return false;
		} else if (!created_date.equals(other.created_date))
			return false;
		if (languageknown == null) {
			if (other.languageknown != null)
				return false;
		} else if (!languageknown.equals(other.languageknown))
			return false;
		if (modified_by != other.modified_by)
			return false;
		if (modified_date == null) {
			if (other.modified_date != null)
				return false;
		} else if (!modified_date.equals(other.modified_date))
			return false;
		if (proficiency == null) {
			if (other.proficiency != null)
				return false;
		} else if (!proficiency.equals(other.proficiency))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
}
