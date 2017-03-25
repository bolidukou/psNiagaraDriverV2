/*
 * Copyright 2013 Profile Systems, All Rights Reserved.
 */
package com.profileSystems.psNiagaraDriver.comm.identify;

import javax.baja.sys.*;

import com.tridium.ddf.identify.*;

import com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverWriteRequest;

public class BPsNiagaraDriverWriteParams
  extends BDdfIdParams
  implements BIDdfWriteParams
{
  /*-
  class BPsNiagaraDriverWriteParams
  {
    properties
    {
      forceWrite : boolean
        -- This property has nothing to with the dev
        -- driver framework itself. Instead, we need
        -- to construct the toByteArray method of the
        -- driver's write request in following the
        -- driver's protocol to write data values.
        -- In this hypothetical protocol, if we do not
        -- forceWrite then the equipment's internal
        -- program could overwrite any change that
        -- Niagara might make to a data value.
        default{[true]}
    }
  }
  -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams(2189859787)1.0$ @*/
/* Generated Fri Jul 05 02:36:50 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "forceWrite"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>forceWrite</code> property.
   * This property has nothing to with the dev driver framework
   * itself. Instead, we need to construct the toByteArray
   * method of the driver's write request in following the driver's protocol to write data values. In this hypothetical protocol, if we do not forceWrite then the equipment's internal program could overwrite any change that Niagara might make to a data value.
   * @see com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams#getForceWrite
   * @see com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams#setForceWrite
   */
  public static final Property forceWrite = newProperty(0, true,null);
  
  /**
   * Get the <code>forceWrite</code> property.
   * This property has nothing to with the dev driver framework
   * itself. Instead, we need to construct the toByteArray
   * method of the driver's write request in following the driver's protocol to write data values. In this hypothetical protocol, if we do not forceWrite then the equipment's internal program could overwrite any change that Niagara might make to a data value.
   * @see com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams#forceWrite
   */
  public boolean getForceWrite() { return getBoolean(forceWrite); }
  
  /**
   * Set the <code>forceWrite</code> property.
   * This property has nothing to with the dev driver framework
   * itself. Instead, we need to construct the toByteArray
   * method of the driver's write request in following the driver's protocol to write data values. In this hypothetical protocol, if we do not forceWrite then the equipment's internal program could overwrite any change that Niagara might make to a data value.
   * @see com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverWriteParams#forceWrite
   */
  public void setForceWrite(boolean v) { setBoolean(forceWrite,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWriteParams.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public Type getWriteRequestType(){return BPsNiagaraDriverWriteRequest.TYPE;}
  }