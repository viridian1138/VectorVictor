



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





package geomdir.applied;


import geomdir.DrawObj;
import geomdir.GeomConstants;
import geomdir.GeomKitEtherEvent;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import meta.DataFormatException;
import meta.FlexString;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.EtherEventHandler;
import verdantium.EtherEventPropertySource;
import verdantium.ProgramDirector;
import verdantium.kluges.TwoDScrollView;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;




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
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to underlying APIs used by class.                            | Modified class to be compliant with new APIs.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 10/19/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expanded window menus for GeoFrame/GeoPad.                           | Added functionality relating to window menus.
*    | 11/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Regressions in the PrintPreview support.                             | Fixed the regressions.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
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



/* Known object common law violator */

/**
* The Algebraic Workspace display for the GeoPad kit.
* @author Thorn Green
*/
public class GeoPadAlgPanel extends View implements PropertyChangeListener , EtherEventPropertySource
	{
	final static int DefaultLineHeight = 75;
	Integer GreenIndex = Color.rgb( 0 , 128 , 0 );
	Integer AltGreyIndex = Color.rgb( 192 , 231 , 210 );
	Paint LineFont = null;
	Paint LineNumberFont = null;
	transient GeoPadModel target = null;


	public GeoPadAlgPanel( Context context , GeoPadModel tar , TwoDScrollView _jsc )
		{
		super( context );
		target = tar;
		
		jsc = _jsc;

		LineNumberFont = new Paint();
		LineNumberFont.setTextSize( 24 );
		LineNumberFont.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD,
	            Typeface.NORMAL));
		
		LineFont = new Paint();
		LineFont.setTextSize( 24 );
		LineFont.setTypeface(Typeface.create(Typeface.SERIF,
	            Typeface.ITALIC));
		
		SingleWidthStroke.setStrokeCap( Cap.SQUARE );
		SingleWidthStroke.setStrokeJoin( Join.MITER );
		SingleWidthStroke.setStrokeMiter( 1.0f );
		SingleWidthStroke.setStrokeWidth( 1.0f );
		
		AntialiasValue.setAntiAlias( true );

		target.addPropertyChangeListener( this );

//		try
//			{
//			/* Uses dynamic invocation to retain backward
//				compatibility with JDK 1.2 */
//			Object mf = JViewport.class.getField( "SIMPLE_SCROLL_MODE" )
//				.get( getViewport() );
//			Object MObj = getViewport();
//			Class MClass = MObj.getClass();
//			Class[] ParamTypes = { int.class };
//			String MName = "setScrollMode";
//			Method ExMethod = ( MClass 
//				).getMethod( MName , ParamTypes );
//			Object[] myo = { mf };
//			ExMethod.invoke( MObj , myo );
//			}
//			catch( Exception e ) 
//				{ /* No Action */ }
//
		}

/**
* Used for serial storage purposes only.  Do not use it directly.
*/
//	public GeoPadAlgPanel( )
//		{
//		enableEvents( AWTEvent.MOUSE_EVENT_MASK );
//		setHorizontalScrollBarPolicy( ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED );
//		setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED );
//		setMinimumSize( new Dimension( 2000 , 8000 ) );
//		setPreferredSize( new Dimension( 2000 , 8000 ) );
//		setViewMinimumSize( new Dimension( 0 , 0 ) );
//
//		LineNumberFont = new Font( "Dialog" , Font.PLAIN , 24 );
//		LineFont = new Font( "Serif" , Font.ITALIC , 24 );
//
//		try
//			{
//			/* Uses dynamic invocation to retain backward
//				compatibility with JDK 1.2 */
//			Object mf = JViewport.class.getField( "SIMPLE_SCROLL_MODE" )
//				.get( getViewport() );
//			Object MObj = getViewport();
//			Class MClass = MObj.getClass();
//			Class[] ParamTypes = { int.class };
//			String MName = "setScrollMode";
//			Method ExMethod = ( MClass 
//				).getMethod( MName , ParamTypes );
//			Object[] myo = { mf };
//			ExMethod.invoke( MObj , myo );
//			}
//			catch( Exception e ) 
//				{ /* No Action */ }
//
//		}



/**
* Sets the model associated with the panel.  Used for serial storage purposes only.
* Will not hold up if used for any other purpose.
*/
	public void setModel( GeoPadModel in )
		{
		if( target != null )
			{
			target.removePropertyChangeListener( this );
			target = in; 
			target.addPropertyChangeListener( this );
			}
		}

