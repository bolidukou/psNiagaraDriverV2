package com.profileSystems.psNiagaraDriver.device;

import javax.baja.sys.*;
import com.tridium.ddf.identify.*;
import com.profileSystems.psNiagaraDriver.BPsNiagaraDriverUtil;
import com.profileSystems.psNiagaraDriver.comm.req.*;

public class BPsNiagaraDriverDeviceId extends BDdfDeviceId {
	/*-
	 class BPsNiagaraDriverDeviceId
	 {
	 properties
	 {
	 SerialNo : int	 
	 default{[0]}
	 slotfacets{[MGR_INCLUDE]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId(1337157020)1.0$ @*/
/* Generated Thu Jul 04 19:19:08 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "SerialNo"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SerialNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId#getSerialNo
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId#setSerialNo
   */
  public static final Property SerialNo = newProperty(0, 0,MGR_INCLUDE);
  
  /**
   * Get the <code>SerialNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId#SerialNo
   */
  public int getSerialNo() { return getInt(SerialNo); }
  
  /**
   * Set the <code>SerialNo</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId#SerialNo
   */
  public void setSerialNo(int v) { setInt(SerialNo,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverDeviceId.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public Type getPingRequestType() {
		return BPsNiagaraDriverPingRequest.TYPE;
	}

	public BPsNiagaraDriverDevice GetBPsNiagaraDriverDevice() {		
		return (BPsNiagaraDriverDevice)BPsNiagaraDriverUtil.findDdfDevice(this.getParentComponent()); 
	}
}