


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
import geomdir.DrawObj;
import geomdir.GeomKit;
import geomdir.GeomKitEtherEvent;
import geomdir.Hexar;
import geomdir.Model;
import geomdir.ScrollGeomKit;
import geomdir.ToolPort;
import geomdir.config.Config;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import verdantium.EtherEvent;
import verdantium.kluges.TwoDScrollView;
import android.content.Context;
import android.view.KeyEvent;




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
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Compatibility problems between GeomKit and new constraint solvers.   | Made changes so that the two would be more compatible.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to the way property editors are handled.                     | Modified EduKit so it doesn't create property editors.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed compound diagram support for GeoCard.                         | Added compound diagram support.
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



/**
* A superset of GeomKit performing operations with applications in education.
* @author Thorn Green
*/
public class EduKit extends ScrollGeomKit
	{

	public EduKit( Context context, String Configs , int InOriginType, TwoDScrollView _jsc )
		{ super( context , Configs , InOriginType, _jsc ); }

/**
* Used for serial storage purposes only.
*/
	public EduKit( Context context, TwoDScrollView _jsc )
		{ super( context, _jsc ); }

/**
* Used in view-creation only.
*/
	public EduKit( EduKit in, TwoDScrollView _jsc )
		{ super( in, _jsc ); }

/**
* Creates a view of this EduKit.
*/
	@Override
	public GeomKit createViewGeomKit( TwoDScrollView _jsc )
		{ return( new EduKit( this, _jsc ) ); }

/**
* Reads persistent data.
*/
	public void readExternal(ObjectInput in) 
		throws IOException, ClassNotFoundException
		{
		/* try
			{
			super.readExternal( in );
			VersionBuffer myv = (VersionBuffer)( in.readObject() );
			VersionBuffer.chkNul( myv );

			AnimResultObj = (DrawObj)( myv.getProperty( "AnimResultObj" ) );

			myv.flush();
			}
		catch( ClassCastException e ) { throw( new DataFormatException( e ) ); } */
		}

/**
* Writes persistent data.
* @serialData TBD.
*/
	public void writeExternal(ObjectOutput out) 
		throws IOException
		{
//		VersionBuffer myv = new VersionBuffer( VersionBuffer.write );

//		if( AnimResultObj != null ) myv.setProperty( "AnimResultObj" , AnimResultObj );

//		super.writeExternal( out );
//		out.writeObject( myv );
		}

/*
Fun: Handles all key input events for the canvas.
In: Current state of the canvas, event to handle.
Out: State of the canvas may be modified.
Pre: Input event is valid.  canvas is in a consistent state.
Post: If the user has requested a change, the state of the canvas will be changed.
Programmed By: Thorn Green.
*/
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent e)
 		{
		try
		{
			int key = keyCode;

			if( key == 3 )
				{
				( (EduModel) getModelManager() ).copyDepictor( LastClickDraw );
				}
			if( key == 12 )
				{
				( (EduModel) getModelManager() ).makeDepictorConstant( LastClickDraw );
				}
			if( key == 14 )
				{
				int width = getWidth();
				int height = getHeight();
				int xd1 = width / 2;
				int xd2 = height / 2;
				Hexar p = new Hexar();
				hexglo( width / 2 - getXOrigin().value ,
					height / 2 - getYOrigin().value , p.getGlo() , false , p );

				pushUndoOrgChg();
				localSetCoordRad( 40 );
				hexloc( null , false , p );
				getXOrigin().value = (int)( xd1 - p.getLoc().x );
				getYOrigin().value = (int)( xd2 - p.getLoc().y );
				getModelManager().handleCoordRenderUpdate( 72.0 );
				engineResolveConstraints();
				invalidate(); // postInvalidate();
				}
			if( key == 15 )
				{
				circleObject( LastClickDraw );
				}
			if( key == 5 )
				{
				if( LastClickDraw != null )
					{
					LastClickDraw.setTextVisible(
						!( LastClickDraw.getTextVisible() ) );
					getModelManager().globalRepaint();
					}
				}
			if( key == 21 )
				{
				unitObject( LastClickDraw );
				}
			if( key == 22 )
				{
				/* firstCut();
				System.out.println( "Animated..." ); */

				/* System.out.println( "write." );
				savePropertiesFile(); */
				}
 			
		}
		catch( Throwable ex )
			{ handleThrow( ex ); }

		return( super.onKeyDown(keyCode, e) );
 		}


