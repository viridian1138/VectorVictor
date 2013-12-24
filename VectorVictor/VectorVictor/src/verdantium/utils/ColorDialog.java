




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




package verdantium.utils;

import java.util.concurrent.atomic.AtomicBoolean;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Color;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class ColorDialog {
	
	// variable that refers to a Choose Color or Choose Line Width dialog
		private Dialog currentDialog; 
		
		private AtomicBoolean dialogIsVisible = new AtomicBoolean(); // false
		
		private IColorDef cdef;
	
	   
    // display a dialog for selecting color
       public void showColorDialog( Activity activity , IColorDef _cdef )
       {
    	   cdef = _cdef;
    	   
          // create the dialog and inflate its content
          currentDialog = new Dialog( activity );
          currentDialog.setContentView( com.postgreen.vectorvictor.R.layout.color_dialog);
          currentDialog.setTitle( com.postgreen.vectorvictor.R.string.title_color_dialog );
          currentDialog.setCancelable(true);
          
          // get the color SeekBars and set their onChange listeners
          final SeekBar redSeekBar = 
             (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.redSeekBar);
          final SeekBar greenSeekBar = 
             (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.greenSeekBar);
          final SeekBar blueSeekBar = 
             (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.blueSeekBar);

          // register SeekBar event listeners
          redSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
          greenSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
          blueSeekBar.setOnSeekBarChangeListener(colorSeekBarChanged);
         
          // use current drawing color to set SeekBar values
          final int color = cdef.getColor();
          redSeekBar.setProgress(Color.red(color));
          greenSeekBar.setProgress(Color.green(color));
          blueSeekBar.setProgress(Color.blue(color));        
          
          // set the Set Color Button's onClickListener
          Button setColorButton = (Button) currentDialog.findViewById(
        		  com.postgreen.vectorvictor.R.id.setColorButton);
          setColorButton.setOnClickListener(setColorButtonListener);
          
          ColorView prevColorView = 
                  (ColorView) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.prevColorView);
          ColorView currentColorView = 
                  (ColorView) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.currentColorView);
          ColorSwatchView colorSwatchView =
         		 (ColorSwatchView) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.colorSwatchView );

          prevColorView.setDrawingColor( color );
          currentColorView.setDrawingColor( color );
          
          IColorSet colSet = new IColorSet()
          {
        	  public void setColors( int red , int green , int blue )
        	  {
        		  redSeekBar.setProgress( red );
        		  greenSeekBar.setProgress( green );
        		  blueSeekBar.setProgress( blue );
        	  }
          };
          
          colorSwatchView.setColorSet( colSet );
     
          dialogIsVisible.set(true); // dialog is on the screen
          currentDialog.show(); // show the dialog
       } // end method showColorDialog
       
       
    // OnClickListener for the color dialog's Set Color Button
       private OnClickListener setColorButtonListener = new OnClickListener() 
       {
          //@Override
          public void onClick(View v) 
          {
             // get the color SeekBars
             SeekBar redSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.redSeekBar);
             SeekBar greenSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.greenSeekBar);
             SeekBar blueSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.blueSeekBar);

             // set the line color
             cdef.applyColor(Color.argb(
                255, redSeekBar.getProgress(), 
                greenSeekBar.getProgress(), blueSeekBar.getProgress()));
             dialogIsVisible.set(false); // dialog is not on the screen
             currentDialog.dismiss(); // hide the dialog
             currentDialog = null; // dialog no longer needed
          } // end method onClick
       }; // end setColorButtonListener
       
    // OnSeekBarChangeListener for the SeekBars in the color dialog
       private OnSeekBarChangeListener colorSeekBarChanged = 
         new OnSeekBarChangeListener() 
       {
          //@Override
          public void onProgressChanged(SeekBar seekBar, int progress,
             boolean fromUser) 
          {
             // get the SeekBars and the colorView LinearLayout
             SeekBar redSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.redSeekBar);
             SeekBar greenSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.greenSeekBar);
             SeekBar blueSeekBar = 
                (SeekBar) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.blueSeekBar);
             ColorView currentColorView = 
                     (ColorView) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.currentColorView);
             ColorSwatchView colorSwatchView =
            		 (ColorSwatchView) currentDialog.findViewById( com.postgreen.vectorvictor.R.id.colorSwatchView );

             // display the current color
             currentColorView.setDrawingColor(Color.argb(
                255, redSeekBar.getProgress(), 
                greenSeekBar.getProgress(), blueSeekBar.getProgress()));
             currentColorView.invalidate();
             
             redSeekBar.setBackgroundColor( Color.rgb( redSeekBar.getProgress() , 0 , 0 ) );
             greenSeekBar.setBackgroundColor( Color.rgb( 0 , greenSeekBar.getProgress() , 0 ) );
             blueSeekBar.setBackgroundColor( Color.rgb( 0 , 0 , blueSeekBar.getProgress() ) );
             
             double[] vals = { redSeekBar.getProgress() / 255.0 , 
            		 greenSeekBar.getProgress() / 255.0 , blueSeekBar.getProgress() / 255.0 };
             colorSwatchView.setColorVal( vals );
             
             
             
          } // end method onProgressChanged
          
       // required method of interface OnSeekBarChangeListener
          //@Override
          public void onStartTrackingTouch(SeekBar seekBar) 
          {
          } // end method onStartTrackingTouch
          
          // required method of interface OnSeekBarChangeListener
          //@Override
          public void onStopTrackingTouch(SeekBar seekBar) 
          {
          } // end method onStopTrackingTouch
       }; // end colorSeekBarChanged


}

