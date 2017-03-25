package com.profileSystems.psNiagaraDriver;

import javax.baja.security.BPassword;
import javax.baja.sys.*;
import com.tridium.ddf.identify.*;
import com.profileSystems.psNiagaraDriver.comm.req.*;

public class BPsNiagaraDriverGatewayNetworkCredential extends BDdfIdParams{
	/*-
	 class BPsNiagaraDriverGatewayNetworkCredential
	 {
	 properties
	 {
	 Username : String	 
	 default{["niagaraprod"]}
	 
	 Password : BPassword
	 -- This is the unitNumber in our hypothetical protocol.
	 default{[BPassword.make("niagaraprod231")]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential(1160665284)1.0$ @*/
/* Generated Thu Feb 27 20:32:00 CST 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "Username"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Username</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#getUsername
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#setUsername
   */
  public static final Property Username = newProperty(0, "niagaraprod",null);
  
  /**
   * Get the <code>Username</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#Username
   */
  public String getUsername() { return getString(Username); }
  
  /**
   * Set the <code>Username</code> property.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#Username
   */
  public void setUsername(String v) { setString(Username,v,null); }

////////////////////////////////////////////////////////////////
// Property "Password"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>Password</code> property.
   * This is the unitNumber in our hypothetical protocol.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#getPassword
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#setPassword
   */
  public static final Property Password = newProperty(0, BPassword.make("niagaraprod231"),null);
  
  /**
   * Get the <code>Password</code> property.
   * This is the unitNumber in our hypothetical protocol.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#Password
   */
  public BPassword getPassword() { return (BPassword)get(Password); }
  
  /**
   * Set the <code>Password</code> property.
   * This is the unitNumber in our hypothetical protocol.
   * @see com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetworkCredential#Password
   */
  public void setPassword(BPassword v) { set(Password,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverGatewayNetworkCredential.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
	

	public Type getPingRequestType() {
		return BPsNiagaraDriverPingRequest.TYPE;
	}
}