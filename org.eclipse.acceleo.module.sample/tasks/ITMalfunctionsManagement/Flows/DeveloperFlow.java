public class DeveloperFlow{

@InitiatingFlow
@StartableByRPC
public class Event4InitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
