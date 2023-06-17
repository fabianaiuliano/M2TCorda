public class DepartmentFlow{

@InitiatingFlow
@StartableByRPC
public class FillInReportInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