/**
* Handles the clearing of the model.
*/
	public void localClearModel( )
		{
		CurIndex = 1;
		algLines = new Vector<AlgNode>();
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		jsc.scrollTo(0, 0);
		synchronizeRendering();
		}


/**
* Paints the panel.
*/
	@Override
	   protected void onDraw(Canvas g)
		{
		calcVisibleRect( g );
		Paint p = new Paint();
		p.setAntiAlias( getAntialiasValue().isAntiAlias() );
		Rect MyRect = retVisibleRect();

		p.setColor(getBackgroundColor());
		g.drawColor( getBackgroundColor() );
		
		if( handlingPinch && coords )
		{
			try
			{
				p.setColor( Color.RED );
				p.setStyle( Style.FILL_AND_STROKE );
				p.setStrokeWidth( 5 );
			    g.drawLine( currentPinchEvent.getX(0) , currentPinchEvent.getY(0) , 
			    		currentPinchEvent.getX(1) , currentPinchEvent.getY(1), p);
			}
			catch( Throwable ex )
			{
				ex.printStackTrace( System.out );
			}
		}
		
    		p.setStyle( Style.STROKE );

    		p.setTextSize( LineNumberFont.getTextSize() );
			p.setTypeface( LineNumberFont.getTypeface() );
		FontMetrics fm = p.getFontMetrics();
		int StIndex = updateCacheStartIndex( MyRect.top ) - 1;
		int EndIndex = updateCacheEndIndex( MyRect.bottom ) - 1;
		int sz = algLines.size();
		int count;

		if( StIndex < 0 ) StIndex = 0; /* Kluge */

		p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
		p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
		p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
		p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
		p.setColor( Color.CYAN );
		int ln_strt = (int)( getAlgLineStart( CurIndex ) );
		int ln_height = (int)( getAlgLineHeight( CurIndex ) );
		//g.draw3DRect( MyRect.x + 2 , ln_strt + 2 , 
		//	MyRect.width - 4 , ln_height - 4 , false );
		//g.draw3DRect( MyRect.x + 3 , ln_strt + 3 , 
		//	MyRect.width - 6 , ln_height - 6 , false );
		g.drawRect( MyRect.left + 2 , ln_strt + 2 , 
				MyRect.right - 2 , ln_strt + ln_height - 2 , p );
		g.drawRect( MyRect.left + 3 , ln_strt + 3 , 
				MyRect.right - 3 , ln_strt + ln_height - 3 , p );


		for( count = StIndex ; count <= EndIndex ; count++ )
			{
			int index = count + 1;
			ln_strt = (int)( getAlgLineStart( index ) );
			ln_height = (int)( getAlgLineHeight( index ) );
			int YStart = ln_strt;
			String NumStr = ( new Integer( index ) ).toString();
			String Prompt = NumStr + " > ";

//	!!!!		g.clipRect( MyRect.left, MyRect.top, MyRect.right, MyRect.bottom, Region.Op.REPLACE );
//	!!!!		g.clipRect( MyRect.left, ln_strt, MyRect.right, ln_strt + ln_height, Region.Op.INTERSECT );

			p.setColor( Color.BLUE );
			p.setTextSize( LineNumberFont.getTextSize() );
			p.setTypeface( LineNumberFont.getTypeface() );
			p.setStyle( Style.FILL );
			g.drawText( Prompt , fm.descent , YStart - fm.ascent , p );
			p.setStyle( Style.STROKE );

			if( index < sz )
				{
				double xp = fm.descent + p.measureText( Prompt );
				AlgNode MyNode = algLines.elementAt( index );
				MathImage MyIm = MyNode.getMathImage();
				p.setColor( GreenIndex );
				p.setTextSize( LineFont.getTextSize() );
				p.setTypeface( LineFont.getTypeface() );
				MyIm.paintMath( g , xp , YStart + 7 );
				}

			} 


		}
	
	
	
	protected boolean handlingPinch = false;
	protected boolean coords = false;
    protected double ix0;
    protected double ix1;
    protected double iy0;
    protected double iy1;
    protected MotionEvent currentPinchEvent = null;
	

