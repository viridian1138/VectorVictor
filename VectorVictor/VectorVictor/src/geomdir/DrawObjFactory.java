




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

import meta.FlexString;
import meta.Meta;
import meta.WrapRuntimeException;
import android.graphics.RectF;
import android.graphics.PointF;


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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed DrawObjFactory to be compatible with the new clustering.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Regressions in performance enhancement.                              | Fixed regressions.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 03/16/2003            | Thorn Green (viridian_1138@yahoo.com)           | ObjectPC did not use defaultClassLoader.                             | Moved defaultClassLoader into Meta to fix this.
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
* An object that creates depictors and places them in the rendering
* lists of model views.
* @author Thorn Green
*/
public class DrawObjFactory extends Object {

	private DrawObj LastDrawObj = null;
	private DGMNode lastDGM = null;

	public DrawObj getLastDrawObj() {
		return (LastDrawObj);
	}

	public DGMNode getLastDGM() {
		return (lastDGM);
	}

	public DrawObjFactory(ToolPort SymT, IFactoryModel in) {
		SymTarget = SymT;
		Manager = in;
	}

	/**
	* Clears the object back to its initial state.
	*/
	public void clearFactory() {
		clearInsertFlags();
		clearPlaceAt();
		clearNamedDrawObj();
		clearNewVectName();
		clearReplaceUnqID();
		clearReplaceDrawObj();
		clearMiscFlags();
		setNewVectColors(null);
		LastDrawObj = null;
	}

	/**
	* Creates a depictor.  Returns the depictor created.
	*/
	public DrawObj createDepictor() {
		newNamedDrawObj();

		if (IntoVarList)
			Manager.getVarList().insertNode(getVectName());

		DrawObj Ret = makeVarComp();
		LastDrawObj = Ret;

		/* System.out.println( Ret );
		Ret.getVectName().writelnString();
		Ret.getFragID().writelnString(); */

		return (Ret);
	}

	private DrawObj makeVarComp() {
		boolean state = true;

		DrawObj RetObj = getNamedDrawObj();

		FragNode MyFrg = (FragNode) Manager.getVarList().getFrag(getVectName());
		setUnqID(getUnqID() + 1);

		Hexar MyHex = new Hexar();
		if (PlaceAt)
			SymTarget.hexglo(PlacePoint.x, PlacePoint.y, MyHex.getGlo(), false, MyHex);

		DrawObj MyObj = RetObj;

		DGMNode MyNode = new DGMNode();
		MyNode.setMyDraw(MyObj);
		MyNode.setMyCoord(getNamedCoord());

		insertDGMNode(MyFrg.getFragMap(), getFragID(), MyNode);

		MyObj.setTemporary(getTemporary());
		if (UseCreateUndo)
			Manager.pushUndoMakeDepic(getVectName());
		MyObj.resetVects(SymTarget, MyNode.getMyCoord(), SymTarget.getBoundMode(), false);

		MyObj.setValuePort(1);
		Manager.depicCopyVector(state, MyObj.portGetVect(), MyFrg.getVect());
		MyObj.portInitPtrs(
			MyFrg.getVectName(),
			MyFrg.getMovable(),
			MyFrg.getVect(),
			MyFrg.getDomain(),
			MyFrg.getIODef());
		MyObj.vectSetSelfAlloc(MyFrg.getSelfAlloc());

		MyObj.setValuePort(0);

		if (PlaceAt) {
			MyObj.portGetVect().setBasis1(MyHex.getGlo().getBasis1());
			MyObj.portGetVect().setBasis2(MyHex.getGlo().getBasis2());
		}

		MyObj.synchResetVects(SymTarget, MyNode.getMyCoord(), SymTarget.getBoundMode(), false);

		if (IntoDList)
			Manager.displayAppend(MyObj);

		if (RefigureAlloc)
			Manager.refigureAlloc(MyFrg);
		if (ResolveConstraints)
			Manager.getMyEngine().resolveConstraints();
		if (Repaint)
			Manager.globalRepaint();
		return (RetObj);
	}

	/**
	* <B>Fun:</B> If a node with the Tag value in Tag does not exist in the list, insert one.
	* <P>
	* <B>In:</B> Tag value pointer.<BR>
	* <B>Out:</B> List modified.  Boolean returns true if a node with the Tag was found.<BR>
	* <B>Pre:</B> List and tag value.  List in ascending order with respect to Tag.<BR>
	* <B>Post:</B> If the Tag value does not exist in the list, it will be inserted.  Otherwise,
	*	the function will return true.  List will point to node matching Tag.<BR>
	* @author Thorn Green.
	*/
	protected boolean insertDGMNode(DGMHashMap in, Meta Tag, DGMNode NewNode) {
		boolean Found;

		lastDGM = in.getDGM((FlexString) Tag);
		Found = (lastDGM != null);
		if (!Found) {
			in.putDGM(NewNode);
			lastDGM = NewNode;
		}

		return (Found);
	};

