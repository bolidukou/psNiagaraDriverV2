package com.profileSystems.psNiagaraDriver.comm.identify;
import javax.baja.sys.*;



/**
 * A list of circuit status
 * 
 * @author    Watson Zhou
 * @creation  
 * @version   
 * @since     
 */
public final class BPsNiagaraDriverCustomRequestType extends BFrozenEnum
{
/*-
  enum BPsNiagaraDriverCustomRequestType
  {
    range
    {
      Undefined,
      QueryUnitStatus,
      QueryUnitLocation,
      QueryCircuitSchedule,
      SetUnitTime,
      SetCircuitSchedule,
      SetCircuitInstantStatus,
      SetUnitLocation,
      QueryUnitName,
      SetUnitName,
      QueryCircuitName,
      SetCircuitName,
      SyncDevice,
      CheckStatusUpdate
    }
    
    default {[ Undefined ]}
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverCustomRequestType(2410236229)1.0$ @*/
/* Generated Tue Feb 25 22:36:56 CST 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for Undefined. */
  public static final int UNDEFINED = 0;
  /** Ordinal value for QueryUnitStatus. */
  public static final int QUERY_UNIT_STATUS = 1;
  /** Ordinal value for QueryUnitLocation. */
  public static final int QUERY_UNIT_LOCATION = 2;
  /** Ordinal value for QueryCircuitSchedule. */
  public static final int QUERY_CIRCUIT_SCHEDULE = 3;
  /** Ordinal value for SetUnitTime. */
  public static final int SET_UNIT_TIME = 4;
  /** Ordinal value for SetCircuitSchedule. */
  public static final int SET_CIRCUIT_SCHEDULE = 5;
  /** Ordinal value for SetCircuitInstantStatus. */
  public static final int SET_CIRCUIT_INSTANT_STATUS = 6;
  /** Ordinal value for SetUnitLocation. */
  public static final int SET_UNIT_LOCATION = 7;
  /** Ordinal value for QueryUnitName. */
  public static final int QUERY_UNIT_NAME = 8;
  /** Ordinal value for SetUnitName. */
  public static final int SET_UNIT_NAME = 9;
  /** Ordinal value for QueryCircuitName. */
  public static final int QUERY_CIRCUIT_NAME = 10;
  /** Ordinal value for SetCircuitName. */
  public static final int SET_CIRCUIT_NAME = 11;
  /** Ordinal value for SyncDevice. */
  public static final int SYNC_DEVICE = 12;
  /** Ordinal value for CheckStatusUpdate. */
  public static final int CHECK_STATUS_UPDATE = 13;
  
  /** BPsNiagaraDriverCustomRequestType constant for Undefined. */
  public static final BPsNiagaraDriverCustomRequestType Undefined = new BPsNiagaraDriverCustomRequestType(UNDEFINED);
  /** BPsNiagaraDriverCustomRequestType constant for QueryUnitStatus. */
  public static final BPsNiagaraDriverCustomRequestType QueryUnitStatus = new BPsNiagaraDriverCustomRequestType(QUERY_UNIT_STATUS);
  /** BPsNiagaraDriverCustomRequestType constant for QueryUnitLocation. */
  public static final BPsNiagaraDriverCustomRequestType QueryUnitLocation = new BPsNiagaraDriverCustomRequestType(QUERY_UNIT_LOCATION);
  /** BPsNiagaraDriverCustomRequestType constant for QueryCircuitSchedule. */
  public static final BPsNiagaraDriverCustomRequestType QueryCircuitSchedule = new BPsNiagaraDriverCustomRequestType(QUERY_CIRCUIT_SCHEDULE);
  /** BPsNiagaraDriverCustomRequestType constant for SetUnitTime. */
  public static final BPsNiagaraDriverCustomRequestType SetUnitTime = new BPsNiagaraDriverCustomRequestType(SET_UNIT_TIME);
  /** BPsNiagaraDriverCustomRequestType constant for SetCircuitSchedule. */
  public static final BPsNiagaraDriverCustomRequestType SetCircuitSchedule = new BPsNiagaraDriverCustomRequestType(SET_CIRCUIT_SCHEDULE);
  /** BPsNiagaraDriverCustomRequestType constant for SetCircuitInstantStatus. */
  public static final BPsNiagaraDriverCustomRequestType SetCircuitInstantStatus = new BPsNiagaraDriverCustomRequestType(SET_CIRCUIT_INSTANT_STATUS);
  /** BPsNiagaraDriverCustomRequestType constant for SetUnitLocation. */
  public static final BPsNiagaraDriverCustomRequestType SetUnitLocation = new BPsNiagaraDriverCustomRequestType(SET_UNIT_LOCATION);
  /** BPsNiagaraDriverCustomRequestType constant for QueryUnitName. */
  public static final BPsNiagaraDriverCustomRequestType QueryUnitName = new BPsNiagaraDriverCustomRequestType(QUERY_UNIT_NAME);
  /** BPsNiagaraDriverCustomRequestType constant for SetUnitName. */
  public static final BPsNiagaraDriverCustomRequestType SetUnitName = new BPsNiagaraDriverCustomRequestType(SET_UNIT_NAME);
  /** BPsNiagaraDriverCustomRequestType constant for QueryCircuitName. */
  public static final BPsNiagaraDriverCustomRequestType QueryCircuitName = new BPsNiagaraDriverCustomRequestType(QUERY_CIRCUIT_NAME);
  /** BPsNiagaraDriverCustomRequestType constant for SetCircuitName. */
  public static final BPsNiagaraDriverCustomRequestType SetCircuitName = new BPsNiagaraDriverCustomRequestType(SET_CIRCUIT_NAME);
  /** BPsNiagaraDriverCustomRequestType constant for SyncDevice. */
  public static final BPsNiagaraDriverCustomRequestType SyncDevice = new BPsNiagaraDriverCustomRequestType(SYNC_DEVICE);
  /** BPsNiagaraDriverCustomRequestType constant for CheckStatusUpdate. */
  public static final BPsNiagaraDriverCustomRequestType CheckStatusUpdate = new BPsNiagaraDriverCustomRequestType(CHECK_STATUS_UPDATE);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCustomRequestType.class);
  
  /** Factory method with ordinal. */
  public static BPsNiagaraDriverCustomRequestType make(int ordinal)
  {
    return (BPsNiagaraDriverCustomRequestType)Undefined.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BPsNiagaraDriverCustomRequestType make(String tag)
  {
    return (BPsNiagaraDriverCustomRequestType)Undefined.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BPsNiagaraDriverCustomRequestType(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BPsNiagaraDriverCustomRequestType DEFAULT = Undefined;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}