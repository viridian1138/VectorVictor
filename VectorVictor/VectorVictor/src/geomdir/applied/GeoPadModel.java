




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
import geomdir.DGMHashMap;
import geomdir.DGMNode;
import geomdir.DepictorPort;
import geomdir.DrawObj;
import geomdir.DrawObjFactory;
import geomdir.FragNode;
import geomdir.GeomConstants;
import geomdir.GeomConstants.ToolMode;
import geomdir.GeomKitEtherEvent;
import geomdir.IntObj;
import geomdir.Ktool;
import geomdir.ObjObj;
import geomdir.ToolPort;
import geomdir.config.Config;
import geomdir.depictors.Angle1;
import geomdir.depictors.Angle2;
import geomdir.depictors.Circ1;
import geomdir.depictors.Direc1;
import geomdir.depictors.Dsca1;
import geomdir.depictors.Lnseg1;
import geomdir.depictors.Para1;
import geomdir.depictors.Ruler1;
import geomdir.depictors.Ssca1;
import geomdir.depictors.Vect1;
import geomdir.depictors.Vect2;
import geomdir.engine.EngineConstants;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;

import meta.*;
import verdantium.EtherEvent;
import verdantium.ProgramDirector;
import verdantium.mathimage.MathImageParseException;
import verdantium.utils.IllegalInputException;
import android.graphics.Color;
import android.graphics.Paint;




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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed depictor clustering to use Collections Framework's HashSet and TreeSet.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to underlying APIs used by class.                            | Modified class to be compliant with new APIs.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Migrated code from OrderedList to JCF.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 01/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Regression in file loading.                                          | Fixed regression.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Put multiplication / division result on flat (GeoSlate scalars).     | Performed modifications to implement this.
*    | 10/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve magnitude operator (GeoCard).                                | Improved magnitude operator.
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
* A version of {@link EduModel} that supports the GeoPad project.
* @author Thorn Green
*/
public class GeoPadModel extends EduModel
	{


	public GeoPadModel( ToolPort inT , String Configs , Config config )
		{
		super( inT , Configs , config );
		}

/**
* For serial storage purposes only.  Do not use directly.
*/
	public GeoPadModel( )
		{
		}

	private final static int KeyStartMode = 1;
	private final static int KeyParamOneMode = 2;
	private final static int KeyBoxedMode = 4;
	private final static int KeyPasteMultiMode = 8;

	public final static int ScriptDisplayMode = 1;
	public final static int ScriptReplaceMode = 2;
	public final static int ScriptStringMode = 3;



	static final long serialVersionUID = ( GeoPadModel.class ).getName().hashCode()
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

			CurUnitObj = (DrawObj)( myv.getProperty( "CurUnitObj" ) );
			VersionBuffer.chkNul( CurUnitObj );
			CurUnitCntObj = (DrawObj)( myv.getProperty( "CurUnitCntObj" ) );
			VersionBuffer.chkNul( CurUnitCntObj );
			KeyCurrentOp = myv.getInt( "KeyCurrentOp" );
			KeyCurrentMode = myv.getInt( "KeyCurrentMode" );
			OpExecuted = myv.getBoolean( "OpExecuted" );

			FreeDepicPanel = (GeoPadKit)( myv.getProperty( "FreeDepicPanel" ) );
			VersionBuffer.chkNul( FreeDepicPanel );
			BoundDepicPanel = (GeoPadKit)( myv.getProperty( "BoundDepicPanel" ) );
			VersionBuffer.chkNul( BoundDepicPanel );
			MyAlgPanel = (GeoPadAlgPanel)( myv.getProperty( "MyAlgPanel" ) );
			VersionBuffer.chkNul( MyAlgPanel );
			MyGeomPanel = (GeoPadGeomPanel)( myv.getProperty( "MyGeomPanel" ) );
			VersionBuffer.chkNul( MyGeomPanel );

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

		myv.setProperty( "CurUnitObj" , CurUnitObj );
		myv.setProperty( "CurUnitCntObj" , CurUnitCntObj );
		myv.setInt( "KeyCurrentOp" , KeyCurrentOp );
		myv.setInt( "KeyCurrentMode" , KeyCurrentMode );
		myv.setBoolean( "OpExecuted" , OpExecuted );

		myv.setProperty( "FreeDepicPanel" , FreeDepicPanel );
		myv.setProperty( "BoundDepicPanel" , BoundDepicPanel );
		myv.setProperty( "MyAlgPanel" , MyAlgPanel );
		myv.setProperty( "MyGeomPanel" , MyGeomPanel );

		super.writeExternal( out );
		out.writeObject( myv ); */
		}


/**
* Loads persistent data from a TransVersionBuffer.
*/
/*	public GeoPadKit loadObjectData( TransVersionBuffer in )
		throws IOException
		{
		GeoPadKit ret = null;

		try
			{
			Object MyModel = null;

			int vdl = VarsDivider.getDividerLocation();
			int wdl = WorkDivider.getDividerLocation();

			int vds = VarsDivider.getDividerSize();
			int wds = WorkDivider.getDividerSize();
		
			MyModel = in.getProperty( "Model" );
			VersionBuffer.chkNul( MyModel );
        		
			if( MyModel != null ) System.out.println( "Got a valid Model!!!" );
			System.out.println( MyModel );

			if( MyModel != null )
				{
				GeoPadModel MyM = (GeoPadModel)( MyModel );
				MyM.MyTarget = MyTarget;
				MyM.DepicStore = DepicStore;
				MyM.GeoTools = GeoTools;
				MyM.readExternalSubUpdate( MyM.FreeDepicPanel );
				MyM.MyAlgPanel.setXKit( MyTarget );
				MyM.MyAlgPanel.setModel( MyM );

				setTarget( MyM.FreeDepicPanel );
				MyM.setTarget( MyM.FreeDepicPanel );
				MyM.FreeDepicPanel.RootPane = FreeDepicPanel.RootPane;

				MyM.addDepicListListener( MyM.FreeDepicPanel );
				MyM.addDepicListListener( MyM.BoundDepicPanel );
				MyM.addDepicListListener( MyM.MyGeomPanel );

				MyM.VarsDivider = VarsDivider;
				MyM.WorkDivider = WorkDivider;
				MyM.toolObject = toolObject;

				MyM.FreeDepicPanel.setGeoTools( FreeDepicPanel.getGeoTools() );
				MyM.BoundDepicPanel.setGeoTools( BoundDepicPanel.getGeoTools() );
				MyM.MyGeomPanel.setGeoTools( MyGeomPanel.getGeoTools() );

				MyM.VarsDivider.removeAll();
				MyM.VarsDivider.setTopComponent( MyM.FreeDepicPanel.getGUI() );
				MyM.VarsDivider.setBottomComponent( MyM.BoundDepicPanel.getGUI() );
				MyM.WorkDivider.setRightComponent( MyM.MyGeomPanel.getGUI() );
				MyM.WorkDivider.setLeftComponent( MyM.MyAlgPanel.getView() );

				MyM.FreeDepicPanel.setMenuBar( FreeDepicPanel.getMenuBar() );
				MyM.BoundDepicPanel.setMenuBar( BoundDepicPanel.getMenuBar() );
				MyM.MyGeomPanel.setMenuBar( MyGeomPanel.getMenuBar() );

				MyM.FreeDepicPanel.getGUI().setPreferredSize( new Dimension( 200 , 100 ) );
				MyM.BoundDepicPanel.getGUI().setPreferredSize( new Dimension( 200 , 100 ) );
				MyM.MyGeomPanel.getGUI().setPreferredSize( new Dimension( 200 , 100 ) );
				MyM.MyAlgPanel.getView().setPreferredSize( new Dimension( 200 , 100 ) ); */

				/* System.out.println( MyM.FreeDepicPanel );
				System.out.println( MyM.BoundDepicPanel ); */
/*				MyM.FreeDepicPanel.getGUI().invalidate();
				VarsDivider.invalidate();
				MyM.FreeDepicPanel.revalidate();
				MyM.BoundDepicPanel.revalidate();
				MyM.MyGeomPanel.revalidate();
				MyM.MyAlgPanel.revalidate();
				VarsDivider.revalidate();
				WorkDivider.revalidate();
				VarsDivider.postInvalidate();
				WorkDivider.postInvalidate();


				VarsDivider.updateUI();
				WorkDivider.updateUI();
				VarsDivider.setDividerLocation( vdl );
				WorkDivider.setDividerLocation( wdl );
				VarsDivider.setDividerSize( vds );
				WorkDivider.setDividerSize( wds );

				ret = MyM.FreeDepicPanel;
				}
			}
		catch( ClassCastException ex ) { throw( new DataFormatException( ex ) ); }
		catch( MathImageParseException ex ) { throw( new DataFormatException( ex ) ); }
			

		return( ret );
		} */

/**
* Saves persistent data to a TransVersionBuffer.
*/
/*	public void saveObjectData( TransVersionBuffer in )
		{
		in.setProperty( "Model" , this );
		} */


/**
* Handles Ether Events.
*/
public Object processObjEtherEvent( EtherEvent in , Object refcon )
		throws Throwable
		{
		boolean handled = false;


		if( in instanceof FastSuiEtherEvent )
			{

			if( in.getEtherID().equals( FastSuiEtherEvent.operatorKey ) )
				{
				Object[] param = (Object[])( in.getParameter() );
				int OpId = ( (Integer)( param[ 0 ] ) ).intValue();
				handleOperatorKey( OpId );
				handled = true;
				}

			if( in.getEtherID().equals( FastSuiEtherEvent.keyVar ) )
				{
				Character param = (Character)( in.getParameter() );
				keyHandleNewVar( param.charValue() );
				handled = true;
				}

			if( in.getEtherID().equals( FastSuiEtherEvent.leftParenKey ) )
				{
				handleOperatorKey( EXsym.Lparen );
				handled = true;
				}

			if( in.getEtherID().equals( FastSuiEtherEvent.rightParenKey ) )
				{
				handleOperatorKey( EXsym.Rparen );
				handled = true;
				}

			if( in.getEtherID().equals( FastSuiEtherEvent.digitKey ) )
				{
				Integer param = (Integer)( in.getParameter() );
				keyHandleNewDigit( param.intValue() );
				handled = true;
				}

			if( in.getEtherID().equals( FastSuiEtherEvent.periodKey ) )
				{
				handleOperatorKey( EXsym.period );
				handled = true;
				}			

			}


		if( in instanceof SuiEtherEvent )
			{
			
			if( in.getEtherID().equals( SuiEtherEvent.nextLineKey ) )
				{
				keyHandleNextLine();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.backspaceKey ) )
				{
				keyHandleBackspace();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.proportionOp ) )
				{
				handleOperatorKey( EXsym.proportion );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.traceGraphOp ) )
				{
				handleOperatorKey( EXsym.TraceGraph );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.realignGeom ) )
				{
				handleRealignGeom();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.scriptModeChg ) )
				{
				Integer param = (Integer)( in.getParameter() );
				handleScriptModeChg( param.intValue() );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createRay ) )
				{
				createRay( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createLine ) )
				{
				createLine( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.extractKey ) )
				{
				handleExtractKey( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.copyKey ) )
				{
				handleCopyKey( );
				handled = true;
				}
			
			if( in.getEtherID().equals( SuiEtherEvent.deleteKey ) )
				{
				handleDeleteKey( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.pasteKey ) )
				{
				handlePasteKey( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.selectKey ) )
				{
				handleSelectKey( );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.setMaxWorkGeom ) )
				{
//				setMaxWorkGeom();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.setMaxWorkAlg ) )
				{
//				setMaxWorkAlg();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.setMaxFreeDepic ) )
				{
//				setMaxFreeDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.setMaxBoundDepic ) )
				{
//				setMaxBoundDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.singleDepicOnly ) )
				{
				handleSingleDepicOnly();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.toggleAllowClickSelect ) )
				{
				setAllowClickSelect( !( getAllowClickSelect() ) );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.changeLineHeight ) )
				{
				Object[] arg = (Object[])( in.getParameter() );
				int idex = ( (Integer)( arg[ 0 ] ) ).intValue();
				double fac = ( (Double)( arg[ 1 ] ) ).doubleValue();
				boolean SetAlg = ( (Boolean)( arg[ 2 ] ) ).booleanValue();
				boolean SetGeom = ( (Boolean)( arg[ 3 ] ) ).booleanValue();
				changeLineHeight( idex , fac , SetAlg , SetGeom );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.algPanelSelect ) )
				{
				Integer param = (Integer)( in.getParameter() );
				handleAlgPanelSelect( param.intValue() );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.sineDiag ) )
				{
				handleSineDiagram();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.cosineDiag ) )
				{
				handleCosineDiagram();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.createBezier ) )
				{
				Object[] myo = (Object[])( in.getParameter() );
				String v1 = (String)( myo[ 0 ] );
				String a1 = (String)( myo[ 1 ] );
				Double t1 = (Double)( myo[ 2 ] );
				handleBezierKey( v1 , a1 , t1.doubleValue() );
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printBoundDepic ) )
				{
				printBoundDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printPreviewBoundDepic ) )
				{
				printPreviewBoundDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printFreeDepic ) )
				{
				printFreeDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printPreviewFreeDepic ) )
				{
				printPreviewFreeDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printAlgWork ) )
				{
				printAlgDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printPreviewAlgWork ) )
				{
				printPreviewAlgDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printGeomWork ) )
				{
				printGeomDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.printPreviewGeomWork ) )
				{
				printPreviewGeomDepic();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.toggleMultiplier ) )
				{
				UseMultiplier = !UseMultiplier;
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.centerCurrentLine ) )
				{
				centerCurrentLine();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestDragMode ) )
				{
				requestDragMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestPropertiesMode ) )
				{
				requestPropertiesMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestFreeTransformationMode ) )
				{
				requestFreeTransformationMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestTranslateMode ) )
				{
				requestTranslateMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestRotateMode ) )
				{
				requestRotateMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestDilateMode ) )
				{
				requestDilateMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.requestLabelMode ) )
				{
				requestLabelMode();
				handled = true;
				}

			if( in.getEtherID().equals( SuiEtherEvent.setScheme ) )
				{
				Integer[] Cols = (Integer[])( in.getParameter() );
				InitialCols = Cols;
				handled = true;
				}

			}


