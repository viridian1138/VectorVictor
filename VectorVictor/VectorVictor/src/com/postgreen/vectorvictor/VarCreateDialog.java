






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
import geomdir.applied.*;

import java.util.ArrayList;

import meta.FlexString;
import meta.HighLevelList;
import verdantium.EtherEvent;
import verdantium.ProgramDirector;
import verdantium.mathimage.MathImageParseException;
import android.app.Dialog;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;


public class VarCreateDialog {
	
	
	private Model in;
	private GeoPadKit FreeKit;
	
	
	
	private transient HighLevelList ScriptList = new HighLevelList();
	private transient HighLevelList SubscriptList = new HighLevelList();
	private transient HighLevelList SuperscriptList = new HighLevelList();
	private transient HighLevelList OverscriptList = new HighLevelList();
	private transient HighLevelList UnderscriptList = new HighLevelList();

	public final static int ScriptMode = 0;
	public final static int SubscriptMode = 1;
	public final static int SuperscriptMode = 2;
	public final static int OverscriptMode = 3;
	public final static int UnderscriptMode = 4;
	public final static int NonCursorMode = 5;
	
	private transient FlexString TotStr = new FlexString();
	private transient boolean EmptyFlag = true;
	
	
	
	
	private Spinner createScriptSpinner;
	
	private TextView createVarEditField;
	
	
	
	public VarCreateDialog( Model _in , GeoPadKit _FreeKit )
	{
		in = _in;
		FreeKit = _FreeKit;
	}
	
	
	 
    public void showVarDialog(final VectorVictorActivity activity)
	{
		try
 		{
			activity.playClick();
    		final Dialog dialog = new Dialog( activity );
    		dialog.setContentView( R.layout.var_create_dialog );
            dialog.setTitle( "Create Var" );
            dialog.setCancelable(true);
            
           
           
           createVarEditField = (TextView)( dialog.findViewById( R.id.createVarEditField ) );

           
           final Button createInsertSymbolButton = (Button)( dialog.findViewById( R.id.createInsertSymbolButton ) );


           createScriptSpinner = (Spinner)( dialog.findViewById( R.id.createScriptSpinner ) );
           
           
           final Spinner createVarTypeSpinner = (Spinner)( dialog.findViewById( R.id.createVarTypeSpinner ) );
           
           
           final Button createVarButton = (Button)( dialog.findViewById( R.id.createVarButton ) );
           
           
           final Button createVarKeyboardButton = (Button)( dialog.findViewById( R.id.createVarKeyboardButton ) );




           {
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
           }
            
            
           
           
           {
        	   final ArrayList<String> spinnerArray = new ArrayList<String>();
        	   spinnerArray.add( "Vector" );
        	   spinnerArray.add( "Scalar" );
        	   spinnerArray.add( "Phasor" );
        	   spinnerArray.add( "Bivector" );
            
        	   final ArrayAdapter<String> adapter = 
        			   new ArrayAdapter<String>( activity , android.R.layout.simple_spinner_item , spinnerArray );
            
        	   adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item );
            
            
        	   createVarTypeSpinner.setAdapter( adapter );
           }
            
            
            
            
            
            
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
          	        					VarCreateDialog.this.performInsert( ins );
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
          	    
          	    
          	    
          	    
          	  final OnClickListener createVarButtonListener = 
              	      new OnClickListener() 
              	      {
              	         //@Override
              	         public void onClick(View v) 
              	         {
              	        	 
              	        	 try
              	        	 {
              	        		 
              	        		FlexString htm = VarCreateDialog.this.buildEqnString(VarCreateDialog.NonCursorMode);
              	        		String str = "";
              	        		boolean Empty = EmptyFlag;

              	        		if (!Empty) {
              	        			str = "'" + htm.exportString() + "'";
              	        			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createNamedDepic ,
              	        					null , FreeKit );
              	        			Object[] param = { str , createVarTypeSpinner.getSelectedItem() };
              	        			send.setParameter( param );
              	        			ProgramDirector.fireEtherEvent( send , null );

              	        			dialog.dismiss(); // hide the dialog
              	        		}
              	  			
              	        	 }
              	        	 catch( Throwable ex )
              	        	 {
              	        		 Log.e("tag", "msg", ex);
              	        	 }
              	            
              	         } // end method onClick
              	      }; // end createSymbolButtonListener
                
              	      
                
