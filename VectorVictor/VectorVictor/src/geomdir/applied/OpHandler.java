




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


import verdantium.*;
import verdantium.kluges.*;
import meta.*;
import geomdir.*;
import geomdir.depictors.*;
import geomdir.engine.EngineConstants;
import android.graphics.PointF;
import android.graphics.Color;




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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | OpHandler knew too much about how depictors were clustered.          | Changed OpHandler to get DGMNodes from the DrawObjFactory instead of the central data store.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Unusually slow performance on certain diagrams.                      | Factored out performance bottleneck.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 10/22/2001            | Thorn Green (viridian_1138@yahoo.com)           | The progress bars are now a drag on performance.                     | Placed the progress bar code in comments.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | Perform addition / multiplication in GeoSlate.                       | Transplanted GeoPad's capability into GeoSlate.
*    | 08/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Put multiplication / division result on flat (GeoSlate scalars).     | Performed modifications to implement this.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Support BlueToh solver ; some code obviated by BlueToh solver.       | Made a series of code changes (mostly simplifications) with BlueToh in mind.
*    | 09/08/2002            | Thorn Green (viridian_1138@yahoo.com)           | Different label positions requested for GeoSlate.                    | Changed the label positions.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed compound diagram support for GeoCard.                         | Added compound diagram support.
*    | 09/24/2002            | Thorn Green (viridian_1138@yahoo.com)           | Bug in assign op.                                                    | Fixed bug.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Multiple changes to diagrams (GeoCard).                              | Made multiple changes to diagrams.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Made a series of small cosmetic changes.                             | Made a series of small cosmetic changes.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Made a series of small cosmetic changes.                             | Made a series of small cosmetic changes.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Subtraction diagram needed help (GeoCard).                           | Made an experimental modification to the diagram.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for change in width based on a < b relations.         | Made changes to scalar addition and subtraction diagrams to do this.
*    | 10/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | Width change considered to be bad.                                   | Changed width change.
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Changed CrossTac in Ssca1.                                           | Changed OpHandler to link to Ssca1 change.
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve comparison operation (GeoCard).                              | Made several changes to comparison operator.
*    | 10/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve comparison operation (GeoCard).                              | Changed label positions in comparison op.
*    | 10/05/2002            | Thorn Green (viridian_1138@yahoo.com)           | Angle in scalar comparison op. too large.                            | Made angle smaller.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 10/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve magnitude operator (GeoCard).                                | Improved magnitude operator.
*    | 10/08/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add more unit tacs to multiplication wedge.                          | Added more unit tacs to wedge.
*    | 10/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Slight performance enhancement.                                      | Slight performance enhancement.
*    | 10/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add tics to horizontal in scalar multiplication (GeoCard).           | Added tics to horizontal in scalar multiplication.
*    | 10/14/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dlike proportion operator (GeoCard).                                 | Introduced Dlike proportion.
*    | 10/14/2002            | Thorn Green (viridian_1138@yahoo.com)           | Proportion variant #1 was bad.                                       | Switched to proportion variant #2.
*    | 10/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Put horiz. ticks on scalar division.                                 | Put horiz. ticks on scalar division.
*    | 10/29/2002            | Thorn Green (viridian_1138@yahoo.com)           | Create Multi-Window Graphing (GeoCard).                              | Created Multi-Window Graphing.
*    | 10/29/2002            | Thorn Green (viridian_1138@yahoo.com)           | Revise Multi-Window Graphing (GeoCard).                              | Revised Multi-Window Graphing.
*    | 11/05/2002            | Thorn Green (viridian_1138@yahoo.com)           | Continuous graphing for GeoCard.                                     | Implemented continuous graphing for GeoCard.
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



/* The source code in this file implements pedagogy.  Don't try to understand it.
	Just accept it. */


/**
* Implements a series of algebraic operations in a manner that hopefully
* is consistent with pedagogy.
* @author Thorn Green
*/
class OpHandler
	{
	private EduModel Manager = null;
	private EduKit MyKit = null;
	// private Integer DirecColor = new Color.rgb( 0 , 166 , 200 );
	private Integer DirecColor = Color.rgb( 192 , 192 , 192 );
	private Integer DirecArcColor = Color.rgb( 206 , 0 , 199 );
	private Integer ParamOneColor = Color.rgb( 128 , 128 , 0 );
	private Integer ParamTwoColor = Color.rgb( 192 , 64 , 0 );
	private int DirType = Direc1.DirNone;
	private String uName = "u";
	private boolean ScalingUnit = true;
	private boolean UsingScalarWedge = true;
	private boolean BladeAddOnly = false;
	private boolean useBlinking = true;
	private boolean useInDx = false;
	final static long BlinkInt = 250;
	final static boolean DebugMode = false;

	public final static int NoUniDimensionalScalars = 0;
	public final static int UniDimensionalAngleResult = 1;
	public final static int UniDimensionalFlatResult = 2;
	private int UniDimensionalScalars = NoUniDimensionalScalars;

	final static int AdditionMode = 16;
	final static int SubtractionMode = 17;
	final static int ComparisonMode = 18;


	public OpHandler( EduKit InKit , EduModel InMan )
		{
		MyKit = InKit;
		Manager = InMan;
		}


/**
* Performs an animation operation.
*/
	void doAnimation( HighLevelList ChgList , HighLevelList SrcList ,
		HighLevelList DstList , int NumFrame )
		{
		if( UseAnimation )
			{
			/* int count;

			for( count = 0 ; count < NumFrame ; count++ )
				{
				double u = ((double) count ) / 
					((double)( NumFrame - 1 ) );

				if( !( ChgList.empty() ) )
					{
					ChgList.searchHead();
					SrcList.searchHead();
					DstList.searchHead();
					boolean Done = false;
					while( !Done )
						{
						Mvec chg = (Mvec) ChgList.getNode();
						Mvec src = (Mvec) SrcList.getNode();
						Mvec dst = (Mvec) DstList.getNode();
						Mvec tmp1 = new Mvec();
						Mvec tmp2 = new Mvec();

						src.scale( 1 - u , tmp1 );
						dst.scale( u , tmp2 );
						tmp1.add( tmp2 , chg );

						ChgList.right();
						SrcList.right();
						DstList.right();
						Done = ChgList.getHead();
						}
					}

				Manager.globalSynchPaint();
				} */
			}
		}


/**
* Performs a test animation.
*/
	void firstCut( )
		{
		FragNode nodeA = Manager.getVarList().getFrag( new FlexString( "a" ) );
		DrawObj objA = ( (DGMNode)( nodeA.getFragMap().getFirstNode() ) ).getMyDraw();
		DGMNode objaDGM = (DGMNode)( nodeA.getFragMap().getFirstNode() );

		FragNode nodeB = Manager.getVarList().getFrag( new FlexString( "b" ) );
		DrawObj objB = ( (DGMNode)( nodeB.getFragMap().getFirstNode() ) ).getMyDraw();
		DGMNode objbDGM = (DGMNode)( nodeB.getFragMap().getFirstNode() );

		addAnimate( objA , objB , objaDGM , objbDGM , false );
		}


	public void setUnitName( String in )
		{ uName = in; }
	public void setScalingUnit( boolean in )
		{ ScalingUnit = in; }
	public void setUniDimensionalScalars( int in )
		{ UniDimensionalScalars = in; }
	public int getUniDimensionalScalars( )
		{ return( UniDimensionalScalars ); }
	public boolean isScalarUniDimensional( )
		{ return( UniDimensionalScalars != NoUniDimensionalScalars ); }
	protected Integer getDirecColor( )
		{ return( DirecColor ); }
	protected Integer getDirecArcColor( )
		{ return( DirecArcColor ); }
	protected Integer getParamOneColor( )
		{ return( ParamOneColor ); }
	protected Integer getParamTwoColor( )
		{ return( ParamTwoColor ); }
	protected boolean getUseBlinking( )
		{ return( useBlinking ); }
	public void setUseBlinking( boolean in )
		{ useBlinking = in; }
	public void setUseInDx( boolean in )
		{ useInDx = in; }

	
	protected boolean isRebuildableDepic( DrawObj obj )
		{
		return( MyKit.isRebuildableDepic( obj ) );
		}


	protected void engageDelegation( DrawObj Master , DrawObj Slave )
		{
		Master.getDelegators().insertRight( Slave );
		Slave.getDelegated().insertRight( Master );
		Manager.globalDelegationEvent( true , Master , Slave );
		}


	protected void blinkObject( DrawObj objC )
		{
		if( useBlinking )
			{
			/* Manager.globalSynchPaint();
			synchronized( this ) { try{ wait( BlinkInt ); } 
				catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }; }
			objC.setFrontLineVisible( false );
			objC.setBackLineVisible( false );
			objC.setTextVisible( false );
			objC.setControlsVisible( false );
			Manager.globalSynchPaint();
			synchronized( this ) { try{ wait( BlinkInt ); } 
				catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }; }
			objC.setFrontLineVisible( true );
			objC.setBackLineVisible( true );
			objC.setTextVisible( true );
			objC.setControlsVisible( true );
			Manager.globalSynchPaint();
			synchronized( this ) { try{ wait( BlinkInt ); } 
				catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }; }
			objC.setFrontLineVisible( false );
			objC.setBackLineVisible( false );
			objC.setTextVisible( false );
			objC.setControlsVisible( false );
			Manager.globalSynchPaint();
			synchronized( this ) { try{ wait( BlinkInt ); } 
				catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }; }
			objC.setFrontLineVisible( true );
			objC.setBackLineVisible( true );
			objC.setTextVisible( true );
			objC.setControlsVisible( true );
			Manager.globalSynchPaint(); */
			}
		}


	private void preDeleteObj( DrawObj in )
		{
		in.setFrontLineVisible( false );
		in.setBackLineVisible( false );
		in.setTextVisible( false );
		in.setControlsVisible( false );
		}


	private void postDeleteObj( DrawObj in )
		{
		if( ( in.noSymBindings() ) && ( !DebugMode ) )
			{
			Manager.deleteDepictor( in );
			}
		}


	private boolean UseOuterParens = true;
	private boolean ParamOneAtomic = true;
	private boolean ParamTwoAtomic = true;
	private boolean UseReplaceName = false;
	private FlexString ReplaceName = null;
	private boolean UseAnimation = true;

	public void setReplaceName( FlexString in )
		{ UseReplaceName = true; ReplaceName = in; }

	public void setUseOuterParens( boolean in )
		{ UseOuterParens = in; }

	public void setParamOneAtomic( boolean in )
		{ ParamOneAtomic = in; }

	public void setParamTwoAtomic( boolean in )
		{ ParamTwoAtomic = in; }

	public void setUseAnimation( boolean in )
		{ UseAnimation = in; }
	
	private void createBinaryOpName( DrawObj objA , String Op , DrawObj objB , FlexString resvarname )
		{
		resvarname.setInsertPoint( 0 );

		if( UseReplaceName )
			{
			ReplaceName.insertString( resvarname );
			}
			else
			{
			resvarname.insertJavaString( "<APPLY>" );
			if( UseOuterParens ) resvarname.insertJavaString( "(" );
			if( !ParamOneAtomic ) resvarname.insertJavaString( "(" );
			objA.getVectName().insertString( resvarname );
			if( !ParamOneAtomic ) resvarname.insertJavaString( ")" );
			resvarname.insertJavaString( Op );
			if( !ParamTwoAtomic ) resvarname.insertJavaString( "(" );
			objB.getVectName().insertString( resvarname );
			if( !ParamTwoAtomic ) resvarname.insertJavaString( ")" );
			if( UseOuterParens ) resvarname.insertJavaString( ")" );
			resvarname.insertJavaString( "</APPLY>" );
			}
		}


	private void createUnaryOpName( DrawObj objA , String Op , FlexString resvarname )
		{
		resvarname.setInsertPoint( 0 );

		if( UseReplaceName )
			{
			ReplaceName.insertString( resvarname );
			}
			else
			{
			resvarname.insertJavaString( "<APPLY>" );
			if( UseOuterParens ) resvarname.insertJavaString( "(" );
			resvarname.insertJavaString( Op );
			if( !ParamOneAtomic ) resvarname.insertJavaString( "(" );
			objA.getVectName().insertString( resvarname );
			if( !ParamOneAtomic ) resvarname.insertJavaString( ")" );
			if( UseOuterParens ) resvarname.insertJavaString( ")" );
			resvarname.insertJavaString( "</APPLY>" );
			}
		}


	protected DrawObj createGeneralMvec( int Domain , DrawObjFactory MyFac )
		{
		String TypeName1 = null;
		String TypeName2 = null;

		int VDomain = Domain & ( GeomConstants.DOM_VECT1 + GeomConstants.DOM_VECT2 );
		if( VDomain != 0 )
			TypeName1 = "Vector Type I";

		int PDomain = Domain - VDomain;

		switch( PDomain )
			{
			case GeomConstants.DOM_SCA:
				TypeName2 = "ModSegment Scalar Type I";
				break;

			case GeomConstants.DOM_SCA + GeomConstants.DOM_PSU:
				TypeName2 = "GA Phasor Type I";
				break;

			case GeomConstants.DOM_PSU:
				TypeName2 = "Para. Bivector Type I";
				break;
			}

		DrawObj objC1 = null;
		DrawObj objC2 = null;

		if( TypeName1 != null )
			{
			MyFac.setDepicClass( TypeName1 );
			objC1 = MyFac.createDepictor();
			}

		if( TypeName2 != null )
			{
			MyFac.setDepicClass( TypeName2 );
			objC2 = MyFac.createDepictor();
			}

		DrawObj objC = objC1;
		if( objC == null ) objC = objC2;

		return( objC );
		}


/**
* Adds two depictors.
*/
	public boolean addAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{
		boolean flag = false;
		int DomA = objAI.vectGetExtDomain().value;
		int DomB = objBI.vectGetExtDomain().value;

		if( !Simp ) {

		if( DomA == ( DepictorPort.DOM_SCA ) )
		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( DomB == ( DepictorPort.DOM_SCA ) )
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				sscaAddAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}


		if( DomA == ( DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2 ) )
		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( DomB == ( DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2 ) )
			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				vectAddAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

		if( DomA == ( DepictorPort.DOM_SCA + DepictorPort.DOM_PSU ) )
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( DomB == ( DepictorPort.DOM_SCA + DepictorPort.DOM_PSU ) )
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				phasAddAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

			}


		if( !flag )
			{
			flag = !( generalAddAnimateSimp( objAI , objBI , objaDGM , objbDGM ) );
			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Adds two phasors.
*/
	protected void phasAddAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" /* objAI , false */ );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		Mvec tca = new Mvec();
		tca.setBasis1( 1.0 );
		objA.preferredDirection( tca );
		objB.preferredDirection( tca );


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */
		

	
		createBinaryOpName( objA , "+" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " + " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

	
		FlexString res2;
		FlexString exp2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_md" , objA , " \\- " , "_hd" , objA , " \\+ " , "_hd" , objC };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA , " \\+ UnitOf( " , 
			"_md" , objA , " \\- " , "_hd" , objA , " ) * " , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_md" , objA , " \\- " , "_hd" , objA , " \\+ " , "_hd" , objB };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		objA.preferredDirection( tca );
		objB.preferredDirection( tca );
		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		Mvec tc = new Mvec();
		tc.setBasis1( 1.0 );
		objC.preferredDirection( tc );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Adds two vectors.
*/
	protected void vectAddAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setFrontLineColor( objAI.getFrontLineColor() );
		MyFac.setBackLineColor( objAI.getBackLineColor() );
		MyFac.setTextColor( objAI.getTextColor() );
		MyFac.setPlaceAt( OutPt );
		objA = MyFac.createDepictor();
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			naDGM = MyFac.getLastDGM();
			// objA.setTextVisible( false );
			}



		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setFrontLineColor( objBI.getFrontLineColor() );
		MyFac.setBackLineColor( objBI.getBackLineColor() );
		MyFac.setTextColor( objBI.getTextColor() );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}
		// objB.setTextVisible( false );




		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		/* mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn ); */
		mvcatl.copyAllInfo( tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 3;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	



		createBinaryOpName( objA , "+" , objB , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " + " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		// objC.setTextVisible( false );
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		FlexString res2;
		FlexString exp2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		/* blinkObject( objC ); */
		}


	protected boolean generalAddAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		int Domain = ( objAI.portGetExtDomain() ) | ( objBI.portGetExtDomain() );
		boolean err = true;

		generalAddAnimateSimp( objAI , objBI , objaDGM , objbDGM , Domain );

		return( err );
		}


	protected DrawObj generalAddAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		int Domain )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "+" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " + " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );

		DrawObj objC = createGeneralMvec( Domain , MyFac );
		DGMNode ncDGM = MyFac.getLastDGM();		

		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}