//		if( in instanceof ClientMacroEtherEvent )
//			{
//			if( in.getEtherID().equals( ClientMacroEtherEvent.setClientMacro ) )
//				{
//				Object[] param = (Object[])( in.getParameter() );
//				MacroRecorder.storeMacroInMap( param[ 0 ] , param[ 1 ] , macroMap );
//				PropL.firePropertyChange( ClientMacroEtherEvent.MACRO_MAP_CHANGED , null , null );
//				FreeDepicPanel.firePropertyChg( ClientMacroEtherEvent.MACRO_MAP_CHANGED , null , null );
//				handled = true;
//				}
//
//			if( in.getEtherID().equals( ClientMacroEtherEvent.deleteClientMacro ) )
//				{
//				macroMap.remove( in.getParameter() );
//				PropL.firePropertyChange( ClientMacroEtherEvent.MACRO_MAP_CHANGED , null , null );
//				FreeDepicPanel.firePropertyChg( ClientMacroEtherEvent.MACRO_MAP_CHANGED , null , null );
//				handled = true;
//				}
//			}


		if( !handled )
			return( super.processObjEtherEvent( in , refcon ) );
		return( null );
		}



/**
* Requests Drag Mode.
*/
	protected void requestDragMode( )
		{
		int ToolMode = 1;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}


/**
* Requests Properties Mode.
*/
	protected void requestPropertiesMode( )
		{
		int ToolMode = 3;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}


/**
* Requests Free Transformation Mode.
*/
	protected void requestFreeTransformationMode( )
		{
		int ToolMode = 4;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}


/**
* Requests Translation Mode.
*/
	protected void requestTranslateMode( )
		{
		int ToolMode = 5;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}

/**
* Requests Rotate Mode.
*/
	protected void requestRotateMode( )
		{
		int ToolMode = 6;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}

/**
* Requests Dilate Mode.
*/
	protected void requestDilateMode( )
		{
		int ToolMode = 7;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}

/**
* Requests Label Mode.
*/
	protected void requestLabelMode( )
		{
		int ToolMode = 8;
		FreeDepicPanel.requestPrevToolModeChange( ToolMode );
		BoundDepicPanel.requestPrevToolModeChange( ToolMode );
		MyGeomPanel.requestPrevToolModeChange( ToolMode );
		globalRepaint();
		}


/**
* Centers the current line.
*/
	protected void centerCurrentLine( )
		{
		MyGeomPanel.centerCurrentLine();
		}


/**
* Looks at the parsed prompt, and handles special cases such as color-coding.
*/
	protected FlexString processLexemePrompt( ELexeme in )
		{
		FlexString ret = in.getTopPrompt();
		boolean SimplifiedOp = ( in.getParenCount() ) > 0;
		int stat = in.getFillStat();
		boolean Boxed = ( stat & ELexeme.Boxed ) != 0;
		boolean OpMatch = ( in.getTopOp() == EXsym.plus ) || ( in.getTopOp() == EXsym.minus );

		if( ( OpMatch ) && ( !Boxed ) && ( !SimplifiedOp ) &&
			( in.getTopDomain() != dom_err ) )
			{
			FlexString p1 = in.getParamOnePrompt();
			FlexString p2 = in.getParamTwoPrompt();

			ret = new FlexString();

				{
				DrawObj p = getParamOne( in );
				Integer f = p.getFrontLineColor();
				ret.insertJavaString( "<COLOR=#" );
				insertHexVal(  Color.red( f ) , ret );
				insertHexVal( Color.green( f ) , ret );
				insertHexVal( Color.blue( f ) , ret );
				ret.insertJavaString( ">" );
				}

			p1.insertString( ret );
			ret.insertJavaString( "</COLOR>" );

			if( in.getTopOp() == EXsym.plus )
				ret.insertJavaString( " + " );
				else ret.insertJavaString( " - " );

				{
				DrawObj p = getParamTwo( in );
			    Integer f = p.getFrontLineColor();
				ret.insertJavaString( "<COLOR=#" );
				insertHexVal( Color.red( f ) , ret );
				insertHexVal( Color.green( f ) , ret );
				insertHexVal( Color.blue( f ) , ret );
				ret.insertJavaString( ">" );
				}

			p2.insertString( ret );
			ret.insertJavaString( "</COLOR>" );
			}

		return( ret );
		}


/**
* Inserts a two digit hex. value.
*/
protected void insertHexVal( int val , FlexString in )
		{
		if( val >= 16 )
			{
			in.insertJavaString( Integer.toHexString( val ).toUpperCase() );
			}
			else
			{
			in.insertJavaString( "0" );
			in.insertJavaString( Integer.toHexString( val ).toUpperCase() );
			}
		}


/**
* Handles the pressing of an operator key by the user.
*/
	protected void handleOperatorKey( int Op ) throws MathImageParseException
		{
		ELexeme MyLex = new ELexeme();
		MyLex.setTopOp( Op );
		
		if( !( CurPromptList.empty() ) )
			{
			CurPromptList.searchHead();
			CurPromptList.left();
			CurPromptList.insertRight( MyLex );
			}
			else
			{
			CurPromptList.insertRight( MyLex );
			}

		updatePrompt();
		}


/**
* Domain value for erroneous operations.  Note this is not multivector-compliant,
* and will have to be modified at some future time.
*/
protected final int dom_err = 2 * DepictorPort.DOM_PSU;


/**
* Handles an alteration to the set of symbols on the current prompt line.
*/
	protected void updatePrompt( ) throws MathImageParseException
		{
		ELexeme MyLex = null;

		EXparser myl = MyParser;
		MyLex = myl.parseAll( CurPromptList , UseMultiplier );

		LastUserCreatedDepic = null;

		if( MyLex != null )
			{
			int stat = MyLex.getFillStat();
			KeyLastFill = stat;

			if( ( stat & ELexeme.Boxed ) == 0 )
				{
				if( MyLex.getTopDomain() != dom_err )
					{
					updatePromptNonBoxed( MyLex );
					LastBoxed = false;
					}
					else
					{
					this.getTarget().playBeep();
					FlexString prompt = MyLex.getTopPrompt();
					prompt.setInsertPoint( 0 );
					prompt.insertJavaString( "<COLOR=#0000FF>" );
					prompt.setInsertPoint( prompt.strlen() );
					prompt.insertJavaString( "</COLOR>" );
					MyAlgPanel.setCurrentPromptLine( prompt , KeyCacheDepic );
					MyAlgPanel.invalidate(); // MyAlgPanel.postInvalidate();
					LastBoxed = true;
					}
				}
				else
				{
				if( !LastBoxed )
					{
					keyApplyScriptModeIncr();
					}
				LastBoxed = true;

				MyAlgPanel.setCurrentPromptLine( MyLex.getTopPrompt() , KeyCacheDepic );
				MyAlgPanel.invalidate(); // MyAlgPanel.postInvalidate();
				}
			
			}
			else 
			{
			keyHandleParseError();
			}		


		
		}


/**
* Handles a set of prompt symbols corresponding to a non-boxed expression.
*/
	protected void updatePromptNonBoxed( ELexeme MyLex )
		throws MathImageParseException
		{
		FlexString MyStr = processLexemePrompt( MyLex );
		boolean update = false;
		double factor = 1.0;
		DrawObj KeyParamOne = null;
		DGMNode KeyParamOneDGM = null;
		int Op = MyLex.getTopOp();
		KeyCurrentMode = KeyParamOneMode;
		OpExecuted = true;


		switch( Op )
			{
			case EXsym.variable:
				KeyParamOne = MyLex.getTopDrawObj();
				KeyParamOneDGM = MyLex.getTopDrawDGM();
				KeyCacheDepic = KeyParamOne;
				setCacheDepicDGM( KeyParamOneDGM );
				OpExecuted = false;
				factor = getParamFactorRequired( KeyParamOne , KeyParamOneMode );
				update = true;
				break;

			case EXsym.digit:
				KeyParamOne = createConstrainedObject( MyLex.getTopPrompt() , 
					GeomConstants.DOM_SCA , MyLex.getTopExpr() );
				KeyParamOneDGM = null;
				KeyCacheDepic = KeyParamOne;
				setCacheDepicDGM( KeyParamOneDGM );
				OpExecuted = true;
				factor = getParamFactorRequired( KeyParamOne , KeyParamOneMode );
				update = true;
				break;

			case EXsym.assign:
			case EXsym.div:
			case EXsym.minus:
			case EXsym.compare:
			case EXsym.power:
			case EXsym.prod:
			case EXsym.plus:
			case EXsym.dot:
			case EXsym.cross:
			case EXsym.wedge:
			case EXsym.TraceGraph:
				SetSingleDepicOnly = false;
				MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic , getParamFactorRequired( KeyCacheDepic ) );
				MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , getParamFactorRequired( KeyCacheDepic ) );
				MyAlgPanel.invalidate(); // MyAlgPanel.postInvalidate();
				MyGeomPanel.invalidate(); // MyGeomPanel.postInvalidate();
				factor = keyExecuteBinaryOp( MyLex );
				update = true;
				break;

			case EXsym.exp:
			case EXsym.uplus:
			case EXsym.negation:
			case EXsym.sqrt:
			case EXsym.ImagGradPart:
			case EXsym.ScalGradPart:
			case EXsym.inverse:
			case EXsym.square:
			case EXsym.magnitude:
				SetSingleDepicOnly = false;
				MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic , getParamFactorRequired( KeyCacheDepic ) );
				MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , getParamFactorRequired( KeyCacheDepic ) );
				MyAlgPanel.postInvalidate();
				MyGeomPanel.postInvalidate();
				factor = keyExecuteUnaryOp( MyLex );
				update = true;
				break;

			case EXsym.proportion:
				MyAlgPanel.setCurrentPromptLine( MyStr , KeyParamOne , getParamFactorRequired( KeyParamOne ) );
				MyAlgPanel.postInvalidate();
				MyGeomPanel.postInvalidate();
				factor = keyExecuteProportionOp( MyLex );
				update = true;
				break;
			
			default:
				break;
			}


		KeyCachePrompt = MyStr;

		if( ( Op != EXsym.variable ) && ( Op != EXsym.digit ) )
			{
			DrawObj MyObj = FreeDepicPanel.getAnimResultObj();
			if( MyObj != null )
				{
				KeyCacheDepic = MyObj;
				setCacheDepicDGM( null );
				}
			}


		if( update )
			{
			MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic , factor );
			MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , factor );
			MyAlgPanel.postInvalidate();
			MyGeomPanel.postInvalidate();
			}
		}


