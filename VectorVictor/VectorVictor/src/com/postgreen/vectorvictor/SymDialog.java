






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









package com.postgreen.vectorvictor;


import geomdir.GeomKitEtherEvent;
import geomdir.Model;
import geomdir.applied.GeoPadKit;

import java.util.ArrayList;

import meta.*;
import meta.FlexString;
import meta.HighLevelList;
import verdantium.EtherEvent;
import verdantium.ProgramDirector;
import verdantium.mathimage.MathImageParseException;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import verdantium.mathimage.*;


public class SymDialog {
	
	
	private Model in;
	private GeoPadKit FreeKit;
	
	
	
	private transient HighLevelList<StdLowLevelList<FlexString>,FlexString> ScriptList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	private transient HighLevelList<StdLowLevelList<FlexString>,FlexString> SubscriptList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	private transient HighLevelList<StdLowLevelList<FlexString>,FlexString> SuperscriptList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	private transient HighLevelList<StdLowLevelList<FlexString>,FlexString> OverscriptList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	private transient HighLevelList<StdLowLevelList<FlexString>,FlexString> UnderscriptList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	
	
	public enum InsertMode
	{
		SCRIPT_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				return( in.ScriptList );
			}
		},
		SUBSCRIPT_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				return( in.SubscriptList );
			}
		},
		SUPERSCRIPT_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				return( in.SuperscriptList );
			}
		},
		OVERSCRIPT_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				return( in.OverscriptList );
			}
		},
		UNDERSCRIPT_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				return( in.UnderscriptList );
			}
		},
		NON_CURSOR_MODE
		{
			public HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in )
			{
				throw( new RuntimeException( "Not Supported" ) );
			}
		};
		
		public abstract HighLevelList<StdLowLevelList<FlexString>,FlexString> getList( SymDialog in );
	};
	
	
	private transient FlexString TotStr = new FlexString();
	private transient boolean EmptyFlag = true;
	
	
	
	private CheckBox createSymbolBoldBox;
	
	private CheckBox createSymbolUprightBox;
	
	private Spinner createScriptSpinner;
	
	private MathImageTextEdit createSymbolEditField;
	
	
	
	public SymDialog( Model _in , GeoPadKit _FreeKit )
	{
		in = _in;
		FreeKit = _FreeKit;
	}
	
	
	 
    public void showSymDialog(final VectorVictorActivity activity)
	{
		try
 		{
			activity.playClick();
    		final Dialog dialog = new Dialog( activity );
    		dialog.setContentView( R.layout.sym_dialog );
            dialog.setTitle( "Create Symbol" );
            dialog.setCancelable(true);
            
            
            
           final EditText createSymbolName = (EditText)( dialog.findViewById( R.id.createSymbolName ) );
            
           
           createSymbolEditField = (MathImageTextEdit)( dialog.findViewById( R.id.createSymbolEditField ) );

           
           final Button createInsertSymbolButton = (Button)( dialog.findViewById( R.id.createInsertSymbolButton ) );


           createScriptSpinner = (Spinner)( dialog.findViewById( R.id.createScriptSpinner ) );
           
           
           createSymbolBoldBox = (CheckBox)( dialog.findViewById( R.id.createSymbolBoldBox ) );
           
           
           createSymbolUprightBox = (CheckBox)( dialog.findViewById( R.id.createSymbolUprightBox ) );
           
           
           final Button createSymbolButton = (Button)( dialog.findViewById( R.id.createSymbolButton ) );
           
           
           final Button createSymbolKeyboardButton = (Button)( dialog.findViewById( R.id.createSymbolKeyboardButton ) );




            final ArrayList<String> spinnerArray = new ArrayList<String>();
            spinnerArray.add( "Script" );
            spinnerArray.add( "Subscript" );
            spinnerArray.add( "Superscript" );
            spinnerArray.add( "Overscript" );
            spinnerArray.add( "Underscript" );
            
            final ArrayAdapter<String> adapter = 
           		new ArrayAdapter<String>( activity , android.R.layout.simple_spinner_item , spinnerArray );
            
            adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
            
            
            createScriptSpinner.setAdapter( adapter );
            
            
            
            
            
            
            
            
            final OnClickListener createInsertSymbolButtonListener = 
          	      new OnClickListener() 
          	      {
          	         //@Override
          	         public void onClick(View v) 
          	         {
          	        	 
          	        	 try
          	        	 {
          	        		 
          	        		ISymbolInsertListener tmp = new ISymbolInsertListener()
          	        		{
          	        			public void handleSymbolInsert( String ins )
          	        			{
          	        				try
          	        				{
          	        					SymDialog.this.performInsert( ins );
          	        				}
          	        				catch( Throwable ex )
          	          	        	 {
          	          	        		 Log.e("tag", "msg", ex);
          	          	        	 }
          	        			}
          	        		};
          	  			
          	        		activity.playClick();
          	        		Model model = FreeKit.getModelManager();
          	        		SymbolInsertTopDialog idialog = new SymbolInsertTopDialog( model , tmp );
          	        		idialog.showSymbolInsertTopDialog( activity );
          	        		 
          	  			
          	        	 }
          	        	 catch( Throwable ex )
          	        	 {
          	        		 Log.e("tag", "msg", ex);
          	        	 }
          	            
          	         } // end method onClick
          	      }; // end createInsertSymbolButtonListener
            
          	      
            
          	    createInsertSymbolButton.setOnClickListener( createInsertSymbolButtonListener );
          	    
          	    
          	    
          	    
          	  final OnClickListener createSymbolButtonListener = 
              	      new OnClickListener() 
              	      {
              	         //@Override
              	         public void onClick(View v) 
              	         {
              	        	 
              	        	 try
              	        	 {
              	        		 
              	        		FlexString htm = SymDialog.this.buildEqnString( SymDialog.InsertMode.NON_CURSOR_MODE );
              	        		boolean Empty = EmptyFlag;
              	        		FlexString tag = new FlexString( createSymbolName.getText().toString() );

              	        		if (!Empty) {
              	        			EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.setSymbol, null, FreeKit);
              	        			Object[] param = { tag, TotStr };
              	        			send.setParameter(param);
              	        			ProgramDirector.fireEtherEvent(send, null);

              	        			dialog.dismiss(); // hide the dialog
              	        		}
              	  			
              	        	 }
              	        	 catch( Throwable ex )
              	        	 {
              	        		 Log.e("tag", "msg", ex);
              	        	 }
              	            
              	         } // end method onClick
              	      }; // end createSymbolButtonListener
                
              	      
                
              	    createSymbolButton.setOnClickListener( createSymbolButtonListener );
              	    
              	    
              	    
            createScriptSpinner.setOnItemSelectedListener(
            		new OnItemSelectedListener()
            		{

						public void onItemSelected(AdapterView<?> arg0,
								View arg1, int arg2, long arg3) {
							try
							{
								rebuildEquation();
							}
							catch( Throwable ex )
							{
								Log.e("tag", "msg", ex);
							}
							
						}

						public void onNothingSelected(AdapterView<?> arg0) {
							try
							{
								rebuildEquation();
							}
							catch( Throwable ex )
							{
								Log.e("tag", "msg", ex);
							}

						}
            			
            		} );
            
            
            
            
            createSymbolBoldBox.setOnCheckedChangeListener(
            		new OnCheckedChangeListener()
            		{

						public void onCheckedChanged(CompoundButton arg0,
								boolean arg1) {
							try
							{
								rebuildEquation();
							}
							catch( Throwable ex )
							{
								Log.e("tag", "msg", ex);
							}
							
						}
            			
            		} );
            
            
            
            createSymbolUprightBox.setOnCheckedChangeListener(
            		new OnCheckedChangeListener()
            		{

						public void onCheckedChanged(CompoundButton arg0,
								boolean arg1) {
							try
							{
								rebuildEquation();
							}
							catch( Throwable ex )
							{
								Log.e("tag", "msg", ex);
							}
							
						}
            			
            		} );
            
            
            
            final OnClickListener createSymbolKeyboardButtonListener = 
          	      new OnClickListener() 
          	      {
          	         //@Override
          	         public void onClick(View v) 
          	         {
          	        	 
          	        	 try
          	        	 {
          	        		showKeyboard( activity );
          	        	 }
          	        	 catch( Throwable ex )
          	        	 {
          	        		 Log.e("tag", "msg", ex);
          	        	 }
          	            
          	         } // end method onClick
          	      }; // end createInsertSymbolButtonListener
            
          	      
            
             createSymbolKeyboardButton.setOnClickListener( createSymbolKeyboardButtonListener );
            
             
             
             createSymbolEditField.setMathKeyListener( new IKeyListener()
             {
            	 public boolean onKeyDown(int keyCodeNonUnicode, KeyEvent e)
            	 {
            		 try
            		 {
            			 int key = (int)( e.getUnicodeChar() );
            			 if ((key > 64) && (key < 91)) {
            					char MyChar = (char) key;
            					String MyStr = (new Character(MyChar)).toString();
            					performInsert(MyStr);
            					return( true );
            				}

            				if ((key > 96) && (key < 123)) {
            					char MyChar = (char) key;
            					String MyStr = (new Character(MyChar)).toString();
            					performInsert(MyStr);
            					return( true );
            				}

            				if ((key > 47) && (key < 58)) {
            					char MyChar = (char) key;
            					String MyStr = (new Character(MyChar)).toString();
            					performInsert(MyStr);
            					return( true );
            				}
            				
            				if( keyCodeNonUnicode == 67 )
            				{
            					performDelete();
            					return( true );
            				}
            				
            				switch( key )
            				{
            				case 39 :
            					performInsert("&prime;");
            					return( true );
            					
            				}
            		 }
            		 catch( Throwable ex )
            		 {
            			 Log.e("tag", "msg", ex);
            		 }
            		 return( false );
            	 }
             });
          	      
            
            dialog.show();

            
    		
 		}
 		catch( Throwable ex )
 		{
 			Log.e("tag", "msg", ex);
 		}
};




