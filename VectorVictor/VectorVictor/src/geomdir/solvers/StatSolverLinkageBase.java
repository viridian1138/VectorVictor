


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

import geomdir.engine.ASGHashMap;
import geomdir.engine.ASGNode;
import geomdir.engine.ExpNode;
import geomdir.engine.ExprHashMap;

import java.util.Iterator;

import meta.*;



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
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed a common solver linkage for global minimization.              | Created GlobalMinimizationSolverLinkage.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for scale tolerances in constraint solving.           | Added code for handling scale tolerances.
*    | 01/28/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need to support persistence in solver linkages.                      | Added persistence support to solver linkages.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added support for performance enhancements.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Created StatSolverLinkage as part of clean-compile (but not working) version of experimental solver (StatSolver).
*    | 10/17/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Fixed several problems with StatSolver.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Created StatSolverLinkageBase from StatSolverLinkage.
*    | 04/11/2003            | Thorn Green (viridian_1138@yahoo.com)           | Bug prevented StatSolver from operating more than once.              | Fixed the bug.
*    | 04/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | StatSolver struggles with vague states.                              | Added failedMethodology mode to compensate.
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
* Experimental constraint solver linkage.
*/
public abstract class StatSolverLinkageBase extends AdvancedSolverLinkage {
	public boolean link(
		final ASGHashMap alphaVar,
		final ASGHashMap dynAlphaVar,
		final ExprHashMap lHSimplicitExp,
		final ExprHashMap rHSimplicitExp,
		final ExprHashMap dynLHSimplicitExp,
		final ExprHashMap dynRHSimplicitExp) {
		int mSpace = 0;
		int numEqn = 0;
		alphaVarMap = alphaVar;
		dynAlphaVarMap = dynAlphaVar;
		lHSimplicitExpMap = lHSimplicitExp;
		rHSimplicitExpMap = rHSimplicitExp;
		dynLHSimplicitExpMap = dynLHSimplicitExp;
		dynRHSimplicitExpMap = dynRHSimplicitExp;

		mSpace = Math.max(getMstackSpaceRequired(lHSimplicitExp), mSpace);
		mSpace = Math.max(getMstackSpaceRequired(rHSimplicitExp), mSpace);
		mSpace = Math.max(getMstackSpaceRequired(dynLHSimplicitExp), mSpace);
		mSpace = Math.max(getMstackSpaceRequired(dynRHSimplicitExp), mSpace);

		expAlphaVarList.eraseAllInfo();
		totAlphaVarList.eraseAllInfo();
		expDynAlphaVarList.eraseAllInfo();
		totDynAlphaVarList.eraseAllInfo();
		lHSimplicitExpList.eraseAllInfo();
		rHSimplicitExpList.eraseAllInfo();
		dynLHSimplicitExpList.eraseAllInfo();
		dynRHSimplicitExpList.eraseAllInfo();

		{
		Iterator<ASGNode> it = alphaVarMap.values().iterator();

		while (it.hasNext()) {
			ASGNode asg = it.next();
			asg.getMvec().mcpy(asg.getMinimizationMvec());
			totAlphaVarList.insertRight(asg);

			if (asg.getExpNode() != null) {
				expAlphaVarList.insertRight(asg);
				mSpace = Math.max(asg.getExpNode().getMstackSpaceRequired(), mSpace);
				numEqn++;
			}
		}

		if (dynAlphaVarMap != null) {
			it = dynAlphaVarMap.values().iterator();

			while (it.hasNext()) {
				ASGNode asg = it.next();
				asg.getMvec().mcpy(asg.getMinimizationMvec());
				totDynAlphaVarList.insertRight(asg);

				if (asg.getExpNode() != null) {
					expDynAlphaVarList.insertRight(asg);
					mSpace = Math.max(asg.getExpNode().getMstackSpaceRequired(), mSpace);
					numEqn++;
				}
			}
		}
		}

		Iterator<FlexString> it;
		if (lHSimplicitExpMap != null) {
			it = lHSimplicitExpMap.keySet().iterator();

			while (it.hasNext()) {
				FlexString key = it.next();
				ExpNode left = lHSimplicitExpMap.get(key);
				ExpNode right = rHSimplicitExpMap.get(key);
				lHSimplicitExpList.insertRight(left);
				rHSimplicitExpList.insertRight(right);
				numEqn++;
			}
		}

		if (dynLHSimplicitExpMap != null) {
			it = dynLHSimplicitExpMap.keySet().iterator();

			while (it.hasNext()) {
				FlexString key = it.next();
				ExpNode left = dynLHSimplicitExpMap.get(key);
				ExpNode right = dynRHSimplicitExpMap.get(key);
				dynLHSimplicitExpList.insertRight(left);
				dynRHSimplicitExpList.insertRight(right);
				numEqn++;
			}
		}

		if (!(expAlphaVarList.empty()))
			expAlphaVarList.searchHead();
		if (!(totAlphaVarList.empty()))
			totAlphaVarList.searchHead();
		if (!(expDynAlphaVarList.empty()))
			expDynAlphaVarList.searchHead();
		if (!(totDynAlphaVarList.empty()))
			totDynAlphaVarList.searchHead();
		if (!(lHSimplicitExpList.empty()))
			lHSimplicitExpList.searchHead();
		if (!(rHSimplicitExpList.empty()))
			rHSimplicitExpList.searchHead();
		if (!(dynLHSimplicitExpList.empty()))
			dynLHSimplicitExpList.searchHead();
		if (!(dynRHSimplicitExpList.empty()))
			dynRHSimplicitExpList.searchHead();

		this.numEqn = numEqn;
		mStackSpaceRequired = mSpace;
		exec.setMstackSpaceRequired(mSpace);

		optimizeAllRep(exec, alphaVar);
		optimizeAllRep(exec, lHSimplicitExpMap);
		optimizeAllRep(exec, rHSimplicitExpMap);
		if (dynAlphaVar != null) {
			optimizeAllRep(exec, dynAlphaVar);
			optimizeAllRep(exec, dynLHSimplicitExpMap);
			optimizeAllRep(exec, dynRHSimplicitExpMap);
		}

		return (false);
	}

