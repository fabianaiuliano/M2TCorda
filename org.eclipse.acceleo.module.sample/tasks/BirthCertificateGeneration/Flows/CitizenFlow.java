	package your.package.flows;
	import net.corda.core.flows.*;
	
	public class CitizenFlow{
	
	}
			@InitiatingFlow
			@StartableByRPC
			public class ScanIdInitiatorFlow extends FlowLogic<SignedTransaction>{
			private final Party counterparty;
				public InitiatorFlow(Party counterparty){
		    	this.counterparty = counterparty;
		    	}
			}

				@InitiatingFlow
				@StartableByRPC
				public class FillsInApplicationFormInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
			    	this.counterparty = counterparty;
			    	}
				}
