		package your.package.flows;
		import net.corda.core.flows.*;
		
		public class CitizenFlow{
		
		}

			@InitiatingFlow
			@StartableByRPC
			public class ReportClaimInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
		        	this.counterparty = counterparty;
		        	}
			}

	
	@InitiatingFlow
	@StartableByRPC
	public class ReceiveNotificationResponderFlow extends FlowLogic<SignedTransaction>{
	private final Party counterparty;
		public InitiatorFlow(Party counterparty){
		this.counterparty = counterparty;
		}
	}
