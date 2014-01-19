



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
import geomdir.ToolPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.URL;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.utils.VTextProperties;
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
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 01/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | Animation depictor required upgraded custom control support.         | Changed custom controls to support new interface.
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
* Depicts a label.
* The vector port of the depictor defines the position of the label.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Label1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int DragNone = 6;

	static transient int PortMode = 1;
	public void datCpy(Label1 out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Label1 temp = new Label1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Label1 temp = new Label1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Label1 temp = new Label1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Label1 temp = (Label1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Label1 temp = (Label1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Label1 temp = (Label1) in;
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
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public Meta copyUser1() {
		Label1 temp = new Label1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Label1 temp = (Label1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosAVec(this, getVect());
		try {
			LabelImage = ThePort.makeDepicMathImage(LabelTxt.exportString(), TextColor, getTextPtSz(), true);
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException(ex));
		}
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
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
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;

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
				PortMode = VectPort;
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
					VectGlo = MyVect;
					Domain = MyDomain;
					IODef = MyIODef;
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
		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		Label1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectGlo;
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
		Label1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
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
	public void updateYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		ThePort.hexloc(VectGlo, bound, VectGlo, vectGetHex(Dcon));
		switch (ToolMode) {
			case DepictorPort.TranslateMode :
			case DepictorPort.ErasureMode :
			case DepictorPort.ColorMode :
			case DepictorPort.SelectionMode :
				{
					VectGlo.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(VectGlo, bound, temp1GetHex(Dcon));
				}
				break;
			case DepictorPort.RotationMode :
			case DepictorPort.DilationMode :
				{
					VectGlo.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(VectGlo, bound, temp1GetHex(Dcon));
				}
				break;
		}
	}
	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;

		Integer c = FrontLineColor;

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (ToolMode == 13)) {
			tmp = true;
			c = DefBack;
		}

		if (tmp)
			ThePort.paintColorKnob(g, p, c, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);

		/* g.setColor( TextColor ); */

		tmp = TextVisible;
		if ((!tmp) && (ToolMode == 13)) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( getVectName() ).drawString( g , vectGetHex( Dcon ).getLoc().x - 10 ,
			vectGetHex( Dcon ).getLoc().y + 10 ); */

		if (tmp)
			drawTextImage(
				g,
				LabelImage,
				vectGetHex(Dcon).getLoc().x + TextOffsetX,
				vectGetHex(Dcon).getLoc().y + TextOffsetY,
				TextColor);

	}
	/**
	* Renders the depictor's control points and other tools.
	*/
	public void drawYourTools(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		if ((ControlsVisible) || (ToolMode == DepictorPort.ColorMode)) {
			switch (ToolMode) {
				case DepictorPort.ErasureMode :
					drawEraseTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.TranslateMode :
					drawTranslateTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.RotationMode :
					drawRotateTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.DilationMode :
					drawDilateTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.ColorMode :
				case DepictorPort.SelectionMode :
					drawColorTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.LabelMode :
					drawTextTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.AssignMode :
					{

						if ((((getMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

							ThePort.paintBlueKnob(g, p, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);

						}

					}
					break;
				case DepictorPort.FreeTransformationMode :
				case DepictorPort.AccessoryTransMode :
					{

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

							ThePort.paintBlueKnob(g, p, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);

						}

					}
					break;
			}
		}
	};
	/**
	* Renders depictor tools for erasure mode.
	*/
	protected void drawEraseTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);

		}

		if (noSymBindings()) {
			ThePort.paintOrangeKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
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
		int ToolMode) {
		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for color mode.
	*/
	protected void drawColorTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		ThePort.paintBlueKnob(
			g, p,
			vectGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
			vectGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);

	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}
	};

	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor.
	*/
	public ClickRec clickedInRegion(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF LocEvent,
		int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		if ((ControlsVisible) || (ToolMode == DepictorPort.ColorMode)) {
			switch (ToolMode) {
				case DepictorPort.FreeTransformationMode :
				case DepictorPort.AccessoryTransMode :
					return (checkControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.ErasureMode :
					return (checkEraseControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.TranslateMode :
					return (checkTransControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.RotationMode :
					return (checkRotateControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.DilationMode :
					return (checkDilateControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.ColorMode :
					return (checkColorControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.LabelMode :
					return (checkTextControls(ThePort, Dcon, bound, LocEvent, ToolMode));
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectDis);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (noSymBindings()) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS = { " ( ", "2.0 * '~glo'", " ) ", " + ", " < ", "_&", this, " >{ 0 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
			        NewRec.TransDelta ); */
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		Priority =
			ThePort.defaultGravityField(
				InPt,
				vectGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
				vectGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
			        NewRec.TransDelta ); */
			LastClick = Match;
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"'~glo'",
						" ) ",
						" * magnitude( ",
						" < ",
						"_&",
						this,
						" >{ 1 }",
						" ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", " < ", "_&", this, " >{ 1 }", " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{
						"'~tmp_ve'",
						" * 2.0 * ( ( ",
						"'~glo'",
						" ) dot '~tmp_ve' ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS2, RHS2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	ClickRec checkControls(DepictorPort ThePort, DefContext Dcon, boolean bound, PointF InPt, int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, null);
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

	public Label1() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectGlo = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};

	static Label1 UndoNode = null;

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
		UndoNode = new Label1();
		VectGlo.copyAllInfo(UndoNode.VectGlo);
		UndoNode.LabelTxt = LabelTxt;
		UndoNode.LabelImage = LabelImage;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		FlexString TmpLabelTxt;
		MathImage TmpLabelImage;

		VectGlo.copyAllInfo(TmpVect);
		TmpLabelTxt = LabelTxt;
		TmpLabelImage = LabelImage;

		UndoNode.VectGlo.copyAllInfo(VectGlo);
		LabelTxt = UndoNode.LabelTxt;
		LabelImage = UndoNode.LabelImage;

		TmpVect.copyAllInfo(UndoNode.VectGlo);
		UndoNode.LabelTxt = TmpLabelTxt;
		UndoNode.LabelImage = TmpLabelImage;

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
		int ToolMode,
		PointF InPt) {
		DefContext Dcon = (DefContext) PrtCon;
		switch (ToolMode) {

			case DepictorPort.LabelMode :
				dragTextEvent(ThePort, Dcon, bound, in, ToolMode, InPt);
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
		int ToolMode,
		PointF InPt) {
		APPRec InRec = (APPRec) in;

		TextOffsetX = (int) (InPt.x - vectGetHex(Dcon).getLoc().x + XOffset);
		TextOffsetY = (int) (InPt.y - vectGetHex(Dcon).getLoc().y + YOffset);
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

			if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

				TempRect = ThePort.instanceRect(vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { this };
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

			if (true) {
				double XDist = (vectGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (vectGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { " < ", this, " >{ 1 }" };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
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
		if (((getMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = vectGetHex((DefContext) Std);
			Hexar ini = vectGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, VectGlo, bound, VectGlo, std);
		}

	};

	/**
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		/* String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		TextOffsetX = MyProp.getInt(key + ".OffX");

		TextOffsetY = MyProp.getInt(key + ".OffY");

		LabelTxt = new FlexString(MyProp.getPropertyNonNull(key + ".Label"));

		try {
			LabelImage = ThePort.makeDepicMathImage(LabelTxt.exportString(), TextColor, getTextPtSz(), true);
		}
		catch (Exception ex) {
			throw (new DataFormatException(ex));
		} */

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		/* String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		MyProp.putInt(key + ".OffX", TextOffsetX);

		MyProp.putInt(key + ".OffY", TextOffsetY);

		MyProp.put(key + ".Label", LabelTxt.exportString()); */

	};

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
			VectGlo = (Mvec) (myv.getProperty("VectGlo"));
			VersionBuffer.chkNul(VectGlo);
			SelfAlloc = (IntObj) (myv.getProperty("SelfAlloc"));
			VersionBuffer.chkNul(SelfAlloc);
			Domain = (IntObj) (myv.getProperty("Domain"));
			VersionBuffer.chkNul(Domain);
			IODef = (IntObj) (myv.getProperty("IODef"));
			VersionBuffer.chkNul(IODef);
			LabelTxt = (FlexString) (myv.getProperty("LabelTxt"));
			VersionBuffer.chkNul(LabelTxt); */
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
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
		myv.setProperty("VectGlo", VectGlo);
		myv.setProperty("SelfAlloc", SelfAlloc);
		myv.setProperty("Domain", Domain);
		myv.setProperty("IODef", IODef);
		myv.setProperty("LabelTxt", LabelTxt);

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
				tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
			else
				tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
		}

		return (tmp);
	}
	/**
	* Gets the input/output state of the port associated with the variable's value for just this depictor.
	*/
	public int vectGetEntIODef() {
		return (DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE);
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
	* Gets the domain of the current port taking into account all depictors.
	*/
	public int portGetExtDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (Domain.value);
		else
			return (portGetEntDomain());
	}
	/**
	* Gets the input/output state of the port associated with the variable's value for all depictors.
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
		String[] ret = { "" };
		return (ret);
	}

	public void updateCreatedImages(DepictorPort ThePort) throws MathImageParseException {
		LabelImage = ThePort.makeDepicMathImage(LabelTxt.exportString(), TextColor, getTextPtSz(), true);
	};

	/**
	* Handles Ether Events.
	*/
	public Object processObjEtherEvent(EtherEvent in, Object refcon) {
		boolean handled = false;

		/* if (in instanceof DrawObjEtherEvent) {
			if (in.getEtherID().equals(DrawObjEtherEvent.getCustomControl)) {
				Object[] param = (Object[]) (in.getParameter());
				ToolPort ThePort = (ToolPort) (param[0]);
				XKit InAp = (XKit) (param[1]);
				handled = true;
				return (getCustomControl(ThePort, InAp));
			}

			if (in.getEtherID().equals(DrawObjEtherEvent.undoCustomControl)) {
				ToolPort ThePort = (ToolPort) (in.getParameter());
				undoCustomControl(ThePort);
				handled = true;
			}
		} */

		if (!handled)
			return (super.processObjEtherEvent(in, refcon));
		return (null);
	}

	/* protected VerdantiumPropertiesEditor getCustomControl(ToolPort ThePort, XKit InAp) {
		return ((new LabelCustControl(this, ThePort, InAp)));
	}; */
	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	};
	public FlexString getVectName() {
		return (VectName);
	};
	public void setVectName(FlexString in) {
		VectName = in;
	};
	public FlexString getLabelTxt() {
		return (LabelTxt);
	}
	public void setLabelTxt(FlexString in) {
		LabelTxt = in;
	}
	public MathImage getLabelImage() {
		return (LabelImage);
	}
	public void setLabelImage(MathImage in) {
		LabelImage = in;
	}
	private IntObj getMovable() {
		return (Movable);
	};
	private void setMovable(IntObj in) {
		Movable = in;
	};
	private Mvec getVect() {
		return (VectGlo);
	};
	private IntObj getSelfAlloc() {
		return (SelfAlloc);
	};

	public Hexar vectGetHex(DefContext in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(DefContext in) {
		return (in.getHex2());
	};

	public CoordContext makeCoordContext() {
		return (new DefContext());
	};

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Label1.class));
	}

	public static boolean getSelfNaming() {
		return (true);
	}

	int TextOffsetX = -10;
	int TextOffsetY = 10;
	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectGlo = new Mvec();
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
	private FlexString LabelTxt = new FlexString("Label");
	private transient MathImage LabelImage = null;

	/**
	* Custom control for the label depictor.
	*/
/*	public static class LabelCustControl extends Object implements VerdantiumPropertiesEditor {
		private geomdir.VarEditPanel text = null;
		private Label1 target;
		private DepictorPort ThePort;
		private FlexString OrigString;
		private SymbolUsePropertyEditor MySym = null;
		private JPanel MyPan = null;
		private JCheckBox BoldBox = new JCheckBox("Boldface");
		private JCheckBox UprightBox = new JCheckBox("Upright");

		public LabelCustControl(Label1 in, ToolPort port, XKit MyAp) {
			super();
			target = in;
			ThePort = port;
			MyPan = new JPanel();
			text = new geomdir.VarEditPanel(MyAp, true);
			MyPan.setLayout(new VerticalLayout(true));
			MyPan.add("any", new JLabel("Label Text: "));
			MySym = new SymbolUsePropertyEditor(text, port, MyAp);
			MyPan.add("stretch", text.getView());

			JPanel p1 = new JPanel();
			p1.setLayout(new FlowLayout());
			p1.add(BoldBox);
			p1.add(UprightBox);
			MyPan.add("any", p1);

			MyPan.add("any", MySym.getGUI());
			try {
				text.setInitialSymbol(in.getLabelTxt().exportString());
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}
			OrigString = in.getLabelTxt();
			target.pushDragUndo();

			ItemListener evt3 = geomdir.Adapters.createGItemListener(this, "handleCheckboxEvent");
			BoldBox.addItemListener(evt3);
			UprightBox.addItemListener(evt3);
		}

		public JComponent getGUI() {
			return (MyPan);
		}

		public void handleCheckboxEvent(ItemEvent e) {
			text.setCurrentModes(BoldBox.getModel().isSelected(), UprightBox.getModel().isSelected(), false);
			try {
				text.rebuildEquation();
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}
		}

		public void handleButton(String param) throws MathImageParseException {
			String str = "";
			FlexString htm = text.buildEqnString(geomdir.VarEditPanel.NonCursorMode);
			boolean Empty = text.getEmptyFlag();
			if (!Empty)
				str = htm.exportString();

			if (true) {
				if (true) {
					if ((param.compareTo("OK") == 0) || (param.compareTo("Apply") == 0)) {
						target.setLabelTxt(new FlexString(str));

						target.setLabelImage(
							ThePort.makeDepicMathImage(str, target.getTextColor(), target.getTextPtSz(), true));

						if (param.compareTo("OK") == 0)
							MySym.handleDestroy();

					}

					if ((param.compareTo("Cancel") == 0)) {
						target.setLabelTxt(OrigString);

						target.setLabelImage(
							ThePort.makeDepicMathImage(
								OrigString.exportString(),
								target.getTextColor(),
								target.getTextPtSz(),
								true));

						MySym.handleDestroy();

					}

				}

			}

		}; */

		/**
		* Handles Ether Events.
		*/
/*		public Object processObjEtherEvent(EtherEvent in, Object refcon) throws Throwable {
			if (in instanceof DrawObjEtherEvent) {
				if (in.getEtherID().equals(DrawObjEtherEvent.handleDialogButton)) {
					String param = (String) (in.getParameter());
					handleButton(param);
				}
			}
			return (null);
		} */

		/**
		* Handles the destruction of the component.
		*/
//		public void handleDestroy() {}
		/**
		* Gets the input data flavors supported.  None are supported in this class.
		*/
//		public static DataFlavor[] getPersistentInputDataFlavorsSupported() {
//			return (null);
//		}
		/**
		* Gets the output data flavors supported.  None are supported in this class.
		*/
//		public DataFlavor[] getPersistentOutputDataFlavorsSupported() {
//			return (null);
//		}
		/**
		* Interface to load persistent data.  Does nothing.
		*/
//		public void loadPersistentData(DataFlavor flavor, Transferable trans) {}
		/**
		* Interface to save persistent data.  Does nothing.
		*/
//		public Transferable savePersistentData(DataFlavor flavor) {
//			return (null);
//		}

//	} /* End nested class */

};
