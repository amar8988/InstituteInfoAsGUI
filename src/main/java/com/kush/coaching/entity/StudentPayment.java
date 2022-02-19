package com.kush.coaching.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StudentPayment {
	@Id
	private int id;
	private List<Date> paidDates;
	
	public StudentPayment() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Date> getPaidDates() {
		return paidDates;
	}

	public void setPaidDates(List<Date> paidDates) {
		this.paidDates = paidDates;
	}

	@Override
	public String toString() {
		return "StudentPayment [id=" + id + ", paidDates=" + paidDates + "]";
	}
}