/**
* Handles a request to add a Bezier curve.
*/
	protected void handleBezierKey( String v1 , String a1 , double t1 )
		throws IllegalInputException
		{
		if( !( getVarList().isEmpty() ) )
			{
			boolean Works = true;
			FlexString vel = new FlexString( v1 );
			FlexString accel = new FlexString( a1 );
			vel.setInsertPoint( 0 );
			accel.setInsertPoint( 0 );
			vel.insertJavaString( "<BT>" );
			accel.insertJavaString( "<BT>" );
			vel.setInsertPoint( vel.strlen() );
			accel.setInsertPoint( accel.strlen() );
			vel.insertJavaString( "</BT>" );
			accel.insertJavaString( "</BT>" );
			FragNode MyFr = (FragNode)( getVarList().getFrag( vel ) );
			Works = Works && ( MyFr != null );
			DGMNode vg = (DGMNode)( MyFr.getFragMap().getFirstNode() );
			DrawObj v = vg.getMyDraw();
			MyFr = (FragNode)( getVarList().getFrag( accel ) );
			Works = Works && ( MyFr != null );
			DGMNode ag = (DGMNode)( MyFr.getFragMap().getFirstNode() );
			DrawObj a = ag.getMyDraw();
			if( Works ) MyGeomPanel.localCreateBezier( v , a , t1 );
				else throw( new IllegalInputException() );
			}
			else throw( new IllegalInputException() );
		}


/**
* Handles a request to create a sine diagram.
*/
	protected void handleSineDiagram( ) throws IllegalInputException ,
		MathImageParseException
		{
		if( CurPromptList.empty() )
			{
			System.out.println( "Sine Diagram" );
			FreeDepicPanel.setAnimResultObj( null );
			( new OpHandler( FreeDepicPanel , this ) ).sineAnimate();
			KeyCachePrompt = new FlexString( "Sine Diagram" );
			KeyCacheDepic = FreeDepicPanel.getAnimResultObj();
			OpExecuted = true;
			MyAlgPanel.setCurrentPromptLine( KeyCachePrompt , KeyCacheDepic , 1.0 );
			MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , 1.0 );
			MyAlgPanel.postInvalidate();
			MyGeomPanel.postInvalidate();
			keyHandleNextLine();
			}
			else
			{
			throw( new IllegalInputException( "The prompt line must be empty to run this." ) );
			}
		}


/**
* Handles a request to create a cosine diagram.
*/
	protected void handleCosineDiagram( ) throws IllegalInputException ,
		MathImageParseException
		{
		if( CurPromptList.empty() )
			{
			System.out.println( "Cosine Diagram" );
			FreeDepicPanel.setAnimResultObj( null );
			( new OpHandler( FreeDepicPanel , this ) ).cosineAnimate();
			KeyCachePrompt = new FlexString( "Cosine Diagram" );
			KeyCacheDepic = FreeDepicPanel.getAnimResultObj();
			OpExecuted = true;
			MyAlgPanel.setCurrentPromptLine( KeyCachePrompt , KeyCacheDepic , 1.0 );
			MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , 1.0 );
			MyAlgPanel.postInvalidate();
			MyGeomPanel.postInvalidate();
			keyHandleNextLine();
			}
			else
			{
			throw( new IllegalInputException( "The prompt line must be empty to run this." ) );
			}
		}


/**
* Sets the background color and image.
*/
	protected void setBkgnd( Integer inCol , boolean opaque )
		throws Throwable
		{
		Object[] param = { inCol , new Boolean( opaque ) };

		EtherEvent send = new GeomKitEtherEvent( this , GeomKitEtherEvent.setBkgnd ,
			null , FreeDepicPanel );
		send.setParameter( param );
		ProgramDirector.fireEtherEvent( send , null );

		send = new GeomKitEtherEvent( this , GeomKitEtherEvent.setBkgnd ,
			null , BoundDepicPanel );
		send.setParameter( param );
		ProgramDirector.fireEtherEvent( send , null );

		send = new GeomKitEtherEvent( this , GeomKitEtherEvent.setBkgnd ,
			null , MyGeomPanel );
		send.setParameter( param );
		ProgramDirector.fireEtherEvent( send , null );

		send = new GeomKitEtherEvent( this , GeomKitEtherEvent.setBkgnd ,
			null , MyAlgPanel );
		send.setParameter( param );
		ProgramDirector.fireEtherEvent( send , null );
		}

/**
* Creates a ray.
*/
	protected void createRay( ) throws IllegalInputException
		{ MyGeomPanel.localCreateRay(); }

/**
* Creates a line.
*/
	protected void createLine( ) throws IllegalInputException
		{ MyGeomPanel.localCreateLine(); }


/**
* Re-aligns the geometric workspace.
*/
	protected void handleRealignGeom( )
		{ MyGeomPanel.realignGeom( ); }

/**
* Sets the display-script mode of the app.
*/
	protected void handleScriptModeChg( int id )
		{ KeyScriptMode = id; }

/**
* Handles the un-selection of a set of items.
*/
	public void handleUnSelect( )
		{
		FreeDepicPanel.requestPrevToolModeChange( 1 );
		BoundDepicPanel.requestPrevToolModeChange( 1 );
		MyGeomPanel.requestPrevToolModeChange( 1 );
		( (Ktool.SelectionTool)( FreeDepicPanel.getGeoTools().elementAt( 2 ) ) ).clearDropList();
		( (Ktool.SelectionTool)( BoundDepicPanel.getGeoTools().elementAt( 2 ) ) ).clearDropList();
		( (Ktool.SelectionTool)( MyGeomPanel.getGeoTools().elementAt( 2 ) ) ).clearDropList();
		FreeDepicPanel.postInvalidate();
		BoundDepicPanel.postInvalidate();
		MyGeomPanel.postInvalidate();
		}

/**
* Handles switching to the selection mode.
*/
	protected void handleSelectKey( )
		{
		FreeDepicPanel.requestPrevToolModeChange( 2 );
		BoundDepicPanel.requestPrevToolModeChange( 2 );
		MyGeomPanel.requestPrevToolModeChange( 2 );
		FreeDepicPanel.localSetLastClickDepic( null );
		BoundDepicPanel.localSetLastClickDepic( null );
		MyGeomPanel.localSetLastClickDepic( null );
		FreeDepicPanel.postInvalidate();
		BoundDepicPanel.postInvalidate();
		MyGeomPanel.postInvalidate();
		}

/**
* Handles a change to the unit length.
*/
	public void handleUnitChange( double in )
		{
		FreeDepicPanel.localSetCoordRad( in );
		BoundDepicPanel.localSetCoordRad( in );
		MyGeomPanel.localSetCoordRad( in );
		}

/**
* Handles the end of a drag operation that changes the unit length.
*/
	public void endCoordAdjust( )
		{ MyGeomPanel.realignGeom(); }

/**
* Handles extracting a set of selected items.
*/
	protected void handleExtractKey( ) throws IllegalInputException
		{
		try{
		buildClipboard( Clipboard , ExprClipboard , ClipLHS , ClipRHS );
		boolean Ok = getClipIsExtractable( ExprClipboard );

		if( Ok )
			{
			deleteClipElements( ExprClipboard , ClipLHS , ClipRHS );
			handleUnSelect( );
			}
			else
			{
			throw( new IllegalInputException( "Unable to extract this." ) );
			}
		} 
		catch( IllegalInputException e )
			{ throw( e ); }
		catch( Exception e ) 
			{ throw( new WrapRuntimeException( "Extract Failed" , e ) ); }
		}


/**
* Handles copying a set of selected items.
*/
	protected void handleCopyKey( ) throws IllegalInputException
		{
		buildClipboard( Clipboard , ExprClipboard , ClipLHS , ClipRHS );
		}


/**
* Handles deleting a set of selected items.
*/
	protected void handleDeleteKey( ) throws IllegalInputException
		{
		ClipSet Clipboard = new ClipSet();
		ClipSet ExpClipboard = new ClipSet();
		HighLevelList<StdLowLevelList<FlexString>,FlexString> LHS = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
		HighLevelList<StdLowLevelList<FlexString>,FlexString> RHS = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
		buildClipboard( Clipboard , ExpClipboard , LHS , RHS );
		boolean Ok = getClipIsExtractable( ExpClipboard );	

		if( Ok )
			{
			deleteClipElements( ExpClipboard , LHS , RHS );
			handleUnSelect( );
			}
			else
			{
			throw( new IllegalInputException( "Unable to delete this." ) );
			}
		}

/**
* Clears the model.
*/
	public void clearModel( Object s1 )
		{
		super.clearModel( s1 );

		LastClickDraw = null;
		LastUserCreatedDepic = null;
		CurUnitObj = null;
		CurUnitCntObj = null;
		Clipboard.clear();
		ExprClipboard.clear();
		ClipLHS.eraseAllInfo();
		ClipRHS.eraseAllInfo();
		clearCurrentPrompt();
		KeyCurrentOp = 0;
		KeyCurrentMode = KeyStartMode;
		OpExecuted = false;

		KeyCacheDepic = null;
		KeyCachePrompt = null;

		MyAlgPanel.localClearModel();
		MyGeomPanel.localClearModel();
		FreeDepicPanel.createUnitDepic();
		}

/**
* Deletes one selected element.
*/
	protected void deleteClipElement( DrawObj in )
		{
		FragNode MyFrag = (FragNode)( getVarList().getFrag( in.getVectName() ) );
		DGMNode myDGM = MyFrag.getFragMap().getDGM( in.getFragID() );
		boolean Fnd = ( myDGM != null );
		
		if( Fnd )
			{
			deleteDepictor( in );
			}
		}


/**
* Deletes a set of selected elements.
*/
	protected void deleteClipElements( ClipSet in , HighLevelList<StdLowLevelList<FlexString>,FlexString> LHS , HighLevelList<StdLowLevelList<FlexString>,FlexString> RHS )
		{
		if( !( LHS.empty() ) )
			{
			LHS.searchHead();
			boolean Done = false;

			while( !Done )
				{
				FlexString MyStr = LHS.getNode();
				deleteExpression( MyStr , EngineConstants.SUPERVISOR_MODE );
				}
			}

		Iterator<DGMNode> it = in.iterator();

		while( it.hasNext() )
			{
			DGMNode MyNode = it.next();
			deleteClipElement( MyNode.getMyDraw() );
			}

		}


/**
* Places items on the "clipboard".
*/
	protected void buildClipboardComp( HighLevelList<StdLowLevelList<DGMNode>,DGMNode> InList , ClipSet Clipboard )
		{
		if( InList != null )
			{
			if( !( InList.empty() ) )
				{
				InList.searchHead();
				boolean Done = false;

				while( !Done )
					{
					DGMNode MyNode = InList.getNode();
					Clipboard.add( MyNode );

					InList.right();
					Done = InList.getHead();
					}
				}
			}
		}

/**
* Returns whether the give list is null or empty.
*/
	protected boolean isDList( HighLevelList<StdLowLevelList<DGMNode>,DGMNode> in )
		{
		boolean flg = false;

		if( in == null )
			flg = true;
		else
			{
			if( in.empty() ) flg = true;
			}

		return( flg );
		}