/**
* Handles mouse events.
*/
	@Override
    public boolean onTouchEvent(MotionEvent e) {
		
		System.out.println( e.getAction() );

        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
            	    handlingPinch = false;
            		mouserDown(e, e.getX(), e.getY());
                break;
            case MotionEvent.ACTION_UP:
            	{
            		boolean tmp = handlingPinch;
            		handlingPinch = false;
            		if( tmp )
            		{
            			handlePinchEnd();
            		}
            	}
            	break;
            case MotionEvent.ACTION_POINTER_DOWN:
            case MotionEvent.ACTION_POINTER_2_DOWN:
            	handlingPinch = true;
            	coords = false;
            	currentPinchEvent = e;
            	getParent().requestDisallowInterceptTouchEvent(true);
            	invalidate();
                break;
            case MotionEvent.ACTION_CANCEL:
            	if( handlingPinch )
            	{
            		handlingPinch = false;
            		handlePinchEnd();
            	}
            	break;
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_POINTER_2_UP:
            	handlingPinch = false;
            	handlePinchEnd();
                break;
            case MotionEvent.ACTION_MOVE:
            {
            	if( handlingPinch )
            	{
            		if( !coords )
            		{
            			coords = true;
            			ix0 = e.getX( 0 );
            			ix1 = e.getX( 1 );
            			iy0 = e.getY( 0 );
            			iy1 = e.getY( 1 );
            		}
            		currentPinchEvent = e;
            		getParent().requestDisallowInterceptTouchEvent(true);
            		invalidate();
            	}
            }       
                break;
            default:
            	break;
        }
        return true;
    }
	
	
	protected void handlePinchEnd()
	{
		try
		{
			getParent().requestDisallowInterceptTouchEvent(true);
			int LineNum = findIndexAt( iy0 );
			if( ( LineNum >= 0 ) && ( LineNum <= CurIndex ) )
			{
				double lnHeight = getAlgLineHeight( LineNum );
				double d0 = Math.abs( iy1 - iy0 );
				double d1 = Math.abs( currentPinchEvent.getY( 1 ) - currentPinchEvent.getY( 0 ) );
				System.out.println( "App" );
				System.out.println( lnHeight );
				System.out.println( d0 );
				System.out.println( d1 );
				double delta = d1 - d0;
				double newFactor = ( lnHeight + delta ) / DefaultLineHeight;
				newFactor = Math.max( newFactor , 1.0 );
				Object[] arg = { new Integer( LineNum ) , new Double( newFactor ) , Boolean.TRUE , Boolean.TRUE };
				EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.changeLineHeight ,
						arg , target );
				ProgramDirector.fireEtherEvent( send , null );
				
			}
		}
		catch( Throwable ex )
			{ handleThrow( ex ); }
	}


/**
* Handles mouse-down events.
*/
	public final boolean mouserDown(MotionEvent e, float x, float y)
		{
		try
			{
			int LineNum = findIndexAt( y );
			if( ( LineNum >= 0 ) && ( LineNum < CurIndex ) )
				{
				EtherEventHandler hndl = (EtherEventHandler)( target /* !!!! InAp.getTopObj() */ );
				EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.algPanelSelect ,
					null , hndl );
				send.setParameter( new Integer( LineNum ) );
				ProgramDirector.fireEtherEvent( send , null );
				}
			}
		catch( Throwable ex )
			{ handleThrow( ex ); }
		return( true );
		}


/**
* Gets the depictor at a certain line of the algebra panel.
*/
public DrawObj getAlgPanelDepic( int LineNum )
	{
	DrawObj dpc = null;

	if( ( LineNum >= 0 ) && ( LineNum < CurIndex ) )
		{
		AlgNode MyNode = algLines.elementAt( LineNum );
		dpc = MyNode.getAlgDepics();
		/* FlexString MyStr = img.getStr(); */
		}

	return( dpc );
	}


/**
* Increments the current line in a way consistent with the script display mode.
*/
	public void applyScriptModeIncr( ) throws MathImageParseException
		{
		CurIndex++;

		AlgNode MyNode = algLines.elementAt( CurIndex - 1 );
		MathImage img = MyNode.getMathImage();
		DrawObj dpc = MyNode.getAlgDepics();
		double lnh = MyNode.getLineHeightFactor();
		FlexString PrevString = (FlexString)( img.getStr() );
		
		setCurrentPromptLine( PrevString , dpc , lnh );
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();

		jsc.addLayoutRunnable( new Runnable() {
				public void run()
				{
					scrollToCurrentLine();
				}
			} );
		
		}

