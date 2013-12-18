




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

import geomdir.CoordContext;
import geomdir.DGMNode;
import geomdir.DrawObj;
import geomdir.GeomKit;
import geomdir.Hexar;
import geomdir.Ktool;
import geomdir.Mvec;
import geomdir.depictors.Angle1;
import geomdir.depictors.Angle2;
import geomdir.depictors.Dsca1;
import geomdir.depictors.Para1;
import geomdir.depictors.Ssca1;
import geomdir.depictors.Vect1;
import geomdir.depictors.Vect2;
import geomdir.engine.EngineConstants;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.EtherEventHandler;
import verdantium.ProgramDirector;
import verdantium.kluges.TwoDScrollView;
import verdantium.utils.IllegalInputException;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.graphics.Paint.FontMetrics;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Region;
import android.renderscript.Font;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;




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
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to underlying APIs used by class.                            | Modified class to be compliant with new APIs.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Regressions in the PrintPreview support.                             | Fixed the regressions.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Migrated code from OrderedList to JCF.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 01/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | The experimental code for multiple graph. contexts no longer useful. | Removed the old experimental code.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/29/2002            | Thorn Green (viridian_1138@yahoo.com)           | Create Multi-Window Graphing (GeoCard).                              | Created Multi-Window Graphing.
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
* Displays the geometric workspace of the GeoPad project.
* @author Thorn Green
*/
public class GeoPadGeomPanel extends GeoPadKit implements EtherEventHandler
	{
	final static int DefaultLineHeight = 75;
	final static int LineWidth = 2000;
	Integer GreenIndex = Color.rgb( 0 , 128 , 0 );
	Integer GreyIndex = Color.rgb( 192 , 224 , 224 );
	Paint LineFont = null;
	Paint LineNumberFont = null;


	public GeoPadGeomPanel( GeoPadKit in , TwoDScrollView _jsc )

	{
	super( in , _jsc );
	BoundMode = false;
	
	LineNumberFont = new Paint();
	LineNumberFont.setTextSize( 24 );
	LineNumberFont.setTypeface(Typeface.create(Typeface.DEFAULT_BOLD,
            Typeface.NORMAL));
	
	LineFont = new Paint();
	LineFont.setTextSize( 24 );
	LineFont.setTypeface(Typeface.create(Typeface.SERIF,
            Typeface.ITALIC));

	XOrigin.value = 0;
	YOrigin.value = 0;
	
//	jsc.scrollTo( LineWidth / 2 , 0 );
	
	
//	try
//		{
//		/* Uses dynamic invocation to retain backward
//			compatibility with JDK 1.2 */
//		Object mf = JViewport.class.getField( "SIMPLE_SCROLL_MODE" )
//			.get( getViewport() );
//		Object MObj = getViewport();
//		Class MClass = MObj.getClass();
//		Class[] ParamTypes = { int.class };
//		String MName = "setScrollMode";
//		Method ExMethod = ( MClass 
//			).getMethod( MName , ParamTypes );
//		Object[] myo = { mf };
//		ExMethod.invoke( MObj , myo );
//		}
//		catch( Exception e ) 
//			{ /* No Action */ }
	}

/**
* Used for serial-storage purposes only.  Do not use directly.
*/
	public GeoPadGeomPanel( GeoPadGeomPanel in , TwoDScrollView _jsc )
		{
		super( in , _jsc );
		/* For deserialization purposes only. */
		}

/**
* Used for serial-storage purposes only.  Do not use directly.
*/
//	public GeoPadGeomPanel( )
//		{
//		super( null );
//		BoundMode = false;
//
//		setMinimumSize( new Dimension( LineWidth , 8000 ) );
//		setPreferredSize( new Dimension( LineWidth , 8000 ) );
//		getGUI().setMinimumSize( new Dimension( 0 , 0 ) );
//
//		LineNumberFont = new Font( "Dialog" , Font.PLAIN , 24 );
//		LineFont = new Font( "Serif" , Font.ITALIC , 24 );
//
//		XOrigin.value = 0;
//		YOrigin.value = 0;
//
//		getViewport().setViewPosition( new Point( LineWidth / 2 , 0 ) );
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
//		/* For deserialization purposes only. */
//		}

/**
* Handles the clearing of the current model.
*/
	public void localClearModel( )
		{
		super.localClearModel();

		TempList.erasePtrVal();
		CurClickLine = 1;
		DragLine = 1;
		CurIndex = 1;
		GeomNodes = new Vector();

		XOrigin.value = 0;
		YOrigin.value = 0;
		
//		jsc.scrollTo( LineWidth / 2 , 0 );
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();

		synchronizeRendering();
		}


/**
* Draws the workspace.
*/
	@Override
	public void draw( Canvas g , Paint p, HighLevelList DispList )
		{
		calcVisibleRect( g );
		p.setStyle( Style.FILL );
		// p.setColor( Color.CYAN );
		// g.drawRect( -100.0f , -100.0f , 100.0f , 100.0f, p );
		
		
		p.setStyle( Style.STROKE );
		Rect VRect = retVisibleRect(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// VRect.left = 0; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		// VRect.right = 2000; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		hgr1 = /* g.create(); */ g;
		/* hgr1.setXORMode( Color.white ); */

		p.setTextSize( LineNumberFont.getTextSize() );
		p.setTypeface( LineNumberFont.getTypeface() );
		FontMetrics fm = p.getFontMetrics();
		int StIndex = updateCacheStartIndex( VRect.top ) - 1;
		int EndIndex = updateCacheEndIndex( VRect.bottom ) - 1;
		int sz = GeomNodes.size();
		int count;

		if( StIndex < 0 ) StIndex = 0;  /* Kluge */

		p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
		p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
		p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
		p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
		
		p.setColor( Color.CYAN );
		int ln_strt = (int)( getGeomLineStart( CurIndex ) );
		int ln_height = (int)( getGeomLineHeight( CurIndex ) );
		//g.draw3DRect( VRect.x + 2 , ln_strt + 2 , 
		//	VRect.width - 4 , ln_height - 4 , false );
		//g.draw3DRect( VRect.x + 3 , ln_strt + 3 , 
		//	VRect.width - 6 , ln_height - 6 , false );
		
		g.drawRect( VRect.left + 2 , ln_strt + 2 , 
				VRect.right - 2 , ln_strt + ln_height - 2 , p );
		g.drawRect( VRect.left + 3 , ln_strt + 3 , 
				VRect.right - 3 , ln_strt + ln_height - 3 , p );

		for( count = StIndex ; count <= EndIndex ; count++ )
			{
			int index = count + 1;
			ln_strt = (int)( getGeomLineStart( index ) );
			ln_height = (int)( getGeomLineHeight( index ) );
			int YStart = ln_strt;
			String NumStr = ( new Integer( index ) ).toString();
			String Prompt = NumStr + " > ";

			g.save();
			
			// g.clipRect( VRect.left, VRect.top, VRect.right, VRect.bottom, Region.Op.REPLACE );
			// g.clipRect( VRect.left, ln_strt, VRect.right, ln_strt + ln_height, Region.Op.INTERSECT );
			
			g.clipRect( VRect.left, ln_strt, VRect.right, ln_strt + ln_height, Region.Op.INTERSECT );

			p.setColor( Color.BLUE );
			p.setTextSize( LineNumberFont.getTextSize() );
			p.setTypeface( LineNumberFont.getTypeface() );
			p.setStyle( Style.FILL );
			g.drawText( Prompt , LineWidth / 2 + fm.descent , 
				YStart - fm.ascent , p );
			p.setStyle( Style.STROKE );

			if( index < sz )
				{
				int xpa = LineWidth / 2 + /* fm.getMaxDescent() + fm.stringWidth( Prompt ) */ 50;
				paintDepic( g , p , index , xpa , YStart );
				}

			
			g.restore();
			} 


		g.save();
		// g.clipRect( VRect.left, VRect.top, VRect.right, VRect.bottom, Region.Op.REPLACE );
		( (Ktool)( geoTools.elementAt( getPrevToolMode() ) ) ).postDrawDepic( g , this );
		( (Ktool)( geoTools.elementAt( getPrevToolMode() ) ) ).postDrawTools( g , p, this );
		g.restore();
		
		}


	int orig_xval;
	int orig_yval;


/**
Performs a local to global coordinate conversion on the input Hexar.
<P>
<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
<B>Out:</B> Hexar modified.<BR>
<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
<B>Post:</B> The global coordinate values of the Hexar will be updated.<BR>
@author Thorn Green.
*/
	public void hexglo( double x , double y , Mvec cntr , boolean bound , Hexar hex )

		{
		double xval;
		double yval;
		double InMat[][] = { { -Axes[ 1 ][ 1 ] , Axes[ 0 ][ 1 ] } ,
			{ Axes[ 1 ][ 0 ] , -Axes[ 0 ][ 0 ] } };
		hex.getLoc().set( (float)( x - orig_xval ) , (float)( y - orig_yval ) );
		xval = ( (
			( x - orig_xval ) * InMat[ 0 ][ 0 ] + ( y - orig_yval ) * InMat[ 0 ][ 1 ] ) /
			CoordRad );
		yval = ( (
			( x - orig_xval ) * InMat[ 1 ][ 0 ] + ( y - orig_yval ) * InMat[ 1 ][ 1 ] ) /
			CoordRad );

		if( bound )
			{
			xval += cntr.getBasis1();
			yval += cntr.getBasis2();
			}

		hex.getGlo().setBasis1( xval );
		hex.getGlo().setBasis2( yval );
		}


/**
Performs a local to global coordinate conversion on the input Hexar.
<P>
<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
<B>Out:</B> Hexar modified.<BR>
<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
<B>Post:</B> The global coordinate values of the Hexar will be updated.<BR>
@author Thorn Green.
*/
	public void hexglo( double x , double y , Mvec cntr , boolean bound , Mvec glo , Hexar hex )

		{
		double xval;
		double yval;
		double InMat[][] = { { -Axes[ 1 ][ 1 ] , Axes[ 0 ][ 1 ] } ,
			{ Axes[ 1 ][ 0 ] , -Axes[ 0 ][ 0 ] } };
		hex.getLoc().set( (float)( x - orig_xval ) , (float)( y - orig_yval ) );
		xval = ( (
			( x - orig_xval ) * InMat[ 0 ][ 0 ] + ( y - orig_yval ) * InMat[ 0 ][ 1 ] ) /
			CoordRad );
		yval = ( (
			( x - orig_xval ) * InMat[ 1 ][ 0 ] + ( y - orig_yval ) * InMat[ 1 ][ 1 ] ) /
			CoordRad );

		if( bound )
			{
			xval += cntr.getBasis1();
			yval += cntr.getBasis2();
			}

		glo.setBasis1( xval );
		glo.setBasis2( yval );
		}


/**
Performs a global to local coordinate conversion on the input Hexar.
<P>
<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
<B>Out:</B> Hexar modified.<BR>
<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
<B>Post:</B> The local coordinate values of the Hexar will be updated.<BR>
@author Thorn Green.
*/
	public void hexloc( Mvec cntr , boolean bound , Hexar hex )

		{
		double x = hex.getGlo().getBasis1();
		double y = hex.getGlo().getBasis2();

		if( bound )
			{
			x = x - cntr.getBasis1();
			y = y - cntr.getBasis2();
			}

		double ptx = ( x * Axes[ 0 ][ 0 ] + y * Axes[ 0 ][ 1 ] )
			* CoordRad + orig_xval;
		double pty = ( x * Axes[ 1 ][ 0 ] + y * Axes[ 1 ][ 1 ] )
			* CoordRad + orig_yval;

		double max = Math.max( Math.abs( ptx ) , Math.abs( pty ) );
		if( max > 32000.0 )
			{
			ptx = 32000.0 * ptx / max;
			pty = 32000.0 * pty / max;
			}

		hex.getLoc().set( (float) ptx , (float) pty );
		}


/**
Performs a global to local coordinate conversion on the input Hexar.
<P>
<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
<B>Out:</B> Hexar modified.<BR>
<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
<B>Post:</B> The local coordinate values of the Hexar will be updated.<BR>
@author Thorn Green.
*/
	public void hexloc( Mvec cntr , boolean bound , Mvec glo , Hexar hex )

		{
		double x = glo.getBasis1();
		double y = glo.getBasis2();

		if( bound )
			{
			x = x - cntr.getBasis1();
			y = y - cntr.getBasis2();
			}

		double ptx = ( x * Axes[ 0 ][ 0 ] + y * Axes[ 0 ][ 1 ] )
			* CoordRad + orig_xval;
		double pty = ( x * Axes[ 1 ][ 0 ] + y * Axes[ 1 ][ 1 ] )
			* CoordRad + orig_yval;

		double max = Math.max( Math.abs( ptx ) , Math.abs( pty ) );
		if( max > 32000.0 )
			{
			ptx = 32000.0 * ptx / max;
			pty = 32000.0 * pty / max;
			}

		hex.getLoc().set( (float) ptx , (float) pty );
		}


/**
* Paints the depictors in a line of the display.
*/
	public void paintDepic( Canvas g , Paint p , int index , int xp , int yp )
		{
		int ThisMode = ( (Ktool)( geoTools.elementAt( getPrevToolMode() ) ) ).getDrawingMode( this );
		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( index ) );
		

		setLineCoordSettings( index );
		
		if( MyNode != null )
			{
			HighLevelList MyH2 = (HighLevelList)( MyNode.getAlgElements( ) );
			updateDisplayDepictors( this , MyH2 );
			updateCurrentDisplay( this , g , p , MyH2 );
			}

		if( MyNode != null )
			{
			HighLevelList MyH = (HighLevelList)( MyNode.getAlgLines( ) );
			updateDisplayDepictors( this , MyH );
			updateCurrentDisplay( this , g , p , MyH );
			}
		}


/**
Redraws the depictional representation for a
	set of depictors.
<P>
<B>In:</B> Graphics context, current state of the canvas,
	display list DisplayList.<BR>
<B>Out:</B> To graphics context.<BR>
<B>Pre:</B> All input objects valid.  DisplayList is consistent
	with display list structure.<BR>
<B>Post:</B> The depictors in DisplayList will be drawn into the
	grpahics context.<BR>
@author Thorn Green
*/
	protected void			updateCurrentDisplay( GeomKit thePort ,
			Canvas g , Paint p,
			HighLevelList DisplayList )



	{
	boolean Done = false;
	int ThisMode = ( (Ktool)( geoTools.elementAt( getPrevToolMode() ) ) ).getDrawingMode( this );
	DrawObj LastClick = null;
	DGMNode LastDGM = null;

	if( !( DisplayList.empty() ) )
		{
		DisplayList.searchHead();
		while( !Done )
			{
			DrawObj ThisDrw;
			DGMNode MyDGM = (DGMNode) DisplayList.getNode();
			DrawObj MyDrw = MyDGM.getMyDraw();
			MyDrw.drawYourself( thePort , MyDGM.getMyCoord() , BoundMode , g , p , ThisMode );

			if( MyDrw == LastClickDraw )
				{
				LastClick = MyDrw;
				LastDGM = MyDGM;
				}

			DisplayList.right();
			Done = DisplayList.getHead();
			}
		}

	if( LastClick != null ) 
		{ LastClick.drawYourTools( this , LastDGM.getMyCoord() , BoundMode , g , p, ThisMode ); }
	};


/**
* Updates the display depictors.
*/
	protected void			updateDisplayDepictors( GeomKit thePort )
		{

		}


/**
* Pulls a depictor from the drawing list.
*/
	public DGMNode localPullFromDrawingList( DrawObj MyObj )
		{
		int sz = GeomNodes.size();
		int count;
		DGMNode MyNode = null;

		for( count = 0 ; count < sz ; ++count )
			{
			GeomNode MyNode2 = (GeomNode)( GeomNodes.elementAt( count ) );

			if( MyNode2 != null )
				{
				HighLevelList MyList = MyNode2.getAlgLines();
				MyNode = pullFromDrawingList( MyList , MyObj );
				}
			}

		return( MyNode );
		}


/**
* Inserts the prompt element into the current prompt line.
*/
	protected void insertPromptElement( DrawObj in , HighLevelList MyH )
		{
		if( in instanceof Para1 )
			{
			if( !( MyH.empty() ) )
				{
				MyH.searchHead();
				}

			DGMNode MyDGM = new DGMNode();
			MyDGM.setMyDraw( in );
			MyDGM.setMyCoord( in.makeCoordContext() );
			MyH.insertLeft( MyDGM );
			}
			else
			{
			if( !( MyH.empty() ) )
				{
				MyH.searchHead();
				MyH.left();
				}

			DGMNode MyDGM = new DGMNode();
			MyDGM.setMyDraw( in );
			MyDGM.setMyCoord( in.makeCoordContext() );
			MyH.insertRight( MyDGM );
			}
		}


/**
* Sets the current line of the workspace.
*/
	public void setCurrentPromptLine( DrawObj in , boolean SingleDepicOnly , double LineHeightFactor )
		{
		if( ( CurIndex + 1 ) > GeomNodes.size() )
			{
			GeomNodes.setSize( CurIndex + 1 );
			GeomNodes.setElementAt( new GeomNode( ) , CurIndex );
			}


		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
		MyNode.setOnlySingleDepic( SingleDepicOnly );
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
		updateLineHeight( CurIndex );
		setLineCoord( CurIndex , in );

		if( in != null )
			{
			HighLevelList MyH = new HighLevelList();
			
			addNodeDelegates( in , MyNode , MyH );

			insertPromptElement( in , MyH );

			MyH.copyDataPlusPtrInfo( MyNode.getAlgLines() );
			constrainAlgElements( in );
			}
			else
			{
			HighLevelList MyH = new HighLevelList();

			MyH.copyDataPlusPtrInfo( MyNode.getAlgLines() );
			deConstrainAlgElements();
			}
		
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		}


/**
* Sets the current line of the workspace.
*/
 	public void setCurrentPromptLine( DrawObj in , boolean SingleDepicOnly )
		{ setCurrentPromptLine( in , SingleDepicOnly , -1.0 ); }


/**
* Sets the current line of the workspace.
*/
	public void setCurrentPromptLine( Set in , boolean SingleDepicOnly , double LineHeightFactor )
		{
		if( ( CurIndex + 1 ) > GeomNodes.size() )
			{
			GeomNodes.setSize( CurIndex + 1 );
			GeomNodes.setElementAt( new GeomNode( ) , CurIndex );
			}

		HighLevelList MyH = new HighLevelList();
		GeomNode MyNode2 = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
		MyNode2.setOnlySingleDepic( SingleDepicOnly );
		if( LineHeightFactor > 0.0 ) 
			{
			double tmp = MyNode2.getLineHeightFactor();
			MyNode2.setLineHeightFactor( LineHeightFactor , false );
			if( tmp != LineHeightFactor ) { synchronizeRendering(); scrollToCurrentLine(); }
			}
		updateLineHeight( CurIndex );


		if( !( MyH.empty() ) )
			{
			MyH.searchHead();
			MyH.left();
			}

		if( !( in.isEmpty() ) )
			{
			Iterator it = in.iterator();

			DGMNode CDGM = (DGMNode)( it.next() );
			setLineCoord( CurIndex , CDGM.getMyDraw() );		

			it = in.iterator();

			while( it.hasNext() )
				{
				DGMNode MyNode = (DGMNode)( it.next() );
				DrawObj MyObj = MyNode.getMyDraw();
				
				DGMNode MyDGM = new DGMNode();
				MyDGM.setMyDraw( MyObj );
				MyDGM.setMyCoord( MyObj.makeCoordContext() );
				MyH.insertRight( MyDGM );
				}

			constrainAlgElements( CDGM.getMyDraw() );
			}
			else
			{
			deConstrainAlgElements();
			}

		MyH.copyDataPlusPtrInfo( MyNode2.getAlgLines() );
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		}


/**
* Sets the current line of the workspace.
*/
	public void setCurrentPromptLine( Set in , boolean SingleDepicOnly )
		{ setCurrentPromptLine( in , SingleDepicOnly , -1.0 ); }


/**
* Returns whether a particular depictor is in the given list.
*/
	public boolean depictorInList( DrawObj in , HighLevelList MyList )
		{
		boolean Found = false;

		if( MyList != null )
			{
			if( !( MyList.empty() ) )
				{
				MyList.searchHead();
				boolean Done = false;

				while( !Done )
					{
					DGMNode MyNode = (DGMNode)( MyList.getNode() );
					DrawObj MyObj = MyNode.getMyDraw();

					Found = Found || ( MyObj == in );

					MyList.right();
					Done = MyList.getHead();
					}
				}
			}

		return( Found );
		}

/**
* Determines whether a particular depictor is on any of the prompt lines of the display.
*/
	public boolean depictorOnPrompt( DrawObj in )
		{
		int count;
		int len = GeomNodes.size();
		boolean Found = false;
 
		for( count = 1 ; count < len ; ++count )
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( count ) );
			if( MyNode != null ) 
				{
				HighLevelList MyList = MyNode.getAlgLines();
				Found = Found || depictorInList( in , MyList );
				}
			}

		return( Found );
		}

