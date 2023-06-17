package your.package.flows;
import net.corda.core.flows.*;

public class PediatricPatientFlow{

@InitiatingFlow
@StartableByRPC
public class ProduceConsentInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
@InitiatingFlow
@StartableByRPC
public class ExplainSymptomsAndAnswerQuestionsResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ReceiveQuestionsResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
