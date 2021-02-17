package com.CaesarCipher;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your message");
		String msg = scan.nextLine();
		
		System.out.println("Enter key (1 to 4)");
		int key = scan.nextInt();
		
		if (key > 0 && key < 5) {
			System.out.print("Secret Message: " + operation.encrypt(msg, key)); //		invoking the encryption method from operation class
		} else {
			System.out.println("Key must me in between 1 to 4");
		}
		
	}

}
