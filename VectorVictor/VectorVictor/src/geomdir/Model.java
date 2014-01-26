



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

import geomdir.config.Config;
import geomdir.engine.DepicPlugin;
import geomdir.engine.EngineConstants;
import geomdir.engine.GeomEngine;
import geomdir.engine.SolverLinkage;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.EtherEventHandler;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.mathimage.SymListNode;
import verdantium.mathimage.SymMap;
import verdantium.mathimage.SymbolHolder;
import verdantium.utils.IllegalInputException;
import verdantium.utils.VTextProperties;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;


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
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner was showing too much information to the depictors.         | Modified DynRunner so that it doesn't show engine classes to depictors.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Modified the model code to work in terms of the new clustering.
*    | 11/17/2000            | Thorn Green (viridian_1138@yahoo.com)           | Decided that modification made on 11/16 was flawed.                  | Changed the way solver errors are reported to fix problems.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Compatibility problems between GeomKit and new constraint solvers.   | Made changes so that the two would be more compatible.
*    | 01/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed to add a machanism for setting the constraint solver.         | Added event implementation for setting the constraint solver.
*    | 02/04/2001            | Thorn Green (viridian_1138@yahoo.com)           | handleDestroy() not getting propagated properly.                     | Added propagation code.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | New interface to support online help.                                | Made multiple changes to support new interface.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 10/19/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expanded window menus for GeoFrame/GeoPad.                           | Added functionality relating to window menus.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/13/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Switched OrderedList classes to JCF.
*    | 12/15/2001            | Thorn Green (viridian_1138@yahoo.com)           | Small bugs in MathImage editors.                                     | Fixed the bugs.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added support for optimization.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Some operations are not compatible with BlueToh.                     | Improved compatibility.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed adaptive relate support for GeoCard.                          | Added adaptive relate support.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Reduce web footprint.                                                | Made changes to reduce footprint.
*    | 01/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | Move SystemTime to own depictor.                                     | Moved SystemTime to own depictor.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 04/08/2003            | Thorn Green (viridian_1138@yahoo.com)           | Discovery of depictors.                                              | Added code to implement discovery of depictors.
*    | 04/10/2003            | Thorn Green (viridian_1138@yahoo.com)           | Problem with help in discovered depictors.                           | Made a small code change to fix this.
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

/* Known object common law violator */

/**
* Holds all information associated with a particular model.  Synchronizes
* all views associated with the model.
* @author Thorn Green
*/
public class Model extends Object implements IFactoryModel, EtherEventHandler, Externalizable {

	/**
	* Adds or changes an expression.
	*/
	public boolean changeExpression(FlexString VarName, FlexString ExpressionString, int MyMode) {
		return (
			(getMyEngine()).changeExpression(
				VarName,
				ExpressionString,
				this,
				"createVisit1",
				this,
				"deleteVisit1",
				MyMode));
	}

	/**
	* Adds or changes an expression.
	*/
	public boolean adaptiveRelate(FlexString VarName, FlexString ExpressionString, int MyMode) {
		return (
			(getMyEngine()).adaptiveRelate(
				VarName,
				ExpressionString,
				this,
				"createVisit1",
				this,
				"deleteVisit1",
				MyMode));
	}

	/**
	* Deletes an expression.
	*/
	public boolean deleteExpression(FlexString VarName, int MyMode) {
		return ((getMyEngine()).deleteExpression(VarName, this, "deleteVisit1", MyMode));
	}

	/**
	* Adds an implicit depictor constraint.
	*/
	public boolean addImplicitConstraint(FlexString LHS, FlexString RHS, FlexString FKey, int FID) {
		return ((getMyEngine()).addImplicitConstraint(LHS, RHS, FKey, FID, this, "createVisit1", this, "deleteVisit1"));
	}

	/**
	* Deletes all implicit depictor constraints related to a particular key.
	*/
	public boolean dropAllImplicitConstraints(FlexString FKey) {
		LockTemporaryDeletion = true;
		boolean ret = (getMyEngine()).dropAllImplicitConstraints(FKey, this, "deleteVisit1");
		LockTemporaryDeletion = false;
		return (ret);
	}

	/**
	* Attempts an undo on the previous engine operation.  This operation is
	* not filly implemented at this time.
	*/
	public void popUndo() {
		(getMyEngine()).popUndo(this, "createVisit1", this, "deleteVisit1");
	}

	/**
	* Turns the linker of the engine on or off.  This should be
	* used with case.
	*/
	public boolean engineSetLinkOn(boolean in) {
		return ((getMyEngine()).setLinkOn(in, this, "createVisit1", this, "deleteVisit1"));
	}

	/**
	* Outputs the constraint system.
	*/
	public void writeConstraintSystem() {
		(getMyEngine()).writeConstraintSystem();
	}

	/**
	* Synchronizes all SUI-related elements, such as expression list panels.
	*/
	public void suiSync() {
		MyEngine.resolveConstraints();
		updateVariableListeners();
		updateExpressionListeners();
		globalRepaint();
	}

	/**
	* Creates a depictor with Human-Readable type name AlName, user variable name Vname,
	* and location (x,y).
	*/
	public DrawObj createDepictor(String AlName, String Vname, int x, int y) {
		DrawObj Ret = null;
		FlexString VectName = new FlexString();
		PointF OutPt = new PointF(x, y);
		FlexString InName = new FlexString(Vname);

		boolean Err = MyEngine.verifyVariable(InName, EngineConstants.USER_MODE);

		if (!Err) {
			MyEngine.extractVariable(InName, 0, InName.strlen(), VectName);

			DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
			MyFac.setNewVectName(VectName);
			MyFac.setDepicClass(AlName);
			MyFac.setPlaceAt(OutPt);
			Ret = MyFac.createDepictor();
		}

		return (Ret);
	}

	/**
	* Creates a depictor with class AlName, user variable name Vname,
	* and location (x,y).
	*/
	public DrawObj createDepictor(Class AlName, boolean selfNaming, String Vname, int x, int y) {
		DrawObj Ret = null;
		FlexString VectName = new FlexString();
		PointF OutPt = new PointF(x, y);
		FlexString InName = new FlexString(Vname);

		boolean Err = MyEngine.verifyVariable(InName, EngineConstants.USER_MODE);

		if (!Err) {
			MyEngine.extractVariable(InName, 0, InName.strlen(), VectName);

			DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
			MyFac.setNewVectName(VectName);
			MyFac.setDepicClass(AlName, selfNaming);
			MyFac.setPlaceAt(OutPt);
			Ret = MyFac.createDepictor();
		}

		return (Ret);
	}

	/**
	*<B>Fun:</B> Handles a request from the engine to create a constriant on a
	*	depictor or depictor symbol.
	*<P>
	*<B>In:</B> Current state of canvas, name, multivector
	*	and mable pointer of the new constraint.<BR>
	*<B>Out:</B> Current canvas state modified.  Pointer to
	*	modified object returned.<BR>
	*<B>Pre:</B> Input objects valid, the canvas is in a consistent
	*	state.  The particular depictor port is not
	*	allready constrained.<BR>
	*<B>Post:</B> The constraint will be applied to the current
	*	canvas state.  This is to be used only by the engine.<BR>
	*@author Thorn Green
	*/
	public Meta createVisit1(FlexString VarName, Mvec Vect, IntObj Mable, IntObj Domain, IntObj IODef) {
		Meta MyMeta = null;
		FlexString BaseName = new FlexString();
		FlexString FragName;

		FlexString Prefix = getPrefix(VarName);
		removePrefix(VarName, BaseName);
		FragName = getFragName(VarName);
		markInsertNode(BaseName, getVarList());
		FragNode MyFrag = (FragNode) (getVarList().getFrag(BaseName));

		if ((new FlexString()).stcmp(Prefix) != 0) {
			DGMHashMap MyList = MyFrag.getFragMap();
			DGMNode myDGM = MyList.getDGM(FragName);
			DrawObj MyDrawObj = myDGM.getMyDraw();
			MyDrawObj.setValuePort(Prefix);
			(MyDrawObj.portGetVect()).copyAllInfo(Vect);
			if (((MyDrawObj.portGetSelfAlloc()).value & DepictorPort.SELF_ALLOC_DROPABLE) != 0) {
				(MyDrawObj.portGetVect()).eraseAll();
				MyDrawObj.portSetMovable(null); /* delete */
			}
			MyDrawObj.portInitPtrs(VarName, Mable, Vect, Domain, IODef);
			(MyDrawObj.portGetSelfAlloc()).value = 0;
			MyMeta = MyDrawObj;
		}
		else {
			MyMeta = MyFrag;
			(MyFrag.getVect()).copyAllInfo(Vect);
			MyFrag.setVectName(VarName);
			MyFrag.setVect(Vect);
			MyFrag.setMovable(Mable);
			MyFrag.setDomain(Domain);
			MyFrag.setIODef(IODef);
			MyFrag.getRealSelfAlloc().value = 0;
			int cnt = updateConstraints(MyFrag, VarName, Mable, Vect, Domain, IODef);
			int kcnt = 0;
			if ((cnt == 0) || (cnt > 1))
				kcnt = DepictorPort.SELF_ALLOC_DROPABLE;
			MyFrag.getSelfAlloc().value = kcnt;
			refigureAlloc(MyFrag);
		}

		return (MyMeta);
	};

