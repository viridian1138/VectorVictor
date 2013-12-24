


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


import geomdir.DGMNode;
import geomdir.DepictorPort;
import geomdir.DrawObj;
import geomdir.DrawObjFactory;
import geomdir.DynRunner;
import geomdir.GeomConstants;
import geomdir.GeomKit;
import geomdir.GeomKitEtherEvent;
import geomdir.Hexar;
import geomdir.IntObj;
import geomdir.Mvec;
import geomdir.config.Config;
import geomdir.depictors.Angle1;
import geomdir.depictors.Angle2;
import geomdir.depictors.Circ1;
import geomdir.depictors.Dsca1;
import geomdir.depictors.Line1;
import geomdir.depictors.Numer1;
import geomdir.depictors.Ray1;
import geomdir.depictors.Ruler1;
import geomdir.depictors.Ssca1;
import geomdir.depictors.Tracer1;
import geomdir.depictors.Ucon1;
import geomdir.depictors.Vect1;
import geomdir.depictors.Vect2;
import geomdir.engine.EngineConstants;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.kluges.TwoDScrollView;
import verdantium.utils.IllegalInputException;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.view.KeyEvent;
import android.view.MotionEvent;

import com.postgreen.vectorvictor.VectorVictorActivity;




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
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Compatibility problems between GeomKit and new constraint solvers.   | Made changes so that the two would be more compatible.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to underlying APIs used by class.                            | Modified class to be compliant with new APIs.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 10/19/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expanded window menus for GeoFrame/GeoPad.                           | Added functionality relating to window menus.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/06/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need more specific error messages.                                   | Added more specific error messages.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Some operations are not compatible with BlueToh.                     | Improved compatibility.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
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
* A Display pane for the GeoPad geometry kit.
* @author Thorn Green
*/
public class GeoPadKit extends EduKit
	{

	public GeoPadKit( Context context , String Configs , int InOriginType, TwoDScrollView _jsc )
		{ super( context , Configs , InOriginType , _jsc ); }


/**
* For serial storage purposes only.  Do not use directly.
*/
//	public GeoPadKit( )
//		{
//		super( null );
//		/* For deserialization purposes only. */
//		}

/**
Initializes the state of the canvas.
<P>
<B>In:</B> None.<BR>
<B>Out:</B> State of canvas object modified.<BR>
<B>Pre:</B> All resources that canvas needs are available.<BR>
<B>Post:</B> canvas will be initialized.<BR>
Programmed By: Thorn Green.
*/
	public void geomInit( String Configs , int InOriginType , String PalType , Config config )

	{
//		jsc.setScrollbarFadingEnabled( false );
//		in.setTitleLab( "Please Wait.  MWS is Loading..." );
//		in.showLoadFrame();
		setModelManager( null );
		setModelManager( new GeoPadModel( this , Configs , config ) );
		geoTools = getModelManager().getGeoTools();
		getModelManager().addDepicListListener( this );
		( (GeoPadModel) getModelManager() ).setFreeDepicPanel( this );
		OriginType = InOriginType;

//		in.setToFront();

	/* xs.importString( "#1" );
	ys.importString( "#2" ); */
	XOrigin.value = 1000 + 100;
	YOrigin.value = 1000 + 100;
	localSetCoordRad( 80 );
	getModelManager().handleCoordRenderUpdate( 72.0 );
	RealAng.value = 135;
	ImAng.value = 135;
	RealBar.value = 50;
	ImBar.value = 50;
	Axes[ 0 ][ 0 ] = 1.0;
	Axes[ 0 ][ 1 ] = 0.0;
	Axes[ 1 ][ 0 ] = 0.0;
	Axes[ 1 ][ 1 ] = -1.0;
	ArcToolRad.value = 20;
	AxisRad.value = 50;
	ArrLen = 6.0;
	LastClick = GeomKit.NoMatch;
	requestPrevToolModeChange( GeomKit.FreeTransformationMode );
	/* CurReply = NULL; */
	
	tFont = new Paint();
	tFont.setTextSize( 12 );
	tFont.setTypeface(Typeface.create(Typeface.SERIF,
            Typeface.NORMAL));
        
	PrintColor = GreenIndex;
	Active.value = 0;

	FlexString vari = new FlexString( "c" );
	/* FlexString expr = new FlexString( "a + b" );
	boolean Err = getModelManager().changeExpression( vari , expr ,
		EngineConstants.USER_MODE ); */
	boolean Err = ( getModelManager().getMyEngine() ).verifyVariable( vari , EngineConstants.USER_MODE );

	try{ switch( OriginType )
		{
		case GeoFrameOriginType:
		case VectorOriginType:
			Ixs = makeDepicMathImage( "&sigma;<SUB>1</SUB>" ,
				StdBlueColor , 15 , true );
			Iys = makeDepicMathImage( "&sigma;<SUB>2</SUB>" ,
				StdBlueColor , 15 , true );
			break;

		case ScalarOriginType:
			Ixs = makeDepicMathImage( "u" ,
				StdBlueColor , 15 , true );
			break;
		} }
	catch( Exception ex ) { throw( new WrapRuntimeException( ex ) ); }


	customize();
//	in.hideLoadFrame();
	/* postInvalidate(); */
    }
	
	
	
	
	
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
        measureSpec = 2001;
        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);


        if (specMode == MeasureSpec.UNSPECIFIED) {
            // Here we say how Heigh to be
            result = specSize;
        } 
        return result;
    }



/**
* For view-creation purposes only.
*/
	public GeoPadKit( GeoPadKit in , TwoDScrollView _jsc )

	{
	super( in , _jsc );
	
	BoundMode = true;
	}


/**
Responds to a user request to create a depictor.
<P>
<B>In:</B> Depictor name, dialog containing request,
	current state of the canvas.<BR>
<B>Out:</B> Current state of canvas may be modified.<BR>
<B>Pre:</B> Input objects valid, canvas in a consistent state.<BR>
<B>Post:</B> Checks depictor name.  If it's invalid, puts up an
	error dialog box.  Otherwise creates depictor.<BR>
Programmed By: Thorn Green
*/
	public void doMakeVar( FlexString Vari2 , DrawObjFactory MyFac )



	{
	boolean Err = false;
	boolean Found;
	int MyErr = 0;

	boolean SelfName = !( MyFac.getVectNamed() );

	if( !SelfName ) {

	Err = ( getModelManager().getMyEngine() ).verifyVariable( Vari2 , EngineConstants.USER_MODE );
	if( Err ) MyErr = ( getModelManager().getMyEngine() ).getErrCode();

	if( !Err )
	{
	FlexString Vari = new FlexString();
	( getModelManager().getMyEngine() ).extractVariable( Vari2 , 0 , Vari2.strlen() , Vari );
	
	if( !Err ) if( !( ( (GeoPadModel) getModelManager() ).isSinglePanelVar( Vari , false ) ) ) { Err = true; MyErr = 16387; }
	if( !Err ) { Found = getModelManager().insertNewVar( Vari );
		if( Found ) { Err = true; MyErr = 16384; } }

	if( !Err )
		{
		MyFac.setNewVectName( Vari );
		DrawObj MyDepic = MyFac.createDepictor();
		( (GeoPadModel) getModelManager() ).setLastUserCreatedDepic( MyDepic );
		}
		else
		{
		Hexar MyHex = new Hexar();
		PointF InPt = new PointF();
		hexglo( InPt.x , InPt.y , null , false , MyHex );
		MyHex.getGlo().setBasis2( MyHex.getGlo().getBasis2() - 0.2 );
		hexloc( null , false , MyHex );
		Err = false;
		Class DepicClass = MyFac.getDepicClass();
		compDialBox( Vari , InPt , DepicClass );
		}
	}


	if( Err )
		{
		/* addDepiction( AltMode , InPt , VarList ); */
		stdErrorAlerts( MyErr );
		}

	Hexar MyHex = new Hexar();
	PointF InPt = new PointF();
	hexglo( InPt.x , InPt.y , null , false , MyHex );
	MyHex.getGlo().setBasis2( MyHex.getGlo().getBasis2() - 0.2 );
	hexloc( null , false , MyHex );
	DepicCache = new PointF( MyHex.getLoc().x , MyHex.getLoc().y );

	updateVariableListeners();
	}
		else
		{
		MyFac.createDepictor();

		Hexar MyHex = new Hexar();
		PointF InPt = new PointF();
		hexglo( InPt.x , InPt.y , null , false , MyHex );
		MyHex.getGlo().setBasis2( MyHex.getGlo().getBasis2() - 0.2 );
		hexloc( null , false , MyHex );
		DepicCache = new PointF( MyHex.getLoc().x , MyHex.getLoc().y );
		}

	};


