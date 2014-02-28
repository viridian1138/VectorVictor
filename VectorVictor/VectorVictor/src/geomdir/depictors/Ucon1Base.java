


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
import geomdir.DrawObjEtherEvent;
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
import meta.VersionBuffer;
import verdantium.EtherEvent;
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
*    | 11/16/2000            | Thorn Green (viridian_1138@yahoo.com)           | Depictors did not take full advantage of modifications made on 11/12 | Changed depictors to use the modified evaluation system.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Unit change paradigm in depictors was not constraint-compatible.     | Changed unit-modification interface to be compatible.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/16/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some depictors.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
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
* Depictor that allows the size of the unit to be altered.
* The spatial position of the base point of the unit control
* is defined by the "_hd_" port.  The length of the unit is defined
* by the scalar value of the "_ud_" port, and the direction
* in which the depictor points is defined by the unit of the 
* "vector port".
*/
public abstract class Ucon1Base<T extends Ucon1Base, Q extends DefContext, R extends APPRec<?,Q>> extends DrawObj<T,Q,R> implements Externalizable {
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int UDPort = 3;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int ManualDragVectCp = 5;
	final static int DragNone = 6;

	static transient int PortMode = 1;

	public void datCpy(T out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public T copyNode() {
		T temp = makeMeta();
		datCpy(temp);
		return (temp);
	};
	public T copySub() {
		T temp = makeMeta();
		datCpy(temp);
		return (temp);
	};
	public T copyAll() {
		T temp = makeMeta();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(T in) {
		T temp = in;
		datCpy(temp);
	};
	public void copySubInfo(T in) {
		T temp = in;
		datCpy(temp);
	};
	public void copyAllInfo(T in) {
		T temp = in;
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
		 (hDGetVect()).eraseAll();
		/* delete ( MyAppNode->hDGetSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public T copyUser1() {
		T temp = makeMeta();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		UDGlo.copyAllInfo(temp.UDGlo);
		return (temp);
	};
	public void copyUser1Info(T out) {
		T temp = out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		UDGlo.copyAllInfo(temp.UDGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, Q PrtCon, boolean bound, boolean state) {
		if (!state)
			ThePort.setNewDeltaVec(this, getVect());
		ThePort.setNewPosAVec(this, hDGetVect());
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((uDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
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
		String HDPrefix = "_hd_";
		String UDPrefix = "_ud_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;
		if (Prefix.stcmp(UDPrefix) == 0)
			PortMode = UDPort;

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
				PortMode = HDPort;
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
			case HDPort :
				{
					HDVectName = MyVectName;
					HDMovable = MyMovable;
					HDHexGlo = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
				};
				break;
			case UDPort :
				{
					UDVectName = MyVectName;
					UDMovable = MyMovable;
					UDGlo = MyVect;
					MyDomain.value = DepictorPort.DOM_SCA;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2;
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
			case HDPort :
				temp = HDMovable;
				break;
			case UDPort :
				temp = UDMovable;
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
			case HDPort :
				{
					HDMovable = in;
				}
				break;
			case UDPort :
				{
					UDMovable = in;
				}
				break;

		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		T ReadObj = (T) this;
		if (PortMode >= PrevPort)
			ReadObj = (T) UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectPtr;
				break;
			case HDPort :
				temp = ReadObj.HDHexGlo;
				break;
			case UDPort :
				temp = ReadObj.UDGlo;
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
		T ReadObj = (T) this;
		if (PortMode >= PrevPort)
			ReadObj = (T) UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case HDPort :
				temp = ReadObj.HDSelfAlloc;
				break;
			case UDPort :
				temp = ReadObj.UDSelfAlloc;
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
	public void updateYourself(DepictorPort ThePort, Q PrtCon, boolean bound, DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		double ba1 = (getVect()).getBasis1();
		double ba2 = (getVect()).getBasis2();
		double len = Math.sqrt(ba1 * ba1 + ba2 * ba2);
		if (len < 0.001)
			len = 0.001;
		double mult = UDGlo.getBasis() / len;
		tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + (getVect()).getBasis1() * mult);
		tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + (getVect()).getBasis2() * mult);
		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		Mvec ta = new Mvec();
		Mvec tb = new Mvec();
		Mvec tc = new Mvec();
		Mvec td = Dcon.getTxtDelMvec();
		HDHexGlo.scale((1 - BariText), ta);
		tLGetHex(Dcon).getGlo().scale(BariText, tb);
		ta.vadd(tb, tc);
		double ManLen = Math.abs((getVect()).getBasis1()) + Math.abs((getVect()).getBasis2());
		if (ManLen < 0.001)
			ManLen = 0.001;
		(getVect()).scale(OffsetText / (ManLen * ThePort.getCoordRad()), td);
		double tmp = td.getBasis1();
		td.setBasis1(td.getBasis2());
		td.setBasis2(-tmp);
		tc.vadd(td, TemptxtGlo);
		ThePort.hexloc(HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));
		switch (toolMode) {
			case TRANSLATE_MODE :
			case SELECTION_MODE :
			case FREE_TRANSFORMATION_MODE :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(tLGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
				}
				break;
			case ROTATION_MODE :
			case DILATION_MODE :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					double oneT = 1.0 / 3.0;
					double twoT = 2.0 / 3.0;
					HDHexGlo.scale(twoT, t1);
					tLGetHex(Dcon).getGlo().scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					HDHexGlo.scale(oneT, t1);
					tLGetHex(Dcon).getGlo().scale(twoT, t2);
					t1.add(t2, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
				}
				break;
		}
	}
	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DepictorPort Win = ThePort;
		Q Dcon = PrtCon;
		Win.externArrow(g, p, this, hDGetHex(Dcon), tLGetHex(Dcon), toolMode);

		/* g.setColor( TextColor ); */

		boolean tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) VectName.drawString( g , (int)( x1 - DelX + DelY ) , 
			(int)( y1 - DelY - DelX ) ); */

		if (tmp)
			drawTextImageJustify(
				g,
				getDepicImage(),
				temptxtGetHex(Dcon).getLoc().x,
				temptxtGetHex(Dcon).getLoc().y,
				Dcon.getTxtDelMvec(),
				TextColor);
	};
	/**
	* Renders the depictor's control points and other tools.
	*/
	public void drawYourTools(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
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
				case FREE_TRANSFORMATION_MODE :
					{
						if (!bound) {

							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

						}

						if ((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

					}
					break;
				case ASSIGN_MODE :
					{
						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if (ThePort.getAdvancedControls()
							&& (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0)) {

							ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

					}
					break;
				case GEO_PAD_MODE :
					{
						if (!bound) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

					}
					break;
				case ACCESSORY_TRANS_MODE :
					{
						if (((getMovable()).value >= DepictorPort.MABLE_BY_ANY) && (!bound)) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

					}
					break;
			}
		}
	};
	/**
	* Renders depictor tools for erasure mode.
	*/
	protected void drawEraseTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
		}

	};
	/**
	* Renders depictor tools for translate mode.
	*/
	protected void drawTranslateTools(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for color mode.
	*/
	protected void drawSelectionTools(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(
				g, p,
				temptxtGetHex(Dcon).getLoc().x - XOffset,
				temptxtGetHex(Dcon).getLoc().y - YOffset);
		}
	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_ANY) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (!bound) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor.
	*/
	public R clickedInRegion(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case FREE_TRANSFORMATION_MODE :
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
				case ACCESSORY_TRANS_MODE :
					return (checkAccControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case GEO_PAD_MODE :
					return (checkGeoPadControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
			}
		}
		return null;
	};
	/**
	* Returns whether the user clicked in the gravity field of an erase mode control.
	*/
	R checkEraseControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;