	/**
	*<B>Fun:</B> Handles a constraint deletion request on a depictor
	*	or the depictor's symbol from the engine.
	*<P>
	*<B>In:</B> Depictor pointer, assignment variable of the constraint,
	*	current state of the canvas.<BR>
	*<B>Out:</B> Current state of canvas modified.<BR>
	*<B>Pre:</B> Input objects valid, canvas in a consistent state,
	*	requested object exists in current depictor list.<BR>
	*<B>Post:</B> The constraint will be deleted.  To be used only by the engine.<BR>
	*@author Thorn Green
	*/
	public void deleteVisit1(Meta in, FlexString VarName) {
		if (in instanceof FragNode)
			deleteVisitFrag((FragNode) in, VarName);
		if (in instanceof DrawObj)
			deleteVisitDraw(in, VarName);
	};

	/**
	*<B>Fun:</B> Handles a constraint deletion request on a depictor's symbol.
	*<P>
	*<B>In:</B> Depictor pointer, assignment variable of the constraint,
	*	current state of the canvas.<BR>
	*<B>Out:</B> Current state of canvas modified.<BR>
	*<B>Pre:</B> Input objects valid, canvas in a consistent state,
	*	requested object exists in current depictor list.<BR>
	*<B>Post:</B> The constraint will be deleted.<BR>
	*@author Thorn Green
	*/
	protected void deleteVisitFrag(Meta in, FlexString VarName) {
		FragNode MyFrag = getVarList().getFrag(VarName);
		boolean Found = (MyFrag != null);
		if (Found)
			modifyActiveFrag(VarName);
		else
			System.out.println("Not Found!!!!!!!!!!!!!!!!!!!!!!!!!");
	};

	/**
	*<B>Fun:</B> Handles a constraint deletion request on a depictor.
	*<P>
	*<B>In:</B> Depictor pointer, assignment variable of the constraint,
	*	current state of the canvas.<BR>
	*<B>Out:</B> Current state of canvas modified.<BR>
	*<B>Pre:</B> Input objects valid, canvas in a consistent state,
	*	requested object exists in current depictor list.<BR>
	*<B>Post:</B> The constraint will be deleted.<BR>
	*@author Thorn Green
	*/
	protected void deleteVisitDraw(Meta in, FlexString VarName) {
		FlexString tmp = new FlexString();
		DrawObj MyObj = (DrawObj) in;
		MyObj.getVectName().copyAllInfo(tmp);
		FragNode MyFrag = getVarList().getFrag(tmp);
		boolean Found1 = (MyFrag != null);
		if (Found1) {
			DGMNode myDGM = MyFrag.getFragMap().getDGM(MyObj.getFragID());
			boolean Found = myDGM != null;
			if (Found) {
				modifyActiveNode(VarName, MyObj.getFragID(), MyFrag.getFragMap());
			}

			if (MyFrag.getFragMap().isEmpty()) {
				getVarList().remove(tmp);
			}
		}

	};

	/**
	* Creates a depictor without a user variable name for the current
	* depictor mode.  Places the depictor at the location indicated in the parameter.
	*/
	public DrawObj createNonNamedVar(PointF InPt, int InAltMode) {
		DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
		MyFac.setDepicClass(InAltMode);
		MyFac.setNewVectNotNamed();
		MyFac.setPlaceAt(InPt);
		DrawObj tmp = MyFac.createDepictor();
		return (tmp);
	}

	/**
	* Creates a depictor, without a user variable name, of class DepicClass.  If PlaceAt is true,
	* place the depictor at location InPt.
	*/
	public DrawObj createNonNamedVar(PointF InPt, Class DepicClass, boolean PlaceAt) {
		DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
		MyFac.setDepicClass(DepicClass, false /* Don't Care */
		);
		MyFac.setNewVectNotNamed();
		if (PlaceAt)
			MyFac.setPlaceAt(InPt);
		DrawObj tmp = MyFac.createDepictor();
		return (tmp);
	}

	/**
	* Creates a depictor, without a user variable name, of class Name.  If PlaceAt is true,
	* place the depictor at location InPt.
	*/
	public DrawObj createNonNamedVar(PointF InPt, String Name, boolean PlaceAt) {
		DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
		MyFac.setDepicClass(Name);
		MyFac.setNewVectNotNamed();
		if (PlaceAt)
			MyFac.setPlaceAt(InPt);
		DrawObj tmp = MyFac.createDepictor();
		return (tmp);
	}

	public boolean insertNewVar(FlexString Vari) {
		return (getVarList().insertNode(Vari));
	}

	/**
	* Deletes a depictor from the model.
	*/
	public boolean deleteDepictor(DrawObj SelDrw) {
		FlexString tmp = new FlexString();
		SelDrw.getVectName().copyAllInfo(tmp);
		FragNode MyFrg = getVarList().getFrag(tmp);
		boolean Found = (MyFrg != null);
		Found = Found && (SelDrw.noSymBindings());
		DGMNode MyDGM = null;

		if (Found) {
			MyDGM = MyFrg.getFragMap().getDGM(SelDrw.getFragID());
			Found = Found && (MyDGM != null);
		}

		if (Found) {
			DrawObj MyDrw = MyDGM.getMyDraw();
			SymTarget.pushUndoDeleteDepic(MyDrw);
			dropAllImplicitConstraints(MyDGM.getMyDraw().getFragID());
			pullFromDrawingList(MyDGM.getMyDraw());
			MyFrg.getFragMap().remove(MyDrw.getFragID());
			refigureAlloc(MyFrg);
			if (MyFrg.getFragMap().isEmpty()) {
				getVarList().remove(tmp);
			}
		}

		return (!Found);
	}

	/**
	* Gets the version prefix for the writing of ".geo" files.
	*/
	public String globalPersistencePrefix() {
		String tmp = "Geom11/96A";
		return (tmp);
	}

	/**
	* Creates depictors from the properties list of a ".geo" file.
	*/
	public int performDepictorCreation(VTextProperties MyProp) throws DataFormatException {
		int count;
		int num_depics = 0;

		DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
		MyFac.setReplaceUnqID(true);
		MyFac.setTxtImg(false);

		String DKey = globalPersistencePrefix() + ".DispList.NumDepics";
		boolean DispInsert = (MyProp.getProperty(DKey)) == null;
		MyFac.setInsertIntoDisplayList(DispInsert);

		String MyKey = globalPersistencePrefix() + ".DepicList.NumDepics";
		num_depics = MyProp.getInt(MyKey);

		for (count = 0; count < num_depics; ++count) {
			String key = globalPersistencePrefix() + ".DepicList" + ".Depic_" + (new Integer(count)).toString();

			int UID = MyProp.getInt(key + ".UnqID");
			String AlName = MyProp.getPropertyNonNull(key + ".AliasName");
			String DName = MyProp.getPropertyNonNull(key + ".DepictorName");

			MyFac.setNewVectName(DName);
			MyFac.setDepicClass(AlName);
			MyFac.setUnqID(UID);
			MyFac.createDepictor();

//			MyTarget.setLoadFract(count + 1, num_depics);
		}

		return (num_depics);
	}

	/**
	* Crestes the display list for the view of the model.
	*/
	public void performDisplayCreation(VTextProperties MyProp) throws DataFormatException {
		String MyKey = globalPersistencePrefix() + ".DispList.NumDepics";
		boolean tmp = (MyProp.getProperty(MyKey)) != null;

		if (tmp)
			performDisplayCreationComp(MyProp);
	}

	/**
	* Creates the display list for the view of the model, assuming that the display list exists in the ".geo" file.
	*/
	protected void performDisplayCreationComp(VTextProperties MyProp) throws DataFormatException {
		int count;
		int num_depics = 0;

		String MyKey = globalPersistencePrefix() + ".DispList.NumDepics";
		num_depics = MyProp.getInt(MyKey);

		for (count = 0; count < num_depics; ++count) {
			String key = globalPersistencePrefix() + ".DispList" + ".Depic_" + (new Integer(count)).toString();

			String UID = MyProp.getPropertyNonNull(key + ".UnqID");
			String DName = MyProp.getPropertyNonNull(key + ".DepictorName");

			FlexString Vari = new FlexString(DName);
			FlexString kID = new FlexString(UID);

			FragNode MyFrg = getVarList().getFrag(Vari);
			DGMNode frag = MyFrg.getFragMap().getDGM(kID);
			DrawObj MyDrw = frag.getMyDraw();

			displayAppend(MyDrw);
//			MyTarget.setLoadFract(count + 1, num_depics);
		}

	}

	/**
	* Loads the properties for each depictor.
	*/
	protected void loadDepictorProperties(GeomKit thePort, VTextProperties MyProp, int num_ele)
		throws DataFormatException {
/*		Iterator ita = getVarList().values().iterator();
		String key = globalPersistencePrefix();
		int cnt = 0;

		while (ita.hasNext()) {
			FragNode tempaz = (FragNode) (ita.next());
			tempaz.loadProperties(SymTarget, MyProp, key + ".Fragments");
			DGMHashMap FragMap = tempaz.getFragMap();
			Iterator<DGMNode> it = FragMap.values().iterator();
			while (it.hasNext()) {
				DrawObj MyDrw = it.next().getMyDraw();
				MyDrw.loadProperties(SymTarget, MyProp);
				String Str = (MyDrw.getVectName()).exportString();
				try {
					MyDrw.setDepicImage(
						makeDepicMathImage(Str, MyDrw.getTextColor(), MyDrw.getTextPtSz(), MyDrw.getNamedVar()));
				}
				catch (Exception ex) {
					throw (new DataFormatException(ex));
				}
				cnt++;
				MyTarget.setLoadFract(cnt, num_ele);
			}
		} */

	};

