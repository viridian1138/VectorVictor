



//$$strtCprt
/**
* Vector Victor -- Graphing Calculator Program For Android
* 
* Copyright (C) 1993-2013 Thornton Green
* 
* This program is free software; you can redistribute it and/or modify it under the terms of the GNU General Public License as
* published by the Free Software Foundation; either version 3 of the License, or (at your option) any later version.
* This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
* of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
* You should have received a copy of the GNU General Public License along with this program; if not, 
* see <http://www.gnu.org/licenses>.
* Additional permission under GNU GPL version 3 section 7
*
* If you modify this Program, or any covered work, by linking or combining it with Android 
* (or a modified version of that library), containing parts covered by the terms of the Android licenses, 
* the licensors of this Program grant you additional permission to convey the resulting work. {Corresponding Source for
* a non-source form of such a combination shall include the source code for the parts of Android used as well 
* as that of the covered work.}
* 
* If you modify this Program, or any covered work, by linking or combining it with Dexmaker 
* (or a modified version of that library), containing parts covered by the terms of Apache License 2.0, 
* the licensors of this Program grant you additional permission to convey the resulting work. {Corresponding Source for
* a non-source form of such a combination shall include the source code for the parts of Dexmaker used as well 
* as that of the covered work.}
* 
* If you modify this Program, or any covered work, by linking or combining it with JLex 
* (or a modified version of that library), containing parts covered by the terms of JLex license listed below, 
* the licensors of this Program grant you additional permission to convey the resulting work. {Corresponding Source for
* a non-source form of such a combination shall include the source code for the parts of JLex used as well 
* as that of the covered work.}
* 
* If you modify this Program, or any covered work, by linking or combining it with Java CUP 
* (or a modified version of that library), containing parts covered by the terms of Java CUP license listed below, 
* the licensors of this Program grant you additional permission to convey the resulting work. {Corresponding Source for
* a non-source form of such a combination shall include the source code for the parts of Java CUP used as well 
* as that of the covered work.}
* 
* If you modify this Program, or any covered work, by linking or combining it with TwoDScrollView 
* (or a modified version of that library), containing parts covered by the terms of Apache License 2.0, 
* the licensors of this Program grant you additional permission to convey the resulting work. {Corresponding Source for
* a non-source form of such a combination shall include the source code for the parts of TwoDScrollView used as well 
* as that of the covered work.}
*
*
* Android is available at http://android.com
*
* Dexmaker is available at https://code.google.com/p/dexmaker/
*
* JLex is available at http://freecode.com/projects/jlex
* 
* Java CUP is available at http://www2.cs.turn.edu/projects/cup/
* 
* TwoDScrollView is available at http://blog.gorges.us/2010/06/android-two-dimensional-scrollview/
*
*
* The licenses for Java CUP and JLex are listed below:
* 
* ****************************************************************************
*
* JLex COPYRIGHT NOTICE, LICENSE AND DISCLAIMER. 
*
* Copyright 1996 by Elliot Joel Berk. 
*
* Permission to use, copy, modify, and distribute this software and its documentation for any 
* purpose and without fee is hereby granted, provided that the above copyright notice appear 
* in all copies and that both the copyright notice and this permission notice and warranty 
* disclaimer appear in supporting documentation, and that the name of Elliot Joel Berk not be 
* used in advertising or publicity pertaining to distribution of the software without specific, 
* written prior permission. 
*
* Elliot Joel Berk disclaims all warranties with regard to this software, including all implied 
* warranties of merchantability and fitness. In no event shall Elliot Joel Berk be liable for 
* any special, indirect or consequential damages or any damages whatsoever resulting from loss 
* of use, data or profits, whether in an action of contract, negligence or other tortious 
* action, arising out of or in connection with the use or performance of this software. 
* 
* ********************************************************************************
*
* CUP Parser Generator Copyright Notice, License, and Disclaimer
* 
* Copyright 1996-1999 by Scott Hudson, Frank Flannery, C. Scott Ananian 
* 
* Permission to use, copy, modify, and distribute this software and its documentation for any 
* purpose and without fee is hereby granted, provided that the above copyright notice appear 
* in all copies and that both the copyright notice and this permission notice and warranty 
* disclaimer appear in supporting documentation, and that the names of the authors or their 
* employers not be used in advertising or publicity pertaining to distribution of the software 
* without specific, written prior permission. 
* 
* The authors and their employers disclaim all warranties with regard to this software, 
* including all implied warranties of merchantability and fitness. In no event shall the 
* authors or their employers be liable for any special, indirect or consequential damages or 
* any damages whatsoever resulting from loss of use, data or profits, whether in an action of 
* contract, negligence or other tortious action, arising out of or in connection with the use 
* or performance of this software.
*
* ******************************************************************************
*
*
*/
//$$endCprt




