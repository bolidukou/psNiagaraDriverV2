/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;


import javax.baja.control.BBooleanPoint;
import javax.baja.control.BControlPoint;
import javax.baja.control.BNumericPoint;
import javax.baja.control.BStringPoint;
import javax.baja.status.BStatusBoolean;
import javax.baja.status.BStatusEnum;
import javax.baja.status.BStatusNumeric;
import javax.baja.status.BStatusString;
import javax.baja.status.BStatusValue;
import javax.baja.sys.*;
import javax.baja.util.Array;

import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;

import com.profileSystems.psNiagaraDriver.comm.identify.*;
import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverWriteRequest;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId;
import com.tridium.ddf.identify.BDdfIdParams;
import com.tridium.ddf.point.*;


public class BPsNiagaraDriverCircuitWidgetProxyExt
  extends BDdfProxyExt
{
  /*-
  class BPsNiagaraDriverCircuitWidgetProxyExt
  {
    properties 
	{  
       pointId : BPsNiagaraDriverCircuitWidgetId
         default{[new BPsNiagaraDriverCircuitWidgetId()]}
         slotfacets{[MGR_INCLUDE]}
       
       readParameters : BDdfIdParams
         default{[new BPsNiagaraDriverReadParams()]}
         slotfacets{[MGR_INCLUDE]}
               
       writeParameters : BDdfIdParams     
         default{[new BPsNiagaraDriverWriteParams()]}
         slotfacets{[MGR_INCLUDE]}  
	}
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt(2862051577)1.0$ @*/
/* Generated Sat Dec 07 19:08:29 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "pointId"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#getPointId
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#setPointId
   */
  public static final Property pointId = newProperty(0, new BPsNiagaraDriverCircuitWidgetId(),MGR_INCLUDE);
  
  /**
   * Get the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#pointId
   */
  public BPsNiagaraDriverCircuitWidgetId getPointId() { return (BPsNiagaraDriverCircuitWidgetId)get(pointId); }
  
  /**
   * Set the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#pointId
   */
  public void setPointId(BPsNiagaraDriverCircuitWidgetId v) { set(pointId,v,null); }

////////////////////////////////////////////////////////////////
// Property "readParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#getReadParameters
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#setReadParameters
   */
  public static final Property readParameters = newProperty(0, new BPsNiagaraDriverReadParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#readParameters
   */
  public BDdfIdParams getReadParameters() { return (BDdfIdParams)get(readParameters); }
  
  /**
   * Set the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#readParameters
   */
  public void setReadParameters(BDdfIdParams v) { set(readParameters,v,null); }

////////////////////////////////////////////////////////////////
// Property "writeParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#getWriteParameters
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#setWriteParameters
   */
  public static final Property writeParameters = newProperty(0, new BPsNiagaraDriverWriteParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#writeParameters
   */
  public BDdfIdParams getWriteParameters() { return (BDdfIdParams)get(writeParameters); }
  
  /**
   * Set the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt#writeParameters
   */
  public void setWriteParameters(BDdfIdParams v) { set(writeParameters,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitWidgetProxyExt.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


	/**
	 * This associates BPsNiagaraDeviceExt with BPsNiagaraProxyExt within the
	 * Niagara AX framework.
	 */
	public Type getDeviceExtType() {
		return BPsNiagaraDriverCircuitWidgetDeviceExt.TYPE;
	}

  public byte[] getWriteByteArray()
  {

    BDdfIdParams deviceId = this.getDdfDevice().getDeviceId();

    if (deviceId instanceof BPsNiagaraDriverDeviceId)
    {
      int serialNo = ((BPsNiagaraDriverDeviceId) deviceId).getSerialNo();

      BPsAPIObejct apiObejct = new BPsAPIObejct();
      apiObejct.UnitAddress = serialNo;
      apiObejct.Payload = "WRITE";
      apiObejct.Parameters = new Array();

      BPsNiagaraDriverCircuitWidgetId pointId = (BPsNiagaraDriverCircuitWidgetId) getPointId();

      apiObejct.Parameters.add(this.getParentPoint().getType().toString());
      apiObejct.Parameters.add("" + pointId.getSlotNo());
      apiObejct.Parameters.add(BPsNiagaraDriverWriteRequest.GetWritableRawValue(this.getWriteValue()));
      try
      {
        return apiObejct.ToByteArray();
      }
      catch (BPsException e)
      {
        e.printStackTrace();
      }
    }
    throw new BajaRuntimeException("Unsupported get write Byte Array in BPsNiagaraDriverWidgetProxyExt line:109");
  }


  public BStatusValue getReadValue(BPsAPIObejct response)
  {
    Type objectType = this.getParentPoint().getType();
    int slotNo = this.getPointId().getSlotNo() ;
    String sRawValue = response.GetStatusString(objectType, slotNo);
    
    BControlPoint controlPoint = this.getParentPoint();
    this.getDdfCommunicator().getLog().trace(objectType+"("+sRawValue+")");
    
    if (controlPoint instanceof BStringPoint)
    {
      return new BStatusString(sRawValue);
    }
    else if (controlPoint instanceof BNumericPoint)
    {
      return new BStatusNumeric(Double.parseDouble(sRawValue));
    }
    else if (controlPoint instanceof BBooleanPoint)
    {
      return new BStatusBoolean(Boolean.valueOf(sRawValue).booleanValue());
    }    
    else if (controlPoint instanceof BPsRelayOverride)
    {
      return new BStatusEnum(BPsRelayOverrideEnum.make(sRawValue));
    }
    else if (controlPoint instanceof BPsScheduleSelect)
    {
      return new BStatusEnum(BPsScheduleSelectEnum.make(sRawValue));      
    }
    else
    {
      this.getDdfCommunicator().getLog().trace("BPsNiagaraDriverReadResponse: Unsupported");
      throw new IllegalStateException("Unsupported control point type: " + controlPoint.getType() +
          "! Please have my program fixed.");
    }
  }
  
 
}