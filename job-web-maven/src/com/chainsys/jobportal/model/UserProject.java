package com.chainsys.jobportal.model;

import java.time.LocalDate;

public class UserProject {
	private String title;
	private String duration;
	private String details;
	private String skills;
	private int user_id;
	private int created_by;
	private LocalDate created_date;
	private int modified_by;
	private LocalDate modified_date;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
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
		return "UserProject [title=" + title + ", duration=" + duration + ", details=" + details + ", skills=" + skills
				+ ", user_id=" + user_id + ", created_by=" + created_by + ", created_date=" + created_date
				+ ", modified_by=" + modified_by + ", modified_date=" + modified_date + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + created_by;
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + ((details == null) ? 0 : details.hashCode());
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + modified_by;
		result = prime * result + ((modified_date == null) ? 0 : modified_date.hashCode());
		result = prime * result + ((skills == null) ? 0 : skills.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		UserProject other = (UserProject) obj;
		if (created_by != other.created_by)
			return false;
		if (created_date == null) {
			if (other.created_date != null)
				return false;
		} else if (!created_date.equals(other.created_date))
			return false;
		if (details == null) {
			if (other.details != null)
				return false;
		} else if (!details.equals(other.details))
			return false;
		if (duration == null) {
			if (other.duration != null)
				return false;
		} else if (!duration.equals(other.duration))
			return false;
		if (modified_by != other.modified_by)
			return false;
		if (modified_date == null) {
			if (other.modified_date != null)
				return false;
		} else if (!modified_date.equals(other.modified_date))
			return false;
		if (skills == null) {
			if (other.skills != null)
				return false;
		} else if (!skills.equals(other.skills))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
}
