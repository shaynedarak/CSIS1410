import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Employee {

	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	private double salary;
	String status;
	int supervisor_id;
	String supervisorName;
	
	public Employee(int employeeID)
	{
		this.employeeID = employeeID;
	}


	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
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

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public void getEmployee() throws NumberFormatException, IOException{
		File fileName = new File("C:\\Users\\chane\\eclipse-workspace\\Week 6\\src\\EmployeeData.csv");

		if (fileName.exists()) {
			BufferedReader br = null;
			String line = "";
			String csvSplitBy = ",";

			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null)

			{
				String[] employeeRecord = line.split(csvSplitBy);
				if (Integer.parseInt(employeeRecord[0]) == this.employeeID) {
					this.setEmployeeID(Integer.parseInt(employeeRecord[0]));
					this.setFirstName(employeeRecord[1]);
					this.setLastName(employeeRecord[2]);
					this.setAge(Integer.parseInt(employeeRecord[3]));
					this.setTitle(employeeRecord[4]);
					this.setSalary(Double.parseDouble(employeeRecord[5]));
					this.setStatus(employeeRecord[6]);
					this.setSupervisor_id(Integer.parseInt(employeeRecord[7]));
//					this.setBonus(Integer.parseInt(employeeRecord[8]));
//					this.setDepartment(employeeRecord[9]);
//					this.setInsurance(Integer.parseInt(employeeRecord[10]));
//					this.setHireDate(employeeRecord[11]);
//					this.setPhone(employeeRecord[12]);
					break;
				

				}
			}
		}

	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + employeeID + ", firstName=" + firstName + ", lastName" + age + ", title="
				+ title + ", salary=" + salary + ", status=" + status + "]";

	}

	public void printEmployee() {
	
		System.out.println("Employee ID:\t " + this.employeeID);
		System.out.println("Name:\t " + this.firstName + " " + this.lastName);
		System.out.println("Age:\t " + this.age);
		System.out.println("Title:\t " + this.title);
		System.out.println("Salary:\t " + this.salary);
		System.out.println("Status:\t " + this.status);
		horizontalLine(20);
	}

	private static void horizontalLine(int dashes)

	{
		for (int i = 1; i <= dashes; i++) {
			System.out.print(".");
		}
		System.out.println();
	}

}