	/**
	* Saves the properties for each depictor.
	*/
	public void saveDepictorProperties(GeomKit thePort, VTextProperties MyProp) {
/*		Iterator ita = getVarList().values().iterator();
		String key = globalPersistencePrefix();
		IntObj MyIntObj = new IntObj();
		MyIntObj.value = 0;

		while (ita.hasNext()) {
			FragNode tempaz = (FragNode) (ita.next());
			tempaz.saveProperties(SymTarget, MyProp, key + ".Fragments");
			DGMHashMap FragMap = tempaz.getFragMap();
			Iterator<DGMNode> it = FragMap.values().iterator();
			while (it.hasNext()) {
				DrawObj MyDrw = it.next().getMyDraw();
				MyDrw.saveProperties(SymTarget, MyProp);
				saveDepictorProperties(MyProp, MyDrw, MyIntObj);
			}
		}

		String MyKey = key + ".DepicList.NumDepics";
		MyProp.putInt(MyKey, MyIntObj.value); */
	};

	/**
	* Saves the properties for a particular depictor.
	*/
	protected void saveDepictorProperties(VTextProperties MyProp, DrawObj MyDrw, IntObj Cnt) {
		String key = globalPersistencePrefix() + ".DepicList" + ".Depic_" + (new Integer(Cnt.value)).toString();
		FlexString FrgID = new FlexString();
		MyDrw.getFragID().copyAllInfo(FrgID);

		FrgID.setInsertPoint(0);
		FrgID.deleteSectionAfter(1);
		FrgID.setInsertPoint(FrgID.strlen());
		FrgID.deleteSectionBefore(1);

		String AliasName = getDepicStore().getAliasName(MyDrw.getClass());

		MyProp.put(key + ".UnqID", FrgID.exportString());
		MyProp.put(key + ".AliasName", AliasName);
		MyProp.put(key + ".DepictorName", (MyDrw.getVectName()).exportString());

		Cnt.value = Cnt.value + 1;
	}

	/**
	* Loads all symbol properties.
	*/
	public void loadSymbolProperties(String key, VTextProperties MyProp) throws DataFormatException {
		SymMap MyMap = GloSymMap;
		performSymbolCreation(key, MyMap, MyProp);
	};

	/**
	* Loads all symbol properties.
	*/
	protected void performSymbolCreation(String key, SymMap MyMap, VTextProperties MyProp) throws DataFormatException {
		String MyKey = key + ".SymList.NumSymbols";
		boolean tmp = (MyProp.getProperty(MyKey)) != null;

		if (tmp)
			performSymbolCreationComp(key, MyMap, MyProp);
	}

	/**
	* Creates all symbols stored in the ".geo" file.
	*/
	protected void performSymbolCreationComp(String InKey, SymMap MyMap, VTextProperties MyProp)
		throws DataFormatException {
		int count;
		int num_depics = 0;

		String MyKey = InKey + ".SymList.NumSymbols";
		num_depics = MyProp.getInt(MyKey);

		for (count = 0; count < num_depics; ++count) {
			String key = InKey + ".SymList" + ".Symbol_" + (new Integer(count)).toString();

			String InTag = MyProp.getPropertyNonNull(key + ".SymName");
			String InSym = MyProp.getPropertyNonNull(key + ".Symbol");

			FlexString MyTag = new FlexString(InTag);
			FlexString MySym = new FlexString(InSym);
			MathImage.chkParse(MySym, MathImage.UserMode);

			MyMap.putSym(MyTag);
			SymListNode TmpNode = (SymListNode) (MyMap.getSym(MyTag));
			TmpNode.setSymbol(MySym);
//			MyTarget.setLoadFract(count + 1, num_depics);
		}

		updateSymbolListeners();
	}

	/**
	* Saves all symbols.
	*/
	public void saveSymbolProperties(String key, VTextProperties MyProp) {
		SymMap Map = GloSymMap;
		saveSymbolProperties(key, Map, MyProp);
	};

