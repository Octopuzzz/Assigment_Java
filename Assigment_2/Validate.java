package Assigment_2;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Validate {
	boolean shoeName(String name) {
		return name.endsWith("Shoe") ? true : false;
	}
	boolean shoecategory(String category) {
		if(category.contentEquals("Sneaker") ||
		   category.contentEquals("Running") || 
		   category.contentEquals("Boot")) {
			return true;
		}
		return false;
	}
	boolean shoeDateFormatter(String date) {
		try {
			SimpleDateFormat SDF = new SimpleDateFormat("dd-MM-yyyy");
			SDF.setLenient(false);
			SDF.parse(date);
		} catch (ParseException pe) {
			return false;
		}
		return true;
	}
	boolean shoePrice(int price) {
		if(price >=5000) {
			return true;
		}
		return false;
	}
}
