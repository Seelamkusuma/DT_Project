package com.mobitel.MobitelBackend1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class User 
{
	@Id
	@GeneratedValue
	int enabled;
	
	String username;
    @Column(columnDefinition="varchar(15)")  
    String password;
    @Column(columnDefinition="varchar(15)")
    String CustName;
    @Column(columnDefinition="varchar(25)")
    String role;
    @Column(columnDefinition="varchar(15)")
    String email;
    @Column(columnDefinition="varchar(40)")
    String address;
    @Column(columnDefinition="varchar(40)")
    String mobile;
    @Column(columnDefinition="varchar(10)")
	public int getenabled() {
		return enabled;
	}
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustName() {
		return CustName;
	}

	public void setCustName(String CustName) {
		this.CustName = CustName;
	}
	public int getEnabled() {
		return enabled;
	}
	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	

}

