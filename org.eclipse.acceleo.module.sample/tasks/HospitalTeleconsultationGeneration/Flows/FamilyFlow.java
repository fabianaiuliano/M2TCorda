package your.package.flows;
import net.corda.core.flows.*;

public class FamilyFlow{

@InitiatingFlow
@StartableByRPC
public class AskForDoctorAvailabilityInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}


@InitiatingFlow
@StartableByRPC
public class ReceiveAppointmentScheduleResponderFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
