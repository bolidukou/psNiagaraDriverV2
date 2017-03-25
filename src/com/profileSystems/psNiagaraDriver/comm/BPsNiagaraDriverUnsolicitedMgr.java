package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;
import com.tridium.ddf.comm.IDdfDataFrame;




public class BPsNiagaraDriverUnsolicitedMgr
    extends com.tridium.ddf.comm.defaultComm.BDdfUnsolicitedMgr
{
  /*-
  class BPsNiagaraDriverUnsolicitedMgr
  {
  properties
  {
  
  }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverUnsolicitedMgr(3328000076)1.0$ @*/
/* Generated Mon Mar 17 22:11:36 CDT 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverUnsolicitedMgr.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  
  public void processUnsolicitedFrame(IDdfDataFrame recieveFrame) throws Exception
  {

    try {
      BPsAPIObejct m_response = BPsAPIObejct.Parse(recieveFrame.getFrameBytes(),
          recieveFrame.getFrameSize());
      this.getDdfCommunicator().getLog().trace("UnsolicitedFrame - " + m_response.toString());

    } catch (BPsException e1) {      
      e1.printStackTrace();
      throw new IllegalStateException(e1.getMessage());
    }    
  }
}
