package com.xworkz.ornament.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="ornamentTable")
@NamedQuery(name="read", query="select dto from OrnamentDto dto")
@NamedQuery(name="findByShopName",query="select dto from OrnamentDto dto where dto.ShopName=:sn")
@NamedQuery(name="updateweightByName",query="update OrnamentDto dto set dto.weight=:wg where dto.name=:nm")
@NamedQuery(name="deleteByName",query="delete from OrnamentDto dto where dto.name=:nm")

public class OrnamentDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private int price;
	private int weight;
	private String karat;
	private String ShopName;
	
	
	
	@Override
	public String toString() {
		return "OrnamentDto [id=" + id + ", name=" + name + ", price=" + price + ", weight=" + weight + ", karat="
				+ karat + ", ShopName=" + ShopName + "]";
	}
	public OrnamentDto() {
		super();
	}
	public OrnamentDto(String name, int price, int weight, String karat, String shopName) {
		super();
		
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.karat = karat;
		ShopName = shopName;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getKarat() {
		return karat;
	}
	public void setKarat(String karat) {
		this.karat = karat;
	}
	public String getShopName() {
		return ShopName;
	}
	public void setShopName(String shopName) {
		ShopName = shopName;
	}
	
	
	
}