/**
* Sets the current line.
*/
	public void setCurrentPromptLine( FlexString InLine , DrawObj InObj , double LineHeightFactor )
		throws MathImageParseException
		{
	    Integer MyC = GreenIndex;

		if( InObj != null )
			MyC = InObj.getTextColor();

		if( ( CurIndex + 1 ) > algLines.size() ) 
			{
			algLines.setSize( CurIndex + 1 );
			algLines.setElementAt( new AlgNode( ) , CurIndex );
			}

		AlgNode MyNode = algLines.elementAt( CurIndex );
		Paint p = new Paint( LineFont );
		p.setAntiAlias( getAntialiasValue().isAntiAlias() );
		MathImage img = new MathImage( InLine , 
			MyC , p );

		MyNode.setMathImage( img );
		MyNode.setAlgDepics( InObj );
		if( LineHeightFactor > 0.0 ) 
			{
			double tmp = MyNode.getLineHeightFactor();
			MyNode.setLineHeightFactor( LineHeightFactor , false );
			if( tmp != LineHeightFactor ) { synchronizeRendering(); jsc.addLayoutRunnable( new Runnable() {
				public void run()
				{
					scrollToCurrentLine();
				}
			} ); }
			}

		algLines.setElementAt( MyNode , CurIndex );
		updateLineHeight( CurIndex );
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		}


/**
* Sets the current line.
*/
	public void setCurrentPromptLine( FlexString InLine , DrawObj InObj )
		throws MathImageParseException
		{ setCurrentPromptLine( InLine , InObj , -1.0 ); }


/**
* Scrolls to the current line.
*/
	protected void scrollToCurrentLine( )
		{
		int ln_strt = (int)( getAlgLineStart( CurIndex ) );
		int ln_height = (int)( getAlgLineHeight( CurIndex ) );
		if( TmpVisRect != null )
			{
				int adel = Math.abs( TmpVisRect.bottom - TmpVisRect.top );
				this.jsc.scrollTo( 0 , Math.max( 0 , ln_strt + ln_height - adel ) );
			}
			else
			{
				this.jsc.scrollTo( 0 , ln_strt );
			}
		}


/**
* Increments the current line.
*/
	public void incrementCurrentLine( )
		{
		CurIndex++;
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		jsc.addLayoutRunnable( new Runnable() {
			public void run()
			{
				scrollToCurrentLine();
			}
		} );
		
		}


/**
* Alerts other components (particularly the scroll bars) to the fact that the
* dimensions of the component being scrolled have changed.
*/
	public void synchronizeRendering( )
		{
//		revalidate();
//		Component p = getParent();
//		( (JComponent) p ).revalidate();
//		p = p.getParent();
//		( (JComponent) p ).revalidate();
//		p.postInvalidate();
		}


/**
* Gets the unit increment for the scroll bars.
*/
//	public int getScrollableUnitIncrement(Rectangle visibleRect,
//                                                int orientation,
//                                                int direction)
//	{
//	if( orientation == SwingConstants.VERTICAL )
//		{
//		return( DefaultLineHeight );
//		}
//		else
//		{
//		return( 5 );
//		}
//	}


/**
* Returns whether the line indicated in the parameter contains a valid node.
*/
	public boolean chkValidLine( int idex )
		{
		boolean ret = false;
		int sz = algLines.size();
		if( idex < sz )
			{
			AlgNode MyNode = algLines.elementAt( idex );
			ret = MyNode != null;
			}

		return( ret );
		}


/**
* Changes the height of a line.
*/
	protected void chgLineHeight( int idex , double LineHeightFactor , boolean locked )
		{
		int sz = algLines.size();

		if( idex < sz )
			{
			AlgNode MyNode = algLines.elementAt( idex );
			MyNode.setLineHeightFactor( LineHeightFactor , locked );
			updateLineHeight( idex );
			
			TmpVisRect = null;
			requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			invalidate();
			
			synchronizeRendering();
			invalidate(); // postInvalidate();
			}

		}


/**
* Changes the height of a line.
*/
	protected void chgLineHeight( int idex , double LineHeightFactor )
		{ chgLineHeight( idex , LineHeightFactor , true ); }


/**
* Changes the height of the current line.
*/
	public void chgCurrentLineHeight( double factor )
		{ chgLineHeight( CurIndex , factor , false ); }


/**
* Updates the height, start, and end of all lines from
* the input index to the end.
*/
	protected void updateLineHeight( int idex )
		{
		int count;
		double start = 0;
		int sz = algLines.size();

		if( sz > 0 )
			{
			if( idex > 1 )
				{
				AlgNode MyNode = algLines.elementAt( idex - 1 );
				start = MyNode.getLineEnd();
				}

			for( count = idex ; count < sz ; ++count )
				{
				AlgNode MyNode = algLines.elementAt( count );
				MyNode.setLineStart( start );
				start = MyNode.getLineEnd();
				}
			}
		}


