



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
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Paint;
import android.graphics.Paint.Style;


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
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 10/14/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dlike proportion operator (GeoCard).                                 | Created Pdca from Ssca and Paca to support dLike proportion.
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
* A depictor that maintains a proportionality constraint between two
* other depictors.  This depictor is currently unfinished.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Pdca1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int D1Port = 3;
	final static int D2Port = 4;
	final static int OBPort = 5;
	final static int PrevPort = 100;

	final static int DelHd = 1;
	final static int DelD1 = 2;
	final static int DelD2 = 3;
	final static int DelOb = 4;
	final static int DelVect = 5;
	final static int DelDepic = 6;
	final static int DelNone = 7;

	static transient int PortMode = 1;
	Mvec del1 = new Mvec();
	Mvec del2 = new Mvec();
	Mvec obv = new Mvec();
	public void datCpy(Pdca1 out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Pdca1 temp = new Pdca1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Pdca1 temp = new Pdca1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Pdca1 temp = new Pdca1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Pdca1 temp = (Pdca1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Pdca1 temp = (Pdca1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Pdca1 temp = (Pdca1) in;
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
		Pdca1 temp = new Pdca1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Pdca1 temp = (Pdca1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosAVec(this, hDGetVect());

		del1.setBasis1(1.0);
		del1.setBasis2(0.0);

		del2.setBasis1(0.0);
		del2.setBasis2(1.0);

		obv.setBasis(1.0);
		VectGlo.setBasis(1.5);
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((d1GetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)
			&& (((d2GetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)
			&& (((oBGetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)) {
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
		String D1Prefix = "_d1_";
		String D2Prefix = "_d2_";
		String OBPrefix = "_ob_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;
		if (Prefix.stcmp(D1Prefix) == 0)
			PortMode = D1Port;
		if (Prefix.stcmp(D2Prefix) == 0)
			PortMode = D2Port;
		if (Prefix.stcmp(OBPrefix) == 0)
			PortMode = OBPort;

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

			case HDPort :
				{
					HDVectName = MyVectName;
					HDMovable = MyMovable;
					HDHexGlo = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
				};
				break;

			case D1Port :
				{
					D1VectName = MyVectName;
					D1Movable = MyMovable;
					del1 = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2;
				};
				break;

			case D2Port :
				{
					D2VectName = MyVectName;
					D2Movable = MyMovable;
					del2 = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2;
				};
				break;

			case OBPort :
				{
					OBVectName = MyVectName;
					OBMovable = MyMovable;
					obv = MyVect;
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
			case D1Port :
				temp = D1Movable;
				break;
			case D2Port :
				temp = D2Movable;
				break;
			case OBPort :
				temp = OBMovable;
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
			case D1Port :
				{
					D1Movable = in;
				}
				break;
			case D2Port :
				{
					D2Movable = in;
				}
				break;
			case OBPort :
				{
					OBMovable = in;
				}
				break;
		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		Pdca1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectGlo;
				break;
			case HDPort :
				temp = ReadObj.HDHexGlo;
				break;
			case D1Port :
				temp = ReadObj.del1;
				break;
			case D2Port :
				temp = ReadObj.del2;
				break;
			case OBPort :
				temp = ReadObj.obv;
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
		Pdca1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case HDPort :
				temp = ReadObj.HDSelfAlloc;
				break;
			case D1Port :
				temp = ReadObj.D1SelfAlloc;
				break;
			case D2Port :
				temp = ReadObj.D2SelfAlloc;
				break;
			case OBPort :
				temp = ReadObj.OBSelfAlloc;
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

		tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + del1.getBasis1() * (getVect().getBasis()));
		tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + del1.getBasis2() * (getVect().getBasis()));

		mXGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + del1.getBasis1() * (oBGetVect().getBasis()));
		mXGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + del1.getBasis2() * (oBGetVect().getBasis()));

		double dxh = (getVect().getBasis()) / (oBGetVect().getBasis());

		dXGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + del2.getBasis1() * dxh);
		dXGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + del2.getBasis2() * dxh);

		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, mXGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, dXGetHex(Dcon));

		if (Dcon.getLine1() == null) {
			Dcon.setLine1(new RectF());
			Dcon.setLine2(new RectF());
		}

		double x1 = hDGetHex(Dcon).getPtx();
		double y1 = hDGetHex(Dcon).getPty();
		double x2 = tLGetHex(Dcon).getPtx();
		double y2 = tLGetHex(Dcon).getPty();
		double x3 = mXGetHex(Dcon).getPtx();
		double y3 = mXGetHex(Dcon).getPty();

		RectF MyLine = Dcon.getLine1();
		MyLine.set((float)x1, (float)y1, (float)x2, (float)y2);
		MyLine = Dcon.getLine2();
		MyLine.set((float)x1, (float)y1, (float)x3, (float)y3);

		switch (ToolMode) {
			case DepictorPort.FreeTransformationMode :
				{
					Mvec t1 = new Mvec();
					HDHexGlo.vadd(tLGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp1GetHex(Dcon).getGlo());
					HDHexGlo.vadd(mXGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
				}
				break;
			case DepictorPort.TranslateMode :
			case DepictorPort.SelectionMode :
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
		}
	}

	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		p.setStyle(Style.STROKE);

		Integer c = FrontLineColor;

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (ToolMode == 13)) {
			tmp = true;
			c = DefBack;
		}

		if (tmp) {
			p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
			p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
			p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
			p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
			p.setColor(c);
			RectF MyLine = Dcon.getLine1();
			g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
			MyLine = Dcon.getLine2();
			g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
		}

		/* g.setColor( TextColor ); */

		/* tmp = TextVisible;
		if( ( !tmp ) && ( ToolMode == 13 ) )
			{
			tmp = true;
			g.setColor( DefBack );
			} */

		/* if( tmp ) ( getVectName() ).drawString( g , vectGetHex( Dcon ).getLoc().x - 10 ,
			vectGetHex( Dcon ).getLoc().y + 10 ); */

		/* if( tmp ) drawTextImage( g ,
		             LabelImage , vectGetHex( Dcon ).getLoc().x + TextOffsetX , 
			 vectGetHex( Dcon ).getLoc().y + TextOffsetY , TextColor ); */

	}
	/**
	* Renders the depictor's control points and other tools.
	*/
	public void drawYourTools(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		Canvas g, Paint p, 
		int ToolMode) // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	{
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
				case DepictorPort.FreeTransformationMode :
					{
						if (((d1GetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if (((d1GetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

						}

						if (((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, dXGetHex(Dcon).getLoc().x, dXGetHex(Dcon).getLoc().y);

						}

					}
					break;
				case DepictorPort.GeoPadMode :
					drawGeoPadTools(ThePort, Dcon, bound, g, p, ToolMode);
					break;
				case DepictorPort.AssignMode :
					{ // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

						//			if( ( ( ( getMovable().value ) & DepictorPort.MableAsgnMask ) == 0 ) &&
						//				( !bound ) )
						//				{
						//				ThePort.paintBlueKnob( g ,
						//					vectGetHex( Dcon ).getLoc().x ,
						//					vectGetHex( Dcon ).getLoc().y );
						//				}
						//
						//			ThePort.paintBlueKnob( g ,
						//				tLGetHex( Dcon ).getLoc().x ,
						//				tLGetHex( Dcon ).getLoc().y );
						//				
						//			if( ( ( ( hDGetMovable().value ) & DepictorPort.MableAsgnMask ) == 0 ) &&
						//				( !bound ) )
						//				{
						//				ThePort.paintBlueKnob( g ,
						//					hDGetHex( Dcon ).getLoc().x ,
						//					hDGetHex( Dcon ).getLoc().y );
						//				}
						//
						//			ThePort.paintBlueKnob( g ,
						//				mXGetHex( Dcon ).getLoc().x ,
						//				mXGetHex( Dcon ).getLoc().y );
						//
						//	
					}
					break;
				case DepictorPort.AccessoryTransMode :
					{
						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((d1GetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((d1GetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, dXGetHex(Dcon).getLoc().x, dXGetHex(Dcon).getLoc().y);

						}
					}
					break;
			}
		}
	};

	/**
	* Renders depictor tools for GeoPad mode.
	*/
	private final void drawGeoPadTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

		}

		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);

		}

		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, dXGetHex(Dcon).getLoc().x, dXGetHex(Dcon).getLoc().y);

		}
	}

	/**
	* Renders depictor tools for erasure mode.
	*/
	private final void drawEraseTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) { // ###########################################################################3
		//		if( ( ( hDGetMovable() ).value & DepictorPort.MableAsgnMask ) > 0 )
		//			{
		//			ThePort.paintOrangeKnob( g ,
		//				hDGetPoint( Dcon ).x ,
		//				hDGetPoint( Dcon ).y );
		//			}
		//			
		//		if( ( ( ( d1GetMovable() ).value & DepictorPort.MableAsgnMask ) > 0 ) &&
		//			( ThePort.getAdvancedControls() ) )
		//			{
		//			ThePort.paintOrangeKnob( g ,
		//				temp2GetHex( Dcon ).getLoc().x ,
		//				temp2GetHex( Dcon ).getLoc().y );
		//			}
		//
		//		if( ( ( getMovable() ).value & DepictorPort.MableAsgnMask ) > 0 )
		//			{	
		//			ThePort.paintOrangeKnob( g ,
		//				tLGetPoint( Dcon ).x ,
		//				tLGetPoint( Dcon ).y );
		//			}

	};

	/**
	* Renders depictor tools for translate mode.
	*/
	private final void drawTranslateTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) { // ##########################################################################
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound));
		{
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};

	/**
	* Renders depictor tools for selection mode.
	*/
	private final void drawSelectionTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) // #########################################################################
	{
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};

	/**
	* Renders depictor tools for text mode.
	*/
	private final void drawTextTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		};

	/**
	* Renders depictor tools for rotation mode.
	*/
	private final void drawRotateTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) { // #########################################################################
		if ((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};

	/**
	* Renders depictor tools for dilation mode.
	*/
	private final void drawDilateTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) { // #############################################################################
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
				case DepictorPort.AccessoryTransMode :
					return (checkAccControls(ThePort, Dcon, bound, LocEvent, ToolMode));
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
	private final ClickRec checkEraseControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) // ########################################################################3
	{
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		//			if( ( ( ( hDGetMovable() ).value & DepictorPort.MableAsgnMask ) > 0 ) )
		//				{
		//				Priority = ThePort.defaultGravityField( InPt , hDGetPoint( Dcon ).x,
		//					hDGetPoint( Dcon ).y );
		//				if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
		//					LastClick == NoMatch ) )
		//					{
		//					NewRec.setValue( DelHd );
		//					NewRec.ClickPriority = Priority;
		//					ret = NewRec;
		//					LastClick = Match;
		//					}
		//				}
		//				
		//			if( ( ( ( d1GetMovable() ).value & DepictorPort.MableAsgnMask ) > 0 ) &&
		//				( ThePort.getAdvancedControls() ) )
		//				{
		//				Priority = ThePort.defaultGravityField( InPt , temp2GetHex( Dcon ).getLoc().x,
		//					temp2GetHex( Dcon ).getLoc().y );
		//				if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
		//					LastClick == NoMatch ) )
		//					{
		//					NewRec.setValue( DelD1 );
		//					NewRec.ClickPriority = Priority;
		//					ret = NewRec;
		//					LastClick = Match;
		//					}
		//				}			
		//			
		//			if( ( ( getMovable() ).value & DepictorPort.MableAsgnMask ) > 0 )
		//				{
		//				Priority = ThePort.defaultGravityField( InPt , tLGetPoint( Dcon ).x,
		//					tLGetPoint( Dcon ).y );
		//				if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
		//					LastClick == NoMatch ) )
		//					{
		//					NewRec.setValue( DelVect );
		//					NewRec.ClickPriority = Priority;
		//					ret = NewRec;
		//					LastClick = Match;
		//					}
		//				
		//				}
		//
		//			if( noSymBindings() )
		//				{
		//				Priority = linearSegGravityField( hDGetPoint( Dcon ) , tLGetPoint( Dcon ) , InPt , getBasicFrontLineStrokeWidth() );
		//				if( ( Priority <= ClickRec.MIN_PRIORITY ) && ( 
		//					LastClick == NoMatch ) )
		//					{
		//					NewRec.setValue( DelDepic );
		//					NewRec.ClickPriority = Priority;
		//					ret = NewRec;
		//					LastClick = Match;
		//					}
		//				
		//				}
		//				
		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of a translation mode control.
	*/
	private final ClickRec checkTransControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) { // ######################################################################
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createTransDyn(ThePort, Dcon);
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that translates the depictor.
	*/
	private final DynRunner createTransDyn(DepictorPort ThePort, DefContext Dcon) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { "_hd", this };
		Object[] RHS = { "'~glo'", " \\- ( '~tmpk_pt' \\- ", "_&hd", this, " ) " };
		Dyn.changeExpression(LHS, RHS);
		Dyn.tie("", "_&", this);
		Dyn.tie("_d1", "_&d1", this);

		Dyn.makeConstant("~tmpk_pt", temp1GetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of a color mode control.
	*/
	private final ClickRec checkColorControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) { // #####################################################################
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;

		Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
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
		return null;
	}

	/**
	* Returns whether the user clicked in the gravity field of an rotation mode control.
	*/
	private final ClickRec checkRotateControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) { // ####################################################################
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if ((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				if (/* DragThrough && */
					 (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = false;
				boolean Add = false;

				/* if( !( DragThrough ) && 
					( getVect().getBasis() < 0.0 ) )
					{
					Bool = false;
					Add = true;
					} */

				if (/* ( DragThrough ) && */
					 (getVect().getBasis() < 0.0)) {
					Bool = true;
					Add = false;
				}

				Dyn = createBackRotateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo());
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that rotates the depictor around its base.
	*/
	private final DynRunner createFwdRotateDyn(DepictorPort ThePort, DefContext Dcon, boolean bound, boolean Pos) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { "_d1", this };
		Object[] RHS = { " ", " ( UnitOf( '~glo' \\- ", "_hd", this, " ) ) " };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);
		Dyn.tie("", "_&", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that rotates the depictor around its base.
	*/
	private final DynRunner createObFwdRotateDyn(DepictorPort ThePort, DefContext Dcon, boolean bound, boolean Pos) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { "_d1", this };
		Object[] RHS = { " ", " ( UnitOf( '~glo' \\- ", "_hd", this, " ) ) " };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);
		Dyn.tie("", "_&", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that rotates a depictor around its tip.
	*/
	private final DynRunner createBackRotateDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean Pos,
		boolean Add,
		Mvec Pt) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { "_d1", this };
		Object[] RHS = { " ", " ( UnitOf( '~glo' \\- '~tmpk_pt' ) ) " };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_hd", this };
		Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " < ", this, " >{ 0 } * ", "_d1", this };

		if (!Add)
			RHS2[1] = " \\- ";

		Dyn.changeExpression(LHS2, RHS2);
		Dyn.tie("", "_&", this);

		Dyn.makeConstant("~tmpk_pt", Pt, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an dilation mode control.
	*/
	private final ClickRec checkDilateControls(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) // ########################################################################
	{
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
				boolean Bool = true;
				boolean Add = false;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				if (/* DragThrough */
					true)
					Bool = false;
				Dyn = createBackDilateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo(), "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				if (/* !DragThrough && */
					 (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that dilates a depictor with the base kept fixed.
	*/
	private final DynRunner createFwdDilateDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		boolean Pos,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { this };

		if (/* DragThrough */
			true) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_d1",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);

			Object[] LHS2 = { "_ob", this };
			Object[] RHS2 = { " ( < ", this, " >{ 0 } ) * ", "_&ob", this, " / ( < ", "_&", this, " >{ 0 } ) " };

			Dyn.changeExpression(LHS2, RHS2);
		}
		else {
			Object[] RHS =
				{
					" ",
					Mult,
					" * magnitude( ",
					"_d1",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);

			Object[] LHS2 = { "_ob", this };
			Object[] RHS2 = { " ( < ", this, " >{ 0 } ) * ", "_&ob", this, " / ( < ", "_&", this, " >{ 0 } ) " };

			Dyn.changeExpression(LHS2, RHS2);
		}

		Dyn.tie("_d1", "_&d1", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that dilates a depictor with the base kept fixed.
	*/
	private final DynRunner createObFwdDilateDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		boolean Pos,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { "_ob", this };

		if (/* DragThrough */
			true) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_d1",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" + ",
					" < ",
					"_&ob",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);

			Object[] LHS2 = { this };
			Object[] RHS2 = { "_ob", this, " * ( < ", "_&", this, " >{ 0 } ) / ", "_&ob", this };

			Dyn.changeExpression(LHS2, RHS2);
		}
		else {
			Object[] RHS =
				{
					" ",
					Mult,
					" * magnitude( ",
					"_d1",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" + ",
					" < ",
					"_&ob",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);

			Object[] LHS2 = { this };
			Object[] RHS2 = { "_ob", this, " * ( < ", "_&", this, " >{ 0 } ) / ", "_&ob", this };

			Dyn.changeExpression(LHS2, RHS2);
		}

		Dyn.tie("_d1", "_&d1", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that dilates a depictor with the base kept fixed.
	*/
	private final DynRunner createDxFwdDilateDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		boolean Pos,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { this };

		if (/* DragThrough */
			true) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_d2",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" * ",
					"_ob",
					this,
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);
		}
		else {
			Object[] RHS =
				{
					" ",
					Mult,
					" * magnitude( ",
					"_d2",
					this,
					" dot ( '~glo' \\- ",
					"_hd",
					this,
					" ) ) ",
					" * ",
					"_ob",
					this,
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);
		}

		Dyn.tie("_d2", "_&d2", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that dilates a depictor with the tip kept fixed.
	*/
	private final DynRunner createBackDilateDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean Pos,
		boolean Add,
		Mvec Pt,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { this };

		if (/* DragThrough */
			true) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_&d1",
					this,
					" dot ( '~glo' \\- '~tmpk_pt' ) ) ",
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);
		}
		else {
			Object[] RHS =
				{
					" ",
					Mult,
					" * magnitude( ",
					"_&d1",
					this,
					" dot ( '~glo' \\- '~tmpk_pt' ) ) ",
					" + ",
					" < ",
					"_&",
					this,
					" >{ 1 , 2 }" };

			if (!Pos)
				RHS[0] = " - ";

			Dyn.changeExpression(LHS, RHS);
		}

		if (/* DragThrough */
			true) {
			Object[] LHS2 = { "_hd", this };
			Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " < ", this, " >{ 0 } * ", "_d1", this };

			if (!Add)
				RHS2[1] = " \\- ";

			Dyn.changeExpression(LHS2, RHS2);
		}
		else {
			Object[] LHS2 = { "_hd", this };
			Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " magnitude( < ", this, " >{ 0 } ) * ", "_d1", this };

			if (!Add)
				RHS2[1] = " \\- ";

			Dyn.changeExpression(LHS2, RHS2);
		}

		/* if( !DragThrough )
			{
			dyn.tie( "_d1" , "_&d1" , this );
			} */

		Dyn.makeConstant("~tmpk_pt", Pt, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an accessory mode control.
	*/
	private final ClickRec checkAccControls(
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Pos = true;
				boolean Dir = true;

				if (getVect().getBasis() < 0.0) {
					Pos = false;
					if (/* DragThrough */
						true)
						Dir = false;
				}

				Dyn = createNonthrAccDyn(ThePort, Dcon, bound, Pos, Dir);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Pos = true;
				boolean Dir = true;

				if (getVect().getBasis() < 0.0) {
					Pos = false;
					if (/* DragThrough */
						true)
						Dir = false;
				}

				Dyn = createObNonthrAccDyn(ThePort, Dcon, bound, Pos, Dir);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d1", "_&d1", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), mXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d1", "_&d1", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), dXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d2", "_&d2", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Creates a DynRunner for an accessory mode drag.
	*/
	private final DynRunner createNonthrAccDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		boolean Pos,
		boolean Dir) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS = { this };
		Object[] RHS = { " ", " magnitude( '~glo' \\- ", "_hd", this, " ) ", " + ", " < ", "_&", this, " >{ 1 , 2 }" };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_d1", this };
		Object[] RHS2 = { " ", " UnitOf( '~glo' \\- ", "_hd", this, " ) " };

		if (!Dir)
			RHS2[0] = " - ";

		Dyn.changeExpression(LHS2, RHS2);

		Object[] LHS3 = { "_ob", this };
		Object[] RHS3 = { " ( < ", this, " >{ 0 } ) * ", "_&ob", this, " / ( < ", "_&", this, " >{ 0 } ) " };

		Dyn.changeExpression(LHS3, RHS3);

		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner for an accessory mode drag.
	*/
	private final DynRunner createObNonthrAccDyn(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		boolean Pos,
		boolean Dir) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS = { "_ob", this };
		Object[] RHS =
			{ " ", " magnitude( '~glo' \\- ", "_hd", this, " ) ", " + ", " < ", "_&ob", this, " >{ 1 , 2 }" };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_d1", this };
		Object[] RHS2 = { " ", " UnitOf( '~glo' \\- ", "_hd", this, " ) " };

		if (!Dir)
			RHS2[0] = " - ";

		Dyn.changeExpression(LHS2, RHS2);

		Object[] LHS3 = { this };
		Object[] RHS3 = { "_ob", this, " * ( < ", "_&", this, " >{ 0 } ) / ", "_&ob", this };

		Dyn.changeExpression(LHS3, RHS3);

		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	private final ClickRec checkControls(
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "2.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((oBGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				Dyn = createObFwdDilateDyn(ThePort, Dcon, bound, Bool, "2.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				if (/* DragThrough && */
					 (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((d1GetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				if (/* DragThrough && */
					 (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createObFwdRotateDyn(ThePort, Dcon, bound, Bool);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d1", "_&d1", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), mXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d2", "_&d2", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), dXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d2", "_&d2", this);
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
	private final ClickRec checkGeoPadControls(
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

		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((oBGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, mXGetPoint(Dcon).x, mXGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				Dyn = createObFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, dXGetPoint(Dcon).x, dXGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				boolean Bool = true;
				/* if( !DragThrough && ( getVect().getBasis() < 0.0 ) ) 
					Bool = false; */
				Dyn = createDxFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d1", "_&d1", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), mXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d1", "_&d1", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), dXGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_d2", "_&d2", this);
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
		if (MyRec.getValue() == DelHd) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == DelD1) {
			Object[] Form = { "_d1", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == DelD2) {
			Object[] Form = { "_d2", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == DelOb) {
			Object[] Form = { "_ob", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == DelVect) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == DelDepic) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Pdca1() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		D1SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		D2SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		OBSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		D1Movable.value = DepictorPort.MABLE_BY_ANY;
		D2Movable.value = DepictorPort.MABLE_BY_ANY;
		OBMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
		HDVectName = new FlexString();
		D1VectName = new FlexString();
		D2VectName = new FlexString();
		OBVectName = new FlexString();
	};
	public PointF hDGetPoint(DefContext Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};
	public PointF tLGetPoint(DefContext Dcon) {
		return (tLGetHex(Dcon).getLoc());
	};
	public PointF mXGetPoint(DefContext Dcon) {
		return (mXGetHex(Dcon).getLoc());
	};
	public PointF dXGetPoint(DefContext Dcon) {
		return (dXGetHex(Dcon).getLoc());
	};

	static Pdca1 UndoNode = null;

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
		UndoNode = new Pdca1();
		VectGlo.copyAllInfo(UndoNode.VectGlo);
		del1.copyAllInfo(UndoNode.del1);
		del2.copyAllInfo(UndoNode.del2);
		obv.copyAllInfo(UndoNode.obv);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpDel1 = new Mvec();
		Mvec HDTmpVect = new Mvec();
		Mvec OBTmpVect = new Mvec();
		Mvec TmpDel2 = new Mvec();

		VectGlo.copyAllInfo(TmpVect);
		del1.copyAllInfo(TmpDel1);
		HDHexGlo.copyAllInfo(HDTmpVect);
		del2.copyAllInfo(TmpDel2);
		obv.copyAllInfo(OBTmpVect);

		UndoNode.VectGlo.copyAllInfo(VectGlo);
		UndoNode.del1.copyAllInfo(del1);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.del2.copyAllInfo(del2);
		UndoNode.obv.copyAllInfo(obv);

		TmpVect.copyAllInfo(UndoNode.VectGlo);
		TmpDel1.copyAllInfo(UndoNode.del1);
		HDTmpVect.copyAllInfo(UndoNode.HDHexGlo);
		TmpDel2.copyAllInfo(UndoNode.del2);
		OBTmpVect.copyAllInfo(UndoNode.obv);

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
		switch (ToolMode) {}
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
		IntObj Active) // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	{
		DefContext Dcon = (DefContext) PrtCon;
		if (ControlsVisible) {

			//	if( ( ( ( getMovable() ).value & DepictorPort.MableAsgnMask ) == 0 ) &&
			//		( !bound ) )
			//		{
			//				
			//		TempRect = ThePort.instanceRect( 
			//			vectGetHex( Dcon ).getLoc().x ,
			//			vectGetHex( Dcon ).getLoc().y );
			//		if( TempRect.contains( InPt.x , InPt.y ) )
			//			{
			//			Object[] LHS1 = { this };
			//			Object[] RHS1 = { "$" };
			//			Object[] LHS2 = { LHS1 };
			//			Object[] RHS2 = { RHS1 };
			//			LHS[ 0 ] = LHS2;
			//			RHS[ 0 ] = RHS2;
			//			( Active ).value = 1;
			//			}
			//		}

			//	if( ( ( hDGetMovable() ).value & DepictorPort.MableAsgnMask ) == 0 )
			//		{
			//				
			//		TempRect = ThePort.instanceRect( 
			//			hDGetHex( Dcon ).getLoc().x ,
			//			hDGetHex( Dcon ).getLoc().y );
			//		if( TempRect.contains( InPt.x , InPt.y ) )
			//			{
			//			Object[] LHS1 = { "_hd" , this };
			//			Object[] RHS1 = { "$" };
			//			Object[] LHS2 = { LHS1 };
			//			Object[] RHS2 = { RHS1 };
			//			LHS[ 0 ] = LHS2;
			//			RHS[ 0 ] = RHS2;
			//			( Active ).value = 1;
			//			}
			//			
			//		}
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
		PointF OutPt) { // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1
		DefContext Dcon = (DefContext) PrtCon;

		if (ControlsVisible) {

			if (true) {}

			//	if( true )
			//		{
			//		double XDist = ( vectGetHex( Dcon ).getLoc() ).x 
			//			- InPt.x;
			//		double YDist = ( vectGetHex( Dcon ).getLoc() ).y 
			//			- InPt.y;
			//		double Dist = XDist * XDist + YDist * YDist;
			//		if( Dist < curDist.CurDist )
			//			{
			//			NewString.clearString();
			//			NewString.setInsertPoint( 0 );
			//			Object[] Form = { this };
			//			ThePort.insertFormattedString( Form , NewString );
			//			( OutPt ).setLocation( 
			//				vectGetHex( Dcon ).getLoc().x ,
			//				vectGetHex( Dcon ).getLoc().y );
			//			curDist.CurDist = Dist;
			//			}
			//		}
			//
			//
			//	if( true )
			//		{
			//		double XDist = ( tLGetHex( Dcon ).getLoc() ).x 
			//			- InPt.x;
			//		double YDist = ( tLGetHex( Dcon ).getLoc() ).y 
			//			- InPt.y;
			//		double Dist = XDist * XDist + YDist * YDist;
			//		if( Dist < curDist.CurDist )
			//			{
			//			NewString.clearString();
			//			NewString.setInsertPoint( 0 );
			//			Object[] Form = { this , " \\+ " , "_d1" , this };
			//			ThePort.insertFormattedString( Form , NewString );
			//			( OutPt ).setLocation( 
			//				tLGetHex( Dcon ).getLoc().x ,
			//				tLGetHex( Dcon ).getLoc().y );
			//			curDist.CurDist = Dist;
			//			}
			//		}
			//
			//	if( true )
			//		{
			//		double XDist = ( hDGetHex( Dcon ).getLoc() ).x 
			//			- InPt.x;
			//		double YDist = ( hDGetHex( Dcon ).getLoc() ).y 
			//			- InPt.y;
			//		double Dist = XDist * XDist + YDist * YDist;
			//		if( Dist < curDist.CurDist )
			//			{
			//			NewString.clearString();
			//			NewString.setInsertPoint( 0 );
			//			Object[] Form = { "_hd" , this };
			//			ThePort.insertFormattedString( Form , NewString );
			//			( OutPt ).setLocation( 
			//				hDGetHex( Dcon ).getLoc().x ,
			//				hDGetHex( Dcon ).getLoc().y );
			//			curDist.CurDist = Dist;
			//			}
			//		}
			//
			//	if( true )
			//		{
			//		double XDist = ( mXGetHex( Dcon ).getLoc() ).x 
			//			- InPt.x;
			//		double YDist = ( mXGetHex( Dcon ).getLoc() ).y 
			//			- InPt.y;
			//		double Dist = XDist * XDist + YDist * YDist;
			//		if( Dist < curDist.CurDist )
			//			{
			//			NewString.clearString();
			//			NewString.setInsertPoint( 0 );
			//			Object[] Form = { "_hd" , this , " \\+ " , "_d2" , this };
			//			ThePort.insertFormattedString( Form , NewString );
			//			( OutPt ).setLocation( 
			//				mXGetHex( Dcon ).getLoc().x ,
			//				mXGetHex( Dcon ).getLoc().y );
			//			curDist.CurDist = Dist;
			//			}
			//		}

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
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		/* String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		ThePort.loadMvecProperties(MyProp, key + ".D1port", del1);

		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		ThePort.loadMvecProperties(MyProp, key + ".D2port", del2);

		ThePort.loadMvecProperties(MyProp, key + ".OBport", obv); */

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

		ThePort.saveMvecProperties(MyProp, key + ".D1port", del1);

		if ((d1GetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_d1_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		ThePort.saveMvecProperties(MyProp, key + ".D2port", del2);

		if ((d2GetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_d2_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		ThePort.saveMvecProperties(MyProp, key + ".OBport", obv);

		if ((oBGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_ob_");
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

			D1VectName = (FlexString) (myv.getProperty("D1VectName"));
			D1Movable = (IntObj) (myv.getProperty("D1Movable"));
			VersionBuffer.chkNul(D1Movable);
			del1 = (Mvec) (myv.getProperty("D1HexGlo"));
			VersionBuffer.chkNul(del1);
			D1SelfAlloc = (IntObj) (myv.getProperty("D1SelfAlloc"));
			VersionBuffer.chkNul(D1SelfAlloc);

			D2VectName = (FlexString) (myv.getProperty("D2VectName"));
			D2Movable = (IntObj) (myv.getProperty("D2Movable"));
			VersionBuffer.chkNul(D2Movable);
			del2 = (Mvec) (myv.getProperty("D2HexGlo"));
			VersionBuffer.chkNul(del2);
			D2SelfAlloc = (IntObj) (myv.getProperty("D2SelfAlloc"));
			VersionBuffer.chkNul(D2SelfAlloc);

			OBVectName = (FlexString) (myv.getProperty("OBVectName"));
			OBMovable = (IntObj) (myv.getProperty("OBMovable"));
			VersionBuffer.chkNul(OBMovable);
			obv = (Mvec) (myv.getProperty("OBHexGlo"));
			VersionBuffer.chkNul(obv);
			OBSelfAlloc = (IntObj) (myv.getProperty("OBSelfAlloc"));
			VersionBuffer.chkNul(OBSelfAlloc); */
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

		if (D1VectName != null)
			myv.setProperty("D1VectName", D1VectName);
		myv.setProperty("D1Movable", D1Movable);
		myv.setProperty("D1HexGlo", del1);
		myv.setProperty("D1SelfAlloc", D1SelfAlloc);

		if (D2VectName != null)
			myv.setProperty("D2VectName", D2VectName);
		myv.setProperty("D2Movable", D2Movable);
		myv.setProperty("D2HexGlo", del2);
		myv.setProperty("D2SelfAlloc", D2SelfAlloc);

		if (OBVectName != null)
			myv.setProperty("OBVectName", OBVectName);
		myv.setProperty("OBMovable", OBMovable);
		myv.setProperty("OBHexGlo", obv);
		myv.setProperty("OBSelfAlloc", OBSelfAlloc);

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
			switch (PortMode) {
				case HDPort :
					tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
					break;
				case VectPort :
				case D1Port :
				case D2Port :
				case OBPort :
					tmp = DepictorPort.IO_DEF_OUTPUT_P2;
					break;
			}
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
	* Gets the domain of the current port of the depictor, not counting other depictors.
	*/
	public int portGetEntDomain() // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	{
		if ((PortMode % PrevPort) == VectPort)
			return (vectGetEntDomain());
		else
			return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
	}
	/**
	* Gets the domain of the variable associated with the depictor, not counting other depictors.
	*/
	public int vectGetEntDomain() {
		return (DepictorPort.DOM_SCA);
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
		String[] ret = { "", "_hd", "_d1", "_d2", "_ob" };
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
	private FlexString d1GetVectName() {
		return (D1VectName);
	};
	private IntObj d1GetMovable() {
		return (D1Movable);
	};
	private void d1SetMovable(IntObj in) {
		D1Movable = in;
	};
	private Mvec d1GetVect() {
		return (del1);
	};
	private IntObj d1GetSelfAlloc() {
		return (D1SelfAlloc);
	};
	private FlexString d2GetVectName() {
		return (D2VectName);
	};
	private IntObj d2GetMovable() {
		return (D2Movable);
	};
	private void d2SetMovable(IntObj in) {
		D2Movable = in;
	};
	private Mvec d2GetVect() {
		return (del2);
	};
	private IntObj d2GetSelfAlloc() {
		return (D2SelfAlloc);
	};
	private FlexString oBGetVectName() {
		return (OBVectName);
	};
	private IntObj oBGetMovable() {
		return (OBMovable);
	};
	private void oBSetMovable(IntObj in) {
		OBMovable = in;
	};
	private Mvec oBGetVect() {
		return (obv);
	};
	private IntObj oBGetSelfAlloc() {
		return (OBSelfAlloc);
	};

	public Hexar tLGetHex(DefContext in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(DefContext in) {
		return (in.getHex2());
	};
	public Hexar temp2GetHex(DefContext in) {
		return (in.getHex3());
	};
	public Hexar hDGetHex(DefContext in) {
		return (in.getHex4());
	};
	public Hexar mXGetHex(DefContext in) {
		return (in.getHex5());
	};
	public Hexar dXGetHex(DefContext in) {
		return (in.getHex6());
	};
	public Hexar temp3GetHex(DefContext in) {
		return (in.getHex7());
	};
	public Hexar temp4GetHex(DefContext in) {
		return (in.getHex8());
	};

	public CoordContext makeCoordContext() {
		return (new DefContext());
	};

	/**
	* Optional method to display help in a component.
	*/
	//	public static void displayVerdantiumHelp( VerdantiumComponent in )
	//		{ Pdca1Help.run( in ); } !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Pdca1.class));
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
	FlexString HDVectName;
	IntObj HDMovable = new IntObj();
	Mvec HDHexGlo = new Mvec();
	IntObj HDSelfAlloc = new IntObj();
	FlexString D1VectName;
	IntObj D1Movable = new IntObj();
	IntObj D1SelfAlloc = new IntObj();
	FlexString D2VectName;
	IntObj D2Movable = new IntObj();
	IntObj D2SelfAlloc = new IntObj();
	FlexString OBVectName;
	IntObj OBMovable = new IntObj();
	IntObj OBSelfAlloc = new IntObj();
};
