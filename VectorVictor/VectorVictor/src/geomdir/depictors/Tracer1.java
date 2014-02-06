


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
import meta.HighLevelList;
import meta.*;
import meta.VersionBuffer;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
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
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 08/03/2004            | Thorn Green (viridian_1138@yahoo.com)           | Eclipse doesn't like TracerContext being strictly in Tracer1.        | Moved TracerContext to a separate class.
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
* Depicts a trace.
* The position of the trace point is defined by the "vector port" of
* the depictor.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Tracer1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int ManualDragVectCp = 5;
	final static int DragNone = 6;

	static transient int PortMode = 1;
	public void datCpy(Tracer1 out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Tracer1 temp = new Tracer1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Tracer1 temp = new Tracer1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Tracer1 temp = new Tracer1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Tracer1 temp = (Tracer1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Tracer1 temp = (Tracer1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Tracer1 temp = (Tracer1) in;
		datCpy(temp);
	};
	public void eraseNode() {
		PointList.eraseAllInfo(); /* delete( this ); */
	};
	public void eraseSub() {
		PointList.eraseAllInfo(); /* delete( this ); */
	};
	public void eraseAll() {
		PointList.eraseAllInfo(); /* delete( this ); */
	};
	public void eraseUser1() {
		(getVect()).eraseAll();
		PointList.eraseAllInfo();
		/* delete ( MyAppNode->getSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public Meta copyUser1() {
		Tracer1 temp = new Tracer1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		PointList.copyAllInfo(temp.PointList);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Tracer1 temp = (Tracer1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		temp.PointList.eraseAllInfo();
		PointList.copyAllInfo(temp.PointList);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/

	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosAVec(this, getVect());
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
		Tracer1 ReadObj = this;
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
		Tracer1 ReadObj = this;
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
		TracerContext Dcon = (TracerContext) PrtCon;
		ThePort.hexloc(VectGlo, bound, VectGlo, vectGetHex(Dcon));
		temp2GetHex(Dcon).getLoc().x = vectGetHex(Dcon).getLoc().x + 10;
		temp2GetHex(Dcon).getLoc().y = vectGetHex(Dcon).getLoc().y - 10;

		Hexar MyHex = tempCalcGetHex(Dcon);

		boolean skip = false;
		if (!TraceOn)
			skip = true;

		if (!(PointList.empty())) {
			PointList.searchHead();
			PointList.left();

			Mvec tmp = (Mvec) (PointList.getNode());
			if ((Math.abs(tmp.getBasis1() - VectGlo.getBasis1()) < 0.001)
				&& (Math.abs(tmp.getBasis2() - VectGlo.getBasis2()) < 0.001)) {
				skip = true;
			}
		}

		if (!skip) {
			Mvec MyMvec = new Mvec();
			VectGlo.copyAllInfo(MyMvec);
			PointList.insertRight(MyMvec);
			PointList.setCopyMode(Meta.COPY_ALL);
			PointList.setEraseMode(Meta.ERASE_ALL);
		}

		if (Dcon.getPath1() == null) {
			Dcon.setPath1(new Path());
		}

		Path MyPath = Dcon.getPath1();
		MyPath.reset();

		if (!(PointList.empty())) {
			boolean Done = false;
			PointList.searchHead();

			while (!Done) {
				Mvec MyVec = (Mvec) (PointList.getNode());
				MyHex.setGlo(MyVec);
				ThePort.hexloc(VectGlo, bound, MyHex);
				double x = MyHex.getLoc().x;
				double y = MyHex.getLoc().y;
				MyPath.moveTo((float) (x - 1), (float) (y - 1));
				MyPath.lineTo((float) (x + 1), (float) (y - 1));
				MyPath.lineTo((float) (x + 1), (float) (y + 1));
				MyPath.lineTo((float) (x - 1), (float) (y + 1));
				MyPath.close();

				PointList.right();
				Done = PointList.getHead();
			}
		}

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
		TracerContext Dcon = (TracerContext) PrtCon;
		p.setStyle( Style.STROKE );

		Integer c = FrontLineColor;

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (ToolMode == 13)) {
			tmp = true;
			c = DefBack;
		}

		if (tmp) {
			p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
			p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
			p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
			p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
			p.setColor(c);

			Path MyPath = Dcon.getPath1();
			g.drawPath(MyPath, p);

			if (!TraceOn && (ToolMode != DepictorPort.GeoPadMode))
				ThePort.paintColorKnob(g, p, c, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
		}

		/* g.setColor( TextColor ); */

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (ToolMode == 13) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( getVectName() ).drawString( g , vectGetHex( Dcon ).getLoc().x - 10 ,
			vectGetHex( Dcon ).getLoc().y + 10 ); */

		if (tmp)
			drawTextImage(
				g,
				getDepicImage(),
				vectGetHex(Dcon).getLoc().x + TextOffsetX,
				vectGetHex(Dcon).getLoc().y + TextOffsetY,
				TextColor);

	}
	/**
	* Renders the depictor's control points and other tools.
	*/
	public void drawYourTools(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		TracerContext Dcon = (TracerContext) PrtCon;
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
				case DepictorPort.FreeTransformationMode :
				case DepictorPort.AccessoryTransMode :
					{

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

							ThePort.paintBlueKnob(g, p, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);

						}

						ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
					}
					break;
				case DepictorPort.AssignMode :
					{

						if ((((getMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {

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
	protected void drawEraseTools(
		DepictorPort ThePort,
		TracerContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

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
		TracerContext Dcon,
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
	protected void drawColorTools(
		DepictorPort ThePort,
		TracerContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};

	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, TracerContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(
				g, p,
				vectGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
				vectGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
		}
	};

	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(
		DepictorPort ThePort,
		TracerContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(
		DepictorPort ThePort,
		TracerContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {

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
		TracerContext Dcon = (TracerContext) PrtCon;
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
		TracerContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
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
		TracerContext Dcon,
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
		TracerContext Dcon,
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
		TracerContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		if (TextVisible && getNamedVar()) {

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
		}

		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of an rotation mode control.
	*/
	ClickRec checkRotateControls(
		DepictorPort ThePort,
		TracerContext Dcon,
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
		TracerContext Dcon,
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
	ClickRec checkControls(
		DepictorPort ThePort,
		TracerContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
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

		if ((LastClick == NoMatch) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectCp);
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

	public Tracer1() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectGlo = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};

	static Tracer1 UndoNode = null;

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
		UndoNode = new Tracer1();
		VectGlo.copyAllInfo(UndoNode.VectGlo);
		UndoNode.PointList.eraseAllInfo();
		PointList.copyAllInfo(UndoNode.PointList);
		UndoNode.TraceOn = TraceOn;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		HighLevelList<StdLowLevelList<Mvec>,Mvec> TmpList = new HighLevelList<StdLowLevelList<Mvec>,Mvec>();
		boolean TmpTraceOn;

		VectGlo.copyAllInfo(TmpVect);
		PointList.copyAllInfo(TmpList);
		TmpTraceOn = TraceOn;

		UndoNode.VectGlo.copyAllInfo(VectGlo);
		PointList.eraseAllInfo();
		UndoNode.PointList.copyAllInfo(PointList);
		TraceOn = UndoNode.TraceOn;

		TmpVect.copyAllInfo(UndoNode.VectGlo);
		UndoNode.PointList.eraseAllInfo();
		TmpList.copyAllInfo(UndoNode.PointList);
		UndoNode.TraceOn = TmpTraceOn;

		/* --- */

		TmpList.eraseAllInfo();
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
		if ((ToolMode == DepictorPort.FreeTransformationMode) || (ToolMode == DepictorPort.AccessoryTransMode)) {
			APPRec MRec = (APPRec) in;

			if ((MRec.getValue() == ManualDragVectCp)) {
				if (TraceOn) {
					TraceOn = false;
				}
				else {
					PointList.eraseAllInfo();
					TraceOn = true;
				}
			}
		}

	}

	/**
	* Sets whether the trace is enabled.
	*/
	public void setTraceOn(boolean in) {
		TraceOn = in;
	}

	/**
	* Clears the trace.
	*/
	public void clearTrace() {
		PointList.eraseAllInfo();
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
		TracerContext Dcon = (TracerContext) PrtCon;
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
		TracerContext Dcon,
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
		TracerContext Dcon = (TracerContext) PrtCon;
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
		TracerContext Dcon = (TracerContext) PrtCon;
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
			Hexar std = vectGetHex((TracerContext) Std);
			Hexar ini = vectGetHex((TracerContext) Initial);
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

		TraceOn = MyProp.getBoolean(key + ".TraceOn");

		int count = 0;
		int TraceNum = MyProp.getInt(key + ".TraceNum");

		for (count = 0; count < TraceNum; count++) {
			String TrKey = key + ".TracePt_" + (new Integer(count)).toString();

			Mvec MyMvec = new Mvec();
			ThePort.loadMvecProperties(MyProp, TrKey, MyMvec);

			PointList.insertRight(MyMvec);
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

		MyProp.putBoolean(key + ".TraceOn", TraceOn);

		int TraceNum = 0;

		if (!(PointList.empty())) {
			boolean Done = false;
			PointList.searchHead();

			while (!Done) {
				Mvec MyMvec = (Mvec) (PointList.getNode());
				String TrKey = key + ".TracePt_" + (new Integer(TraceNum)).toString();

				ThePort.saveMvecProperties(MyProp, TrKey, MyMvec);

				TraceNum++;
				PointList.right();
				Done = PointList.getHead();
			}
		}

		MyProp.putInt(key + ".TraceNum", TraceNum); */
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
			PointList = (HighLevelList<StdLowLevelList<Mvec>,Mvec>) (myv.getProperty("PointList"));
			VersionBuffer.chkNul(PointList);
			TraceOn = myv.getBoolean("TraceOn"); */
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
		myv.setProperty("PointList", PointList);
		myv.setBoolean("TraceOn", TraceOn);

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
		String[] ret = { "" };
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
		return (VectGlo);
	};
	private IntObj getSelfAlloc() {
		return (SelfAlloc);
	};

	public Hexar vectGetHex(TracerContext in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(TracerContext in) {
		return (in.getHex2());
	};
	public Hexar tempCalcGetHex(TracerContext in) {
		return (in.getHex3());
	};
	public Hexar temp2GetHex(TracerContext in) {
		return (in.getHex4());
	};

	public CoordContext makeCoordContext() {
		return (new TracerContext());
	};

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Tracer1.class));
	}

	public static boolean getSelfNaming() {
		return (true);
	}

	HighLevelList<StdLowLevelList<Mvec>,Mvec> PointList = new HighLevelList<StdLowLevelList<Mvec>,Mvec>();

	boolean TraceOn = false;
	int TextOffsetX = -10;
	int TextOffsetY = 10;
	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectGlo = new Mvec();
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
};
