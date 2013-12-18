

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


package verdantium.mathimage;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.Callback;
import meta.DataFormatException;
import meta.FlexString;
import meta.VersionBuffer;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;


/**
* Copyright (C) 1993-2004 Thorn Green. All Rights Reserved.
*/

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
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
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
* MathImage creates a displayable mathematical symbol given
* a symbolic description of that symbol in a text string.
*
* <P>
* @author Thorn Green
*/
public class MathImage extends Callback implements MathImageConstants, Externalizable {
	private FlexString MyStr = null;
	private SCodeGen MyGen = new SCodeGen();
	private Paint MyPaint = null;

	/**
	* Creates MathImage for string <code>ins</code> displayed using
	* point size <code>PtSize</code> and color <code>col</code>.  InAp provides a rendering context for calculating
	* font metrics.  The font used is serif italic.
	*/
	public MathImage(String ins, Integer col, double PtSize, Paint AntialiasValue) throws MathImageParseException {
		MyPaint = new Paint( AntialiasValue );
		MyPaint.setTextSize( (float) PtSize );
		MyPaint.setTypeface( Typeface.create( "Serif" , Typeface.ITALIC ) );

		MyStr = new FlexString(ins);
		MyGen.generateCode(MyStr, SupervisorMode, MyPaint, col);
	}

	/**
	* Creates MathImage for string <code>ins</code> displayed using
	* point size <code>PtSize</code> and color <code>col</code>.  InAp provides a rendering context for calculating
	* font metrics.  The font used is serif italic.
	*/
	public MathImage(FlexString ins, Integer col, double PtSize, Paint AntialiasValue) throws MathImageParseException {
		MyPaint = new Paint( AntialiasValue );
		MyPaint.setTextSize( (float) PtSize );
		MyPaint.setTypeface( Typeface.create( "Serif" , Typeface.ITALIC ) );

		MyGen.generateCode(ins, SupervisorMode, MyPaint, col);
	}

	/**
	* Creates MathImage for string <code>ins</code> displayed using
	* font <code>InFont</code> and color <code>col</code>.  InAp provides a rendering context for calculating
	* font metrics.
	*/
	public MathImage(String ins, Integer col, Paint InFont) throws MathImageParseException {

		MyStr = new FlexString(ins);
		MyGen.generateCode(MyStr, SupervisorMode, InFont, col);
	}

	/**
	* Creates MathImage for string <code>ins</code> displayed using
	* font <code>InFont</code> and color <code>col</code>.  InAp provides a rendering context for calculating
	* font metrics.
	*/
	public MathImage(FlexString mys, Integer col, Paint InFont) throws MathImageParseException {

		MyStr = mys;
		MyGen.generateCode(mys, SupervisorMode, InFont, col);
	}


	/**
	* This constructor is intended for use only when a MathImage is pulled in from
	* serial storage.  Don't use it.
	*/
	public MathImage() {}

	/**
	* Gets the string that the MathImage displays.
	*/
	public FlexString getStr() {
		return (MyStr);
	}

	

	/**
	* Draws the symbol in the graphics context provided.
	*/
	public void paintMath(Canvas g, double x, double y) {
		MyGen.drawResult(g, (int) x, (int) y);
	}

	/**
	* Gets the size of the symbol.
	*/
	public RectF getSize() {
		return (new RectF(0,0,MyGen.getWidth(), MyGen.getHeight()));
	}

	/**
	* Gets the height of the symbol.
	*/
	public int getHeight() {
		return (MyGen.getHeight());
	}

	/**
	* Gets the width of the symbol.
	*/
	public int getWidth() {
		return (MyGen.getWidth());
	}

	/**
	* If a cursor was specified in the input string, turn it on or off.
	* This is used to "blink" the cursor.
	*/
	public void setDrawCursor(boolean in) {
		MyGen.setDrawCursor(in);
	}
	/**
	* Returns whether the cursor if off.
	*/
	public boolean getDrawCursor() {
		return (MyGen.getDrawCursor());
	}

	/**
	* Throws an exception iff. the string is not in MathImage format.
	*/
	public static void chkParseMi(FlexString in, int MyMode) throws MathImageParseException {
		SCodeGen.chkParseMi(in, MyMode);
	}

	/**
	* Throws an exception iff. the string is not in MathImage format.
	*/
	public static void chkParse(FlexString in, int MyMode) throws DataFormatException {
		try {
			chkParseMi(in, MyMode);
		}
		catch (Exception ex) {
			throw (new DataFormatException(ex));
		}
	}

	/**
	* Reads serial data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		/* try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			MyGen = (SCodeGen) (myv.getProperty("MyGen"));
			VersionBuffer.chkNul(MyGen);

			String FontName = (String) (myv.getProperty("FontName"));
			if (FontName != null) {
				String FontFamily = (String) (myv.getProperty("FontFamilyName"));
				VersionBuffer.chkNul(FontFamily);
				int FontSize = myv.getInt("FontSize");
				int FontStyle = myv.getInt("FontStyle");
				MyFont = new Font(FontName, FontStyle, FontSize);
			}

			MyStr = (FlexString) (myv.getProperty("MyStr"));
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		} */
	}

	/**
	* Writes serial data.
	* <P>
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		/* myv.setProperty("MyGen", MyGen);

		if (MyFont != null) {
			myv.setProperty("FontName", MyFont.getName());
			myv.setProperty("FontFamilyName", MyFont.getFamily());
			myv.setInt("FontSize", MyFont.getSize());
			myv.setInt("FontStyle", MyFont.getStyle());
		}

		if (MyStr != null)
			myv.setProperty("MyStr", MyStr); */

		out.writeObject(myv);
	}

}
