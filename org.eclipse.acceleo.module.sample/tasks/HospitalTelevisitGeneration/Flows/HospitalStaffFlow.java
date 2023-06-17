package your.package.flows;
import net.corda.core.flows.*;

public class HospitalStaffFlow{



@InitiatingFlow
@StartableByRPC
public class AskForMedicalTreatmentInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ConsultPatientRecordInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class PerformExaminationInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ProduceFinalReportInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class AskForConsentInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class AskForTeleconsultationInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class SendClinicalDataDuringConsultationInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class StartEvent2ResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ReceiveConsentSignedNotificationResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}

@InitiatingFlow
@StartableByRPC
public class ReceiveAvailabilityResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
