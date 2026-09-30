package com.model;

import java.math.BigDecimal;

public class Expense {
private int Id;
private String userId;
private BigDecimal amount;
private String date;
private int categoryId;
private String description;

public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public BigDecimal getAmount() {
	return amount;
}
public void setAmount(BigDecimal amount) {
	this.amount = amount;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public int getCategoryId() {
	return categoryId;
}
public void setCategoryId(int catagoryId) {
	this.categoryId = catagoryId;
}

}
