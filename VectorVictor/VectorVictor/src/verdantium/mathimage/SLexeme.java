package verdantium.mathimage;


import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.Meta;
import meta.VersionBuffer;
import android.graphics.Paint;
import android.graphics.RectF;



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
* Defines the lexeme type used by {@link MathImage}.
* @author Thorn Green
*/
public class SLexeme extends Meta implements Externalizable {
	/**
	* Copies the lexeme to <code>out</code>.
	*/
	public void datCpy(SLexeme out) {
		out.setStartLoc(StartLoc);
		out.setEndLoc(EndLoc);
		out.setMyMatch(MyMatch);
		out.setMetaPtr(MyMeta);

		out.setXOffset(XOffset);
		out.setYOffset(YOffset);
		out.setConnRect(ConnRect);
		out.setImgRect(ImgRect);
		out.setPaint(MyPaint);
	};
	/**
	* @see meta.Meta
	*/
	public Meta copyNode() {
		SLexeme temp = new SLexeme();
		datCpy(temp);
		return (temp);
	};
	/**
	* @see meta.Meta
	*/
	public Meta copySub() {
		SLexeme temp = new SLexeme();
		datCpy(temp);
		return (temp);
	};
	/**
	* @see meta.Meta
	*/
	public Meta copyAll() {
		SLexeme temp = new SLexeme();
		datCpy(temp);
		return (temp);
	};
	/**
	* @see meta.Meta
	*/
	public void copyNodeInfo(Meta in) {
		SLexeme temp = (SLexeme) in;
		datCpy(temp);
	};
	/**
	* @see meta.Meta
	*/
	public void copySubInfo(Meta in) {
		SLexeme temp = (SLexeme) in;
		datCpy(temp);
	};
	/**
	* @see meta.Meta
	*/
	public void copyAllInfo(Meta in) {
		SLexeme temp = (SLexeme) in;
		datCpy(temp);
	};
	/**
	* @see meta.Meta
	*/
	public void eraseNode() {};
	/**
	* @see meta.Meta
	*/
	public void eraseSub() {};
	/**
	* @see meta.Meta
	*/
	public void eraseAll() {};
	/**
	* @see meta.Meta
	*/
	public void wake() {};

	/**
	* Gets the lexeme color.
	*/
	public Paint getPaint() {
		return (MyPaint);
	}
	/**
	* Sets the lexeme color.
	*/
	public void setPaint(Paint in) {
		MyPaint = in;
		MyPaint.setAntiAlias( true ); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	}
	
	public Paint getPaintNonNull()
	{
		if( MyPaint == null )
		{
			MyPaint = new Paint();
			MyPaint.setAntiAlias( true ); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}
		return( MyPaint );
	}
	
	/**
	* Gets the connection rectangle of the lexeme.  This is the rectangle
	* that extends horizontally from connection point to connection point
	* on a block of symbols, where it is assumed that symbols are connected
	* along the baseline.  This is different from the image rectangle because
	* an italic character slants forward at an angle from the connection
	* point.  So the image rectangle of an italic character is wider than the
	* connection rectangle.
	* <P>
	* @see #getImgRect()
	*/
	public RectF getConnRect() {
		return (ConnRect);
	}
	/**
	* Sets the connection rectangle of the lexeme.
	* <P>
	* @see #getConnRect()
	*/
	public void setConnRect(RectF in) {
		ConnRect = in;
	}
	/**
	* Gets the image rectangle of the lexeme.  This is defined
	* as the rectangle that completely encloses the block of
	* characters contained in the lexeme.
	* <P>
	* @see #getConnRect()
	*/
	public RectF getImgRect() {
		return (ImgRect);
	}
	/**
	* Sets the image rectangle of the lexeme.
	* <P>
	* @see #getImgRect()
	* @see #getConnRect()
	*/
	public void setImgRect(RectF in) {
		ImgRect = in;
	}
	/**
	* Gets the X offset of the lexeme.
	*/
	public double getXOffset() {
		return (XOffset);
	}
	/**
	* Sets the X offset of the lexeme.
	*/
	public void setXOffset(double in) {
		XOffset = in;
	}
	/**
	* Gets the Y offset of the lexeme.
	*/
	public double getYOffset() {
		return (YOffset);
	}
	/**
	* Sets the Y offset of the lexeme.
	*/
	public void setYOffset(double in) {
		YOffset = in;
	}

