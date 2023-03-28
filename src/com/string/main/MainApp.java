package com.string.main;

import com.string.assignment.CheckVowels;
import com.string.assignment.DuplicateChar;
import com.string.assignment.IsAnagram;
import com.string.assignment.IsPangram;
import com.string.assignment.SortString;
import com.string.assignment.SpecialCharCount;
import com.string.assignment.StringRev;
import com.string.assignment.UInput;

public class MainApp {
	public static void main(String[] args) {
		UInput ip = new UInput();
		System.out.println("Check String Reverse --");
		
		new StringRev(ip.takeUserInput());
		System.out.println("Check Sentence Reverse --");
		new StringRev(ip.takeUserInput());
		IsAnagram check = new IsAnagram();
		
		System.out.println("\nLets Check Anagrams --");
		
		System.out.println("Strings are Anagrams - " + check.checkAnagram(ip.takeUserInput(), ip.takeUserInput()));
		System.out.println("Lets Check Panagrams --");

		new IsPangram(ip.takeUserInput());
		System.out.println("Lets Check Repetitively Occurring Character in String -- ");
		new DuplicateChar(ip.takeUserInput());

		System.out.println("Lets Sort String--");
		new SortString(ip.takeUserInput());

		System.out.println("Lets Check Vowels and Consonants from String --");
		new CheckVowels(ip.takeUserInput());
		System.out.println("Lets check Count of Special Character from String --");
		new SpecialCharCount(ip.takeUserInput());


	}
}