/**
* Clears all lines, rays, etc. from the line.
*/
	public void clearBkgndDepics( )
		{
		if( GeomNodes.size() > 0 )
			{
			deConstrainAlgElements();
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
			MyNode.getAlgElements().erasePtrVal( );
			}
		}

/**
* Adds the delegates of the given DrawObj to <code>DispList</code>.
*/
	public void addNodeDelegates( DrawObj in , GeomNode MyNode , HighLevelList DispList )
		{
		if( !( MyNode.getOnlySingleDepic() ) )
			{
			HighLevelList MyList = in.getDelegators();

			if( !( MyList.empty() ) )
				{
				MyList.searchHead();
				boolean Done = false;

				while( !Done )
					{
					DrawObj MyObj = (DrawObj)( MyList.getNode() );
					addNodeDelegates( MyObj , MyNode , DispList );

					if( !( DispList.empty() ) )
						{
						DispList.searchHead();
						}

					DGMNode MyDGM = new DGMNode();
					MyDGM.setMyDraw( MyObj );
					MyDGM.setMyCoord( MyObj.makeCoordContext() );
					DispList.insertLeft( MyDGM );

					MyList.right();
					Done = MyList.getHead();
					}
				}
			}

		}


/**
* Returns whether a depictor is in a particular list.
*/
	protected boolean drawObjInList( DrawObj MyObj , HighLevelList temp )
		{
		DGMNode MyDrawObj = null;
		DGMNode RetNode = null;
		HighLevelList next = new HighLevelList();

		if( !( temp.empty() ) )
			{
			temp.searchHead();
			boolean Done = false;

			while( !Done )
				{
				MyDrawObj = (DGMNode) temp.getNode();
				temp.copyDataPlusPtrInfo( next );
				next.right();

				if( MyDrawObj.getMyDraw() == MyObj )
					{
					RetNode = MyDrawObj;
					}

				
				next.copyDataPlusPtrInfo( temp );
				Done = temp.getHead();
				}
			}

		return( RetNode != null );
		}


