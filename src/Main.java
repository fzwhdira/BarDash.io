import java.util.Scanner;
import java.util.Vector;

public class Main {
	
	Scanner scan = new Scanner(System.in);
	Vector<Drink> drinkvec = new Vector<>();

	public void addDrink() {
		String type, name, temprature, topping;
		Integer sugar=0, basePrice=0, teaLeave=0;
		
		Drink newDrink;
		
		do {
			System.out.print("Chosse drink's type [Tea | Boba](case sensitive): ");
			type = scan.nextLine();
		} while (!type.equals("Tea") && !type.equals("Boba"));
		
		do {
			System.out.print("Input name [5 - 25 characters]: ");
			name = scan.nextLine();
		} while (name.length() < 5 || name.length() > 25);
		
		do {
			System.out.print("Choose between Hot or Cold(case sensitive): ");
			temprature = scan.nextLine();
		} while (!temprature.equals("Hot") && !temprature.equals("Cold"));
		
		do {
			System.out.print("Input sugar amount [1 - 5]: ");
			sugar = scan.nextInt(); scan.nextLine();
		} while (sugar < 1 || sugar > 5);
		
		do {
			System.out.print("Input price [10000 - 150000]: ");
			basePrice = scan.nextInt(); scan.nextLine();
		} while (basePrice < 10000 || basePrice > 150000);
		
		if (type.equals("Tea")) {
			do {
				System.out.print("Input tea leaves weight [1 - 5]: ");
				teaLeave = scan.nextInt(); scan.nextLine();
			} while (teaLeave < 1 || teaLeave > 5);
			
			newDrink = new Tea(type, name, temprature, sugar, basePrice, teaLeave);
			drinkvec.add(newDrink);
		}
		else {
			do {
				System.out.print("Choose topping [Pearl | Grass Jelly | Coffee Jelly](case sensitive): ");
				topping = scan.nextLine();
			} while (!topping.equals("Pearl") && !topping.equals("Grass Jelly") && !topping.equals("Coffee Jelly"));
			
			newDrink = new Boba(type, name, temprature, sugar, basePrice, topping);
			drinkvec.add(newDrink);
		}	
	}
	
	public void viewDrink() {
		if (drinkvec.size()==0) {
			System.out.println("There are no drinks available yet");
		} else {
			for (Drink drink : drinkvec) {
				drink.printDrink();
			}
		}
		System.out.println("Press enter to continue...");
		scan.nextLine();
	}
	
	public void mainMenu() {
		int inputMenu=0;
		do {
			clearScreen();
			System.out.println("Welcome to Bar Dash");
			System.out.println("===================");
			System.out.println("1. Add Drink");
			System.out.println("2. View Drink");
			System.out.println("3. Exit");
			System.out.print(">> ");
			
			try {
				inputMenu = scan.nextInt(); 
				scan.nextLine();
			} catch (Exception e) {
				inputMenu=0;
			}
			
			switch (inputMenu) {
			case 1:
				addDrink();
				break;
			case 2:
				viewDrink();
				break;
			}
		} while (inputMenu != 3);
	}
	
	public static void clearScreen() {
		  for(int i=0;i<25;i++) {
			  System.out.println();
		  }
	  }
	
	public Main() {
		mainMenu();
	}

	public static void main(String[] args) {
		new Main();
	}

}
