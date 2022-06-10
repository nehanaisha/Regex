package regex.com;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Username {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Username obj = new Username();
		obj.firstname();
		obj.lastname();
		obj.mobileNumber();
		obj.password();
	}

	void firstname() {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]*${3}");
		System.out.println("enter the firstname");
		String name = sc.nextLine();
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("Username " + name + " is valid");
		} else {
			System.out.println("Username " + name + " is invalid");
		}
	}

	void lastname() {
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]*${4}");
		System.out.println("enter the lastname");
		String name = sc.nextLine();
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("lastname " + name + " is valid");
		} else {
			System.out.println("lastname " + name + " is invalid");

		}

	}

	void mobileNumber() {
		Pattern pattern = Pattern.compile("/^([+]\\d{2}[ ])?\\d{10}$/");
		System.out.println("enter the mobile number ");
		String number = sc.nextLine();
		Matcher matcher = pattern.matcher(number);
		if (matcher.matches()) {
			System.out.println("MobileNumber " + number + " is valid");
		} else {
			System.out.println("MobileNumber " + number + " is invalid");

		}

	}
	void password() {
		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$");
		System.out.println("enter the password");
		String password = sc.nextLine();
		Matcher matcher = pattern.matcher(password);
		if (matcher.matches()) {
			System.out.println("MobileNumber " + password + " is valid");
		} else {
			System.out.println("MobileNumber " + password + " is invalid");

		}

	}

}