	/**
	* Loads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		/* try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			MyEngine = (GeomEngine) (myv.getProperty("MyEngine"));
			VersionBuffer.chkNul(MyEngine);
			VarList = (DGPHashMap) (myv.getProperty("VarList"));
			VersionBuffer.chkNul(VarList);
			GloSymMap = (SymMap) (myv.getProperty("GloSymMap"));
			VersionBuffer.chkNul(GloSymMap);
			UnqID = myv.getInt("UnqID");
			onlyDesignerEdits = myv.getBoolean("OnlyDesignerEdits");
			macroMap.readData(myv);
			updateSymbolListeners();
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		} */
	}

	/**
	* Saves persistent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		/* VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("MyEngine", MyEngine);
		myv.setProperty("VarList", VarList);
		myv.setProperty("GloSymMap", GloSymMap);
		myv.setInt("UnqID", UnqID);
		myv.setBoolean("OnlyDesignerEdits", onlyDesignerEdits);
		macroMap.writeData(myv);

		out.writeObject(myv); */
	}

	/**
	* Configures all depictors as a block.
	*/
	public void readExternalSubUpdate(GeomKit pan) throws MathImageParseException {
		Iterator<FragNode> it = VarList.values().iterator();

//		MyTarget.showLoadFrame();
//		MyTarget.setSubjectLab("Configuring Depictors...");
//		MyTarget.setLoadLab(" ");
//		MyTarget.setLoadFract(5, 10);

		while (it.hasNext()) {
			FragNode MyFrag = it.next();
			readExternalSubFragUpdate(pan, MyFrag);
		}

//		MyTarget.hideLoadFrame();
	}

	/**
	* Configures all depictors in a FragNode, including creating the depictor labels.
	*/
	public void readExternalSubFragUpdate(GeomKit pan, FragNode in) throws MathImageParseException {
		Iterator<DGMNode> it = in.getFragMap().values().iterator();

		while (it.hasNext()) {
			DGMNode MyDGM = it.next();
			DrawObj MyObj = MyDGM.getMyDraw();
			MyObj.setDepicImage(
				makeDepicMathImage(
					(MyObj.getVectName()).exportString(),
					MyObj.getTextColor(),
					MyObj.getTextPtSz(),
					MyObj.getNamedVar()));
			MyObj.updateCreatedImages(pan);
		}

	}

	/**
	* Sets a symbol name to a markup string.
	*/
	public void setSymbol(FlexString tag, FlexString content) throws IllegalInputException {
		if (tag.strlen() == 0)
			throw (new IllegalInputException("You must specify a non-empty symbol name."));

		GloSymMap.putSym(tag);
		SymListNode myl = GloSymMap.getSym(tag);
		myl.setSymbol(content);
		updateSymbolListeners();
	}

	/**
	* Deletes a symbol name.
	*/
	public void deleteSymbol(String Itag) {
		FlexString tag = new FlexString(Itag);

		GloSymMap.remove(tag);
		updateSymbolListeners();
	}

	/**
	* Adds a property change listener to the model.
	*/
	public void addPropertyChangeListener(PropertyChangeListener e) {
		PropL.addPropertyChangeListener(e);
	}

	/**
	* Removes a property change listener from the model.
	*/
	public void removePropertyChangeListener(PropertyChangeListener e) {
		PropL.removePropertyChangeListener(e);
	}

	/**
	* Updates all property change lsiteners that the list of symbols changed.
	*/
	public void updateSymbolListeners() {
		PropL.firePropertyChange(SymbolHolder.SymbolsChanged, null, null);
	}

	/**
	* Saves the set of symbols to the properties list.
	*/
	protected void saveSymbolProperties(String key, SymMap Map, VTextProperties MyProp) {
		IntObj MyIntObj = new IntObj();
		MyIntObj.value = 0;

		Iterator<SymListNode> it = Map.values().iterator();

		while (it.hasNext()) {
			SymListNode MyNode = it.next();

			String key2 = key + ".SymList" + ".Symbol_" + (new Integer(MyIntObj.value)).toString();

			MyProp.put(key2 + ".SymName", (MyNode.getTag()).exportString());
			MyProp.put(key2 + ".Symbol", (MyNode.getSymbol()).exportString());

			MyIntObj.value = MyIntObj.value + 1;
		}

		String MyKey = key + ".SymList.NumSymbols";
		MyProp.putInt(MyKey, MyIntObj.value);
	};

	/**
	* Places a copy of the list of user expressions in a HighLevelList, and returns it.
	*/
	public HighLevelList formUserExpList() {
		HighLevelList TmpList = new HighLevelList();
		Iterator<FragNode> it = getVarList().values().iterator();

		while (it.hasNext()) {
			FragNode MyNode = it.next();
			if ((MyNode.getMovable().value & EngineConstants.MABLE_ASGN_MASK) > 0) {
				FlexString VarStr = MyNode.getVectName();
				FlexString ExpStr = new FlexString();
				IntObj MyMode = new IntObj();
				MyEngine.getExprn(VarStr, ExpStr, MyMode);
				if (MyMode.value != EngineConstants.SUPERVISOR_MODE) {
					FlexString Out = new FlexString();
					Out.setInsertPoint(0);
					Out.insertChar('\'');
					VarStr.insertString(Out);
					Out.insertJavaString("' := ");
					ExpStr.insertString(Out);
					TmpList.insertRight(Out);
				}
			}
		}

		return (TmpList);
	}

	/**
	*<B>Fun:</B> Determines after a symbolic operation whether
	*	objects can be deleted as independent instances.
	*<P>
	*<B>In:</B> The FragNode to check.<BR>
	*<B>Out:</B> FragNode modified.<BR>
	*<B>Pre:</B> Input object is valid.<BR>
	*<B>Post:</B> If the symbol is unconstrained, objects can be
	*	deleted as independent instances.  If the
	*	symbol is constrained, then objects may be
	*	deleted as independent instances if there is
	*	more than one depictor object.<BR>
	*@author Thorn Green
	*/
	public void refigureAlloc(FragNode MyFrg) {
		int RealAlloc = MyFrg.getRealSelfAlloc().value;
		int val = DepictorPort.SELF_ALLOC_DROPABLE + (RealAlloc & DepictorPort.SELF_ALLOC_ENGINE_IGNORE);
		int cnt = 0;
		int TmpDomain = 0;

		DGMHashMap temp = MyFrg.getFragMap();
		Iterator<DGMNode> it = temp.values().iterator();

		while (it.hasNext()) {
			cnt++;
			DGMNode MyNode = it.next();
			TmpDomain = TmpDomain | (MyNode.getMyDraw().vectGetEntDomain());
		}

		if (cnt == 1)
			val = val & DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		if ((MyFrg.getRealSelfAlloc().value & DepictorPort.SELF_ALLOC_DROPABLE) != 0)
			val = val | DepictorPort.SELF_ALLOC_DROPABLE;

		MyFrg.getDomain().value = TmpDomain;
		MyFrg.getSelfAlloc().value = val;
	}

	/**
	*<B>Fun:</B>Returns one prefix of the input string.
	*<P>
	*<B>In:</B> Input string.<BR>
	*<B>Out:</B> Returned by function.<BR>
	*<B>Pre:</B> Input string is valid.<BR>
	*<B>Post:</B> A copy of the prefix of the string will be returned.<BR>
	*@author Thorn Green
	*/
	public FlexString getPrefix(FlexString instr) {
		FlexString outstr = new FlexString();
		int length = instr.strlen();
		int temp = 0;

		if (instr.getChar(0) == '_') {
			length--;
			temp = 1;
			while (instr.getChar(temp) != '_') {
				length--;
				temp++;
			}
			length--;
			temp++;
		}

		instr.leftString(temp, outstr);
		return (outstr);
	};

	/**
	*<B>Fun:</B> Removes all prefixes from the input string.
	*<P>
	*<B>In:</B> Input string, output string.<BR>
	*<B>Out:</B> Output string modified.<BR>
	*<B>Pre:</B> Both input string and output string are valid.<BR>
	*<B>Post:</B> A copy of the input string without its first prefix is placed in the
	*	output string.<BR>
	*@author Thorn Green
	*/
	public void removePrefix(FlexString instr, FlexString outstr) {
		int length = instr.strlen();
		int point = 0;
		int temp;
		boolean Done = false;

		while (!Done) {
			if (instr.getChar(point) == '_') {
				length--;
				temp = point + 1;
				while (instr.getChar(temp) != '_') {
					length--;
					temp++;
				}
				length--;
				point = temp + 1;
			}

			Done = (instr.getChar(point) != '_');
		}

		instr.rightString(length, outstr);
	};

	/**
	*<B>Fun:</B> Gets the fragment name of an input string.
	*<P>
	*<B>In:</B> The input string.<BR>
	*<B>Out:</B> The fragment name is returned.<BR>
	*<B>Pre:</B> The input string is valid.<BR>
	*<B>Post:</B> A copy of the fragment name will be returned.<BR>
	*@author Thorn Green
	*/
	public FlexString getFragName(FlexString instr) {
		FlexString modstr = new FlexString();
		removeOnePrefix(instr, modstr);
		return (getPrefix(modstr));
	}

	/**
	*<B>Fun:</B> Removes one prefix from the input string.
	*<P>
	*<B>In:</B> Input string, output string.<BR>
	*<B>Out:</B> Output string modified.<BR>
	*<B>Pre:</B> Both input string and output string are valid.<BR>
	*<B>Post:</B> A copy of the input string without its first prefix is placed in the
	*	output string.<BR>
	*@author Thorn Green
	*/
	protected void removeOnePrefix(FlexString instr, FlexString outstr) {
		int length = instr.strlen();

		if (instr.getChar(0) == '_') {
			length--;
			int temp = 1;
			while (instr.getChar(temp) != '_') {
				length--;
				temp++;
			}
			length--;
		}

		instr.rightString(length, outstr);
	};

	/**
	*<B>Fun:</B> Takes the formatted list of objects, and converts it to an expression string.
	*<P>
	*<B>In:</B> A list of objects formatted to represent an expression.<BR>
	*<B>Out:</B> A string containing the expression.<BR>
	*<B>Pre:</B> The input list and output string must be non-null.<BR>
	*<B>Post:</B> The list will be inserted into the string.<BR>
	*@author Thorn Green
	*/
	public void insertFormattedString(Object[] in, FlexString out) {
		int count = 0;
		int len = in.length;

		while (count < len) {
			if (in[count] instanceof String) {
				String ins = (String) in[count];
				boolean flag = false;

				try {
					flag = (ins.charAt(0) == '_') && (in[count + 1] instanceof DrawObj);
				}
				catch (Exception e) { /* Nothing In Catch */
				}

				if (flag) {
					DrawObj ind = (DrawObj) in[count + 1];

					out.insertChar('\'');
					out.insertJavaString(ins);
					out.insertChar('_');
					(ind.getFragID()).insertString(out);
					(ind.getVectName()).insertString(out);
					out.insertChar('\'');
					count = count + 2;
				}
				else {
					out.insertJavaString(ins);
					count++;
				}

			}
			else if (in[count] instanceof FlexString) {
				FlexString ins = (FlexString) in[count];
				boolean flag = false;

				try {
					flag = (ins.getChar(0) == '_') && (in[count + 1] instanceof DrawObj);
				}
				catch (Error e) { /* Nothing In Catch */
				}

				if (flag) {
					DrawObj ind = (DrawObj) in[count + 1];

					out.insertChar('\'');
					ins.insertString(out);
					out.insertChar('_');
					(ind.getFragID()).insertString(out);
					(ind.getVectName()).insertString(out);
					out.insertChar('\'');
					count = count + 2;
				}
				else {
					ins.insertString(out);
					count++;
				}
			}
			else if (in[count] instanceof DrawObj) {
				DrawObj ind = (DrawObj) in[count];

				out.insertChar('\'');
				(ind.getVectName()).insertString(out);
				out.insertChar('\'');
				count++;
			}
		}

	}

	/**
	*<B>Fun:</B> Creates a new dynamic runner for the calling client.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> Dynamic runner object returned.<BR>
	*<B>Pre:</B> Model initialized.<BR>
	*<B>Post:</B> An initialized dynamiic runner will be created and returned.<BR>
	*@author Thorn Green
	*/
	public DynRunner createDynRunner() {
		DynRunner Dyn = new GeoDynRunner(this, MyEngine);
		return (Dyn);
	}

	/**
	*<B>Fun:</B> Creates a new one-shot dynamic runner for the calling client.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> Dynamic runner object returned.<BR>
	*<B>Pre:</B> Model initialized.<BR>
	*<B>Post:</B> An initialized dynamiic runner will be created and returned.<BR>
	*@author Thorn Green
	*/
	public DynRunner createOneShotDyn() {
		return (createDynRunner());
	}

	/**
	* Executes a one-shot dyn created by createOneShotDyn().
	*/
	public boolean executeOneShotDyn(ToolPort in, DynRunner dyn) {
		Mvec InPt = new Mvec();
		boolean dragSolverError = dyn.link(in, InPt);
		dragSolverError = dragSolverError || (dyn.dragExecute(in, InPt));
		dyn.handlePostDrag();
		globalRepaint();
		if (dragSolverError)
			System.out.println("Unable To Solve");
		return (dragSolverError);
	}

	/**
	*<B>Fun:</B> Creates a new dynamic runner for the calling client.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> Dynamic runner object returned.<BR>
	*<B>Pre:</B> Model initialized.<BR>
	*<B>Post:</B> An initialized dynamiic runner will be created and returned.<BR>
	*@author Thorn Green
	*/
	public DynRunner createDynRunner(boolean bound, Mvec Pt) {
		DynRunner Dyn = new GeoDynRunner(this, MyEngine);
		Dyn.setBound(bound);
		Dyn.setBoundPt(Pt);
		return (Dyn);
	}

	/**
	* Gets the multivector associated with a variable name.
	*/
	public Mvec getNamedVar(FlexString name) {
		Mvec Var = null;
		FragNode myFrag = VarList.getFrag(name);
		boolean Found = (myFrag == null);
		if (Found)
			Var = myFrag.getVect();
		return (Var);
	}

	/**
	*<B>Fun:</B> Handles the deletion of a non-symbol constraint on a FragNode.
	*<P>
	*<B>In:</B> Name of the port to delete, current state of the canvas,
	*	FragMap of the depictor in which the port lies.<BR>
	*<B>Out:</B> FragMap modified.<BR>
	*<B>Pre:</B> Input obejcts valid, canvas in a consistent state,
	*	the object on which to apply the deletion has been located in the FragMap.<BR>
	*<B>Post:</B> The constraint on the depictor will be deleted.  If the depictor is a
	*	temporary and has no other constraints, the depictor will be deleted as well.<BR>
	*@author Thorn Green
	*/
	protected void modifyActiveNode(FlexString instr, FlexString fragID, DGMHashMap FragMap) {
		Mvec MyMvec = new Mvec();
		IntObj MyInt = new IntObj();
		IntObj MyDomain = new IntObj();
		IntObj MyIODef = new IntObj();
		DGMNode MyDGM = ((DGMNode) FragMap.getDGM(fragID));
		DrawObj MyDrawObj = MyDGM.getMyDraw();
		(MyInt).value = EngineConstants.MABLE_BY_ANY;
		FlexString Prefix = getPrefix(instr);
		FlexString BaseName = new FlexString();
		removePrefix(instr, BaseName);
		FlexString FlPtr = instr;

		/* boolean ufound = ( getUndoVarList() ).findNode( BaseName );
		if( !ufound )
			{
			( getUndoVarList() ).insertNode( MyDrawObj.getVectName() );
			ufound = ( getUndoVarList() ).findNode( BaseName );
		            ( getUndoVarList() ).getNode().eraseAll();
		            ( getUndoVarList() ).setNode( MyDrawObj.copyUser1() );
			ufound = ( getUndoVarList() ).findNode( BaseName );
			}
		DrawObj UDrawObj = ( (DGMNode) getUndoVarList().getNode() ).getMyDraw(); */

		MyDrawObj.setValuePort(Prefix);
		/* UDrawObj.setValuePort( Prefix ); */
		/* ( UDrawObj.portGetVect() ).copyAllInfo( MyMvec );
		( MyDrawObj.portGetVect() ).copyAllInfo(
			UDrawObj.portGetVect() );
		MyMvec.copyAllInfo( MyDrawObj.portGetVect() ); */

		 (MyDrawObj.portGetVect()).copyAllInfo(MyMvec);

		MyDrawObj.portInitPtrs(FlPtr, MyInt, MyMvec, MyDomain, MyIODef);
		(MyDrawObj.portGetSelfAlloc()).value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;

		if ((MyDrawObj.noSymBindings()) && (MyDrawObj.getTemporary()) && (!LockTemporaryDeletion)) {
			dropAllImplicitConstraints(MyDGM.getMyDraw().getFragID());
			pullFromDrawingList(MyDGM.getMyDraw());
			FragMap.remove(MyDGM.getMyDraw().getFragID());
		}
	};

	/**
	*<B>Fun:</B> Handles the deletion of the symbol constraint on a FragNode.
	*<P>
	*<B>In:</B> Name of symbol to delete, current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas modified.<BR>
	*<B>Pre:</B> The canvas is in a consistent state.  The appropriate FragNode has already
	*	been found.  The constraint to delete is a symbol constriant.<BR>
	*<B>Post:</B> The constraint will be deleted from the FragNode.<BR>
	*@author Thorn Green
	*/
	protected void modifyActiveFrag(FlexString instr) {
		Mvec MyMvec = new Mvec();
		IntObj MyInt = new IntObj();
		IntObj MyDomain = new IntObj();
		IntObj MyIODef = new IntObj();
		FragNode MyFragNode = (FragNode) getVarList().getFrag(instr);
		(MyInt).value = EngineConstants.MABLE_BY_ANY;
		FlexString BaseName = new FlexString();
		removePrefix(instr, BaseName);
		FlexString FlPtr = new FlexString();

		boolean ufound = /* ( getUndoVarList() ).findNode( BaseName ); */
		false;
		if (!ufound) {
			/* ( getUndoVarList() ).insertNode( MyFragNode.getVectName() );
			ufound = ( getUndoVarList() ).findNode( BaseName );
			        ( getUndoVarList() ).getNode().eraseAll();
			        ( getUndoVarList() ).setNode( MyFragNode.copyUser1() );
			ufound = ( getUndoVarList() ).findNode( BaseName ); */
		}
		/* FragNode UFragNode = (FragNode) getUndoVarList().getNode(); */

		/* ( UFragNode.portGetVect() ).copyAllInfo( MyMvec ); */
		/* ( MyFragNode.portGetVect() ).copyAllInfo(
			UFragNode.portGetVect() ); */
		/* MyMvec.copyAllInfo( MyFragNode.portGetVect() ); */

		 (MyFragNode.getVect()).copyAllInfo(MyMvec);
		(MyFragNode.getVectName()).copyString(FlPtr);
		MyDomain.value = MyFragNode.getDomain().value;
		MyIODef.value = MyFragNode.getDomain().value;

		MyFragNode.setVectName(FlPtr);
		MyFragNode.setMovable(MyInt);
		MyFragNode.setVect(MyMvec);
		MyFragNode.setDomain(MyDomain);
		MyFragNode.setIODef(MyIODef);

		int cnt = updateConstraints(MyFragNode, FlPtr, MyInt, MyMvec, MyDomain, MyIODef);
		MyFragNode.getSelfAlloc().value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
		MyFragNode.getRealSelfAlloc().value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;

		checkTemporaryDeletion(MyFragNode);

		if (MyFragNode.getFragMap().isEmpty()) {
			getVarList().remove(instr);
		}
	};

	/**
	*<B>Fun:</B> Creates a new depictor for a particular symbol name.
	*<P>
	*<B>In:</B> The name of the depictor, the list of depictors to modify, current state
	*	of the canvas.<BR>
	*<B>Out:</B> List of depictors modified, canvas state modified.<BR>
	*<B>Pre:</B> The canvas is in a consistent state, all input objects are modified.<BR>
	*<B>Post:</B> A new depictor with the name InStr will be added to the depictor list.<BR>
	*@author Thorn Green
	*/
	protected void markInsertNode(FlexString InStr, DGPHashMap VarList) {
		Meta MyMeta = null;

		boolean Found = VarList.insertNode(InStr);
		boolean Found1 = /* ( getUndoVarList() ).insertNode( InStr ); */
		false;

		if (Found) {
			if (!Found1) {
				/* MyMeta = VarList.getNode();
				MyAPP = ( (DGMNode) MyMeta ).getMyDraw();
				MyDGM = (DGMNode) MyMeta;
				DrawObj newAPP = (DrawObj) ( MyAPP.copyUser1() );
				( getUndoVarList() ).findNode( InStr );
				Meta OldNode = ( getUndoVarList() ).getNode();
				( getUndoVarList() ).setNode( newAPP );
				OldNode.eraseAll(); */
			}
			else {
				MyMeta = VarList.getFrag(InStr);
			}
		}
		else {
			if (!Found1) {
				DrawObjFactory MyFac = new DrawObjFactory(SymTarget, this);
				MyFac.setDepicClass(0);
				MyFac.setNewVectName(InStr);
				MyFac.setTemporary(true);
				MyFac.setResolveConstraints(false);
				MyFac.setRefigureAlloc(false);
				MyFac.setUseCreateUndo(false);
				MyFac.setRepaint(false);
				DrawObj Tmp = MyFac.createDepictor();
			}
			else {
				/* !!!!!!!!!!!!!!!!!!!!!! Will be reworked */
				/* FragNode OldNode = VarList.getFrag( Instr );
				DrawObj temp = ( (DGMNode) getUndoVarList().getFrag( Instr ) ).getMyDraw();
				Meta NewNode = temp.copyUser1();
				VarList.setNode( NewNode );
				OldNode.eraseAll(); */
			}
		}

	};

	/**
	*<B>Fun:</B> Places an update on the constraint of a symbol into all depictors of the symbol.
	*<P>
	*<B>In:</B> The FragNode in which the depictors lie.  The new port objects.<BR>
	*<B>Out:</B> Contents of MyFrag modified.<BR>
	*<B>Pre:</B> All input objects are valid.  The FragNode has been correctly picked.<BR>
	*<B>Post:</B> The symbol constraint on all depictors in the FragNode will be updated.<BR>
	*@author Thorn Green.
	*/
	protected int updateConstraints(
		FragNode MyFrag,
		FlexString VarName,
		IntObj Mable,
		Mvec Vect,
		IntObj Domain,
		IntObj IODef) {
		int cnt = 0;
		DGMHashMap temp = MyFrag.getFragMap();
		Iterator<DGMNode> it = temp.values().iterator();

		while (it.hasNext()) {
			cnt++;
			DrawObj MyObj = it.next().getMyDraw();
			MyObj.setValuePort(1);
			MyObj.portInitPtrs(VarName, Mable, Vect, Domain, IODef);
		}

		return (cnt);
	}

	/**
	*<B>Fun:</B> Deletes any temporary variables in the FragNode which are no longer needed.
	*<P>
	*<B>In:</B> The FragNode to check.<BR>
	*<B>Out:</B> FragNode modified.<BR>
	*<B>Pre:</B> The FragNode's elements are properly set.<BR>
	*<B>Post:</B> If a temporary variable is found which no longer has any bindings,
	*	it will be deleted from the FragNode.<BR>
	*@author Thorn Green
	*/
	protected void checkTemporaryDeletion(FragNode MyFrg) {
		int TmpDomain = 0;
		DGMHashMap temp = MyFrg.getFragMap();
		Iterator<DGMNode> it = temp.values().iterator();

		while (it.hasNext()) {
			DGMNode MyDGM = it.next();
			DrawObj MyDrawObj = MyDGM.getMyDraw();

			if ((MyDrawObj.noSymBindings()) && (MyDrawObj.getTemporary()) && (!LockTemporaryDeletion)) {
				dropAllImplicitConstraints(MyDGM.getMyDraw().getFragID());
				pullFromDrawingList(MyDGM.getMyDraw());
				it.remove();
			}
			else
				TmpDomain = TmpDomain | MyDrawObj.vectGetEntDomain();
		}

		MyFrg.getDomain().value = TmpDomain;
	};

	/**
	*<B>Fun:</B> Creates a depiction image for a particular symbol string.
	*<P>
	*<B>In:</B> String to depict.  Color to depict string as.<BR>
	*<B>Out:</B> Depiction image returned.<BR>
	*<B>Pre:</B> Symbol depiction software is working properly.  Input string is valid.<BR>
	*<B>Post:</B> Image will be returned which depicts symbol.<BR>
	*@author Thorn Green.
	*/
