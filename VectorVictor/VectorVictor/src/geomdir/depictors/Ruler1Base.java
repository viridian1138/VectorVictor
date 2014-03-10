



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
import geomdir.Hexar;
import geomdir.Mvec;
import geomdir.ToolPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.URL;
import java.text.NumberFormat;

import meta.DataFormatException;
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
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/16/2001            | Thorn Green (viridian_1138@yahoo.com)           | Online help for depictors.                                           | Created depictor help classes from existing classes, modified depictors.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
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
* Depicts a ruler where the value from the end to the "1.0" line is always
* the unit length of the GCS.  The "_hd_" port point defines the base of the
* ruler.  The scalar value in the "vector port" defines the measurement length.
* The measurement direction is along the "_di_" port vector.  Always set the
* "_di_" port to a unit vector.
* For more information on depictors in general see {@link geomdir.DrawObj}.
*/
public abstract class Ruler1Base<T extends Ruler1Base, Q extends Ruler1Base.RulerContext, R extends APPRec<Dsca1Base.Dsca1Evt,?,Q>> extends Dsca1Base<T,Q,R> implements Externalizable {
	
	
public static abstract class RulerContext<T extends RulerContext> extends DefContext<T> {
		public RulerContext(int MajorGraduationLevel, int MinorGraduationDelta) {
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

			MajGradLev = MajorGraduationLevel;
			MinGradDelta = MinorGraduationDelta;
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
		
		protected int MajGradLev;
		protected int MinGradDelta;
	};
	
	
	


public static class RulerContextImpl extends RulerContext<RulerContextImpl>
{
	public RulerContextImpl(int MajorGraduationLevel, int MinorGraduationDelta)
	{
		super(MajorGraduationLevel, MinorGraduationDelta);
	}

	@Override
	public RulerContextImpl makeMeta() {
		return( new RulerContextImpl( MajGradLev , MinGradDelta ) );
	}
};

	
	
	
	
	int MajorGraduationLevel = 3;
	int MinorGraduationDelta = 3;
	boolean HasNegative = false;
	Paint tFont = null;

	boolean UseGlobalUnit = true;
	double PixelUnit = 1.0;

	/**
	* Gets the measurement value of the depictor.
	*/
	protected double getRuledVal(DepictorPort ThePort) {
		double val = 0.0;

		if (UseGlobalUnit) {
			val = Math.abs(getVect().getBasis()) / PixelUnit;
		}
		else {
			val = (Math.abs(getVect().getBasis()) * ThePort.getCoordRad()) / PixelUnit;
		}

		return (val);
	}

	/**
	* Updates the depictor.
	*/
	public void updateYourself(DepictorPort ThePort, Q PrtCon, boolean bound, DepictorPort.ToolMode toolMode) {
		int count;
		double MinDepth = 30.0;
		super.updateYourself(ThePort, PrtCon, bound, toolMode);
		Q Dcon = PrtCon;
		int PrevMajorGrad = Dcon.getCurrentMajorGrad();
		int MajorGrad = MajorGraduationLevel;
		int MajGrad = 1 << MajorGraduationLevel;
		double Log2 = Math.log(2);
		boolean PrevHasNeg = Dcon.getPrevHasNeg();

		double ScaVal = Math.abs(getVect().getBasis());
		double GloVal = getRuledVal(ThePort);

		double tmp0 = Math.log(GloVal) / Log2;
		int tmp1 = (int) tmp0;
		double tmp2 = Math.pow(2, tmp1);

		if (((double) tmp2 - tmp0) > 0.0001) {
			tmp1++;
			tmp2 = tmp2 * 2.0;
		}

		double tmp3 = tmp2 / ((double) MajGrad);

		double x1 = hDGetHex(Dcon).getPtx();
		double y1 = hDGetHex(Dcon).getPty();
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
				dir.scale(MyDist * ScaVal / GloVal, tmp);
				tmp.vadd(HDHexGlo, ((Dcon.getRulerPoints())[count]).getGlo());
				ThePort.hexloc(HDHexGlo, bound, (Dcon.getRulerPoints())[count]);

				if ((Dcon.getPreviousScale() != tmp1) || (MajorGrad != PrevMajorGrad) || (PrevHasNeg != HasNegative)) {
					(Dcon.getRulerLabels())[count] = (new Double(MyDist).toString());
				}
			}
		}
		else {
			for (count = 0; count <= MajGrad; count++) {
				double MyDist = count * tmp3;
				dir.scale(MyDist * ScaVal / GloVal, tmp);
				tmp.vadd(HDHexGlo, ((Dcon.getRulerPoints())[count]).getGlo());
				ThePort.hexloc(HDHexGlo, bound, (Dcon.getRulerPoints())[count]);

				if ((Dcon.getPreviousScale() != tmp1) || (MajorGrad != PrevMajorGrad) || (PrevHasNeg != HasNegative)) {
					(Dcon.getRulerLabels())[count] = (new Double(MyDist).toString());
				}
			}
		}

