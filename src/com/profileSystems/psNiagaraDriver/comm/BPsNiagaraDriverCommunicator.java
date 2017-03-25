package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.*;
import com.tridium.ddf.comm.defaultComm.*;
import com.tridium.ddf.poll.BDdfPollScheduler;
import com.tridium.ddfIp.tcp.comm.*;
import com.tridium.ddfIp.tcp.comm.multipleTransaction.BDdfTcpMutCommunicator;


public class BPsNiagaraDriverCommunicator extends  BDdfTcpMutCommunicator {
	/*-
	 class BPsNiagaraDriverCommunicator
	 {
	 properties
	 {
	 receiver : BDdfReceiver
	 default{[new BPsNiagaraDriverReceiver()]}
	 
	 pollScheduler : BDdfPollScheduler
	 default{[new BPsNiagaraDriverPollScheduler()]}
	 
	 transmitter :  BDdfTcpTransmitter
	 default{[new BPsNiagaraDriverTransmitter()]}
	 
	 tcpIpComm : BDdfTcpHelper
	 default{[new BPsNiagaraDriverTcpHelper()]}
	 slotfacets{[MGR_INCLUDE]}
	 
	 unsolicitedMgr : BDdfUnsolicitedMgr
   default{[new BPsNiagaraDriverUnsolicitedMgr()]}	 
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator(3163329811)1.0$ @*/
/* Generated Mon Mar 17 22:38:39 CDT 2014 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "receiver"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>receiver</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#getReceiver
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#setReceiver
   */
  public static final Property receiver = newProperty(0, new BPsNiagaraDriverReceiver(),null);
  
  /**
   * Get the <code>receiver</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#receiver
   */
  public BDdfReceiver getReceiver() { return (BDdfReceiver)get(receiver); }
  
  /**
   * Set the <code>receiver</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#receiver
   */
  public void setReceiver(BDdfReceiver v) { set(receiver,v,null); }

////////////////////////////////////////////////////////////////
// Property "pollScheduler"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>pollScheduler</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#getPollScheduler
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#setPollScheduler
   */
  public static final Property pollScheduler = newProperty(0, new BPsNiagaraDriverPollScheduler(),null);
  
  /**
   * Get the <code>pollScheduler</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#pollScheduler
   */
  public BDdfPollScheduler getPollScheduler() { return (BDdfPollScheduler)get(pollScheduler); }
  
  /**
   * Set the <code>pollScheduler</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#pollScheduler
   */
  public void setPollScheduler(BDdfPollScheduler v) { set(pollScheduler,v,null); }

////////////////////////////////////////////////////////////////
// Property "transmitter"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>transmitter</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#getTransmitter
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#setTransmitter
   */
  public static final Property transmitter = newProperty(0, new BPsNiagaraDriverTransmitter(),null);
  
  /**
   * Get the <code>transmitter</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#transmitter
   */
  public BDdfTcpTransmitter getTransmitter() { return (BDdfTcpTransmitter)get(transmitter); }
  
  /**
   * Set the <code>transmitter</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#transmitter
   */
  public void setTransmitter(BDdfTcpTransmitter v) { set(transmitter,v,null); }

////////////////////////////////////////////////////////////////
// Property "tcpIpComm"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>tcpIpComm</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#getTcpIpComm
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#setTcpIpComm
   */
  public static final Property tcpIpComm = newProperty(0, new BPsNiagaraDriverTcpHelper(),MGR_INCLUDE);
  
  /**
   * Get the <code>tcpIpComm</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#tcpIpComm
   */
  public BDdfTcpHelper getTcpIpComm() { return (BDdfTcpHelper)get(tcpIpComm); }
  
  /**
   * Set the <code>tcpIpComm</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#tcpIpComm
   */
  public void setTcpIpComm(BDdfTcpHelper v) { set(tcpIpComm,v,null); }

////////////////////////////////////////////////////////////////
// Property "unsolicitedMgr"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>unsolicitedMgr</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#getUnsolicitedMgr
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#setUnsolicitedMgr
   */
  public static final Property unsolicitedMgr = newProperty(0, new BPsNiagaraDriverUnsolicitedMgr(),null);
  
  /**
   * Get the <code>unsolicitedMgr</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#unsolicitedMgr
   */
  public BDdfUnsolicitedMgr getUnsolicitedMgr() { return (BDdfUnsolicitedMgr)get(unsolicitedMgr); }
  
  /**
   * Set the <code>unsolicitedMgr</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator#unsolicitedMgr
   */
  public void setUnsolicitedMgr(BDdfUnsolicitedMgr v) { set(unsolicitedMgr,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCommunicator.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/
	
  public TcpSocketManager getTcpSocketManager()
  {
    return this.socketManager;
  }
}