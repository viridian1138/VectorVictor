




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

import java.io.Externalizable;
import java.net.URL;

import com.postgreen.vectorvictor.ScreenDensityRatio;

import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import meta.StdLowLevelList;
import verdantium.EtherEvent;
import verdantium.EtherEventHandler;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
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
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/17/2001            | Thorn Green (viridian_1138@yahoo.com)           | Add online docs. to depictors.                                       | Added/changed some APIs to support this.
*    | 12/07/2001            | Thorn Green (viridian_1138@yahoo.com)           | Added more docs.                                                     | Added more docs.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/16/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some depictors.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Added this capability for some more depictors.
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
*    | 09/16/2002            | Thorn Green (viridian_1138@yahoo.com)           | Reduce default font size (GeoSlate/GeoCard).                         | Reduced default font size.
*    | 09/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Change default font to 10 point.                                     | Changed default font to 10 point.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
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
* Defines the methods supported by all depictors.  DrawObj is intended to be
* a strict superset of the depictor model in Peter Yu's implementation.
* @author Thorn Green
*/
public abstract class DrawObj<T extends DrawObj> extends Meta<T> implements EtherEventHandler, Externalizable {

	/**
	* Copies the members of the depictor.
	*/
	public void drDatCpy(DrawObj out) {
		/* out.VectName = VectName; */
		/* out.Movable = Movable; */
		/* out.VectPtr = VectPtr; */
		/* out.SelfAlloc = SelfAlloc; */
		/* out.HDVectName = HDVectName; */
		/* out.HDMovable = HDMovable; */
		/* out.HDVectPtr = HDVectPtr; */
		/* out.HDSelfAlloc = HDSelfAlloc; */
		/* out.MDVectName = MDVectName; */
		/* out.MDMovable = MDMovable; */
		/* out.MDVectPtr = MDVectPtr; */
		/* out.MDSelfAlloc = MDSelfAlloc; */
	};
	/**
	* Copies the members of the depictor.
	*/
	public void datCpy(DrawObj out) {
		drDatCpy(out);
	};
	public void wake() {};
	/**
	* Gets the name of the variable associated with the depictor.
	*/
	public abstract FlexString getVectName();
	/**
	* Sets the name of the variable associated with the depictor.
	*/
	public abstract void setVectName(FlexString in);
	/**
	* Renders the depictor.  Uses the graphics context to render, the CoordContext
	* to get the appropriate coordinate system information, an indication of whether the 
	* coordinate system is bound, the ToolMode in which the object is being drawn, and
	* the port for rendering using a common style (among other things).  The depictor may
	* assume that updateYourself() will be called before drawYourself() if the state of
	* the object has been changed by the symbolic engine.
	*/
	public abstract void drawYourself(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode);
	/**
	* Causes the depictor to update itself and state of its CoordContext in anticipation
	* of a future rendering request.  Gives the depictor a chance to synchronize its
	* depiction-related information with the value of the object it represents.  If the
	* value of the Geometric Algebra entity that the oject depicts has changed, the view
	* will always call updateYourself() before it calls either drawYourself() or
	* drawYourTools().  The call takes in the current ToolMode, the coordinate object to modify,
	* whether the depiction is bound, and the current DepictorPort.  The DepictorPort is passed because
	* DepictorPort DepictorPort controls the mapping from the global coordinate system of the values
	* of the Geometric Algebra objects to the local screen coordinate system (for instance, it maps
	* the length of the unit vector to a certain number of pixels on the screen).  DepictorPort provides
	* a public interface with specific calls for conversions between coordinate systems.  The code for a
	* depictor's updateYourself() method must use these calls to determine the screen coordinates to draw
	* the depictor at, and then place this information in the CoordContext object.  The depictor usually may
	* NOT store this data within itself.  The reason for this is that a depictor may appear in multiple views
	* simultaneously, and thus would be attempting to clobber a single datum with (an arbitrary number of)
	* multiple pieces of information.  For instance, in GeoPad there are depictors that are simultaneously in
	* both the free and bound depiction views.  As a result there is one depictor, but two separate CoordContext
	* objects to store pixel location information.
	*/
	public abstract void updateYourself(DepictorPort ThePort, CoordContext PrtCon, boolean bound, int ToolMode);
	/**
	* Renders the depictors control points, and other tools.  In particular the "hot-spots" associated with a
	* depictor for a particular ToolMode.  The "hot-spots" are small "knobs" or "tags" drawn on top of the
	* depictor which indicate where the mouse can be clicked or dragged on the depictor to perform an action.
	* For instance, if the ToolMode is equal to TranslateMode, the call would draw "hot-spots" that indicate
	* where the depictor can be clicked to translate it by dragging.  Uses the graphics context to render, the 
	* CoordContext to get the appropriate coordinate system information, an indication of whether the 
	* coordinate system is bound, the ToolMode in which the object is being drawn, and
	* the port for rendering using a common style (among other things).  The depictor may
	* assume that updateYourself() will be called before drawYourself() if the state of
	* the object has been changed by the symbolic engine.  The depictor may draw its "hot-spots" in
	* different ways depending on the current ToolMode.  Note that DepictorPort provides public methods
	* for drawing a "hot-spot" at a particular screen coordinate.
	*/
	public abstract void drawYourTools(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		Canvas g, Paint p,
		int ToolMode);
	/**
	* Handles a mouse-down event.  Returns a ClickRec if the mouse-event was near
	* a control point of the depictor.  In more detail, clickedInRegion() determines
	* whether the point LocEvent (in local screen coordinates) lies on top of one of the
	* "hot-spots" for the current tool mode in ToolMode.  If LocEvent does not lie on
	* any "hot-spot" of the depictor, the method returns a null reference.  Otherwise it
	* returns an object that inherits ClickRec.  If the DepcitorPort object selects this depictor
	* as the one to drag, then subsequent dragDisplayControl() calls to the object will be passed
	* the instance of ClickRec returned by clickedInRegion().  The fact that the object returned by
	* clickedInRegion() can extend ClickRec, and is the same object passed to dragDisplayControl()
	* is important because the extension of ClickRec can be used in clickedInRegion() to pass
	* specialized information to dragDisplayControl() about the location of the "mouse-down" event.
	* For instance, ClickRec can be extended with information indicating which "hot-spot" of the
	* depictor the mouse-down occurred on.  dragDisplayControl() can take this information and
	* act appropriately.
	*/
	public abstract ClickRec clickedInRegion(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF LocEvent,
		int ToolMode);
	/**
	* Performs a drag operation that has not been delegated to a DynRunner.  In particular,
	* one iteration of the dragging of a "hot-spot" to a new location in a way consistent
	* with the world coordinate system of the symbolic engine.  Takes in a DepictorPort,
	* the ClickRec object that this DrawObj instance returned in its clickedInRegion()
	* call, the current tool mode, and the screen coordinate position to which the "hot-spot"
	* has been dragged.  The object recieving this method must change its state in such a way
	* that a subsequent updateYourself() call will update it in such a way that the following
	* drawYourTools() call will display the dragged "hot-spot" at the screen coordinates defined
	* by LocEvent.  In addition to the aforementioned screen-coordinate change, the dragging of the
	* "hot-spot" should also change the world-coordinate values associated with the depictor in
	* an appropriate way.  This requires a conversion of LocEvent from screen coordinates to world
	* coordinates followed by a set of world-coordinate computations.  DepictorPort provides
	* methods which handle this conversion for the depictor.  Thus, the code for dragDisplayControl()
	* can make calls on the ToolPort parameter to do this.
	*/
	public abstract void dragDisplayControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec in,
		int ToolMode,
		PointF InPt);
	/**
	* Handles a single-click event.  Handling single-clicks is problematic in the
	* current implementation of Java AWT (e.g. Java 2).  AWT refuses to properly
	* recognize single-clicks a high percentage of the time.
	*/
	public void singleClickControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec in,
		int ToolMode) {
		};
	/**
	* Handles a ClickRec returned by the depictor in erase mode by specifying
	* what to erase.  If the DrawObj returns a non-null ClickRec from the
	* clickedInRegion() method when the ToolMode is ErasureMode, the DrawObj
	* the DrawObj has indicated that the user has clicked on the graphical
	* "hot-spot" for the deletion of a symbolic link.  However, the returning
	* of the ClickRec does not provide any information about the internal name
	* of the link that the user wishes to delete.  Thus, the DepictorPort object
	* in ErasureMode makes a subsequent call to the delVar() method on the object
	* that returned the non-null ClickRec.  The calling DepictorPort passes in the
	* ClickRec returned by clickedInRegion() as well as a reference to an empty
	* FlexString to be modified by the method.  The method copies the prefix name
	* of the link to be deleted into the delVar.  This provides the symbolic
	* information that the DepictorPort needs to delete the link.
	*/
	public abstract void delVar(DepictorPort ThePort, ClickRec in, FlexString DelVar);
	/**
	* Stores data to potentially undo a future drag operation.  The pushDragUndo() method on a
	* DrawObj is usually called between a clickedInRegion() call and a dragDisplayControl() call.
	* However, pushDragUndo() may be called at any point that the DepictorPort object chooses.
	* pushDragUndo() causes the object to create a static single level undo stack, and to push
	* the current world-coordinate values of the depictor onto this stack.  This data is pushed onto
	* the stack before the depictor is dragged on the screen so that selecting "Undo" from the "Edit"
	* menu after dragging the object can restore the object to its original state.
	*/
	public abstract void pushDragUndo();
	/**
	* Performs an "undo" operation of a mouse drag.  This method is used to "pop" the previous
	* value of a depictor from its static undo stack, thus performing an "undo" on the dragging
	* of the depictor's "hot-spot".  The code for popDragUndo() can be written with the 
	* assumption that pushDragUndo() has been called, and that
	* pushDragUndo() has been called after the last call to popOthers().  pushDragUndo() swaps the
	* depictor value in the undo stack with the current value of the depictor.  Subsequent calls to
	* popDragUndo() may be made after a particular call.  The swapping causes the depictor to switch
	* between "previous" and "new" values respectively.
	*/
	public abstract void popDragUndo();
	/**
	* Releases data stored to "undo" a mouse-drag.  This method causes the depictor to free any space
	* it has allocated for a undo-stack.  Namely, any space allocated by pushDragUndo() is deallocated.
	*/
	public abstract void popOthers();
	/**
	* Selects the port indicated by the port name passed in <code>Prefix</code>.  Causes the depictor
	* to open a logical port to one of its symbolic links.  The prefix of the prefix name of the symbolic
	* link is passed to the method through the parameter Prefix.  The depictor compares Prefix to the
	* set of link names currently associated with the depictor, and opens a logical connection to the
	* appropriate link.
	*/
	public abstract void setValuePort(FlexString Prefix);
	/**
	* Sets the current port's value references to point to the objects passed in the
	* method parameters.  This is used when control over a port's objects passes from the
	* depictor to some external entity (like a solving engine).  Resets the symbolic link
	* of the current port as set by setValuePort().  MyVectName contains a reference to the
	* prefix name of the link, MyMovable contains a reference to the new instance of the
	* "movable" flag of the link, and MyVect contains a rewference to the new value of the link.
	*/
	public abstract void portInitPtrs(
		FlexString MyVectName,
		IntObj MyMovable,
		Mvec MyVect,
		IntObj MyDomain,
		IntObj MyIODef);
	/**
	* Gets the object that holds whether the variable in the current port is movable.
	*/
	public abstract IntObj portGetMovable();
	/**
	* Sets the object that holds whether the variable in the current port is movable.
	*/
	public abstract void portSetMovable(IntObj in);
	/**
	* Gets the multivector associated with the current port.    Port sharing allows
	* changes in the values of the constrained variables to be automatically reflected in
	* the values of the associated depictors.  The only difficulty is that the shared port
	* values can change without the depictor's knowledge.  Thus, DepictorPort should call
	* updateYourself() on the object after each set of changes to shared ports is made.
	*/
	public abstract Mvec portGetVect();
	/**
	* Gets the object that holds whether the objects in the current port are 
	* controlled by the depictor.  Returns a reference to the current allocation state
	* of the values associated with the current port of the DrawObj.
	*/
	public abstract IntObj portGetSelfAlloc();
	/**
	* Sets the object that holds whether the objects in the current port are
	* controlled by the depictor.
	*/
	public abstract void vectSetSelfAlloc(IntObj in);
	/**
	* Gets the domain of the current port taking into account all depictors.
	*/
	public abstract int portGetExtDomain();
	/**
	* Gets the domain of the depictor's variable counting all depictors.
	*/
	public abstract IntObj vectGetExtDomain();
	/**
	* Sets the object that holds the domain of the current port.
	*/
	public abstract void vectSetExtDomain(IntObj in);
	/**
	* Gets a list of the prefix names of all ports used in constraints by this depictor.
	*/
	public abstract String[] getPortNames();
	/**
	* Returns true iff. the depictor is not bound by any symbolic constraints.  Returns true if
	* none of the dpeictor's ports are shared.  The depictor can be deleted in a straightforward
	* manner if there are no shared ports.
	*/
	public abstract boolean noSymBindings();
	/**
	* Gets the input/output state of the current port just counting this depictor.
	*/
	public abstract int portGetEntIODef();
	/**
	* Gets the input/output state of the port associated with the variable's value for just this depictor.
	*/
	public abstract int vectGetEntIODef();
	/**
	* Gets the input/output state of the current port counting all depictors.
	*/
	public abstract int portGetExtIODef();
	/**
	* Gets the input/output state of the port associated with the variable's value for all depictors.
	*/
	public abstract IntObj vectGetExtIODef();
	/**
	* Initializes the position and direction of the depictor.  Causes the depictor to reset
	* its value to a "reset" state.  Methods in the public interface of DepictorPort return
	* the current value of the "reset" state.  An instance of the calling DepictorPort is passed in
	* so that these methods can be called.
	*/
	public abstract void resetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state);
	/**
	* Initializes the position and direction of the depictor.
	*/
	public void synchResetVects(DepictorPort ThePort, CoordContext PrtCon, boolean bound, boolean state) {};
	/**
	* Checks whether the assign tool is assigning to a control point
	* on the depictor.
	*/
	public abstract void checkAssignToControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		Object[] LHS,
		Object[] RHS,
		IntObj Active);
	/**
	* Checks whether the assign tool is assigning from a control point on the depictor.
	*/
	public abstract void checkAssignFromControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		FlexString NewString,
		PointF OutPt);
	/**
	* Deals with an adjustment of the unit by a unit-control depictor.  The operation
	* warps the position of the depictor in the GCS so that the screen position of
	* the depictor is unchanged despite the change in the unit length.
	*/
	public void handleCoordAdjust(
		DepictorPort ThePort,
		CoordContext Std,
		CoordContext Initial,
		boolean bound,
		boolean ChgDelta) {
		};
	/**
	* Loads persistent properties.
	*/
