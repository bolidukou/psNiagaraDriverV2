/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.circuit;

import javax.baja.control.BControlPoint;
import javax.baja.status.BStatusString;
import javax.baja.status.BStatusValue;
import javax.baja.sys.*;
import javax.baja.util.Array;

import com.profileSystems.psNiagaraDriver.CircuitWidget.BPsCircuitStatus;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverReadParams;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams;
import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverWriteRequest;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId;
import com.tridium.ddf.identify.BDdfIdParams;
import com.tridium.ddf.point.*;


public class BPsNiagaraDriverCircuitProxyExt
  extends BDdfProxyExt
{
  /*-
  class BPsNiagaraDriverCircuitProxyExt
  {
    properties
	{		
	readParameters : BDdfIdParams
         -- This hooks test driver's read parameters structure into the
         -- proxy extension that is placed on control points that are
         -- under devices in your driver. The read parameter's structure
         -- tells the dev driver framework which read request to use to
         -- read the control point. It also tells test read request's
         -- toByteArray method how to construct the bytes for the request.
         default{[new BPsNiagaraDriverReadParams()]}
         slotfacets{[MGR_INCLUDE]}
       pointId : BPsNiagaraDriverCircuitId
         -- This tells your driver's read and write response's
         -- parseReadValue method how to extract the data value for a
         -- particular control point.
         default{[new BPsNiagaraDriverCircuitId()]}
         slotfacets{[MGR_INCLUDE]}    
       writeParameters : BDdfIdParams
		 -- This hooks your driver's write parameters structure into the
		 -- proxy extension that is placed on control points that are
		 -- under devices in your driver. The write parameter's structure
		 -- tells the dev driver framework which write request to use to
		 -- write the control point. It also tells your write request's
		 -- toByteArray method how to construct the bytes for the request.
		 default{[new BPsNiagaraDriverWriteParams()]}
		 slotfacets{[MGR_INCLUDE]}
	}
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt(3653302932)1.0$ @*/
/* Generated Sun Dec 08 04:35:05 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "readParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>readParameters</code> property.
   * This hooks test driver's read parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The read parameter's structure tells the dev driver framework which read request to use to read the control point. It also tells test read request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#getReadParameters
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#setReadParameters
   */
  public static final Property readParameters = newProperty(0, new BPsNiagaraDriverReadParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>readParameters</code> property.
   * This hooks test driver's read parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The read parameter's structure tells the dev driver framework which read request to use to read the control point. It also tells test read request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#readParameters
   */
  public BDdfIdParams getReadParameters() { return (BDdfIdParams)get(readParameters); }
  
  /**
   * Set the <code>readParameters</code> property.
   * This hooks test driver's read parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The read parameter's structure tells the dev driver framework which read request to use to read the control point. It also tells test read request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#readParameters
   */
  public void setReadParameters(BDdfIdParams v) { set(readParameters,v,null); }

////////////////////////////////////////////////////////////////
// Property "pointId"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pointId</code> property.
   * This tells your driver's read and write response's
   * parseReadValue method how to extract the data value
   * for a particular control point.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#getPointId
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#setPointId
   */
  public static final Property pointId = newProperty(0, new BPsNiagaraDriverCircuitId(),MGR_INCLUDE);
  
  /**
   * Get the <code>pointId</code> property.
   * This tells your driver's read and write response's
   * parseReadValue method how to extract the data value
   * for a particular control point.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#pointId
   */
  public BPsNiagaraDriverCircuitId getPointId() { return (BPsNiagaraDriverCircuitId)get(pointId); }
  
  /**
   * Set the <code>pointId</code> property.
   * This tells your driver's read and write response's
   * parseReadValue method how to extract the data value
   * for a particular control point.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#pointId
   */
  public void setPointId(BPsNiagaraDriverCircuitId v) { set(pointId,v,null); }

////////////////////////////////////////////////////////////////
// Property "writeParameters"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>writeParameters</code> property.
   * This hooks your driver's write parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The write parameter's structure tells the dev driver framework which write request to use to write the control point. It also tells your write request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#getWriteParameters
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#setWriteParameters
   */
  public static final Property writeParameters = newProperty(0, new BPsNiagaraDriverWriteParams(),MGR_INCLUDE);
  
  /**
   * Get the <code>writeParameters</code> property.
   * This hooks your driver's write parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The write parameter's structure tells the dev driver framework which write request to use to write the control point. It also tells your write request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#writeParameters
   */
  public BDdfIdParams getWriteParameters() { return (BDdfIdParams)get(writeParameters); }
  
  /**
   * Set the <code>writeParameters</code> property.
   * This hooks your driver's write parameters structure
   * into the proxy extension that is placed on control
   * points that are under devices in your driver. The write parameter's structure tells the dev driver framework which write request to use to write the control point. It also tells your write request's toByteArray method how to construct the bytes for the request.
   * @see com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt#writeParameters
   */
  public void setWriteParameters(BDdfIdParams v) { set(writeParameters,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitProxyExt.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/


	/**
	 * This associates BPsNiagaraDeviceExt with BPsNiagaraProxyExt within the
	 * Niagara AX framework.
	 */
  public Type getDeviceExtType()
  {

    return BPsNiagaraDriverCircuitDeviceExt.TYPE;
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
      apiObejct.Parameters.add(this.getParentPoint().getType().toString());
      apiObejct.Parameters.add(""+this.getPointId().getCircuitNo());
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
    throw new BajaRuntimeException(
                                   "Unsupported get write Byte Array in BPsNiagaraDriverWidgetProxyExt line:109");
  }

  public BStatusValue getReadValue(BPsAPIObejct response)
  {
    BControlPoint controlPoint = this.getParentPoint();
    BPsNiagaraDriverCircuitId circuitno = (BPsNiagaraDriverCircuitId) this.getPointId();

    String sRawValue = response.GetStatusString(BPsCircuitStatus.TYPE, circuitno.getCircuitNo());

    if (controlPoint instanceof BPsNiagaraDriverCircuit)
    {
      this.getDdfCommunicator().getLog()
          .trace("BPsNiagaraDriverReadResponse: " + circuitno.getCircuitNo() + "-" + sRawValue);

      ((BPsNiagaraDriverCircuit) controlPoint)
          .setOnOffStatus(sRawValue.toLowerCase().indexOf("on") >= 0);
      return new BStatusString(sRawValue);
    }
    else
    {
      this.getDdfCommunicator().getLog().trace("BPsNiagaraDriverReadResponse: Unsupported");
      throw new IllegalStateException("Unsupported control point type: " + controlPoint.getType() +
          "! Please have my program fixed.");
    }
  }

}