	Integer FrontLineColor = null;
	Integer BackLineColor = null;
	Integer TextColor = null;

	/**
	* Sets the front line color.
	*/
	public void setFrontLineColor(Integer in) {
		FrontLineColor = in;
	}

	/**
	* Sets the back line color.
	*/
	public void setBackLineColor(Integer in) {
		BackLineColor = in;
	}

	/**
	* Sets the text color.
	*/
	public void setTextColor(Integer in) {
		TextColor = in;
	}

	/**
	* Sets the colors to those of the input depictor, or the defaults if null.
	*/
	public void setNewVectColors(DrawObj in) {
		if (in == null) {
			FrontLineColor = null;
			BackLineColor = null;
			TextColor = null;
		}
		else {
			FrontLineColor = in.getFrontLineColor();
			BackLineColor = in.getBackLineColor();
			TextColor = in.getTextColor();
		}
	}

	/**
	* Sets whether the name of the depictor to be created is entered into the variable list
	* of the model.
	*/
	public void setInsertIntoVarList(boolean in) {
		IntoVarList = in;
	}
	/**
	* Sets whether the depictor to be created is entered into the {@link DGMHashMap}
	* associated with the {@link FragNode} for the depictor's variable.
	*/
	public void setInsertIntoFragMap(boolean in) {
		IntoFragMap = in;
	}
	/**
	* Sets whether the depictor to be created is inserted into the display list
	* of the various views of the model.
	*/
	public void setInsertIntoDisplayList(boolean in) {
		IntoDList = in;
	}
	/**
	* Clears all flags related to list insertion.
	*/
	public void clearInsertFlags() {
		IntoVarList = true;
		IntoFragMap = true;
		IntoDList = true;
	}

	private boolean IntoVarList = true;
	private boolean IntoFragMap = true;
	private boolean IntoDList = true;

	/**
	* Sets that the depictor to be created should reside at pixel
	* position (x,y) in the view associated with the factory.
	*/
	public void setPlaceAt(int x, int y) {
		PlaceAt = true;
		PlacePoint = new PointF(x, y);
	}
	/**
	* Sets that the depictor to be created should reside at pixel
	* position InPt in the view associated with the factory.
	*/
	public void setPlaceAt(PointF InPt) {
		PlaceAt = true;
		PlacePoint = InPt;
	}

	/**
	* Returns the last place used in a setPlaceAt() call.
	*/
	public PointF getPlaceAt() {
		return (PlacePoint);
	}

	/**
	* Sets that the factory will not attempt to place the depictor at a
	* particular pixel location.  A default will be used instead.
	*/
	public void setNoPlaceAt() {
		PlaceAt = false;
	}
	/**
	* Clears all flags related to the spatial placement of a depictor.
	*/
	public void clearPlaceAt() {
		PlaceAt = false;
	}

	private boolean PlaceAt = false;
	private PointF PlacePoint = null;

	/**
	* Sets whether the next depictor created will have its text label image
	* automatically created by the factory instance.
	*/
	public void setTxtImg(boolean in) {
		TxtImg = in;
	}
	/**
	* Gets the variable name for the last depictor handled by
	* {@link #newNamedDrawObj()}
	*/
	public FlexString getVectName() {
		return (NamedDrawObj.getVectName());
	}
	/**
	* Gets the coordinate fragment ID for the last depictor handled by
	* {@link #newNamedDrawObj()}
	*/
	public FlexString getFragID() {
		return (NamedDrawObj.getFragID());
	}
	/**
	* Gets the last depictor handled by
	* {@link #newNamedDrawObj()}
	*/
	public DrawObj getNamedDrawObj() {
		return (NamedDrawObj);
	}
	/**
	* Gets the coordinate context for the last depictor handled by
	* {@link #newNamedDrawObj()}
	*/
	public CoordContext getNamedCoord() {
		return (NamedCoord);
	}

