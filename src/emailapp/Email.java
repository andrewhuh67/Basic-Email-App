package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
//	Constructor to recieve the first and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
//		Call a method asking for the department return the department
		this.department = setDepartment();
		
//		Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is: " + this.password);
		
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + companySuffix;
		
		
		}
	
	private String setDepartment() {
		System.out.print("New worker: " + firstName + ". Enter the department\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {
			return "Sales";
		}
		else if (depChoice == 2) {
			return "Development";
		}
		else if (depChoice == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}
//	ask for the department
	
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKUMNOPQRSTUVWXYZ01234567890";
		char[] password = new char[length];
		for (int i=0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
			
					
		}
		System.out.println(password);
		return new String(password);
		
	}
	
//	generate a random password
	
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
//	set the mailbox capacity
	
//	change the password
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}
	
	
	
	
}