/**
* Handles a delegation event.
*/
	public void localDelegationEvent( boolean Add , DrawObj FromObj , DrawObj ToObj )
		{
		if( Add )
			{
			int sz = GeomNodes.size();
			int count;

			for( count = 0 ; count < sz ; ++count )
				{
				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( count ) );
				
				if( MyNode != null )
					{
					HighLevelList MyL = MyNode.getAlgLines();
					boolean Found = drawObjInList( FromObj , MyL );

					if( Found )
						{
						addNodeDelegates( ToObj , MyNode , MyL );

						if( !( MyL.empty() ) )
							{
							MyL.searchHead();
							}

						DGMNode MyDGM = new DGMNode();
						MyDGM.setMyDraw( ToObj );
						MyDGM.setMyCoord( ToObj.makeCoordContext() );
						MyL.insertLeft( MyDGM );
						}
					}
				}
			}
		}

/**
* Increments the current line consistent with the script display mode.
*/
	public void applyScriptModeIncr( )
		{
		incrementCurrentLine( );

		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex - 1 ) );
		boolean scd = MyNode.getOnlySingleDepic();
		double lnh = MyNode.getLineHeightFactor();
		DrawObj myo = null;
		
		setCurrentPromptLine( myo , scd , lnh );
		
		
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
* Scrolls to the current line.
*/
	protected void scrollToCurrentLine( )
		{
		int ln_strt = (int)( getGeomLineStart( CurIndex ) );
		int ln_height = (int)( getGeomLineHeight( CurIndex ) );
		if( TmpVisRect != null )
			{
				int adel = Math.abs( TmpVisRect.bottom - TmpVisRect.top );
				this.jsc.scrollTo( LineWidth / 2 , Math.max( 0 , ln_strt + ln_height - adel ) );
			}
			else
			{
				this.jsc.scrollTo( LineWidth / 2 , ln_strt );
			}
		//scrollRectToVisible( new Rectangle( 
		//	0 , ln_strt , 2000 , ln_height ) );
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
* Creates a Bezier
*/
	public void localCreateBezier( DrawObj vel , DrawObj accel , double delta_t )
		throws IllegalInputException
	{
/*	String del = ( new Double( delta_t ) ).toString();

	try{ if( ( CurIndex + 1 ) > GeomNodes.size() )
		{
		GeomNodes.setSize( CurIndex + 1 );
		GeomNodes.setElementAt( new GeomNode( ) , CurIndex );
		updateLineHeight( CurIndex );
		}

	GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
	HighLevelList MyH = MyNode.getAlgLines();
	HighLevelList MyH2 = MyNode.getAlgElements();
	boolean Works = ( chkDispListNull( MyH ) ) && ( chkDispListNull( MyH2 ) );

	if( Works )
		{
		PointF InPt = new PointF( 0 , 0 );
		FlexString Vari = new FlexString();
		MyH = new HighLevelList();
		DrawObj MyObj = getModelManager().createNonNamedVar( new PointF( 50 , 50 ) , 
			"Bezier Type I" , false );
		( (Bez1) MyObj ).setPow( 3 );

		Object[] h1 = { "_h1" , MyObj };
		Object[] h1C = { MyObj , " \\+ 0.5 * " , del , " * " , vel };
		FlexString rname = new FlexString();
		FlexString rexp = new FlexString();
		rname.setInsertPoint( 0 );
		rexp.setInsertPoint( 0 );
		getModelManager().insertFormattedString( h1 , rname );
		getModelManager().insertFormattedString( h1C , rexp );
		boolean Err = getModelManager().changeExpression( rname , rexp ,
			EngineConstants.SUPERVISOR_MODE );

		Object[] h2 = { "_h2" , MyObj };
		Object[] h2C = { "0.5 * " , del , " * " , del , " * " , accel , " \\+ 2.0 * " ,
			"_h1" , MyObj , " \\- " , MyObj };
		rname = new FlexString();
		rexp = new FlexString();
		rname.setInsertPoint( 0 );
		rexp.setInsertPoint( 0 );
		getModelManager().insertFormattedString( h2 , rname );
		getModelManager().insertFormattedString( h2C , rexp );
		Err = getModelManager().changeExpression( rname , rexp ,
			EngineConstants.SUPERVISOR_MODE );

		DGMNode MyDGM = new DGMNode();
		MyDGM.setMyDraw( MyObj );
		MyDGM.setMyCoord( MyObj.makeCoordContext() );
		MyH.insertRight( MyDGM );
		MyH.copyDataPlusPtrInfo( MyNode.getAlgElements() );
		setLineCoord( CurIndex , MyObj );
		postInvalidate();
		}
		else
		{
		throw( new IllegalInputException( "This operation can only be performed on a prompt line with no lines or elements." ) );
		} } 
		catch( IllegalInputException e )
			{ throw( e ); }
		catch( Exception e ) 
			{ throw( new WrapRuntimeException( "Bezier Failed" , e ) ); } */
	}


/**
* Creates a ray.
*/
	public void localCreateRay( ) throws IllegalInputException
	
	{
	try{ if( ( CurIndex + 1 ) > GeomNodes.size() )
		{
		GeomNodes.setSize( CurIndex + 1 );
		GeomNodes.setElementAt( new GeomNode( ) , CurIndex );
		updateLineHeight( CurIndex );
		}

	GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
	HighLevelList MyH = MyNode.getAlgLines();
	HighLevelList MyH2 = MyNode.getAlgElements();
	boolean Works = ( chkDispListNull( MyH ) ) && ( chkDispListNull( MyH2 ) );

	if( Works )
		{
		PointF InPt = new PointF( 0 , 0 );
		FlexString Vari = new FlexString();
		MyH = new HighLevelList();
		DrawObj MyObj = getModelManager().createNonNamedVar( new PointF( 50 , 50 ) , 
			"Ray Type I" , false );
		DGMNode MyDGM = new DGMNode();
		MyDGM.setMyDraw( MyObj );
		MyDGM.setMyCoord( MyObj.makeCoordContext() );
		MyH.insertRight( MyDGM );
		MyH.copyDataPlusPtrInfo( MyNode.getAlgElements() );
		setLineCoord( CurIndex , MyObj );
		invalidate(); // postInvalidate();
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		}
		else
		{
		throw( new IllegalInputException( "This operation can only be performed on a prompt line with no lines or elements." ) );
		} }
		catch( IllegalInputException e )
			{ throw( e ); }	
		catch( Exception e ) 
			{ throw( new WrapRuntimeException( "Ray Failed" , e ) ); }
	}


/**
* Creates a line.
*/
	public void localCreateLine( ) throws IllegalInputException
	
	{
	if( ( CurIndex + 1 ) > GeomNodes.size() )
		{
		GeomNodes.setSize( CurIndex + 1 );
		GeomNodes.setElementAt( new GeomNode( ) , CurIndex );
		updateLineHeight( CurIndex );
		}

	GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
	HighLevelList MyH = MyNode.getAlgLines();
	HighLevelList MyH2 = MyNode.getAlgElements();
	boolean Works = ( chkDispListNull( MyH ) ) && ( chkDispListNull( MyH2 ) );

	if( Works )
		{
		PointF InPt = new PointF( 0 , 0 );
		FlexString Vari = new FlexString();
		MyH = new HighLevelList();
		DrawObj MyObj = getModelManager().createNonNamedVar( new PointF( 50 , 50 ) , 
			"Line Type I" , false );
		DGMNode MyDGM = new DGMNode();
		MyDGM.setMyDraw( MyObj );
		MyDGM.setMyCoord( MyObj.makeCoordContext() );
		MyH.insertRight( MyDGM );
		MyH.copyDataPlusPtrInfo( MyNode.getAlgElements() );
		setLineCoord( CurIndex , MyObj );
		invalidate(); // postInvalidate();
		
		TmpVisRect = null;
		requestLayout(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		invalidate();
		
		}
		else
		{
		throw( new IllegalInputException( "This operation can only be performed on a prompt line with no lines or elements." ) );
		}
	}


/**
* Realigns all lines to a default point.
*/
	public void realignGeom( )
		{
		int count;

		if( GeomNodes.size() > 0 )
			{
			for( count = 1 ; count <= CurIndex ; ++count )
				{
				DrawObj MyDrw = null;	

				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( count ) );

				if( MyNode != null )
					{
					HighLevelList myl = MyNode.getAlgLines();	

					if( !( myl.empty() ) )
						{
						myl.searchHead();
						myl.left();
						DGMNode MyDGM = (DGMNode)( myl.getNode() );
						MyDrw = MyDGM.getMyDraw();
						}
					}

				setLineCoord( count , MyDrw );
				}
			}

		invalidate(); // postInvalidate();
		}


/**
* Centers the current line of the workspace
*/
	public void centerCurrentLine( )
		{

		if( GeomNodes.size() > 0 )
			{
			int ind = CurIndex;
				{
				DrawObj MyDrw = null;	

				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( ind ) );

				if( MyNode != null )
					{
					HighLevelList myl = MyNode.getAlgLines();	

					if( !( myl.empty() ) )
						{
						myl.searchHead();
						myl.left();
						DGMNode MyDGM = (DGMNode)( myl.getNode() );
						MyDrw = MyDGM.getMyDraw();
						}

					int InLine = ind;
					Rect visRect = retVisibleRect();
					int coord = visRect.left + visRect.width() / 2;
					PointF MyPt = new PointF();
					MyPt.x = 0;
					MyPt.y = 0;
					MyNode.setAlgLineCoord( MyPt );
					setLineCoordSettings( InLine );
					Hexar Temp = new Hexar();
					MyDrw.setValuePort( 0 );
					MyDrw.portGetVect().copyAllInfo( Temp.getGlo() );
					hexloc( Temp.getGlo() , BoundMode , Temp );
					MyPt.x = coord - Temp.getLoc().x;
					MyPt.y = (float)( getGeomLineStart( InLine ) + getGeomLineHeight( InLine ) - Temp.getLoc().y );
					MyPt.y -= getGeomLineHeight( InLine ) / 2;
					}

				}
			}

		invalidate(); // postInvalidate();
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
	
	
	@Override
	protected void handlePinchEnd()
	{
		try
		{
			getParent().requestDisallowInterceptTouchEvent(true);
			int LineNum = findIndexAt( iy0 );
			if( ( LineNum >= 0 ) && ( LineNum <= CurIndex ) )
			{
				double lnHeight = getGeomLineHeight( LineNum );
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
						arg , this );
				ProgramDirector.fireEtherEvent( send , null );
			}
		}
		catch( Throwable ex )
			{ handleThrow( ex ); }
	}

	
