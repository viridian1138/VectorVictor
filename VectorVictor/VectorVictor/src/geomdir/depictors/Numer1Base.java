


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
import java.text.NumberFormat;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import verdantium.EtherEvent;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.renderscript.Font;

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
* Depicts a numeric label that shows the value of a variable.  The spatial
* position of the label is defined bu the vector in the "_hd_" port.  The value
* of the "vector port" is depicted.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public abstract class Numer1Base<T extends Numer1Base, Q extends DefContext, R extends APPRec<Numer1Base.Numer1Evt,?,Q>> extends DrawObj<T,Q,R> implements Externalizable {
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int PrevPort = 100;

	protected static enum Numer1Evt {
		MANUAL_DRAG_VECT_POS,
		MANUAL_DRAG_VECT_DIS,
		MANUAL_DRAG_VEC_REAL,
		MANUAL_DRAG_VEC_IM,
		DRAG_NONE
	};

	private boolean Apply0 = true;
	private boolean Apply1 = true;
	private boolean Apply2 = true;
	private boolean Apply3 = true;
	NumberFormat MyForm = null;
	Paint tFont = null;

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
		(hDGetVect()).eraseAll();
		/* delete ( MyAppNode->getSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public T copyUser1() {
		T temp = makeMeta();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		return (temp);
	};
	public void copyUser1Info(T out) {
		T temp = out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, Q PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosAVec(this, hDGetVect());
		/* NumerImage = ThePort.makeDepicImage( 
			NumerTxt.exportString() , 
			TextColor , getTextPtSz( ) ); */
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
					VectGlo = MyVect;
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
		T ReadObj = (T) this;
		if (PortMode >= PrevPort)
			ReadObj = (T) UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectGlo;
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
		Mvec BoundPt = getBoundPt(bound, HDHexGlo);

		ThePort.hexloc(BoundPt, bound, HDHexGlo, hDGetHex(Dcon));
		switch (toolMode) {
			case TRANSLATE_MODE :
			case ERASURE_MODE :
			case COLOR_MODE :
			case SELECTION_MODE :
				{
					HDHexGlo.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(BoundPt, bound, temp1GetHex(Dcon));
				}
				break;
			case ROTATION_MODE :
			case DILATION_MODE :
				{
					HDHexGlo.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(BoundPt, bound, temp1GetHex(Dcon));
				}
				break;
		}

		boolean PrevAp = false;
		if (Dcon.getMyLabel() == null)
			Dcon.setMyLabel(new FlexString());
		FlexString MyStr = Dcon.getMyLabel();

		MyStr.clearString();
		MyStr.setInsertPoint(0);
		String AddStr = " + ";
		String SubStr = " - ";

		if (Apply0) {
			double val = VectGlo.getBasis();

			(new FlexString(MyForm.format(val))).insertString(MyStr);

			PrevAp = true;
		}

		if (Apply1) {
			double val = VectGlo.getBasis1();

			if (PrevAp) {
				if (val >= 0.0)
					MyStr.insertJavaString(AddStr);
				else {
					MyStr.insertJavaString(SubStr);
					val = Math.abs(val);
				}
			}

			(new FlexString(MyForm.format(val))).insertString(MyStr);

			(new FlexString(" * #1")).insertString(MyStr);

			PrevAp = true;
		}

		if (Apply2) {
			double val = VectGlo.getBasis2();

			if (PrevAp) {
				if (val >= 0.0)
					MyStr.insertJavaString(AddStr);
				else {
					MyStr.insertJavaString(SubStr);
					val = Math.abs(val);
				}
			}

			(new FlexString(MyForm.format(val))).insertString(MyStr);

			(new FlexString(" * #2")).insertString(MyStr);

			PrevAp = true;
		}

		if (Apply3) {
			double val = VectGlo.getBasis12();

			if (PrevAp) {
				if (val >= 0.0)
					MyStr.insertJavaString(AddStr);
				else {
					MyStr.insertJavaString(SubStr);
					val = Math.abs(val);
				}
			}

			(new FlexString(MyForm.format(val))).insertString(MyStr);

			(new FlexString(" * #12")).insertString(MyStr);

			PrevAp = true;
		}

		if (Enclosed) {
			if (Dcon.getRect1() == null) {
				Dcon.setRect1(new RectF());
			}
		}

	}

	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DepictorPort Win = ThePort;
		Q Dcon = PrtCon;
		p.setStyle( Style.STROKE );

		Integer c = FrontLineColor;

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			c = DefBack;
		}

		p.setColor(c);

		if (tFont == null) {
			Paint TmpFnt = Win.getDepictorFont();
			tFont = new Paint();
			tFont.setTextSize( TmpFnt.getTextSize() );
			tFont.setTypeface( TmpFnt.getTypeface() );
		}
		else if (getTextPtSz() != tFont.getTextSize()) {
			Paint TmpFnt = Win.getDepictorFont();
			tFont = new Paint();
			tFont.setTextSize( TmpFnt.getTextSize() );
			tFont.setTypeface( TmpFnt.getTypeface() );
		}
		p.setTextSize( tFont.getTextSize() );
		p.setTypeface( tFont.getTypeface() );

		if (tmp)
			(Dcon.getMyLabel()).drawString(
				g,p,
				(int) (hDGetHex(Dcon).getLoc().x + LabelTextOffsetX),
				(int) (hDGetHex(Dcon).getLoc().y + LabelTextOffsetY + 25));

		if (Enclosed) {
			FontMetrics fm = p.getFontMetrics();
			RectF MyRect = Dcon.getRect1();
			MyRect.set(
				hDGetHex(Dcon).getLoc().x + LabelTextOffsetX - 5,
				hDGetHex(Dcon).getLoc().y + LabelTextOffsetY + 25 + fm.ascent,
				hDGetHex(Dcon).getLoc().x + LabelTextOffsetX - 5 + (Dcon.getMyLabel().measureText(p)) + 10,
				hDGetHex(Dcon).getLoc().y + LabelTextOffsetY + 25 + fm.descent );

			g.drawRect(MyRect,p);
		}

		p.setColor(TextColor);

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( getVectName() ).drawString( g , hDGetHex( Dcon ).getLoc().x - 10 ,
			hDGetHex( Dcon ).getLoc().y + 10 ); */

		if (tmp)
			drawTextImage(
				g,
				getDepicImage(),
				hDGetHex(Dcon).getLoc().x + TextOffsetX,
				hDGetHex(Dcon).getLoc().y + TextOffsetY,
				TextColor);

	}
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
				case COLOR_MODE :
				case SELECTION_MODE :
					drawColorTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case LABEL_MODE :
					drawTextTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ASSIGN_MODE :
					{

						if ((((hDGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

							ThePort.paintBlueKnob(g, p, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);

						}

					}
					break;
				case FREE_TRANSFORMATION_MODE :
				case ACCESSORY_TRANS_MODE :
					{

						if (((hDGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

							ThePort.paintBlueKnob(g, p, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);

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

			ThePort.paintOrangeKnob(g, p, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);

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
	protected void drawColorTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {

		ThePort.paintBlueKnob(
			g, p,
			hDGetHex(Dcon).getLoc().x + LabelTextOffsetX - XOffset,
			hDGetHex(Dcon).getLoc().y + LabelTextOffsetY - YOffset);

		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(
				g, p,
				hDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
				hDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
		}

	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
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

		if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Numer1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (noSymBindings()) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Numer1Evt.MANUAL_DRAG_VEC_REAL);
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
				Object[] RHS = { "2.0 * '~glo'" };
				Dyn.changeExpression(LHS, RHS);
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

		Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
			/* NewRec.setValue( MANUAL_DRAG_VECT_POS ); */
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

		Priority =
			ThePort.defaultGravityField(
				InPt,
				hDGetHex(Dcon).getLoc().x + LabelTextOffsetX - XOffset,
				hDGetHex(Dcon).getLoc().y + LabelTextOffsetY - YOffset);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
			NewRec.setValue(Numer1Evt.MANUAL_DRAG_VECT_DIS);
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
			        NewRec.TransDelta ); */
			LastClick = DepictorPort.MatchResult.MATCH;
		}

		if (TextVisible && getNamedVar()) {
			Priority =
				ThePort.defaultGravityField(
					InPt,
					hDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
					hDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Numer1Evt.MANUAL_DRAG_VECT_POS);
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "_hd", this };
				Object[] RHS = { "UnitOf( ", "'~glo'", " ) ", " * magnitude( ", "_&hd", this, " ) " };
				Dyn.changeExpression(LHS, RHS);
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", "_&hd", this, " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "_hd", this };
				Object[] RHS2 = { "'~tmp_ve'", " * 2.0 * ( ( ", "'~glo'", " ) dot '~tmp_ve' ) " };
				Dyn.changeExpression(LHS2, RHS2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createMoveDyn(ThePort, "_hd");
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

		if (MyRec.getValue() == Numer1Evt.MANUAL_DRAG_VECT_DIS) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Numer1Evt.MANUAL_DRAG_VEC_REAL) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Numer1Base() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectGlo = new Mvec();
		HDHexGlo = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
		HDVectName = new FlexString();
		MyForm = NumberFormat.getInstance();
		MyForm.setMaximumFractionDigits(4);
	};

	public PointF hDGetPoint(Q in) {
		return (hDGetHex(in).getLoc());
	};

	static Numer1Base UndoNode = null;

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
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
		UndoNode.Apply0 = Apply0;
		UndoNode.Apply1 = Apply1;
		UndoNode.Apply2 = Apply2;
		UndoNode.Apply3 = Apply3;
		UndoNode.Enclosed = Enclosed;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		boolean TmpApply0 = false;
		boolean TmpApply1 = false;
		boolean TmpApply2 = false;
		boolean TmpApply3 = false;
		boolean TmpEnclosed = false;

		HDHexGlo.copyAllInfo(TmpVect);
		TmpApply0 = Apply0;
		TmpApply1 = Apply1;
		TmpApply2 = Apply2;
		TmpApply3 = Apply3;
		TmpEnclosed = Enclosed;

		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		Apply0 = UndoNode.Apply0;
		Apply1 = UndoNode.Apply1;
		Apply2 = UndoNode.Apply2;
		Apply3 = UndoNode.Apply3;
		Enclosed = UndoNode.Enclosed;

		TmpVect.copyAllInfo(UndoNode.HDHexGlo);
		UndoNode.Apply0 = TmpApply0;
		UndoNode.Apply1 = TmpApply1;
		UndoNode.Apply2 = TmpApply2;
		UndoNode.Apply3 = TmpApply3;
		UndoNode.Enclosed = TmpEnclosed;

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
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		Numer1Evt VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case MANUAL_DRAG_VECT_POS :
				{
					TextOffsetX = (int) (InPt.x - hDGetHex(Dcon).getLoc().x + XOffset);
					TextOffsetY = (int) (InPt.y - hDGetHex(Dcon).getLoc().y + YOffset);
				}
				break;

			case MANUAL_DRAG_VECT_DIS :
				{
					LabelTextOffsetX = (int) (InPt.x - hDGetHex(Dcon).getLoc().x + XOffset);
					LabelTextOffsetY = (int) (InPt.y - hDGetHex(Dcon).getLoc().y + YOffset);
				}
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

			if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {}
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

			if (true) {}

			if (true) {
				double XDist = (hDGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (hDGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
					NewString.writelnString();
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
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		/* String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		LabelTextOffsetX = MyProp.getInt(key + ".LabOffX");

		LabelTextOffsetY = MyProp.getInt(key + ".LabOffY");

		TextOffsetX = MyProp.getInt(key + ".OffX");

		TextOffsetY = MyProp.getInt(key + ".OffY");

		String tmp = null;

		tmp = MyProp.getProperty(key + ".Apply0");
		if (tmp != null)
			Apply0 = MyProp.getBoolean(key + ".Apply0");

		tmp = MyProp.getProperty(key + ".Apply1");
		if (tmp != null)
			Apply1 = MyProp.getBoolean(key + ".Apply1");

		tmp = MyProp.getProperty(key + ".Apply2");
		if (tmp != null)
			Apply2 = MyProp.getBoolean(key + ".Apply2");

		tmp = MyProp.getProperty(key + ".Apply3");
		if (tmp != null)
			Apply3 = MyProp.getBoolean(key + ".Apply3");

		tmp = MyProp.getProperty(key + ".Enclosed");
		if (tmp != null)
			Enclosed = MyProp.getBoolean(key + ".Enclosed"); */

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		/* String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		if ((hDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_hd_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		MyProp.putInt(key + ".LabOffX", LabelTextOffsetX);

		MyProp.putInt(key + ".LabOffY", LabelTextOffsetY);

		MyProp.putInt(key + ".OffX", TextOffsetX);

		MyProp.putInt(key + ".OffY", TextOffsetY);

		MyProp.putBoolean(key + ".Apply0", Apply0);

		MyProp.putBoolean(key + ".Apply1", Apply1);

		MyProp.putBoolean(key + ".Apply2", Apply2);

		MyProp.putBoolean(key + ".Apply3", Apply3);

		MyProp.putBoolean(key + ".Enclosed", Enclosed); */

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
			LabelTextOffsetX = myv.getInt("LabelTextOffsetX");
			LabelTextOffsetY = myv.getInt("LabelTextOffsetY");
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
			HDVectName = (FlexString) (myv.getProperty("HDVectName"));
			HDMovable = (IntObj) (myv.getProperty("HDMovable"));
			VersionBuffer.chkNul(HDMovable);
			HDHexGlo = (Mvec) (myv.getProperty("HDHexGlo"));
			VersionBuffer.chkNul(HDHexGlo);
			HDSelfAlloc = (IntObj) (myv.getProperty("HDSelfAlloc"));
			VersionBuffer.chkNul(HDSelfAlloc);
			MyForm = (NumberFormat) (myv.getProperty("MyForm"));
			VersionBuffer.chkNul(MyForm);
			Apply0 = myv.getBoolean("Apply0");
			Apply1 = myv.getBoolean("Apply1");
			Apply2 = myv.getBoolean("Apply2");
			Apply3 = myv.getBoolean("Apply3");
			Enclosed = myv.getBoolean("Enclosed"); */
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
		myv.setInt("LabelTextOffsetX", LabelTextOffsetX);
		myv.setInt("LabelTextOffsetY", LabelTextOffsetY);
		if (VectName != null)
			myv.setProperty("VectName", VectName);
		myv.setProperty("Movable", Movable);
		myv.setProperty("VectGlo", VectGlo);
		myv.setProperty("SelfAlloc", SelfAlloc);
		myv.setProperty("Domain", Domain);
		myv.setProperty("IODef", IODef);
		if (HDVectName != null)
			myv.setProperty("HDVectName", HDVectName);
		myv.setProperty("HDMovable", HDMovable);
		myv.setProperty("HDHexGlo", HDHexGlo);
		myv.setProperty("HDSelfAlloc", HDSelfAlloc);
		myv.setProperty("MyForm", MyForm);
		myv.setBoolean("Apply0", Apply0);
		myv.setBoolean("Apply1", Apply1);
		myv.setBoolean("Apply2", Apply2);
		myv.setBoolean("Apply3", Apply3);
		myv.setBoolean("Enclosed", Enclosed);

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
				tmp = DepictorPort.IO_DEF_OUTPUT_P2;
			else
				tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
		}

		return (tmp);
	}
	/**
	* Gets the input/output state of the port associated with the variable's value for just this depictor.
	*/
	public int vectGetEntIODef() {
		return (DepictorPort.IO_DEF_OUTPUT_P2);
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
	* Gets the domain of the current port, not counting other depictors.
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
		int tmp = 0;
		if (Apply0)
			tmp += DepictorPort.DOM_SCA;
		if (Apply1)
			tmp += DepictorPort.DOM_VECT1;
		if (Apply2)
			tmp += DepictorPort.DOM_VECT2;
		if (Apply3)
			tmp += DepictorPort.DOM_PSU;
		return (tmp);
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

//	protected VerdantiumPropertiesEditor getCustomControl(ToolPort ThePort, XKit InAp) {
//		return ((new NumerCustControl(this, ThePort, InAp)));
//	};
	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	};
	public FlexString getVectName() {
		return (VectName);
	};
	public void setVectName(FlexString in) {
		VectName = in;
	};
	public boolean getEnclosed() {
		return (Enclosed);
	}
	public void setEnclosed(boolean in) {
		Enclosed = in;
	}
	public boolean getApply0() {
		return (Apply0);
	}
	public void setApply0(boolean in) {
		Apply0 = in;
	}
	public boolean getApply1() {
		return (Apply1);
	}
	public void setApply1(boolean in) {
		Apply1 = in;
	}
	public boolean getApply2() {
		return (Apply2);
	}
	public void setApply2(boolean in) {
		Apply2 = in;
	}
	public boolean getApply3() {
		return (Apply3);
	}
	public void setApply3(boolean in) {
		Apply3 = in;
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

	public Hexar hDGetHex(Q in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(Q in) {
		return (in.getHex2());
	};

	public abstract Q makeCoordContext();
	
	public abstract R makeClickRec();
	
	public abstract T makeMeta();

	
	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Numer1Base.class));
	}

	private boolean Enclosed = false;
	int TextOffsetX = -10;
	int TextOffsetY = -20;
	int LabelTextOffsetX = -10;
	int LabelTextOffsetY = 10;
	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectGlo = new Mvec();
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
	FlexString HDVectName;
	IntObj HDMovable = new IntObj();
	Mvec HDHexGlo = new Mvec();
	IntObj HDSelfAlloc = new IntObj();

	/**
	* Custom control for the numeric label.
	*/
/*	public static class NumerCustControl extends Object implements VerdantiumPropertiesEditor {
		Numer1Base target;
		DepictorPort ThePort;
		JCheckBox Apply0Check;
		JCheckBox Apply1Check;
		JCheckBox Apply2Check;
		JCheckBox Apply3Check;
		JCheckBox EnclosedCheck;
		boolean OrigApply0;
		boolean OrigApply1;
		boolean OrigApply2;
		boolean OrigApply3;
		boolean OrigEnclosed;
		JPanel MyPan = null;

		public NumerCustControl(Numer1Base in, ToolPort port, XKit MyAp) {
			super();
			target = in;
			ThePort = port;
			MyPan = new JPanel();
			MyPan.setLayout(new VerticalLayout());
			MyPan.add("any", new JLabel("Components to Draw: "));
			JPanel pa = new JPanel();
			pa.setLayout(new FlowLayout());
			MyPan.add("any", pa);
			OrigApply0 = in.getApply0();
			OrigApply1 = in.getApply1();
			OrigApply2 = in.getApply2();
			OrigApply3 = in.getApply3();
			OrigEnclosed = in.getEnclosed();

			Apply0Check = new JCheckBox("Scalar", null, in.getApply0());
			Apply1Check = new JCheckBox("H. Vector", null, in.getApply1());
			Apply2Check = new JCheckBox("V. Vector", null, in.getApply2());
			Apply3Check = new JCheckBox("Bivector", null, in.getApply3());
			EnclosedCheck = new JCheckBox("Enclosed", null, in.getEnclosed());
			pa.add(Apply0Check);
			pa.add(Apply1Check);
			pa.add(Apply2Check);
			pa.add(Apply3Check);
			pa.add(EnclosedCheck);
			target.pushDragUndo();
		}

		public JComponent getGUI() {
			return (MyPan);
		}

		public void handleButton(String param) {
			if (true) {
				if (true) {
					if ((param.compareTo("OK") == 0) || (param.compareTo("Apply") == 0)) {

						target.setApply0(Apply0Check.getModel().isSelected());
						target.setApply1(Apply1Check.getModel().isSelected());
						target.setApply2(Apply2Check.getModel().isSelected());
						target.setApply3(Apply3Check.getModel().isSelected());
						target.setEnclosed(EnclosedCheck.getModel().isSelected());

						if (param.compareTo("OK") == 0) {}

					}

					if ((param.compareTo("Cancel") == 0)) {

						target.setApply0(OrigApply0);
						target.setApply1(OrigApply1);
						target.setApply2(OrigApply2);
						target.setApply3(OrigApply3);
						target.setEnclosed(OrigEnclosed);

					}

				}

			}

		}; */

		/**
		* Handles Ether Events.
		*/
/*		public Object processObjEtherEvent(EtherEvent in, Object refcon) {
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