/**
* Gets the height of a line.
*/
	protected double getAlgLineHeight( int idex )
		{
		double ret = DefaultLineHeight;
		int sz = algLines.size();
		if( idex < sz )
			{
			AlgNode MyNode = algLines.elementAt( idex );
			if( MyNode != null ) ret = MyNode.getLineHeight();
			}

		return( ret );
		}


/**
* Gets the starting location of a line.
*/
	protected double getAlgLineStart( int idex )
		{
		int sz = algLines.size();
		int chkidex = idex;
		double ret = 0;

		if( idex >= sz )
			{
			if( sz > 0 )
				{
				AlgNode MyNode = algLines.elementAt( sz - 1 );
				if( MyNode != null ) ret = MyNode.getLineEnd();
				ret = ret + DefaultLineHeight * ( idex - sz );
				}
				else
				{
				ret = ret + DefaultLineHeight * ( idex - 1 );
				}
			}
			else
			{
			AlgNode MyNode = algLines.elementAt( idex );
			if( MyNode != null ) ret = MyNode.getLineStart();
			}

		return( ret );
		}


/**
* Updates the starting index in the cache.
*/
	protected int updateCacheStartIndex( double StartPt )
		{
		if( StartPt < 1 ) CacheStartIndex = 1;
			else
			{
			boolean Done = false;
		
			while( !Done )
				{
				double strt = getAlgLineStart( CacheStartIndex );
				double end = strt + getAlgLineHeight( CacheStartIndex );
				if( ( StartPt >= strt ) && ( StartPt < end ) )
					Done = true;
					else
					{
					if( StartPt >= end )
						CacheStartIndex++;
						else CacheStartIndex--;
					}
				}
			}

		return( CacheStartIndex );
		}


/**
* Updates the ending index in the cache.
*/
	protected int updateCacheEndIndex( double EndPt )
		{
		if( EndPt < 1 ) CacheEndIndex = 1;
			else
			{
			boolean Done = false;
		
			while( !Done )
				{
				double strt = getAlgLineStart( CacheEndIndex );
				double end = strt + getAlgLineHeight( CacheEndIndex );
				if( ( EndPt >= strt ) && ( EndPt < end ) )
					Done = true;
					else
					{
					if( EndPt >= end )
						CacheEndIndex++;
						else CacheEndIndex--;
					}
				}
			}

		return( CacheEndIndex );
		}


/**
* Finds an line index given a pixel location.
*/
	protected int findIndexAt( double InPt )
		{
		int TempIndex = CacheEndIndex;
		if( InPt < 1 ) TempIndex = 1;
			else
			{
			boolean Done = false;
		
			while( !Done )
				{
				double strt = getAlgLineStart( TempIndex );
				double end = strt + getAlgLineHeight( TempIndex );
				if( ( InPt >= strt ) && ( InPt < end ) )
					Done = true;
					else
					{
					if( InPt >= end )
						TempIndex++;
						else TempIndex--;
					}
				}
			}

		return( TempIndex );
		}


	public void propertyChange( PropertyChangeEvent evt )
		{
		if( evt.getPropertyName() == GeomConstants.ChangedRenderingConstants )
			{
			handleRenderingChange();
			}
		}


	protected void handleRenderingChange( )
		{
		try
			{
			int size = algLines.size();
			int count;

			for( count = 0 ; count < size ; ++count )
				{
				Paint p = new Paint( LineFont );
				p.setAntiAlias( getAntialiasValue().isAntiAlias() );
				AlgNode MyNode = algLines.elementAt( count );
				if( MyNode != null )
					{
					MathImage MyImage = MyNode.getMathImage();
					if( MyImage != null )
						{
						FlexString InLine = MyImage.getStr();
						
						MathImage img = new MathImage( InLine , 
							GreenIndex , p );
						MyNode.setMathImage( img );
						}
					}
				}
			}
		catch( Exception ex ) { throw( new WrapRuntimeException( ex ) ); }
		}


	protected int getNumPages( double imageHeight )
		{
		double pageMark = 0.0;
		int pageNum = 1;

		int size = algLines.size();
		int count;

		for( count = 0 ; count < size ; ++count )
			{
			int idex = count + 1;
			updateLineHeight( idex );
			double componentHeight = getAlgLineHeight( idex );

			if( ( pageMark + componentHeight ) > imageHeight )
				{
				pageNum++;
				pageMark = componentHeight;

				if( pageMark > imageHeight )
					{
					while( pageMark > imageHeight )
						{
						pageNum++;
						pageMark = pageMark - imageHeight;
						}

					pageNum++;
					pageMark = 0.0;
					}
				}
				else
				{
				pageMark += componentHeight;
				}
			}

		return( pageNum );
		}


