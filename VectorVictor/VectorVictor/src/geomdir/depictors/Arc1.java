



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
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.shapes.ArcShape;

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
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
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
* Depicts a circular arc.
* The arc has two major ports other than the base port.  The "_hd_" port defines the
* base point at which the arc begins.  The "_hd_" vector plus the "vector port" vector
* defines the position of the other end of the arc.  The only other piece of data needed
* is the radius of the circle defining the center of the arc.  This is defined by the "_md_"
* port.  The perpendicular projection of the "_md_" port point onto the bisection line 
* of the arc's end points defines
* the center point of the circle and thus the radius for the circular arc.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Arc1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int MDPort = 3;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragVecReal = 3;
	final static int ManualDragMDPos = 5;
	final static int DragNone = 6;

	static transient int PortMode = 1;
	protected Mvec TemptxtGlo = new Mvec();

	public void datCpy(Arc1 out) {
		drDatCpy(out);
		/* out.MdPoint = MdPoint;
		out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Arc1 temp = new Arc1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Arc1 temp = new Arc1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Arc1 temp = new Arc1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Arc1 temp = (Arc1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Arc1 temp = (Arc1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Arc1 temp = (Arc1) in;
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
		Arc1 temp = new Arc1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Arc1 temp = (Arc1) out;
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
		if (!state)
			ThePort.setNewDeltaVec(this, getVect());
		ThePort.setNewPosAVec(this, hDGetVect());
		ThePort.setNewPosBVec(this, mDGetVect());
	};
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
		Arc1 ReadObj = this;
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
		Arc1 ReadObj = this;
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
	public void updateYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + (getVect()).getBasis1());
		tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + (getVect()).getBasis2());
		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, MDHexGlo, mDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));

		Mvec x1 = new Mvec();
		Mvec x2 = new Mvec();
		Mvec x3 = new Mvec();
		Mvec x4 = new Mvec();
		Mvec x5 = new Mvec();
		Mvec dist = new Mvec();
		Mvec delt = new Mvec();
		(HDHexGlo).vadd(tLGetHex(Dcon).getGlo(), x1);
		x1.scale(0.5, x2);
		x3.setBasis12(1.0);
		(getVect()).mult(x3, x4);
		x4.setBasis(0.0);
		x4.setBasis12(0.0);
		(MDHexGlo).vsub(x2, x5);

		double deltax = x4.getBasis1();
		double deltay = x4.getBasis2();
		double LenSq = (deltax * deltax) + (deltay * deltay);
		if (LenSq < 0.001)
			LenSq = 5;

		x5.dot(x4, dist);
		x4.scale((dist.getBasis()) / (LenSq), delt);
		delt.vadd(x2, mXGetHex(Dcon).getGlo());

		ThePort.hexloc(HDHexGlo, bound, mXGetHex(Dcon));

		deltax = mXGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		deltay = mXGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
		setRadLen(Dcon, Math.sqrt((deltax * deltax) + (deltay * deltay)));

		double a = (double) (hDGetHex(Dcon).getPtx() - mXGetHex(Dcon).getPtx());
		double b = (double) (mXGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty());
		double rang = Math.atan2(a, b);
		double dang = 180 * rang / Math.PI;
		double MyShort = (- (dang) + 90);
		if (MyShort > 180)
			MyShort = MyShort - 360;
		setStrtAng(Dcon, MyShort);

		a = (double) (tLGetHex(Dcon).getPtx() - mXGetHex(Dcon).getPtx());
		b = (double) (mXGetHex(Dcon).getPty() - tLGetHex(Dcon).getPty());
		rang = Math.atan2(a, b);
		dang = 180 * rang / Math.PI;
		MyShort = (- (dang) + 90);
		if (MyShort > 180)
			MyShort = MyShort - 360;
		setEndAng(Dcon, MyShort - getStrtAng(Dcon));

		if (getEndAng(Dcon) > 180.0)
			setEndAng(Dcon, getEndAng(Dcon) - 360);
		else if (getEndAng(Dcon) < (-180.0))
			setEndAng(Dcon, getEndAng(Dcon) + 360);

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
		(getVect()).scale(OffsetText / ManLen, td);
		double tmp = td.getBasis1();
		td.setBasis1(td.getBasis2());
		td.setBasis2(-tmp);
		tc.vadd(td, TemptxtGlo);
		ThePort.hexloc(HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));

		if (Dcon.getRect1() == null) {
			Dcon.setRect1(new RectF());
		}
		RectF MyRect = Dcon.getRect1();
		double radlen = getRadLen(Dcon);
		MyRect.set((float)(mXGetHex(Dcon).getPtx() - radlen), (float)(mXGetHex(Dcon).getPty() - radlen), 
				(float)(mXGetHex(Dcon).getPtx() + radlen), (float)(mXGetHex(Dcon).getPty() + radlen));

		switch (ToolMode) {
			case DepictorPort.TranslateMode :
			case DepictorPort.ErasureMode :
			case DepictorPort.ColorMode :
			case DepictorPort.SelectionMode :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(tLGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp1GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
				}
				break;
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
			case DepictorPort.RotationMode :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					double oneT = 1.0 / 3.0;
					double twoT = 2.0 / 3.0;
					mXGetHex(Dcon).getGlo().scale(twoT, t1);
					x2.scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					mXGetHex(Dcon).getGlo().scale(oneT, t1);
					x2.scale(twoT, t2);
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
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		RectF MyRect = Dcon.getRect1();
		p.setStyle(Style.STROKE);
		p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
		p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
		p.setColor(FrontLineColor);

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (ToolMode == 13)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp)
			g.drawArc(MyRect, 
					(float)( -getStrtAng(Dcon) ), (float)( -getEndAng(Dcon) ), false, p);
		/* g.setColor( TextColor ); */

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (ToolMode == 13) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( getVectName() ).drawString( g , hDGetHex( Dcon ).getLoc().x + 15 , 
				hDGetHex( Dcon ).getLoc().y + 15 );  */

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
				case DepictorPort.ColorMode :
				case DepictorPort.SelectionMode :
					drawColorTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.LabelMode :
					drawTextTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.AssignMode :
					{
						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if (((getMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if (((mDGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
						}
					}
					break;
				case DepictorPort.FreeTransformationMode :
				case DepictorPort.AccessoryTransMode :
					{
						if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if ((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if ((mDGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
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
	protected void drawEraseTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

		}

		if (((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
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
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
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
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
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

		if ((mDGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
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

		if ((((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragMDPos);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (noSymBindings()) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
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
				Object[] RHS = { "'~glo'", " \\- 0.5 * ", " < ", this, " >{ 1 }" };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_md", this };
				Object[] RHS2 = { "_hd", this, " \\+ ( ", "_&md", this, " \\- ", "_&hd", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);

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

		Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
			/* NewRec.setValue( ManualDragVectPos ); */
			NewRec.ClickPriority = Priority;
			ret = NewRec;
			/* mDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				Dyn = ThePort.createDynRunner();

				Object[] LHS1 = { "'~tmp_pt'" };
				Object[] RHS1 = { "_&hd", this, " \\+ ( 0.5 * ", "_&", this, " )" };
				Dyn.changeExpression(LHS1, RHS1, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "'~tmp_del'" };
				Object[] RHS2 =
					{ "UnitOf( ", "'~tmp_pt'", " \\- '~tmpk_mx' ) * ", "UnitOf( ", "'~glo'", " \\- '~tmpk_mx' )" };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_SCA + DepictorPort.DOM_PSU);

				Object[] LHS3 = { "_hd", this };
				Object[] RHS3 = { "( ", "_&hd", this, " \\- '~tmpk_mx' ) ", "* '~tmp_del' \\+ '~tmpk_mx'" };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { this };
				Object[] RHS4 =
					{
						"( ( ",
						"_&hd",
						this,
						" \\+ ",
						"_&",
						this,
						" \\- '~tmpk_mx' ) * '~tmp_del' \\+ '~tmpk_mx' ) \\- ",
						"_hd",
						this,
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS4, RHS4);

				Object[] LHS5 = { "_md", this };
				Object[] RHS5 = { "( ", "_&md", this, " \\- '~tmpk_mx' ) ", "* '~tmp_del' \\+ '~tmpk_mx'" };
				Dyn.changeExpression(LHS5, RHS5);

				Dyn.makeConstant("~tmpk_mx", mXGetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				Dyn = ThePort.createDynRunner();

				Object[] LHS1 = { "'~tmp_pt'" };
				Object[] RHS1 = { "_&hd", this, " \\+ ( 0.5 * ", "_&", this, " )" };
				Dyn.changeExpression(LHS1, RHS1, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "'~tmp_del'" };
				Object[] RHS2 =
					{ "UnitOf( ", "'~tmpk_mx'", " \\- '~tmp_pt' ) * ", "UnitOf( ", "'~glo'", " \\- '~tmp_pt' )" };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_SCA + DepictorPort.DOM_PSU);

				Object[] LHS3 = { "_hd", this };
				Object[] RHS3 = { "( ", "_&hd", this, " \\- '~tmp_pt' ) ", "* '~tmp_del' \\+ '~tmp_pt'" };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { this };
				Object[] RHS4 =
					{
						"( ( ",
						"_&hd",
						this,
						" \\+ ",
						"_&",
						this,
						" \\- '~tmp_pt' ) * '~tmp_del' \\+ '~tmp_pt' ) \\- ",
						"_hd",
						this,
						" + ",
						" < ",
						"_&",
						this,
						" >{ 0 , 2 }" };
				Dyn.changeExpression(LHS4, RHS4);

				Object[] LHS5 = { "_md", this };
				Object[] RHS5 = { "( ", "_&md", this, " \\- '~tmp_pt' ) ", "* '~tmp_del' \\+ '~tmp_pt'" };
				Dyn.changeExpression(LHS5, RHS5);

				Dyn.makeConstant("~tmpk_mx", mXGetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

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
				Object[] RHS = { "_&hd", this, " \\+ ", " < ", "_&", this, " >{ 1 }" };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "'~tmp_ve'" };
				Object[] RHS2 = { "UnitOf( ", " < ", "_&", this, " >{ 1 }", " ) " };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS3 = { this };
				Object[] RHS3 =
					{
						"- '~tmp_ve'",
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
				Object[] RHS4 = { "'~tmp_pt'", " \\- ", this };
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
						"'~tmp_ve'",
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

		if ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, bound, HDHexGlo, "_md");
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

		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, hDGetVect());
				Object[] LHS = { this };
				Object[] RHS =
					{ " ( ", "'~glo'", " \\- ", "_hd", this, " ) ", " + ", " < ", "_&", this, " >{ 0 , 2 }" };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_hd", "_&hd", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, bound, HDHexGlo, "_md");
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createMoveDyn(ThePort, "_hd");
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

	public Arc1() {
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
	public PointF mDGetPoint(DefContext Dcon) {
		return (mDGetHex(Dcon).getLoc());
	};
	public PointF hDGetPoint(DefContext Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};
	public PointF tLGetPoint(DefContext Dcon) {
		return (tLGetHex(Dcon).getLoc());
	};

	static Arc1 UndoNode = null;

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
		UndoNode = new Arc1();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
		MDHexGlo.copyAllInfo(UndoNode.MDHexGlo);
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();
		Mvec TmpMDVect = new Mvec();

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);
		MDHexGlo.copyAllInfo(TmpMDVect);

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.MDHexGlo.copyAllInfo(MDHexGlo);

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);
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
					Object[] RHS1 = { "$ \\- ", "_hd", this };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

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
					Object[] Form = { "_hd", this, " \\+ ", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
					CurDist.CurDist = Dist;
				}
			}

			if (true) {
				double XDist = (mDGetPoint(Dcon)).x - InPt.x;
				double YDist = (mDGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_md", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
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

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = mDGetHex((DefContext) Std);
			Hexar ini = mDGetHex((DefContext) Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, MDHexGlo, std);
		}
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
			VersionBuffer.chkNul(MDSelfAlloc); */
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
		String[] ret = { "", "_hd", "_md" };
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
	public final double getRadLen(DefContext in) {
		return (in.getD3());
	}
	public final void setRadLen(DefContext in, double val) {
		in.setD3(val);
	}

	public CoordContext makeCoordContext() {
		return (new DefContext());
	};

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Arc1.class));
	}

	protected double BariText = 0.5;
	protected double OffsetText = 0.5;

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
};
