/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.comm.req;

import javax.baja.sys.*;
import javax.baja.util.Array;

import com.tridium.ddf.comm.*;
import com.tridium.ddf.comm.req.*;
import com.tridium.ddf.comm.rsp.*;
import com.tridium.ddf.point.BDdfProxyExt;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;
import com.profileSystems.psNiagaraDriver.comm.rsp.*;
import com.profileSystems.psNiagaraDriver.device.*;

public class BPsNiagaraDriverReadRequest extends BDdfReadRequest {
	/*-
	class BPsNiagaraDriverReadRequest
	{
	    }
	-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverReadRequest(2169398080)1.0$ @*/
/* Generated Fri Jul 05 00:13:18 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverReadRequest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/	

	public byte[] toByteArray() {

		BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) this.getDeviceId();		
		
		BPsAPIObejct apiObejct = new BPsAPIObejct();
		apiObejct.UnitAddress = deviceId.getSerialNo();
		apiObejct.Payload = "READ";
		apiObejct.Parameters = new Array();

		try {
			return apiObejct.ToByteArray();
		} catch (BPsException e) {
			e.printStackTrace();
			return null;
		}
	}

  public BSimple getTag()
  {
    BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) this.getDeviceId();

    String tag = deviceId.getSerialNo() + "READ";

    //((BDdfProxyExt) this.getReadableSource()[0]).getDdfCommunicator().getLog().trace("Q{" + tag + "}");    

    return BString.make(tag);
  }
  
	/**
	 * After transmitting this request, the BDdfCommunicator will pass frames
	 * that it receives here. If you implement the getTag method then the ddf
	 * communicator will only pass data frames whose tag's hashcode matches your
	 * request tag's hashcode. If your request returns null from the getTag
	 * method then all received data frames will be passed here, until the
	 * request times out or returns a BIDdfResponse from this method.
	 * 
	 * This request needs to take one of the following steps: 1. NOT TYPICAL:
	 * Ignore the frame and return null. 2. NOT TYPICAL: Collect the frame and
	 * return a BIDdfMultiFrameResponse. In which case, you need to implement
	 * your own collection mechanism. For example, this could be as simple as
	 * putting them all in a Vector in the BIDdfMultiFrameResponse. 3. TYPICAL:
	 * Return a BIDdfResponse for the data frame and NOT TYPICAL:> any
	 * previously collected frames that you determine together make up a
	 * completed response. 4. TYPICAL: Throw an DdfResponseException or subclass
	 * there-of to indicate the the frame forms a complete message but indicates
	 * an error condition in the device preventing a successful response.
	 * 
	 * WARNING: In scenario's 2 and 3, please copy the frame's bytes as the
	 * frame's byte array could be a direct reference to an internal buffer in
	 * the receiver.
	 * 
	 * @param iDdfDataFrame
	 * @return
	 */
	public BIDdfResponse processReceive(IDdfDataFrame receiveFrame)
			throws DdfResponseException {	
//	  BDdfProxyExt proxy = (BDdfProxyExt)this.getReadableSource()[0];
//		proxy.getDdfCommunicator().getLog().trace("BPsNiagaraDriverReadRequest:processReceive");
		return new BPsNiagaraDriverReadResponse(receiveFrame);
	}
	
	
}