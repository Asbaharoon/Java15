package sealed;

public abstract sealed class Person permits Employee, Manager {

	private long id;
	private String name;
	private String lastname;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(long id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	public abstract void showInformation(Person person);
}