/**
* Adds two scalars.
*/
	protected void sscaAddAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				( (Ssca1) objB ).setOffsetText( 0.25 * 40 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				}
				break;
			}

		
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objB.positiveDirection( objA.getPositiveDirection( ) );
		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 6;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "+" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " + " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();

		// objC.setFrontLineVisible( false );
		// objC.setBackLineVisible( false );
		// objC.setTextVisible( false );


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setOffsetText( - ( (Ssca1) objA ).getOffsetText() ); }
		if( objB instanceof Ssca1 )
			{ ( (Ssca1) objB ).setEndTag( );
				( (Ssca1) objB ).setOffsetText( - ( (Ssca1) objB ).getOffsetText() ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( );
				( (Ssca1) objC ).setUnitCrossTac( false );
				( (Ssca1) objC ).setEndCrossTac( false ); }


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		FlexString exp2;
		FlexString res2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objC };
		Manager.insertFormattedString( hdb , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objB };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA , " \\+ ( " , objA , " * " , "_di" , objA , " )" };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objA };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objA };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] flb = { "_flw" , objB };
		Manager.insertFormattedString( flb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] flbc = { "scasubwid( " , objA , " , " , objB , " ) " };
		Manager.insertFormattedString( flbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );
		
		Mvec tx = new Mvec();
		mvcbtl.sub( mvcapos , tx );
		Mvec txlen = new Mvec();
		tx.mcpy( txlen );
		txlen.magnitude();
		if( txlen.getBasis() < 0.0001 ) tx.setBasis1( 1.0 );
		objC.preferredDirection( tx );
		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		( Manager.getMyEngine() ).resolveConstraints();

		Manager.bringToFront( objC );

		/* MyKit.getXKit().hideLoadFrame(); */

		/* blinkObject( objC ); */
		}



/**
* Subtracts two depictors.
*/
	public boolean subAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{
		boolean flag = false;
		int DomA = objAI.vectGetExtDomain().value;
		int DomB = objBI.vectGetExtDomain().value;

		if( !Simp ) {
		if( DomA == ( DepictorPort.DOM_SCA ) )
		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( DomB == ( DepictorPort.DOM_SCA ) )
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				sscaSubAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}


		if( DomA == ( DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2 ) )
		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( DomB == ( DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2 ) )
			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				vectSubAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

		if( DomA == ( DepictorPort.DOM_SCA + DepictorPort.DOM_PSU ) )
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( DomB == ( DepictorPort.DOM_SCA + DepictorPort.DOM_PSU ) )
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				phasSubAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

			}


		if( !flag )
			{
			flag = !( generalSubAnimateSimp( objAI , objBI , objaDGM , objbDGM ) );
			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Subtracts two phasors.
*/
	protected void phasSubAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		


		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		Mvec tca = new Mvec();
		tca.setBasis1( 1.0 );
		Mvec tca2 = new Mvec();
		tca2.setBasis1( -1.0 );
		objA.preferredDirection( tca );
		objB.preferredDirection( tca2 );


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcatl.add( mvcbtl , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbtl , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.copyAllInfo( tmp2 );
		tmp2.setBasis1( tmp2.getBasis1() + 1.0 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "-" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " - " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		FlexString res2;
		FlexString exp2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_md" , objA , " \\- " , "_hd" , objA , " \\+ " , "_hd" , objC };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA , " \\+ UnitOf( " , 
			"_md" , objA , " \\- " , "_hd" , objA , " ) * " , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objA , " \\- " , "_md" , objA , " \\+ " , "_hd" , objB };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		objA.preferredDirection( tca );
		objB.preferredDirection( tca2 );
		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		Mvec tc = new Mvec();
		tc.setBasis1( 1.0 );
		objC.preferredDirection( tc );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Subtracts two vectors.
*/
	protected void vectSubAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setFrontLineColor( objAI.getFrontLineColor() );
		MyFac.setBackLineColor( objAI.getBackLineColor() );
		MyFac.setTextColor( objAI.getTextColor() );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}
		// objA.setTextVisible( false );

		

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type II" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setFrontLineColor( objBI.getFrontLineColor() );
		MyFac.setBackLineColor( objBI.getBackLineColor() );
		MyFac.setTextColor( objBI.getTextColor() );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}
		// objB.setTextVisible( false );

		

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();


		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		/* mvcatl.add( mvcbtl , ta1 );
		ta1.scale( 0.5 , tposn ); */
		mvcatl.copyAllInfo( tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbtl , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 3;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		createBinaryOpName( objA , "-" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " - " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		// objC.setTextVisible( false );
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		FlexString res2;
		FlexString exp2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		/* blinkObject( objC ); */
		}





protected boolean generalSubAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		int Domain = ( objAI.portGetExtDomain() ) | ( objBI.portGetExtDomain() );
		boolean err = true;

		generalSubAnimateSimp( objAI , objBI , objaDGM , objbDGM , Domain );

		return( err );
		}


	protected DrawObj generalSubAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		int Domain )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "-" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " - " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );

		DrawObj objC = createGeneralMvec( Domain , MyFac );
		DGMNode ncDGM = MyFac.getLastDGM();		

		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );
		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}


/**
* Subtracts two scalars.
*/
	protected void sscaSubAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objBm = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		FlexString bmName = new FlexString();
		bmName.insertJavaString( "<APPLY>-" );
		objBI.getVectName().insertString( bmName );
		bmName.insertJavaString( "</APPLY>" );
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( bmName );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		objBm = MyFac.createDepictor();
		nbDGM = MyFac.getLastDGM();

		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				( (Ssca1) objBm ).setOffsetText( 0.5 * 40 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				}
				break;
			}

		
//		objAI.setValuePort( 0 );
//		objA.setValuePort( 0 );
//		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
//		Mvec mvcA = objA.portGetVect();

//		objBm.positiveDirection( objA.getPositiveDirection( ) );
//		objBI.setValuePort( 0 );
//		objB.setValuePort( 0 );
//		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
//		Mvec mvcB = objB.portGetVect();


//		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
//		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
//		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
//		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

//		HighLevelList ChgList = new HighLevelList();
//		HighLevelList SrcList = new HighLevelList();
//		HighLevelList DstList = new HighLevelList();

//		ChgList.insertRight( mvcA );
//		ChgList.insertRight( mvcB );
//		Mvec tmp1 = new Mvec();
//		tmp1.setBasis1( mvcA.getBasis1() );
//		tmp1.setBasis2( mvcA.getBasis2() );
//		SrcList.insertRight( tmp1 );
//		tmp1 = new Mvec();
//		tmp1.setBasis1( mvcB.getBasis1() );
//		tmp1.setBasis2( mvcB.getBasis2() );
//		SrcList.insertRight( tmp1 );

//		Mvec ta1 = new Mvec();
//		Mvec tposn = new Mvec();
//		mvcA.add( mvcB , ta1 );
//		ta1.scale( 0.5 , tposn );

//		Mvec t1 = new Mvec();
//		tposn.sub( mvcatl , t1 );
//		Mvec t2 = new Mvec();
//		mvcA.add( t1 , t2 );

//		tmp1 = new Mvec();
//		tmp1.setBasis1( t2.getBasis1() );
//		tmp1.setBasis2( t2.getBasis2() );
//		DstList.insertRight( tmp1 );

//		t1 = new Mvec();
//		tposn.sub( mvcbpos , t1 );
//		t2 = new Mvec();
//		mvcB.add( t1 , t2 );

//		tmp1 = new Mvec();
//		tmp1.setBasis1( t2.getBasis1() );
//		tmp1.setBasis2( t2.getBasis2() );
//		DstList.insertRight( tmp1 );

//		doAnimation( ChgList , SrcList , DstList , 15 );
//		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 7;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

//		ChgList.eraseAllInfo();
//		SrcList.eraseAllInfo();
//		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "-" , objBI , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " - " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();

		// objC.setFrontLineVisible( false );
		// objC.setBackLineVisible( false );
		// objC.setTextVisible( false );


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setOffsetText( - ( (Ssca1) objA ).getOffsetText() ); }
		if( objBm instanceof Ssca1 )
			{ ( (Ssca1) objBm ).setEndTag( );
				( (Ssca1) objBm ).setOffsetText( - ( (Ssca1) objBm ).getOffsetText() ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( );
				( (Ssca1) objC ).setUnitCrossTac( false );
				( (Ssca1) objC ).setEndCrossTac( false ); }


		engageDelegation( objC , objA );
		engageDelegation( objC , objBm );
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		FlexString exp2;
		FlexString res2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] obm = { objBm };
		Manager.insertFormattedString( obm , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] obmc = { " - " , objBI };
		Manager.insertFormattedString( obmc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objC };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objBm };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA , " \\+ ( " , objA , " * " , "_di" , objA , " )" };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objA };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objBm };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objA };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] flb = { "_flw" , objBm };
		Manager.insertFormattedString( flb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] flbc = { "scasubwid( " , objA , " , " , objBm , " ) " };
		Manager.insertFormattedString( flbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objBm.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objBm.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );
		
		Mvec tx = new Mvec();
		mvcbtl.sub( mvcapos , tx );
		Mvec txlen = new Mvec();
		tx.mcpy( txlen );
		txlen.magnitude();
		if( txlen.getBasis() < 0.0001 ) tx.setBasis1( 1.0 );
		objC.preferredDirection( tx );
		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		( Manager.getMyEngine() ).resolveConstraints();

		Manager.bringToFront( objC );

		/* MyKit.getXKit().hideLoadFrame(); */

		/* blinkObject( objC ); */
		}


