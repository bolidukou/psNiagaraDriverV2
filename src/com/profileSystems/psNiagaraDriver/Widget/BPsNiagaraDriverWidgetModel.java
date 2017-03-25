package com.profileSystems.psNiagaraDriver.Widget;

import javax.baja.sys.Type;
import javax.baja.workbench.mgr.MgrColumn;
import javax.baja.workbench.mgr.MgrTypeInfo;
import com.tridium.ddf.ui.point.BDdfPointManager;
import com.tridium.ddf.ui.point.DdfPointModel;

public class BPsNiagaraDriverWidgetModel extends DdfPointModel {

	
	public BPsNiagaraDriverWidgetModel(BDdfPointManager manager) {
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
				MgrTypeInfo.make(new BPsACPower()),
				MgrTypeInfo.make(new BPsAlarmLL()),
				MgrTypeInfo.make(new BPsAlarmPercent()),
				MgrTypeInfo.make(new BPsBaseCtAAmps()),
				MgrTypeInfo.make(new BPsBaseCtABaseline()),
				MgrTypeInfo.make(new BPsBaseCtAWatts()),
				MgrTypeInfo.make(new BPsBaseCtBAmps()),
				MgrTypeInfo.make(new BPsBaseCtBBaseline()),
				MgrTypeInfo.make(new BPsBaseCtBWatts()),
				MgrTypeInfo.make(new BPsBaseCtCAmps()),
				MgrTypeInfo.make(new BPsBaseCtCBaseline()),
				MgrTypeInfo.make(new BPsBaseCtCWatts()),
				MgrTypeInfo.make(new BPsBaseTotalWatts()),
				MgrTypeInfo.make(new BPsFcCommand()),
				MgrTypeInfo.make(new BPsFcLevel()),
				MgrTypeInfo.make(new BPsFcOutput()),
				MgrTypeInfo.make(new BPsFcSetpoint()),
				MgrTypeInfo.make(new BPsLocalTime()),
				MgrTypeInfo.make(new BPsPanelSTPT()),
				MgrTypeInfo.make(new BPsPanelTemp()),
				MgrTypeInfo.make(new BPsPowerFactor()),
				MgrTypeInfo.make(new BPsPowerLoss()),
				MgrTypeInfo.make(new BPsSignalStrength()),
				
				MgrTypeInfo.make(new BPsSunrise()),
				MgrTypeInfo.make(new BPsSunriseOffset()),
				MgrTypeInfo.make(new BPsSunriseOffsetToday()),
				
				MgrTypeInfo.make(new BPsSunset()),
				MgrTypeInfo.make(new BPsSunsetOffset()),
				MgrTypeInfo.make(new BPsSunsetOffsetToday()),
				
				MgrTypeInfo.make(new BPsSystemFault()),
				MgrTypeInfo.make(new BPsVolts()),
				 };
	}

	/**
	 * This method returns a list of what Types can be included into our model.
	 */
	public Type[] getIncludeTypes() {
		return new Type[] { 
		    BPsACPower.TYPE,
		    BPsAlarmLL.TYPE,
		    BPsAlarmPercent.TYPE,		    
		    BPsBaseCtAAmps.TYPE,
		    BPsBaseCtABaseline.TYPE,
		    BPsBaseCtAWatts.TYPE,
		    BPsBaseCtBAmps.TYPE,
		    BPsBaseCtBBaseline.TYPE,
		    BPsBaseCtBWatts.TYPE,
		    BPsBaseCtCAmps.TYPE,
		    BPsBaseCtCBaseline.TYPE,
		    BPsBaseCtCWatts.TYPE,
		    BPsBaseTotalWatts.TYPE,
		    BPsFcCommand.TYPE,
		    BPsFcLevel.TYPE,
		    BPsFcOutput.TYPE,
		    BPsFcSetpoint.TYPE,
		    BPsLocalTime.TYPE,
		    
		    BPsPanelSTPT.TYPE,
		    BPsPanelTemp.TYPE,
		    BPsPowerFactor.TYPE,
		    BPsPowerLoss.TYPE,        
        BPsSignalStrength.TYPE,
        BPsSunrise.TYPE,
        BPsSunriseOffset.TYPE,
        BPsSunriseOffsetToday.TYPE,
        BPsSunset.TYPE,
        BPsSunsetOffset.TYPE,
        BPsSunsetOffsetToday.TYPE,
		    
        BPsSystemFault.TYPE,
        BPsVolts.TYPE,
		    };
	}

}