/**
* Adds a depictor.
*/
	public void  addDepiction( DrawObjFactory MyFac , int altMode ) throws IllegalInputException
		{
		Integer c = null;
		int sw = ( YOffset + 7 ) % 8;

		Integer[] InitialCols = ( (GeoPadModel)( getModelManager() ) ).getInitialCols();
		c = InitialCols[ sw ];		
		
		MyFac.setFrontLineColor( c );
		MyFac.setTextColor( c );
		
		boolean bold = false;
		boolean cap = false;
		String TypeName = MyFac.getStringCreator();
		if( TypeName.equals( "Vector Type I" ) ) bold = true;
		if( TypeName.equals( "GA Phasor Type I" ) ) cap = true;
		if( TypeName.equals( "Para. Bivector Type I" ) ) { bold = true; cap = true; }
		

		char CurChar = 'a';

		boolean Done = false;
		boolean Found = false;

		while( !Done )
			{
			Found = !( ( (GeoPadModel) getModelManager() ).findVarFromChar( CurChar ) );
			Found = Found && ( CurChar != 'i' ) && ( CurChar != 'e' );
			if( !Found ) CurChar++;
			Done = !( ( CurChar <= 'z' ) && !Found );
			}

		if( Found )
			{
			String cs = ( new Character( CurChar ) ).toString();
			if( cap ) cs = cs.toUpperCase();
			if( bold ) cs = "'<BT>" + cs + "</BT>'";
			System.out.println( cs );
			doMakeVar( new FlexString( cs ) , MyFac );
			}

		if( !Found )
			throw( new IllegalInputException( "Can not create depictor because there are no letters remaining." ) );
		}



/**
* Adds a new named depictor.
*/
	public void addNamedDepiction( String Name , DrawObjFactory MyFac )
		{
		doMakeVar( new FlexString( Name ) , MyFac );
		}



/**
* Handles adding a new scalar.
*/
	protected void keyCreateScalar( ) throws IllegalInputException
		{ 
		DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( "Trans" );
		addDepiction( MyFac , 0 );
		}

/**
* Handles adding a new vector.
*/
	protected void keyCreateVector( ) throws IllegalInputException
		{ 
		DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( "Trans" );
		addDepiction( MyFac , 0 );
		}

/**
* Handles adding a new phasor.
*/
	protected void keyCreatePhasor( ) throws IllegalInputException
		{ 
		DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( "Trans" );
		addDepiction( MyFac , 0 );
		}

/**
* Handles adding a new bivector.
*/
	protected void keyCreateBivector( ) throws IllegalInputException
		{ 
		DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
		MyFac.setDepicClass( "Para. Bivector Type I" );
		MyFac.setNewVectName( "Trans" );
		addDepiction( MyFac , 0 );
		}


/**
* Handles adding a new named depictor.
*/

	protected void keyCreateNamed( String DepicName , String TypeName )
		{
		DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
		String AltMode = "ModSegment Scalar Type I";
		if( TypeName.equals( "Vector" ) ) AltMode = "Vector Type I";
		if( TypeName.equals( "Phasor" ) ) AltMode = "GA Phasor Type I";
		if( TypeName.equals( "Bivector" ) ) AltMode = "Para. Bivector Type I";
		MyFac.setDepicClass( AltMode );
		MyFac.setNewVectName( "Trans" );
		addNamedDepiction( DepicName , MyFac );
		}


/**
* Creates a bound depiction.
*/
	public GeoPadKit createBoundDepic( TwoDScrollView _jsc )
		{
		GeoPadKit MyKit = new GeoPadKit( this , _jsc );
		MyKit.setBackgroundState( Color.rgb(192, 231, 210) );
		( (GeoPadModel) getModelManager() ).setBoundDepicPanel( MyKit );
//		MyKit.MenuBar = MenuBar;
		
		return( MyKit );
		}

/**
* Creates a geometric workspace.
*/
	public GeoPadGeomPanel createGeomWork( TwoDScrollView _jsc )
		{
		GeoPadGeomPanel MyGeomPanel = new GeoPadGeomPanel( this , _jsc );
		( (GeoPadModel) getModelManager() ).setGeomPanel( MyGeomPanel );
//		MyGeomPanel.MenuBar = MenuBar;

		return( MyGeomPanel );
		}


/**
Handles a "mouse click" event in the canvas.
<P>
<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
<B>Out:</B> State of canvas may be changed.<BR>
<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
Programmed By: Thorn Green.
*/
	@Override
	public boolean mouserClick(MotionEvent e, int x, int y)

	{
	if( getPrevToolMode() == 2 )
		{
		( (GeoPadModel) getModelManager() ).handleUnSelect();
		}
		else
		{
		super.mouserClick( e , x , y );
		}

	return( false );
	}

	

/**
* Creates a dialog box that allows the user to set the color and properties of a depictor.
*/
			public void			colorDialBox( DrawObj in )
{
	VectorVictorActivity.activity.colorDialBox( in );
};



/**
* Sets the background color and image.
*/
	protected void dialSetBkgnd( Integer inCol , boolean opaque ) throws Throwable
		{ /* ((GeoPadModel) getModelManager() ).setBkgnd( inCol , opaque ); */ }


/**
Handles all key input events for the canvas.
<P>
<B>In:</B> Current state of the canvas, event to handle.<BR>
<B>Out:</B> State of the canvas may be modified.<BR>
<B>Pre:</B> Input event is valid.  canvas is in a consistent state.<BR>
<B>Post:</B> If the user has requested a change, the state of the canvas will be changed.<BR>
Programmed By: Thorn Green.
*/
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent e)
 		{
		Object tools = ( (GeoPadModel) getModelManager() ).getToolObject();
		boolean ret = ( (GeoPadPanel) tools ).dispatchKeyboardOP( keyCode , e );
		if( !ret ) ret = super.onKeyDown( keyCode , e );
		return( ret );
		}



