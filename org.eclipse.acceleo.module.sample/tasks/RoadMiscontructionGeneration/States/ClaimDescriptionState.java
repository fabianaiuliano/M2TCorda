@BelongsToContract(Contract.class)
public class ClaimDescriptionState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public ClaimDescriptionState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
