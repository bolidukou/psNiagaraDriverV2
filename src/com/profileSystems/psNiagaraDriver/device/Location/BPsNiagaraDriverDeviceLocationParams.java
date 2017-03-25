/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.device.Location;

import javax.baja.sys.*;

import com.tridium.ddf.identify.*;

public class BPsNiagaraDriverDeviceLocationParams
  extends BDdfIdParams
{
  /*-
  class BPsNiagaraDriverDeviceLocationParams
  {
   
    properties
	{		
	County : String
	default{["Lake"]}
	
	State: BPsNiagaraDriverDeviceLocationState
	default{[BPsNiagaraDriverDeviceLocationState.Indiana]}
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams(1256890475)1.0$ @*/
/* Generated Mon Jul 08 23:04:25 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "County"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>County</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#getCounty
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#setCounty
   */
  public static final Property County = newProperty(0, "Lake",null);
  
  /**
   * Get the <code>County</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#County
   */
  public String getCounty() { return getString(County); }
  
  /**
   * Set the <code>County</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#County
   */
  public void setCounty(String v) { setString(County,v,null); }

////////////////////////////////////////////////////////////////
// Property "State"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>State</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#getState
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#setState
   */
  public static final Property State = newProperty(0, BPsNiagaraDriverDeviceLocationState.Indiana,null);
  
  /**
   * Get the <code>State</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#State
   */
  public BPsNiagaraDriverDeviceLocationState getState() { return (BPsNiagaraDriverDeviceLocationState)get(State); }
  
  /**
   * Set the <code>State</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationParams#State
   */
  public void setState(BPsNiagaraDriverDeviceLocationState v) { set(State,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverDeviceLocationParams.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}