/**
* Creates the unit depic.  Use only during initialization.
*/
	public void createUnitDepic( )
	{
	Rect MRect = retVisibleRect();
	PointF InPt = new PointF( 50 , 0 );
	FlexString Exp = new FlexString( "1.0" );
	DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
	MyFac.setDepicClass( "ModSegment Scalar Type I" );
	MyFac.setNewVectName( "1" );
	MyFac.setPlaceAt( InPt );
	DrawObj MyObj = MyFac.createDepictor();
	Object MyArr[] = { MyObj };
	FlexString DName = new FlexString();
	getModelManager().insertFormattedString( MyArr , DName );
	getModelManager().changeExpression( DName , Exp , EngineConstants.USER_AXIOM_MODE );
	( (GeoPadModel) getModelManager() ).setCurUnitObj( MyObj );

	MyFac.setDepicClass( "Unit Control Type I" );
	MyFac.setNewVectNotNamed();
	DrawObj CntObj = MyFac.createDepictor();
	( (Ucon1) CntObj ).setUseMaintainUnit( true );
	Object OAsg2[] = { "_hd" , CntObj };
	Object OExp2[] = { "_hd" , MyObj };
	FlexString Asg2 = new FlexString();
	FlexString Exp2 = new FlexString();
	getModelManager().insertFormattedString( OAsg2 , Asg2 );
	getModelManager().insertFormattedString( OExp2 , Exp2 );
	getModelManager().changeExpression( Asg2 , Exp2 , EngineConstants.SUPERVISOR_MODE );
	CntObj.setFrontLineVisible( false );
	CntObj.setBackLineVisible( false );
	CntObj.setTextVisible( false );
	( (GeoPadModel) getModelManager() ).setCurUnitCntObj( CntObj );
	}


/**
* Creates the unit phasor.
*/
	public void createUnitPhasor( )
	{
	Rect MRect = retVisibleRect();
	PointF InPt = new PointF( 50 , 0 );
	FlexString Exp = new FlexString( "#12" );
	DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
	MyFac.setDepicClass( "GA Phasor Type I" );
	MyFac.setNewVectName( "I" );
	MyFac.setPlaceAt( InPt );
	DrawObj MyObj = MyFac.createDepictor();
	Object MyArr[] = { MyObj };
	FlexString DName = new FlexString();
	getModelManager().insertFormattedString( MyArr , DName );
	getModelManager().changeExpression( DName , Exp , EngineConstants.USER_AXIOM_MODE );
	}


/**
* Changes whether a numeric label is displayed next to the depictor.
*/
	protected void changeDepicNumLabel()
	{
	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		Numer1 TmpLabel = null;
		HighLevelList tmp = LastClickDraw.getDelegators();
		if( !( tmp.empty() ) )
			{
			boolean Done = false;
			boolean Found = false;
			tmp.searchHead();

			while( !Done )
				{
				if( tmp.getNode() instanceof Numer1 )
					{
					Found = true;
					TmpLabel = (Numer1)( tmp.getNode() );
					}				

				if( !Found ) tmp.right();
				Done = tmp.getHead() || Found;
				}
			}

		if( TmpLabel != null ) removeNumLabelFromDepic( TmpLabel );
			else addNumLabelToDepic();
		}
	}


/**
* Changes whether a numeric ruler is displayed next to the depictor.
*/
	protected void changeDepicNumRuler( boolean HasNegative , String FormString )
		throws Throwable
	{
	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		Ruler1 TmpRuler = null;
		HighLevelList tmp = LastClickDraw.getDelegators();
		if( !( tmp.empty() ) )
			{
			boolean Done = false;
			boolean Found = false;
			tmp.searchHead();

			while( !Done )
				{
				if( tmp.getNode() instanceof Ruler1 )
					{
					Found = true;
					TmpRuler = (Ruler1)( tmp.getNode() );
					}				

				if( !Found ) tmp.right();
				Done = tmp.getHead() || Found;
				}
			}

		if( TmpRuler != null ) removeNumRulerFromDepic( TmpRuler );
			else addNumRulerToDepic( HasNegative , FormString );
		}
	}


/**
* Hides the current depictor.
*/
	protected void hideCurrentDepic( )
	{
	if( LastClickDraw != null )
		{
		LastClickDraw.setFrontLineVisible( false );
		LastClickDraw.setBackLineVisible( false );
		LastClickDraw.setTextVisible( false );
		LastClickDraw.setControlsVisible( false );
		getModelManager().globalRepaint();
		}
	}


/**
* Changes whether the depictor is circled.
*/
	protected void changeDepicCircled()
	{
	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		Circ1 TmpCirc = null;
		HighLevelList tmp = LastClickDraw.getDelegators();
		if( !( tmp.empty() ) )
			{
			boolean Done = false;
			boolean Found = false;
			tmp.searchHead();

			while( !Done )
				{
				if( tmp.getNode() instanceof Circ1 )
					{
					Found = true;
					TmpCirc = (Circ1)( tmp.getNode() );
					}				

				if( !Found ) tmp.right();
				Done = tmp.getHead() || Found;
				}
			}

		if( TmpCirc != null ) removeCircleFromDepic( TmpCirc );
			else addCircToDepic();
		}
	}

/**
* Adds a circle to the depictor.
*/
	private void addCircToDepic()
	{
	OpHandler MyOp = new OpHandler( this , (EduModel) getModelManager() );
	MyOp.setUseBlinking( false );
	MyOp.circleObject( LastClickDraw );
	}


/**
* Adds a numeric label to the depictor.
*/
	private void addNumLabelToDepic()
	{
	DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
	PointF OutPt = new PointF( 50 , 50 );
	MyFac.setDepicClass( "Numeric Display Type I" );
	MyFac.setNewVectNotNamed();
	MyFac.setPlaceAt( OutPt );
	Numer1 NumLabel = (Numer1)( MyFac.createDepictor() );

	Object[] Var1 = { NumLabel };
	Object[] Exp1 = { LastClickDraw };
	FlexString Vars1 = new FlexString();
	FlexString Exps1 = new FlexString();
	getModelManager().insertFormattedString( Var1 , Vars1 );
	getModelManager().insertFormattedString( Exp1 , Exps1 );
	getModelManager().changeExpression( Vars1 , Exps1 , EngineConstants.SUPERVISOR_MODE );

	if( ( LastClickDraw instanceof Dsca1 ) || ( LastClickDraw instanceof Ssca1 ) )
		{
		Object[] Var2 = { "_hd" , NumLabel };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ ( < " , LastClickDraw , " >{ 0 } * " ,
				"_di" , LastClickDraw , " ) " };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect1 ) )
		{
		Object[] Var2 = { "_hd" , NumLabel };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ " , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect2 ) )
		{
		Object[] Var2 = { "_hd" , NumLabel };
		Object[] Exp2 = { "_hd" , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Angle1 ) || ( LastClickDraw instanceof Angle2 ) )
		{
		Object[] Var2 = { "_hd" , NumLabel };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ " , "magnitude( " , LastClickDraw ,
			" ) * UnitOf( " , "_md" , LastClickDraw , " \\- " , "_hd" , LastClickDraw , " ) " };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}


	IntObj DomObj = LastClickDraw.vectGetExtDomain();
	int domain = DomObj.value;

	if( ( domain & GeomConstants.DOM_SCA ) == 0 )
		NumLabel.setApply0( false );

	if( ( domain & GeomConstants.DOM_VECT1 ) == 0 )
		NumLabel.setApply1( false );

	if( ( domain & GeomConstants.DOM_VECT2 ) == 0 )
		NumLabel.setApply2( false );

	if( ( domain & GeomConstants.DOM_PSU ) == 0 )
		NumLabel.setApply3( false );

	NumLabel.setEnclosed( true );


	LastClickDraw.getDelegators().insertRight( NumLabel );
	NumLabel.getDelegated().insertRight( LastClickDraw );
	getModelManager().globalDelegationEvent( true , LastClickDraw , NumLabel );
	getModelManager().globalRepaint();
	}


