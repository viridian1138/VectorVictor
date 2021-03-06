




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




package verdantium.mathimage;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;

import com.postgreen.vectorvictor.R;

public class MathImageTextEdit extends MathImagePopup /* DBN */ {
	
	boolean stateCleared = false;
	
	final Timer timer = new Timer();
	
	protected IKeyListener mathKeyListener = null;
	

	public MathImageTextEdit(Context context) {
		super(context);
	}

	public MathImageTextEdit(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public MathImageTextEdit(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
	}
	
	@Override
	public void onMeasure( int x , int y )
	{
		setMeasuredDimension(
				getContext().getResources().getDimensionPixelSize( R.dimen.mathimage_textedit_horiz_size ),
				getContext().getResources().getDimensionPixelSize( R.dimen.mathimage_textedit_vert_size ) );
	}
	
	
	@Override
	protected void onDraw(Canvas g)  {
		super.onDraw( g );
		
		try
		{
			
			if( !stateCleared )
			{
				final TimerTask task = new TimerTask()
				{
					@Override
					public void run()
					{
						handleTimerEvent();
					}
				};
				timer.schedule( task , 500 );
				stateCleared = true;
			}
		}
		catch( Throwable ex )
		{
			Log.e("tag", "msg", ex);
		}
		
	}
	
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent e)
 	{
		if( mathKeyListener != null )
		{
			return( mathKeyListener.onKeyDown(keyCode, e) );
		}
		return( false );
 	}
	
	
	protected void handleTimerEvent()
	{
		this.post( new Runnable()
		{
			public void run()
			{
				try
				{
					setDrawCursor( !( getDrawCursor() ) );
					stateCleared = false;
					invalidate();
				}
				catch( Throwable ex )
				{
					Log.e("tag", "msg", ex);
				} 
			}
		} );
	}
	
	
	protected void setDrawCursor( boolean in )
	{
		img.setDrawCursor( in );
	}
	
	protected boolean getDrawCursor( )
	{
		return( img.getDrawCursor() );
	}

	/**
	 * @return the mathKeyListener
	 */
	public IKeyListener getMathKeyListener() {
		return mathKeyListener;
	}

	/**
	 * @param mathKeyListener the mathKeyListener to set
	 */
	public void setMathKeyListener(IKeyListener mathKeyListener) {
		this.mathKeyListener = mathKeyListener;
	}


	

}

