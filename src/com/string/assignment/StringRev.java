package com.string.assignment;

public class StringRev {

	public StringRev(String str) {

		char[] ch = str.toCharArray();
		System.out.print("Reverse of " + str + " is ==> ");
		for (int counter = ch.length - 1; counter >= 0; counter--) {
			System.out.print(ch[counter]);
		}
		System.out.println();
	}

}