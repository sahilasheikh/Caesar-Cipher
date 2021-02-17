package com.CaesarCipher;

import java.util.Scanner;

public class decryption {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter secret message");
		String secret_message = scan.nextLine();
		
		System.out.println("Enter key");
		int key = scan.nextInt();
		
		System.out.print("Message: " + operation.decrypt(secret_message, key)); //		invoking the encryption method from operation class
		
	}

}
