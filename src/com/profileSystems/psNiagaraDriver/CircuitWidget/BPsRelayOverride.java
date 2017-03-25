/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.control.*;
import javax.baja.sys.*;

public class BPsRelayOverride extends BEnumWritable
{
  /*-
  class BPsRelayOverride
  {
    properties 
	 {
	     facets : BFacets
         flags { readonly }
         default{[BFacets.makeEnum(BEnumRange.make(BPsRelayOverrideEnum.TYPE))]}
             
       proxyExt : BPsNiagaraDriverCircuitWidgetProxyExt
         default{[new BPsNiagaraDriverCircuitWidgetProxyExt()]}
	 }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride(3788850825)1.0$ @*/
/* Generated Sat Dec 07 18:20:03 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#getFacets
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeEnum(BEnumRange.make(BPsRelayOverrideEnum.TYPE)),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverCircuitWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#proxyExt
   */
  public BPsNiagaraDriverCircuitWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverCircuitWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverride#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverCircuitWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsRelayOverride.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}