package com.profileSystems.psNiagaraDriver.device;

import java.util.Vector;

import javax.baja.control.BControlPoint;
import javax.baja.sys.*;
import javax.baja.util.Array;

import com.tridium.ddf.comm.req.BIDdfReadRequest;
import com.tridium.ddf.comm.req.IDdfReadable;
import com.tridium.ddf.comm.req.IDdfWritable;
import com.tridium.ddf.identify.*;
import com.tridium.ddf.point.BDdfProxyExt;
import com.tridium.ddfIp.tcp.*;
import com.profileSystems.psNiagaraDriver.*;
import com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetDeviceExt;
import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetDeviceExt;

import com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitDeviceExt;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverCustomRequestType;
import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverCustomRequest;
import com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation;
import com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams;

public class BPsNiagaraDriverDevice extends BDdfTcpDeviceBehindGateway {
	/*-
	 class BPsNiagaraDriverDevice
	 {
	 properties
	 {
	 //old properties
	 //circuits : BPsNiagaraDriverCircuitDeviceExt
   //default{[new BPsNiagaraDriverCircuitDeviceExt()]}
	 
	 widgets : BPsNiagaraDriverWidgetDeviceExt
   default{[new BPsNiagaraDriverWidgetDeviceExt()]}
   
   circuitWidgets : BPsNiagaraDriverCircuitWidgetDeviceExt
   default{[new BPsNiagaraDriverCircuitWidgetDeviceExt()]}
   
	 //property
	 deviceId : BDdfIdParams
	 default {[new BPsNiagaraDriverDeviceId()]}	 
	 slotfacets{[MGR_INCLUDE]}
	 
	 //read 
	 deviceName:BString
	 flags { readonly }
	 default {[ BString.DEFAULT]}
	 
	 location : BPsNiagaraDriverDeviceLocation
	 flags { readonly }
	 default{[new BPsNiagaraDriverDeviceLocation()]}
	 
	 signalStrength: int
	 flags { readonly }
	 default {[0]}
	 
	 ACPower:BString
	 flags { readonly }
	 default {[ BString.DEFAULT]}
	 
	 }
	 
	 actions
     {
       QueryName() //return device name and circuits name
       
       QueryLocation()  //return device location
       
       //Write
       SetName(arg:BString)   //set device name
       default {[ BString.DEFAULT ]}
       
       SetTime()  //set device time
       
       SetLocation(arg:BPsNiagaraDriverDeviceLocationParams)  //set location
       default {[ new BPsNiagaraDriverDeviceLocationParams() ]}       
       
     }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice(2374502476)1.0$ @*/
/* Generated Tue Apr 12 22:26:02 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "widgets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>widgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getWidgets
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setWidgets
   */
  public static final Property widgets = newProperty(0, new BPsNiagaraDriverWidgetDeviceExt(),null);
  
  /**
   * Get the <code>widgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#widgets
   */
  public BPsNiagaraDriverWidgetDeviceExt getWidgets() { return (BPsNiagaraDriverWidgetDeviceExt)get(widgets); }
  
  /**
   * Set the <code>widgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#widgets
   */
  public void setWidgets(BPsNiagaraDriverWidgetDeviceExt v) { set(widgets,v,null); }

////////////////////////////////////////////////////////////////
// Property "circuitWidgets"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>circuitWidgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getCircuitWidgets
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setCircuitWidgets
   */
  public static final Property circuitWidgets = newProperty(0, new BPsNiagaraDriverCircuitWidgetDeviceExt(),null);
  
  /**
   * Get the <code>circuitWidgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#circuitWidgets
   */
  public BPsNiagaraDriverCircuitWidgetDeviceExt getCircuitWidgets() { return (BPsNiagaraDriverCircuitWidgetDeviceExt)get(circuitWidgets); }
  
