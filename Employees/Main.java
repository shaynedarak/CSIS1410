
public class Main {

	public static void main(String[] args) 
	{
		
		//Scanner input = new Scanner(System.in);
		
		Employee e1 = new Employee(123);
		Employee e2 = new Employee(456);
		Employee e3 = new Employee(789);
		
//		Employee e4 = new Employee(101112);
//		Employee e5 = new Employee(131415);
//		Employee e6 = new Employee(161718);
		
		e1.setFirstName("Shayne");
		e1.setLastName("Parker");
		//e1.setAge("24");
		e1.setTitle("Teacher");
		//e1.setSalary("60,000");
		e1.setStatus("Part-Time");
		
		e2.setFirstName("John");
		e2.setLastName("Smith");
		//e2.setAge("35");
		e2.setTitle("Principal");
		//e2.setSalary("80,000");
		e2.setStatus("Full-Time");
		
		
		
		e1.printEmployee();
		e2.printEmployee();
		//e3.printEmployee();
	
		
//		System.out.println(e1.getFirstName() +
//				" " + e1.getLastName());
//		System.out.println(e1.getStatus());
//		
//		System.out.println(e2.getFirstName() +
//				" " + e2.getLastName());
//		System.out.println(e2.getStatus());
		
		

	}

}