/*	public Image makeDepicImage(String ins, Integer col, int PtSz) {
		Image xy = null;

		if (!(ins.equals("")))
			try {
				MathImage x = new MathImage(ins, MyTarget, Color.black, PtSz);
				xy = x.makeImage(MyTarget.getComponent(), MyTarget, col);
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Symbol Create Failed", e));
			}

		return (xy);
	} */

	/**
	*<B>Fun:</B> Creates a depiction image for a particular symbol string.
	*<P>
	*<B>In:</B> String to depict.  Color to depict string as.<BR>
	*<B>Out:</B> Depiction image returned.<BR>
	*<B>Pre:</B> Symbol depiction software is working properly.  Input string is valid.<BR>
	*<B>Post:</B> Image will be returned which depicts symbol.<BR>
	*@author Thorn Green.
	*/
	public MathImage makeDepicMathImage(String ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException {
		MathImage x = null;

		if (!depic_named && (getTarget() != null)) {
			x = getTarget().getIxImg();
		}
		else {
			if (!(ins.equals(""))) {
				x = new MathImage(ins, col, PtSz, AntialiasValue);
			}
		}

		return (x);
	}

	/**
	*<B>Fun:</B> Creates a depiction image for a particular symbol string.
	*<P>
	*<B>In:</B> String to depict.  Color to depict string as.<BR>
	*<B>Out:</B> Depiction image returned.<BR>
	*<B>Pre:</B> Symbol depiction software is working properly.  Input string is valid.<BR>
	*<B>Post:</B> Image will be returned which depicts symbol.<BR>
	*@author Thorn Green.
	*/
	public MathImage makeDepicMathImage(FlexString ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException {
		MathImage x = null;

		if (!depic_named && (getTarget() != null)) {
			x = getTarget().getIxImg();
		}
		else {
			if (ins.strlen() > 0) {
				x = new MathImage(ins, col, PtSz, AntialiasValue);
			}
		}

		return (x);
	}

	/**
	*<B>Fun:</B> Conditionally copies the value of one multivector
	*	into the value of another.
	*<P>
	*<B>In:</B> The multivectors to copy and a state flag.<BR>
	*<B>Out:</B> Output multivector modified.<BR>
	*<B>Pre:</B> Input object are valid.<BR>
	*<B>Post:</B> The fields of the output multivector which are
	*	zero will be reset to match the input multivector.<BR>
	*@author Thorn Green
	*/
	public void depicCopyVector(boolean state, Mvec InVec, Mvec OutVec) {
		if (OutVec.getBasis() == 0.0)
			OutVec.setBasis(InVec.getBasis());

		if ((OutVec.getBasis1() == 0.0) && (OutVec.getBasis2() == 0.0)) {
			OutVec.setBasis1(InVec.getBasis1());
			OutVec.setBasis2(InVec.getBasis2());
		}

		if (OutVec.getBasis12() == 0.0)
			OutVec.setBasis12(InVec.getBasis12());

	}

	/**
	* Gets the class associated with a particular depicotr mode.
	*/
	public Class<? extends DrawObj> getDepictorClass(int AltMode) {
		DepicNode node = getDepictorNode(AltMode);
		return (node.depicDrawObj);
	}

	/**
	*<B>Fun:</B> Returns the depictor node given the palette number of a particular depictor.
	*<P>
	*<B>In:</B> The palette number in AltMode, the list of depictor types in DepicStore.<BR>
	*<B>Out:</B> DepicNode returned.<BR>
	*<B>Pre:</B> AltMode is in the proper range.  DepicStore is valid.  DepicStore is non-empty.
	*	DepicStore is a list of DepicNode objects.<BR>
	*<B>Post:</B> The proper depictor node will be returned.<BR>
	*@author Thorn Green
	*/
	public DepicNode getDepictorNode(int altMode) {
		return (getDepicStore().getDepictorNode(altMode));
	}

	/**
	* Crestes a copy of the list of user variables, and returns it.
	*/
	public HighLevelList formUserVarList() {
		HighLevelList TmpList = new HighLevelList();

		Iterator<FragNode> it = VarList.values().iterator();

		while (it.hasNext()) {
			FragNode MyNode = it.next();
			FlexString VarStr = MyNode.getVectName();
			char FstChar = VarStr.getChar(0);

			if ((FstChar != '~') && (FstChar != '_')) {
				FlexString Out = new FlexString();
				VarStr.copyAllInfo(Out);
				TmpList.insertRight(Out);
			}
		}

		return (TmpList);
	}

	/**
	* Sets the identity of the last depictor that the user clicked on.
	*/
	public void setLastClickDepic(DrawObj MyObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localSetLastClickDepic(MyObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}

	/**
	* Removes a depictor from the rendering list of all views.
	*/
	public DGMNode pullFromDrawingList(DrawObj MyObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localPullFromDrawingList(MyObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

		return (null);
	}

	/**
	* Brings a depictor to the front of all views.
	*/
	public void bringToFront(DrawObj MyObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localBringToFront(MyObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}

	/**
	* Sends a depictor to the back of all views.
	*/
	public void sendToBack(DrawObj MyObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localSendToBack(MyObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}

	/**
	* Appends a depictor to all views.
	*/
	public void displayAppend(DrawObj MyObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localDisplayAppend(MyObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}

	/**
	* Repaints all views.
	*/
	public void globalRepaint() {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).invalidate(); // postInvalidate();

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}


	/**
	* Informs all listeners that a depictor is either delegating from another, or no longer
	* delegating from another.  Delegation is mainly used by the Uni-Dimensional kit.
	*/
	public void globalDelegationEvent(boolean Add, DrawObj FromObj, DrawObj ToObj) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localDelegationEvent(Add, FromObj, ToObj);

				tmp.right();
				Done = tmp.getHead();
			}
		}

	}

	/**
	* Updates all listeners that the list of expressions has changed.
	*/
	public void updateExpressionListeners() {
		PropL.firePropertyChange(GeomConstants.ExpressionsChanged, null, null);
	}

	/**
	* Updates all listeners that the list of variables has changed.
	*/
	public void updateVariableListeners() {
		PropL.firePropertyChange(GeomConstants.VariablesChanged, null, null);
	}

	/**
	* Updates all listeners that the list of windows has changed.
	*/
	public void updateWindowListListeners() {
		PropL.firePropertyChange(GeomConstants.WindowListUpdated, null, null);
	}

	/**
	* Adds a DepicListListener to the model.
	*/
	public void addDepicListListener(DepicListListener in) {
		ObjObj MyObj = new ObjObj();
		MyObj.value = in;

		DepicListListeners.insertRight(MyObj);
		handleCoordRenderUpdate(72.0);
	}

	/**
	* Adds a window event listener to the model.
	*/
/*	public void addWindowRecord(Object in, int winType) {
		ActionListener l = null;

		if (in instanceof VerdantiumComponent) {
			VerdantiumComponent comp = (VerdantiumComponent) in;
			l = Adapters.createGActionListener(this, "handleWindowRecordRemoval");
			VerdantiumUtils.addClosureActionListener(comp, l);
		}

		WindowRecord MyRec = new WindowRecord(in, winType, l);

		if (!(WindowRecords.empty())) {
			WindowRecords.searchHead();
			WindowRecords.left();
		}

		WindowRecords.insertRight(MyRec);
		updateWindowListListeners();
	} */

	/**
	* Removes a DepicListListener from the model.
	*/
	public void removeDepicListListener(DepicListListener in) {
		HighLevelList temp = DepicListListeners;
		HighLevelList next = new HighLevelList();

		if (!(temp.empty())) {
			temp.searchHead();
			boolean Done = false;

			while (!Done) {
				ObjObj MyObjObj = (ObjObj) temp.getNode();
				temp.copyDataPlusPtrInfo(next);
				next.right();

				if (MyObjObj.value == in) {
					temp.eraseNodeInfo();
				}

				if (temp.empty())
					Done = true;
				else {
					next.copyDataPlusPtrInfo(temp);
					Done = temp.getHead();
				}
			}
		}

		handleCoordRenderUpdate(72.0);
	}

	/**
	* Handles the event for the removal of a window record.
	*/
//	public void handleWindowRecordRemoval(ActionEvent e) {
//		removeWindowRecord(e.getSource());
//	}

	/**
	* Removes a window event listener from the mdoel.
	*/
/*	public void removeWindowRecord(Object in) {
		HighLevelList temp = WindowRecords;
		HighLevelList next = new HighLevelList();

		if (!(temp.empty())) {
			temp.searchHead();
			boolean Done = false;

			while (!Done) {
				WindowRecord MyRec = (WindowRecord) (temp.getNode());
				temp.copyDataPlusPtrInfo(next);
				next.right();

				if (MyRec.getWindow() == in) {
					temp.eraseNodeInfo();

					if (in instanceof VerdantiumComponent) {
						VerdantiumUtils.removeClosureActionListener((VerdantiumComponent) in, MyRec.getListener());
					}
				}

				if (temp.empty())
					Done = true;
				else {
					next.copyDataPlusPtrInfo(temp);
					Done = temp.getHead();
				}
			}
		}

		updateWindowListListeners();
	} */

	/**
	* Handles a mouse event and updates all affected views.
	*/
	protected final void globalImage(MotionEvent MyEvent) {
		HighLevelList tmp = new HighLevelList();
		DragTarget.clickAndDrag(MyEvent, DragRec1);

		boolean Done = false;
		if (GloDraw) {
			Model.this.DepicListListeners.copyDataPlusPtrInfo(tmp);

			if (!(tmp.empty())) {
				tmp.searchHead();

				while (!Done) {
					ObjObj MyNode = (ObjObj) tmp.getNode();
					((DepicListListener) MyNode.value).updateYourself1();

					tmp.right();
					Done = tmp.getHead();
				}
			}
		}
		else
			DragTarget.updateYourself1();
	}

	/**
	* Synchronizes all views on a mouse-drag event.
	*/
	public void dragEventEntry(MotionEvent e) {
		globalImage(e);
	}

	/**
	* Prepares the model for a set of mouse-drag events.
	*/
	public void setUpDrag(DepicListListener target, boolean GloRedraw) {
		if (target != null)
			DragTarget = target;
		GloDraw = GloRedraw;
	}

	public Model(ToolPort inT, String Configs, Config config) {
		ClassLoader loader = Model.class.getClassLoader();
		setTarget(inT);

//		tmmgr =
//			UndoManager.createInstanceUndoManager(
//				jundo.runtime.Runtime.getInitialMilieu());
//		macroMap = new MacroTreeMap(tmmgr);
		PropL = new PropertyChangeSupport(this);
		VTextProperties MyProp = loadConfigFile(Configs);
		geoTools = new Vector<Ktool>();
		getTools( config );
		getPlugs( config );
		getSolvers( config );
		getDepicStore().doGet(config, 0);
	}

	/**
	* For serial storage purposes only.  Do not use directly.
	*/
	public Model() {
//		tmmgr =
//			UndoManager.createInstanceUndoManager(
//				jundo.runtime.Runtime.getInitialMilieu());
//		macroMap = new MacroTreeMap(tmmgr);
		PropL = new PropertyChangeSupport(this);
		/* For deserialization only.  Do not use for anything else. */
	}

	public void installXnlConfig(ClassLoader loader, VTextProperties MyProp) {
//		getTools(loader, MyProp, "Config1/97A", null);
//		getPlugs(loader, MyProp, "Config1/97A", null);
//		getSolvers(loader, MyProp, "Config1/97A", null);
//		getDepicStore().doGet(MyTarget, loader, MyProp, "Config1/97A", getDepicStore().getSize());
	}

	/**
	* Loads all tool names stored in the configuration file for the kit.
	*/
	protected void getTools(Config config) {
		try {
			
			Config.ToolRec[] recs = config.getToolRecs();
			
			int max = recs.length;
			int count;

 //			String MyKey = key + ".ToolList.NumTools";
//			max = MyProp.getInt(MyKey);

//			if (display != null) {
//				display.setSubjectLab("Loading Tools...");
//				display.setLoadLab("  ");
//				display.setLoadFract(0, max);
//			}

			for (count = 0; count < max; count++) {

				Config.ToolRec rec = recs[ count ];

				try {
					if (!( rec == null )) {
						Class<? extends Ktool> clss = rec.clss;
						Ktool tool = clss.newInstance();
						geoTools.addElement(tool);
						String AliasName = rec.aliasName;
						tool.setAliasName(AliasName);
					}
					else {
						geoTools.addElement(null);
					}
				}
				catch (Exception e) {
					throw (new WrapRuntimeException("Ktool Failed", e));
				}

//				if (display != null)
//					display.setLoadFract(count + 1, max);

			}

		}
		catch (Exception ex) {
			throw (new WrapRuntimeException(ex));
		}
	}

	/**
	* Loads all plugins stored in the configuartion file for the kit.
	*/
	protected void getPlugs(Config config) {
		try {
			Config.DepicPluginRec[] recs = config.getDepicPluginRecs();
			
			int max = recs.length;
			int count;

			for (count = 0; count < max; count++) {

				Config.DepicPluginRec rec = recs[ count ];

				Class<? extends DepicPlugin> MyClass = rec.clss;
				Class[] ParamTypes = {};
				Object[] Params = {};
				Method ExMethod = MyClass.getMethod("installPlug", ParamTypes);
				ExMethod.invoke(null, Params);

/*				if (display != null)
					display.setLoadFract(count + 1, max); */

			}

		}
		catch (Exception ex) {
			throw (new WrapRuntimeException("Plug Failed", ex));
		}
	}

	/**
	* Loads all solvers stored in the configuartion file for the kit.
	*/
	protected void getSolvers( Config config ) {
		try {
			Config.SolverRec[] recs = config.getSolverRecs();
			
			int max = recs.length;
			int count;

/*			if (display != null) {
				display.setSubjectLab("Loading Solvers...");
				display.setLoadLab("  ");
				display.setLoadFract(0, max);
			} */

			for (count = 0; count < max; count++) {

				Config.SolverRec rec = recs[ count ];

				String HumanName = rec.humanName;

				Class<? extends SolverLinkage> MyClass = rec.clss;
				getMyEngine().installSolver(HumanName, MyClass);

/*				if (display != null)
					display.setLoadFract(count + 1, max); */

			}

		}
		catch (Exception ex) {
			throw (new WrapRuntimeException("Solver Install Failed", ex));
		}
	}

	/**
	* Loads a configuartion file.
	*/
	public VTextProperties loadConfigFile(String filename) {
		VTextProperties MyProp = new VTextProperties();

		try {

			/* URL MyLoc = MyTarget.getBaseURL(
				"temp/" + filename );
			URLConnection MyCon = MyLoc.openConnection();
			InputStream MyStream = MyCon.getInputStream();
			MyProp.load( MyStream );
			MyStream.close(); */

			/* InputStream MyStream = MyTarget.getBaseStream("temp/" + filename, Model.class);
			MyProp.load(MyStream);
			MyStream.close(); */

		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Config Failed", e));
		}

		return (MyProp);
	}

	/**
	* Stores information for undo-ing the creation of a depictor.  Not implemented.
	* Reserved for future expansion.
	*/
	public void pushUndoMakeDepic(FlexString Vari) { /* !!!! Not Functional !!!! */
	}

	/**
	* Handles Ether Events.
	*/
	public Object processObjEtherEvent(EtherEvent in, Object refcon) throws Throwable {
		boolean handled = false;

/*		if (in instanceof StandardEtherEvent) {
			if (in.getEtherID().equals(StandardEtherEvent.getUrlLocn)) {
				Object[] param = { fileSaveURL, fileSaveFlavor };
				return (param);
			}

			if (in.getEtherID().equals(StandardEtherEvent.setUrlLocn)) {
				Object[] param = (Object[]) (in.getParameter());
				fileSaveURL = (URL) (param[0]);
				fileSaveFlavor = (DataFlavor) (param[1]);
			}

			if (in.getEtherID().equals(StandardEtherEvent.getDocPageFormat)) {
				return (getDocPageFormat());
			}

			if (in.getEtherID().equals(StandardEtherEvent.setDocPageFormat)) {
				setDocPageFormat((PageFormat) (in.getParameter()));
			}
		} */

//		if (in instanceof PropertyEditEtherEvent) {
//
//			if (in.getEtherID().equals(PropertyEditEtherEvent.setOnlyDesignerEdit)) {
//				setOnlyDesignerEdits(((Boolean) (in.getParameter())).booleanValue());
//			}
//
//		}

		if (in instanceof GeomKitEtherEvent) {

//			if (in.getEtherID().equals(GeomKitEtherEvent.globalSynchDepth)) {
//				globalSynchDepth();
//				handled = true;
//			}

			if (in.getEtherID().equals(GeomKitEtherEvent.deleteSymbol)) {
				deleteSymbol((String) (in.getParameter()));
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setSymbol)) {
				Object[] params = (Object[]) (in.getParameter());
				FlexString s1 = (FlexString) (params[0]);
				FlexString s2 = (FlexString) (params[1]);
				setSymbol(s1, s2);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setRigorousClipping)) {
				Boolean param = (Boolean) (in.getParameter());
				setUseRigorousClipping(param.booleanValue());
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setConstraintSolver)) {
				String param = (String) (in.getParameter());
				(getMyEngine()).setConstraintSolver(param);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.getConstraintSolvers)) {
				String[] slv = (getMyEngine()).getConstraintSolvers();
				return (slv);
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.toggleAntialias)) {
				toggleAntialias();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setAntialias)) {
				boolean val = ((Boolean) (in.getParameter())).booleanValue();
				getAntialiasValue().setAntiAlias( val );
				handled = true;
			}

