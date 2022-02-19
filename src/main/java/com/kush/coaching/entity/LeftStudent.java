package com.kush.coaching.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LeftStudent {
	@Id
	private int id;
	private Date lastDate;
	
	public LeftStudent() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getLastDate() {
		return lastDate;
	}

	public void setLastDate(Date lastDate) {
		this.lastDate = lastDate;
	}

	@Override
	public String toString() {
		return "LeftStudent [id=" + id + ", lastDate=" + lastDate + "]";
	}
}
