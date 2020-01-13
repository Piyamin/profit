package profit;
import java.util.Scanner;
import java.util.ArrayList; 

public class ProfitDemo {
	static Scanner in = new Scanner(System.in);
	static ArrayList<Employee> em = new ArrayList<Employee>();
	static ArrayList<Salary> sa = new ArrayList<Salary>();
	static ArrayList<Sales> sal = new ArrayList<Sales>();
	public static void main(String[] args) {
		int choice;
		
	do {
		System.out.println("Please select Menu ");
		System.out.println("[1] Add Employee");
		System.out.println("[2] Save sales ");
		choice = in.nextInt();
		if (choice ==1) {
			insertEmployee ();
		}
		if (choice == 2) {
			
			insertSales ();
		}
		System.out.print("\nDo you want to select [y/n]:");
		choice = in.next().charAt(0);
		}while(choice == 'y');
				
	}
	public static void insertEmployee () {
		String name ,id;
		double salary,sales;
		char choose = 'y';
		do {
			System.out.print("Please insert ID :");
			id = in.next();
			System.out.print("\nPlease insert Name :");
			name = in.next();
			System.out.print("\nPlease insert Salary :");
			salary = in.nextDouble();	
			em.add(new Employee(id,name));
			sa.add(new Salary(salary));
		System.out.print("\nDo you have Employee [y/n]:");
		choose = in.next().charAt(0);
		}while(choose == 'y');
	}
	public static void insertSales () {
		String name ,id;
		double sales;
		char choose = 'y';
		do {	System.out.print("Please insert ID :");			
			for (int i = 0; i < sa.size(); i++) {	
				id = in.next();
				if(em.get(i).equals(id)) {
					System.out.print("\nPlease insert sales :");
					sales = in.nextDouble();
					sal.add(new Sales(sales));
				}
			}	
		System.out.print("\nDo you have ID  [y/n]:");
		choose = in.next().charAt(0);
		}while(choose == 'y');
	}


}