/**
* Builds a "complete" clipboard from a set of depictors and all depictors related by a constraint.
*/
	protected void buildClipboard( ClipSet Clipboard , ClipSet ExpClipboard , HighLevelList<StdLowLevelList<FlexString>,FlexString> LHS , HighLevelList<StdLowLevelList<FlexString>,FlexString> RHS )
		throws IllegalInputException
		{
		boolean Err = isDList( ( (Ktool.SelectionTool)( FreeDepicPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() )
			&& isDList( ( (Ktool.SelectionTool)( BoundDepicPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() )
			&& isDList( ( (Ktool.SelectionTool)( MyGeomPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() );

		if( !Err )
			{
			LHS.eraseAllInfo();
			RHS.eraseAllInfo();
			Clipboard.clear();
			buildClipboardComp( ( (Ktool.SelectionTool)( FreeDepicPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() , Clipboard );
			buildClipboardComp( ( (Ktool.SelectionTool)( BoundDepicPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() , Clipboard );
			buildClipboardComp( ( (Ktool.SelectionTool)( MyGeomPanel.getGeoTools().elementAt( 2 ) ) ).getDropList() , Clipboard );
			expandClipboard( Clipboard , ExpClipboard , LHS , RHS );
			}

		if( Err )
			throw( new IllegalInputException( "You must select a non-empty set of depictors." ) );
		}


/**
* Clears the current prompt line info.
*/
	protected void clearCurrentPrompt( )
		{
		CurPromptList.eraseAllInfo();
		LastBoxed = true;
		}

/**
* Handles the selection of a depictor.
*/
	public void setLastClickDepic( DrawObj in )
		{ try{ setLastClickDepic( in , true ); }
			catch( Exception ex ) { throw( new WrapRuntimeException( ex ) ); } }


/**
* Handles the selection of a depictor.
*/
	protected void setLastClickDepic( DrawObj in , boolean WatchTime )
		throws MathImageParseException
		{
		super.setLastClickDepic( in );
		LastClickDraw = in;


		if( ( KeyCurrentMode != KeyPasteMultiMode ) && AllowClickSelect &&
			( ( ( MouseUpTime - MouseDownTime ) < 750 ) || ( !WatchTime ) ) )
			{
			boolean state = ( KeyCurrentMode == KeyStartMode ) ||
				( ( KeyLastFill & ELexeme.Boxed ) != 0 );
			if( KeyCurrentMode == KeyPasteMultiMode ) state = false;
			DGMNode LastClickDGM1 = getLastClickDGM1();


			if( state ) keyHandleSingleClick( LastClickDraw , LastClickDGM1 );
				else 
					{
					if( checkDepictorTypeMatch( in ) )
						{
						if( OpExecuted )
							{
							FlexString MyStr = new FlexString();
							MyStr.setInsertPoint( 0 );
							KeyCachePrompt.insertString( MyStr );
							MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic , 
								getParamFactorRequired( KeyCacheDepic ) );

							MyAlgPanel.incrementCurrentLine();
							MyAlgPanel.synchronizeRendering();
							MyGeomPanel.incrementCurrentLine();
							MyGeomPanel.synchronizeRendering();
							keyExecuteMode( KeyStartMode );
							keyHandleSingleClick( LastClickDraw , LastClickDGM1 );
							OpExecuted = false;	
							}
							else
							{
							clearCurrentPrompt();
							keyHandleSingleClick( LastClickDraw , LastClickDGM1 );
							OpExecuted = false;
							}
						}
					}
			}
		}


/**
* Handles an error.
*/
	private void keyHandleError( ) throws MathImageParseException
		{
		this.getTarget().playBeep();
		if( OpExecuted && ( KeyCacheDepic != null ) )
			{
			clearCurrentPrompt();
			keyExecuteMode( KeyStartMode );
			keyHandleSingleClick( KeyCacheDepic , getCacheDepicDGM() );
			MyAlgPanel.incrementCurrentLine();
			MyAlgPanel.synchronizeRendering();
			MyGeomPanel.incrementCurrentLine();
			MyGeomPanel.synchronizeRendering();
			keyExecuteMode( KeyStartMode );
			OpExecuted = false;
			}
			else
			{
			clearCurrentPrompt();
			keyExecuteMode( KeyStartMode );
			}
		}


/**
* Handles a parse error generated by the user.
*/
	private void keyHandleParseError( ) throws MathImageParseException
		{
		this.getTarget().playBeep();
		keyHandleBackspace();
		}


/**
* Handles the selection or insertion of a depictor.
*/
	public /* private !!!!! */ void keyHandleSingleClick( DrawObj MyObj , DGMNode MyDGM )
		throws MathImageParseException
		{
		boolean cond = ( MyObj != null );

		if( cond )
			{
			cond = cond && checkDepictorTypeMatch( MyObj );
			cond = cond && MyObj.getNamedVar();
			}

		if( cond )
			{
			ELexeme MyLex = new ELexeme();
			FlexString prompt = new FlexString();
			MyObj.getVectName().copyString( prompt );
			MyLex.setTopOp( EXsym.variable );
			MyLex.setTopDrawExpr( !( isNameAtomic( MyObj.getVectName() ) ) );
			Object[] Draw = { MyObj , MyDGM };
			MyLex.setTopDraw( prompt , Draw );
			
			if( !( CurPromptList.empty() ) )
				{
				CurPromptList.searchHead();
				CurPromptList.left();
				CurPromptList.insertRight( MyLex );
				}
				else
				{
				CurPromptList.insertRight( MyLex );
				}

			updatePrompt();
			}

		}


/**
* Attempts to select or rename a new variable with character code <code>in</code>.
*/
	protected void keyHandleNewVar( char in ) throws IllegalInputException ,
		MathImageParseException
		{
		boolean bold = false;
		boolean cap = false;
		boolean Err = false;

		if( in == 'i' )
			{
			boolean Found = findVarFromChar( in );
			if( !Found )
				{
				FreeDepicPanel.createUnitPhasor();
				}

			keyHandleNewVarComp( in );
			}
			else
			{
			if( ( LastUserCreatedDepic != null ) && ( ( KeyCurrentMode == KeyStartMode ) ||
				( KeyCurrentMode == KeyParamOneMode ) ) )
				{
				if( LastUserCreatedDepic instanceof Vect1 ) bold = true;
				if( LastUserCreatedDepic instanceof Angle1 ) cap = true;
				if( LastUserCreatedDepic instanceof Para1 ) { bold = true; cap = true; }
				if( ( LastUserCreatedDepic.noSymBindings() ) && ( in != 'i' ) && ( in != 'e' ) )
					{
					String cs = ( new Character( in ) ).toString();
					if( cap ) cs = cs.toUpperCase();
					if( bold ) cs = "<BT>" + cs + "</BT>";
					FlexString mys = new FlexString( cs );
					boolean Found = findVarFromChar( in );
					if( !Found )
						{
						DrawObjFactory MyFac = new DrawObjFactory( FreeDepicPanel , this );
						MyFac.setNewVectName( mys );
						MyFac.setDepicClass( LastUserCreatedDepic , false );
						MyFac.setFrontLineColor( LastUserCreatedDepic.getFrontLineColor() );
						MyFac.setBackLineColor( LastUserCreatedDepic.getBackLineColor() );
						MyFac.setTextColor( LastUserCreatedDepic.getTextColor() );
						DrawObj Tmp = MyFac.createDepictor();
						LastUserCreatedDepic.copyUser1Info( Tmp );
						mys.copyAllInfo( Tmp.getVectName() );
						deleteDepictor( LastUserCreatedDepic );
						globalRepaint();
						keyExecuteMode( KeyStartMode );
						MyAlgPanel.postInvalidate();
						MyGeomPanel.postInvalidate();
						}
						else
						{
						Err = true;
						}
					}
					else
					{
					Err = true;
					}	

				LastUserCreatedDepic = null;
				if( Err )
					{
					throw( new IllegalInputException( "The attempt to rename the depictor you just created failed."
						+ "<BR>Either the depictor can not be renamed"
						+ "<BR>or a depictor already exists at the requested name." ) );
					}
				}
				else
				{
				keyHandleNewVarComp( in );
				}
			}
		}


/**
* Attempts to create a new depictor with character code <code>in</code>.
*/
	protected void keyHandleNewVarComp( char in )
		throws IllegalInputException ,
		MathImageParseException
		{
		LastUserCreatedDepic = null;
		FlexString VarName = new FlexString( ( new Character( in ) ).toString() );
		boolean Works = keyHandleNewVar( VarName , false );
		if( !Works )
			{
			VarName = new FlexString( ( new Character( in ) ).toString().toUpperCase() );
			Works = keyHandleNewVar( VarName , false );
			if( !Works )
				{
				String mys = "<BT>" + ( ( new Character( in ) ).toString() ) + "</BT>";
				VarName = new FlexString( mys );
				Works = keyHandleNewVar( VarName , false );
				if( !Works )
					{
					mys = "<BT>" + ( ( new Character( in ) ).toString().toUpperCase() ) + "</BT>";
					VarName = new FlexString( mys );
					Works = keyHandleNewVar( VarName , false );
					}
				}
			}


		if( !Works )
			{
			keyHandleError();
			throw( new IllegalInputException( "Unable to locate a depictor by that name." ) );
			}

		}


/**
* Attempts to find a new depictor with name <code>VarName</code>.
*/
	protected boolean keyHandleNewVar( FlexString VarName , boolean throwErr )
		throws MathImageParseException
		{
		FragNode fr = getVarList().getFrag( VarName );
		boolean Works = ( fr != null );
		DrawObj myNode = null;
		DGMNode myD = null;

		if( Works )
			{
			DGMHashMap FragList = fr.getFragMap();
			myD = FragList.getFirstNode();
			myNode = myD.getMyDraw();
			}

		if( Works ) Works = keyHandleNewVar( myNode , throwErr );
		
		return( Works );
		}

/**
* Handles the creation of a depictor named <code>MyNode</code>.
*/
	protected boolean keyHandleNewVar( DrawObj MyNode , boolean throwErr )
		throws MathImageParseException
		{
		FragNode fr = getVarList().getFrag( MyNode.getVectName() );
		boolean Works = ( fr != null );
		DGMNode NdDGM = null;


		Works = ( MyNode != null );

		if( Works )
			{
			NdDGM = getNodeDGM( MyNode );

			keyHandleSingleClick( MyNode , NdDGM );
			}
			else
			{
			if( throwErr ) 
				{
				keyHandleError();
				}
			}
		
		return( Works );
		}


/**
* Handles the insertion of a digit.
*/
	protected void keyHandleNewDigit( int in ) throws MathImageParseException
		{
		ObjObj<String> MyLex = new ObjObj<String>();
		String mys = new String( ( new Integer( in ) ).toString() );
		MyLex.value = mys;
		
		if( !( CurPromptList.empty() ) )
			{
			CurPromptList.searchHead();
			CurPromptList.left();
			CurPromptList.insertRight( MyLex );
			}
			else
			{
			CurPromptList.insertRight( MyLex );
			}

		updatePrompt();
		}


/**
* Handles a request to move to the next line.
*/
	protected void keyHandleNextLine( )
		throws MathImageParseException
		{
		if( OpExecuted )
			{
			FlexString MyStr = new FlexString();
			MyStr.setInsertPoint( 0 );
			KeyCachePrompt.insertString( MyStr );
			MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic ,
				getParamFactorRequired( KeyCacheDepic ) );

			MyAlgPanel.incrementCurrentLine();
			MyAlgPanel.synchronizeRendering();
			MyGeomPanel.incrementCurrentLine();
			MyGeomPanel.synchronizeRendering();
			}
			else
			{
			MyAlgPanel.chgCurrentLineHeight( 1.0 );
			MyGeomPanel.chgCurrentLineHeight( 1.0 );
			MyGeomPanel.clearBkgndDepics();
			}

		KeyCacheDepic = null;
		KeyCachePrompt = null;
		LastUserCreatedDepic = null;
		keyExecuteMode( KeyStartMode );
		OpExecuted = false;
		}


/**
* Handles the pressing of the backspace key by editing the current line.
*/
	protected void keyHandleBackspace( ) throws MathImageParseException
		{
		if( !CurPromptList.empty() )
			{
			CurPromptList.searchHead();
			CurPromptList.left();
			Object myo = CurPromptList.getNode();

			if( myo instanceof ELexeme )
				{
				ELexeme MyLex = (ELexeme) myo;
				int Op = MyLex.getTopOp();
				}

			CurPromptList.eraseNodeInfo();
			updatePrompt();
			}
			else
			{
				this.getTarget().playBeep();
			}
		}


/**
* Applies the script display mode.
*/
	private void keyApplyScriptModeIncr( ) throws MathImageParseException
		{
		if( KeyScriptMode == ScriptStringMode )
			{
			MyAlgPanel.applyScriptModeIncr();
			MyAlgPanel.synchronizeRendering();
			MyGeomPanel.applyScriptModeIncr();
			MyGeomPanel.synchronizeRendering();
			}
		}


/**
* Switches to and performs the actions of a particular mode.
*/
	private void keyExecuteMode( int in ) throws MathImageParseException
		{ keyExecuteMode( in , -1.0 ); }


/**
* Switches to and performs the actions of a particular mode.
*/
	private void keyExecuteMode( int in , double factor )
		throws MathImageParseException
		{
		boolean update = false;
		KeyCurrentMode = in;
		FlexString MyStr = new FlexString();
		MyStr.setInsertPoint( 0 );
		
		switch( KeyCurrentMode )
			{
			case KeyStartMode:
				clearCurrentPrompt();
				update = true;
				break;
			case KeyPasteMultiMode:
				SetSingleDepicOnly = false;
				buildPastePromptString( MyStr );
				MyAlgPanel.setCurrentPromptLine( MyStr , null , 2.0 );
				MyGeomPanel.setCurrentPromptLine( ExprClipboard , SetSingleDepicOnly , 2.0 );
				MyAlgPanel.postInvalidate();
				MyGeomPanel.postInvalidate();
				globalRepaint();
				break;

			default:
				break;
			}


		if( update )
			{
			MyAlgPanel.setCurrentPromptLine( MyStr , KeyCacheDepic , factor );
			MyGeomPanel.setCurrentPromptLine( KeyCacheDepic , SetSingleDepicOnly , factor );
			MyAlgPanel.postInvalidate();
			MyGeomPanel.postInvalidate();
			}

		}


/**
* Creates a constrained depictor for use in a manipulatible diagram.
*/
	protected DrawObj createConstrainedObject( FlexString InName , int Domain , FlexString Expr )
		{
		return( createConstrainedObject( InName , Domain , Expr , null ) );
		}


/**
* Creates a constrained depictor for use in a manipulatible diagram.
*/
	protected DrawObj createConstrainedObject( FlexString InName , int Domain , FlexString Expr , Integer iCol )
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

		char StChar = InName.getChar( 0 );
		FlexString Name = new FlexString();
		Name.setInsertPoint( 0 );
		if( StChar != '<' ) Name.insertJavaString( "<APPLY>" );
		InName.insertString( Name );
		if( StChar != '<' ) Name.insertJavaString( "</APPLY>" );

		DrawObjFactory MyFac = new DrawObjFactory( FreeDepicPanel , this );
		
		
		MyFac.setNewVectName( Name );

		if( iCol != null )
			{
			MyFac.setFrontLineColor( iCol );
			MyFac.setTextColor( iCol );
			}

		DrawObj MyObj1 = null;
		DrawObj MyObj2 = null;

		if( TypeName1 != null )
			{
			MyFac.setDepicClass( TypeName1 );
			MyObj1 = MyFac.createDepictor();
			}

		if( TypeName2 != null )
			{
			MyFac.setDepicClass( TypeName2 );
			MyObj2 = MyFac.createDepictor();
			}

		DrawObj MyObj = MyObj1;
		if( MyObj == null ) MyObj = MyObj2;

		Object[] myo = { MyObj };
		FlexString VarName = new FlexString();
		insertFormattedString( myo , VarName );

		changeExpression( VarName , Expr , EngineConstants.USER_AXIOM_MODE );

		return( MyObj );
		}

/**
* Returns a depictor corresponding to the first parameter of the lexeme.
*/
	protected DrawObj getParamOne( ELexeme in )
		{
		DrawObj ParamOne = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamOne ) == 0 )
			ParamOne = in.getParamOneDrawObj();
			else
			{
			FlexString Prompt = in.getParamOnePrompt();
			FragNode MyFrag = getVarList().getFrag( Prompt );
			boolean Found = ( MyFrag != null );
			if( Found )
				{
				DGMHashMap FragList = MyFrag.getFragMap();
				DGMNode MyDGM = (DGMNode)( FragList.getFirstNode() );
				ParamOne = MyDGM.getMyDraw();
				}
			}

		if( ParamOne == null )
			{
			Integer iCol = null;
			boolean SimplifiedOp = ( in.getParenCount() ) > 0;
			boolean Boxed = ( stat & ELexeme.Boxed ) != 0;
			boolean OpMatch = ( in.getTopOp() == EXsym.plus ) || ( in.getTopOp() == EXsym.minus );

			if( ( OpMatch ) && ( !Boxed ) && ( !SimplifiedOp ) )
				iCol = Color.rgb( 128 , 128 , 0 );
			
			int Domain = in.getParamOneDomain();
			FlexString Expr = in.getParamOneExpr();
			FlexString Prompt = in.getParamOnePrompt();
			ParamOne = createConstrainedObject( Prompt , Domain , Expr , iCol );
			}

		return( ParamOne );
		}


/**
* Returns a depictor corresponding to the second parameter of the lexeme.
*/
	protected DrawObj getParamTwo( ELexeme in )
		{
		DrawObj ParamTwo = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamTwo ) == 0 )
			ParamTwo = in.getParamTwoDrawObj();
			else
			{
			FlexString Prompt = in.getParamTwoPrompt();
			FragNode MyFrag = getVarList().getFrag( Prompt );
			boolean Found = ( MyFrag != null );
			if( Found )
				{
				DGMHashMap FragList = MyFrag.getFragMap();
				DGMNode MyDGM = (DGMNode)( FragList.getFirstNode() );
				ParamTwo = MyDGM.getMyDraw();
				}
			}

		if( ParamTwo == null )
			{
			Integer iCol = null;
			boolean SimplifiedOp = ( in.getParenCount() ) > 0;
			boolean Boxed = ( stat & ELexeme.Boxed ) != 0;
			boolean OpMatch = ( in.getTopOp() == EXsym.plus ) || ( in.getTopOp() == EXsym.minus );

			if( ( OpMatch ) && ( !Boxed ) && ( !SimplifiedOp ) )
				iCol = Color.rgb( 192 , 64 , 0 );

			int Domain = in.getParamTwoDomain();
			FlexString Expr = in.getParamTwoExpr();
			FlexString Prompt = in.getParamTwoPrompt();
			ParamTwo = createConstrainedObject( Prompt , Domain , Expr , iCol );
			}

		return( ParamTwo );
		}


/**
* Returns a depictor corresponding to the third parameter of the lexeme.
*/
	protected DrawObj getParamThree( ELexeme in )
		{
		DrawObj ParamThree = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamThree ) == 0 )
			ParamThree = in.getParamThreeDrawObj();
			else
			{
			FlexString Prompt = in.getParamThreePrompt();
			FragNode MyFrag = getVarList().getFrag( Prompt );
			boolean Found = ( MyFrag != null );
			if( Found )
				{
				DGMHashMap FragMap = MyFrag.getFragMap();
				DGMNode MyDGM = (DGMNode)( FragMap.getFirstNode() );
				ParamThree = MyDGM.getMyDraw();
				}
			}

		if( ParamThree == null )
			{
			int Domain = in.getParamThreeDomain();
			FlexString Expr = in.getParamThreeExpr();
			FlexString Prompt = in.getParamThreePrompt();
			ParamThree = createConstrainedObject( Prompt , Domain , Expr );
			}

		return( ParamThree );
		}


/**
* Returns a depictor corresponding to the fourth parameter of the lexeme.
*/
	protected DrawObj getParamFour( ELexeme in )
		{
		DrawObj ParamFour = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamFour ) == 0 )
			ParamFour = in.getParamFourDrawObj();
			else
			{
			FlexString Prompt = in.getParamFourPrompt();
			FragNode MyFrag = getVarList().getFrag( Prompt );
			boolean Found = ( MyFrag != null );
			if( Found )
				{
				DGMHashMap FragList = MyFrag.getFragMap();
				DGMNode MyDGM = (DGMNode)( FragList.getFirstNode() );
				ParamFour = MyDGM.getMyDraw();
				}
			}

		if( ParamFour == null )
			{
			int Domain = in.getParamFourDomain();
			FlexString Expr = in.getParamFourExpr();
			FlexString Prompt = in.getParamFourPrompt();
			ParamFour = createConstrainedObject( Prompt , Domain , Expr );
			}

		return( ParamFour );
		}


