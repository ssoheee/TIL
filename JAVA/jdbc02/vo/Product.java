package vo;

import java.sql.Date;

public class Product {

	String id;
	String name;
	double price;
	Date regdata;

	public Product() {
	}

	public Product(String id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Product(String id, String name, double price, Date regdata) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.regdata = regdata;
	}


	public Date getRegdata() {
		return regdata;
	}

	public void setRegdata(Date regdata) {
		this.regdata = regdata;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", regdata=" + regdata + "]";
	}


}
