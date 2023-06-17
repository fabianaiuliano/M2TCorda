package your.package.flows;
import net.corda.core.flows.*;

public class PediatricPatientFlow{

@InitiatingFlow
@StartableByRPC
public class SendAppointmentDateInitiatorFlow extends FlowLogic<SignedTransaction>{
private final Party counterparty;
	public InitiatorFlow(Party counterparty){
	this.counterparty = counterparty;
	}
}
