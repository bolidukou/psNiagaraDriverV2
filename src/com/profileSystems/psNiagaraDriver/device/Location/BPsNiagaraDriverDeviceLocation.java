/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.device.Location;

import javax.baja.sys.*;

import com.tridium.ddf.identify.*;

public class BPsNiagaraDriverDeviceLocation
  extends BDdfIdParams
{
  /*-
  class BPsNiagaraDriverDeviceLocation
  {
   
    properties
	{
	CountyState: BPsNiagaraDriverDeviceLocationParams
	flags { readonly }
	default{[new BPsNiagaraDriverDeviceLocationParams()]}
	
	Latitude : String
	flags { readonly }
	default{[""]}
	
	Longitude : String
	flags { readonly }
	default{[""]}
	
	TimeZone : String
	flags { readonly }
	default{[""]}
	
	FollowsDST : String
	flags { readonly }
	default{[""]}
	
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation(1587838786)1.0$ @*/
/* Generated Tue Jul 09 22:06:22 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "CountyState"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>CountyState</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#getCountyState
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#setCountyState
   */
  public static final Property CountyState = newProperty(Flags.READONLY, new BPsNiagaraDriverDeviceLocationParams(),null);
  
  /**
   * Get the <code>CountyState</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#CountyState
   */
  public BPsNiagaraDriverDeviceLocationParams getCountyState() { return (BPsNiagaraDriverDeviceLocationParams)get(CountyState); }
  
  /**
   * Set the <code>CountyState</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#CountyState
   */
  public void setCountyState(BPsNiagaraDriverDeviceLocationParams v) { set(CountyState,v,null); }

////////////////////////////////////////////////////////////////
// Property "Latitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Latitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#getLatitude
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#setLatitude
   */
  public static final Property Latitude = newProperty(Flags.READONLY, "",null);
  
  /**
   * Get the <code>Latitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#Latitude
   */
  public String getLatitude() { return getString(Latitude); }
  
  /**
   * Set the <code>Latitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#Latitude
   */
  public void setLatitude(String v) { setString(Latitude,v,null); }

////////////////////////////////////////////////////////////////
// Property "Longitude"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Longitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#getLongitude
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#setLongitude
   */
  public static final Property Longitude = newProperty(Flags.READONLY, "",null);
  
  /**
   * Get the <code>Longitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#Longitude
   */
  public String getLongitude() { return getString(Longitude); }
  
  /**
   * Set the <code>Longitude</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#Longitude
   */
  public void setLongitude(String v) { setString(Longitude,v,null); }

////////////////////////////////////////////////////////////////
// Property "TimeZone"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>TimeZone</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#getTimeZone
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#setTimeZone
   */
  public static final Property TimeZone = newProperty(Flags.READONLY, "",null);
  
  /**
   * Get the <code>TimeZone</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#TimeZone
   */
  public String getTimeZone() { return getString(TimeZone); }
  
  /**
   * Set the <code>TimeZone</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#TimeZone
   */
  public void setTimeZone(String v) { setString(TimeZone,v,null); }

////////////////////////////////////////////////////////////////
// Property "FollowsDST"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>FollowsDST</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#getFollowsDST
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#setFollowsDST
   */
  public static final Property FollowsDST = newProperty(Flags.READONLY, "",null);
  
  /**
   * Get the <code>FollowsDST</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#FollowsDST
   */
  public String getFollowsDST() { return getString(FollowsDST); }
  
  /**
   * Set the <code>FollowsDST</code> property.
   * @see com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocation#FollowsDST
   */
  public void setFollowsDST(String v) { setString(FollowsDST,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverDeviceLocation.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}