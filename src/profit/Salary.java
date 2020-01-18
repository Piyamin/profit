package profit;

import java.util.ArrayList;

public class Salary {
	 public double salary;
	 public double commission=0;
	 Sales sales;
	 public double payment;
	
	 public Salary() {}
	 public Salary(double salary) {
		 this.salary = salary;
	 }
	  public double getSalary() {
	        return salary;
	  }

	   public void CalPayment(double sales,double salary) {
			   if (sales>50000)
				  {
				   commission = sales*(3.0/100);
				   payment = salary + commission;
			  } 
			   else if (sales >25000){ 
				   commission = sales*(2.0/100);
				   payment = salary + commission;
				  }    
			   else {
				   commission = sales*(1.0/100);  
				   payment = salary + commission;
				   } 
		
		System.out.println("Payment = "+payment);
		  
		   
	   }  
	    public String toString() {
	    	return  "Salary:" + salary +" Payment:" + payment;
	    	  
	        				
	     }

}