

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

package verdantium.kluges;



import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;




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
* An object that draws an infinite line on the display in Java-2D.
* @author Thorn Green
*/
public class InfiniteLine extends Object {
	/**
	* Draws an infinite line.
	*/
	public void draw(Canvas g, Paint p) {
		Rect Bounds = g.getClipBounds();
		double maxx = Bounds.right;
		double maxy = Bounds.bottom;
		double minx = Bounds.left;
		double miny = Bounds.top;
		double DelX = maxx - minx;
		double DelY = maxy - miny;
		double tmp = 0.0;

		tmp = Math.abs(px1 - minx);
		if (tmp > DelX)
			DelX = tmp;

		tmp = Math.abs(px1 - maxx);
		if (tmp > DelX)
			DelX = tmp;

		tmp = Math.abs(px2 - minx);
		if (tmp > DelX)
			DelX = tmp;

		tmp = Math.abs(px2 - maxx);
		if (tmp > DelX)
			DelX = tmp;

		tmp = Math.abs(py1 - miny);
		if (tmp > DelY)
			DelY = tmp;

		tmp = Math.abs(py1 - maxy);
		if (tmp > DelY)
			DelY = tmp;

		tmp = Math.abs(py2 - miny);
		if (tmp > DelY)
			DelY = tmp;

		tmp = Math.abs(py2 - maxy);
		if (tmp > DelY)
			DelY = tmp;

		double Del = 2.0 * (DelX + DelY);
		double Manlen = Math.abs(px2 - px1) + Math.abs(py2 - py1);
		if (Manlen < 0.0001)
			Manlen = 5;

		double x1 = px1;
		double y1 = py1;
		double x2 = px2;
		double y2 = py2;

		if (Extent1 == INFINITE_EXTENT) {
			x1 += (px1 - px2) * Del / Manlen;
			y1 += (py1 - py2) * Del / Manlen;
		}

		if (Extent2 == INFINITE_EXTENT) {
			x2 += (px2 - px1) * Del / Manlen;
			y2 += (py2 - py1) * Del / Manlen;
		}

		g.drawLine( (float) x1, (float) y1, (float) x2, (float) y2, p);
	}

	/**
	* Constructs the infinite line.
	*/
	public InfiniteLine() {}

	/**
	* Constructs an infinite line with endpoint extents <code>e1</code>
	* and <code>e2</code> for the first and second endpoints respectively.
	* Each extent can either be a <code>FINITE_EXTENT</code>, which means
	* that rendering ends at that endpoint, or an <code>INFINITE_EXTENT</code>,
	* which means that rendering continues through the endpoint to infinity.
	* For instance, both extents finite creates a line segment, one extent
	* finite and one extent infinite creates a ray, and both extents infinite
	* creates an infinite line.
	*/
	public InfiniteLine(int e1, int e2) {
		Extent1 = e1;
		Extent2 = e2;
	}

	/**
	* Sets the endpoint positions of the object.
	*/
	public void setLine(double x1, double y1, double x2, double y2) {
		px1 = x1;
		py1 = y1;
		px2 = x2;
		py2 = y2;
	}

	/**
	* A finite extent.
	*/
	public final static int FINITE_EXTENT = 0;
	/**
	* An infinite extent.  Use this to make one side of the rendered
	* version of the object infinitely long.
	*/
	public final static int INFINITE_EXTENT = 1;

	private int Extent1 = INFINITE_EXTENT;
	private int Extent2 = INFINITE_EXTENT;
	private double px1 = 0.0;
	private double py1 = 0.0;
	private double px2 = 0.0;
	private double py2 = 0.0;
}
