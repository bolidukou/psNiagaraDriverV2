package com.profileSystems.psNiagaraDriver.Widget;


import javax.baja.control.*;
import javax.baja.driver.point.BPointDeviceExt;
import javax.baja.gx.BImage;
import javax.baja.sys.*;
import javax.baja.workbench.mgr.*;
import com.tridium.ddf.ui.point.BDdfPointManager;

/**
 * The Point Manager handles adding, editing, and discovering points under
 * the {@link BPointDeviceExt} for a device.
 *
 * @author J. Spangler
 * @creation Mar 7, 2013
 *
 */
public class BPsNiagaraDriverWidgetManager
    extends BDdfPointManager
{
  /*-
   class BPsNiagaraDriverWidgetManager
   { 
   }
   -*/
/*+ ------------ BEGIN BAJA AUTO GENERATED CODE ------------ +*/
/*@ $com.profileSystems.psNiagaraDriver.Widget.BPsNiagaraDriverWidgetManager(3022466036)1.0$ @*/
/* Generated Sat Nov 16 17:51:49 CST 2013 by Slot-o-Matic 2000 (c) Tridium, Inc. 2000 */

////////////////////////////////////////////////////////////////
// Type
////////////////////////////////////////////////////////////////
  
  public Type getType() { return TYPE; }
  public static final Type TYPE = Sys.loadType(BPsNiagaraDriverWidgetManager.class);

/*+ ------------ END BAJA AUTO GENERATED CODE -------------- +*/

	// ///////////////////////////////////////////////////////////////
	// Support
	// ///////////////////////////////////////////////////////////////
	protected MgrModel makeModel() {
		return new BPsNiagaraDriverWidgetModel(this);
	}

	// ///////////////////////////////////////////////////////////////
	// Attributes
	// ///////////////////////////////////////////////////////////////

	MgrColumn pointId = new MgrColumn.PropPath(new Property[] {
			BControlPoint.proxyExt, 
			BPsNiagaraDriverWidgetProxyExt.pointId },
			MgrColumn.EDITABLE
			);

	static BImage numericIcon = BImage
			.make("module://icons/x16/control/numericPoint.png");
	static BImage booleanIcon = BImage
			.make("module://icons/x16/control/booleanPoint.png");
	static BImage stringIcon = BImage
			.make("module://icons/x16/control/stringPoint.png");
	static BImage enumIcon = BImage
			.make("module://icons/x16/control/enumPoint.png");

}