	/**
	* Takes a raw depictor instance, and fixes its naming conventions.
	*/
	public void newNamedDrawObj() {
		NamedDrawObj = getRawDrawObj();
		NamedCoord = getRawCoord(NamedDrawObj);

		if (ApplyNaming) {
			FlexString Vari = new FlexString();
			(getNewVectName()).copyString(Vari);
			NamedDrawObj.setVectName(Vari);
			String Str = (NamedDrawObj.getVectName()).exportString();
			if (TxtImg)
				try {
					NamedDrawObj.setDepicImage(
						Manager.makeDepicMathImage(
							Str,
							NamedDrawObj.getTextColor(),
							NamedDrawObj.getTextPtSz(),
							getVectNamed()));
				}
				catch (Exception ex) {
					throw (new WrapRuntimeException(ex));
				}
			(getNewFragName()).copyString(NamedDrawObj.getFragID());
			NamedDrawObj.setNamedVar(getVectNamed());
		}
	}
	/**
	* Clears all flags related to depictor naming.
	*/
	public void clearNamedDrawObj() {
		NamedDrawObj = null;
		ApplyNaming = true;
		TxtImg = true;
	}

	private boolean TxtImg = true;
	private DrawObj NamedDrawObj = null;
	private CoordContext NamedCoord = null;
	private boolean ApplyNaming = true;
	/**
	* Sets whether any naming conventions should be applied to the next depictor to
	* be created.
	*/
	public void setApplyNaming(boolean in) {
		ApplyNaming = in;
	}
	/**
	* Sets that the next depictor created will not have a user variable name associated with it.
	*/
	public void setNewVectNotNamed() {
		VectNamed = false;
		InputVectName = null;
		handleVectNameChange(true);
	}
	/**
	* Clears any name previously set for the next depictor to be created.
	*/
	public void clearNewVectName() {
		VectNamed = false;
		InputVectName = null;
		handleVectNameChange(true);
	}
	/**
	* Sets a new user variable name for the next depictor to be created.
	*/
	public void setNewVectName(FlexString in) {
		VectNamed = true;
		InputVectName = in;
		handleVectNameChange(true);
	}
	/**
	* Sets a new user variable name for the next depictor to be created.
	*/
	public void setNewVectName(String in) {
		VectNamed = true;
		InputVectName = new FlexString(in);
		handleVectNameChange(true);
	}
	/**
	* Gets the name for the next depictor to be created.  Note: this may not be a user-level name.
	*/
	public FlexString getNewVectName() {
		if (VectNameDirty) {
			if (VectName == null)
				VectName = new FlexString();

			if (isVectNameValid()) {
				InputVectName.copyString(VectName);
			}
			else {
				VectName.clearString();
				VectName.setInsertPoint(0);
				VectName.insertJavaString("~dp_");
				VectName.insertJavaString((new Integer(getUnqID())).toString());
			}

		}

		VectNameDirty = false;
		return (VectName);
	}

	/**
	* Returns whether the next depictor created has a user-level name.
	*/
	public boolean isVectNameValid() {
		boolean valid = true;

		if (!VectNamed)
			valid = false;
		else {
			if (getRawDrawObjSelfNaming()) {
				valid = false;
			}
		}

		return (valid);
	}

	/**
	* Gets whether the next depictor created will have a user-level name.
	*/
	public boolean getVectNamed() {
		return (VectNamed && !(getRawDrawObjSelfNaming()));
	}
	/**
	* Handles a change to the name conventions.
	*/
	protected void handleVectNameChange(boolean in) {
		VectNameDirty = VectNameDirty || in;
	}

	private boolean VectNamed = false;
	private FlexString VectName = null;
	private FlexString InputVectName = null;
	private boolean VectNameDirty = true;

	/**
	* Gets the fragment ID for the next depictor created.
	*/
	public FlexString getNewFragName() {
		if (FragNameDirty) {
			if (FragName == null)
				FragName = new FlexString();

			FragName.clearString();
			FragName.setInsertPoint(0);
			FragName.insertChar('_');
			FragName.insertJavaString((new Integer(getUnqID())).toString());
			FragName.insertChar('_');
		}

		FragNameDirty = false;
		return (FragName);
	}

	/**
	* Handles a change to the fragment ID.
	*/
	protected void handleFragNameChange(boolean in) {
		FragNameDirty = FragNameDirty || in;
	}

	private FlexString FragName = null;
	private boolean FragNameDirty = true;

	/**
	* Gets the unique value to use for the fragment ID.
	*/
	public int getUnqID() {
		if (UseReplaceUnqID)
			return (ReplaceUnqID);
		else
			return (Manager.getUnqID());
	}
	/**
	* Sets the unique value to be used for the fragment ID.
	*/
	public void setUnqID(int in) {
		if (UseReplaceUnqID)
			ReplaceUnqID = in;
		else
			Manager.setUnqID(in);

		handleUnqIDChange(true);
	}
	/**
	* Sets a replacement value for the fragment ID.
	*/
	public void setReplaceUnqID(boolean in) {
		UseReplaceUnqID = in;
		handleUnqIDChange(true);
	}
	/**
	* Clears a replacement value for the fragment ID.
	*/
	public void clearReplaceUnqID() {
		UseReplaceUnqID = false;
		handleUnqIDChange(true);
	}
	/**
	* Handles a change in the fragment ID conventions.
	*/
	protected void handleUnqIDChange(boolean in) {
		handleFragNameChange(true);
		handleVectNameChange(true);
	}

