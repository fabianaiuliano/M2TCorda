@BelongsToContract(Contract.class)
public class SpecialisticReportState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public SpecialisticReportState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
