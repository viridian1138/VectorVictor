



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




package geomdir.engine;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Externalizable;
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
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed a mechanism to represent a variety of solvers.                | Created SolverLinkage.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for scale tolerances in constraint solving.           | Added code for handling scale tolerances.
*    | 01/28/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need to support persistence in solver linkages.                      | Added persistence support to solver linkages.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added methods to support performance enhancements.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
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
* Base class for all solver linkages used by GeomEngine.  Capable of handling
* both numeric and symbolic solvers.<BR>
* <BR>
* @author Thorn Green
*/
public abstract class SolverLinkage extends Object implements Externalizable {
	/**
	* Links the constraint set.  This is where a symbolic solver would do most
	* of its work.  Takes in a list of global variables <code>alphaVarList</code>,
	* a list of DynRunner variables <code>DynAlphaVarList</code>, a list of
	* global implicit expressions in <code>LHSimplicitExpList</code> and 
	* <code>RHSimplicitExpList</code>, and a list of DynRunner implicit
	* expressions in <code>DynLHSimplicitExpList</code> and <code>DynRHSimplicitExpList</code>.
	*/
	public abstract boolean link(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList);

	public boolean postLinkAnalyze(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList) {
		return (false);
	}

	/**
	* Attempts to solve the constraints.  Returns true iff. unable to solve.
	* This is where a numeric solver would perform most of its computations.
	*/
	public abstract boolean resolveConstraints();

	/**
	* Releases memory allocated by the linkage.
	*/
	public abstract void releaseLinkage();

	/**
	* Sets the Mable factors for an ASGNode according to what the
	* solver thinks it can handle.
	*/
	public abstract void setASGMable(ASGNode asg, boolean implicitUse);

	/**
	* Gets the current scale tolerance.
	*/
	public abstract double getScaleTolerance();

	/**
	* Sets the scale tolerance of the assumed rendering system.  Assumes that the number passed in
	* the parameter is the pixel tolerance divided by two (i.e. divided to deal with Nyquist considerations).
	* If the solver extending this class does not require tolerances (e.g. because it is a symbolic rather
	* than a numeric solver), the class must still support the get-set methods on the scale tolerance
	* property but it may ignore any value passed to it.
	*/
	public abstract void setScaleTolerance(double in);

	/**
	* Optimizes.  This method may be deleted in the future.
	*/
	public void optimizeRep(ExprHashMap map) {}

	public boolean propagateDragValue() {
		return (true);
	}

	/**
	* Directs the executor <code>exec</code> to optimize all expressions in <code>map</code>.
	*/
	protected final void optimizeAllRep(Executor exec, ExprHashMap map) {
		Iterator<ExpNode> it = map.values().iterator();
		while (it.hasNext()) {
			ExpNode exp = it.next();
			exec.attachEvalObj(exp);
		}
	}

	/**
	* Directs the executor <code>exec</code> to optimize all expressions in <code>map</code>.
	*/
	protected final void optimizeAllRep(Executor exec, ASGHashMap map) {
		Iterator<ASGNode> it = map.values().iterator();
		while (it.hasNext()) {
			ASGNode asg = it.next();
			ExpNode exp = asg.getExpNode();
			if (exp != null)
				exec.attachEvalObj(exp);
		}
	}

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);
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

		out.writeObject(myv);
	}

}
