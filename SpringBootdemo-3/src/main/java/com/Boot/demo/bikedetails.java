package com.Boot.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="bikedetails")
public class bikedetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String bikename;
	private long cost;
	private long Phone;
	private String OWNER;
	public int getId() {
		return id;
	}
	
	
	public String getBikename() {
		return bikename;
	}
	public void setBikename(String bikename) {
		this.bikename = bikename;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	public String getOWNER() {
		return OWNER;
	}
	public void setOWNER(String owner) {
		OWNER = owner;
	}
	public bikedetails( String bikename, long cost, long phone, String owner) {
		super();
		//this.id = id;
		this.bikename = bikename;
		this.cost = cost;
		Phone = phone;
		OWNER = owner;
	}
	public bikedetails() {
		
	}
	@Override
	public String toString() {
		return "bikedetails [id=" + id + ", bikename=" + bikename + ", cost=" + cost + ", Phone=" + Phone + ", OWNER="
				+ OWNER + "]";
	}


	
	

}
