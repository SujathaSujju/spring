package com.xworkz.road.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="road")
public class RoadDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id",length=10,precision = 10)
	private int id;
	@Column(name="name",length=10,precision = 10)
	private String name;
	@Column(name="length",length=10,precision = 10)
	private String length;
	@Column(name="wherefrom",length=10,precision = 10)
	private String from;
	@Column(name="goto",length=10,precision = 10)
	private String to;
	
	
	
	@Override
	public String toString() {
		return "RoadDto [id=" + id + ", name=" + name + ", length=" + length + ", from=" + from + ", to=" + to + "]";
	}
	public RoadDto() {
		super();
		
	}
	public RoadDto(String name, String length, String from, String to) {
		super();
		this.name = name;
		this.length = length;
		this.from = from;
		this.to = to;
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
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	
	
}
