package com.kush.coaching.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dues {
	@Id
	private int id;
	private String studentFatherName;
	private int amount;
	private String status;		//due or advance
	
	public Dues() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentFatherName() {
		return studentFatherName;
	}

	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Dues [id=" + id + ", studentFatherName=" + studentFatherName + ", amount=" + amount + ", status="
				+ status + "]";
	}
}
