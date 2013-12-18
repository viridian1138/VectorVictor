
package verdantium.mathimage;

import java_cup.runtime.Symbol;
import meta.FlexReader;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import android.graphics.Color;
import android.graphics.Paint;


%%

%char
%integer
%class SLexAnal

%yyeof



%{



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



final static int sbox = 20;
private static int yylval;
private static int GloUserMode;


	public final void clear( )
		
/*
Fun: Clears all auxiliary data structures that have been allocated.
In: None.
Out: None.
Pre: None.
Post: All memory allocated by this class will be deleted.
Programmed By: Thorn Green.
*/

	{
	
	};



/**
* Converts hex. to integer.
*/
	private int toInt( char b1 , char b0 )
		{
		int ret = 0;

		if( ( b1 >= '1' ) && ( b1 <= '9' ) )
			{
			ret += 16 * ( (int)( b1 - '1' ) + 1 );
			}

		if( ( b1 >= 'A' ) && ( b1 <= 'F' ) )
			{
			ret += 16 * ( (int)( b1 - 'A' ) + 10 );
			}

		if( ( b1 >= 'a' ) && ( b1 <= 'f' ) )
			{
			ret += 16 * ( (int)( b1 - 'a' ) + 10 );
			}


		if( ( b0 >= '1' ) && ( b0 <= '9' ) )
			{
			ret += ( (int)( b0 - '1' ) + 1 );
			}

		if( ( b0 >= 'A' ) && ( b0 <= 'F' ) )
			{
			ret += ( (int)( b0 - 'A' ) + 10 );
			}

		if( ( b0 >= 'a' ) && ( b0 <= 'f' ) )
			{
			ret += ( (int)( b0 - 'a' ) + 10 );
			}


		return( ret );
		}


	private final void insertIntoStr( FlexString out )
		{
		int len = yylength();
		int count;

		for( count = 0 ; count < len ; count++ )
			out.insertChar( yy_buffer[ yy_buffer_start + count ] );
		}


	public SLexAnal( FlexString in ) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "SLexAnal.dat" , true );
		try { 
			yy_acpt = (int[])( MyStr.readObject() );
			yy_cmap = (int[])( MyStr.readObject() );
			yy_rmap = (int[])( MyStr.readObject() );
			yy_nxt = (int[][])( MyStr.readObject() );
			MyStr.close();
		} catch( Exception e ) { e.printStackTrace(); }
		java.io.Reader reader = new FlexReader( in );
		yy_reader = new java.io.BufferedReader( reader , 96 );
	}


	public void resetLexer( FlexString in )
		{
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yy_lexical_state = YYINITIAL;
		yy_eof_done = false;
		java.io.Reader reader = new FlexReader( in );
		yy_reader = new java.io.BufferedReader( reader , 96 );
		}


	private final SLexeme createLex( int MyMatch , int StartLoc , int EndLoc )
			
/*
Fun: Creates, initializes, and adds a new lexeme to the lexeme list.
In: Lexeme tag value MyMatch, StartLoc and EndLoc of expression string.
Out: Lexeme list modified.
Pre: None.
Post: A new initialized node will be added to LexList.
Programmed By: Thorn Green.
*/
			
	{
	SLexeme Temp = new SLexeme();
	Temp.setMyMatch( MyMatch );
	Temp.setStartLoc( StartLoc );
	Temp.setEndLoc( EndLoc );
	return( Temp );
	};


	private final SLexeme createLex( int MyMatch )

	{
	int StartLoc = yychar;
	return( createLex( MyMatch , StartLoc , StartLoc + yylength() ) );
	}


	private final void addRecStr( int MyMatch , int StartLoc , int EndLoc ,
			HighLevelList LexList )
			
