

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



import com.postgreen.vectorvictor.R;

import geomdir.GeomConstants;
import geomdir.applied.EXsym;
import geomdir.applied.FastSuiEtherEvent;
import geomdir.applied.GeoPadAlgPanel;
import geomdir.applied.GeoPadKit;
import geomdir.applied.GeoPadModel;
import geomdir.applied.GeoPadPanel;
import geomdir.applied.SuiEtherEvent;
import geomdir.config.Config;
import verdantium.EtherEvent;
import verdantium.ProgramDirector;
import verdantium.kluges.TwoDScrollView;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TableRow;

/**
 * @author thorngreen
 *
 */
public class VectorVictorActivity extends Activity {
	
	
	private static final int SHOW_KEYBOARD_MENU_ID = Menu.FIRST;
//	private static final int HIDE_KEYBOARD_MENU_ID = Menu.FIRST + 1;
	private static final int CREATE_VECTOR_MENU_ID = Menu.FIRST + 1;
	private static final int CREATE_SCALAR_MENU_ID = Menu.FIRST + 2;
	private static final int CREATE_PHASOR_MENU_ID = Menu.FIRST + 3;
	private static final int CREATE_BIVECTOR_MENU_ID = Menu.FIRST + 4;
	private static final int PLUS_MENU_ID = Menu.FIRST + 5;
	private static final int MINUS_MENU_ID = Menu.FIRST + 6;
	private static final int TIMES_MENU_ID = Menu.FIRST + 7;
	private static final int DIVIDE_MENU_ID = Menu.FIRST + 8;
	private static final int VECTOR_KBD_MENU_ID = Menu.FIRST + 9;
	private static final int CREATE_KBD_MENU_ID = Menu.FIRST + 10;
	private static final int DEPICTOR_KBD_MENU_ID = Menu.FIRST + 11;
	private static final int MODE_KBD_MENU_ID = Menu.FIRST + 12;
	
	
	
	GeoPadPanel pn;
	GeoPadKit FreeKit;
	boolean keyboardOn = false;
	Button showKeyboard;

	
	
