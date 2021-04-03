
/**
 * Class: CMSC201 
 * Instructor: Prof. Ashique Tanveer.
 * Description: This program uses inheritance to print the details of students
 * the faculty, and Staff members of a certain school
 * Due: MM/DD/YYYY 04/03/2021
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Mark Kasule

 */
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Choose from the Options Below (1 or 2)");
		System.out.println("----------------------------------------");
		System.out.println("(1)To create a Student");
		System.out.println("(2) To create an Employee");
		System.out.print("Choice: ");
		int choice = input.nextInt();

		// STUDENT
		if (choice == 1) {
			Student newStudent = new Student();

			// ask for names
			System.out.print("Enter a : ");
			input.nextLine();
			String name = input.nextLine();

			// ask for addresses
			System.out.print("Enter " + name + "'s address: ");
			String addresses = input.nextLine();

			// ask for phone#
			System.out.print("Enter " + name + "'s phone number: ");
			String phoneNum = input.nextLine();

			// ask for email
			System.out.print("Enter " + name + "'s email: ");
			String studentEmail = input.nextLine();

			// ask for status
			System.out.print("Enter " + name + "'s status: ");
			String yearStatus = input.nextLine();

			// set names
			newStudent.setName(name);
			// set address
			newStudent.setAddress(addresses);
			// set the phone#
			newStudent.setPhoneNumber(phoneNum);
			// set email
			newStudent.setEmail(studentEmail);
			// set status
			newStudent.setStatus(yearStatus);

			// print the results
			System.out.println(newStudent);

		} else if (choice == 2) {

			Employee newEmployee = new Employee();

			// ask names
			System.out.print("Enter a name: ");
			input.nextLine();
			String empName = input.nextLine();

			// ask for address
			System.out.print("Enter " + empName + "'s address: ");
			String empAddress = input.nextLine();

			// ask for phone#
			System.out.print("Enter " + empName + "'s phone number: ");
			String empPhone = input.nextLine();

			// ask for email
			System.out.print("Enter " + empName + "'s email address: ");
			String empEmail = input.nextLine();

			// set names
			newEmployee.setName(empName);
			// set address
			newEmployee.setAddress(empAddress);
			// set the phone#
			newEmployee.setPhoneNumber(empPhone);
			// set email
			newEmployee.setEmail(empEmail);

			// print employee details
			System.out.println(newEmployee);

			// CHOOSE EITHER FACULTY OR STAFF
			System.out.println("----------------------------------------");
			System.out.println("(1)To create a faculty member:");
			System.out.println("(2) To create a staff member:");
			System.out.print("Choice: ");
			int secondChoice = input.nextInt();

			// if 1
			// print faculty
			// else if 2
			// print staff
			if (secondChoice == 1) {

				// create a new faculty object
				Faculty newFaculty = new Faculty();
				MyDate newDateSet = new MyDate();

				// ask for office number
				System.out.print("Enter an office number: ");
				int newOfficeNum = input.nextInt();

				// ask for salary
				System.out.print("Enter a salary: $ ");
				int newSalary = input.nextInt();
				// ask for date hired
				System.out.print("Enter a hire date (mm/dd/yyyy): ");
				input.nextLine();
				String newHireDate = input.nextLine();
				// ask for hours
				System.out.print("Enter office hours:");
				String newOfficeHours = input.nextLine();
				// ask for rank
				System.out.print("Enter a rank: ");
				String newRank = input.nextLine();

				// set office number
				newFaculty.setOfficeNumber(newOfficeNum);
				// set salary
				newFaculty.setSalary(newSalary);
				// set hire date
				newDateSet.setDate(newHireDate);
				// set hours
				newFaculty.setOfficeHrs(newOfficeHours);

				// print names
				System.out.println("Faculty: " + newEmployee.getName());

				// set rank
				newFaculty.setRank(newRank);

				// print faculty
				System.out.print(newFaculty);

				// print date
				System.out.println(newDateSet);

				// print details
				System.out.println("\nAddress: " + newEmployee.getAddress() + "\nPhone number: "
						+ newEmployee.getPhoneNumber() + "\nEmail: " + newEmployee.getEmail());

			} else if (secondChoice == 2) {

				// create a new faculty object
				Faculty newStaff = new Faculty();
				MyDate newDateSet = new MyDate();
				Staff staffRank = new Staff();

				// ask for office number
				System.out.print("Enter an office number: ");
				int newOfficeNum = input.nextInt();

				// ask for salary
				System.out.print("Enter a salary: $ ");
				int newSalary = input.nextInt();
				// ask for date hired
				System.out.print("Enter a hire date (mm/dd/yyyy): ");
				input.nextLine();
				String newHireDate = input.nextLine();
				// ask for hours
				System.out.print("Enter office hours:");
				String newOfficeHours = input.nextLine();
				// ask for rank
				System.out.print("Enter a rank: ");
				String newRank = input.nextLine();

				// set office number
				newStaff.setOfficeNumber(newOfficeNum);
				// set salary
				newStaff.setSalary(newSalary);
				// set hire date
				newDateSet.setDate(newHireDate);
				// set hours
				newStaff.setOfficeHrs(newOfficeHours);
				// set rank
				staffRank.setTitle(newRank);

				// print names
				System.out.println("Staff: " + newEmployee.getName());

				// set rank
				newStaff.setRank(newRank);

				// print faculty
				System.out.println(newStaff);

				// print date
				System.out.println(newDateSet);

				// print details
				System.out.println("Address: " + newEmployee.getAddress() + "\nPhone number: "
						+ newEmployee.getPhoneNumber() + "\nEmail: " + newEmployee.getEmail());

			}

		}

	}

}
