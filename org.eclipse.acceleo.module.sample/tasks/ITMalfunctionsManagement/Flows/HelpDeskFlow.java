public class HelpDeskFlow{

@InitiatingFlow
@StartableByRPC
public class Event6ResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
