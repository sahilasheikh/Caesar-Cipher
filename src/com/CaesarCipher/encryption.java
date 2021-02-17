package com.CaesarCipher;

import java.util.Scanner;

public class encryption {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your message");
		String msg = scan.nextLine();
		
		System.out.println("Enter key");
		int key = scan.nextInt();
		
		System.out.print("Secret Message: " + operation.encrypt(msg, key)); //		invoking the encryption method from operation class
		
	}

}
