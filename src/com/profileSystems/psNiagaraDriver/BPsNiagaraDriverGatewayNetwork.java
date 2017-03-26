package com.profileSystems.psNiagaraDriver;

import java.util.Vector;

import com.tridium.ddf.comm.req.BIDdfReadRequest;
import com.tridium.ddf.comm.req.BIDdfRequest;
import com.tridium.ddf.comm.req.util.DdfRequestUtil;
import com.tridium.ddf.point.BDdfProxyExt;
import com.tridium.ddfIp.tcp.*;
import com.profileSystems.psNiagaraDriver.comm.*;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceFolder;

import javax.baja.control.BControlPoint;
import javax.baja.driver.BDevice;
import javax.baja.sys.*;
import javax.baja.util.Array;

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
	 
	 psPollWorker : BPsNiagaraDriverPollWorker  
   default{[ new BPsNiagaraDriverPollWorker() ]}
   
	 //monitor : BPsNiagaraDriverPingMonitor
   //default{[ new BPsNiagaraDriverPingMonitor() ]}
	 }
	 actions
     {
       PollAll() //return device name and circuits name
     }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork(99151135)1.0$ @*/
/* Generated Sun Mar 26 04:34:41 CDT 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

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
// Property "psPollWorker"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>psPollWorker</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#getPsPollWorker
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#setPsPollWorker
   */
  public static final Property psPollWorker = newProperty(0, new BPsNiagaraDriverPollWorker(),null);
  
  /**
   * Get the <code>psPollWorker</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#psPollWorker
   */
  public BPsNiagaraDriverPollWorker getPsPollWorker() { return (BPsNiagaraDriverPollWorker)get(psPollWorker); }
  
  /**
   * Set the <code>psPollWorker</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#psPollWorker
   */
  public void setPsPollWorker(BPsNiagaraDriverPollWorker v) { set(psPollWorker,v,null); }

////////////////////////////////////////////////////////////////
// Action "PollAll"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>PollAll</code> action.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#PollAll()
   */
  public static final Action PollAll = newAction(0,null);
  
  /**
   * Invoke the <code>PollAll</code> action.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork#PollAll
   */
  public void PollAll() { invoke(PollAll,null,null); }

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
  
  public void doPollAll(){
    this.PollAllDevices();
  }
  
  protected void enableComm(){
    super.enableComm();
    this.getPsPollWorker().getPsCommunicator().startCommunicating();
  }
  
  public void PollAllDevices(){
    BDevice[] devices = this.getDevices();
    BPsNiagaraDriverCommunicator communicator = this.getPsPollWorker().getPsCommunicator(); 
    for (int i = 0; i < devices.length; i++)
    {
      BDevice device = devices[i];
      if ((device instanceof BPsNiagaraDriverDevice))
      {
        ((BPsNiagaraDriverDevice)device).doRead(communicator);        
      }
    }
  }
  
	public Type getDeviceFolderType() {
		return BPsNiagaraDriverDeviceFolder.TYPE;
	}

	public Type getDeviceType() {
		return BPsNiagaraDriverDevice.TYPE;
	}
}