package com.internousdev.wheels.dto;

public class MyPageDTO {

	public int id;
	public int userId;
	public int productCount;
	public int price;
	public int productId;
	public String insert_date;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}

	public int getUserId(){
		return userId;
	}
	public void setUserId(int userId){
		this.userId = userId;
	}

	public int getProductCount(){
		return productCount;
	}
	public void setProductCount(int productCount){
		this.productCount = productCount;
	}

	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}

	public int getProductId(){
		return productId;
	}
	public void setProductId(int productId){
		this.productId = productId;
	}


	public String getInsert_date(){
		return insert_date;
	}

	public void setInsert_date(String insert_date){
		this.insert_date = insert_date;
	}
}
