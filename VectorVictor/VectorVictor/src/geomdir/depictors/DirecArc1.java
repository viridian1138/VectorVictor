



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

import geomdir.CoordContext;
import geomdir.DepictorPort;
import geomdir.DrawObjEtherEvent;
import geomdir.ToolPort;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.net.URL;

import meta.DataFormatException;
import meta.Meta;
import meta.VersionBuffer;
import verdantium.EtherEvent;
import verdantium.utils.VTextProperties;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;


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
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve comparison operation (GeoCard).                              | Exposed constants so they could be set externally.
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
* Depicts a directional arc segment.  This is a arc that shows
* that two points are equidistant from a center.  Uses the same
* ports as {@link Arc1}.
*/
public class DirecArc1 extends Arc1 implements Externalizable {
	public final static int DirNone = 0;
	public final static int DirUniMid = 1;
	public final static int DirUniTip = 2;
	public final static int DirBidirec = 3;

	static final double ArrLen = 6.0;
	int Directionals = DirUniMid;

	/**
	* Draws the directional arc.
	*/
	public void drawYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, Canvas g, Paint p, DepictorPort.ToolMode toolMode) {
		DefContext Dcon = (DefContext) PrtCon;
		RectF MyRect = Dcon.getRect1();
		p.setStyle( Style.STROKE );
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

		if (tmp)
			g.drawArc(MyRect, 
					(float)( -getStrtAng(Dcon) ), (float)( -getEndAng(Dcon) ), false, p);
		/* g.setColor( TextColor ); */

		switch (Directionals) {
			case DirNone :
				break;
			case DirUniMid :
				drawFwdMidArrow(ThePort, g, p, Dcon);
				break;
			case DirUniTip :
				drawFwdEndArrow(ThePort, g, p, Dcon);
				break;
			case DirBidirec :
				drawFwdEndArrow(ThePort, g, p, Dcon);
				drawBakEndArrow(ThePort, g, p, Dcon);
				break;
		}

		tmp = TextVisible && getNamedVar();
		if ((!tmp) && (toolMode == DepictorPort.ToolMode.COLOR_MODE) && getNamedVar()) {
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
	* Draws a forward arrow in the middle of the arc.
	*/
	void drawFwdMidArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		double MyAng = (getStrtAng(Dcon) + getEndAng(Dcon) / 2.0) * Math.PI / 180.0;
		double xa1 = mXGetHex(Dcon).getPtx() + getRadLen(Dcon) * Math.cos(MyAng);
		double ya1 = mXGetHex(Dcon).getPty() - getRadLen(Dcon) * Math.sin(MyAng);
		double dx1 = tLGetHex(Dcon).getPtx() - hDGetHex(Dcon).getPtx();
		double dy1 = tLGetHex(Dcon).getPty() - hDGetHex(Dcon).getPty();
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
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Draws a forward arrow one third of the way up the arc.
	*/
	void drawFwdOneThirdArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		boolean tmp = FrontLineVisible;
		double xe1 = hDGetHex(Dcon).getPtx();
		double ye1 = hDGetHex(Dcon).getPty();
		double xe2 = tLGetHex(Dcon).getPtx();
		double ye2 = tLGetHex(Dcon).getPty();

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = (xe1 + 2.0 * xe2) / 3.0;
		double y2 = (ye1 + 2.0 * ye2) / 3.0;

		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Drwas a forward arrow five sixths of the way up the arc.
	*/
	void drawFwdFiveSixthArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		boolean tmp = FrontLineVisible;
		double xe1 = hDGetHex(Dcon).getPtx();
		double ye1 = hDGetHex(Dcon).getPty();
		double xe2 = tLGetHex(Dcon).getPtx();
		double ye2 = tLGetHex(Dcon).getPty();

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = (xe1 + 5.0 * xe2) / 6.0;
		double y2 = (ye1 + 5.0 * ye2) / 6.0;

		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Drwas a forward arrow at the end of the arc.
	*/
	void drawFwdEndArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		double tx = tLGetHex(Dcon).getPtx() - mXGetHex(Dcon).getPtx();
		double ty = tLGetHex(Dcon).getPty() - mXGetHex(Dcon).getPty();
		boolean tmp = FrontLineVisible;
		double xe1 = tLGetHex(Dcon).getPtx();
		double ye1 = tLGetHex(Dcon).getPty();
		double xe2 = tLGetHex(Dcon).getPtx();
		double ye2 = tLGetHex(Dcon).getPty();

		if ((getEndAng(Dcon)) <= 0) {
			xe1 = xe1 + ty;
			ye1 = ye1 - tx;
		}
		else {
			xe1 = xe1 - ty;
			ye1 = ye1 + tx;
		}

		double x1 = xe1;
		double y1 = ye1;
		double x2 = xe2;
		double y2 = ye2;

		double DelX;
		double DelY;
		double DeltaX = x2 - x1;
		double DeltaY = y2 - y1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

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
	* Draws a backward arrow in the middle of the arc.
	*/
	void drawBakMidArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		boolean tmp = FrontLineVisible;
		double xe2 = hDGetHex(Dcon).getPtx();
		double ye2 = hDGetHex(Dcon).getPty();
		double xe1 = tLGetHex(Dcon).getPtx();
		double ye1 = tLGetHex(Dcon).getPty();

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
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Draws a backward arrow one third of the way up the arc.
	*/
	void drawBakOneThirdArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		boolean tmp = FrontLineVisible;
		double xe2 = hDGetHex(Dcon).getPtx();
		double ye2 = hDGetHex(Dcon).getPty();
		double xe1 = tLGetHex(Dcon).getPtx();
		double ye1 = tLGetHex(Dcon).getPty();

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = (xe1 + 2.0 * xe2) / 3.0;
		double y2 = (ye1 + 2.0 * ye2) / 3.0;

		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Draws a backward arrow fix sixths of the way up the arc.
	*/
	void drawBakFiveSixthArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		boolean tmp = FrontLineVisible;
		double xe2 = hDGetHex(Dcon).getPtx();
		double ye2 = hDGetHex(Dcon).getPty();
		double xe1 = tLGetHex(Dcon).getPtx();
		double ye1 = tLGetHex(Dcon).getPty();

		double DelX;
		double DelY;
		double DeltaX = xe2 - xe1;
		double DeltaY = ye2 - ye1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

		double x2 = (xe1 + 5.0 * xe2) / 6.0;
		double y2 = (ye1 + 5.0 * ye2) / 6.0;

		Path OrigPath = ThePort.getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		g.translate((float)ArrLen, 0f);
		
		if (tmp) {
			g.drawPath(OrigPath,p);
		}

        g.restoreToCount(saveCount);
	}

	/**
	* Draws a backward arrow at the end of the arc.
	*/
	void drawBakEndArrow(DepictorPort ThePort, Canvas g, Paint p, DefContext Dcon) {
		double tx = hDGetHex(Dcon).getPtx() - mXGetHex(Dcon).getPtx();
		double ty = hDGetHex(Dcon).getPty() - mXGetHex(Dcon).getPty();
		boolean tmp = FrontLineVisible;
		double xe2 = hDGetHex(Dcon).getPtx();
		double ye2 = hDGetHex(Dcon).getPty();
		double xe1 = hDGetHex(Dcon).getPtx();
		double ye1 = hDGetHex(Dcon).getPty();

		if ((getEndAng(Dcon)) <= 0) {
			xe1 = xe1 - ty;
			ye1 = ye1 + tx;
		}
		else {
			xe1 = xe1 + ty;
			ye1 = ye1 - tx;
		}

		double x1 = xe1;
		double y1 = ye1;
		double x2 = xe2;
		double y2 = ye2;

		double DelX;
		double DelY;
		double DeltaX = x2 - x1;
		double DeltaY = y2 - y1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;

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
	* Loads persistent properties.
	*/
	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		super.loadProperties(ThePort, MyProp);

		String tmp = MyProp.getProperty(key + ".Directionals");
		if (tmp != null)
			Directionals = MyProp.getInt(key + ".Directionals");

	};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		super.saveProperties(ThePort, MyProp);

		MyProp.putInt(key + ".Directionals", Directionals);

	};

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			super.readExternal(in);
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			Directionals = myv.getInt("Directionals");
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

		myv.setInt("Directionals", Directionals);

		super.writeExternal(out);
		out.writeObject(myv);
	}

	/**
	* Stores data for an undo.
	*/
	public void pushDragUndo() {
		UndoNode = new DirecArc1();
		VectPtr.copyAllInfo(UndoNode.VectPtr);
		HDHexGlo.copyAllInfo(UndoNode.HDHexGlo);
		MDHexGlo.copyAllInfo(UndoNode.MDHexGlo);
		((DirecArc1) UndoNode).Directionals = Directionals;
	}

	/**
	* Performs an undo operation.
	*/
	public void popDragUndo() {
		super.popDragUndo();

		int TmpDirec;

		TmpDirec = Directionals;
		Directionals = ((DirecArc1) UndoNode).Directionals;
		((DirecArc1) UndoNode).Directionals = TmpDirec;
	}

	public Meta copyUser1() {
		DirecArc1 temp = new DirecArc1();
		super.copyUser1Info(temp);
		return (temp);
	};
	public void copyUser1Info(Meta out) {
		super.copyUser1Info(out);
	};

	public void setDirec(int in) {
		Directionals = in;
	};

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
//		return ((new DirecArcCustControl(this, Directionals, ThePort, InAp)));
//	};
	protected void undoCustomControl(ToolPort ThePort) {
		popDragUndo();
	};

	/**
	* Optional method to display help in a component.
	*/
//	public static void displayVerdantiumHelp(VerdantiumComponent in) {
//		DirecArc1Help.run(in);
//	}

	public static URL getUpImgUrl() {
		return (getDefaultUpImgUrl(DirecArc1.class));
	}


}
