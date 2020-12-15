
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Employee {

	int employeeID;
	String firstName;
	String lastName;
	int age;
	String title;
	String status;
	private double salary;
	int supervisor_id;
	int bonus;
	String department;
	int insurance;
	String hiredate;
	String phone;
	double hourly;
	double commission;

	public Employee(int employeeID) throws NumberFormatException, IOException {
		this.employeeID = employeeID;
		this.getEmployee();
	}

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
	
	public void setHourly(double salary) {
		this.hourly = salary/2080;
		
	}
	
	public void setCommission(double commission) {
		this.commission = commission;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;

//		switch (status) {
//		case "F":
//			this.status = "Full-Time";
//			break;
//		case "P":
//			this.status = "Part-Time";
//			break;
//		case "C":
//			this.status = "Commission";
//			break;
//		default:
//			this.status = "Unknown";
//			break;
//		}

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

		if (bonus == 1) {
			this.salary = this.salary + 1000;
		}
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

		if (insurance == 1) {
			this.salary = this.salary - 2000;
		}
		if (insurance == 2) {
			this.salary = this.salary - 1500;
		}
		if (insurance == 3) {
			this.salary = this.salary - 1000;
		}
		if (insurance == 4) {
			this.salary = this.salary - 500;
		}
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
	
	public double getHourly() {
		return hourly;
	}
	

	public void getEmployee() throws NumberFormatException, IOException {
		File fileName = new File("EmployeeData.csv");
		if (fileName.exists()) {
			BufferedReader br = null;
			String line = "";
			String csvSplitBy = ",";

			br = new BufferedReader(new FileReader(fileName));
			while ((line = br.readLine()) != null) {
				String[] employeeRecord = line.split(csvSplitBy);
				if (Integer.parseInt(employeeRecord[0]) == this.employeeID)

				{
					this.setEmployeeID(Integer.parseInt(employeeRecord[0]));
					this.setFirstName(employeeRecord[1]);
					this.setLastName(employeeRecord[2]);
					this.setAge(Integer.parseInt(employeeRecord[3]));
					this.setTitle(employeeRecord[4]);
					this.setSalary(Double.parseDouble(employeeRecord[5]));
					this.setStatus(employeeRecord[6]);
					this.setSupervisor_id(Integer.parseInt(employeeRecord[7]));
					this.setBonus(Integer.parseInt(employeeRecord[8]));
					this.setDepartment(employeeRecord[9]);
					this.setInsurance(Integer.parseInt(employeeRecord[10]));
					this.setHiredate(employeeRecord[11]);
					this.setPhone(employeeRecord[12]);
					this.setHourly(Double.parseDouble(employeeRecord[5]));
					break;

				}
			}
			br.close();
			fileName = null;
		}

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
		
		System.out.println("Hire date:\t " + this.hiredate.substring(0, 4) + "/" 
										+ this.hiredate.substring(5, 7) + "/"
										+ this.hiredate.substring(8, 10));
		

		System.out.println("Phone:\t(" + this.phone.substring(0, 3) + ")" 
										+ this.phone.substring(3, 6) + "-"
										+ this.phone.substring(6, 10));
		
		System.out.println("Hourly:\t " + this.hourly);

		horizontalLine(35);

	}

	private static void horizontalLine(int dashes) {
		for (int i = 1; i <= dashes; i++) {
			System.out.print(".");
		}
		System.out.println();

	}

}