





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
import geomdir.engine.*;
import geomdir.Mvec;



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
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | Plugin interface changed as part of a performance enhancement.       | Modified the plugin to be compliant.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added method to improve performance.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for change in width based on a < b relations.         | Created WidthPlugin from TrigDepicPlugin to do this.
*    | 10/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | Width change considered to be bad.                                   | Changed width change.
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
* A plugin for calculating MacDuff width changes on scalars.
* @author Thorn Green
*/
public class WidthPlugin extends DepicPlugin
	{
	static final Mvec temp = new Mvec();
	static boolean PlugInstalled = false;
	static int PlugOffset = 0;

	static final int ScaSubWidOp = 1;

	public WidthPlugin( )
		{ }
/**
* Installs the plugin.
*/
	public static void installPlug( )
		{ installPlug( WidthPlugin.class ); }
/**
* Gets whether the plugin has been installed.
*/
	public static boolean getPlugInstalled( )
		{ return( PlugInstalled ); }
/**
* Installs the plugin.  Do not use directly.
*/
	public void setPlugInstalled( int PlOffset )
		{ PlugOffset = PlOffset; PlugInstalled = true;
			System.out.println( "Width Plugin Installed..." ); }
/**
* Parses TestStr.  If it contains a function defined by this plugin, place the result in InLex.
*/
	public HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> parseOps( FlexString TestStr , Lexeme InLex , HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> Args )
		{
		HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> ret = null;
		int ArgCnt = countArgs( Args );

		if( ( TestStr.stcmp( "scasubwid(" ) == 0 ) && ( ArgCnt == 2 ) )
			{
			ret = buildUnary( InLex , Args );
			InLex.setPlugMatch( PlugOffset + ScaSubWidOp );
			}

		return( ret );
		}

/**
* Returns the mStack offset used by the operation.
*/
	public int getMstackOffset( int Match )
		{
		int ret = 0;
		int RMatch = Match - PlugOffset;

		switch( RMatch )
			{
			case ScaSubWidOp:
				ret = -1;
				break;

			}

		return( ret );
		}

/**
* Builds a unary parameter list.
*/
	private HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> buildUnary( Lexeme FunLex , HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> TempTree )
		{
		HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> MyTree = new HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme>();

		MyTree.addRight( FunLex );
		MyTree.setCopyMode( Meta.COPY_DO_NOTHING );
		MyTree.setEraseMode( Meta.WAKE );
		TempTree.pasteLeft( MyTree );
		TempTree.eraseAllInfo();
	
		return( MyTree );
		}


/**
* Evaluates the operation for the geometry engine.
*/
	public void evalOp( int Match , Mstack mStack , Staque oStack )
		{
		int RMatch = Match - PlugOffset;

		switch( RMatch )
			{
			case ScaSubWidOp:
				exScaSubWidOp( mStack , oStack );
				break;

			}

		}

/**
* Gets the static method name for generating compiled forms of the operation.
*/
	public String getStaticMethodName( int Match )
		{
		int RMatch = Match - PlugOffset;
		String ret = null;

		switch( RMatch )
			{
			case ScaSubWidOp:
				ret = "scasubwid";
				break;

			}

		return( ret );
		}
	
/**
* Pops a multivector from the stack, then pushes its right root function.
*/
	public void exScaSubWidOp( Mstack mStack , Staque oStack )
		{
		Mvec avec = mStack.pop();
		Mvec bvec = mStack.pop();
		scasubwid( bvec , avec , temp );
		mStack.push( temp );
		}

/**
* Calculates the scasubwid function.
*/
	public static void scasubwid( Mvec bvec , Mvec avec , Mvec out )
		{
		double wid = 2.0;
		if( ( avec.getBasis() > 0.0 ) && ( bvec.getBasis() < 0.0 ) ) wid = 1.0;
		if( ( avec.getBasis() < 0.0 ) && ( bvec.getBasis() > 0.0 ) ) wid = 1.0;
		out.setBasis( wid );
		out.setBasis1( 0.0 );
		out.setBasis2( 0.0 );
		out.setBasis12( 0.0 );
		}


	}



