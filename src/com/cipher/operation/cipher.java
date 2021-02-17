package com.cipher.operation;

public class cipher {
	
	public String encrypt(String messgae, int key) {
		String secret_message = "";
		char ch;
		
		for (int i = 0; i < secret_message.length(); i++) {
			ch = secret_message.charAt(i);
			if (Character.isAlphabetic(ch)) {
				
				
				
				
				
				
			}
			
		}
		
		return secret_message;			// returns secret message
	}
	
	public String decrypt(String secret_message, int key) {
		String message = "";
		
		char[] ch = secret_message.toCharArray();		// this will convert string to array
		for (char chars: ch) {
			chars -= key;						// this will shift each array key times
			message = message + chars;	// this will store each char into string
		}
		
		return message;			// returns message
	}
	
}
