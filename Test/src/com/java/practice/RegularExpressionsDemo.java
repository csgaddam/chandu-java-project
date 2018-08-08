package com.java.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegularExpressionsDemo {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(".");
		Matcher m = p.matcher("a3b#k@zZ");
		while (m.find()) {
			System.out.println(m.start()+".........."+m.group());
		}
	}

}
/*
	character class
	[abcd]		---either a or b or c or d
	[^abcd]		----excluding a or b or c or d        ^ is negation
	[0-9]		----any of the digits from 0 to 9
	[a-z]		----any lowercase alphabet
	[A-Z]		----any uppercase alphabet
	[a-zA-Z]	----any alphabet
	[0-9a-zA-Z]	----any digit or alphabet
	[^0-9a-zA-Z]----any special characters
*/

/*
	Pre-defined character classes
	\s	---spaces
	\S	---Except spaces
	\d	---digits
	\D	---Except digits
	\w	---alphanumeric characters
	\W	---Except alphanumeric characters
	.	---any character
*/