/**
* Adds a numeric ruler to the depictor.
*/
	private void addNumRulerToDepic( boolean HasNegative , String FormString )
		throws Throwable
	{
	DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
	PointF OutPt = new PointF( 50 , 50 );
	MyFac.setDepicClass( "Ruler Type I" );
	MyFac.setNewVectNotNamed();
	MyFac.setPlaceAt( OutPt );
	Ruler1 NumRuler = (Ruler1)( MyFac.createDepictor() );
	NumRuler.setHasNegative( HasNegative );
	NumRuler.setFrontLineColor( Color.BLACK );
	NumRuler.setBackLineColor( Color.BLACK );
	NumRuler.setTextColor( Color.BLACK );


	double InchToPix = 72.0;


	try
		{
		if( !( FormString.equals( "" ) ) )
			{
			double MyD = ( new Double( FormString ) ).doubleValue();
			NumRuler.setUseGlobalUnit( MyD );
			}
		}
		catch( NumberFormatException e ) { throw( new IllegalInputException( "The Unit Must Be A Number" , e ) ); }


	if( FormString.equals( "Centimeters" ) )
		NumRuler.setUsePixelUnit( InchToPix * 0.3937 );

	if( FormString.equals( "Meters" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39.37 );

	if( FormString.equals( "Kilometers" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39370.0 );

	if( FormString.equals( "Inches" ) )
		NumRuler.setUsePixelUnit( InchToPix * 1.0 );

	if( FormString.equals( "Feet" ) )
		NumRuler.setUsePixelUnit( InchToPix * 12.0 );

	if( FormString.equals( "Miles" ) )
		NumRuler.setUsePixelUnit( InchToPix * 63360.0 );

	if( FormString.equals( "Angstroms" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39.37 * 1E-10 );

	if( FormString.equals( "Nautical Miles" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39.37 * 1852 );

	if( FormString.equals( "Fermi" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39.37 * 1E-15 );

	if( FormString.equals( "Light-Years" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39370.0 * 9.460 * 1E12 );

	if( FormString.equals( "Parsecs" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39370.0 * 3.084 * 1E13 );

	if( FormString.equals( "Fathoms" ) )
		NumRuler.setUsePixelUnit( InchToPix * 12.0 * 6.0 );

	if( FormString.equals( "Bohr Radius" ) )
		NumRuler.setUsePixelUnit( InchToPix * 39.37 * 5.292 * 1E-11 );

	if( FormString.equals( "Yards" ) )
		NumRuler.setUsePixelUnit( InchToPix * 12.0 * 3.0 );

	if( FormString.equals( "Rods" ) )
		NumRuler.setUsePixelUnit( InchToPix * 12.0 * 16.5 );

	if( FormString.equals( "Mils" ) )
		NumRuler.setUsePixelUnit( InchToPix * 1E-3 );

	if( FormString.equals( "Degrees" ) )
		NumRuler.setUseGlobalUnit( Math.PI / 180.0 );

	if( FormString.equals( "Radians" ) )
		NumRuler.setUseGlobalUnit( );

	if( FormString.equals( "Radians * Pi" ) )
		NumRuler.setUseGlobalUnit( Math.PI );



	if( ( LastClickDraw instanceof Dsca1 ) || ( LastClickDraw instanceof Ssca1 ) )
		{
		Object[] Var1 = { NumRuler };
		Object[] Exp1 = { LastClickDraw };
		FlexString Vars1 = new FlexString();
		FlexString Exps1 = new FlexString();
		getModelManager().insertFormattedString( Var1 , Vars1 );
		getModelManager().insertFormattedString( Exp1 , Exps1 );
		getModelManager().changeExpression( Vars1 , Exps1 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var2 = { "_hd" , NumRuler };
		Object[] Exp2 = { "_hd" , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var3 = { "_di" , NumRuler };
		Object[] Exp3 = { "_di" , LastClickDraw };
		FlexString Vars3 = new FlexString();
		FlexString Exps3 = new FlexString();
		getModelManager().insertFormattedString( Var3 , Vars3 );
		getModelManager().insertFormattedString( Exp3 , Exps3 );
		getModelManager().changeExpression( Vars3 , Exps3 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect1 ) )
		{
		Object[] Var1 = { NumRuler };
		Object[] Exp1 = { "magnitude( " , LastClickDraw , " ) " };
		FlexString Vars1 = new FlexString();
		FlexString Exps1 = new FlexString();
		getModelManager().insertFormattedString( Var1 , Vars1 );
		getModelManager().insertFormattedString( Exp1 , Exps1 );
		getModelManager().changeExpression( Vars1 , Exps1 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var2 = { "_hd" , NumRuler };
		Object[] Exp2 = { "_hd" , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var3 = { "_di" , NumRuler };
		Object[] Exp3 = { "UnitOf( " , LastClickDraw , " ) " };
		FlexString Vars3 = new FlexString();
		FlexString Exps3 = new FlexString();
		getModelManager().insertFormattedString( Var3 , Vars3 );
		getModelManager().insertFormattedString( Exp3 , Exps3 );
		getModelManager().changeExpression( Vars3 , Exps3 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect2 ) )
		{
		Object[] Var1 = { NumRuler };
		Object[] Exp1 = { "magnitude( " , LastClickDraw , " ) " };
		FlexString Vars1 = new FlexString();
		FlexString Exps1 = new FlexString();
		getModelManager().insertFormattedString( Var1 , Vars1 );
		getModelManager().insertFormattedString( Exp1 , Exps1 );
		getModelManager().changeExpression( Vars1 , Exps1 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var2 = { "_hd" , NumRuler };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\- " , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var3 = { "_di" , NumRuler };
		Object[] Exp3 = { "- UnitOf( " , LastClickDraw , " ) " };
		FlexString Vars3 = new FlexString();
		FlexString Exps3 = new FlexString();
		getModelManager().insertFormattedString( Var3 , Vars3 );
		getModelManager().insertFormattedString( Exp3 , Exps3 );
		getModelManager().changeExpression( Vars3 , Exps3 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Angle1 ) || ( LastClickDraw instanceof Angle2 ) )
		{
		Object[] Var1 = { NumRuler };
		Object[] Exp1 = { "magnitude( " , LastClickDraw , " ) " };
		FlexString Vars1 = new FlexString();
		FlexString Exps1 = new FlexString();
		getModelManager().insertFormattedString( Var1 , Vars1 );
		getModelManager().insertFormattedString( Exp1 , Exps1 );
		getModelManager().changeExpression( Vars1 , Exps1 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var2 = { "_hd" , NumRuler };
		Object[] Exp2 = { "_hd" , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );

		Object[] Var3 = { "_di" , NumRuler };
		Object[] Exp3 = { "UnitOf( " , "_md" , LastClickDraw , " \\- " , "_hd" , LastClickDraw , " ) " };
		FlexString Vars3 = new FlexString();
		FlexString Exps3 = new FlexString();
		getModelManager().insertFormattedString( Var3 , Vars3 );
		getModelManager().insertFormattedString( Exp3 , Exps3 );
		getModelManager().changeExpression( Vars3 , Exps3 , EngineConstants.SUPERVISOR_MODE );
		}

	LastClickDraw.getDelegators().insertRight( NumRuler );
	NumRuler.getDelegated().insertRight( LastClickDraw );
	getModelManager().globalDelegationEvent( true , LastClickDraw , NumRuler );
	getModelManager().globalRepaint();
	}


/**
* Adds a trace to the depictor.
*/
	private void addTracerToDepic()
	{
	DrawObjFactory MyFac = new DrawObjFactory( this , getModelManager() );
	PointF OutPt = new PointF( 50 , 50 );
	MyFac.setDepicClass( "Tracer Type I" );
	MyFac.setNewVectNotNamed();
	MyFac.setPlaceAt( OutPt );
	Tracer1 NumTrace = (Tracer1)( MyFac.createDepictor() );
	Integer DirecColor = Color.rgb( 206 , 0 , 199 );
	NumTrace.setFrontLineColor( DirecColor );
	NumTrace.setBackLineColor( DirecColor );


	if( ( LastClickDraw instanceof Dsca1 ) || ( LastClickDraw instanceof Ssca1 ) )
		{
		Object[] Var2 = { NumTrace };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ ( < " , LastClickDraw , " >{ 0 } * " ,
				"_di" , LastClickDraw , " ) " };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect1 ) )
		{
		Object[] Var2 = { NumTrace };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ " , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Vect2 ) )
		{
		Object[] Var2 = { NumTrace };
		Object[] Exp2 = { "_hd" , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	if( ( LastClickDraw instanceof Angle1 ) || ( LastClickDraw instanceof Angle2 ) )
		{
		Object[] Var2 = { NumTrace };
		Object[] Exp2 = { "_hd" , LastClickDraw , " \\+ " ,
			"UnitOf( " , "_md" , LastClickDraw , " \\- " , "_hd" , LastClickDraw , " ) * " , LastClickDraw };
		FlexString Vars2 = new FlexString();
		FlexString Exps2 = new FlexString();
		getModelManager().insertFormattedString( Var2 , Vars2 );
		getModelManager().insertFormattedString( Exp2 , Exps2 );
		getModelManager().changeExpression( Vars2 , Exps2 , EngineConstants.SUPERVISOR_MODE );
		}

	LastClickDraw.getDelegators().insertRight( NumTrace );
	NumTrace.getDelegated().insertRight( LastClickDraw );
	getModelManager().globalDelegationEvent( true , LastClickDraw , NumTrace );
	getModelManager().globalRepaint();
	}

/**
* Removes a numeric label from the depictor.
*/
	private void removeNumLabelFromDepic( Numer1 NumLabel )
	{

	Object[] Var1 = { NumLabel };
	FlexString Vars1 = new FlexString();
	getModelManager().insertFormattedString( Var1 , Vars1 );
	getModelManager().deleteExpression( Vars1 , EngineConstants.SUPERVISOR_MODE );

	Object[] Var2 = { "_hd" , NumLabel };
	FlexString Vars2 = new FlexString();
	getModelManager().insertFormattedString( Var2 , Vars2 );
	getModelManager().deleteExpression( Vars2 , EngineConstants.SUPERVISOR_MODE );

	LastClickDraw.getDelegators().eraseNodeInfo();
	NumLabel.getDelegated().eraseNodeInfo();

	getModelManager().globalDelegationEvent( false , LastClickDraw , NumLabel );
	getModelManager().deleteDepictor( NumLabel );
	getModelManager().globalRepaint();
	}


/**
* Removes a numeric ruler from the depictor.
*/
	private void removeNumRulerFromDepic( Ruler1 NumRuler )
	{

	Object[] Var1 = { NumRuler };
	FlexString Vars1 = new FlexString();
	getModelManager().insertFormattedString( Var1 , Vars1 );
	getModelManager().deleteExpression( Vars1 , EngineConstants.SUPERVISOR_MODE );

	Object[] Var2 = { "_hd" , NumRuler };
	FlexString Vars2 = new FlexString();
	getModelManager().insertFormattedString( Var2 , Vars2 );
	getModelManager().deleteExpression( Vars2 , EngineConstants.SUPERVISOR_MODE );

	Object[] Var3 = { "_di" , NumRuler };
	FlexString Vars3 = new FlexString();
	getModelManager().insertFormattedString( Var3 , Vars3 );
	getModelManager().deleteExpression( Vars3 , EngineConstants.SUPERVISOR_MODE );

	LastClickDraw.getDelegators().eraseNodeInfo();
	NumRuler.getDelegated().eraseNodeInfo();

	getModelManager().globalDelegationEvent( false , LastClickDraw , NumRuler );
	getModelManager().deleteDepictor( NumRuler );
	getModelManager().globalRepaint();
	}


/**
* Removes a circle from the depictor.
*/
	private void removeCircleFromDepic( Circ1 DepicCirc )
	{

	Object[] Var1 = { DepicCirc };
	FlexString Vars1 = new FlexString();
	getModelManager().insertFormattedString( Var1 , Vars1 );
	getModelManager().deleteExpression( Vars1 , EngineConstants.SUPERVISOR_MODE );

	Object[] Var2 = { "_hd" , DepicCirc };
	FlexString Vars2 = new FlexString();
	getModelManager().insertFormattedString( Var2 , Vars2 );
	getModelManager().deleteExpression( Vars2 , EngineConstants.SUPERVISOR_MODE );

	LastClickDraw.getDelegators().eraseNodeInfo();
	DepicCirc.getDelegated().eraseNodeInfo();

	getModelManager().globalDelegationEvent( false , LastClickDraw , DepicCirc );
	getModelManager().deleteDepictor( DepicCirc );
	getModelManager().globalRepaint();
	}

/**
* Removes a trace from the depictor.
*/
	private void removeTracerFromDepic( Tracer1 in )
	{

	Object[] Var1 = { in };
	FlexString Vars1 = new FlexString();
	getModelManager().insertFormattedString( Var1 , Vars1 );
	getModelManager().deleteExpression( Vars1 , EngineConstants.SUPERVISOR_MODE );

	LastClickDraw.getDelegators().eraseNodeInfo();
	in.getDelegated().eraseNodeInfo();

	getModelManager().globalDelegationEvent( false , LastClickDraw , in );
	getModelManager().deleteDepictor( in );
	getModelManager().globalRepaint();
	}

/**
* Gets the trace delegate from the depictor, or null
* if there is none.
*/
	private Tracer1 getTraceDelegate()
	{
	Tracer1 ret = null;

	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		HighLevelList tmp = LastClickDraw.getDelegators();
		if( !( tmp.empty() ) )
			{
			boolean Done = false;
			boolean Found = false;
			tmp.searchHead();

			while( !Done )
				{
				if( tmp.getNode() instanceof Tracer1 )
					{
					Found = true;
					ret = (Tracer1)( tmp.getNode() );
					}				

				if( !Found ) tmp.right();
				Done = tmp.getHead() || Found;
				}
			}

		}

	return( ret );
	}


/**
* Adds a trace depictor if necessary.  Then turns
* the trace depictor on.
*/
	protected void turnTraceOn( ) throws IllegalInputException
	{
	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		Tracer1 MyTr = getTraceDelegate();
		if( MyTr == null )
			addTracerToDepic();

		MyTr = getTraceDelegate();
		if( MyTr != null )
			MyTr.setTraceOn( true );
		}
		else throw( new IllegalInputException( "You must select a compatible depictor." ) );
	}


/**
* Removes a trace depictor.
*/
	protected void removeTrace( ) throws IllegalInputException
	{
	getModelManager().globalRepaint();
	Tracer1 MyTr = getTraceDelegate();
	if( MyTr != null )
		removeTracerFromDepic( MyTr );
		else throw( new IllegalInputException( "You must select a compatible depictor." ) );

	}

/**
* Turns trace off.
*/
	protected void turnTraceOff( ) throws IllegalInputException
	{
	getModelManager().globalRepaint();
	Tracer1 MyTr = getTraceDelegate();
	if( MyTr != null )
		MyTr.setTraceOn( false );
		else throw( new IllegalInputException( "You must select a compatible depictor." ) );

	}

/**
* Clears the trace.
*/
	protected void clearTrace( ) throws IllegalInputException
	{
	getModelManager().globalRepaint();
	Tracer1 MyTr = getTraceDelegate();
	if( MyTr != null )
		MyTr.clearTrace();
		else throw( new IllegalInputException( "You must select a compatible depictor." ) );

	}


/**
* Negates the current depictor.
*/
	protected void negateDepic( ) throws IllegalInputException
	{
	if( checkDepictorTypeMatch( LastClickDraw ) )
		{
		LastClickDraw.setValuePort( 1 );
		if( LastClickDraw.portGetMovable().value >= DepictorPort.MABLE_BY_DIFFERENTIABLE )
			{
			LastClickDraw.pushDragUndo();
			DynRunner dyn = createOneShotDyn();
			Object[] lhs = { LastClickDraw };
			Object[] rhs = { " - " , "_&" , LastClickDraw };
			dyn.changeExpression( lhs , rhs );
			boolean dragSolverError = executeOneShotDyn( dyn );
			if( dragSolverError )
				throw( new IllegalInputException( "Unable to solve." ) );
			}
			else throw( new IllegalInputException( "Can not negate a constrained variable." ) );
		}
		else throw( new IllegalInputException( "You must select a compatible depictor." ) );
	}


/**
* Makes the unit depictor visible.
*/
	protected void makeUnitVisible()
	{
	DrawObj CurUnitObj = ( (GeoPadModel) getModelManager() ).getCurUnitObj( );
	CurUnitObj.setFrontLineVisible( true );
	CurUnitObj.setBackLineVisible( true );
	CurUnitObj.setTextVisible( true );
	CurUnitObj.setControlsVisible( true );
	DrawObj CurUnitCntObj = ( (GeoPadModel) getModelManager() ).getCurUnitCntObj( );
	CurUnitCntObj.setControlsVisible( true );
	getModelManager().globalRepaint();
	}


/**
* Makes the unit depictor invisible.
*/
	protected void makeUnitInvisible()
	{
	DrawObj CurUnitObj = ( (GeoPadModel) getModelManager() ).getCurUnitObj( );
	CurUnitObj.setFrontLineVisible( false );
	CurUnitObj.setBackLineVisible( false );
	CurUnitObj.setTextVisible( false );
	CurUnitObj.setControlsVisible( false );
	DrawObj CurUnitCntObj = ( (GeoPadModel) getModelManager() ).getCurUnitCntObj( );
	CurUnitCntObj.setControlsVisible( false );
	getModelManager().globalRepaint();
	}


/**
* Opens the "file" on the currently selected variable.
*/
	protected void createVarFile( ) throws IllegalInputException

	{
//	if( LastClickDraw != null )
//		{
//		GeoPadDialogBoxes.varFileDial( this , getXKit() , LastClickDraw ); 
//		}
//		else throw( new IllegalInputException( "You must select a depictor." ) );
	}


/**
* Displays the dialog to change the line height.
*/
	protected void createLineHeightDial( )
		{
//		GeoPadDialogBoxes.lineHeightDial( this , getXKit() );
		}


/**
* Displays the dialog to create a custom variable.
*/
	protected void createVarCreateDial( )
		{
//		GeoPadDialogBoxes.varCreateDial( this , getXKit() );
		}


/**
* Constrains or De-Constrains the currently selected variable.
*/
	protected void applyConstrainKey( ) throws IllegalInputException
	
	{
	DrawObj MyObj = LastClickDraw;
	boolean Works = MyObj != null;
	IntObj MyVal = new IntObj();
	MyVal.value = EngineConstants.USER_MODE;

	if( Works )
		{
		Works = ( (GeoPadModel) getModelManager() ).isSinglePanelVar( MyObj.getVectName() , false );
		}

	if( Works )
		{
		( (EduModel) getModelManager() ).makeDepictorConstant( MyObj );
		}

	if( !Works )
		throw( new IllegalInputException( "You must first select a valid variable<BR>before you can make it constant." ) );
	}


/**
Sets the input vector to the current "Position A" value.
<P>
<B>In:</B> The vector to modify, the current state of the position value.<BR>
<B>Out:</B> Input vector modified.<BR>
<B>Pre:</B> Input vector valid.<BR>
<B>Post:</B> The value of the input vector will equal the "Position A" value.<BR>
Programmed By: Thorn Green
*/
	public void setNewPosAVec( DrawObj depic , Mvec in )

			{
			if( !( depic instanceof geomdir.depictors.Compar1 ) )
				{
				int kp = 6;
				int yo = YOffset % 26;
				double p = 0.8 * ( (double)( YOffset % kp + 1 ) ) / ( (double) ( kp ) );
				double q = 10 * ( yo / kp );
				int width = retVisibleRect().width();
				int height = retVisibleRect().height();
				double xp = p * width + retVisibleRect().left;
				double yp = 0.4 * height + q + retVisibleRect().top;
				Hexar MyHex = new Hexar();
				hexglo( xp - ( XOrigin.value ) ,
					yp - ( YOrigin.value ) ,
					null , false , MyHex );
				( in ).setBasis1( MyHex.getGlo().getBasis1() );
				( in ).setBasis2( MyHex.getGlo().getBasis2() );
				YOffset++;
				}
			}


/**
Sets the input vector to the current default vector value.
<P>
<B>In:</B> The vector to modify, the current state of the position value.<BR>
<B>Out:</B> Input vector modified.<BR>
<B>Pre:</B> Input vector valid.<BR>
<B>Post:</B> The value of the input vector will equal the default vector value.<BR>
Programmed By: Thorn Green
*/
	public void setNewDeltaVec( DrawObj depic , Mvec in )

			{
			double XVect = 0.0;
			double YVect = -2.0;
			double si = Math.sin( RotOffset );
			double co = Math.cos( RotOffset );
			double ln = Math.abs( co );
			if( ln < 0.4 ) ln = 0.4;
			double xv2 = ln * Math.abs( XVect * co + YVect * si );
			double yv2 = ln * ( XVect * si + YVect * co );

			if( ( depic instanceof Dsca1 ) || ( depic instanceof Ssca1 ) ||
				( depic instanceof Ray1 ) || ( depic instanceof Line1 ) ||
				( depic instanceof Ucon1 ) )
				{
				( in ).setBasis1( ln );
				( in ).setBasis2( 0.0 );
				}
				else
				{
				( in ).setBasis1( xv2 );
				( in ).setBasis2( - yv2 / 4.0 ); //!!!!!!!!!!! negated !!!!!!!!!!!!!!!!!
				}

			RotOffset = RotOffset - 0.5;
			};

/**
* Sets the coordinate radius.
*/
	public void setCoordRad( double in )
		{ ( (GeoPadModel) getModelManager() ).handleUnitChange( in ); }

/**
* Signals the end of coordinate adjustment by a depictor.
*/
	public void endCoordAdjust( )
		{ super.endCoordAdjust(); ( (GeoPadModel) getModelManager() ).endCoordAdjust(); }

/**
* Toggles the visibility of the currently selected depictor's label.
*/
	protected void changeLabelState() throws IllegalInputException
		{
		DrawObj MyObj = LastClickDraw;

		if( MyObj != null )
			{
			MyObj.setTextVisible( !( MyObj.getTextVisible() ) );
			}
		else throw( new IllegalInputException( "You must select a depictor." ) );

		getModelManager().globalRepaint();
		}

/**
* Does nothing in this implementation because this kind of error is "expected".
*/
	public void handleDListError( DrawObj MyObj )
		{
		/* Sometimes nodes will not be found because not every GeoPadKit displays all nodes.
			For instance, rays will be shown in the geometric workspace, but not the bound
			depiction window. */
		}


/**
* Returns whether a depictor can be added to the display list.
*/
	public DrawObj checkDepic( DrawObj MyObj )
		{
		if( MyObj instanceof Ucon1 )
			{
			return( MyObj );
			}
			else
			{
			HighLevelList tmp = MyObj.getDelegated();

			if( !( tmp.empty() ) )
				{
				DrawObj drw = (DrawObj)( tmp.getNode() );

				return( checkDepic( drw ) );
				}
				else
				{
				FlexString Name = MyObj.getVectName();
				boolean Works = true;
				DrawObj ret = null;

				Works = ( (GeoPadModel) getModelManager() ).isSinglePanelVar( Name , true );

				if( Works ) ret = MyObj;
				return( ret );
				}
			}

		}


/**
* Adds the depictor's delegates to the display list.
*/
	public void addNodeDelegates( DrawObj in )
		{
		HighLevelList MyList = in.getDelegators();

		if( !( MyList.empty() ) )
			{
			MyList.searchHead();
			boolean Done = false;

			while( !Done )
				{
				DrawObj MyObj = (DrawObj)( MyList.getNode() );
				addNodeDelegates( MyObj );

				super.localDisplayAppend( in );
				}
			}

		}


/**
* Checks whether an object in a delegation event should be added to the depiction.
*/
	protected boolean checkDelegationAdd( DrawObj FromObj , DrawObj ToObj )
		{
		HighLevelList DisplayList = getDispList();
		DrawObj chk = checkDepic( FromObj );
		boolean Works = ( chk != null );

		if( Works )
			{
			boolean Done = false;
			DrawObj ret = null;

			if( !( DisplayList.empty() ) )
				{
				DisplayList.searchHead();
				while( !Done )
					{
					DrawObj ThisDrw;
					DGMNode MyDGM = (DGMNode) DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if( MyDrw == chk )
						ret = MyDrw;

					DisplayList.right();
					Done = DisplayList.getHead();
					}
				}

			Works = ( ret != null );
			}

		return( Works );
		}


/**
* Handles a delegation event.
*/
	public void localDelegationEvent( boolean Add , DrawObj FromObj , DrawObj ToObj )
		{
		if( Add && !( ( ToObj instanceof Tracer1 ) /* && ( BoundMode ) !!!!!!!! */ ) )
			{
			boolean Works = checkDelegationAdd( FromObj , ToObj );

			if( Works )
				{
				addNodeDelegates( ToObj );

				super.localDisplayAppend( ToObj );
				}
			}
		}


/**
* Handles the addition of a depictor to the model.
*/
	public void localDisplayAppend( DrawObj MyObj )

		{
		boolean Works = ( checkDepic( MyObj ) != null );

		if( Works ) 
			{
			boolean Works2 = ( (GeoPadModel) getModelManager() ).checkDepicUnique( MyObj );

			if( Works2 ) super.localDisplayAppend( MyObj );
			}
		}


/**
* Handles Ether Events.
*/
	public Object processObjEtherEvent( EtherEvent in , Object refcon )
		throws Throwable
		{
		boolean handled = false;

		if( in instanceof GeomKitEtherEvent )
			{
			if( in.getEtherID().equals( GeomKitEtherEvent.changeDepicLabel ) )
				{
				changeDepicNumLabel();
				handled = true;
				}

			}


		if( in instanceof SuiEtherEvent )
			{
			if( in.getEtherID().equals( SuiEtherEvent.createRuler ) )
				{
				Object[] param = (Object[])( in.getParameter() );
				Boolean p1 = (Boolean)( param[ 0 ] );
				String p2 = (String)( param[ 1 ] );
				changeDepicNumRuler( p1.booleanValue() , p2 );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.changeLabelState ) )
				{
				changeLabelState();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.constrainKey ) )
				{
				applyConstrainKey();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createRulerDialog ) )
				{
				createRulerDialog();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.bezierKey ) )
				{
				createBezierDialog();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createUnitDialog ) )
				{
				createUnitDialog();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.makeUnitVisible ) )
				{
				makeUnitVisible();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.makeUnitInvisible ) )
				{
				makeUnitInvisible();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.turnTraceOn ) )
				{
				turnTraceOn();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.turnTraceOff ) )
				{
				turnTraceOff();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.removeTrace ) )
				{
				removeTrace();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.clearTrace ) )
				{
				clearTrace();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.changeDepicNumLabel ) )
				{
				changeDepicNumLabel();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.negateDepic ) )
				{
				negateDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createVarFile ) )
				{
				createVarFile();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.changeDepicCircled ) )
				{
				changeDepicCircled();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createLineHeightDialog ) )
				{
				createLineHeightDial();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.createScalar ) )
				&& ( ViewTarget == null ) )
				{
				keyCreateScalar();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.createVector ) )
				&& ( ViewTarget == null ) )
				{
				keyCreateVector();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.createPhasor ) )
				&& ( ViewTarget == null ) )
				{
				keyCreatePhasor();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.createBivector ) )
				&& ( ViewTarget == null ) )
				{
				keyCreateBivector();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.varCreate ) )
				&& ( ViewTarget == null ) )
				{
				createVarCreateDial();
				handled = true;
				}

			if( ( in.getEtherID().equals( SuiEtherEvent.createNamedDepic ) )
				&& ( ViewTarget == null ) )
				{
				Object[] param = (Object[])( in.getParameter() );
				String DepicName = (String)( param[ 0 ] );
				String TypeName = (String)( param[ 1 ] );
				keyCreateNamed( DepicName , TypeName );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.hideDepic ) )
				{
				hideCurrentDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestSchemeChg ) )
				{
				createSchemeDialog();
				handled = true;
				}


			}


		if( !handled ) return( super.processObjEtherEvent( in , refcon ) );
		return( null );
		}