package geomdir.depictors;

import geomdir.ClickRec;
import geomdir.CoordContext;
import geomdir.DepictorPort;
import geomdir.DrawObj;
import geomdir.DynRunner;
import geomdir.Hexar;
import geomdir.IntObj;
import geomdir.Mvec;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.URL;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;

/**
*
* --- SOURCE MODIFICATION LIST ---
*
* Please document all changes to this source file here.
* Feel free to add rows if needed.
*
*
*    |-----------------------|-------------------------------------------------|----------------------------------------------------------------------|---------------------------------------------------------------...
*    | Date of Modification  |    Author of Modification                       |    Reason for Modification                                           |    Description of Modification (use multiple rows if needed)  ... 
*    |-----------------------|-------------------------------------------------|----------------------------------------------------------------------|---------------------------------------------------------------...
*    |                       |                                                 |                                                                      |
*    | 9/24/2000             | Thorn Green (viridian_1138@yahoo.com)           | Needed to provide a standard way to document source file changes.    | Added a souce modification list to the documentation so that changes to the souce could be recorded. 
*    | 10/22/2000            | Thorn Green (viridian_1138@yahoo.com)           | Methods did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some more depictors.
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 08/07/2004            | Thorn Green (viridian_1138@yahoo.com)           | Establish baseline for all changes in the last year.                 | Establish baseline for all changes in the last year.
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*    |                       |                                                 |                                                                      |
*
*
*/

