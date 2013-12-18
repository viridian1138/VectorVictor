
package geomdir.engine;

import java_cup.runtime.*;
import meta.*;
import geomdir.Mvec;
import geomdir.IntObj;
import geomdir.ObjObj;


%%

%char
%integer
%class LexAnal

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



static int GloUserMode = 0;

	public static final boolean verifyVariable( FlexString VarStr , int MyMode )
		
/*
Fun: Verifies that VarStr contains a valid name for a variable.
In: String VarStr, and the parsing mode.
Out: Boolean value.
Pre: VarStr, MyMode valid.
Post: If VarStr holds a variable, true will be returned.  Otherwise false
	will be returned.
Programmed By: Thorn Green
*/

	{
	boolean temp;
	IntObj OutLen = new IntObj();
	int IsVar;
	
	GloUserMode = MyMode;
	IsVar = isVariable( VarStr , OutLen , 0 );
	temp = ( IsVar != GEval.err ) && ( OutLen.value == VarStr.strlen() );
	return( temp );
	};
	
		public static final void extractVariable( FlexString instr , int strt ,
			int endloc , FlexString outstr )
			
/*
Fun: Extracts an machine variable name from a string containing a variable name.
In: The string containing the variable name, the start of the variable name, the
	end of the variable name.
Out: Output string.
Pre: The string must contain a variable name at position [ strt , endloc ].
Post: The machine name of the variable will be placed in outstr.
Programmed By: Thorn Green
*/

	{
	outstr.clearString();
	outstr.setInsertPoint( 0 );
	int count;

	if( instr.getChar( strt ) != '\'' )
		{
		for( count = strt ; count < endloc ; count++ )
			{
			outstr.insertChar( instr.getChar( count ) );
			}
		}
		else
		{
		for( count = ( strt + 1 ) ; count < ( endloc - 1 ) ; count++ )
			{
			outstr.insertChar( instr.getChar( count ) );
			}
		}
	};


	private static final int isVariable( FlexString InStr , IntObj OutLen , int index )
		
/*
Fun: Tries to match the input string to the lexical characteristics of a variable.  
	See the EBNF for the language Herculaneum accepts.
In: String to be parsed.  Index at which to find the next match.
Out: The lexeme tag of the match is returned.  The length of the match is
	returned in OutLen.
Pre: InStr must be valid.  Index must be within InStr.
Post: If there is no match, GEval.err is returned.
Programmed By: Thorn Green.
*/

	{
	int Done = GEval.err;
	char Temp;
	int len = InStr.strlen();
	
	OutLen.value = 0;
	Temp = InStr.getBaseChar( index , OutLen.value );
	if( ( ( Temp >= 'A' ) && ( Temp <= 'Z' ) ) || 
		( ( Temp >= 'a' ) && ( Temp <= 'z' ) ) ||
		( ( Temp == '_' ) && ( GloUserMode == EngineConstants.SUPERVISOR_MODE ) ) ||
		( ( Temp == '~' ) && ( GloUserMode == EngineConstants.SUPERVISOR_MODE ) ) )
		{
		Done = GEval.variable;
		OutLen.value = OutLen.value + 1;
		Temp = InStr.getBaseChar( index , OutLen.value );
		while( ( ( Temp >= 'A' ) && ( Temp <= 'Z' ) ) || 
			( ( Temp >= 'a' ) && ( Temp <= 'z' ) ) ||
			( ( Temp >= '0' ) && ( Temp <= '9' ) ) || ( Temp == '_' ) ||
			( ( Temp == '~' ) ) )
			{
			OutLen.value = OutLen.value + 1;
			Temp = InStr.getBaseChar( index , OutLen.value );
			}
		}

	   else if( ( Temp == '\'' ) && 
		( ( ( InStr.getBaseChar( index , OutLen.value + 1 ) != '_' ) &&
		( InStr.getBaseChar( index , OutLen.value + 1 ) != '~' ) )
		|| ( GloUserMode == EngineConstants.SUPERVISOR_MODE ) ) )
		{
		Done = GEval.variable;
		OutLen.value = OutLen.value + 1;
		Temp = InStr.getBaseChar( index , OutLen.value );
		while( ( Temp != '\'' ) && 
			( OutLen.value < len ) )
			{
			OutLen.value = OutLen.value + 1;
			Temp = InStr.getBaseChar( index , OutLen.value );
			}
		if( Temp == '\'' ) OutLen.value = OutLen.value + 1;
		if( Temp != '\'' ) Done = GEval.err;
		}
		
	return( Done );
	};


	private final void addRec( int MyMatch , int StartLoc , int EndLoc ,
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
	Lexeme Temp = new Lexeme();
	Temp.setMyMatch( MyMatch );
	Temp.setStartLoc( StartLoc );
	Temp.setEndLoc( EndLoc );
	LexList.insertRight( Temp );
	LexList.setCopyMode( Meta.copyDoNothing );
	LexList.setEraseMode( Meta.eraseAll );
	};


	private final Lexeme createLex( int MyMatch , int StartLoc , int EndLoc )
			
