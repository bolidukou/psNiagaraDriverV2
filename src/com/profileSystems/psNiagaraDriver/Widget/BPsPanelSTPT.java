/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.control.*;
import javax.baja.sys.*;
import javax.baja.units.BUnit;

import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;

public class BPsPanelSTPT extends BNumericWritable
{
  /*-
  class BPsPanelSTPT
  {
   
    properties 
	 {
	      facets : BFacets
        flags { readonly }
        default{[BFacets.makeNumeric(BUnit.getUnit("fahrenheit"), BInteger.make(1), BDouble.make(-40), BDouble.make(180))]}        
         
        proxyExt : BPsNiagaraDriverWidgetProxyExt
         default{[new BPsNiagaraDriverWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT(491837802)1.0$ @*/
/* Generated Mon Feb 17 17:27:36 CST 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#getFacets
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeNumeric(BUnit.getUnit("fahrenheit"), BInteger.make(1), BDouble.make(-40), BDouble.make(180)),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#proxyExt
   */
  public BPsNiagaraDriverWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPanelSTPT#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsPanelSTPT.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}