/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.comm.rsp;


import javax.baja.sys.*;
import javax.baja.status.*;

import com.profileSystems.psNiagaraDriver.PSAPI.*;
import com.profileSystems.psNiagaraDriver.Widget.*;
import com.profileSystems.psNiagaraDriver.CircuitWidget.*;
import com.profileSystems.psNiagaraDriver.circuit.*;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverReadParams;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;
import com.tridium.ddf.comm.*;
import com.tridium.ddf.comm.rsp.*;
import com.tridium.ddf.comm.req.*;
import com.tridium.ddf.point.BDdfProxyExt;

public class BPsNiagaraDriverReadResponse
    extends BDdfResponse
    implements BIDdfReadResponse
{
  /*-
  class BPsNiagaraDriverReadResponse
  {
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.rsp.BPsNiagaraDriverReadResponse(502432179)1.0$ @*/
/* Generated Mon Nov 18 00:30:55 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverReadResponse.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  private byte[] receiveBytes; // This is populated by the constructor

  public BPsNiagaraDriverReadResponse(IDdfDataFrame receiveFrame,
                                      BPsNiagaraDriverReadParams readParams)
  {
    byte[] receiveBuffer = receiveFrame.getFrameBytes();
    int receiveLength = receiveFrame.getFrameSize();
    receiveBytes = new byte[receiveLength];
    for (int i = 0; i < receiveLength; i++)
      receiveBytes[i] = receiveBuffer[i];
  }

  public BPsNiagaraDriverReadResponse()
  {

  }

  public BPsNiagaraDriverReadResponse(IDdfDataFrame receiveFrame)
  {

    byte[] receiveBuffer = receiveFrame.getFrameBytes();
    int receiveLength = receiveFrame.getFrameSize();

    receiveBytes = new byte[receiveLength];
    for (int i = 0; i < receiveLength; i++)
      receiveBytes[i] = receiveBuffer[i];
  }

  public BStatusValue parseReadValue(IDdfReadable readableSource)
  {

    BPsAPIObejct response;
    try
    {
      response = BPsAPIObejct.Parse(receiveBytes);
    }
    catch (BPsException e1)
    {
      e1.printStackTrace();
      throw new IllegalStateException(e1.getMessage());
    }
    
    BDdfProxyExt proxyDevice = (BDdfProxyExt)readableSource;
    if (proxyDevice.getDdfDevice() instanceof BPsNiagaraDriverDevice)
    {
      int sig = Integer.parseInt(response.GetStatusString(BPsSignalStrength.TYPE));

      ((BPsNiagaraDriverDevice) proxyDevice.getDdfDevice()).setSignalStrength(sig);

      if (response.Parameters.size() >= 10)
      {
        String acPower = response.GetStatusString(BPsACPower.TYPE);
        ((BPsNiagaraDriverDevice) proxyDevice.getDdfDevice()).setACPower(acPower);
      }
    }    
    
    if (readableSource instanceof BPsNiagaraDriverCircuitProxyExt)
    {
      BPsNiagaraDriverCircuitProxyExt proxy = (BPsNiagaraDriverCircuitProxyExt) readableSource;
      return proxy.getReadValue(response);
    }
    else if (readableSource instanceof BPsNiagaraDriverWidgetProxyExt)
    {
      BPsNiagaraDriverWidgetProxyExt proxy = (BPsNiagaraDriverWidgetProxyExt) readableSource;
      return proxy.getReadValue(response);
    }
    else if(readableSource instanceof BPsNiagaraDriverCircuitWidgetProxyExt)
    {
      BPsNiagaraDriverCircuitWidgetProxyExt proxy = (BPsNiagaraDriverCircuitWidgetProxyExt) readableSource;
      return proxy.getReadValue(response);
    }    
    
    throw new IllegalStateException("Unsupported control point type: " + readableSource.toString() +
        "! Please have my program fixed.");
  } 
}