		if (!((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (!((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(ManualDragVectDis);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (noSymBindings()) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(ManualDragVecReal);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of a translation mode control.
	*/
	R checkTransControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "_hd", this };
				Object[] RHS = { "'~glo'", " \\- 0.5 * ", "_ud", this, " * ", " UnitOf( < ", this, " >{ 1 } ) " };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("", "_&", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of a color mode control.
	*/
	R checkColorControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;

		Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
			        NewRec.TransDelta ); */
			LastClick = DepictorPort.MatchResult.MATCH;
		}
		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of an text mode control.
	*/
	R checkTextControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;

		if (TextVisible && getNamedVar()) {

			Priority =
				ThePort.defaultGravityField(InPt, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
				        NewRec.TransDelta ); */
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an rotation mode control.
	*/
	R checkRotateControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
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
				Dyn.tie("_hd", "_&hd", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { "_&hd", this, " \\+ ", "_ud", this, " * UnitOf( < ", "_&", this, " >{ 1 } )" };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{
						"- UnitOf( ",
						"'~glo'",
						" \\- ",
						"'~tmp_pt'",
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
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { "_hd", this };
				Object[] RHS3 = { "'~tmp_pt'", " \\- ", "_ud", this, " * UnitOf( < ", this, " >{ 1 } )" };
				Dyn.changeExpression(LHS3, RHS3);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an dilation mode control.
	*/
	R checkDilateControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_ANY) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				if (getUseMaintainUnit()) {
					NewRec.coordAdjust = getUseCoordAdjust();
					NewRec.setTransCoord((Q)(Dcon.copyAll()));
					HDHexGlo.copyAllInfo(hDGetHex((Q) (NewRec.getTransCoord())).getGlo());
					NewRec.setValue(ManualDragVectPos);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
				else {
					Dyn = ThePort.createDynRunner(bound, HDHexGlo);
					Object[] LHS = { "_ud", this };
					Object[] RHS =
						{
							"1.5 * magnitude( ",
							"'~glo'",
							" \\- ",
							" ( ",
							"_&hd",
							this,
							" \\+ ",
							"_&ud",
							this,
							" * UnitOf( ",
							"_&",
							this,
							" ) ) ",
							" ) " };
					Dyn.changeExpression(LHS, RHS);

					Object[] LHS2 = { "_hd", this };
					Object[] RHS2 =
						{
							"( ",
							"_&hd",
							this,
							" \\+ ",
							"_&ud",
							this,
							" * UnitOf( ",
							"_&",
							this,
							" ) ) ",
							" \\- ",
							" ( ",
							"_ud",
							this,
							" * UnitOf( ",
							"_&",
							this,
							" ) ) " };
					Dyn.changeExpression(LHS2, RHS2);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
			}
		}

		if (!bound) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				if (getUseMaintainUnit()) {
					NewRec.coordAdjust = getUseCoordAdjust();
					NewRec.setTransCoord((Q)(Dcon.copyAll()));
					NewRec.setValue(ManualDragVectDis);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
				else {
					Dyn = ThePort.createDynRunner(bound, HDHexGlo);
					Object[] LHS = { "_ud", this };
					Object[] RHS = { "1.5 * magnitude( ", "'~glo'", " \\- ", "_hd", this, " ) " };
					Dyn.changeExpression(LHS, RHS);

					Dyn.tie("_hd", "_&hd", this);
					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	R checkControls(DepictorPort ThePort, Q Dcon, boolean bound, PointF InPt, DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (!bound) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				if (getUseMaintainUnit()) {
					NewRec.coordAdjust = getUseCoordAdjust();
					NewRec.setTransCoord((Q)(Dcon.copyAll()));
					NewRec.setValue(ManualDragVectDis);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
				else {
					Dyn = ThePort.createDynRunner(bound, HDHexGlo);
					Object[] LHS = { "_ud", this };
					Object[] RHS = { "2.0 * magnitude( ", "'~glo'", " \\- ", "_hd", this, " ) " };
					Dyn.changeExpression(LHS, RHS);

					Dyn.tie("_hd", "_&hd", this);
					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
			}

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
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
				Dyn.tie("_hd", "_&hd", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an GeoPad mode control.
	*/
	R checkGeoPadControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (!bound) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				if (getUseMaintainUnit()) {
					NewRec.coordAdjust = getUseCoordAdjust();
					NewRec.setTransCoord((Q)(Dcon.copyAll()));
					NewRec.setValue(ManualDragVectDis);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
				else {
					Dyn = ThePort.createDynRunner(bound, HDHexGlo);
					Object[] LHS = { "_ud", this };
					Object[] RHS = { "magnitude( ", "'~glo'", " \\- ", "_hd", this, " ) " };
					Dyn.changeExpression(LHS, RHS);

					Dyn.tie("_hd", "_&hd", this);
					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an accessory mode control.
	*/
	R checkAccControls(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_ANY) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				if (getUseMaintainUnit()) {
					NewRec.coordAdjust = getUseCoordAdjust();
					NewRec.setTransCoord((Q)(Dcon.copyAll()));
					NewRec.setValue(ManualDragVectDis);

					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
				else {
					Dyn = ThePort.createDynRunner(bound, HDHexGlo);
					Object[] LHS = { this };
					Object[] RHS = { " ( '~glo'", " \\- ", "_hd", this, " ) + < ", "_&", this, " >{ 0 , 2 }" };
					Dyn.changeExpression(LHS, RHS);

					Object[] LHS2 = { "_ud", this };
					Object[] RHS2 = { "magnitude( ", "'~glo'", " \\- ", "_hd", this, " ) " };
					Dyn.changeExpression(LHS2, RHS2);

					Dyn.tie("_hd", "_&hd", this);
					NewRec.clickPriority = Priority;
					ret = NewRec;
					LastClick = DepictorPort.MatchResult.MATCH;
				}
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* In erase mode, associates a mouse-click location with the assignment
	* or object to be deleted.  Places the result in <code>CurString</code>.
	*/
	public void delVar(DepictorPort ThePort, R in, FlexString CurString) {
		double Delta1 = .3;
		double Delta2 = .2;

		R MyRec = in;
		if (MyRec.getValue() == ManualDragVectPos) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
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

	public Ucon1Base() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		UDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		UDMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
		UDGlo.setBasis(1.0);
	};
	public PointF hDGetPoint(Q in) {
		return (hDGetHex(in).getLoc());
	};
	public PointF tLGetPoint(Q in) {
		return (tLGetHex(in).getLoc());
	};

	static transient Ucon1Base UndoNode = null;

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
		UndoNode = makeMeta();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
		UDGlo.copyAllInfo(UndoNode.UDGlo);
		UndoNode.UseCoordAdjust = UseCoordAdjust;
		UndoNode.UseMaintainUnit = UseMaintainUnit;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();
		Mvec TmpUDVect = new Mvec();
		boolean TmpUseCoordAdjust;
		boolean TmpUseMaintainUnit;

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);
		UDGlo.copyAllInfo(TmpUDVect);
		TmpUseMaintainUnit = UseMaintainUnit;
		TmpUseCoordAdjust = UseCoordAdjust;

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.UDGlo.copyAllInfo(UDGlo);
		UseMaintainUnit = UndoNode.UseMaintainUnit;
		UseCoordAdjust = UndoNode.UseCoordAdjust;

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);
		TmpUDVect.copyAllInfo(UndoNode.UDGlo);
		UndoNode.UseMaintainUnit = TmpUseMaintainUnit;
		UndoNode.UseCoordAdjust = TmpUseCoordAdjust;

	}

	/**
	* Handles the dragging of a control point in cases when the depictor has not
	* delegated the operation to a {@link geomdir.DynRunner}.
	*/
	public void dragDisplayControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		Q Dcon = PrtCon;
		switch (toolMode) {

			case FREE_TRANSFORMATION_MODE :
				updateUnitValue(ThePort, Dcon, bound, in, InPt, 2.0);
				break;

			case ACCESSORY_TRANS_MODE :
				updateUnitValueAcTrans(ThePort, Dcon, bound, in, InPt, 1.0);
				break;

			case DILATION_MODE :
				dragDilateEvent(ThePort, Dcon, bound, in, toolMode, InPt);
				break;

			case GEO_PAD_MODE :
				updateUnitValue(ThePort, Dcon, bound, in, InPt, 1.0);
				break;

			case LABEL_MODE :
				dragTextEvent(ThePort, Dcon, bound, in, toolMode, InPt);
				break;

		}
	}

	/**
	* Handles dilation mode dragging.
	*/
	protected void dragDilateEvent(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		int VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case ManualDragVectPos :
				updateUnitValueBackDilate(ThePort, Dcon, bound, in, InPt, 1.5);
				break;

			case ManualDragVectDis :
				updateUnitValue(ThePort, Dcon, bound, in, InPt, 1.5);
				break;
		}

	}

	/**
	* Handles text mode dragging.
	*/
	protected void dragTextEvent(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		int VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case ManualDragVectPos :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				double ba1 = (getVect()).getBasis1();
				double ba2 = (getVect()).getBasis2();
				double len = Math.sqrt(ba1 * ba1 + ba2 * ba2);
				if (len < 0.001)
					len = 0.001;
				double mult = UDGlo.getBasis() / len;
				VectVal.setBasis1((getVect()).getBasis1() * mult);
				VectVal.setBasis2((getVect()).getBasis2() * mult);
				ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));
				TemptxtGlo.vsub(HDHexGlo, InVect);
				VectVal.dot(InVect, dprod);
				double MultVal = dprod.getBasis();
				double d1 = VectVal.getBasis1();
				double d2 = VectVal.getBasis2();
				double dn = d1 * d1 + d2 * d2;

				if (dn < 0.001)
					BariText = 0.0;
				else
					BariText = MultVal / dn;

				double dst1 = Math.abs(d1) + Math.abs(d2);
				double dst2 = d1 * d1 + d2 * d2;
				Mvec xz = new Mvec();
				if (dn >= 0.001)
					VectVal.scale(dst1 / dst2, xz);
				double tmp = xz.getBasis1();
				xz.setBasis1((xz.getBasis2()));
				xz.setBasis2(-tmp);
				xz.dot(InVect, dprod);
				OffsetText = dprod.getBasis() * ThePort.getCoordRad();
				if (dn < 0.001)
					OffsetText = 0.5;

				break;

		}
	}

	/**
	* Checks whether the assign tool is assigning to a control point
	* on the depictor.
	*/
	public void checkAssignToControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		Object[] LHS,
		Object[] RHS,
		IntObj Active) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {
			RectF TempRect;

			if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

				TempRect = ThePort.instanceRect(hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_hd", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if (ThePort.getAdvancedControls() && (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0)) {

				TempRect = ThePort.instanceRect(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { this };
					Object[] RHS1 = { "$ \\- ", "_hd", this };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}
		}

	};

	/**
	* Checks whether the assign tool is assigning from a control point on the depictor.
	*/
	public void checkAssignFromControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		FlexString NewString,
		PointF OutPt) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {

			if (true) {
				double XDist = (hDGetPoint(Dcon)).x - InPt.x;
				double YDist = (hDGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
					CurDist.curDist = Dist;
				}
			}

			if (true) {
				double XDist = (tLGetPoint(Dcon)).x - InPt.x;
				double YDist = (tLGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this, " \\+ ", "_ud", this, " * UnitOf( < ", this, " >{ 1 } )" };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
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
		Q Std,
		Q Initial,
		boolean bound,
		boolean ChgDelta) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = hDGetHex(Std);
			Hexar ini = hDGetHex(Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, HDHexGlo, std);
		}

	};

	/**
	* Updates the unit value, and then notified the depictor port.
	*/
	protected void updateUnitValue(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R InRec,
		PointF InPt,
		double Mult) {
		Q Dcon = PrtCon;
		Hexar HDHex = hDGetHex(Dcon);
		double d1 = HDHex.getLoc().x - InPt.x;
		double d2 = HDHex.getLoc().y - InPt.y;
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		double ulen = Mult * len / UDGlo.getBasis();

		ThePort.setCoordRad(ulen);
		handleCoordAdjust(ThePort, PrtCon, InRec.getTransCoord(), bound, false);
		ThePort.handleCoordAdjust(this, false, InRec.coordAdjust);
	}

	/**
	* Updates the unit value for an accessory operation, and then
	* notifies the depictor port.
	*/
	protected void updateUnitValueAcTrans(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R InRec,
		PointF InPt,
		double Mult) {
		Q Dcon = PrtCon;
		Hexar HDHex = hDGetHex(Dcon);
		double d1 = HDHex.getLoc().x - InPt.x;
		double d2 = HDHex.getLoc().y - InPt.y;
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		double ulen = Mult * len / UDGlo.getBasis();

		ThePort.setCoordRad(ulen);
		handleCoordAdjust(ThePort, PrtCon, InRec.getTransCoord(), bound, false);

		ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, tLGetHex(Dcon));
		tLGetHex(Dcon).getGlo().vsub(HDHexGlo, VectPtr);

		ThePort.handleCoordAdjust(this, false, InRec.coordAdjust);
	}

	/**
	* Updates the unit value for a back-dilation operation, and then
	* notifies the depictor port.
	*/
	protected void updateUnitValueBackDilate(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R InRec,
		PointF InPt,
		double Mult) {
		Q Dcon = PrtCon;
		Hexar OTLHex = tLGetHex((Q) (InRec.getTransCoord()));
		double d1 = OTLHex.getLoc().x - InPt.x;
		double d2 = OTLHex.getLoc().y - InPt.y;
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		double ulen = Mult * len / UDGlo.getBasis();

		ThePort.setCoordRad(ulen);

		Mvec vect = VectPtr;
		Mvec uvec = new Mvec();
		double ba1 = vect.getBasis1();
		double ba2 = vect.getBasis2();
		double len2 = Math.sqrt(ba1 * ba1 + ba2 * ba2);
		if (len2 < 0.001)
			len2 = 0.001;
		double mult = UDGlo.getBasis() / len2;
		vect.scale(mult, uvec);

		ThePort.hexglo(OTLHex.getLoc().x, OTLHex.getLoc().y, HDHexGlo, bound, tLGetHex(Dcon));
		tLGetHex(Dcon).getGlo().vsub(uvec, HDHexGlo);

		ThePort.handleCoordAdjust(this, false, InRec.coordAdjust);
	}

	/**
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		/* String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		ThePort.loadMvecProperties(MyProp, key + ".UDport", UDGlo);

		UnitMode = MyProp.getInt(key + ".UnitMode");

		BariText = MyProp.getDouble(key + ".Bari");

		String tmp = MyProp.getProperty(key + ".Offset");
		if (tmp != null)
			OffsetText = (MyProp.getDouble(key + ".Offset")) * ThePort.getCoordRad();

		tmp = MyProp.getProperty(key + ".NuOffset");
		if (tmp != null)
			OffsetText = MyProp.getDouble(key + ".NuOffset");

		UseCoordAdjust = MyProp.getBoolean(key + ".UseCoordAdjust");

		UseMaintainUnit = MyProp.getBoolean(key + ".UseMaintainUnit"); */

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		/* String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		ThePort.saveMvecProperties(MyProp, key + ".UDport", UDGlo);

		if ((hDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_hd_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		if ((uDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_ud_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		MyProp.putInt(key + ".UnitMode", UnitMode);

		MyProp.putDouble(key + ".Bari", BariText);

		MyProp.putDouble(key + ".NuOffset", OffsetText);

		MyProp.putBoolean(key + ".UseMaintainUnit", UseMaintainUnit);

		MyProp.putBoolean(key + ".UseCoordAdjust", UseCoordAdjust); */

	};

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			/* super.readExternal(in);
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			UnitMode = myv.getInt("UnitMode");
			BariText = myv.getDouble("BariText");
			OffsetText = myv.getDouble("OffsetText");
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
			HDVectName = (FlexString) (myv.getProperty("HDVectName"));
			HDMovable = (IntObj) (myv.getProperty("HDMovable"));
			VersionBuffer.chkNul(HDMovable);
			HDHexGlo = (Mvec) (myv.getProperty("HDHexGlo"));
			VersionBuffer.chkNul(HDHexGlo);
			HDSelfAlloc = (IntObj) (myv.getProperty("HDSelfAlloc"));
			VersionBuffer.chkNul(HDSelfAlloc);
			UDVectName = (FlexString) (myv.getProperty("UDVectName"));
			UDMovable = (IntObj) (myv.getProperty("UDMovable"));
			VersionBuffer.chkNul(UDMovable);
			UDGlo = (Mvec) (myv.getProperty("UDGlo"));
			VersionBuffer.chkNul(UDGlo);
			UDSelfAlloc = (IntObj) (myv.getProperty("UDSelfAlloc"));
			VersionBuffer.chkNul(UDSelfAlloc);
			UseCoordAdjust = myv.getBoolean("UseCoordAdjust");
			UseMaintainUnit = myv.getBoolean("UseMaintainUnit"); */
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

		myv.setInt("UnitMode", UnitMode);
		myv.setDouble("BariText", BariText);
		myv.setDouble("OffsetText", OffsetText);
		if (VectName != null)
			myv.setProperty("VectName", VectName);
		myv.setProperty("Movable", Movable);
		myv.setProperty("VectPtr", VectPtr);
		myv.setProperty("SelfAlloc", SelfAlloc);
		myv.setProperty("Domain", Domain);
		myv.setProperty("IODef", IODef);
		if (HDVectName != null)
			myv.setProperty("HDVectName", HDVectName);
		myv.setProperty("HDMovable", HDMovable);
		myv.setProperty("HDHexGlo", HDHexGlo);
		myv.setProperty("HDSelfAlloc", HDSelfAlloc);
		if (UDVectName != null)
			myv.setProperty("UDVectName", UDVectName);
		myv.setProperty("UDMovable", UDMovable);
		myv.setProperty("UDGlo", UDGlo);
		myv.setProperty("UDSelfAlloc", UDSelfAlloc);
		myv.setBoolean("UseCoordAdjust", UseCoordAdjust);
		myv.setBoolean("UseMaintainUnit", UseMaintainUnit);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

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
			super.processObjEtherEvent(in, refcon);
		return (null);
	}

