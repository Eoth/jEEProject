package com.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String typeProperty;
	
	private double price;
	
	private String adress;
	
	private  int nbPers;
	
	private boolean available=true;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date beginDate;
	
	//@Temporal(TemporalType.TIMESTAMP)
	//private Date endDate;
	
	public Product() {}
	
	public Product(int productId, String typeProperty, double price, String adress, int nbPers, boolean available) {
		super();
		this.productId = productId;
		this.typeProperty = typeProperty;
		this.price = price;
		this.adress = adress;
		this.nbPers = nbPers;
		this.available = available;
		this.beginDate = new Date();
		//this.endDate = endDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getTypeProperty() {
		return typeProperty;
	}

	public void setTypeProperty(String typeProperty) {
		this.typeProperty = typeProperty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getNbPers() {
		return nbPers;
	}

	public void setNbPers(int nbPers) {
		this.nbPers = nbPers;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public Date getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(Date beginDate) {
		this.beginDate = beginDate;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", typeProperty=" + typeProperty + ", price=" + price + ", adress="
				+ adress + ", nbPers=" + nbPers + ", available=" + available + ", beginDate=" + beginDate + "]";
	}

//	public Date getEndDate() {
//		return endDate;
//	}
//
//	public void setEndDate(Date endDate) {
//		this.endDate = endDate;
//	}

	
}

