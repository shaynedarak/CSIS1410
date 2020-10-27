
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
	int bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	
	public Employee(int employeeID)
	{
		this.employeeID = employeeID;
	}

//	String connectionString = "jdbc:mysql://127.0.0.1.3306/company";
//	String dbLogin = "javauser";
//	String dbPassword = "j4v4us3r?";

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
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

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getSupervisor_id() {
		return supervisor_id;
	}

	public void setSupervisor_id(int supervisor_id) {
		this.supervisor_id = supervisor_id;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getInsurance() {
		return insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

//	public void getEmployee()
//	{
//		Connection conn = null;
//		String sql = "SELECT employee_id, first_name, last_name, age, title, salary,"
//				+ "status, supervisor_id, bonus, department, insurance, hiredate,"
//				+ "phone From employee WHERE employee_id = " + this.employeeID + ",";
//		try
//		{
//			conn = DriverManager.getConnection(connectionString, dbLogin, dbPassword);
//			if (conn !=null)
//			{
//				try (Statement stmt = conn.createStatement();
//						ResultSet rs = stmt.executeQuery(sql))
//				{
//					if (rs.next())
//						
//					{
//						this.setEmployeeID(Integer.parseInt(rs.getString("employeeID")));
//						this.setFirstName(rs.getString("first_name"));
//						this.setLastName(rs.getString("last_name"));
//						this.setAge(Integer.parseInt(rs.getString("age"));
//						this.setTitle(rs.getString("title"));
//						this.setSalary(Double.parseDouble(rs.getString("salary"));
//						this.setStatus(rs.getString("status"));
//						this.setSupervisor_id(Integer.parseInt(rs.getString("supervisor_id"));
//						this.setBonus(Integer.parseInt(rs.getString("bonus"));
//						this.setDepartment(rs.getString("department"));
//						this.setInsurance(Integer.parseInt(rs.getString("insurance"));
//						this.setHireDate(rs.getString("hiredate"));
//						this.setPhone(rs.getString("phone"));
//				
//					}
//				}
//				
//				catch (SQLException ex)
//				{
//					System.out.print("SQLException: ");
//					System.out.println(ex.getMessage());
//				}
//			}
//			conn.close();
//		}
//	}

	public void getEmployee() throws NumberFormatException, IOException 
	{
		File fileName = new File(System.getProperty("user.dir") + "\\EmployeeData.csv");
		if (fileName.exists())
		{
			BufferedReader br = null;
			String line = "";
			String csvSplitBy = ",";

			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null)
			{
				String[] employeeRecord = line.split(csvSplitBy);
				if (Integer.parseInt(employeeRecord[0]) == this.employeeID) 
				
				{
					this.setEmployeeID(Integer.parseInt(employeeRecord[0]));
					this.setFirstName(employeeRecord[1]);
					this.setLastName(employeeRecord[2]);
					this.setAge(Integer.parseInt(employeeRecord[3]));
					this.setTitle(employeeRecord[4]);
					this.setStatus(employeeRecord[5]);
					this.setSalary(Double.parseDouble(employeeRecord[6]));
					this.setSupervisor_id(Integer.parseInt(employeeRecord[7]));
					this.setBonus(Integer.parseInt(employeeRecord[8]));
					this.setDepartment(employeeRecord[9]);
					this.setInsurance(Integer.parseInt(employeeRecord[10]));
					this.setHiredate(employeeRecord[11]);
					this.setPhone(employeeRecord[12]);
					break;

				}
			}
			br.close();
			fileName = null;
		}

	}

	@Override
	public String toString() {
		return "Employee [EmployeeID=" + employeeID + ", firstName=" + firstName + ", lastName" + ", age=" + age + ", title="
				+ title + ", status=" + status + ", salary=" + salary + ", supervisor_id=" + supervisor_id + ", bonus=" + bonus + 
				", department=" + department + ", insurance=" + insurance + ", hiredate=" + hiredate + ", phone=" + phone + "]";

	}

	public void printEmployee() {

		System.out.println("Employee ID:\t " + this.employeeID);
		System.out.println("Name:\t " + this.firstName + " " + this.lastName);
		System.out.println("Age:\t " + this.age);
		System.out.println("Title:\t " + this.title);
		System.out.println("Status:\t " + this.status);
		System.out.println("Salary:\t " + this.salary);
		System.out.println("Supervisor ID:\t " + this.supervisor_id);
		System.out.println("Bonus:\t " + this.bonus);
		System.out.println("Department:\t " + this.department);
		System.out.println("Insurance:\t " + this.insurance);
		System.out.println("Hire date:\t " + this.hiredate);
		System.out.println("Phone:\t " + this.phone);
		horizontalLine(25);
		
	}
	
	private static void horizontalLine(int dashes) 
	
	{
		for (int i = 1; i <= dashes; i++)
		{
			System.out.print(".");
		}
		System.out.println();

	}

}