	public boolean postLinkAnalyze(
		final ASGHashMap alphaVar,
		final ASGHashMap dynAlphaVar,
		final ExprHashMap lHSimplicitExp,
		final ExprHashMap rHSimplicitExp,
		final ExprHashMap dynLHSimplicitExp,
		final ExprHashMap dynRHSimplicitExp) {
		varr = new VirtualArray(alphaVar, dynAlphaVar);

		solver = createStatSolver();

		solver.postLinkInitialize(numEqn, varr);

		return (false);
	}

	/**
	* Returns the amount of required Mstack space based on the list contents.
	*/
	protected final int getMstackSpaceRequired(final ExprHashMap in) {
		int mSpace = 0;
		if (in != null) {
			Iterator<ExpNode> it = in.values().iterator();
			while (it.hasNext()) {
				ExpNode exp = it.next();
				mSpace = Math.max(exp.getMstackSpaceRequired(), mSpace);
			}
		}

		return (mSpace);
	}

	/**
	* Attempts to solve the constraints.  Returns true iff. unable to solve.
	* This is where a numeric solver would perform most of its computations.
	*/
	public boolean resolveConstraints() {
		int cnt = 0;
		boolean ret = false;
		boolean done = false;
		while (!done) {
			solver.initialize(numEqn, varr); /* !!!!!!!!!!!!!!!!!!!!!!!!!! for now !!!!!!!!!!!!!!!!! */
			ret = solver.findRoot(varr);
			done = ( !ret ) || (cnt > 25);
			cnt++;
		}
		return (ret);
	}

	/**
	* Releases memory associated with the linkage.
	*/
	public void releaseLinkage() {
		varr = null;

		expAlphaVarList.eraseAllInfo();
		totAlphaVarList.eraseAllInfo();
		expDynAlphaVarList.eraseAllInfo();
		totDynAlphaVarList.eraseAllInfo();
		lHSimplicitExpList.eraseAllInfo();
		rHSimplicitExpList.eraseAllInfo();
		alphaVarMap = null;
		dynAlphaVarMap = null;
		lHSimplicitExpMap = null;
		rHSimplicitExpMap = null;
		dynLHSimplicitExpMap = null;
		dynRHSimplicitExpMap = null;
	}

	/**
	* Gets the current scale tolerance. Routes through the standard tolerance object.
	*/
	public double getScaleTolerance() {
		return (tol.getScaleTolerance());
	}