  /**
   * Set the <code>circuitWidgets</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#circuitWidgets
   */
  public void setCircuitWidgets(BPsNiagaraDriverCircuitWidgetDeviceExt v) { set(circuitWidgets,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceId"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceId</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getDeviceId
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setDeviceId
   */
  public static final Property deviceId = newProperty(0, new BPsNiagaraDriverDeviceId(),MGR_INCLUDE);
  
  /**
   * Get the <code>deviceId</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#deviceId
   */
  public BDdfIdParams getDeviceId() { return (BDdfIdParams)get(deviceId); }
  
  /**
   * Set the <code>deviceId</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#deviceId
   */
  public void setDeviceId(BDdfIdParams v) { set(deviceId,v,null); }

////////////////////////////////////////////////////////////////
// Property "deviceName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>deviceName</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getDeviceName
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setDeviceName
   */
  public static final Property deviceName = newProperty(Flags.READONLY, ((BString)(BString.DEFAULT)).getString(),null);
  
  /**
   * Get the <code>deviceName</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#deviceName
   */
  public String getDeviceName() { return getString(deviceName); }
  
  /**
   * Set the <code>deviceName</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#deviceName
   */
  public void setDeviceName(String v) { setString(deviceName,v,null); }

////////////////////////////////////////////////////////////////
// Property "location"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>location</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getLocation
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setLocation
   */
  public static final Property location = newProperty(Flags.READONLY, new BPsNiagaraDriverDeviceLocation(),null);
  
  /**
   * Get the <code>location</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#location
   */
  public BPsNiagaraDriverDeviceLocation getLocation() { return (BPsNiagaraDriverDeviceLocation)get(location); }
  
  /**
   * Set the <code>location</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#location
   */
  public void setLocation(BPsNiagaraDriverDeviceLocation v) { set(location,v,null); }

////////////////////////////////////////////////////////////////
// Property "signalStrength"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>signalStrength</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getSignalStrength
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setSignalStrength
   */
  public static final Property signalStrength = newProperty(Flags.READONLY, 0,null);
  
  /**
   * Get the <code>signalStrength</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#signalStrength
   */
  public int getSignalStrength() { return getInt(signalStrength); }
  
  /**
   * Set the <code>signalStrength</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#signalStrength
   */
  public void setSignalStrength(int v) { setInt(signalStrength,v,null); }

////////////////////////////////////////////////////////////////
// Property "ACPower"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>ACPower</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#getACPower
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#setACPower
   */
  public static final Property ACPower = newProperty(Flags.READONLY, ((BString)(BString.DEFAULT)).getString(),null);
  
  /**
   * Get the <code>ACPower</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#ACPower
   */
  public String getACPower() { return getString(ACPower); }
  
  /**
   * Set the <code>ACPower</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#ACPower
   */
  public void setACPower(String v) { setString(ACPower,v,null); }

////////////////////////////////////////////////////////////////
// Action "QueryName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>QueryName</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#QueryName()
   */
  public static final Action QueryName = newAction(0,null);
  
  /**
   * Invoke the <code>QueryName</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#QueryName
   */
  public void QueryName() { invoke(QueryName,null,null); }

////////////////////////////////////////////////////////////////
// Action "QueryLocation"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>QueryLocation</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#QueryLocation()
   */
  public static final Action QueryLocation = newAction(0,null);
  
  /**
   * Invoke the <code>QueryLocation</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#QueryLocation
   */
  public void QueryLocation() { invoke(QueryLocation,null,null); }

////////////////////////////////////////////////////////////////
// Action "SetName"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SetName</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetName()
   */
  public static final Action SetName = newAction(0,BString.DEFAULT,null);
  
  /**
   * Invoke the <code>SetName</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetName
   */
  public void SetName(BString arg) { invoke(SetName,arg,null); }

////////////////////////////////////////////////////////////////
// Action "SetTime"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SetTime</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetTime()
   */
  public static final Action SetTime = newAction(0,null);
  
  /**
   * Invoke the <code>SetTime</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetTime
   */
  public void SetTime() { invoke(SetTime,null,null); }

////////////////////////////////////////////////////////////////
// Action "SetLocation"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>SetLocation</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetLocation()
   */
  public static final Action SetLocation = newAction(0,new BPsNiagaraDriverDeviceLocationParams(),null);
  
  /**
   * Invoke the <code>SetLocation</code> action.
   * @see com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice#SetLocation
   */
  public void SetLocation(BPsNiagaraDriverDeviceLocationParams arg) { invoke(SetLocation,arg,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverDevice.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public Type getNetworkType() {
		return BPsNiagaraDriverGatewayNetwork.TYPE;
	}

	public Type getDeviceType() {		
		return BPsNiagaraDriverDevice.TYPE;
	}
	
	public Type getDeviceFolderType() {
		return BPsNiagaraDriverDeviceFolder.TYPE;
	}
	
	public void trace(String message){
		if(getDdfCommunicator().getLog().isTraceOn())
		{
		getDdfCommunicator().getLog().trace(message);
		}
	}
	
	public void doQueryName(){   
    BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
        this,
        BPsNiagaraDriverCustomRequestType.QueryUnitName,
        new Array()
        );
    
    communicate(request);
  }
	
	public void doQueryStatus(){		
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.QueryUnitStatus,
				new Array()
				);		
		communicate(request);
	}
	
	public void doQueryLocation(){		
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.QueryUnitLocation,
				new Array()
				);
		
		communicate(request);
	}
	
	public void doSetTime(){		
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.SetUnitTime,
				new Array()
				);
		
		communicate(request);
	}
	
