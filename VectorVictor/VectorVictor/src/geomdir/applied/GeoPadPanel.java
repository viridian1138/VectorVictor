



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

import geomdir.GeomKit;
import verdantium.EtherEvent;
import verdantium.EtherEventHandler;
import verdantium.ProgramDirector;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;

public class GeoPadPanel {
	
	GeomKit tar;
	int ToolType = 0;

	protected boolean HPackage = false;


	int ViewDepicMode = 1;
	int ScriptMode = 2;
	int AlgebraMode = 1;
	int WorkMode = 1;
	boolean DimUnitVisible = true;
	boolean EditPanelOn = true;
	boolean ObjectPanelOn = true;
	boolean RayPanelOn = true;
	boolean OperatePanelOn = true;
	boolean MacroPanelOn = true;
	boolean ComparePanelOn = true;
	boolean OrderPanelOn = true;


	
	/**
	* Gets the target at which to fire scripting events.
	*/
	protected EtherEventHandler getScriptTarget( )
		{
		return( tar /* !!!! (EtherEventHandler)( target.getTopObj() ) */ );
		}
	
	public void setScriptTarget( GeomKit in ) // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	{ // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		tar = in; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	} // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	

	/**
	* Handles Undo.  Not implemented.
	*/
		public void geoPadHandleUndo( View e )
			{ System.out.println( "GeoPadHandleUndo..." ); }

