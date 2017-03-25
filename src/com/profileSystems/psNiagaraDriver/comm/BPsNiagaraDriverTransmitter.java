package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.*;

import com.tridium.ddf.DdfFacets;
import com.tridium.ddfIp.tcp.comm.*; 

public class BPsNiagaraDriverTransmitter extends BDdfTcpTransmitter {
	/*-
	 class BPsNiagaraDriverTransmitter
	 {
	 properties
	 {
	 maxRetryCount: int
	 default{[2]}
	 slotfacets{[ DdfFacets.combine(MGR_INCLUDE, BFacets.make("min", BInteger.make(0)))]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTransmitter(3171723774)1.0$ @*/
/* Generated Thu Jul 11 23:06:47 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "maxRetryCount"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>maxRetryCount</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTransmitter#getMaxRetryCount
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTransmitter#setMaxRetryCount
   */
  public static final Property maxRetryCount = newProperty(0, 2,DdfFacets.combine(MGR_INCLUDE, BFacets.make("min", BInteger.make(0))));
  
  /**
   * Get the <code>maxRetryCount</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTransmitter#maxRetryCount
   */
  public int getMaxRetryCount() { return getInt(maxRetryCount); }
  
  /**
   * Set the <code>maxRetryCount</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTransmitter#maxRetryCount
   */
  public void setMaxRetryCount(int v) { setInt(maxRetryCount,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverTransmitter.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}