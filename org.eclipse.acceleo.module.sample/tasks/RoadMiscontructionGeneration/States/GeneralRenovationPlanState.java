@BelongsToContract(Contract.class)
public class GeneralRenovationPlanState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public GeneralRenovationPlanState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
