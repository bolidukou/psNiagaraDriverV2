/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.circuit;

import javax.baja.control.BStringPoint;
import javax.baja.status.BStatusString;
import javax.baja.sys.*;

import javax.baja.util.Array;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverCustomRequestType;
import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverCustomRequest;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;
import com.tridium.ddf.comm.req.util.DdfRequestUtil;

public class BPsNiagaraDriverCircuit extends BStringPoint
{
  /*-
  class BPsNiagaraDriverCircuit
  {
   
    properties
	 {
	 circuitName:BString
	 flags { readonly }
	 default {[ BString.DEFAULT]}
	 
	 schedule: BStatusString
	 flags { readonly }
	 default {[new BStatusString()]}	 
	 
	 pendingCommand: BStatusString
	 flags { readonly }
	 default {[new BStatusString()]}
	 
	 onOffStatus: BBoolean
	 flags { readonly }
	 default {[BBoolean.FALSE]}
	 
	 DigitalInput:int
	 default{[0]}
	 }
	 
	 actions
     {
       InstantOn()
      	
       InstantOff()
       
       QuerySchedule()
       
       SetSchedule(arg:BPsNiagaraDriverCircuitSchedule) 
      	default {[ BPsNiagaraDriverCircuitSchedule.DuskToDawn ]}
       
       QueryName()
       
       SetName(arg:BString) 
      	default {[ BString.DEFAULT ]}
     }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit(1663013443)1.0$ @*/
/* Generated Thu Sep 05 19:41:05 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "circuitName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>circuitName</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#getCircuitName
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#setCircuitName
   */
  public static final Property circuitName = newProperty(Flags.READONLY, ((BString)(BString.DEFAULT)).getString(),null);
  
  /**
   * Get the <code>circuitName</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#circuitName
   */
  public String getCircuitName() { return getString(circuitName); }
  
  /**
   * Set the <code>circuitName</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#circuitName
   */
  public void setCircuitName(String v) { setString(circuitName,v,null); }

////////////////////////////////////////////////////////////////
// Property "schedule"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>schedule</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#getSchedule
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#setSchedule
   */
  public static final Property schedule = newProperty(Flags.READONLY, new BStatusString(),null);
  
  /**
   * Get the <code>schedule</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#schedule
   */
  public BStatusString getSchedule() { return (BStatusString)get(schedule); }
  
  /**
   * Set the <code>schedule</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#schedule
   */
  public void setSchedule(BStatusString v) { set(schedule,v,null); }

////////////////////////////////////////////////////////////////
// Property "pendingCommand"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pendingCommand</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#getPendingCommand
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#setPendingCommand
   */
  public static final Property pendingCommand = newProperty(Flags.READONLY, new BStatusString(),null);
  
  /**
   * Get the <code>pendingCommand</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#pendingCommand
   */
  public BStatusString getPendingCommand() { return (BStatusString)get(pendingCommand); }
  
  /**
   * Set the <code>pendingCommand</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#pendingCommand
   */
  public void setPendingCommand(BStatusString v) { set(pendingCommand,v,null); }

////////////////////////////////////////////////////////////////
// Property "onOffStatus"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>onOffStatus</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#getOnOffStatus
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#setOnOffStatus
   */
  public static final Property onOffStatus = newProperty(Flags.READONLY, ((BBoolean)(BBoolean.FALSE)).getBoolean(),null);
  
  /**
   * Get the <code>onOffStatus</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#onOffStatus
   */
  public boolean getOnOffStatus() { return getBoolean(onOffStatus); }
  
  /**
   * Set the <code>onOffStatus</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#onOffStatus
   */
  public void setOnOffStatus(boolean v) { setBoolean(onOffStatus,v,null); }

////////////////////////////////////////////////////////////////
// Property "DigitalInput"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>DigitalInput</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#getDigitalInput
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#setDigitalInput
   */
  public static final Property DigitalInput = newProperty(0, 0,null);
  
  /**
   * Get the <code>DigitalInput</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#DigitalInput
   */
  public int getDigitalInput() { return getInt(DigitalInput); }
  
  /**
   * Set the <code>DigitalInput</code> property.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#DigitalInput
   */
  public void setDigitalInput(int v) { setInt(DigitalInput,v,null); }

////////////////////////////////////////////////////////////////
// Action "InstantOn"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>InstantOn</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#InstantOn()
   */
  public static final Action InstantOn = newAction(0,null);
  
