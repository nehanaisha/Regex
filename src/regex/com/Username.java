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
}
