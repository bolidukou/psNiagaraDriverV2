/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.agent.AgentList;
import javax.baja.sys.*; 
 
import com.tridium.ddf.*; 
  
public class BPsNiagaraDriverWidgetFolder 
extends BDdfPointFolder
{ 
  /*- 
  class BPsNiagaraDriverWidgetFolder 
  { 
    properties  
    { 
    } 
  } 
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetFolder(3767841275)1.0$ @*/
/* Generated Sat Nov 16 17:51:49 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWidgetFolder.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/ 
 
  public AgentList getAgents(Context paramContext)
  {
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverWidgetManager", "WidgetManager", "Widget Manager");
  }
}