/**
 * This class represents the person class
 * 
 * @author Mark Kasule
 *
 */
public class Person {

	// INSTANCES
	private String name;
	private String address;
	private String phoneNumber;
	private String email;

	public Person() {
	}

	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public Person(Person human) {
		name = human.name;
		address = human.address;
		phoneNumber = human.phoneNumber;
		email = human.email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

}
