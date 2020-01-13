package profit;

public class Salary {
	 private double salary;
	 private double commission;
	
	  public double getSalary() {
	        return salary;
	  }

	   public void setSalary(double Salary) {
	        this.salary = salary;
	
	  }
	   public double getcommission() {
	        return commission;
	    }

	    public void setcommission(double commission) {
	        this.commission = commission;
	    }  
	    public void printSalary() {
	    	  System.out.println("Salary:" + salary);
	    	  System.out.println("Commission:" + commission);
	    	  
	        				
	     }
}