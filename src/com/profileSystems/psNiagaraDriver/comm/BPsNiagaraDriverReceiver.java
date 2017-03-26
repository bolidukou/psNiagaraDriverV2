package com.profileSystems.psNiagaraDriver.comm;

import javax.baja.sys.*;
import com.tridium.ddf.comm.*;
import com.tridium.ddf.comm.defaultComm.BDdfReceiver;
import com.tridium.ddfIp.tcp.comm.*;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsAPIObejct;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsException;
import com.profileSystems.psNiagaraDriver.PSAPI.BPsUtility;

// if the protocol was Tcp/Ip based.
public class BPsNiagaraDriverReceiver
    extends BDdfTcpReceiver
{
  /*-
   class BPsNiagaraDriverReceiver
   {
   properties
   {
   responseTimeout:BRelTime
   default{[BRelTime.makeSeconds(14)]}
   slotfacets{[BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(0))]}
   }
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverReceiver(2006525606)1.0$ @*/
/* Generated Sat Mar 25 02:40:04 CDT 2017 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Property "responseTimeout"
////////////////////////////////////////////////////////////////
  
  /**
   * Slot for the <code>responseTimeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverReceiver#getResponseTimeout
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverReceiver#setResponseTimeout
   */
  public static final Property responseTimeout = newProperty(0, BRelTime.makeSeconds(14),BFacets.make(BFacets.make(BFacets.SHOW_MILLISECONDS,BBoolean.TRUE), BFacets.MIN,BRelTime.make(0)));
  
  /**
   * Get the <code>responseTimeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverReceiver#responseTimeout
   */
  public BRelTime getResponseTimeout() { return (BRelTime)get(responseTimeout); }
  
  /**
   * Set the <code>responseTimeout</code> property.
   * @see com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverReceiver#responseTimeout
   */
  public void setResponseTimeout(BRelTime v) { set(responseTimeout,v,null); }

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverReceiver.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

  public int isStartOfFrame(IDdfDataFrame frameSoFar)
  {

    int result = -1;

    byte[] bFrame = frameSoFar.getFrameBytes();
    int size = frameSoFar.getFrameSize();

    // can not tell until we have at least 4 bytes
    if (size < 4)
      result = BDdfReceiver.MAYBE;
    else if (BPsUtility.isStartOfFrame(bFrame))
      result = BDdfReceiver.YES;
    else
      result = BDdfReceiver.NO;

    // if (this.getDdfCommunicator().getLog().isTraceOn()) {
    // String resultString = "isStartOfFrame: " + size
    // + " - result: " + result;
    // this.getDdfCommunicator().getLog().trace(resultString);
    // }
    return result;
  }

  public boolean isCompleteFrame(IDdfDataFrame frameSoFar)
  {
    byte[] bFrame = frameSoFar.getFrameBytes();
    int size = frameSoFar.getFrameSize();

    byte[] bFrameCopy = new byte[size];
    System.arraycopy(bFrame, 0, bFrameCopy, 0, size);

    boolean isValid = BPsUtility.Validate(bFrameCopy);

    // if (this.getDdfCommunicator().getLog().isTraceOn()) {
    // String resultString = "Receiver Validate Frame: " + size
    // + " - result: " + isValid;
    // this.getDdfCommunicator().getLog().trace(resultString);
    // }

    return isValid;
  }

  public boolean checkFrame(IDdfDataFrame frameSoFar)
  {
    boolean result = isCompleteFrame(frameSoFar);

    if (this.getDdfCommunicator().getLog().isTraceOn())
    {
      if (result)
      {
        byte[] bFrame = frameSoFar.getFrameBytes();
        int size = frameSoFar.getFrameSize();

        byte[] bFrameCopy = new byte[size];
        System.arraycopy(bFrame, 0, bFrameCopy, 0, size);

        BPsAPIObejct response;
        try
        {
          response = BPsAPIObejct.Parse(bFrameCopy);
          String resultString = "Receiver checkFrame SerialNo: " + response.UnitAddress;
          resultString += " Receiver checkFrame Payload: " + response.Payload;
          for (int i = 0; i < response.Parameters.size(); i++)
          {
            resultString += " Receiver checkFrame Param" + i + ": " + response.Parameters.get(i);
          }

          // this.getDdfCommunicator().getLog().trace(resultString);

        }
        catch (BPsException e)
        {
          // TODO Auto-generated catch block
          e.printStackTrace();
          this.getDdfCommunicator().getLog().trace(e.getMessage());
        }
      }
    }

    return result;
  }

  /*
   * (non-Javadoc)
   * 
   * @see
   * com.tridium.ddf.comm.defaultComm.BDdfReceiver#computeTag(com.tridium.ddf.comm.IDdfDataFrame)
   */
  protected BSimple computeTag(IDdfDataFrame paramIDdfDataFrame)
  {
    if (isCompleteFrame(paramIDdfDataFrame) == false)
    {
      return BString.DEFAULT;
    }

    BPsAPIObejct response;
    try
    {
      response =
          BPsAPIObejct.Parse(paramIDdfDataFrame.getFrameBytes(), paramIDdfDataFrame.getFrameSize());
    }
    catch (BPsException e1)
    {
      // TODO Auto-generated catch block
      e1.printStackTrace();
      throw new IllegalStateException(e1.getMessage());
    }

    String tag;
    try
    {
      if (response.Payload.endsWith("-Success"))
      {
        tag = response.UnitAddress + response.Payload.substring(0, response.Payload.length() - 8);
      }
      else
      {
        tag = response.UnitAddress + response.Payload;
      }
    }
    catch (Exception ex)
    {
      return BString.DEFAULT;
    }

    // this.getDdfCommunicator().getLog().trace("A{" + tag+"}");
    return BString.make(tag);
  }
}