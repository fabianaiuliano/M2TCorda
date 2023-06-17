package your.package.flows;
import net.corda.core.flows.*;

public class VendorFlow{

@InitiatingFlow
@StartableByRPC
public class DispatchOrderInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class NotifyShipmentInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class OrderArrivalResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class OrderDeliveredResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
