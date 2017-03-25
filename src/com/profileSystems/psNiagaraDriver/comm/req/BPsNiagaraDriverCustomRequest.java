package com.profileSystems.psNiagaraDriver.comm.req;



import javax.baja.control.BControlPoint;
import javax.baja.log.Log;
import javax.baja.sys.*;
import javax.baja.util.Array;
import com.tridium.ddf.comm.req.*;
import com.tridium.ddf.comm.rsp.*;
import com.tridium.ddf.comm.*;
import com.profileSystems.psNiagaraDriver.PSAPI.*;
import com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit;
import com.profileSystems.psNiagaraDriver.comm.identify.BPsNiagaraDriverCustomRequestType;
import com.profileSystems.psNiagaraDriver.comm.rsp.*;
import com.profileSystems.psNiagaraDriver.device.*;
import com.profileSystems.psNiagaraDriver.device.Location.BPsNiagaraDriverDeviceLocationState;


public class BPsNiagaraDriverCustomRequest extends BDdfRequest implements BIDdfCustomRequest{
	/*-
	 class BPsNiagaraDriverCustomRequest
	 {
	 
	 properties
	 {
	 }
	 }
	 -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.comm.req.BPsNiagaraDriverCustomRequest(3566036753)1.0$ @*/
/* Generated Sun Jul 07 16:48:10 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCustomRequest.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	BPsNiagaraDriverDevice m_device;
	BPsNiagaraDriverCircuit m_circuit;
	BPsNiagaraDriverCustomRequestType m_action = BPsNiagaraDriverCustomRequestType.Undefined;
	Array m_parameters = new Array();

	BPsAPIObejct m_response;

	public BPsNiagaraDriverCustomRequest() {
		super();
	}

	public BPsNiagaraDriverCustomRequest(BPsNiagaraDriverDevice device,
			BPsNiagaraDriverCustomRequestType action, Array params) {
		super();

		m_device = device;
		m_action = action;
		m_parameters = params;
	}
	
	
	public BSimple getTag()
  {
	  BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) m_device.getDeviceId();
	  String tag = deviceId.getSerialNo() + m_action.getTag();    
	  //m_device.trace("Q{" + tag + "}");
    return BString.make(tag);    
  }
	
	public byte[] toByteArray() {

		BPsNiagaraDriverDeviceId deviceId = (BPsNiagaraDriverDeviceId) m_device.getDeviceId();
		BPsAPIObejct apiObejct = new BPsAPIObejct();
		apiObejct.UnitAddress = deviceId.getSerialNo();
		apiObejct.Payload = m_action.getTag();
		apiObejct.Parameters = m_parameters == null ? new Array()
				: m_parameters;

		try {
			return apiObejct.ToByteArray();
		} catch (BPsException e) {
			e.printStackTrace();
			return null;
		}
	}

	public BIDdfResponse processReceive(IDdfDataFrame recieveFrame)
			throws DdfResponseException {

		if (m_device == null) {
			m_device = GetDevice();
		}

		try {
			m_response = BPsAPIObejct.Parse(recieveFrame.getFrameBytes(),
					recieveFrame.getFrameSize());
//			m_device.trace("BPsNiagaraDriverCustomRequest:processReceive - "
//					+ m_response.toString());

		} catch (BPsException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			throw new IllegalStateException(e1.getMessage());
		}

		try {
			if (m_response.Payload.endsWith("-Success")) {
				String aa = m_response.Payload.substring(0,m_response.Payload.length() - 8);
				m_device.trace(aa);
				BPsNiagaraDriverCustomRequestType returntype = BPsNiagaraDriverCustomRequestType.make(aa);
				m_action = returntype;
			}
			
		} catch (Exception ex) {
		  throw new DdfResponseException("Invalid custom response"+m_response.Payload);
		}
		m_device.trace(m_action.getTag() + ":" + m_response.toString());

		// Undefined,
		// QueryUnitStatus,
		// QueryUnitLocation,
		// QueryCircuitSchedule,
		// SetUnitTime,
		// SetCircuitSchedule,
		// SetCircuitInstantStatus,
		// SetUnitLocation
//		 QueryUnitName,
//	      SetUnitName,
//	      QueryCircuitName,
//	      SetCircuitName
		//syncDevice
		//CheckStatusUpdate

		if (m_action == BPsNiagaraDriverCustomRequestType.SyncDevice) {

			if(m_response.Parameters.size()>=9)
			{
				m_device.setDeviceName(
						m_response.Parameters.get(0).toString());				
				m_device.setACPower(
						m_response.Parameters.get(1).toString());
				
				int sig = Integer.parseInt(m_response.Parameters.get(2).toString());
				m_device.setSignalStrength(sig);
				
				m_device.getLocation().getCountyState().setCounty(
						m_response.Parameters.get(3).toString());
				m_device.getLocation().getCountyState().setState(
						BPsNiagaraDriverDeviceLocationState.make(
								m_response.Parameters.get(4).toString()));
				
				m_device.getLocation().setLatitude(
						m_response.Parameters.get(5).toString());
				m_device.getLocation().setLongitude(
						m_response.Parameters.get(6).toString());
				m_device.getLocation().setTimeZone(
						m_response.Parameters.get(7).toString());
				m_device.getLocation().setFollowsDST(
						m_response.Parameters.get(8).toString());
			}			
		} 
		else if (m_action == BPsNiagaraDriverCustomRequestType.QueryUnitStatus) {

			if (m_response.Parameters.size() >= 9) {
				int sig = Integer.parseInt(m_response.Parameters.get(8)
						.toString());
				m_device.setSignalStrength(sig);
			}

		} else if (m_action == BPsNiagaraDriverCustomRequestType.QueryUnitLocation) {

			if (m_response.Parameters.size() >= 4) {
				m_device.getLocation().setLatitude(
						m_response.Parameters.get(0).toString());
				m_device.getLocation().setLongitude(
						m_response.Parameters.get(1).toString());
				m_device.getLocation().setTimeZone(
						m_response.Parameters.get(2).toString());
				m_device.getLocation().setFollowsDST(
						m_response.Parameters.get(3).toString());
			}

			// support county and state?
			if (m_response.Parameters.size() >= 6) {
				m_device.getLocation().getCountyState()
						.setCounty(m_response.Parameters.get(4).toString());

				m_device.getLocation()
						.getCountyState()
						.setState(
								BPsNiagaraDriverDeviceLocationState
										.make(m_response.Parameters.get(5)
												.toString()));
			}

		} else if (m_action == BPsNiagaraDriverCustomRequestType.QueryCircuitSchedule) {

			if (m_circuit != null) {
				m_circuit.getPendingCommand().setValue("");

				if (m_response.Parameters.size() >= 5) {
					m_circuit.getSchedule().setValue(
							m_response.Parameters.get(3).toString() + " To "
									+ m_response.Parameters.get(4).toString());
				}
			}
		} else if (m_action == BPsNiagaraDriverCustomRequestType.SetUnitTime) {

		} else if (m_action == BPsNiagaraDriverCustomRequestType.SetCircuitInstantStatus) {
			if (m_circuit != null) {
				m_circuit.getPendingCommand().setValue("");
				//m_device.doQueryStatus();
			}
		} else if (m_action == BPsNiagaraDriverCustomRequestType.SetCircuitSchedule) {
			if (m_circuit != null) {
				m_circuit.getPendingCommand().setValue("");
				m_circuit.doQuerySchedule();
			}
		} else if (m_action == BPsNiagaraDriverCustomRequestType.SetUnitLocation) {
			m_device.doQueryLocation();
		}
		else if (m_action == BPsNiagaraDriverCustomRequestType.QueryUnitName) {
			if (m_response.Parameters.size() >= 0) {
				m_device.setDeviceName(m_response.Parameters.get(0).toString());
			}
		}
		else if (m_action == BPsNiagaraDriverCustomRequestType.SetUnitName) {
			m_device.doQueryName();
		}
		else if (m_action == BPsNiagaraDriverCustomRequestType.QueryCircuitName) {
			if (m_circuit != null && m_response.Parameters.size() >= 0) {
				m_circuit.setCircuitName(m_response.Parameters.get(0).toString());
			}
		}
		else if (m_action == BPsNiagaraDriverCustomRequestType.SetCircuitName) {
			if (m_circuit != null) {
				m_circuit.getPendingCommand().setValue("");
				m_circuit.doQueryName();
			}
		}
    else if (m_action == BPsNiagaraDriverCustomRequestType.CheckStatusUpdate)
    {
      // echo or read
      if (m_response.Parameters.size() >= 6)
      {
        int attempt = Integer.parseInt(m_response.Parameters.get(0).toString());
        String lastFrameReceived = m_response.Parameters.get(1).toString();
        String maxRetry = m_response.Parameters.get(2).toString();
        String expireTime = m_response.Parameters.get(3).toString();
        boolean read =   BBoolean.decode(m_response.Parameters.get(4).toString().toLowerCase());
        boolean retry =  BBoolean.decode(m_response.Parameters.get(5).toString().toLowerCase());
        
        Log log = m_device.getDdfCommunicator().getLog();
        log.trace("receivedCheckUnitStatus");
        log.trace("Attempt-" + attempt);
        log.trace("lastFrameReceived-" + lastFrameReceived);
        log.trace("maxRetry-" + maxRetry);
        log.trace("expireTime-" + expireTime);
        log.trace("shouldRead-" + read);
        log.trace("shouldRetry-" + retry);
        
        if (read)
        {
          // poll
          m_device.doRead();

          // BDdfPollGroup group =BPsNiagaraDriverPollGroup.getPollGroupByPollable(proxyExt );
          // group.makePollRequest();
        }
        else if (retry)
        {
          // increase attempt # and echo
          // attempt = attempt + 1;
          m_device.doCheckUnitStatus(attempt, lastFrameReceived, maxRetry, expireTime);
        }
      }
    }
		// success, unit is online
		return new BPsNiagaraDriverCustomResponse();
	}

	public void processErrorResponse(DdfResponseException arg0) {
		// TODO Auto-generated method stub

	}

	public void processLateResponse(BIDdfResponse arg0) {
		// TODO Auto-generated method stub

	}

	public void processResponse(BIDdfResponse arg0) {

//		boolean succeed = m_response != null;
//
//		if (m_device == null) {
//			m_device = GetDevice();
//		}

	}

	public void processTimeout() {
		// TODO Auto-generated method stub

	}

	public BPsNiagaraDriverDevice GetDevice() {
		return (BPsNiagaraDriverDevice) getDeviceId().getParentComponent();
	}

	public BPsNiagaraDriverCircuit GetCircuit() {
		return m_circuit;
	}

	public void SetCircuit(BPsNiagaraDriverCircuit circuit) {
		m_circuit = circuit;
	}
}
