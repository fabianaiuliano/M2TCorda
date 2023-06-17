public class IntegrityAct extends FlowLogic<String> {
	
	@Override
	public String call() throws FlowException {
	//Check the version number of the CorDapp
	String expectedVersion = "1.0"; //type your desired version
	String actualVersion = getVersionFromProperties();

	if(!expectedVersion.equals(actualVersion)){
		throw new FlowException("All parties must use the same version of the CorDapp.");
	}

}
	private String getVersionFromProperties(){
	InputStream stream = getClass().getClassLoader().getResourceAsStream("META-INF/version.properties");
	Properties properties = new Properties();
	try{
		properties.load(stream);
	} catch (IOException e){
		throw new RuntimeException("Unable to load version properties.");
	}
	
	return properties.getProperty("version");
	
	}
}
