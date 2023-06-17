		package your.package.flows;
		import net.corda.core.flows.*;
		
		public class MunicipalityFlow{
		
		}

			@InitiatingFlow
			@StartableByRPC
			public class CheckClaimInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
		        	this.counterparty = counterparty;
		        	}
			}

			@InitiatingFlow
			@StartableByRPC
			public class AssessUrgencyInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
		        	this.counterparty = counterparty;
		        	}
			}



		@InitiatingFlow
		@StartableByRPC
		public class NotifyCitizenInitiatorFlow extends FlowLogic<SignedTransaction>{
		private final Party counterparty;
			public InitiatorFlow(Party counterparty){
			this.counterparty = counterparty;
			}
		}

	@InitiatingFlow
	@StartableByRPC
	public class ReceiveClaimResponderFlow extends FlowLogic<SignedTransaction>{
	private final Party counterparty;
		public InitiatorFlow(Party counterparty){
		this.counterparty = counterparty;
		}
	}
