public class IntegrityDO {
	public static boolean ensureDataIntegrity(tx) {
	List<Properties> properties = tx.getOutputs.getProperties();
		for (p : properties) {
			while (p.getType() == SecureHash) {
				return true;
			}
		}
	return false;
	}
}

