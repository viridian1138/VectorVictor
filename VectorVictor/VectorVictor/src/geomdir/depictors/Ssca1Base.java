


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
import verdantium.mathimage.MathImage;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Color;
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
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | Bug in translation handler.                                          | Fixed bug.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/16/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some depictors.
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
*    | 08/28/2002            | Thorn Green (viridian_1138@yahoo.com)           | Box on depictor end, and cross-tag on unit (GeoSlate).               | Changes depictor appearance to match this.
*    | 09/08/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed methods for setting label position.                           | Added methods for setting label position.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Made a series of small cosmetic changes.                             | Made a series of small cosmetic changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Made a series of small cosmetic changes.                             | Made a series of small cosmetic changes.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Default labels too far from diagram (GeoCard).                       | Made default labels tighter.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed external port for front line width. (GeoCard).                | Added _flw port.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Fix some lingering problems with _flw port.                          | Problems addressed.
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Allow for both end and unit cross tac.                               | Put in code to do this.  Also changed default label spacing.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 10/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Bug in width change method.                                          | Fixed bug.
*    | 10/08/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make unit tac follow sign.                                           | Made unit tack follow sign.
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
* Depicts the scalar-valued part of a multivector.  This implementation combines
* the standard and alternate sense for the depictor into a single class.  This
* implementation "feature" was requested by David Halliday.  If one does not like it,
* please complain to him.  The ports available are as follows:  The "_hd_" port defines
* the base point of the scalar, and the "_di_" port defines the direction in which the
* scalar points.  Always use a unit vector when setting the "_di_" port.  The tip of
* the scalar would then have a position equal to "_hd_" plus the value of the scalar
* times "_di_".  For a type-B scalar reverse the definitions for base and tip so that
* the base is "_hd_" (e.g. the tip) minus "_di_" times the value of the scalar.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public abstract class Ssca1Base<T extends Ssca1Base, Q extends DefContext, R extends APPRec<Ssca1Base.Ssca1Evt,?,Q>> extends DrawObj<T,Q,R> implements Externalizable {
	final static int VectPort = 1;
	final static int HDPort = 2;
	final static int DIPort = 3;
	final static int FLWPort = 4;
	final static int PrevPort = 100;

	protected static enum Ssca1Evt {
		MANUAL_DRAG_VECT_POS,
		MANUAL_DRAG_VECT_DIS,
		MANUAL_DRAG_VEC_REAL,
		MANUAL_DRAG_VEC_IM,
		MANUAL_DRAG_VECT_CP,
		DRAG_NONE
	};

	int DepicType = 0;
	boolean DragThrough = true;
	public final static int TypeA = 0;
	public final static int TypeB = 1;

	static transient int PortMode = 1;
	Mvec dir = new Mvec();
	Mvec flw = new Mvec();
	transient Mvec gbv = new Mvec();

	protected Mvec TemptxtGlo = new Mvec();
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
		if (!state) {
			Mvec tmp = new Mvec();
			ThePort.setNewDeltaVec(this, tmp);
			double x = tmp.getBasis1();
			double y = tmp.getBasis2();
			double len = Math.sqrt(x * x + y * y);
			getVect().setBasis(len);
			dir.setBasis1(x / len);
			dir.setBasis2(y / len);
		}
		ThePort.setNewPosAVec(this, hDGetVect());

		Object[] LHS = { "magnitude( ", "_di", this, " ) " };
		Object[] RHS = { "1.0" };
		ThePort.addImplicitConstraint(LHS, RHS, this, 1);

		if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
			BariText = 1.0;
			OffsetText = 0.25 * 40;
		}
	};
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.
	*/
	public boolean noSymBindings() {
		boolean NoBound = false;
		if ((((getSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((hDGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			&& (((dIGetMovable()).value & DepictorPort.MABLE_IMPLICIT_USE_MASK) != 0)
			&& (((fLWGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)) {
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
		String DIPrefix = "_di_";
		String FLWPrefix = "_flw_";
		String PrPrefix = "_&_";

		if (Prefix.stcmp(VectPrefix) == 0)
			PortMode = VectPort;
		if (Prefix.stcmp(HDPrefix) == 0)
			PortMode = HDPort;
		if (Prefix.stcmp(DIPrefix) == 0)
			PortMode = DIPort;
		if (Prefix.stcmp(FLWPrefix) == 0)
			PortMode = FLWPort;

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
			case DIPort :
				{
					DIVectName = MyVectName;
					DIMovable = MyMovable;
					dir = MyVect;
					MyDomain.value = DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2;
					MyIODef.value = DepictorPort.IO_DEF_OUTPUT_P2;
				};
				break;
			case FLWPort :
				{
					FLWVectName = MyVectName;
					FLWMovable = MyMovable;
					flw = MyVect;
					MyDomain.value = DepictorPort.DOM_SCA;
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
			case DIPort :
				temp = DIMovable;
				break;
			case FLWPort :
				temp = FLWMovable;
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
			case DIPort :
				{
					DIMovable = in;
				}
				break;
			case FLWPort :
				{
					FLWMovable = in;
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
			case DIPort :
				temp = ReadObj.dir;
				break;
			case FLWPort :
				temp = ReadObj.flw;
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
			case DIPort :
				temp = ReadObj.DISelfAlloc;
				break;
			case FLWPort :
				temp = ReadObj.FLWSelfAlloc;
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
		switch (DepicType) {
			case TypeA :
				updateYourselfTypeA(ThePort, PrtCon, bound, toolMode);
				break;
			case TypeB :
				updateYourselfTypeB(ThePort, PrtCon, bound, toolMode);
				break;
		}
	}
	/**
	* Updates a depictor set to type-A.
	*/
	private final void updateYourselfTypeA(DepictorPort ThePort, Q PrtCon, boolean bound, DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if (DragThrough) {
			tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + dir.getBasis1() * (getVect().getBasis()));
			tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + dir.getBasis2() * (getVect().getBasis()));
		}
		else {
			tLGetHex(Dcon).getGlo().setBasis1(
				(hDGetVect()).getBasis1() + dir.getBasis1() * Math.abs(getVect().getBasis()));
			tLGetHex(Dcon).getGlo().setBasis2(
				(hDGetVect()).getBasis2() + dir.getBasis2() * Math.abs(getVect().getBasis()));
		}

		if (UnitCrossTac) {
			double mult = 1.0;
			if (getVect().getBasis() < 0.0)
				mult = -1.0;
			uLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() + mult * (dir.getBasis1()));
			uLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() + mult * (dir.getBasis2()));
			ThePort.hexloc(HDHexGlo, bound, uLGetHex(Dcon));
		}

		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		tLGetHex(Dcon).getGlo().vsub(HDHexGlo, gtVect());
		Mvec ta = new Mvec();
		Mvec tb = new Mvec();
		Mvec tc = new Mvec();
		Mvec td = Dcon.getTxtDelMvec();
		HDHexGlo.scale((1 - BariText), ta);
		tLGetHex(Dcon).getGlo().scale(BariText, tb);
		ta.vadd(tb, tc);

		double CurOffset = OffsetText;
		if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
			if (getVect().getBasis() < 0)
				CurOffset = -CurOffset;
		}

		double ManLen = Math.abs((gtVect()).getBasis1()) + Math.abs((gtVect()).getBasis2());
		if (ManLen < 0.001)
			ManLen = 0.001;
		(gtVect()).scale(CurOffset / (ManLen * ThePort.getCoordRad()), td);
		double tmp = td.getBasis1();
		td.setBasis1(td.getBasis2());
		td.setBasis2(-tmp);
		tc.vadd(td, TemptxtGlo);
		ThePort.hexloc(HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));

		if (Dcon.getCirc1() == null) {
			Dcon.setCirc1(new RectF());
			Dcon.setLine1(new RectF());
			Dcon.setLine2(new RectF());
			Dcon.setLine3(new RectF());
		}

		final double CircWid = 6;
		double x1 = hDGetHex(Dcon).getPtx();
		double y1 = hDGetHex(Dcon).getPty();
		double x2 = tLGetHex(Dcon).getPtx();
		double y2 = tLGetHex(Dcon).getPty();
		double delx = x2 - x1;
		double dely = y2 - y1;
		double len = Math.sqrt(delx * delx + dely * dely);
		double x4 = x2;
		double y4 = y2;
		double x5 = x2;
		double y5 = y2;

		RectF MyCirc = Dcon.getCirc1();
		MyCirc.set((float)(x1 - CircWid / 2.0), (float)(y1 - CircWid / 2.0), 
				(float)(x1 + CircWid / 2.0), (float)(y1 + CircWid / 2.0));

		RectF MyLine = Dcon.getLine1();
		MyLine.set((float)x1, (float)y1, (float)x2, (float)y2);

		double TacLen = 4;

		if (EndCrossTac) {
			if (len > 0.001) {
				x4 = x2 + TacLen * dely / len;
				y4 = y2 - TacLen * delx / len;
				x5 = x2 - TacLen * dely / len;
				y5 = y2 + TacLen * delx / len;
			}

			MyLine = Dcon.getLine3();
			MyLine.set((float)x4, (float)y4, (float)x5, (float)y5);
		}

		if (UnitCrossTac) {
			double xk = uLGetHex(Dcon).getLoc().x;
			double yk = uLGetHex(Dcon).getLoc().y;
			x4 = xk;
			y4 = yk;
			x5 = xk;
			y5 = yk;
			if (len > 0.001) {
				x4 = xk + TacLen * dely / len;
				y4 = yk - TacLen * delx / len;
				x5 = xk - TacLen * dely / len;
				y5 = yk + TacLen * delx / len;
			}

			MyLine = Dcon.getLine2();
			MyLine.set((float)x4, (float)y4, (float)x5, (float)y5);
		}

		if (Math.abs(getBasicFrontLineStrokeWidth() - flw.getBasis()) > 0.001) {
			setBasicFrontLineStroke(flw.getBasis());
		}

		switch (toolMode) {
			case TRANSLATE_MODE :
			case SELECTION_MODE :
			case FREE_TRANSFORMATION_MODE :
			case ERASURE_MODE :
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
			case ASSIGN_MODE :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					double oneT = 1.0 / 3.0;
					double twoT = 2.0 / 3.0;
					HDHexGlo.scale(0.5, t1);
					tLGetHex(Dcon).getGlo().scale(0.5, t2);
					t1.add(t2, temp3GetHex(Dcon).getGlo());
					HDHexGlo.scale(twoT, t1);
					tLGetHex(Dcon).getGlo().scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					HDHexGlo.scale(oneT, t1);
					tLGetHex(Dcon).getGlo().scale(twoT, t2);
					t1.add(t2, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp3GetHex(Dcon));
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

		if (toolMode == DepictorPort.ToolMode.ERASURE_MODE) {
			Mvec t1 = new Mvec();
			Mvec t2 = new Mvec();
			double oneT = 1.0 / 3.0;
			double twoT = 2.0 / 3.0;
			HDHexGlo.scale(0.5, t1);
			tLGetHex(Dcon).getGlo().scale(0.5, t2);
			t1.add(t2, temp3GetHex(Dcon).getGlo());
			HDHexGlo.scale(oneT, t1);
			tLGetHex(Dcon).getGlo().scale(twoT, t2);
			t1.add(t2, temp2GetHex(Dcon).getGlo());
			ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
			ThePort.hexloc(HDHexGlo, bound, temp3GetHex(Dcon));
		}

	}
	/**
	* Updates a depictor set to type-B.
	*/
	private final void updateYourselfTypeB(DepictorPort ThePort, Q PrtCon, boolean bound, DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if (DragThrough) {
			tLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() - dir.getBasis1() * getVect().getBasis());
			tLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() - dir.getBasis2() * getVect().getBasis());
		}
		else {
			tLGetHex(Dcon).getGlo().setBasis1(
				(hDGetVect()).getBasis1() - dir.getBasis1() * Math.abs(getVect().getBasis()));
			tLGetHex(Dcon).getGlo().setBasis2(
				(hDGetVect()).getBasis2() - dir.getBasis2() * Math.abs(getVect().getBasis()));
		}

		if (UnitCrossTac) {
			double mult = 1.0;
			if (getVect().getBasis() < 0.0)
				mult = -1.0;
			uLGetHex(Dcon).getGlo().setBasis1((hDGetVect()).getBasis1() - mult * (dir.getBasis1()));
			uLGetHex(Dcon).getGlo().setBasis2((hDGetVect()).getBasis2() - mult * (dir.getBasis2()));
			ThePort.hexloc(HDHexGlo, bound, uLGetHex(Dcon));
		}

		ThePort.hexloc(HDHexGlo, bound, HDHexGlo, hDGetHex(Dcon));
		ThePort.hexloc(HDHexGlo, bound, tLGetHex(Dcon));
		HDHexGlo.vsub(tLGetHex(Dcon).getGlo(), gtVect());
		Mvec ta = new Mvec();
		Mvec tb = new Mvec();
		Mvec tc = new Mvec();
		Mvec td = Dcon.getTxtDelMvec();
		HDHexGlo.scale((1 - BariText), ta);
		tLGetHex(Dcon).getGlo().scale(BariText, tb);
		ta.vadd(tb, tc);

		double CurOffset = OffsetText;
		if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
			if (getVect().getBasis() < 0)
				CurOffset = -CurOffset;
		}

		double ManLen = Math.abs((gtVect()).getBasis1()) + Math.abs((gtVect()).getBasis2());
		if (ManLen < 0.001)
			ManLen = 0.001;
		(gtVect()).scale(CurOffset / (ManLen * ThePort.getCoordRad()), td);
		double tmp = td.getBasis1();
		td.setBasis1(td.getBasis2());
		td.setBasis2(-tmp);
		tc.vadd(td, TemptxtGlo);
		ThePort.hexloc(HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));

		if (Dcon.getCirc1() == null) {
			Dcon.setCirc1(new RectF());
			Dcon.setLine1(new RectF());
			Dcon.setLine2(new RectF());
			Dcon.setLine3(new RectF());
		}

		final double CircWid = 6;
		final double CirLen = 7;
		double x1 = tLGetHex(Dcon).getPtx();
		double y1 = tLGetHex(Dcon).getPty();
		double x2 = hDGetHex(Dcon).getPtx();
		double y2 = hDGetHex(Dcon).getPty();
		double delx = x2 - x1;
		double dely = y2 - y1;
		double len = Math.sqrt(delx * delx + dely * dely);
		double x4 = x2;
		double y4 = y2;
		double x5 = x2;
		double y5 = y2;

		RectF MyCirc = Dcon.getCirc1();
		MyCirc.set((float)(x1 - CircWid / 2.0), (float)(y1 - CircWid / 2.0), 
				(float)(x1 + CircWid / 2.0), (float)(y1 + CircWid / 2.0));

		RectF MyLine = Dcon.getLine1();
		MyLine.set((float)x1, (float)y1, (float)x2, (float)y2);

		double TacLen = 4;

		if (EndCrossTac) {
			if (len > 0.001) {
				x4 = x2 + TacLen * dely / len;
				y4 = y2 - TacLen * delx / len;
				x5 = x2 - TacLen * dely / len;
				y5 = y2 + TacLen * delx / len;
			}

			MyLine = Dcon.getLine3();
			MyLine.set((float)x4, (float)y4, (float)x5, (float)y5);
		}

		if (UnitCrossTac) {
			double xk = uLGetHex(Dcon).getLoc().x;
			double yk = uLGetHex(Dcon).getLoc().y;
			x4 = xk;
			y4 = yk;
			x5 = xk;
			y5 = yk;
			if (len > 0.001) {
				x4 = xk + TacLen * dely / len;
				y4 = yk - TacLen * delx / len;
				x5 = xk - TacLen * dely / len;
				y5 = yk + TacLen * delx / len;
			}

			MyLine = Dcon.getLine2();
			MyLine.set((float)x4, (float)y4, (float)x5, (float)y5);
		}

		if (Math.abs(getBasicFrontLineStrokeWidth() - flw.getBasis()) > 0.001) {
			setBasicFrontLineStroke(flw.getBasis());
		}

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
			case ASSIGN_MODE :
				{
					Mvec t1 = new Mvec();
					Mvec t2 = new Mvec();
					double oneT = 1.0 / 3.0;
					double twoT = 2.0 / 3.0;
					HDHexGlo.scale(0.5, t1);
					tLGetHex(Dcon).getGlo().scale(0.5, t2);
					t1.add(t2, temp3GetHex(Dcon).getGlo());
					HDHexGlo.scale(twoT, t1);
					tLGetHex(Dcon).getGlo().scale(oneT, t2);
					t1.add(t2, temp1GetHex(Dcon).getGlo());
					HDHexGlo.scale(oneT, t1);
					tLGetHex(Dcon).getGlo().scale(twoT, t2);
					t1.add(t2, temp2GetHex(Dcon).getGlo());
					ThePort.hexloc(HDHexGlo, bound, temp1GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
					ThePort.hexloc(HDHexGlo, bound, temp3GetHex(Dcon));
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

		if (toolMode == DepictorPort.ToolMode.ERASURE_MODE) {
			Mvec t1 = new Mvec();
			Mvec t2 = new Mvec();
			double oneT = 1.0 / 3.0;
			double twoT = 2.0 / 3.0;
			HDHexGlo.scale(0.5, t1);
			tLGetHex(Dcon).getGlo().scale(0.5, t2);
			t1.add(t2, temp3GetHex(Dcon).getGlo());
			HDHexGlo.scale(oneT, t1);
			tLGetHex(Dcon).getGlo().scale(twoT, t2);
			t1.add(t2, temp2GetHex(Dcon).getGlo());
			ThePort.hexloc(HDHexGlo, bound, temp2GetHex(Dcon));
			ThePort.hexloc(HDHexGlo, bound, temp3GetHex(Dcon));
		}

	}
	/**
	* Renders the depictor.
	*/
	public void drawYourself(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		switch (DepicType) {
			case TypeA :
				drawYourselfTypeA(ThePort, PrtCon, bound, g, p, toolMode);
				break;
			case TypeB :
				drawYourselfTypeB(ThePort, PrtCon, bound, g, p, toolMode);
				break;
		}
	}
	/**
	* Renders a depictor set to type-A.
	*/
	private final void drawYourselfTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		DepictorPort Win = (DepictorPort) ThePort;
		Q Dcon = PrtCon;

		Integer MyCol = FrontLineColor;
		Integer SgnCol = Win.getCyanIndex();
		if ((getVect()).getBasis() < 0.0)
			SgnCol = Win.getMagentaIndex();

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			MyCol = DefBack;
			SgnCol = DefBack;
		}

		if (tmp) {
			RectF MyLine = null;

			if (UnitCrossTac) {
				p.setStrokeCap( getBackLineStroke().getStrokeCap() );
				p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
				p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
				p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
				p.setColor(MyCol);
				MyLine = Dcon.getLine2();
				p.setStyle(Style.STROKE);
				g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
			}

			if (EndCrossTac) {
				p.setStrokeCap( getBackLineStroke().getStrokeCap() );
				p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
				p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
				p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
				p.setColor(MyCol);
				MyLine = Dcon.getLine3();
				p.setStyle(Style.STROKE);
				g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
			}

			p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
			p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
			p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
			p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
			p.setColor(SgnCol);
			RectF MyCirc = Dcon.getCirc1();
			p.setStyle(Style.FILL);
			g.drawOval(MyCirc, p);
			MyLine = Dcon.getLine1();
			p.setStyle(Style.STROKE);
			g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);

			if (EndBox) {
				ThePort.paintColorKnob(g, p, MyCol, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
			}
		}

		/* g.setColor( TextColor ); */

		tmp = TextVisible && getNamedVar();
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
	* Renders a depictor set to type-B.
	*/
	private final void drawYourselfTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		DepictorPort Win = (DepictorPort) ThePort;
		Q Dcon = PrtCon;

		Integer MyCol = FrontLineColor;
		Integer SgnCol = Win.getCyanIndex();
		if ((getVect()).getBasis() < 0.0)
			SgnCol = Win.getMagentaIndex();

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			MyCol = DefBack;
			SgnCol = DefBack;
		}

		if (tmp) {
			RectF MyLine = null;

			if (UnitCrossTac) {
				p.setStrokeCap( getBackLineStroke().getStrokeCap() );
				p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
				p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
				p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
				p.setColor(MyCol);
				MyLine = Dcon.getLine2();
				p.setStyle(Style.STROKE);
				g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
			}

			if (EndCrossTac) {
				p.setStrokeCap( getBackLineStroke().getStrokeCap() );
				p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
				p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
				p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
				p.setColor(MyCol);
				MyLine = Dcon.getLine3();
				p.setStyle(Style.STROKE);
				g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);
			}

			p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
			p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
			p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
			p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
			p.setColor(SgnCol);
			RectF MyCirc = Dcon.getCirc1();
			p.setStyle(Style.FILL);
			g.drawOval(MyCirc, p);
			MyLine = Dcon.getLine1();
			p.setStyle(Style.STROKE);
			g.drawLine(MyLine.left, MyLine.top, MyLine.right, MyLine.bottom, p);

			if (EndBox) {
				ThePort.paintColorKnob(g, p, MyCol, hDGetHex(Dcon).getLoc().x, hDGetHex(Dcon).getLoc().y);
			}
		}

		/* g.setColor( TextColor ); */

		tmp = TextVisible && getNamedVar();
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
	* Draws the control points and other tools for the depictor.
	*/
	public void drawYourTools(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		switch (DepicType) {
			case TypeA :
				drawYourToolsTypeA(ThePort, PrtCon, bound, g, p, toolMode);
				break;
			case TypeB :
				drawYourToolsTypeB(ThePort, PrtCon, bound, g, p, toolMode);
				break;
		}
	}

	/**
	* Draws the tools for a depictor set to type-A.
	*/
	private final void drawYourToolsTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		Canvas g, Paint p, 
		DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case ERASURE_MODE :
					drawEraseToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case TRANSLATE_MODE :
					drawTranslateToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ROTATION_MODE :
					drawRotateToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case DILATION_MODE :
					drawDilateToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case SELECTION_MODE :
					drawSelectionToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case LABEL_MODE :
					drawTextToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ADDITION_MODE :
					drawAdditToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case MAP_MODE :
					drawMapToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case GEO_PAD_MODE :
					drawGeoPadToolsTypeA(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case FREE_TRANSFORMATION_MODE :
					{
						if (((dIGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

						}

					}
					break;
				case ACCESSORY_TRANS_MODE :
					{
						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((dIGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						}

					}
					break;
				case ASSIGN_MODE :
					{
						if (ThePort.getAdvancedControls()
							&& ((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintOrangeKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

							ThePort.paintOrangeKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
						}

						if (ThePort.getAdvancedControls()
							&& ((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintOrangeKnob(g, p, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
						}

						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0)
							&& ThePort.getAdvancedControls()) {
							ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
						}

					}
					break;
			}
		}
	};
	/**
	* Renders erasure mode tools for a depictor set to type-A.
	*/
	private final void drawEraseToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
		}

		if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			ThePort.paintOrangeKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}

		if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			ThePort.paintOrangeKnob(g, p, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
		}

	};
	/**
	* Renders translation mode tools for a depictor set to type-A.
	*/
	private final void drawTranslateToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound));
		{
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

	};
	/**
	* Renders color mode tools for a depictor set to type-A.
	*/
	private final void drawSelectionToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders text mode tools for a depictor set to type-A.
	*/
	private final void drawTextToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(
				g, p,
				temptxtGetHex(Dcon).getLoc().x - XOffset,
				temptxtGetHex(Dcon).getLoc().y - YOffset);
		}
	};
	/**
	* Renders rotation mode tools for a depictor set to type-A.
	*/
	private final void drawRotateToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders dilation mode tools for a depictor set to type-A.
	*/
	private final void drawDilateToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
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
	* Renders addition mode tools for a depictor set to type-A.
	*/
	private final void drawAdditToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (getNamedVar()) {
			if (g != null) {
				p.setStyle( Style.STROKE );
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
	* Renders map mode tools for a depictor set to type-A.
	*/
	private final void drawMapToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (getNamedVar())
			ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

	};

	/**
	* Renders GeoPad mode tools for a depictor set to type-A.
	*/
	private final void drawGeoPadToolsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

		}

		if (TextVisible && getNamedVar()) {
			/* if( g != null )
				{
				g.setColor( Color.blue );
				MathImage img = getDepicImage();
				Rectangle2D.Double MyRect = Dcon.getRect1();
				MyRect.setFrame( temptxtGetHex( Dcon ).getLoc().x ,
			            		temptxtGetHex( Dcon ).getLoc().y ,
					img.getWidth( ) ,
					img.getHeight( ) );
			
				g.draw( MyRect );
				} */

			/* ThePort.paintBlueKnob( g ,
				temptxtGetHex( Dcon ).getLoc().x ,
				temptxtGetHex( Dcon ).getLoc().y ); */
		}

	}

	/**
	* Renders tools for a depictor set to type-B.
	*/
	private final void drawYourToolsTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		Canvas g, Paint p, 
		DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case ERASURE_MODE :
					drawEraseToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case TRANSLATE_MODE :
					drawTranslateToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ROTATION_MODE :
					drawRotateToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case DILATION_MODE :
					drawDilateToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case SELECTION_MODE :
					drawSelectionToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case LABEL_MODE :
					drawTextToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case ADDITION_MODE :
					drawAdditToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case MAP_MODE :
					drawMapToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case GEO_PAD_MODE :
					drawGeoPadToolsTypeB(ThePort, Dcon, bound, g, p, toolMode);
					break;
				case FREE_TRANSFORMATION_MODE :
					{
						if (((dIGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

							ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

						}

						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

						}
					}
					break;
				case ACCESSORY_TRANS_MODE :
					{
						if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
							&& ((dIGetMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
							ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

						}
					}
					break;
				case ASSIGN_MODE :
					{
						if (ThePort.getAdvancedControls()
							&& ((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintOrangeKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

							ThePort.paintOrangeKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
						}

						if (ThePort.getAdvancedControls()
							&& ((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) {
							ThePort.paintOrangeKnob(g, p, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
						}

						if ((((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (!bound)) {
							ThePort.paintBlueKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
						}

						if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0)
							&& ThePort.getAdvancedControls()) {
							ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
						}

					}
					break;
			}
		}
	};
	/**
	* Renders erasure mode tools for a depictor set to type-B.
	*/
	private final void drawEraseToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((hDGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, hDGetPoint(Dcon).x, hDGetPoint(Dcon).y);
		}

		if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			ThePort.paintOrangeKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}

		if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			ThePort.paintOrangeKnob(g, p, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.paintOrangeKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
		}

	};
	/**
	* Renders translation mode tools for a depictor set to type-B.
	*/
	private final void drawTranslateToolsTypeB(
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
	* Renders color mode tools for a depictor set to type-B.
	*/
	private final void drawSelectionToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);

	};
	/**
	* Renders text mode tools for a depictor set to type-B.
	*/
	private final void drawTextToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (TextVisible && getNamedVar()) {
			ThePort.paintBlueKnob(g, p, temptxtGetHex(Dcon).getLoc().x, temptxtGetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders rotation mode tools for a depictor set to type-B.
	*/
	private final void drawRotateToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			ThePort.paintBlueKnob(g, p, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			ThePort.paintBlueKnob(g, p, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
		}
	};
	/**
	* Renders dilation mode tools for a depictor set to type-B.
	*/
	private final void drawDilateToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
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
	* Renders addition mode tools for a depictor set to type-B.
	*/
	private final void drawAdditToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (getNamedVar()) {
			if (g != null) {
				p.setStyle( Style.STROKE );
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
	* Renders map mode tools for a depictor set to type-B.
	*/
	private final void drawMapToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (getNamedVar())
			ThePort.paintBlueKnob(g, p, tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);

	};

	/**
	* Renders GeoPad mode tools for a depictor set to type-B.
	*/
	private final void drawGeoPadToolsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		Canvas g, Paint p,
		DepictorPort.ToolMode toolMode) {
		if (((getMovable().value) >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			ThePort.paintBlueKnob(g, p, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);

		}

		if (TextVisible && getNamedVar()) {
			/* if( g != null )
				{
				g.setColor( Color.blue );
				MathImage img = getDepicImage();
				Rectangle2D.Double MyRect = Dcon.getRect1();
				MyRect.setFrame( temptxtGetHex( Dcon ).getLoc().x ,
			            		temptxtGetHex( Dcon ).getLoc().y ,
					img.getWidth( ) ,
					img.getHeight( ) );
			
				g.draw( MyRect );
				} */

			/* ThePort.paintBlueKnob( g ,
				temptxtGetHex( Dcon ).getLoc().x ,
				temptxtGetHex( Dcon ).getLoc().y ); */
		}

	}

	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor.
	*/
	public R clickedInRegion(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		R tmp = null;
		switch (DepicType) {
			case TypeA :
				tmp = clickedInRegionTypeA(ThePort, PrtCon, bound, LocEvent, toolMode);
				break;
			case TypeB :
				tmp = clickedInRegionTypeB(ThePort, PrtCon, bound, LocEvent, toolMode);
				break;
		}
		return (tmp);
	}

	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor set to type-A.
	*/
	private final R clickedInRegionTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case FREE_TRANSFORMATION_MODE :
					return (checkControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ERASURE_MODE :
					return (checkEraseControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case TRANSLATE_MODE :
					return (checkTransControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ROTATION_MODE :
					return (checkRotateControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case DILATION_MODE :
					return (checkDilateControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case COLOR_MODE :
					return (checkColorControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

				case LABEL_MODE :
					return (checkTextControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ACCESSORY_TRANS_MODE :
					return (checkAccControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case GEO_PAD_MODE :
					return (checkGeoPadControlsTypeA(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

			}
		}

		return null;
	};
	/**
	* Returns whether the user clicked in the gravity field of an erase mode control
	* of a depictor set to type-A.
	*/
	private final R checkEraseControlsTypeA(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VEC_IM);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			Priority = ThePort.defaultGravityField(InPt, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (noSymBindings()) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VEC_REAL);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an translation mode control
	* of a depictor set to type-A.
	*/
	private final R checkTransControlsTypeA(
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
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createTransDyn(ThePort, Dcon);
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that translates the depictor.
	*/
	private final DynRunner createTransDyn(DepictorPort ThePort, Q Dcon) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { "_hd", this };
		Object[] RHS = { "'~glo'", " \\- ( '~tmpk_pt' \\- ", "_&hd", this, " ) " };
		Dyn.changeExpression(LHS, RHS);
		Dyn.tie("", "_&", this);
		Dyn.tie("_di", "_&di", this);

		Dyn.makeConstant("~tmpk_pt", temp1GetHex(Dcon).getGlo(), DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an color mode control
	* of a depictor set to type-A.
	*/
	private final R checkColorControlsTypeA(
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
	* Returns whether the user clicked in the gravity field of an text mode control
	* of a depictor set to type-A.
	*/
	private final R checkTextControlsTypeA(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_POS);
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
	* Returns whether the user clicked in the gravity field of an rotation mode control
	* of a depictor set to type-A.
	*/
	private final R checkRotateControlsTypeA(
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

		if ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = true;
				if (DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = false;
				boolean Add = false;

				if (!(DragThrough) && (getVect().getBasis() < 0.0)) {
					Bool = false;
					Add = true;
				}

				if ((DragThrough) && (getVect().getBasis() < 0.0)) {
					Bool = true;
					Add = false;
				}

				Dyn = createBackRotateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo());
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Creates a DynRunner that rotates the depictor around its base.
	*/
	private final DynRunner createFwdRotateDyn(DepictorPort ThePort, Q Dcon, boolean bound, boolean Pos) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { "_di", this };
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
		Q Dcon,
		boolean Pos,
		boolean Add,
		Mvec Pt) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { "_di", this };
		Object[] RHS = { " ", " ( UnitOf( '~glo' \\- '~tmpk_pt' ) ) " };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_hd", this };
		Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " < ", this, " >{ 0 } * ", "_di", this };

		if (!Add)
			RHS2[1] = " \\- ";

		Dyn.changeExpression(LHS2, RHS2);
		Dyn.tie("", "_&", this);

		Dyn.makeConstant("~tmpk_pt", Pt, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an dilation mode control
	* of a depictor set to type-A.
	*/
	private final R checkDilateControlsTypeA(
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
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = true;
				boolean Add = false;
				if (!DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				if (DragThrough)
					Bool = false;
				Dyn = createBackDilateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo(), "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = true;
				if (!DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
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
		Q Dcon,
		boolean bound,
		boolean Pos,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);
		Object[] LHS = { this };

		if (DragThrough) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_di",
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
		}
		else {
			Object[] RHS =
				{
					" ",
					Mult,
					" * magnitude( ",
					"_di",
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
		}

		Dyn.tie("_di", "_&di", this);
		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Creates a DynRunner that dilates a depictor with the tip kept fixed.
	*/
	private final DynRunner createBackDilateDyn(
		DepictorPort ThePort,
		Q Dcon,
		boolean Pos,
		boolean Add,
		Mvec Pt,
		String Mult) {
		DynRunner Dyn = ThePort.createDynRunner();
		Object[] LHS = { this };

		if (DragThrough) {
			Object[] RHS =
				{
					" ",
					Mult,
					" * ( ",
					"_&di",
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
					"_&di",
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

		if (DragThrough) {
			Object[] LHS2 = { "_hd", this };
			Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " < ", this, " >{ 0 } * ", "_di", this };

			if (!Add)
				RHS2[1] = " \\- ";

			Dyn.changeExpression(LHS2, RHS2);
		}
		else {
			Object[] LHS2 = { "_hd", this };
			Object[] RHS2 = { " '~tmpk_pt' ", " \\+ ", " magnitude( < ", this, " >{ 0 } ) * ", "_di", this };

			if (!Add)
				RHS2[1] = " \\- ";

			Dyn.changeExpression(LHS2, RHS2);
		}

		if (!DragThrough) {
			Dyn.tie("_di", "_&di", this);
		}

		Dyn.makeConstant("~tmpk_pt", Pt, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control
	* of a depictor set to type-A.
	*/
	private final R checkControlsTypeA(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				boolean Bool = true;
				if (!DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "2.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = true;
				if (DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
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
				Dyn.tie("_di", "_&di", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an GeoPad mode control
	* of a depictor set to type-A.
	*/
	private final R checkGeoPadControlsTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		RectF TempRect;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				boolean Bool = true;
				if (!DragThrough && (getVect().getBasis() < 0.0))
					Bool = false;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		/* if( TextVisible && getNamedVar() ) {
		
		Priority = ThePort.defaultGravityField( InPt ,
		                     temptxtGetHex( Dcon ).getLoc().x ,
		                     temptxtGetHex( Dcon ).getLoc().y );
		            if( ( Priority <= ClickRec.MIN_PRIORITY ) && (
		                     LastClick == DepictorPort.MatchResult.NO_MATCH ) )
		                     {
		                     NewRec.setValue( MANUAL_DRAG_VECT_POS );
			 NewRec.ClickPriority = Priority;
		                     ret = NewRec;
		                     LastClick = DepictorPort.MatchResult.MATCH;
		                     }
			} */

		if (TextVisible && getNamedVar()) {
			MathImage img = getDepicImage();

			TempRect =
				new RectF(
					temptxtGetHex(Dcon).getLoc().x,
					temptxtGetHex(Dcon).getLoc().y,
					temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
					temptxtGetHex(Dcon).getLoc().y+img.getHeight());
			if (TempRect.contains(InPt.x, InPt.y) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = ClickRec.MIN_PRIORITY;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
					    NewRec.TransDelta ); */
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_di", "_&di", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an accessory mode control
	* of a depictor set to type-A.
	*/
	private final R checkAccControlsTypeA(
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Pos = true;
				boolean Dir = true;

				if (getVect().getBasis() < 0.0) {
					Pos = false;
					if (DragThrough)
						Dir = false;
				}

				Dyn = createNonthrAccDyn(ThePort, Dcon, bound, Pos, Dir);
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
				Dyn.tie("_di", "_&di", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
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
		Q Dcon,
		boolean bound,
		boolean Pos,
		boolean Dir) {
		DynRunner Dyn = ThePort.createDynRunner(bound, HDHexGlo);

		Object[] LHS = { this };
		Object[] RHS = { " ", " magnitude( '~glo' \\- ", "_hd", this, " ) ", " + ", " < ", "_&", this, " >{ 1 , 2 }" };

		if (!Pos)
			RHS[0] = " - ";

		Dyn.changeExpression(LHS, RHS);

		Object[] LHS2 = { "_di", this };
		Object[] RHS2 = { " ", " UnitOf( '~glo' \\- ", "_hd", this, " ) " };

		if (!Dir)
			RHS2[0] = " - ";

		Dyn.changeExpression(LHS2, RHS2);

		Dyn.tie("_hd", "_&hd", this);

		return (Dyn);
	}

	/**
	* Returns a ClickRec iff. the user clicked in the gravity field of a depictor set to type-B.
	*/
	private final R clickedInRegionTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		if ((ControlsVisible) || (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			switch (toolMode) {
				case FREE_TRANSFORMATION_MODE :
					return (checkControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ERASURE_MODE :
					return (checkEraseControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case TRANSLATE_MODE :
					return (checkTransControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ROTATION_MODE :
					return (checkRotateControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case DILATION_MODE :
					return (checkDilateControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case COLOR_MODE :
					return (checkColorControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

				case LABEL_MODE :
					return (checkTextControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case ACCESSORY_TRANS_MODE :
					return (checkAccControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */
				case GEO_PAD_MODE :
					return (checkGeoPadControlsTypeB(ThePort, Dcon, bound, LocEvent, toolMode));
					/* break; */

			}
		}

		return null;
	};
	/**
	* Returns whether the user clicked in the gravity field of an erasure mode control
	* of a depictor set to type-B.
	*/
	private final R checkEraseControlsTypeB(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_POS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VEC_IM);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0) && (ThePort.getAdvancedControls())) {
			Priority = ThePort.defaultGravityField(InPt, temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) > 0)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (noSymBindings()) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VEC_REAL);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an translation mode control
	* of a depictor set to type-B.
	*/
	private final R checkTransControlsTypeB(
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
				NewRec.clickPriority = Priority;
				ret = NewRec;
				Dyn = createTransDyn(ThePort, Dcon);
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}

	/**
	* Returns whether the user clicked in the gravity field of an color mode control
	* of a depictor set to type-B.
	*/
	private final R checkColorControlsTypeB(
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
	* Returns whether the user clicked in the gravity field of an text mode control
	* of a depictor set to type-B.
	*/
	private final R checkTextControlsTypeB(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_POS);
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
	* Returns whether the user clicked in the gravity field of an rotation mode control
	* of a depictor set to type-B.
	*/
	private final R checkRotateControlsTypeB(
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

		if ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = false;
				if (DragThrough && (getVect().getBasis() < 0.0))
					Bool = true;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = true;
				boolean Add = true;

				if (!(DragThrough) && (getVect().getBasis() < 0.0)) {
					Bool = true;
					Add = false;
				}

				if ((DragThrough) && (getVect().getBasis() < 0.0)) {
					Bool = false;
					Add = true;
				}

				Dyn = createBackRotateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo());
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an dilation mode control
	* of a depictor set to type-B.
	*/
	private final R checkDilateControlsTypeB(
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
			&& ((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& (!bound)) {
			Priority = ThePort.defaultGravityField(InPt, temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = false;
				boolean Add = true;
				if (!DragThrough && (getVect().getBasis() > 0.0))
					Bool = true;
				if (DragThrough)
					Bool = true;
				Dyn = createBackDilateDyn(ThePort, Dcon, Bool, Add, tLGetHex(Dcon).getGlo(), "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {

			Priority = ThePort.defaultGravityField(InPt, temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);

			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = false;
				if (!DragThrough && (getVect().getBasis() > 0.0))
					Bool = true;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.5");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	}
	/**
	* Returns whether the user clicked in the gravity field of an free transformation mode control
	* of a depictor set to type-B.
	*/
	private final R checkControlsTypeB(
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
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				boolean Bool = false;
				if (!DragThrough && (getVect().getBasis() > 0.0))
					Bool = true;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "2.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Bool = false;
				if (DragThrough && (getVect().getBasis() < 0.0))
					Bool = true;
				Dyn = createFwdRotateDyn(ThePort, Dcon, bound, Bool);
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
				Dyn.tie("_di", "_&di", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an GeoPad mode control
	* of a depictor set to type-B.
	*/
	private final R checkGeoPadControlsTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		PointF InPt,
		DepictorPort.ToolMode toolMode) {
		R NewRec = makeClickRec();
		R ret = null;
		RectF TempRect;
		double Priority = ClickRec.MIN_PRIORITY + 1;
		DepictorPort.MatchResult LastClick = DepictorPort.MatchResult.NO_MATCH;
		DynRunner Dyn = null;

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_CP);
				boolean Bool = false;
				if (!DragThrough && (getVect().getBasis() > 0.0))
					Bool = true;
				Dyn = createFwdDilateDyn(ThePort, Dcon, bound, Bool, "1.0");
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		/* if( TextVisible && getNamedVar() ) {
		
		Priority = ThePort.defaultGravityField( InPt ,
		                     temptxtGetHex( Dcon ).getLoc().x ,
		                     temptxtGetHex( Dcon ).getLoc().y );
		            if( ( Priority <= ClickRec.MIN_PRIORITY ) && (
		                     LastClick == DepictorPort.MatchResult.NO_MATCH ) )
		                     {
		                     NewRec.setValue( MANUAL_DRAG_VECT_POS );
			 NewRec.ClickPriority = Priority;
		                     ret = NewRec;
		                     LastClick = DepictorPort.MatchResult.MATCH;
		                     }
			} */

		if (TextVisible && getNamedVar()) {
			MathImage img = getDepicImage();

			TempRect =
				new RectF(
					temptxtGetHex(Dcon).getLoc().x,
					temptxtGetHex(Dcon).getLoc().y,
					temptxtGetHex(Dcon).getLoc().x+img.getWidth(),
					temptxtGetHex(Dcon).getLoc().y+img.getHeight());
			if (TempRect.contains(InPt.x, InPt.y) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				NewRec.setValue(Ssca1Evt.MANUAL_DRAG_VECT_DIS);
				NewRec.clickPriority = ClickRec.MIN_PRIORITY;
				ret = NewRec;
				/* hDGetVect().sub( temp1GetHex( Dcon ).getGlo() ,
					    NewRec.TransDelta ); */
				LastClick = DepictorPort.MatchResult.MATCH;
			}

		}

		if (((hDGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE) && (!bound)) {
			Priority = linearSegGravityField(hDGetPoint(Dcon), tLGetPoint(Dcon), InPt, getBasicFrontLineStrokeWidth());
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				Dyn = createOffsetTransDyn(ThePort, bound, InPt, hDGetHex(Dcon), "_hd", "_&hd");
				Dyn.tie("", "_&", this);
				Dyn.tie("_di", "_&di", this);
				NewRec.clickPriority = Priority;
				ret = NewRec;
				LastClick = DepictorPort.MatchResult.MATCH;
			}
		}

		NewRec.dyn = Dyn;
		return ret;
	};

	/**
	* Returns whether the user clicked in the gravity field of an accessory mode control
	* of a depictor set to type-B.
	*/
	private final R checkAccControlsTypeB(
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

		if (((getMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)
			&& ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
			Priority = ThePort.defaultGravityField(InPt, tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
			if ((Priority <= ClickRec.MIN_PRIORITY) && (LastClick == DepictorPort.MatchResult.NO_MATCH)) {
				boolean Pos = true;
				boolean Dir = false;

				if (getVect().getBasis() < 0.0) {
					Pos = false;
					if (DragThrough)
						Dir = true;
				}

				Dyn = createNonthrAccDyn(ThePort, Dcon, bound, Pos, Dir);
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
				Dyn.tie("_di", "_&di", this);
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
		switch (DepicType) {
			case TypeA :
				delVarTypeA(ThePort, in, CurString);
				break;
			case TypeB :
				delVarTypeB(ThePort, in, CurString);
				break;
		}
	}
	/**
	* In erase mode, associates a mouse-click location with the assignment
	* or object to be deleted for a type-A depictor.  Places the result in <code>CurString</code>.
	*/
	private final void delVarTypeA(DepictorPort ThePort, R in, FlexString CurString) {
		double Delta1 = .3;
		double Delta2 = .2;

		R MyRec = in;
		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_POS) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VEC_IM) {
			Object[] Form = { "_di", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_CP) {
			Object[] Form = { "_flw", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_DIS) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VEC_REAL) {
			(new FlexString("\\")).copyString(CurString);
		}

	};
	/**
	* In erase mode, associates a mouse-click location with the assignment
	* or object to be deleted for a type-B depictor.  Places the result in <code>CurString</code>.
	*/
	private final void delVarTypeB(DepictorPort ThePort, R in, FlexString CurString) {
		double Delta1 = .3;
		double Delta2 = .2;

		R MyRec = in;
		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_POS) {
			Object[] Form = { "_hd", this };
			ThePort.insertFormattedString(Form, CurString);
			(hDGetVect()).setBasis1((hDGetVect()).getBasis1() + Delta1);
			(hDGetVect()).setBasis2((hDGetVect()).getBasis2() + Delta2);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VEC_IM) {
			Object[] Form = { "_di", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_CP) {
			Object[] Form = { "_flw", this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_DIS) {
			Object[] Form = { this };
			ThePort.insertFormattedString(Form, CurString);
		}

		if (MyRec.getValue() == Ssca1Evt.MANUAL_DRAG_VEC_REAL) {
			(new FlexString("\\")).copyString(CurString);
		}

	};

	public Ssca1Base() {
		super();
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		HDSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		DISelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		FLWSelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		VectPtr = new Mvec();
		Movable.value = DepictorPort.MABLE_BY_ANY;
		HDMovable.value = DepictorPort.MABLE_BY_ANY;
		DIMovable.value = DepictorPort.MABLE_BY_ANY;
		FLWMovable.value = DepictorPort.MABLE_BY_ANY;
		VectName = new FlexString();
		dir.setBasis1(1);
		flw.setBasis(2.0);
		setBasicFrontLineStroke(2.0);
		setTextColor(Color.BLACK);
	};
	public PointF hDGetPoint(Q Dcon) {
		return (hDGetHex(Dcon).getLoc());
	};
	public PointF tLGetPoint(Q Dcon) {
		return (tLGetHex(Dcon).getLoc());
	};

	static Ssca1Base UndoNode = null;

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
		dir.copyAllInfo(UndoNode.dir);
		flw.copyAllInfo(UndoNode.flw);
		UndoNode.DragThrough = DragThrough;
	}
	/**
	* Performs an undo on a drag operation.
	*/

	public void popDragUndo() {
		Mvec TmpVect = new Mvec();
		Mvec TmpHDVect = new Mvec();
		Mvec TmpDir = new Mvec();
		Mvec TmpFlw = new Mvec();

		VectPtr.copyAllInfo(TmpVect);
		HDHexGlo.copyAllInfo(TmpHDVect);
		dir.copyAllInfo(TmpDir);
		flw.copyAllInfo(TmpFlw);

		UndoNode.VectPtr.copyAllInfo(VectPtr);
		UndoNode.HDHexGlo.copyAllInfo(HDHexGlo);
		UndoNode.dir.copyAllInfo(dir);
		UndoNode.flw.copyAllInfo(flw);

		TmpVect.copyAllInfo(UndoNode.VectPtr);
		TmpHDVect.copyAllInfo(UndoNode.HDHexGlo);
		TmpDir.copyAllInfo(UndoNode.dir);
		TmpFlw.copyAllInfo(UndoNode.flw);

		boolean TmpDragThrough;

		TmpDragThrough = DragThrough;
		DragThrough = UndoNode.DragThrough;
		UndoNode.DragThrough = TmpDragThrough;

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
		switch (DepicType) {
			case TypeA :
				singleClickControlTypeA(ThePort, PrtCon, bound, in, toolMode);
				break;
			case TypeB :
				singleClickControlTypeB(ThePort, PrtCon, bound, in, toolMode);
				break;
		}
	}

	/**
	* Handles a single-click on a depictor set to type-A.
	*/
	private final void singleClickControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode) {
		if ((toolMode == DepictorPort.ToolMode.FREE_TRANSFORMATION_MODE) || (toolMode == DepictorPort.ToolMode.ACCESSORY_TRANS_MODE)) {
			R MRec = in;

			if (MRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_CP) {
				(getVect()).setBasis(- (getVect()).getBasis());

				if (DragThrough && ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
					(dir).setBasis1(- (dir).getBasis1());
					(dir).setBasis2(- (dir).getBasis2());
				}
			}
		}

		if ((toolMode == DepictorPort.ToolMode.GEO_PAD_MODE)) {
			R MRec = in;

			if (MRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_DIS) {
				/* EtherEvent send = new GeomKitEtherEvent( this , GeomKitEtherEvent.changeDepicLabel ,
					null , in );
				ThePort.processObjEtherEvent( send , null ); */
			}
		}
	}

	/**
	* Handles a single-click on a depictor set to type-B.
	*/
	private final void singleClickControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode) {
		if ((toolMode == DepictorPort.ToolMode.FREE_TRANSFORMATION_MODE) || (toolMode == DepictorPort.ToolMode.ACCESSORY_TRANS_MODE)) {
			R MRec = in;

			if (MRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_CP) {
				(getVect()).setBasis(- (getVect()).getBasis());

				if (DragThrough && ((dIGetMovable()).value >= DepictorPort.MABLE_BY_DIFFERENTIABLE)) {
					(dir).setBasis1(- (dir).getBasis1());
					(dir).setBasis2(- (dir).getBasis2());
				}
			}
		}

		if ((toolMode == DepictorPort.ToolMode.GEO_PAD_MODE)) {
			R MRec = in;

			if (MRec.getValue() == Ssca1Evt.MANUAL_DRAG_VECT_DIS) {
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
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		switch (DepicType) {
			case TypeA :
				dragDisplayControlTypeA(ThePort, PrtCon, bound, in, toolMode, InPt);
				break;
			case TypeB :
				dragDisplayControlTypeB(ThePort, PrtCon, bound, in, toolMode, InPt);
				break;
		}
	}

	/**
	* Handles the dragging of a control point in cases when the type-A depictor has not
	* delegated the operation to a {@link geomdir.DynRunner}.
	*/
	private final void dragDisplayControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		Q Dcon = PrtCon;
		switch (toolMode) {

			case LABEL_MODE :
				dragTextEventTypeA(ThePort, Dcon, bound, in, toolMode, InPt);
				break;
			case GEO_PAD_MODE :
				dragGeoPadEventTypeA(ThePort, Dcon, bound, in, toolMode, InPt);
				break;

		}
	}

	/**
	* Handles the dragging of a text tag for a depictor set to type-A.
	*/
	private final void dragTextEventTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		Ssca1Evt VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case MANUAL_DRAG_VECT_POS :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				VectVal.setBasis1((gtVect()).getBasis1());
				VectVal.setBasis2((gtVect()).getBasis2());
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

				if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
					if (getVect().getBasis() < 0)
						OffsetText = -OffsetText;
				}

				break;

		}
	}

	/**
	* Handles GeoPad text tag dragging for a depictor set to type-A.
	*/
	private final void dragGeoPadEventTypeA(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		Ssca1Evt VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case MANUAL_DRAG_VECT_POS :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				VectVal.setBasis1((gtVect()).getBasis1());
				VectVal.setBasis2((gtVect()).getBasis2());
				ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));
				TemptxtGlo.vsub(HDHexGlo, InVect);
				VectVal.dot(InVect, dprod);
				double d1 = VectVal.getBasis1();
				double d2 = VectVal.getBasis2();
				double dn = d1 * d1 + d2 * d2;

				/* if( dn < 0.001 ) BariText = 0.0;
					else BariText = MultVal / dn; */
				BariText = 1.0;

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

				if (OffsetText >= 0)
					OffsetText = 0.75 * 40;
				else
					OffsetText = -0.75 * 40;

				if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
					if (getVect().getBasis() < 0)
						OffsetText = -OffsetText;
				}

				break;

		}
	}

	/**
	* Handles the dragging of a control point in cases when the type-B depictor has not
	* delegated the operation to a {@link geomdir.DynRunner}.
	*/
	private final void dragDisplayControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		Q Dcon = PrtCon;
		switch (toolMode) {

			case LABEL_MODE :
				dragTextEventTypeB(ThePort, Dcon, bound, in, toolMode, InPt);
				break;
			case GEO_PAD_MODE :
				dragGeoPadEventTypeB(ThePort, Dcon, bound, in, toolMode, InPt);
				break;

		}
	}

	/**
	* Handles the dragging of a text tag for a depictor set to type-B.
	*/
	private final void dragTextEventTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		Ssca1Evt VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case MANUAL_DRAG_VECT_POS :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				VectVal.setBasis1((gtVect()).getBasis1());
				VectVal.setBasis2((gtVect()).getBasis2());
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
					BariText = -MultVal / dn;

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

				if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
					if (getVect().getBasis() < 0)
						OffsetText = -OffsetText;
				}

				break;

		}
	}

	/**
	* Handles GeoPad text tag dragging for a depictor set to type-B.
	*/
	private final void dragGeoPadEventTypeB(
		DepictorPort ThePort,
		Q Dcon,
		boolean bound,
		R in,
		DepictorPort.ToolMode toolMode,
		PointF InPt) {
		R InRec = in;
		Ssca1Evt VectDragMode = InRec.getValue();

		switch (VectDragMode) {
			case MANUAL_DRAG_VECT_POS :
				Mvec VectVal = new Mvec();
				Mvec InVect = new Mvec();
				Mvec dprod = new Mvec();
				VectVal.setBasis1((gtVect()).getBasis1());
				VectVal.setBasis2((gtVect()).getBasis2());
				ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, TemptxtGlo, temptxtGetHex(Dcon));
				TemptxtGlo.vsub(HDHexGlo, InVect);
				VectVal.dot(InVect, dprod);
				double d1 = VectVal.getBasis1();
				double d2 = VectVal.getBasis2();
				double dn = d1 * d1 + d2 * d2;

				/* if( dn < 0.001 ) BariText = 0.0;
					else BariText = - MultVal / dn; */
				BariText = 1.0;

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

				if (OffsetText >= 0)
					OffsetText = 0.75 * 40;
				else
					OffsetText = -0.75 * 40;

				if ((ThePort.getGeomKitType() == 2) || (ThePort.getGeomKitType() == 3)) {
					if (getVect().getBasis() < 0)
						OffsetText = -OffsetText;
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
		switch (DepicType) {
			case TypeA :
				checkAssignToControlTypeA(ThePort, PrtCon, bound, InPt, LHS, RHS, Active);
				break;
			case TypeB :
				checkAssignToControlTypeB(ThePort, PrtCon, bound, InPt, LHS, RHS, Active);
				break;
		}

	}

	/**
	* Checks whether the assign tool is assigning to a control point
	* on a type-A depictor.
	*/
	private final void checkAssignToControlTypeA(
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

			if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_di", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_flw", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_di", this };
					Object[] RHS1 = { "UnitOf( $ \\- ", "_hd", this, " ) " };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { this };
					Object[] RHS1 = { "magnitude( $ \\- ", "_hd", this, " ) " };
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
	* Checks whether the assign tool is assigning to a control point
	* on a type-B depictor.
	*/
	private final void checkAssignToControlTypeB(
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

			if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_di", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((fLWGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_flw", this };
					Object[] RHS1 = { "$" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((dIGetMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { "_di", this };
					Object[] RHS1 = { "UnitOf( ", "_hd", this, " \\- $ )" };
					Object[] LHS2 = { LHS1 };
					Object[] RHS2 = { RHS1 };
					LHS[0] = LHS2;
					RHS[0] = RHS2;
					(Active).value = 1;
				}
			}

			if ((((getMovable()).value & DepictorPort.MABLE_ASGN_MASK) == 0) && (ThePort.getAdvancedControls())) {

				TempRect = ThePort.instanceRect(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					Object[] LHS1 = { this };
					Object[] RHS1 = { "magnitude( ", "_hd", this, " \\- $ )" };
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
		switch (DepicType) {
			case TypeA :
				checkAssignFromControlTypeA(ThePort, PrtCon, bound, CurDist, InPt, NewString, OutPt);
				break;
			case TypeB :
				checkAssignFromControlTypeB(ThePort, PrtCon, bound, CurDist, InPt, NewString, OutPt);
				break;
		}

	}

	/**
	* Checks whether the assign tool is assigning from a control point on a type-A depictor.
	*/
	private final void checkAssignFromControlTypeA(
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
					if (DragThrough) {
						NewString.clearString();
						NewString.setInsertPoint(0);
						Object[] Form = { "_hd", this, " \\+ ( ", "_di", this, " * < ", this, " >{ 0 } ) " };
						ThePort.insertFormattedString(Form, NewString);
					}
					else {
						NewString.clearString();
						NewString.setInsertPoint(0);
						Object[] Form =
							{ "_hd", this, " \\+ ( ", "_di", this, " * magnitude( < ", this, " >{ 0 } ) ) " };
						ThePort.insertFormattedString(Form, NewString);
					}

					(OutPt).set(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
					CurDist.curDist = Dist;
				}
			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp1GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp1GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_di", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}

			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp3GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp3GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_flw", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}

			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp2GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp2GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_di", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}

			}

		}

	};

	/**
	* Checks whether the assign tool is assigning from a control point on a type-B depictor.
	*/
	private final void checkAssignFromControlTypeB(
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
					if (DragThrough) {
						NewString.clearString();
						NewString.setInsertPoint(0);
						Object[] Form = { "_hd", this, " \\- ( ", "_di", this, " * < ", this, " >{ 0 } ) " };
						ThePort.insertFormattedString(Form, NewString);
					}
					else {
						NewString.clearString();
						NewString.setInsertPoint(0);
						Object[] Form =
							{ "_hd", this, " \\- ( ", "_di", this, " * magnitude( < ", this, " >{ 0 } ) ) " };
						ThePort.insertFormattedString(Form, NewString);
					}

					(OutPt).set(tLGetPoint(Dcon).x, tLGetPoint(Dcon).y);
					CurDist.curDist = Dist;
				}
			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp1GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp1GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_di", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp1GetHex(Dcon).getLoc().x, temp1GetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}

			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp3GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp3GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_flw", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp3GetHex(Dcon).getLoc().x, temp3GetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}

			}

			if (ThePort.getAdvancedControls()) {
				double XDist = temp2GetHex(Dcon).getLoc().x - InPt.x;
				double YDist = temp2GetHex(Dcon).getLoc().y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					NewString.clearString();
					NewString.setInsertPoint(0);
					Object[] Form = { "_di", this };
					ThePort.insertFormattedString(Form, NewString);

					(OutPt).set(temp2GetHex(Dcon).getLoc().x, temp2GetHex(Dcon).getLoc().y);
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
	* Checks whether the add tool is adding from this depictor.
	*/
	public void checkAdditFromControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		switch (DepicType) {
			case TypeA :
				checkAdditFromControlTypeA(ThePort, PrtCon, bound, CurDist, InPt, OutPt);
				break;
			case TypeB :
				checkAdditFromControlTypeB(ThePort, PrtCon, bound, CurDist, InPt, OutPt);
				break;
		}

	}

	/**
	* Checks whether the add tool is adding from a type-A depictor.
	*/
	private final void checkAdditFromControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		Q Dcon = PrtCon;
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
	* Checks whether the add tool is adding from a type-B depictor.
	*/
	private final void checkAdditFromControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		Q Dcon = PrtCon;
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
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		boolean tmp = false;
		switch (DepicType) {
			case TypeA :
				tmp = checkAdditToControlTypeA(ThePort, PrtCon, bound, InPt, Active);
				break;
			case TypeB :
				tmp = checkAdditToControlTypeB(ThePort, PrtCon, bound, InPt, Active);
				break;
		}
		return (tmp);
	}

	/**
	* Checks whether the add tool is adding to a type-A depictor.
	*/
	private final boolean checkAdditToControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		Q Dcon = PrtCon;
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
	* Checks whether the add tool is adding to a type-B depictor.
	*/
	private final boolean checkAdditToControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		Q Dcon = PrtCon;
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
	* Checks whether the map tool is mapping from this depictor.
	*/
	public void checkMapFromControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		switch (DepicType) {
			case TypeA :
				checkMapFromControlTypeA(ThePort, PrtCon, bound, CurDist, InPt, OutPt);
				break;
			case TypeB :
				checkMapFromControlTypeB(ThePort, PrtCon, bound, CurDist, InPt, OutPt);
				break;
		}

	}

	/**
	* Checks whether the map tool is mapping from a type-A depictor.
	*/
	private final void checkMapFromControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {

			if (getNamedVar()) {
				double XDist = (tLGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (tLGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					(OutPt).set(tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}
			}
		}

	};

	/**
	* Checks whether the map tool is mapping from a type-B depictor.
	*/
	private final void checkMapFromControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		R CurDist,
		PointF InPt,
		PointF OutPt) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {

			if (getNamedVar()) {
				double XDist = (tLGetHex(Dcon).getLoc()).x - InPt.x;
				double YDist = (tLGetHex(Dcon).getLoc()).y - InPt.y;
				double Dist = XDist * XDist + YDist * YDist;
				if (Dist < CurDist.curDist) {
					(OutPt).set(tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
					CurDist.curDist = Dist;
				}
			}
		}

	};

	/**
	* Checks whether the map tool is mapping to this depictor.
	*/
	public boolean checkMapToControl(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		boolean tmp = false;
		switch (DepicType) {
			case TypeA :
				tmp = checkMapToControlTypeA(ThePort, PrtCon, bound, InPt, Active);
				break;
			case TypeB :
				tmp = checkMapToControlTypeB(ThePort, PrtCon, bound, InPt, Active);
				break;
		}
		return (tmp);
	}

	/**
	* Checks whether the map tool is mapping to a type-A depictor.
	*/
	private final boolean checkMapToControlTypeA(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {
			RectF TempRect;

			if (true) {

				TempRect = ThePort.instanceRect(tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					(Active).value = 1;
				}
			}
		}

		return (false);
	};

	/**
	* Checks whether the map tool is mapping to a type-B depictor.
	*/
	private final boolean checkMapToControlTypeB(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		Q Dcon = PrtCon;
		if (ControlsVisible) {
			RectF TempRect;

			if (true) {

				TempRect = ThePort.instanceRect(tLGetHex(Dcon).getLoc().x, tLGetHex(Dcon).getLoc().y);
				if (TempRect.contains(InPt.x, InPt.y)) {
					(Active).value = 1;
				}
			}
		}

		return (true);
	};

	/**
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String tmp = null;
//		String key = ThePort.getPersistencePrefix(this);

//		super.loadProperties(ThePort, MyProp);

//		ThePort.loadMvecProperties(MyProp, key + ".HDport", HDHexGlo);

//		ThePort.loadMvecProperties(MyProp, key + ".dir", dir);

//		try {
//			ThePort.loadMvecProperties(MyProp, key + ".flw", flw);
//		}
//		catch (DataFormatException ex) { /* Do Nothing */
//		}

		/* BariText = MyProp.getDouble(key + ".Bari");

		tmp = MyProp.getProperty(key + ".Offset");
		if (tmp != null)
			OffsetText = (MyProp.getDouble(key + ".Offset")) * ThePort.getCoordRad();

		tmp = MyProp.getProperty(key + ".NuOffset");
		if (tmp != null)
			OffsetText = MyProp.getDouble(key + ".NuOffset");

		tmp = MyProp.getProperty(key + ".DepicType");
		if (tmp != null)
			DepicType = MyProp.getInt(key + ".DepicType");

		tmp = MyProp.getProperty(key + ".DragThrough");
		if (tmp != null)
			DragThrough = MyProp.getBoolean(key + ".DragThrough");

		tmp = MyProp.getProperty(key + ".EndBox");
		if (tmp != null)
			EndBox = MyProp.getBoolean(key + ".EndBox");
		else
			EndBox = false;

		tmp = MyProp.getProperty(key + ".UnitCrossTac");
		if (tmp != null)
			UnitCrossTac = MyProp.getBoolean(key + ".UnitCrossTac");
		else
			UnitCrossTac = false;

		tmp = MyProp.getProperty(key + ".EndCrossTac");
		if (tmp != null)
			EndCrossTac = MyProp.getBoolean(key + ".EndCrossTac");
		else
			EndCrossTac = true; */

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		/* super.saveProperties(ThePort, MyProp);

		ThePort.saveMvecProperties(MyProp, key + ".HDport", HDHexGlo);

		if ((hDGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_hd_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		if ((dIGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_di_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		if ((fLWGetMovable().value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			FlexString Prefix = new FlexString("_flw_");
			Prefix.setInsertPoint(Prefix.strlen());
			(getFragID()).insertString(Prefix);
			(getVectName()).insertString(Prefix);
			ThePort.registerPersistentConstraint(MyProp, Prefix);
		}

		ThePort.saveMvecProperties(MyProp, key + ".dir", dir);

		ThePort.saveMvecProperties(MyProp, key + ".flw", flw);

		MyProp.putDouble(key + ".Bari", BariText);

		MyProp.putDouble(key + ".NuOffset", OffsetText);

		MyProp.putInt(key + ".DepicType", DepicType);

		MyProp.putBoolean(key + ".DragThrough", DragThrough);

		MyProp.putBoolean(key + ".EndBox", EndBox);

		MyProp.putBoolean(key + ".UnitCrossTac", UnitCrossTac);

		MyProp.putBoolean(key + ".EndCrossTac", EndCrossTac); */

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
			DIVectName = (FlexString) (myv.getProperty("DIVectName"));
			DIMovable = (IntObj) (myv.getProperty("DIMovable"));
			VersionBuffer.chkNul(DIMovable);
			DISelfAlloc = (IntObj) (myv.getProperty("DISelfAlloc"));
			VersionBuffer.chkNul(DISelfAlloc);
			dir = (Mvec) (myv.getProperty("dir"));
			VersionBuffer.chkNul(dir);
			FLWVectName = (FlexString) (myv.getProperty("FLWVectName"));
			FLWMovable = (IntObj) (myv.getProperty("FLWMovable"));
			VersionBuffer.chkNul(FLWMovable);
			FLWSelfAlloc = (IntObj) (myv.getProperty("FLWSelfAlloc"));
			VersionBuffer.chkNul(FLWSelfAlloc);
			flw = (Mvec) (myv.getProperty("flw"));
			VersionBuffer.chkNul(flw);
			DepicType = myv.getInt("DepicType");
			DragThrough = myv.getBoolean("DragThrough");
			EndBox = myv.getBoolean("EndBox");
			UnitCrossTac = myv.getBoolean("UnitCrossTac");
			EndCrossTac = myv.getBoolean("EndCrossTac"); */
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
		if (DIVectName != null)
			myv.setProperty("DIVectName", DIVectName);
		myv.setProperty("DIMovable", DIMovable);
		myv.setProperty("DISelfAlloc", DISelfAlloc);
		myv.setProperty("dir", dir);
		if (FLWVectName != null)
			myv.setProperty("FLWVectName", FLWVectName);
		myv.setProperty("FLWMovable", FLWMovable);
		myv.setProperty("FLWSelfAlloc", FLWSelfAlloc);
		myv.setProperty("flw", flw);
		myv.setInt("DepicType", DepicType);
		myv.setBoolean("DragThrough", DragThrough);
		myv.setBoolean("EndBox", EndBox);
		myv.setBoolean("UnitCrossTac", UnitCrossTac);
		myv.setBoolean("EndCrossTac", EndCrossTac);

		super.writeExternal(out);
		out.writeObject(myv); */
	}

	/**
	* Gets the "head and tail" of the depictor in an addition operation.
	*/
	public void getAdditiveExtents(Q PrtCon, Mvec pos, Mvec tl) {
		Q Dcon = PrtCon;
		int CurSwap = DepicType;
		if (!DragThrough && (getVect().getBasis() < 0.0)) {
			CurSwap = 1 - CurSwap;
		};

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
	* Passes the preferred direction of the depictor to the parameter.
	*/
	public void preferredDirection(Mvec t1) {
		int CurSwap = DepicType;
		if (/* !DragThrough && */
			 (getVect().getBasis() < 0.0)) {
			CurSwap = 1 - CurSwap;
		}

		double d1 = t1.getBasis1();
		double d2 = t1.getBasis2();
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		if (len < 0.001)
			len = 0.001;

		if (CurSwap == 1) {
			dir.setBasis1(-d1 / len);
			dir.setBasis2(-d2 / len);
		}
		else {
			dir.setBasis1(d1 / len);
			dir.setBasis2(d2 / len);
		}
	}

	/**
	* Gets the positive direction of the depictor.
	*/
	public Mvec getPositiveDirection() {
		int CurSwap = DepicType;
		if (!DragThrough && (getVect().getBasis() < 0.0)) {
			CurSwap = 1 - CurSwap;
		}

		Mvec out = new Mvec();
		double d1 = dir.getBasis1();
		double d2 = dir.getBasis2();
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		if (len < 0.001)
			len = 0.001;

		if (CurSwap == 1) {
			out.setBasis1(-d1 / len);
			out.setBasis2(-d2 / len);
		}
		else {
			out.setBasis1(d1 / len);
			out.setBasis2(d2 / len);
		}

		return (out);
	}

	/**
	* Passes the positive direction of the depictor to the parameter.
	*/
	public void positiveDirection(Mvec t1) {
		int CurSwap = DepicType;
		if (!DragThrough && (getVect().getBasis() < 0.0)) {
			CurSwap = 1 - CurSwap;
		}

		double d1 = t1.getBasis1();
		double d2 = t1.getBasis2();
		double len = Math.sqrt(d1 * d1 + d2 * d2);
		if (len < 0.001)
			len = 0.001;

		if (CurSwap == 1) {
			dir.setBasis1(-d1 / len);
			dir.setBasis2(-d2 / len);
		}
		else {
			dir.setBasis1(d1 / len);
			dir.setBasis2(d2 / len);
		}
	}

//	protected VerdantiumPropertiesEditor getTypeControl(DepictorPort ThePort) {
//		return ((new SimpleTypeControl(this, DepicType, noSymBindings())));
//	};

	/**
	* Handles Ether Events.
	*/
	public Object processObjEtherEvent(EtherEvent in, Object refcon) {
		boolean handled = false;

/*		if (in instanceof DrawObjEtherEvent) {
			if (in.getEtherID().equals(DrawObjEtherEvent.setSimpleType)) {
				DepicType = ((Integer) (in.getParameter())).intValue();
				handled = true;
			}

			if (in.getEtherID().equals(DrawObjEtherEvent.getCustomControl)) {
				Object[] param = (Object[]) (in.getParameter());
				ToolPort ThePort = (ToolPort) (param[0]);
				XKit InAp = (XKit) (param[1]);
				handled = true;
				return (getCustomControl(ThePort, InAp));
			}

			if (in.getEtherID().equals(DrawObjEtherEvent.getTypeControl)) {
				Object[] param = (Object[]) (in.getParameter());
				DepictorPort ThePort = (DepictorPort) (param[0]);
				handled = true;
				return (getTypeControl(ThePort));
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
				case DIPort :
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
	* Gets the domain of the current port of the depictor, not counting other depictors.
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
		String[] ret = { "", "_hd", "_di", "_flw" };
		return (ret);
	}

	public void setEndTag() {
		BariText = 1.0;
	};
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
	private FlexString dIGetVectName() {
		return (DIVectName);
	};
	private FlexString fLWGetVectName() {
		return (FLWVectName);
	};
	private IntObj hDGetMovable() {
		return (HDMovable);
	};
	private IntObj dIGetMovable() {
		return (DIMovable);
	};
	private IntObj fLWGetMovable() {
		return (FLWMovable);
	};
	private void hDSetMovable(IntObj in) {
		HDMovable = in;
	};
	private void dISetMovable(IntObj in) {
		DIMovable = in;
	};
	private void fLWSetMovable(IntObj in) {
		FLWMovable = in;
	};
	private Mvec hDGetVect() {
		return (HDHexGlo);
	};
	private Mvec dIGetVect() {
		return (dir);
	};
	private Mvec fLWGetVect() {
		return (flw);
	};
	private IntObj hDGetSelfAlloc() {
		return (HDSelfAlloc);
	};
	private IntObj dIGetSelfAlloc() {
		return (DISelfAlloc);
	};
	private IntObj fLWGetSelfAlloc() {
		return (FLWSelfAlloc);
	};

	public Hexar hDGetHex(Q in) {
		return (in.getHex1());
	};
	public Hexar temptxtGetHex(Q in) {
		return (in.getHex2());
	};
	public Hexar tLGetHex(Q in) {
		return (in.getHex3());
	};
	public Hexar uLGetHex(Q in) {
		return (in.getHex4());
	};
	public Hexar temp1GetHex(Q in) {
		return (in.getHex5());
	};
	public Hexar temp2GetHex(Q in) {
		return (in.getHex6());
	};
	public Hexar temp3GetHex(Q in) {
		return (in.getHex7());
	};

	public boolean getDragThrough() {
		return (DragThrough);
	}

	public void setDragThrough(boolean in) {
		DragThrough = in;
	}

	public boolean getEndBox() {
		return (EndBox);
	}

	public void setEndBox(boolean in) {
		EndBox = in;
	}

	public boolean getUnitCrossTac() {
		return (UnitCrossTac);
	}

	public void setUnitCrossTac(boolean in) {
		UnitCrossTac = in;
	}

	public boolean getEndCrossTac() {
		return (EndCrossTac);
	}

	public void setEndCrossTac(boolean in) {
		EndCrossTac = in;
	}

	
	public abstract Q makeCoordContext();
	
	public abstract R makeClickRec();
	
	public abstract T makeMeta();

	
	/**
	* Sets the stroke used when rendering the object to a basic stroke with a certain width.
	*/
	public void setBasicFrontLineStroke(double in) {
		super.setBasicFrontLineStroke(in);
		flw.setBasis(in);
	}

//	protected VerdantiumPropertiesEditor getCustomControl(ToolPort ThePort, XKit InAp) {
//		return ((new SscaCustControl(this, ThePort, InAp, noSymBindings())));
//	};

	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	}

	public Mvec gtVect() {
		return (gbv);
	};


	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Ssca1Base.class));
	}

	protected boolean UnitCrossTac = true;
	protected boolean EndCrossTac = true;
	protected boolean EndBox = false;

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
	FlexString DIVectName;
	IntObj DIMovable = new IntObj();
	IntObj DISelfAlloc = new IntObj();
	FlexString FLWVectName;
	IntObj FLWMovable = new IntObj();
	IntObj FLWSelfAlloc = new IntObj();



};