/*
Fun: Creates, initializes, and adds a new lexeme to the lexeme list.
In: Lexeme tag value MyMatch, StartLoc and EndLoc of expression string.
Out: Lexeme list modified.
Pre: None.
Post: A new initialized node will be added to LexList.
Programmed By: Thorn Green.
*/
			
	{
	Lexeme Temp = new Lexeme();
	Temp.setMyMatch( MyMatch );
	Temp.setStartLoc( StartLoc );
	Temp.setEndLoc( EndLoc );
	return( Temp );
	};


	private final void handleNumConst( HighLevelList LexList )
			
/*
Fun: Tries to match the input string to the lexical characteristics of a numeric constant.  
	See the EBNF for the langauge that Herculaneum accepts.
In: String to be parsed.  Index at which to find the next match.
Out: The lexeme tag of the match is returned.  The length of the match is
	returned in OutLen.
Pre: InStr must be valid.  Index must be within InStr.
Post: If there is no match, GEval.err is returned.
Programmed By: Thorn Green.
*/
			
	{
	Meta MyMeta = LexList.getNode();
	Lexeme ThisLex;
	Lexeme MyLex = (Lexeme) MyMeta;
	Mvec MyMvec = new Mvec();
	Mvec OutMvec = new Mvec();
	double NumerVal = 1.0;
	int count;
	
	MyMvec.unity();
	try{ Double MyD = new Double( yytext() ); NumerVal = MyD.doubleValue(); }
		catch( Exception e ) {};
	MyMvec.scale( NumerVal , OutMvec );
	OutMvec.copyAllInfo( MyLex.getMvec() );
	};


	private final void handleNumConst( Lexeme MyLex )
			
/*
Fun: Tries to match the input string to the lexical characteristics of a numeric constant.  
	See the EBNF for the langauge that Herculaneum accepts.
In: String to be parsed.  Index at which to find the next match.
Out: The lexeme tag of the match is returned.  The length of the match is
	returned in OutLen.
Pre: InStr must be valid.  Index must be within InStr.
Post: If there is no match, GEval.err is returned.
Programmed By: Thorn Green.
*/
			
	{
	Mvec MyMvec = new Mvec();
	Mvec OutMvec = new Mvec();
	double NumerVal = 1.0;
	int count;
	
	MyMvec.unity();
	try{ Double MyD = new Double( yytext() ); NumerVal = MyD.doubleValue(); }
		catch( Exception e ) {};
	MyMvec.scale( NumerVal , OutMvec );
	OutMvec.copyAllInfo( MyLex.getMvec() );
	};



	private final void handlePlugOp( HighLevelList LexList )
	{
	Meta MyMeta = LexList.getNode();
	Lexeme ThisLex;
	Lexeme MyLex = (Lexeme) MyMeta;

	FlexString MyStr = new FlexString( yytext() );
	MyLex.setMetaPtr( MyStr );
	}


	private final void handlePlugOp( Lexeme MyLex )
	{
	FlexString MyStr = new FlexString( yytext() );
	MyLex.setMetaPtr( MyStr );
	}


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


	public LexAnal( FlexString in ) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "LexAnal.dat" , true );
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


	private final Lexeme createLex( int MyMatch )
	{
	int StartLoc = yychar;
	return( createLex( MyMatch , StartLoc , StartLoc + yylength() ) );
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
	int MyMatch = GEval.eof + 1;
	while( MyMatch != GEval.eof )
		{
		MyMatch = yylex();
		if( MyMatch == YYEOF ) MyMatch = GEval.eof;
		addRec( MyMatch , LexList );
		if( MyMatch == GEval.NumConst ) handleNumConst( LexList );
		if( ( MyMatch == GEval.PlugOp ) || ( MyMatch == GEval.String ) ) handlePlugOp( LexList );
		}
	if( !LexList.empty() ) LexList.right();
	} catch( Exception e ) { e.printStackTrace(); }
	};


	public final void initSymbolMode( FlexString instr , int MyMode )

	{
	GloUserMode = MyMode;
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
	int MyMatch = yylex();
	if( MyMatch == YYEOF ) MyMatch = GEval.EOF;
	Lexeme MyLex = createLex( MyMatch );
	ret = new Symbol( MyMatch , MyLex );
	if( MyMatch == GEval.NumConst ) handleNumConst( MyLex );
	if( ( MyMatch == GEval.PlugOp ) || ( MyMatch == GEval.String ) ) handlePlugOp( MyLex );
	} catch( Exception e ) { e.printStackTrace(); }
	return( ret );
	};


