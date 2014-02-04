


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
import java.util.Stack;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelBinTree;
import meta.HighLevelList;
import meta.*;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
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
* This class converts a string in MathImage's format to a display list.  This
* class is usually used only by {@link MathImage}.  Use this class directly
* only if you really need it.  Otherwise, use {@link MathImage}.
* @author Thorn Green
*/
public class SCodeGen extends Object implements Externalizable {

	/**
	Converts the expression into a series of instructions that can be executed
		by the executor class (once properly linked by the linker class).
	<P>
	<B>In:</B> The input expression in the string Instr.
		The antialias and rendering quality hints are also passed.  It turns out
		that Java2D calculates different font metrics based on the values of the
		antialias and rendering quality hints.<BR>
	<B>Out:</B> Instructions are placed in InList.  The routine returns true if an error
		happened (such as a syntax error).  Otherwise it returns false.<BR>
	<B>Pre:</B> The input string must be terminated by a null character.<BR>
	<B>Post:</B> If an error happened, the output list will be empty.<BR>
	@author Thorn Green.
	*/
	public final void generateCode(
		FlexString Instr,
		int MyMode,
		Paint InFont,
		Integer col)
		throws MathImageParseException {
		/* Frame MyF = new Frame();
		MyF.addNotify();
		g = (Canvas)( MyF.getGraphics() ); */

		HighLevelBinTree MyTree = new HighLevelBinTree();

		SEparser myo = MySEparser;

		myo.parseAll(Instr, MyTree, MyMode, InFont, col);
		CrsrLex = myo.getCrsrLex();
		CrsrRect = myo.getCrsrRect();

		if (!(MyTree.empty())) {
			SLexeme MyNode = (SLexeme) (MyTree.getNode());
			double OffX = -MyNode.getImgRect().left;
			double OffY = -MyNode.getImgRect().top;
			Iwidth = (int) (MyNode.getImgRect().width() ) + 1;
			Iheight = (int) (MyNode.getImgRect().height() ) + 1;
			genFromTree(MyTree, OffX, OffY);
		}

	};

	/**
	Converts the parse tree into a series of instructions that can be executed
		by the executor class (once properly linked by the linker class).
	<P>
	<B>In:</B> The input expression tree in MyTree.<BR>
	<B>Out:</B> Instructions are placed in InList.<BR>
	<B>Pre:</B> The input tree is valid.  The output list is empty.<BR>
	<B>Post:</B> The output list will be generated.<BR>
	@author Thorn Green.
	*/
	public final void genFromTree(HighLevelBinTree TBase, double InOffX, double InOffY) {
		HighLevelBinTree T = new HighLevelBinTree();
		boolean Done = false;

		TBase.copyDataPlusPtrInfo(T);

		while (!Done)
			if (!(T.lThread())) {
				double OffX;
				double OffY;

				if (CodeStk.empty()) {
					OffX = InOffX;
					OffY = InOffY;
				}
				else {
					SLexeme st = CodeStk.peek();
					OffX = st.getXOffset();
					OffY = st.getYOffset();
				}

				SLexeme MyNode = (SLexeme) (T.getNode());
				double MyOffX = OffX + MyNode.getXOffset();
				double MyOffY = OffY + MyNode.getYOffset();
				MyNode.setXOffset(MyOffX);
				MyNode.setYOffset(MyOffY);

				CodeStk.push(MyNode);
				T.left();
			}
			else {
				double OffX;
				double OffY;

				if (CodeStk.empty()) {
					OffX = InOffX;
					OffY = InOffY;
				}
				else {
					SLexeme st = CodeStk.peek();
					OffX = st.getXOffset();
					OffY = st.getYOffset();
				}

				SLexeme MyNode = (SLexeme) (T.getNode());
				double MyOffX = OffX + MyNode.getXOffset();
				double MyOffY = OffY + MyNode.getYOffset();
				MyNode.setXOffset(MyOffX);
				MyNode.setYOffset(MyOffY);
				HighLevelList<StdLowLevelList<SLexeme>,SLexeme> myl = MyList;
				myl.insertRight(MyNode);
				myl.setCopyMode(Meta.COPY_DO_NOTHING);
				myl.setEraseMode(Meta.WAKE);

				while ((T.rThread() == true) && (!Done)) {
					T.right();
					CodeStk.pop();
				}

				if (T.equal(TBase))
					Done = true;
				T.right();
			}

		while (!(CodeStk.empty()))
			CodeStk.pop();
	}