/**
* Returns a depictor corresponding to the fifth parameter of the lexeme.
*/
	protected DrawObj getParamFive( ELexeme in )
		{
		DrawObj ParamFive = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamFive ) == 0 )
			ParamFive = in.getParamFiveDrawObj();
			else
			{
			FlexString Prompt = in.getParamFivePrompt();
			FragNode MyFrag = getVarList().getFrag( Prompt );
			boolean Found = ( MyFrag != null );
			if( Found )
				{
				DGMHashMap FragMap = MyFrag.getFragMap();
				DGMNode MyDGM = (DGMNode)( FragMap.getFirstNode() );
				ParamFive = MyDGM.getMyDraw();
				}
			}

		if( ParamFive == null )
			{
			int Domain = in.getParamFiveDomain();
			FlexString Expr = in.getParamFiveExpr();
			FlexString Prompt = in.getParamFivePrompt();
			ParamFive = createConstrainedObject( Prompt , Domain , Expr );
			}

		return( ParamFive );
		}


/**
* Returns a DGMNode corresponding to the first parameter of the lexeme.
*/
	protected DGMNode getParamOneDGM( ELexeme in , DrawObj KeyParamOne )
		{
		DGMNode MyDGM = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamOne ) == 0 )
			MyDGM = in.getParamOneDrawDGM();

		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyParamOne.makeCoordContext();
			KeyParamOne.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyParamOne );
			}

		return( MyDGM );
		}


/**
* Returns a DGMNode corresponding to the second parameter of the lexeme.
*/
	protected DGMNode getParamTwoDGM( ELexeme in , DrawObj KeyParamTwo )
		{
		DGMNode MyDGM = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamTwo ) == 0 )
			MyDGM = in.getParamTwoDrawDGM();

		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyParamTwo.makeCoordContext();
			KeyParamTwo.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyParamTwo );
			}

		return( MyDGM );
		}


/**
* Returns a DGMNode corresponding to the third parameter of the lexeme.
*/
	protected DGMNode getParamThreeDGM( ELexeme in , DrawObj KeyParamThree )
		{
		DGMNode MyDGM = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamThree ) == 0 )
			MyDGM = in.getParamThreeDrawDGM();

		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyParamThree.makeCoordContext();
			KeyParamThree.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyParamThree );
			}

		return( MyDGM );
		}


/**
* Returns a DGMNode corresponding to the fourth parameter of the lexeme.
*/
	protected DGMNode getParamFourDGM( ELexeme in , DrawObj KeyParamFour )
		{
		DGMNode MyDGM = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamFour ) == 0 )
			MyDGM = in.getParamFourDrawDGM();

		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyParamFour.makeCoordContext();
			KeyParamFour.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyParamFour );
			}

		return( MyDGM );
		}


/**
* Returns a DGMNode corresponding to the fifth parameter of the lexeme.
*/
	protected DGMNode getParamFiveDGM( ELexeme in , DrawObj KeyParamFive )
		{
		DGMNode MyDGM = null;
		int stat = in.getFillStat();

		if( ( stat & ELexeme.FilledParamFive ) == 0 )
			MyDGM = in.getParamFiveDrawDGM();

		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyParamFive.makeCoordContext();
			KeyParamFive.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyParamFive );
			}

		return( MyDGM );
		}