	/**
	* Handles Extract.
	*/
		public void geoPadHandleExtract( View e )
			{
			try
				{
				EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.extractKey ,
					null , getScriptTarget() );
				ProgramDirector.fireEtherEvent( send , null );
				}
			catch( Throwable ex )
				{ handleThrow( ex ); }
			}
		
		
		/**
		* Handles Copy.
		*/
			public void geoPadHandleCopy( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.copyKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Delete.
		*/
			public void geoPadHandleDelete( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.deleteKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Paste.
		*/
			public void geoPadHandlePaste( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.pasteKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* *********** */

		/**
		* Handles adding a new scalar.
		*/
			public void geoPadHandleScalar( View e )
				{ 
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createScalar ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles adding a new vector.
		*/
			public void geoPadHandleVector( View e )
				{ 
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createVector ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles adding a new phasor.
		*/
			public void geoPadHandlePhasor( View e )
				{ 
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createPhasor ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles adding a new bivector.
		*/
			public void geoPadHandleBivector( View e )
				{ 
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createBivector ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles the "Select" button.
		*/
			public void geoPadHandleSelect( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.selectKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Left Parenthesis.
		*/
			public void geoPadHandleLeftParen( View e )
				{
				try
					{
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.leftParenKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Right Parenthesis.
		*/
			public void geoPadHandleRightParen( View e )
				{
				try
					{
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.rightParenKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Zero.
		*/
			public void geoPadHandleZero( View e )
				{
				try
					{
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.digitKey ,
						null , getScriptTarget() );
					send.setParameter( new Integer( 0 ) );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles One.
		*/
			public void geoPadHandleOne( View e )
				{
				try
					{
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.digitKey ,
						null , getScriptTarget() );
					send.setParameter( new Integer( 1 ) );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles changing the label visibility.
		*/
			public void geoPadHandleLabel( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.changeLabelState ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles creating a ray.
		*/
			public void geoPadHandleRay( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createRay ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles creating a line.
		*/
			public void geoPadHandleLine( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createLine ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* *********** */

		/**
		* Handles Binary Plus.
		*/
			public void geoPadHandlePlus( View e )
				{ keyHandleNewOp( EXsym.plus ); }

		/**
		* Handles Binary Minus.
		*/
			public void geoPadHandleMinus( View e )
				{ keyHandleNewOp( EXsym.minus ); }

		/**
		* Handles Unary Plus.
		*/
			public void geoPadHandleBoxPlus( View e )
				{ keyHandleNewOp( EXsym.boxPlus ); }

		/**
		* Handles Unary Minus.
		*/
			public void geoPadHandleBoxMinus( View e )
				{ keyHandleNewOp( EXsym.boxMinus ); }

		/**
		* Handles Times (e.g. Multiplication).
		*/
			public void geoPadHandleTimes( View e )
				{ keyHandleNewOp( EXsym.prod ); }

		/**
		* Handles Absolute Value.
		*/
			public void geoPadHandleAbs( View e )
				{ keyHandleNewOp( EXsym.magnitude ); }

		/**
		* Handles the simplify button.  Not implemented.
		*/
			public void geoPadHandleSimp( View e )
				{ System.out.println( "GeoPadHandleSimp..." ); }

		/**
		* Handles Assigmnent.
		*/
			public void geoPadHandleAssign( View e )
				{ keyHandleNewOp( EXsym.assign ); }

		/**
		* Handles the "Control" button.  Not implemented.
		*/
			public void geoPadHandleControl( View e )
				{ System.out.println( "GeoPadHandleControl..." ); }

			/* ************ */

		/**
		* Handles Division.
		*/
			public void geoPadHandleDiv( View e )
				{ geoPadHandleDiv( e , false ); }

		/**
		* Handles Division.
		*/
			public void geoPadHandleDiv( View e , boolean Simp )
				{ keyHandleNewOp( EXsym.div ); }

		/**
		* Handles Inverse.
		*/
			public void geoPadHandleInv( View e )
				{ keyHandleNewOp( EXsym.inverse ); }

		/**
		* Handles Square.
		*/
			public void geoPadHandleSqr( View e )
				{ keyHandleNewOp( EXsym.square ); }

		/**
		* Handles Power Function.
		*/
			public void geoPadHandlePower( View e )
				{ keyHandleNewOp( EXsym.power ); }

			/* ************ */

		/**
		* Handles Comparison.
		*/
			public void geoPadHandleCompare( View e )
				{ keyHandleNewOp( EXsym.compare ); }

		/**
		* Handles the "Constrain" key.
		*/
			public void geoPadHandleConst( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.constrainKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			
		/**
		* Handles the creation of a ruler without negative.
		*/
			public void geoPadHandleRuler( View e )
				{
				try
				{
					String sarg = "";
					Object[] arg = { new Boolean( false ) , sarg };
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createRuler ,
							null , getScriptTarget() );
					send.setParameter( arg );
					getScriptTarget().processObjEtherEvent( send , null );
				}
			catch( Throwable ex )
				{ handleThrow( ex ); }
				}
			
			
			/**
			* Handles the creation of a ruler with negative.
			*/
				public void geoPadHandleRulerWithNegative( View e )
					{
					try
					{
						String sarg = "";
						Object[] arg = { new Boolean( true ) , sarg };
						EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createRuler ,
								null , getScriptTarget() );
						send.setParameter( arg );
						getScriptTarget().processObjEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
					}

				
		/**
		* Handles creation of the unit dialog.
		*/
			public void geoPadHandleUnit( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createUnitDialog ,
						null , getScriptTarget() );
					getScriptTarget().processObjEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* ************ */

		/**
		* Handles Equal.  Not implemented
		*/
			public void geoPadHandleEqual( View e )
				{ System.out.println( "GeoPadHandleEqual..." ); }

		/**
		* Handles less than.  Not implemented
		*/
			public void geoPadHandleLess( View e )
				{ System.out.println( "GeoPadHandleLess..." ); }

		/**
		* Handles greater than.  Not implemented
		*/
			public void geoPadHandleGreater( View e )
				{ System.out.println( "GeoPadHandleGreater..." ); }

		/**
		* Handles less than or equal.  Not implemented.
		*/
			public void geoPadHandleLessEq( View e )
				{ System.out.println( "GeoPadHandleLessEq..." ); }

		/**
		* Handles greater than or equal.  Not implemented.
		*/
			public void geoPadHandleGreaterEq( View e )
				{ System.out.println( "GeoPadHandleGreaterEq..." ); }

		/**
		* Handles logical or.  Not implemented.
		*/
			public void geoPadHandleOr( View e )
				{ System.out.println( "GeoPadHandleOr..." ); }

		/**
		* Handles logical and.  Not implemented.
		*/
			public void geoPadHandleAnd( View e )
				{ System.out.println( "GeoPadHandleAnd..." ); }

		/**
		* Handles an operator.
		*/
			public void keyHandleNewOp( int OpId )
				{
				try
					{
					Object[] arg = { new Integer( OpId ) };
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.operatorKey ,
						arg , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}


			/* ************* */

		/**
		* Handles realignment of the geometric workspace.
		*/
			public void geoPadHandleRealignGeom( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.realignGeom ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* ************* */

		/**
		* Handles a request to change the background.
		*/
//			public void geoPadHandleBkgndChg( View e )
//				{
//				try
//					{
//					String arg = ( (JGMenuItem)( e.getSource() ) ).getText();
//					EtherEvent send = new GeomKitEtherEvent( this , GeomKitEtherEvent.requestBkgndChg ,
//						null , getScriptTarget() );
//					send.setParameter( arg );
//					ProgramDirector.fireEtherEvent( send , null );
//					}
//				catch( Throwable ex )
//					{ handleThrow( ex ); }
//				}


			/* ************* */

		/**
		* Handles a request to change the color scheme.
		*/
//			public void geoPadHandleSchemeChg( View e )
//				{
//				try
//					{
//					String arg = ( (JGMenuItem)( e.getSource() ) ).getText();
//					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestSchemeChg ,
//						null , getScriptTarget() );
//					send.setParameter( arg );
//					ProgramDirector.fireEtherEvent( send , null );
//					}
//				catch( Throwable ex )
//					{ handleThrow( ex ); }
//				}


			/* ************* */

		/**
		* Handles the pressing of the backspace key.
		*/
		public void geoPadHandleBackspace( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.backspaceKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* ************* */

		/**
		* Handles the toggling of the multiplier.
		*/
		public void geoPadHandleToggleMultiplier( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.toggleMultiplier ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

			/* ************* */

		/**
		* Handles the centering of the line.
		*/
		public void geoPadCenterLine( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.centerCurrentLine ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}


		/**
		* Handles a display mode change.
		*/
//			public void handleScriptOp( View e )
//				{
//				try
//					{
//					JGRadioButtonMenuItem in = (JGRadioButtonMenuItem)( e.getSource() );
//					int id = in.getTag();
//					ScriptMode = id;
//					Integer arg = new Integer( id );
//					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.scriptModeChg ,
//						null , getScriptTarget() );
//					send.setParameter( arg );
//					ProgramDirector.fireEtherEvent( send , null );
//					}
//				catch( Throwable ex )
//					{ handleThrow( ex ); }
//				}


		/**
		* Handles a change in the drag/display mode.
		*/
/*			public void handleModeChangeOp( View e )
				{
				try
					{
					JGMenuItem in = (JGMenuItem)( e.getSource() );
					int id =in.getTag();
					ViewDepicMode = id;

					switch( id )
						{
						case 1:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestDragMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 2:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestPropertiesMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 3:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestFreeTransformationMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 4:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestTranslateMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 5:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestRotateMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 6:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestDilateMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 7:
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.requestLabelMode ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;
						}

					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				} */


		/**
		* Handles an algebra mode change.
		*/
//			public void handleAlgebraOp( View e )
//				{
//				JGRadioButtonMenuItem in = (JGRadioButtonMenuItem)( e.getSource() );
//				int id = in.getTag();
//				AlgebraMode = id;
//				}
			
	
	/**
	* Handles a key press.
	*/
		public boolean dispatchKeyboardOP( int keyCodeNonUnicode, KeyEvent e )
		{
			try
				{
				int keyCode = (int)( e.getUnicodeChar() );
				boolean AltMod = e.isAltPressed();

				/* System.out.println( e ); */

				if( /* ( e.getID() == KeyEvent.KEY_PRESSED ) && !( e.getComponent() instanceof JScrollCanvas ) */ true )
				{
				switch( keyCode )
					{
					case (int)( '+' ):
						if( AltMod ) geoPadHandleBoxPlus( null );
							else geoPadHandlePlus( null );
						break;

					case (int)( '-' ):
						if( AltMod ) geoPadHandleBoxMinus( null );
							else geoPadHandleMinus( null );
						break;

					case (int)( '*' ):
						geoPadHandleTimes( null );
						break;

					case (int)( '/' ):
						geoPadHandleDiv( null );
						break;

					case (int)( '|' ):
						geoPadHandleAbs( null );
						break;

					case (int)( ':' ):
						geoPadHandleAssign( null );
						break;

					case (int)( '(' ):
						geoPadHandleLeftParen( null );
						break;

					case (int)( ')' ):
						geoPadHandleRightParen( null );
						break;

					case (int)( '0' ):
						geoPadHandleZero( null );
						break;

					case (int)( '1' ):
						geoPadHandleOne( null );
						break;

					case (int)( '=' ):
						geoPadHandleEqual( null );
						break;

					case (int)( '<' ):
						geoPadHandleLess( null );
						break;

					case (int)( '>' ):
						geoPadHandleGreater( null );
						break;

					/* case (int)( '^' ):
						geoPadHandleAnd( null );
						break; */

					case (int)( ';' ):
						geoPadHandleNextLine( null );
						break;

					case (int)( '.' ):
						geoPadHandlePeriod( null );
						break;

					case (int)( ' ' ):
						if( AltMod )
							{
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.toggleAllowClickSelect ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
						break;

					case (int)( '%' ):
						if( AltMod )
							{
							System.out.println( "Handle Single Depic Only" );
							EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.singleDepicOnly ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
						break;

					case 17:
						geoPadHandleRealignGeom( null );
						break;

					case 8:
						geoPadHandleBackspace( null );
						break;

					case 20:
						geoPadHandleToggleMultiplier( null );
						break;

					case 25:
						geoPadCenterLine( null );
						break;

					default:
						return( handleOtherKeys( keyCode , e ) );
						// break;
					}
					}
				}
			catch( Throwable ex )
				{ handleThrow( ex ); }
			return( true );
			}
		
		
		/**
		* Handles a request to go to the next line.
		*/
			public void geoPadHandleNextLine( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.nextLineKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles Period.
		*/
			public void geoPadHandlePeriod( View e )
				{
				try
					{
					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.periodKey ,
						null , getScriptTarget() );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}

		/**
		* Handles opening the "file" on a variable.
		*/
			public void geoPadHandleVarFile( View e )
				{
				try
					{
					EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createVarFile ,
						null , getScriptTarget() );
					getScriptTarget().processObjEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}


		/**
		* Handles alphanumeric keys.
		*/
			public boolean handleOtherKeys( int keyCode, KeyEvent e )
				{
				try
					{
					char c = (char)( keyCode );
					boolean VarEvt = false;

					if( ( c >= 'a' ) && ( c <= 'z' ) )
						VarEvt = true;

					if( ( c >= 'A' ) && ( c <= 'Z' ) )
						{
						VarEvt = true;
						c = (char)( c + ( 'a' - 'A' ) );
						}

					if( VarEvt ) 
						{
						EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.keyVar ,
							null , getScriptTarget() );
						send.setParameter( new Character( c ) );
						ProgramDirector.fireEtherEvent( send , null );
						}

					if( ( c >= '0' ) && ( c <= '9' ) )
						geoPadHandleDigit( c );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				return( true );
				}

		/**
		* Handles digits.
		*/
			public void geoPadHandleDigit( char in )
				{
				try
					{
					int num = (int)( in ) - (int)( '0' );

					EtherEvent send = new FastSuiEtherEvent( this , FastSuiEtherEvent.digitKey ,
						null , getScriptTarget() );
					send.setParameter( new Integer( num ) );
					ProgramDirector.fireEtherEvent( send , null );
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				}


		/**
		* Handles a Geom menu operation.
		*/
/*			public void handleGeomOp( View e )
				{
				try
					{
					String arg = ( (JGMenuItem)( e.getSource() ) ).getText();

					switch( ( (JGMenuItem)( e.getSource() ) ).getTag() )
						{	

						case 1:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.toggleAntialias ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 2:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.toggleRenderQuality ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 3:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.setRigorousClipping ,
								null , tar );
							send.setParameter( new Boolean( true ) );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 4:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.setRigorousClipping ,
								null , tar );
							send.setParameter( new Boolean( false ) );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 5:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.globalSynchDepth ,
								null , tar );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 6:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.createLineHeightDialog ,
								null , getScriptTarget() );
							getScriptTarget().processObjEtherEvent( send , null );
							}
							break;

						case 7:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.proportionOp ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;
			
						case 8:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.traceGraphOp ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 9:
							{
							keyHandleNewOp( EXsym.sqrt );
							}
							break;

						case 10:
							{
							keyHandleNewOp( EXsym.exp );
							}
							break;

						case 11:
							{
							keyHandleNewOp( EXsym.dot );
							}
							break;

						case 12:
							{
							keyHandleNewOp( EXsym.cross );
							}
							break;

						case 13:
							{
							keyHandleNewOp( EXsym.wedge );
							}
							break;

						case 14:
							{
							keyHandleNewOp( EXsym.ScalGradPart );
							}
							break;

						case 15:
							{
							keyHandleNewOp( EXsym.ImagGradPart );
							}
							break;

						case 16:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.sineDiag ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 17:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.cosineDiag ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 18:
							{
							EtherEvent send = new SuiEtherEvent( this , 
								SuiEtherEvent.bezierKey ,
								null , getScriptTarget() );
							ProgramDirector.fireEtherEvent( send , null );
							}
							break;

						case 19:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.requestSymbolDel ,
								null , tar );
							send.setParameter( arg );
							tar.processObjEtherEvent( send , null );
							}
							break;

						case 20:
							{
							EtherEvent send = new GeomKitEtherEvent( this , 
								GeomKitEtherEvent.requestSymbolEdit ,
								null , tar );
							send.setParameter( arg );
							tar.processObjEtherEvent( send , null );
							}
							break;
						}

					tar.repaint();
					}
				catch( Throwable ex )
					{ handleThrow( ex ); }
				} */


		/**
		* Handles a request to make a depictor with a predefined name.
		*/
/*			public void handleNamedDepic( View e )
				{
				String arg = ( (JGMenuItem)( e.getSource() ) ).getText();

				switch( ( (JGMenuItem)( e.getSource() ) ).getTag() )
					{

					case 1:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>F</BT></BOX><SUB>N</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 2:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>F</BT></BOX><SUB>g</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 3:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>F</BT></BOX><SUB>f</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 4:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>F</BT></BOX><SUB>s</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 5:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>F</BT></BOX><SUB>T</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 6:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>v</BT></BOX><SUB>0</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 7:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>x</BT></BOX><SUB>0</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 8:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB>i</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 9:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB>f</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 10:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>f</BOX><SUB>1</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 11:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>f</BOX><SUB>2</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 12:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>f</BOX><SUB>3</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 13:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>f</BOX><SUB>4</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 14:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>i</BOX><SUB>1</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 15:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>P</BT></BOX><SUB><T><BOX>i</BOX><SUB>2</SUB></T></SUB></T>'" 
							, "Vector" );
						}
						break;

					case 16:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>E</BT></BOX><SUB>1</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 17:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>E</BT></BOX><SUB>2</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 18:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>E</BT></BOX><SUB>3</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 19:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>B</BT></BOX><SUB>1</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 20:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>B</BT></BOX><SUB>2</SUB></T>'" 
							, "Vector" );
						}
						break;

					case 21:
						{
						sendAddNamedDepictorOp(
							"'<T><BOX><BT>B</BT></BOX><SUB>3</SUB></T>'" 
							, "Vector" );
						}
						break;

					}

				tar.repaint();
				} */


		/**
		* Handles a menu request to create a depictor.
		*/
/*			public void handleDepicCreate( View e )
				{
				String arg = ( (JGMenuItem)( e.getSource() ) ).getText();

				switch( ( (JGMenuItem)( e.getSource() ) ).getTag() )
					{

					case 1:
						{
						geoPadHandleScalar( e );
						}
						break;

					case 2:
						{
						geoPadHandleVector( e );
						}
						break;

					case 3:
						{
						geoPadHandlePhasor( e );
						}
						break;

					case 4:
						{
						geoPadHandleBivector( e );
						}
						break;

					}

				tar.repaint();
				} */


		/**
		* Requests that the system create a depictor with a certain name and type.
		*/
		public void sendAddNamedDepictorOp( String Name , String Type )
			{
			try
				{
				EtherEvent send = new SuiEtherEvent( this , SuiEtherEvent.createNamedDepic ,
					null , tar );
				Object[] param = { Name , Type };
				send.setParameter( param );
				ProgramDirector.fireEtherEvent( send , null );
				}
			catch( Throwable ex )
				{ handleThrow( ex ); }
			}
		
		
		public void handleThrow( Throwable ex )
		{
			Log.e("tag", "msg", ex);
		}



}