/*
Fun: Creates, initializes, and adds a new lexeme to the lexeme list.
In: Lexeme tag value MyMatch, StartLoc and EndLoc of expression string.
Out: Lexeme list modified.
Pre: None.
Post: A new initialized node will be added to LexList.
Programmed By: Thorn Green.
*/
			
	{
	SLexeme Temp = null;
		
	boolean Prev = false;
	if( !( LexList.empty() ) )
		{
		Temp = (SLexeme)( LexList.getNode() );
		if( Temp.getMyMatch() == SEval.term ) Prev = true;
		}

	if( !Prev ) 
		{
		Temp = createLex( SEval.term , StartLoc , EndLoc );
		LexList.insertRight( Temp );
		LexList.setCopyMode( Meta.copyDoNothing );
		LexList.setEraseMode( Meta.eraseAll );
		FlexString f = new FlexString();
		f.setInsertPoint( 0 );
		insertIntoStr( f );
		Temp.setMetaPtr( f );
		}
		else
		{
		Temp.setEndLoc( EndLoc );
		FlexString Str = (FlexString)( Temp.getMetaPtr() );
		insertIntoStr( Str );
		}
		
	};


	private final void addRecComp( int MyMatch , int StartLoc , int EndLoc ,
			HighLevelList LexList )
			