	/**
	 * 
	 */
	public VectorVictorActivity() {
		// TODO Auto-generated constructor stub
	}
	
	
	/** Called with the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Inflate our UI from its XML layout description.
        setContentView(R.layout.vector_victor_activity);
        
//        ActionBar actionBar = getActionBar();
//        actionBar.show();
//        actionBar.getCustomView().

        // Find the text editor view inside the layout, because we
        // want to do various programmatic things with it.
        
        Config config = new Config();
        
        
        TwoDScrollView td1 = (TwoDScrollView)( findViewById( R.id.scene_scroller1 ) );
        TwoDScrollView td2 = (TwoDScrollView)( findViewById( R.id.scene_scroller2 ) );
        TwoDScrollView td3 = (TwoDScrollView)( findViewById( R.id.scene_scroller3 ) );
        TwoDScrollView td4 = (TwoDScrollView)( findViewById( R.id.scene_scroller4 ) );

        
        FreeKit = new GeoPadKit( this , "geopad.cfg" , GeomConstants.VectorOriginType , td1 );
        
        FreeKit.geomInit( "geopad.cfg" , GeomConstants.VectorOriginType , "geomdir.applied.GeoPadPanel" , config );
		// FreeKit.setRootPane( MyR );
		// FreeKit.addWindowRecord( FreeKit , GeomConstants.GeomWindow );
		// FreeKit.getXKit().setTopObj( this );

		// !!!!!!!!!!! Object MyCon = FreeKit.createToolDisplay( "geomdir.applied.GeoPadPanel" , new Properties() );
        pn = new GeoPadPanel(); // !!!!!!!!!!!!!!!!!!!!!!!!!
        ( (GeoPadModel)( FreeKit.getModelManager() ) ).setToolObject( pn ); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        pn.setScriptTarget( FreeKit ); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
        

		// FreeKit.setMenuCardPanel( MyR );
		GeoPadAlgPanel MyAlgPanel = FreeKit.createAlgPanel( td3 );
		GeoPadKit BoundKit = FreeKit.createBoundDepic( td2 );
		GeoPadKit MyGeomPanel = FreeKit.createGeomWork( td4 );
		
		BoundKit.setBackgroundColor( Color.rgb( 192 , 231 , 210 ) );


		
		
		{
			TableRow tr = (TableRow)( findViewById( R.id.tableRow1 ) );
			Button createScalar = new Button( this )
			{
				@Override
				public boolean onKeyDown(int keyCode, KeyEvent e)
			 	{
					return( FreeKit.onKeyDown(keyCode, e) );
			 	}
			};
			
			createScalar.setText( "Create Scalar" );
			createScalar.setBackgroundColor( Color.rgb( 176 , 208 , 208 ) );
			tr.addView( createScalar ); 
			showKeyboard = new Button( this )
			{
				@Override
				public boolean onKeyDown(int keyCode, KeyEvent e)
			 	{
					return( FreeKit.onKeyDown(keyCode, e) );
			 	}
			};
			
			showKeyboard.setText( "Show Keyboard" );
			tr.addView( showKeyboard ); 
			showKeyboard.setFocusable( true );
			showKeyboard.setFocusableInTouchMode( true );
			
			
			createScalar.setOnClickListener( new View.OnClickListener() {
				
				public void onClick(View v) {
					try
		     		{
						playClick();
		     			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createScalar ,
		     				null , FreeKit );
		     			ProgramDirector.fireEtherEvent( send , null );
		     		}
		     		catch( Throwable ex )
		     		{
		     			Log.e("tag", "msg", ex);
		     		}
					
				}
			} );
			
			
			showKeyboard.setOnClickListener( new View.OnClickListener() {
				
				public void onClick(View v) {
					try
		     		{
						playClick();
						if( !keyboardOn )
						{
							showKeyboard();
							keyboardOn = true;
						}
						else
						{
							hideKeyboard();
							keyboardOn = false;
						}
		     		}
		     		catch( Throwable ex )
		     		{
		     			Log.e("tag", "msg", ex);
		     		}
					
				}
			} );

			
		} 

		
		
		
		
		{
			RelativeLayout sc1 = (RelativeLayout)( findViewById( R.id.scene_container1 ) );
	        RelativeLayout sc2 = (RelativeLayout)( findViewById( R.id.scene_container2 ) );
			sc1.addView( FreeKit /* FreeDepicComp */ ); 
			sc2.addView( BoundKit /* BoundDepicComp */ ); 
		}
		
		
		
		{
			RelativeLayout sc3 = (RelativeLayout)( findViewById( R.id.scene_container3 ) );
	        RelativeLayout sc4 = (RelativeLayout)( findViewById( R.id.scene_container4 ) );
			sc3.addView( MyAlgPanel /* AlgComp */ ); 
			sc4.addView( MyGeomPanel /* GeoComp */ ); 
		}
		
		
		td1.smoothScrollBy(1000-300+100,1000-150+100);
		td2.smoothScrollBy(1000-300+100,1000-150+100);
		td4.smoothScrollBy(1000, 0);
		
		
		
		FreeKit.createUnitDepic();
		
		
		
		
//		try
//		{
//			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createScalar ,
//				null , FreeKit );
//			ProgramDirector.fireEtherEvent( send , null );
//			
//			GeoPadModel model = (GeoPadModel)( FreeKit.getModelManager() );
//			
//			// Object[] arg = { new Integer( EXsym.plus ) };
//			// send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
//			//	arg , FreeKit );
//			// ProgramDirector.fireEtherEvent( send , null );
//			
//			FlexString VarName = new FlexString( "a" );
//			
//			FragNode fr = model.getVarList().getFrag( VarName );
//			boolean Works = ( fr != null );
//			DrawObj myNode = null;
//			DGMNode myD = null;
//
//			if( Works )
//				{
//				DGMHashMap FragList = fr.getFragMap();
//				myD = FragList.getFirstNode();
//				myNode = myD.getMyDraw();
//				model.keyHandleSingleClick( myNode , myD );
//				}
//			
//		}
//		catch( Throwable ex )
//		{
//			Log.e("tag", "msg", ex);
//		}
		
        
        
