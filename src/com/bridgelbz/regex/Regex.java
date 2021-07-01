package com.bridgelbz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
// 		Veriable
		String f;
		Scanner SC = new Scanner(System.in);
		System.out.println("Enter Your First Name :-");
		f = SC.next();
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher = pattern.matcher(f);
//		Condition
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("First Name is Correct");
		} else {
			System.out.println("First Namer is Inorrect");
		}
		System.out.println();
		String l;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter Your Last Name :-");
		l = scan1.next();
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher1 = pattern1.matcher(l);
//		Condition
		boolean matchFound1 = matcher1.find();
		if (matchFound1) {
			System.out.println("Last Name is Correct");
		} else {
			System.out.println("Last Name is Inorrect");
		}
		System.out.println();
		String e;
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter Your E-mail Id :-");
		e = scan2.next();
		Pattern pattern2 = Pattern.compile("^[a-z0-9+_.-]+@[a-zA-Z0-9.-]+$");
		Matcher matcher2 = pattern2.matcher(e);
//		Condition
		boolean matchFound2 = matcher2.find();
		if (matchFound2) {
			System.out.println("E-mail Id is Correct");
		} else {
			System.out.println("E-mail Id is Inorrect");
		}
		System.out.println();
		String m;
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter Your Mobile No. :-");
		m = scan3.next();
		Pattern pattern3 = Pattern.compile("^(0|91)?[7-9][0-9]{9}$");
		Matcher matcher3 = pattern3.matcher(m);

		boolean matchFound3 = matcher3.find();
		if (matchFound3) {
			System.out.println("Mobile Number is Correct");
		} else {
			System.out.println("Mobile Number is Inorrect");
		}
	}
}
