package com.fashion.FashionCity.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class OrderDetails {
	
	
	
	
	
	@Id
	@GeneratedValue
	private int orderid;
	
	@Column(columnDefinition = "varchar(30)")
	private String username,paymode,shipmentaddress,status;
	

	
	
	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public int getOrderid() {
		return orderid;
	}


	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}


	

	public String getPaymode() {
		return paymode;
	}


	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}


	public String getShipmentaddress() {
		return shipmentaddress;
	}


	public void setShipmentaddress(String shipmentaddress) {
		this.shipmentaddress = shipmentaddress;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	

}