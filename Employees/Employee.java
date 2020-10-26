
public class Employee {
	
	
	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	
	public Employee(int employeeID)
	{
		this.employeeID = employeeID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	private void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	
	
	public void printEmployee()
	{
		System.out.println("Name: " + this.firstName + " " + this.lastName + 
							"\nAge: " + this.age + "\nTitle: " + this.title + 
							"\nSalary: " + this.salary + "\nStatus: " + this.status);
		
		
	}
	
}