/**
* Inserts a string of markup symbols into the editing panel.
*/
void performInsert(String InStr) throws MathImageParseException {
	HighLevelList<StdLowLevelList<FlexString>,FlexString> MyList = null;
	
	final InsertMode CurInsertMode = InsertMode.values()[ createScriptSpinner.getSelectedItemPosition() ];

//	if (CurInsertMode == OverscriptMode) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		OverscriptingMode = StdMode;

	MyList = CurInsertMode.getList( this );

	if (!(MyList.empty())) {
		MyList.searchHead();
		MyList.left();
	}

	MyList.insertRight(new FlexString(InStr));

	rebuildEquation();
}



/**
* Deletes one set of symbols from the editing panel.
*/
void performDelete() {
	HighLevelList<StdLowLevelList<FlexString>,FlexString> MyList = null;
	
	final InsertMode CurInsertMode = InsertMode.values()[ createScriptSpinner.getSelectedItemPosition() ];

	// if ((CurInsertMode == OverscriptMode) && (OverscriptingMode == HatMode)) { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//	OverscriptingMode = StdMode;
	//	OverscriptList.eraseAllInfo();
	// }

	MyList = CurInsertMode.getList( this );

	if (!(MyList.empty())) {
		MyList.searchHead();
		MyList.left();
		MyList.eraseNodeInfo();
	}

//	if (ScriptList.empty()) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		OverscriptingMode = StdMode;

	try {
		rebuildEquation();
	}
	catch (Exception ex) {
		Log.e("tag", "msg", ex);
	}
}



