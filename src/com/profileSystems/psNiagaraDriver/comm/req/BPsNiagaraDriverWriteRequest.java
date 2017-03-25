/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.comm.req;

import java.io.ByteArrayOutputStream;

import javax.baja.status.*;
import javax.baja.sys.*;

import com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetProxyExt;
import com.profileSystems.psNiagaraDriver.PSAPI.*;
import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetProxyExt;
import com.profileSystems.psNiagaraDriver.circuit.*;

import com.profileSystems.psNiagaraDriver.comm.rsp.*;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDeviceId;
import com.tridium.ddf.comm.req.*;
import com.tridium.ddf.comm.*;
import com.tridium.ddf.comm.rsp.*;
import com.tridium.ddf.point.BDdfProxyExt;

public class BPsNiagaraDriverWriteRequest
    extends BDdfWriteRequest
{
  /*-
  class BPsNiagaraDriverWriteRequest
  {
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverWriteRequest(2735470818)1.0$ @*/
/* Generated Tue Apr 12 22:26:02 CDT 2016 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWriteRequest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  public byte[] toByteArray()
  {

    // BPsNiagaraDriverWriteParams writeParams = (BPsNiagaraDriverWriteParams) getWriteParameters();

    IDdfWritable[] pointsToWrite = getWritableSource();

    ByteArrayOutputStream bos = new ByteArrayOutputStream();

    for (int i = 0; i < pointsToWrite.length; i++)
    {
      if (pointsToWrite[i] instanceof BPsNiagaraDriverCircuitProxyExt)
      {
        BPsNiagaraDriverCircuitProxyExt proxy = (BPsNiagaraDriverCircuitProxyExt) pointsToWrite[i];
        byte[] writeBA = proxy.getWriteByteArray();
        bos.write(writeBA, 0, writeBA.length);
      }

      if (pointsToWrite[i] instanceof BPsNiagaraDriverWidgetProxyExt)
      {
        BPsNiagaraDriverWidgetProxyExt proxy = (BPsNiagaraDriverWidgetProxyExt) pointsToWrite[i];
        byte[] writeBA = proxy.getWriteByteArray();
        bos.write(writeBA, 0, writeBA.length);
      }

      if (pointsToWrite[i] instanceof BPsNiagaraDriverCircuitWidgetProxyExt)
      {
        BPsNiagaraDriverCircuitWidgetProxyExt proxy =
            (BPsNiagaraDriverCircuitWidgetProxyExt) pointsToWrite[i];
        byte[] writeBA = proxy.getWriteByteArray();
        bos.write(writeBA, 0, writeBA.length);
      }
    }

    return bos.toByteArray();
  }

  public BSimple getTag()
  {
    BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) this.getDeviceId();

    String tag = deviceId.getSerialNo() + "WRITE";

    // ((BDdfProxyExt)this.getWritableSource()[0]).getDdfCommunicator().getLog().trace("Q{" + tag +
    // "}");

    return BString.make(tag);
  }

  /**
   * After transmitting this request, the BDdfCommunicator will pass frames that it receives here.
   * If you implement the getTag method then the ddf communicator will only pass data frames whose
   * tag's hashcode matches your request tag's hashcode. If your request returns null from the
   * getTag method then all received data frames will be passed here, until the request times out or
   * returns a BIDdfResponse from this method.
   * 
   * This request needs to take one of the following steps: 1. NOT TYPICAL: Ignore the frame and
   * return null. 2. NOT TYPICAL: Collect the frame and return a BIDdfMultiFrameResponse. In which
   * case, you need to implement your own collection mechanism. For example, this could be as simple
   * as putting them all in a Vector in the BIDdfMultiFrameResponse. 3. TYPICAL: Return a
   * BIDdfResponse for the data frame and NOT TYPICAL:> any previously collected frames that you
   * determine together make up a completed response. 4. TYPICAL: Throw an DdfResponseException or
   * subclass there-of to indicate the the frame forms a complete message but indicates an error
   * condition in the device preventing a successful response.
   * 
   * WARNING: In scenario's 2 and 3, please copy the frame's bytes as the frame's byte array could
   * be a direct reference to an internal buffer in the receiver.
   * 
   * @param iDdfDataFrame
   * @return
   */
  public BIDdfResponse processReceive(IDdfDataFrame receiveFrame) throws DdfResponseException
  {
    BPsAPIObejct response;
    try
    {
      response = BPsAPIObejct.Parse(receiveFrame.getFrameBytes(), receiveFrame.getFrameSize());
      if (response.Payload.equalsIgnoreCase("WRITE-Success"))
      {
        this.OnResponseSuccess(response);
        return new BPsNiagaraDriverWriteResponse();
      }
      else
        return new BPsNiagaraDriverWriteResponse();
    }
    catch (BPsException e)
    {
      // TODO Auto-generated catch block
      e.printStackTrace();
      throw new DdfResponseException(e.getMessage());
    }
  }

  /**
   * On response success, trigger sub sequence commands if needed In this case, if relay override
   * changes, refresh points value again by calling "Read" on demand
   * */
  public void OnResponseSuccess(BPsAPIObejct response)
  {
    if (response.Parameters.size() >= 6)
    {
      IDdfWritable[] points = this.getWritableSource();
      for (int i = 0; i < points.length; i++)
      {
        try
        {
          
          BDdfProxyExt readableSource = (BDdfProxyExt)points[i];          

          if (readableSource instanceof BPsNiagaraDriverCircuitProxyExt)
          {
            BPsNiagaraDriverCircuitProxyExt proxy =
                (BPsNiagaraDriverCircuitProxyExt) readableSource;
            
            readableSource.getDdfCommunicator().getLog().trace("parse status in write response" + proxy.getReadValue(response));            
            readableSource.readOk(proxy.getReadValue(response));
          }
          else if (readableSource instanceof BPsNiagaraDriverWidgetProxyExt)
          {
            BPsNiagaraDriverWidgetProxyExt proxy = (BPsNiagaraDriverWidgetProxyExt) readableSource;
            readableSource.getDdfCommunicator().getLog().trace("parse status in write response" + proxy.getReadValue(response));
            readableSource.readOk(proxy.getReadValue(response));
          }
          else if (readableSource instanceof BPsNiagaraDriverCircuitWidgetProxyExt)
          {
            BPsNiagaraDriverCircuitWidgetProxyExt proxy =
                (BPsNiagaraDriverCircuitWidgetProxyExt) readableSource;
            readableSource.getDdfCommunicator().getLog().trace("parse status in write response" + proxy.getReadValue(response));
            readableSource.readOk(proxy.getReadValue(response));
          }
        }
        catch (Exception ex)
        {
          // parse status failed, no status value returned from the write response
        }
      }
    }
    
    // NOC version support 5 parameters check status
    if (response.Parameters.size() >= 5)
    {
      int attempt = 1;
      String lastFrameReceived = response.Parameters.get(1).toString();
      boolean checkStatusUpdate =
          BBoolean.decode(response.Parameters.get(2).toString().toLowerCase());
      String maxRetry = response.Parameters.get(3).toString();
      String expireTime = response.Parameters.get(4).toString();

      if (checkStatusUpdate)
      {
        BDdfProxyExt proxy = (BDdfProxyExt) this.getWritableSource()[0];
        BPsNiagaraDriverDevice device = (BPsNiagaraDriverDevice) proxy.getDdfDevice();

        device.doCheckUnitStatus(attempt, lastFrameReceived, maxRetry, expireTime);
      }
    }

    
  }

  public static String GetWritableRawValue(BStatusValue localBStatusValue)
  {
    if ((localBStatusValue instanceof BStatusNumeric))
    {
      return ((BStatusNumeric) localBStatusValue).getNumeric() + "";
    }
    if ((localBStatusValue instanceof BStatusEnum))
    {
      return ((BStatusEnum) localBStatusValue).getEnum().toString();
    }
    if ((localBStatusValue instanceof BStatusBoolean))
    {
      return ((BStatusBoolean) localBStatusValue).getBoolean() + "";
    }
    if ((localBStatusValue instanceof BStatusString))
    {
      return ((BStatusString) localBStatusValue).getValue();
    }
    throw new BajaRuntimeException();
  }

}