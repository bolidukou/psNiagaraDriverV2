package com.profileSystems.psNiagaraDriver.comm.req;

import javax.baja.log.Log;
import javax.baja.sys.*;
import javax.baja.util.Array;

import com.tridium.ddf.comm.req.*;
import com.tridium.ddf.comm.rsp.*;
import com.tridium.ddf.comm.*;
import com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork;
import com.profileSystems.psNiagaraDriver.BPsNiagaraDriverUtil;
import com.profileSystems.psNiagaraDriver.PSAPI.*;
import com.profileSystems.psNiagaraDriver.comm.rsp.*;
import com.profileSystems.psNiagaraDriver.device.*;

public class BPsNiagaraDriverPingRequest extends BDdfPingRequest {
	/*-
	 class BPsNiagaraDriverPingRequest
	 {
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverPingRequest(332908855)1.0$ @*/
/* Generated Thu Jul 04 16:32:31 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverPingRequest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public byte[] toByteArray() {
		
		if (this.getPingableSource().length > 0) {
			
			Log thisLog = ((BPsNiagaraDriverDevice) this.getPingableSource()[0])
					.getDdfCommunicator().getLog();
			if (thisLog.isTraceOn()) {
				thisLog.trace("Ping: "+ BPsNiagaraDriverUtil.GetModuleNameAndVersion());
			}
		}
		
		BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) getDeviceId();		
		int id = deviceId.getSerialNo();
		
		BPsAPIObejct apiObejct = new BPsAPIObejct();
		apiObejct.UnitAddress = id;
		apiObejct.Payload="PING";
		apiObejct.Parameters = new Array();
			
    if (this.getPingableSource().length > 0)
    {
      BPsNiagaraDriverGatewayNetwork network =
          (BPsNiagaraDriverGatewayNetwork) ((BPsNiagaraDriverDevice) this.getPingableSource()[0])
              .getNetwork();
      String username = network.getCredentials().getUsername();
      String pwd = network.getCredentials().getPassword().getString();
      apiObejct.Parameters.add(username);
      apiObejct.Parameters.add(pwd);
      apiObejct.Parameters.add(BPsNiagaraDriverUtil.GetModuleNameAndVersion());
    }
		
		try {
			return apiObejct.ToByteArray();
		} catch (BPsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	public BIDdfResponse processReceive(IDdfDataFrame recieveFrame)
			throws DdfResponseException {
		
		

//		try {
//			BPsAPIObejct response = BPsAPIObejct.Parse(recieveFrame.getFrameBytes(),recieveFrame.getFrameSize());
//		} catch (BPsException e) {			
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	 
		//((BPsNiagaraDriverDevice)this.getPingableSource()[0]).getDdfCommunicator().getLog().trace("Ping response built");
		
		//success, unit is online
		return new BPsNiagaraDriverPingResponse();
	}
	
  public BSimple getTag()
  {
    BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) this.getDeviceId();

    String tag = deviceId.getSerialNo() + "PING";

    //((BPsNiagaraDriverDevice) this.getPingableSource()[0]).getDdfCommunicator().getLog().trace("Q{" + tag + "}");

    return BString.make(tag);
  }

}
