@BelongsToContract(Contract.class)
public class ConsentForm[Unsigned]State implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public ConsentForm[Unsigned]State (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
