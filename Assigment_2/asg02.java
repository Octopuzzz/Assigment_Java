package Assigment_2;

import java.util.ArrayList;
import java.util.Scanner;

public class asg02 {
	public Scanner scan = new Scanner(System.in);
	ShoeController sc = new ShoeController();
	ArrayList<Shoe> shoes = new ArrayList<>();
	public asg02 (boolean onApp) {
		while(onApp) {
			System.out.println("Shoe Shop");
			System.out.println("==========");
			System.out.println("1. View Shoes");
			System.out.println("2. Add Shoe");
			System.out.println("3. Delete Shoe");
			System.out.println("4. Exit");	
			int x =-1;
			do {
				System.out.print(">> ");
				x = scan.nextInt();scan.nextLine();
			}while(x<1 || x>4);
			switch (x) {
			case 1:
				sc.view(shoes);
				break;
			case 2:
				sc.add(shoes);
				break;
			case 3:
				sc.delete(shoes);
				break;
			case 4:
				onApp = false;
				break;
			}
		}
	}
	public static void main (String [] args) {
		new asg02(true);
	}
}
