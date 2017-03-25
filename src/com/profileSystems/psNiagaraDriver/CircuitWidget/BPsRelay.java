/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.control.*;
import javax.baja.sys.*;

public class BPsRelay extends BBooleanPoint
{
  /*-
  class BPsRelay
  {
   
    properties 
	 {
	      facets : BFacets
         flags { readonly }
         default{[BFacets.makeBoolean("On","Off")]}
         
        proxyExt : BPsNiagaraDriverCircuitWidgetProxyExt
         default{[new BPsNiagaraDriverCircuitWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay(2254578218)1.0$ @*/
/* Generated Sat Dec 07 18:20:03 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#getFacets
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeBoolean("On","Off"),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverCircuitWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#proxyExt
   */
  public BPsNiagaraDriverCircuitWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverCircuitWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelay#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverCircuitWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsRelay.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}