public class AuthenticityAct {
	public static void verifyIssuerIdentity(LedgerTransaction tx, ServiceHub serviceHub) throws CertificateVerificationException {
	Party issuer = tx.getCommand(customCommand).getSigners().get(0);
	PartyAndCertificate issuerCert = serviceHub.getIdentityService().getCertificateFromKey(issuer);
		
		if (issuerCert = null){
			System.out.println("Unknown party");
		}
		else {
			//Verify the certificate path is valid
			issuerCert.verify();
		}
	}
}