	/**
	* Gets the input/output state of the current port just counting this depictor.
	*/
	public int portGetEntIODef() {
		int tmp = 0;

		if (PortMode >= PrevPort)
			tmp = DepictorPort.IO_DEF_INPUT;
		else {
			switch (PortMode) {
				case VectPort :
					tmp = DepictorPort.IO_DEF_OUTPUT_P1;
					break;

				case UDPort :
					tmp = DepictorPort.IO_DEF_OUTPUT_P2;
					break;

				default :
					tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
					break;
			}

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
	* Gets the domain of the current port taking into account all depictors.
	*/
	public int portGetExtDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (Domain.value);
		else
			return (portGetEntDomain());
	}
	/**
	* Gets the domain of the current port, not taking other depictors into account.
	*/
	public int portGetEntDomain() {
		if ((PortMode % PrevPort) == UDPort)
			return (DepictorPort.DOM_SCA);
		else
			return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
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
		String[] ret = { "", "_hd", "_ud" };
		return (ret);
	}

	public Hexar hDGetHex(Q in) {
		return (in.getHex1());
	};
	public Hexar temptxtGetHex(Q in) {
		return (in.getHex2());
	};
	public Hexar tLGetHex(Q in) {
		return (in.getHex3());
	};
	public Hexar temp1GetHex(Q in) {
		return (in.getHex4());
	};
	public Hexar temp2GetHex(Q in) {
		return (in.getHex5());
	};

	
	public abstract Q makeCoordContext();
	
	public abstract R makeClickRec();
	
	public abstract T makeMeta();

	
	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	}