/**
* Creates an algebraic workspace.  Use for initialization only.
*/
	public GeoPadAlgPanel createAlgPanel( TwoDScrollView _jsc )
		{ 
		GeoPadAlgPanel MyPan = new GeoPadAlgPanel( contextS , (GeoPadModel) getModelManager() , _jsc );
		setAlgPanel( MyPan );
		return( MyPan );
		};

/**
* Returns the "type" of the kit so that the "proper" origin can be displayed.
*/
	public int getGeomKitType( )
		{ return( 2 ); }

/**
* Creates the unit dialog.
*/
	protected void createUnitDialog( )
		{ /* GeoPadDialogBoxes.unitDial( this ); */ }

/**
* Creates the ruler dialog.
*/
	protected void createRulerDialog( )
		{ /* GeoPadDialogBoxes.rulerDial( this ); */ }

/**
* Creates the bezier dialog.
*/
	protected void createBezierDialog( )
		{ /* GeoPadDialogBoxes.bezierDial( this , getXKit() ); */ }

/**
* Creates the scheme dialog.
*/
	protected void createSchemeDialog( )
		{ /* GeoPadDialogBoxes.schemeDial( this , ( (GeoPadModel) getModelManager() ).getInitialCols() , getXKit() ); */ }

/**
* Creates the "variable file" window.
*/
	public void handleCreateVarFileKey( ) throws IllegalInputException
		{ createVarFile(); }