/*	protected void handleLinePrint( Canvas g , int count , int pageIndex ,
		int pageNum , double topMark , double pageMark )

		{ */
		/* System.out.println( "handleLinePrint" );
		System.out.println( count );
		System.out.println( pageIndex );
		System.out.println( pageNum );
		System.out.println( topMark );
		System.out.println( pageMark ); */
		/* Shape cur_clip = g.getClip();
		g.setFont( LineNumberFont );
		FontMetrics fm = g.getFontMetrics();

		if( ( pageIndex + 1 ) == pageNum )
			{
			int index = count;
			int ln_strt = (int)( getAlgLineStart( index ) );
			int ln_height = (int)( getAlgLineHeight( index ) );

			double delta = topMark - ln_strt;
			AffineTransform CoordTrans = new AffineTransform();
			CoordTrans.setToTranslation( 0.0 , delta );
			AffineTransform trans = g.getTransform();
			trans.concatenate( CoordTrans );
			g.setTransform( trans );

			int YStart = ln_strt;
			String NumStr = ( new Integer( index ) ).toString();
			String Prompt = NumStr + " > ";

			g.clipRect( -30000 , ln_strt , 60000 , (int)( pageMark - topMark ) );

			g.setColor( Color.BLUE );
			g.setFont( LineNumberFont );
			g.drawString( Prompt , fm.getMaxDescent() , YStart + fm.getMaxAscent() );

			if( true )
				{
				int xp = fm.getMaxDescent() + fm.stringWidth( Prompt );
				AlgNode MyNode = algLines.elementAt( index );
				MathImage MyIm = MyNode.getMathImage();
				g.setColor( GreenIndex );
				g.setFont( LineFont );
				MyIm.paintMath( g , xp , YStart + 7 );
				}
			}

		g.setClip( cur_clip );
		} */


	/* protected void printContent(Canvas gi, PageFormat pf, int pageIndex)
                                   throws PrinterException
		{
		Canvas g = (Canvas) gi;

		double imageHeight = pf.getImageableHeight();
		AffineTransform trans = g.getTransform();

		double topMark = 0.0;
		double pageMark = 0.0;
		int pageNum = 1;

		int size = algLines.size();
		int count;

		for( count = 1 ; count < size ; ++count )
			{
			int idex = count;
			updateLineHeight( idex );
			double componentHeight = getAlgLineHeight( idex );

			if( ( pageMark + componentHeight ) > imageHeight )
				{
				pageNum++;
				topMark = 0.0;
				pageMark = componentHeight;
				g.setTransform( trans );
				handleLinePrint( g , count , pageIndex , pageNum , 
					topMark , pageMark );

				if( pageMark > imageHeight )
					{
					while( pageMark > imageHeight )
						{
						pageNum++;
						topMark = topMark - imageHeight;
						pageMark = pageMark - imageHeight;
						g.setTransform( trans );
						handleLinePrint( g , count , pageIndex , pageNum , 
							topMark , pageMark );
						}

					pageNum++;
					topMark = 0.0;
					pageMark = 0.0;
					}
				}
				else
				{
				topMark = pageMark;
				pageMark += componentHeight;
				g.setTransform( trans );
				handleLinePrint( g , count , pageIndex , pageNum , 
					topMark , pageMark );
				}
			}

		} */


/**
* Prints the contents of the panel.
*/
	/* public int print(Canvas gi, PageFormat pf, int pageIndex)
                                   throws PrinterException
		{
		double height = pf.getImageableHeight();
		if( pageIndex >= getNumPages( height ) )
			return( Printable.NO_SUCH_PAGE );

		Canvas g = (Canvas) gi;
		RepaintManager.currentManager( this ).setDoubleBufferingEnabled( false ); 
		g.setColor( getBackground() );
		Rectangle2D.Double rect = new Rectangle2D.Double(
			pf.getImageableX() , pf.getImageableY(),
			pf.getImageableWidth(), pf.getImageableHeight() );
		g.fill( rect );
		AffineTransform trans2 = g.getTransform();
		AffineTransform CoordTrans = new AffineTransform();
		CoordTrans.setToTranslation( pf.getImageableX() , pf.getImageableY() );
		AffineTransform trans = g.getTransform();
		trans.concatenate( CoordTrans );
		g.setTransform( trans );		
		printContent( gi , pf , pageIndex );
		g.setTransform( trans2 );
		RepaintManager.currentManager( this ).setDoubleBufferingEnabled( true );
		return( Printable.PAGE_EXISTS );
		} */


	/* public void handleBookPrinting( ) throws PrinterException
		{
		PrinterJob job = PrinterJob.getPrinterJob();
        	PageFormat pf1 = target.getDocPageFormat();
		if( pf1 == null ) pf1 = job.defaultPage();
		pf1 = job.validatePage( pf1 );
		Book bk = new Book();

		double height = pf1.getImageableHeight();
		double width = pf1.getImageableWidth();

		int numPages = getNumPages( height );

		bk.append( this , pf1 , numPages );
		job.setPageable( bk );
		if( job.printDialog() )
			{
			try{ job.print(); }
				catch( PrinterException ex ) { throw( ex ); }
			}

		target.setDocPageFormat( pf1 );
		} */