/**
* Depicts a pair of dials for setting the scalar and imaginary portions of a depictor.
* The spatial position of the dials is defined by the "_md_" port of the depictor.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Twist1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int MDPort = 3;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int ManualDragMDPos = 5;
	final static int DragNone = 6;

	static transient int PortMode = 1;
	static int ArcToolRad = 20;
	public void datCpy(Twist1 out) {
		drDatCpy(out);
		/* out.MdPoint = MdPoint;
		out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Twist1 temp = new Twist1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Twist1 temp = new Twist1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Twist1 temp = new Twist1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Twist1 temp = (Twist1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Twist1 temp = (Twist1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Twist1 temp = (Twist1) in;
		datCpy(temp);
	};
	public void eraseNode() { /* delete( this ); */
	};
	public void eraseSub() { /* delete( this ); */
	};
	public void eraseAll() { /* delete( this ); */
	};
	public void eraseUser1() {
		(getVect()).eraseAll();
		/* delete ( MyAppNode->getSelfAlloc() ); */
		 (mDGetVect()).eraseAll();
		/* delete ( MyAppNode->mDGetSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public Meta copyUser1() {
		Twist1 temp = new Twist1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Twist1 temp = (Twist1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosBVec(this, mDGetVect());
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((mDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
			NoBound = true;
		}

		return (NoBound);
	};
	/**
	* Selects the port indicated by the port name passed in <code>Prefix</code>.
	*/
	public void setValuePort(FlexString Prefix) {
		PortMode = -1;
		String VectPrefix = "";
		String MDPrefix = "_md_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(MDPrefix) == 0)
			PortMode = MDPort;

		if (Prefix.stcmp(PrPrefix) == 0) {
			PortMode = PrevPort + VectPort;
		}
		if (Prefix.strlen() > 3) {
			if (Prefix.getChar(1) == '&') {
				FlexString tmp = new FlexString();
				Prefix.copyString(tmp);
				tmp.setInsertPoint(1);
				tmp.deleteSectionAfter(1);
				UndoNode.setValuePort(tmp);
				PortMode = PrevPort + PortMode;
			}
		}
	}
	/**
	* Selects the port on a semantic basis using the value in <code>DefPortVal</code>.
	* If the parameter's value is zero, selects a port associated with the position of
	* the depictor.  If the value is one, selects a port associated with the value
	* of the depictor.
	*/
	public void setValuePort(int DefPortVal) {
		switch (DefPortVal) {
			case 0 :
				PortMode = MDPort;
				break;
			case 1 :
				PortMode = VectPort;
				break;
		}
	}
	/**
	* Sets the current port's value references to point to the objects passed in the
	* method parameters.  This is used when control over a port's objects passes from the
	* depictor to some external entity (like a solving engine).
	*/
	public void portInitPtrs(FlexString MyVectName, IntObj MyMovable, Mvec MyVect, IntObj MyDomain, IntObj MyIODef) {
		switch (PortMode) {
			case VectPort :
				{
					VectName = MyVectName;
					Movable = MyMovable;
					VectPtr = MyVect;
					Domain = MyDomain;
					IODef = MyIODef;
				};
				break;
			case MDPort :
				{
					MDVectName = MyVectName;
					MDMovable = MyMovable;
					MDHexGlo = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
				};
				break;
		}
	};
	/**
	* Gets the object that holds whether the variable in the current port is movable.
	*/
	public IntObj portGetMovable() {
		IntObj temp = null;
		switch (PortMode) {
			case VectPort :
				temp = Movable;
				break;
			case MDPort :
				temp = MDMovable;
				break;
		}
		return (temp);
	};
	/**
	* Sets the object that holds whether the variable in the current port is movable.
	*/
	public void portSetMovable(IntObj in) {
		switch (PortMode) {
			case VectPort :
				{
					Movable = in;
				}
				break;
			case MDPort :
				{
					MDMovable = in;
				}
				break;
		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		Twist1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectPtr;
				break;
			case MDPort :
				temp = ReadObj.MDHexGlo;
				break;
		}
		return temp;
	};
	/**
	* Gets the object that holds whether the objects in the current port are 
	* controlled by the depictor.
	*/
	public IntObj portGetSelfAlloc() {
		IntObj temp = null;
		Twist1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case MDPort :
				temp = ReadObj.MDSelfAlloc;
				break;
		}
		return temp;
	};
	/**
	* Sets the object that holds whether the objects in the current port are
	* controlled by the depictor.
	*/
	public void vectSetSelfAlloc(IntObj in) {
		SelfAlloc = in;
	};
	/**
	* Updates the depictor for future rendering.
	*/
	public void updateYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, DepictorPort.ToolMode toolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		ThePort.hexloc(MDHexGlo, bound, MDHexGlo, mDGetHex(Dcon));
		switch (toolMode) {
			case TRANSLATE_MODE :
			case COLOR_MODE :
			case SELECTION_MODE :
				{}
				break;
			case ROTATION_MODE :
			case DILATION_MODE :
				{}
				break;
		}
	}
	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DepictorPort Win = ThePort;
		DefContext Dcon = (DefContext) PrtCon;
		drawTwistDialPhasor(Win, mDGetHex(Dcon), g, p, getVect(), toolMode, ArcToolRad);

		/* g.setColor( caller.TextColor ); */

		double xa = mDGetHex(Dcon).getPtx();
		double ya = mDGetHex(Dcon).getPty();

		boolean tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp)
			drawTextImage(g, getDepicImage(), xa + TextOffsetX, ya + TextOffsetY, TextColor);

	};
	/**
	* Renders the depictor's control points and other tools.
	*/
	public void drawYourTools(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case ERASURE_MODE :
					drawEraseTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case TRANSLATE_MODE :
					drawTranslateTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ROTATION_MODE :
					drawRotateTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case DILATION_MODE :
					drawDilateTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case SELECTION_MODE :
					drawSelectionTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case LABEL_MODE :
					drawTextTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ASSIGN_MODE :
					{

						if ((((mDGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
						}
					}
					break;
				case FREE_TRANSFORMATION_MODE :
				case ACCESSORY_TRANS_MODE :
					{

						if ((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x - 2 * ArcToolRad, mDGetPoint(Dcon).y);

							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x + 2 * ArcToolRad, mDGetPoint(Dcon).y);
						}

					}
					break;
			}
		}
	};
	/**
	* Renders depictor tools for erasure mode.
	*/
	protected void drawEraseTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x - 2 * ArcToolRad, mDGetPoint(Dcon).y);

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x + 2 * ArcToolRad, mDGetPoint(Dcon).y);
		}

		if (((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
		}

	};
	/**
	* Renders depictor tools for translate mode.
	*/
	protected void drawTranslateTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
		}
	};
	/**
	* Renders depictor tools for selection mode.
	*/
	protected void drawSelectionTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {

		ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(
				g, p,
				mDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
				mDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
		}
	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {}

	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {};
	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor.
	*/
	public ClickRec clickedInRegion(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case FREE_TRANSFORMATION_MODE :
				case ACCESSORY_TRANS_MODE :
					return (checkControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ERASURE_MODE :
					return (checkEraseControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case TRANSLATE_MODE :
					return (checkTransControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ROTATION_MODE :
					return (checkRotateControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case DILATION_MODE :
					return (checkDilateControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case COLOR_MODE :
					return (checkColorControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

				case LABEL_MODE :
					return (checkTextControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

			}
		}

		return null;
	};
	/**
	* Returns whether the user clicked in the gravity field of an erase mode control.
	*/
	ClickRec checkEraseControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x - 2 * ArcToolRad, mDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.getAngPoint().set(mDGetPoint(Dcon).x - ArcToolRad, mDGetPoint(Dcon).y);
				NewRec.setValue(ManualDragVectDis);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x + 2 * ArcToolRad, mDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.getAngPoint().set(mDGetPoint(Dcon).x + ArcToolRad, mDGetPoint(Dcon).y);
				NewRec.setValue(ManualDragVectDis);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if ((((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragMDPos);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (noSymBindings()) {
			Priority = shapeGravityField(ThePort, Dcon, InPt);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVecReal);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of a translation mode control.
	*/
	ClickRec checkTransControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, "_md");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of a color mode control.
	*/
	ClickRec checkColorControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		Priority = shapeGravityField(ThePort, Dcon, InPt);

		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragMDPos ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			LastClick = Match;
		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an text mode control.
	*/
	ClickRec checkTextControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if (TextVisible && getNamedVar()) {

			Priority =
				ThePort.defaultGravityField(
					InPt,
					mDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
					mDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				/* NewRec.setValue( ManualDragVectPos ); */
				NewRec.clickPriority = Priority;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
				        NewRec.TransDelta ); */
				LastClick = Match;
			}
		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an rotation mode control.
	*/
	ClickRec checkRotateControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an dilation mode control.
	*/
	ClickRec checkDilateControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	ClickRec checkControls(DepictorPort ThePort, DefContext Dcon, boolean bound, PointF InPt, DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x - 2 * ArcToolRad, mDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						" < ln( ",
						" VectToPhas( ",
						"'~tmpk_pt'",
						" \\- ",
						"'~loc'",
						" ) ",
						" ) >{ 2 } * '~tmpk_vl' ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_md", "_&md", this);

				Mvec tmp1 = new Mvec();
				tmp1.setBasis1(mDGetPoint(Dcon).x - ArcToolRad);
				tmp1.setBasis2(mDGetPoint(Dcon).y);

				Dyn.makeConstant("~tmpk_pt", tmp1, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				tmp1 = new Mvec();
				tmp1.setBasis12(-180.0 / (ThePort.getRealAng().value * Math.PI));

				Dyn.makeConstant("~tmpk_vl", tmp1, DepictorPort.DOM_PSU);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x + 2 * ArcToolRad, mDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						" < ln( ",
						" VectToPhas( ",
						"'~loc'",
						" \\- ",
						"'~tmpk_pt'",
						" ) ",
						" ) >{ 2 } * '~tmpk_vl' ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_md", "_&md", this);

				Mvec tmp1 = new Mvec();
				tmp1.setBasis1(mDGetPoint(Dcon).x + ArcToolRad);
				tmp1.setBasis2(mDGetPoint(Dcon).y);

				Dyn.makeConstant("~tmpk_pt", tmp1, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				tmp1 = new Mvec();
				tmp1.setBasis(-180.0 / (ThePort.getImAng().value * Math.PI));

				Dyn.makeConstant("~tmpk_vl", tmp1, DepictorPort.DOM_SCA);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = shapeGravityField(ThePort, Dcon, InPt);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, mDGetHex(Dcon), "_md", "_&md");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};
	/**
	* In erase mode, associates a mouse-click location with the assignment
	* or object to be deleted.  Places the result in <code>CurString</code>.
	*/
	public void delVar(DepictorPort ThePort, ClickRec in, FlexString CurString) {
		double Delta1 = .3;
		double Delta2 = .2;

		APPRec MyRec = (APPRec) in;

		if (MyRec.getValue() == ManualDragMDPos) {
			Object[] Form = { "_md", this };
			ThePort.insertFormattedString(Form, CurString);
			(mDGetVect()).setBasis1((mDGetVect()).getBasis1() + Delta1);
			(mDGetVect()).setBasis2((mDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == ManualDragVectDis) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
			(getVect()).setBasis1((getVect()).getBasis1() + Delta1);
			(getVect()).setBasis2((getVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == ManualDragVecReal) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Twist1() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		MDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		MDMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};
	public PointF mDGetPoint(DefContext Dcon) {
		return (mDGetHex(Dcon).getLoc());
	};

	static Twist1 UndoNode = null;

	/**
	* Frees memory associated with a potential undo operation.
	*/
	public void popOthers() {
		if (UndoNode != null) {
			UndoNode.eraseAll();
		}
		UndoNode = null;
	}
	/**
	* Allocates memory and stores information for a potential 
	* future undo of a drag operation.
	*/
	public void pushDragUndo() {
		UndoNode = new Twist1();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		MDHexGlo.copyAllInfo(UndoNode.MDHexGlo);
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpMDVect = new Mvec();

		VectPtr.copyAllInfo(TmpVect);
		MDHexGlo.copyAllInfo(TmpMDVect);

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.MDHexGlo.copyAllInfo(MDHexGlo);

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpMDVect.copyAllInfo(UndoNode.MDHexGlo);

	}

	/**
	* Handles the dragging of a control point in cases when the depictor has not
	* delegated the operation to a {@link geomdir.DynRunner}.
	*/
	public void dragDisplayControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		DefContext Dcon = (DefContext) PrtCon;
		switch (toolMode) {

			case LABEL_MODE :
				dragTextEvent(ThePort, Dcon, bound, in, toolMode, InPt);
				break;
		}
	}

	/**
	* Handles the dragging of a text tag.
	*/
	protected void dragTextEvent(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		ClickRec in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		APPRec InRec = (APPRec) in;

		TextOffsetX = (int) (InPt.x - mDGetHex(Dcon).getLoc().x + XOffset);
		TextOffsetY = (int) (InPt.y - mDGetHex(Dcon).getLoc().y + YOffset);
	}

	/**
	* Checks whether the assign tool is assigning to a control point
	* on the depictor.
	*/
	public void checkAssignToControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		Object[] LHS,
		Object[] RHS,
		IntObj Active) {
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {
			RectF TempRect;

			if ((((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

				TempRect = ThePort.instanceRect(mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_md", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {}
		}

	};

	/**
	* Checks whether the assign tool is assigning from a control point on the depictor.
	*/
	public void checkAssignFromControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		FlexString NewString,
		PointF OutPt) {
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {

			if (true) {}

			if (true) {}

			if (true) {
				double XDist = (mDGetPoint(Dcon)).x - InPt.x;
				double YDist = (mDGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_md", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
					CurDist.curDist = Dist;
				}
			}
		}

	};

	/**
	* Deals with an adjustment of the unit by a unit-control depictor.  The operation
	* warps the position of the depictor in the GCS so that the screen position of
	* the depictor is unchanged despite the change in the unit length.
	*/
	public void handleCoordAdjust(
		DepictorPort ThePort,
		CoordContext Std,
		CoordContext Initial,
		boolean bound,
		boolean ChgDelta) {
		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = mDGetHex((DefContext) Std);
			Hexar ini = mDGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, MDHexGlo, bound, MDHexGlo, std);
		}

	};

	/**
	* Loads persistent properties.
	*/
/*	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".MDport", MDHexGlo);

		TextOffsetX = MyProp.getInt(key + ".OffX");

		TextOffsetY = MyProp.getInt(key + ".OffY");

	}; */

	/**
	* Saves persistent properties.
	*/
/*	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".MDport", MDHexGlo);

		if ((mDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_md_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		MyProp.putInt(key + ".OffX", TextOffsetX);

		MyProp.putInt(key + ".OffY", TextOffsetY);

	}; */

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			/* super.readExternal(in);
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			TextOffsetX = myv.getInt("TextOffsetX");
			TextOffsetY = myv.getInt("TextOffsetY");
			VectName = (FlexString) (myv.getProperty("VectName"));
			Movable = (IntObj) (myv.getProperty("Movable"));
			VersionBuffer.chkNul(Movable);
			VectPtr = (Mvec) (myv.getProperty("VectPtr"));
			VersionBuffer.chkNul(VectPtr);
			SelfAlloc = (IntObj) (myv.getProperty("SelfAlloc"));
			VersionBuffer.chkNul(SelfAlloc);
			Domain = (IntObj) (myv.getProperty("Domain"));
			VersionBuffer.chkNul(Domain);
			IODef = (IntObj) (myv.getProperty("IODef"));
			VersionBuffer.chkNul(IODef);
			MDVectName = (FlexString) (myv.getProperty("MDVectName"));
			MDMovable = (IntObj) (myv.getProperty("MDMovable"));
			VersionBuffer.chkNul(MDMovable);
			MDHexGlo = (Mvec) (myv.getProperty("MDHexGlo"));
			VersionBuffer.chkNul(MDHexGlo);
			MDSelfAlloc = (IntObj) (myv.getProperty("MDSelfAlloc"));
			VersionBuffer.chkNul(MDSelfAlloc); */
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	}

	/**
	* Gets the gravity field from "in" to the current shape using the depictor port ThePort and the coordinate context Dcon.
	*/
	public double shapeGravityField(DepictorPort ThePort, DefContext Dcon, PointF in) {
		return (
			twistDialGravityField(ThePort, in, mDGetHex(Dcon), getVect(), ArcToolRad, getBasicBackLineStrokeWidth()));
	}

	/**
	* Writes persistent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		/* VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setInt("TextOffsetX", TextOffsetX);
		myv.setInt("TextOffsetY", TextOffsetY);
		if (VectName != null)
			myv.setProperty("VectName", VectName);
		myv.setProperty("Movable", Movable);
		myv.setProperty("VectPtr", VectPtr);
		myv.setProperty("SelfAlloc", SelfAlloc);
		myv.setProperty("Domain", Domain);
		myv.setProperty("IODef", IODef);
		if (MDVectName != null)
			myv.setProperty("MDVectName", MDVectName);
		myv.setProperty("MDMovable", MDMovable);
		myv.setProperty("MDHexGlo", MDHexGlo);
		myv.setProperty("MDSelfAlloc", MDSelfAlloc);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

	/**
	* Gets the input/output state of the current port just counting this depictor.
	*/
	public int portGetEntIODef() {
		int tmp = 0;

		if (PortMode >= PrevPort)
			tmp = DepictorPort.IO_DEF_INPUT;
		else {
			if (PortMode == VectPort)
				tmp = DepictorPort.IO_DEF_OUTPUT_P1;
			else
				tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
		}

		return (tmp);
	}
	/**
	* Gets the input/output state of the port associated with the variable's value for just this depictor.
	*/
	public int vectGetEntIODef() {
		return (DepictorPort.IO_DEF_OUTPUT_P1);
	}
	/**
	* Gets the input/output state of the current port counting all depictors.
	*/
	public int portGetExtIODef() {
		if ((PortMode) == VectPort)
			return (IODef.value);
		else
			return (portGetEntIODef());
	}
	/**
	* Gets the input/output state of the port associated with the variable's value for all depictors.
	*/
	public IntObj vectGetExtIODef() {
		return (IODef);
	}
	/**
	* Gets the domain of the current port of the depictor, not counting other depictors.
	*/
	public int portGetEntDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (vectGetEntDomain());
		else
			return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
	}
	/**
	* Gets the domain of the variable associated with the depictor, not counting other depictors.
	*/
	public int vectGetEntDomain() {
		return (DepictorPort.DOM_SCA + DepictorPort.DOM_PSU);
	}
	/**
	* Gets the domain of the current port taking into account all depictors.
	*/
	public int portGetExtDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (Domain.value);
		else
			return (portGetEntDomain());
	}
	/**
	* Gets the domain of the depictor's variable counting all depictors.
	*/
	public IntObj vectGetExtDomain() {
		return (Domain);
	}
	/**
	* Sets the object that holds the domain of the current port.
	*/
	public void vectSetExtDomain(IntObj in) {
		Domain = in;
	}
	/**
	* Gets a list of the prefix names of all ports used in constraints by this depictor.
	*/
	public String[] getPortNames() {
		String[] ret = { "", "_md" };
		return (ret);
	}

	public FlexString getVectName() {
		return (VectName);
	};
	public void setVectName(FlexString in) {
		VectName = in;
	};
	private IntObj getMovable() {
		return (Movable);
	};
	private void setMovable(IntObj in) {
		Movable = in;
	};
	private Mvec getVect() {
		return (VectPtr);
	};
	private IntObj getSelfAlloc() {
		return (SelfAlloc);
	};
	private FlexString mDGetVectName() {
		return (MDVectName);
	};
	private IntObj mDGetMovable() {
		return (MDMovable);
	};
	private void mDSetMovable(IntObj in) {
		MDMovable = in;
	};
	private Mvec mDGetVect() {
		return (MDHexGlo);
	};
	private IntObj mDGetSelfAlloc() {
		return (MDSelfAlloc);
	};

	public Hexar mDGetHex(DefContext in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(DefContext in) {
		return (in.getHex2());
	};
	public Hexar temp2GetHex(DefContext in) {
		return (in.getHex3());
	};

	public CoordContext makeCoordContext() {
		return (new DefContext());
	};


	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Twist1.class));
	}

	int TextOffsetX = 10;
	int TextOffsetY = 0;
	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectPtr;
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
	FlexString MDVectName;
	IntObj MDMovable = new IntObj();
	Mvec MDHexGlo = new Mvec();
	IntObj MDSelfAlloc = new IntObj();
};