		Dcon.setPrevHasNeg(HasNegative);
		Dcon.setCurrentMajorGrad(MajorGrad);
		Dcon.setPreviousScale(tmp1);

		if (Dcon.getLine1() == null) {
			Dcon.setLine1(new RectF());
		}
	}

	/**
	* Renders the ruler.
	*/
	public void drawYourself(DepictorPort ThePort, Q PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		Q Dcon = PrtCon;
		int MajorGrad = Dcon.getCurrentMajorGrad();
		p.setStyle(Style.STROKE);

		int max;
		if (HasNegative)
			max = 1 << (MajorGrad + 1);
		else
			max = 1 << MajorGrad;

		int MaxDelta = 1 << MinorGraduationDelta;
		double ArrLen = 6.0;
		double CirLen = 10.0;
		double x1 = ((Dcon.getRulerPoints())[0]).getPtx();
		double y1 = ((Dcon.getRulerPoints())[0]).getPty();
		double x2 = ((Dcon.getRulerPoints())[max]).getPtx();
		double y2 = ((Dcon.getRulerPoints())[max]).getPty();

		double DeltaX = x1 - x2;
		double DeltaY = y1 - y2;
		double ManLen = Math.abs(DeltaX) + Math.abs(DeltaY);
		if (ManLen < 0.001)
			ManLen = 5;
		double delx = x2 - x1;
		double dely = y2 - y1;
		double len = Math.sqrt(delx * delx + dely * dely);

		p.setStrokeCap( getFrontLineStroke().getStrokeCap() );
		p.setStrokeJoin( getFrontLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getFrontLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getFrontLineStroke().getStrokeWidth() );
		p.setColor(FrontLineColor);

		boolean tmp = FrontLineVisible;
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp) {
			g.drawLine((float)x1,(float)y1,(float)x2,(float)y2,p);
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
				g.drawLine((float)xa,(float)ya,(float)xb,(float)yb,p);
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

					g.drawLine((float)pax1,(float)pay1,(float)xb,(float)yb,p);

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
	* Overrides the superclass method so that clicking on the ruler causes the ruler value
	* at the point of the mouse-click to be appended to the status list.  This is done mainly
	* to support the educational project.
	*/
	public R clickedInRegion(
		DepictorPort ThePort,
		Q PrtCon,
		boolean bound,
		PointF LocEvent,
		DepictorPort.ToolMode toolMode) {
		R MyRec = super.clickedInRegion(ThePort, PrtCon, bound, LocEvent, toolMode);

		if ((MyRec == null)
			&& ((toolMode == DepictorPort.ToolMode.FREE_TRANSFORMATION_MODE) || (toolMode == DepictorPort.ToolMode.ACCESSORY_TRANS_MODE))) {
			Q Dcon = PrtCon;
			double BariText = 1.0;
			double OffsetText = 1.0;

			Hexar MyHex = new Hexar();
			PointF InPt = LocEvent;
			Mvec VectVal = new Mvec();
			Mvec InVect = new Mvec();
			Mvec dprod = new Mvec();
			VectVal.setBasis1((gtVect()).getBasis1());
			VectVal.setBasis2((gtVect()).getBasis2());
			ThePort.hexglo(InPt.x, InPt.y, HDHexGlo, bound, MyHex);
			MyHex.getGlo().vsub(HDHexGlo, InVect);
			VectVal.dot(InVect, dprod);
			double MultVal = dprod.getBasis();
			double d1 = VectVal.getBasis1();
			double d2 = VectVal.getBasis2();
			double dn = d1 * d1 + d2 * d2;

			if (dn < 0.001)
				BariText = 0.0;
			else
				BariText = MultVal / dn;
			double FinalVal = BariText * (getVect()).getBasis();

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
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		String tmp = MyProp.getProperty(key + ".MajorGrad");
		if (tmp != null)
			MajorGraduationLevel = MyProp.getInt(key + ".MajorGrad");

		tmp = MyProp.getProperty(key + ".MinorGradDelta");
		if (tmp != null)
			MinorGraduationDelta = MyProp.getInt(key + ".MinorGradDelta");

		tmp = MyProp.getProperty(key + ".HasNegative");
		if (tmp != null)
			HasNegative = MyProp.getBoolean(key + ".HasNegative");

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		MyProp.putInt(key + ".MajorGrad", MajorGraduationLevel);

		MyProp.putInt(key + ".MinorGradDelta", MinorGraduationDelta);

		MyProp.putBoolean(key + ".HasNegative", HasNegative);

	};

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			super.readExternal(in);
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			MajorGraduationLevel = myv.getInt("MajorGraduationLevel");
			MinorGraduationDelta = myv.getInt("MinorGraduationDelta");
			HasNegative = myv.getBoolean("HasNegative");
			UseGlobalUnit = myv.getBoolean("UseGlobalUnit");
			PixelUnit = myv.getDouble("PixelUnit");
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
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setInt("MajorGraduationLevel", MajorGraduationLevel);
		myv.setInt("MinorGraduationDelta", MinorGraduationDelta);
		myv.setBoolean("HasNegative", HasNegative);
		myv.setBoolean("UseGlobalUnit", UseGlobalUnit);
		myv.setDouble("PixelUnit", PixelUnit);

		super.writeExternal(out);
		out.writeObject(myv);
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
		((T) UndoNode).HasNegative = HasNegative;
	}

	/**
	* Performs an undo on a drag operation.
	*/
	public void popDragUndo() {
		super.popDragUndo();

		boolean TmpNegative;

		TmpNegative = HasNegative;
		HasNegative = ((T) UndoNode).HasNegative;
		((T) UndoNode).HasNegative = TmpNegative;
	}

	public Ruler1Base() {
		super();
		tFont = new Paint();
		tFont.setTextSize( 12 );
		tFont.setTypeface(Typeface.create(Typeface.SERIF,
                Typeface.NORMAL));
	}

//	protected VerdantiumPropertiesEditor getTypeControl(DepictorPort ThePort) {
//		return (null);
//	}

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

//	protected VerdantiumPropertiesEditor getCustomControl(ToolPort ThePort, XKit InAp) {
//		return ((new RulerCustControl(this, ThePort, InAp)));
//	};

	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	};

	public T copyUser1() {
		T temp = makeMeta();
		super.copyUser1Info(temp);
		return (temp);
	};
	public void copyUser1Info(T out) {
		super.copyUser1Info(out);
	};

	/**
	* Gets whether the ruler extends to include both positive and negative numbers.
	*/
	public boolean getHasNegative() {
		return (HasNegative);
	}

	/**
	* Gets whether the ruler extends to include both positive and negative numbers.
	* The ruler can double as a "number line" that shows where a series of numbers are
	* in relation to the origin.  Passing in "true" indicates that the "number line" should
	* have both positive and negative numbers.  Passing "false" indicates that only positive
	* numbers are desired.
	*/
	public void setHasNegative(boolean in) {
		HasNegative = in;
	}

	/**
	* Optional method to display help in a component.
	*/
//	public static void displayVerdantiumHelp(VerdantiumComponent in) {
//		Ruler1BaseHelp.run(in);
//	}

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(Ruler1Base.class));
	}

	public static boolean getSelfNaming() {
		return (true);
	}

	/**
	* Instructs the ruler to use the global unit as its measurement scale.
	* This is the default setting for the ruler.
	*/
	public void setUseGlobalUnit() {
		UseGlobalUnit = true;
		PixelUnit = 1.0;
	}

	/**
	* Instructs the ruler to use the global unit as its measurement scale.
	*/
	public void setUseGlobalUnit(double in) {
		UseGlobalUnit = true;
		PixelUnit = in;
	}

	/**
	* Instructs the ruler to use a certain number of pixels as its measurement scale.
	*/
	public void setUsePixelUnit(double val) {
		UseGlobalUnit = false;
		PixelUnit = val;
	}

	

}
