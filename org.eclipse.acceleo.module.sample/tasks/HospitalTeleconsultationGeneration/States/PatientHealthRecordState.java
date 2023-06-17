@BelongsToContract(Contract.class)
public class PatientHealthRecordState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public PatientHealthRecordState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
