		package your.package.flows;
		import net.corda.core.flows.*;
		
		public class TimberYardFlow{
			
		}
			@InitiatingFlow
			@StartableByRPC
			public class AddCaseToMidtermPlanInitiatorFlow extends FlowLogic<SignedTransaction>{
			private final Party counterparty;
					public InitiatorFlow(Party counterparty){
		        	this.counterparty = counterparty;
		        	}
			}
