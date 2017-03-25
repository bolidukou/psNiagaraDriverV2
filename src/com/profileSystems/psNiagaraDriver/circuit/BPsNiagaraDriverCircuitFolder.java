/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.circuit;

import javax.baja.agent.AgentList;
import javax.baja.sys.*; 
 
import com.tridium.ddf.*; 
  
public class BPsNiagaraDriverCircuitFolder 
extends BDdfPointFolder
{ 
  /*- 
  class BPsNiagaraDriverCircuitFolder 
  { 
    properties 
    { 
    } 
  } 
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitFolder(671416578)1.0$ @*/
/* Generated Thu Jul 04 16:32:31 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitFolder.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/ 
 
  public AgentList getAgents(Context paramContext)
  {
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverCircuitManager", "CircuitManager", "Circuit Manager");
  }
}