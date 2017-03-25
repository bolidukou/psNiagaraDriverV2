/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.agent.AgentList;
import javax.baja.sys.*; 
 
import com.tridium.ddf.*; 
  
public class BPsNiagaraDriverCircuitWidgetFolder 
extends BDdfPointFolder
{ 
  /*- 
  class BPsNiagaraDriverCircuitWidgetFolder 
  { 
    properties  
    { 
    } 
  } 
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetFolder(3766487119)1.0$ @*/
/* Generated Sat Dec 07 18:10:59 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitWidgetFolder.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/ 
 
  public AgentList getAgents(Context paramContext)
  {
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverCircuitWidgetManager", "CircuitWidgetManager", "Circuit Widget Manager");
  }
}