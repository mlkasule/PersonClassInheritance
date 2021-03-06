
public class Employee extends Person {
	private int officeNumber;
	private int salary;
	private String hired;

	public Employee() {
	}

	public Employee(int officeNumber, int salary, String newDate) {
		this.officeNumber = officeNumber;
		this.salary = salary;
		hired = newDate;
	}

	public Employee(Employee emp) {
		officeNumber = emp.officeNumber;
		salary = emp.salary;
		hired = emp.hired;
	}

	public void setOfficeNumber(int offNum) {
		officeNumber = offNum;
	}

	public void setSalary(int sal) {
		salary = sal;
	}

	public void setDate(String dateHired) {
		hired = dateHired;
	}

	public String getDate() {
		return hired;
	}

	public int getOfficeNum() {
		return officeNumber;
	}

	public int getSalary() {
		return salary;
	}

	public String toString() {

		String str = "Professor: " + super.getName() + "\nAddress: " + super.getAddress() + "\nPhone number: "
				+ super.getPhoneNumber() + "\nEmail Address: " + super.getEmail();

		return str;
	}

}