	public void doSetLocation(BPsNiagaraDriverDeviceLocationParams location){		
		Array param = new Array();
		param.add(location.getState().getTag());
		param.add(location.getCounty());
		
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.SetUnitLocation,
				param
				);
		
		communicate(request);
	}
	
	
	
	public void doSetName(BString name){
		Array params= new Array();
		params.add(name.getString());		
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.SetUnitName,
				params
				);
		
		communicate(request);
	}
	
	public void doSync(){
		BPsNiagaraDriverCustomRequest request = new BPsNiagaraDriverCustomRequest(
				this,
				BPsNiagaraDriverCustomRequestType.SyncDevice,
				new Array()
				);
		communicate(request);		
	}

  public void doCheckUnitStatus(int attempt, String lastFrameReceived, String maxRetry,
                                String expireTime)
  {
    // if NOC says we should check status
    Array params = new Array();
    params.add(attempt + "");
    params.add(lastFrameReceived);
    params.add(maxRetry);
    params.add(expireTime);
    BPsNiagaraDriverCustomRequest request =
        new BPsNiagaraDriverCustomRequest(this,
                                          BPsNiagaraDriverCustomRequestType.CheckStatusUpdate,
                                          params);
    
    
    getDdfCommunicator().getLog().trace("doCheckUnitStatus:" + "Attempt-" + attempt +
                                            ";lastFrameReceived-" + lastFrameReceived +
                                            ";maxRetry-" + maxRetry + ";expireTime-" + expireTime);
    communicate(request);
  }

  public void communicate(BPsNiagaraDriverCustomRequest request){
    getDdfCommunicator().communicate(request);
  }

  public void doRead()
  {

    Vector myDdfPollables = new Vector();

    BControlPoint[] points = getCircuitWidgets().getPoints();
    for (int i = 0; i < points.length; i++)
    {
      myDdfPollables.add((BDdfProxyExt) points[i].getProxyExt());
    }

    points = getWidgets().getPoints();
    for (int i = 0; i < points.length; i++)
    {
      myDdfPollables.add((BDdfProxyExt) points[i].getProxyExt());
    }

//    points = getCircuits().getPoints();
//
//    for (int i = 0; i < points.length; i++)
//    {
//      myDdfPollables.add((BDdfProxyExt) points[i].getProxyExt());
//    }

    com.tridium.ddf.poll.BIDdfPollable[] arrayOfBIDdfPollable =
        new com.tridium.ddf.poll.BIDdfPollable[myDdfPollables.size()];
    myDdfPollables.copyInto(arrayOfBIDdfPollable);

    trace("Widgets count:" + myDdfPollables.size());
    if (myDdfPollables.size() > 0)
    {
      BIDdfReadRequest request = ((BDdfProxyExt) myDdfPollables.get(0)).makePollRequest();
      request.setReadableSource(arrayOfBIDdfPollable);
      getDdfCommunicator().communicate(request);
    }
  }

}