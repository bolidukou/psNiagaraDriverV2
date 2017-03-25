package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.tridium.ddf.poll.BDdfPollGroup;
import com.tridium.ddf.poll.BIDdfPollable;

public class BPsNiagaraDriverPollGroup extends BDdfPollGroup
{
  /*-
  class BPsNiagaraDriverPollGroup
  {
  properties
  {
  
  }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollGroup(3130155670)1.0$ @*/
/* Generated Fri Feb 28 00:05:30 CST 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverPollGroup.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  public static  BDdfPollGroup getPollGroupByPollable(BIDdfPollable pollable){    
    return getPollGroup(pollable);
  }
}