/*
Fun: Creates, initializes, and adds a new lexeme to the lexeme list.
In: Lexeme tag value MyMatch, StartLoc and EndLoc of expression string.
Out: Lexeme list modified.
Pre: None.
Post: A new initialized node will be added to LexList.
Programmed By: Thorn Green.
*/
			
	{
	if( MyMatch == SEval.iterm )
		{
		SLexeme Temp = null;
		
		boolean Prev = false;
		if( !( LexList.empty() ) )
			{
			Temp = (SLexeme)( LexList.getNode() );
			if( Temp.getMyMatch() == SEval.term ) Prev = true;
			}

		if( !Prev ) 
			{
			Temp = createLex( SEval.term , StartLoc , EndLoc );
			LexList.insertRight( Temp );
			LexList.setCopyMode( Meta.copyDoNothing );
			LexList.setEraseMode( Meta.eraseAll );
			FlexString f = new FlexString();
			f.setInsertPoint( 0 );
			f.insertChar( (char) yylval );
			Temp.setMetaPtr( f );
			}
			else
			{
			Temp.setEndLoc( EndLoc );
			FlexString Str = (FlexString)( Temp.getMetaPtr() );
			Str.insertChar( (char) yylval );
			}
		}
		else
		{
		SLexeme Temp = createLex( MyMatch , StartLoc , EndLoc );
		LexList.insertRight( Temp );
		LexList.setCopyMode( Meta.copyDoNothing );
		LexList.setEraseMode( Meta.eraseAll );
		}
	};


	private final void addRec( int MyMatch , int StartLoc , int EndLoc ,
			HighLevelList LexList )

	{
	if( MyMatch == SEval.PassThrough )
		{
		addRecStr( MyMatch , StartLoc , EndLoc , LexList );
		}
		else
		{
		addRecComp( MyMatch , StartLoc , EndLoc , LexList );
		}
	}


	private final void addRec( int MyMatch , HighLevelList LexList )
	{
	int StartLoc = yychar;
	addRec( MyMatch , StartLoc , StartLoc + yylength() , LexList );
	}


	public final void matchAll( FlexString instr , HighLevelList LexList , 
			int MyMode )
			
	/*
	Fun: Performs lexical analysis on a string, and retruns all lexemes found.
	In: String instr, list LexList of tokens, parsing mode for the input string.
	Out: LexList modified.
	Pre: Instr must be valid.  LexList must be empty.
	Post: The list will contain tokens corresponding to the input string,
		given the parsing mode.
	Programmed By: Thorn Green
	*/
	
	{
	try{
	GloUserMode = MyMode;
	int MyMatch = SEval.eof + 1;
	while( MyMatch != SEval.eof )
		{
		MyMatch = yylex();
		if( MyMatch == YYEOF ) MyMatch = SEval.eof;
		addRec( MyMatch , LexList );
		}
	if( !LexList.empty() ) LexList.right();
	} catch( Exception e ) { e.printStackTrace(); }
	};


	private static int LookAhd = -65536;

	public final int yylexComp( ) throws Exception
	{
	int tmp = 0;

	if( LookAhd == -65536 )
		{
		tmp = yylex();
		}
		else
		{
		tmp = LookAhd;
		LookAhd = -65536;
		}

	return( tmp );
	}

	private void setLookAhd( int val )
		{ LookAhd = val; }


	private Symbol scanTerm( int InSym )
		{
		int StartLoc = yychar;
		int EndLoc = StartLoc + yylength();
		boolean Done = false;
		SLexeme MyLex = createLex( SEval.term , StartLoc , EndLoc );
		FlexString f = new FlexString();
		f.setInsertPoint( 0 );
		MyLex.setMetaPtr( f );

		try{

		while( !Done )
			{
			switch( InSym )
				{
				case SEval.iterm:
					{
					MyLex.setEndLoc( EndLoc );
					FlexString Str = (FlexString)( MyLex.getMetaPtr() );
					Str.insertChar( (char) yylval );
					}
					break;

				case SEval.PassThrough:
					{
					MyLex.setEndLoc( EndLoc );
					FlexString Str = (FlexString)( MyLex.getMetaPtr() );
					insertIntoStr( Str );
					}
					break;

				default:
					Done = true;
					break;
				}

			if( !Done )
				{
				InSym = yylexComp();
				StartLoc = yychar;
				EndLoc = StartLoc + yylength();
				}
			}

		} catch( Exception e ) { System.out.println( "Err" ); }

		Symbol MySym = new Symbol( SEval.term , MyLex );
		setLookAhd( InSym );
		return( MySym );
		}


	public final Symbol scanSymbol( )
			
	/*
	Fun: Performs lexical analysis on a string, and retruns all lexemes found.
	In: String instr, list LexList of tokens, parsing mode for the input string.
	Out: LexList modified.
	Pre: Instr must be valid.  LexList must be empty.
	Post: The list will contain tokens corresponding to the input string,
		given the parsing mode.
	Programmed By: Thorn Green
	*/
	
	{
	Symbol ret = null;
	try {
	int MyMatch = yylexComp();

	switch( MyMatch )
		{
		case SEval.iterm:
		case SEval.PassThrough:
			ret = scanTerm( MyMatch );
			break;

		case YYEOF:
			{
			MyMatch = SEval.EOF;
			SLexeme MyLex = createLex( MyMatch );
			ret = new Symbol( MyMatch , MyLex );
			}
			break;

		case SEval.BeginTagColor:
			{
			SLexeme MyLex = createLex( MyMatch );
			ret = new Symbol( MyMatch , MyLex );

			String ColorStr = yytext();
			
			char r1 = ColorStr.charAt( 8 );
			char r0 = ColorStr.charAt( 9 );
			char g1 = ColorStr.charAt( 10 );
			char g0 = ColorStr.charAt( 11 );
			char b1 = ColorStr.charAt( 12 );
			char b0 = ColorStr.charAt( 13 );

			int red = toInt( r1 , r0 );
			int green = toInt( g1 , g0 );
			int blue = toInt( b1 , b0 );

			Paint pn = MyLex.getPaint() != null ? MyLex.getPaint() : new Paint();
			pn.setColor( Color.rgb(red, green, blue) );
                        MyLex.setPaint( pn );
			}
			break;

		default:
			{
			SLexeme MyLex = createLex( MyMatch );
			ret = new Symbol( MyMatch , MyLex );
			}
			break;
		}


	} catch( Exception e ) { e.printStackTrace(); }
	return( ret );
	};


%}


HEX=[0-9a-zA-Z]


%%


[^&;<>]+ { return( SEval.PassThrough ); }


