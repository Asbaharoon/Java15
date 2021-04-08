package edwardsCurveDigitalSignatureAlgorithm;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String algorithmName = "Ed25519"; // Ed25519, EdDSA, Ed448
		
		JEP339 edwardAlgorithm = new JEP339(algorithmName);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter message :");
		
		String message = sc.nextLine(); 
		
		try {
			edwardAlgorithm.implementAlgorithm(message);
		} catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