/**
* Sets the line coordinates to support a mouse event.
*/
	protected final void setLineCoordSettings( MotionEvent anEvent )
		{
		float MyY = anEvent.getY();
		int index = findIndexAt( MyY );
		setLineCoordSettings( index );
		CurClickLine = index;
		}

/**
* Sets the line coordinates to support a particular prompt line.
*/
	protected final void setLineCoordSettings( int InLine )
		{
		if( InLine <= CurIndex )
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( InLine ) );
			PointF MyPt = (PointF)( MyNode.getAlgLineCoord( ) );
			orig_xval = (int) MyPt.x;
			orig_yval = (int) MyPt.y;
			}
		}

/**
* Sets the line coordinates for a particular line to support a certain depictor.
*/
	protected final void setLineCoord( int InLine , DrawObj in )
		{
		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( InLine ) );
		PointF MyPt = new PointF();

		if( in == null )
			{
			MyPt.x = LineWidth / 2 + 75;
			MyPt.y = (float)( getGeomLineStart( InLine ) + getGeomLineHeight( InLine ) );
			if( MyNode.getLineHeightFactor() >= 1.0 ) MyPt.y -= DefaultLineHeight / 2;
				else MyPt.y -= getGeomLineHeight( InLine ) / 2;
			MyNode.setAlgLineCoord( MyPt );
			}
			else
			{
			MyPt.x = 0;
			MyPt.y = 0;
			MyNode.setAlgLineCoord( MyPt );
			setLineCoordSettings( InLine );
			Hexar Temp = new Hexar();
			in.setValuePort( 0 );
			in.portGetVect().copyAllInfo( Temp.getGlo() );
			hexloc( Temp.getGlo() , BoundMode , Temp );
			MyPt.x = LineWidth / 2 + 75 - Temp.getLoc().x;
			MyPt.y = (float)( getGeomLineStart( InLine ) + getGeomLineHeight( InLine ) - Temp.getLoc().y );
			if( MyNode.getLineHeightFactor() >= 1.0 ) MyPt.y -= DefaultLineHeight / 2;
				else MyPt.y -= getGeomLineHeight( InLine ) / 2;
			}

		}