/*			if (in.getEtherID().equals(GeomKitEtherEvent.toggleRenderQuality)) {
				toggleRenderQuality();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setRenderQuality)) {
				boolean val = ((Boolean) (in.getParameter())).booleanValue();
				if (val)
					setRenderValue(RenderingHints.VALUE_RENDER_QUALITY);
				else
					setRenderValue(RenderingHints.VALUE_RENDER_SPEED);
				handled = true;
			} */

		}

		/* if (macroMap != null) {
			Object ret = macroMap.processObjEtherEvent(in, refcon);
			if (ret != EtherEvent.EVENT_NOT_HANDLED) {
				return (ret);
			}
		} */

		if (in instanceof KtoolEtherEvent) {
			Vector<Ktool> tools = getGeoTools();
			int len = tools.size();
			int count;
			for (count = 0; count < len; count++) {
				Ktool tool = tools.elementAt(count);
				if (tool instanceof EtherEventHandler) {
					Object ob = ((EtherEventHandler) (tool)).processObjEtherEvent(in, refcon);
					if (ob != null) {
						return (ob);
					}
				}
			}
		}

		return (null);
	}

	/**
	* Toggles the antialias object.
	*/
	protected void toggleAntialias() throws MathImageParseException {
		Paint p = getAntialiasValue();
		p.setAntiAlias( !( p.isAntiAlias() ) );
	}

	/**
	* Toggles the render quality object.
	*/