	/**
	* Sets the scale tolerance of the assumed rendering system. Routes through the standard
	* tolerance object.
	*/
	public void setScaleTolerance(final double in) {
		tol.setScaleTolerance(in);
		System.out.println("Scale Tol : " + in);
	}

	public boolean propagateDragValue() {
		return (false);
	}

	protected void evalAllMinFun(final double[] X, final InternalVirtualArray Y, final double[] minval) {
		int sz = varr.getSize();
		int count;

		for (count = 0; count < sz; count++)
			varr.setVal(count, X[count]);

		int idx = 0;

		idx = exec.deltaAllExpressions(expAlphaVarList, idx, Y);
		idx = exec.deltaAllExpressions(expDynAlphaVarList, idx, Y);

		idx = exec.deltaAllImplicitExpressions(lHSimplicitExpList, rHSimplicitExpList, idx, Y);
		idx = exec.deltaAllImplicitExpressions(dynLHSimplicitExpList, dynRHSimplicitExpList, idx, Y);

		exec.deltaAllMinimizationDirectives(totAlphaVarList, false, minval);
		exec.deltaAllMinimizationDirectives(totDynAlphaVarList, true, minval);
	}

	public void initXAxisArrays(
		final double[] epsilon,
		final double[] intStart,
		final double[] intEnd,
		final double[] guessStart,
		final double[] guessEnd,
		final int[] minimizationDefines,
		final double[] minimizationValues) {
		exec.initXAxisArrays(
			alphaVarMap,
			dynAlphaVarMap,
			varr,
			tol,
			epsilon,
			intStart,
			intEnd,
			guessStart,
			guessEnd,
			minimizationDefines,
			minimizationValues);
	}

	public abstract StatSolverBase createStatSolver();

	/**
	* Tolerance used in calculating the minimizations.
	*/
	protected StatSolverTolerance tol = new StatSolverTolerance();

	/**
	* Executor used for calculating minimization values.
	*/
	transient protected StatSolverExec exec = new StatSolverExec();

	/**
	* Virtual array used for calculating minimization values.
	*/
	protected VirtualArray varr;

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ASGNode>,ASGNode> expAlphaVarList = new HighLevelList<StdLowLevelList<ASGNode>,ASGNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ASGNode>,ASGNode> totAlphaVarList = new HighLevelList<StdLowLevelList<ASGNode>,ASGNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ASGNode>,ASGNode> expDynAlphaVarList = new HighLevelList<StdLowLevelList<ASGNode>,ASGNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ASGNode>,ASGNode> totDynAlphaVarList = new HighLevelList<StdLowLevelList<ASGNode>,ASGNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ExpNode>,ExpNode> lHSimplicitExpList = new HighLevelList<StdLowLevelList<ExpNode>,ExpNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ExpNode>,ExpNode> rHSimplicitExpList = new HighLevelList<StdLowLevelList<ExpNode>,ExpNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ExpNode>,ExpNode> dynLHSimplicitExpList = new HighLevelList<StdLowLevelList<ExpNode>,ExpNode>();

	/**
	* List of all non-implicit expressions as a set of ASG nodes.
	*/
	protected HighLevelList<StdLowLevelList<ExpNode>,ExpNode> dynRHSimplicitExpList = new HighLevelList<StdLowLevelList<ExpNode>,ExpNode>();

	/**
	* Map of variables.
	*/
	protected ASGHashMap alphaVarMap = null;

	/**
	* Map of DynRunner variables.
	*/
	protected ASGHashMap dynAlphaVarMap = null;

	/**
	* Left side of implicit equations.
	*/
	protected ExprHashMap lHSimplicitExpMap = null;

	/**
	* Right side of implicit equations.
	*/
	protected ExprHashMap rHSimplicitExpMap = null;

	/**
	* Left side of DynRunner implicit equations.
	*/
	protected ExprHashMap dynLHSimplicitExpMap = null;

	/**
	* Right side of DynRunner implicit equations.
	*/
	protected ExprHashMap dynRHSimplicitExpMap = null;

	/**
	* Amount of space required on the Mstack.
	*/
	protected int mStackSpaceRequired = 0;

	/**
	* The current number of equations.
	*/
	protected int numEqn = 0;

	protected StatSolverBase solver;
}
