@BelongsToContract(Contract.class)
public class ConsentForm[Signed]State implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public ConsentForm[Signed]State (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
