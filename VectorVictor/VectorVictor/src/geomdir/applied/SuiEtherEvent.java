




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


import java.beans.*;
import verdantium.*;




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
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | User interface changes.                                              | Changed the set of events to support the new user interface.
*    | 08/14/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeoSlate.                                                            | Added events for GeoSlate.
*    | 09/23/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add ExpandWedge/CollapseWedge (GeoCard).                             | Added ExpandWedge/CollapseWedge.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Added toggleUnitTac.                                                 | Added toggleUnitTac.
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
* Defines an Ether-Event suite for the symbolic user interface.
* @author Thorn Green
*/
public class SuiEtherEvent extends EtherEvent
	{
	public static final String realignGeom = "realignGeom";
	public static final String scriptModeChg = "scriptModeChg";
	public static final String createRuler = "createRuler";
	public static final String createRay = "createRay";
	public static final String createLine = "createLine";
	public static final String extractKey = "extractKey";
	public static final String copyKey = "copyKey";
	public static final String deleteKey = "deleteKey";
	public static final String pasteKey = "pasteKey";
	public static final String selectKey = "selectKey";
	public static final String changeLabelState = "changeLabelState";
	public static final String constrainKey = "constrainKey";
	public static final String createRulerDialog = "createRulerDialog";
	public static final String createUnitDialog = "createUnitDialog";
	public static final String setMaxWorkGeom = "setMaxWorkGeom";
	public static final String setMaxWorkAlg = "setMaxWorkAlg";
	public static final String setMaxFreeDepic = "setMaxFreeDepic";
	public static final String setMaxBoundDepic = "setMaxBoundDepic";
	public static final String makeUnitVisible = "makeUnitVisible";
	public static final String makeUnitInvisible = "makeUnitInvisible";
	public static final String nextLineKey = "nextLineKey";
	public static final String singleDepicOnly = "singleDepicOnly";
	public static final String toggleAllowClickSelect = "toggleAllowClickSelect";
	public static final String changeLineHeight = "changeLineHeight";
	public static final String backspaceKey = "backspaceKey";

	public static final String turnTraceOn = "turnTraceOn";
	public static final String removeTrace = "removeTrace";
	public static final String turnTraceOff = "turnTraceOff";
	public static final String clearTrace = "clearTrace";
	public static final String changeDepicNumLabel = "changeDepicNumLabel";
	public static final String negateDepic = "negateDepic";
	public static final String createVarFile = "createVarFile";
	public static final String changeDepicCircled = "changeDepicCircled";
	public static final String createLineHeightDialog = "createLineHeightDialog";
	public static final String algPanelSelect = "algPanelSelect";
	public static final String printFreeDepic = "printFreeDepic";
	public static final String printPreviewFreeDepic = "printPreviewFreeDepic";
	public static final String printBoundDepic = "printBoundDepic";
	public static final String printPreviewBoundDepic = "printPreviewBoundDepic";
	public static final String printAlgWork = "printAlgWork";
	public static final String printPreviewAlgWork = "printPreviewAlgWork";
	public static final String printGeomWork = "printGeomWork";
	public static final String printPreviewGeomWork = "printPreviewGeomWork";

	public static final String createScalar = "createScalar";
	public static final String createPhasor = "createPhasor";
	public static final String createVector = "createVector";
	public static final String createBivector = "createBivector";
	public static final String createScalarAtPosn = "createScalarAtPosn";
	public static final String createPhasorAtPosn = "createPhasorAtPosn";
	public static final String createVectorAtPosn = "createVectorAtPosn";
	public static final String proportionOp = "proportionOp";
	public static final String traceGraphOp = "traceGraphOp";
	public static final String varCreate = "varCreate";
	public static final String createNamedDepic = "createNamedDepic";

	public static final String sineDiag = "sineDiag";
	public static final String cosineDiag = "cosineDiag";
	public static final String bezierKey = "bezierKey";
	public static final String createBezier = "createBezier";
	public static final String toggleMultiplier = "toggleMultiplier";
	public static final String centerCurrentLine = "centerCurrentLine";
	public static final String hideDepic = "hideDepic";
	public static final String requestDragMode = "requestDragMode";
	public static final String requestPropertiesMode = "requestPropertiesMode";
	public static final String requestFreeTransformationMode = "requestFreeTransformationMode";
	public static final String requestTranslateMode = "requestTranslateMode";
	public static final String requestRotateMode = "requestRotateMode";
	public static final String requestDilateMode = "requestDilateMode";
	public static final String requestLabelMode = "requestLabelMode";
	public static final String requestSchemeChg = "requestSchemeChg";
	public static final String setScheme = "setScheme";

	public static final String expandWedge = "expandWedge";
	public static final String collapseWedge = "collapseWedge";
	public static final String toggleUnitTac = "toggleUnitTac";


	public SuiEtherEvent( Object source , String EtherID , Object param ,
		Object tar )
		{
		super( source , EtherID , param , tar );
		}


	public SuiEtherEvent( Object source , String EtherID , 
		Object old_param , Object param , Object tar )
		{
		super( source , EtherID , old_param , param , tar );
		}



	}


