package regex.com;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;

public class Username {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pattern pattern = Pattern.compile("^[A-Z]+[a-zA-Z]*${3}");
		System.out.println("enter the username");
		String name = sc.nextLine();
		Matcher matcher = pattern.matcher(name);
		if (matcher.matches()) {
			System.out.println("Username " + name + " is valid");
		} else {
			System.out.println("Username " + name + " is invalid");

		}
	}
}
