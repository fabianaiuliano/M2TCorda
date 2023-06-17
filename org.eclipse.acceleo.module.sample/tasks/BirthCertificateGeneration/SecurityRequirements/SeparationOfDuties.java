public class SeparationOfDuties {
	public boolean areDutiesDistinctInFlow(){
		FlowLogic<MyFlowLogicReturnType> flowLogic = this.getFlowLogic();
		FlowSession otherPartySession = flowLogic.getCounterpartySession();

		Party initiator = this.getServiceHub().getMyInfo().getLegalIdentities().get(0);
		Party responder = otherPartySession.getCounterparty();
		
		return ! initiator.equals(responder);
	}
}
