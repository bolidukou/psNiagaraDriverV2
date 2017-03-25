package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.*;

import com.tridium.ddfIp.comm.BDdfIpAddressPort;
import com.tridium.ddfIp.tcp.comm.*; 


public class BPsNiagaraDriverTcpHelper extends BDdfTcpHelper {
	/*-
	 class BPsNiagaraDriverTcpHelper
	 {
	 properties
	 {
	 destinationAddress:  BDdfIpAddressPort
	 default{[new BDdfIpAddressPort("199.242.255.41",11551)]}
	 slotfacets{[MGR_INCLUDE]}
	 
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTcpHelper(560377612)1.0$ @*/
/* Generated Tue Apr 12 22:26:02 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "destinationAddress"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>destinationAddress</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTcpHelper#getDestinationAddress
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTcpHelper#setDestinationAddress
   */
  public static final Property destinationAddress = newProperty(0, new BDdfIpAddressPort("199.242.255.41",11551),MGR_INCLUDE);
  
  /**
   * Get the <code>destinationAddress</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTcpHelper#destinationAddress
   */
  public BDdfIpAddressPort getDestinationAddress() { return (BDdfIpAddressPort)get(destinationAddress); }
  
  /**
   * Set the <code>destinationAddress</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverTcpHelper#destinationAddress
   */
  public void setDestinationAddress(BDdfIpAddressPort v) { set(destinationAddress,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverTcpHelper.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}