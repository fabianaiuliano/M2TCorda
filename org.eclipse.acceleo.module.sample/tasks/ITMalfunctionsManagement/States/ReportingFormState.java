@BelongsToContract(Contract.class)
public class ReportingFormState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public ReportingFormState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
