package sealed;

public final class Employee extends Person {

	@Override
	public void showInformation(Person person) {
		// TODO Auto-generated method stub
		String information = """
				Employee Id : %d
				Employee Name : %s
				Employee Surname : %s
				""";
		
		information = information.formatted(person.getId(),person.getName(),person.getLastname());

        System.out.println(information);
	}

}