/**
* Handles the beginning of a drag.
*/
	public void clickPreDrag( MotionEvent anEvent )
		{
		setLineCoordSettings( anEvent );
		DragLine = CurClickLine;
		super.clickPreDrag( anEvent );
		}

/**
* Handles a drag event.
*/
	public void clickAndDrag( MotionEvent anEvent , CoordContext PrtCon )
		{
		setLineCoordSettings( DragLine );
		super.clickAndDrag( anEvent , PrtCon );
		}

/**
* Handles the end of a drag.
*/
	protected void otherClickPostDrag( MotionEvent anEvent )
		{
		setLineCoordSettings( DragLine );
		super.otherClickPostDrag( anEvent );
		}

/**
* Gets the display list associated with the current prompt line.
*/
	public HighLevelList getDispList( )
		{
		HighLevelList TryList = null;

		if( CurClickLine < GeomNodes.size() ) 
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurClickLine ) );
			if( MyNode != null ) TryList = MyNode.getAlgLines();
			}


		HighLevelList tmp = TryList;

		if( tmp == null ) tmp = TempList;

		return( tmp );
		}


/**
* Checks whether the display list input is null or empty.
*/
	public boolean chkDispListNull( HighLevelList in )
		{
		boolean tmp = false;

		if( in == null ) tmp = true;
			else
			{
			tmp = in.empty();
			}

		return( tmp );
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
* Constrains all rays.
*/
	protected void constrainAlgElements( DrawObj PermObj )
		{
		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
		
		if( MyNode != null )
			{
			HighLevelList MyH = MyNode.getAlgElements();

			if( !( MyH.empty() ) )
				{
				boolean Done = false;
				MyH.searchHead();

				while( !Done )
					{
					DGMNode MyDGM = (DGMNode)( MyH.getNode() );
					DrawObj RayObj = MyDGM.getMyDraw();
					if( /* RayObj instanceof Bez1  */ false )
						constrainBezier( RayObj , PermObj );
						else constrainRay( RayObj , PermObj );

					MyH.right();
					Done = MyH.getHead();
					}
				}
			}
		}


/**
* Constrains a ray.
*/
	protected void constrainRay( DrawObj RayObj , DrawObj PermObj )

		{
		Object[] rname = { "_hd" , RayObj };
		Object[] rexp = { "_hd" , PermObj };
		
		FlexString resname = new FlexString();
		FlexString resexp = new FlexString();
		resname.setInsertPoint( 0 );
		resexp.setInsertPoint( 0 );
		getModelManager().insertFormattedString( rname , resname );
		getModelManager().insertFormattedString( rexp , resexp );
		boolean Err = getModelManager().changeExpression( resname , resexp ,
			EngineConstants.SUPERVISOR_MODE );

		Object[] rname2 = { RayObj };

		FlexString resname2 = new FlexString();
		resname2.setInsertPoint( 0 );
		getModelManager().insertFormattedString( rname2 , resname2 );

		if( ( PermObj instanceof Ssca1 ) || ( PermObj instanceof Dsca1 ) )
			{
			Object[] rexp2 = { "_di" , PermObj };
			FlexString resexp2 = new FlexString();
			resexp2.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rexp2 , resexp2 );
			Err = getModelManager().changeExpression( resname2 , resexp2 ,
				EngineConstants.SUPERVISOR_MODE );
			}

		if( ( PermObj instanceof Vect1 ) || ( PermObj instanceof Vect2 ) )
			{
			Object[] rexp2 = { PermObj };
			FlexString resexp2 = new FlexString();
			resexp2.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rexp2 , resexp2 );
			Err = getModelManager().changeExpression( resname2 , resexp2 ,
				EngineConstants.SUPERVISOR_MODE );
			}

		if( ( PermObj instanceof Angle1 ) || ( PermObj instanceof Angle2 ) )
			{
			Object[] rexp2 = { "_md" , PermObj , " \\- " , "_hd" , PermObj };
			FlexString resexp2 = new FlexString();
			resexp2.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rexp2 , resexp2 );
			Err = getModelManager().changeExpression( resname2 , resexp2 ,
				EngineConstants.SUPERVISOR_MODE );
			}
		}