              	    createVarButton.setOnClickListener( createVarButtonListener );
              	    
          	      
            
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
	HighLevelList MyList = null;
	
	final int CurInsertMode = createScriptSpinner.getSelectedItemPosition();

//	if (CurInsertMode == OverscriptMode) !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		OverscriptingMode = StdMode;

	switch (CurInsertMode) {
		case ScriptMode :
			MyList = ScriptList;
			break;
		case SubscriptMode :
			MyList = SubscriptList;
			break;
		case SuperscriptMode :
			MyList = SuperscriptList;
			break;
		case OverscriptMode :
			MyList = OverscriptList;
			break;
		case UnderscriptMode :
			MyList = UnderscriptList;
			break;

	}

	if (!(MyList.empty())) {
		MyList.searchHead();
		MyList.left();
	}

	MyList.insertRight(new FlexString(InStr));

	rebuildEquation();
}



/**
* Updates the state of the editing panel.
*/
public void rebuildEquation() throws MathImageParseException {
	// MyTime.stop(); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	final int CurInsertMode = createScriptSpinner.getSelectedItemPosition();
	int CurMode = CurInsertMode;
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
		createVarEditField.setText( "  " );
		createVarEditField.invalidate();
	}
	else
	{
		createVarEditField.setText( exp );
		createVarEditField.invalidate();
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
public FlexString buildEqnString(int CurMode) {
	String sp = "&sp;";

	boolean SumLen =
		!(SubscriptList.empty())
			|| !(SuperscriptList.empty())
			|| !(OverscriptList.empty())
			|| !(UnderscriptList.empty());

	if ( ( CurMode != ScriptMode ) && ( CurMode != NonCursorMode ) )
		SumLen = true;

	boolean BoldOn = false;
	boolean UprightOn = false;
	EmptyFlag = false;

	TotStr = new FlexString();
	TotStr.setInsertPoint(0);

	if (SumLen)
		TotStr.insertJavaString("<BOX>");

//	if (OverscriptingMode == HatMode) { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		TotStr.insertJavaString("<HAT>");
//	}

	if (CurMode == ScriptMode)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(ScriptList, TotStr);

	if (CurMode == ScriptMode)
		TotStr.insertJavaString("</CURSOR>");

//	if (OverscriptingMode == HatMode) { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		TotStr.insertJavaString("</HAT>");
//	}

	if (SumLen)
		TotStr.insertJavaString("</BOX>");

	if ((!(SubscriptList.empty())) || (CurMode == SubscriptMode))
		TotStr.insertJavaString("<SUB>");

	if (CurMode == SubscriptMode)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(SubscriptList, TotStr);

	if (CurMode == SubscriptMode)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(SubscriptList.empty())) || (CurMode == SubscriptMode))
		TotStr.insertJavaString("</SUB>");

	if ((!(SuperscriptList.empty())) || (CurMode == SuperscriptMode))
		TotStr.insertJavaString("<SUP>");

	if (CurMode == SuperscriptMode)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(SuperscriptList, TotStr);

	if (CurMode == SuperscriptMode)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(SuperscriptList.empty())) || (CurMode == SuperscriptMode))
		TotStr.insertJavaString("</SUP>");

	if ((!(OverscriptList.empty())) || (CurMode == OverscriptMode))
		TotStr.insertJavaString("<ABOVE>");

	if (CurMode == OverscriptMode)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(OverscriptList, TotStr);

	if (CurMode == OverscriptMode)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(OverscriptList.empty())) || (CurMode == OverscriptMode))
		TotStr.insertJavaString("</ABOVE>");

	if ((!(UnderscriptList.empty())) || (CurMode == UnderscriptMode))
		TotStr.insertJavaString("<BELOW>");

	if (CurMode == UnderscriptMode)
		TotStr.insertJavaString("<CURSOR>");

	condenseText(UnderscriptList, TotStr);

	if (CurMode == UnderscriptMode)
		TotStr.insertJavaString("</CURSOR>");

	if ((!(UnderscriptList.empty())) || (CurMode == UnderscriptMode))
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
void condenseText(HighLevelList in, FlexString MyStr) {

	if (!(in.empty())) {
		boolean Done = false;
		in.searchHead();

		while (!Done) {
			FlexString NdStr = (FlexString) (in.getNode());
			NdStr.insertString(MyStr);

			in.right();
			Done = in.getHead();
		}
	}

}




	      
}