	public void setEndTag() {
		BariText = 1.0;
	};
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
	private FlexString hDGetVectName() {
		return (HDVectName);
	};
	private IntObj hDGetMovable() {
		return (HDMovable);
	};
	private void hDSetMovable(IntObj in) {
		HDMovable = in;
	};
	private Mvec hDGetVect() {
		return (HDHexGlo);
	};
	private IntObj hDGetSelfAlloc() {
		return (HDSelfAlloc);
	};
	private FlexString uDGetVectName() {
		return (UDVectName);
	};
	private IntObj uDGetMovable() {
		return (UDMovable);
	};
	private void uDSetMovable(IntObj in) {
		UDMovable = in;
	};
	private Mvec uDGetVect() {
		return (UDGlo);
	};
	private IntObj uDGetSelfAlloc() {
		return (UDSelfAlloc);
	};

	public boolean getUseCoordAdjust() {
		return (UseCoordAdjust);
	}
	public void setUseCoordAdjust(boolean in) {
		UseCoordAdjust = in;
	}
	public boolean getUseMaintainUnit() {
		return (UseMaintainUnit);
	}
	public void setUseMaintainUnit(boolean in) {
		UseMaintainUnit = in;
	}

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Ucon1Base.class));
	}

	boolean UseCoordAdjust = true;
	boolean UseMaintainUnit = false;

	protected double BariText = 0.5;
	protected double OffsetText = 0.5 * 40;
	protected int UnitMode = 1;

	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectPtr;
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
	FlexString HDVectName;
	IntObj HDMovable = new IntObj();
	protected Mvec HDHexGlo = new Mvec();
	IntObj HDSelfAlloc = new IntObj();
	FlexString UDVectName;
	IntObj UDMovable = new IntObj();
	protected Mvec UDGlo = new Mvec();
	IntObj UDSelfAlloc = new IntObj();
	protected transient Mvec TemptxtGlo = new Mvec();

	/**
	* The custom control class for the depictor.
	*/
