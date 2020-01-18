package profit;
import java.util.Scanner;
import java.util.ArrayList; 

public class ProfitDemo {
	private static final int Sales = 0;
	private static final int Salary = 0;
	static Scanner in = new Scanner(System.in);
	static ArrayList<Employee> em = new ArrayList<Employee>();
	static ArrayList<Salary> sa = new ArrayList<Salary>();
	static ArrayList<Sales> sal = new ArrayList<Sales>();
	private static int ArrayList;
	public static void main(String[] args) {
		int choice;

	do {
		System.out.println("Please select Menu ");
		System.out.println("[1] Add Employee");
		System.out.println("[2] Save sales ");
		System.out.println("[3] Display ");
		choice = in.nextInt();
		if (choice ==1) {
			insertEmployee ();
		}
		if (choice == 2) {
			
			insertSales ();
		}
		if (choice == 3) {
			display(sa,sal);
		}
		System.out.print("\nDo you want to select menu [y/n]:");
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
		do {		
			for (int i = 0; i < sa.size(); i++) {	
				System.out.print("\nPlease insert ID :");	
				id = in.next();	
				if((em.get(i).getEmp_id()).equals(id)) {
					System.out.print("\nPlease insert sales :");
					sales = in.nextDouble();
					sal.add(new Sales(sales));
				}
			}
		System.out.print("\nDo you have ID  [y/n]:");
		choose = in.next().charAt(0);
		}while(choose == 'y');
		
	}

	public static void display(ArrayList<Salary> sa,ArrayList<Sales> sal) {
		for (int i = 0; i < sa.size(); i++) {
			System.out.println("Name : "+ em.get(i).getName() );
			sa.get(i).CalPayment(sal.get(i).getSales(), sa.get(i).getSalary());
			
		}
	}
	
}
