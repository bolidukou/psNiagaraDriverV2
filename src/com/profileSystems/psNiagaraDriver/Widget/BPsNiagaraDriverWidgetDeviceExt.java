/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.agent.AgentList;
import javax.baja.sys.*;
import javax.baja.util.*;

import com.tridium.ddf.*;
import com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetFolder;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;

public class BPsNiagaraDriverWidgetDeviceExt
  extends BDdfPointDeviceExt
{
	 /*-
	 class BPsNiagaraDriverWidgetDeviceExt
	 {
	 properties
	 {
	 
	 } 
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetDeviceExt(2804603075)1.0$ @*/
/* Generated Sat Nov 16 17:49:16 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWidgetDeviceExt.class);

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
    return BPsNiagaraDriverWidgetProxyExt.TYPE;
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
    return DdfAgentInfo.getAgentsHelp(super.getAgents(paramContext), getType().getTypeInfo().getModuleName(), "psNiagaraDriver:PsNiagaraDriverWidgetManager", "WidgetManager", "Widget Manager");
  }
}