/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.circuit;

import javax.baja.agent.AgentList;
import javax.baja.sys.*;
import javax.baja.util.*;

import com.tridium.ddf.*;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;

public class BPsNiagaraDriverCircuitDeviceExt
  extends BDdfPointDeviceExt
{
	 /*-
	 class BPsNiagaraDriverCircuitDeviceExt
	 {
	 properties
	 {
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitDeviceExt(3843538700)1.0$ @*/
/* Generated Thu Jul 25 00:35:23 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitDeviceExt.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraDevice.
   */
  public Type getDeviceType()
  {
    return BPsNiagaraDriverDevice.TYPE;
  }
  
  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraDriverCircuitFolder.
   */
  public Type getPointFolderType()
  {
    return BPsNiagaraDriverCircuitFolder.TYPE;
  }
  
  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraProxyExt
   */
  public Type getProxyExtType()
  {
    return BPsNiagaraDriverCircuitProxyExt.TYPE;
  }
  
  /**
   * This can be left null, depending on how you decide to define
   * the discovery behavior in your driver. We will visit the
   * discovery process in further detail during another day's
   * lesson.
   */
  public BFolder getDiscoveryFolder()
  {
    return null;
  }
  
  public AgentList getAgents(Context paramContext)
  {
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverCircuitManager", "CircuitManager", "Circuit Manager");
  }
}