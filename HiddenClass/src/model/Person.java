package model;

import java.io.Serializable;
import java.time.LocalDate;

public class Person implements Serializable{

	private String name;
    private LocalDate birthday;
    private String address;
    private Integer age;
    
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, LocalDate birthday, String address, Integer age) {
		super();
		this.name = name;
		this.birthday = birthday;
		this.address = address;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthday=" + birthday + ", address=" + address + ", age=" + age + "]";
	}

	
    
}
