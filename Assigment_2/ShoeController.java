package Assigment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoeController {
	Scanner scan = new Scanner(System.in);
	Validate validate = new Validate();
	public void view (ArrayList<Shoe> shoes) {
		if(shoes.isEmpty()) {
			System.out.println("Empty");
			System.out.println("Press enter to continue....");
			scan.nextLine();		
		}else {
			for(int i=0; i< shoes.size();i++) {
				System.out.println(i+" . "+shoes.get(i).toString());
			}
		}
	}
	public void add (ArrayList<Shoe> shoes) {
		String name,category,relasedate;
		int price;
		do {
			System.out.println("Input shoe's name end with [Shoe ex : Fire Shoe] :  ");
			name = scan.nextLine();
		}while(!validate.shoeName(name));
		do {
			System.out.println("Input shoe's category [Sneaker || Running || Boot ] : ");
			category = scan.nextLine();
		}while(!validate.shoecategory(category));
		do {
			System.out.println("Shoe's Relase [dd-MM-yyy] : ");
			relasedate = scan.nextLine();
		}while(!validate.shoeDateFormatter(relasedate));
		do {
			System.out.println("Input shoe's Price [More than or Equals to 5000 ] : ");
			price = scan.nextInt();scan.nextLine();
		}while(!validate.shoePrice(price));
		shoes.add(new Shoe(name,category,relasedate,price));
	}
	public void delete (ArrayList<Shoe> shoes) {
		if(shoes.isEmpty()) {
			System.out.println("Empty");
			System.out.println("Press enter to continue....");
			scan.nextLine();
		}else {
			view(shoes);
			int choice = -1;
			do {
				System.out.printf("Choose shoes's number to delete [1..%d] : ",shoes.size());
				choice = scan.nextInt();scan.nextLine();
			}while(choice <1 || choice>shoes.size());
			shoes.remove(choice-1);
			System.out.println("Shoe removed");
		}
	}
}
