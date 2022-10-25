package com.example.product.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "employee")
public class Product {
	 @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name="productID")
         private Long id;
     
     @Column(name="name")
     private String name;
     
     @Column(name="productType")
     private String producttype;
     
     @Column(name="category")
     private String category;
     
     @Column(name="price")
     private Long price;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Object getProductid() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setProductId(Object productid) {
		// TODO Auto-generated method stub
		
	}

	

}
