



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

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.Meta;
import verdantium.mathimage.MathImage;





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
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
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
* Node used by {@link GeoPadAlgPanel} to store the contents of a line
* of the algebraic workspace.
* @author Thorn Green
*/
	public class AlgNode extends Meta implements Externalizable
		{
/**
* Gets the MathImage that is displayed on the line.
*/
		public final MathImage getMathImage( )
			{ return( MyImage ); }
/**
* Sets the MathImage that is displayed on the line.
*/
		public final void setMathImage( MathImage in )
			{ MyImage = in; }
/**
* Gets the depictor associated with the line.
*/
		public final DrawObj getAlgDepics( )
			{ return( AlgDepics ); }
/**
* Sets the depictor associated with the line.
*/
		public final void setAlgDepics( DrawObj in )
			{ AlgDepics = in; }
/**
* Gets the height of the line divided by the default height.
*/
		public final double getLineHeightFactor( )
			{ return( LineHeightFactor ); }
/**
* Sets the height of the line divided by the default height.
*/
		public final void setLineHeightFactor( double in , boolean locked )
			{ 
			if( locked || !Locked ) LineHeightFactor = in;
			Locked = Locked || locked; 
			LineHeight = DefaultLineHeight * LineHeightFactor;
			LineEnd = LineStart + LineHeight; 
			}
/**
* Gets the vertical starting location of the line in pixel space.
*/
		public final double getLineStart( )
			{ return( LineStart ); }
/**
* Sets the vertical starting location of the line in pixel space.
*/
		public final void setLineStart( double in )
			{ LineStart = in; LineHeight = DefaultLineHeight * LineHeightFactor;
				LineEnd = LineStart + LineHeight; }
/**
* Gets the vertical ending location of the line in pixel space.
*/
		public final double getLineEnd( )
			{ return( LineEnd ); }
/**
* Gets the height of the line in pixels.
*/
		public final double getLineHeight( )
			{ return( LineHeight ); }
/**
* Gets whether the line is locked.
*/
		public final boolean getLocked( )
			{ return( Locked ); }
/**
* Sets whether the line is locked.
*/
		public final void setLocked( boolean in )
			{ Locked = in; }


		public void wake( )
			{ }


		static final long serialVersionUID = ( AlgNode.class ).getName().hashCode()
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

				MyImage = (MathImage)( myv.getProperty( "MyImage" ) );
				VersionBuffer.chkNul( MyImage );
				AlgDepics = (DrawObj)( myv.getProperty( "AlgDepics" ) );
				VersionBuffer.chkNul( AlgDepics );
				LineHeightFactor = myv.getDouble( "LineHeightFactor" );
				Locked = myv.getBoolean( "Locked" );

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

			myv.setProperty( "MyImage" , MyImage );
			myv.setProperty( "AlgDepics" , AlgDepics );
			myv.setDouble( "LineHeightFactor" , LineHeightFactor );
			myv.setBoolean( "Locked" , Locked );

			out.writeObject( myv ); */
			}


		private final static int DefaultLineHeight = 75;

		private double LineHeightFactor = 1.0;
		private double LineStart = 0;
		private double LineEnd = 0;
		private double LineHeight = 0;
		private boolean Locked = false;

		private DrawObj AlgDepics = null;
		private MathImage MyImage = null;
		}



