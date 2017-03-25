package com.profileSystems.psNiagaraDriver;

import javax.baja.sys.BComplex;
import javax.baja.sys.Sys;

import com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitDeviceExt;
import com.profileSystems.psNiagaraDriver.comm.BPsNiagaraDriverCommunicator;
import com.profileSystems.psNiagaraDriver.device.BPsNiagaraDriverDevice;

public final class BPsNiagaraDriverUtil {
	public static BPsNiagaraDriverGatewayNetwork findDdfNetwork(
			BComplex paramBComplex) {
		if (paramBComplex == null)
			return null;
		if ((paramBComplex instanceof BPsNiagaraDriverGatewayNetwork)) {
			return (BPsNiagaraDriverGatewayNetwork) paramBComplex;
		}
		return findDdfNetwork(paramBComplex.getParent());
	}

	public static BPsNiagaraDriverDevice findDdfDevice(BComplex paramBComplex) {
		if (paramBComplex == null)
			return null;
		if ((paramBComplex instanceof BPsNiagaraDriverDevice)) {
			return (BPsNiagaraDriverDevice) paramBComplex;
		}
		return findDdfDevice(paramBComplex.getParent());
	}

	public static BPsNiagaraDriverCircuitDeviceExt findDdfPointDeviceExt(
			BComplex paramBComplex) {
		if (paramBComplex == null)
			return null;
		if ((paramBComplex instanceof BPsNiagaraDriverCircuitDeviceExt)) {
			return (BPsNiagaraDriverCircuitDeviceExt) paramBComplex;
		}
		return findDdfPointDeviceExt(paramBComplex.getParent());
	}

	public static void trace(BComplex paramBComplex, String traceMessage) {
		BPsNiagaraDriverGatewayNetwork network = findDdfNetwork(paramBComplex);
		if (network == null)
			return;

		BPsNiagaraDriverCommunicator comm = (BPsNiagaraDriverCommunicator) network
				.getCommunicator();
		if (comm.getLog().isTraceOn()) {
			comm.getLog().trace(traceMessage);
		}
	}

	public static String GetModuleName() {
		return BPsNiagaraDriverGatewayNetwork.TYPE.getModule().getModuleName();
	}

	public static String GetModuleVersion() {
		return Sys
				.getRegistry()
				.getModule(
						BPsNiagaraDriverGatewayNetwork.TYPE.getModule()
								.getModuleName()).getVendorVersion().toString();
	}

	public static String GetModuleNameAndVersion() {
		return "{" + GetModuleName() + " - " + GetModuleVersion() + "}";
	}
}
