package com.profileSystems.psNiagaraDriver.circuit;
import javax.baja.status.BStatus;
import javax.baja.status.BStatusValue;
import javax.baja.sys.*;



/**
 * A list of circuit status
 * 
 * @author    Watson Zhou
 * @creation  
 * @version   
 * @since     
 */
public final class BPsNiagaraDriverCircuitStatusEnum extends BStatusValue
implements BIEnum
{
	/*-
	  class BPsNiagaraDriverCircuitStatusEnum
	  {
	   
	    properties
		{ 		
		value:BPsNiagaraDriverCircuitStatus
		default {[BPsNiagaraDriverCircuitStatus.Unknown]}
	    }
	  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatusEnum(50652130)1.0$ @*/
/* Generated Sun Jul 07 12:35:19 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "value"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>value</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatusEnum#getValue
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatusEnum#setValue
   */
  public static final Property value = newProperty(0, BPsNiagaraDriverCircuitStatus.Unknown,null);
  
  /**
   * Get the <code>value</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatusEnum#value
   */
  public BPsNiagaraDriverCircuitStatus getValue() { return (BPsNiagaraDriverCircuitStatus)get(value); }
  
  /**
   * Set the <code>value</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatusEnum#value
   */
  public void setValue(BPsNiagaraDriverCircuitStatus v) { set(value,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitStatusEnum.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public BEnum getEnum() {
		return getValue();
	}

	public final BFacets getEnumFacets() {
		return BFacets.make("range", getEnum().getRange());
	}

	public void setValue(BEnum paramBEnum) {
		setValue(BPsNiagaraDriverCircuitStatus.make(paramBEnum.getOrdinal()));
	}

	public final BValue getValueValue() {
		return getValue();
	}

	public final Property getValueProperty() {
		return value;
	}

	public String valueToString(Context paramContext) {
		return getValue().toString(paramContext);
	}

	public BIcon getIcon() {
		return icon;
	}

	public BPsNiagaraDriverCircuitStatusEnum(BEnum paramBEnum,
			BStatus paramBStatus) {
		super(paramBStatus);
		setValue(paramBEnum);
	}

	public BPsNiagaraDriverCircuitStatusEnum(BEnum paramBEnum) {
		setValue(paramBEnum);
	}

	public BPsNiagaraDriverCircuitStatusEnum() {
	}

	private static final BIcon icon = BIcon.std("statusEnum.png");
}