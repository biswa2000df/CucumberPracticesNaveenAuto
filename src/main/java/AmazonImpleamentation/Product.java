package AmazonImpleamentation;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String productName;
	private int price;

	public Product(String productName, int price) {
		this.productName = productName;
		this.price = price;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}
	
	public List<String> getProductList(){
		List<String> productList=new ArrayList<String>();
		productList.add("Apple MacBook Pro");
		productList.add("Apple MacBook Air");
		productList.add("Apple iphone 12");
		return productList;
	}

}