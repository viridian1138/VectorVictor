



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
import geomdir.DrawObjFactory;
import geomdir.IntObj;
import geomdir.Model;
import geomdir.Mvec;
import geomdir.ToolPort;
import geomdir.config.Config;
import geomdir.engine.EngineConstants;
import meta.FlexString;
import verdantium.utils.IllegalInputException;




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
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to underlying APIs used by class.                            | Modified class to be compliant with new APIs.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
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
* A model that supports educational applications.
* @author Thorn Green
*/
public class EduModel extends Model
	{

	public EduModel( ToolPort inT , String Configs , Config config )
		{
		super( inT , Configs , config );
		}

/**
* Used for serial storage purposes only.
*/
	public EduModel( )
		{
		super();
		}

/**
* Copies a depictor.
*/
	public void copyDepictor( DrawObj in )
		{
		if( in != null ) {
		DrawObjFactory MyFac = new DrawObjFactory( getTarget() , this );
		MyFac.setNewVectName( in.getVectName() );
		MyFac.setDepicClass( in , false );
		MyFac.createDepictor();
			}
		}


/**
* Gets whether the depictor is already constant so that the
* "Make Constant" command can perform the proper action.
*/
	public int getDepictorConstAction( DrawObj in )
		{
		int action = 0;

		if( in != null )
			{
			in.setValuePort( 1 );
			int val = in.portGetMovable().value;
			if( ( val & EngineConstants.MABLE_ASGN_MASK ) == 0 ) action = 1;
				else
				{
				FlexString InStr = new FlexString();
				FlexString OutStr = new FlexString();
				IntObj OutMode = new IntObj();

				in.getVectName().insertString( InStr );

				boolean bool = getMyEngine().getExprn( InStr , OutStr , OutMode );
				if( OutMode.value == EngineConstants.USER_MODE )
					action = 2;
				if( !bool ) System.out.println( "Inconsistent!!!!!!!!" );
				}
			}

		return( action );
		}

/**
* Changes whether a depictor is constant.
*/
	public void makeDepictorConstant( DrawObj in ) throws IllegalInputException
		{
		int sw = getDepictorConstAction( in );

		switch( sw )
			{
			case 0:
				throw( new IllegalInputException( "You must select a depictor in order to make it constant." ) );

			case 1:
				makeDepictorConstantFixed( in );
				break;

			case 2:
				eraseConstantDepictorConstraint( in );
				break;
			}
		}

/**
* Removes the constant constraint from the depictor.
*/
	protected void eraseConstantDepictorConstraint( DrawObj in )
		{
		if( in != null ) {
		FlexString NName = in.getVectName();
		FlexString Name = new FlexString();
		Name.setInsertPoint( 0 );
		Name.insertChar( '\'' );
		NName.insertString( Name );
		Name.insertChar( '\'' );
		boolean Err = deleteExpression( Name ,
			EngineConstants.USER_MODE );
		updateExpressionListeners();
		updateVariableListeners();
		globalRepaint();
			}
		}

/**
* Adds a constant constraint to the depictor.
*/
	protected void makeDepictorConstantFixed( DrawObj in )
		{
		if( in != null ) {
		in.setValuePort( 1 );
		Mvec MyV = in.portGetVect();
		String ExpStr = "( " + ( new Double( MyV.getBasis() ) ).toString() + " ) + "
			+ "( " + ( new Double( MyV.getBasis1() ) ).toString() + " ) * #1 + "
			+ "( " + ( new Double( MyV.getBasis2() ) ).toString() + " ) * #2 + "
			+ "( " + ( new Double( MyV.getBasis12() ) ).toString() + " ) * #12";
		FlexString Exp = new FlexString( ExpStr );
		FlexString NName = in.getVectName();
		FlexString Name = new FlexString();
		Name.setInsertPoint( 0 );
		Name.insertChar( '\'' );
		NName.insertString( Name );
		Name.insertChar( '\'' );
		boolean Err = changeExpression( Name , Exp ,
			EngineConstants.USER_MODE );
		updateExpressionListeners();
		updateVariableListeners();
		globalRepaint();
			}
		}


	public boolean isRebuildableDepic( DrawObj in )
		{ return( false ); }


	}



