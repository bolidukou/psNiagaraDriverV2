package com.profileSystems.psNiagaraDriver;

import com.tridium.ddfIp.tcp.*;
import com.profileSystems.psNiagaraDriver.comm.*;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceFolder;

import javax.baja.sys.*;

public class BPsNiagaraDriverGatewayNetwork extends BDdfTcpGatewayNetwork {
	/*-
	 class BPsNiagaraDriverGatewayNetwork
	 {
	 properties
	 {
	 communicator : BValue	 
	 default{[ new BPsNiagaraDriverCommunicator() ]}
	 
	 Credentials : BPsNiagaraDriverGatewayNetworkCredential
	 default{[ new BPsNiagaraDriverGatewayNetworkCredential() ]}
	 
	 //monitor : BPsNiagaraDriverPingMonitor
   //default{[ new BPsNiagaraDriverPingMonitor() ]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork(307592736)1.0$ @*/
/* Generated Mon Mar 17 20:50:51 CDT 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "communicator"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>communicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#getCommunicator
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#setCommunicator
   */
  public static final Property communicator = newProperty(0, new BPsNiagaraDriverCommunicator(),null);
  
  /**
   * Get the <code>communicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#communicator
   */
  public BValue getCommunicator() { return (BValue)get(communicator); }
  
  /**
   * Set the <code>communicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#communicator
   */
  public void setCommunicator(BValue v) { set(communicator,v,null); }

////////////////////////////////////////////////////////////////
// Property "Credentials"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Credentials</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#getCredentials
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#setCredentials
   */
  public static final Property Credentials = newProperty(0, new BPsNiagaraDriverGatewayNetworkCredential(),null);
  
  /**
   * Get the <code>Credentials</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#Credentials
   */
  public BPsNiagaraDriverGatewayNetworkCredential getCredentials() { return (BPsNiagaraDriverGatewayNetworkCredential)get(Credentials); }
  
  /**
   * Set the <code>Credentials</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#Credentials
   */
  public void setCredentials(BPsNiagaraDriverGatewayNetworkCredential v) { set(Credentials,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverGatewayNetwork.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
	
  public BPsNiagaraDriverGatewayNetwork(){
        getTuningPolicies().getDefaultPolicy().setWriteOnEnabled(false);
        getTuningPolicies().getDefaultPolicy().setWriteOnStart(false);
        getTuningPolicies().getDefaultPolicy().setWriteOnUp(false);
        
        getMonitor().setPingFrequency(BRelTime.makeMinutes(2));
        getMonitor().setStartupAlarmDelay(BRelTime.makeMinutes(5));
  }
	
	public Type getDeviceFolderType() {
		return BPsNiagaraDriverDeviceFolder.TYPE;
	}

	public Type getDeviceType() {
		return BPsNiagaraDriverDevice.TYPE;
	}
}