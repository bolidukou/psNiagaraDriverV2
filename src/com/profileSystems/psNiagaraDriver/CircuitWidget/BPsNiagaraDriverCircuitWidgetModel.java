package com.profileSystems.psNiagaraDriver.CircuitWidget;

import javax.baja.sys.Type;
import javax.baja.workbench.mgr.MgrColumn;
import javax.baja.workbench.mgr.MgrTypeInfo;
import com.tridium.ddf.ui.point.BDdfPointManager;
import com.tridium.ddf.ui.point.DdfPointModel;

public class BPsNiagaraDriverCircuitWidgetModel extends DdfPointModel {

	
	public BPsNiagaraDriverCircuitWidgetModel(BDdfPointManager manager) {
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
		    MgrTypeInfo.make(new BPsCircuitName()),
		    MgrTypeInfo.make(new BPsCircuitStatus()),
				MgrTypeInfo.make(new BPsRelay()),
				MgrTypeInfo.make(new BPsRelayActiveTime()),
				MgrTypeInfo.make(new BPsRelayOverride()),
				MgrTypeInfo.make(new BPsScheduleSelect())
				};
	}

	/**
	 * This method returns a list of what Types can be included into our model.
	 */
	public Type[] getIncludeTypes() {
		return new Type[] { 
		    BPsCircuitName.TYPE,
		    BPsCircuitStatus.TYPE,
		    BPsRelay.TYPE,
		    BPsRelayActiveTime.TYPE,
		    BPsRelayOverride.TYPE, 
		    BPsScheduleSelect.TYPE		   
		    };
	}

}