/**
* Executes a unary operation on the stored expression parameters.
*/
	private double keyExecuteUnaryOp( ELexeme in )
		{
		DrawObj KeyParamOne = getParamOne( in );
		DGMNode ParamOneDGM = getParamOneDGM( in , KeyParamOne );
		FlexString MyStr = in.getTopPrompt();
		boolean SimplifiedOp = ( in.getParenCount() ) > 0;
		FreeDepicPanel.setAnimResultObj( null );
		OpExecuted = true;
		double ret = 1.0;
		int Op = in.getTopOp();

		if( ( KeyParamOne instanceof Dsca1 ) || ( KeyParamOne instanceof Ssca1 ) )
			ret = 1.0; else ret = 2.0;

		switch( Op )
			{
			case EXsym.uplus:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.positAnimate( KeyParamOne , 
					ParamOneDGM ); }
				break;
			case EXsym.negation:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.negateAnimate( KeyParamOne , 
					ParamOneDGM ); }
				break;
			case EXsym.magnitude:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUseBlinking( false );
				MyOp.magnitudeAnimate( KeyParamOne , 
					ParamOneDGM , SimplifiedOp ); }
				break;
			case EXsym.square:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.multiplyAnimate( KeyParamOne , 
					KeyParamOne , ParamOneDGM , ParamOneDGM , SimplifiedOp ); }
				if( !SimplifiedOp && UsingScalarWedge ) ret = 2.0;
				break;
			case EXsym.inverse:
				DrawObj objU = null;
				DGMNode objUDGM = null;
				objU = getCurUnitObj();
				objUDGM = FreeDepicPanel.getNodeDGM( objU );
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.divideAnimate( objU , 
					KeyParamOne , objUDGM , ParamOneDGM , SimplifiedOp ); }
				if( !SimplifiedOp && UsingScalarWedge ) ret = 2.0;
				break;
			case EXsym.sqrt:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.sqrtAnimate( KeyParamOne , ParamOneDGM ); }
				ret = 2.0;
				break;
			case EXsym.exp:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.exponentialAnimate( KeyParamOne , ParamOneDGM ); }
				break;
			case EXsym.ScalGradPart:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.scalGradPartAnimate( KeyParamOne , ParamOneDGM ); }
				break;
			case EXsym.ImagGradPart:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.imagGradPartAnimate( KeyParamOne , ParamOneDGM ); }
				break;

			}

		return( ret );
		}

/**
* Executes a binary operation on the stored expression parameters.
*/
	private double keyExecuteBinaryOp( ELexeme in ) throws MathImageParseException
		{
		int Op = in.getTopOp();
		DrawObj KeyParamOne = getParamOne( in );
		DrawObj KeyParamTwo = getParamTwo( in );
		DGMNode ParamOneDGM = getParamOneDGM( in , KeyParamOne );
		DGMNode ParamTwoDGM = getParamTwoDGM( in , KeyParamTwo );
		FlexString MyStr = in.getTopPrompt();
		boolean SimplifiedOp = ( in.getParenCount() ) > 0;
		FreeDepicPanel.setAnimResultObj( null );
		OpExecuted = true;
		double ret = 1.0;

		if( ( ( KeyParamOne instanceof Dsca1 ) || ( KeyParamOne instanceof Ssca1 ) ) &&
			( ( KeyParamTwo instanceof Dsca1 ) || ( KeyParamTwo instanceof Ssca1 ) ) )
			ret = 1.0; else ret = 2.0;

		switch( Op )
			{
			case EXsym.plus:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.addAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				break;
			case EXsym.minus:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.subAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				if( ( ( KeyParamOne instanceof Dsca1 ) || ( KeyParamOne instanceof Ssca1 ) )
					&& ( ( KeyParamTwo instanceof Dsca1 ) || ( KeyParamTwo instanceof Ssca1 ) )
					&& !SimplifiedOp ) ret = 1.5;
				break;
			case EXsym.compare:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.compareAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				MyGeomPanel.setCurrentPromptLine( FreeDepicPanel.getAnimResultObj() , SetSingleDepicOnly );
				break;
			case EXsym.assign:
				int chk = getDepictorConstAction( KeyParamOne );
				
				if( chk != 0 )
					{
					boolean Err = ( new OpHandler( FreeDepicPanel  , this ) ).assignAnimate( KeyParamOne , KeyParamTwo , 
						ParamOneDGM , ParamTwoDGM );
					if( Err ) keyHandleError();
					else
						{
						KeyCacheDepic = KeyParamOne;
						setCacheDepicDGM( ParamOneDGM );
						updateExpressionListeners();
						}
					}
					else
					{
					keyHandleError();
					}
				break;
			case EXsym.prod:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.multiplyAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				if( !SimplifiedOp && UsingScalarWedge ) ret = 2.0;
				break;
			case EXsym.div:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.divideAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				if( !SimplifiedOp && UsingScalarWedge ) ret = 2.0;
				break;
			case EXsym.TraceGraph:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.traceGraphAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM ); }
				MyGeomPanel.setCurrentPromptLine( FreeDepicPanel.getAnimResultObj() , SetSingleDepicOnly );
				ret = 2.0;
				break;
			case EXsym.power:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.powerAnimate( KeyParamOne , ParamOneDGM , 
					KeyParamTwo , ParamTwoDGM ); }
				if( !SimplifiedOp && UsingScalarWedge ) ret = 2.0;
				break;
			case EXsym.dot:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.dotAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				break;
			case EXsym.cross:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.crossAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				ret = 2.0;
				break;
			case EXsym.wedge:
				{ OpHandler MyOp = new OpHandler( FreeDepicPanel  , this );
				MyOp.setReplaceName( MyStr );
				MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
				MyOp.setUseAnimation( false );
				MyOp.setScalingUnit( false );
				MyOp.setUnitName( "1" );
				MyOp.setUseBlinking( false );
				MyOp.wedgeAnimate( KeyParamOne , KeyParamTwo , 
					ParamOneDGM , ParamTwoDGM , SimplifiedOp ); }
				break;
			}

		return( ret );
		}


/**
* Returns the selector value for the proportion operation,
* or a negative number for an error state.
*/
	private int getProportionSelector( DrawObj KeyParamOne , DrawObj KeyParamTwo , DrawObj KeyParamThree ,
		DrawObj KeyParamFour , DrawObj KeyParamFive )
		{
		int ret = -1;

		if( KeyParamOne.getVectName().stcmp( KeyParamFive.getVectName() ) == 0 )
			{ if( ret == -1 ) ret = 0; else ret = -2; }

		if( KeyParamTwo.getVectName().stcmp( KeyParamFive.getVectName() ) == 0 )
			{ if( ret == -1 ) ret = 1; else ret = -2; }

		if( KeyParamThree.getVectName().stcmp( KeyParamFive.getVectName() ) == 0 )
			{ if( ret == -1 ) ret = 2; else ret = -2; }

		if( KeyParamFour.getVectName().stcmp( KeyParamFive.getVectName() ) == 0 )
			{ if( ret == -1 ) ret = 3; else ret = -2; }

		return( ret );
		}


/**
* Executes a proportion operation.
*/
	private double keyExecuteProportionOp( ELexeme MyLex )
		throws MathImageParseException
		{
		double factor = 2.0;
		DrawObj KeyParamOne = getParamOne( MyLex );
		DrawObj KeyParamTwo = getParamTwo( MyLex );
		DrawObj KeyParamThree = getParamThree( MyLex );
		DrawObj KeyParamFour = getParamFour( MyLex );
		DrawObj KeyParamFive = getParamFive( MyLex );
		DGMNode ParamOneDGM = getParamOneDGM( MyLex , KeyParamOne );
		DGMNode ParamTwoDGM = getParamTwoDGM( MyLex , KeyParamTwo );
		DGMNode ParamThreeDGM = getParamThreeDGM( MyLex , KeyParamThree );
		DGMNode ParamFourDGM = getParamFourDGM( MyLex , KeyParamFour );
		DGMNode ParamFiveDGM = getParamFiveDGM( MyLex , KeyParamFive );
		
		if( true )
			{
			OpHandler MyOp = new OpHandler( FreeDepicPanel , this );
			MyOp.setUniDimensionalScalars( OpHandler.UniDimensionalAngleResult );
			MyOp.setUseAnimation( false );
			MyOp.setUseBlinking( false );
			int val = getProportionSelector( KeyParamOne , KeyParamTwo , KeyParamThree ,
				KeyParamFour , KeyParamFive );
			boolean Err = ( val < 0 );
			if( !Err )
				{
				Err = MyOp.proportionAnimate( 
					KeyParamOne , ParamOneDGM , 
					KeyParamTwo , ParamTwoDGM ,
					KeyParamThree , ParamThreeDGM ,
					KeyParamFour , ParamFourDGM , val );
				}
			if( Err ) 
				{
				keyHandleError();
				}
			else
				{
				OpExecuted = true;
				}
			}
			else
			{
			keyHandleError();
			} 

		return( factor );
		}


/**
* Sets the current operator.
*/
	private void keySetOp( int in )
		{
		KeyCurrentOp = in;
		}

/**
* Sets the algebraic workspace panel for the model.
*/
	public void setAlgPanel( GeoPadAlgPanel in )
		{ MyAlgPanel = in; }

/**
* Sets the geometric workspace panel for the model.
*/
	public void setGeomPanel( GeoPadGeomPanel in )
		{ MyGeomPanel = in; }

/**
* Sets the identity of the last depictor created by the user.
*/
	public void setLastUserCreatedDepic( DrawObj in )
		{ LastUserCreatedDepic = in; }


/**
* Returns whether any variable corresponding to the character
* passed in the parameter exists.
*/
	public boolean findVarFromChar( char in )
		{
		boolean fnd = false;

		FlexString VarName = new FlexString( ( new Character( in ) ).toString() );
		fnd = getVarList().getFrag( VarName ) != null;
		if( !fnd )
			{
			VarName = new FlexString( ( new Character( in ) ).toString().toUpperCase() );
			fnd = getVarList().getFrag( VarName ) != null;
			if( !fnd )
				{
				String mys = "<BT>" + ( ( new Character( in ) ).toString() ) + "</BT>";
				VarName = new FlexString( mys );
				fnd = getVarList().getFrag( VarName ) != null;
				if( !fnd )
					{
					mys = "<BT>" + ( ( new Character( in ) ).toString().toUpperCase() ) + "</BT>";
					VarName = new FlexString( mys );
					fnd = getVarList().getFrag( VarName ) != null;
					}
				}
			}
		
		return( fnd );		
		}


/**
* Returns whether a variable should be in the free and bound depiction panes
* by examining its name.
*/
	public boolean isSinglePanelVar( FlexString in , boolean IncludeUnit /* !!!!!!!!!!!!!!! */ )
		{
		int len = in.strlen();
		boolean tmp = true;

		if( true )
			{
			char cl = in.getChar( 0 );
			if( cl == '~' )
				tmp = false;
			}

		if( len >= 7 )
			{
			boolean tmp1 = in.iBaseCmp( "<APPLY>" , 0 );
			if( tmp1 )
				tmp = false;
			}

		return( tmp );
		}


/**
* Returns whether a name is atomic (e.g. "single letter").
*/
	private boolean isNameAtomic( FlexString in )
		{
		boolean tmp = false;

		if( ( in.strlen() == 1 ) || ( isSinglePanelVar( in , true ) ) )
			tmp = true;
		else
			{
			if( in.getChar( 0 ) == '(' )
				{
				int plen = in.strlen() - 1;
				int count = 0;
				int flag = 0;

				tmp = true;
				for( count = 0 ; count < plen ; ++count )
					{
					if( in.getChar( count ) == '(' )
						flag++;

					if( in.getChar( count ) == ')' )
						flag--;

					if( flag == 0 )
						tmp = false;
					}
				}
				else
				{
				tmp = false;
				}
			}

		return( tmp );
		}

/**
* Gets the DGMNode associated with the last click.
*/
	private DGMNode getLastClickDGM1( )
		{
		return( FreeDepicPanel.getLastClickDGM1() );
		}

/**
* Gets the DGMNode that the free depiction panel associates with a depictor.
*/
	private DGMNode getNodeDGM( DrawObj in )
		{
		return( FreeDepicPanel.getNodeDGM( in ) );
		}