/*	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp) throws DataFormatException {
		String key = ThePort.getPersistencePrefix(this);

		FrontLineColor = new Color(MyProp.getInt(key + ".FrontLineColor"));

		BackLineColor = new Color(MyProp.getInt(key + ".BackLineColor"));

		TextColor = new Color(MyProp.getInt(key + ".TextColor"));

		FrontLineVisible = MyProp.getBoolean(key + ".FrontLineVisible");

		BackLineVisible = MyProp.getBoolean(key + ".BackLineVisible");

		TextVisible = MyProp.getBoolean(key + ".TextVisible");

		ControlsVisible = MyProp.getBoolean(key + ".ControlsVisible");

		if (MyProp.getProperty(key + ".NamedVar") != null) {
			NamedVar = MyProp.getBoolean(key + ".NamedVar");
		}

		TemporaryVar = MyProp.getBoolean(key + ".TemporaryVar");

		setTextPtSz(MyProp.getInt(key + ".TextPtSz", 12));

		if (MyProp.getProperty(key + ".BasicFrontLineStrokeWidth") != null) {
			double wid = MyProp.getDouble(key + ".BasicFrontLineStrokeWidth");
			setBasicFrontLineStroke(wid);
		}

		if (MyProp.getProperty(key + ".BasicBackLineStrokeWidth") != null) {
			double wid = MyProp.getDouble(key + ".BasicBackLineStrokeWidth");
			setBasicBackLineStroke(wid);
		}

	}; */
	/**
	* Saves persistent properties.
	*/
	/* public void saveProperties(DepictorPort ThePort, VTextProperties MyProp) {
		String key = ThePort.getPersistencePrefix(this);

		MyProp.putInt(key + ".FrontLineColor", FrontLineColor.getRGB());

		MyProp.putInt(key + ".BackLineColor", BackLineColor.getRGB());

		MyProp.putInt(key + ".TextColor", TextColor.getRGB());

		MyProp.putBoolean(key + ".FrontLineVisible", FrontLineVisible);

		MyProp.putBoolean(key + ".BackLineVisible", BackLineVisible);

		MyProp.putBoolean(key + ".TextVisible", TextVisible);

		MyProp.putBoolean(key + ".NamedVar", NamedVar);

		MyProp.putBoolean(key + ".ControlsVisible", ControlsVisible);

		MyProp.putBoolean(key + ".TemporaryVar", TemporaryVar);

		MyProp.putInt(key + ".TextPtSz", getTextPtSz());

		if (BasicFrontLineStrokeWidth >= 0.0)
			MyProp.putDouble(".BasicFrontLineStrokeWidth", BasicFrontLineStrokeWidth);

		if (BasicBackLineStrokeWidth >= 0.0)
			MyProp.putDouble(".BasicBackLineStrokeWidth", BasicBackLineStrokeWidth);

	}; */

        /**
	* Reads persistent data.
	*/
	/* public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			FrontLineColor = (Color) (myv.getProperty("FrontLineColor"));
			VersionBuffer.chkNul(FrontLineColor);
			BackLineColor = (Color) (myv.getProperty("BackLineColor"));
			VersionBuffer.chkNul(BackLineColor);
			TextColor = (Color) (myv.getProperty("TextColor"));
			VersionBuffer.chkNul(TextColor);
			FrontLineVisible = myv.getBoolean("FrontLineVisible");
			BackLineVisible = myv.getBoolean("BackLineVisible");
			TextVisible = myv.getBoolean("TextVisible");
			NamedVar = myv.getBoolean("NamedVar");
			ControlsVisible = myv.getBoolean("ControlsVisible");
			TemporaryVar = myv.getBoolean("TemporaryVar");
			TextPtSz = myv.getInt("TextPtSz");
			FragID = (FlexString) (myv.getProperty("FragID"));
			VersionBuffer.chkNul(FragID);
			Delegated = (HighLevelList) (myv.getProperty("Delegated"));
			VersionBuffer.chkNul(Delegated);
			Delegators = (HighLevelList) (myv.getProperty("Delegators"));
			VersionBuffer.chkNul(Delegators);

			Object myo = myv.getProperty("BasicFrontLineStrokeWidth");
			if (myo != null) {
				Double duo = (Double) (myo);
				VersionBuffer.chkNul(duo);
				double wid = duo.doubleValue();
				setBasicFrontLineStroke(wid);
			}

			myo = myv.getProperty("FrontLineStroke");
			if (myo != null) {
				Stroke sto = (Stroke) myo;
				VersionBuffer.chkNul(sto);
				FrontLineStroke = sto;
			}

			myo = myv.getProperty("BasicBackLineStrokeWidth");
			if (myo != null) {
				Double duo = (Double) (myo);
				VersionBuffer.chkNul(duo);
				double wid = duo.doubleValue();
				setBasicBackLineStroke(wid);
			}

			myo = myv.getProperty("BackLineStroke");
			if (myo != null) {
				Stroke sto = (Stroke) myo;
				VersionBuffer.chkNul(sto);
				BackLineStroke = sto;
			}
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	} */
	/**
	* Writes persistent data.
	* @serialData TBD.
	*/
	/* public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("FrontLineColor", FrontLineColor);
		myv.setProperty("BackLineColor", BackLineColor);
		myv.setProperty("TextColor", TextColor);
		myv.setBoolean("FrontLineVisible", FrontLineVisible);
		myv.setBoolean("BackLineVisible", BackLineVisible);
		myv.setBoolean("TextVisible", TextVisible);
		myv.setBoolean("NamedVar", NamedVar);
		myv.setBoolean("ControlsVisible", ControlsVisible);
		myv.setBoolean("TemporaryVar", TemporaryVar);
		myv.setInt("TextPtSz", getTextPtSz());
		myv.setProperty("FragID", FragID);
		myv.setProperty("Delegated", Delegated);
		myv.setProperty("Delegators", Delegators);

		if (BasicFrontLineStrokeWidth >= 0.0)
			myv.setDouble("BasicFrontLineStrokeWidth", BasicFrontLineStrokeWidth);

		if ((FrontLineStroke instanceof Serializable) || (FrontLineStroke instanceof Externalizable))
			myv.setProperty("FrontLineStroke", FrontLineStroke);

		if (BasicBackLineStrokeWidth >= 0.0)
			myv.setDouble("BasicBackLineStrokeWidth", BasicBackLineStrokeWidth);

		if ((BackLineStroke instanceof Serializable) || (BackLineStroke instanceof Externalizable))
			myv.setProperty("BackLineStroke", BackLineStroke);

		out.writeObject(myv);
	} */

	/**
	* Selects the port on a semantic basis using the value in <code>DefPortVal</code>.
	* If the parameter's value is zero, selects a port associated with the position of
	* the depictor.  If the value is one, selects a port associated with the value
	* of the depictor.
	*/
	public abstract void setValuePort(int DefPortVal);

	public void iDrawObj() {};
	public DrawObj() {
		iDrawObj();
	};

	public void copyUser1Info(Meta out) {
		DrawObj temp = (DrawObj) out;
		temp.TemporaryVar = TemporaryVar;
		(getVectName()).copyString(temp.getVectName());
	}
	/**
	* Creates a DynRunner that moves the location of a single
	* vector port in accordance with the mouse position.
	*/
	public DynRunner createMoveDyn(DepictorPort ThePort, boolean bound, Mvec HexGlo, String Port) {
		DynRunner Dyn = null;

		if (HexGlo == null)
			Dyn = ThePort.createDynRunner();
		else
			Dyn = ThePort.createDynRunner(bound, HexGlo);

		Object[] LHS = null;

		if (Port == null) {
			Object[] Tmp = { this };
			LHS = Tmp;
		}
		else {
			Object[] Tmp = { Port, this };
			LHS = Tmp;
		}

		Object[] RHS = { "'~glo'" };
		Dyn.changeExpression(LHS, RHS);

		return (Dyn);
	}
	/**
	* Creates a DynRunner that moves the location of a single
	* vector port in accordance with the mouse position.
	*/
	public DynRunner createMoveDyn(DepictorPort ThePort, String Port) {
		return (createMoveDyn(ThePort, false, null, Port));
	}

	/**
	* Creates a DynRunner that moves the location of a single
	* vector port in accordance with the mouse position as being translated
	* with respect to InPt.  Assumes bound is false.
	*/
	public DynRunner createOffsetTransDyn(
		DepictorPort ThePort,
		boolean bound,
		PointF InPt,
		Hexar BasePt,
		String Port,
		String IntPort) {
		DynRunner Dyn = ThePort.createDynRunner();

		Object[] LHS = null;

		if (Port == null) {
			Object[] Tmp = { this };
			LHS = Tmp;
		}
		else {
			Object[] Tmp = { Port, this };
			LHS = Tmp;
		}

		Object[] RHS = { "'~glo' \\- '~tmpk_pt' \\+ ", IntPort, this };
		Dyn.changeExpression(LHS, RHS);

		Hexar hex = new Hexar();
		ThePort.hexglo(InPt.x, InPt.y, BasePt.getGlo(), bound, hex);
		Mvec InPtGlo = hex.getGlo();
		Dyn.makeConstant("~tmpk_pt", InPtGlo, DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);

		return (Dyn);
	}

	public final Mvec getBoundPt(boolean bound, Mvec in) {
		Mvec BoundPt = in;
		if (bound && !(getDelegated().empty())) {
			DrawObj btemp = (DrawObj) (getDelegated().getNode());
			btemp.setValuePort(0);
			BoundPt = btemp.portGetVect();
		}

		return (BoundPt);
	}

	/**
	*<B>Fun:</B> Draws a standard twist phasor depiction.
	*<P>
	*<B>In:</B> Graphics context, the location Hexar of the depiction
	*	to be drawn.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  The other input objects exist.  The location
	*	has been de-hexed.<BR>
	*<B>Post:</B> The specified twist scalar depiction will be drawn in the graphics context.<BR>
	*@author Thorn Green.
	*/
	public void drawTwistDialPhasor(
		DepictorPort ThePort,
		Hexar hex,
		Canvas g,
		Paint p,
		Mvec Vect,
		int PrevToolMode,
		double ArcToolRad) {
		double xa = hex.getPtx();
		double ya = hex.getPty();
		double RealIn = (Vect).getBasis();
		double ImIn = (Vect).getBasis12();

		p.setStrokeCap( getBackLineStroke().getStrokeCap() );
		p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
		
		p.setColor(getBackLineColor());

		boolean tmp = getBackLineVisible();
		if ((!tmp) && (PrevToolMode == 13)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp) {
			
			g.drawLine( (float)(xa - ArcToolRad) , (float)ya, 
					(float)(xa + ArcToolRad), (float)ya, p);
			
			p.setStyle( Style.FILL );

			if (RealIn >= 0)
				p.setColor(ThePort.getCyanIndex());
			else
				p.setColor(ThePort.getMagentaIndex());
			double xw = -RealIn * ThePort.getRealAng().value;

			
			TempRect.left = (float) ( xa - 2 * ArcToolRad );
			TempRect.top = (float)( ya - ArcToolRad );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya + ArcToolRad );
			
			g.drawArc(TempRect, -180, (float) -xw, true, p);

			if (ImIn >= 0)
				p.setColor(ThePort.getCyanIndex());
			else
				p.setColor(ThePort.getMagentaIndex());
			xw = ImIn * ThePort.getImAng().value;

			
			TempRect.left = (float) ( xa );
			TempRect.top = (float)( ya - ArcToolRad );
			TempRect.right = (float)( xa + 2 * ArcToolRad );
			TempRect.bottom = (float)( ya + ArcToolRad );
			
			g.drawArc(TempRect, -0, (float) -xw, true, p);
		}

	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard twist dial phasor control.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,
		the base multivector, and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the twist dial.<BR>
	*@author Thorn Green.
	*/
	public double twistDialGravityField(
		DepictorPort ThePort,
		PointF InPt,
		Hexar hex,
		Mvec Vect,
		double ArcToolRad,
		double LineWidth) {
		double xa = hex.getPtx();
		double ya = hex.getPty();
		double RealIn = (Vect).getBasis();
		double ImIn = (Vect).getBasis12();

		double lnseg = linearSegGravityField(InPt, xa - ArcToolRad, ya, xa + ArcToolRad, ya, LineWidth);

		double xw = -RealIn * ThePort.getRealAng().value;
		
		RectF TempArc = new RectF();

		TempArc.set((float)(xa - 2 * ArcToolRad), (float)(ya - ArcToolRad), (float)xa, (float)(ya + ArcToolRad));
		//TempArc.setAngleStart(180);
		//TempArc.setAngleExtent(xw);
		boolean conta = TempArc.contains(InPt.x , InPt.y);

		xw = ImIn * ThePort.getImAng().value;

		TempArc.set((float)xa, (float)(ya - ArcToolRad), (float)(xa + 2 * ArcToolRad), (float)(ya + ArcToolRad));
		// TempArc.setAngleStart(0);
		// TempArc.setAngleExtent(xw);
		boolean contb = TempArc.contains(InPt.x , InPt.y);

		double cdist = ClickRec.MIN_PRIORITY + 1;
		if (conta || contb)
			cdist = ClickRec.MAX_PRIORITY + 1;
		return (Math.min(lnseg, cdist));
	};

	/**
	*<B>Fun:</B> Draws a real-value bar scalar.
	*<P>
	*<B>In:</B> Graphics context, value and location to be drawn.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  The other input objects exist.<BR>
	*<B>Post:</B> The specified bar depiction will be drawn in the graphics context.<BR>
	*@author Thorn Green.
	*/
	protected void drawRealBar(
		DepictorPort ThePort,
		Canvas g,
		Paint p,
		Mvec Vect,
		int PrevToolMode,
		double xa,
		double ya,
		double ArcToolRad) {
		double val = (Vect).getBasis();
		p.setStyle( Style.FILL );
		if (val >= 0)
			p.setColor(ThePort.getCyanIndex());
		else
			p.setColor(ThePort.getMagentaIndex());
		double xw = val * ThePort.getRealBar().value;
		if (xw >= 0) {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya - xw );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya );
			g.drawRect(TempRect, p);
		}
		else {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya - xw );
			g.drawRect(TempRect, p);
		}

	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard real-axis bar.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,<BR>
		the base multivector, the bar location (xa , ya), and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the real bar.<BR>
	*@author Thorn Green.
	*/
	protected double realBarGravityField(
		DepictorPort ThePort,
		PointF InPt,
		Mvec Vect,
		double xa,
		double ya,
		double ArcToolRad) {
		double val = (Vect).getBasis();
		double xw = val * ThePort.getRealBar().value;
		double dist = ClickRec.MIN_PRIORITY + 1;
		if (xw >= 0) {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya - xw );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya );
			if (TempRect.contains(InPt.x, InPt.y))
				dist = ClickRec.MAX_PRIORITY + 1;
		}
		else {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya - xw );
			if (TempRect.contains(InPt.x , InPt.y))
				dist = ClickRec.MAX_PRIORITY + 1;
		}

		return (dist);
	};

	/**
	*<B>Fun:</B> Draws a imaginary-value bar scalar.
	*<P>
	*<B>In:</B> Graphics context, value and location to be drawn.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  The other input objects exist.<BR>
	*<B>Post:</B> The specified bar depiction will be drawn in the graphics context.<BR>
	*@author Thorn Green.
	*/
	protected void drawImagBar(
		DepictorPort ThePort,
		Canvas g,
		Paint p,
		Mvec Vect,
		int PrevToolMode,
		double xa,
		double ya,
		double ArcToolRad) {
		double val = (Vect).getBasis12();
		p.setStyle( Style.FILL );
		if (val >= 0)
			p.setColor(ThePort.getCyanIndex());
		else
			p.setColor(ThePort.getMagentaIndex());
		double xw = val * ThePort.getImBar().value;
		if (xw >= 0) {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya - xw );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya );
			g.drawRect(TempRect, p);
		}
		else {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya - xw );
			g.drawRect(TempRect, p);
		}

	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard imaginary-axis bar.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,<BR>
		the base multivector, the bar location (xa , ya), and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the imaginary bar.<BR>
	*@author Thorn Green.
	*/
	protected double imagBarGravityField(
		DepictorPort ThePort,
		PointF InPt,
		Mvec Vect,
		double xa,
		double ya,
		double ArcToolRad) {
		double val = (Vect).getBasis12();
		double xw = val * ThePort.getImBar().value;
		double dist = ClickRec.MIN_PRIORITY + 1;
		if (xw >= 0) {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya - xw );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya );
			if (TempRect.contains(InPt.x, InPt.y))
				dist = ClickRec.MAX_PRIORITY + 1;
		}
		else {
			TempRect.left = (float) xa;
			TempRect.top = (float)( ya );
			TempRect.right = (float)( xa + ArcToolRad );
			TempRect.bottom = (float)( ya - xw );
			if (TempRect.contains(InPt.x, InPt.y))
				dist = ClickRec.MAX_PRIORITY + 1;
		}

		return (dist);
	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard bargraph scalar control.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,
		the base multivector, the tool mode, and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the scalar bargraph.<BR>
	*@author Thorn Green.
	*/
	public void drawBarScalar(
		DepictorPort ThePort,
		Hexar hex,
		Canvas g,
		Paint p,
		Mvec Vect,
		int PrevToolMode,
		double ArcToolRad) {
		double xa = hex.getPtx();
		double ya = hex.getPty();

		p.setStrokeCap( getBackLineStroke().getStrokeCap() );
		p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
		
		p.setColor(getBackLineColor());

		boolean tmp = getBackLineVisible();
		if ((!tmp) && (PrevToolMode == 13)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp) {
			g.drawLine( (float)( xa - ArcToolRad ) , (float) ya , 
					(float)( xa + ArcToolRad ) , (float) ya , p);

			drawRealBar(ThePort, g, p, Vect, PrevToolMode, xa - 1.0 * ArcToolRad / 2.0, ya, ArcToolRad);

		}

	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard scalar bargraph control.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,
		the base multivector, and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the scalar bargraph.<BR>
	*@author Thorn Green.
	*/
	public double barScalarGravityField(
		DepictorPort ThePort,
		PointF InPt,
		Hexar hex,
		Mvec Vect,
		double ArcToolRad,
		double LineWidth) {
		double xa = hex.getPtx();
		double ya = hex.getPty();

		double lnseg = linearSegGravityField(InPt, xa - ArcToolRad, ya, xa + ArcToolRad, ya, LineWidth);

		double rbgrav = realBarGravityField(ThePort, InPt, Vect, xa - 1.0 * ArcToolRad / 2.0, ya, ArcToolRad);

		return (Math.min(lnseg, rbgrav));
	};

	/**
	*<B>Fun:</B> Draws a standard bar phasor depiction.
	*<P>
	*<B>In:</B> Graphics context, the location Hexar of the
	*	depictor to be drawn.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  The other input objects exist.  The location
	*	has been de-hexed.<BR>
	*<B>Post:</B> The specified bar phasor depiction will be drawn in the graphics context.<BR>
	*@author Thorn Green.
	*/
	public void drawBarPhasor(
		DepictorPort ThePort,
		Hexar hex,
		Canvas g,
		Paint p,
		Mvec Vect,
		int PrevToolMode,
		double ArcToolRad) {
		double xa = hex.getPtx();
		double ya = hex.getPty();

		p.setStrokeCap( getBackLineStroke().getStrokeCap() );
		p.setStrokeJoin( getBackLineStroke().getStrokeJoin() );
		p.setStrokeMiter( getBackLineStroke().getStrokeMiter() );
		p.setStrokeWidth( getBackLineStroke().getStrokeWidth() );
		
		p.setColor(getBackLineColor());

		boolean tmp = getBackLineVisible();
		if ((!tmp) && (PrevToolMode == 13)) {
			tmp = true;
			p.setColor(DefBack);
		}

		if (tmp) {
			g.drawLine( (float)( xa - 2 * ArcToolRad ) , (float) ya , 
					(float)( xa + 2 * ArcToolRad ) , (float) ya , p);

			drawRealBar(ThePort, g, p, Vect, PrevToolMode, xa - 3.0 * ArcToolRad / 2.0, ya, ArcToolRad);

			drawImagBar(ThePort, g, p, Vect, PrevToolMode, xa + 1.0 * ArcToolRad / 2.0, ya, ArcToolRad);

		}

	};

	/**
	*<B>Fun:</B> Returns the gravity field for a standard bargraph phasor control.
	*<P>
	*<B>In:</B> The depictor port, the point to test, the hexar of the global coord,
		the base multivector, and the arc tool radius.<BR>
	*<B>Out:</B> Value returned.<BR>
	*<B>Pre:</B> The other input objects exist.  The location has been de-hexed.<BR>
	*<B>Post:</B> The gravity field will correspond to the location around the bargraph.<BR>
	*@author Thorn Green.
	*/
	public double barPhasorGravityField(
		DepictorPort ThePort,
		PointF InPt,
		Hexar hex,
		Mvec Vect,
		double ArcToolRad,
		double LineWidth) {
		double xa = hex.getPtx();
		double ya = hex.getPty();

		double lnseg = linearSegGravityField(InPt, xa - 2 * ArcToolRad, ya, xa + 2 * ArcToolRad, ya, LineWidth);

		double d1 = realBarGravityField(ThePort, InPt, Vect, xa - 3.0 * ArcToolRad / 2.0, ya, ArcToolRad);

		double d2 = imagBarGravityField(ThePort, InPt, Vect, xa + 1.0 * ArcToolRad / 2.0, ya, ArcToolRad);

		return (Math.min(Math.min(d1, d2), lnseg));
	};

	/**
	* Gets the gravity field from "in" to the linear segment starting at "p1", and ending at "p2".
	*/
	public double linearSegGravityField(PointF p1, PointF p2, PointF in, double LineWidth) {
		double lw = LineWidth / 2.0;
		double dist = Math.max(getDistanceFromLinearSeg(p1, p2, in) - lw, 1.0);
		double maxdist = Math.max( 28.0 * ScreenDensityRatio.getRatio() - lw, 8.0 * ScreenDensityRatio.getRatio() );
		if (dist > maxdist)
			dist = ClickRec.MIN_PRIORITY + 1;
		return (dist);
	}

	/**
	* Gets the gravity field from "in" to the linear segment starting at "p1", and ending at "p2".
	*/
	public double linearSegGravityField(
		PointF in,
		double p1x,
		double p1y,
		double p2x,
		double p2y,
		double LineWidth) {
		double lw = LineWidth / 2.0;
		double dist = Math.max(getDistanceFromLinearSeg(in, p1x, p1y, p2x, p2y) - lw, 1.0);
		double maxdist = Math.max( 28.0 * ScreenDensityRatio.getRatio() - lw, 8.0 * ScreenDensityRatio.getRatio() );
		if (dist > maxdist)
			dist = ClickRec.MIN_PRIORITY + 1;
		return (dist);
	}

	/**
	* Gets the gravity field of "in" from the ray starting at "p1" and extending through "p2".
	*/
	public double linearRayGravityField(PointF p1, PointF p2, PointF in, double LineWidth) {
		double lw = LineWidth / 2.0;
		double dist = Math.max(getDistanceFromLinearRay(p1, p2, in) - lw, 1.0);
		double maxdist = Math.max(28.0 * ScreenDensityRatio.getRatio() - lw, 8.0 * ScreenDensityRatio.getRatio() );
		if (dist > maxdist)
			dist = ClickRec.MIN_PRIORITY + 1;
		return (dist);
	}

	/**
	* Gets the gravity field of "in" from the line extending through "p1" and "p2".
	*/
	public double linearGravityField(PointF p1, PointF p2, PointF in, double LineWidth) {
		double lw = LineWidth / 2.0;
		double dist = Math.max(getDistanceFromLine(p1, p2, in) - lw, 1.0);
		double maxdist = Math.max(28.0 * ScreenDensityRatio.getRatio() - lw, 8.0 * ScreenDensityRatio.getRatio() );
		if (dist > maxdist)
			dist = ClickRec.MIN_PRIORITY + 1;
		return (dist);
	}

	/**
	* Gets the gravity field of "in" from a circle with center and outer points "cntr" and "outr".
	*/
	public double circGravityField(PointF cntr, PointF outr, PointF in, double LineWidth) {
		double lw = LineWidth / 2.0;
		double dist = Math.max(getDistanceFromCirc(cntr, outr, in) - lw, 1.0);
		double maxdist = Math.max(28.0 * ScreenDensityRatio.getRatio() - lw, 8.0 * ScreenDensityRatio.getRatio() );
		if (dist > maxdist)
			dist = ClickRec.MIN_PRIORITY + 1;
		return (dist);
	}

	/**
	* Gets the distance from "in" to the linear segment starting at "p1", and ending at "p2".
	*/
	public final double getDistanceFromLinearSeg(PointF p1, PointF p2, PointF in) {
		return (getDistanceFromLinearSeg(in, p1.x, p1.y, p2.x, p2.y ));
	}

	/**
	* Gets the distance from "in" to the linear segment starting at "p1", and ending at "p2".
	*/
	public final double getDistanceFromLinearSeg(PointF in, double p1x, double p1y, double p2x, double p2y) {
		double d12x = p2x - p1x;
		double d12y = p2y - p1y;
		double d1ix = in.x - p1x;
		double d1iy = in.y - p1y;
		double d2ix = in.x - p2x;
		double d2iy = in.y - p2y;
		double dot1 = d12x * d1ix + d12y * d1iy;
		if (dot1 < 0.0)
			return (Math.sqrt(d1ix * d1ix + d1iy * d1iy));
		double dot2 = - (d12x * d2ix + d12y * d2iy);
		if (dot2 < 0.0)
			return (Math.sqrt(d2ix * d2ix + d2iy * d2iy));
		double distSq = d12x * d12x + d12y * d12y;
		if (distSq < 0.00000000001)
			return (Math.sqrt(d1ix * d1ix + d1iy * d1iy));
		double dist = Math.sqrt(distSq);
		double d12xi = -d12y / dist;
		double d12yi = d12x / dist;
		double delt = d12xi * d1ix + d12yi * d1iy;
		return (Math.abs(delt));
	}

	/**
	* Gets the distance of "in" from the ray starting at "p1" and extending through "p2".
	*/
	public final double getDistanceFromLinearRay(PointF p1, PointF p2, PointF in) {
		double d12x = p2.x - p1.x;
		double d12y = p2.y - p1.y;
		double d1ix = in.x - p1.x;
		double d1iy = in.y - p1.y;
		double dot1 = d12x * d1ix + d12y * d1iy;
		if (dot1 < 0.0)
			return (Math.sqrt(d1ix * d1ix + d1iy * d1iy));
		double distSq = d12x * d12x + d12y * d12y;
		if (distSq < 0.00000000001)
			return (Math.sqrt(d1ix * d1ix + d1iy * d1iy));
		double dist = Math.sqrt(distSq);
		double d12xi = -d12y / dist;
		double d12yi = d12x / dist;
		double delt = d12xi * d1ix + d12yi * d1iy;
		return (Math.abs(delt));
	}

	/**
	* Gets the distance of "in" from the line extending through "p1" and "p2".
	*/
	public final double getDistanceFromLine(PointF p1, PointF p2, PointF in) {
		double d12x = p2.x - p1.x;
		double d12y = p2.y - p1.y;
		double d1ix = in.x - p1.x;
		double d1iy = in.y - p1.y;
		double distSq = d12x * d12x + d12y * d12y;
		if (distSq < 0.00000000001)
			return (Math.sqrt(d1ix * d1ix + d1iy * d1iy));
		double dist = Math.sqrt(distSq);
		double d12xi = -d12y / dist;
		double d12yi = d12x / dist;
		double delt = d12xi * d1ix + d12yi * d1iy;
		return (Math.abs(delt));
	}

	/**
	* Gets the distance of "in" from a circle with center and outer points "cntr" and "outr".
	*/
	public final double getDistanceFromCirc(PointF cntr, PointF outr, PointF in) {
		double d12x = outr.x - cntr.x;
		double d12y = outr.y - cntr.y;
		double d1ix = in.x - cntr.x;
		double d1iy = in.y - cntr.y;
		double d1 = Math.sqrt(d12x * d12x + d12y * d12y);
		double d2 = Math.sqrt(d1ix * d1ix + d1iy * d1iy);
		return (Math.abs(d1 - d2));
	}

	/**
	* Draws a MathImage object for a depictor.
	*/
	public final void drawTextImage(Canvas g, MathImage img, double x, double y, Integer col) {
		img.paintMath(g, (int) x, (int) y);
	};

	/**
	* Draws a MathImage object for a depictor.
	*/
	public final void drawTextImageJustify(Canvas g, MathImage img, double x, double y, Mvec delta, Integer col) {
		if (DynamicJustify) {
			double xx = x;
			double yy = y;
			if (delta.getBasis1() < -0.01) {
				xx -= img.getWidth();
			}
			else {
				if (delta.getBasis1() < 0.01) {
					xx -= 0.5 * (img.getWidth());
				}
			}

			if (delta.getBasis2() > 0.01) {
				yy -= img.getHeight();
			}
			else {
				if (delta.getBasis2() > -0.01) {
					yy -= 0.5 * (img.getHeight());
				}
			}

			img.paintMath(g, (int) xx, (int) yy);
		}
		else {
			img.paintMath(g, (int) x, (int) y);
		}
	};

	/**
	* Gets whether the depictor will be automatically deleted when
	* all constraints on it are removed.
	*/
	public boolean getTemporary() {
		return (TemporaryVar);
	};
	/**
	* Sets whether the depictor will be automatically deleted when
	* all constraints on it are removed.
	*/
	public void setTemporary(boolean in) {
		TemporaryVar = in;
	};
	/**
	* Gets the fragment ID of the depictor.
	*/
	public FlexString getFragID() {
		return (FragID);
	};
	/**
	* Gets whether the depictor represents a user variable name.
	*/
	public final boolean getNamedVar() {
		return (NamedVar);
	};
	/**
	* Sets whether the depictor represents a user variable name.
	*/
	public final void setNamedVar(boolean in) {
		NamedVar = in;
	};
	/**
	* Gets the domain of the current port of the depictor, not counting other depictors.
	*/
	public int portGetEntDomain() {
		return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
	}
	/**
	* Gets the domain of the variable associated with the depictor, not counting other depictors.
	*/
	public int vectGetEntDomain() {
		return (DepictorPort.DOM_VECT1 + DepictorPort.DOM_VECT2);
	}
	/**
	* Handles Ether Events.
	*/
	public Object processObjEtherEvent(EtherEvent in, Object refcon) {
		return (null);
	};
	/**
	* Creates a coordinate context for the depictor.
	*/
	public CoordContext makeCoordContext() {
		return (null);
	};
	/**
	* Gets the image for the label of the depictor.
	*/
	public MathImage getDepicImage() {
		return (MyImg);
	};
	/**
	* Sets the image for the label of the depictor.
	*/
	public void setDepicImage(MathImage in) {
		MyImg = in;
	};
	/**
	* Requests that the depictor update any image or MathImage object it's using other
	* than the text label for the variable name.
	*/
	public void updateCreatedImages(DepictorPort ThePort) throws MathImageParseException {};
	/**
	* For a linear depictor, gets the additive extents.
	*/
	public void getAdditiveExtents(CoordContext PrtCon, Mvec pos, Mvec tl) {};
	/**
	* For a linear depictor, sets the preferred direction.
	*/
	public void preferredDirection(Mvec d1) {};
	/**
	* For a linear depictor, gets the positive direction of the segment.
	*/
	public Mvec getPositiveDirection() {
		return (null);
	}
	/**
	* For a linear depictor, sets the positive direction of the segment to <code>d1</code>.
	*/
	public void positiveDirection(Mvec d1) {};
	/**
	* To be deprecated.
	*/
	public void setEndTag() {};
	/**
	* Gets whether the depictor's foreground lines are visible.
	*/
	public boolean getFrontLineVisible() {
		return (FrontLineVisible);
	};
	/**
	* Gets whether the depictor's background lines are visible.
	*/
	public boolean getBackLineVisible() {
		return (BackLineVisible);
	};
	/**
	* Gets whether the depictor's text label is visible.
	*/
	public boolean getTextVisible() {
		return (TextVisible);
	};
	/**
	* Gets whether the depictor's controls are visible.
	*/
	public boolean getControlsVisible() {
		return (ControlsVisible);
	};
	/**
	* Sets whether the depictor's foreground lines are visible.
	*/
	public void setFrontLineVisible(boolean in) {
		FrontLineVisible = in;
	};
	/**
	* Sets whether the depictor's background lines are visible.
	*/
	public void setBackLineVisible(boolean in) {
		BackLineVisible = in;
	};
	/**
	* Sets whether the depictor's text label is visible.
	*/
	public void setTextVisible(boolean in) {
		TextVisible = in;
	};
	/**
	* Sets whether the depictor's controls are visible.
	*/
	public void setControlsVisible(boolean in) {
		ControlsVisible = in;
	};
	/**
	* Gets the foreground line color of the depictor.
	*/
	public Integer getFrontLineColor() {
		return (FrontLineColor);
	};
	/**
	* Gets the background line color of the depictor.
	*/
	public Integer getBackLineColor() {
		return (BackLineColor);
	};
	/**
	* Gets the color of the text label of the depictor.
	*/
	public Integer getTextColor() {
		return (TextColor);
	};
	/**
	* Sets the foreground line color of the depictor.
	*/
	public void setFrontLineColor(Integer in) {
		FrontLineColor = in;
	};
	/**
	* Sets the background line color of the depictor.
	*/
	public void setBackLineColor(Integer in) {
		BackLineColor = in;
	}
	/**
	* Sets the color of the text label of the depictor.
	*/
	public void setTextColor(Integer in) {
		TextColor = in;
	};
	/**
	* Checks whether the add tool is adding from this depictor.
	*/
	public void checkAdditFromControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		PointF OutPt) {
		};
	/**
	* Checks whether the add tool is adding to this depictor.
	*/
	public boolean checkAdditToControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		return (false);
	};
	/**
	* Checks whether the map tool is mapping from this depictor.
	*/
	public void checkMapFromControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		ClickRec CurDist,
		PointF InPt,
		PointF OutPt) {
		};
	/**
	* Checks whether the map tool is mapping to this depictor.
	*/
	public boolean checkMapToControl(
		DepictorPort ThePort,
		CoordContext PrtCon,
		boolean bound,
		PointF InPt,
		IntObj Active) {
		return (false);
	};

	/**
	* Gets the point size of the text label.
	*/
	public int getTextPtSz() {
		return (TextPtSz);
	};
	/**
	* Sets the point size of the text label.
	*/
	public void setTextPtSz(int in) {
		TextPtSz = in;
	};
	/**
	* Gets the set of depictors that this depictor delegates to.
	*/
	public HighLevelList<StdLowLevelList<DrawObj>,DrawObj> getDelegators() {
		return (Delegators);
	}
	/**
	* Gets the set of depictors that this depictor delegates from.
	*/
	public HighLevelList<StdLowLevelList<DrawObj>,DrawObj> getDelegated() {
		return (Delegated);
	}
	/**
	* Returns false if the depictor can be used as a named variable.  Otherwise, 
	* returns true.  If a depictor does not represent a variable (e.g. a ruler
	* is not a variable, it only measures spatial relationships), subclass this
	* method to return true.
	*/
	public static boolean getSelfNaming() {
		return (false);
	}

	/**
	* Gets the front line stroke used for rendering.
	*/
	public Paint getFrontLineStroke() {
		if( FrontLineStroke == null )
		{
			Paint pnt = new Paint();
			pnt.setStrokeCap( Cap.SQUARE );
			pnt.setStrokeJoin( Join.MITER );
			pnt.setStrokeMiter( 1.0f );
			pnt.setStrokeWidth( 1.0f );
			FrontLineStroke = pnt;
		}
		return (FrontLineStroke);
	}
	/**
	* Sets the front line stroke used by the rendering object to the one passed in the parameter.
	*/
	public void setFrontLineStroke(Paint in) {
		FrontLineStroke = in;
		BasicFrontLineStrokeWidth = in.getStrokeWidth();
	}
	/**
	* Sets the stroke used when rendering the object to a basic stroke with a certain width.
	*/
	public void setBasicFrontLineStroke(double in) {
		BasicFrontLineStrokeWidth = in;
		Paint pnt = new Paint();
		pnt.setStrokeCap( Cap.SQUARE );
		pnt.setStrokeJoin( Join.MITER );
		pnt.setStrokeMiter( 1.0f );
		pnt.setStrokeWidth( (float) in );
		FrontLineStroke = pnt;
	}

	/**
	* Gets the basic front line stroke width.
	*/
	public double getBasicFrontLineStrokeWidth() {
		return (BasicFrontLineStrokeWidth);
	}

	/**
	* Gets the back line stroke used for rendering.
	*/
	public Paint getBackLineStroke() {
		if( BackLineStroke == null )
		{
			Paint pnt = new Paint();
			pnt.setStrokeCap( Cap.SQUARE );
			pnt.setStrokeJoin( Join.MITER );
			pnt.setStrokeMiter( 1.0f );
			pnt.setStrokeWidth( 1.0f );
			BackLineStroke = pnt;
		}
		return (BackLineStroke);
	}
	/**
	* Sets the back line stroke used by the rendering object to the one passed in the parameter.
	*/
	public void setBackLineStroke(Paint in) {
		BackLineStroke = in;
		BasicBackLineStrokeWidth = in.getStrokeWidth();
	}
	/**
	* Sets the back line stroke used when rendering the object to a basic stroke with a certain width.
	*/
	public void setBasicBackLineStroke(double in) {
		BasicBackLineStrokeWidth = in;
		Paint pnt = new Paint();
		pnt.setStrokeCap( Cap.SQUARE );
		pnt.setStrokeJoin( Join.MITER );
		pnt.setStrokeMiter( 1.0f );
		pnt.setStrokeWidth( (float) in );
		BackLineStroke = pnt;
	}

	/**
	* Gets the basic back line stroke width.
	*/
	public double getBasicBackLineStrokeWidth() {
		return (BasicBackLineStrokeWidth);
	}

	/**
	* Gets a basic single-width stroke.
	*/
	public final Paint getSingleWidthStroke() {
		if( SingleWidthStroke == null )
		{
			Paint pnt = new Paint();
			pnt.setStrokeCap( Cap.SQUARE );
			pnt.setStrokeJoin( Join.MITER );
			pnt.setStrokeMiter( 1.0f );
			pnt.setStrokeWidth( 1.0f );
			SingleWidthStroke = pnt;
		}
		return (SingleWidthStroke);
	}

	protected static URL getDefaultUpImgUrl(Class cls) {
		String clname = cls.getName();
		int packlen = cls.getPackage().getName().length();
		String name = clname.substring(packlen + 1, clname.length());
		URL cl = cls.getResource("images/" + name + "Up.gif");
		return (cl);
	}

	/**
	* The width of the front line stroke used to render the object.  Holds -1 if the stroke
	* has not created by the {@link #setBasicStroke} method.
	*/
	private double BasicFrontLineStrokeWidth = 1;
	/**
	* The front line stroke used to render the object.
	*/
	private Paint FrontLineStroke;

	/**
	* The width of the back line stroke used to render the object.  Holds -1 if the stroke
	* has not created by the {@link #setBasicStroke} method.
	*/
	private double BasicBackLineStrokeWidth = 1;
	/**
	* The back line stroke used to render the object.
	*/
	private Paint BackLineStroke;

	/**
	* Basic single-width stroke.
	*/
	private static Paint SingleWidthStroke;

	protected final static int XOffset = 0;
	protected final static int YOffset = 0;
	transient private static final RectF TempRect = new RectF();

	public final static Integer DefColor = new Integer( Color.rgb(0, 128, 0) );
	public final static Integer DefBack = new Integer( Color.rgb(224, 224, 224) );
	protected Integer FrontLineColor = DefColor;
	protected Integer BackLineColor = DefBack;
	protected Integer TextColor = DefColor;
	private int TextPtSz = 12;

	protected boolean FrontLineVisible = true;
	protected boolean BackLineVisible = true;
	protected boolean TextVisible = true;
	protected boolean ControlsVisible = true;
	protected boolean DynamicJustify = true;

	private HighLevelList<StdLowLevelList<DrawObj>,DrawObj> Delegated = new HighLevelList<StdLowLevelList<DrawObj>,DrawObj>();
	private HighLevelList<StdLowLevelList<DrawObj>,DrawObj> Delegators = new HighLevelList<StdLowLevelList<DrawObj>,DrawObj>();
	private boolean NamedVar = true;
	private boolean TemporaryVar = true;
	private FlexString FragID = new FlexString();
	private transient MathImage MyImg = null;

};