/**
* Compares two depictors.
*/
	public boolean compareAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				if( Simp ) sscaCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
					else sscaCompareAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( Simp ) vectCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
					else vectCompareAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				if( Simp ) phasCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
					else phasCompareAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( objBI instanceof Para1 )
				{
				phasCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

		if( objAI instanceof Para1 )
			{
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				phasCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( objBI instanceof Para1 )
				{
				phasCompareAnimateSimp( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}
			}

		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Compares two phasors.
*/
	protected void phasCompareAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		objAI.setValuePort( new FlexString( "_md_" ) );
		objA.setValuePort( new FlexString( "_md_" ) );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mdA = objA.portGetVect();
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( new FlexString( "_md_" ) );
		objB.setValuePort( new FlexString( "_md_" ) );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mdB = objB.portGetVect();
		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdA.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdB.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );

		Mvec tposn = new Mvec();
		Mvec ta = new Mvec();
		mvcapos.add( mvcbpos , ta );
		ta.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp1 = new Mvec();
		t1 = new Mvec();
		mdA.vsub( mvcA , t1 );
		t1.vadd( tposn , tmp1 );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp1 = new Mvec();
		t1 = new Mvec();
		mdB.vsub( mvcB , t1 );
		t1.vadd( tposn , tmp1 );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 6;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { "magnitude( " , objA , " ) - magnitude( " , objB , " ) " };
		Manager.insertFormattedString( obcc , exprname );
		

		objA.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( tposn );

		TmpHex = new Hexar();
		TmpHex.setGlo( tposn );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x - 75 , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		
		MyFac.setDepicClass( "Circle Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objR1 = MyFac.createDepictor();

		DrawObj objR2 = MyFac.createDepictor();

		
		objR1.setFrontLineColor( getDirecArcColor() );
		objR1.setBackLineColor( getDirecArcColor() );
		objR2.setFrontLineColor( getDirecArcColor() );
		objR2.setBackLineColor( getDirecArcColor() );
		

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr1 = { "_hd" , objR1 };
		Manager.insertFormattedString( hdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr1c = { "_hd" , objA };
		Manager.insertFormattedString( hdr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr2 = { "_hd" , objR2 };
		Manager.insertFormattedString( hdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr2c = { "_hd" , objB };
		Manager.insertFormattedString( hdr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr1 = { objR1 };
		Manager.insertFormattedString( obr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr1c = { "magnitude( " , objA , " ) * UnitOf( " , "_md" , objA , " \\- " , "_hd" , objA , " ) " };
		Manager.insertFormattedString( obr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr2 = { objR2 };
		Manager.insertFormattedString( obr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr2c = { "magnitude( " , objB , " ) * UnitOf( " , "_md" , objB , " \\- " , "_hd" , objB , " ) " };
		Manager.insertFormattedString( obr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.sendToBack( objR1 );
		Manager.sendToBack( objR2 );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objA , objR1 );
		engageDelegation( objB , objR2 );
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Compares two phasors in a simplified fashion.
*/
	protected void phasCompareAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		DrawObj objA = objAI;
		DrawObj objB = objBI;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { "magnitude( " , objA , " ) - magnitude( " , objB , " ) " };
		Manager.insertFormattedString( obcc , exprname );
		

		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		objC.setTemporary( true );
		

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Compares two vectors.
*/
	protected void vectCompareAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tposn = new Mvec();
		Mvec ta = new Mvec();
		mvcapos.add( mvcbpos , ta );
		ta.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 6;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { "magnitude( " , objA , " ) - magnitude( " , objB , " ) " };
		Manager.insertFormattedString( obcc , exprname );
		

		tposn = new Mvec();
		objA.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( tposn );

		TmpHex = new Hexar();
		TmpHex.setGlo( tposn );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x - 75 , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		
		MyFac.setDepicClass( "Circle Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objR1 = MyFac.createDepictor();

		DrawObj objR2 = MyFac.createDepictor();

		
		objR1.setFrontLineColor( getDirecArcColor() );
		objR1.setBackLineColor( getDirecArcColor() );
		objR2.setFrontLineColor( getDirecArcColor() );
		objR2.setBackLineColor( getDirecArcColor() );
		

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr1 = { "_hd" , objR1 };
		Manager.insertFormattedString( hdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr1c = { "_hd" , objA };
		Manager.insertFormattedString( hdr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr2 = { "_hd" , objR2 };
		Manager.insertFormattedString( hdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr2c = { "_hd" , objB };
		Manager.insertFormattedString( hdr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr1 = { objR1 };
		Manager.insertFormattedString( obr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr1c = { objA };
		Manager.insertFormattedString( obr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr2 = { objR2 };
		Manager.insertFormattedString( obr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr2c = { objB };
		Manager.insertFormattedString( obr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.sendToBack( objR1 );
		Manager.sendToBack( objR2 );

		Vect1 objAV = (Vect1)( objA );
		objAV.setOffsetText( objAV.getOffsetText() - 40.0 );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objA , objR1 );
		engageDelegation( objB , objR2 );
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Compares two vectors in a simplified manner.
*/
	protected void vectCompareAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tposn = new Mvec();
		Mvec ta = new Mvec();
		mvcapos.add( mvcbpos , ta );
		ta.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		preDeleteObj( objA );
		preDeleteObj( objB );


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { "magnitude( " , objA , " ) - magnitude( " , objB , " ) " };
		Manager.insertFormattedString( obcc , exprname );
		

		objA.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( tposn );

		TmpHex = new Hexar();
		TmpHex.setGlo( tposn );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x - 75 , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		postDeleteObj( objA );
		postDeleteObj( objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Compares two scalars.
*/
	protected void sscaCompareAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objBI ) ) */ false )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 22.5 ) ) );
				( objB.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 22.5 ) ) );
				}
				break;
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 22.5 ) ) );
				( objA.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 22.5 ) ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tposn = new Mvec();
		Mvec ta = new Mvec();
		mvcapos.add( mvcbpos , ta );
		ta.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 13;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " - " , objB };
		Manager.insertFormattedString( obcc , exprname );
		

		objA.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( tposn );

		TmpHex = new Hexar();
		TmpHex.setGlo( tposn );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x - 75 , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		MyFac.setTextColor( Color.BLACK );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DrawObj objA2 = MyFac.createDepictor();
		
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DrawObj objB2 = MyFac.createDepictor();
	
		
		( (Ssca1) objA2 ).setUnitCrossTac( false );
		( (Ssca1) objA2 ).setEndCrossTac( false );
		( (Ssca1) objB2 ).setUnitCrossTac( false );
		( (Ssca1) objB2 ).setEndCrossTac( false );
		objA2.setTextVisible( false );
		objB2.setTextVisible( false );


		MyFac.setDepicClass( "Directional Arc Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objR1 = MyFac.createDepictor();

		DrawObj objR2 = MyFac.createDepictor();


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setOffsetText( - 0.25 * 40 );
				( (Ssca1) objA ).setUnitCrossTac( false );
				( (Ssca1) objA ).setEndCrossTac( true ); }
		if( objB instanceof Ssca1 )
			{ ( (Ssca1) objB ).setUnitCrossTac( false );
				( (Ssca1) objB ).setEndCrossTac( true ); }

		objR1.setFrontLineColor( getDirecArcColor() );
		objR1.setBackLineColor( getDirecArcColor() );
		objR2.setFrontLineColor( getDirecArcColor() );
		objR2.setBackLineColor( getDirecArcColor() );

		( (DirecArc1) objR1 ).setDirec( DirecArc1.DirNone );
		( (DirecArc1) objR2 ).setDirec( DirecArc1.DirNone );
		


		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hda2 = { "_hd" , objA2 };
		Manager.insertFormattedString( hda2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hda2c = { "_hd" , objB };
		Manager.insertFormattedString( hda2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb2 = { "_hd" , objB2 };
		Manager.insertFormattedString( hdb2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdb2c = { "_hd" , objA };
		Manager.insertFormattedString( hdb2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dia2 = { "_di" , objA2 };
		Manager.insertFormattedString( dia2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dia2c = { "_di" , objB };
		Manager.insertFormattedString( dia2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib2 = { "_di" , objB2 };
		Manager.insertFormattedString( dib2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dib2c = { "_di" , objA };
		Manager.insertFormattedString( dib2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdr1 = { "_md" , objR1 };
		Manager.insertFormattedString( mdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdr1c = { "_hd" , objA };
		Manager.insertFormattedString( mdr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdr2 = { "_md" , objR2 };
		Manager.insertFormattedString( mdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdr2c = { "_hd" , objB };
		Manager.insertFormattedString( mdr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr1 = { "_hd" , objR1 };
		Manager.insertFormattedString( hdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr1c = { "_hd" , objA , " \\+ " , "_di" , objA , " * " , objA };
		Manager.insertFormattedString( hdr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr2 = { "_hd" , objR2 };
		Manager.insertFormattedString( hdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr2c = { "_hd" , objB , " \\+ " , "_di" , objB , " * " , objB };
		Manager.insertFormattedString( hdr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr1 = { objR1 };
		Manager.insertFormattedString( obr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr1c = { "_hd" , objA2 , " \\+ " , "_di" , objA2 , " * " , objA2 , " \\- " , "_hd" , objR1 };
		Manager.insertFormattedString( obr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr2 = { objR2 };
		Manager.insertFormattedString( obr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr2c = { "_hd" , objB2 , " \\+ " , "_di" , objB2 , " * " , objB2 , " \\- " , "_hd" , objR2 };
		Manager.insertFormattedString( obr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_md" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA , " \\+ 1.0 * #1 \\- 1.6 * #2" };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.sendToBack( objR1 );
		Manager.sendToBack( objR2 );
		Manager.sendToBack( objC );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objA , objR1 );
		engageDelegation( objB , objR2 );
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Compares two scalars in a simplified fashion.
*/
	protected void sscaCompareAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		objAI.setValuePort( new FlexString( "_di_" ) );
		objA.setValuePort( new FlexString( "_di_" ) );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( new FlexString( "_di_" ) );
		objB.setValuePort( new FlexString( "_di_" ) );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tposn = new Mvec();
		Mvec ta = new Mvec();
		mvcapos.add( mvcbpos , ta );
		ta.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		preDeleteObj( objA );
		preDeleteObj( objB );


		createBinaryOpName( objA , "&sp;Compare&sp;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " - " , objB };
		Manager.insertFormattedString( obcc , exprname );
		

		objA.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( tposn );

		TmpHex = new Hexar();
		TmpHex.setGlo( tposn );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x - 75 , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Scalar Comparison Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		postDeleteObj( objA );
		postDeleteObj( objB );
		

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Multiplies two depictors.
*/
	public boolean multiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
					else 
						{
						if( UsingScalarWedge ) sscaMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
							else sscaMultiplyAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else 
						{
						if( UsingScalarWedge ) sscaVectMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
							else sscaVectMultiplyAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				sscaPhasMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( ( Simp ) || ( objAI.getVectName().stcmp( objBI.getVectName() ) == 0 ) ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
					else vectMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else vectPhasMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else 
						{
						if( UsingScalarWedge ) vectSscaMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
							else vectSscaMultiplyAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			}

	
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else phasVectMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				if( Simp ) generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
					else phasMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				phasSscaMultiplyAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			}


		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalMultiplyAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Multiplies two elements in a simplified manner.
*/
	protected DrawObj generalMultiplyAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		String ClName )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		MyFac.setDepicClass( ClName );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "&times;" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " * " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}


/**
* Multiplies a scalar with a phasor.
*/
	protected void sscaPhasMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		createBinaryOpName( objAI , "&times;" , objBI , resvarname );
		
		

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 100 , 100 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		objBI.setValuePort( new FlexString( "_md_" ) );
		objC.setValuePort( new FlexString( "_md_" ) );
		Mvec mdV = objBI.portGetVect();
		mdV.copyAllInfo( objC.portGetVect() );
		Mvec mdC = objC.portGetVect();

		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		objC.setValuePort( 1 );
		( objAI.portGetVect() ).mult( objBI.portGetVect() , objC.portGetVect() );

		objAI.setValuePort( 0 );
		objBI.setValuePort( 0 );
		objC.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objC.portGetVect() );



		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );


		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( objC.portGetVect() );
		ChgList.insertRight( mdC );
		Mvec tmp1 = new Mvec();
		( objC.portGetVect() ).copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdC.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		( objAI.portGetVect() ).add( objBI.portGetVect() , ta1 );
		ta1.scale( 0.5 , tposn );

		tmp1 = new Mvec();
		tposn.copyAllInfo( tmp1 );
		DstList.insertRight( tmp1 );
		tmp1 = new Mvec();
		Mvec tmp2 = new Mvec();
		tposn.add( mdC , tmp2 );
		tmp2.sub( objC.portGetVect() , tmp1 );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " * " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}

/**
* Multiplies a phasor with a scalar.
*/
	protected void phasSscaMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createBinaryOpName( objAI , "&times;" , objBI , resvarname );

		

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 100 , 100 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );


		objAI.setValuePort( new FlexString( "_md_" ) );
		objC.setValuePort( new FlexString( "_md_" ) );
		Mvec mdV = objAI.portGetVect();
		mdV.copyAllInfo( objC.portGetVect() );
		Mvec mdC = objC.portGetVect();

		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		objC.setValuePort( 1 );
		( objAI.portGetVect() ).mult( objBI.portGetVect() , objC.portGetVect() );

		objAI.setValuePort( 0 );
		objBI.setValuePort( 0 );
		objC.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objC.portGetVect() );



		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );


		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( objC.portGetVect() );
		ChgList.insertRight( mdC );
		Mvec tmp1 = new Mvec();
		( objC.portGetVect() ).copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdC.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		( objAI.portGetVect() ).add( objBI.portGetVect() , ta1 );
		ta1.scale( 0.5 , tposn );

		tmp1 = new Mvec();
		tposn.copyAllInfo( tmp1 );
		DstList.insertRight( tmp1 );
		tmp1 = new Mvec();
		Mvec tmp2 = new Mvec();
		tposn.add( mdC , tmp2 );
		tmp2.sub( objC.portGetVect() , tmp1 );
		DstList.insertRight( tmp1 );
		

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " * " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Multiplies a scalar with a vector.
*/
	protected void sscaVectMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		objAI.setValuePort( new FlexString( "_di_" ) );
		objA.setValuePort( new FlexString( "_di_" ) );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();

	



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 10;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );



		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( uName );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();
		( (Ssca1) objU ).setDragThrough( false ); 


		objA.setValuePort( new FlexString( "_di_" ) );
		objU.setValuePort( new FlexString( "_di_" ) );
		( objA.portGetVect() ).copyAllInfo( objU.portGetVect() );
		objA.setValuePort( 1 );
		objU.setValuePort( 1 );



		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();

		DrawObj objD2 = MyFac.createDepictor();

		objD1.setFrontLineColor( getDirecColor() );
		objD1.setBackLineColor( getDirecColor() );
		( (Direc1) objD1 ).setDirec( DirType );
		objD2.setFrontLineColor( getDirecColor() );
		objD2.setBackLineColor( getDirecColor() );
		( (Direc1) objD2 ).setDirec( DirType );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dia = { "_di" , objA };
		Manager.insertFormattedString( dia , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diac = { "_di" , objU };
		Manager.insertFormattedString( diac , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		

		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hda = { "_hd" , objA };
		Manager.insertFormattedString( hda , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdac = { "_hd" , objB };
		Manager.insertFormattedString( hdac , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
			
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objB };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd1 = { "_hd" , objD1 };
		Manager.insertFormattedString( hdd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd1c = { "_hd" , objU , " \\+ " , objU , " * " ,
			"_di" , objU };
		Manager.insertFormattedString( hdd1c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd2 = { "_hd" , objD2 };
		Manager.insertFormattedString( hdd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd2c = { "_hd" , objA , " \\+ " , objA , " * " ,
			"_di" , objA };
		Manager.insertFormattedString( hdd2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd2 = { objD2 };
		Manager.insertFormattedString( obd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd2c = { "_hd" , objC , " \\+ " , objC , " \\- " ,
			"_hd" , objD2 };
		Manager.insertFormattedString( obd2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd1 = { objD1 };
		Manager.insertFormattedString( obd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd1c = { "_hd" , objB , " \\+ " , objB , " \\- " ,
			"_hd" , objD1 };
		Manager.insertFormattedString( obd1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		objB.setEndTag();
		objA.setEndTag();
		objC.setEndTag();
		objU.setEndTag();
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );
		engageDelegation( objC , objD1 );
		engageDelegation( objC , objD2 );


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Multiplies a scalar by a vector without using the wedge.
*/
	protected void sscaVectMultiplyAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objB };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objA };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objB };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objA };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "UnitOf( " , objB , " )" };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}


/**
* Multiplies a vector by a scalar.
*/
	protected void vectSscaMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( new FlexString( "_di_" ) );
		objB.setValuePort( new FlexString( "_di_" ) );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();




		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 10;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );



		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( uName );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();
		( (Ssca1) objU ).setDragThrough( false ); 


		objB.setValuePort( new FlexString( "_di_" ) );
		objU.setValuePort( new FlexString( "_di_" ) );
		( objB.portGetVect() ).copyAllInfo( objU.portGetVect() );
		objB.setValuePort( 1 );
		objU.setValuePort( 1 );



		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();

		DrawObj objD2 = MyFac.createDepictor();

		objD1.setFrontLineColor( getDirecColor() );
		objD1.setBackLineColor( getDirecColor() );
		( (Direc1) objD1 ).setDirec( DirType );
		objD2.setFrontLineColor( getDirecColor() );
		objD2.setBackLineColor( getDirecColor() );
		( (Direc1) objD2 ).setDirec( DirType );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objU };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		

		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
			
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd1 = { "_hd" , objD1 };
		Manager.insertFormattedString( hdd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd1c = { "_hd" , objU , " \\+ " , objU , " * " ,
			"_di" , objU };
		Manager.insertFormattedString( hdd1c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd2 = { "_hd" , objD2 };
		Manager.insertFormattedString( hdd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd2c = { "_hd" , objB , " \\+ " , objB , " * " ,
			"_di" , objB };
		Manager.insertFormattedString( hdd2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd2 = { objD2 };
		Manager.insertFormattedString( obd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd2c = { "_hd" , objC , " \\+ " , objC , " \\- " ,
			"_hd" , objD2 };
		Manager.insertFormattedString( obd2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd1 = { objD1 };
		Manager.insertFormattedString( obd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd1c = { "_hd" , objA , " \\+ " , objA , " \\- " , 
			"_hd" , objD1 };
		Manager.insertFormattedString( obd1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );

		

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();
		objU.setEndTag();
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );
		engageDelegation( objC , objD1 );
		engageDelegation( objC , objD2 );


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Multiplies a vector by a scalar without using the wedge.
*/
	protected void vectSscaMultiplyAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC ); 


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "UnitOf( " , objA , " )" };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}


/**
* Multiplies a phasor times a vector.
*/
	protected void phasVectMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type II" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

	
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		objA.setValuePort( 1 );
		Mvec aval = objA.portGetVect();
		objB.setValuePort( 1 );
		Mvec bval = objB.portGetVect();
		Mvec adel = new Mvec();
		aval.mult( bval , adel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " * " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		


		
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mda = { "_md" , objA };
		Manager.insertFormattedString( mda , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdac = { "_hd" , objB , " \\+ " , objB };
		Manager.insertFormattedString( mdac , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objC );
		Manager.bringToFront( objB );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Multiplies a vector times a phasor.
*/
	protected void vectPhasMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		Mvec bdel = new Mvec();
		mvcatl.vsub( mvcapos , bdel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " * " , objB };
		Manager.insertFormattedString( obcc , exprname );
		


		
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objC );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Multiplies two phasors.
*/
	protected void phasMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


	
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		Mvec adel = new Mvec();
		Mvec bdel = new Mvec();
		mdA.vsub( mvcA , adel );
		mvcatl.vsub( mvcapos , bdel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " * " , objB };
		Manager.insertFormattedString( obcc , exprname );
		



		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_md" , objA };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objB , " \\+ ( " , "_md" , objA , " \\- " , "_hd" , objA , " ) * " , objA };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objB );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		objC.preferredDirection( adel );

		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Multiplies two vectors.
*/
	protected void vectMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " * " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		
		

		
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objB );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}

/**
* Multiplies two scalars.
*/
	protected void sscaMultiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objB.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objA.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 23;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setNewVectName( uName );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );




		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		/* ( (Ssca1) objD1 ).setDragThrough( false ); */
		engageDelegation( objC , objD1 ); 
		DrawObj objD2 = MyFac.createDepictor();
		/* ( (Ssca1) objD2 ).setDragThrough( false ); */
		engageDelegation( objC , objD2 );
		MyFac.setDepicClass( "Ruled Mark Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL1 = MyFac.createDepictor();
		engageDelegation( objA , objL1 );
		objL1.setControlsVisible( false );
		DrawObj objL2 = MyFac.createDepictor();
		engageDelegation( objC , objL2 );
		objL2.setControlsVisible( false );

		objD1.setFrontLineColor( getDirecColor() );
		objD1.setBackLineColor( getDirecColor() );
		( (Direc1) objD1 ).setDirec( DirType );
		objD2.setFrontLineColor( getDirecColor() );
		objD2.setBackLineColor( getDirecColor() );
		( (Direc1) objD2 ).setDirec( DirType );



		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objB };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] diu = { "_di" , objU };
		Manager.insertFormattedString( diu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diuc = { "_di" , objA };
		Manager.insertFormattedString( diuc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd1 = { "_hd" , objD1 };
		Manager.insertFormattedString( hdd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd1c = { "_hd" , objU , " \\+ ( " ,
			objU , " ) * " , "_di" , objU };
		Manager.insertFormattedString( hdd1c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd2 = { "_hd" , objD2 };
		Manager.insertFormattedString( hdd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd2c = { "_hd" , objA , " \\+ ( " ,
			objA , " ) * " , "_di" , objA };
		Manager.insertFormattedString( hdd2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */







		
		/* res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] did2 = { "_di" , objD2 };
		Manager.insertFormattedString( did2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] did2c = { "UnitOf( " , "_hd" , objC , " \\+ ( " ,
			objC , " ) * " , "_di" , objC , " \\- " , "_hd" , objD2 , " ) " };
		Manager.insertFormattedString( did2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd2 = { objD2 };
		Manager.insertFormattedString( obd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd2c = { "_hd" , objC , " \\+ ( " ,
			objC , " ) * " , "_di" , objC , " \\- " , "_hd" , objD2 };
		Manager.insertFormattedString( obd2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		
		/* res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] did1 = { "_di" , objD1 };
		Manager.insertFormattedString( did1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] did1c = { "UnitOf( " , "_hd" , objA , " \\+ ( " ,
			objA , " ) * " , "_di" , objA , " \\- " , "_hd" , objD1 , " ) " };
		Manager.insertFormattedString( did1c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] d1c = { objD1 };
		Manager.insertFormattedString( d1c , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] d1cc = { "_hd" , objB , " \\+ ( " ,
			objB , " ) * " , "_di" , objB , " \\- " , "_hd" , objD1 };
		Manager.insertFormattedString( d1cc , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );
		
		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obl1 = { objL1 };
		Manager.insertFormattedString( obl1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obl1c = { objA };
		Manager.insertFormattedString( obl1c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdl1 = { "_hd" , objL1 };
		Manager.insertFormattedString( hdl1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdl1c = { "_hd" , objA };
		Manager.insertFormattedString( hdl1c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dil1 = { "_di" , objL1 };
		Manager.insertFormattedString( dil1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dil1c = { "_di" , objA };
		Manager.insertFormattedString( dil1c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obl2 = { objL2 };
		Manager.insertFormattedString( obl2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obl2c = { objC };
		Manager.insertFormattedString( obl2c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdl2 = { "_hd" , objL2 };
		Manager.insertFormattedString( hdl2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdl2c = { "_hd" , objC };
		Manager.insertFormattedString( hdl2c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dil2 = { "_di" , objL2 };
		Manager.insertFormattedString( dil2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dil2c = { "_di" , objC };
		Manager.insertFormattedString( dil2c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] unl2 = { "_un" , objL2 };
		Manager.insertFormattedString( unl2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] unl2c = { objB };
		Manager.insertFormattedString( unl2c , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setOffsetText( - 0.25 * 40 ); }
		if( objB instanceof Ssca1 )
			{ ( (Ssca1) objB ).setEndTag( );
				( (Ssca1) objB ).setUnitCrossTac( false );
				( (Ssca1) objB ).setOffsetText( - ( (Ssca1) objB ).getOffsetText() ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( );
				( (Ssca1) objC ).setUnitCrossTac( false ); }
		if( objU instanceof Ssca1 )
			{ ( (Ssca1) objU ).setEndTag( );
				( (Ssca1) objU ).setOffsetText( - 0.25 * 40 ); }


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );
		Manager.sendToBack( objL1 );
		Manager.sendToBack( objL2 );
		Manager.bringToFront( objC );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Multiplies two scalars without using the wedge.
*/
	protected void sscaMultiplyAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "&times;" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) * ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objA };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objA };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Divides two depictors.
*/
public boolean divideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
					else 
						{
						if( UsingScalarWedge ) sscaDivideAnimate( objAI , objBI , objaDGM , objbDGM );
							else sscaDivideAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else 
						{
						if( UsingScalarWedge ) sscaVectDivideAnimate( objAI , objBI , objaDGM , objbDGM );
							else sscaVectDivideAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				sscaPhasDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( ( Simp ) || ( objAI.getVectName().stcmp( objBI.getVectName() ) == 0 ) ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
					else vectDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else vectPhasDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else 
						{
						if( UsingScalarWedge ) vectSscaDivideAnimate( objAI , objBI , objaDGM , objbDGM );
							else vectSscaDivideAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			}


		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
					else phasVectDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				phasDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				phasSscaDivideAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			}

		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Divides two elements in a simplified manner.
*/
	protected DrawObj generalDivideAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		String ClName )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		MyFac.setDepicClass( ClName );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "/" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " / " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}


/**
* Divides a scalar by a phasor.
*/
protected void sscaPhasDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		createBinaryOpName( objAI , "/" , objBI , resvarname );

		

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 100 , 100 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		objBI.setValuePort( new FlexString( "_md_" ) );
		objC.setValuePort( new FlexString( "_md_" ) );
		Mvec mdV = objBI.portGetVect();
		mdV.copyAllInfo( objC.portGetVect() );
		Mvec mdC = objC.portGetVect();

		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		objC.setValuePort( 1 );
		( objAI.portGetVect() ).divide( objBI.portGetVect() , objC.portGetVect() );

		objAI.setValuePort( 0 );
		objBI.setValuePort( 0 );
		objC.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objC.portGetVect() );



		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );


		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( objC.portGetVect() );
		ChgList.insertRight( mdC );
		Mvec tmp1 = new Mvec();
		( objC.portGetVect() ).copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdC.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		( objAI.portGetVect() ).add( objBI.portGetVect() , ta1 );
		ta1.scale( 0.5 , tposn );

		tmp1 = new Mvec();
		tposn.copyAllInfo( tmp1 );
		DstList.insertRight( tmp1 );
		tmp1 = new Mvec();
		Mvec tmp2 = new Mvec();
		tposn.add( mdC , tmp2 );
		tmp2.sub( objC.portGetVect() , tmp1 );
		DstList.insertRight( tmp1 );

		/* doAnimation( ChgList , SrcList , DstList , 15 ); */
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " / " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}

/**
* Divides a phasor by a scalar.
*/
	protected void phasSscaDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		createBinaryOpName( objAI , "/" , objBI , resvarname );
		

		
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 100 , 100 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );


		objAI.setValuePort( new FlexString( "_md_" ) );
		objC.setValuePort( new FlexString( "_md_" ) );
		Mvec mdV = objAI.portGetVect();
		mdV.copyAllInfo( objC.portGetVect() );
		Mvec mdC = objC.portGetVect();

		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		objC.setValuePort( 1 );
		( objAI.portGetVect() ).divide( objBI.portGetVect() , objC.portGetVect() );

		objAI.setValuePort( 0 );
		objBI.setValuePort( 0 );
		objC.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objC.portGetVect() );



		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );


		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( objC.portGetVect() );
		ChgList.insertRight( mdC );
		Mvec tmp1 = new Mvec();
		( objC.portGetVect() ).copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		mdC.copyAllInfo( tmp1 );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		( objAI.portGetVect() ).add( objBI.portGetVect() , ta1 );
		ta1.scale( 0.5 , tposn );

		tmp1 = new Mvec();
		tposn.copyAllInfo( tmp1 );
		DstList.insertRight( tmp1 );
		tmp1 = new Mvec();
		Mvec tmp2 = new Mvec();
		tposn.add( mdC , tmp2 );
		tmp2.sub( objC.portGetVect() , tmp1 );
		DstList.insertRight( tmp1 );
		

		/* doAnimation( ChgList , SrcList , DstList , 15 ); */
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " / " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Divides a scalar by a vector.
*/
protected void sscaVectDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;
		DrawObj objU2 = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}
		


		objAI.setValuePort( new FlexString( "_di_" ) );
		objA.setValuePort( new FlexString( "_di_" ) );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objA.portGetVect();


		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcA = objB.portGetVect();




		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 21;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( uName );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();
		objU2 = MyFac.createDepictor();
		( (Ssca1) objU ).setDragThrough( false ); 
		( (Ssca1) objU2 ).setDragThrough( false ); 


		FlexString b2name = new FlexString();
		b2name.setInsertPoint( 0 );
		b2name.insertJavaString( "<APPLY>" );
		b2name.insertChar( '[' );
		( objB.getVectName() ).insertString( b2name );
		b2name.insertChar( ']' );
		b2name.insertJavaString( "</APPLY>" );

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( b2name );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objB2 = MyFac.createDepictor();
		( (Ssca1) objB2 ).setDragThrough( false ); 


		objA.setValuePort( new FlexString( "_di_" ) );
		objU.setValuePort( new FlexString( "_di_" ) );
		( objA.portGetVect() ).copyAllInfo( objU.portGetVect() );
		objA.setValuePort( 1 );
		objU.setValuePort( 1 );




		MyFac.setDepicClass( "Directional Arc Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objR1 = MyFac.createDepictor();

		DrawObj objR2 = MyFac.createDepictor();

		objR1.setFrontLineColor( getDirecArcColor() );
		objR1.setBackLineColor( getDirecArcColor() );
		objR2.setFrontLineColor( getDirecArcColor() );
		objR2.setBackLineColor( getDirecArcColor() );

		MyFac.setDepicClass( "Directional Type I" );
		DrawObj objK1 = MyFac.createDepictor();

		DrawObj objK2 = MyFac.createDepictor();

		objK1.setFrontLineColor( getDirecColor() );
		objK1.setBackLineColor( getDirecColor() );
		( (Direc1) objK1 ).setDirec( DirType );
		objK2.setFrontLineColor( getDirecColor() );
		objK2.setBackLineColor( getDirecColor() );
		( (Direc1) objK2 ).setDirec( DirType );

		

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdr1 = { "_md" , objR1 };
		Manager.insertFormattedString( mdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdr1c = { "_hd" , objA };
		Manager.insertFormattedString( mdr1c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdr2 = { "_md" , objR2 };
		Manager.insertFormattedString( mdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdr2c = { "_hd" , objA };
		Manager.insertFormattedString( mdr2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dia = { "_di" , objA };
		Manager.insertFormattedString( dia , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diac = { "_di" , objU };
		Manager.insertFormattedString( diac , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib2 = { "_di" , objB2 };
		Manager.insertFormattedString( dib2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dib2c = { "_di" , objU };
		Manager.insertFormattedString( dib2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] diu2 = { "_di" , objU2 };
		Manager.insertFormattedString( diu2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diu2c = { "UnitOf( " , objB , " ) " };
		Manager.insertFormattedString( diu2c , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu2 = { "_hd" , objU2 };
		Manager.insertFormattedString( hdu2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdu2c = { "_hd" , objA };
		Manager.insertFormattedString( hdu2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb2 = { "_hd" , objB2 };
		Manager.insertFormattedString( hdb2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdb2c = { "_hd" , objA };
		Manager.insertFormattedString( hdb2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obb2 = { objB2 };
		Manager.insertFormattedString( obb2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obb2c = { "magnitude( " , objB , " ) " };
		Manager.insertFormattedString( obb2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk1 = { "_hd" , objK1 };
		Manager.insertFormattedString( hdk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk1c = { "_hd" , objA , " \\+ ( " ,
			objA , " * " , "_di" , objA , " ) " };
		Manager.insertFormattedString( hdk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk1 = { objK1 };
		Manager.insertFormattedString( obk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk1c = { "_hd" , objC , " \\+ " ,
			objC , " \\- " , "_hd" , objK1 };
		Manager.insertFormattedString( obk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk2 = { "_hd" , objK2 };
		Manager.insertFormattedString( hdk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk2c = { "_hd" , objB2 , " \\+ ( magnitude( " ,
			objB2 , " ) * " , "_di" , objB2 , " ) " };
		Manager.insertFormattedString( hdk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk2 = { objK2 };
		Manager.insertFormattedString( obk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk2c = { "_hd" , objU2 , " \\+ ( magnitude( " ,
			objU2 , " ) * " , "_di" , objU2 , " ) \\- " , "_hd" , objK2 };
		Manager.insertFormattedString( obk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr1 = { "_hd" , objR1 };
		Manager.insertFormattedString( hdr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr1c = { "_hd" , objU , " \\+ ( " , objU , " * " , 
			"_di" , objU , " ) " };
		Manager.insertFormattedString( hdr1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr1 = { objR1 };
		Manager.insertFormattedString( obr1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr1c = { "_hd" , objU2 , " \\+ ( magnitude( " ,
			objU2 , " ) * " , "_di" , objU2 , " ) \\- " , "_hd" , objR1 };
		Manager.insertFormattedString( obr1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdr2 = { "_hd" , objR2 };
		Manager.insertFormattedString( hdr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdr2c = { "_hd" , objB2 , " \\+ ( magnitude( " , objB2 ,
			" ) * " , "_di" , objB2 , " ) " };
		Manager.insertFormattedString( hdr2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obr2 = { objR2 };
		Manager.insertFormattedString( obr2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obr2c = { "_hd" , objB , " \\+ " , objB , 
			" \\- " , "_hd" , objR2 };
		Manager.insertFormattedString( obr2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );
		

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		

		objA.setEndTag();
		objB.setEndTag();
		objB2.setEndTag();
		objC.setEndTag();
		objU.setEndTag();
		objU2.setEndTag();
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objB2 );
		engageDelegation( objC , objU );
		engageDelegation( objC , objU2 );
		engageDelegation( objC , objR1 );
		engageDelegation( objC , objR2 );
		engageDelegation( objC , objK1 );
		engageDelegation( objC , objK2 );

		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.sendToBack( objU2 );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Divides a scalar by a vector without using the wedge.
*/
	protected void sscaVectDivideAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objB };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objA };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objB };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objA };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "UnitOf( " , objB , " )" };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Divides a vector by a scalar.
*/
protected void vectSscaDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( new FlexString( "_di_" ) );
		objB.setValuePort( new FlexString( "_di_" ) );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();




		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 10;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		


		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( uName );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();
		( (Ssca1) objU ).setDragThrough( false ); 


		objB.setValuePort( new FlexString( "_di_" ) );
		objU.setValuePort( new FlexString( "_di_" ) );
		( objB.portGetVect() ).copyAllInfo( objU.portGetVect() );
		objB.setValuePort( 1 );
		objU.setValuePort( 1 );




		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objK1 = MyFac.createDepictor();

		DrawObj objK2 = MyFac.createDepictor();

		objK1.setFrontLineColor( getDirecColor() );
		objK1.setBackLineColor( getDirecColor() );
		( (Direc1) objK1 ).setDirec( DirType );
		objK2.setFrontLineColor( getDirecColor() );
		objK2.setBackLineColor( getDirecColor() );
		( (Direc1) objK2 ).setDirec( DirType );


		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objU };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk1 = { "_hd" , objK1 };
		Manager.insertFormattedString( hdk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk1c = { "_hd" , objU , " \\+ ( " , objU , " * " , 
			"_di" , objU , " ) " };
		Manager.insertFormattedString( hdk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk1 = { objK1 };
		Manager.insertFormattedString( obk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk1c = { "_hd" , objC , " \\+ " , objC , " \\- " , "_hd" , objK1 };
		Manager.insertFormattedString( obk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk2 = { "_hd" , objK2 };
		Manager.insertFormattedString( hdk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk2c = { "_hd" , objB , " \\+ ( " ,
			objB , " * " , "_di" , objB , " ) " };
		Manager.insertFormattedString( hdk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk2 = { objK2 };
		Manager.insertFormattedString( obk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk2c = { "_hd" , objA , " \\+ " , objA , " \\- " ,
			"_hd" , objK2 };
		Manager.insertFormattedString( obk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );
		

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		

		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();
		objU.setEndTag();
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );
		engageDelegation( objC , objK1 );
		engageDelegation( objC , objK2 );

		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Divides a vector by a scalar without using the wedge.
*/
	protected void vectSscaDivideAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx&& ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC ); 


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "UnitOf( " , objA , " )" };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}


/**
* Divides a phasor by a phasor.
*/
protected void phasDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


	
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type II" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		Mvec adel = new Mvec();
		Mvec bdel = new Mvec();
		mdA.vsub( mvcA , adel );
		mvcatl.vsub( mvcapos , bdel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " / " , objB };
		Manager.insertFormattedString( obcc , exprname );
		



		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_md" , objA };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objB , " \\+ ( " , "_md" , objA , " \\- " , "_hd" , objA , " ) * " , objA };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objB );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		objC.preferredDirection( adel );

		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Divides a vector by a phasor.
*/
protected void vectPhasDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}



		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type II" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( new FlexString( "_md_" ) );
		Mvec mdB = objB.portGetVect();
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		Mvec bdel = new Mvec();
		objA.setValuePort( 1 );
		objB.setValuePort( 1 );
		objA.portGetVect().divide( objB.portGetVect() , bdel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		ChgList.insertRight( mdB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		SrcList.insertRight( tmp2 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( bdel , tmp2 );
		DstList.insertRight( tmp2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	

		
		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " / " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objB };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objC );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Divides a phasor by a vector.
*/
protected void phasVectDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "GA Phasor Type II" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}



		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( new FlexString( "_md_" ) );
		Mvec mdA = objA.portGetVect();
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		objA.setValuePort( 1 );
		Mvec aval = objA.portGetVect();
		objB.setValuePort( 1 );
		Mvec bval = objB.portGetVect();
		Mvec adel = new Mvec();
		aval.mult( bval , adel );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mdA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		SrcList.insertRight( tmp2 );
		
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		tmp2 = new Mvec();
		tmp1.vadd( adel , tmp2 );
		DstList.insertRight( tmp2 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " / " , objB };
		Manager.insertFormattedString( obcc , exprname );
		


		
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mda = { "_md" , objA };
		Manager.insertFormattedString( mda , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdac = { "_hd" , objB , " \\+ " , objB };
		Manager.insertFormattedString( mdac , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objC );
		Manager.bringToFront( objB );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}



/**
* Divides a vector by a vector.
*/
protected void vectDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}



		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}



		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcapos , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 4;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " / " , objB };
		Manager.insertFormattedString( obcc , exprname );


		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdcc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( mdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		Manager.bringToFront( objB );
		Manager.bringToFront( objA );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.getAdditiveExtents( nbDGM.getMyCoord() , mvcbpos , mvcbtl );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		objC.setValuePort( 0 );
		Mvec mvcC = objC.portGetVect();

		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );

		Mvec ta = new Mvec();
		mvcapos.sub( mvccpos , ta );
		Mvec tb = new Mvec();
		mvcC.add( ta , tb );

		mvcC.setBasis1( tb.getBasis1() );
		mvcC.setBasis2( tb.getBasis2() );

		if( objC instanceof Angle1 ) { ( (Angle1) objC ).setBariText( 1.01 );
			( (Angle1) objC ).setOffsetText( 0.0 ); }

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */
		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Divides a scalar by a scalar.
*/
protected void sscaDivideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{ 
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objA.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objB.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			case UniDimensionalAngleResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 15;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	

		
		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setNewVectName( uName );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();

		switch( UniDimensionalScalars )
			{
			case UniDimensionalFlatResult:
				{
				objU.setValuePort( new FlexString( "_di_" ) );
				( objU.portGetVect() ).setBasis1( 1.0 );
				( objU.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case UniDimensionalAngleResult:
				{
				objU.setValuePort( new FlexString( "_di_" ) );
				( objU.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objU.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			}


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );




		
		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objK1 = MyFac.createDepictor();
		engageDelegation( objC , objK1 );

		DrawObj objK2 = MyFac.createDepictor();
		engageDelegation( objC , objK2 );

		objK1.setFrontLineColor( getDirecColor() );
		objK1.setBackLineColor( getDirecColor() );
		( (Direc1) objK1 ).setDirec( DirType );
		objK2.setFrontLineColor( getDirecColor() );
		objK2.setBackLineColor( getDirecColor() );
		( (Direc1) objK2 ).setDirec( DirType );

		MyFac.setDepicClass( "Ruled Mark Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL1 = MyFac.createDepictor();
		engageDelegation( objA , objL1 );
		objL1.setControlsVisible( false );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );


		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diu = { "_di" , objU };
		Manager.insertFormattedString( diu , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dia = { "_di" , objA };
		Manager.insertFormattedString( dia , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */








		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk1 = { "_hd" , objK1 };
		Manager.insertFormattedString( hdk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk1c = { "_hd" , objU , " \\+ ( ( " , objU ,
			" ) * " , "_di" , objU , " ) " };
		Manager.insertFormattedString( hdk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk1 = { objK1 };
		Manager.insertFormattedString( obk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk1c = { "_hd" , objB , " \\+ ( ( " , objB ,
			" ) * " , "_di" , objB , " ) \\- " , "_hd" , objK1 };
		Manager.insertFormattedString( obk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk2 = { "_hd" , objK2 };
		Manager.insertFormattedString( hdk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk2c = { "_hd" , objA , " \\+ ( ( " , objA ,
			" ) * " , "_di" , objA , " ) " };
		Manager.insertFormattedString( hdk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk2 = { objK2 };
		Manager.insertFormattedString( obk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk2c = { "_hd" , objC , " \\+ ( ( " , objC ,
			" ) * " , "_di" , objC , " ) \\- " , "_hd" , objK2 };
		Manager.insertFormattedString( obk2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdl1 = { "_hd" , objL1 };
		Manager.insertFormattedString( hdl1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdl1c = { "_hd" , objC };
		Manager.insertFormattedString( hdl1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dil1 = { "_di" , objL1 };
		Manager.insertFormattedString( dil1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dil1c = { "_di" , objC };
		Manager.insertFormattedString( dil1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obl1 = { objL1 };
		Manager.insertFormattedString( obl1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obl1c = { objC };
		Manager.insertFormattedString( obl1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );
		

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setOffsetText( - 0.25 * 40 ); }
		if( objB instanceof Ssca1 )
			{ ( (Ssca1) objB ).setEndTag( );
				( (Ssca1) objB ).setOffsetText( - 0.25 * 40 ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( ); }
		if( objU instanceof Ssca1 )
			{ ( (Ssca1) objU ).setEndTag( );
				( (Ssca1) objU ).setOffsetText( - ( (Ssca1) objU ).getOffsetText() ); }


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );
		Manager.bringToFront( objC );
		Manager.sendToBack( objL1 );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Divides two scalars without using the wedge.
*/
	protected void sscaDivideAnimateNoWedge( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		try{ FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx&& ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	


		/* preDeleteObj( objA );
		preDeleteObj( objB ); */

		
		createBinaryOpName( objA , "/" , objB , resvarname );

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { uName , " * ( " , objA , " / " , uName , " ) / ( " , objB , " / " , uName , " )" };
		Manager.insertFormattedString( obcc , exprname );
		
		
		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );




		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );
		

		Manager.engineSetLinkOn( false );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		
		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objA };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dibc = { "_di" , objA };
		Manager.insertFormattedString( dibc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Divides two depictors.
*/
public boolean dlikePropAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				if( Simp ) generalDivideAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
					else 
						{
						if( UsingScalarWedge ) sscaDlikePropAnimate( objAI , objBI , objaDGM , objbDGM );
							else sscaDivideAnimateNoWedge( objAI , objBI , objaDGM , objbDGM );
						}
				flag = true;
				}
			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}



/**
* Creates a scalar proportion.
*/
protected void sscaDlikePropAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{ 
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();


		DrawObj objC = null;
		DrawObj objU = null;

		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		DrawObj objA = null;
		DrawObj objB = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objA.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objB.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			case UniDimensionalAngleResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
				}
				break;
			}

		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();



		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec t1 = new Mvec();
		mvcA.add( mvcB , t1 );
		Mvec t2 = new Mvec();
		t1.scale( 0.5 , t2 );

		DstList.insertRight( t2 );
		DstList.insertRight( t2 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 17;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	

		
		/* preDeleteObj( objA );
		preDeleteObj( objB ); */


		createBinaryOpName( objA , "/" , objB , resvarname );

		

		
		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 20 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y - 40 );
		MyFac.setNewVectName( uName );
		MyFac.setPlaceAt( OutPt );
		objU = MyFac.createDepictor();

		switch( UniDimensionalScalars )
			{
			case UniDimensionalFlatResult:
				{
				objU.setValuePort( new FlexString( "_di_" ) );
				( objU.portGetVect() ).setBasis1( 1.0 );
				( objU.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case UniDimensionalAngleResult:
				{
				objU.setValuePort( new FlexString( "_di_" ) );
				( objU.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objU.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			}


		engageDelegation( objC , objA );
		engageDelegation( objC , objB );
		engageDelegation( objC , objU );




		
		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objK1 = MyFac.createDepictor();
		engageDelegation( objC , objK1 );

		DrawObj objK2 = MyFac.createDepictor();
		engageDelegation( objC , objK2 );

		objK1.setFrontLineColor( getDirecColor() );
		objK1.setBackLineColor( getDirecColor() );
		( (Direc1) objK1 ).setDirec( DirType );
		objK2.setFrontLineColor( getDirecColor() );
		objK2.setBackLineColor( getDirecColor() );
		( (Direc1) objK2 ).setDirec( DirType );



		Manager.engineSetLinkOn( false );
		boolean Err = false;


		DrawObj objX1 = null;
		objAI.setValuePort( 1 );
		objBI.setValuePort( 1 );
		int aMable = objAI.portGetMovable().value;
		int bMable = objBI.portGetMovable().value;
		boolean usingCrossAsgn = false;

		if( /* ( aMable & GeomConstants.MableAsgnMask ) == 0 */ false )
			{
			usingCrossAsgn = true;
			exprname.setInsertPoint( 0 );
			Object[] obcc = { objC , " * " , objB };
			Manager.insertFormattedString( obcc , exprname );

			resname.setInsertPoint( 0 );
			Object[] obc = { objA };
			Manager.insertFormattedString( obc , resname );
		

			Err = Manager.changeExpression( resname ,
				exprname , EngineConstants.USER_AXIOM_MODE );
			tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
			}
			else
			{
			if( /* ( bMable & GeomConstants.MableAsgnMask ) == 0 */ false )
				{
				usingCrossAsgn = true;
				exprname.setInsertPoint( 0 );
				Object[] obcc = { objA , " / " , objC };
				Manager.insertFormattedString( obcc , exprname );

				resname.setInsertPoint( 0 );
				Object[] obc = { objB };
				Manager.insertFormattedString( obc , resname );
		

				Err = Manager.changeExpression( resname ,
					exprname , EngineConstants.USER_AXIOM_MODE );
				tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
				}
				else
				{
				exprname.setInsertPoint( 0 );
				Object[] obcc = { objA , " / " , objB };
				Manager.insertFormattedString( obcc , exprname );

				resname.setInsertPoint( 0 );
				Object[] obc = { objC };
				Manager.insertFormattedString( obc , resname );
		

				Err = Manager.changeExpression( resname ,
					exprname , EngineConstants.USER_AXIOM_MODE );
				tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
				}
			}
		




		if( !usingCrossAsgn )
			{
			MyFac.setDepicClass( "Proportional Diagram Constraint Type I" );
			objX1 = MyFac.createDepictor();
			engageDelegation( objC , objX1 );
			objX1.setFrontLineVisible( false );
			objX1.setBackLineVisible( false );
			objX1.setTextVisible( false );
			objA.setControlsVisible( false );
			objB.setControlsVisible( false );
			}




		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] diu = { "_di" , objU };
		Manager.insertFormattedString( diu , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dib = { "_di" , objB };
		Manager.insertFormattedString( dib , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dia = { "_di" , objA };
		Manager.insertFormattedString( dia , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */








		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdu = { "_hd" , objU };
		Manager.insertFormattedString( hdu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hduc = { "_hd" , objA };
		Manager.insertFormattedString( hduc , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk1 = { "_hd" , objK1 };
		Manager.insertFormattedString( hdk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk1c = { "_hd" , objU , " \\+ ( ( " , objU ,
			" ) * " , "_di" , objU , " ) " };
		Manager.insertFormattedString( hdk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk1 = { objK1 };
		Manager.insertFormattedString( obk1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk1c = { "_hd" , objB , " \\+ ( ( " , objB ,
			" ) * " , "_di" , objB , " ) \\- " , "_hd" , objK1 };
		Manager.insertFormattedString( obk1c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdk2 = { "_hd" , objK2 };
		Manager.insertFormattedString( hdk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdk2c = { "_hd" , objA , " \\+ ( ( " , objA ,
			" ) * " , "_di" , objA , " ) " };
		Manager.insertFormattedString( hdk2c , exp2 );
		

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obk2 = { objK2 };
		Manager.insertFormattedString( obk2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obk2c = { "_hd" , objC , " \\+ ( ( " , objC ,
			" ) * " , "_di" , objC , " ) \\- " , "_hd" , objK2 };
		Manager.insertFormattedString( obk2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		if( !usingCrossAsgn )
			{

		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdx1 = { "_hd" , objX1 };
		Manager.insertFormattedString( hdx1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdx1c = { "_hd" , objC };
		Manager.insertFormattedString( hdx1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] d2x1 = { "_d2" , objX1 };
		Manager.insertFormattedString( d2x1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] d2x1c = { "_di" , objC };
		Manager.insertFormattedString( d2x1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] d1x1 = { "_d1" , objX1 };
		Manager.insertFormattedString( d1x1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] d1x1c = { "_di" , objA };
		Manager.insertFormattedString( d1x1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obx1 = { objX1 };
		Manager.insertFormattedString( obx1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obx1c = { objA };
		Manager.insertFormattedString( obx1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obpx1 = { "_ob" , objX1 };
		Manager.insertFormattedString( obpx1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obpx1c = { objB };
		Manager.insertFormattedString( obpx1c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

			}
			else tcnt += 5;




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obu = { objU };
		Manager.insertFormattedString( obu , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obuc = { "1.0" };
		Manager.insertFormattedString( obuc , exp2 );
		

		
		if( ScalingUnit ) Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setOffsetText( - 0.25 * 40 ); }
		if( objB instanceof Ssca1 )
			{ ( (Ssca1) objB ).setEndTag( );
				( (Ssca1) objB ).setOffsetText( - 0.25 * 40 ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( ); }
		if( objU instanceof Ssca1 )
			{ ( (Ssca1) objU ).setEndTag( );
				( (Ssca1) objU ).setOffsetText( - ( (Ssca1) objU ).getOffsetText() ); }


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		objC.setTemporary( true );
		Manager.bringToFront( objC );

		/* postDeleteObj( objA );
		postDeleteObj( objB ); */

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Dots-products two depictors.
*/
	public boolean dotAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! nMvec */
		boolean flag = false;


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			}

	
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			}


		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalDotAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}



/**
* Dot-products two elements in a simplified manner.
*/
	protected DrawObj generalDotAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		String ClName )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		MyFac.setDepicClass( ClName );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "&cdot;" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " dot " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}



/**
* Cross-products two depictors.
*/
	public boolean crossAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			}

	
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			}


		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalCrossAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}


			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}

/**
* Cross-products two elements in a simplified manner.
*/
	protected DrawObj generalCrossAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		String ClName )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		MyFac.setDepicClass( ClName );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "<BT>&times;</BT>" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " cross " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}


/**
* Wedge-products two depictors.
*/
	public boolean wedgeAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM , boolean Simp )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "ModSegment Scalar Type I" );
				flag = true;
				}

			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				if( Simp ) generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
					else vectWedgeAnimate( objAI , objBI , objaDGM , objbDGM );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			}

	
		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Vect1 ) ||  ( objBI instanceof Vect2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Vector Type I" );
				flag = true;
				}

			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			if( ( objBI instanceof Para1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}

			}


		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "GA Phasor Type I" );
				flag = true;
				}


			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) )
				{
				generalWedgeAnimateSimp( objAI , objBI , objaDGM , objbDGM , "Para. Bivector Type I" );
				flag = true;
				}


			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Wedge-products two vectors.
*/
	protected void vectWedgeAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{ 
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvcbpos = new Mvec();
		Mvec mvcbtl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;
		DrawObj objB = null;

		
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}



		TmpHex = new Hexar();
		TmpHex.setGlo( mvcbpos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "Vector Type I" );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();

		objBI.setValuePort( 0 );
		objB.setValuePort( 0 );
		( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );
		Mvec mvcB = objB.portGetVect();


		objAI.getAdditiveExtents( objaDGM.getMyCoord() , mvcapos , mvcatl );
		objBI.getAdditiveExtents( objbDGM.getMyCoord() , mvcbpos , mvcbtl );

		HighLevelList ChgList = new HighLevelList();
		HighLevelList SrcList = new HighLevelList();
		HighLevelList DstList = new HighLevelList();

		ChgList.insertRight( mvcA );
		ChgList.insertRight( mvcB );
		Mvec tmp1 = new Mvec();
		tmp1.setBasis1( mvcA.getBasis1() );
		tmp1.setBasis2( mvcA.getBasis2() );
		SrcList.insertRight( tmp1 );
		tmp1 = new Mvec();
		tmp1.setBasis1( mvcB.getBasis1() );
		tmp1.setBasis2( mvcB.getBasis2() );
		SrcList.insertRight( tmp1 );

		Mvec ta1 = new Mvec();
		Mvec tposn = new Mvec();
		/* mvcA.add( mvcB , ta1 );
		ta1.scale( 0.5 , tposn ); */
		mvcatl.copyAllInfo( tposn );

		Mvec t1 = new Mvec();
		tposn.sub( mvcatl , t1 );
		Mvec t2 = new Mvec();
		mvcA.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		t1 = new Mvec();
		tposn.sub( mvcbpos , t1 );
		t2 = new Mvec();
		mvcB.add( t1 , t2 );

		tmp1 = new Mvec();
		tmp1.setBasis1( t2.getBasis1() );
		tmp1.setBasis2( t2.getBasis2() );
		DstList.insertRight( tmp1 );

		doAnimation( ChgList , SrcList , DstList , 15 );
		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 5;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		ChgList.eraseAllInfo();
		SrcList.eraseAllInfo();
		DstList.eraseAllInfo();	



		createBinaryOpName( objA , "^" , objB , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objA , " wedge " , objB };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setDepicClass( "Para. Bivector Type I" );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		FlexString res2;
		FlexString exp2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdcc = { "_hd" , objA };
		Manager.insertFormattedString( hdcc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objB };
		Manager.insertFormattedString( hdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdb = { "_md" , objC };
		Manager.insertFormattedString( mdb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mdbc = { "_hd" , objA , " \\+ " , objA };
		Manager.insertFormattedString( mdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mxb = { "_mx" , objC };
		Manager.insertFormattedString( mxb , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] mxbc = { "_hd" , objB , " \\+ " , objB };
		Manager.insertFormattedString( mxbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objB.updateYourself( MyKit , nbDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		
		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		
		/* objA.setValuePort( 0 );
		objC.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( objC.portGetVect() );
		objB.setValuePort( 0 );
		objA.portGetVect().copyAllInfo( objB.portGetVect() ); */

		engageDelegation( objC , objA );
		engageDelegation( objC , objB );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Wedge-products two elements in a simplified manner.
*/
	protected DrawObj generalWedgeAnimateSimp( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM ,
		String ClName )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		MyFac.setDepicClass( ClName );


		int tcnt = 0; int tmax = 1;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		createBinaryOpName( objAI , "^" , objBI , resvarname );
		

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { objAI , " wedge " , objBI };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */
		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		

		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		return( objC );
		}


/**
* Assigns one depictor to another.
*/
	public boolean assignAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{ /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! nMvec */
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			if( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) )
				{
				flag = generalAssignAnimate( objAI , objBI , objaDGM , objbDGM );
				}

			}

		if( ( objAI instanceof Vect1 ) || ( objAI instanceof Vect2 ) )
			{
			if( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) )
				{
				flag = generalAssignAnimate( objAI , objBI , objaDGM , objbDGM );
				}

			}

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			if( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) )
				{
				flag = generalAssignAnimate( objAI , objBI , objaDGM , objbDGM );
				}

			if( ( objBI instanceof Para1 ) )
				{
				flag = generalAssignAnimate( objAI , objBI , objaDGM , objbDGM );
				}
			}

		if( ( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Para1 ) )
				{
				flag = generalAssignAnimate( objAI , objBI , objaDGM , objbDGM );
				}
			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Assigns one depictor to another.
*/
	protected boolean generalAssignAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		resname.setInsertPoint( 0 );
		Object[] oai = { objAI };
		Manager.insertFormattedString( oai , resname );

		exprname.setInsertPoint( 0 );
		Object[] obi = { objBI };
		Manager.insertFormattedString( obi , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_MODE );

		Manager.globalRepaint(); // Manager.globalSynchPaint();
		return( Err );
		}


/**
* Creates a proportion.
*/
	public boolean proportionAnimate( DrawObj objAI , DGMNode objaDGM ,
					DrawObj objBI , DGMNode objbDGM ,
					DrawObj objCI , DGMNode ncDGM ,
					DrawObj objDI , DGMNode objdDGM ,
					int output ) /* !!!!!!!!!!!!!!!!!!!!!!!! nMvec */

		{
		boolean Err = true;

		if( ( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) ) 
			&& ( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) ) 
			&& ( ( objCI instanceof Dsca1 ) || ( objCI instanceof Ssca1 ) ) 
			&& ( ( objDI instanceof Dsca1 ) || ( objDI instanceof Ssca1 ) ) )
			{
			sscaProportionAnimate( objAI , objaDGM ,
					objBI , objbDGM ,
					objCI , ncDGM ,
					objDI , objdDGM ,
					output );
			Err = false;
			}

		return( Err );
		}


/**
* Creates a scalar proportion.
*/
	protected void sscaProportionAnimate( DrawObj objAI , DGMNode objaDGM ,
					DrawObj objBI , DGMNode objbDGM ,
					DrawObj objCI , DGMNode ncDGM ,
					DrawObj objDI , DGMNode objdDGM ,
					int output )
		{
		try{

		DrawObj objA = null;
		DrawObj objB = null;
		DrawObj objC = null;
		DrawObj objD = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcapos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( useInDx && ( isRebuildableDepic( objAI ) ) )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( useInDx && ( isRebuildableDepic( objBI ) ) )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objCI.getVectName() );
		MyFac.setNewVectColors( objCI );
		MyFac.setPlaceAt( OutPt );
		objC = MyFac.createDepictor();
		ncDGM = MyFac.getLastDGM();

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objDI.getVectName() );
		MyFac.setNewVectColors( objDI );
		MyFac.setPlaceAt( OutPt );
		objD = MyFac.createDepictor();


		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		/* ( (Ssca1) objD1 ).setDragThrough( false ); */
		DrawObj objD2 = MyFac.createDepictor();
		/* ( (Ssca1) objD2 ).setDragThrough( false ); */

		objD1.setFrontLineColor( getDirecColor() );
		objD1.setBackLineColor( getDirecColor() );
		( (Direc1) objD1 ).setDirec( DirType );
		objD2.setFrontLineColor( getDirecColor() );
		objD2.setBackLineColor( getDirecColor() );
		( (Direc1) objD2 ).setDirec( DirType );


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objA.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( 1.0 );
				( objB.portGetVect() ).setBasis2( 0.0 );

				objC.setValuePort( new FlexString( "_di_" ) );
				( objC.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objC.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objD.setValuePort( new FlexString( "_di_" ) );
				( objD.portGetVect() ).setBasis1( 1.0 );
				( objD.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );

				objB.setValuePort( new FlexString( "_di_" ) );
				( objB.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objB.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );

				objC.setValuePort( new FlexString( "_di_" ) );
				( objC.portGetVect() ).setBasis1( 1.0 );
				( objC.portGetVect() ).setBasis2( 0.0 );

				objD.setValuePort( new FlexString( "_di_" ) );
				( objD.portGetVect() ).setBasis1( Math.cos( Math.toRadians( 45 ) ) );
				( objD.portGetVect() ).setBasis2( Math.sin( Math.toRadians( 45 ) ) );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );

				objBI.setValuePort( new FlexString( "_di_" ) );
				objB.setValuePort( new FlexString( "_di_" ) );
				( objBI.portGetVect() ).copyAllInfo( objB.portGetVect() );

				objCI.setValuePort( new FlexString( "_di_" ) );
				objC.setValuePort( new FlexString( "_di_" ) );
				( objCI.portGetVect() ).copyAllInfo( objC.portGetVect() );

				objDI.setValuePort( new FlexString( "_di_" ) );
				objD.setValuePort( new FlexString( "_di_" ) );
				( objDI.portGetVect() ).copyAllInfo( objD.portGetVect() );
				}
				break;
			}


		switch( output )
			{
			case 0:
				MyKit.setResultObj( objA );
				engageDelegation( objA , objB );
				engageDelegation( objA , objC );
				engageDelegation( objA , objD );
				engageDelegation( objA , objD1 );
				engageDelegation( objA , objD2 );
				break;

			case 1:
				MyKit.setResultObj( objB );
				engageDelegation( objB , objA );
				engageDelegation( objB , objC );
				engageDelegation( objB , objD );
				engageDelegation( objB , objD1 );
				engageDelegation( objB , objD2 );
				break;

			case 2:
				MyKit.setResultObj( objC );
				engageDelegation( objC , objA );
				engageDelegation( objC , objB );
				engageDelegation( objC , objD );
				engageDelegation( objC , objD1 );
				engageDelegation( objC , objD2 );
				break;

			case 3:
				MyKit.setResultObj( objD );
				engageDelegation( objD , objA );
				engageDelegation( objD , objB );
				engageDelegation( objD , objC );
				engageDelegation( objD , objD1 );
				engageDelegation( objD , objD2 );
				break;
			}


		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 10;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );


		Object[] mainLHS = null;
		Object[] mainRHS = null;

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		switch( output )
			{
			case 0:
				{
				Object[] lhs = { objA };
				mainLHS = lhs;
				Object[] rhs = { objB , " * " , objC , " / " , objD };
				mainRHS = rhs;
				}
				break;

			case 1:
				{
				Object[] lhs = { objB };
				mainLHS = lhs;
				Object[] rhs = { objD , " * " , objA , " / " , objC };
				mainRHS = rhs;
				}
				break;

			case 2:
				{
				Object[] lhs = { objC };
				mainLHS = lhs;
				Object[] rhs = { objD , " * " , objA , " / " , objB };
				mainRHS = rhs;
				}
				break;

			case 3:
				{
				Object[] lhs = { objD };
				mainLHS = lhs;
				Object[] rhs = { objB , " * " , objC , " / " , objA };
				mainRHS = rhs;
				}
				break;
			}


		Manager.insertFormattedString( mainLHS , res2 );
		Manager.insertFormattedString( mainRHS , exp2 );

		boolean Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.USER_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] d1LHS = null;
		Object[] d1RHS = null;

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		if( output == 0 )
			{
			Object[] lhs = { "_di" , objA };
			d1LHS = lhs;
			Object[] rhs = { "_di" , objC };
			d1RHS = rhs;
			}
			else
			{
			Object[] lhs = { "_di" , objC };
			d1LHS = lhs;
			Object[] rhs = { "_di" , objA };
			d1RHS = rhs;
			}

		Manager.insertFormattedString( d1LHS , res2 );
		Manager.insertFormattedString( d1RHS , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] d2LHS = null;
		Object[] d2RHS = null;

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		if( output == 1 )
			{
			Object[] lhs = { "_di" , objB };
			d2LHS = lhs;
			Object[] rhs = { "_di" , objD };
			d2RHS = rhs;
			}
			else
			{
			Object[] lhs = { "_di" , objD };
			d2LHS = lhs;
			Object[] rhs = { "_di" , objB };
			d2RHS = rhs;
			}

		Manager.insertFormattedString( d2LHS , res2 );
		Manager.insertFormattedString( d2RHS , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		Object[] h1LHS = null;
		Object[] h1RHS = null;

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		if( output == 0 )
			{
			Object[] lhs = { "_hd" , objA };
			h1LHS = lhs;
			Object[] rhs = { "_hd" , objC };
			h1RHS = rhs;
			}
			else
			{
			Object[] lhs = { "_hd" , objC };
			h1LHS = lhs;
			Object[] rhs = { "_hd" , objA };
			h1RHS = rhs;
			}

		Manager.insertFormattedString( h1LHS , res2 );
		Manager.insertFormattedString( h1RHS , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] h2LHS = null;
		Object[] h2RHS = null;

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		if( output == 1 )
			{
			Object[] lhs = { "_hd" , objB };
			h2LHS = lhs;
			Object[] rhs = { "_hd" , objD };
			h2RHS = rhs;
			}
			else
			{
			Object[] lhs = { "_hd" , objD };
			h2LHS = lhs;
			Object[] rhs = { "_hd" , objB };
			h2RHS = rhs;
			}

		Manager.insertFormattedString( h2LHS , res2 );
		Manager.insertFormattedString( h2RHS , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] h3LHS = null;
		Object[] h3RHS = null;

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		if( output == 0 )
			{
			Object[] lhs = { "_hd" , objB };
			h3LHS = lhs;
			Object[] rhs = { "_hd" , objA };
			h3RHS = rhs;
			}
			else
			{
			Object[] lhs = { "_hd" , objA };
			h3LHS = lhs;
			Object[] rhs = { "_hd" , objB };
			h3RHS = rhs;
			}

		Manager.insertFormattedString( h3LHS , res2 );
		Manager.insertFormattedString( h3RHS , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */






		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd1 = { "_hd" , objD1 };
		Manager.insertFormattedString( hdd1 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd1c = { "_hd" , objB , " \\+ " ,
			objB , " * " , "_di" , objB };
		Manager.insertFormattedString( hdd1c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdd2 = { "_hd" , objD2 };
		Manager.insertFormattedString( hdd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdd2c = { "_hd" , objD , " \\+ " ,
			objD , " * " , "_di" , objD };
		Manager.insertFormattedString( hdd2c , exp2 );
		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */








		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obd2 = { objD2 };
		Manager.insertFormattedString( obd2 , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] obd2c = { "_hd" , objC , " \\+ " ,
			objC , " * " , "_di" , objC , " \\- " , "_hd" , objD2 };
		Manager.insertFormattedString( obd2c , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] d1c = { objD1 };
		Manager.insertFormattedString( d1c , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] d1cc = { "_hd" , objA , " \\+ " ,
			objA , " * " , "_di" , objA , " \\- " , "_hd" , objD1 };
		Manager.insertFormattedString( d1cc , exp2 );

		
		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();
		objC.setEndTag();
		objD.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();

		blinkObject( objC ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}


/**
* Handles the power function operator.
* Assumes that a phasor power function plugin has been installed.
*/
	public boolean powerAnimate( DrawObj objAI , DGMNode objaDGM ,
		DrawObj objBI , DGMNode objbDGM ) /* !!!!!!!!!!!!!!!!!!!! nMvec */
		{
		boolean Err = true;

		if( ( objAI instanceof Ssca1 ) || ( objAI instanceof Dsca1 ) ||
			( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) ||
			( objAI instanceof Para1 ) )
			{
			if( ( objBI instanceof Ssca1 ) || ( objBI instanceof Dsca1 ) ||
				( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) ||
				( objBI instanceof Para1 ) )
				{
				powerAnimateSimp( objAI , objaDGM , objBI , objbDGM );
				Err = false;
				}
			}

		return( Err );
		}


/**
* Handles the power function operator or a scalar or a phasor.
* Assumes that a phasor power function plugin has been installed.
*/

	protected void powerAnimateSimp( DrawObj objAI , DGMNode objaDGM ,
		DrawObj objBI , DGMNode objbDGM ) 
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createBinaryOpName( objAI , " power " , objBI , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "powr( " , objAI , " , " , objBI , " )" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}



/**
* Creates the square root.
* Assumes that a phasor square root plugin has been installed.
*/
	public boolean sqrtAnimate( DrawObj objAI , DGMNode objaDGM ) /* !!!!!!!!!!!!!!!!! nMvec */
		{
		boolean Err = true;

		if( ( objAI instanceof Ssca1 ) || ( objAI instanceof Dsca1 ) ||
			( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) || ( objAI instanceof Para1 ) )
			{
			sqrtAnimateSimp( objAI , objaDGM );
			Err = false;
			}

		return( Err );
		}


/**
* Creates the square root of a scalar or a phasor.
* Assumes that a phasor square root plugin has been installed.
*/
	protected void sqrtAnimateSimp( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "-" , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "sqrt( " , objAI , " )" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}


/**
* Creates the exponential.
*/
	public boolean exponentialAnimate( DrawObj objAI , DGMNode objaDGM ) /* !!!!!!!!!!!!! nMvec */
		{
		boolean Err = true;

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			phasExponentialAnimate( objAI , objaDGM );
			Err = false;
			}

		if( ( objAI instanceof Ssca1 ) || ( objAI instanceof Dsca1 ) )
			{
			sscaExponentialAnimate( objAI , objaDGM );
			Err = false;
			}

		if( objAI instanceof Para1 )
			{
			phasExponentialAnimate( objAI , objaDGM );
			Err = false;
			}

		return( Err );
		}


/**
* Creates the exponential of a scalar.
*/
	protected void sscaExponentialAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "exp( " , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "exp( " , objAI , " )" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}


/**
* Creates the exponential of a phasor.
*/
	protected void phasExponentialAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "exp( " , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "exp( " , objAI , " )" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}




/**
* Creates the scalar graded part.
*/
	public boolean scalGradPartAnimate( DrawObj objAI , DGMNode objaDGM ) /* !!!!!!!!!!!!!! nMvec */
		{
		boolean Err = true;

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			generalScalGradPartAnimate( objAI , objaDGM );
			Err = false;
			}

		if( ( objAI instanceof Ssca1 ) || ( objAI instanceof Dsca1 ) )
			{
			generalScalGradPartAnimate( objAI , objaDGM );
			Err = false;
			}

		return( Err );
		}



/**
* Creates the scalar graded part of a phasor or a scalar.
*/
	protected void generalScalGradPartAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "scgp( " , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "< " , objAI , " >{ 0 }" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}




/**
* Creates the imaginary graded part.
*/
	public boolean imagGradPartAnimate( DrawObj objAI , DGMNode objaDGM ) /* !!!!!!!!!!! nMvec */
		{
		boolean Err = true;

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			generalImagGradPartAnimate( objAI , objaDGM );
			Err = false;
			}

		if( ( objAI instanceof Para1 ) )
			{
			generalImagGradPartAnimate( objAI , objaDGM );
			Err = false;
			}

		return( Err );
		}



/**
* Creates the imaginary graded part of a phasor or a scalar.
*/
	protected void generalImagGradPartAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "scgp( " , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "< " , objAI , " >{ 2 }" };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}




/**
* Creates a trace graph.
*/
	public boolean traceGraphAnimate( DrawObj objAI , DrawObj objBI ,
					DGMNode objaDGM , DGMNode objbDGM ) /* !!!!!!!!!!!! nMvec */

		{
		boolean Err = true;

		if( ( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) ) )
			{
			if( ( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) ) )
				{
				sscaTraceGraphAnimate( objAI , objBI ,
						objaDGM , objbDGM );
				Err = false;
				}

			if( ( ( objBI instanceof Vect1 ) || ( objBI instanceof Vect2 ) ) )
				{
				vectTraceGraphAnimate( objAI , objBI ,
						objaDGM , objbDGM );
				Err = false;
				}

			if( ( ( objBI instanceof Angle1 ) || ( objBI instanceof Angle2 ) ) )
				{
				phasTraceGraphAnimate( objAI , objBI ,
						objaDGM , objbDGM );
				Err = false;
				}

			if( ( objBI instanceof Para1 ) )
				{
				phasTraceGraphAnimate( objAI , objBI ,
						objaDGM , objbDGM );
				Err = false;
				}

			}

		return( Err );
		}


/**
* Creates a phasor trace graph.
*/
	protected void phasTraceGraphAnimate( DrawObj objAI , DrawObj objBI ,
		DGMNode objaDGM , DGMNode objbDGM )
		{
		try{

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcapos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyFac.setDepicClass( "GA Phasor Type I" );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objBI ) ) */ false )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		MyFac.setDepicClass( "Tracer Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );
		( (Tracer1) objD1 ).setTraceOn( true );


		MyKit.setResultObj( objA );
		engageDelegation( objA , objB );
		engageDelegation( objB , objD1 );



		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 3;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA , " \\+ " , "_di" , objA , " * " , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] diB = { "_md" , objB };
		Object[] diBC = { "_hd" , objB , " \\+ #1" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( diB , res2 );
		Manager.insertFormattedString( diBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objB , " \\+ " ,
			"UnitOf( " , "_md" , objB , " \\- " , "_hd" , objB , " ) * " , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();

		blinkObject( objB ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Creates a vector trace graph.
*/
	protected void vectTraceGraphAnimate( DrawObj objAI , DrawObj objBI ,
		DGMNode objaDGM , DGMNode objbDGM )
		{
		try{

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcapos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyFac.setDepicClass( "Vector Type I" );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objBI ) ) */ false )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		MyFac.setDepicClass( "Tracer Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );
		( (Tracer1) objD1 ).setTraceOn( true );


		MyKit.setResultObj( objA );
		engageDelegation( objA , objB );
		engageDelegation( objB , objD1 );



		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 2;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA , " \\+ " , "_di" , objA , " * " , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objB , " \\+ " , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();

		blinkObject( objB ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}


/**
* Creates a scalar trace graph.
*/
	protected void sscaTraceGraphAnimate( DrawObj objAI , DrawObj objBI ,
		DGMNode objaDGM , DGMNode objbDGM )
		{
		try{

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcapos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objBI ) ) */ false )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		MyFac.setDepicClass( "Line Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL1 = MyFac.createDepictor();
		DrawObj objL2 = MyFac.createDepictor();

		MyFac.setDepicClass( "Tracer Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );
		( (Tracer1) objD1 ).setTraceOn( true );


		MyKit.setResultObj( objA );
		engageDelegation( objA , objB );
		engageDelegation( objB , objD1 );
		engageDelegation( objB , objL1 );
		engageDelegation( objB , objL2 );



		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 7;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] diB = { "_di" , objB };
		Object[] diBC = { "_di" , objA , " * #12" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( diB , res2 );
		Manager.insertFormattedString( diBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objA , " \\+ ( < " , objA , " >{ 0 } * " ,
				"_di" , objA , " ) \\+ ( < " , objB , " >{ 0 } * " ,
				"_di" , objB , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] hdL1 = { "_hd" , objL1 };
		Object[] hdL1C = { "_hd" , objA };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdL1 , res2 );
		Manager.insertFormattedString( hdL1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] obL1 = { objL1 };
		Object[] obL1C = { "_di" , objA };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obL1 , res2 );
		Manager.insertFormattedString( obL1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] hdL2 = { "_hd" , objL2 };
		Object[] hdL2C = { "_hd" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdL2 , res2 );
		Manager.insertFormattedString( hdL2C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] obL2 = { objL2 };
		Object[] obL2C = { "_di" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obL2 , res2 );
		Manager.insertFormattedString( obL2C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();

		blinkObject( objB ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}




/**
* Creates a cont graph.
*/
	public boolean contGraphAnimate( DrawObj objAI , DrawObj objBI ,
					DGMNode objaDGM , DGMNode objbDGM ) /* !!!!!!!!!!!! nMvec */

		{
		boolean Err = true;

		if( ( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) ) )
			{
			if( ( ( objBI instanceof Dsca1 ) || ( objBI instanceof Ssca1 ) ) )
				{
				sscaContGraphAnimate( objAI , objBI ,
						objaDGM , objbDGM );
				Err = false;
				}

			}

		return( Err );
		}



/**
* Creates a scalar cont graph.
*/
	protected void sscaContGraphAnimate( DrawObj objAI , DrawObj objBI ,
		DGMNode objaDGM , DGMNode objbDGM )
		{
		try{

		DrawObj objA = null;
		DrawObj objB = null;

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		Hexar TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcapos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}

		TmpHex = new Hexar();
		/* TmpHex.setGlo( mvcbpos ); */
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setNewVectName( objBI.getVectName() );
		MyFac.setNewVectColors( objBI );
		MyFac.setPlaceAt( OutPt );
		DGMNode nbDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objBI ) ) */ false )
			{
			objB = objBI;
			nbDGM = objbDGM;
			}
			else
			{
			objB = MyFac.createDepictor();
			nbDGM = MyFac.getLastDGM();
			}


		MyFac.setDepicClass( "Line Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL1 = MyFac.createDepictor();
		DrawObj objL2 = MyFac.createDepictor();

		MyFac.setDepicClass( "Tracer Type II" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );


		MyKit.setResultObj( objA );
		engageDelegation( objA , objB );
		engageDelegation( objB , objD1 );
		engageDelegation( objB , objL1 );
		engageDelegation( objB , objL2 );



		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 8;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] diB = { "_di" , objB };
		Object[] diBC = { "_di" , objA , " * #12" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( diB , res2 );
		Manager.insertFormattedString( diBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objA , " \\+ ( < " , objA , " >{ 0 } * " ,
				"_di" , objA , " ) \\+ ( < " , objB , " >{ 0 } * " ,
				"_di" , objB , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] lqd1 = { "_lq" , objD1 };
		Object[] lqd1C = { objA };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( lqd1 , res2 );
		Manager.insertFormattedString( lqd1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] hdL1 = { "_hd" , objL1 };
		Object[] hdL1C = { "_hd" , objA };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdL1 , res2 );
		Manager.insertFormattedString( hdL1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] obL1 = { objL1 };
		Object[] obL1C = { "_di" , objA };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obL1 , res2 );
		Manager.insertFormattedString( obL1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] hdL2 = { "_hd" , objL2 };
		Object[] hdL2C = { "_hd" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdL2 , res2 );
		Manager.insertFormattedString( hdL2C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Object[] obL2 = { objL2 };
		Object[] obL2C = { "_di" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obL2 , res2 );
		Manager.insertFormattedString( obL2C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */





		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		objA.setEndTag();
		objB.setEndTag();


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();

		blinkObject( objB ); } catch( Exception e ) { throw( new WrapRuntimeException( "Op Failed" , e ) ); }
		}



/**
* Sine Animates
*/
	public void sineAnimate( )
		{
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objA = MyFac.createDepictor();
		DGMNode naDGM = MyFac.getLastDGM();
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();

		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objB = MyFac.createDepictor();

		MyFac.setDepicClass( "Tracer Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );
		( (Tracer1) objD1 ).setTraceOn( true );

		MyFac.setDepicClass( "Line Segment Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL = MyFac.createDepictor();
		objL.setFrontLineColor( DirecColor );
		objL.setBackLineColor( DirecColor );


		int tcnt = 0; int tmax = 9;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA , " \\+ " , "_di" , objA , " * " , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] diB = { "_md" , objB };
		Object[] diBC = { "_hd" , objB , " + #1" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( diB , res2 );
		Manager.insertFormattedString( diBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] ooB = { objB };
		Object[] ooBC = { "0.48 * exp( #12 * 5 * " , objA , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( ooB , res2 );
		Manager.insertFormattedString( ooBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objC , " \\+ " , objC , " * " , "_di" , objC };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] hdc = { "_hd" , objC };
		Object[] hdcC = { "_hd" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdc , res2 );
		Manager.insertFormattedString( hdcC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] dic = { "_di" , objC };
		Object[] dicC = { "#2" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( dic , res2 );
		Manager.insertFormattedString( dicC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] obc = { objC };
		Object[] obcC = { "0.48 * sin( 5 * " , objA , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obc , res2 );
		Manager.insertFormattedString( obcC , exp2 );

		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] hdl = { "_hd" , objL };
		Object[] hdlC = { "_hd" , objB , " \\+ " ,
			"UnitOf( " , "_md" , objB , " \\- " , "_hd" , objB , " ) * " , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdl , res2 );
		Manager.insertFormattedString( hdlC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] obl = { objL };
		Object[] oblC = { "_hd" , objC , " \\+ " ,
			objC , " * " , "_di" , objC , " \\- " , "_hd" , objL };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obl , res2 );
		Manager.insertFormattedString( oblC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		MyKit.setResultObj( objC );
		engageDelegation( objC , objA );
		engageDelegation( objC , objD1 );
		engageDelegation( objC , objB );
		engageDelegation( objC , objL );


		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint(); // Manager.globalSynchPaint();
		
		}


/**
* Cosine Animates
*/
	public void cosineAnimate( )
		{
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objA = MyFac.createDepictor();
		DGMNode naDGM = MyFac.getLastDGM();
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();

		MyFac.setDepicClass( "GA Phasor Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objB = MyFac.createDepictor();
		DGMNode nbDGM = MyFac.getLastDGM();

		MyFac.setDepicClass( "Tracer Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objD1 = MyFac.createDepictor();
		Integer DirecColor = Color.rgb( 206 , 0 , 199 );
		objD1.setFrontLineColor( DirecColor );
		objD1.setBackLineColor( DirecColor );
		( (Tracer1) objD1 ).setTraceOn( true );

		MyFac.setDepicClass( "Line Segment Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL = MyFac.createDepictor();
		objL.setFrontLineColor( DirecColor );
		objL.setBackLineColor( DirecColor );


		int tcnt = 0; int tmax = 9;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		Manager.engineSetLinkOn( false );



		Object[] hdB = { "_hd" , objB };
		Object[] hdBC = { "_hd" , objA , " \\+ " , "_di" , objA , " * " , objA };

		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdB , res2 );
		Manager.insertFormattedString( hdBC , exp2 );

		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] diB = { "_md" , objB };
		Object[] diBC = { "_hd" , objB , " + #2" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( diB , res2 );
		Manager.insertFormattedString( diBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] ooB = { objB };
		Object[] ooBC = { "0.48 * exp( #12 * 5 * " , objA , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( ooB , res2 );
		Manager.insertFormattedString( ooBC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] d1 = { objD1 };
		Object[] d1C = { "_hd" , objC , " \\+ " , objC , " * " , "_di" , objC };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( d1 , res2 );
		Manager.insertFormattedString( d1C , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] hdc = { "_hd" , objC };
		Object[] hdcC = { "_hd" , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdc , res2 );
		Manager.insertFormattedString( hdcC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] dic = { "_di" , objC };
		Object[] dicC = { "#2" };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( dic , res2 );
		Manager.insertFormattedString( dicC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Object[] obc = { objC };
		Object[] obcC = { "0.48 * cos( 5 * " , objA , " ) " };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obc , res2 );
		Manager.insertFormattedString( obcC , exp2 );

		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] hdl = { "_hd" , objL };
		Object[] hdlC = { "_hd" , objB , " \\+ " ,
			"UnitOf( " , "_md" , objB , " \\- " , "_hd" , objB , " ) * " , objB };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( hdl , res2 );
		Manager.insertFormattedString( hdlC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Object[] obl = { objL };
		Object[] oblC = { "_hd" , objC , " \\+ " ,
			objC , " * " , "_di" , objC , " \\- " , "_hd" , objL };

		res2.clearString();
		res2.setInsertPoint( 0 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );

		Manager.insertFormattedString( obl , res2 );
		Manager.insertFormattedString( oblC , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		MyKit.setResultObj( objC );
		engageDelegation( objC , objA );
		engageDelegation( objC , objD1 );
		engageDelegation( objC , objB );
		engageDelegation( objC , objL );


		Manager.engineSetLinkOn( true );
		( Manager.getMyEngine() ).resolveConstraints();


		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		/* MyKit.getXKit().hideLoadFrame(); */
		Manager.globalRepaint();  // Manager.globalSynchPaint();
		
		}


/**
* Negates a depictor.
*/
	public boolean negateAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		boolean flag = false;

		generalNegateAnimate( objAI , objaDGM );
		flag = true;


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Negates a depictor.
*/
	public void generalNegateAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "-" , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = createGeneralMvec( objAI.vectGetExtDomain().value , MyFac );
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "-" , objAI };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}


/**
* Takes unary plus on a depictor.
*/
	public boolean positAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		boolean flag = false;

		generalPositAnimate( objAI , objaDGM );
		flag = true;


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Takes unary plus on a depictor.
*/
	public void generalPositAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		
		createUnaryOpName( objAI , "+" , rname );


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = createGeneralMvec( objAI.vectGetExtDomain().value , MyFac );
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "+" , objAI };
		Manager.insertFormattedString( ex , exprname );
		

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}


/**
* Gets the magnitude of a depictor.
*/
	public boolean magnitudeAnimate( DrawObj objAI , DGMNode objaDGM , boolean Simp )
		{
		boolean flag = false;
		int DomA = objAI.vectGetExtDomain().value;

		if( !Simp ) {

		if( DomA == ( DepictorPort.DOM_SCA ) )
		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			sscaMagnitudeAnimate( objAI , objaDGM );
			flag = true;
			}

			}


		if( !flag )
			{
			generalMagnitudeAnimate( objAI , objaDGM );
			flag = true;
			}


		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Gets the magnitude of the depictor.
*/
	protected void sscaMagnitudeAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		Mvec mvcapos = new Mvec();
		Mvec mvcatl = new Mvec();
		Mvec mvccpos = new Mvec();
		Mvec mvcctl = new Mvec();
		DrawObj objA = null;


		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );


		Hexar TmpHex = new Hexar();
		TmpHex.setGlo( mvcapos );
		MyKit.hexloc( TmpHex.getGlo() , false , TmpHex );
		PointF OutPt = new PointF( TmpHex.getLoc().x , TmpHex.getLoc().y );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( objAI.getVectName() );
		MyFac.setNewVectColors( objAI );
		MyFac.setPlaceAt( OutPt );
		DGMNode naDGM = null;
		if( /* useInDx && ( isRebuildableDepic( objAI ) ) */ false )
			{
			objA = objAI;
			naDGM = objaDGM;
			}
			else
			{
			objA = MyFac.createDepictor();
			naDGM = MyFac.getLastDGM();
			}


		switch( UniDimensionalScalars )
			{
			case UniDimensionalAngleResult:
			case UniDimensionalFlatResult:
				{
				objA.setValuePort( new FlexString( "_di_" ) );
				( objA.portGetVect() ).setBasis1( 1.0 );
				( objA.portGetVect() ).setBasis2( 0.0 );
				}
				break;
			case NoUniDimensionalScalars:
				{
				objAI.setValuePort( new FlexString( "_di_" ) );
				objA.setValuePort( new FlexString( "_di_" ) );
				( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
				}
				break;
			}

		
		objAI.setValuePort( 0 );
		objA.setValuePort( 0 );
		( objAI.portGetVect() ).copyAllInfo( objA.portGetVect() );
		Mvec mvcA = objA.portGetVect();


		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );

//		HighLevelList ChgList = new HighLevelList();
//		HighLevelList SrcList = new HighLevelList();
//		HighLevelList DstList = new HighLevelList();
//
//		ChgList.insertRight( mvcA );
//		ChgList.insertRight( mvcB );
//		Mvec tmp1 = new Mvec();
//		tmp1.setBasis1( mvcA.getBasis1() );
//		tmp1.setBasis2( mvcA.getBasis2() );
//		SrcList.insertRight( tmp1 );
//		tmp1 = new Mvec();
//		tmp1.setBasis1( mvcB.getBasis1() );
//		tmp1.setBasis2( mvcB.getBasis2() );
//		SrcList.insertRight( tmp1 );
//
//		Mvec ta1 = new Mvec();
//		Mvec tposn = new Mvec();
//		mvcA.add( mvcB , ta1 );
//		ta1.scale( 0.5 , tposn );
//
//		Mvec t1 = new Mvec();
//		tposn.sub( mvcatl , t1 );
//		Mvec t2 = new Mvec();
//		mvcA.add( t1 , t2 );
//
//		tmp1 = new Mvec();
//		tmp1.setBasis1( t2.getBasis1() );
//		tmp1.setBasis2( t2.getBasis2() );
//		DstList.insertRight( tmp1 );
//
//		t1 = new Mvec();
//		tposn.sub( mvcbpos , t1 );
//		t2 = new Mvec();
//		mvcB.add( t1 , t2 );
//
//		tmp1 = new Mvec();
//		tmp1.setBasis1( t2.getBasis1() );
//		tmp1.setBasis2( t2.getBasis2() );
//		DstList.insertRight( tmp1 );
//
//		doAnimation( ChgList , SrcList , DstList , 15 );
//		// !!!!!! MyKit.localSynchPaint();

		int tcnt = 0; int tmax = 6;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

//		ChgList.eraseAllInfo();
//		SrcList.eraseAllInfo();
//		DstList.eraseAllInfo();	


		/* preDeleteObj( objA ); */


		if( UseReplaceName )
			{
			resvarname.setInsertPoint( 0 );
			ReplaceName.insertString( resvarname );
			}
			else
			{
			resvarname.setInsertPoint( 0 );
			resvarname.insertJavaString( "<APPLY>" );
			resvarname.insertJavaString( "(&sp;|" );
			objAI.getVectName().insertString( resvarname );
			resvarname.insertJavaString( "|&sp;)" );
			resvarname.insertJavaString( "</APPLY>" );
			}

		
		exprname.setInsertPoint( 0 );
		Object[] obcc = { "magnitude( " , objA , " ) " };
		Manager.insertFormattedString( obcc , exprname );
		
		

		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyFac.setDepicClass( "Ruled Mark Type I" );
		MyFac.setNewVectNotNamed();
		DrawObj objL1 = MyFac.createDepictor();
		engageDelegation( objA , objL1 );
		objL1.setControlsVisible( false );

		// objC.setFrontLineVisible( false );
		// objC.setBackLineVisible( false );
		// objC.setTextVisible( false );


		/* These used to be objX.setEndTag() */
		if( objA instanceof Ssca1 )
			{ ( (Ssca1) objA ).setEndTag( );
				( (Ssca1) objA ).setUnitCrossTac( false );
				( (Ssca1) objA ).setEndCrossTac( true );
				( (Ssca1) objA ).setBasicFrontLineStroke( 1.0 );
				( (Ssca1) objA ).setOffsetText( - ( (Ssca1) objA ).getOffsetText() ); }
		if( objC instanceof Ssca1 )
			{ ( (Ssca1) objC ).setEndTag( );
				( (Ssca1) objC ).setUnitCrossTac( false );
				( (Ssca1) objC ).setEndCrossTac( true ); }


		engageDelegation( objC , objA );
		MyKit.setResultObj( objC );
		
		resname.setInsertPoint( 0 );
		Object[] obc = { objC };
		Manager.insertFormattedString( obc , resname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */

		FlexString exp2;
		FlexString res2;


		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdb = { "_hd" , objC };
		Manager.insertFormattedString( hdb , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] hdbc = { "_hd" , objA };
		Manager.insertFormattedString( hdbc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dic = { "_di" , objC };
		Manager.insertFormattedString( dic , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dicc = { "_di" , objA };
		Manager.insertFormattedString( dicc , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] obl = { objL1 };
		Manager.insertFormattedString( obl , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] oblc = { objA };
		Manager.insertFormattedString( oblc , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdl = { "_hd" , objL1 };
		Manager.insertFormattedString( hdl , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdlc = { "_hd" , objA };
		Manager.insertFormattedString( hdlc , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] dil = { "_di" , objL1 };
		Manager.insertFormattedString( dil , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] dilc = { "_di" , objA };
		Manager.insertFormattedString( dilc , exp2 );
		
		
		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );

		
		objA.updateYourself( MyKit , naDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
		objA.getAdditiveExtents( naDGM.getMyCoord() , mvcapos , mvcatl );
		
//		Mvec tx = new Mvec();
//		mvcbtl.sub( mvcapos , tx );
//		Mvec txlen = new Mvec();
//		tx.mcpy( txlen );
//		txlen.magnitude();
//		if( txlen.getBasis() < 0.0001 ) tx.setBasis1( 1.0 );
//		objC.preferredDirection( tx );
//		
//		objC.updateYourself( MyKit , ncDGM.getMyCoord() , MyKit.getBoundMode() , AdditionMode );
//		
//		objC.setValuePort( 0 );
//		Mvec mvcC = objC.portGetVect();
//
//		objC.getAdditiveExtents( ncDGM.getMyCoord() , mvccpos , mvcctl );
//
//		Mvec ta = new Mvec();
//		mvcapos.sub( mvccpos , ta );
//		Mvec tb = new Mvec();
//		mvcC.add( ta , tb );
//
//		mvcC.setBasis1( tb.getBasis1() );
//		mvcC.setBasis2( tb.getBasis2() );

		/* postDeleteObj( objA ); */

		( Manager.getMyEngine() ).resolveConstraints();

		Manager.sendToBack( objL1 );
		Manager.bringToFront( objC );

		/* MyKit.getXKit().hideLoadFrame(); */

		/* blinkObject( objC ); */
		}


/**
* Gets the magnitude of a depictor.
*/
	public void generalMagnitudeAnimate( DrawObj objAI , DGMNode objaDGM )
		{
		FlexString rname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();

		if( UseReplaceName )
			{
			rname.setInsertPoint( 0 );
			ReplaceName.insertString( rname );
			}
			else
			{
			rname.setInsertPoint( 0 );
			rname.insertJavaString( "<APPLY>" );
			rname.insertJavaString( "(&sp;|" );
			objAI.getVectName().insertString( rname );
			rname.insertJavaString( "|&sp;)" );
			rname.insertJavaString( "</APPLY>" );
			}

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		
		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( rname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		
		MyKit.setResultObj( objC );

		resname.setInsertPoint( 0 );
		Object[] rn = { objC };
		Manager.insertFormattedString( rn , resname );

		exprname.setInsertPoint( 0 );
		Object[] ex = { "magnitude( " , objAI , " ) " };
		Manager.insertFormattedString( ex , exprname );

		boolean Err = Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		blinkObject( objC );
		}

/**
* Creates a scalar representing a digit.
*/
	public void sscaCreateNewDigit( FlexString exprname )
		{
		FlexString resname = new FlexString();
		FlexString resvarname = new FlexString();
		resvarname.setInsertPoint( 0 );
		resvarname.insertJavaString( "<APPLY>" );
		exprname.insertString( resvarname );
		resvarname.insertJavaString( "</APPLY>" );

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "ModSegment Scalar Type I" );
		MyFac.setNewVectName( resvarname );
		MyFac.setNewVectColors( null );
		MyFac.setPlaceAt( OutPt );
		DrawObj objA = MyFac.createDepictor();
		DGMNode naDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objA );

		resname.setInsertPoint( 0 );
		Object[] res = { objA };
		Manager.insertFormattedString( res , resname );

		Manager.changeExpression( resname ,
			exprname , EngineConstants.USER_AXIOM_MODE );

		Manager.globalRepaint(); // Manager.globalSynchPaint();
		}

/**
* Creates a map.
*/
	public void makeMap( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		FlexString exp2;
		FlexString res2;

		int tcnt = 0; int tmax = 2;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		PointF OutPt = new PointF( 20 , 20 );

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		MyFac.setDepicClass( "Directional Type I" );
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );

		objC.setFrontLineColor( getDirecColor() );
		objC.setBackLineColor( getDirecColor() );
		( (Direc1) objC ).setDirec( DirType );
		
		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] ohdc = { "_hd" , objAI , " \\+ ( " , objAI , " * " ,
			"_di" , objAI , " ) " };
		Manager.insertFormattedString( ohdc , exp2 );


		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] oc = { objC };
		Manager.insertFormattedString( oc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] oca = { "_hd" , objBI , " \\+ ( " , objBI , " * " ,
			"_di" , objBI , " ) \\- " , "_hd" , objC };
		Manager.insertFormattedString( oca , exp2 );
		


		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		objC.setTemporary( true );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Creates a circular map.
*/
	public void makeCircMap( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		FlexString resvarname = new FlexString();
		FlexString resname = new FlexString();
		FlexString exprname = new FlexString();
		FlexString exp2;
		FlexString res2;

		int tcnt = 0; int tmax = 3;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */

		PointF OutPt = new PointF( 20 , 20 );

		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );
		
		MyFac.setDepicClass( "Directional Arc Type I" );
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );
		objC.setFrontLineColor( getDirecArcColor() );
		objC.setBackLineColor( getDirecArcColor() );

		
		
		res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] ohdc = { "_hd" , objAI , " \\+ ( " , objAI , " * " ,
			"_di" , objAI , " ) " };
		Manager.insertFormattedString( ohdc , exp2 );


		boolean Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] oc = { objC };
		Manager.insertFormattedString( oc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] oca = { "_hd" , objBI , " \\+ ( " , objBI , " * " ,
			"_di" , objBI , " ) \\- " , "_hd" , objC };
		Manager.insertFormattedString( oca , exp2 );
		


		Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */




		
		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] mdc = { "_md" , objC };
		Manager.insertFormattedString( mdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdai = { "_hd" , objAI };
		Manager.insertFormattedString( hdai , exp2 );
		


		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		objC.setTemporary( true );

		/* MyKit.getXKit().hideLoadFrame(); */

		blinkObject( objC );
		}


/**
* Sets a depictor to its unit length.
*/
public boolean unitObject( DrawObj objAI ) /* !!!!!!!!! nMvec !!!!!!!!!!!!!! */
		{
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			objAI.setValuePort( 1 );
			Mvec Vec = objAI.portGetVect();
			Vec.setBasis( 1.0 );
			MyKit.engineResolveConstraints();
			Manager.globalRepaint();
			flag = true;
			}

		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			objAI.setValuePort( 1 );
			Mvec Vec = objAI.portGetVect();
			Mvec t1 = new Mvec();
			Vec.copyAllInfo( t1 );
			double mul = Math.sqrt( t1.getBasis1() * t1.getBasis1() +
				t1.getBasis2() * t1.getBasis2() );
			t1.scale( 1.0 / mul , Vec );
			MyKit.engineResolveConstraints();
			Manager.globalRepaint();
			flag = true;
			}

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			objAI.setValuePort( 1 );
			Mvec Vec = objAI.portGetVect();
			Mvec t1 = new Mvec();
			Vec.copyAllInfo( t1 );
			double mul = Math.sqrt( t1.getBasis() * t1.getBasis() +
				t1.getBasis12() * t1.getBasis12() );
			t1.scale( 1.0 / mul , Vec );
			MyKit.engineResolveConstraints();
			Manager.globalRepaint();
			flag = true;
			}

		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}

/**
* Circles a depictor.
*/
public boolean circleObject( DrawObj objAI )
		{
		boolean flag = false;

		if( ( objAI instanceof Dsca1 ) || ( objAI instanceof Ssca1 ) )
			{
			sscaCircleObject( objAI );
			flag = true;
			}


		if( ( objAI instanceof Vect1 ) ||  ( objAI instanceof Vect2 ) )
			{
			vectCircleObject( objAI );
			flag = true;
			}

		if( ( objAI instanceof Angle1 ) || ( objAI instanceof Angle2 ) )
			{
			phasCircleObject( objAI );
			flag = true;
			}

		/* if( !flag )
			{
			System.out.println( "Error!!!!!!!!!!!!! Not Supported!!!!!!!!!!" );
			} */
		return( flag );
		}


/**
* Circles a phasor.
*/
	void phasCircleObject( DrawObj objAI )
		{
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "Circle Type I" );
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		objC.setFrontLineColor( getDirecArcColor() );
		objC.setBackLineColor( getDirecArcColor() );


		int tcnt = 0; int tmax = 2;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] oc = { objC };
		Manager.insertFormattedString( oc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] oai = { "#1 * < " , objAI , " >{ 0 , 2 }" };
		Manager.insertFormattedString( oai , exp2 );


		boolean Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdai = { "_hd" , objAI };
		Manager.insertFormattedString( hdai , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		engageDelegation( objAI , objC );
		objC.setTemporary( true );

		/* MyKit.getXKit().hideLoadFrame(); */
		}


/**
* Circles a scalar.
*/
	void sscaCircleObject( DrawObj objAI )
		{
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "Circle Type I" );
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		objC.setFrontLineColor( getDirecArcColor() );
		objC.setBackLineColor( getDirecArcColor() );


		int tcnt = 0; int tmax = 2;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */



		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] oc = { objC };
		Manager.insertFormattedString( oc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] oai = { "< " , objAI , " >{ 0 } * " , "_di" , objAI };
		Manager.insertFormattedString( oai , exp2 );

		boolean Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdai = { "_hd" , objAI };
		Manager.insertFormattedString( hdai , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		engageDelegation( objAI , objC );
		objC.setTemporary( true );

		/* MyKit.getXKit().hideLoadFrame(); */
		}


/**
* Circles a vector.
*/
	void vectCircleObject( DrawObj objAI )
		{
		DrawObjFactory MyFac = new DrawObjFactory( MyKit , Manager );

		PointF OutPt = new PointF( 50 , 50 );
		MyFac.setDepicClass( "Circle Type I" );
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt( OutPt );
		DrawObj objC = MyFac.createDepictor();
		DGMNode ncDGM = MyFac.getLastDGM();
		MyKit.setResultObj( objC );


		objC.setFrontLineColor( getDirecArcColor() );
		objC.setBackLineColor( getDirecArcColor() );


		int tcnt = 0; int tmax = 2;
		/* MyKit.getXKit().showLoadFrame();
		MyKit.getXKit().setTitleLab( "Creating Diagram..." );
		MyKit.getXKit().setSubjectLab( "Applying Constraint Equations..." );
		MyKit.getXKit().setLoadLab( "  " );
		MyKit.getXKit().setLoadFract( 0 , 5 ); */


		FlexString res2 = new FlexString();
		res2.setInsertPoint( 0 );
		Object[] oc = { objC };
		Manager.insertFormattedString( oc , res2 );
		FlexString exp2 = new FlexString();
		exp2.setInsertPoint( 0 );
		Object[] oai = { "< " , objAI , " >{ 1 }" };
		Manager.insertFormattedString( oai , exp2 );

		boolean Err = Manager.changeExpression( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */



		res2.clearString();
		res2.setInsertPoint( 0 );
		Object[] hdc = { "_hd" , objC };
		Manager.insertFormattedString( hdc , res2 );
		exp2.clearString();
		exp2.setInsertPoint( 0 );
		Object[] hdai = { "_hd" , objAI };
		Manager.insertFormattedString( hdai , exp2 );

		Err = Manager.adaptiveRelate( res2 ,
			exp2 , EngineConstants.SUPERVISOR_MODE );
		tcnt++; /* MyKit.getXKit().setLoadFract( tcnt , tmax ); */


		Manager.updateExpressionListeners();
		Manager.updateVariableListeners();
		if( tcnt != tmax ) System.out.println( "Assert: ( " +
			( new Integer( tcnt ) ).toString() + " , " +
			( new Integer( tmax ) ).toString() + ")" );


		engageDelegation( objAI , objC );
		objC.setTemporary( true );

		/* MyKit.getXKit().hideLoadFrame(); */
		}




	}







