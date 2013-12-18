



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

import verdantium.EtherEvent;

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
*    | 01/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed to provide a machanism for changing constraint solvers.       | Added a event for setting the constraint solver.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Update user interface to support online help.                        | Changed the set of events to support the new interface.
*    | 03/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | User interface simplification.                                       | Removed unit twistor entry from Geom menu.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added "optimize" event name.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 01/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | Move SystemTime to own depictor.                                     | Moved SystemTime to own depictor.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 05/11/2003            | Thorn Green (viridian_1138@yahoo.com)           | Automated optimization.                                              | Implemented automated optimization, and removed optimization GUIs.
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
* Suite of Ether Event types that apply to the geometry kits.  Note:
* many of these events to not apply to the GeoPad kit because
* the GeoPad kit uses a completely different paradigm.  For
* instance, algebra operations here do not apply to the GeoPad
* kit because the GeoPad kit performs that functionality in terms
* of an SUI.  So one would instead use GeoPad Ether Events that talk to 
* that kit's SUI.
* @author Thorn Green
*/
public class GeomKitEtherEvent extends EtherEvent {
	public static final String changeExpression = "changeExpression";
	public static final String addDepiction = "addDepiction";
	public static final String doMakeVar = "doMakeVar";
	public static final String delExpression = "delExpression";
	public static final String newVarComp = "newVarComp";
	public static final String deleteSymbol = "deleteSymbol";
	public static final String setSymbol = "setSymbol";
	public static final String setBkgnd = "setBkgnd";
	public static final String showColorDialBox = "showColorDialBox";
	public static final String showStdErrorAlerts = "showStdErrorAlerts";

	public static final String addAnimate = "addAnimate";
	public static final String subAnimate = "subAnimate";
	public static final String compareAnimate = "compareAnimate";
	public static final String multiplyAnimate = "multiplyAnimate";
	public static final String divideAnimate = "divideAnimate";
	public static final String makeMap = "makeMap";
	public static final String makeCircMap = "makeCircMap";
	public static final String changeDepicLabel = "changeDepicLabel";

	public static final String requestBkgndChg = "requestBkgndChg";
	public static final String setFreeDepiction = "setFreeDepiction";
	public static final String setBoundDepiction = "setBoundDepiction";
	public static final String showDisplayControls = "showDisplayControls";
	public static final String hideDisplayControls = "hideDisplayControls";
	public static final String showAdvancedControls = "showAdvancedControls";
	public static final String hideAdvancedControls = "hideAdvancedControls";
	public static final String requestExpressionChg = "requestExpressionChg";
	public static final String requestExpressionDel = "requestExpressionDel";
	public static final String requestSymbolDel = "requestSymbolDel";
	public static final String requestSymbolEdit = "requestSymbolEdit";
	public static final String createNewView = "createNewView";
	public static final String globalSynchDepth = "globalSynchDepth";
	public static final String toggleAntialias = "toggleAntialias";
	public static final String setAntialias = "setAntialias";
	public static final String toggleRenderQuality = "toggleRenderQuality";
	public static final String setRenderQuality = "setRenderQuality";
	public static final String requestOpenDialog = "requestOpenDialog";
	public static final String requestSave = "requestSave";
	public static final String requestSaveAs = "requestSaveAs";
	public static final String requestSaveACopyAs = "requestSaveACopyAs";
	public static final String setHomeOrigin = "setHomeOrigin";
	public static final String setRigorousClipping = "setRigorousClipping";
	public static final String setConstraintSolver = "setConstraintSolver";
	public static final String getConstraintSolvers = "getConstraintSolvers";

	public GeomKitEtherEvent(Object source, String EtherID, Object param, Object tar) {
		super(source, EtherID, param, tar);
	}

	public GeomKitEtherEvent(Object source, String EtherID, Object old_param, Object param, Object tar) {
		super(source, EtherID, old_param, param, tar);
	}

}
