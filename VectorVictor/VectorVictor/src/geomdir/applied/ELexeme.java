



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






package geomdir.applied;


import meta.*;
import geomdir.*;




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
* Lexeme class used by {@link EXparser} to parse a sequence of keystrokes entered by the
* user of the GeoPad kit.
* @author Thorn Green
*/
class ELexeme extends Meta<ELexeme>
	{
/**
* Value for a non-filled expression.
*/
	public static final int NonFilled = 0;
/**
* Flag for an expression that is filled by an expression string
* instead of containing a depictor.
*/
	public static final int Filled = 1;
/**
* Flag for an expression containing a box.  That is to say, an incomplete
* expression.
*/
	public static final int Boxed = 2;
/**
* Flag for a simplified expression.
*/
	public static final int Simplified = 4;
/**
* Flag indicating that the first parametrer is filled by an expression
* as opposed to simply representing a depictor.
*/
	public static final int FilledParamOne = 8;
/**
* Flag indicating that the second parametrer is filled by an expression
* as opposed to simply representing a depictor.
*/
	public static final int FilledParamTwo = 16;
/**
* Flag indicating that the third parametrer is filled by an expression
* as opposed to simply representing a depictor.
*/
	public static final int FilledParamThree = 32;
/**
* Flag indicating that the fourth parametrer is filled by an expression
* as opposed to simply representing a depictor.
*/
	public static final int FilledParamFour = 64;
/**
* Flag indicating that the fifth parametrer is filled by an expression
* as opposed to simply representing a depictor.
*/
	public static final int FilledParamFive = 128;

/**
* Makes ELexeme Meta-compliant.
*/
	public void wake( )
		{ }


/**
* Gets the prompt for the overall expression.
*/
	public FlexString getTopPrompt( )
		{ return( TopPrompt ); }
/**
* Sets the prompt for the overall expresison.
*/
	public void setTopPrompt( FlexString in )
		{ TopPrompt = in; }
/**
* Gets the operator for the expression or sub-expression.
*/
	public int getTopOp( )
		{ return( TopOp ); }
/**
* Sets the operator for the expression of sub-expression.
*/
	public void setTopOp( int in )
		{ TopOp = in; }
/**
* Returns status values for the sub-parts of the expression.
*/
	public int getFillStat( )
		{ return( FillStat ); }
/**
* Sets status values for the sub-parts of the expression.
*/
	public void setFillStat( int in )
		{ FillStat = in; }
/**
* Gets the representational object for the overall expression.
*/
	public Object getTopObj( )
		{ return( TopObj ); }
/**
* Sets the representational object for the overall expression.
*/
	public void setTopObj( Object in )
		{ TopObj = in; }
/**
* Gets the representational object for the first parameter.
*/
	public Object getParamOneObj( )
		{ return( ParamOneObj ); }
/**
* Sets the representational object for the first parameter.
*/
	public void setParamOneObj( Object in )
		{ ParamOneObj = in; }
/**
* Gets the representational object for the second parameter.
*/
	public Object getParamTwoObj( )
		{ return( ParamTwoObj ); }
/**
* Sets the representational object for the second parameter.
*/
	public void setParamTwoObj( Object in )
		{ ParamTwoObj = in; }
/**
* Gets the representational object for the third parameter.
*/
	public Object getParamThreeObj( )
		{ return( ParamThreeObj ); }
/**
* Sets the representational object for the third parameter.
*/
	public void setParamThreeObj( Object in )
		{ ParamThreeObj = in; }
/**
* Gets the representational object for the fourth parameter.
*/
	public Object getParamFourObj( )
		{ return( ParamFourObj ); }
/**
* Sets the representational object for the fourth parameter.
*/
	public void setParamFourObj( Object in )
		{ ParamFourObj = in; }
/**
* Gets the representational object for the fifth parameter.
*/
	public Object getParamFiveObj( )
		{ return( ParamFiveObj ); }
/**
* Sets the representational object for the fifth parameter.
*/
	public void setParamFiveObj( Object in )
		{ ParamFiveObj = in; }
/**
* Gets the number of enclosing parens.
*/
	public int getParenCount( )
		{ return( ParenCount ); }
/**
* Sets the number of enclosing parens.
*/
	public void setParenCount( int in )
		{ ParenCount = in; }
/**
* Gets whether the top drawing object is a parenthesized expr.
*/
	public boolean getTopDrawExpr( )
		{ return( TopDrawExpr ); }
/**
* Sets whether the top drawing object is a parenthesized expr.
*/
	public void setTopDrawExpr( boolean in )
		{ TopDrawExpr = in; }

/**
* Gets the expression string for the overall expression.
*/
	public FlexString getTopExpr( )
		{
		return( (FlexString)( ( (Object[]) TopObj )[ 0 ] ) );
		}

/**
* Gets the depictoral objects for the overall expression.
*/
	public Object[] getTopDraw( )
		{
		return( (Object[]) TopObj );
		}

/**
* Gets the prompt for the first parameter of the expression.
*/
	public FlexString getParamOnePrompt( )
		{
		return( ParamOnePrompt );
		}
/**
* Gets the prompt for the second parameter of the expression.
*/
	public FlexString getParamTwoPrompt( )
		{
		return( ParamTwoPrompt );
		}
/**
* Gets the prompt for the third parameter of the expression.
*/
	public FlexString getParamThreePrompt( )
		{
		return( ParamThreePrompt );
		}
/**
* Gets the prompt for the fourth parameter of the expression.
*/
	public FlexString getParamFourPrompt( )
		{
		return( ParamFourPrompt );
		}
/**
* Gets the prompt for the fifth parameter of the expression.
*/
	public FlexString getParamFivePrompt( )
		{
		return( ParamFivePrompt );
		}

/**
* Sets the expression string filling the overall expression.
*/
	public void setTopFill( FlexString prompt , FlexString expr , int Domain )
		{
		TopPrompt = prompt;
		TopDomain = Domain;
		Object[] myo = { expr };
		TopObj = myo;
		}

/**
* Sets the expression string filling the first parameter of the expression.
*/
	public void setParamOneFill( FlexString prompt , FlexString expr , int Domain )
		{
		ParamOnePrompt = prompt;
		ParamOneDomain = Domain;
		Object[] myo = { expr };
		ParamOneObj = myo;
		}

/**
* Sets the expression string filling the second parameter of the expression.
*/
	public void setParamTwoFill( FlexString prompt , FlexString expr , int Domain )
		{
		ParamTwoPrompt = prompt;
		ParamTwoDomain = Domain;
		Object[] myo = { expr };
		ParamTwoObj = myo;
		}

/**
* Sets the expression string filling the third parameter of the expression.
*/
	public void setParamThreeFill( FlexString prompt , FlexString expr , int Domain )
		{
		ParamThreePrompt = prompt;
		ParamThreeDomain = Domain;
		Object[] myo = { expr };
		ParamThreeObj = myo;
		}

/**
* Sets the expression string filling the fourth parameter of the expression.
*/
	public void setParamFourFill( FlexString prompt , FlexString expr , int Domain )
		{
		ParamFourPrompt = prompt;
		ParamFourDomain = Domain;
		Object[] myo = { expr };
		ParamFourObj = myo;
		}

/**
* Sets the expression string filling the fifth parameter of the expression.
*/
	public void setParamFiveFill( FlexString prompt , FlexString expr , int Domain )
		{
		ParamFivePrompt = prompt;
		ParamFiveDomain = Domain;
		Object[] myo = { expr };
		ParamFiveObj = myo;
		}

/**
* Sets the depictor for the overall expression.
*/
	public void setTopDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		TopPrompt = prompt;
		TopDomain = myo.portGetExtDomain();
		TopObj = in;
		}