/**
* Updates the state of the editing panel.
*/
public void rebuildEquation() throws MathImageParseException {
	// MyTime.stop(); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	final InsertMode CurInsertMode = InsertMode.values()[ createScriptSpinner.getSelectedItemPosition() ];
	InsertMode CurMode = CurInsertMode;
	// if (SrcMode)
	//	CurMode = NonCursorMode; !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

	FlexString TotStr = buildEqnString(CurMode);

//	Component PrevPan = null;
	String exp = TotStr.exportString();

//	if (PrevCardComp != null)
//		remove(PrevCardComp);

//	if (SrcMode) {
//		if (!EmptyFlag)
//			TxtFd.setText(exp);
//		else
//			TxtFd.setText(" ");
//		add("Center", TxtFd);
//		PrevCardComp = TxtFd;
//		TxtFd.revalidate();
//	}
//	else {
//		PrevPan = MyWebPan;
//		MyWebPan.setText(TotStr, InAp, ColorIndex, InFont);
//		/* MyWebPan = new MathImagePanel( TotStr , InAp , ColorIndex , InFont );
//		attachComponentEvents( MyWebPan ); */
//		add("Center", MyWebPan);
//		PrevCardComp = MyWebPan;
//		MyWebPan.revalidate();
//	}
	
	
	if( EmptyFlag )
	{
		createSymbolEditField.setText( "  " );
		createSymbolEditField.invalidate();
	}
	else
	{
		createSymbolEditField.setText( exp );
		createSymbolEditField.invalidate();
	}
	

//	if (hasFocus())
//		MyWebPan.setBackground(BkgndColor);
//	else
//		MyWebPan.setBackground(Color.yellow);
//
//	if (!SrcMode && hasFocus()) {
//		MyWebPan.setDrawCursor(true);
//		MyTime.start();
//	}
//
//	/* MyL.last( CardPanel ); */
//	revalidate();
//	scp.revalidate();
//	repaint();
//	if (PrevPan != null)
//		removeComponentEvents(PrevPan);
}



