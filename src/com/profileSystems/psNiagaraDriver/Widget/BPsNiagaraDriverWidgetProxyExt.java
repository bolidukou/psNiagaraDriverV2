/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;



import javax.baja.control.*;
import javax.baja.status.*;
import javax.baja.sys.*;
import javax.baja.util.Array;

import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;
import com.profileSystems.psNiagaraDriver.comm.identify.*;
import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverWriteRequest;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId;
import com.tridium.ddf.identify.BDdfIdParams;
import com.tridium.ddf.point.*;


public class BPsNiagaraDriverWidgetProxyExt
  extends BDdfProxyExt
{
  /*-
  class BPsNiagaraDriverWidgetProxyExt
  {
    properties 
	{  
       pointId : BPsNiagaraDriverWidgetId
         default{[new BPsNiagaraDriverWidgetId()]}
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
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt(961152994)1.0$ @*/
/* Generated Sat Dec 07 19:08:29 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "pointId"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#getPointId
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#setPointId
   */
  public static final Property pointId = newProperty(0, new BPsNiagaraDriverWidgetId(),MGR_INCLUDE);
  
  /**
   * Get the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#pointId
   */
  public BPsNiagaraDriverWidgetId getPointId() { return (BPsNiagaraDriverWidgetId)get(pointId); }
  
  /**
   * Set the <code>pointId</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#pointId
   */
  public void setPointId(BPsNiagaraDriverWidgetId v) { set(pointId,v,null); }

////////////////////////////////////////////////////////////////
// Property "readParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#getReadParameters
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#setReadParameters
   */
  public static final Property readParameters = newProperty(0, new BPsNiagaraDriverReadParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#readParameters
   */
  public BDdfIdParams getReadParameters() { return (BDdfIdParams)get(readParameters); }
  
  /**
   * Set the <code>readParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#readParameters
   */
  public void setReadParameters(BDdfIdParams v) { set(readParameters,v,null); }

////////////////////////////////////////////////////////////////
// Property "writeParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#getWriteParameters
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#setWriteParameters
   */
  public static final Property writeParameters = newProperty(0, new BPsNiagaraDriverWriteParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#writeParameters
   */
  public BDdfIdParams getWriteParameters() { return (BDdfIdParams)get(writeParameters); }
  
  /**
   * Set the <code>writeParameters</code> property.
   * @see com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt#writeParameters
   */
  public void setWriteParameters(BDdfIdParams v) { set(writeParameters,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWidgetProxyExt.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


	/**
	 * This associates BPsNiagaraDeviceExt with BPsNiagaraProxyExt within the
	 * Niagara AX framework.
	 */
	public Type getDeviceExtType() {
		return BPsNiagaraDriverWidgetDeviceExt.TYPE;
	}
	
  public byte[] getWriteByteArray() {
    
    BDdfIdParams deviceId = this.getDdfDevice().getDeviceId();

    if (deviceId instanceof BPsNiagaraDriverDeviceId)
    {
      int serialNo = ((BPsNiagaraDriverDeviceId) deviceId).getSerialNo();

      BPsAPIObejct apiObejct = new BPsAPIObejct();
      apiObejct.UnitAddress = serialNo;
      apiObejct.Payload = "WRITE";
      
      apiObejct.Parameters = new Array();
      apiObejct.Parameters.add(this.getParentPoint().getType().toString());
      apiObejct.Parameters.add("0");
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
    String sValue = response.GetStatusString(objectType);
    
    this.getDdfCommunicator().getLog().trace(objectType+"("+sValue+")");
    
    BControlPoint controlPoint = this.getParentPoint();

    if (controlPoint instanceof BStringPoint)
    {
      return new BStatusString(sValue);
    }
    else if (controlPoint instanceof BNumericPoint)
    {
      return new BStatusNumeric(Double.parseDouble(sValue));
    }
    else if (controlPoint instanceof BBooleanPoint)
    {
      return new BStatusBoolean(Boolean.valueOf(sValue).booleanValue());
    }    
    else
    {
      this.getDdfCommunicator().getLog().trace("BPsNiagaraDriverReadResponse: Unsupported");
      throw new IllegalStateException("Unsupported control point type: " + controlPoint.getType() +
          "! Please have my program fixed.");
    }
  }  
}