/**
* Sets the depictor for the first parameter of the expression.
*/
	public void setParamOneDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		ParamOnePrompt = prompt;
		ParamOneDomain = myo.portGetExtDomain();
		ParamOneObj = in;
		}

/**
* Sets the depictor for the second parameter of the expression.
*/
	public void setParamTwoDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		ParamTwoPrompt = prompt;
		ParamTwoDomain = myo.portGetExtDomain();
		ParamTwoObj = in;
		}

/**
* Sets the depictor for the third parameter of the expression.
*/
	public void setParamThreeDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		ParamThreePrompt = prompt;
		ParamThreeDomain = myo.portGetExtDomain();
		ParamThreeObj = in;
		}

/**
* Sets the depictor for the fourth parameter of the expression.
*/
	public void setParamFourDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		ParamFourPrompt = prompt;
		ParamFourDomain = myo.portGetExtDomain();
		ParamFourObj = in;
		}

/**
* Sets the depictor for the fifth parameter of the expression.
*/
	public void setParamFiveDraw( FlexString prompt , Object[] in )
		{
		DrawObj myo = (DrawObj)( ( (Object[]) in )[ 0 ] );
		myo.setValuePort( 1 );
		ParamFivePrompt = prompt;
		ParamFiveDomain = myo.portGetExtDomain();
		ParamFiveObj = in;
		}

/**
* Sets the domain for the overall expression.
*/
	public void setTopDomain( int in )
		{
		TopDomain = in;
		}

/**
* Gets the domain for the overall expression.
*/
	public int getTopDomain( )
		{
		return( TopDomain );
		}

/**
* Gets the domain for the first parameter of the expression.
*/
	public int getParamOneDomain( )
		{
		return( ParamOneDomain );
		}

/**
* Gets the domain for the second parameter of the expression.
*/
	public int getParamTwoDomain( )
		{
		return( ParamTwoDomain );
		}

/**
* Gets the domain for the third parameter of the expression.
*/
	public int getParamThreeDomain( )
		{
		return( ParamThreeDomain );
		}

/**
* Gets the domain for the fourth parameter of the expression.
*/
	public int getParamFourDomain( )
		{
		return( ParamFourDomain );
		}

