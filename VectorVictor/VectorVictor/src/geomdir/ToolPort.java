



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

import java.util.HashMap;

import meta.FlexString;
import meta.HighLevelList;
import meta.StdLowLevelList;
import verdantium.core.BackgroundListener;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.utils.IllegalInputException;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Rect;
import android.view.MotionEvent;
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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed ToolPort to support the new clustering.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | New user interface to support online help.                           | Changed the port API to support the new interface.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | User interface simplification.                                       | Removed unit twistor entry from Geom menu.
*    | 01/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | Move SystemTime to own depictor.                                     | Moved SystemTime to own depictor.
*    | 03/16/2003            | Thorn Green (viridian_1138@yahoo.com)           | ObjectPC did not use defaultClassLoader.                             | Moved defaultClassLoader into Meta to fix this.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
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
* Provides a common set of operations for all tools that act
* on a model view.
* @author Thorn Green
*/
public interface ToolPort extends DepictorPort, BackgroundListener {

	final static int ManualDragRad = 1;
	final static int ManualDragOrigin = 2;
	final static int ManualDragRealAng = 3;
	final static int ManualDragImAng = 4;
	final static int ManualDragXAxis = 5;
	final static int ManualDragYAxis = 6;
	final static int DisplayControls = 7;
	final static int ManualDragRealBar = 8;
	final static int ManualDragImBar = 9;

	public final static String ToolPortLocalTargetChanged = "ToolPortLocalTargetChanged";
	public final static String ToolPortLocalPrevToolMode = "ToolPortLocalPrevToolMode";
	public final static String ToolPortLocalDepicMode = "ToolPortLocalDepicMode";
	public final static String ToolPortLocalDisplayControlMode = "ToolPortLocalDisplayControlMode";
	public final static String ToolPortLocalAdvMode = "ToolPortLocalAdvMode";

