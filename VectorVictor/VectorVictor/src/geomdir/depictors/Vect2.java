


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

import android.graphics.Color;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;
import java.net.URL;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import meta.VersionBuffer;
import verdantium.mathimage.MathImage;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.PointF;
import android.graphics.Canvas;
import android.graphics.Paint;


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
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/16/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some depictors.
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
* Depicts the vector-valued part of a multivector in the alternate sense.
* The position of the tip of the vector is defined by the vector value
* in the "_hd_" port.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Vect2 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int ManualDragVectCp = 5;
	final static int DragNone = 6;

	static transient int PortMode = 1;
	public void datCpy(Vect2 out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Vect2 temp = new Vect2();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Vect2 temp = new Vect2();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Vect2 temp = new Vect2();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Vect2 temp = (Vect2) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Vect2 temp = (Vect2) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Vect2 temp = (Vect2) in;
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
	public Meta copyUser1() {
		Vect2 temp = new Vect2();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Vect2 temp = (Vect2) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
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
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
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
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;

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

		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		Vect2 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectPtr;
				break;
			case HDPort :
				temp = ReadObj.HDHexGlo;
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
		Vect2 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case HDPort :
				temp = ReadObj.HDSelfAlloc;
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
		tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() - (getVect()).getBasis1());
		tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() - (getVect()).getBasis2());
		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		Mvec ta = new Mvec();
		Mvec tb = new Mvec();
		Mvec tc = new Mvec();
		Mvec td = Dcon.getTxtDelMvec();
		HDHexGlo.scale((BariText), ta);
		tLGetHex(Dcon).getGlo().scale(1 - BariText, tb);
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
		switch (ToolMode) {
			case DepictorPort.TranslateMode :
			case DepictorPort.SelectionMode :
			case DepictorPort.FreeTransformationMode :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(tLGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
				}
				break;
			case DepictorPort.RotationMode :
			case DepictorPort.DilationMode :
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
			case DepictorPort.AdditionMode :
				{
					if (Dcon.getRect1() == null) {
						Dcon.setRect1(new RectF());
					}
				}
				break;
		}
	}
	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		DepictorPort Win = ThePort;
		DefContext Dcon = (DefContext) PrtCon;
		Win.externArrow(g, p, this, tLGetHex(Dcon), hDGetHex(Dcon), ToolMode);

		/* g.setColor( TextColor ); */

		boolean tmp = TextVisible && getNamedVar();
		if ((!tmp) && (ToolMode == 13) && getNamedVar()) {
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
				case DepictorPort.SelectionMode :
					drawSelectionTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.LabelMode :
					drawTextTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.AdditionMode :
					drawAdditTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.FreeTransformationMode :
					{
						if ((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
						}

					}
					break;
				case DepictorPort.AssignMode :
					{
						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if (((getMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

					}
					break;
				case DepictorPort.AccessoryTransMode :
				case DepictorPort.GeoPadMode :
					{
						if ((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

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
	protected void drawEraseTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
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
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for color mode.
	*/
	protected void drawSelectionTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p, 
		int ToolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};

	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(g, p, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);

		}
	};

	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
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
	protected void drawDilateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};

	/**
	* Renders depictor tools for addition mode.
	*/
	private final void drawAdditTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		if (getNamedVar()) {
			if (g != null) {
				p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
				p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
				p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
				p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
				p.setColor(Color.BLUE);
				p.setStyle(Style.STROKE);
				MathImage img = getDepicImage();
				RectF MyRect = Dcon.getRect1();
				MyRect.set(
					temptxtGetHex(Dcon).getLoc().x,
					temptxtGetHex(Dcon).getLoc().y,
					temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
					temptxtGetHex(Dcon).getLoc().y+img.getHeight());

				g.drawRect(MyRect, p);
			}

			ThePort.paintBlueKnob(g, p, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
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
				case DepictorPort.AccessoryTransMode :
					return (checkAccControls(ThePort, Dcon, bound, LocEvent, ToolMode));
					/* break; */
				case DepictorPort.GeoPadMode :
					return (checkGeoPadControls(ThePort, Dcon, bound, LocEvent, ToolMode));
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
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;

		if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectDis);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (noSymBindings()) {
			Priority = shapeGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVecReal);
				NewRec.ClickPriority = Priority;
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
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "_hd", this };
				Object[] RHS = { "'~glo'", " \\+ 0.5 * ", " < ", this, " >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
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
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;

		Priority = shapeGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt);
		if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.ClickPriority = Priority;
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
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;

		if (TextVisible && getNamedVar()) {

			Priority =
				ThePort.defaultGravityField(InPt, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.ClickPriority = Priority;
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
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"_hd",
						this,
						" \\- ",
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
				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { "_&hd", this, " \\- ", " < ", "_&", this, " >{ 1 }" };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{
						"- UnitOf( ",
						"'~tmp_pt'",
						" \\- ",
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
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { "_hd", this };
				Object[] RHS3 = { "'~tmp_pt'", " \\+ ", this };
				Dyn.changeExpression(LHS3, RHS3);

				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
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
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { "_&hd", this, " \\- ", " < ", "_&", this, " >{ 1 }" };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "'~tmp_ve'" };
				Object[] RHS2 = { "UnitOf( ", " < ", "_&", this, " >{ 1 }", " ) " };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS3 = { this };
				Object[] RHS3 =
					{
						"'~tmp_ve'",
						" * 1.5 * ( ( ",
						"'~glo'",
						" \\- ",
						"'~tmp_pt'",
						" ) dot '~tmp_ve' ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { "_hd", this };
				Object[] RHS4 = { "'~tmp_pt'", " \\+ ", this };
				Dyn.changeExpression(LHS4, RHS4);

				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", " < ", "_&", this, " >{ 1 }", " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{
						"- '~tmp_ve'",
						" * 1.5 * ( ( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) dot '~tmp_ve' ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS2, RHS2);

				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	ClickRec checkControls(DepictorPort ThePort, DefContext Dcon, boolean bound, PointF InPt, int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", " < ", "_&", this, " >{ 1 }", " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{
						"'~tmp_ve'",
						" * 2.0 * ( ( ",
						"_hd",
						this,
						" \\- ",
						"'~glo'",
						" ) dot '~tmp_ve' ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS2, RHS2);

				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"_hd",
						this,
						" \\- ",
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
				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = shapeGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an GeoPad mode control.
	*/
	ClickRec checkGeoPadControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;
		RectF TempRect;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, hDGetVect());
				Object[] LHS = { this };
				Object[] RHS =
					{ " ( ", "_hd", this, " \\- ", "'~glo'", " ) ", " + ", " < ", "_&", this, " >{ 0 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (TextVisible && getNamedVar()) {
			MathImage img = getDepicImage();

			TempRect =
				new RectF(
					temptxtGetHex(Dcon).getLoc().x,
					temptxtGetHex(Dcon).getLoc().y,
					temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
					temptxtGetHex(Dcon).getLoc().y+img.getHeight());
			if (TempRect.contains(InPt.x, InPt.y) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectDis);
				NewRec.ClickPriority = ClickRec.MinPriority;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
					    NewRec.TransDelta ); */
				LastClick = Match;
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = shapeGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an accessory mode control.
	*/
	ClickRec checkAccControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, hDGetVect());
				Object[] LHS = { this };
				Object[] RHS =
					{ " ( ", "_hd", this, " \\- ", "'~glo'", " ) ", " + ", " < ", "_&", this, " >{ 0 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = shapeGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.Dyn = Dyn;
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

	public Vect2() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};

	/**
	* Gets the point associated with the HD port.
	*/
	public PointF hDGetPoint(DefContext Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};

	/**
	* Gets the point associated with the TL port.
	*/
	public PointF tLGetPoint(DefContext Dcon) {
		return (tLGetHex(Dcon).getLoc());
	};

	static transient Vect2 UndoNode = null;

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
		UndoNode = new Vect2();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);

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
	* Handles a single-click event that happened in a gravity field of the depictor.
	*/
	public void singleClickControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec in,
		int ToolMode) {
		if ((ToolMode == DepictorPort.GeoPadMode)) {
			APPRec MRec = (APPRec) in;

			if (MRec.getValue() == ManualDragVectDis) {
				/* EtherEvent send = new GeomKitEtherEvent( this , GeomKitEtherEvent.changeDepicLabel ,
					null , in );
				ThePort.processObjEtherEvent( send , null ); */
			}
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
		int VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case ManualDragVectPos :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				VectVal.setBasis1((getVect()).getBasis1());
				VectVal.setBasis2((getVect()).getBasis2());
				ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));
				TemptxtGlo.vsub(HDHexGlo, InVect);
				VectVal.dot(InVect, dprod);
				double MultVal = dprod.getBasis();
				double d1 = VectVal.getBasis1();
				double d2 = VectVal.getBasis2();
				double dn = d1 * d1 + d2 * d2;

				if (dn < 0.001)
					BariText = 1.0;
				else
					BariText = (MultVal / dn) + 1.0;

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
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		Object[] LHS,
		Object[] RHS,
		IntObj Active) {
		DefContext Dcon = (DefContext) PrtCon;
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

			if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {

				TempRect = ThePort.instanceRect(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { this };
					Object[] RHS1 = { "_hd", this, " \\- $" };
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
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		FlexString NewString,
		PointF OutPt) {
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {

			if (true) {
				double XDist = (hDGetPoint(Dcon)).x - InPt.x;
				double YDist = (hDGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
					CurDist.CurDist = Dist;
				}
			}

			if (true) {
				double XDist = (tLGetPoint(Dcon)).x - InPt.x;
				double YDist = (tLGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this, " \\- ", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
					CurDist.CurDist = Dist;
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
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = hDGetHex((DefContext) Std);
			Hexar ini = hDGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, HDHexGlo, std);
		}

	};

	/**
	* Checks whether the add tool is adding from this depictor.
	*/
	public void checkAdditFromControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		PointF OutPt) {
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {

			if (getNamedVar()) {
				double XDist = (temptxtGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (temptxtGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					(OutPt).set(temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
					CurDist.CurDist = Dist;
				}
			}
		}

	};

	/**
	* Checks whether the add tool is adding to this depictor.
	*/
	public boolean checkAdditToControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {
			RectF TempRect;
			MathImage img = getDepicImage();

			if (true) {

				TempRect =
					new RectF(
						temptxtGetHex(Dcon).getLoc().x,
						temptxtGetHex(Dcon).getLoc().y,
						temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
						temptxtGetHex(Dcon).getLoc().y+img.getHeight());
				if (TempRect.contains(InPt.x, InPt.y)) {
					(Active).value = 1;
				}
			}
		}

		return (false);
	};

	/**
	* Loads persistent properties.
	*/
	/* public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		BariText = MyProp.getDouble(key + ".Bari");

		String tmp = MyProp.getProperty(key + ".Offset");
		if (tmp != null)
			OffsetText = (MyProp.getDouble(key + ".Offset")) * ThePort.getCoordRad();

		tmp = MyProp.getProperty(key + ".NuOffset");
		if (tmp != null)
			OffsetText = MyProp.getDouble(key + ".NuOffset");

	}; */

	/**
	* Saves persistent properties.
	*/
	/* public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		if ((hDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_hd_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		MyProp.putDouble(key + ".Bari", BariText);

		MyProp.putDouble(key + ".NuOffset", OffsetText);

	}; */

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			/* super.readExternal(in);
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

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
			VersionBuffer.chkNul(HDSelfAlloc); */
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

		super.writeExternal(out);
		out.writeObject(myv); */
	} 

	/**
	* Gets the gravity field of the depictor shape given the vector endpoints.
	*/
	public double shapeGravityField(PointF p1, PointF p2, PointF in) {
		return (linearSegGravityField(p1, p2, in, getBasicFrontLineStrokeWidth()));
	}

	/**
	* Gets the "head and tail" of the depictor in an addition operation.
	*/
	public void getAdditiveExtents(CoordContext PrtCon, Mvec pos, Mvec tl) {
		DefContext Dcon = (DefContext) PrtCon;
		int CurSwap = 1;

		if (CurSwap == 1) {
			tLGetHex(Dcon).getGlo().copyAllInfo(pos);
			hDGetVect().copyAllInfo(tl);
		}
		else {
			hDGetVect().copyAllInfo(pos);
			tLGetHex(Dcon).getGlo().copyAllInfo(tl);
		}

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
		String[] ret = { "", "_hd" };
		return (ret);
	}

	public Hexar hDGetHex(DefContext in) {
		return (in.getHex1());
	};
	public Hexar temptxtGetHex(DefContext in) {
		return (in.getHex2());
	};
	public Hexar tLGetHex(DefContext in) {
		return (in.getHex3());
	};
	public Hexar temp1GetHex(DefContext in) {
		return (in.getHex4());
	};
	public Hexar temp2GetHex(DefContext in) {
		return (in.getHex5());
	};

	/**
	* Creates a coordinate context for the depictor.
	*/
	public CoordContext makeCoordContext() {
		return (new DefContext());
	};


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

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Vect2.class));
	}
	public double getOffsetText() {
		return (OffsetText);
	}
	public void setOffsetText(double in) {
		OffsetText = in;
	}

	protected double BariText = 0.5;
	protected double OffsetText = 0.5 * 40;

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
	protected transient Mvec TemptxtGlo = new Mvec();
};
