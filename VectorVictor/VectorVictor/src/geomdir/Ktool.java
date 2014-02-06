



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

import geomdir.engine.EngineConstants;

import java.net.URL;

import meta.*;
import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import verdantium.EtherEvent;
import verdantium.ProgramDirector;
import verdantium.mathimage.MathImage;
import verdantium.utils.VTextProperties;
import android.util.Log;
import android.view.MotionEvent;
import android.graphics.RectF;
import android.graphics.Rect;
import android.graphics.PointF;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed Ktool to support the new clustering.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner assertions and local assertions were not integrated.       | Made modifications to support the assertion integration in GeoDynRunner and GeomEngine.
*    | 11/16/2000            | Thorn Green (viridian_1138@yahoo.com)           | No mechanism existed to report when solver unable to solve equations | Added method to Ktool to report when solver failed to solve equations.
*    | 11/17/2000            | Thorn Green (viridian_1138@yahoo.com)           | Decided that modification made on 11/16 was flawed.                  | Changed the way solver errors are reported to fix problems.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | User interface needed updating.                                      | Made multiple changes, including moving origin support to the Orpt1 depictor.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 03/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | User interface simplification.                                       | Removed unit bargraph entry from Geom menu.
*    | 03/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | User interface simplification.                                       | Removed unit twistor entry from Geom menu.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 09/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 10/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Display control points when dragging.                                | Added code to display control points when dragging.
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
* Class that provides a consistent interface for tools that act on a
* depictor.  The nested subclasses provide the actual tools.
* @author Thorn Green
*/
public abstract class Ktool {
	/**
	 * Alias name for tool tips.
	 */
	protected String aliasName = "abcd";
	
	/**
	* Handles the mouse-down event that starts a drag operation.
	*/
	public abstract boolean handlePreDrag(MotionEvent anEvent, ToolPort in);

	/**
	* Handles a mouse-drag event.
	*/
	public abstract boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon);

	/**
	* Handles the mouse-up event that ends a drag operation.
	*/
	public abstract boolean handlePostDrag(MotionEvent anEvent, ToolPort in);

	/**
	* Returns whether the mode works by click rather than drag operations.
	*/
	public boolean getClickMode() {
		return (false);
	}

	/**
	* Gets the tool mode associated with the tool.
	*/
	public int getDrawingMode(ToolPort in) {
		return (in.getPrevToolMode());
	};

	/**
	* Handles a single-click event.
	*/
	public void handleSingleClick(MotionEvent anEvent, ToolPort in) {}

	/**
	* Allows the tool to draw something in the view after the depictors have been drawn.
	*/
	public void postDrawDepic(Canvas g, ToolPort in) {}
	/**
	* Allows the tool to draw something in the view after the depictor tools have been drawn.
	*/
	public void postDrawTools(Canvas g, Paint p, ToolPort in) {}
	/**
	* Gets the kind of cursor associated with the tool.
	*/
