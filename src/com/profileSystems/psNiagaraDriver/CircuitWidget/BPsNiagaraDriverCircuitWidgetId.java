/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.sys.*;

import com.tridium.ddf.identify.*;

public class BPsNiagaraDriverCircuitWidgetId
  extends BDdfIdParams
{
  /*-
  class BPsNiagaraDriverCircuitWidgetId
  {
   
      properties 
	{		
	SlotNo : int
	default{[0]}
	slotfacets{[MGR_INCLUDE]}
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetId(1057903574)1.0$ @*/
/* Generated Sat Dec 07 18:10:59 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "SlotNo"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SlotNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetId#getSlotNo
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetId#setSlotNo
   */
  public static final Property SlotNo = newProperty(0, 0,MGR_INCLUDE);
  
  /**
   * Get the <code>SlotNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetId#SlotNo
   */
  public int getSlotNo() { return getInt(SlotNo); }
  
  /**
   * Set the <code>SlotNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetId#SlotNo
   */
  public void setSlotNo(int v) { setInt(SlotNo,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitWidgetId.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}