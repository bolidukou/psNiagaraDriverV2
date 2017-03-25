/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.control.*;
import javax.baja.sys.*;
import javax.baja.units.BDimension;
import javax.baja.units.BUnit;

import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;

public class BPsPowerFactor extends BNumericWritable
{
  /*-
  class BPsPowerFactor
  {
   
    properties 
	 {
	      facets : BFacets
         flags { readonly }
         default{[BFacets.makeNumeric(BUnit.make("power factor", "pf", BDimension.DEFAULT), BInteger.make(2), BDouble.make(0), BDouble.make(1))]}
         
        proxyExt : BPsNiagaraDriverWidgetProxyExt
         default{[new BPsNiagaraDriverWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor(95885960)1.0$ @*/
/* Generated Mon Feb 17 17:27:36 CST 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#getFacets
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeNumeric(BUnit.make("power factor", "pf", BDimension.DEFAULT), BInteger.make(2), BDouble.make(0), BDouble.make(1)),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#proxyExt
   */
  public BPsNiagaraDriverWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsPowerFactor#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsPowerFactor.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}