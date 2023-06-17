	package your.package.flows;
	import net.corda.core.flows.*;
	
	public class CitizenRegistryBirthCertificateFlow{
	
	}

				@InitiatingFlow
				@StartableByRPC
				public class RegisterBirthInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
			    	this.counterparty = counterparty;
			    	}
				}

				@InitiatingFlow
				@StartableByRPC
				public class UpdateFileInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
			    	this.counterparty = counterparty;
			    	}
				}

				@InitiatingFlow
				@StartableByRPC
				public class CloseProcedureInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
			    	this.counterparty = counterparty;
			    	}
				}

				@InitiatingFlow
				@StartableByRPC
				public class CrossCheckInformationOnBirthCertificateInitiatorFlow extends FlowLogic<SignedTransaction>{
				private final Party counterparty;
					public InitiatorFlow(Party counterparty){
			    	this.counterparty = counterparty;
			    	}
				}

		@InitiatingFlow
		@StartableByRPC
		public class ProcessBirthApplicationFormResponderFlow extends FlowLogic<SignedTransaction>{
		private final Party counterparty;
			public InitiatorFlow(Party counterparty){
        	this.counterparty = counterparty;
        	}
		}

		@InitiatingFlow
		@StartableByRPC
		public class RegisterBirthResponderFlow extends FlowLogic<SignedTransaction>{
		private final Party counterparty;
			public InitiatorFlow(Party counterparty){
        	this.counterparty = counterparty;
        	}
		}

		@InitiatingFlow
		@StartableByRPC
		public class CloseProcedureResponderFlow extends FlowLogic<SignedTransaction>{
		private final Party counterparty;
			public InitiatorFlow(Party counterparty){
        	this.counterparty = counterparty;
        	}
		}

		@InitiatingFlow
		@StartableByRPC
		public class CrossCheckInformationOnBirthCertificateResponderFlow extends FlowLogic<SignedTransaction>{
		private final Party counterparty;
			public InitiatorFlow(Party counterparty){
        	this.counterparty = counterparty;
        	}
		}