	/**
	* Recalculates all values in the system using the geometry engine.
	*/
	public void engineResolveConstraints();
	/**
	* Gets the tool mode of the view.
	*/
	public int getPrevToolMode();
	/**
	* Gets the X-coordinate position of the origin of the view.
	*/
	public IntObj getXOrigin();
	/**
	* Gets the Y-coordinate position of the origin of the view.
	*/
	public IntObj getYOrigin();
	/**
	* Gets the radius of the unit twist control dial.
	*/
	public IntObj getArcToolRad();
	/**
	* Gets the height in pixels of the unit scalar bargraph.
	*/
	public IntObj getRealBar();
	/**
	* Gets the height in pixels of the unit imaginary bargraph.
	*/
	public IntObj getImBar();
	/**
	* Gets the unit angle for the twist dial scalar control.
	*/
	public IntObj getRealAng();
	/**
	* Gets the unit angle for the twist dial imaginary control.
	*/
	public IntObj getImAng();
	/**
	* Gets the default image for "Sigma 1".
	*/
	public MathImage getIxImg();
	/**
	* Gets the default image for "Sigma 2".
	*/
	public MathImage getIyImg();
	/**
	* Gets the type of origin displayed.
	*/
	public int getOriginType();
	/**
	* Gets the orientation of the GCS with respect to local
	* coordinates.
	*/
	public double[][] getAxes();
	/**
	* Gets the display list of the view.
	*/
	public HighLevelList<StdLowLevelList<DGMNode>,DGMNode> getDispList();
	/**
	* Gets whether the last mouse-down event was matched by some control.
	*/
	public int getLastClick();
	/**
	* Gets the time at which the last mouse-down event orcurred.
	*/
	public long getMouseDownTime();
	/**
	* Gets the numeric type associated with the drag operation.
	*/
	public int getDragType();
	/**
	* Gets whether the view is a bound-depiction view.
	*/
	public boolean getBoundMode();
	/**
	* Causes the view to store information that will allow it to undo a
	* drag event on a depictor.
	*/
	public void pushUndoObjChg(DrawObj in);
	/**
	* Sets the numeric type associated with the drag operation.
	*/
	public void setDragType(int in);
	/**
	* Sets whether the last mouse-down event matched some control point.
	*/
	public void setLastClick(int in);
	/**
	* Causes the view to store information that will allow it to undo changes
	* in the coordinate system.
	*/
	public void pushUndoOrgChg();
	/**
	* Causes the model to store infromation that will allow it to undo
	* the creation or deletion of a symbol.
	*/
	public void pushUndoSymChg();
	/**
	* Updates all objects listening for a change in the set of variables.
	*/
	public void updateVariableListeners();
	/**
	* Updates all obejcts listening for a change in the set of assignment expressions.
	*/
	public void updateExpressionListeners();
	/**
	* Gets an reference to whether the assignment arrow will be painted
	* using the "active" color.
	*/
	public IntObj getActive();
	/**
	* If the last attempt to change or delete an expression produced an error,
	* retrieves the error code.
	*/
	public int getErrCode();
	/**
	* Repaints the view.
	*/
	public void invalidate(); // postInvalidate()
	/**
	* Causes the view to create information that will allow it to undo a color
	* or property change on the
	* depictor <code>in</code>.
	*/
	public void pushUndoColorChange(DrawObj in);
	/**
	* Gets the bounds of the view.
	*/
	public Rect bounds();
	/**
	* Gets the list of all variables.
	*/
	public DGPHashMap getVarList();
	/**
	* Deletes an assignment expression associated with a particular variable name.
	*/
	public boolean deleteExpression(FlexString VarName, int MyMode);
	/**
	* Adds or changes an assignment expression.
	*/
	public boolean changeExpression(FlexString VarName, FlexString ExpressionString, int MyMode);
	/**
	* Causes the model to create information that will allow it to undo the deletion of the
	* depictor <code>in</code>.
	*/
	public void pushUndoDeleteDepic(DrawObj in);
	/**
	* Creates a dialog that allows the user to create a depictor for a named mode,
	* otherwise creates a non-named depictor.
	*/
	public void addDepiction(DrawObjFactory MyFac, int altMode) throws IllegalInputException;
	/**
	* Removes a depictor from the rendering list.
	*/
	public DGMNode pullFromDrawingList(DrawObj MyObj);
	/**
	* Sends a depictor to the front of the rendering in all views.  This
	* means that the depictor will be rendered last.
	*/
	public void bringToFront(DrawObj MyObj);
	/**
	* Sends a depictor to the back of the rendering in all views.  This
	* means that the depictor will be rendered first.
	*/
	public void sendToBack(DrawObj MyObj);
	/**
	* Repaints all views.
	*/
	public void globalRepaint();
	/**
	* Instructs the model view to prepare for a drag operation.  The parameter indicates
	* whether the results of the drag operation will affect all views.
	*/
	public void setUpDrag(boolean GlobalUpdate);
	/**
	* Sets the coordinate context of the depictor to be dragged.
	*/
	public void setDragContext(DGMNode Node1);
	/**
	* Deletes a depictor.  Note: make sure that the noSymBindings() method on the depictor
	* returns true before attempting to delete it with this method.
	*/
	public boolean deleteDepictor(DrawObj SelDrw);
	/**
	* Sets the last depictor clicked using the mouse.
	*/
	public void setLastClickDepic(DrawObj InDrw);
	/**
	* Draws a labeled vector arrow.
	*/
	public void arrow(Canvas g, Integer TextColor, RectF line, MathImage img);
	/**
	* Draws a labeled linear segment.
	*/
	public void linearSeg(Canvas g, Integer TextColor, RectF line, MathImage img);
	/**
	* Gets whether the view is displaying the assignment arrow.
	*/
	public boolean getDraggingAssign();
	/**
	* Sets whether the view is displaying the assignment arrow.
	*/
	public void setDraggingAssign(boolean in);
	/**
	* Gets the starting point of the assignment arrow.
	*/
	public PointF getStPt();
	/**
	* Sets the starting point of the assignment arrow.
	*/
	public PointF getCrPt();
	/**
	* Gets the standard grey color used.
	*/
	public Integer getGreyIndex();
	/**
	* Gets the standard green color used.
	*/
	public Integer getGreenIndex();
	/**
	* Gets the position of the view over the entire scrolling space.
	*/
	public PointF getViewPosition();
	/**
	* Gets the visible rectangle of the view getVisibleRect() .
	*/
	public void retVisibleRect( Rect in );
	/**
	* Signals the start of adjustments to the coordinate system by a depictor.
	*/
	public void startCoordAdjust();
	/**
	* Signals the end of adjustments to the coordinate system by a depictor.
	*/
	public void endCoordAdjust();
	/**
	* Returns whether all display controls are to be shown.
	*/
	public boolean getDisplayControlsShown();
	/**
	* Gets the antialias object.
	*/
	public Paint getAntialiasValue();
	/**
	* Sets the antialias object.
	*/
	public void setAntialiasValue(Paint in) throws MathImageParseException;
	/**
	* Gets the rendering quality obejct.
	*/
//	public Object getRenderValue();
	/**
	* Sets the rendering quality object.
	*/
//	public void setRenderValue(Object in) throws MathImageParseException;

	/**
	* Create a new DrawObjFactory for the view.
	*/
	public DrawObjFactory createDrawObjFactory();

	/**
	* Fires a property change event.
	*/
	public void firePropertyChg(String evt, Object oldVal, Object newVal);

	/**
	* Gets the current target ToolDisplay.
	*/
	public ToolPort getTarget();
	/**
	* Gets the mode for the display controls.
	*/
	public boolean getDisplayControlMode();
	/**
	* Gets whether rigorous clipping is in use.
	*/
	public boolean getUseRigorousClipping();
	/**
	* Adds a DepicListListener to the model.
	*/
	public void addDepicListListener(DepicListListener in);
	/**
	* Removes a DepicListListener from the model.
	*/
	public void removeDepicListListener(DepicListListener in);
	/**
	* Adds a Window Record to the model.
	*/
//	public void addWindowRecord(Object in, int winType);
	/**
	* Prepares the model manager for a subsequent drag operation.
	*/
	public void setUpDrag(DepicListListener target, boolean GloRedraw);
	/**
	* Handles a drag event entering the viewport.
	*/
	public void dragEventEntry(MotionEvent e);
	/**
	* Handles the throwing of an error or exception.
	*/
	public void handleThrow(Throwable in);
	
	/**
	 * Sends a request to the engine asking for optimization.
	 */
	public void optimizeRep();
	
	public void playBeep();
}