	private boolean UseReplaceUnqID = false;
	private int ReplaceUnqID = 0;

	/**
	* Sets a replacement depictor to be used instead of creating one.  This can be useful
	* when implementing "undo" because it allows a factory to "create" a depictor that
	* already existed, but may no longer be in the rendering lists of the various views.
	*/
	public void setReplaceDrawObj(DrawObj MyObj, boolean SelfNaming) {
		ReplaceDrawObj = MyObj;
		ReplaceSelfNaming = SelfNaming;
		UseReplaceDrawObj = true;
		handleRawDrawObjChange(true);
	}
	/**
	* Clears any use of a replacement depictor.
	*/
	public void clearReplaceDrawObj() {
		ReplaceDrawObj = null;
		UseReplaceDrawObj = false;
		handleRawDrawObjChange(true);
	}
	/**
	* Gets the "raw" depictor instance to be integrated into the system.
	*/
	public DrawObj getRawDrawObj() {
		DrawObj MyObj = null;

		if (UseReplaceDrawObj) {
			MyObj = ReplaceDrawObj;
		}
		else {
			Class<? extends DrawObj> DepicClass = getDepicClass();

			try {
				MyObj = DepicClass.newInstance();
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Depic Create Failed", e));
			}
		}

		if (MyObj != null) {
			if (FrontLineColor != null)
				MyObj.setFrontLineColor(FrontLineColor);
			if (BackLineColor != null)
				MyObj.setBackLineColor(BackLineColor);
			if (TextColor != null)
				MyObj.setTextColor(TextColor);
		}

		return (MyObj);
	}

	/**
	* Gets the raw coordinate context to be integrated into the system.
	*/
	private CoordContext getRawCoord(DrawObj RawDrawObj) {
		CoordContext MyCoord = null;

		if (UseReplaceDrawObj) {
			MyCoord = ReplaceCoord;
		}
		else {
			MyCoord = RawDrawObj.makeCoordContext();
		}

		return (MyCoord);
	}

	/**
	* Gets whether the depictor can represent a user variable name.  Returns
	* true if it can't, and therefore must "self-name".
	*/
	public boolean getRawDrawObjSelfNaming() {
		if (UseReplaceDrawObj)
			return (ReplaceSelfNaming);
		else
			return (getClassSelfNaming());
	}

	/**
	* Handles a change to the object creation state.
	*/
	protected void handleRawDrawObjChange(boolean in) {
		handleFragNameChange(true);
		handleVectNameChange(true);
	}

	private boolean UseReplaceDrawObj = false;
	private DrawObj ReplaceDrawObj = null;
	private CoordContext ReplaceCoord = null;
	private boolean ReplaceSelfNaming = false;

	/**
	* Sets the class for the next new depictor created, and whether the
	* depictor-type is self-naming.
	*/
	public void setDepicClass(Class in, boolean SelfName) {
		DepicClass = in;
		DepicClassDirty = false;
		DepicClassCreatorType = ClassDirect;
		ClassSelfNaming = SelfName;
		handleDepicClassChange(false);
	}

	/**
	* Sets the depictor class for the next new depictor created to be the same
	* as the depictor passed in the parameter.  Also sets whether the depictor-type
	* is self-naming.
	*/
	public void setDepicClass(DrawObj in, boolean SelfName) {
		setDepicClass(in.getClass(), SelfName);
	}

	/**
	* Sets the class for the next new depictor created by numeric mode.
	*/
	public void setDepicClass(int Mode) {
		if ((AltMode != Mode) || (DepicClassCreatorType != ClassAltMode)) {
			AltMode = Mode;
			DepicClassCreatorType = ClassAltMode;
			handleDepicClassChange(true);
		}

	}

	/**
	* Sets the class of the next depictor to be created by its class name.
	*/
	public void setDepicClassPhysicalName(String in) {
		if ((StringCreator != in) || (DepicClassCreatorType != ClassByPhysName)) {
			StringCreator = in;
			DepicClassCreatorType = ClassByPhysName;
			handleDepicClassChange(true);
		}

	}

