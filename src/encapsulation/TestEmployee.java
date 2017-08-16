package encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee employee= new Employee();
		employee.setName("Marhaba");
		System.out.println(employee.getName());
		employee.setID(123456);
		System.out.println(employee.getID());
		employee.setSalary(1000);
		System.out.println(employee.getSalary());
		employee.setDepartment("IT");
		System.out.println(employee.getDepartment());
		
		

	}

}