/**
* Interface to handle print preview requests.
*/
	/* public void handlePrintPreview( )
		{
		PrinterJob job = PrinterJob.getPrinterJob();
        	PageFormat pf1 = target.getDocPageFormat();
		if( pf1 == null ) pf1 = job.defaultPage();
		pf1 = job.validatePage( pf1 );
		Book bk = new Book();

		double height = pf1.getImageableHeight();
		double width = pf1.getImageableWidth();

		int numPages = getNumPages( height );

		bk.append( this , pf1 , numPages );
		
		PrintPreviewPropertyEditor prev = new PrintPreviewPropertyEditor( bk , this );
		ProgramDirector.showPropertyEditor( prev , null ,
			"Print Preview Property Editor" );

		target.setDocPageFormat( pf1 );
		} */


/**
* Sets the background color.
*/
protected void setBkgnd( Integer inCol )
	{
	BkgndColor = inCol;
	invalidate(); // postInvalidate();
	}


/**
* Handles Ether Events.
*/
public Object processObjEtherEvent( EtherEvent in , Object refcon )
		{
		boolean handled = false;

		if( in instanceof GeomKitEtherEvent )
			{
			if( in.getEtherID().equals( GeomKitEtherEvent.setBkgnd ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				Integer s1 = (Integer)( params[ 0 ] );
				setBkgnd( s1 );
				handled = true;
				}
			}

		return( null );
		}



	static final long serialVersionUID = ( GeoPadAlgPanel.class ).getName().hashCode()
		+ "v3/98A".hashCode();

/**
* Reads persistent data.
*/
	public void readExternal(ObjectInput in) 
		throws IOException, ClassNotFoundException
		{
		try
			{
			/* VersionBuffer myv = (VersionBuffer)( in.readObject() );
			VersionBuffer.chkNul( myv );

			CurIndex = myv.getInt( "CurIndex" );
			algLines = (Vector<AlgNode>)( myv.getProperty( "algLines" ) );
			VersionBuffer.chkNul( algLines );
			Integer tmpcol = (Integer)( myv.getProperty( "BkgndColor" ) );
			VersionBuffer.chkNul( tmpcol );
			setBackground( tmpcol );
			updateLineHeight( 1 );

			myv.flush(); */
			}
		catch( ClassCastException e ) { throw( new DataFormatException( e ) ); }
		}

/**
* Writes persistent data.
* @serialData TBD.
*/
	public void writeExternal(ObjectOutput out) 
		throws IOException
		{
		/* VersionBuffer myv = new VersionBuffer( VersionBuffer.write );

		myv.setInt( "CurIndex" ,  CurIndex );
		myv.setProperty( "algLines" , algLines );
		myv.setProperty( "BkgndColor" , getBackground() );

		out.writeObject( myv ); */
		}

	/* private void writeObject(java.io.ObjectOutputStream out)
     		throws IOException {}

 	private void readObject(java.io.ObjectInputStream in)
     		throws IOException, ClassNotFoundException {} */


	
	@Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(measureWidth(widthMeasureSpec),
                measureHeight(heightMeasureSpec));
    }

    /**
     * Determines the width of this view
     * @param measureSpec A measureSpec packed into an int
     * @return The width of the view, honoring constraints from measureSpec
     */
    protected int measureWidth(int measureSpec) {
        int result = 0;
        //This is because of background image in relativeLayout, which is 4000*4000px
        measureSpec = 2001;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if (specMode == MeasureSpec.UNSPECIFIED) {
            // We were told how big to be
            result = specSize;
        }

        return result;
    }

    /**
     * Determines the height of this view
     * @param measureSpec A measureSpec packed into an int
     * @return The height of the view, honoring constraints from measureSpec
     */
   protected int measureHeight(int measureSpec) {
        int result = 0;
        //This is because of background image in relativeLayout, which is 4000*4000px 
        double strt = getAlgLineStart( CurIndex );
		double hei = getAlgLineHeight( CurIndex ); // !!!!!!!!!!!!!!!!!!!!!!!!!!! *10 !!!!!!!!!!!!!!!!!!!!!!!!
		int max = (int)( strt + hei );
        measureSpec = max + 1;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);


        if (specMode == MeasureSpec.UNSPECIFIED) {
            // Here we say how Heigh to be
            result = specSize;
        } 
        return result;
    }


	/**
	* Gets the antialias object.
	*/
	public final Paint getAntialiasValue() {
		return (AntialiasValue);
	}
	/**
	* Sets the antialias object.
	*/
	public void setAntialiasValue(Paint in) throws MathImageParseException {
		AntialiasValue = in;
		invalidate(); // postInvalidate();
	}
	
