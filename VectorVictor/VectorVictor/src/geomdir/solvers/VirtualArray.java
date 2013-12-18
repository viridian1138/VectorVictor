

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


package geomdir.solvers;

import geomdir.Mvec;
import geomdir.engine.ASGHashMap;
import geomdir.engine.ASGNode;
import geomdir.engine.EngineConstants;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Iterator;

import meta.DataFormatException;
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
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed a mechanism for a scalar solver to affect multivectors.       | Created VirtualArray using a variant on some of the previous experimental code.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 01/28/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need to support persistence in solver linkages.                      | Added persistence support to solver linkages.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Inprove constraint solving.                                          | Modified VirtualArray to support StatSolver.
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
* An index that points at part of a multivector.<BR>
* <BR>
* @author Thorn Green
*/
abstract class VirtualIndex extends Object implements Externalizable {
	/**
	* Constructs the index. Takes in the multivector to be indexed.
	*/
	VirtualIndex(final Mvec in) {
		vect = in;
	}

	/**
	* Returns the value that the index is pointing to.
	*/
	public abstract double getVal();

	/**
	* Sets the value that the index is indexing to <code>val</code>.
	*/
	public abstract void setVal(final double val);

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			vect = (Mvec) (myv.getProperty("vect"));
			VersionBuffer.chkNul(vect);
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	}

	/**
	* Writes persistent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("vect", vect);

		out.writeObject(myv);
	}

	/**
	* The multivector being indexed by the VirtualIndex object.
	*/
	protected Mvec vect;
}

/**
* An index that points at the scalar section of a multivector.<BR>
* <BR>
* @author Thorn Green
*/
class VirtualIndexBasis extends VirtualIndex {
	/**
	* Constructs the index. Takes in the multivector to be indexed.
	*/
	public VirtualIndexBasis(final Mvec in) {
		super(in);
	}

	/**
	* Returns the value that the index is pointing to.
	*/
	public final double getVal() {
		return (vect.getBasis());
	}

	/**
	* Sets the value that the index is indexing to <code>val</code>.
	*/
	public final void setVal(final double val) {
		vect.setBasis(val);
	}
}

/**
* An index that points at the first vector basis of a multivector.<BR>
* <BR>
* @author Thorn Green
*/
class VirtualIndexBasis1 extends VirtualIndex {
	/**
	* Constructs the index. Takes in the multivector to be indexed.
	*/
	public VirtualIndexBasis1(final Mvec in) {
		super(in);
	}

	/**
	* Returns the value that the index is pointing to.
	*/
	public final double getVal() {
		return (vect.getBasis1());
	}

	/**
	* Sets the value that the index is indexing to <code>val</code>.
	*/
	public final void setVal(final double val) {
		vect.setBasis1(val);
	}
}

/**
* An index that points at the second basis vector of a multivector.<BR>
* <BR>
* @author Thorn Green
*/
class VirtualIndexBasis2 extends VirtualIndex {
	/**
	* Constructs the index. Takes in the multivector to be indexed.
	*/
	public VirtualIndexBasis2(final Mvec in) {
		super(in);
	}

	/**
	* Returns the value that the index is pointing to.
	*/
	public final double getVal() {
		return (vect.getBasis2());
	}

	/**
	* Sets the value that the index is indexing to <code>val</code>.
	*/
	public final void setVal(final double val) {
		vect.setBasis2(val);
	}
}

/**
* An index that points at the imaginary basis of a multivector.<BR>
* <BR>
* @author Thorn Green
*/
class VirtualIndexBasis12 extends VirtualIndex {
	/**
	* Constructs the index. Takes in the multivector to be indexed.
	*/
	public VirtualIndexBasis12(final Mvec in) {
		super(in);
	}

	/**
	* Returns the value that the index is pointing to.
	*/
	public final double getVal() {
		return (vect.getBasis12());
	}

	/**
	* Sets the value that the index is indexing to <code>val</code>.
	*/
	public final void setVal(final double val) {
		vect.setBasis12(val);
	}
}

