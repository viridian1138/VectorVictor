package geomdir.engine;
import java_cup.runtime.*;
import meta.*;
import geomdir.Mvec;
import geomdir.IntObj;
import geomdir.ObjObj;


class LexAnal {
	private final int YY_BUFFER_SIZE = 512;
	private final int YY_F = -1;
	private final int YY_NO_STATE = -1;
	private final int YY_NOT_ACCEPT = 0;
	private final int YY_START = 1;
	private final int YY_END = 2;
	private final int YY_NO_ANCHOR = 4;
	private final char YYEOF = '\uFFFF';


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
	LexList.setCopyMode( Meta.COPY_DO_NOTHING );
	LexList.setEraseMode( Meta.ERASE_ALL );
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
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yy_lexical_state;

	LexAnal (java.io.Reader reader) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "LexAnal.dat" , true );
		try { 
			yy_acpt = (int[])( MyStr.readObject() );
			yy_cmap = (int[])( MyStr.readObject() );
			yy_rmap = (int[])( MyStr.readObject() );
			yy_nxt = (int[][])( MyStr.readObject() );
			MyStr.close();
		} catch( Exception e ) { e.printStackTrace(); }
		if (null == reader) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(reader);
	}

	LexAnal (java.io.InputStream instream) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "LexAnal.dat" , true );
		try { 
			yy_acpt = (int[])( MyStr.readObject() );
			yy_cmap = (int[])( MyStr.readObject() );
			yy_rmap = (int[])( MyStr.readObject() );
			yy_nxt = (int[][])( MyStr.readObject() );
			MyStr.close();
		} catch( Exception e ) { e.printStackTrace(); }
		if (null == instream) {
			throw (new Error("Error: Bad input stream initializer."));
		}
		yy_reader = new java.io.BufferedReader(new java.io.InputStreamReader(instream));
	}

	private LexAnal () {
		yy_buffer = new char[YY_BUFFER_SIZE];
		yy_buffer_read = 0;
		yy_buffer_index = 0;
		yy_buffer_start = 0;
		yy_buffer_end = 0;
		yychar = 0;
		yy_lexical_state = YYINITIAL;
	}

	private boolean yy_eof_done = false;
	private final int YYINITIAL = 0;
	private final int yy_state_dtrans[] = {
		0
	};
	private void yybegin (int state) {
		yy_lexical_state = state;
	}
	private char yy_advance ()
		throws java.io.IOException {
		int next_read;
		int i;
		int j;

		if (yy_buffer_index < yy_buffer_read) {
			return yy_buffer[yy_buffer_index++];
		}

		if (0 != yy_buffer_start) {
			i = yy_buffer_start;
			j = 0;
			while (i < yy_buffer_read) {
				yy_buffer[j] = yy_buffer[i];
				++i;
				++j;
			}
			yy_buffer_end = yy_buffer_end - yy_buffer_start;
			yy_buffer_start = 0;
			yy_buffer_read = j;
			yy_buffer_index = j;
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YYEOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}

		while (yy_buffer_index >= yy_buffer_read) {
			if (yy_buffer_index >= yy_buffer.length) {
				yy_buffer = yy_double(yy_buffer);
			}
			next_read = yy_reader.read(yy_buffer,
					yy_buffer_read,
					yy_buffer.length - yy_buffer_read);
			if (-1 == next_read) {
				return YYEOF;
			}
			yy_buffer_read = yy_buffer_read + next_read;
		}
		return yy_buffer[yy_buffer_index++];
	}
	private void yy_move_start () {
		++yychar;
		++yy_buffer_start;
	}
	private void yy_pushback () {
		--yy_buffer_end;
	}
	private void yy_mark_start () {
		yychar = yychar
			+ yy_buffer_index - yy_buffer_start;
		yy_buffer_start = yy_buffer_index;
	}
	private void yy_mark_end () {
		yy_buffer_end = yy_buffer_index;
	}
	private void yy_to_mark () {
		yy_buffer_index = yy_buffer_end;
	}
	private java.lang.String yytext () {
		return (new java.lang.String(yy_buffer,
			yy_buffer_start,
			yy_buffer_end - yy_buffer_start));
	}
	private int yylength () {
		return yy_buffer_end - yy_buffer_start;
	}
	private char[] yy_double (char buf[]) {
		int i;
		char newbuf[];
		newbuf = new char[2*buf.length];
		for (i = 0; i < buf.length; ++i) {
			newbuf[i] = buf[i];
		}
		return newbuf;
	}
	private final int YY_E_INTERNAL = 0;
	private final int YY_E_MATCH = 1;
	private java.lang.String yy_error_string[] = {
		"Error: Internal error.\n",
		"Error: Unmatched input.\n"
	};
	private void yy_error (int code,boolean fatal) {
		java.lang.System.out.print(yy_error_string[code]);
		java.lang.System.out.flush();
		if (fatal) {
			throw new Error("Fatal Error.\n");
		}
	}
	public java.io.ObjectInputStream yy_getBaseStream( String in , boolean res )
		{
		java.io.InputStream u = null;
		java.io.ObjectInputStream v = null;
		
		if( res ) { try{ u =
			new java.io.BufferedInputStream( LexAnal.class.getResourceAsStream( in ) );
			v = new java.io.ObjectInputStream( u );
			} catch( Exception e ) { /* System.out.println( e ); */ } }

		if( v != null )
			{ /* System.out.println( "Wow!!!!! Got Resource!!!!!!!!!!" ); */ }
			else System.out.println( "Assert: Did not get Resource!!!!!!!!!!" );

		return( v );
		}

	private int yy_acpt[] = null;

	private int yy_cmap[] = null;

	private int yy_rmap[] = null;

	private int yy_nxt[][] = null;

	public int yylex ()
		throws java.io.IOException {
		char yy_lookahead;
		int yy_anchor = YY_NO_ANCHOR;
		int yy_state = yy_state_dtrans[yy_lexical_state];
		int yy_next_state = YY_NO_STATE;
		int yy_last_accept_state = YY_NO_STATE;
		boolean yy_initial = true;
		int yy_this_accept;

		yy_mark_start();
		yy_this_accept = yy_acpt[yy_state];
		if (YY_NOT_ACCEPT != yy_this_accept) {
			yy_last_accept_state = yy_state;
			yy_mark_end();
		}
		while (true) {
			yy_lookahead = yy_advance();
			yy_next_state = YY_F;
			if (YYEOF != yy_lookahead) {
				yy_next_state = yy_nxt[yy_rmap[yy_state]][yy_cmap[yy_lookahead]];
			}
			if (YY_F != yy_next_state) {
				yy_state = yy_next_state;
				yy_initial = false;
				yy_this_accept = yy_acpt[yy_state];
				if (YY_NOT_ACCEPT != yy_this_accept) {
					yy_last_accept_state = yy_state;
					yy_mark_end();
				}
			}
			else {
				if (YYEOF == yy_lookahead && true == yy_initial) {
					return YYEOF;
				}
				else if (YY_NO_STATE == yy_last_accept_state) {
					throw (new Error("Lexical Error: Unmatched Input."));
				}
				else {
					yy_to_mark();
					yy_anchor = yy_acpt[yy_last_accept_state];
					if (0 != (YY_END & yy_anchor)) {
						yy_pushback();
					}
					if (0 != (YY_START & yy_anchor)) {
						yy_move_start();
					}
					switch (yy_last_accept_state) {
					case 1:
						{ return( GEval.err ); }
					case -2:
						break;
					case 2:
						{ /* Ignore Blanks */ }
					case -3:
						break;
					case 3:
						{ return( GEval.Lparen ); }
					case -4:
						break;
					case 4:
						{ return( GEval.Rparen ); }
					case -5:
						break;
					case 5:
						{ return( GEval.prod ); }
					case -6:
						break;
					case 6:
						{ return( GEval.plus ); }
					case -7:
						break;
					case 7:
						{ return( GEval.Comma ); }
					case -8:
						break;
					case 8:
						{ return( GEval.minus ); }
					case -9:
						break;
					case 9:
						{ return( GEval.div ); }
					case -10:
						break;
					case 10:
						{ return( GEval.NumConst ); }
					case -11:
						break;
					case 11:
						{ return( GEval.Lbrac ); }
					case -12:
						break;
					case 12:
						{ return( GEval.Rbrac ); }
					case -13:
						break;
					case 13:
						{ return( GEval.variable ); }
					case -14:
						break;
					case 14:
						{ if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.variable ); else return( GEval.err ); }
					case -15:
						break;
					case 15:
						{ return( GEval.basis12 ); }
					case -16:
						break;
					case 16:
						{ return( GEval.Lbrak ); }
					case -17:
						break;
					case 17:
						{ return( GEval.Rbrak ); }
					case -18:
						break;
					case 18:
						{ return( GEval.basis1 ); }
					case -19:
						break;
					case 19:
						{ return( GEval.basis2 ); }
					case -20:
						break;
					case 20:
						{ return( GEval.NumConst ); }
					case -21:
						break;
					case 21:
						{ return( GEval.NumConst ); }
					case -22:
						break;
					case 22:
						{ return( GEval.NumConst ); }
					case -23:
						break;
					case 23:
						{ return( GEval.PlugOp ); }
					case -24:
						break;
					case 24:
						{ if( GloUserMode == EngineConstants.SUPERVISOR_MODE) return( GEval.vplus ); else return( GEval.err ); }
					case -25:
						break;
					case 25:
						{ if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.vminus ); else return( GEval.err ); }
					case -26:
						break;
					case 26:
						{ return( GEval.pi ); }
					case -27:
						break;
					case 27:
						{ return( GEval.String ); }
					case -28:
						break;
					case 28:
						{ return( GEval.basis12 ); }
					case -29:
						break;
					case 29:
						{ return( GEval.variable ); }
					case -30:
						break;
					case 30:
						{ if( GloUserMode == EngineConstants.SUPERVISOR_MODE ) return( GEval.variable ); else return( GEval.err ); }
					case -31:
						break;
					case 31:
						{ return( GEval.dot ); }
					case -32:
						break;
					case 32:
						{ return( GEval.ln ); }
					case -33:
						break;
					case 33:
						{ return( GEval.cos ); }
					case -34:
						break;
					case 34:
						{ return( GEval.exp ); }
					case -35:
						break;
					case 35:
						{ return( GEval.sin ); }
					case -36:
						break;
					case 36:
						{ return( GEval.cosh ); }
					case -37:
						break;
					case 37:
						{ return( GEval.cross ); }
					case -38:
						break;
					case 38:
						{ return( GEval.sinh ); }
					case -39:
						break;
					case 39:
						{ return( GEval.wedge ); }
					case -40:
						break;
					case 40:
						{ return( GEval.UnitOf ); }
					case -41:
						break;
					case 41:
						{ return( GEval.inverse ); }
					case -42:
						break;
					case 42:
						{ return( GEval.reverse ); }
					case -43:
						break;
					case 43:
						{ return( GEval.NumConst ); }
					case -44:
						break;
					case 44:
						{ return( GEval.magnitude ); }
					case -45:
						break;
					case 45:
						{ return( GEval.DeCastLeft ); }
					case -46:
						break;
					case 46:
						{ return( GEval.PhasToVect ); }
					case -47:
						break;
					case 47:
						{ return( GEval.PhasToVect ); }
					case -48:
						break;
					case 48:
						{ return( GEval.DeCastRight ); }
					case -49:
						break;
					case 49:
						{ return( GEval.DeCastBlossomLeft ); }
					case -50:
						break;
					case 50:
						{ return( GEval.DeCastBlossomRight ); }
					case -51:
						break;
					case 51:
						{ return( GEval.DeCastBlossomLeftComp ); }
					case -52:
						break;
					case 52:
						{ return( GEval.DeCastBlossomRightComp ); }
					case -53:
						break;
					case 54:
						{ return( GEval.err ); }
					case -54:
						break;
					case 55:
						{ return( GEval.variable ); }
					case -55:
						break;
					case 56:
						{ return( GEval.NumConst ); }
					case -56:
						break;
					case 57:
						{ return( GEval.NumConst ); }
					case -57:
						break;
					case 58:
						{ return( GEval.NumConst ); }
					case -58:
						break;
					case 60:
						{ return( GEval.err ); }
					case -59:
						break;
					case 61:
						{ return( GEval.variable ); }
					case -60:
						break;
					case 62:
						{ return( GEval.NumConst ); }
					case -61:
						break;
					case 63:
						{ return( GEval.NumConst ); }
					case -62:
						break;
					case 65:
						{ return( GEval.err ); }
					case -63:
						break;
					case 66:
						{ return( GEval.variable ); }
					case -64:
						break;
					case 68:
						{ return( GEval.err ); }
					case -65:
						break;
					case 69:
						{ return( GEval.variable ); }
					case -66:
						break;
					case 71:
						{ return( GEval.err ); }
					case -67:
						break;
					case 72:
						{ return( GEval.variable ); }
					case -68:
						break;
					case 74:
						{ return( GEval.variable ); }
					case -69:
						break;
					case 76:
						{ return( GEval.variable ); }
					case -70:
						break;
					case 78:
						{ return( GEval.variable ); }
					case -71:
						break;
					case 80:
						{ return( GEval.variable ); }
					case -72:
						break;
					case 82:
						{ return( GEval.variable ); }
					case -73:
						break;
					case 84:
						{ return( GEval.variable ); }
					case -74:
						break;
					case 86:
						{ return( GEval.variable ); }
					case -75:
						break;
					case 87:
						{ return( GEval.variable ); }
					case -76:
						break;
					case 88:
						{ return( GEval.variable ); }
					case -77:
						break;
					case 89:
						{ return( GEval.variable ); }
					case -78:
						break;
					case 90:
						{ return( GEval.variable ); }
					case -79:
						break;
					case 91:
						{ return( GEval.variable ); }
					case -80:
						break;
					case 92:
						{ return( GEval.variable ); }
					case -81:
						break;
					case 93:
						{ return( GEval.variable ); }
					case -82:
						break;
					case 94:
						{ return( GEval.variable ); }
					case -83:
						break;
					case 95:
						{ return( GEval.variable ); }
					case -84:
						break;
					case 96:
						{ return( GEval.variable ); }
					case -85:
						break;
					case 97:
						{ return( GEval.variable ); }
					case -86:
						break;
					case 99:
						{ return( GEval.variable ); }
					case -87:
						break;
					case 101:
						{ return( GEval.variable ); }
					case -88:
						break;
					case 102:
						{ return( GEval.variable ); }
					case -89:
						break;
					case 103:
						{ return( GEval.variable ); }
					case -90:
						break;
					case 104:
						{ return( GEval.variable ); }
					case -91:
						break;
					case 105:
						{ return( GEval.variable ); }
					case -92:
						break;
					case 106:
						{ return( GEval.variable ); }
					case -93:
						break;
					case 107:
						{ return( GEval.variable ); }
					case -94:
						break;
					case 108:
						{ return( GEval.variable ); }
					case -95:
						break;
					case 109:
						{ return( GEval.variable ); }
					case -96:
						break;
					case 110:
						{ return( GEval.variable ); }
					case -97:
						break;
					case 111:
						{ return( GEval.variable ); }
					case -98:
						break;
					case 112:
						{ return( GEval.variable ); }
					case -99:
						break;
					case 113:
						{ return( GEval.variable ); }
					case -100:
						break;
					case 114:
						{ return( GEval.variable ); }
					case -101:
						break;
					case 115:
						{ return( GEval.variable ); }
					case -102:
						break;
					case 116:
						{ return( GEval.variable ); }
					case -103:
						break;
					case 117:
						{ return( GEval.variable ); }
					case -104:
						break;
					case 118:
						{ return( GEval.variable ); }
					case -105:
						break;
					case 120:
						{ return( GEval.variable ); }
					case -106:
						break;
					case 122:
						{ return( GEval.variable ); }
					case -107:
						break;
					case 123:
						{ return( GEval.variable ); }
					case -108:
						break;
					case 124:
						{ return( GEval.variable ); }
					case -109:
						break;
					case 125:
						{ return( GEval.variable ); }
					case -110:
						break;
					case 126:
						{ return( GEval.variable ); }
					case -111:
						break;
					case 127:
						{ return( GEval.variable ); }
					case -112:
						break;
					case 128:
						{ return( GEval.variable ); }
					case -113:
						break;
					case 129:
						{ return( GEval.variable ); }
					case -114:
						break;
					case 130:
						{ return( GEval.variable ); }
					case -115:
						break;
					case 131:
						{ return( GEval.variable ); }
					case -116:
						break;
					case 132:
						{ return( GEval.variable ); }
					case -117:
						break;
					case 133:
						{ return( GEval.variable ); }
					case -118:
						break;
					case 134:
						{ return( GEval.variable ); }
					case -119:
						break;
					case 135:
						{ return( GEval.variable ); }
					case -120:
						break;
					case 136:
						{ return( GEval.variable ); }
					case -121:
						break;
					case 137:
						{ return( GEval.variable ); }
					case -122:
						break;
					case 139:
						{ return( GEval.variable ); }
					case -123:
						break;
					case 141:
						{ return( GEval.variable ); }
					case -124:
						break;
					case 142:
						{ return( GEval.variable ); }
					case -125:
						break;
					case 143:
						{ return( GEval.variable ); }
					case -126:
						break;
					case 144:
						{ return( GEval.variable ); }
					case -127:
						break;
					case 145:
						{ return( GEval.variable ); }
					case -128:
						break;
					case 146:
						{ return( GEval.variable ); }
					case -129:
						break;
					case 147:
						{ return( GEval.variable ); }
					case -130:
						break;
					case 148:
						{ return( GEval.variable ); }
					case -131:
						break;
					case 149:
						{ return( GEval.variable ); }
					case -132:
						break;
					case 150:
						{ return( GEval.variable ); }
					case -133:
						break;
					case 151:
						{ return( GEval.variable ); }
					case -134:
						break;
					case 152:
						{ return( GEval.variable ); }
					case -135:
						break;
					case 154:
						{ return( GEval.variable ); }
					case -136:
						break;
					case 156:
						{ return( GEval.variable ); }
					case -137:
						break;
					case 157:
						{ return( GEval.variable ); }
					case -138:
						break;
					case 158:
						{ return( GEval.variable ); }
					case -139:
						break;
					case 159:
						{ return( GEval.variable ); }
					case -140:
						break;
					case 160:
						{ return( GEval.variable ); }
					case -141:
						break;
					case 161:
						{ return( GEval.variable ); }
					case -142:
						break;
					case 162:
						{ return( GEval.variable ); }
					case -143:
						break;
					case 163:
						{ return( GEval.variable ); }
					case -144:
						break;
					case 164:
						{ return( GEval.variable ); }
					case -145:
						break;
					case 166:
						{ return( GEval.variable ); }
					case -146:
						break;
					case 168:
						{ return( GEval.variable ); }
					case -147:
						break;
					case 169:
						{ return( GEval.variable ); }
					case -148:
						break;
					case 170:
						{ return( GEval.variable ); }
					case -149:
						break;
					case 171:
						{ return( GEval.variable ); }
					case -150:
						break;
					case 172:
						{ return( GEval.variable ); }
					case -151:
						break;
					case 173:
						{ return( GEval.variable ); }
					case -152:
						break;
					case 174:
						{ return( GEval.variable ); }
					case -153:
						break;
					case 176:
						{ return( GEval.variable ); }
					case -154:
						break;
					case 178:
						{ return( GEval.variable ); }
					case -155:
						break;
					case 179:
						{ return( GEval.variable ); }
					case -156:
						break;
					case 180:
						{ return( GEval.variable ); }
					case -157:
						break;
					case 181:
						{ return( GEval.variable ); }
					case -158:
						break;
					case 182:
						{ return( GEval.variable ); }
					case -159:
						break;
					case 183:
						{ return( GEval.variable ); }
					case -160:
						break;
					case 184:
						{ return( GEval.variable ); }
					case -161:
						break;
					case 185:
						{ return( GEval.variable ); }
					case -162:
						break;
					case 186:
						{ return( GEval.variable ); }
					case -163:
						break;
					case 187:
						{ return( GEval.variable ); }
					case -164:
						break;
					case 188:
						{ return( GEval.variable ); }
					case -165:
						break;
					case 189:
						{ return( GEval.variable ); }
					case -166:
						break;
					case 190:
						{ return( GEval.variable ); }
					case -167:
						break;
					case 191:
						{ return( GEval.variable ); }
					case -168:
						break;
					case 192:
						{ return( GEval.variable ); }
					case -169:
						break;
					case 193:
						{ return( GEval.variable ); }
					case -170:
						break;
					case 194:
						{ return( GEval.variable ); }
					case -171:
						break;
					case 195:
						{ return( GEval.variable ); }
					case -172:
						break;
					case 196:
						{ return( GEval.variable ); }
					case -173:
						break;
					default:
						yy_error(YY_E_INTERNAL,false);
					case -1:
					}
					yy_initial = true;
					yy_state = yy_state_dtrans[yy_lexical_state];
					yy_next_state = YY_NO_STATE;
					yy_last_accept_state = YY_NO_STATE;
					yy_mark_start();
					yy_this_accept = yy_acpt[yy_state];
					if (YY_NOT_ACCEPT != yy_this_accept) {
						yy_last_accept_state = yy_state;
					}
				}
			}
		}
	}
}
