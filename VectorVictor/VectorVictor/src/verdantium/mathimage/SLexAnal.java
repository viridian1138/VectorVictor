package verdantium.mathimage;

import java_cup.runtime.Symbol;
import meta.FlexReader;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import android.graphics.Color;
import android.graphics.Paint;


class SLexAnal {
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
		LexList.setCopyMode( Meta.COPY_DO_NOTHING );
		LexList.setEraseMode( Meta.ERASE_ALL );
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
			LexList.setCopyMode( Meta.COPY_DO_NOTHING );
			LexList.setEraseMode( Meta.ERASE_ALL );
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
		LexList.setCopyMode( Meta.COPY_DO_NOTHING );
		LexList.setEraseMode( Meta.ERASE_ALL );
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
	private java.io.BufferedReader yy_reader;
	private int yy_buffer_index;
	private int yy_buffer_read;
	private int yy_buffer_start;
	private int yy_buffer_end;
	private char yy_buffer[];
	private int yychar;
	private int yy_lexical_state;

	SLexAnal (java.io.Reader reader) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "SLexAnal.dat" , true );
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

	SLexAnal (java.io.InputStream instream) {
		this ();
		java.io.ObjectInputStream MyStr = yy_getBaseStream( "SLexAnal.dat" , true );
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

	private SLexAnal () {
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
			new java.io.BufferedInputStream( SLexAnal.class.getResourceAsStream( in ) );
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
						{ return( SEval.PassThrough ); }
					case -2:
						break;
					case 2:
						{ return( SEval.PassThrough ); }
					case -3:
						break;
					case 3:
						{ return( SEval.BeginBold ); }
					case -4:
						break;
					case 4:
						{ return( SEval.BeginUpright ); }
					case -5:
						break;
					case 5:
						{ yylval = 924; return( SEval.iterm ); }
					case -6:
						break;
					case 6:
						{ yylval = 925; return( SEval.iterm ); }
					case -7:
						break;
					case 7:
						{ yylval = 928; return( SEval.iterm ); }
					case -8:
						break;
					case 8:
						{ yylval = 926; return( SEval.iterm ); }
					case -9:
						break;
					case 9:
						{ yylval = (int)( '>' ); return( SEval.iterm ); }
					case -10:
						break;
					case 10:
						{ yylval = 8712; return( SEval.iterm ); }
					case -11:
						break;
					case 11:
						{ yylval = (int)( '<' ); return( SEval.iterm ); }
					case -12:
						break;
					case 12:
						{ yylval = 956; return( SEval.iterm ); }
					case -13:
						break;
					case 13:
						{ yylval = 957; return( SEval.iterm ); }
					case -14:
						break;
					case 14:
						{ yylval = 960; return( SEval.iterm ); }
					case -15:
						break;
					case 15:
						{ yylval = 177; return( SEval.iterm ); }
					case -16:
						break;
					case 16:
						{ yylval = (int)( ' ' ); return( SEval.iterm ); }
					case -17:
						break;
					case 17:
						{ yylval = 958; return( SEval.iterm ); }
					case -18:
						break;
					case 18:
						{ return( SEval.EndBold ); }
					case -19:
						break;
					case 19:
						{ return( SEval.EndUpright ); }
					case -20:
						break;
					case 20:
						{ return( SEval.BeginBoldUp ); }
					case -21:
						break;
					case 21:
						{ yylval = 935; return( SEval.iterm ); }
					case -22:
						break;
					case 22:
						{ yylval = 919; return( SEval.iterm ); }
					case -23:
						break;
					case 23:
						{ yylval = 934; return( SEval.iterm ); }
					case -24:
						break;
					case 24:
						{ yylval = 936; return( SEval.iterm ); }
					case -25:
						break;
					case 25:
						{ yylval = 929; return( SEval.iterm ); }
					case -26:
						break;
					case 26:
						{ yylval = 932; return( SEval.iterm ); }
					case -27:
						break;
					case 27:
						{ yylval = 8722; return( SEval.iterm ); /* gss */ }
					case -28:
						break;
					case 28:
						{ yylval = 8743; return( SEval.iterm ); }
					case -29:
						break;
					case 29:
						{ yylval = 967; return( SEval.iterm ); }
					case -30:
						break;
					case 30:
						{ yylval = 8744; return( SEval.iterm ); }
					case -31:
						break;
					case 31:
						{ yylval = 8725; return( SEval.iterm ); }
					case -32:
						break;
					case 32:
						{ yylval = 951; return( SEval.iterm ); }
					case -33:
						break;
					case 33:
						{ yylval = 8805; return( SEval.iterm ); }
					case -34:
						break;
					case 34:
						{ yylval = (int)( '^' ); return( SEval.iterm ); }
					case -35:
						break;
					case 35:
						{ yylval = 8747; return( SEval.iterm ); }
					case -36:
						break;
					case 36:
						{ yylval = 8804; return( SEval.iterm ); }
					case -37:
						break;
					case 37:
						{ yylval = 8800; return( SEval.iterm ); }
					case -38:
						break;
					case 38:
						{ yylval = 966; return( SEval.iterm ); }
					case -39:
						break;
					case 39:
						{ yylval = 968; return( SEval.iterm ); }
					case -40:
						break;
					case 40:
						{ yylval = 8756; return( SEval.iterm ); }
					case -41:
						break;
					case 41:
						{ yylval = 961; return( SEval.iterm ); }
					case -42:
						break;
					case 42:
						{ yylval = 8764; return( SEval.iterm ); }
					case -43:
						break;
					case 43:
						{ yylval = 8721; return( SEval.iterm ); }
					case -44:
						break;
					case 44:
						{ yylval = 964; return( SEval.iterm ); }
					case -45:
						break;
					case 45:
						{ return( SEval.EndBoldUp ); }
					case -46:
						break;
					case 46:
						{ return( SEval.BeginBox ); }
					case -47:
						break;
					case 47:
						{ return( SEval.BeginHat ); }
					case -48:
						break;
					case 48:
						{ return( SEval.BeginSub ); }
					case -49:
						break;
					case 49:
						{ return( SEval.BeginSup ); }
					case -50:
						break;
					case 50:
						{ yylval = 914; return( SEval.iterm ); }
					case -51:
						break;
					case 51:
						{ yylval = 921; return( SEval.iterm ); }
					case -52:
						break;
					case 52:
						{ yylval = 918; return( SEval.iterm ); }
					case -53:
						break;
					case 53:
						{ yylval = 946; return( SEval.iterm ); }
					case -54:
						break;
					case 54:
						{ yylval = 8901; return( SEval.iterm ); }
					case -55:
						break;
					case 55:
						{ yylval = 8728; return( SEval.iterm ); }
					case -56:
						break;
					case 56:
						{ yylval = 8773; return( SEval.iterm ); }
					case -57:
						break;
					case 57:
						{ yylval = 247; return( SEval.iterm ); }
					case -58:
						break;
					case 58:
						{ yylval = 953; return( SEval.iterm ); }
					case -59:
						break;
					case 59:
						{ yylval = 8869; return( SEval.iterm ); }
					case -60:
						break;
					case 60:
						{ yylval = 8719; return( SEval.iterm ); }
					case -61:
						break;
					case 61:
						{ yylval = sbox; return( SEval.iterm ); }
					case -62:
						break;
					case 62:
						{ yylval = 8730; return( SEval.iterm ); }
					case -63:
						break;
					case 63:
						{ yylval = 8739; return( SEval.iterm ); }
					case -64:
						break;
					case 64:
						{ yylval = 950; return( SEval.iterm ); }
					case -65:
						break;
					case 65:
						{ return( SEval.EndBox ); }
					case -66:
						break;
					case 66:
						{ return( SEval.EndHat ); }
					case -67:
						break;
					case 67:
						{ return( SEval.EndSub ); }
					case -68:
						break;
					case 68:
						{ return( SEval.EndSup ); }
					case -69:
						break;
					case 69:
						{ yylval = 913; return( SEval.iterm ); }
					case -70:
						break;
					case 70:
						{ yylval = 916; return( SEval.iterm ); }
					case -71:
						break;
					case 71:
						{ yylval = 915; return( SEval.iterm ); }
					case -72:
						break;
					case 72:
						{ yylval = 922; return( SEval.iterm ); }
					case -73:
						break;
					case 73:
						{ yylval = 937; return( SEval.iterm ); }
					case -74:
						break;
					case 74:
						{ yylval = 931; return( SEval.iterm ); }
					case -75:
						break;
					case 75:
						{ yylval = 920; return( SEval.iterm ); }
					case -76:
						break;
					case 76:
						{ yylval = 945; return( SEval.iterm ); }
					case -77:
						break;
					case 77:
						{ yylval = 8943; return( SEval.iterm ); /* gss */ }
					case -78:
						break;
					case 78:
						{ yylval = 948; return( SEval.iterm ); }
					case -79:
						break;
					case 79:
						{ yylval = 8801; return( SEval.iterm ); }
					case -80:
						break;
					case 80:
						{ yylval = 947; return( SEval.iterm ); }
					case -81:
						break;
					case 81:
						{ yylval = 8734; return( SEval.iterm ); }
					case -82:
						break;
					case 82:
						{ yylval = 954; return( SEval.iterm ); }
					case -83:
						break;
					case 83:
						{ yylval = 8943; return( SEval.iterm ); /* gss */ }
					case -84:
						break;
					case 84:
						{ yylval = 8711; return( SEval.iterm ); }
					case -85:
						break;
					case 85:
						{ yylval = 8713; return( SEval.iterm ); }
					case -86:
						break;
					case 86:
						{ yylval = 969; return( SEval.iterm ); }
					case -87:
						break;
					case 87:
						{ yylval = 8853; return( SEval.iterm ); }
					case -88:
						break;
					case 88:
						{ yylval = (int) '\''; return( SEval.iterm ); }
					case -89:
						break;
					case 89:
						{ yylval = 963; return( SEval.iterm ); }
					case -90:
						break;
					case 90:
						{ yylval = 952; return( SEval.iterm ); }
					case -91:
						break;
					case 91:
						{ yylval = (int)( '~' ); return( SEval.iterm ); }
					case -92:
						break;
					case 92:
						{ yylval = 215; return( SEval.iterm ); }
					case -93:
						break;
					case 93:
						{ yylval = (int)( '+' ); return( SEval.iterm ); }
					case -94:
						break;
					case 94:
						{ yylval = 8743; return( SEval.iterm ); /* gss */ }
					case -95:
						break;
					case 95:
						{ return( SEval.BeginAbove ); }
					case -96:
						break;
					case 96:
						{ return( SEval.BeginApply ); }
					case -97:
						break;
					case 97:
						{ return( SEval.BeginBelow ); }
					case -98:
						break;
					case 98:
						{ yylval = 923; return( SEval.iterm ); }
					case -99:
						break;
					case 99:
						{ yylval = 8776; return( SEval.iterm ); }
					case -100:
						break;
					case 100:
						{ /* Invisible Multiply */ }
					case -101:
						break;
					case 101:
						{ yylval = 955; return( SEval.iterm ); }
					case -102:
						break;
					case 102:
						{ yylval = 8855; return( SEval.iterm ); }
					case -103:
						break;
					case 103:
						{ yylval = 8834; return( SEval.iterm ); }
					case -104:
						break;
					case 104:
						{ yylval = 8835; return( SEval.iterm ); }
					case -105:
						break;
					case 105:
						{ yylval = (int)( '-' ); return( SEval.iterm ); }
					case -106:
						break;
					case 106:
						{ return( SEval.EndAbove ); }
					case -107:
						break;
					case 107:
						{ return( SEval.EndApply ); }
					case -108:
						break;
					case 108:
						{ return( SEval.EndBelow ); }
					case -109:
						break;
					case 109:
						{ return( SEval.EndColor ); }
					case -110:
						break;
					case 110:
						{ return( SEval.BeginCursor ); }
					case -111:
						break;
					case 111:
						{ yylval = 917; return( SEval.iterm ); }
					case -112:
						break;
					case 112:
						{ yylval = 927; return( SEval.iterm ); }
					case -113:
						break;
					case 113:
						{ yylval = 933; return( SEval.iterm ); }
					case -114:
						break;
					case 114:
						{ yylval = 949; return( SEval.iterm ); }
					case -115:
						break;
					case 115:
						{ yylval = 8836; return( SEval.iterm ); }
					case -116:
						break;
					case 116:
						{ yylval = 959; return( SEval.iterm ); }
					case -117:
						break;
					case 117:
						{ yylval = (int)( ')' ); return( SEval.iterm ); }
					case -118:
						break;
					case 118:
						{ yylval = (int)( '(' ); return( SEval.iterm ); }
					case -119:
						break;
					case 119:
						{ yylval = 965; return( SEval.iterm ); }
					case -120:
						break;
					case 120:
						{ return( SEval.EndCursor ); }
					case -121:
						break;
					case 121:
						{ yylval = 8709; return( SEval.iterm ); }
					case -122:
						break;
					case 122:
						{ yylval = 8838; return( SEval.iterm ); }
					case -123:
						break;
					case 123:
						{ yylval = 8839; return( SEval.iterm ); }
					case -124:
						break;
					case 124:
						{ return( SEval.BeginTagColor ); }
					case -125:
						break;
					case 126:
						{ return( SEval.PassThrough ); }
					case -126:
						break;
					case 128:
						{ return( SEval.PassThrough ); }
					case -127:
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
