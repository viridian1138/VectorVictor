



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
import verdantium.EtherEvent;
import verdantium.mathimage.MathImage;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint.Style;
import android.graphics.drawable.shapes.Shape;

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
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
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
* Depicts the phasor-valued part of a multivector using an angular depiction in the standard sense.
* The depictor has two main ports other than the vector port.  First, the "_hd_" port defines
* the position of the base point of the vector.  Second, the "_md_" port defines an offset position
* such that the scalar base of the depictor points in the direction of "_md_".  That is to say, to
* give the phasor a "horizontal" orientation, make "_md_" equal to "_hd_" plus the horizontal basis
* vector.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Angle1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int MDPort = 3;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragVecIm = 4;
	final static int ManualDragMDPos = 5;
	final static int ManualDragPhasAng = 6;
	final static int ManualDragPhasLen = 7;
	final static int DragNone = 8;

	private boolean PolarForm = false;
	private boolean AreaForm = false;

	static transient int PortMode = 1;
	static final double ArrLen = 6.0;

	Mvec TemptxtGlo = new Mvec();
	public void datCpy(Angle1 out) {
		drDatCpy(out);
		/* out.MdPoint = MdPoint;
		out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Angle1 temp = new Angle1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Angle1 temp = new Angle1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Angle1 temp = new Angle1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Angle1 temp = (Angle1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Angle1 temp = (Angle1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Angle1 temp = (Angle1) in;
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
		 (mDGetVect()).eraseAll();
		/* delete ( MyAppNode->mDGetSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public Meta copyUser1() {
		Angle1 temp = new Angle1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Angle1 temp = (Angle1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		if (!state) {
			getVect().setBasis(1.0);
			getVect().setBasis12(1.0);
		}
		ThePort.setNewPosAVec(this, hDGetVect());
	};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void synchResetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		hDGetVect().copyAllInfo(mDGetVect());
		Mvec tmp = new Mvec();
		ThePort.setNewDeltaVec(this, tmp);

		if (!state) {
			double x = tmp.getBasis1();
			double y = tmp.getBasis2();
			double len = Math.sqrt(x * x + y * y);
			double div = Math.sqrt(2.0);
			getVect().setBasis(len / div);
			getVect().setBasis12(len / div);
		}

		hDGetVect().add(tmp, mDGetVect());
	}
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
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
		String HDPrefix = "_hd_";
		String MDPrefix = "_md_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;
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
			case HDPort :
				temp = HDMovable;
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
			case HDPort :
				{
					HDMovable = in;
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
		Angle1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectPtr;
				break;
			case HDPort :
				temp = ReadObj.HDHexGlo;
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
		Angle1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case HDPort :
				temp = ReadObj.HDSelfAlloc;
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
		Mvec delta = new Mvec();
		Mvec map = new Mvec();
		Mvec mapd = new Mvec();
		Mvec delscal = new Mvec();
		(MDHexGlo).vsub(HDHexGlo, delta);
		map.setBasis(getVect().getBasis());
		map.setBasis12(getVect().getBasis12());
		delta.mult(map, mapd);
		double mapba1 = mapd.getBasis1();
		double mapba2 = mapd.getBasis2();
		double maplen = Math.sqrt(mapba1 * mapba1 + mapba2 * mapba2);
		double delba1 = delta.getBasis1();
		double delba2 = delta.getBasis2();
		double dellen = Math.sqrt(delba1 * delba1 + delba2 * delba2);
		double ba1 = getVect().getBasis();
		double ba2 = getVect().getBasis12();
		double len = Math.sqrt(ba1 * ba1 + ba2 * ba2);
		Mvec mapdd = new Mvec();
		if (PolarForm) {
			mapd.scale(1.0 / maplen, mapdd);
			delta.scale(1.0 / dellen, delscal);
		}
		else {
			mapd.scale(len / maplen, mapdd);
			delta.scale(len / dellen, delscal);
		}
		mapdd.vadd(HDHexGlo, tLGetHex(Dcon).getGlo());
		delscal.vadd(HDHexGlo, mXGetHex(Dcon).getGlo());
		if (true) {
			delta.scale(len / dellen, delscal);
			delscal.vadd(HDHexGlo, mLGetHex(Dcon).getGlo());
			ThePort.hexloc(HDHexGlo, bound, mLGetHex(Dcon));
		}
		Dcon.setD1(Math.atan2(getVect().getBasis12(), getVect().getBasis()));
		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, MDHexGlo, mDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, mXGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		Mvec ta = new Mvec();
		Mvec tb = new Mvec();
		Mvec tc = new Mvec();
		Mvec td = Dcon.getTxtDelMvec();
		HDHexGlo.scale((1 - BariText), ta);
		tLGetHex(Dcon).getGlo().scale(BariText, tb);
		ta.vadd(tb, tc);
		double ManLen = Math.abs(mapdd.getBasis1()) + Math.abs(mapdd.getBasis2());
		if (ManLen < 0.001)
			ManLen = 0.001;
		(mapdd).scale(OffsetText / ManLen, td);
		double tmp = td.getBasis1();
		td.setBasis1(td.getBasis2());
		td.setBasis2(-tmp);
		tc.vadd(td, TemptxtGlo);
		ThePort.hexloc(HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));

		double RealIn = Dcon.getD1();
		ba1 = mDGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		ba2 = mDGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
		double bb1 = tLGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		double bb2 = tLGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
		len = Math.sqrt(bb1 * bb1 + bb2 * bb2);
		double xai = hDGetHex(Dcon).getPtx();
		double yai = hDGetHex(Dcon).getPty();

		double a = (double) (ba1);
		double b = (double) (ba2);
		double rang = Math.atan2(a, b);
		double dang = 180 * rang / Math.PI;
		double MyShort = (- (dang) + 90);
		if (MyShort > 180)
			MyShort = MyShort - 360;
		double StAng = -MyShort;
		double EndAng = RealIn * (180.0 / Math.PI);

		if (Dcon.getRect2() == null) {
			Dcon.setRect2(new RectF());
			Dcon.setLine1(new RectF());
			Dcon.setLine2(new RectF());
			Dcon.setCirc1(new RectF());
		}

		RectF ArcRect = Dcon.getRect2();
		ArcRect.set((float)(xai - len), (float)(yai - len), (float)(xai + len), (float)(yai + len));
		setStrtAng(Dcon,StAng);
		setEndAng(Dcon,EndAng);

		final double CircWid = 6;
		final double CirLen = 7;
		double x1 = hDGetHex(Dcon).getPtx();
		double y1 = hDGetHex(Dcon).getPty();
		double x2 = mLGetHex(Dcon).getPtx();
		double y2 = mLGetHex(Dcon).getPty();
		double delx = x2 - x1;
		double dely = y2 - y1;
		len = Math.sqrt(delx * delx + dely * dely);
		double x4 = x2;
		double y4 = y2;
		double x5 = x2;
		double y5 = y2;

		if (len > 0.001) {
			x4 = x2 + CirLen * dely / len;
			y4 = y2 - CirLen * delx / len;
			x5 = x2 - CirLen * dely / len;
			y5 = y2 + CirLen * delx / len;
		}

		RectF MyCirc = Dcon.getCirc1();
		MyCirc.set((float)(x1 - CircWid / 2.0), (float)(y1 - CircWid / 2.0), (float)(x1 + CircWid / 2.0), (float)(y1 + CircWid / 2.0));

		RectF MyLine = Dcon.getLine1();
		MyLine.set((float)x1, (float)y1, (float)x2, (float)y2);

		MyLine = Dcon.getLine2();
		MyLine.set((float)x4, (float)y4, (float)x5, (float)y5);

		switch (toolMode) {
			case TRANSLATE_MODE :
			case ERASURE_MODE :
			case COLOR_MODE :
			case SELECTION_MODE :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					HDHexGlo.vadd(mXGetHex(Dcon).getGlo(), t1);
					t1.add(tLGetHex(Dcon).getGlo(), t2);
					t2.scale(1.0 / 3.0, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
				}
				break;
			case FREE_TRANSFORMATION_MODE :
			case ACCESSORY_TRANS_MODE :
			case GEO_PAD_MODE :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(mLGetHex(Dcon).getGlo(), t1);
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
					mLGetHex(Dcon).getGlo().scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					HDHexGlo.scale(oneT, t1);
					mLGetHex(Dcon).getGlo().scale(twoT, t2);
					t1.add(t2, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
				}
				break;
			case ADDITION_MODE :
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
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DefContext Dcon = (DefContext) PrtCon;

		RectF ArcRect = Dcon.getRect2();
		double RealIn = Dcon.getD1();
		double bb1 = tLGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		double bb2 = tLGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
		double len = Math.sqrt(bb1 * bb1 + bb2 * bb2);
		double xw = RealIn * (180.0 / Math.PI);

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
		}

		if (AreaForm) {
			if (RealIn >= 0)
				p.setColor(ThePort.getCyanIndex());
			else
				p.setColor(ThePort.getMagentaIndex());

			if (tmp) {
				p.setStyle(Style.FILL);
				g.drawArc(ArcRect, 
						(float)( -getStrtAng(Dcon) ), (float)( -getEndAng(Dcon) ), false, p);
			}
		}

		p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
		p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
		p.setColor(FrontLineColor);

		tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp) {
			p.setStyle(Style.STROKE);
			g.drawArc(ArcRect, 
					(float)( -getStrtAng(Dcon) ), (float)( -getEndAng(Dcon) ), false, p);
			drawFwdEndArrow(ThePort, g, p, Dcon, len,
			/* ( StAng * Math.PI / 180.0 ) + RealIn / 2.0 */
			xw);
			if (true)
				drawPolarSegment(ThePort, Dcon, bound, g, p, toolMode);
		}

		/* g.setColor( caller.TextColor ); */

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( name ).drawString( g , (int)( xa + 0.5 * ArrLen ) ,
			(int)( ya + ArrLen ) );  */

		/* if( tmp ) drawTextImageJustify( g , getDepicImage() , 
			(int)( xa + TextOffsetX ) ,
			(int)( ya + TextOffsetY )  , 
			Dcon.getTxtDelMvec() , TextColor ); */

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
	* Draws the "Polar Form" scalar segment for the depictor.
	*/
	protected void drawPolarSegment(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DepictorPort Win = (DepictorPort) ThePort;

		Integer MyCol = FrontLineColor;
		Integer SgnCol = Win.getCyanIndex();

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			MyCol = DefBack;
			SgnCol = DefBack;
		}

		if (tmp) {
			p.setColor(MyCol);
			RectF MyLine = Dcon.getLine2();
			p.setStyle(Style.STROKE);
			g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom,p);

			p.setColor(SgnCol);
			RectF MyCirc = Dcon.getCirc1();
			p.setStyle(Style.FILL);
			g.drawOval(MyCirc, p);
			MyLine = Dcon.getLine1();
			p.setStyle(Style.STROKE);
			g.drawLine(MyLine.left,MyLine.top,MyLine.right,MyLine.bottom,p);
		}
	}

	/**
	* Draws a forward arrow in the middle of the arc.
	*/
	void drawFwdMidArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon, double RadLen, double MyAng) {
		double xa1 = hDGetHex(Dcon).getPtx() + RadLen * Math.cos(MyAng);
		double ya1 = hDGetHex(Dcon).getPty() - RadLen * Math.sin(MyAng);
		double dx1 = tLGetHex(Dcon).getPtx() - mXGetHex(Dcon).getPtx();
		double dy1 = tLGetHex(Dcon).getPty() - mXGetHex(Dcon).getPty();
		boolean tmp = FrontLineVisible;
		double xe1 = xa1 - dx1;
		double ye1 = ya1 - dy1;
		double xe2 = xa1 + dx1;
		double ye2 = ya1 + dy1;

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = (xe1 + xe2) / 2.0;
		double y2 = (ye1 + ye2) / 2.0;

		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		// g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Draws a forward arrow at the end of the arc.
	*/
	void drawFwdEndArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon, double RadLen, double MyAng) {
		double tx = tLGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		double ty = tLGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
		boolean tmp = FrontLineVisible;
		double xe1 = tLGetHex(Dcon).getPtx();
		double ye1 = tLGetHex(Dcon).getPty();
		double xe2 = tLGetHex(Dcon).getPtx();
		double ye2 = tLGetHex(Dcon).getPty();

		if (MyAng <= 0) {
			xe1 = xe1 + ty;
			ye1 = ye1 - tx;
		}
		else {
			xe1 = xe1 - ty;
			ye1 = ye1 + tx;
		}

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = xe2;
		double y2 = ye2;
		
		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		// g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

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
				case COLOR_MODE :
				case SELECTION_MODE :
					drawColorTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case LABEL_MODE :
					drawTextTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ADDITION_MODE :
					drawAdditTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case FREE_TRANSFORMATION_MODE :
				case ACCESSORY_TRANS_MODE :
				case GEO_PAD_MODE :
					{
						if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
						}

						if (((mDGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
							ThePort.paintBlueKnob(g, p, mLGetHex(Dcon).getLoc().x, mLGetHex(Dcon).getLoc().y);
						}
					}
					break;
				case ASSIGN_MODE :
					{
						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if ((((mDGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
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
		if (((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mLGetHex(Dcon).getLoc().x, mLGetHex(Dcon).getLoc().y);

		}

		if (((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
		}

		if (noSymBindings()) {
			ThePort.paintOrangeKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

			/* ThePort.paintOrangeKnob( g ,
				mDGetPoint( Dcon ).x ,
				mDGetPoint( Dcon ).y ); */
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
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		/* if( ( ( mDGetMovable() ).value >= DepictorPort.MableByDifferentiable ) &&
			( !bound ) )
			{
			
			ThePort.paintBlueKnob( g ,
				mDGetPoint( Dcon ).x ,
				mDGetPoint( Dcon ).y );
			} */
	};
	/**
	* Renders depictor tools for color mode.
	*/
	protected void drawColorTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

		/* ThePort.paintBlueKnob( g ,
		        mDGetPoint( Dcon ).x ,
		        mDGetPoint( Dcon ).y ); */
	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (TextVisible && getNamedVar()) {
			/* ThePort.paintBlueKnob( g ,
			        mDGetHex( Dcon ).getLoc().x + TextOffsetX - XOffset ,
			        mDGetHex( Dcon ).getLoc().y + TextOffsetY - YOffset ); */

			ThePort.paintBlueKnob(g, p, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);

		}
	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode ) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
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
		DepictorPort.ToolMode toolMode) {
		if (getNamedVar()) {
			if (g != null) {
				p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
				p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
				p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
				p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
				p.setColor(Color.BLUE);
				MathImage img = getDepicImage();
				RectF MyRect = Dcon.getRect1();
				MyRect.set(
					temptxtGetHex(Dcon).getLoc().x,
					temptxtGetHex(Dcon).getLoc().y,
					temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
					temptxtGetHex(Dcon).getLoc().y+img.getHeight());

				g.drawRect(MyRect,p);
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

		if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, mLGetHex(Dcon).getLoc().x, mLGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
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
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVecReal);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

			/* Priority = ThePort.defaultGravityField( InPt , mDGetPoint( Dcon ).x,
				mDGetPoint( Dcon ).y );
			if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
				LastClick == NoMatch ) )
				{
				NewRec.setValue( ManualDragVecReal );
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
				} */
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createTransDyn(ThePort);

				Dyn.makeConstant("~tmpk_pt", temp1GetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a {@link geomdir.DynRunner} that handles a translation event.
	*/
	DynRunner createTransDyn(DepictorPort ThePort) {
		DynRunner Dyn = ThePort.createDynRunner();

		Object[] LHS = { "_hd", this };
		Object[] RHS = { "_&hd", this, " \\+ '~glo' \\- '~tmpk_pt'" };
		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_md", this };
		Object[] RHS2 = { "_&md", this, " \\+ '~glo' \\- '~tmpk_pt'" };
		Dyn.changeExpression(LHS2, RHS2);

		Dyn.tie("", "_&", this);

		return (Dyn);
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

		Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
				NewRec.TransDelta ); */
			LastClick = Match;
		}

		/* Priority = ThePort.defaultGravityField( InPt , mDGetPoint( Dcon ).x,
			mDGetPoint( Dcon ).y );
		
		if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
			LastClick == NoMatch ) )
			{
			NewRec.ClickPriority = Priority;
			ret = NewRec;
			LastClick = Match;
			} */

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
				ThePort.defaultGravityField(InPt, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectPos);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
				        NewRec.TransDelta ); */
				LastClick = Match;
			}

			/* Priority = ThePort.defaultGravityField( InPt ,
			        mDGetHex( Dcon ).getLoc().x + TextOffsetX - XOffset ,
			        mDGetHex( Dcon ).getLoc().y + TextOffsetY - YOffset );
			if( ( Priority <= ClickRec.MIN_PRIORITY ) && (
			        LastClick == NoMatch ) )
			        {
			        NewRec.setValue( ManualDragMDPos );
			NewRec.ClickPriority = Priority;
			        ret = NewRec;
			        LastClick = Match;
			        } */
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
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();

				Object[] LHS1 = { "_md", this };
				Object[] RHS1 = { "'~tmpk_pt'" };
				Dyn.changeExpression(LHS1, RHS1);

				Object[] LHS2 = { "_hd", this };
				Object[] RHS2 =
					{
						"'~tmpk_pt' \\+ magnitude( < PhasToVect( ",
						this,
						" ) >{ 1 } ) ",
						" * UnitOf( '~glo' \\- '~tmpk_pt' )" };
				Dyn.changeExpression(LHS2, RHS2);

				Dyn.tie("", "_&", this);

				Dyn.makeConstant("~tmpk_pt", mLGetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, bound, HDHexGlo, "_md");
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("", "_&", this);
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
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();

				Object[] LHS2 = { "'~tmp_ve'" };
				Object[] RHS2 = { "UnitOf( ", "_&md", this, " \\- ", "_&hd", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS3 = { this };
				Object[] RHS3 =
					{
						"( -1.5 ) * '~tmp_ve' ",
						" dot ( ",
						"'~glo'",
						" \\- ",
						"'~tmpk_pt'",
						" ) ",
						" * VectToPhas( UnitOf( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { "_hd", this };
				Object[] RHS4 = { "'~tmpk_pt'", " \\- '~tmp_ve' * magnitude( PhasToVect( < ", this, " >{ 0 , 2 } ) )" };
				Dyn.changeExpression(LHS4, RHS4);

				Dyn.makeConstant("~tmpk_pt", mLGetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);
				Object[] LHS = { this };
				Object[] RHS =
					{
						"1.5 * UnitOf( ",
						"_md",
						this,
						" \\- ",
						"_hd",
						this,
						" ) ",
						" dot ( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * VectToPhas( UnitOf( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("_md", "_&md", this);
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
	ClickRec checkControls(DepictorPort ThePort, DefContext Dcon, boolean bound, PointF InPt, DepictorPort.ToolMode toolMode) {
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
						"2.0 * UnitOf( ",
						"_md",
						this,
						" \\- ",
						"_hd",
						this,
						" ) ",
						" dot ( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * VectToPhas( UnitOf( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("_md", "_&md", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"_md",
						this,
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * UnitOf( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * magnitude( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("_md", "_&md", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createTransDyn(ThePort);

				Dyn.makeConstant("~tmpk_pt", HDHexGlo, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, mLGetHex(Dcon).getLoc().x, mLGetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, "_md");
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("", "_&", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
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
		DepictorPort.ToolMode toolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;
		RectF TempRect;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						"2.0 * UnitOf( ",
						"_md",
						this,
						" \\- ",
						"_hd",
						this,
						" ) ",
						" dot ( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * VectToPhas( UnitOf( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("_md", "_&md", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS =
					{
						"UnitOf( ",
						"_md",
						this,
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * UnitOf( ",
						"'~glo'",
						" \\- ",
						"_hd",
						this,
						" ) ",
						" * magnitude( PhasToVect( ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }",
						" ) ) ",
						" + ",
						" < ",
						"_&",
						this,
						" >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("_md", "_&md", this);
				NewRec.clickPriority = Priority;
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
				NewRec.clickPriority = ClickRec.MIN_PRIORITY;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
					    NewRec.TransDelta ); */
				LastClick = Match;
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createTransDyn(ThePort);

				Dyn.makeConstant("~tmpk_pt", HDHexGlo, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, mLGetHex(Dcon).getLoc().x, mLGetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, "_md");
				Dyn.tie("_hd", "_&hd", this);
				Dyn.tie("", "_&", this);
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
		if (MyRec.getValue() == ManualDragVectPos) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == ManualDragMDPos) {
			Object[] Form = { "_md", this };
			ThePort.insertFormattedString(Form, CurString);
			(mDGetVect()).setBasis1((mDGetVect()).getBasis1() + Delta1);
			(mDGetVect()).setBasis2((mDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == ManualDragVectDis) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
			(getVect()).setBasis((getVect()).getBasis() + Delta1);
			(getVect()).setBasis12((getVect()).getBasis12() + Delta2);
		}

		if (MyRec.getValue() == ManualDragVecReal) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Angle1() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		MDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		MDMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};
	public PointF mXGetPoint(DefContext Dcon) {
		return (mXGetHex(Dcon).getLoc());
	};
	public PointF mDGetPoint(DefContext Dcon) {
		return (mDGetHex(Dcon).getLoc());
	};
	public PointF hDGetPoint(DefContext Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};
	public PointF tLGetPoint(DefContext Dcon) {
		return (tLGetHex(Dcon).getLoc());
	};

	static Angle1 UndoNode = null;

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
		UndoNode = new Angle1();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
		MDHexGlo.copyAllInfo(UndoNode.MDHexGlo);
		UndoNode.PolarForm = PolarForm;
		UndoNode.AreaForm = AreaForm;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();
		Mvec TmpMDVect = new Mvec();
		boolean TmpPolarForm = false;
		boolean TmpAreaForm = false;

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);
		MDHexGlo.copyAllInfo(TmpMDVect);
		TmpPolarForm = PolarForm;
		TmpAreaForm = AreaForm;

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.MDHexGlo.copyAllInfo(MDHexGlo);
		PolarForm = UndoNode.PolarForm;
		AreaForm = UndoNode.AreaForm;

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);
		TmpMDVect.copyAllInfo(UndoNode.MDHexGlo);
		UndoNode.PolarForm = TmpPolarForm;
		UndoNode.AreaForm = TmpAreaForm;

	}

	/**
	* Handles a single-click event that happened in a gravity field of the depictor.
	*/
	public void singleClickControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec in,
		DepictorPort.ToolMode toolMode) {
		if ((toolMode == DepictorPort.ToolMode.GEO_PAD_MODE)) {
			APPRec MRec = (APPRec) in;

			if (MRec.getValue() == ManualDragVectDis) {
				/* EtherEvent send = new GeomKitEtherEvent( this , GeomKitEtherEvent.changeDepicLabel ,
					null , in );
				ThePort.processObjEtherEvent( send , null ); */
			}
		}
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
		int VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case ManualDragVectPos :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				tLGetHex(Dcon).getGlo().vsub(HDHexGlo, VectVal);
				/* VectVal.setBasis1( ( getVect() ).getBasis1() );
				VectVal.setBasis2( ( getVect() ).getBasis2() ); */
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
				OffsetText = dprod.getBasis();
				if (dn < 0.001)
					OffsetText = 0.5;

				break;

				/* case ManualDragMDPos:
						TextOffsetX = InPt.x - mDGetHex( Dcon ).getLoc().x + XOffset;
						TextOffsetY = InPt.y - mDGetHex( Dcon ).getLoc().y + YOffset;
					break; */
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
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_hd", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
					CurDist.curDist = Dist;
				}
			}

			/* if( true )
				{
				double XDist = ( tLGetPoint( Dcon ) ).x 
					- InPt.x;
				double YDist = ( tLGetPoint( Dcon ) ).y 
					- InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if( Dist < curDist.CurDist )
					{
					NewString.clearString();
					NewString.setInsertPoint( 0 );
					Object[] Form = { "_hd" , this , " \\+ " , this };
					ThePort.insertFormattedString( Form , NewString );
					( OutPt ).move( 
						tLGetPoint( Dcon ).x ,
						tLGetPoint( Dcon ).y );
					curDist.CurDist = Dist;
					}
				} */

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
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = hDGetHex((DefContext) Std);
			Hexar ini = hDGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, HDHexGlo, std);
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = mDGetHex((DefContext) Std);
			Hexar ini = mDGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, MDHexGlo, std);
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
				if (Dist < CurDist.curDist) {
					(OutPt).set(temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
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
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		/* String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		BariText = MyProp.getDouble(key + ".Bari");

		OffsetText = MyProp.getDouble(key + ".Offset");

		ThePort.loadMvecProperties(MyProp, key + ".MDport", MDHexGlo); */

		/* TextOffsetX = MyProp.getInt( key + ".OffX" );
		
		TextOffsetY = MyProp.getInt( key + ".OffY" ); */

		/* String tmp = null;

		tmp = MyProp.getProperty(key + ".PolarForm");
		if (tmp != null)
			PolarForm = MyProp.getBoolean(key + ".PolarForm");

		tmp = MyProp.getProperty(key + ".AreaForm");
		if (tmp != null)
			AreaForm = MyProp.getBoolean(key + ".AreaForm"); */

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

		MyProp.putDouble(key + ".Bari", BariText);

		MyProp.putDouble(key + ".Offset", OffsetText);

		ThePort.saveMvecProperties(MyProp, key + ".MDport", MDHexGlo);

		if ((mDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_md_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		} */

		/* MyProp.putInt( key + ".OffX" , TextOffsetX );
		
		MyProp.putInt( key + ".OffY" , TextOffsetY ); */

		/* MyProp.putBoolean(key + ".PolarForm", PolarForm);

		MyProp.putBoolean(key + ".AreaForm", AreaForm); */

	};

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
			VersionBuffer.chkNul(HDSelfAlloc);
			MDVectName = (FlexString) (myv.getProperty("MDVectName"));
			MDMovable = (IntObj) (myv.getProperty("MDMovable"));
			VersionBuffer.chkNul(MDMovable);
			MDHexGlo = (Mvec) (myv.getProperty("MDHexGlo"));
			VersionBuffer.chkNul(MDHexGlo);
			MDSelfAlloc = (IntObj) (myv.getProperty("MDSelfAlloc"));
			VersionBuffer.chkNul(MDSelfAlloc);
			PolarForm = myv.getBoolean("PolarForm");
			AreaForm = myv.getBoolean("AreaForm"); */
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
		if (MDVectName != null)
			myv.setProperty("MDVectName", MDVectName);
		myv.setProperty("MDMovable", MDMovable);
		myv.setProperty("MDHexGlo", MDHexGlo);
		myv.setProperty("MDSelfAlloc", MDSelfAlloc);
		myv.setBoolean("PolarForm", PolarForm);
		myv.setBoolean("AreaForm", AreaForm);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

	/**
	* Gets the "head and tail" of the depictor in an addition operation.
	*/
	public void getAdditiveExtents(CoordContext PrtCon, Mvec pos, Mvec tl) {
		DefContext Dcon = (DefContext) PrtCon;
		int CurSwap = 0;

		Mvec delta = new Mvec();
		Mvec map = new Mvec();
		Mvec mapd = new Mvec();
		Mvec delscal = new Mvec();
		(MDHexGlo).vsub(HDHexGlo, delta);
		map.setBasis(getVect().getBasis());
		map.setBasis12(getVect().getBasis12());
		delta.mult(map, mapd);
		double mapba1 = mapd.getBasis1();
		double mapba2 = mapd.getBasis2();
		double maplen = Math.sqrt(mapba1 * mapba1 + mapba2 * mapba2);
		double ba1 = getVect().getBasis();
		double ba2 = getVect().getBasis12();
		double len = Math.sqrt(ba1 * ba1 + ba2 * ba2);
		mapd.scale(len / maplen, delscal);
		delscal.vadd(HDHexGlo, mLGetHex(Dcon).getGlo());

		if (CurSwap == 1) {
			mLGetHex(Dcon).getGlo().copyAllInfo(pos);
			hDGetVect().copyAllInfo(tl);
		}
		else {
			hDGetVect().copyAllInfo(pos);
			mLGetHex(Dcon).getGlo().copyAllInfo(tl);
		}

	}

	public void preferredDirection(Mvec t1) {
		HDHexGlo.vadd(t1, MDHexGlo);
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
	* Gets the domain of the current port counting only this depictor.
	*/
	public int portGetEntDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (vectGetEntDomain());
		else
			return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
	}
	/**
	* Gets the domain of the depictor's variable counting only this depictor.
	*/
	public int vectGetEntDomain() {
		return (DepictorPort.DOM_SCA + DepictorPort.DOM_PSU);
	}
	/**
	* Gets the domain of the depictor's variable counting all depictors.
	*/
	public int portGetExtDomain() {
		if ((PortMode % PrevPort) == VectPort)
			return (Domain.value);
		else
			return (portGetEntDomain());
	}
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
		String[] ret = { "", "_hd", "_md" };
		return (ret);
	}

	public FlexString getVectName() {
		return (VectName);
	};
	public void setVectName(FlexString in) {
		VectName = in;
	};
	public boolean getAreaForm() {
		return (AreaForm);
	}
	public void setAreaForm(boolean in) {
		AreaForm = in;
	}
	public boolean getPolarForm() {
		return (PolarForm);
	}
	public void setPolarForm(boolean in) {
		PolarForm = in;
	}
	public double getOffsetText() {
		return (OffsetText);
	}
	public void setOffsetText(double in) {
		OffsetText = in;
	}
	public double getBariText() {
		return (BariText);
	}
	public void setBariText(double in) {
		BariText = in;
	}
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
	public Hexar mDGetHex(DefContext in) {
		return (in.getHex6());
	};
	public Hexar mXGetHex(DefContext in) {
		return (in.getHex7());
	};
	public Hexar mLGetHex(DefContext in) {
		return (in.getHex8());
	};
	
	public final double getStrtAng(DefContext in) {
		return (in.getD1());
	}
	public final void setStrtAng(DefContext in, double val) {
		in.setD1(val);
	}
	public final double getEndAng(DefContext in) {
		return (in.getD2());
	}
	public final void setEndAng(DefContext in, double val) {
		in.setD2(val);
	}

	public CoordContext makeCoordContext() {
		return (new DefContext());
	};


	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Angle1.class));
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
//		return ((new Angle1CustControl(this, ThePort, InAp)));
//	};

	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	};

	protected double BariText = 0.5;
	protected double OffsetText = 0.5;

	/* int TextOffsetX = 10;
	int TextOffsetY = 0; */
	FlexString VectName;
	IntObj Movable = new IntObj();
	Mvec VectPtr;
	IntObj SelfAlloc = new IntObj();
	IntObj Domain = new IntObj();
	IntObj IODef = new IntObj();
	FlexString HDVectName;
	IntObj HDMovable = new IntObj();
	Mvec HDHexGlo = new Mvec();
	IntObj HDSelfAlloc = new IntObj();
	FlexString MDVectName;
	IntObj MDMovable = new IntObj();
	Mvec MDHexGlo = new Mvec();
	IntObj MDSelfAlloc = new IntObj();

	/**
	* Custom control class for the depictor.
	*/
/*	public static class Angle1CustControl extends Object implements VerdantiumPropertiesEditor {
		Angle1 target;
		DepictorPort ThePort;
		JCheckBox PolarFormCheck;
		boolean OrigPolarForm;
		JCheckBox AreaFormCheck;
		boolean OrigAreaForm;
		JPanel MyPan = null;

		public Angle1CustControl(Angle1 in, ToolPort port, XKit MyAp) {
			super();
			target = in;
			ThePort = port;
			MyPan = new JPanel();
			MyPan.setLayout(new VerticalLayout());
			MyPan.add("any", new JLabel("Form: "));
			JPanel pa = new JPanel();
			pa.setLayout(new FlowLayout());
			MyPan.add("any", pa);
			OrigPolarForm = in.getPolarForm();
			OrigAreaForm = in.getAreaForm();

			PolarFormCheck = new JCheckBox("Polar Form", null, in.getPolarForm());
			pa.add(PolarFormCheck);
			AreaFormCheck = new JCheckBox("Area Form", null, in.getAreaForm());
			pa.add(AreaFormCheck);
			target.pushDragUndo();
		}

		public JComponent getGUI() {
			return (MyPan);
		}

		public void handleButton(String param) {
			if (true) {
				if (true) {
					if ((param.compareTo("OK") == 0) || (param.compareTo("Apply") == 0)) {

						target.setPolarForm(PolarFormCheck.getModel().isSelected());
						target.setAreaForm(AreaFormCheck.getModel().isSelected());

						if (param.compareTo("OK") == 0) {}

					}

					if ((param.compareTo("Cancel") == 0)) {

						target.setPolarForm(OrigPolarForm);
						target.setAreaForm(OrigAreaForm);

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

//	} /* End Nested Class */

};