	/**
	* Reads serial data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			/* StartLoc = myv.getInt("StartLoc");
			EndLoc = myv.getInt("EndLoc");
			MyMatch = myv.getInt("MyMatch");
			MyMeta = (Meta) (myv.getProperty("MyMeta"));
			VersionBuffer.chkNul(MyMeta);

			XOffset = myv.getDouble("XOffset");
			YOffset = myv.getDouble("YOffset");
			ConnRect = (RectF) (myv.getProperty("ConnRect"));
			VersionBuffer.chkNul(ConnRect);
			ImgRect = (RectF) (myv.getProperty("ImgRect"));
			VersionBuffer.chkNul(ImgRect);

			String FontName = (String) (myv.getProperty("FontName"));
			VersionBuffer.chkNul(FontName);
			String FontFamily = (String) (myv.getProperty("FontFamilyName"));
			VersionBuffer.chkNul(FontFamily);
			int FontSize = myv.getInt("FontSize");
			int FontStyle = myv.getInt("FontStyle");
			MyFont = new Font(FontName, FontStyle, FontSize);

			MyColor = (Color) (myv.getProperty("MyColor"));
			VersionBuffer.chkNul(MyColor); */
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	}

	/**
	* Writes serial data.
	* <P>
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		/* myv.setInt("StartLoc", StartLoc);
		myv.setInt("EndLoc", EndLoc);
		myv.setInt("MyMatch", MyMatch);
		if (MyMeta != null)
			myv.setProperty("MyMeta", MyMeta);

		myv.setDouble("XOffset", XOffset);
		myv.setDouble("YOffset", YOffset);
		if (ConnRect != null)
			myv.setProperty("ConnRect", ConnRect);
		if (ImgRect != null)
			myv.setProperty("ImgRect", ImgRect);

		if (MyFont != null) {
			myv.setProperty("FontName", MyFont.getName());
			myv.setProperty("FontFamilyName", MyFont.getFamily());
			myv.setInt("FontSize", MyFont.getSize());
			myv.setInt("FontStyle", MyFont.getStyle());
		}

		if (MyColor != null)
			myv.setProperty("MyColor", MyColor); */

		out.writeObject(myv);
	}

	/**
	* Returns the Meta reference used to hold aux. data.
	*/
	public final Meta getMetaPtr() {
		return (MyMeta);
	};
	/**
	* Sets the Meta reference used to hold aux. data.
	*/
	public final void setMetaPtr(Meta InPtr) {
		MyMeta = InPtr;
	};
	/**
	* Gets the starting location of the lexeme in the original string.
	*/
	public final int getStartLoc() {
		return (StartLoc);
	}
	/**
	* Gets the ending location of the lexeme in the original string.
	*/
	public final int getEndLoc() {
		return (EndLoc);
	}
	/**
	* Sets the starting location of the lexeme in the original string.
	*/
	public final void setStartLoc(int in) {
		StartLoc = in;
	}
	/**
	* Sets the ending location of the lexeme in the original string.
	*/
	public final void setEndLoc(int in) {
		EndLoc = in;
	}
	/**
	* Sets the match value for the lexeme.
	*/
	public final void setMyMatch(int in) {
		MyMatch = in;
	}
	/**
	* Gets the match value for the lexeme.
	*/
	public final int getMyMatch() {
		return (MyMatch);
	}

	private int StartLoc;
	private int EndLoc;
	private int MyMatch;
	private Meta MyMeta;

	private double XOffset = 0;
	private double YOffset = 0;
	private RectF ConnRect = null;
	private RectF ImgRect = null;
	private Paint MyPaint = null;
}
