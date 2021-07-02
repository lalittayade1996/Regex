package com.bridgelbz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
// 		Veriable
		String firstName;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your First Name :-");
		firstName = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher = pattern.matcher(firstName);
//		Condition
		boolean matchFound = matcher.matches();
		if (matchFound) {
			System.out.println("First Name is Correct");
		} else {
			System.out.println("First Namer is Inorrect");
		}
		System.out.println();

		String lastName;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your Last Name :-");
		lastName = scan1.next();
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher1 = pattern1.matcher(lastName);
//		Condition
		boolean matchFound1 = matcher1.matches();
		if (matchFound1) {
			System.out.println("Last Name is Correct");
		} else {
			System.out.println("Last Name is Inorrect");
		}
		System.out.println();

		String email;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Your E-mail Id :-");
		email = scan2.next();
		Pattern pattern2 = Pattern.compile("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher2 = pattern2.matcher(email);
//		Condition
		boolean matchFound2 = matcher2.matches();
		if (matchFound2) {
			System.out.println("E-mail Id is Correct");
		} else {
			System.out.println("E-mail Id is Inorrect");
		}
		System.out.println();

		String mobilNumber;
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter Your Mobile No. :-");
		mobilNumber = scan3.next();
		Pattern pattern3 = Pattern.compile("^(0|91)?[7-9][0-9]{9}$");
		Matcher matcher3 = pattern3.matcher(mobilNumber);
		boolean matchFound3 = matcher3.matches();
		if (matchFound3) {
			System.out.println("Mobile Number is Correct");
		} else {
			System.out.println("Mobile Number is Inorrect");
		}
		System.out.println();

		String pass1;
		Scanner scan4 = new Scanner(System.in);
		System.out.println("Enter Your Password :-");
		pass1 = scan4.next();
		Pattern pattern4 = Pattern.compile("^[a-z]{8}+$");
		Matcher matcher4 = pattern4.matcher(pass1);
//		Condition
		boolean matchFound4 = matcher4.matches();
		if (matchFound4) {
			System.out.println("Password is Correct");
		} else {
			System.out.println("Password is Inorrect");
		}
		System.out.println();

		String pass2;
		Scanner scan5 = new Scanner(System.in);
		System.out.println("Enter Your Password :-");
		pass2 = scan5.next();
		Pattern pattern5 = Pattern.compile("^[a-zA-Z]{8}+$");
		Matcher matcher5 = pattern5.matcher(pass2);
//		Condition
		boolean matchFound5 = matcher5.matches();
		if (matchFound4) {
			System.out.println("Password is Correct");
		} else {
			System.out.println("Password is Inorrect");
		}
		System.out.println();
	}
}
