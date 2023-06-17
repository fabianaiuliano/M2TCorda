@BelongsToContract(Contract.class)
public class Id(ElectronicCopy)State implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public Id(ElectronicCopy)State (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
