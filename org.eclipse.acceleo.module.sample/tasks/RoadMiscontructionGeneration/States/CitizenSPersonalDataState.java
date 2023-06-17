@BelongsToContract(Contract.class)
public class CitizenSPersonalDataState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public CitizenSPersonalDataState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
