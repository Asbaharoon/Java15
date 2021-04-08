package sealed;

public non-sealed class Manager extends Person {

	@Override
	public void showInformation(Person person) {
		// TODO Auto-generated method stub
		String information = """
				Manager Id : %d
				Manager Name : %s
				Manager Surname : %s
				""";
		
		information = information.formatted(person.getId(),person.getName(),person.getLastname());

        System.out.println(information);
	}
	
}