"&Alpha;" { yylval = 913; return( SEval.iterm ); }
"&Beta;" { yylval = 914; return( SEval.iterm ); }
"&Gamma;" { yylval = 915; return( SEval.iterm ); }
"&Delta;" { yylval = 916; return( SEval.iterm ); }
"&Epsilon;" { yylval = 917; return( SEval.iterm ); }
"&Zeta;" { yylval = 918; return( SEval.iterm ); }
"&Eta;" { yylval = 919; return( SEval.iterm ); }
"&Theta;" { yylval = 920; return( SEval.iterm ); }
"&Iota;" { yylval = 921; return( SEval.iterm ); }
"&Kappa;" { yylval = 922; return( SEval.iterm ); }
"&Lambda;" { yylval = 923; return( SEval.iterm ); }
"&Mu;" { yylval = 924; return( SEval.iterm ); }
"&Nu;" { yylval = 925; return( SEval.iterm ); }
"&Xi;" { yylval = 926; return( SEval.iterm ); }
"&Omicron;" { yylval = 927; return( SEval.iterm ); }
"&Pi;" { yylval = 928; return( SEval.iterm ); }
"&Rho;" { yylval = 929; return( SEval.iterm ); }
"&Sigma;" { yylval = 931; return( SEval.iterm ); }
"&Tau;" { yylval = 932; return( SEval.iterm ); }
"&Upsilon;" { yylval = 933; return( SEval.iterm ); }
"&Phi;" { yylval = 934; return( SEval.iterm ); }
"&Chi;" { yylval = 935; return( SEval.iterm ); }
"&Psi;" { yylval = 936; return( SEval.iterm ); }
"&Omega;" { yylval = 937; return( SEval.iterm ); }


"&alpha;" { yylval = 945; return( SEval.iterm ); }
"&beta;" { yylval = 946; return( SEval.iterm ); }
"&gamma;" { yylval = 947; return( SEval.iterm ); }
"&delta;" { yylval = 948; return( SEval.iterm ); }
"&epsilon;" { yylval = 949; return( SEval.iterm ); }
"&zeta;" { yylval = 950; return( SEval.iterm ); }
"&eta;" { yylval = 951; return( SEval.iterm ); }
"&theta;" { yylval = 952; return( SEval.iterm ); }
"&iota;" { yylval = 953; return( SEval.iterm ); }
"&kappa;" { yylval = 954; return( SEval.iterm ); }
"&lambda;" { yylval = 955; return( SEval.iterm ); }
"&mu;" { yylval = 956; return( SEval.iterm ); }
"&nu;" { yylval = 957; return( SEval.iterm ); }
"&xi;" { yylval = 958; return( SEval.iterm ); }
"&omicron;" { yylval = 959; return( SEval.iterm ); }
"&pi;" { yylval = 960; return( SEval.iterm ); }
"&rho;" { yylval = 961; return( SEval.iterm ); }
"&sigma;" { yylval = 963; return( SEval.iterm ); }
"&tau;" { yylval = 964; return( SEval.iterm ); }
"&upsilon;" { yylval = 965; return( SEval.iterm ); }
"&phi;" { yylval = 966; return( SEval.iterm ); }
"&chi;" { yylval = 967; return( SEval.iterm ); }
"&psi;" { yylval = 968; return( SEval.iterm ); }
"&omega;" { yylval = 969; return( SEval.iterm ); }

