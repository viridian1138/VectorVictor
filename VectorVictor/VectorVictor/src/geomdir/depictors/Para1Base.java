


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
import meta.VersionBuffer;
import verdantium.mathimage.MathImage;
import verdantium.utils.PolygonContent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
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
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some more depictors.
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
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
* Depicts the imaginary-valued part of a multivector as a paralellogram area.
* The "base" side of the depictor extends from the "_hd_" port point to
* the "_md_" port point.  The "off" side extends from the "_hd_" port point
* in the direction of the position of the "_mx_" port point consistent with
* an area equal to the the imaginary value of the "vector port".
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public abstract class Para1Base<T extends Para1Base, Q extends DefContext, R extends APPRec<Para1Base.Para1Evt,?,Q>> extends DrawObj<T,Q,R> implements Externalizable {
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int MDPort = 3;
	final static int MXPort = 4;
	final static int PrevPort = 100;

	protected static enum Para1Evt {
		MANUAL_DRAG_VECT_POS,
		MANUAL_DRAG_VECT_DIS,
		MANUAL_DRAG_VEC_REAL,
		MANUAL_DRAG_MX_POS,
		MANUAL_DRAG_MD_POS,
		DRAG_NONE
	};

	static transient int PortMode = 1;

	Mvec Temp1Glo = new Mvec();

	public void datCpy(T out) {
		drDatCpy(out);
		/* out.MdPoint = MdPoint;
		out.HdPoint = HdPoint;
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
		 (mDGetVect()).eraseAll();
		(mXGetVect()).eraseAll();
		/* delete ( MyAppNode->mDGetSelfAlloc() ); */
		/* delete MyAppNode->getVectName(); */
		/* ( VarList.getNode() ).eraseNode(); */
	}
	public T copyUser1() {
		T temp = makeMeta();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
		MXHexGlo.copyAllInfo(temp.MXHexGlo);
		return (temp);
	};
	public void copyUser1Info(T out) {
		T temp = out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		HDHexGlo.copyAllInfo(temp.HDHexGlo);
		MDHexGlo.copyAllInfo(temp.MDHexGlo);
		MXHexGlo.copyAllInfo(temp.MXHexGlo);
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, Q PrtCon, boolean bound, boolean state) {
		if (!state)
			getVect().setBasis12(1.0);
		ThePort.setNewPosAVec(this, hDGetVect());
	};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void synchResetVects(DepictorPort ThePort, Q PrtCon, boolean bound, boolean state) {
		(hDGetVect()).copyAllInfo(mDGetVect());
		(hDGetVect()).copyAllInfo(mXGetVect());
		mDGetVect().setBasis1(mDGetVect().getBasis1() + 0.5);
		mXGetVect().setBasis2(mXGetVect().getBasis2() + 0.5);
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((mDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((mXGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
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
		String MXPrefix = "_mx_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;
		if (Prefix.stcmp(MDPrefix) == 0)
			PortMode = MDPort;
		if (Prefix.stcmp(MXPrefix) == 0)
			PortMode = MXPort;

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
			case MXPort :
				{
					MXVectName = MyVectName;
					MXMovable = MyMovable;
					MXHexGlo = MyVect;
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
			case MXPort :
				temp = MXMovable;
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
			case MXPort :
				{
					MXMovable = in;
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
			case MDPort :
				temp = ReadObj.MDHexGlo;
				break;
			case MXPort :
				temp = ReadObj.MXHexGlo;
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
			case MDPort :
				temp = ReadObj.MDSelfAlloc;
				break;
			case MXPort :
				temp = ReadObj.MXSelfAlloc;
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
		Mvec del_horiz = new Mvec();
		Mvec u_del_horiz = new Mvec();
		Mvec u_del_vec2 = new Mvec();
		Mvec del_vec2 = new Mvec();
		Mvec dprod = new Mvec();
		Mvec u_del_vert = new Mvec();

		Mvec comp1 = new Mvec();
		Mvec comp2 = new Mvec();
		Mvec cvec = new Mvec();

		(MDHexGlo).vsub(HDHexGlo, del_horiz);
		(MXHexGlo).vsub(HDHexGlo, del_vec2);
		double len =
			Math.sqrt(
				(del_horiz.getBasis1() * del_horiz.getBasis1()) + (del_horiz.getBasis2() * del_horiz.getBasis2()));
		if (len < 0.0001)
			len = 0.0001;
		del_horiz.scale(1.0 / len, u_del_horiz);
		double len2 =
			Math.sqrt((del_vec2.getBasis1() * del_vec2.getBasis1()) + (del_vec2.getBasis2() * del_vec2.getBasis2()));
		if (len2 < 0.0001)
			len2 = 0.0001;
		del_vec2.scale(1.0 / len2, u_del_vec2);

		del_vec2.dot(u_del_horiz, dprod);
		double tp = dprod.getBasis();
		u_del_horiz.scale(tp, comp1);

		u_del_vert.setBasis1(-u_del_horiz.getBasis2());
		u_del_vert.setBasis2(u_del_horiz.getBasis1());

		u_del_vert.scale((getVect()).getBasis12() / (len), comp2);

		comp1.vadd(comp2, cvec);
		cvec.vadd(HDHexGlo, paraPt3GetHex(Dcon).getGlo());
		(paraPt3GetHex(Dcon).getGlo()).vadd(del_horiz, paraPt4GetHex(Dcon).getGlo());

		ThePort.hexloc(HDHexGlo, bound, paraPt3GetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, paraPt4GetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, MDHexGlo, mDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, MXHexGlo, mXGetHex(Dcon));

		if (Dcon.getPath1() == null) {
			Dcon.setPath1(new Path());
		}

		Path MyPath = Dcon.getPath1();
		MyPath.reset();
		MyPath.moveTo((float) hDGetPoint(Dcon).x, (float) hDGetPoint(Dcon).y);
		MyPath.lineTo((float) mDGetPoint(Dcon).x, (float) mDGetPoint(Dcon).y);
		MyPath.lineTo((float) paraPt4GetHex(Dcon).getLoc().x, (float) paraPt4GetHex(Dcon).getLoc().y);
		MyPath.lineTo((float) paraPt3GetHex(Dcon).getLoc().x, (float) paraPt3GetHex(Dcon).getLoc().y);
		MyPath.close();

		switch (toolMode) {
			case TRANSLATE_MODE :
			case SELECTION_MODE :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(paraPt4GetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, Temp1Glo);
					ThePort.hexloc(HDHexGlo, bound, Temp1Glo, temp1GetHex(Dcon));
				}
				break;
			case DILATION_MODE :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(paraPt4GetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, Temp1Glo);
					ThePort.hexloc(HDHexGlo, bound, Temp1Glo, temp1GetHex(Dcon));
				}
				break;
			case ROTATION_MODE :
			case FREE_TRANSFORMATION_MODE :
			case GEO_PAD_MODE :
				{
					Mvec t1 = new Mvec();
					MDHexGlo.vadd(paraPt4GetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, Temp1Glo);
					HDHexGlo.vadd(paraPt3GetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, Temp1Glo, temp1GetHex(Dcon));
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
		p.setStyle( Style.FILL );

		p.setColor(Win.getCyanIndex());
		if ((getVect()).getBasis12() < 0.0)
			p.setColor(Win.getMagentaIndex());

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			p.setColor(DefBack);
		}

		Path MyPath = Dcon.getPath1();
		if (tmp)
			g.drawPath(MyPath,p);
		/* g.setColor( TextColor ); */

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE) && getNamedVar()) {
			tmp = true;
			p.setColor(DefBack);
		}

		/* if( tmp ) ( getVectName() ).drawString( g , hDGetHex( Dcon ).getLoc().x + 15 , 
				hDGetHex( Dcon ).getLoc().y + 15 );  */

		if (tmp)
			drawTextImage(
				g,
				getDepicImage(),
				hDGetHex(Dcon).getLoc().x + TextOffsetX,
				hDGetHex(Dcon).getLoc().y + TextOffsetY,
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
				case GEO_PAD_MODE :
					drawFreeTransTools(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ASSIGN_MODE :
					{
						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if (((mDGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
						}

						if (((mXGetMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintBlueKnob(g, p, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
						}
					}
					break;
				case ACCESSORY_TRANS_MODE :
					{
						if ((mDGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
							ThePort.paintBlueKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
						}

						if ((mXGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
							ThePort.paintBlueKnob(g, p, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
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

		if (((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);
		}

		if (((mXGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {

			ThePort.paintOrangeKnob(g, p, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
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
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for selection mode.
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
				hDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
				hDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
		}
	};
	/**
	* Renders depictor tools for free transformation mode.
	*/
	protected void drawFreeTransTools(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			ThePort.paintBlueKnob(g, p, paraPt4GetHex(Dcon).getLoc().x, paraPt4GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			ThePort.paintBlueKnob(g, p, paraPt4GetHex(Dcon).getLoc().x, paraPt4GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, Q Dcon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {

		if ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

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
				case GEO_PAD_MODE :
					return (checkFreeTransControls(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
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
			Priority = ThePort.defaultGravityField(InPt, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_VECT_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_MD_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((mXGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {

			Priority = ThePort.defaultGravityField(InPt, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_MX_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (noSymBindings()) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_VEC_REAL);
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

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createTransDyn(ThePort, Dcon);
				Dyn.makeConstant("~tmpk_pt", Temp1Glo, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that translates the depictor.
	*/
	DynRunner createTransDyn(DepictorPort ThePort, Q Dcon) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { "_hd", this };
		Object[] RHS = { "'~glo' \\- '~tmpk_pt' \\+ ", "_&hd", this };
		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_md", this };
		Object[] RHS2 = { "'~glo' \\- '~tmpk_pt' \\+ ", "_&md", this };
		Dyn.changeExpression(LHS2, RHS2);

		Object[] LHS3 = { "_mx", this };
		Object[] RHS3 = { "'~glo' \\- '~tmpk_pt' \\+ ", "_&mx", this };
		Dyn.changeExpression(LHS3, RHS3);

		Dyn.tie("", "_&", this);

		return (Dyn);
	}

	/**
	* Initializes the constant for createTransDyn using the position at InPt.  Assumes that bound is false.
	*/
	void createTransDynConstant(
		DepictorPort ThePort,
		boolean bound,
		PointF InPt,
		Hexar BasePt,
		DynRunner Dyn) {
		Hexar hex = new Hexar();
		ThePort.hexglo(InPt.x, InPt.y, BasePt.getGlo(), bound, hex);
		Mvec InPtGlo = hex.getGlo();
		Dyn.makeConstant("~tmpk_pt", InPtGlo, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
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

		Priority = shapeGravityField(Dcon, InPt);
		if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
			/* NewRec.setValue( MANUAL_DRAG_VECT_POS ); */
			NewRec.clickPriority = Priority;
			ret = NewRec;
			/* mDGetVect().sub( Temp1Glo ,
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
				ThePort.defaultGravityField(
					InPt,
					hDGetHex(Dcon).getLoc().x + TextOffsetX - XOffset,
					hDGetHex(Dcon).getLoc().y + TextOffsetY - YOffset);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_VECT_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				/* hDGetVect().sub( Temp1Glo ,
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

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createDeformDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createRotateDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority =
				ThePort.defaultGravityField(InPt, paraPt4GetHex(Dcon).getLoc().x, paraPt4GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createShearDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Crestes a DynRunner that shears the depictor.
	*/
	DynRunner createShearDyn(DepictorPort ThePort, Q Dcon, boolean bound) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS = { "_mx", this };
		Object[] RHS = { " '~glo' \\- ( ", "_md", this, " \\- ", "_hd", this, " ) " };
		Dyn.changeExpression(LHS, RHS);

		Dyn.tie("_md", "_&md", this);
		Dyn.tie("_hd", "_&hd", this);
		Dyn.tie("", "_&", this);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of a free transformation mode control.
	*/
	R checkFreeTransControls(
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

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createDeformDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createRotateDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority =
				ThePort.defaultGravityField(InPt, paraPt4GetHex(Dcon).getLoc().x, paraPt4GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createShearDyn(ThePort, Dcon, bound);

				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createTransDyn(ThePort, Dcon);
				createTransDynConstant(ThePort, bound, InPt, hDGetHex(Dcon), Dyn);

				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (TextVisible && getNamedVar()) {
			MathImage img = getDepicImage();

			RectF TempRect =
				new RectF(
					hDGetHex(Dcon).getLoc().x + TextOffsetX,
					hDGetHex(Dcon).getLoc().y + TextOffsetY,
					hDGetHex(Dcon).getLoc().x + TextOffsetX+img.getWidth(),
					hDGetHex(Dcon).getLoc().y + TextOffsetY+img.getHeight());
			if (TempRect.contains(InPt.x, InPt.y) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Para1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = ClickRec.MIN_PRIORITY;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
					    NewRec.TransDelta ); */
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that affine-deforms the depictor.
	*/
	DynRunner createDeformDyn(DepictorPort ThePort, Q Dcon, boolean bound) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS = { "'~tmp_ve'" };
		Object[] RHS = { "UnitOf( ", "_&md", this, " \\- ", "_hd", this, " ) " };
		Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		Object[] LHS2 = { "'~tmp_glo'" };
		Object[] RHS2 =
			{
				" '~glo' \\- ( '~tmpk_ve' * ( ( '~glo' wedge '~tmp_ve' + '~tmp_ve' wedge ",
				"_hd",
				this,
				" ) / ( '~tmpk_ve' wedge '~tmp_ve' ) ) \\+ ",
				"_hd",
				this,
				" ) " };
		Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		Object[] LHS3 = { "_md", this };
		Object[] RHS3 = { "( '~tmp_ve' dot '~tmp_glo' ) * '~tmp_ve' \\+ ", "_hd", this };
		Dyn.changeExpression(LHS3, RHS3);

		Object[] LHS4 = { "_mx", this };
		Object[] RHS4 =
			{
				" '~tmpk_ve' * magnitude( ",
				"_&mx",
				this,
				" \\- ",
				"_hd",
				this,
				" ) ",
				" * magnitude( ",
				"_&md",
				this,
				" \\- ",
				"_hd",
				this,
				" ) ",
				" / magnitude( ",
				"_md",
				this,
				" \\- ",
				"_hd",
				this,
				" ) ",
				" \\+ ",
				"_hd",
				this };
		Dyn.changeExpression(LHS4, RHS4);

		Dyn.tie("_hd", "_&hd", this);
		Dyn.tie("", "_&", this);

		Mvec tmp1 = new Mvec();

		Mvec tmp2 = new Mvec();
		paraPt3GetHex(Dcon).getGlo().vsub(HDHexGlo, tmp2);
		double len = Math.sqrt((tmp2.getBasis1() * tmp2.getBasis1()) + (tmp2.getBasis2() * tmp2.getBasis2()));
		if (len < 0.0001)
			len = 0.0001;

		tmp1.setBasis1(tmp2.getBasis1() / len);
		tmp1.setBasis2(tmp2.getBasis2() / len);

		Dyn.makeConstant("~tmpk_ve", tmp1, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that rotates the depictor.
	*/
	DynRunner createRotateDyn(DepictorPort ThePort, Q Dcon, boolean bound) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS1 = { "'~tmp_del'" };
		Object[] RHS1 =
			{
				"UnitOf( ",
				"'~tmpk_pt'",
				" \\- ",
				"_hd",
				this,
				" ) * ",
				"UnitOf( ",
				"'~glo'",
				" \\- ",
				"_hd",
				this,
				" )" };
		Dyn.changeExpression(LHS1, RHS1, DepictorPort.DOM_SCA + DepictorPort.DOM_PSU);

		Object[] LHS2 = { "_md", this };
		Object[] RHS2 = { "( ", "_&md", this, " \\- ", "_hd", this, " ) ", "* '~tmp_del' \\+ ", "_hd", this };
		Dyn.changeExpression(LHS2, RHS2);

		Object[] LHS3 = { "_mx", this };
		Object[] RHS3 = { "( ", "_&mx", this, " \\- ", "_hd", this, " ) ", "* '~tmp_del' \\+ ", "_hd", this };
		Dyn.changeExpression(LHS3, RHS3);

		Dyn.tie("_hd", "_&hd", this);
		Dyn.tie("", "_&", this);

		Dyn.makeConstant("~tmpk_pt", temp2GetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
				Dyn = ThePort.createDynRunner(bound, HDHexGlo);

				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { " 0.5 * ( ", "_&hd", this, " \\+ ", "_&md", this, " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { this };
				Object[] RHS2 =
					{ "magnitude( '~glo' \\- '~tmp_pt' ) * ", "'~tmpk_vl' + < ", "_&", this, " >{ 0 , 1 }" };
				Dyn.changeExpression(LHS2, RHS2);

				Mvec tmp1 = new Mvec();

				Mvec tep1 = new Mvec();
				UndoNode.HDHexGlo.vadd(UndoNode.MDHexGlo, tep1);
				Mvec mval = new Mvec();
				tep1.scale(0.5, mval);

				Mvec delta2 = new Mvec();
				UndoNode.Temp1Glo.vsub(mval, delta2);
				double len2 =
					Math.sqrt(delta2.getBasis1() * delta2.getBasis1() + delta2.getBasis2() * delta2.getBasis2());
				if (len2 < 0.001)
					len2 = 0.001;
				tmp1.setBasis12((UndoNode.getVect().getBasis12()) / len2);

				Dyn.makeConstant("~tmpk_vl", tmp1, DepictorPort.DOM_PSU);
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

		if ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			Priority = ThePort.defaultGravityField(InPt, mDGetPoint(Dcon).x, mDGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createMoveDyn(ThePort, bound, HDHexGlo, "_md");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {

			Priority = ThePort.defaultGravityField(InPt, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createMoveDyn(ThePort, bound, HDHexGlo, "_mx");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((mXGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createTransDyn(ThePort, Dcon);
				createTransDynConstant(ThePort, bound, InPt, hDGetHex(Dcon), Dyn);

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
		if (MyRec.getValue() == Para1Evt.MANUAL_DRAG_VECT_POS) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Para1Evt.MANUAL_DRAG_MD_POS) {
			Object[] Form = { "_md", this };
			ThePort.insertFormattedString(Form, CurString);
			(mDGetVect()).setBasis1((mDGetVect()).getBasis1() + Delta1);
			(mDGetVect()).setBasis2((mDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Para1Evt.MANUAL_DRAG_MX_POS) {
			Object[] Form = { "_mx", this };
			ThePort.insertFormattedString(Form, CurString);
			(mXGetVect()).setBasis1((mXGetVect()).getBasis1() + Delta1);
			(mXGetVect()).setBasis2((mXGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Para1Evt.MANUAL_DRAG_VECT_DIS) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
			(getVect()).setBasis1((getVect()).getBasis1() + Delta1);
			(getVect()).setBasis2((getVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Para1Evt.MANUAL_DRAG_VEC_REAL) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Para1Base() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		MDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		MXSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		MDMovable.value = DepictorPort.MABLE_BY_ANY;
		MXMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
	};
	public PointF mDGetPoint(Q Dcon) {
		return (mDGetHex(Dcon).getLoc());
	};
	public PointF mXGetPoint(Q Dcon) {
		return (mXGetHex(Dcon).getLoc());
	};
	public PointF hDGetPoint(Q Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};

	static Para1Base UndoNode = null;

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
		MDHexGlo.copyAllInfo(UndoNode.MDHexGlo);
		MXHexGlo.copyAllInfo(UndoNode.MXHexGlo);
		Temp1Glo.copyAllInfo(UndoNode.Temp1Glo);
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();
		Mvec TmpMDVect = new Mvec();
		Mvec TmpMXVect = new Mvec();

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);
		MDHexGlo.copyAllInfo(TmpMDVect);
		MXHexGlo.copyAllInfo(TmpMXVect);

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.MDHexGlo.copyAllInfo(MDHexGlo);
		UndoNode.MXHexGlo.copyAllInfo(MXHexGlo);

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);
		TmpMDVect.copyAllInfo(UndoNode.MDHexGlo);
		TmpMXVect.copyAllInfo(UndoNode.MXHexGlo);

	}

	/**
	* Handles a single-click event that happened in a gravity field of the depictor.
	*/
	public void singleClickControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode) {
		if (toolMode == DepictorPort.ToolMode.DILATION_MODE) {
			(getVect()).setBasis12(- (getVect()).getBasis12());

		}

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

		TextOffsetX = (int) (InPt.x - hDGetHex(Dcon).getLoc().x + XOffset);
		TextOffsetY = (int) (InPt.y - hDGetHex(Dcon).getLoc().y + YOffset);
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

			if (((mDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {

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

			if (((mXGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {

				TempRect = ThePort.instanceRect(mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_mx", this };
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

			if (true) {
				double XDist = (mXGetPoint(Dcon)).x - InPt.x;
				double YDist = (mXGetPoint(Dcon)).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_mx", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
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

		if (((mDGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = mDGetHex(Std);
			Hexar ini = mDGetHex(Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, MDHexGlo, std);
		}

		if (((mXGetMovable()).value >= DepictorPort.MABLE_BY_ANY)) {
			Hexar std = mXGetHex(Std);
			Hexar ini = mXGetHex(Initial);
			ThePort.hexglo(ini.getLoc().x, ini.getLoc().y, HDHexGlo, bound, MXHexGlo, std);
		}
	};

	/**
	* Loads persistent properties.
	*/
/*	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		ThePort.loadMvecProperties(MyProp, key + ".MDport", MDHexGlo);

		ThePort.loadMvecProperties(MyProp, key + ".MXport", MXHexGlo);

		TextOffsetX = MyProp.getInt(key + ".OffX");

		TextOffsetY = MyProp.getInt(key + ".OffY");

	}; */

	/**
	* Saves persistent properties.
	*/
/*	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
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

		ThePort.saveMvecProperties(MyProp, key + ".MDport", MDHexGlo);

		if ((mDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_md_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		ThePort.saveMvecProperties(MyProp, key + ".MXport", MXHexGlo);

		if ((mXGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_mx_");
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
			MXVectName = (FlexString) (myv.getProperty("MXVectName"));
			MXMovable = (IntObj) (myv.getProperty("MXMovable"));
			VersionBuffer.chkNul(MXMovable);
			MXHexGlo = (Mvec) (myv.getProperty("MXHexGlo"));
			VersionBuffer.chkNul(MXHexGlo);
			MXSelfAlloc = (IntObj) (myv.getProperty("MXSelfAlloc"));
			VersionBuffer.chkNul(MXSelfAlloc); */
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
		if (MXVectName != null)
			myv.setProperty("MXVectName", MXVectName);
		myv.setProperty("MXMovable", MXMovable);
		myv.setProperty("MXHexGlo", MXHexGlo);
		myv.setProperty("MXSelfAlloc", MXSelfAlloc);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

	/**
	* Gets the gravity field from "in" to the current shape using the coordinate context Dcon.
	*/
	public double shapeGravityField(Q Dcon, PointF in) {
		double dist = ClickRec.MIN_PRIORITY + 1;
		PolygonContent cnt = new PolygonContent();
		cnt.add( hDGetPoint(Dcon));
		cnt.add( mDGetPoint(Dcon));
		cnt.add( paraPt4GetHex(Dcon).getLoc() );
		cnt.add( paraPt3GetHex(Dcon).getLoc() );
		
		if (cnt.contains(in))
			dist = ClickRec.MAX_PRIORITY + 1;
		return (dist);
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
	* Gets the domain of the currrent port of the depictor, not counting other depictors.
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
		return (DepictorPort.DOM_PSU);
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
		String[] ret = { "", "_hd", "_md", "_mx" };
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
	private FlexString mXGetVectName() {
		return (MXVectName);
	};
	private IntObj mXGetMovable() {
		return (MXMovable);
	};
	private void mXSetMovable(IntObj in) {
		MXMovable = in;
	};
	private Mvec mXGetVect() {
		return (MXHexGlo);
	};
	private IntObj mXGetSelfAlloc() {
		return (MXSelfAlloc);
	};

	public Hexar hDGetHex(Q in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(Q in) {
		return (in.getHex2());
	};
	public Hexar temp2GetHex(Q in) {
		return (in.getHex3());
	};
	public Hexar mDGetHex(Q in) {
		return (in.getHex4());
	};
	public Hexar mXGetHex(Q in) {
		return (in.getHex5());
	};
	public Hexar paraPt3GetHex(Q in) {
		return (in.getHex6());
	};
	public Hexar paraPt4GetHex(Q in) {
		return (in.getHex7());
	};

	
	public abstract Q makeCoordContext();
	
	public abstract R makeClickRec();
	
	public abstract T makeMeta();

	
	
	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Para1Base.class));
	}


	int TextOffsetX = -10;
	int TextOffsetY = 10;
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
	FlexString MXVectName;
	IntObj MXMovable = new IntObj();
	Mvec MXHexGlo = new Mvec();
	IntObj MXSelfAlloc = new IntObj();
};