/**
* Builds and returns an equation string  representing the
* user's input given the current mode.
*/
public FlexString buildEqnString(InsertMode CurMode) {
	String sp = "&sp;";

	boolean SumLen =
		!(SubscriptList.empty())
			|| !(SuperscriptList.empty())
			|| !(OverscriptList.empty())
			|| !(UnderscriptList.empty());

	if ( ( CurMode != InsertMode.SCRIPT_MODE ) && ( CurMode != InsertMode.NON_CURSOR_MODE ) )
		SumLen = true;

	boolean BoldOn = createSymbolBoldBox.isChecked();
	boolean UprightOn = createSymbolUprightBox.isChecked();
	EmptyFlag = false;

	TotStr = new FlexString();
	TotStr.setInsertPoint(0);

	if (SumLen)
		TotStr.insertJavaString("<BOX>");

//	if (OverscriptingMode == HatMode) { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		TotStr.insertJavaString("<HAT>");
//	}

	if (CurMode == InsertMode.SCRIPT_MODE)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(ScriptList, TotStr);

	if (CurMode == InsertMode.SCRIPT_MODE)
		TotStr.insertJavaString("</CURSOR>");

//	if (OverscriptingMode == HatMode) { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		TotStr.insertJavaString("</HAT>");
//	}

	if (SumLen)
		TotStr.insertJavaString("</BOX>");

	if ((!(SubscriptList.empty())) || (CurMode == InsertMode.SUBSCRIPT_MODE))
		TotStr.insertJavaString("<SUB>");

	if (CurMode == InsertMode.SUBSCRIPT_MODE)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(SubscriptList, TotStr);

	if (CurMode == InsertMode.SUBSCRIPT_MODE)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(SubscriptList.empty())) || (CurMode == InsertMode.SUBSCRIPT_MODE))
		TotStr.insertJavaString("</SUB>");

	if ((!(SuperscriptList.empty())) || (CurMode == InsertMode.SUPERSCRIPT_MODE))
		TotStr.insertJavaString("<SUP>");

	if (CurMode == InsertMode.SUPERSCRIPT_MODE)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(SuperscriptList, TotStr);

	if (CurMode == InsertMode.SUPERSCRIPT_MODE)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(SuperscriptList.empty())) || (CurMode == InsertMode.SUPERSCRIPT_MODE))
		TotStr.insertJavaString("</SUP>");

	if ((!(OverscriptList.empty())) || (CurMode == InsertMode.OVERSCRIPT_MODE))
		TotStr.insertJavaString("<ABOVE>");

	if (CurMode == InsertMode.OVERSCRIPT_MODE)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(OverscriptList, TotStr);

	if (CurMode == InsertMode.OVERSCRIPT_MODE)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(OverscriptList.empty())) || (CurMode == InsertMode.OVERSCRIPT_MODE))
		TotStr.insertJavaString("</ABOVE>");

	if ((!(UnderscriptList.empty())) || (CurMode == InsertMode.UNDERSCRIPT_MODE))
		TotStr.insertJavaString("<BELOW>");

	if (CurMode == InsertMode.UNDERSCRIPT_MODE)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(UnderscriptList, TotStr);

	if (CurMode == InsertMode.UNDERSCRIPT_MODE)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(UnderscriptList.empty())) || (CurMode == InsertMode.UNDERSCRIPT_MODE))
		TotStr.insertJavaString("</BELOW>");

	if (TotStr.strlen() == 0) {
		TotStr.insertJavaString(sp);
		EmptyFlag = true;
	}

	if (BoldOn || UprightOn) {
		if (UprightOn && BoldOn)
			TotStr.insertJavaString("</BT>");

		else if (UprightOn)
			TotStr.insertJavaString("</T>");

		else if (BoldOn)
			TotStr.insertJavaString("</B>");

		TotStr.setInsertPoint(0);

		if (UprightOn && BoldOn)
			TotStr.insertJavaString("<BT>");

		else if (BoldOn)
			TotStr.insertJavaString("<B>");

		else if (UprightOn)
			TotStr.insertJavaString("<T>");

	}

	return (TotStr);
}




/**
* Concatenates the string instances in <code>in</code>, and places the result
* in <code>MyStr</code>.
*/
void condenseText(HighLevelList<StdLowLevelList<FlexString>,FlexString> in, FlexString MyStr) {

	if (!(in.empty())) {
		boolean Done = false;
		in.searchHead();

		while (!Done) {
			FlexString NdStr = in.getNode();
			NdStr.insertString(MyStr);

			in.right();
			Done = in.getHead();
		}
	}

}




protected void showKeyboard( Activity act )
{
	
	InputMethodManager mgr = (InputMethodManager)( act.getSystemService( Context.INPUT_METHOD_SERVICE ) );
	mgr.toggleSoftInput( 0 , 0 );
	mgr.showSoftInput( /* FreeKit */ createSymbolEditField , InputMethodManager.SHOW_FORCED );
	/* FreeKit */ createSymbolEditField.requestFocus();
}




	      
}



