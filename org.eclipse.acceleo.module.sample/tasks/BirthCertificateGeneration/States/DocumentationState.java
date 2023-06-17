@BelongsToContract(Contract.class)
public class DocumentationState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public DocumentationState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