%}


EXPONENT=["e","E"](["+","-"])?(["0"-"9"])+


%%


"+" { return( GEval.plus ); }
"-" { return( GEval.minus ); }
"*" { return( GEval.prod ); }
"/" { return( GEval.div ); }
"dot" { return( GEval.dot ); }
"cross" { return( GEval.cross ); }
"wedge" { return( GEval.wedge ); }
"<" { return( GEval.Lbrac ); }
">" { return( GEval.Rbrac ); }
"exp(" { return( GEval.exp ); }
"cos(" { return( GEval.cos ); }
"sin(" { return( GEval.sin ); }
"sinh(" { return( GEval.sinh ); }
"cosh(" { return( GEval.cosh ); }
"reverse(" { return( GEval.reverse ); }
"inverse(" { return( GEval.inverse ); }
"magnitude(" { return( GEval.magnitude ); }
"#12" { return( GEval.basis12 ); }
"#1" { return( GEval.basis1 ); }
"#2" { return( GEval.basis2 ); }
"{" { return( GEval.Lbrak ); }
"}" { return( GEval.Rbrak ); }
"i" { return( GEval.basis12 ); }
"pi" { return( GEval.pi ); }
"PhasToVect(" { return( GEval.PhasToVect ); }
"VectToPhas(" { return( GEval.PhasToVect ); }
"," { return( GEval.Comma ); }
"DeCastBlossomLeftComp(" { return( GEval.DeCastBlossomLeftComp ); }
"DeCastBlossomRightComp(" { return( GEval.DeCastBlossomRightComp ); }
"DeCastBlossomLeft(" { return( GEval.DeCastBlossomLeft ); }
"DeCastBlossomRight(" { return( GEval.DeCastBlossomRight ); }
"DeCastLeft(" { return( GEval.DeCastLeft ); }
"DeCastRight(" { return( GEval.DeCastRight ); }
"UnitOf(" { return( GEval.UnitOf ); }
"ln(" { return( GEval.ln ); }
"\+" { if( GloUserMode == EngineConstants.SUPERVISOR_MODE) return( GEval.vplus ); else return( GEval.err ); }
"\-" { if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.vminus ); else return( GEval.err ); }
"(" { return( GEval.Lparen ); }
")" { return( GEval.Rparen ); }

\'([\_\~])([^\'\n]*)\' { if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.variable ); else return( GEval.err ); }
\'([^\'\n]+)\' { return( GEval.variable ); }

[a-zA-Z]([a-zA-Z0-9\_\~]*)\( { return( GEval.PlugOp ); }
\"([^\"\n]+)\" { return( GEval.String ); }

[\_\~]([a-zA-Z0-9\_\~]*) { if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.variable ); else return( GEval.err ); }
[a-zA-Z]([a-zA-Z0-9\_\~]*) { return( GEval.variable ); }

(["0"-"9"])+"."(["0"-"9"])*(EXPONENT)?(["f","F","d","D"])? { return( GEval.NumConst ); }
"."(["0"-"9"])+(EXPONENT)?(["f","F","d","D"])? { return( GEval.NumConst ); }
(["0"-"9"])+EXPONENT(["f","F","d","D"])? { return( GEval.NumConst ); }
(["0"-"9"])+(EXPONENT)?["f","F","d","D"] { return( GEval.NumConst ); }
(["0"-"9"])+ { return( GEval.NumConst ); }

[\n\t\f" "]+ { /* Ignore Blanks */ }

. { return( GEval.err ); }


