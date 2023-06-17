public class NonDelegation {
	public boolean NonDelegation(){
	FlowLogic<MyFlowLogicReturnType> flowLogic = this.getFlowLogic();
	FlowSession otherPartySession = flowLogic.getCounterpartySession();
		if (!(allowedNodeList.contains(otherPartySession))) {
			throw IllegalStateException("Flow must be run by an authorized node");
		}
	}
}
