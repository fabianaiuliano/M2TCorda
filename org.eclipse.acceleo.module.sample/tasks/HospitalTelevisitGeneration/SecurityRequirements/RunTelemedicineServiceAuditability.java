public class AuditabilityAct {
	public static boolean ensureAuditAct(LedgerTransaction tx) {
	// extract the data to be signed from the transaction
	byte[] dataToSign = tx.getInputs().get(0).getState().getData().getBytes();

	// extract the public key of the signer from the transaction
	PublicKey publicKey = tx.getInputs().get(0).getState().getData().getPublicKey();
	
	// extract the digital signature of the data
	byte[] digitalSignature = tx.getInputs().get(0).getState().getSignature().getBytes();
	
	// verify the signature
	return boolean verified = verifySignature(dataToSign, digitalSignature, publicKey);
	}

	public static boolean verifySignature(byte[]data, byte[] digitalSignature, PublicKey publicKey) {
		try {
			Signature signature = Signature.getInstance("SHA256withRSA");
			signature.initVerify(publicKey);
			signature.update(data);
			return signature.verify(digitalSignature);
		} catch(NoSuchAlgorithmException|InvalidKeyException| SignatureException e){
			e.printStackTrace();
			return false;
		}
	}
}