//	protected void toggleRenderQuality() throws MathImageParseException {
//		Paint p = getAntialiasValue();
//		p.
//	}

	/**
	* Clears the model.
	*/
	public void clearModel(Object s1) {
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		HighLevelList tmp2 = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				tmp.copyDataPlusPtrInfo(tmp2);
				tmp2.right();

				ObjObj MyNode = (ObjObj) tmp.getNode();
				((DepicListListener) MyNode.value).localClearModel();

				tmp2.copyDataPlusPtrInfo(tmp);
				Done = tmp.getHead();
			}
		}

		int tmp1 = geoTools.size();
		int count;
		for (count = 0; count < tmp1; ++count) {
			Ktool tool = geoTools.elementAt(count);
			if (tool != null)
				tool.clear();
		}

		DragTarget = null;
		GloDraw = false;
		DragRec1 = null;
		DragRec2 = null;
		MyEngine = new GeomEngine();
		VarList.clear();
		UndoVarList.clear();
		GloSymMap.clear();
		UnqID = 1;
//		setOnlyDesignerEdits(false);
//		macroMap.clear();

		updateSymbolListeners();
		updateExpressionListeners();
		updateVariableListeners();
		globalRepaint();
	}

	/**
	* Handles a change in the rendering constants, such as antialias.  This allows
	* the clients of the model to properly deal with the fact that antialiased text
	* has different font metrics than non-antialiased text.
	*/
	protected void handleRenderUpdate() throws MathImageParseException {
		Iterator ita = VarList.values().iterator();

		while (ita.hasNext()) {
			FragNode MyFrag = (FragNode) (ita.next());
			DGMHashMap MyList = MyFrag.getFragMap();

			Iterator<DGMNode> it = MyList.values().iterator();
			while (it.hasNext()) {
				DGMNode MyDGM = it.next();
				DrawObj MyDraw = MyDGM.getMyDraw();

				String Str = (MyDraw.getVectName()).exportString();
				MyDraw.setDepicImage(
					makeDepicMathImage(Str, MyDraw.getTextColor(), MyDraw.getTextPtSz(), MyDraw.getNamedVar()));

				MyDraw.updateCreatedImages(SymTarget);
			}

		}

		PropL.firePropertyChange(GeomConstants.ChangedRenderingConstants, null, null);
		SymTarget.firePropertyChg(GeomConstants.ChangedRenderingConstants, null, null);
		globalRepaint();
	}

	/**
	* Handles a change in the coordinate radius in one of he views by
	* making sure that the proper scale tolerance is sent to whatever
	* solver GeomEngine is using.  The <code>dpi</code> argument indicates
	* the DPI of the screen or printer to which the solved diagram is to
	* be rendered.
	*/
	public void handleCoordRenderUpdate(double dpi) {
		/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!! How to handle printers. !!!!!!!!!!!!!!!!! */
		double dpiMultiplier = dpi / 72.0;
		double lowScaleTolerance = 1.0E+12;
		boolean Done = false;
		HighLevelList tmp = new HighLevelList();
		DepicListListeners.copyDataPlusPtrInfo(tmp);

		if (!(tmp.empty())) {
			tmp.searchHead();

			while (!Done) {
				ObjObj MyNode = (ObjObj) tmp.getNode();
				double rad = ((DepicListListener) MyNode.value).getCoordRad();

				if (rad > 0.0) {
					double scv = (1.0 / rad) / (2.0 * dpiMultiplier);
					if (scv < lowScaleTolerance)
						lowScaleTolerance = scv;
				}

				tmp.right();
				Done = tmp.getHead();
			}
		}

		MyEngine.setScaleTolerance(lowScaleTolerance);
	}

