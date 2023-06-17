@BelongsToContract(Contract.class)
public class FinalReportState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public FinalReportState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