/**
* Sets the free depiction panel.
*/
	public void setFreeDepicPanel( GeoPadKit in )
		{
		FreeDepicPanel = in;
		}

/**
* Sets the bound depiction panel.
*/
	public void setBoundDepicPanel( GeoPadKit in )
		{
		BoundDepicPanel = in;
		}

/**
* Gets the unit object.
*/
	public DrawObj getCurUnitObj( )
		{
		return( CurUnitObj );
		}

/**
* Gets the unit constraint depictor.
*/
	public DrawObj getCurUnitCntObj( )
		{
		return( CurUnitCntObj );
		}

/**
* Sets the Unit object.
*/
	public void setCurUnitObj( DrawObj in )
		{
		CurUnitObj = in;
		}

/**
* Sets the unit constraint depictor.
*/
	public void setCurUnitCntObj( DrawObj in )
		{
		CurUnitCntObj = in;
		}

/**
* Returns whether mouse-clicks can be used to select algebra items.
*/
	protected boolean getAllowClickSelect( )
		{ return( AllowClickSelect ); }

/**
* Sets whether mouse-clicks can be used to select algebra items.
*/
	protected void setAllowClickSelect( boolean in )
		{ AllowClickSelect = in; }

/**
* Sets whether the next diagram displayed in the Geometric Workspace will be 
* displayed as a single depictor only.
*/
	protected void handleSingleDepicOnly( )
		{ SetSingleDepicOnly = true; }

/**
* Sets the divider for the free/bound variables.
*/
//	public void setVarDivider( JSplitPane in )
//		{ VarsDivider = in; }
/**
* Sets the free/bound divider to all free depiction.
*/
//	protected void setMaxFreeDepic( )
//		{ VarsDivider.setDividerLocation( VarsDivider.getMaximumDividerLocation() ); }
/**
* Sets the free/bound divider to all bound depiction.
*/
//	protected void setMaxBoundDepic( )
//		{ VarsDivider.setDividerLocation( VarsDivider.getMinimumDividerLocation() ); }
/**
* Sets the divider for the geometric/algebriac workspace.
*/
//	public void setWorkDivider( JSplitPane in )
//		{ WorkDivider = in; }
/**
* Sets the tool object.
*/
	public void setToolObject( Object in )
		{ toolObject = in; }
/**
* Gets the tool object.
*/
	public Object getToolObject( )
		{ return( toolObject ); }
/**
* Sets the geometric/algebraic divider to show all geometric workspace.
*/
//	protected void setMaxWorkGeom( )
//		{ WorkDivider.setDividerLocation( WorkDivider.getMinimumDividerLocation() ); }
/**
* Sets the geometric/algebraic divider to show all algebraic workspace.
*/
//	protected void setMaxWorkAlg( )
//		{ WorkDivider.setDividerLocation( WorkDivider.getMaximumDividerLocation() ); }


/**
* Returns true iff. a depictor represents a symbolic entity.
*/
	public boolean checkDepictorTypeMatch( DrawObj in )
		{
		boolean ret = false;

		if( ( ( in instanceof Dsca1 ) || ( in instanceof Ssca1 ) ) &&
			!( ( in instanceof Ruler1 ) ) ) 
			ret = true;

		if( ( ( in instanceof Vect1 ) || ( in instanceof Vect2 ) ) &&
			!( ( in instanceof Direc1 ) || ( in instanceof Circ1 ) || ( in instanceof Lnseg1 ) ) )
			ret = true;

		if( ( in instanceof Angle1 ) || ( in instanceof Angle2 ) ) 
			ret = true;

		if( ( in instanceof Para1 ) )
			ret = true;

		return( ret );
		}


/**
* Returns whether there is only one depictor corresponding to a particular name.
*/
	public boolean checkDepicUnique( DrawObj in )
		{
		boolean Unique = false;
		FragNode MyNode = getVarList().getFrag( in.getVectName() );
		DGMHashMap fragMap = MyNode.getFragMap();
		int sz = fragMap.size();
		Unique = ( sz == 1 );

		if( !Unique )
			{
			int InDomain = ( in.vectGetEntDomain() )
				| ( ( in.vectGetExtDomain() ).value );
			int SampDomain = 0;
			Iterator<DGMNode> it = fragMap.values().iterator();
			boolean Done = false;

			while( !Done )
				{
				DGMNode MyDGM = it.next();
				DrawObj node = MyDGM.getMyDraw();

				if( node != in )
					SampDomain = SampDomain | ( node.vectGetEntDomain() );

				Done = !( it.hasNext() ) || ( SampDomain == InDomain );
				}

			if( SampDomain != InDomain ) Unique = true;
			}

		return( Unique );
		}

/**
* Checks whether a node needs to be stacked based on a dependency.
*/
	protected void checkClipDependency( DGMNode ChkObj , ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ )
		{
		if( !( TmpClip.contains( ChkObj ) ) )
			{
			MyQ.enq( ChkObj );
			}
		}

/**
* Gets the DGMNode for a depictor that is about to be on the clipboard.
*/
	protected DGMNode clipGetDGM( DrawObj in )
		{
		FragNode Tmp = (FragNode)( getVarList().getFrag( in.getVectName() ) );
		DGMNode MyDGM = (DGMNode)( Tmp.getFragMap().getDGM( in.getFragID() ) );
		return( MyDGM );
		}

/**
* Checks whether a depictor in the clipbaord has any dependencies due to its delegates.
*/
	protected void checkDelegateDependencies( HighLevelList<StdLowLevelList<DrawObj>,DrawObj> in , 
				ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ )
		{
		if( !( in.empty() ) )
			{
			in.searchHead();
			boolean Done = false;

			while( !Done )
				{
				DrawObj MyObj = in.getNode();
				checkClipDependency( clipGetDGM( MyObj ) , TmpClip , MyQ );				

				in.right();
				Done = in.getHead();
				}
			}

		}

/**
* Checks whether a variable name is a port variable that may indicate a dependency
* to a depictor on the clipboard.
*/
	protected void checkClipAsgnNode( FlexString VarName , ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ )
		{
		char st = VarName.getChar( 0 );

		if( st == '_' )
			{
			FlexString FragName = new FlexString();
			FlexString BaseName = new FlexString();
			FlexString Prefix = getPrefix( VarName );
			removePrefix( VarName , BaseName );
			FragName = getFragName( VarName );
			FragNode MyNode = (FragNode)( getVarList().getFrag( BaseName ) );
			DGMNode MyObj = MyNode.getFragMap().getDGM( FragName );
			checkClipDependency( MyObj , TmpClip , MyQ );
			}

		if( st == '~' )
			{
			if( ( VarName.getChar( 1 ) == 'd' ) && ( VarName.getChar( 2 ) == 'p' ) )
				{
				FragNode MyNode = getVarList().getFrag( VarName );
				DGMNode MyObj = MyNode.getFragMap().getFirstNode();
				checkClipDependency( MyObj , TmpClip , MyQ );
				}
			}
		}

/**
* Checks the assignment list to determine what dependencies exist between depictors that
* are and/or are not on the clipboard.
*/
	protected void checkClipAsgnList( HighLevelList<StdLowLevelList<FlexString>,FlexString> in , 
			ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ )
		{
		if( !( in.empty() ) )
			{
			in.searchHead();
			boolean Done = false;

			while( !Done )
				{
				FlexString mys = in.getNode();
				checkClipAsgnNode( mys , TmpClip , MyQ );

				in.right();
				Done = in.getHead();
				}
			}
		}


/**
* Checks all ports associated with the depictor for dependencies that should be
* added to the clipboard.
*/
	protected void checkClipAssignments( DrawObj MyObj , ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ , 
			HighLevelList<StdLowLevelList<FlexString>,FlexString> LHS , HighLevelList<StdLowLevelList<FlexString>,FlexString> RHS )
		{
		int count;
		FlexString VarName = new FlexString();
		FlexString Vari = new FlexString();
		FlexString Exprn = new FlexString();
		HighLevelList<StdLowLevelList<FlexString>,FlexString> DepList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
		String[] Ports = MyObj.getPortNames();
		IntObj MyMode = new IntObj();

		for( count = 0 ; count < Ports.length ; ++count )
			{
			String myp = Ports[ count ];
			if( myp == "" )
				{
				if( !( MyObj.getNamedVar() ) )
					{
					Object[] tmp = { MyObj };
					VarName = new FlexString();
					DepList.eraseAllInfo();
					insertFormattedString( tmp , VarName );
					getMyEngine().getDependentVariables( VarName , DepList );
					checkClipAsgnList( DepList , TmpClip , MyQ );

					Exprn = new FlexString();
					getMyEngine().extractVariable( VarName , 0 , VarName.strlen() , Vari );
					boolean Found = getMyEngine().getExprn( Vari , Exprn , MyMode );
					if( Found )
						{
						LHS.insertRight( VarName );
						RHS.insertRight( Exprn );
						}
					}
				}
				else
				{
				Object[] tmp = { myp , MyObj };
				VarName = new FlexString();
				DepList.eraseAllInfo();
				insertFormattedString( tmp , VarName );
				getMyEngine().getDependentVariables( VarName , DepList );
				checkClipAsgnList( DepList , TmpClip , MyQ );

				Exprn = new FlexString();
				getMyEngine().extractVariable( VarName , 0 , VarName.strlen() , Vari );
				boolean Found = getMyEngine().getExprn( Vari , Exprn , MyMode );
				if( Found )
					{
					LHS.insertRight( VarName );
					RHS.insertRight( Exprn );
					}
				}
			}
		}


/**
* Checks all ports associated with the depictor for dependencies that should be
* added to the clipboard.
*/
	protected void checkClipUsages( DrawObj MyObj , ClipSet TmpClip , Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ )
		{
		int count;
		FlexString VarName = new FlexString();
		HighLevelList<StdLowLevelList<FlexString>,FlexString> DepList = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
		String[] Ports = MyObj.getPortNames();

		for( count = 0 ; count < Ports.length ; ++count )
			{
			String myp = Ports[ count ];
			if( myp == "" )
				{
				if( !( MyObj.getNamedVar() ) )
					{
					Object[] tmp = { MyObj };
					VarName.clearString();
					DepList.eraseAllInfo();
					insertFormattedString( tmp , VarName );
					getMyEngine().getUsageVariables( VarName , DepList );
					checkClipAsgnList( DepList , TmpClip , MyQ );
					}
				}
				else
				{
				Object[] tmp = { myp , MyObj };
				VarName.clearString();
				DepList.eraseAllInfo();
				insertFormattedString( tmp , VarName );
				getMyEngine().getUsageVariables( VarName , DepList );
				checkClipAsgnList( DepList , TmpClip , MyQ );
				}
			}
		}


/**
* Returns whether the selected set of objects can be extracted or deleted.
*/
	protected boolean getClipIsExtractable( ClipSet in )
		{
		boolean ExtOK = true;

		Iterator<DGMNode> it = in.iterator();

		while( it.hasNext() )
			{
			DGMNode MyNode = it.next();
			DrawObj MyObj = MyNode.getMyDraw();

			FragNode MyFrag = getVarList().getFrag( MyObj.getVectName() );

			if( ( MyObj.getNamedVar() ) && ( ( MyFrag.getRealSelfAlloc().value & DepictorPort.SELF_ALLOC_DROPABLE ) == 0 ) )
				ExtOK = false;	

			if( MyGeomPanel.depictorOnPrompt( MyObj ) )
				ExtOK = false;	
			}


		return( ExtOK );
		}