/**
* Gets the rendering quality value.
*/
//	public final Object getRenderValue()
//		{ return( RenderValue ); }
/**
* Sets the rendering quality value.
*/
//	public void setRenderValue( Object in )
//		{ RenderValue = in; postInvalidate(); }

	
	   
	protected void calcVisibleRect( Canvas cn )
	{
		TmpVisRect = cn.getClipBounds(); 
	}

	/**
	* Gets the visible rect. in a way that wastes less computational time than getVisibleRect().
	*/
	protected Rect retVisibleRect() {
		//if (TmpVisRect != null)
		//	return (TmpVisRect);
		//else
		//{
		//	Rect rct = new Rect();
		//	getHitRect( rct );
		//	return( rct );
		//}
		if( TmpVisRect != null )
		   {
			   return( TmpVisRect );
		   }
			Rect rct = new Rect(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			rct.left = 0;
			rct.top = 0;
			rct.right = 600;
			rct.bottom = 300;
			return( rct );
	}


/**
* Adds a property change listener.
*/
	public void addPropertyChangeListener( PropertyChangeListener in )
		{
		if( PropL == null ) PropL = new PropertyChangeSupport( this ); 
		PropL.addPropertyChangeListener( in );
		target.addPropertyChangeListener( in );
		}

/**
* Removes a property change listener.
*/
	public void removePropertyChangeListener( PropertyChangeListener in )
		{
		if( PropL == null ) PropL = new PropertyChangeSupport( this ); 
		PropL.removePropertyChangeListener( in );
		target.removePropertyChangeListener( in );
		}

/**
* Fires a property change.
*/
	protected void firePropertyChange( String name , Object old_obj , Object new_obj )
		{
		if( PropL == null ) PropL = new PropertyChangeSupport( this );  
		PropL.firePropertyChange( name , old_obj , new_obj );
		}

/**
* Gets a basic single-width stroke.
*/
	public Paint getSingleWidthStroke( )
		{ return( SingleWidthStroke ); }
	
	/**
	* Gets the background color of the view.
	*/
	public Integer getBackgroundColor() {
		return ( BkgndColor );
	}

/*	public ObjectPC tlGetPC( )
		{ return( tlobj ); }

	public void tlSetPC( ObjectPC in )
		{ tlobj = in; } */

/**
* Handles the throwing of an error or exception.
*/
	public void handleThrow( Throwable in )
		{
		/* !!!!!!!!!!!!!!!!!!!!!!! Fire The Property Change !!!!!!!!!!!!!!!!!!!!!!!!!! */
		Log.e("tag", "msg", in);
//		VerdantiumPropertiesEditor prop = 
//			VerdantiumUtils.handleThrow( in , null , this );
//		target.addWindowRecord( prop , GeomConstants.DialogWindow );
		}
	
	public View getView()
	{
		return( jsc );
	}
	
	@Override
	public void postInvalidate()
	{
		jsc.postInvalidate();
	}
	
	@Override
	public void invalidate()
	{
		jsc.invalidate();
	}
	
	
/**
* Basic single-width stroke.
*/
	private static final Paint SingleWidthStroke = new Paint();

	private Rect TmpVisRect = null;
	private int TmpVisRectDirty = 0;


	transient private Paint AntialiasValue = new Paint();

	transient private int CurIndex = 1;
	transient private Vector<AlgNode> algLines = new Vector<AlgNode>();
	transient private int CacheStartIndex = 1;
	transient private int CacheEndIndex = 1;
	transient protected PropertyChangeSupport PropL = null;
	
	protected Integer BkgndColor = AltGreyIndex;
	
	transient protected TwoDScrollView jsc;
	
	
	
	}



