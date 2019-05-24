package com.chainsys.jobportal.model;

import java.time.LocalDate;

public class UserJobInfo {
	private int id;
	private int user_id;
	private int company_id;
	private int save_job;
	private int apply_job;
	private int created_by;
	private LocalDate created_date;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getCompany_id() {
		return company_id;
	}
	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}
	public int getSave_job() {
		return save_job;
	}
	public void setSave_job(int save_job) {
		this.save_job = save_job;
	}
	public int getApply_job() {
		return apply_job;
	}
	public void setApply_job(int apply_job) {
		this.apply_job = apply_job;
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
	@Override
	public String toString() {
		return "UserJobInfo [id=" + id + ", user_id=" + user_id + ", company_id=" + company_id + ", save_job="
				+ save_job + ", apply_job=" + apply_job + ", created_by=" + created_by + ", created_date="
				+ created_date + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + apply_job;
		result = prime * result + company_id;
		result = prime * result + created_by;
		result = prime * result + ((created_date == null) ? 0 : created_date.hashCode());
		result = prime * result + id;
		result = prime * result + save_job;
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
		UserJobInfo other = (UserJobInfo) obj;
		if (apply_job != other.apply_job)
			return false;
		if (company_id != other.company_id)
			return false;
		if (created_by != other.created_by)
			return false;
		if (created_date == null) {
			if (other.created_date != null)
				return false;
		} else if (!created_date.equals(other.created_date))
			return false;
		if (id != other.id)
			return false;
		if (save_job != other.save_job)
			return false;
		if (user_id != other.user_id)
			return false;
		return true;
	}
}
