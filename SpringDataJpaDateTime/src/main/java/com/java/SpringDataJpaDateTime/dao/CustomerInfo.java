package com.java.SpringDataJpaDateTime.dao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerInfo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	public CustomerInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private LocalDateTime dob;
	
	private LocalDate regDate;
	
	private LocalTime regTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getDob() {
		return dob;
	}

	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}

	public LocalDate getRegDate() {
		return regDate;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}

	public LocalTime getRegTime() {
		return regTime;
	}

	public void setRegTime(LocalTime regTime) {
		this.regTime = regTime;
	}

	@Override
	public String toString() {
		return "CustomerInfo [id=" + id + ", name=" + name + ", dob=" + dob + ", regDate=" + regDate + ", regTime="
				+ regTime + "]";
	}

	public CustomerInfo(String name, LocalDateTime dob, LocalDate regDate, LocalTime regTime) {
		super();
		
		this.name = name;
		this.dob = dob;
		this.regDate = regDate;
		this.regTime = regTime;
	}
	
	
}
