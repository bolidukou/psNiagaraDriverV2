package com.profileSystems.psNiagaraDriver.PSAPI;

/**
 * @author wzhou APIException Class
 */

public class BPsException extends javax.baja.sys.BajaException {
	
	public BPsException() {
		super();
	}

	public BPsException(String message) {
		super(message);
	}

	public String getError() {
		return super.getMessage();
	}

	public BPsException(Throwable paramThrowable) {
		super(paramThrowable);
	}

	public BPsException(String paramString, Throwable paramThrowable) {
		super(paramString, paramThrowable);
	}
}