	/**
	* Draws the generated display list.
	*/
	public final void drawResult(Canvas g) {
		if (!(MyList.empty())) {
			MyList.searchHead();
			boolean Done = false;

			while (!Done) {
				SLexeme MyNode = MyList.getNode();
				FlexString mys = (FlexString) (MyNode.getMetaPtr());
				Paint pnt = MyNode.getPaintNonNull();
				mys.drawString(g, pnt, (float) (MyNode.getXOffset()), (float) (MyNode.getYOffset()) );

				MyList.right();
				Done = MyList.getHead();
			}
		}

		if ((CrsrLex != null) && (DrawCursor)) {
			Paint pnt = new Paint();
			pnt.setColor( Color.RED );
			g.drawLine(
				(float)( CrsrLex.getXOffset() - CrsrRect.width() ),
				(float)( CrsrLex.getYOffset() ),
				(float)( CrsrLex.getXOffset() ),
				(float)( CrsrLex.getYOffset() ) , pnt );
			g.drawLine(
				(float)( CrsrLex.getXOffset() ) ,
				(float)( CrsrLex.getYOffset() - CrsrRect.height() ) ,
				(float)( CrsrLex.getXOffset() ) ,
				(float)( CrsrLex.getYOffset() ) , pnt );
		}
	}

	/**
	* Draws the generated display list at (x,y).
	*/
	public final void drawResult(Canvas g, double x, double y) {
		if (!(MyList.empty())) {
			MyList.searchHead();
			boolean Done = false;

			while (!Done) {
				SLexeme MyNode = MyList.getNode();
				FlexString mys = (FlexString) (MyNode.getMetaPtr());
				
				mys.drawString(g , MyNode.getPaintNonNull() , 
						(float) (MyNode.getXOffset() + x), (float) (MyNode.getYOffset() + y) );

				MyList.right();
				Done = MyList.getHead();
			}
		}

		if ((CrsrLex != null) && (DrawCursor)) {
			Paint pnt = new Paint();
			pnt.setColor( Color.RED );
			g.drawLine( (float)( CrsrLex.getXOffset() - CrsrRect.width() + x ) ,
				(float)( CrsrLex.getYOffset() + y ),
				(float)( CrsrLex.getXOffset() + x ),
				(float)( CrsrLex.getYOffset() + y ) , pnt );
			g.drawLine( (float)( CrsrLex.getXOffset() + x ) ,
				(float)( CrsrLex.getYOffset() - CrsrRect.height() + y ) ,
				(float)( CrsrLex.getXOffset() + x ),
				(float)( CrsrLex.getYOffset() + y ) , pnt );
		}
	}
	
	/**
	* Gets the width of the displayed set of symbols.
	*/
	public final int getWidth() {
		return (Iwidth);
	}
	/**
	* Gets the height of the displayed set of symbols.
	*/
	public final int getHeight() {
		return (Iheight);
	}
	/**
	* If a cursor was specified in the input string, turn it on or off.
	* This is used to "blink" the cursor.
	*/
	public void setDrawCursor(boolean in) {
		DrawCursor = in;
	}
	/**
	* Returns whether the cursor if off.
	*/
	public boolean getDrawCursor() {
		return (DrawCursor);
	}

	/**
	Erases all data structures of this code generator.
	<P>
	<B>In:</B> None.<BR>
	<B>Out:</B> None.<BR>
	<B>Pre:</B> None.<BR>
	<B>Post:</B> All nodes allocated by this class are deleted.<BR>
	@author Thorn Green.
	*/
	public final void clear() {
		SEparser myo = MySEparser;
		myo.clear();
	};

	/**
	* Reads serial data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			/* VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			Iwidth = myv.getInt("Iwidth");
			Iheight = myv.getInt("Iheight");
			MyList = (HighLevelList) (myv.getProperty("MyList"));
			VersionBuffer.chkNul(MyList); */
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
		/* VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setInt("Iwidth", Iwidth);
		myv.setInt("Iheight", Iheight);
		myv.setProperty("MyList", MyList);

		out.writeObject(myv); */
	}

	/**
	* Throws an exception iff. the string is not in MathImage format.
	*/
	public static void chkParseMi(FlexString parseStr, int MyMode) throws MathImageParseException {
		SEparser myo = MySEparser;
		
		Paint pnt = new Paint();
		pnt.setTextSize( 10 );
		pnt.setTypeface( Typeface.create( "Serif" , Typeface.NORMAL ) );

		myo.parseAll(
			parseStr,
			new HighLevelBinTree(),
			MyMode | MathImageConstants.ParseOnlyMode,
			pnt,
			new Integer( Color.BLACK ) );
	}

	private static Stack<SLexeme> CodeStk = new Stack<SLexeme>();
	private boolean DrawCursor = true;
	private RectF CrsrRect = null;
	private SLexeme CrsrLex = null;
	private int Iwidth = 0;
	private int Iheight = 0;
	private transient static final SEparser MySEparser = new SEparser();
	private HighLevelList<StdLowLevelList<SLexeme>,SLexeme> MyList = new HighLevelList<StdLowLevelList<SLexeme>,SLexeme>();
};
