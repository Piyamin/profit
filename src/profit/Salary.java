package profit;

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

	   public void CalPayment(double sales) {
		   if (salary>50000)
			  {
			   commission = sales*(3/100);
			  } 
		   else if (salary >25000){ 
			   commission = sales*(2/100);
			  }    
		   else if(salary >0){
			   commission = sales*(1/100);
			   } 
		   payment = salary+commission;
		   }  
	    public String toString() {
	    	return  "Salary:" + salary +" Payment:" + payment;
	    	  
	        				
	     }
}