/**
* Includes in the clipboard objects contained in an assignment constraint.
*/
	protected void expandClipboard( ClipSet Clipboard , ClipSet ExpClipboard , 
		HighLevelList<StdLowLevelList<FlexString>,FlexString> LHS , HighLevelList<StdLowLevelList<FlexString>,FlexString> RHS )
		{
		ClipSet TmpClip = new ClipSet();
		Staque<StdLowLevelList<DGMNode>,DGMNode> MyQ = new Staque<StdLowLevelList<DGMNode>,DGMNode>();
		
		Iterator<DGMNode> it = Clipboard.iterator();

		while( it.hasNext() )
			{
			DGMNode Tmp = it.next();
			/* TmpClip.insertNode( Tmp ); */
			MyQ.enq( Tmp );
			}

		while( !( MyQ.empty() ) )
			{
			DGMNode MyNode = (DGMNode)( MyQ.deq() );
			boolean Found = TmpClip.contains( MyNode );
			if( !Found )
				{
				TmpClip.add( MyNode );

				checkClipAssignments( MyNode.getMyDraw() , TmpClip , MyQ , LHS , RHS );
				checkClipUsages( MyNode.getMyDraw() , TmpClip , MyQ );
				checkDelegateDependencies( MyNode.getMyDraw().getDelegators() , TmpClip , MyQ );
				checkDelegateDependencies( MyNode.getMyDraw().getDelegated() , TmpClip , MyQ );
				}
			}


		ExpClipboard.clear();
		ExpClipboard.addAll( TmpClip );
		}


/**
* If a single depictor was pasted, return its DGMNode.  Otherwise return null.
*/
	public DGMNode getSinglePasteObj( )
		{
		int FndCnt = 0;
		DGMNode RetObj = null;

		Iterator<DGMNode> it = ExprClipboard.iterator();
		while( it.hasNext() )
			{
			DGMNode MyNode = it.next();
			DrawObj MyDraw = MyNode.getMyDraw();
			if( checkDepictorTypeMatch( MyDraw ) )
				{
				if( MyDraw.getNamedVar() )
					{
					RetObj = MyNode;
					FndCnt++;
					}
				}
			}

		if( FndCnt == 1 )
			return( RetObj ); else return( null );
		}

/**
* Shows the algebra panel string for the paste command.
*/
	public void buildPastePromptString( FlexString InStr )
		{
		InStr.clearString();
		InStr.setInsertPoint( 0 );
		int FndCnt = 0;

		Iterator<DGMNode> it = ExprClipboard.iterator();
		
		while( it.hasNext() )
			{
			System.out.println( "Entered Inner Loop." );
			DGMNode MyNode = it.next();
			DrawObj MyDraw = MyNode.getMyDraw();
			if( checkDepictorTypeMatch( MyDraw ) )
				{
				if( MyDraw.getNamedVar() )
					{
					if( FndCnt != 0 ) InStr.insertJavaString( "&sp;,&sp;" );
					MyDraw.getVectName().insertString( InStr );
					FndCnt++;
					}
				}
			}

		}

/**
* Pastes a set of elements into the model.
*/
	protected void pasteIntoModel( )
		{
		System.out.println( "Paste Into Model" );
		

		Iterator<DGMNode> it = ExprClipboard.iterator();

		while( it.hasNext() )
			{
			DGMNode MyNode = it.next();
			DrawObj MyObj = MyNode.getMyDraw();
			
			FragNode MyFrag = getVarList().getFrag( MyObj.getVectName() );
			boolean Found = ( MyFrag != null );
			if( !Found )
				{
				getVarList().insertNode( MyObj.getVectName() );
				MyFrag = (FragNode)( getVarList().getFrag( MyObj.getVectName() ) );
				MyObj.setValuePort( 1 );
				MyFrag.setSelfAlloc( MyObj.portGetSelfAlloc() );
				MyFrag.setRealSelfAlloc( MyFrag.getSelfAlloc() );
				MyFrag.setMovable( MyObj.portGetMovable() );
				MyFrag.setVectName( MyObj.getVectName() );
				MyFrag.setVect( MyObj.portGetVect() );
				MyFrag.setDomain( MyObj.vectGetExtDomain() );
				MyFrag.setIODef( MyObj.vectGetExtIODef() );
				}

			FragNode Frag = getVarList().getFrag( MyObj.getVectName() );
			DGMNode dgm = Frag.getFragMap().getDGM( MyObj.getFragID() );
			Found = ( dgm != null );
			if( !Found )
				{
				DrawObjFactory MyFac = new DrawObjFactory( getTarget() , this );
				MyFac.setReplaceDrawObj( MyObj , true );
				MyFac.setApplyNaming( false );
				DrawObj Tmp2 = MyFac.createDepictor();
				}

			}



		if( !( ClipLHS.empty() ) )
			{
			ClipLHS.searchHead();
			ClipRHS.searchHead();
			boolean Done = false;

			while( !Done )
				{
				FlexString lhs = (FlexString)( ClipLHS.getNode() );
				FlexString rhs = (FlexString)( ClipRHS.getNode() );
				changeExpression( lhs , rhs , EngineConstants.SUPERVISOR_MODE );

				ClipLHS.right();
				ClipRHS.right();
				Done = ClipLHS.getHead();
				}
			}

		}

/**
* Handles a "Paste" command.
*/
	protected void handlePasteKey( ) throws IllegalInputException ,
		MathImageParseException
		{
		DGMNode MyObj = getSinglePasteObj( );

		if( MyObj != null )
			{
			pasteIntoModel( );
			keyHandleSingleClick( MyObj.getMyDraw() , MyObj );
			}
			else
			{
			switch( KeyCurrentMode )
				{
				case KeyStartMode:
				case KeyPasteMultiMode:
					pasteIntoModel( );
					keyExecuteMode( KeyPasteMultiMode );
					break;

				default:
					keyHandleError( );
					throw( new IllegalInputException( "Unable to paste on a non-empty prompt line." ) );
				}
			}

		}

/**
* Handles a mouse selection from the algebra panel.
*/
	protected void handleAlgPanelSelect( int in ) throws IllegalInputException ,
		MathImageParseException
		{
		DrawObj MyNode = MyAlgPanel.getAlgPanelDepic( in );

		boolean Works = ( MyNode != null );

		if( Works )
			{
			setLastClickDepic( MyNode , false );
			}
			else
			{
			keyHandleError();
			throw( new IllegalInputException( "You must select from a non-empty prompt line." ) );
			}

		}


/**
* Changes the height of a particular line on the workspace.
*/
	protected void changeLineHeight( int idex , double LineHeightFactor , boolean SetAlg , boolean SetGeom )
		throws IllegalInputException
		{
		if( LineHeightFactor <= 0.0 )
			throw( new IllegalInputException( "Line height must be positive." ) );

		boolean c1 = MyAlgPanel.chkValidLine( idex );
		boolean c2 = MyGeomPanel.chkValidLine( idex );
		if( c1 && c2 )
			{
			if( SetAlg ) MyAlgPanel.chgLineHeight( idex , LineHeightFactor );
			if( SetGeom ) MyGeomPanel.chgLineHeight( idex , LineHeightFactor );
			}
			else
			{
			throw( new IllegalInputException( "You must select a valid line number." ) );
			}
		}


/**
* Gets the line height factor required for a particular mode, or
* -1.0 is no change should be performed.
*/
	protected double getParamFactorRequired( DrawObj in )
		{ return( getParamFactorRequired( in , KeyCurrentMode ) ); }


/**
* Gets the line height factor required for a particular mode, or
* -1.0 is no change should be performed.
*/
	protected double getParamFactorRequired( DrawObj in , int mode )
		{
		double ret = -1.0;


		if( in != null )
			{
			if( ( in instanceof Dsca1 ) || ( in instanceof Ssca1 ) )
			ret = 1.0; else ret = 2.0;
			if( OpExecuted ) ret = -1.0;
			}

		switch( mode )
			{
			case KeyStartMode:
				ret = -1.0;
				break;

			case KeyPasteMultiMode:
				ret = 2.0;
				break;
			}

		return( ret );
		}


/**
* Prints the bound depiction.
*/
	protected void printBoundDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintEvent ,
//			null , BoundDepicPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Print-previews the bound depiction.
*/
	protected void printPreviewBoundDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintPreviewEvent ,
//			null , BoundDepicPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Prints the free depiction.
*/
	protected void printFreeDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintEvent ,
//			null , FreeDepicPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Prints-previews the free depiction.
*/
	protected void printPreviewFreeDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintPreviewEvent ,
//			null , FreeDepicPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Prints the algebraic workspace.
*/
	protected void printAlgDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintEvent ,
//			null , MyAlgPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Prints the algebraic workspace.
*/
	protected void printPreviewAlgDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintPreviewEvent ,
//			null , MyAlgPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}



/**
* Prints the geometric workspace.
*/
	protected void printGeomDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintEvent ,
//			null , MyGeomPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Prints the geometric workspace.
*/
	protected void printPreviewGeomDepic( ) throws Throwable
		{
//		EtherEvent send = new StandardEtherEvent( this , StandardEtherEvent.objPrintPreviewEvent ,
//			null , MyGeomPanel );
//		ProgramDirector.fireEtherEvent( send , null );
		}


/**
* Sets whether the app. uses anti-alias.
*/
	public void setAntialiasValue( Paint in ) throws MathImageParseException
		{ super.setAntialiasValue( in ); MyAlgPanel.setAntialiasValue( in ); }

/**
* Sets the rendering quality of the app.
*/
//	public void setRenderValue( Object in ) throws MathImageParseException
//		{ super.setRenderValue( in ); MyAlgPanel.setRenderValue( in ); }


/**
* Sets the DGM node for thr cache depictor.
*/
	protected void setCacheDepicDGM( DGMNode in )
		{
		FreeDepicPanel.setParamOneDGM( in );
		}


/**
* Gets the DGMNode for thr cache depictor.
*/
	protected DGMNode getCacheDepicDGM( )
		{
		DGMNode MyDGM = FreeDepicPanel.getParamOneDGM();
		if( MyDGM == null )
			{
			MyDGM = new DGMNode();
			CoordContext MyCoord = KeyCacheDepic.makeCoordContext();
			KeyCacheDepic.updateYourself( FreeDepicPanel ,
				MyCoord , false , ToolMode.GEO_PAD_MODE );
			MyDGM.setMyCoord( MyCoord );
			MyDGM.setMyDraw( KeyCacheDepic );
			}

		return( MyDGM );
		}


	public Integer[] getInitialCols( )
		{ return( InitialCols ); }
	
	
	


	private transient Object toolObject;

	private static final EXparser MyParser = new EXparser();

	protected HighLevelList<StdLowLevelList<Meta<?>>,Meta<?>> CurPromptList = new HighLevelList<StdLowLevelList<Meta<?>>,Meta<?>>();
	protected DrawObj KeyCacheDepic = null;
	protected FlexString KeyCachePrompt = null;
	protected int KeyLastFill = 0;
	protected boolean LastBoxed = true;

	protected transient DrawObj LastClickDraw = null;
	protected transient DrawObj LastUserCreatedDepic = null;
	protected GeoPadKit BoundDepicPanel = null;
	protected GeoPadKit FreeDepicPanel = null;
	protected GeoPadAlgPanel MyAlgPanel;
	protected GeoPadGeomPanel MyGeomPanel;
	protected DrawObj CurUnitObj = null;
	protected DrawObj CurUnitCntObj = null;
	protected boolean AllowClickSelect = true;

	protected ClipSet Clipboard = new ClipSet();
	protected ClipSet ExprClipboard = new ClipSet();
	protected HighLevelList<StdLowLevelList<FlexString>,FlexString> ClipLHS = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();
	protected HighLevelList<StdLowLevelList<FlexString>,FlexString> ClipRHS = new HighLevelList<StdLowLevelList<FlexString>,FlexString>();

	private boolean UsingScalarWedge = true;

	int KeyCurrentOp = 0;
	int KeyCurrentMode = KeyStartMode;
	boolean OpExecuted = false;
	int KeyScriptMode = ScriptReplaceMode;
	boolean SetSingleDepicOnly = false;
	boolean UseMultiplier = false;

	protected Integer[] InitialCols = {
			Color.rgb( 116 , 149 , 0 ) ,
			Color.rgb( 153 , 0 , 153 ) ,
			Color.rgb( 128 , 128 , 0 ) ,
			Color.rgb( 165 , 99 , 0 ) ,
			Color.rgb( 192 , 64 , 0 ) ,
			Color.rgb( 0 , 153 , 153 ) ,
			Color.rgb( 0 , 0 , 153 ) ,
			Color.rgb( 153 , 153 , 255 )
			};

	}