/*	public void stopAllWindows(Object top) {
		HighLevelList winList = getWindowList();
		if (!(winList.empty())) {
			winList.searchHead();
			boolean Done = false;

			while (!Done) {
				WindowRecord obj = (WindowRecord) (winList.getNode());
				Object val = obj.getWindow();

				if ((val instanceof VerdantiumComponent) && (val != top))
					VerdantiumUtils.disposeContainer((VerdantiumComponent) val);

				winList.right();
				Done = winList.getHead();
			}
		}
	} */

	public DepicListListener DragTarget = null;

	protected boolean GloDraw = false;

	/**
	* Gets the tool set.
	*/
	public Vector<Ktool> getGeoTools() {
		return (geoTools);
	}
	/**
	* Gets the list of symbols.
	*/
	public final SymMap getGloSymMap() {
		return (GloSymMap);
	}
	/**
	* Gets the list of depictor types supported by the model.
	*/
	public final DepicClassStore getDepicStore() {
		return (DepicStore);
	}
	/**
	* Gets the view that is the target of future operations.
	*/
	public final ToolPort getTarget() {
		return (SymTarget);
	}
	/**
	* Updates which view is the target of future operations.
	*/
	public final synchronized void setTarget(ToolPort in) {
		if ((in != null) && (SymTarget != in)) {
			ToolPort tmp = SymTarget;
			SymTarget = in;
			if (tmp != null)
				tmp.firePropertyChg(ToolPort.ToolPortLocalTargetChanged, null, null);
		}
	}
	/**
	* Gets the engine.
	*/
	public final GeomEngine getMyEngine() {
		return (MyEngine);
	}
	/**
	* Gets the list of variables and depictors.
	*/
	public final DGPHashMap getVarList() {
		return (VarList);
	}
	/**
	* Gets the list of depictors used for undo.  Reserved for future expansion.
	*/
	public final DGPHashMap getUndoVarList() {
		return (UndoVarList);
	}
	/**
	* Gets the current unique ID for depictor creation.
	*/
	public final int getUnqID() {
		return (UnqID);
	}
	/**
	* Sets the current unique ID for depictor creation.
	*/
	public final void setUnqID(int in) {
		UnqID = in;
	}
	/**
	* Resets the engine to a new engine.  Only use this if everything
	* else (like depictors) is to be cleared out.
	*/
	public void newEngine() {
		MyEngine = new GeomEngine();
	}
	/**
	* Gets the window list.
	*/
//	public HighLevelList getWindowList() {
//		return (WindowRecords);
//	}
	/**
	* Sets the coordinate context objects to be used with the drag.
	*/
	public void setDragContext(CoordContext in1, CoordContext in2) {
		DragRec1 = in1;
		DragRec2 = in2;
	}

	/**
	* Gets the antialias object.
	*/
	public final Paint getAntialiasValue() {
		return (AntialiasValue);
	}
	/**
	* Sets the antialias object.
	*/
	public void setAntialiasValue(Paint in) throws MathImageParseException {
		AntialiasValue = in;
		handleRenderUpdate();
	}
	/**
	* Gets the rendering quality object.
	*/
//	public final Object getRenderValue() {
//		return (RenderValue);
//	}
	/**
	* Sets the rendering quality object.
	*/
//	public void setRenderValue(Object in) throws MathImageParseException {
//		RenderValue = in;
//		handleRenderUpdate();
//	}
	/**
	* Gets whether rigorous clipping is used.
	*/
	public boolean getUseRigorousClipping() {
		return (UseRigorousClipping);
	}

	/**
	* Gets whether rigorous clipping is used.
	*/
	public void setUseRigorousClipping(boolean in) {
		UseRigorousClipping = in;
		PropL.firePropertyChange(GeomConstants.ChangedRigorousClipping, null, null);
		SymTarget.firePropertyChg(GeomConstants.ChangedRigorousClipping, null, null);
	}

	/**
	* Gets the page format.
	*/
//	public PageFormat getDocPageFormat() {
//		return (docPageFormat);
//	}

	/**
	* Sets the page format.
	*/
//	public void setDocPageFormat(PageFormat in) {
//		docPageFormat = in;
//	}

	public void setMouseDownTime(long in) {
		MouseDownTime = in;
	}

	public void setMouseUpTime(long in) {
		MouseUpTime = in;
	}

//	public void setUrlLocn(URL inU, DataFlavor inD) {
//		fileSaveURL = inU;
//		fileSaveFlavor = inD;
//	}

	public final boolean getDragSolverError() {
		return (dragSolverError);
	}

	public final void setDragSolverError(boolean in) {
		dragSolverError = in;
	}

	public boolean isOnlyDesignerEdits() {
		return (onlyDesignerEdits);
	}

	public DrawObj getDepicForVarName(FlexString name) {
		return (getVarList().getFrag(name).getFragMap().getFirstNode().getMyDraw());
	}

//	public void setOnlyDesignerEdits(boolean in) {
//		onlyDesignerEdits = in;
//		PropL.firePropertyChange(DesignerPropertyEditor.AppOnlyDesignerEdits, null, null);
//		SymTarget.firePropertyChg(DesignerPropertyEditor.AppOnlyDesignerEdits, null, null);
//	}

//	public MacroTreeMap getMacroMap() {
//		return (macroMap);
//	}

	/**
	* The URL used when the user selects "Save" as opposed to "Save As..."
	*/
	transient protected URL fileSaveURL = null;

//	/**
//	* The data flavor used when the user selects "Save" as opposed to "Save As..."
//	*/
//	transient protected DataFlavor fileSaveFlavor = null;

//	/**
//	* The information stored by the "Page Setup" dialog.
//	*/
//	transient protected PageFormat docPageFormat = null;

//	/**
//	* The tree map containing the client macros.
//	*/
//	protected MacroTreeMap macroMap = null;
	
//	protected UndoManager tmmgr;

	private boolean onlyDesignerEdits = false;
	protected transient boolean dragSolverError = false;
	protected transient long MouseDownTime = 0;
	protected transient long MouseUpTime = 0;
	private Paint AntialiasValue = new Paint();
	private boolean UseRigorousClipping = false;
	private boolean LockTemporaryDeletion = false;
	protected transient Vector<Ktool> geoTools = null;
	protected transient CoordContext DragRec1 = null;
	protected transient CoordContext DragRec2 = null;
	private transient ToolPort SymTarget = null;
	protected transient DepicClassStore DepicStore = new DepicClassStore();
	private GeomEngine MyEngine = new GeomEngine();
	private DGPHashMap VarList = new DGPHashMap();
	private transient DGPHashMap UndoVarList = new DGPHashMap();
	private SymMap GloSymMap = new SymMap();
	protected transient PropertyChangeSupport PropL = null;
	private transient HighLevelList DepicListListeners = new HighLevelList();
//	private transient HighLevelList WindowRecords = new HighLevelList();
	private int UnqID = 1;
}
