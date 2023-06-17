package your.package.flows;
import net.corda.core.flows.*;

public class FamilyFlow{

@InitiatingFlow
@StartableByRPC
public class SendSignedConsentNotificationInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
@InitiatingFlow
@StartableByRPC
public class SignConsentResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class StartEvent3ResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
