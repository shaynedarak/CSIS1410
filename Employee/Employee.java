import java.sql.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
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
	
	String connectionString = "jdbc:mysql://127.0.0.1.3306/company";
	String dbLogin = "javauser";
	String dbPassword = "j4v4us3r?";

	public Employee(int employeeID) {
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void getEmployee()
	{
		Connection conn = null;
		String sql = "SELECT employee_id, first_name, last_name, age, title, salary,"
				+ "status, supervisor_id, bonus, department, insurance, hiredate,"
				+ "phone From employee WHERE employee_id = " + this.employeeID + ",";
		try
		{
			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
			if (conn !=null)
			{
				try (Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql))
				{
					if (rs.next())
					{
						this.setEmployeeID(Integer.parseInt(rs.getString("employeeID")));
						this.setFirstName(rs.getString("first_name"));
						this.setLastName(rs.getString("last_name"));
						this.setAge(Integer.parseInt(rs.getString("age"));
						this.setTitle(rs.getString("title"));
						this.setSalary(Double.parseDouble(rs.getString("salary"));
						this.setStatus(rs.getString("status"));
						this.setSupervisor_id(Integer.parseInt(rs.getString("supervisor_id"));
						this.setBonus(Integer.parseInt(rs.getString("bonus"));
						this.setDepartment(rs.getString("department"));
						this.setInsurance(Integer.parseInt(rs.getString("insurance"));
						this.setHireDate(rs.getString("hiredate"));
						this.setPhone(rs.getString("phone"));
				
					}
				}
				
				catch (SQLException ex)
				{
					System.out.print("SQLException: ");
					System.out.println(ex.getMessage());
				}
			}
		}
	}
	
//	private void setSalary(double salary) {
//		this.salary = salary;
//	}
//
//	public int getSupervisor_id() {
//		return supervisor_id;
//	}
//
//	public void setSupervisor_id(int supervisor_id) {
//		this.supervisor_id = supervisor_id;
//	}
//
//	public int getEmployeeID() {
//		return employeeID;
//	}
//
//	public void setEmployeeID(int employeeID) {
//		this.employeeID = employeeID;
//	}

	public void getEmployee() throws FileNotFoundException, IOException {
		File fileName = new File("C:\\Data\\EmployeeData.csv");

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
					this.setStatus(employeeRecord[5]);
//					this.setSalary(Double.parseDouble(employeeRecord[6]));
//					this.setSupervisor_id(Integer.parseInt(employeeRecord[7]));
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