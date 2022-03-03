package com.kush.coaching.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class StudentDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String studentName;
	private String fatherName;
	private String contactNumber;
	private Date joiningDate;
	private Date startingDate;
	private String course;
	private String batch;
	private String status;	//continue or left
	/*
	 * @ElementCollection
	 * 
	 * @CollectionTable(name="pay_list",joinColumns=@JoinColumn(name= "student_id"))
	 * 
	 * @Column(name="pay_date") private List<Date> payDates;
	 */
	
	public StudentDetail() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public Date getStartingDate() {
		return startingDate;
	}

	public void setStartingDate(Date startingDate) {
		this.startingDate = startingDate;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*
	 * public List<Date> getPayDates() { return payDates; }
	 * 
	 * public void setPayDates(List<Date> payDates) { this.payDates = payDates; }
	 */

	@Override
	public String toString() {
		return "StudentDetail [id=" + id + ", studentName=" + studentName + ", fatherName=" + fatherName
				+ ", contactNumber=" + contactNumber + ", joiningDate=" + joiningDate + ", startingDate=" + startingDate
				+ ", course=" + course + ", batch=" + batch + ", status=" + status + "]";// + ", payDates=" + payDates
	}
}
