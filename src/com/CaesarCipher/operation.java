package com.CaesarCipher;

public class operation {
	
//	method for encryption
	public static String encrypt(String msg, int key) {
		String secret_message = "";
		int a;
		char[] ch = msg.toCharArray();					//		conversion to char array
		
		for (int i = 0; i < msg.length(); i++) {
			if (ch[i] != 32) {
				a = ch[i] - key;							//		shifting char value key times
			} else {
				a = ch[i];
			}
			secret_message += (char) a;					//		cast int to char and store into string
		}
		return secret_message;
	}
	
	
//	method for decryption
	public static String decrypt(String secret_message, int key) {
		String msg = "";
		int a;
		char[] ch = secret_message.toCharArray();					//		conversion to char array
		
		for (int i = 0; i < secret_message.length(); i++) {
			if (ch[i] != 32) {
				a = ch[i] + key;							//		shifting char value key times
			} else {
				a = ch[i];
			}
			msg += (char) a;
		}
		return msg;
	}
}
