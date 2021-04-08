package sealed;

public class Main {

	public static void main(String[] args) {
		
		Employee employee = createEmployee();
		Manager manager = createManager();
		
		showInformation(employee);
		showInformation(manager);
	}


	private static Employee createEmployee() {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(101);
		employee.setName("Employee Name");
		employee.setLastname("Employee Surname");
		
		return employee;
	}
	
	private static Manager createManager() {
		// TODO Auto-generated method stub
		Manager manager = new Manager();
		manager.setId(1);
		manager.setName("Manager Name");
		manager.setLastname("Manager Surname");
		
		return manager;
	}
	
	private static void showInformation(Person person) {
		// TODO Auto-generated method stub
		if (person instanceof Employee e) {
            e.showInformation(e);
        }else if(person instanceof Manager m){
        	m.showInformation(m);
        }
	}
}
