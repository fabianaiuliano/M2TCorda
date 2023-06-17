@BelongsToContract(Contract.class)
public class PatientRecordState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public PatientRecordState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
