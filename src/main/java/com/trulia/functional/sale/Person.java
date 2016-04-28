package com.trulia.functional.sale;

public class Person {
	private final String firstName;
	private final String lastName;
	private final int age;
	private final boolean male;
	
	public Person(String firstName, String lastName, int age, boolean male) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.male = male;
	}

	public String getFirstName() {
		return firstName;
	}
	

	public String getLastName() {
		return lastName;
	}
	

	public int getAge() {
		return age;
	}
	

	public boolean isMale() {
		return male;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + (male ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (male != other.male)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", male=" + male + "]";
	}

}