/**
* Gets the panel holding the pull-down menus.
*/
/*	Container getMenuCardPanel()
		{ return( MenuCardPanel ); } */

/**
* Sets the panel holding the pull-down menus.  Use for initialization only.
*/
//	void setMenuCardPanel( Container in )
//		{
//		MenuCardPanel = in; 
//
//		/* if( MenuBar != null )
//			{ ((JFrame)MenuCardPanel).setJMenuBar( MenuBar ); } */
//		}

//	void setPanelCardComponent( Container in )
//		{ PanelCardComponent = in; }

/**
* Gets the menu bar.
*/
//	JMenuBar getMenuBar()
//		{ return( MenuBar ); }

/**
* Sets the menu bar.  Use for initialization only.
*/
//	void setMenuBar( JMenuBar in )
//		{ 
//		MenuBar = in;
//
//		/* if( MenuCardPanel != null )
//			{ ((JFrame)MenuCardPanel).setJMenuBar( MenuBar ); } */
//		}

	void resetCardPanel( )
		{ 
		/* PanelCardComponent.invalidate(); PanelCardComponent.validate(); PanelCardComponent.doLayout(); */
		/* PanelCardComponent.add( "any" , ... ); */ }

/**
* Sets the divider between free and bound depictions.  Use for initialization only.
*/
//	void setVarDivider( JSplitPane in )
//		{ ( (GeoPadModel) getModelManager() ).setVarDivider( in ); }
/**
* Sets the free/bound depiction divider to show only the free depiction.
*/
//	void setMaxFreeDepic( )
//		{ ( (GeoPadModel) getModelManager() ).setMaxFreeDepic(); }
/**
* Sets the free/bound depiction divider to show only the bound depiction.
*/
//	void setMaxBoundDepic( )
//		{ ( (GeoPadModel) getModelManager() ).setMaxBoundDepic(); }
/**
* Sets the divider between geometric and algebraic workspaces.  Use for initialization only.
*/
//	void setWorkDivider( JSplitPane in )
//		{ ( (GeoPadModel) getModelManager() ).setWorkDivider( in ); }

