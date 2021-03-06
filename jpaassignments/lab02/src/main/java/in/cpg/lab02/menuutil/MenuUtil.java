package in.cpg.lab02.menuutil;

import java.util.ArrayList;
import java.util.Scanner;

import antlr.collections.List;
import in.cpg.lab02.domain.Food;
import in.cpg.lab02.service.FoodService;
import in.cpg.lab02.serviceimpl.FoodServiceImpl;

public class MenuUtil {
	
	private FoodService foodService;
	
	public MenuUtil() {
		foodService = new FoodServiceImpl();
	}
	
public void start() {
		
		int menuChoice;
		String continueChoice;
		Scanner scanner = new Scanner(System.in);
		do {
			showMenu();	
			System.out.println("Enter the choice : (1, 2, 3, 4, 0) : ");
			menuChoice = scanner.nextInt();
			scanner.nextLine();
			switch (menuChoice) {
			case 1: {
				Food food = new Food();
				System.out.println("Enter the id");
				food.setId(scanner.nextInt());
				scanner.nextLine();
				System.out.println("Enter the name");
				food.setName(scanner.nextLine());
				System.out.println("Enter the description");
				food.setDescription(scanner.nextLine());
				System.out.println("Enter the price");
				food.setPrice(scanner.nextInt());
				System.out.println("Enter the served quantity");
				food.setServe_qty(scanner.nextInt());
				scanner.nextLine();
				foodService.addList(food);
				break;
			}
			case 2: {
				System.out.println("------------List Users---------------");
				ArrayList<Food> foodList = new ArrayList<>();
				Food food = new Food();
				for (Food item : foodList) {
					System.out.println(item);
				}
				break;
			}
			}
		System.out.println("Do you want to continue : (yes/no) : ");
		continueChoice = scanner.nextLine();}
		
		while(continueChoice.equals("yes"));
}
		
		public void showMenu() {
			System.out.println("1. Add Food");
			System.out.println("2. List Food");
			System.out.println("3. Update Food");
			System.out.println("4. Delete Food");
			System.out.println("0. Exit");
		}
}
