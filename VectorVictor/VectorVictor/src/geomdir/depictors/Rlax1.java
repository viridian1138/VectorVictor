




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
import java.text.NumberFormat;

import com.postgreen.vectorvictor.ScreenDensityRatio;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import meta.VersionBuffer;
import verdantium.EtherEvent;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;

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
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some more depictors.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Bug in depictor shape definition.                                    | Fixed the bug.
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

class RlaxContext extends DefContext {
	public RlaxContext(int MajorGraduationLevel, int MinorGraduationDelta) {
		super();
		int count;
		int max = 1 << (MajorGraduationLevel + 1);
		int mmax = 1 << MinorGraduationDelta;

		RulerPoints = new Hexar[max + 1];
		RulerLabels = new String[max + 1];
		Indexes = new int[mmax + 1];
		Px1 = new double[mmax + 1];
		Py1 = new double[mmax + 1];
		Px2 = new double[mmax + 1];
		Py2 = new double[mmax + 1];

		for (count = 0; count <= max; count++) {
			RulerPoints[count] = new Hexar();
			RulerLabels[count] = new String("tst");
		}

	}

	public final Hexar[] getRulerPoints() {
		return (RulerPoints);
	};
	public final String[] getRulerLabels() {
		return (RulerLabels);
	};
	public final int[] getIndexes() {
		return (Indexes);
	};
	public final double[] getPx1() {
		return (Px1);
	};
	public final double[] getPy1() {
		return (Py1);
	};
	public final double[] getPx2() {
		return (Px2);
	};
	public final double[] getPy2() {
		return (Py2);
	};
	public final int getPreviousScale() {
		return (PreviousScale);
	}
	public final void setPreviousScale(int in) {
		PreviousScale = in;
	}
	public final int getCurrentMajorGrad() {
		return (MajorGrad);
	}
	public final void setCurrentMajorGrad(int in) {
		MajorGrad = in;
	}
	public final boolean getPrevHasNeg() {
		return (PrevHasNeg);
	}
	public final void setPrevHasNeg(boolean in) {
		PrevHasNeg = in;
	}

	private boolean PrevHasNeg = false;
	private int MajorGrad = -50000;
	private int PreviousScale = -50000;
	private Hexar[] RulerPoints;
	private String[] RulerLabels;
	private int[] Indexes;
	private double[] Px1;
	private double[] Py1;
	private double[] Px2;
	private double[] Py2;
}

