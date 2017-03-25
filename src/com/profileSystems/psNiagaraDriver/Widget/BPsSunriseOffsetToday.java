/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.control.*;
import javax.baja.sys.*;

import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;

public class BPsSunriseOffsetToday extends BStringPoint
{
  /*-
  class BPsSunriseOffsetToday
  {
   
    properties 
	 {
	      facets : BFacets
         flags { readonly }
         default{[BFacets.DEFAULT]}
         
        proxyExt : BPsNiagaraDriverWidgetProxyExt
         default{[new BPsNiagaraDriverWidgetProxyExt()]}
	 }
	 
	 actions
     {
       
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday(2321509942)1.0$ @*/
/* Generated Sat Dec 07 21:39:12 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "facets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#getFacets
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#setFacets
   */
  public static final Property facets = newProperty(Flags.READONLY, BFacets.DEFAULT,null);
  
  /**
   * Get the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#facets
   */
  public BFacets getFacets() { return (BFacets)get(facets); }
  
  /**
   * Set the <code>facets</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#facets
   */
  public void setFacets(BFacets v) { set(facets,v,null); }

////////////////////////////////////////////////////////////////
// Property "proxyExt"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#getProxyExt
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#setProxyExt
   */
  public static final Property proxyExt = newProperty(0, new BPsNiagaraDriverWidgetProxyExt(),null);
  
  /**
   * Get the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#proxyExt
   */
  public BPsNiagaraDriverWidgetProxyExt getProxyExt() { return (BPsNiagaraDriverWidgetProxyExt)get(proxyExt); }
  
  /**
   * Set the <code>proxyExt</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsSunriseOffsetToday#proxyExt
   */
  public void setProxyExt(BPsNiagaraDriverWidgetProxyExt v) { set(proxyExt,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsSunriseOffsetToday.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}