package ceasars.cipher;

public class Main {

	public static void main(String[] args) {
		
		String message = "how  are you doing today";
		int offset = 12;
		
		CeasarCipher ceasarCipher = new CeasarCipher();
		
		String cipher = ceasarCipher.cipher(message, offset); 
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Ciphered message: " + cipher);
		
	}

}
