package com.kush.coaching.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentPayment {
	@Id
	private int id;
	private Date paidDate;
	
	public StudentPayment() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPaidDate() {
		return paidDate;
	}

	public void setPaidDates(Date paidDate) {
		this.paidDate = paidDate;
	}

	@Override
	public String toString() {
		return "StudentPayment [id=" + id + ", paidDates=" + paidDate + "]";
	}
}