/**
* Constrains a Bezier.
*/
	protected void constrainBezier( DrawObj RayObj , DrawObj PermObj )

		{
		Object[] rname = { RayObj };
		Object[] rexp = { "_hd" , PermObj };
		
		FlexString resname = new FlexString();
		FlexString resexp = new FlexString();
		resname.setInsertPoint( 0 );
		resexp.setInsertPoint( 0 );
		getModelManager().insertFormattedString( rname , resname );
		getModelManager().insertFormattedString( rexp , resexp );
		boolean Err = getModelManager().changeExpression( resname , resexp ,
			EngineConstants.SUPERVISOR_MODE );

		}


/**
* Removes the constraints from all rays.
*/
	protected void deConstrainAlgElements( )
		{
		GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( CurIndex ) );
		
		if( MyNode != null )
			{
			HighLevelList MyH = MyNode.getAlgElements();

			if( !( MyH.empty() ) )
				{
				boolean Done = false;
				MyH.searchHead();

				while( !Done )
					{
					DGMNode MyDGM = (DGMNode)( MyH.getNode() );
					DrawObj RayObj = MyDGM.getMyDraw();
					deConstrainRay( RayObj );

					MyH.right();
					Done = MyH.getHead();
					}
				}
			}
		}


/**
* Removes the constraints from a ray.
*/
	protected void deConstrainRay( DrawObj RayObj )

		{
		if( /* RayObj instanceof Bez1 */ false )
			{
			Object[] rname = { "_h1" , RayObj };
		
			FlexString resname = new FlexString();
			resname.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rname , resname );
			boolean Err = getModelManager().deleteExpression( resname ,
				EngineConstants.SUPERVISOR_MODE );

			Object[] rname2 = { "_h2" , RayObj };
		
			FlexString resname2 = new FlexString();
			resname2.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rname2 , resname2 );
			Err = getModelManager().deleteExpression( resname2 ,
				EngineConstants.SUPERVISOR_MODE );

			Object[] rname3 = { RayObj };
		
			FlexString resname3 = new FlexString();
			resname3.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rname3 , resname3 );
			Err = getModelManager().deleteExpression( resname3 ,
				EngineConstants.SUPERVISOR_MODE );
			}
			else
			{
			Object[] rname = { "_hd" , RayObj };
		
			FlexString resname = new FlexString();
			resname.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rname , resname );
			boolean Err = getModelManager().deleteExpression( resname ,
				EngineConstants.SUPERVISOR_MODE );

			Object[] rname2 = { RayObj };
		
			FlexString resname2 = new FlexString();
			resname2.setInsertPoint( 0 );
			getModelManager().insertFormattedString( rname2 , resname2 );
			Err = getModelManager().deleteExpression( resname2 ,
				EngineConstants.SUPERVISOR_MODE );
			}
		}