/**
* Clears any data associated with the model.
*/
	public void localClearModel( )
		{
		AnimResultObj = null;
		super.localClearModel();
		}

/**
* Creates a new Model.
*/
	protected Model createModel( ToolPort inT , String Configs , Config config )
		{ return( new EduModel( inT , Configs , config ) ); }

/**
* Sets the result of a SUI-like algebraic operation.
*/
	public void setResultObj( DrawObj in )
		{ AnimResultObj = in; }

/**
* Shunts property editor creation.
*/
//	public VerdantiumPropertiesEditor makePropertiesEditor()
//		{
//		return( null );
//		}


/**
* Shunts property editor creation.
*/
	public void showPropertiesEditor( EtherEvent e )
		{
		}

/**
* Performs a test animation.
*/
	void firstCut( )
		{
		( new OpHandler( this , (EduModel) getModelManager() ) ).firstCut();
		}

/**
* Handles EtherEvents.
*/
	public Object processObjEtherEvent( EtherEvent in , Object refcon )
		throws Throwable
		{
		boolean handled = false;

		if( in instanceof GeomKitEtherEvent )
			{
			if( in.getEtherID().equals( GeomKitEtherEvent.addAnimate ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				addAnimate( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.subAnimate ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				subAnimate( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.compareAnimate ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				compareAnimate( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.multiplyAnimate ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				multiplyAnimate( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.divideAnimate ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				divideAnimate( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.makeMap ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				makeMap( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			if( in.getEtherID().equals( GeomKitEtherEvent.makeCircMap ) )
				{
				Object[] params = (Object[])( in.getParameter() );
				makeCircMap( (DrawObj)( params[ 0 ] ) , (DrawObj)( params[ 1 ] ) ,
					(DGMNode)( params[ 2 ] ) , (DGMNode)( params[ 3 ] ) );
				handled = true;
				}

			} 


		if( !handled ) return( super.processObjEtherEvent( in , refcon ) );
		return( null );
		}


	public boolean isRebuildableDepic( DrawObj in )
		{ return( ( (EduModel) getModelManager() ).isRebuildableDepic( in ) ); }


/**
* Performs an addition on two depictors.
*/
	public void addAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).addAnimate( objAI , objBI ,
			objaDGM , objbDGM , false );
		if( !flag ) stdErrorAlerts( DisconnectErr );
		}

/**
* Performs a subtraction on two depictors.
*/
	public void subAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).subAnimate( objAI , objBI ,
			objaDGM , objbDGM , false );
		if( !flag ) stdErrorAlerts( DisconnectErr );
		}

/**
* Performs a comparison of two depictors.
*/
	public void compareAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).compareAnimate( objAI , objBI ,
			objaDGM , objbDGM , false );
		if( !flag ) stdErrorAlerts( DisconnectErr );
		}


/**
* Performs a multiplication of two depictors.
*/
	public void multiplyAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).multiplyAnimate( objAI , objBI ,
			objaDGM , objbDGM , false );
		if( !flag ) stdErrorAlerts( DisconnectErr );
		}

/**
* Performs a division of two depictors.
*/
	public void divideAnimate( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).divideAnimate( objAI , objBI ,
			objaDGM , objbDGM , false );
		if( !flag ) stdErrorAlerts( DisconnectErr );
		}

/**
* Creates a map between two depictors.
*/
	public void makeMap( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		( new OpHandler( this , (EduModel) getModelManager() ) ).makeMap( objAI , objBI ,
			objaDGM , objbDGM );
		}

/**
* Creates a circular map between two depictors.
*/
	public void makeCircMap( DrawObj objAI , DrawObj objBI , DGMNode objaDGM , DGMNode objbDGM )
		{
		( new OpHandler( this , (EduModel) getModelManager() ) ).makeCircMap( objAI , objBI ,
			objaDGM , objbDGM );
		}

/**
* Circles a depictor.
*/
	public void circleObject( DrawObj objAI )
		{
		if( objAI != null ) { boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).circleObject( objAI );
		if( !flag ) stdErrorAlerts( DisconnectErr ); }
		}

/**
* Attempts to change a depictor to unit length.
*/
	public void unitObject( DrawObj objAI )
		{
		if( objAI != null ) { boolean flag = ( new OpHandler( this , (EduModel) getModelManager() ) ).unitObject( objAI );
		if( !flag ) stdErrorAlerts( DisconnectErr ); }
		}


	protected DrawObj AnimResultObj;
	}



