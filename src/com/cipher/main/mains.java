package com.cipher.main;

import java.util.Scanner;

import com.cipher.operation.cipher;

public class mains {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. Encryption\n2. Decryption");
		int input = scan.nextInt();
		String temp = scan.nextLine();		// this line will skiped
		
//		condition for encryption
		if (input == 1) {
			
//			taking message input from user
			System.out.println("Enter your message");
			String message = scan.nextLine();

//			taking key number which is used to decode the secret message
			System.out.println("Enter key number");
			int key = scan.nextInt();
			
//			creating cipher object as encryption
			cipher encryption = new cipher();
			
//			invoking encryption method from cipher class
			String secret_message =	encryption.encrypt(message, key);
			
//			output
			System.out.println("Secret message: " + secret_message);
			System.out.println("Key number: " + key);
			
		}
		
//		condition for decryption		
		else if (input == 2) {
			
//			taking secret encrypted message input from user
			System.out.println("Enter Secret message");
			String secret_message = scan.nextLine();
			
//			taking key number which is used to decode the secret message
			System.out.println("Enter key number");
			int key = scan.nextInt();
			
//			creating cipher object as encryption
			cipher decryption = new cipher();
			
//			invoking decryption method from cipher class
			String message =	decryption.decrypt(secret_message, key);
			
//			output
			System.out.println("Secret message: " + message);
			
		}
		
//		condition for invalid input
		else {
			System.out.println("Invalid Input");
		}
		
	}
}
