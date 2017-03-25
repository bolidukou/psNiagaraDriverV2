/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.agent.AgentList;
import javax.baja.sys.*;
import javax.baja.util.*;

import com.tridium.ddf.*;
import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetFolder;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;

public class BPsNiagaraDriverCircuitWidgetDeviceExt
  extends BDdfPointDeviceExt
{
	 /*-
	 class BPsNiagaraDriverCircuitWidgetDeviceExt
	 {
	 properties
	 {
	 
	 } 
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsNiagaraDriverCircuitWidgetDeviceExt(309190441)1.0$ @*/
/* Generated Sat Dec 07 18:10:59 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitWidgetDeviceExt.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraDevice.
   */
  public Type getDeviceType()
  {
    return BPsNiagaraDriverDevice.TYPE;
  }
  
  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraDriverWidgetFolder.
   */
  public Type getPointFolderType()
  {
    return BPsNiagaraDriverWidgetFolder.TYPE;
  }
  
  /**
   * Associates BPsNiagaraPointDeviceExt to BPsNiagaraProxyExt
   */
  public Type getProxyExtType()
  {
    return BPsNiagaraDriverCircuitWidgetProxyExt.TYPE;
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
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverCircuitWidgetManager", "CircuitWidgetManager", "Circuit Widget Manager");
  }
}