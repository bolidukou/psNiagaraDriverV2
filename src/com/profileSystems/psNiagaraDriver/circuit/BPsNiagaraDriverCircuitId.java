/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.circuit;

import javax.baja.sys.*;

import com.tridium.ddf.identify.*;

public class BPsNiagaraDriverCircuitId
  extends BDdfIdParams
{
  /*-
  class BPsNiagaraDriverCircuitId
  {
   
      properties
	{		
	CircuitNo : int
	default{[0]}
	slotfacets{[MGR_INCLUDE]}
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitId(1860257689)1.0$ @*/
/* Generated Fri Jul 05 02:25:14 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "CircuitNo"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>CircuitNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitId#getCircuitNo
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitId#setCircuitNo
   */
  public static final Property CircuitNo = newProperty(0, 0,MGR_INCLUDE);
  
  /**
   * Get the <code>CircuitNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitId#CircuitNo
   */
  public int getCircuitNo() { return getInt(CircuitNo); }
  
  /**
   * Set the <code>CircuitNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitId#CircuitNo
   */
  public void setCircuitNo(int v) { setInt(CircuitNo,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitId.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}