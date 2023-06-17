@BelongsToContract(Contract.class)
public class IdState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public IdState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