/*	public static class UconCustControl extends Object implements VerdantiumPropertiesEditor {
		boolean UseCoordAdj = false;
		boolean UseMaintainUnt = false;
		Ucon1Base target;
		JCheckBox CoordCheck;
		JCheckBox UnitCheck;
		DepictorPort ThePort;
		JPanel MyPan = null;

		public UconCustControl(Ucon1Base in, ToolPort port, XKit MyAp) {
			super();
			target = in;
			ThePort = port;
			MyPan = new JPanel();
			UseCoordAdj = in.getUseCoordAdjust();
			UseMaintainUnt = in.getUseMaintainUnit();
			MyPan.setLayout(new VerticalLayout());
			MyPan.add("any", new JLabel("Unit Vector Controls: "));
			JPanel p1 = new JPanel();
			p1.setLayout(new FlowLayout());
			CoordCheck = new JCheckBox("Coord Adjust", null, UseCoordAdj);
			p1.add(CoordCheck);
			UnitCheck = new JCheckBox("Maintain Unit", null, UseMaintainUnt);
			p1.add(UnitCheck);
			MyPan.add("any", p1);
			target.pushDragUndo();
		}

		public JComponent getGUI() {
			return (MyPan);
		}

		public void handleButton(String param) {
			if (true) {
				if (true) {
					if ((param.compareTo("OK") == 0) || (param.compareTo("Apply") == 0)) {
						target.setUseCoordAdjust(CoordCheck.getModel().isSelected());
						target.setUseMaintainUnit(UnitCheck.getModel().isSelected());

					}

					if ((param.compareTo("Cancel") == 0)) {
						target.setUseCoordAdjust(UseCoordAdj);
						target.setUseMaintainUnit(UseMaintainUnt);

					}

				}

			}

		}; */

		/**
		* Handles Ether Events.
		*/
/*		public Object processObjEtherEvent(EtherEvent in, Object refcon) {
			boolean handled = false;

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
//
//	} /* End nested class */

};