"&emptyset;" { yylval = 8709; return( SEval.iterm ); }
"&cup;" { yylval = 8744; return( SEval.iterm ); }
"&cap;" { yylval = 8743; return( SEval.iterm ); }
"&subset;" { yylval = 8834; return( SEval.iterm ); }
"&subseteq;" { yylval = 8838; return( SEval.iterm ); }
"&in;" { yylval = 8712; return( SEval.iterm ); }
"&nsubset;" { yylval = 8836; return( SEval.iterm ); }
"&supset;" { yylval = 8835; return( SEval.iterm ); }
"&supseteq;" { yylval = 8839; return( SEval.iterm ); }
"&notin;" { yylval = 8713; return( SEval.iterm ); }
"&infty;" { yylval = 8734; return( SEval.iterm ); }
"&sum;" { yylval = 8721; return( SEval.iterm ); }
"&prod;" { yylval = 8719; return( SEval.iterm ); }
"&int;" { yylval = 8747; return( SEval.iterm ); }
"&otimes;" { yylval = 8855; return( SEval.iterm ); }
"&oplus;" { yylval = 8853; return( SEval.iterm ); }
"&times;" { yylval = 215; return( SEval.iterm ); }
"&wedge;" { yylval = 8743; return( SEval.iterm ); /* gss */ }
"&cdot;" { yylval = 8901; return( SEval.iterm ); }
"&ldots;" { yylval = 8943; return( SEval.iterm ); /* gss */ }
"&cdots;" { yylval = 8943; return( SEval.iterm ); /* gss */ }
"&div;" { yylval = 8725; return( SEval.iterm ); }
"&circ;" { yylval = 8728; return( SEval.iterm ); }
"&lt;" { yylval = (int)( '<' ); return( SEval.iterm ); }
"&gt;" { yylval = (int)( '>' ); return( SEval.iterm ); }
"&leq;" { yylval = 8804; return( SEval.iterm ); }
"&geq;" { yylval = 8805; return( SEval.iterm ); }
"&equiv;" { yylval = 8801; return( SEval.iterm ); }
"&sim;" { yylval = 8764; return( SEval.iterm ); }
"&approx;" { yylval = 8776; return( SEval.iterm ); }
"&cong;" { yylval = 8773; return( SEval.iterm ); }
"&neq;" { yylval = 8800; return( SEval.iterm ); }
"&perp;" { yylval = 8869; return( SEval.iterm ); }
"&nabla;" { yylval = 8711; return( SEval.iterm ); }
"&qed;" { yylval = 8756; return( SEval.iterm ); }
"&sqrt;" { yylval = 8730; return( SEval.iterm ); }
"&vrul;" { yylval = 8739; return( SEval.iterm ); }
"&bar;" { yylval = 8722; return( SEval.iterm ); /* gss */ }
"&tilde;" { yylval = (int)( '~' ); return( SEval.iterm ); }
"&hat;" { yylval = (int)( '^' ); return( SEval.iterm ); }
"&sp;" { yylval = (int)( ' ' ); return( SEval.iterm ); }
"&pm;" { yylval = 177; return( SEval.iterm ); }
"&uplus;" { yylval = (int)( '+' ); return( SEval.iterm ); }
"&uminus;" { yylval = (int)( '-' ); return( SEval.iterm ); }
"&uoparen;" { yylval = (int)( '(' ); return( SEval.iterm ); }
"&ucparen;" { yylval = (int)( ')' ); return( SEval.iterm ); }

"&sbox;" { yylval = sbox; return( SEval.iterm ); }
"&hdiv;" { yylval = 247; return( SEval.iterm ); }
"&prime;" { yylval = (int) '\''; return( SEval.iterm ); }

"<SUB>" { return( SEval.BeginSub ); }
"</SUB>" { return( SEval.EndSub ); }

"<SUP>" { return( SEval.BeginSup ); }
"</SUP>" { return( SEval.EndSup ); }

"<BOX>" { return( SEval.BeginBox ); }
"</BOX>" { return( SEval.EndBox ); }

"<B>" { return( SEval.BeginBold ); }
"</B>" { return( SEval.EndBold ); }

"<T>" { return( SEval.BeginUpright ); }
"</T>" { return( SEval.EndUpright ); }

"<BT>" { return( SEval.BeginBoldUp ); }
"</BT>" { return( SEval.EndBoldUp ); }

"<ABOVE>" { return( SEval.BeginAbove ); }
"</ABOVE>" { return( SEval.EndAbove ); }

"<BELOW>" { return( SEval.BeginBelow ); }
"</BELOW>" { return( SEval.EndBelow ); }

"<HAT>" { return( SEval.BeginHat ); }
"</HAT>" { return( SEval.EndHat ); }

"<CURSOR>" { return( SEval.BeginCursor ); }
"</CURSOR>" { return( SEval.EndCursor ); }

"<APPLY>" { return( SEval.BeginApply ); }
"</APPLY>" { return( SEval.EndApply ); }


"&itimes;" { /* Invisible Multiply */ }


"<COLOR=#"[0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F][0-9a-fA-F]">" { return( SEval.BeginTagColor ); }
"</COLOR>" { return( SEval.EndColor ); }


. { return( SEval.PassThrough ); }