/**
* VirtualArray provides an interface that allows an index-based constraint solver
* to communicate values with ASGNode and Executor as if it were dealing with an array
* of scalar values.  This makes it possible for a multiple-variable scalar solver
* to solve relations on multivectors.  The code for this class is an off-shoot of
* some of the experimental code the author wrote before his dissertation defense.<BR>
* <BR>
* @author Thorn Green
*/
public class VirtualArray extends Object implements Externalizable {
	/**
	* Constructs a virtual array capable of indexing both
	* GeomEngine and DynRunner variables.
	*/
	public VirtualArray(final ASGHashMap ASGList, final ASGHashMap DynASGList) {
		int sz = 0;
		Iterator it = ASGList.values().iterator();

		while (it.hasNext()) {
			ASGNode asg = (ASGNode) (it.next());
			sz = countASG(asg, sz, false);
		}

		if (DynASGList != null) {
			it = DynASGList.values().iterator();

			while (it.hasNext()) {
				ASGNode asg = (ASGNode) (it.next());
				sz = countASG(asg, sz, true);
			}
		}

		indx = new VirtualIndex[sz];
		int idx = 0;

		it = ASGList.values().iterator();

		while (it.hasNext()) {
			ASGNode asg = (ASGNode) (it.next());
			idx = addSlots(asg, idx, false);
		}

		if (DynASGList != null) {
			it = DynASGList.values().iterator();

			while (it.hasNext()) {
				ASGNode asg = (ASGNode) (it.next());
				idx = addSlots(asg, idx, true);
			}
		}

	}

	/**
	* Only use when subclassing VirtualArray.
	*/
	protected VirtualArray() {}

	/**
	* Calculates the result of placing indices pointing to the ASGNode <code>asg</code> in a series
	* of indexed slots in the array starting with index <code>ind</code>.
	* The index after the last slot added (if any) will be returned.
	* Iff. skipCousins is true, ASGNode objects with cousins will be skipped.
	*/
	protected int countASG(final ASGNode asg, final int ind, final boolean skipCousins) {
		int idx = ind;

		int iod = asg.getIODef();
		boolean outp = (iod >= EngineConstants.IO_DEF_OUTPUT_P1) || (iod == EngineConstants.IO_DEF_OBJECTIVE);

		if (outp && (!skipCousins || (asg.getDynCousin() == null))) {
			int dom = asg.getDomain();
			if ((dom & EngineConstants.DOM_SCA) != 0)
				idx++;
			if ((dom & EngineConstants.DOM_VECT1) != 0)
				idx++;
			if ((dom & EngineConstants.DOM_VECT2) != 0)
				idx++;
			if ((dom & EngineConstants.DOM_PSU) != 0)
				idx++;
		}

		return (idx);
	}

	/**
	* Places indices pointing to the ASGNode <code>asg</code> in a series
	* of indexed slots in the array starting with index <code>ind</code>.
	* The index after the last slot added (if any) will be returned.
	* Iff. skipCousins is true, ASGNode objects with cousins will be skipped.
	*/
	protected int addSlots(final ASGNode asg, final int ind, final boolean skipCousins) {
		int idx = ind;
		Mvec vect = asg.getMvec();

		int iod = asg.getIODef();
		boolean outp = (iod >= EngineConstants.IO_DEF_OUTPUT_P1) || (iod == EngineConstants.IO_DEF_OBJECTIVE);

		if (outp && (!skipCousins || (asg.getDynCousin() == null))) {
			int dom = asg.getDomain();

			if ((dom & EngineConstants.DOM_SCA) != 0) {
				indx[idx] = new VirtualIndexBasis(vect);
				idx++;
			}

			if ((dom & EngineConstants.DOM_VECT1) != 0) {
				indx[idx] = new VirtualIndexBasis1(vect);
				idx++;
			}

			if ((dom & EngineConstants.DOM_VECT2) != 0) {
				indx[idx] = new VirtualIndexBasis2(vect);
				idx++;
			}

			if ((dom & EngineConstants.DOM_PSU) != 0) {
				indx[idx] = new VirtualIndexBasis12(vect);
				idx++;
			}
		}

		return (idx);
	}

	/**
	* Returns the value in the virtual array at index <code>index</code>.
	*/
	public double getVal(final int index) {
		return (indx[index].getVal());
	}

	/**
	* Sets the value in the virtual array at index <code>index</code>
	* to the value <code>val</code>.
	*/
	public void setVal(final int index, final double val) {
		indx[index].setVal(val);
	}

	/**
	* Returns the number of indices in the virtual array.
	*/
	public int getSize() {
		return (indx.length);
	}

	/**
	* Copies all elements from the array "in" to the virtual array.
	*/
	public void copyArray(final double[] in) {
		int cnt;
		int sz = getSize();

		for (cnt = 0; cnt < sz; ++cnt) {
			setVal(cnt, in[cnt]);
		}

	}

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		VersionBuffer myv = (VersionBuffer) (in.readObject());

		indx = (VirtualIndex[]) (myv.getProperty("indx"));
	}

	/**
	* Writes persistent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("indx", indx);

		out.writeObject(myv);
	}

	/**
	* The set of virtual index objects used to exchange data with a series of ASGNode objects.
	*/
	protected VirtualIndex[] indx;
}