/**
* Sets the algebraic workspace in which the kit operates.  Use for initialization only.
*/
	void setAlgPanel( GeoPadAlgPanel in )
		{ ( (GeoPadModel) getModelManager() ).setAlgPanel( in ); }

/**
* Sets the tool object.  Use for initialization only.
*/
	void setToolObject( Object in )
		{ ( (GeoPadModel) getModelManager() ).setToolObject( in ); }

/**
* Sets the root pane in which the kit operates.  Use for initialization only.
*/
//	void setRootPane( JRootPane in )
//		{ RootPane = in; }

/**
* Loads object data from a TransVersionBuffer.
*/
//	protected GeoPadKit retLoadObjectData( TransVersionBuffer in ) throws IOException
//		{ return( ( (GeoPadModel) getModelManager() ).loadObjectData( in ) ); }

/**
* Saves object data to a TransVersionBuffer.
*/
//	protected void saveObjectData( TransVersionBuffer in )
//		{ ( (GeoPadModel) getModelManager() ).saveObjectData( in ); }

	static final long serialVersionUID = ( GeoPadKit.class ).getName().hashCode()
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

			KeyParamOneDGM = (DGMNode)( myv.getProperty( "KeyParamOneDGM" ) );
			KeyParamTwoDGM = (DGMNode)( myv.getProperty( "KeyParamTwoDGM" ) );
			KeyParamThreeDGM = (DGMNode)( myv.getProperty( "KeyParamThreeDGM" ) );
			KeyParamFourDGM = (DGMNode)( myv.getProperty( "KeyParamFourDGM" ) );

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

		if( KeyParamOneDGM != null ) myv.setProperty( "KeyParamOneDGM" , KeyParamOneDGM );
		if( KeyParamTwoDGM != null ) myv.setProperty( "KeyParamTwoDGM" , KeyParamTwoDGM );
		if( KeyParamThreeDGM != null ) myv.setProperty( "KeyParamThreeDGM" , KeyParamThreeDGM );
		if( KeyParamFourDGM != null ) myv.setProperty( "KeyParamFourDGM" , KeyParamFourDGM );

		super.writeExternal( out );
		out.writeObject( myv ); */
		}

