package Assigment_2;

import java.util.concurrent.ThreadLocalRandom;

public class Shoe {
	private String ID,category,name,relasedate;
	private int price;
	
	public Shoe(String name, String category,String relasedate,int price) {
		this.ID = generateID();
		this.name = name;
		this.category = category;
		this.relasedate = relasedate;
		this.price = price;
	}
	private String generateID() {
		String Id = "SH";
		for(int i = 0;i<3;i++) {
			Integer n = ThreadLocalRandom.current().nextInt(0,10);
			Id += n.toString();
		}
		return Id;
	}
	public String toString() {
		String result = "";
		result += "Name : "+this.name + "-" +this.ID + "\n";
		result += "=================" +"\n";
		result += "Category : " + this.category + "\n";
		result += "Relase Date : " +this.relasedate + "\n";
		result += "Price : " + this.price + "\n";
		return result;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRelasedate() {
		return relasedate;
	}
	public void setRelasedate(String relasedate) {
		this.relasedate = relasedate;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