/**
* Returns whether the line indicated in the parameter contains a valid node.
*/
	public boolean chkValidLine( int idex )
		{
		boolean ret = false;
		int sz = GeomNodes.size();
		if( idex < sz )
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( idex ) );
			ret = MyNode != null;
			}

		return( ret );
		}


/**
* Changes the height of a line.
*/
	protected void chgLineHeight( int idex , double LineHeightFactor , boolean locked )
		{
		int sz = GeomNodes.size();

		if( idex < sz )
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( idex ) );
			MyNode.setLineHeightFactor( LineHeightFactor , locked );
			updateLineHeight( idex );
			synchronizeRendering();
			invalidate(); // postInvalidate();
			}

		realignGeom();
		}


/**
* Changes the height of a line.
*/
	public void chgLineHeight( int idex , double LineHeightFactor )
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
		int sz = GeomNodes.size();

		if( sz > 0 )
			{
			if( idex > 1 )
				{
				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( idex - 1 ) );
				start = MyNode.getLineEnd();
				}

			for( count = idex ; count < sz ; ++count )
				{
				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( count ) );
				MyNode.setLineStart( start );
				start = MyNode.getLineEnd();
				}
			}
		}


/**
* Gets the height of a line.
*/
	protected double getGeomLineHeight( int idex )
		{
		double ret = DefaultLineHeight;
		int sz = GeomNodes.size();
		if( idex < sz )
			{
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( idex ) );
			if( MyNode != null ) ret = MyNode.getLineHeight();
			}

		return( ret );
		}


