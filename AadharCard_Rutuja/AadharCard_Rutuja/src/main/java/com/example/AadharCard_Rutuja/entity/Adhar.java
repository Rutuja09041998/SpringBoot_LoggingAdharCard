package com.example.AadharCard_Rutuja.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Component
public class Adhar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long aadharNo;
	private String name;
	private int age;
	private int dob;
	private String address;
	
	public Adhar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Adhar(long aadharNo, String name, int age, int dob, String address) {
		super();
		this.aadharNo = aadharNo;
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.address = address;
	}
	
	public long getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(long aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Adhar [aadharNo=" + aadharNo + ", name=" + name + ", age=" + age + ", dob=" + dob + ", address="
				+ address + "]";
	}
}
