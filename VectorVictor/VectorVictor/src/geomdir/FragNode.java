




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
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.FlexString;
import meta.Meta;
import meta.VersionBuffer;

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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed FragNode to be compatible with the new clustering.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/23/2002            | Thorn Green (viridian_1138@yahoo.com)           | Looking for problem when loading assoc.geo.                          | Made small debug change, then reversed it.  Should be no lasting change.
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
* A node that defines all the information associated with a
* variable name, including the set of sepictors associated with the variable.
* @author Thorn Green
*/
public class FragNode extends Meta implements Externalizable {

	private IntObj SelfAlloc = new IntObj();
	private IntObj RealSelfAlloc = new IntObj();
	private IntObj Movable = new IntObj();
	private FlexString VectName = new FlexString();
	private Mvec Vect = new Mvec();
	private IntObj Domain = new IntObj();
	private IntObj IODef = new IntObj();
	private DGMHashMap FragMap = new DGMHashMap();

	/**
	* Gets the reference to the information set to the depictor about
	* whether the variable is being allocated by an entity outside the depictor.
	*/
	public final IntObj getSelfAlloc() {
		return (SelfAlloc);
	}
	/**
	* Gets the reference holding whether the variable is really being allocated
	* by an entity outside the FragNode.
	*/
	public final IntObj getRealSelfAlloc() {
		return (RealSelfAlloc);
	}
	/**
	* Gets whether the variable is movable.
	*/
	public final IntObj getMovable() {
		return (Movable);
	}
	/**
	* Gets the name of the variable.
	*/
	public final FlexString getVectName() {
		return (VectName);
	}
	/**
	* Gets the multivector associated with the variable.
	*/
	public final Mvec getVect() {
		return (Vect);
	}
	/**
	* Gets the reference to the domain of the variable.
	*/
	public final IntObj getDomain() {
		return (Domain);
	}
	/**
	* Gets the reference to the I/O status of the variable.  This
	* stores information such as whether the variable is an input or output
	* variable.
	*/
	public final IntObj getIODef() {
		return (IODef);
	}
	/**
	* Gets the {@link DGMNode} list for the set of depictors associated
	* with the variable.
	*/
	public final DGMHashMap getFragMap() {
		return (FragMap);
	}

	/**
	* Sets the reference to the information set to the depictor about
	* whether the variable is being allocated by an entity outside the depictor.
	* The depictor will not allow itself to be deleted is it believes that at
	* least one of its ports holds a value allocated outside itself because this
	* could lead to an untraceable dangling reference.  In cases where the variable
	* is externally allocated, but no such dangling reference could occurr, the FragNode
	* lets the depictor think that it has allocated the variable.
	*/
	public final void setSelfAlloc(IntObj in) {
		SelfAlloc = in;
	}
	/**
	* Sets the reference holding whether the variable is really being allocated
	* by an entity outside the FragNode.
	*/
	public final void setRealSelfAlloc(IntObj in) {
		RealSelfAlloc = in;
	}
	/**
	* Sets whether the variable is movable.
	*/
	public final void setMovable(IntObj in) {
		Movable = in;
	}
	/**
	* Sets the name of the variable.
	*/
	public final void setVectName(FlexString in) {
		VectName = in;
	}
	/**
	* Sets the reference to the multivector holding the value
	* of the variable.
	*/
	public final void setVect(Mvec in) {
		Vect = in;
	}
	/**
	* Sets the reference to the domain of the variable.
	*/
	public final void setDomain(IntObj in) {
		Domain = in;
	}
	/**
	* Sets the reference to the I/O status of the variable.  This
	* stores information such as whether the variable is an input or output
	* variable.
	*/
	public final void setIODef(IntObj in) {
		IODef = in;
	}

	/**
	* Reads persietent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			SelfAlloc = (IntObj) (myv.getProperty("SelfAlloc"));
			VersionBuffer.chkNul(SelfAlloc);
			RealSelfAlloc = (IntObj) (myv.getProperty("RealSelfAlloc"));
			VersionBuffer.chkNul(RealSelfAlloc);
			Movable = (IntObj) (myv.getProperty("Movable"));
			VersionBuffer.chkNul(Movable);
			VectName = (FlexString) (myv.getProperty("VectName"));
			VersionBuffer.chkNul(VectName);
			Vect = (Mvec) (myv.getProperty("Vect"));
			VersionBuffer.chkNul(Vect);
			Domain = (IntObj) (myv.getProperty("Domain"));
			VersionBuffer.chkNul(Domain);
			IODef = (IntObj) (myv.getProperty("IODef"));
			VersionBuffer.chkNul(IODef);
			FragMap = (DGMHashMap) (myv.getProperty("FragMap"));
			VersionBuffer.chkNul(FragMap);
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	}

	/**
	* Writes persietent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("SelfAlloc", SelfAlloc);
		myv.setProperty("RealSelfAlloc", RealSelfAlloc);
		myv.setProperty("Movable", Movable);
		myv.setProperty("VectName", VectName);
		myv.setProperty("Vect", Vect);
		myv.setProperty("Domain", Domain);
		myv.setProperty("IODef", IODef);
		myv.setProperty("FragMap", FragMap);

		out.writeObject(myv);
	}

	/**
	* Loads persistent properties.
	*/
/*	public void loadProperties(DepictorPort ThePort, VTextProperties MyProp, String InKey) throws DataFormatException {
		String key = InKey + "." + VectName.exportString();

		ThePort.loadMvecProperties(MyProp, key + ".Vect", Vect);

	} */

	/**
	* Saves persietent properties.
	*/
/*	public void saveProperties(DepictorPort ThePort, VTextProperties MyProp, String InKey) {
		String key = InKey + "." + VectName.exportString();

		ThePort.saveMvecProperties(MyProp, key + ".Vect", Vect);

		if ((Movable.value & DepictorPort.MABLE_ASGN_MASK) > 0) {
			ThePort.registerPersistentConstraint(MyProp, VectName);
		}

	} */

	public void wake() {};
}