//	public int getCursorType() {
//		return (Cursor.DEFAULT_CURSOR);
//	}

	/**
	* Clears the tool.
	*/
	public void clear() {}

	/**
	 * Requests a change in the tool mode.
	 * 
	 * @return True iff it is OK to change the mode.
	 */
	public boolean requestToolModeChange(ToolPort in) {
		return (true);
	}
	
	public boolean requiresReplication() {
		return(false);
	}
	
	public String getAliasName(){
		return(aliasName);
	}
	
	public void setAliasName(String in){
		aliasName = in;
	}

	public Ktool() {}

	/**
	* Handles the end of the drag, and selects the depictor closest to the mouse event.
	*/
	public void postDragSelect(MotionEvent anEvent, ToolPort in) {
		PointF InPt =
			new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

		PointTracker MyTrack = new PointTracker(in);

		DrawObj MyObj = MyTrack.trackPoints(InPt.x, InPt.y, getDrawingMode(in), 1e+12);

		if (MyObj != null)
			in.setLastClickDepic(MyObj);
	};

	/**
	* Handles the throwing of an error or exception.
	* This should only be called if there is a bug in the code.
	*/
	public void handleThrow(Throwable in) {
		//VerdantiumUtils.handleThrow(in, null, null);
		Log.e("tag", "msg", in);
	}

	/**
	* Loads persistent properties.
	*/
	public void loadProperties(String key, VTextProperties MyProp) throws DataFormatException {};

	/**
	* Saves persistent properties.
	*/
	public void saveProperties(String key, VTextProperties MyProp) {};

	/* Begin nested classes. */

	/**
	* Implements the accessory debug tool.
	*/
	public static class AccessoryTransTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			boolean tmp = checkDisplayControls(LocEvent, in.getDispList(), in);

			// if ((in.getLastClick() == ToolPort.Match) && (in.getDragType() == ToolPort.DisplayControls))
			//	in.setLastClickDepic(DragDrw); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

			return (tmp);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			boolean dragSolverError = false;

			if (in.getLastClick() == ToolPort.Match) {
				PointF LocEvent =
					new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

				dragSolverError = dragDisplayControls(LocEvent, in, PrtCon);
			}

			return (dragSolverError);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			handlePostDragComp(anEvent, in, false);
			return (false);
		}

		protected void handlePostDragComp(MotionEvent anEvent, ToolPort in, boolean SingleClick) {
			if (DragRec != null) {
				if (DragRec.coordAdjust)
					in.endCoordAdjust();
			}

			if (!SingleClick) {
				if ((in.getLastClick() == ToolPort.Match) && (in.getDragType() == ToolPort.DisplayControls)) {
					in.setLastClickDepic(DragDrw);
				}
				else {
					if (in.getLastClick() != ToolPort.Match) {
						AccessoryTransTool.this.postDragSelect(anEvent, in);
					}
				}
			}

			if ((in.getLastClick() == ToolPort.Match) && (in.getDragType() == ToolPort.DisplayControls)) {
				if (DragRec != null) {
					if (DragRec.dyn != null) {
						DragRec.dyn.handlePostDrag();
					}
				}
			}
		}

		public void handleSingleClick(MotionEvent anEvent, ToolPort in) {
			handlePreDrag(anEvent, in);

			if ((in.getLastClick() == ToolPort.Match) && (in.getDragType() == ToolPort.DisplayControls)) {
				DragDrw.singleClickControl(
					in,
					DragDGM.getMyCoord(),
					in.getBoundMode(),
					DragRec,
					AccessoryTransTool.this.getDrawingMode(in));
				in.engineResolveConstraints();
				in.globalRepaint();
			}

			handlePostDragComp(anEvent, in, true);
		}

		ClickRec DragRec = null;
		DrawObj DragDrw = null;
		DGMNode DragDGM = null;

		/**
		*<B>Fun:</B> Checks whether the mouse is over a draggable display control hot-spot.
		*<P>
		*<B>In:</B> Mouse position InPt, display list DisplayList, current state of the canvas.<BR>
		*<B>Out:</B> The state of the canvas may be modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with display list structure.<BR>
		*<B>Post:</B> If the mouse is over a hot-spot in the display list, the identity of the depictor,
		*	and its ClickRec are stored in the state variables of the canvas.<BR>
		*@author Thorn Green
		*/
		protected boolean checkDisplayControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, ToolPort in) {
			boolean Done = false;
			boolean dragSolverError = false;
			double Priority = ClickRec.MIN_PRIORITY + 1;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				DragRec = null;
				DragDrw = null;
				DragDGM = null;

				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					ClickRec MRec =
						MyDrw.clickedInRegion(
							in,
							MyDGM.getMyCoord(),
							in.getBoundMode(),
							InPt,
							AccessoryTransTool.this.getDrawingMode(in));

					if (MRec != null) {
						if (MRec.clickPriority < Priority) {
							DragRec = MRec;
							DragDrw = MyDrw;
							DragDGM = MyDGM;
							Priority = MRec.clickPriority;
						}
					}

					DisplayList.left();
				}

				if ((DragRec != null) && (in.getLastClick() == GeomConstants.NoMatch)) {
					in.pushUndoObjChg(DragDrw);
					Mvec  mv = new Mvec();
					mv.setBasis1( InPt.x );
					mv.setBasis2( InPt.y );
					if (DragRec.dyn != null)
						dragSolverError = DragRec.dyn.link(in, mv);
					in.setDragType(ToolPort.DisplayControls);
					in.setUpDrag(true);
					in.setDragContext(DragDGM);
					in.setLastClick(GeomConstants.Match);
					if (DragRec.coordAdjust)
						in.startCoordAdjust();
				}

				DisplayList.right();
			}

			return (dragSolverError);
		};

		/**
		*<B>Fun:</B> Drags a display control given the mouse position.
		*<P>
		*<B>In:</B> Mouse position, current state of the canvas.<BR>
		*<B>Out:</B> Depictor DragDrw in current canvas state modified.<BR>
		*<B>Pre:</B> The DragDrw and DragRec of the canvas have been properly set.<BR>
		*<B>Post:</B> The depictor DragDrw will have its display control modified.<BR>
		*@author Thorn Green
		*/
		protected boolean dragDisplayControls(PointF InPt, ToolPort in, CoordContext PrtCon) {
			boolean dragSolverError = false;

			Mvec  mv = new Mvec();
			mv.setBasis1( InPt.x );
			mv.setBasis2( InPt.y );
			if (DragRec.dyn != null)
				dragSolverError = DragRec.dyn.dragExecute(in, mv);
			else
				DragDrw.dragDisplayControl(
					in,
					PrtCon,
					in.getBoundMode(),
					DragRec,
					AccessoryTransTool.this.getDrawingMode(in),
					InPt);

			/* if( DrawMode == 1 )
				in.engineResolveConstraints(); */

			return (dragSolverError);
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.FreeTransformationMode);
		};

		public static URL getUpImgUrl() {
			return (AccessoryTransTool.class.getResource("images/" + "Icn134.gif"));
		}

		public static URL getDnImgUrl() {
			return (AccessoryTransTool.class.getResource("images/" + "Icn133.gif"));
		}

	}

	/**
	* Implements the label drag tool.
	*/
	public static class LabelTool extends Ktool.AccessoryTransTool {

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.LabelMode);
		};

		public static URL getUpImgUrl() {
			return (LabelTool.class.getResource("images/" + "Icn152.gif"));
		}

		public static URL getDnImgUrl() {
			return (LabelTool.class.getResource("images/" + "Icn151.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			LabelToolHelp.run(in);
//		}

	}

	/**
	* Implements the "hand" tool for translating the coordinate system.
	*/
	public static class HandTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF WinEvent = new PointF(anEvent.getX(), anEvent.getY());

			preDragHand(WinEvent, in.getXOrigin(), in.getYOrigin(), 1, in);
			in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF WinEvent = new PointF(anEvent.getX(), anEvent.getY());

			manualDragHand(WinEvent, in.getXOrigin(), in.getYOrigin(), 1);
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			return (false);
		}

//		public int getCursorType() {
//			return (Cursor.HAND_CURSOR);
//		}

		int PrevX = 0;
		int PrevY = 0;
		final PointF PrevPt = new PointF(0, 0);

		/**
		*<B>Fun:</B> Prepares for the dragging of the origin with the "hand" tool.
		*<P>
		*<B>In:</B> Current state of the canvas, x-origin, y-origin, mouse point,
		*	drawing mode.<BR>
		*<B>Out:</B> Current state of canvas modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.  All input objects are valid.<BR>
		*<B>Post:</B> The current origin values will be stored for a possible subsequent 
		*	undo operation, and the state variables for future mouse movement will
		*	be set.<BR>
		*@author Thorn Green
		*/
		protected void preDragHand(PointF InPt, IntObj XOrigin, IntObj YOrigin, int DrawMode, ToolPort in) {
			in.pushUndoOrgChg();
			PrevX = XOrigin.value;
			PrevY = YOrigin.value;
			PrevPt.set(InPt.x, InPt.y);
		}

		/**
		*<B>Fun:</B> Handle the dragging of the mouse in HandMode.
		*<P>
		*<B>In:</B> Mouse point InPt, x-origin, y-origin, drawing mode, current state
		*	of the canvas.<BR>
		*<B>Out:</B> X-origin, y-origin modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state, the input objects are valid.<BR>
		*<B>Post:</B> The x-origin and y-origin will reflect the new mouse position.<BR>
		*@author Thorn Green
		*/
		protected void manualDragHand(PointF InPt, IntObj XOrigin, IntObj YOrigin, int DrawMode) {
			(XOrigin).value = (int) (InPt.x - PrevPt.x + PrevX);
			(YOrigin).value = (int) (InPt.y - PrevPt.y + PrevY);
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.HandMode);
		};

		public static URL getUpImgUrl() {
			return (HandTool.class.getResource("images/" + "Icn136.gif"));
		}

		public static URL getDnImgUrl() {
			return (HandTool.class.getResource("images/" + "Icn135.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			HandToolHelp.run(in);
//		}

	}

	/**
	* Implements the tool for erasing depictors and pin constraints.
	*/
	public static class ErasureTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkEraseControls(LocEvent, in.getDispList(), in);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			if (in.getLastClick() != ToolPort.Match) {
				ErasureTool.this.postDragSelect(anEvent, in);
			}

			return (false);
		}

//		public int getCursorType() {
//			return (Cursor.CROSSHAIR_CURSOR);
//		}

		/**
		*<B>Fun:</B> Checks whether the user has clicked on the hot-spot of an erase control.
		*<P>
		*<B>In:</B> Mouse point InPt, display list DisplayList, current state of the canvas.<BR>
		*<B>Out:</B> The DisplayList and/or state of the canvas may be modified.<BR>
		*<B>Pre:</B> All input objects are valid, the canvas is in a consistent state,
		*	DisplayList is consistent with display list structure.<BR>
		*<B>Post:</B> If an erase control has been clicked on, the appropriate erasure will be attempted.<BR>
		*@author Thorn Green
		*/
		protected void checkEraseControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, ToolPort in) {
			FlexString CurString = new FlexString();
			FlexString DelDepicString = new FlexString("\\");
			double Priority = ClickRec.MIN_PRIORITY + 1;
			boolean Done = false;
			DrawObj SelDrw = null;
			ClickRec EraseRec = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					ClickRec MRec =
						MyDrw.clickedInRegion(
							in,
							MyDGM.getMyCoord(),
							in.getBoundMode(),
							InPt,
							ErasureTool.this.getDrawingMode(in));

					if (MRec != null) {
						if (MRec.clickPriority < Priority) {
							EraseRec = MRec;
							SelDrw = MyDrw;
							Priority = MRec.clickPriority;
						}
					}

					DisplayList.left();
				}

				if ((EraseRec != null) && (in.getLastClick() == GeomConstants.NoMatch)) {
					SelDrw.delVar(in, EraseRec, CurString);
					in.setLastClick(GeomConstants.Match);
				}

				DisplayList.right();
			}

			if (CurString.strlen() != 0) {
				if (CurString.stcmp(DelDepicString) != 0) {
					if (CurString.getChar(0) != '\'') {
						CurString.setInsertPoint(0);
						CurString.insertChar('\'');
						CurString.setInsertPoint(CurString.strlen());
						CurString.insertChar('\'');
					}
					in.pushUndoSymChg();
					in.deleteExpression(CurString, EngineConstants.SUPERVISOR_MODE);
					in.updateExpressionListeners();
					in.updateVariableListeners();
				}
				else {
					in.deleteDepictor(SelDrw);
					in.updateVariableListeners();
				}
			}

			in.engineResolveConstraints();
			in.globalRepaint();
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.ErasureMode);
		};

		public static URL getUpImgUrl() {
			return (ErasureTool.class.getResource("images/" + "Icn154.gif"));
		}

		public static URL getDnImgUrl() {
			return (ErasureTool.class.getResource("images/" + "Icn153.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			EraseToolHelp.run(in);
//		}

	}

	/**
	* Changes the origin to a default position and unit size.
	*/
	public static class HomeTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			homeOrigin(in);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			return (false);
		}

		/**
		 * Requests a change in the tool mode.  Responds by
		 * changing the origin.
		 * 
		 * @return False.
		 */
		public boolean requestToolModeChange(ToolPort in) {
			in.pushUndoOrgChg();
			homeOrigin(in);
			in.invalidate(); // in.postInvalidate();
			return (false);
		}

		public void homeOrigin(ToolPort in) {
			in.getXOrigin().value = ( in.bounds().width() ) / 2;
			in.getYOrigin().value = ( in.bounds().height() ) / 2;
			in.setCoordRad(35);
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.HomeMode);
		};

		public static URL getUpImgUrl() {
			return (HomeTool.class.getResource("images/" + "Icn140.gif"));
		}

		public static URL getDnImgUrl() {
			return (HomeTool.class.getResource("images/" + "Icn139.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			HomeToolHelp.run(in);
//		}

	}

	/**
	* Implements a tool for pinning two depictors using an assignment arrow.
	*/
	public static class AssignTool extends Ktool {
		FlexString SrcStr = new FlexString();
		Object[] LHS = { null };
		Object[] RHS = { null };
		PointF OutEvent = new PointF(0, 0);
		
		public boolean requiresReplication() {
				return(true);
			}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkAssignFromControls(LocEvent, in.getDispList(), SrcStr, in.getStPt(), in);
			in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			if (SrcStr.strlen() != 0) {
				PointF LocEvent =
					new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

				manualDragAssign(LocEvent, OutEvent, 1, LHS, RHS, in.getActive(), in);
			}
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			AssignTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			Object[] LHS,
			Object[] RHS,
			IntObj Active,
			ToolPort in) {
			checkAssignToControls(InPt, in.getDispList(), LHS, RHS, Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			boolean Err = false;
			FlexString a1 = new FlexString(" ( ");
			FlexString a2 = new FlexString(" ) ");
			FlexString LHSs = new FlexString();
			FlexString RHSs = new FlexString();

			if ((in.getActive().value == 1)) {
				Object[] LHSa = (Object[]) (LHS[0]);
				in.insertFormattedString((Object[]) (LHSa[0]), LHSs);

				Object[] RHSa = (Object[]) (RHS[0]);
				in.insertFormattedString((Object[]) (RHSa[0]), RHSs);

				int CurPt = 0;
				while (CurPt < RHSs.strlen()) {
					if (RHSs.getChar(CurPt) == '$') {
						RHSs.setInsertPoint(CurPt);
						RHSs.deleteSectionAfter(1);
						a1.insertString(RHSs);
						SrcStr.insertString(RHSs);
						a2.insertString(RHSs);
						CurPt = RHSs.getInsertPoint();
					}
					else
						CurPt++;
				}

				in.pushUndoSymChg();
				Err = in.changeExpression(LHSs, RHSs, EngineConstants.SUPERVISOR_MODE);
				in.updateExpressionListeners();
				in.updateVariableListeners();

				if (Err) {
					try {
						int MyErr = in.getErrCode();
						Object[] myo = { new Integer(MyErr)};
						EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.showStdErrorAlerts, null, in);
						send.setParameter(myo);
						ProgramDirector.fireEtherEvent(send, null);
					}
					catch (Throwable ex) {
						handleThrow(ex);
					}
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkAssignToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			Object[] LHS,
			Object[] RHS,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						MyDrw.checkAssignToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, LHS, RHS, Active);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkAssignFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			FlexString NewString,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			in.setDraggingAssign(true);
			FlexString StrtStr = new FlexString("0.0");
			LHS[0] = null;
			RHS[0] = null;
			NewString.clearString();
			StrtStr.copyString(SrcStr);
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = /* InPt.x * InPt.x + InPt.y * InPt.y */
			1000000.0;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					MyDrw.checkAssignFromControl(
						in,
						MyDGM.getMyCoord(),
						in.getBoundMode(),
						CurDist,
						InPt,
						NewString,
						OutPt);

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.AssignMode);
		};

		public static URL getUpImgUrl() {
			return (AssignTool.class.getResource("images/" + "Icn144.gif"));
		}

		public static URL getDnImgUrl() {
			return (AssignTool.class.getResource("images/" + "Icn143.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			AssignToolHelp.run(in);
//		}

	}

	/**
	* Implements the translation tool.
	*/
	public static class TranslateTool extends AccessoryTransTool {

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.TranslateMode);
		};

		public static URL getUpImgUrl() {
			return (TranslateTool.class.getResource("images/" + "Icn156.gif"));
		}

		public static URL getDnImgUrl() {
			return (TranslateTool.class.getResource("images/" + "Icn155.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			TranslateToolHelp.run(in);
//		}

	}

	/**
	* Implements the rotation tool.
	*/
	public static class RotateTool extends AccessoryTransTool {

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.RotationMode);
		};

		public static URL getUpImgUrl() {
			return (RotateTool.class.getResource("images/" + "Icn159.gif"));
		}

		public static URL getDnImgUrl() {
			return (RotateTool.class.getResource("images/" + "Icn158.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			RotateToolHelp.run(in);
//		}

	}

	/**
	* Implements the dilation tool.
	*/
	public static class DilateTool extends AccessoryTransTool {

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.DilationMode);
		};

		public static URL getUpImgUrl() {
			return (DilateTool.class.getResource("images/" + "Icn161.gif"));
		}

		public static URL getDnImgUrl() {
			return (DilateTool.class.getResource("images/" + "Icn160.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			DilateToolHelp.run(in);
//		}

	}

	/**
	* Implements the free transformation tool.
	*/
	public static class FreeTransTool extends AccessoryTransTool {

		final static int ManualDragXAxis = 5;
		final static int ManualDragYAxis = 6;
		final static int DisplayControls = 7;

		private int DragType = DisplayControls;

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {

			if (in.getDisplayControlsShown()) {
				int OriginType = in.getOriginType();
				double CoordRad = in.getCoordRad();
				double[][] Axes = in.getAxes();

				RectF XAxisRect = in.instanceRect(CoordRad * Axes[0][0], CoordRad * Axes[0][1]);

				RectF YAxisRect = in.instanceRect(CoordRad * Axes[1][0], CoordRad * Axes[1][1]);

				in.setLastClick(GeomConstants.NoMatch);
				PointF LocEvent =
					new PointF(
						anEvent.getX() - in.getXOrigin().value,
						anEvent.getY() - in.getYOrigin().value);

				if ((in.getLastClick() == GeomConstants.NoMatch) && (XAxisRect.contains(LocEvent.x, LocEvent.y))) {
					in.pushUndoOrgChg();
					DragType = ManualDragXAxis;
					in.setLastClick(GeomConstants.Match);
				}

				if ((in.getLastClick() == GeomConstants.NoMatch)
					&& (YAxisRect.contains(LocEvent.x, LocEvent.y))
					&& (OriginType != GeomConstants.ScalarOriginType)) {
					in.pushUndoOrgChg();
					DragType = ManualDragYAxis;
					in.setLastClick(GeomConstants.Match);
				}

			}

			boolean err = false;

			if (in.getLastClick() == GeomConstants.NoMatch) {
				DragType = DisplayControls;
				err = super.handlePreDrag(anEvent, in);
			}

			return (err);
		}

		/**
		*<B>Fun:</B> Handles the dragging of the x-axis.
		*<P>
		*<B>In:</B> Mouse point, axes to modify, drawing mode.<BR>
		*<B>Out:</B> Axes modified.<BR>
		*<B>Pre:</B> Input objects valid.<BR>
		*<B>Post:</B> The axes will be modified to reflect the dragging.<BR>
		*@author Thorn Green
		*/
		protected void manualDragXAxis(PointF InPt, double Axes[][], int DrawMode) {
			double fltx = InPt.x;
			double flty = InPt.y;
			double Radius = Math.sqrt(fltx * fltx + flty * flty);
			Axes[0][0] = fltx / Radius;
			Axes[0][1] = flty / Radius;
			Axes[1][0] = Axes[0][1];
			Axes[1][1] = -Axes[0][0];
		};

		/**
		*<B>Fun:</B> Handles the dragging of the y-axis.
		*<P>
		*<B>In:</B> Mouse point, axes to modify, drawing mode.<BR>
		*<B>Out:</B> Axes modified.<BR>
		*<B>Pre:</B> Input objects valid.<BR>
		*<B>Post:</B> The axes will be modified to reflect the dragging.<BR>
		*@author Thorn Green
		*/
		protected void manualDragYAxis(PointF InPt, double Axes[][], int DrawMode) {
			double fltx = InPt.x;
			double flty = InPt.y;
			double Radius = Math.sqrt(fltx * fltx + flty * flty);
			Axes[1][0] = fltx / Radius;
			Axes[1][1] = flty / Radius;
			Axes[0][0] = -Axes[1][1];
			Axes[0][1] = Axes[1][0];
		};

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			if (true) {

				PointF LocEvent =
					new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

				if (in.getLastClick() == GeomConstants.Match)
					switch (DragType) {
						case DisplayControls :
							super.handleDrag(anEvent, in, PrtCon);
							break;
						case ManualDragXAxis :
							manualDragXAxis(LocEvent, in.getAxes(), 1);
							break;
						case ManualDragYAxis :
							manualDragYAxis(LocEvent, in.getAxes(), 1);
							break;
					}

			}

			return (false);
		}
		
		private final RectF MyLine = new RectF();

		public void postDrawDepic(Canvas g, ToolPort in) {
			if (in.getDisplayControlsShown()) {
				double ZeroVal = 0;
				double tempx;
				double tempy;

				int OriginType = in.getOriginType();
				Integer GreyIndex = in.getGreyIndex();
				double CoordRad = in.getCoordRad();
				double[][] Axes = in.getAxes();
				MathImage Ixs = in.getIxImg();
				MathImage Iys = in.getIyImg();

				switch (OriginType) {
					case ToolPort.GeoFrameOriginType :
					case ToolPort.VectorOriginType :
						tempx = CoordRad * Axes[0][0];
						tempy = CoordRad * Axes[0][1];
						MyLine.set((float)ZeroVal, (float)ZeroVal, (float)tempx, (float)tempy);
						if (Ixs != null)
							in.arrow(g, GreyIndex, MyLine, Ixs);

						tempx = CoordRad * Axes[1][0];
						tempy = CoordRad * Axes[1][1];
						MyLine.set((float)ZeroVal, (float)ZeroVal, (float)tempx, (float)tempy);
						if (Iys != null)
							in.arrow(g, GreyIndex, MyLine, Iys);
						break;

					case ToolPort.ScalarOriginType :
						tempx = CoordRad * Axes[0][0];
						tempy = CoordRad * Axes[0][1];
						MyLine.set((float)ZeroVal, (float)ZeroVal, (float)tempx, (float)tempy);
						if (Ixs != null)
							in.linearSeg(g, GreyIndex, MyLine, Ixs);
						break;
				}
			}
		}

		public void postDrawTools(Canvas g, Paint p, ToolPort in) {
			if (in.getDisplayControlsShown()) {
				double CoordRad = in.getCoordRad();
				double[][] Axes = in.getAxes();

				switch (in.getOriginType()) {
					case ToolPort.GeoFrameOriginType :
					case ToolPort.VectorOriginType :
						in.paintBlueKnob(g, p, CoordRad * Axes[0][0], CoordRad * Axes[0][1]);
						in.paintBlueKnob(g, p, CoordRad * Axes[1][0], CoordRad * Axes[1][1]);
						break;

					case ToolPort.ScalarOriginType :
						in.paintBlueKnob(g, p, CoordRad * Axes[0][0], CoordRad * Axes[0][1]);
						break;
				}

			}
		}

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.AccessoryTransMode);
		};

		public static URL getUpImgUrl() {
			return (FreeTransTool.class.getResource("images/" + "Icn134.gif"));
		}

		public static URL getDnImgUrl() {
			return (FreeTransTool.class.getResource("images/" + "Icn133.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			FreeTransToolHelp.run(in);
//		}

	}

	/**
	* Tool that locks the position of a depictor to a particular GCS point.
	*/
	public static class LockTool extends AssignTool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkLockFromControls(LocEvent, in.getVarList(), SrcStr, in.getStPt(), in);
			in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.AssignMode);
		};

		/**
		*<B>Fun:</B> "Checks" whether a position lock can be gained whether the current position
		*	(one always can).
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.<BR>
		*<B>Post:</B> InPt is copied into OutPt, and the expression string for InPt is assigned to
		*	NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkLockFromControls(
			PointF InPt,
			DGPHashMap DisplayList,
			FlexString NewString,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			in.setDraggingAssign(true);
			LHS[0] = null;
			RHS[0] = null;
			NewString.clearString();
			SrcStr.clearString();
			OutPt.x = InPt.x;
			OutPt.y = InPt.y;
			CurDist.curDist = InPt.x * InPt.x + InPt.y * InPt.y;

			Hexar MyHex = new Hexar();
			in.hexglo(InPt.x, InPt.y, MyHex.getGlo(), false, MyHex);
			Double xp = new Double(MyHex.getGlo().getBasis1());
			Double yp = new Double(MyHex.getGlo().getBasis2());

			FlexString TmpStr = new FlexString();
			TmpStr.setInsertPoint(0);
			(new FlexString(" ( ")).insertString(TmpStr);
			(new FlexString(xp.toString())).insertString(TmpStr);
			(new FlexString(" ) * #1 + ( ")).insertString(TmpStr);
			(new FlexString(yp.toString())).insertString(TmpStr);
			(new FlexString(" ) * #2 ")).insertString(TmpStr);

			TmpStr.copyString(SrcStr);

		};

		public static URL getUpImgUrl() {
			return (LockTool.class.getResource("images/" + "Icn199.gif"));
		}

		public static URL getDnImgUrl() {
			return (LockTool.class.getResource("images/" + "Icn198.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			LockToolHelp.run(in);
//		}

	}

	/**
	* Tool that magnifies (or "zooms in" on) a part of the view.
	*/
	public static class ZoomTool extends Ktool {
		boolean DraggingZoom = false;

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			in.getStPt().x = LocEvent.x;
			in.getStPt().y = LocEvent.y;
			in.getCrPt().x = LocEvent.x;
			in.getCrPt().y = LocEvent.y;
			DraggingZoom = true;
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			Rect Size = new Rect();
			in.retVisibleRect( Size );

			double x1 = in.getStPt().x;
			if (in.getCrPt().x < x1)
				x1 = in.getCrPt().x;
			double y1 = in.getStPt().y;
			if (in.getCrPt().y < y1)
				y1 = in.getCrPt().y;

			double DeltaX = in.getCrPt().x - in.getStPt().x;
			double DeltaY = in.getCrPt().y - in.getStPt().y;

			if (DeltaX < 0)
				DeltaX = -DeltaX;
			if (DeltaY < 0)
				DeltaY = -DeltaY;

			double delx = ((double) (Size.width())) / (DeltaX);
			double dely = ((double) (Size.height())) / (DeltaY);
			double xd1 = (Size.width()) / 2.0;
			double xd2 = (Size.height()) / 2.0;
			double del = delx;
			if (del > dely)
				del = dely;

			if ((in.getStPt().x == in.getCrPt().x) && (in.getStPt().y == in.getCrPt().y))
				del = 2.0;

			Hexar p = new Hexar();
			in.hexglo(
				(in.getCrPt().x + in.getStPt().x) / 2,
				(in.getCrPt().y + in.getStPt().y) / 2,
				p.getGlo(),
				false,
				p);

			in.pushUndoOrgChg();
			in.setCoordRad(in.getCoordRad() * del);
			in.hexloc(null, false, p);
			in.getXOrigin().value = (int) (xd1 - p.getLoc().x + Size.width() );
			in.getYOrigin().value = (int) (xd2 - p.getLoc().y + Size.height() );

			DraggingZoom = false;
			in.invalidate(); // in.postInvalidate();
			return (false);
		}

		public void postDrawTools(Canvas g, Paint p, ToolPort in) {
			if (DraggingZoom) {
				PointF StPt = in.getStPt();
				PointF CrPt = in.getCrPt();

				double x1 = StPt.x;
				if (CrPt.x < x1)
					x1 = CrPt.x;
				double y1 = StPt.y;
				if (CrPt.y < y1)
					y1 = CrPt.y;

				double DeltaX = CrPt.x - StPt.x;
				double DeltaY = CrPt.y - StPt.y;

				if (DeltaX < 0)
					DeltaX = -DeltaX;
				if (DeltaY < 0)
					DeltaY = -DeltaY;

				p.setStyle(Style.STROKE);
				p.setColor(in.getGreyIndex());
				g.drawRect((float)x1, (float)y1, (float)(x1+DeltaX), (float)(y1+DeltaY),p);
			}

		}

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.ZoomMode);
		};

		public static URL getUpImgUrl() {
			return (ZoomTool.class.getResource("images/" + "Icn201.gif"));
		}

		public static URL getDnImgUrl() {
			return (ZoomTool.class.getResource("images/" + "Icn200.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			MagnifyToolHelp.run(in);
//		}

	}

	/**
	* Tool that allows the color or other properties of the depictor to be edited.
	*/
	public static class ColorTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkColorControls(LocEvent, in.getDispList(), in);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			if (in.getLastClick() != ToolPort.Match) {
				ColorTool.this.postDragSelect(anEvent, in);
			}

			return (false);
		}

//		public int getCursorType() {
//			return (Cursor.CROSSHAIR_CURSOR);
//		}

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.ColorMode);
		};

		DrawObj DragDrw = null;

		/**
		*<B>Fun:</B> Determines whether the user has clicked on a hot-spot for a color control.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList.<BR>
		*<B>Out:</B> DisplayList member may be modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with display list structure.<BR>
		*<B>Post:</B> If a color hot-spot has been clicked on, the color dialog will be displayed for
		*	that depictor.<BR>
		*@author Thorn Green
		*/
		protected void checkColorControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, ToolPort in) {
			boolean Done = false;
			double Priority = ClickRec.MIN_PRIORITY + 1;
			in.setLastClick(GeomConstants.NoMatch);

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					Done = DisplayList.getHead();

					ClickRec MRec =
						MyDrw.clickedInRegion(
							in,
							MyDGM.getMyCoord(),
							in.getBoundMode(),
							InPt,
							ColorTool.this.getDrawingMode(in));

					if (MRec != null) {
						if (MRec.clickPriority < Priority) {
							/* pushUndoObjChg( MyDrw );
							DragType = ToolPort.DisplayControls;
							DragRec = MRec; */
							DragDrw = MyDrw;
							in.setLastClick(GeomConstants.Match);
							Priority = MRec.clickPriority;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			if (in.getLastClick() == GeomConstants.Match) {
				if (/* in.Nxt == null */
					true) {
					try {
						in.pushUndoColorChange(DragDrw);
						Object[] myo = { "Color Dialog", DragDrw };
						EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.showColorDialBox, null, in);
						send.setParameter(myo);
						ProgramDirector.fireEtherEvent(send, null);
					}
					catch (Throwable ex) {
						handleThrow(ex);
					}
				}
			}

			in.globalRepaint();
		};

		public static URL getUpImgUrl() {
			return (ColorTool.class.getResource("images/" + "Icn203.gif"));
		}

		public static URL getDnImgUrl() {
			return (ColorTool.class.getResource("images/" + "Icn202.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			PropertiesToolHelp.run(in);
//		}

	}

	/**
	* Tool that brings a depictor to the front.
	*/
	public static class ToFntTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkFntControls(LocEvent, in.getDispList(), in);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		};

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			if (in.getLastClick() != ToolPort.Match) {
				ToFntTool.this.postDragSelect(anEvent, in);
			}

			return (false);
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.ColorMode);
		};

//		public int getCursorType() {
//			return (Cursor.CROSSHAIR_CURSOR);
//		}

		/**
		*<B>Fun:</B> Determines whether the user has clicked on a hot-spot for a to-front control.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList.<BR>
		*<B>Out:</B> DisplayList member may be modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with display list structure.<BR>
		*<B>Post:</B> If a to-front hot-spot has been clicked on, the depictor will be brought to the front.<BR>
		*@author Thorn Green
		*/
		protected void checkFntControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, ToolPort in) {
			DGMNode DragDGM = null;
			boolean Done = false;
			double Priority = ClickRec.MIN_PRIORITY + 1;
			in.setLastClick(GeomConstants.NoMatch);

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					ClickRec MRec =
						MyDrw.clickedInRegion(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, ToolPort.ColorMode);

					if (MRec != null) {
						if (MRec.clickPriority < Priority) {
							/* pushUndoObjChg( MyDrw );
							DragType = ToolPort.DisplayControls;
							DragRec = MRec; */
							DragDGM = DisplayList.getNode();
							in.setLastClick(GeomConstants.Match);
							Priority = MRec.clickPriority;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			if (in.getLastClick() == GeomConstants.Match) {
				in.bringToFront(DragDGM.getMyDraw());
			}

			in.globalRepaint();
		};

		public static URL getUpImgUrl() {
			return (ToFntTool.class.getResource("images/" + "Icn205.gif"));
		}

		public static URL getDnImgUrl() {
			return (ToFntTool.class.getResource("images/" + "Icn204.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			ToFntToolHelp.run(in);
//		}

	}

	/**
	* Tool that sends a depictor to the back.
	*/
	public static class ToBakTool extends Ktool {

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkBakControls(LocEvent, in.getDispList(), in);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			return (false);
		};

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			if (in.getLastClick() != ToolPort.Match) {
				ToBakTool.this.postDragSelect(anEvent, in);
			}

			return (false);
		};

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.ColorMode);
		};

//		public int getCursorType() {
//			return (Cursor.CROSSHAIR_CURSOR);
//		}

		/**
		*<B>Fun:</B> Determines whether the user has clicked on a hot-spot for a to-back control.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList.<BR>
		*<B>Out:</B> DisplayList member may be modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with display list structure.<BR>
		*<B>Post:</B> If a to-back hot-spot has been clicked on, the depictor will be sent to the back.<BR>
		*@author Thorn Green
		*/
		protected void checkBakControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, ToolPort in) {
			DGMNode DragDGM = null;
			boolean Done = false;
			double Priority = ClickRec.MIN_PRIORITY + 1;
			in.setLastClick(GeomConstants.NoMatch);

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					ClickRec MRec =
						MyDrw.clickedInRegion(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, ToolPort.ColorMode);

					if (MRec != null) {
						if (MRec.clickPriority < Priority) {
							/* pushUndoObjChg( MyDrw );
							DragType = ToolPort.DisplayControls;
							DragRec = MRec; */
							DragDGM = DisplayList.getNode();
							in.setLastClick(GeomConstants.Match);
							Priority = MRec.clickPriority;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			if (in.getLastClick() == GeomConstants.Match) {
				in.sendToBack(DragDGM.getMyDraw());
			}

			in.globalRepaint();
		};

		public static URL getUpImgUrl() {
			return (ToBakTool.class.getResource("images/" + "Icn207.gif"));
		}

		public static URL getDnImgUrl() {
			return (ToBakTool.class.getResource("images/" + "Icn206.gif"));
		}

		/**
		* Optional method to display help in a component.
		*/
//		public static void displayVerdantiumHelp(VerdantiumComponent in) {
//			ToBakToolHelp.run(in);
//		}

	}

	/**
	* Tool that selects a set of depictors for the GeoPad project.
	*/
	public static class SelectionTool extends Ktool {
		boolean DraggingSelection = false;
		HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DropList = null;

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			in.getStPt().x = LocEvent.x;
			in.getStPt().y = LocEvent.y;
			in.getCrPt().x = LocEvent.x;
			in.getCrPt().y = LocEvent.y;
			DropList = new HighLevelList<StdLowLevelList<DGMNode>,DGMNode>();
			DraggingSelection = true;
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF StPt = in.getStPt();
			PointF CrPt = in.getCrPt();

			double x1 = StPt.x;
			if (CrPt.x < x1)
				x1 = CrPt.x;
			double y1 = StPt.y;
			if (CrPt.y < y1)
				y1 = CrPt.y;

			double DeltaX = CrPt.x - StPt.x;
			double DeltaY = CrPt.y - StPt.y;

			if (DeltaX < 0)
				DeltaX = -DeltaX;
			if (DeltaY < 0)
				DeltaY = -DeltaY;

			RectF MyRect = new RectF((float)x1, (float)y1, (float)(x1+DeltaX), (float)(y1+DeltaY));
			SelectionTracker MySel = new SelectionTracker(in);
			MySel.trackSelection(SelectionTool.this.getDrawingMode(in), MyRect, DropList);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			double x1 = in.getStPt().x;
			if (in.getCrPt().x < x1)
				x1 = in.getCrPt().x;
			double y1 = in.getStPt().y;
			if (in.getCrPt().y < y1)
				y1 = in.getCrPt().y;

			double DeltaX = in.getCrPt().x - in.getStPt().x;
			double DeltaY = in.getCrPt().y - in.getStPt().y;

			if (DeltaX < 0)
				DeltaX = -DeltaX;
			if (DeltaY < 0)
				DeltaY = -DeltaY;

			RectF MyRect = new RectF((float)x1, (float)y1, (float)(x1+DeltaX), (float)(y1+DeltaY));
			SelectionTracker MySel = new SelectionTracker(in);
			MySel.trackSelection(SelectionTool.this.getDrawingMode(in), MyRect, DropList);

			DraggingSelection = false;
			in.invalidate(); // in.postInvalidate();
			return (false);
		}

		public void postDrawTools(Canvas g, Paint p, ToolPort in) {
			if (DropList != null) {
				if (!(DropList.empty())) {
					boolean Done = false;
					DropList.searchHead();
					boolean bound = in.getBoundMode();
					int CurMode = SelectionTool.this.getDrawingMode(in);

					while (!Done) {
						DGMNode CurDGM = DropList.getNode();
						CurDGM.getMyDraw().drawYourTools(in, CurDGM.getMyCoord(), bound, g, p, CurMode);

						DropList.right();
						Done = DropList.getHead();
					}
				}
			}

			if (DraggingSelection) {
				PointF StPt = in.getStPt();
				PointF CrPt = in.getCrPt();

				double x1 = StPt.x;
				if (CrPt.x < x1)
					x1 = CrPt.x;
				double y1 = StPt.y;
				if (CrPt.y < y1)
					y1 = CrPt.y;

				double DeltaX = CrPt.x - StPt.x;
				double DeltaY = CrPt.y - StPt.y;

				if (DeltaX < 0)
					DeltaX = -DeltaX;
				if (DeltaY < 0)
					DeltaY = -DeltaY;

				p.setStyle(Style.STROKE);
				p.setColor(in.getGreyIndex());
				g.drawRect((float)x1, (float)y1, (float)(x1+DeltaX), (float)(y1+DeltaY),p);
			}

		}

		public HighLevelList<StdLowLevelList<DGMNode>,DGMNode> getDropList() {
			return (DropList);
		}

		public void clearDropList() {
			if (DropList != null)
				DropList.eraseAllInfo();
		}

		public void clear() {
			clearDropList();
		}

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.SelectionMode);
		};

