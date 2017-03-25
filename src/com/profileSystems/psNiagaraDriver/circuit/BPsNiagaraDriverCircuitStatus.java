package com.profileSystems.psNiagaraDriver.circuit;
import javax.baja.sys.*;



/**
 * A list of circuit status
 * 
 * @author    Watson Zhou
 * @creation  
 * @version   
 * @since     
 */
public final class BPsNiagaraDriverCircuitStatus extends BFrozenEnum
{
/*-
  enum BPsNiagaraDriverCircuitStatus
  {
    range
    {
      Unknown,
      On,
      Off
    }
    
    default {[ Unknown ]}
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitStatus(3809838873)1.0$ @*/
/* Generated Thu Jul 04 18:38:14 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for Unknown. */
  public static final int UNKNOWN = 0;
  /** Ordinal value for On. */
  public static final int ON = 1;
  /** Ordinal value for Off. */
  public static final int OFF = 2;
  
  /** BPsNiagaraDriverCircuitStatus constant for Unknown. */
  public static final BPsNiagaraDriverCircuitStatus Unknown = new BPsNiagaraDriverCircuitStatus(UNKNOWN);
  /** BPsNiagaraDriverCircuitStatus constant for On. */
  public static final BPsNiagaraDriverCircuitStatus On = new BPsNiagaraDriverCircuitStatus(ON);
  /** BPsNiagaraDriverCircuitStatus constant for Off. */
  public static final BPsNiagaraDriverCircuitStatus Off = new BPsNiagaraDriverCircuitStatus(OFF);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitStatus.class);
  
  /** Factory method with ordinal. */
  public static BPsNiagaraDriverCircuitStatus make(int ordinal)
  {
    return (BPsNiagaraDriverCircuitStatus)Unknown.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BPsNiagaraDriverCircuitStatus make(String tag)
  {
    return (BPsNiagaraDriverCircuitStatus)Unknown.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BPsNiagaraDriverCircuitStatus(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BPsNiagaraDriverCircuitStatus DEFAULT = Unknown;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}