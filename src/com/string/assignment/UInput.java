package com.string.assignment;

import java.util.Scanner;

public class UInput {
	public String takeUserInput() {
		System.out.println("Enter String :: ");
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}
}