/**
* Gets the domain for the fifth parameter of the expression.
*/
	public int getParamFiveDomain( )
		{
		return( ParamFiveDomain );
		}

/**
* Gets the expression string for the first parameter of the expression.
*/
	public FlexString getParamOneExpr( )
		{
		return( (FlexString)( ( (Object[]) ParamOneObj )[ 0 ] ) );
		}

/**
* Gets the expression string for the second parameter of the expression.
*/
	public FlexString getParamTwoExpr( )
		{
		return( (FlexString)( ( (Object[]) ParamTwoObj )[ 0 ] ) );
		}

/**
* Gets the expression string for the third parameter of the expression.
*/
	public FlexString getParamThreeExpr( )
		{
		return( (FlexString)( ( (Object[]) ParamThreeObj )[ 0 ] ) );
		}

/**
* Gets the expression string for the fourth parameter of the expression.
*/
	public FlexString getParamFourExpr( )
		{
		return( (FlexString)( ( (Object[]) ParamFourObj )[ 0 ] ) );
		}

/**
* Gets the expression string for the fifth parameter of the expression.
*/
	public FlexString getParamFiveExpr( )
		{
		return( (FlexString)( ( (Object[]) ParamFiveObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the first parameter of the expression.
*/
	public DrawObj getParamOneDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) ParamOneObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the second parameter of the expression.
*/
	public DrawObj getParamTwoDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) ParamTwoObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the third parameter of the expression.
*/
	public DrawObj getParamThreeDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) ParamThreeObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the fourth parameter of the expression.
*/
	public DrawObj getParamFourDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) ParamFourObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the fifth parameter of the expression.
*/
	public DrawObj getParamFiveDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) ParamFiveObj )[ 0 ] ) );
		}

/**
* Gets the depictor for the overall expression.
*/
	public DrawObj getTopDrawObj( )
		{
		return( (DrawObj)( ( (Object[]) TopObj )[ 0 ] ) );
		}

/**
* Gets the DGMNode for the overall expression.
*/
	public DGMNode getTopDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) TopObj )[ 1 ] ) );
		}

/**
* Gets the DGMNode for the first parameter of the expression.
*/
	public DGMNode getParamOneDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) ParamOneObj )[ 1 ] ) );
		}

/**
* Gets the DGMNode for the second parameter of the expression.
*/
	public DGMNode getParamTwoDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) ParamTwoObj )[ 1 ] ) );
		}

/**
* Gets the DGMNode for the third parameter of the expression.
*/
	public DGMNode getParamThreeDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) ParamThreeObj )[ 1 ] ) );
		}

/**
* Gets the DGMNode for the fourth parameter of the expression.
*/
	public DGMNode getParamFourDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) ParamFourObj )[ 1 ] ) );
		}

/**
* Gets the DGMNode for the fifth parameter of the expression.
*/
	public DGMNode getParamFiveDrawDGM( )
		{
		return( (DGMNode)( ( (Object[]) ParamFiveObj )[ 1 ] ) );
		}
	

	private int TopDomain = 0;
	private int ParamOneDomain = 0;
	private int ParamTwoDomain = 0;
	private int ParamThreeDomain = 0;
	private int ParamFourDomain = 0;
	private int ParamFiveDomain = 0;
	private FlexString TopPrompt = null;
	private FlexString ParamOnePrompt = null;
	private FlexString ParamTwoPrompt = null;
	private FlexString ParamThreePrompt = null;
	private FlexString ParamFourPrompt = null;
	private FlexString ParamFivePrompt = null;
	private int TopOp = 0;
	private int FillStat = 0;
	private int ParenCount = 0;
	private boolean TopDrawExpr = false;
	
/**
* Top object to be used by parser.  If NonFilled, contains DrawObj.
* If boxed, contains null.  If filled, contains
* operator ID and result domain.
*/
	private Object TopObj = null;

/**
* ParamOne object in expression.  If filled ParamOne, contains expression and
* result domain.  If boxed, contains null.  Otherwise, contains DrawObj.
*/
	private Object ParamOneObj = null;

/**
* ParamTwo object in expression.  If filled ParamTwo, contains expression and
* result domain.  If boxed, contains null.  Otherwise, contains DrawObj.
*/
	private Object ParamTwoObj = null;

/**
* ParamThree object in expression.  If filled ParamThree, contains expression and
* result domain.  If boxed, contains null.  Otherwise, contains DrawObj.
*/
	private Object ParamThreeObj = null;

/**
* ParamFour object in expression.  If filled ParamFour, contains expression and
* result domain.  If boxed, contains null.  Otherwise, contains DrawObj.
*/
	private Object ParamFourObj = null;

/**
* ParamFive object in expression.  If filled ParamFive, contains expression and
* result domain.  If boxed, contains null.  Otherwise, contains DrawObj.
*/
	private Object ParamFiveObj = null;

	}



