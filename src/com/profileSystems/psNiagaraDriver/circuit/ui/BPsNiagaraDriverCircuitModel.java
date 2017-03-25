package com.profileSystems.psNiagaraDriver.circuit.ui;

import javax.baja.control.*;
import javax.baja.sys.Type;
import javax.baja.workbench.mgr.MgrColumn;
import javax.baja.workbench.mgr.MgrTypeInfo;

import com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuit;
import com.tridium.ddf.ui.point.BDdfPointManager;
import com.tridium.ddf.ui.point.DdfPointModel;

public class BPsNiagaraDriverCircuitModel extends DdfPointModel {

	
	public BPsNiagaraDriverCircuitModel(BDdfPointManager manager) {
		super(manager);
	}

	/**
	 * Create the columns that we want to display in our model table. In our
	 * case, we want to use all the pre-defined columns for the PointModel, but
	 * add one additional column.
	 */
	protected MgrColumn[] makeColumns() {
		return super.makeColumns();
	}

	/**
	 * This method determines what types of components we can create in our
	 * point model. We can expand this if we want to allow additional point
	 * types.
	 */
	public MgrTypeInfo[] getNewTypes() {
		return new MgrTypeInfo[] { 
				MgrTypeInfo.make(new BPsNiagaraDriverCircuit()),
				MgrTypeInfo.make(new BBooleanPoint()),
				MgrTypeInfo.make(new BBooleanWritable()),
				MgrTypeInfo.make(new BNumericPoint()),
				MgrTypeInfo.make(new BNumericWritable()),				
				MgrTypeInfo.make(new BEnumPoint()),
				MgrTypeInfo.make(new BEnumWritable()),				
				MgrTypeInfo.make(new BStringPoint()),
				MgrTypeInfo.make(new BStringWritable())
				 };
	}

	/**
	 * This method returns a list of what Types can be included into our model.
	 */
	public Type[] getIncludeTypes() {
		return new Type[] { BPsNiagaraDriverCircuit.TYPE,BControlPoint.TYPE  };
	}

}
