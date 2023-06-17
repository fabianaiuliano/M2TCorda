@BelongsToContract(Contract.class)
public class invalidState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public invalidState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
