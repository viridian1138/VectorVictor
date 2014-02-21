





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






package geomdir;

import java.beans.PropertyChangeListener;

import meta.FlexString;
import verdantium.EtherEventHandler;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.mathimage.SymMap;
import verdantium.mathimage.SymbolHolder;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

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
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Origin changes not supported at the depictor level.                  | Added methods to support origin changes.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/13/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Switched OrderedList classes to JCF.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Removed some methods to support more depictors.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Some operations are not compatible with BlueToh.                     | Improved compatibility.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 08/07/2004            | Thorn Green (viridian_1138@yahoo.com)           | Establish baseline for all changes in the last year.                 | Establish baseline for all changes in the last year.
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
* Provides a standard interface for a depictor, or other client,
* to talk to the model view that is displaying it.  This provides
* depictors with several public methods in order to control coordinate
* transformations, reduce redundant code in depictors, provide utility
* routines to simplify the coding of depictors, and provide elements of
* a common look and feel among depictors which can be altered through
* DepictorPort without breaking existing depictional implementations.
* @author Thorn Green
*/
public interface DepictorPort extends EtherEventHandler, SymbolHolder, GeomConstants {

	/**
	* Creates the equation image specified in a markup language by <code>ins</code>.
	*/
	// public Image makeDepicImage(String ins, Integer col, int PtSz);
	/**
	* Creates a MathImage object as specified by the markup string <code>ins</code>.
	*/
	public MathImage makeDepicMathImage(String ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException;
	/**
	* Paints an orange control knob at location (x,y).
	*/
	public void paintOrangeKnob(Canvas g, Paint p, double x, double y);
	/**
	* Paints a blue control knob at location (x,y).
	*/
	public void paintBlueKnob(Canvas g, Paint p, double x, double y);
	/**
	* Paints a colored control knob at location (x,y).
	*/
	public void paintColorKnob(Canvas g, Paint p, Integer c, double x, double y);
	/**
	* Returns a rectangle centered at (x,y) which is the size of a standard control knob.
	*/
	public RectF instanceRect(double x, double y);
	/**
	* Returns the standard gravity field value of a mouse-point p from a control knob at (x,y).
	*/
	public double defaultGravityField(PointF p, double x, double y);
	/**
	* Draws a standard version of a vector with arrowhead.  The kit that implements this interface
	* can change how a vector looks by changing the implementation of this method.
	*/
	public void externArrow(Canvas g, Paint p, DrawObj caller, Hexar HDhex, Hexar TLhex, GeomConstants.ToolMode toolMode );
	/**
	* Loads the persistent properties of a multivector.
	*/
	// public void loadMvecProperties(VTextProperties in, String key, Mvec chg) throws DataFormatException;
	/**
	* Saves the persistent properties of a multivector.
	*/
	// public void saveMvecProperties(VTextProperties in, String key, Mvec chg);
	/**
	* Gets the prefix key at which the depictor can save its properties.
	*/
	public String getPersistencePrefix(DrawObj in);
	/**
	* Registers a port constraint as persistent.
	*/
	// public void registerPersistentConstraint(VTextProperties MyProp, FlexString ConstraintName);
	/**
	* Gets a new "initial value" vector for a depictor.
	*/
	public void setNewDeltaVec(DrawObj depic, Mvec in);
	/**
	* Gets a new "initial value" for a vector-like representation of a phasor.
	*/
	public void setNewDeltaPhas(DrawObj depic, Mvec in);
	/**
	* Gets a new "initial position" for a depictor.  Used for setting something
	* such as the position of a vector's tail.  Note that it is undesirable for
	* every new depictor to be allocated at exactly the same place because this would
	* put multiple depictors directly on top of each other, and force the user to
	* space them out.  As a result, setNewPosAVec() and setNewPosBVec() usually set slightly
	* different positions each time they are called so that the depictors have enough
	* cushion between them to tell them apart on the screen.
	*/
	public void setNewPosAVec(DrawObj depic, Mvec in);
	/**
	* Gets a new "initial position" for a port on a depictor that is different from
	* the initial depictor position.
	*/
	public void setNewPosBVec(DrawObj depic, Mvec in);
	/**
	* Performs a local to global coordinate conversion.
	*/
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Hexar hex);
	/**
	* Performs a local to global coordinate conversion.
	*/
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Mvec glo, Hexar hex);
	/**
	* Performs a global to local coordinate conversion.
	*/
	public void hexloc(Mvec cntr, boolean bound, Hexar hex);
	/**
	* Performs a global to local coordinate conversion.
	*/
	public void hexloc(Mvec cntr, boolean bound, Mvec glo, Hexar hex);
	/**
	* Gets a reference to the unit angle for the scalar twist dial depiction.
	*/
	public IntObj getRealAng();
	/**
	* Gets a reference to the unit angle for the imaginary twist dial depiction.
	*/
	public IntObj getImAng();
	/**
	* Gets a reference to the unit height for the scalar bargraph depiction.
	*/
	public IntObj getRealBar();
	/**
	* Gets a reference to the unit height for the imaginary bargraph depiction.
	*/
	public IntObj getImBar();
	/**
	* Gets the radius of the coordinate system.
	*/
	public double getCoordRad();
	/**
	* Sets the radius of the coordinate system.
	*/
	public void setCoordRad(double in);
	/**
	* Gets the X-Origin of the coordinate system.
	*/
	public IntObj getXOrigin();
	/**
	* Gets the Y-Origin of the coordinate system.
	*/
	public IntObj getYOrigin();
	/**
	* Gets the standard "cyan" color.
	*/
	public Integer getCyanIndex();
	/**
	* Gets the standard "magenta" color.
	*/
	public Integer getMagentaIndex();
	/**
	* Returns whether the geometry view is displaying controls for advanced users.
	*/
	public boolean getAdvancedControls();
	/**
	* Adds a property change listener.
	*/
	public void addPropertyChangeListener(PropertyChangeListener in);
	/**
	* Removes a property change listener.
	*/
	public void removePropertyChangeListener(PropertyChangeListener in);
	/**
	* Gets the list of defined symbols from the model.
	*/
	public SymMap getGloSymMap();
	/**
	* Gets the default font used for depictors.
	*/
	public Paint getDepictorFont();
	/**
	* Gets the identity of the geometry kit using the depictor.
	*/
	public int getGeomKitType();
	/**
	* Creates a DynRunner.
	*/
	public DynRunner createDynRunner();
	/**
	* Creates a DynRunner, which may need to handle coordinates in a bound depiction.
	*/
	public DynRunner createDynRunner(boolean bound, Mvec Pt);
	/**
	* Creates a DynRunner for a one-shot action.
	*/
	public DynRunner createOneShotDyn();
	/**
	* Executes a one-shot dyn created by createOneShotDyn().
	*/
	public boolean executeOneShotDyn(DynRunner in);
	/**
	* Converts a formatted array to an expression string.
	*/
	public void insertFormattedString(Object[] in, FlexString out);
	/**
	* Adds an implicit constraint about the depictor to the global constraint system.
	* This enforces a constraint such as requiring two vectors to be parallel.
	* Note: this kind of constraint can only be enforced by a "smart" solver.
	*/
	public boolean addImplicitConstraint(Object[] LHS, Object[] RHS, DrawObj in, int FID);
	/**
	* Handles the adjustment of the unit size by a depictor.
	*/
	public void handleCoordAdjust(DrawObj InDrw, boolean ChgDelta, boolean activeAdjust);
	/**
	* Gets the standard path visually describing the arrowhead of a vector.
	*/
	public Path getArrowheadPath();
}
