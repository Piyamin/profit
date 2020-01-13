package profit;

public class Employee {
	Salary salary;
	private String name;
    private String emp_id;
    
    public Employee( String emp_id ,String name) {
    	super();
        this.name = name;
        this.emp_id = emp_id;
    }

    public Employee() {
    } 
    public String getName() {
        return name;
    }



    public String getEmp_id() {
        return emp_id;
    }

    public void printEmployee() {
        System.out.println("Name:"+ name );
        System.out.println("emp_id:"+ emp_id );
}


}