//	private Container PanelCardComponent = null;
//	public JMenuBar MenuBar = null;
//	private Container MenuCardPanel = null;
//	public JRootPane RootPane = null;


/**
* Gets the DGMNode associated with a depictor, or null if there is none.
*/
	public DGMNode getNodeDGM( DrawObj MyNode )
		{
		DGMNode NdDGM = null;

		if( !( DispList1.empty() ) )
			{
			boolean Done = false;
			DispList1.searchHead();
			while( !Done )
				{
				DrawObj ThisDrw;
				DGMNode MyDGM = (DGMNode) DispList1.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				if( MyNode == MyDrw )
					{
					NdDGM = MyDGM;
					Done = true;
					}

				DispList1.right();
				Done = Done || DispList1.getHead();
				}
			}

		return( NdDGM );
		}

/**
* Handles the clearing of the model.
*/
	public void localClearModel( )
		{
		super.localClearModel();

		XOrigin.value = 1000 + 100;
		YOrigin.value = 1000 + 100;
		localSetCoordRad( 80 );
		getModelManager().handleCoordRenderUpdate( 72.0 );
		RealAng.value = 135;
		ImAng.value = 135;
		RealBar.value = 50;
		ImBar.value = 50;
		Axes[ 0 ][ 0 ] = 1.0;
		Axes[ 0 ][ 1 ] = 0.0;
		Axes[ 1 ][ 0 ] = 0.0;
		Axes[ 1 ][ 1 ] = -1.0;
		ArcToolRad.value = 20;
		AxisRad.value = 50;
		ArrLen = 6.0;
		KeyParamOneDGM = null;
		KeyParamTwoDGM = null;
//		jsc.scrollTo( 700 , 1050 );
		}


/**
* Adjustment call for objects that want to print from the corner of the scroll pane.
* Overrides method in parent class.
*/
	protected Mvec prePrintAdjustOrigin( )
		{
		return( prePrintAdjustOriginLocal() );
		}

/**
* Overrides the inherited method to prevent visibility changes.
* In the GeoPad kit, the child views are not sepatate windows.
*/
	protected void winStop()
		{
		}


/**
* Checks whether the depictor has the proper type to be used symbolicly.
*/
	protected boolean checkDepictorTypeMatch( DrawObj in )
		{ return( ( (GeoPadModel) getModelManager() ).checkDepictorTypeMatch( in ) ); }



/**
* Sets the DGMNode associated with the first parameter of a expression.
*/
	public void setParamOneDGM( DGMNode MyDGM )
		{
		KeyParamOneDGM = MyDGM;
		}

/**
* Sets the DGMNode associated with the second parameter of a operator expression.
*/
	public void setParamTwoDGM( DGMNode MyDGM )
		{
		KeyParamTwoDGM = MyDGM;
		}

/**
* Sets the DGMNode associated with the third parameter of a operator expression.
*/
	public void setParamThreeDGM( DGMNode MyDGM )
		{
		KeyParamThreeDGM = MyDGM;
		}

/**
* Sets the DGMNode associated with the fourth parameter of a operator expression.
*/
	public void setParamFourDGM( DGMNode MyDGM )
		{
		KeyParamFourDGM = MyDGM;
		}

/**
* Sets the DGMNode associated with the fifth parameter of a operator expression.
*/
	public void setParamFiveDGM( DGMNode MyDGM )
		{
		KeyParamFiveDGM = MyDGM;
		}

/**
* Gets the DGMNode associated with the first parameter of a expression.
*/
	public DGMNode getParamOneDGM( )
		{
		return( KeyParamOneDGM );
		}

/**
* Gets the DGMNode associated with the second parameter of a operator expression.
*/
	public DGMNode getParamTwoDGM( )
		{
		return( KeyParamTwoDGM );
		}

/**
* Gets the DGMNode associated with the third parameter of a operator expression.
*/
	public DGMNode getParamThreeDGM( )
		{
		return( KeyParamThreeDGM );
		}

/**
* Gets the DGMNode associated with the fourth parameter of a operator expression.
*/
	public DGMNode getParamFourDGM( )
		{
		return( KeyParamFourDGM );
		}

/**
* Gets the DGMNode associated with the last depictor selected.
*/
	public DGMNode getLastClickDGM1( )
		{
		return( LastClickDGM1 );
		}

/**
* Gets the animation result.
*/
	public DrawObj getAnimResultObj( )
		{
		return( AnimResultObj );
		}
/**
* Sets the animation result.
*/
	public void setAnimResultObj( DrawObj in )
		{
		AnimResultObj = in;
		}


	DGMNode KeyParamOneDGM = null;
	DGMNode KeyParamTwoDGM = null;
	DGMNode KeyParamThreeDGM = null;
	DGMNode KeyParamFourDGM = null;
	DGMNode KeyParamFiveDGM = null;
	}




