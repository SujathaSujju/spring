package com.xworkz.institutes.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="institutes")
public class InstituteDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="location")
	private String location;
	@Column(name="noOfStudents")
	private int noOfStudents;
	@Column(name="noOfTrainers")
	private int noOfTrainers;
	
	
	
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
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	
	
	public InstituteDto(String name, String location, int noOfStudents, int noOfTrainers) {
		super();
		this.name = name;
		this.location = location;
		this.noOfStudents = noOfStudents;
		this.noOfTrainers = noOfTrainers;
	}
	
	
	public InstituteDto() {
		super();
		
	}
	@Override
	public String toString() {
		return "InstituteDto [id=" + id + ", name=" + name + ", location=" + location + ", noOfStudents=" + noOfStudents
				+ ", noOfTrainers=" + noOfTrainers + "]";
	}
	
	
	

}
