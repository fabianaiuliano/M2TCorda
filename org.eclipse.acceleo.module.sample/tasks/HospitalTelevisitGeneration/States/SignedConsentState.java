@BelongsToContract(Contract.class)
public class SignedConsentState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public SignedConsentState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
