


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
import geomdir.Hexar;
import geomdir.Mvec;
import meta.FlexString;
import meta.Meta;
import verdantium.kluges.InfiniteLine;
import android.graphics.Path;
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
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Allow for both end and unit cross tac (Ssca1).                       | Put in code to do this.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
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
* This class contains pixel-level coordinate context information
* used by many depictor classes.  A depictor does not have to use this class,
* any subclass of {@link geomdir.CoordContext} will do.
*  The main reason multiple depictors use this
* class is because it's convenient and using a single class reduced redundancy.
* Note: information in this class is private to the creating depictor.  Non-depictor
* classes (e.g. {@link geomdir.Ktool}) should not be looking at the contents of
* objects of this class.  However, they can look at the contents of
* {@link geomdir.ClickRec}.  All the methods in this class are one-line
* "get-set" methods on private members.  They likely don't need full documentation
* at this time.
*/
public abstract class DefContext<T extends DefContext> extends CoordContext<T> {
	public final void datCpy(T out) {
		out.setX(x);
		out.setY(y);
		out.setWidth(width);
		out.setHeight(height);
		out.setMyPoly(MyPoly);
		if (MyLabel != null)
			out.setMyLabel((FlexString) (MyLabel.copyAll()));

		out.setD1(d1);
		out.setD2(d2);
		out.setD3(d3);

		txtDelMvec.mcpy(out.getTxtDelMvec());

		hx1.copyAllInfo(out.getHex1());
		hx2.copyAllInfo(out.getHex2());
		hx3.copyAllInfo(out.getHex3());
		hx4.copyAllInfo(out.getHex4());
		hx5.copyAllInfo(out.getHex5());
		hx6.copyAllInfo(out.getHex6());
		hx7.copyAllInfo(out.getHex7());
		hx8.copyAllInfo(out.getHex8());
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
		datCpy(in);
	};
	public void copySubInfo(T in) {
		datCpy(in);
	};
	public void copyAllInfo(T in) {
		datCpy(in);
	};
	public void eraseNode() {};
	public void eraseSub() {};
	public void eraseAll() {};
	
	public abstract T makeMeta();

	public final Hexar getHex1() {
		return (hx1);
	};
	public final Hexar getHex2() {
		return (hx2);
	};
	public final Hexar getHex3() {
		return (hx3);
	};
	public final Hexar getHex4() {
		return (hx4);
	};
	public final Hexar getHex5() {
		return (hx5);
	}
	public final Hexar getHex6() {
		return (hx6);
	}
	public final Hexar getHex7() {
		return (hx7);
	}
	public final Hexar getHex8() {
		return (hx8);
	}

	public final int getX() {
		return (x);
	}
	public final void setX(int in) {
		x = in;
	}
	public final int getY() {
		return (y);
	}
	public final void setY(int in) {
		y = in;
	}
	public final int getWidth() {
		return (width);
	}
	public final void setWidth(int in) {
		width = in;
	}
	public final int getHeight() {
		return (height);
	}
	public final void setHeight(int in) {
		height = in;
	}
	public final Path getMyPoly() {
		return (MyPoly);
	}
	public final void setMyPoly(Path in) {
		MyPoly = in;
	}
	public final FlexString getMyLabel() {
		return (MyLabel);
	}
	public final void setMyLabel(FlexString in) {
		MyLabel = in;
	}
	public final double getD1() {
		return (d1);
	}
	public final void setD1(double in) {
		d1 = in;
	}
	public final double getD2() {
		return (d2);
	}
	public final void setD2(double in) {
		d2 = in;
	}
	public final double getD3() {
		return (d3);
	}
	public final void setD3(double in) {
		d3 = in;
	}

	public final void setRect1(RectF in) {
		Rect1 = in;
	}
	public final RectF getRect1() {
		return (Rect1);
	}
	public final void setRect2(RectF in) {
		Rect2 = in;
	}
	public final RectF getRect2() {
		return (Rect2);
	}
	public final void setCirc1(RectF in) {
		Circ1 = in;
	}
	public final RectF getCirc1() {
		return (Circ1);
	}
	public final void setLine1(RectF in) {
		Line1 = in;
	}
	public final RectF getLine1() {
		return (Line1);
	}
	public final void setLine2(RectF in) {
		Line2 = in;
	}
	public final RectF getLine2() {
		return (Line2);
	}
	public final void setLine3(RectF in) {
		Line3 = in;
	}
	public final RectF getLine3() {
		return (Line3);
	}
	public final void setPath1(Path in) {
		Path1 = in;
	}
	public final Path getPath1() {
		return (Path1);
	}
	public final void setInf1(InfiniteLine in) {
		Inf1 = in;
	}
	public final InfiniteLine getInf1() {
		return (Inf1);
	}
	public final Mvec getTxtDelMvec() {
		return (txtDelMvec);
	}

	private int x;
	private int y;
	private int width;
	private int height;
	private Path MyPoly;
	private FlexString MyLabel;

	private double d1;
	private double d2;
	private double d3;

	private RectF Rect1 = null;
	private RectF Rect2 = null;
	private RectF Circ1 = null;
	private RectF Line1 = null;
	private RectF Line2 = null;
	private RectF Line3 = null;
	private Path Path1 = null;
	private InfiniteLine Inf1 = null;

	private final Mvec txtDelMvec = new Mvec();

	private final Hexar hx1 = new Hexar();
	private final Hexar hx2 = new Hexar();
	private final Hexar hx3 = new Hexar();
	private final Hexar hx4 = new Hexar();
	private final Hexar hx5 = new Hexar();
	private final Hexar hx6 = new Hexar();
	private final Hexar hx7 = new Hexar();
	private final Hexar hx8 = new Hexar();
};
