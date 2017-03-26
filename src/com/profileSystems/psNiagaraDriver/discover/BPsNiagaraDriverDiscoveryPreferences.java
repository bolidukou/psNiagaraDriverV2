package com.profileSystems.psNiagaraDriver.discover;

import javax.baja.sys.BBoolean;
import javax.baja.sys.BFacets;
import javax.baja.sys.BRelTime;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ddf.discover.auto.BDdfAutoDiscoveryPreferences;

public class BPsNiagaraDriverDiscoveryPreferences extends  BDdfAutoDiscoveryPreferences {
	/*-
	 class BPsNiagaraDriverDiscoveryPreferences
	 {
	properties
	 {
	 timeout:BRelTime
	 default{[BRelTime.makeSeconds(30)]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.discover.BPsNiagaraDriverDiscoveryPreferences(3479671317)1.0$ @*/
/* Generated Sat Mar 25 23:49:12 CDT 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "timeout"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>timeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.discover.BPsNiagaraDriverDiscoveryPreferences#getTimeout
   * @see com.profileSystems.psNiagaraDriver.discover.BPsNiagaraDriverDiscoveryPreferences#setTimeout
   */
  public static final Property timeout = newProperty(0, BRelTime.makeSeconds(30),null);
  
  /**
   * Get the <code>timeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.discover.BPsNiagaraDriverDiscoveryPreferences#timeout
   */
  public BRelTime getTimeout() { return (BRelTime)get(timeout); }
  
  /**
   * Set the <code>timeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.discover.BPsNiagaraDriverDiscoveryPreferences#timeout
   */
  public void setTimeout(BRelTime v) { set(timeout,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverDiscoveryPreferences.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}
