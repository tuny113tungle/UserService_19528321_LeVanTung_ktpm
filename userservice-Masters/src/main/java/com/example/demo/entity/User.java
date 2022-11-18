package com.example.demo.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userID;
    private String name;
    private String address;
    private String phone;
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public User(int userID, String name, String address, String phone) {
		super();
		this.userID = userID;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", name=" + name + ", address=" + address + ", phone=" + phone + "]";
	}

   
}
