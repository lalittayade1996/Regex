package com.bridgelbz.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
//		Veriable 
		String i;
		System.out.println("Enter Your First Name :-");

//		Scanner 
		Scanner SC = new Scanner(System.in);
		i = SC.next();

//		Regex Syntax
		Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2}$");
		Matcher matcher = pattern.matcher(i);
//		System.out.println(i);
		boolean matchFound = matcher.find();
		if (matchFound) {
			System.out.println("According To Pattern Matcher is Correct");
		} else {
			System.out.println("According To Pattern Matcher is Inorrect");
		}
	}
}
