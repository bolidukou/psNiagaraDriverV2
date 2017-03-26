package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.BBoolean;
import javax.baja.sys.BFacets;
import javax.baja.sys.BRelTime;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ddf.poll.BDdfPollScheduler;



// if the protocol was Tcp/Ip based.
public class BPsNiagaraDriverPollScheduler extends BDdfPollScheduler {
	/*-
	 class BPsNiagaraDriverPollScheduler
	 {
	 properties
	 {
	 slowRate : BRelTime
	 default{[BRelTime.makeMinutes(10)]}
	 slotfacets{[BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1))]}
	 
	 normalRate: BRelTime
	 default{[BRelTime.makeMinutes(5)]}
	 slotfacets{[BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1))]}
	 
	 fastRate : BRelTime
	 default{[BRelTime.makeMinutes(1)]}
	 slotfacets{[BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1))]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler(2397094468)1.0$ @*/
/* Generated Sun Mar 26 02:29:46 CDT 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "slowRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>slowRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#getSlowRate
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#setSlowRate
   */
  public static final Property slowRate = newProperty(0, BRelTime.makeMinutes(10),BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1)));
  
  /**
   * Get the <code>slowRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#slowRate
   */
  public BRelTime getSlowRate() { return (BRelTime)get(slowRate); }
  
  /**
   * Set the <code>slowRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#slowRate
   */
  public void setSlowRate(BRelTime v) { set(slowRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "normalRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>normalRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#getNormalRate
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#setNormalRate
   */
  public static final Property normalRate = newProperty(0, BRelTime.makeMinutes(5),BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1)));
  
  /**
   * Get the <code>normalRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#normalRate
   */
  public BRelTime getNormalRate() { return (BRelTime)get(normalRate); }
  
  /**
   * Set the <code>normalRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#normalRate
   */
  public void setNormalRate(BRelTime v) { set(normalRate,v,null); }

////////////////////////////////////////////////////////////////
// Property "fastRate"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>fastRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#getFastRate
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#setFastRate
   */
  public static final Property fastRate = newProperty(0, BRelTime.makeMinutes(1),BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(1)));
  
  /**
   * Get the <code>fastRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#fastRate
   */
  public BRelTime getFastRate() { return (BRelTime)get(fastRate); }
  
  /**
   * Set the <code>fastRate</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollScheduler#fastRate
   */
  public void setFastRate(BRelTime v) { set(fastRate,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverPollScheduler.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	
}