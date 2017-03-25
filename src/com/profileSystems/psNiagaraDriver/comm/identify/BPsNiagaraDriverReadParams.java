/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.comm.identify;

import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverReadRequest;
import com.tridium.ddf.identify.BDdfReadParams;

public class BPsNiagaraDriverReadParams
  extends BDdfReadParams
  {
  /*-
  class BPsNiagaraDriverReadParams
  {
    properties
    {
      
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverReadParams(3487662096)1.0$ @*/
/* Generated Fri Jul 05 00:13:18 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverReadParams.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	public Type getReadRequestType() {
		return BPsNiagaraDriverReadRequest.TYPE;
	}
    

}