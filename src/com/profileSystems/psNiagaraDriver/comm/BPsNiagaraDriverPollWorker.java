package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.BBoolean;
import javax.baja.sys.BComponent;
import javax.baja.sys.BFacets;
import javax.baja.sys.BRelTime;
import javax.baja.sys.Clock;
import javax.baja.sys.Property;
import javax.baja.sys.Sys;
import javax.baja.sys.Type;

import com.profileSystems.psNiagaraDriver.BPsNiagaraDriverGatewayNetwork;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;

// if the protocol was Tcp/Ip based.
public class BPsNiagaraDriverPollWorker 
extends BComponent
implements Runnable
{
	/*-
	 class BPsNiagaraDriverPollScheduler
	 {
	 properties
	 {
	 pollWorkerEnabled :  BBoolean   
   default {[BBoolean.TRUE]}
   
	 pollFrequency : BRelTime
	 default{[BRelTime.makeMinutes(10)]}
	 
	 psCommunicator : BPsNiagaraDriverCommunicator  
   default{[ new BPsNiagaraDriverCommunicator() ]}
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker(2397430869)1.0$ @*/
/* Generated Sun Mar 26 04:07:32 CDT 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "pollWorkerEnabled"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pollWorkerEnabled</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#getPollWorkerEnabled
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#setPollWorkerEnabled
   */
  public static final Property pollWorkerEnabled = newProperty(0, ((BBoolean)(BBoolean.TRUE)).getBoolean(),null);
  
  /**
   * Get the <code>pollWorkerEnabled</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#pollWorkerEnabled
   */
  public boolean getPollWorkerEnabled() { return getBoolean(pollWorkerEnabled); }
  
  /**
   * Set the <code>pollWorkerEnabled</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#pollWorkerEnabled
   */
  public void setPollWorkerEnabled(boolean v) { setBoolean(pollWorkerEnabled,v,null); }

////////////////////////////////////////////////////////////////
// Property "pollFrequency"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pollFrequency</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#getPollFrequency
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#setPollFrequency
   */
  public static final Property pollFrequency = newProperty(0, BRelTime.makeMinutes(10),null);
  
  /**
   * Get the <code>pollFrequency</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#pollFrequency
   */
  public BRelTime getPollFrequency() { return (BRelTime)get(pollFrequency); }
  
  /**
   * Set the <code>pollFrequency</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#pollFrequency
   */
  public void setPollFrequency(BRelTime v) { set(pollFrequency,v,null); }

////////////////////////////////////////////////////////////////
// Property "psCommunicator"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>psCommunicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#getPsCommunicator
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#setPsCommunicator
   */
  public static final Property psCommunicator = newProperty(0, new BPsNiagaraDriverCommunicator(),null);
  
  /**
   * Get the <code>psCommunicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#psCommunicator
   */
  public BPsNiagaraDriverCommunicator getPsCommunicator() { return (BPsNiagaraDriverCommunicator)get(psCommunicator); }
  
  /**
   * Set the <code>psCommunicator</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverPollWorker#psCommunicator
   */
  public void setPsCommunicator(BPsNiagaraDriverCommunicator v) { set(psCommunicator,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverPollWorker.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
  
  boolean isAlive;
  Thread thread;
  
  public void started()
  {
    if (Sys.isStationStarted()) {
      startThread();
    }
  }
  
  public void stationStarted()
    throws Exception
  {
    super.stationStarted();
    startThread();
  }
  
  public void stopped()
  {
    stopThread();
  }
  
  public void startThread(){
    if (Sys.isStationStarted()) {     
      this.isAlive = true;
      this.thread = new Thread(this, "Ps Poll Worker:" + getParent().getName());
      this.thread.start();
    }
  }
  
  public void stopThread(){
    this.isAlive = false;
    if (this.thread != null) {
      this.thread.interrupt();
    }
  }
    
  public void run()
  {
    // TODO Auto-generated method stub
    long lastTick = Clock.ticks() + 10000L;
    while (this.isAlive) {
      try
      {
        if (!getPollWorkerEnabled())
        {
          Thread.sleep(1000L);
        }
        else
        {
          long  timeLapsed = Clock.ticks() - lastTick;
        
         if(timeLapsed >= this.getPollFrequency().getMillis() && this.getPollFrequency().getMillis()>=1000L)
         {
           //do work here
           
           if(this.getParent() instanceof BPsNiagaraDriverGatewayNetwork ){
             ((BPsNiagaraDriverGatewayNetwork)this.getParent()).doPollAll();
           }
           lastTick = Clock.ticks();
         }else{
           Thread.sleep(1000L);
         }
        }
      }
      catch (InterruptedException localInterruptedException) {}catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
      }
  }
  }
}