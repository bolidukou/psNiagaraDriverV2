/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.control.*;
import javax.baja.sys.*;
import javax.baja.units.BUnit;

import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;

public class BPsBaseCtBBaseline extends BNumericWritable
{
  /*-
  class BPsBaseCtBBaseline
  {
   
    properties 
	 {
	      facets : BFacets
        flags { readonly }
        default{[BFacets.makeNumeric(BUnit.getUnit("ampere"), BInteger.make(1), BDouble.make(0), BDouble.make(200))]}
         
        proxyExt : BPsNiagaraDriverWidgetProxyExt
         default{[new BPsNiagaraDriverWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline(2669813802)1.0$ @*/
/* Generated Tue Apr 12 22:26:02 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#getFacets
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.makeNumeric(BUnit.getUnit("ampere"), BInteger.make(1), BDouble.make(0), BDouble.make(200)),null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#proxyExt
   */
  public BPsNiagaraDriverWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsBaseCtBBaseline#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsBaseCtBBaseline.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}