package profit;

import java.util.ArrayList;

public class Salary {
	 public double salary;
	 public double commission;
	 Sales sales;
	 public double payment;
	
	 public Salary() {}
	 public Salary(double salary) {
		 this.salary = salary;
	 }
	  public double getSalary() {
	        return salary;
	  }

	   public double  CalPayment(double sales,double salary) {

			   if (salary>50000)
				  {
				   commission = sales*(3/100);
				   payment = salary + commission;
			  } 
			   else if (salary >25000){ 
				   commission = sales*(2/100);
				   payment = salary + commission;
				  }    
			   else if(salary >0){
				   commission = sales*(1/100);
				   payment = salary + commission;
				   } 
			   
		   
		return payment;
		  
		   
	   }  
	    public String toString() {
	    	return  "Salary:" + salary +" Payment:" + payment;
	    	  
	        				
	     }

}