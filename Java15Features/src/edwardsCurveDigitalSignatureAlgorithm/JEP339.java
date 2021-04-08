package edwardsCurveDigitalSignatureAlgorithm;

import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Base64;

public class JEP339 {

	private String algorithmName;

	public JEP339() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JEP339(String algorithmName) {
		super();
		this.algorithmName = algorithmName;
	}

	public String getAlgorithmName() {
		return algorithmName;
	}

	public void setAlgorithmName(String algorithmName) {
		this.algorithmName = algorithmName;
	}
	
	public KeyPairGenerator defineKeyPairGenerator(String algorithmName) throws NoSuchAlgorithmException {
		return KeyPairGenerator.getInstance(algorithmName);
	}
	
	public KeyPair defineKeyPair(KeyPairGenerator kpg) {
		return kpg.generateKeyPair();
	}
	
	public byte[] messageStringtoByte(String message) {
		return message.getBytes(StandardCharsets.UTF_8);
	}
	
	public byte[] defineSignature(KeyPair kp,byte[] message) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
		Signature sig = Signature.getInstance(algorithmName);
	    sig.initSign(kp.getPrivate());
	    sig.update(message);
	    return sig.sign();
	}
	
	public String encodeString(byte[] plainStringBytes) {
        return  Base64.getEncoder().encodeToString(plainStringBytes);
    }

    public boolean verify(String encodedString,KeyPair kp,byte[] message) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException {
    	
    	Signature sig = Signature.getInstance(algorithmName);
    	sig.initVerify(kp.getPublic());
    	sig.update(message);

        byte[] signatureBytes = Base64.getDecoder().decode(encodedString);

        return sig.verify(signatureBytes);
    }
    
    public void implementAlgorithm(String message) throws NoSuchAlgorithmException, InvalidKeyException, SignatureException {
    	
    	System.out.println("Original Message : " + message);
    	
    	System.out.println("Algorithm Name : " + this.getAlgorithmName());
    	
    	KeyPairGenerator kpg = defineKeyPairGenerator(this.getAlgorithmName());
    	KeyPair kp = defineKeyPair(kpg);
    	
    	byte[] messageByte = messageStringtoByte(message);
    	
    	byte[] messageInSignature =  defineSignature(kp,messageByte);
    	
    	String encodedString = encodeString(messageInSignature);
    	
    	System.out.println("Encoded String : " + encodedString);
    	
    	boolean verifiedSignature = verify(encodedString,kp,messageByte);
    	
    	System.out.println("Signature correct: " + verifiedSignature);
    }

	@Override
	public String toString() {
		return "JEP339 [algorithmName=" + algorithmName + "]";
	}
	
	
}
