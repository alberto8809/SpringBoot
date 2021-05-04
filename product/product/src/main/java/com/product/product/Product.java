package com.product.product;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
  private int id;

    @Getter @Setter private String name;
	@Getter @Setter private double unitPrice;
	@Getter @Setter private double discount;
	@Getter @Setter private Calendar lastUpdateTime;
	
		
	public Product() {
		super();
	}



	public Product(int id, String name, double unitPrice, double discount, Calendar lastUpdateTime) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.lastUpdateTime = lastUpdateTime;
	}
	
	
	
}