/**
* Depicts a real axis.  This measures a distance in terma of a unit defined by dragging.
* The "vector port"
* port defines the base points of the real axis.  The
* "_d1_" port and the "_d2_" port define the vectors to the end of the
* unit and measurement segments respectively.  The depictor always attempts to ensure 
* that "_d1_" and "_d2_" are positive scalar multiples of each other.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public class Rlax1 extends DrawObj implements Externalizable {
	final static int Match = 1;
	final static int NoMatch = 2;
	final static int VectPort = 1;
	final static int D1Port = 3;
	final static int D2Port = 4;
	final static int PrevPort = 100;

	final static int ManualDragVectPos = 1;
	final static int ManualDragVectDis = 2;
	final static int ManualDragMDPos = 3;
	final static int ManualDragMDDis = 4;
	final static int ManualDragVectMid = 5;
	final static int ManualDragMDMid = 6;
	final static int DragNone = 7;

	int MajorGraduationLevel = 3;
	int MinorGraduationDelta = 3;
	boolean HasNegative = false;
	Paint tFont = null;

	static transient int PortMode = 1;
	Mvec del1 = new Mvec();
	Mvec del2 = new Mvec();
	public void datCpy(Rlax1 out) {
		drDatCpy(out);
		/* out.HdPoint = HdPoint;
		out.TlPoint = TlPoint; */
	};
	public Meta copyNode() {
		Rlax1 temp = new Rlax1();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		Rlax1 temp = new Rlax1();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		Rlax1 temp = new Rlax1();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		Rlax1 temp = (Rlax1) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		Rlax1 temp = (Rlax1) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		Rlax1 temp = (Rlax1) in;
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
		Rlax1 temp = new Rlax1();
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		Rlax1 temp = (Rlax1) out;
		super.copyUser1Info(temp);
		(getVect()).copyAllInfo(temp.getVect());
	};
	public void wake() {};
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {
		ThePort.setNewPosAVec(this, getVect());
		ThePort.setNewDeltaVec(this, del1);

		Mvec tmp1 = new Mvec();
		Mvec tmp2 = new Mvec();
		Mvec RMag = new Mvec();
		ThePort.setNewDeltaVec(this, tmp1);
		del1.mcpy(tmp2);
		tmp1.magnitude();
		tmp2.magnitude();
		RMag.setBasis(1.0 / (tmp1.getBasis() * tmp2.getBasis()));
		del1.mult(RMag, del2);

		Object[] LHS = { "_d1", this, " wedge ", "_d2", this };
		Object[] RHS = { "0.0" };
		ThePort.addImplicitConstraint(LHS, RHS, this, 1);

		Object[] LHS2 = { "_d1", this, " dot ", "_d2", this };
		Object[] RHS2 = { "magnitude( ", "_d1", this, " dot ", "_d2", this, " ) " };
		ThePort.addImplicitConstraint(LHS2, RHS2, this, 2);
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((d1GetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)
			&& (((d2GetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)) {
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
		String D1Prefix = "_d1_";
		String D2Prefix = "_d2_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(D1Prefix) == 0)
			PortMode = D1Port;
		if (Prefix.stcmp(D2Prefix) == 0)
			PortMode = D2Port;

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
			case D1Port :
				temp = D1Movable;
				break;
			case D2Port :
				temp = D2Movable;
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
		}
	};
	/**
	* Gets the multivector associated with the current port.
	*/
	public Mvec portGetVect() {
		Mvec temp = null;
		Rlax1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.VectGlo;
				break;
			case D1Port :
				temp = ReadObj.del1;
				break;
			case D2Port :
				temp = ReadObj.del2;
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
		Rlax1 ReadObj = this;
		if (PortMode >= PrevPort)
			ReadObj = UndoNode;

		switch (PortMode % PrevPort) {
			case VectPort :
				temp = ReadObj.SelfAlloc;
				break;
			case D1Port :
				temp = ReadObj.D1SelfAlloc;
				break;
			case D2Port :
				temp = ReadObj.D2SelfAlloc;
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
		RlaxContext Dcon = (RlaxContext) PrtCon;
		tLGetHex(Dcon).getGlo().setBasis1((getVect()).getBasis1() + (del1).getBasis1());
		tLGetHex(Dcon).getGlo().setBasis2((getVect()).getBasis2() + (del1).getBasis2());

		mXGetHex(Dcon).getGlo().setBasis1((getVect()).getBasis1() + (del2).getBasis1());
		mXGetHex(Dcon).getGlo().setBasis2((getVect()).getBasis2() + (del2).getBasis2());
		ThePort.hexloc(VectGlo, bound, VectGlo, vectGetHex(Dcon));
		ThePort.hexloc(VectGlo, bound, tLGetHex(Dcon));
		ThePort.hexloc(VectGlo, bound, mXGetHex(Dcon));

		if (Dcon.getLine1() == null) {
			Dcon.setLine1(new RectF());
		}

		switch (ToolMode) {
			case DepictorPort.TranslateMode :
			case DepictorPort.SelectionMode :
			case DepictorPort.FreeTransformationMode :
				{
					Mvec t1 = new Mvec();
					VectGlo.vadd(tLGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp1GetHex(Dcon).getGlo());
					VectGlo.vadd(mXGetHex(Dcon).getGlo(), t1);
					t1.scale(0.5, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(VectGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(VectGlo, bound, temp2GetHex(Dcon));
				}
				break;
			case DepictorPort.RotationMode :
			case DepictorPort.DilationMode :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					double oneT = 1.0 / 3.0;
					double twoT = 2.0 / 3.0;
					VectGlo.scale(twoT, t1);
					tLGetHex(Dcon).getGlo().scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					VectGlo.scale(oneT, t1);
					tLGetHex(Dcon).getGlo().scale(twoT, t2);
					t1.add(t2, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(VectGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(VectGlo, bound, temp2GetHex(Dcon));
				}
				break;
		}

		int count;
		double MinDepth = 30.0;
		int PrevMajorGrad = Dcon.getCurrentMajorGrad();
		int MajorGrad = MajorGraduationLevel;
		int MajGrad = 1 << MajorGraduationLevel;
		double Log2 = Math.log(2);
		boolean PrevHasNeg = Dcon.getPrevHasNeg();

		double kx1 = del1.getBasis1();
		double ky1 = del1.getBasis2();
		double klen = Math.sqrt(kx1 * kx1 + ky1 * ky1);
		double ux1 = del2.getBasis1();
		double uy1 = del2.getBasis2();
		double ulen = Math.sqrt(ux1 * ux1 + uy1 * uy1);

		double GloVal = 1000.0;
		if (ulen < 0.0001)
			GloVal = 1000.0;
		else
			GloVal = klen / ulen;

		double tmp0 = Math.log(GloVal) / Log2;
		int tmp1 = (int) tmp0;
		double tmp2 = Math.pow(2, tmp1);

		if (((double) tmp2 - tmp0) > 0.0001) {
			tmp1++;
			tmp2 = tmp2 * 2.0;
		}

		double tmp3 = tmp2 / ((double) MajGrad);

		double x1 = vectGetHex(Dcon).getPtx();
		double y1 = vectGetHex(Dcon).getPty();
		double x2 = tLGetHex(Dcon).getPtx();
		double y2 = tLGetHex(Dcon).getPty();
		double delx = x2 - x1;
		double dely = y2 - y1;
		double len = Math.sqrt(delx * delx + dely * dely) * tmp2 / GloVal;

		if ((len / ((double) MajGrad)) < MinDepth) {
			double MajG = Math.log(len / MinDepth) / Log2;
			MajorGrad = (int) MajG;
			if (MajorGrad < 0)
				MajorGrad = 0;
			MajGrad = 1 << MajorGrad;
			tmp3 = tmp2 / ((double) MajGrad);
		}

		Mvec tmp = new Mvec();

		if (HasNegative) {
			for (count = 0; count <= (2 * MajGrad); count++) {
				double MyDist = (count - MajGrad) * tmp3;
				del1.scale(MyDist * ulen / klen, tmp);
				tmp.vadd(VectGlo, ((Dcon.getRulerPoints())[count]).getGlo());
				ThePort.hexloc(VectGlo, bound, (Dcon.getRulerPoints())[count]);

				if ((Dcon.getPreviousScale() != tmp1) || (MajorGrad != PrevMajorGrad) || (PrevHasNeg != HasNegative)) {
					(Dcon.getRulerLabels())[count] = (new Double(MyDist).toString());
				}
			}
		}
		else {
			for (count = 0; count <= MajGrad; count++) {
				double MyDist = count * tmp3;
				del1.scale(MyDist * ulen / klen, tmp);
				tmp.vadd(VectGlo, ((Dcon.getRulerPoints())[count]).getGlo());
				ThePort.hexloc(VectGlo, bound, (Dcon.getRulerPoints())[count]);

				if ((Dcon.getPreviousScale() != tmp1) || (MajorGrad != PrevMajorGrad) || (PrevHasNeg != HasNegative)) {
					(Dcon.getRulerLabels())[count] = (new Double(MyDist).toString());
				}
			}
		}

		Dcon.setPrevHasNeg(HasNegative);
		Dcon.setCurrentMajorGrad(MajorGrad);
		Dcon.setPreviousScale(tmp1);
	}

	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, int ToolMode) {
		double CirLen = 10.0;
		RlaxContext Dcon = (RlaxContext) PrtCon;
		int MajorGrad = Dcon.getCurrentMajorGrad();
		p.setStyle(Style.STROKE);

		int max;
		if (HasNegative)
			max = 1 << (MajorGrad + 1);
		else
			max = 1 << MajorGrad;

		int MaxDelta = 1 << MinorGraduationDelta;

		double x1 = ((Dcon.getRulerPoints())[0]).getPtx();
		double y1 = ((Dcon.getRulerPoints())[0]).getPty();
		double x2 = ((Dcon.getRulerPoints())[max]).getPtx();
		double y2 = ((Dcon.getRulerPoints())[max]).getPty();
		double delx = x2 - x1;
		double dely = y2 - y1;
		double len = Math.sqrt(delx * delx + dely * dely);

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
			g.drawLine((float)x1, (float)y1, (float)x2, (float)y2, p);
			g.drawLine(
				vectGetHex(Dcon).getLoc().x,
				vectGetHex(Dcon).getLoc().y,
				mXGetHex(Dcon).getLoc().x,
				mXGetHex(Dcon).getLoc().y,p);
		}

		int count;
		Hexar MyHex = null;
		double xa;
		double ya;
		double xb;
		double yb;
		double xi;
		double yi;
		int Indx;
		double ptx1, pty1, ptx2, pty2;
		double pax1, pay1;
		int StkIndx = -1;

		p.setTextSize( tFont.getTextSize() );
		p.setTypeface( tFont.getTypeface() );

		if (tmp)
			for (count = 0; count <= max; count++) {
				MyHex = (Dcon.getRulerPoints())[count];
				xi = MyHex.getPtx();
				yi = MyHex.getPty();
				xa = xi + CirLen * dely / len;
				ya = yi - CirLen * delx / len;
				xb = xi - CirLen * dely / len;
				yb = yi + CirLen * delx / len;
				g.drawLine((float)xa, (float)ya, (float)xb, (float)yb, p);
				g.drawText((Dcon.getRulerLabels())[count], (float) xb + 3, (float) yb + 3, p);

				StkIndx = -1;
				if ((count != max) && (MinorGraduationDelta != 0)) {
					StkIndx++;
					(Dcon.getIndexes())[StkIndx] = 1;
					(Dcon.getPx1())[StkIndx] = xi;
					(Dcon.getPy1())[StkIndx] = yi;
					(Dcon.getPx2())[StkIndx] = ((Dcon.getRulerPoints())[count + 1]).getPtx();
					(Dcon.getPy2())[StkIndx] = ((Dcon.getRulerPoints())[count + 1]).getPty();
				}

				while (StkIndx != -1) {
					Indx = (Dcon.getIndexes())[StkIndx];
					ptx1 = (Dcon.getPx1())[StkIndx];
					pty1 = (Dcon.getPy1())[StkIndx];
					ptx2 = (Dcon.getPx2())[StkIndx];
					pty2 = (Dcon.getPy2())[StkIndx];
					StkIndx--;

					pax1 = (ptx1 + ptx2) / 2.0;
					pay1 = (pty1 + pty2) / 2.0;
					xb = pax1 + CirLen * dely / (len * Indx);
					yb = pay1 - CirLen * delx / (len * Indx);

					g.drawLine((float)pax1, (float)pay1, (float)xb, (float)yb, p);

					if (Indx < MaxDelta) {
						Indx = Indx << 1;
						StkIndx++;
						(Dcon.getIndexes())[StkIndx] = Indx;
						(Dcon.getPx1())[StkIndx] = ptx1;
						(Dcon.getPy1())[StkIndx] = pty1;
						(Dcon.getPx2())[StkIndx] = pax1;
						(Dcon.getPy2())[StkIndx] = pay1;
						StkIndx++;
						(Dcon.getIndexes())[StkIndx] = Indx;
						(Dcon.getPx1())[StkIndx] = pax1;
						(Dcon.getPy1())[StkIndx] = pay1;
						(Dcon.getPx2())[StkIndx] = ptx2;
						(Dcon.getPy2())[StkIndx] = pty2;
					}
				}
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
				case DepictorPort.FreeTransformationMode :
					{
						ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						ThePort.paintBlueKnob(g, p, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);

						ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

						ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

					}
					break;
				case DepictorPort.AssignMode :
					{

						if ((((getMovable().value) & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
						}

						ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						ThePort.paintBlueKnob(g, p, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);

					}
					break;
				case DepictorPort.AccessoryTransMode :
					{

						ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						ThePort.paintBlueKnob(g, p, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);

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
	* Renders depictor tools for selection mode.
	*/
	protected void drawSelectionTools(
		DepictorPort ThePort,
		DefContext Dcon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

		ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders depictor tools for text mode.
	*/
	protected void drawTextTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		/* ThePort.paintBlueKnob( g ,
		        vectGetHex( Dcon ).getLoc().x + TextOffsetX - XOffset ,
		        vectGetHex( Dcon ).getLoc().y + TextOffsetY - YOffset ); */

	};
	/**
	* Renders depictor tools for rotation mode.
	*/
	protected void drawRotateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (true) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders depictor tools for dilation mode.
	*/
	protected void drawDilateTools(DepictorPort ThePort, DefContext Dcon, boolean bound, Canvas g, Paint p, int ToolMode) {
		if (true) {
			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Determines whether the user clicked on the real axis.  If so, causes the ruler value
	* at the point of the mouse-click to be appended to the status list.  This is done mainly
	* to support the educational project.  After the check is completed, calls 
	* {@link #clickedInRegionComp( DepictorPort ThePort , CoordContext PrtCon , boolean bound , PointF LocEvent , int ToolMode ) }.
	*/
	public ClickRec clickedInRegion(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF LocEvent,
		int ToolMode) {
		ClickRec MyRec = clickedInRegionComp(ThePort, PrtCon, bound, LocEvent, ToolMode);

		if ((MyRec == null)
			&& ((ToolMode == DepictorPort.FreeTransformationMode) || (ToolMode == DepictorPort.AccessoryTransMode))) {
			RlaxContext Dcon = (RlaxContext) PrtCon;
			double BariText = 1.0;
			double OffsetText = 1.0;

			Hexar MyHex = new Hexar();
			PointF InPt = LocEvent;
			Mvec VectVal = new Mvec();
			Mvec InVect = new Mvec();
			Mvec dprod = new Mvec();
			VectVal.setBasis1(del2.getBasis1());
			VectVal.setBasis2(del2.getBasis2());
			ThePort.hexglo(InPt.x, InPt.y, VectGlo, bound, MyHex);
			MyHex.getGlo().vsub(VectGlo, InVect);
			VectVal.dot(InVect, dprod);
			double MultVal = dprod.getBasis();
			double d1 = VectVal.getBasis1();
			double d2 = VectVal.getBasis2();
			double dn = d1 * d1 + d2 * d2;

			if (dn < 0.001)
				BariText = 0.0;
			else
				BariText = MultVal / dn;
			double FinalVal = BariText;

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
				OffsetText = 0.4999;

			int PrevMajorGrad = Dcon.getPreviousScale();
			double Major = Math.pow(2, PrevMajorGrad);

			double NegBar = 0.0;
			if (HasNegative)
				NegBar = -Major;

			if ((FinalVal >= NegBar) && (FinalVal <= Major) && (Math.abs(OffsetText) < 0.5)) {
				NumberFormat MyForm = NumberFormat.getInstance();
				MyForm.setMaximumFractionDigits(3);
			}
		}

		return (MyRec);
	}
	/**
	* Returns whether the user clicked in the gravity field of an erase mode control.
	*/
	public ClickRec clickedInRegionComp(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF LocEvent,
		int ToolMode) {
		RlaxContext Dcon = (RlaxContext) PrtCon;
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

			}
		}

		return null;
	};

	/**
	* Returns whether the user clicked in the gravity field of an erase mode control.
	*/
	ClickRec checkEraseControls(
		DepictorPort ThePort,
		RlaxContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragVectDis);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (noSymBindings()) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				NewRec.setValue(ManualDragMDPos);
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { this };
				Object[] RHS = { "'~glo' \\- 0.5 * ", "_d1", this };
				Dyn.changeExpression(LHS, RHS);
				Dyn.tie("_d1", "_&d1", this);
				Dyn.tie("_d2", "_&d2", this);
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
		RlaxContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;

		Priority = shapeGravityField(Dcon, InPt);
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
		return null;
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

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "_d1", this };
				Object[] RHS = { "UnitOf( ", "'~glo'", " \\- ", this, " ) ", " * magnitude( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_d2", this };
				Object[] RHS2 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { "_&", this, " \\+ ", "_&d1", this };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "_d1", this };
				Object[] RHS2 =
					{ "- UnitOf( ", "'~glo'", " \\- ", "'~tmp_pt'", " ) ", " * magnitude( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { this };
				Object[] RHS3 = { "'~tmp_pt'", " \\- ", "_d1", this };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { "_d2", this };
				Object[] RHS4 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS4, RHS4);

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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner();
				Object[] LHS = { "'~tmp_pt'" };
				Object[] RHS = { "_&", this, " \\+ ", "_&d1", this };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "'~tmp_ve'" };
				Object[] RHS2 = { "UnitOf( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS3 = { "_d1", this };
				Object[] RHS3 =
					{ "- '~tmp_ve'", " * 1.5 * ( ( ", "'~glo'", " \\- ", "'~tmp_pt'", " ) dot '~tmp_ve' ) " };
				Dyn.changeExpression(LHS3, RHS3);

				Object[] LHS4 = { this };
				Object[] RHS4 = { "'~tmp_pt'", " \\- ", "_d1", this };
				Dyn.changeExpression(LHS4, RHS4);

				Object[] LHS5 = { "_d2", this };
				Object[] RHS5 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS5, RHS5);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "_d1", this };
				Object[] RHS2 = { "'~tmp_ve'", " * 1.5 * ( ( ", "'~glo'", " \\- ", "_&", this, " ) dot '~tmp_ve' ) " };
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { "_d2", this };
				Object[] RHS3 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
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
	* Returns whether the user clicked in the gravity field of an free transformation mode control.
	*/
	ClickRec checkControls(DepictorPort ThePort, RlaxContext Dcon, boolean bound, PointF InPt, int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "_d1", this };
				Object[] RHS2 = { "'~tmp_ve'", " * 2.0 * ( ( ", "'~glo'", " \\- ", "_&", this, " ) dot '~tmp_ve' ) " };
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { "_d2", this };
				Object[] RHS3 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS3, RHS3);

				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "'~tmp_ve'" };
				Object[] RHS = { "UnitOf( ", "_&d2", this, " ) " };
				Dyn.changeExpression(LHS, RHS, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

				Object[] LHS2 = { "_d2", this };
				Object[] RHS2 = { "'~tmp_ve'", " * 2.0 * ( ( ", "'~glo'", " \\- ", "_&", this, " ) dot '~tmp_ve' ) " };
				Dyn.changeExpression(LHS2, RHS2);

				Object[] LHS3 = { "_d1", this };
				Object[] RHS3 = { "magnitude( ", "_&d1", this, " ) * ", "UnitOf( ", "_d2", this, " ) " };
				Dyn.changeExpression(LHS3, RHS3);

				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}
		}

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "_d1", this };
				Object[] RHS = { "UnitOf( ", "'~glo'", " \\- ", this, " ) ", " * magnitude( ", "_&d1", this, " ) " };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_d2", this };
				Object[] RHS2 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "_d2", this };
				Object[] RHS = { "UnitOf( ", "'~glo'", " \\- ", this, " ) ", " * magnitude( ", "_&d2", this, " ) " };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_d1", this };
				Object[] RHS2 = { "magnitude( ", "_&d1", this, " ) * ", "UnitOf( ", "_d2", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, vectGetHex(Dcon), null, "_&");
				Dyn.tie("_d1", "_&d1", this);
				Dyn.tie("_d2", "_&d2", this);
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
		RlaxContext Dcon,
		boolean bound,
		PointF InPt,
		int ToolMode) {
		APPRec NewRec = new APPRec();
		APPRec ret = null;
		double Priority = ClickRec.MinPriority + 1;
		int LastClick = NoMatch;
		DynRunner Dyn = null;

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "_d1", this };
				Object[] RHS = { "'~glo' \\- ", this };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_d2", this };
				Object[] RHS2 = { "magnitude( ", "_&d2", this, " ) * ", "UnitOf( ", "_d1", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (true) {
			Priority = ThePort.defaultGravityField(InPt, mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = ThePort.createDynRunner(bound, VectGlo);
				Object[] LHS = { "_d2", this };
				Object[] RHS = { "'~glo' \\- ", this };
				Dyn.changeExpression(LHS, RHS);

				Object[] LHS2 = { "_d1", this };
				Object[] RHS2 = { "magnitude( ", "_&d1", this, " ) * ", "UnitOf( ", "_d2", this, " ) " };
				Dyn.changeExpression(LHS2, RHS2);
				Dyn.tie("", "_&", this);
				NewRec.ClickPriority = Priority;
				ret = NewRec;
				LastClick = Match;
			}

		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = shapeGravityField(Dcon, InPt);
			if ((Priority <= ClickRec.MinPriority) && (LastClick == NoMatch)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, vectGetHex(Dcon), null, "_&");
				Dyn.tie("_d1", "_&d1", this);
				Dyn.tie("_d2", "_&d2", this);
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

		if (MyRec.getValue() == ManualDragVectDis) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
			(getVect()).setBasis1((getVect()).getBasis1() + Delta1);
			(getVect()).setBasis2((getVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == ManualDragMDPos) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Rlax1() {
		super();
		tFont = new Paint();
		tFont.setTextSize( 12 );
		tFont.setTypeface(Typeface.create(Typeface.SERIF,
                Typeface.NORMAL));
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		D1SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		D2SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		Movable.value = DepictorPort.MABLE_BY_ANY;
		D1Movable.value = DepictorPort.MABLE_BY_ANY;
		D2Movable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
		D1VectName = new FlexString();
		D2VectName = new FlexString();
	};

	static Rlax1 UndoNode = null;

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
		UndoNode = new Rlax1();
		VectGlo.copyAllInfo(UndoNode.VectGlo);
		del1.copyAllInfo(UndoNode.del1);
		del2.copyAllInfo(UndoNode.del2);
		UndoNode.HasNegative = HasNegative;
	}
	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpDel1 = new Mvec();
		Mvec TmpDel2 = new Mvec();

		VectGlo.copyAllInfo(TmpVect);
		del1.copyAllInfo(TmpDel1);
		del2.copyAllInfo(TmpDel2);

		UndoNode.VectGlo.copyAllInfo(VectGlo);
		UndoNode.del1.copyAllInfo(del1);
		UndoNode.del2.copyAllInfo(del2);

		TmpVect.copyAllInfo(UndoNode.VectGlo);
		TmpDel1.copyAllInfo(UndoNode.del1);
		TmpDel2.copyAllInfo(UndoNode.del2);

		boolean TmpNegative;

		TmpNegative = HasNegative;
		HasNegative = UndoNode.HasNegative;
		UndoNode.HasNegative = TmpNegative;

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
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(vectGetHex(Dcon).getLoc().x, vectGetHex(Dcon).getLoc().y);
					CurDist.CurDist = Dist;
				}
			}

			if (true) {
				double XDist = (tLGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (tLGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { this, " \\+ ", "_d1", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
					CurDist.CurDist = Dist;
				}
			}

			if (true) {
				double XDist = (mXGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (mXGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.CurDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { this, " \\+ ", "_d2", this };
					ThePort.insertFormattedString(Form, NewString);
					(OutPt).set(mXGetHex(Dcon).getLoc().x, mXGetHex(Dcon).getLoc().y);
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

		ThePort.loadMvecProperties(MyProp, key + ".D1port", del1);

		ThePort.loadMvecProperties(MyProp, key + ".D2port", del2);

		String tmp = MyProp.getProperty(key + ".MajorGrad");
		if (tmp != null)
			MajorGraduationLevel = MyProp.getInt(key + ".MajorGrad");

		tmp = MyProp.getProperty(key + ".MinorGradDelta");
		if (tmp != null)
			MinorGraduationDelta = MyProp.getInt(key + ".MinorGradDelta");

		tmp = MyProp.getProperty(key + ".HasNegative");
		if (tmp != null)
			HasNegative = MyProp.getBoolean(key + ".HasNegative"); */

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		/* String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".D1port", del1);

		ThePort.saveMvecProperties(MyProp, key + ".D2port", del2);

		MyProp.putInt(key + ".MajorGrad", MajorGraduationLevel);

		MyProp.putInt(key + ".MinorGradDelta", MinorGraduationDelta);

		MyProp.putBoolean(key + ".HasNegative", HasNegative); */

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

			MajorGraduationLevel = myv.getInt("MajorGraduationLevel");
			MinorGraduationDelta = myv.getInt("MinorGraduationDelta");
			HasNegative = myv.getBoolean("HasNegative"); */
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

		myv.setInt("MajorGraduationLevel", MajorGraduationLevel);
		myv.setInt("MinorGraduationDelta", MinorGraduationDelta);
		myv.setBoolean("HasNegative", HasNegative);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

	/**
	* Gets the gravity field from "in" to the current shape using the coordinate context Dcon.
	*/
	public double shapeGravityField(RlaxContext Dcon, PointF in) {
		int max = 0;
		int MajorGrad = MajorGraduationLevel;
		if (HasNegative)
			max = 1 << (MajorGrad + 1);
		else
			max = 1 << MajorGrad;

		double x1 = ((Dcon.getRulerPoints())[0]).getPtx();
		double y1 = ((Dcon.getRulerPoints())[0]).getPty();
		double x2 = ((Dcon.getRulerPoints())[max]).getPtx();
		double y2 = ((Dcon.getRulerPoints())[max]).getPty();

		double lw = (getBasicFrontLineStrokeWidth()) / 2.0;

		double d1 = Math.max(getDistanceFromLinearSeg(in, x1, y1, x2, y2), 1.0 );
		double maxd1 = Math.max(11.0 * ScreenDensityRatio.getRatio() - lw, 2.0 * ScreenDensityRatio.getRatio() );
		if (d1 > maxd1)
			d1 = ClickRec.MinPriority + 1;

		double d2 = Math.max(getDistanceFromLinearSeg(in, vectGetHex(Dcon).getLoc(), mXGetHex(Dcon).getLoc()), 1.0 );
		double maxd2 = Math.max(7.0 * ScreenDensityRatio.getRatio() - lw, 2.0 * ScreenDensityRatio.getRatio() );
		if (d2 > maxd2)
			d2 = ClickRec.MinPriority + 1;

		double dist = Math.min(d1, d2);
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
			switch (PortMode) {
				case VectPort :
					tmp = DepictorPort.IO_DEF_OUTPUT_P2 + DepictorPort.IO_DEF_SCALE_TOLERANCE;
					break;
				case D1Port :
				case D2Port :
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
	* Gets the input/output state of the port associated with the variable's value for just this depictor.
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
		String[] ret = { "", "_d1", "_d2" };
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
//		return ((new RlaxCustControl(this, ThePort, InAp)));
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

	public Hexar tLGetHex(DefContext in) {
		return (in.getHex1());
	};
	public Hexar temp1GetHex(DefContext in) {
		return (in.getHex2());
	};
	public Hexar temp2GetHex(DefContext in) {
		return (in.getHex3());
	};
	public Hexar mXGetHex(DefContext in) {
		return (in.getHex5());
	};
	public Hexar vectGetHex(DefContext in) {
		return (in.getHex6());
	};

	public CoordContext makeCoordContext() {
		return (new RlaxContext(MajorGraduationLevel, MinorGraduationDelta));
	};

	public boolean getHasNegative() {
		return (HasNegative);
	}
	public void setHasNegative(boolean in) {
		HasNegative = in;
	}

	/**
	* Optional method to display help in a component.
	*/
//	public static void displayVerdantiumHelp(VerdantiumComponent in) {
//		Rlax1Help.run(in);
//	}

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Rlax1.class));
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
	FlexString D1VectName;
	IntObj D1Movable = new IntObj();
	IntObj D1SelfAlloc = new IntObj();
	FlexString D2VectName;
	IntObj D2Movable = new IntObj();
	IntObj D2SelfAlloc = new IntObj();

	

};