//        int count;
//        
//        
//       for( count = 0 ; count < 3 ; count++ )
//       {
//        	
//        	TableRow tr=new TableRow(this);
//       	    DescriptorSurfView btna=new DescriptorSurfView(this);
//        	//btna.setText("Hello2 " + count );
//        	tr.addView(btna);     
//        	DepictorSurfView btnb=new DepictorSurfView(this);
//        	//btnb.setText("There");
//        	tr.addView(btnb);
//        	tabl.addView(tr);
//        	
//        }
//
		
        
        
        
        
    }
    
    
    
    protected void showKeyboard( )
    {
    	
    	InputMethodManager mgr = (InputMethodManager)( getSystemService( Context.INPUT_METHOD_SERVICE ) );
    	mgr.toggleSoftInput( 0 , 0 );
    	mgr.showSoftInput( /* FreeKit */ showKeyboard , InputMethodManager.SHOW_FORCED );
    	/* FreeKit */ showKeyboard.requestFocus();
    }
    
    
    
    
    protected void hideKeyboard( )
    {
    	InputMethodManager mgr = (InputMethodManager)( getSystemService( Context.INPUT_METHOD_SERVICE ) );
    	// mgr.hideSoftInputFromWindow( FreeKit.getWindowToken() , 0 );
    	mgr.toggleSoftInput(0, 0);
    	/* FreeKit */ showKeyboard.requestFocus();
    }
    
    
    
 // displays configuration options in menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) 
       {
          // super.onCreateOptionsMenu(menu); // call super's method

          // add options to menu
          menu.add(Menu.NONE, SHOW_KEYBOARD_MENU_ID, Menu.NONE, 
                  R.string.menuitem_show_keyboard);
//          menu.add(Menu.NONE, HIDE_KEYBOARD_MENU_ID, Menu.NONE, 
//                  R.string.menuitem_hide_keyboard);
          menu.add(Menu.NONE, CREATE_VECTOR_MENU_ID, Menu.NONE, 
                  R.string.menuitem_create_vector);
          menu.add(Menu.NONE, CREATE_SCALAR_MENU_ID, Menu.NONE, 
             R.string.menuitem_create_scalar);
          menu.add(Menu.NONE, CREATE_PHASOR_MENU_ID, Menu.NONE, 
                  R.string.menuitem_create_phasor);
          menu.add(Menu.NONE, CREATE_BIVECTOR_MENU_ID, Menu.NONE, 
                  R.string.menuitem_create_bivector);
          
          menu.add(Menu.NONE, PLUS_MENU_ID, Menu.NONE, 
                  "+");
          menu.add(Menu.NONE, MINUS_MENU_ID, Menu.NONE, 
                  "-");
          menu.add(Menu.NONE, TIMES_MENU_ID, Menu.NONE, 
                  "*");
          menu.add(Menu.NONE, DIVIDE_MENU_ID, Menu.NONE, 
                  "/");
          menu.add(Menu.NONE, VECTOR_KBD_MENU_ID, Menu.NONE, 
                  "Vector Kbd");
          menu.add(Menu.NONE, CREATE_KBD_MENU_ID, Menu.NONE, 
                  "Create Kbd");
          menu.add(Menu.NONE, DEPICTOR_KBD_MENU_ID, Menu.NONE, 
                  "Depictor Kbd");
          menu.add(Menu.NONE, MODE_KBD_MENU_ID, Menu.NONE, 
                  "Mode Kbd");
          
          //menu.add(Menu.NONE, BKGND_COLOR_MENU_ID, Menu.NONE, 
          //   R.string.menuitem_bkgnd_color);
          //menu.add(Menu.NONE, WIDTH_MENU_ID, Menu.NONE, 
          //   R.string.menuitem_line_width);
          //menu.add(Menu.NONE, ERASE_ALL_MENU_ID, Menu.NONE, 
          //        R.string.menuitem_erase_all);
          //menu.add(Menu.NONE, ERASE_LAST_TRACE_MENU_ID, Menu.NONE, 
          //        R.string.menuitem_erase_last_trace);
          //menu.add(Menu.NONE, STOP_ROTATION_MENU_ID, Menu.NONE, 
          //        R.string.menuitem_stop_rotation);
          //menu.add(Menu.NONE, TOGGLE_SNOW_MODE_MENU_ID, Menu.NONE, 
          //        R.string.menuitem_toggle_snow_mode);
          //menu.add(Menu.NONE, ERASE_MENU_ID, Menu.NONE, 
          //   R.string.menuitem_erase);
          //menu.add(Menu.NONE, SAVE_MENU_ID, Menu.NONE, 
          //   R.string.menuitem_save_image);
          
          super.onCreateOptionsMenu(menu); // call super's method

          return true; // options menu creation was handled
       } // end onCreateOptionsMenu
    
    
    
 // handle choice from options menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) 
    {
       // switch based on the MenuItem id
       switch (item.getItemId()) 
       {
         case SHOW_KEYBOARD_MENU_ID:
        	playClick();
            showKeyboard(); // display color selection dialog
            return true; // consume the menu event
            
 //        case HIDE_KEYBOARD_MENU_ID:
 //           hideKeyboard(); // display color selection dialog
 //           return true; // consume the menu event
            
         case CREATE_VECTOR_MENU_ID:
         {
        	try
     		{
        		playClick();
     			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createVector ,
     				null , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case CREATE_SCALAR_MENU_ID:
         {
        	try
     		{
        		playClick();
     			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createScalar ,
     				null , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case CREATE_PHASOR_MENU_ID:
         {
        	try
     		{
        		playClick();
     			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createPhasor ,
     				null , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case CREATE_BIVECTOR_MENU_ID:
         {
        	try
     		{
        		playClick();
     			EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createBivector ,
     				null , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
             
             
         case PLUS_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Object[] arg = { new Integer( EXsym.plus ) };
				EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
					arg , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case MINUS_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Object[] arg = { new Integer( EXsym.minus ) };
				EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
					arg , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case TIMES_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Object[] arg = { new Integer( EXsym.prod ) };
				EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
					arg , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case DIVIDE_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Object[] arg = { new Integer( EXsym.div ) };
				EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
					arg , FreeKit );
     			ProgramDirector.fireEtherEvent( send , null );
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case VECTOR_KBD_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Dialog dialog = new Dialog( this );
        		dialog.setContentView( R.layout.vector_victor_vector_kbd );
                dialog.setTitle( "Vector Kbd" );
                dialog.setCancelable(true);
                dialog.show();
                
                addVectorKeyboardListeners( dialog );
        		
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case CREATE_KBD_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Dialog dialog = new Dialog( this );
        		dialog.setContentView( R.layout.vector_victor_create_kbd );
                dialog.setTitle( "Create Kbd" );
                dialog.setCancelable(true);
                dialog.show();
                
                addCreateKeyboardListeners( dialog );
        		
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case DEPICTOR_KBD_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Dialog dialog = new Dialog( this );
        		dialog.setContentView( R.layout.vector_victor_depictor_kbd );
                dialog.setTitle( "Depictor Kbd" );
                dialog.setCancelable(true);
                dialog.show();
                
                addDepictorKeyboardListeners( dialog );
        		
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
         case MODE_KBD_MENU_ID:
         {
        	try
     		{
        		playClick();
        		Dialog dialog = new Dialog( this );
        		dialog.setContentView( R.layout.vector_victor_mode_kbd );
                dialog.setTitle( "Mode Kbd" );
                dialog.setCancelable(true);
                dialog.show();
                
                addModeKeyboardListeners( dialog );
        		
     		}
     		catch( Throwable ex )
     		{
     			Log.e("tag", "msg", ex);
     		}
         }
             return true; // consume the menu event
             
             
             
 //         case BKGND_COLOR_MENU_ID:
 //             showBkgndColorDialog(); // display color selection dialog
 //             return true; // consume the menu event
 //         case WIDTH_MENU_ID:
 //            showLineWidthDialog(); // display line thickness dialog
 //            return true; // consume the menu event
 //         case ERASE_ALL_MENU_ID:
 //             eraseAll(); // display line thickness dialog
 //             return true; // consume the menu event
 //         case ERASE_LAST_TRACE_MENU_ID:
 //             eraseLastTrace(); // display line thickness dialog
 //             return true; // consume the menu event
 //         case STOP_ROTATION_MENU_ID:
 //             stopRotation(); // display line thickness dialog
 //             return true; // consume the menu event
 //         case TOGGLE_SNOW_MODE_MENU_ID:
 //             toggleSnowMode(); // display line thickness dialog
 //             return true; // consume the menu event
          //case ERASE_MENU_ID:
          //   doodleView.setDrawingColor(Color.WHITE); // line color white
          //   return true; // consume the menu event
          //case SAVE_MENU_ID:     
          //   doodleView.saveImage(); // save the current images
          //   return true; // consume the menu event
       } // end switch
       
       return super.onOptionsItemSelected(item); // call super's method
    } // end method onOptionsItemSelected
    
    
    
    
    
    protected void addVectorKeyboardListeners( Dialog dialog )
    {
    	{
        	Object ob = R.id.geoPadHandlePlus;
        	Object ob2 = findViewById( R.id.geoPadHandlePlus );
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandlePlus ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandlePlus( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleMinus ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleMinus( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleTimes ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleTimes( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleAbs ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleAbs( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleAssign ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleAssign( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandlePower ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandlePower( arg0 );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleLeftParen ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleLeftParen( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleDiv ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleDiv( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleInv ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleInv( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleSqr ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleSqr( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleCompare ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleCompare( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.dotProduct ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.dot );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.crossProduct ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.cross );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.wedgeProduct ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.wedge );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.naturalExponent ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.exp );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.squareRoot ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.sqrt );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.scalarGradedPart ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.ScalGradPart );
				}
			});
		}
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.imaginaryGradedPart ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.keyHandleNewOp( EXsym.ImagGradPart );
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.proportionOp ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.proportionOp , null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.traceGraph ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.traceGraphOp , null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		
    }
    
    
    
    
    
    
    protected void addCreateKeyboardListeners( Dialog dialog )
    {
    	final OnClickListener vectCreateListener = new OnClickListener()
		{
			public void onClick(final View arg0) {
				playClick();
				final Button b = (Button) arg0;
				pn.sendAddNamedDepictorOp( "'" + ( b.getText() ) + "'"  , "Vector" );
			}
		};
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create1 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create2 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create3 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create4 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create5 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create6 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create7 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create8 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create9 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create10 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create11 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create12 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create13 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create14 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create15 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create16 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create17 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create18 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create19 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create20 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.create21 ) );
			button.setOnClickListener( vectCreateListener );
		}
		
		
		
		

    }
    
    
    
    
    
    protected void addDepictorKeyboardListeners( Dialog dialog )
    {
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.traceOn ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.turnTraceOn ,
							null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.removeTrace ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.removeTrace ,
							null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.traceOff ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.turnTraceOff ,
							null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.clearTrace ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.clearTrace ,
							null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleRay ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleRay( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleLine ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleLine( arg0 );
				}
			});
		}
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.toggleNumericLabel ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.changeDepicNumLabel ,
							null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleLabel ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleLabel( arg0 );
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.circleDepictor ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.changeDepicCircled ,
								null , FreeKit );
							ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleConst ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleConst( arg0 );
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.negateDepictor ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.negateDepic ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleRuler ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleRuler( arg0 );
				}
			});
		}
		
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.geoPadHandleRulerWithNegative ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					playClick();
					pn.geoPadHandleRulerWithNegative( arg0 );
				}
			});
		}
		
		
		
		
		
		
		
		{
			Button button = (Button)( dialog.findViewById( R.id.hideDepic ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.hideDepic ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
		
		
		
		
		
		
		
		
    }
    
    
    
    
    
    
    
    
    
    
    protected void addModeKeyboardListeners( Dialog dialog )
    {
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.dragValue ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestDragMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.freeTransformation ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestFreeTransformationMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.dragLabel ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestLabelMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.properties ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestPropertiesMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.dilate ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestDilateMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.rotate ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestRotateMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	
    	{
			Button button = (Button)( dialog.findViewById( R.id.translate ) );
			button.setOnClickListener( new OnClickListener()
			{
				public void onClick(View arg0) {
					try
					{
						playClick();
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestTranslateMode ,
								null , FreeKit );
						ProgramDirector.fireEtherEvent( send , null );
					}
					catch( Throwable ex )
					{
						ex.printStackTrace( System.out );
					}
				}
			});
		}
    	
    	
    	
    	
    	
    	
    }
    
    
    
    public void playClick( )
	{
		try{
			Context context = this;
			MediaPlayer mMediaPlayer = MediaPlayer.create( this , R.raw.click );
			final AudioManager audioManager = (AudioManager)( context.getSystemService( Context.AUDIO_SERVICE ) );
			if( audioManager.getStreamVolume( AudioManager.STREAM_ALARM ) != 0 )
			{
				//mMediaPlayer.setAudioStreamType( AudioManager.STREAM_ALARM );
				//mMediaPlayer.setLooping(false);
				//mMediaPlayer.prepare();
				mMediaPlayer.start();
			}
		}
		catch( Throwable ex )
		{
			Log.e("tag", "msg", ex);
		}
	}
    
    
    
    
}




