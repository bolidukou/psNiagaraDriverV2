package com.profileSystems.psNiagaraDriver.CircuitWidget;
import javax.baja.sys.*;



/**
 * A list of circuit status
 * 
 * @author    Watson Zhou
 * @creation  
 * @version   
 * @since     
 */
public final class BPsRelayOverrideEnum extends BFrozenEnum
{
/*-
  enum BPsRelayOverrideEnum
  {
    range
    {
      Auto,
      Ovrd_Off,
      Ovrd_On
    }
    
    default {[ Auto ]}
  }
-*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.CircuitWidget.BPsRelayOverrideEnum(843486011)1.0$ @*/
/* Generated Sat Dec 07 18:20:03 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */
  
  /** Ordinal value for Auto. */
  public static final int AUTO = 0;
  /** Ordinal value for Ovrd_Off. */
  public static final int OVRD_OFF = 1;
  /** Ordinal value for Ovrd_On. */
  public static final int OVRD_ON = 2;
  
  /** BPsRelayOverrideEnum constant for Auto. */
  public static final BPsRelayOverrideEnum Auto = new BPsRelayOverrideEnum(AUTO);
  /** BPsRelayOverrideEnum constant for Ovrd_Off. */
  public static final BPsRelayOverrideEnum Ovrd_Off = new BPsRelayOverrideEnum(OVRD_OFF);
  /** BPsRelayOverrideEnum constant for Ovrd_On. */
  public static final BPsRelayOverrideEnum Ovrd_On = new BPsRelayOverrideEnum(OVRD_ON);

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsRelayOverrideEnum.class);
  
  /** Factory method with ordinal. */
  public static BPsRelayOverrideEnum make(int ordinal)
  {
    return (BPsRelayOverrideEnum)Auto.getRange().get(ordinal, false);
  }
  
  /** Factory method with tag. */
  public static BPsRelayOverrideEnum make(String tag)
  {
    return (BPsRelayOverrideEnum)Auto.getRange().get(tag);
  }
  
  /** Private constructor. */
  private BPsRelayOverrideEnum(int ordinal)
  {
    super(ordinal);
  }
  
  public static final BPsRelayOverrideEnum DEFAULT = Auto;

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

}