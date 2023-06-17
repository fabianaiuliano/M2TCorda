@BelongsToContract(Contract.class)
public class ShipmentAddressState implements ContractState{
   //custom properties...
	private final List<AbstractParty> participants; 
    public ShipmentAddressState (..., List<AbstractParty> participants){
		//...
        this.participants = participants;
    }
}
