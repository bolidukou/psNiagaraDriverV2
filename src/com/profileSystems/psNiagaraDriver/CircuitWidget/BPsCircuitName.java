/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.control.*;
import javax.baja.sys.*;

public class BPsCircuitName extends BStringWritable
{
  /*-
  class BPsCircuitName
  {
   
    properties 
	 {
	      facets : BFacets
         flags { readonly }
         default{[BFacets.DEFAULT]}
         
        proxyExt : BPsNiagaraDriverCircuitWidgetProxyExt
         default{[new BPsNiagaraDriverCircuitWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName(1659944002)1.0$ @*/
/* Generated Sun Dec 08 04:21:03 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#getFacets
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.DEFAULT,null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverCircuitWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#proxyExt
   */
  public BPsNiagaraDriverCircuitWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverCircuitWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitName#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverCircuitWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsCircuitName.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}