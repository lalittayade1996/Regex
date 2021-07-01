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

		String l;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Last Name :-");
		l = scan.next();
		Pattern pattern1 = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher1 = pattern1.matcher(l);

//	System.out.println(i);
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
	}
}