  /**
   * Invoke the <code>InstantOn</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#InstantOn
   */
  public void InstantOn() { invoke(InstantOn,null,null); }

////////////////////////////////////////////////////////////////
// Action "InstantOff"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>InstantOff</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#InstantOff()
   */
  public static final Action InstantOff = newAction(0,null);
  
  /**
   * Invoke the <code>InstantOff</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#InstantOff
   */
  public void InstantOff() { invoke(InstantOff,null,null); }

////////////////////////////////////////////////////////////////
// Action "QuerySchedule"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>QuerySchedule</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#QuerySchedule()
   */
  public static final Action QuerySchedule = newAction(0,null);
  
  /**
   * Invoke the <code>QuerySchedule</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#QuerySchedule
   */
  public void QuerySchedule() { invoke(QuerySchedule,null,null); }

////////////////////////////////////////////////////////////////
// Action "SetSchedule"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SetSchedule</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#SetSchedule()
   */
  public static final Action SetSchedule = newAction(0,BPsNiagaraDriverCircuitSchedule.DuskToDawn,null);
  
  /**
   * Invoke the <code>SetSchedule</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#SetSchedule
   */
  public void SetSchedule(BPsNiagaraDriverCircuitSchedule arg) { invoke(SetSchedule,arg,null); }

////////////////////////////////////////////////////////////////
// Action "QueryName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>QueryName</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#QueryName()
   */
  public static final Action QueryName = newAction(0,null);
  
  /**
   * Invoke the <code>QueryName</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#QueryName
   */
  public void QueryName() { invoke(QueryName,null,null); }

////////////////////////////////////////////////////////////////
// Action "SetName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SetName</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#SetName()
   */
  public static final Action SetName = newAction(0,BString.DEFAULT,null);
  
  /**
   * Invoke the <code>SetName</code> action.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit#SetName
   */
  public void SetName(BString arg) { invoke(SetName,arg,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuit.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public void doInstantOn() {
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.SetCircuitInstantStatus,BPsNiagaraDriverCircuitStatus.On.getTag());
	}
	
	public void doInstantOff() {
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.SetCircuitInstantStatus,BPsNiagaraDriverCircuitStatus.Off.getTag());
	}

	public void doSetSchedule(BPsNiagaraDriverCircuitSchedule schedule) {
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.SetCircuitSchedule,schedule.getTag());
	}
	
	public void doQuerySchedule()
	{
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.QueryCircuitSchedule,"");
	}
	
	public void doQueryName(){		
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.QueryCircuitName,"");
	}
	
	public void doSetName(BString name){
		sendCircuitRequest(BPsNiagaraDriverCustomRequestType.SetCircuitName,name.getString());
	}
	

	void sendCircuitRequest(BPsNiagaraDriverCustomRequestType type, String value) {
		notifyProxyExtForActionInvoked();

		String command = value;
		if (type == BPsNiagaraDriverCustomRequestType.SetCircuitInstantStatus) {
			command = "Instant : " + command;
		} else if (type == BPsNiagaraDriverCustomRequestType.SetCircuitSchedule) {
			command = "Schedule : " + command;
		} else if (type == BPsNiagaraDriverCustomRequestType.SetCircuitName) {
			command = "Set Name : " + command;
		}
		
		this.getPendingCommand().setValue(command);

		BPsNiagaraDriverCircuitProxyExt proxy = (BPsNiagaraDriverCircuitProxyExt) this.getProxyExt();
		BPsNiagaraDriverCircuitId circuitId = (BPsNiagaraDriverCircuitId) proxy.getPointId();
		BPsNiagaraDriverDevice device = (BPsNiagaraDriverDevice) proxy.getDevice();

		Array params = new Array();
		params.add("" + circuitId.getCircuitNo());
		
		if(value!=""){
			params.add(value);
		}

		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				device, type, params);
		
		request.SetCircuit(this);
		com.tridium.ddf.comm.req.util.DdfRequestUtil.communicateSync(proxy.getDdfCommunicator(),request);
	}

	void notifyProxyExtForActionInvoked() {
		try {
			this.getProxyExt().writablePointActionInvoked();
		} catch (Exception localException) {
			localException.printStackTrace();
		}
	}

	public void changed(Property property, Context context) {
		if (!isRunning())
			return;

		if (property == DigitalInput) {
			
			int inputValue = getDigitalInput();
			if (inputValue == 0) {
				doInstantOff();
			} else if (inputValue == 1) {
				doInstantOn();
			}
		}
	}

}