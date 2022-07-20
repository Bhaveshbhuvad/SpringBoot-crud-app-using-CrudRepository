package com.example.demo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Customer {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String location;
    @Column
    private double Cost;
	public Customer(int id, String name, String location, double cost) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		Cost = cost;
	}
	public Customer() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getCost() {
		return Cost;
	}
	public void setCost(double cost) {
		Cost = cost;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", location=" + location + ", Cost=" + Cost + "]";
	}
	
}