	/**
	* Sets the class of the next depictor to be created by its human-reabable name.
	*/
	public void setDepicClass(String in) {
		if ((StringCreator != in) || (DepicClassCreatorType != ClassByLogicalName)) {
			StringCreator = in;
			DepicClassCreatorType = ClassByLogicalName;
			handleDepicClassChange(true);
		}

	}

	/**
	* Gets whether the next depictor to be created is self-naming.
	*/
	public boolean getClassSelfNaming() {
		if (!DepicClassDirty)
			return (ClassSelfNaming);
		else {
			Class MyClass = getDepicClass();
			return (ClassSelfNaming);
		}
	}

	/**
	* Gets the class of the next depictor to be created.
	*/
	public Class<? extends DrawObj> getDepicClass() {
		Class<? extends DrawObj> MyClass = null;

		if (!DepicClassDirty)
			MyClass = DepicClass;
		else {
			switch (DepicClassCreatorType) {
				case ClassAltMode :
					ClassSelfNaming = (Manager.getDepictorNode(AltMode)).SelfNaming;
					MyClass = Manager.getDepictorClass(AltMode);
					break;

				case ClassByPhysName :
					try {
						MyClass = (Class<? extends DrawObj>)( Class.forName(StringCreator, true, Meta.getDefaultClassLoader()) );
					}
					catch (Exception e) {
						throw (new WrapRuntimeException("Class Grab Failed", e));
					}
					break;

				case ClassByLogicalName :
					DepicClassStore mySt = Manager.getDepicStore();
					MyClass = mySt.getDepictorClass(StringCreator);
					ClassSelfNaming = mySt.getSelfName();
					break;
			}
		}

		DepicClassDirty = false;
		DepicClass = MyClass;
		return (MyClass);
	}

	/**
	* Handles changes to the depictor class.
	*/
	protected void handleDepicClassChange(boolean in) {
		DepicClassDirty = DepicClassDirty || in;
		handleRawDrawObjChange(true);
	}

	/**
	* Gets whether the next depictor created will be
	* deleted immediately after all constraints on it are removed.
	*/
	public boolean getTemporary() {
		return (Temporary);
	}
	/**
	* Sets whether the next depictor created will be
	* deleted immediately after all constraints on it are removed.
	*/
	public void setTemporary(boolean in) {
		Temporary = in;
	}

	/**
	* Gets whether the model will update itself after the next depictor is created.
	*/
	public boolean getRefigureAlloc() {
		return (RefigureAlloc);
	}
	/**
	* Sets whether the model will update itself after the next depictor is created.
	*/
	public void setRefigureAlloc(boolean in) {
		RefigureAlloc = in;
	}

	/**
	* Gets whether the geometry engine will recalculate after
	* the next depicror is created.
	*/
	public boolean getResolveConstraints() {
		return (ResolveConstraints);
	}
	/**
	* Sets whether the geometry engine will recalculate after
	* the next depicror is created.
	*/
	public void setResolveConstraints(boolean in) {
		ResolveConstraints = in;
	}

	/**
	* Gets whether all views will be repainted after
	* the next depicror is created.
	*/
	public boolean getRepaint() {
		return (Repaint);
	}
	/**
	* Sets whether all views will be repainted after
	* the next depicror is created.
	*/
	public void setRepaint(boolean in) {
		Repaint = in;
	}

	/**
	* Gets whether the system will record how to undo the
	* creation of the depictor. (future expansion).
	*/
	public boolean getUseCreateUndo() {
		return (UseCreateUndo);
	}
	/**
	* Sets whether the system will record how to undo the
	* creation of the depictor. (future expansion).
	*/
	public void setUseCreateUndo(boolean in) {
		UseCreateUndo = in;
	}

	/**
	* Returns the last creator string set in this factory.
	*/
	public String getStringCreator() {
		return (StringCreator);
	}

	/**
	* Clears all miscellaneous flags.
	*/
	public void clearMiscFlags() {
		Temporary = false;
		RefigureAlloc = true;
		ResolveConstraints = true;
		Repaint = true;
		UseCreateUndo = true;
	}

	private final int ClassDirect = 1;
	private final int ClassAltMode = 2;
	private final int ClassByPhysName = 3;
	private final int ClassByLogicalName = 4;

	private Class DepicClass = null;
	private boolean ClassSelfNaming = false;
	private boolean DepicClassDirty = true;
	private int DepicClassCreatorType = ClassAltMode;
	private int AltMode = 1;
	private String StringCreator = null;

	private boolean Temporary = false;
	private boolean RefigureAlloc = true;
	private boolean ResolveConstraints = true;
	private boolean Repaint = true;
	private boolean UseCreateUndo = true;

	private ToolPort SymTarget = null;
	private IFactoryModel Manager = null;
}