/**
* Gets the starting location of a line.
*/
	protected double getGeomLineStart( int idex )
		{
		int sz = GeomNodes.size();
		int chkidex = idex;
		double ret = 0;

		if( idex >= sz )
			{
			if( sz > 0 )
				{
				GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( sz - 1 ) );
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
			GeomNode MyNode = (GeomNode)( GeomNodes.elementAt( idex ) );
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
				double strt = getGeomLineStart( CacheStartIndex );
				double end = strt + getGeomLineHeight( CacheStartIndex );
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
				double strt = getGeomLineStart( CacheEndIndex );
				double end = strt + getGeomLineHeight( CacheEndIndex );
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
* Finds the line index at a particular vertical coordinate in pixel space.
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
				double strt = getGeomLineStart( TempIndex );
				double end = strt + getGeomLineHeight( TempIndex );
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


	protected int getNumPages( double imageHeight )
		{
		double pageMark = 0.0;
		int pageNum = 1;

		int size = GeomNodes.size();
		int count;

		for( count = 0 ; count < size ; ++count )
			{
			int idex = count + 1;
			updateLineHeight( idex );
			double componentHeight = getGeomLineHeight( idex );

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


//	protected void handleLinePrint( Canvas g , int count , int pageIndex ,
//		int pageNum , double topMark , double pageMark )
//
//		{
//		hgr1 = /* g.create(); */ g;
//		/* hgr1.setXORMode( Color.white ); */
//
//		/* System.out.println( "handleLinePrint" );
//		System.out.println( count );
//		System.out.println( pageIndex );
//		System.out.println( pageNum );
//		System.out.println( topMark );
//		System.out.println( pageMark ); */
//		Shape cur_clip = g.getClip();
//		g.setFont( LineNumberFont );
//		FontMetrics fm = g.getFontMetrics();
//
//		if( ( pageIndex + 1 ) == pageNum )
//			{
//			int index = count;
//			int ln_strt = (int)( getGeomLineStart( index ) );
//			int ln_height = (int)( getGeomLineHeight( index ) );
//
//			double delta = topMark - ln_strt;
//			AffineTransform CoordTrans = new AffineTransform();
//			CoordTrans.setToTranslation( 0.0 , delta );
//			AffineTransform trans = g.getTransform();
//			trans.concatenate( CoordTrans );
//			g.setTransform( trans );
//
//			int YStart = ln_strt;
//			String NumStr = ( new Integer( index ) ).toString();
//			String Prompt = NumStr + " > ";
//
//			g.clipRect( -30000 , ln_strt , 60000 , (int)( pageMark - topMark ) );
//
//			g.setColor( Color.BLUE );
//			g.setFont( LineNumberFont );
//			g.drawString( Prompt , LineWidth / 2 + fm.getMaxDescent() , 
//				YStart + fm.getMaxAscent() );
//
//			if( true )
//				{
//				int xpa = LineWidth / 2 + /* fm.getMaxDescent() + fm.stringWidth( Prompt ) */ 50;
//				paintDepic( g , index , xpa , YStart );
//				}
//			}
//
//		g.setClip( cur_clip );
//		}


/*	protected void printContent(Canvas gi, PageFormat pf, int pageIndex)
                                   throws PrinterException
		{
		Canvas g = (Canvas) gi;

		double imageHeight = pf.getImageableHeight();
		AffineTransform trans = g.getTransform();

		double topMark = 0.0;
		double pageMark = 0.0;
		int pageNum = 1;

		int size = GeomNodes.size();
		int count;

		for( count = 1 ; count < size ; ++count )
			{
			int idex = count;
			updateLineHeight( idex );
			double componentHeight = getGeomLineHeight( idex );

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
/*	public int print(Canvas gi, PageFormat pf, int pageIndex)
                                   throws PrinterException
		{
		double height = pf.getImageableHeight();
		if( pageIndex >= getNumPages( height ) )
			return( Printable.NO_SUCH_PAGE );

		RepaintManager.currentManager( this ).setDoubleBufferingEnabled( false ); 
		Canvas g = (Canvas) gi;
		g.setColor( getBackground() );
		Rectangle2D.Double rect = new Rectangle2D.Double( 
			pf.getImageableX() , pf.getImageableY() ,
			pf.getImageableWidth() , pf.getImageableHeight() );
		g.fill( rect );
		AffineTransform trans2 = g.getTransform();

		AffineTransform CoordTrans = new AffineTransform();
		CoordTrans.setToTranslation( pf.getImageableX() , pf.getImageableY() );
		AffineTransform trans = g.getTransform();
		trans.concatenate( CoordTrans );
		g.setTransform( trans );

		CoordTrans = new AffineTransform();
		CoordTrans.setToTranslation( - ( retVisibleRect().x ) , 0 );
		trans = g.getTransform();
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
        	PageFormat pf1 = getModelManager().getDocPageFormat();
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

		getModelManager().setDocPageFormat( pf1 );
		} */

/**
* Interface to handle print preview requests.
*/
	public void handlePrintPreview( )
		{
		/* PrinterJob job = PrinterJob.getPrinterJob();
        	PageFormat pf1 = getModelManager().getDocPageFormat();
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

		getModelManager().setDocPageFormat( pf1 ); */
		}


/**
* Handles Ether Events.
*/
public Object processObjEtherEvent( EtherEvent in , Object refcon )
		throws Throwable
		{
		boolean handled = false;

		if( !handled ) return( super.processObjEtherEvent( in , refcon ) );
		return( null );
		}


	static final long serialVersionUID = ( GeoPadGeomPanel.class ).getName().hashCode()
		+ "v3/98A".hashCode();

/**
* Reads persistent data.
*/
	public void readExternal(ObjectInput in) 
		throws IOException, ClassNotFoundException
		{
		try
			{
			/* super.readExternal( in );
			VersionBuffer myv = (VersionBuffer)( in.readObject() );
			VersionBuffer.chkNul( myv );

			CurIndex = myv.getInt( "CurIndex" );
			GeomNodes = (Vector)( myv.getProperty( "GeomNodes" ) );
			VersionBuffer.chkNul( GeomNodes );
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

		myv.setInt( "CurIndex" , CurIndex );
		myv.setProperty( "GeomNodes" , GeomNodes );

		super.writeExternal( out );
		out.writeObject( myv ); */
		}
	
	
	
//	@Override
//    public boolean onTouchEvent(MotionEvent ea) {
//		
//		float xv = ea.getX();
//		float yv = ea.getY();
//		
//		ea.setLocation( xv + LineWidth / 2 , yv );
//		
//        super.onTouchEvent( ea );
//        
//        ea.setLocation( xv , yv );
//		
//        return true;
//    }

	
	
	
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
        double strt = getGeomLineStart( CurIndex );
		double hei = getGeomLineHeight( CurIndex ); // !!!!!!!!!!!!!!!!!! *10 !!!!!!!!!!!!!!!!!!!!!!!!!
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
	* Gets the visible rect. in a way that wastes less computational time than getVisibleRect().
	*/
   @Override
	protected Rect retVisibleRect() {
		/* if (TmpVisRect != null)
			return (TmpVisRect);
		else
		{
			Rect rct = new Rect();
			getHitRect( rct );
			return( rct );
		} */
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

   
   
   
	
   
	private transient HighLevelList TempList = new HighLevelList();
	private transient int CurClickLine = 1;
	private transient int DragLine = 1;
	private int CurIndex = 1;
	private Vector GeomNodes = new Vector();
	private int CacheStartIndex = 1;
	private int CacheEndIndex = 1;
	}



