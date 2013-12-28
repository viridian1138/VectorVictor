






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


import geomdir.DrawObj;
import geomdir.applied.GeoPadKit;
import verdantium.utils.ColorDialog;
import verdantium.utils.ColorView;
import verdantium.utils.IColorDef;
import verdantium.utils.ILineWidthDef;
import verdantium.utils.LineWidthDialog;
import android.app.Activity;
import android.app.Dialog;
import android.graphics.Paint;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;



public class PropertiesColorDialog {
	
	
	private DrawObj in;
	
	
	public PropertiesColorDialog( DrawObj _in )
	{
		in = _in;
	}
	
	
	 
    public void showPropertiesColorDialog(final Activity activity, final GeoPadKit FreeKit)
	{
		try
 		{
    		final Dialog dialog = new Dialog( activity );
    		dialog.setContentView( R.layout.properties_color_dialog );
            dialog.setTitle( "Depictor Properties" );
            dialog.setCancelable(true);
            
            
            final ColorView frontLineColorView = (ColorView)( dialog.findViewById( R.id.frontLineColorView ) );
            final ColorView backLineColorView = (ColorView)( dialog.findViewById( R.id.backLineColorView ) );
            final ColorView labelColorView = (ColorView)( dialog.findViewById( R.id.labelColorView ) );
            
            final CheckBox frontLineCheckBox = (CheckBox)( dialog.findViewById( R.id.frontLineCheckBox ) );
            final CheckBox backLineCheckBox = (CheckBox)( dialog.findViewById( R.id.backLineCheckBox ) );
            final CheckBox labelCheckBox = (CheckBox)( dialog.findViewById( R.id.labelCheckBox ) );
            
            final CheckBox controlsVisibleCheckBox = (CheckBox)( dialog.findViewById( R.id.controlsVisibleCheckBox ) );
            
            frontLineColorView.setDrawingColor( in.getFrontLineColor() );
            backLineColorView.setDrawingColor( in.getBackLineColor() );
            labelColorView.setDrawingColor( in.getTextColor() );
            
            frontLineCheckBox.setChecked( in.getFrontLineVisible() );
            backLineCheckBox.setChecked( in.getBackLineVisible() );
            labelCheckBox.setChecked( in.getTextVisible() );
            
            controlsVisibleCheckBox.setChecked( in.getControlsVisible() );
            
            
            final OnClickListener frontLineButtonListener = new OnClickListener() 
            {
               //@Override
               public void onClick(View v) 
               {
            	   final IColorDef cdef = new IColorDef()
            	   	 {
            	   		 public int getColor()
            	   		 {
            	   			 return( in.getFrontLineColor() );
            	   		 }
            	   		 
            	   		 public void applyColor( int cdef )
            	   		 {
            	   			in.setFrontLineColor( cdef );
            	   			frontLineColorView.setDrawingColor( in.getFrontLineColor() );
            	   			frontLineColorView.invalidate();
            	   			FreeKit.getModelManager().globalRepaint();
            	   		 }
            	   	 };
            	   	 
              	 ColorDialog idialog = new ColorDialog();
              	 idialog.showColorDialog( activity , cdef );
               } // end method onClick
            }; // end frontLineButtonListener
            
            
            
            
            final OnClickListener backLineButtonListener = new OnClickListener() 
            {
               //@Override
               public void onClick(View v) 
               {
            	   final IColorDef cdef = new IColorDef()
          	   	 {
          	   		 public int getColor()
          	   		 {
          	   			 return( in.getBackLineColor() );
          	   		 }
          	   		 
          	   		 public void applyColor( int cdef )
          	   		 {
          	   			 in.setBackLineColor( cdef );
          	   		     backLineColorView.setDrawingColor( in.getBackLineColor() );
          	   		     backLineColorView.invalidate();
          	   		     FreeKit.getModelManager().globalRepaint();
          	   		 }
          	   	 };
            	   
                   ColorDialog idialog = new ColorDialog();
                   idialog.showColorDialog( activity , cdef );
               } // end method onClick
            }; // end backLineButtonListener
            
           
            
            
            
            final OnClickListener labelButtonListener = new OnClickListener() 
            {
               //@Override
               public void onClick(View v) 
               {
            	   final IColorDef cdef = new IColorDef()
          	   	 {
          	   		 public int getColor()
          	   		 {
          	   			 return( in.getTextColor() );
          	   		 }
          	   		 
          	   		 public void applyColor( int cdef )
          	   		 {
          	   			 try
          	   			 {
          	   				 in.setTextColor( cdef );
          	   				 labelColorView.setDrawingColor( in.getTextColor() );
          	   				 labelColorView.invalidate();
          	   				 String Str = (in.getVectName()).exportString();
          	   				 in.setDepicImage(
          	   						 FreeKit.makeDepicMathImage(Str, in.getTextColor(), in.getTextPtSz(), in.getNamedVar()));
          	   				 FreeKit.getModelManager().globalRepaint();
          	   			 }
          	   			 catch( Throwable ex )
          	   			 {
          	   				 Log.e("tag", "msg", ex);
          	   			 }
          	   		 }
          	   	 };
            	   
                   ColorDialog idialog = new ColorDialog();
                   idialog.showColorDialog( activity , cdef );
               } // end method onClick
            }; // end labelButtonListener
            
            
            
            
            
            
            final OnClickListener frontLineWidthListener = new OnClickListener() 
            {
               //@Override
               public void onClick(View v) 
               {
            	   final ILineWidthDef cdef = new ILineWidthDef()
          	   	 {
            		   public int getDrawingColor()
            		   {
            			   return( in.getFrontLineColor() );
            		   }
            			
            			public float getLineWidth()
            			{
            				return( in.getFrontLineStroke().getStrokeWidth() );
            			}
            			
            			public void setLineWidth( float wid )
            			{
            				Paint p = new Paint( in.getFrontLineStroke() );
            				p.setStrokeWidth( wid );
            				in.setFrontLineStroke( p );
            				FreeKit.getModelManager().globalRepaint();
            			}
            			
            			public float getMaxLineWidth()
            			{
            				return( 10.0f );
            			}
            			
            			public float getMinLineWidth()
            			{
            				return( 0.0f );
            			}
          	   	 };
            	   
                   LineWidthDialog idialog = new LineWidthDialog( cdef );
                   idialog.showLineWidthDialog( activity );
               } // end method onClick
            }; // end frontLineWidthListener
            
            
            
            
            
            
            
            final OnClickListener backLineWidthListener = new OnClickListener() 
            {
            	//@Override
                public void onClick(View v) 
                {
             	   final ILineWidthDef cdef = new ILineWidthDef()
           	   	 {
             		   public int getDrawingColor()
             		   {
             			   return( in.getBackLineColor() );
             		   }
             			
             			public float getLineWidth()
             			{
             				return( in.getBackLineStroke().getStrokeWidth() );
             			}
             			
             			public void setLineWidth( float wid )
             			{
             				Paint p = new Paint( in.getBackLineStroke() );
             				p.setStrokeWidth( wid );
             				in.setBackLineStroke( p );
             				FreeKit.getModelManager().globalRepaint();
             			}
             			
             			public float getMaxLineWidth()
             			{
             				return( 10.0f );
             			}
             			
             			public float getMinLineWidth()
             			{
             				return( 0.0f );
             			}
           	   	 };
             	   
                    LineWidthDialog idialog = new LineWidthDialog( cdef );
                    idialog.showLineWidthDialog( activity );
                } // end method onClick
            }; // end backLineWidthListener
            
            
            
            
            
            
            
            
            frontLineCheckBox.setOnCheckedChangeListener( new OnCheckedChangeListener()
            {
            	public void onCheckedChanged( CompoundButton button , boolean bool )
            	{
            		in.setFrontLineVisible( bool );
            		FreeKit.getModelManager().globalRepaint();
            	}
            } );
            
            
            
            backLineCheckBox.setOnCheckedChangeListener( new OnCheckedChangeListener()
            {
            	public void onCheckedChanged( CompoundButton button , boolean bool )
            	{
            		in.setBackLineVisible( bool );
            		FreeKit.getModelManager().globalRepaint();
            	}
            } );
            
            
            
            labelCheckBox.setOnCheckedChangeListener( new OnCheckedChangeListener()
            {
            	public void onCheckedChanged( CompoundButton button , boolean bool )
            	{
            		in.setTextVisible( bool );
            		FreeKit.getModelManager().globalRepaint();
            	}
            } );
            
            
            
            
            controlsVisibleCheckBox.setOnCheckedChangeListener( new OnCheckedChangeListener()
            {
            	public void onCheckedChanged( CompoundButton button , boolean bool )
            	{
            		in.setControlsVisible( bool );
            		FreeKit.getModelManager().globalRepaint();
            	}
            } );
            
            
            
            Button frontLineEditButton = (Button) dialog.findViewById(
          		  com.postgreen.vectorvictor.R.id.frontLineEditButton );
            frontLineEditButton.setOnClickListener( frontLineButtonListener );
            
            
            Button backLineEditButton = (Button) dialog.findViewById(
            		  com.postgreen.vectorvictor.R.id.backLineEditButton );
            backLineEditButton.setOnClickListener( backLineButtonListener );
              
              
            Button labelEditButton = (Button) dialog.findViewById(
            		  com.postgreen.vectorvictor.R.id.labelEditButton );
            labelEditButton.setOnClickListener( labelButtonListener );
            
            
            
            
            Button frontLineWidthButton = (Button) dialog.findViewById(
            		  com.postgreen.vectorvictor.R.id.frontLineWidthButton );
              frontLineWidthButton.setOnClickListener( frontLineWidthListener );
              
              
              Button backLineWidthButton = (Button) dialog.findViewById(
              		  com.postgreen.vectorvictor.R.id.backLineWidthButton );
              backLineWidthButton.setOnClickListener( backLineWidthListener );
            
            
            
            
            dialog.show();

            
    		
 		}
 		catch( Throwable ex )
 		{
 			Log.e("tag", "msg", ex);
 		}
};




	      
}


