package com.profileSystems.psNiagaraDriver.circuit.ui;


import javax.baja.control.*;
import javax.baja.driver.point.BPointDeviceExt;
import javax.baja.gx.BImage;
import javax.baja.sys.*;
import javax.baja.workbench.mgr.*;

import com.profileSystems.psNiagaraDriver.circuit.BPsNiagaraDriverCircuitProxyExt;
import com.tridium.ddf.ui.point.BDdfPointManager;

/**
 * The Point Manager handles adding, editing, and discovering points under
 * the {@link BPointDeviceExt} for a device.
 *
 * @author J. Spangler
 * @creation Mar 7, 2013
 *
 */
public class BPsNiagaraDriverCircuitManager
    extends BDdfPointManager
{
  /*-
   class BPsNiagaraDriverCircuitManager
   {
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.circuit.ui.BPsNiagaraDriverCircuitManager(3699817629)1.0$ @*/
/* Generated Sun Jul 07 11:39:35 CDT 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverCircuitManager.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	// ///////////////////////////////////////////////////////////////
	// Support
	// ///////////////////////////////////////////////////////////////
	protected MgrModel makeModel() {
		return new BPsNiagaraDriverCircuitModel(this);
	}

	// ///////////////////////////////////////////////////////////////
	// Attributes
	// ///////////////////////////////////////////////////////////////

	MgrColumn pointId = new MgrColumn.PropPath(new Property[] {
			BControlPoint.proxyExt, BPsNiagaraDriverCircuitProxyExt.pointId },
			MgrColumn.EDITABLE);

	static BImage numericIcon = BImage
			.make("module://icons/x16/control/numericPoint.png");
	static BImage booleanIcon = BImage
			.make("module://icons/x16/control/booleanPoint.png");
	static BImage stringIcon = BImage
			.make("module://icons/x16/control/stringPoint.png");
	static BImage enumIcon = BImage
			.make("module://icons/x16/control/enumPoint.png");

}