//		public int getCursorType() {
//			return (Cursor.CROSSHAIR_CURSOR);
//		}

	}

	/**
	* Tool that adds depictors.
	*/
	public static class AdditTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkAdditFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			AdditTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkAdditToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.addAnimate, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkAdditToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp =
							MyDrw.checkAdditToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkAdditFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkAdditFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;
		};

		public static URL getUpImgUrl() {
			return (AdditTool.class.getResource("images/" + "Icn209.gif"));
		}

		public static URL getDnImgUrl() {
			return (AdditTool.class.getResource("images/" + "Icn208.gif"));
		}

	}

	/**
	* Tool that subtracts two depictors.
	*/
	public static class SubitTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.AdditionMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkSubitFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			SubitTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkSubitToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.subAnimate, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkSubitToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp =
							MyDrw.checkAdditToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkSubitFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkAdditFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;
		};

		public static URL getUpImgUrl() {
			return (SubitTool.class.getResource("images/" + "Icn211.gif"));
		}

		public static URL getDnImgUrl() {
			return (SubitTool.class.getResource("images/" + "Icn210.gif"));
		}

	}

	/**
	* Tool that compares two depictors.
	*/
	public static class ComparitTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.AdditionMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkComparitFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			ComparitTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkComparitToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.compareAnimate, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkComparitToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp =
							MyDrw.checkAdditToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkComparitFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkAdditFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;
		};

		public static URL getUpImgUrl() {
			return (ComparitTool.class.getResource("images/" + "Icn213.gif"));
		}

		public static URL getDnImgUrl() {
			return (ComparitTool.class.getResource("images/" + "Icn212.gif"));
		}

	}

	/**
	* Tool that multiplies two depictors.
	*/
	public static class MultitTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.AdditionMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkMultitFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			MultitTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkMultitToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.multiplyAnimate, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkMultitToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp =
							MyDrw.checkAdditToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkMultitFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkAdditFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;
		};

		public static URL getUpImgUrl() {
			return (MultitTool.class.getResource("images/" + "Icn215.gif"));
		}

		public static URL getDnImgUrl() {
			return (MultitTool.class.getResource("images/" + "Icn214.gif"));
		}

	}

	/**
	* Tool that divides two depictors.
	*/
	public static class DivitTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.AdditionMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkDivitFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			DivitTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkDivitToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.divideAnimate, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkDivitToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp =
							MyDrw.checkAdditToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkDivitFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkAdditFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;
		};

		public static URL getUpImgUrl() {
			return (DivitTool.class.getResource("images/" + "Icn217.gif"));
		}

		public static URL getDnImgUrl() {
			return (DivitTool.class.getResource("images/" + "Icn216.gif"));
		}

	}

	/**
	* Tool that applies a map between two depictors.
	*/
	public static class MapTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.MapMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkMapFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			MapTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkMapToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.makeMap, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkMapToControls(PointF InPt, HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList, IntObj Active, ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp = MyDrw.checkMapToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkMapFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkMapFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;

			if (Tmp != null) {}
		};

		public static URL getUpImgUrl() {
			return (MapTool.class.getResource("images/" + "Icn219.gif"));
		}

		public static URL getDnImgUrl() {
			return (MapTool.class.getResource("images/" + "Icn218.gif"));
		}

	}

	/**
	* Tool that creates a circular map between two depictors.
	*/
	public static class CircMapTool extends Ktool {
		PointF OutEvent = new PointF(0, 0);
		DrawObj objA = null;
		DrawObj objB = null;
		DGMNode objaDGM = null;
		DGMNode objbDGM = null;

		public int getDrawingMode(ToolPort in) {
			return (GeomConstants.MapMode);
		}

		public boolean handlePreDrag(MotionEvent anEvent, ToolPort in) {
			objA = null;
			objB = null;
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			checkCircMapFromControls(LocEvent, in.getDispList(), in.getStPt(), in);
			if (objA != null)
				in.setLastClick(GeomConstants.Match);
			in.setUpDrag(false);
			return (false);
		}

		public boolean handleDrag(MotionEvent anEvent, ToolPort in, CoordContext PrtCon) {
			PointF LocEvent =
				new PointF(anEvent.getX() - in.getXOrigin().value, anEvent.getY() - in.getYOrigin().value);

			manualDragAssign(LocEvent, OutEvent, 1, in.getActive(), in);

			return (false);
		}

		public boolean handlePostDrag(MotionEvent anEvent, ToolPort in) {
			otherClickAssignDrag(anEvent, in);

			CircMapTool.this.postDragSelect(anEvent, in);
			(in.getActive()).value = 0;
			return (false);
		}

		public boolean getClickMode() {
			return (true);
		}

		/**
		*<B>Fun:</B> Handle dragging the mouse in AssignMode.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void manualDragAssign(
			PointF InPt,
			PointF StPt,
			int DrawMode,
			IntObj Active,
			ToolPort in) {
			checkCircMapToControls(InPt, in.getDispList(), Active, in);
		};

		/**
		*<B>Fun:</B> Generates a new constraint following a graphical assignment operation,
		*	if successful.
		*<P>
		*<B>In:</B> Event record, current state of the canvas.<BR>
		*<B>Out:</B> Current state of the canvas may be modified.<BR>
		*<B>Pre:</B> The canvas is in a consistent state.<BR>
		*<B>Post:</B> If the graphical assignment operation was successful, a new constraint
		*	representing the operation will be generated.<BR>
		*@author Thorn Green
		*/
		protected void otherClickAssignDrag(MotionEvent anEvent, ToolPort in) {
			in.setDraggingAssign(false);

			if ((objA != null) && (objB != null)) {
				try {
					Object[] myo = { objA, objB, objaDGM, objbDGM };
					EtherEvent send = new GeomKitEtherEvent(this, GeomKitEtherEvent.makeCircMap, null, in);
					send.setParameter(myo);
					ProgramDirector.fireEtherEvent(send, null);
				}
				catch (Throwable ex) {
					handleThrow(ex);
				}

				in.globalRepaint();
			}
		};

		/**
		*<B>Fun:</B> Checks whether the mouse is over a hot-spot which can be assigned to.
		*<P>
		*<B>In:</B> Mouse point InPt, DisplayList of objects, NewString pointer, SuffixString pointer ,
		*	Active pointer.<BR>
		*<B>Out:</B> NewString, SuffixString, Active modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with the DisplayList structure.<BR>
		*<B>Post:</B> If the routine finds an object in DisplayList whose hot-spot is under the mouse
		*	position, then Active is set to 1, and the expression values of the hot-spot are put
		*	in NewString and SuffixString.  Otherwise, Active is set to zero.<BR>
		*@author Thorn Green
		*/
		protected void checkCircMapToControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			IntObj Active,
			ToolPort in) {
			boolean Done = false;

			objB = null;
			(Active).value = 0;
			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					if (Active.value == 0) {
						boolean tmp = MyDrw.checkMapToControl(in, MyDGM.getMyCoord(), in.getBoundMode(), InPt, Active);
						if (Active.value == 1) {
							objB = MyDrw;
							objbDGM = MyDGM;
						}
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

		};

		/**
		*<B>Fun:</B> Checks whether a assignment expression can be gained from a hot-spot near the
		*	current mouse position.
		*<P>
		*<B>In:</B> Mouse position in InPt, display list DisplayList, FlexString pointer NewString,
		*	locking point OutPt.<BR>
		*<B>Out:</B> NewString and OutPt modified.<BR>
		*<B>Pre:</B> All input objects are valid.  DisplayList is consistent with a display list.<BR>
		*<B>Post:</B> If a hot-spot near a depictor in DisplayList is found near InPt, 
		*	The position of the hot-spot is copied into OutPt, and the expression string for the 
		*	hot-spot is assigned to NewString.<BR>
		*@author Thorn Green
		*/
		protected void checkCircMapFromControls(
			PointF InPt,
			HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList,
			PointF OutPt,
			ToolPort in) {
			ClickRec CurDist = new ClickRec();
			boolean Done = false;
			OutPt.x = 0;
			OutPt.y = 0;
			CurDist.curDist = 10000;
			DrawObj Tmp = null;
			DGMNode TmpDGM = null;

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				DisplayList.left();
				while (!Done) {
					Done = DisplayList.getHead();

					DGMNode MyDGM = DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();

					double TmpDist = CurDist.curDist;
					MyDrw.checkMapFromControl(in, MyDGM.getMyCoord(), in.getBoundMode(), CurDist, InPt, OutPt);
					if (CurDist.curDist < TmpDist) {
						Tmp = MyDrw;
						TmpDGM = MyDGM;
						in.setDraggingAssign(true);
					}

					DisplayList.left();
				}

				DisplayList.right();
			}

			objA = Tmp;
			objaDGM = TmpDGM;

			if (Tmp != null) {}
		};

		public static URL getUpImgUrl() {
			return (CircMapTool.class.getResource("images/" + "Icn221.gif"));
		}

		public static URL getDnImgUrl() {
			return (CircMapTool.class.getResource("images/" + "Icn220.gif"));
		}

	}

	/**
	* Tool that implements the GeoPad mode of the GeoPad kit.
	*/
	public static class GeoPadTool extends Ktool.AccessoryTransTool {

		public int getDrawingMode(ToolPort in) {
			return (ToolPort.GeoPadMode);
		};
	}

	/* End nested Classes. */

}
