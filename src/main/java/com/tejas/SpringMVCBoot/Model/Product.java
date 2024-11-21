package com.tejas.SpringMVCBoot.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

@Entity
public class Product {

	@Id
	@Column
	private String id ;
	@Column
	private String name;
	@Column
	private double price;


	public Product(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}


	public Product() {
		super();
	}
}