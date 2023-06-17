package your.package.flows;
import net.corda.core.flows.*;

public class BuyerFlow{

@InitiatingFlow
@StartableByRPC
public class ProposeDealInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class Event5InitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ConfirmDealAndShareShipmentInformationResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ReceiveNewProposalResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ReceiveDealConfirmationResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
