


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
import geomdir.engine.Executor;
import geomdir.engine.ExpNode;

import java.util.Iterator;

import meta.HighLevelList;
import meta.StdLowLevelList;



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
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Created StatSolverExec as part of clean-compile (but not working) version of experimental solver (StatSolver).
*    | 10/17/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Fixed several problems with StatSolver.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Fixed several problems with StatSolver.
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
* Experimental constraint solver exec.
*/
public class StatSolverExec extends Executor {

	/**
	* Temporary variable.
	*/
	final protected Mvec tmp = new Mvec();

	/**
	* Temporary variable.
	*/
	final protected Mvec tmp2 = new Mvec();

	/**
	* Adds the result of an directive evaluation on <code>asg</code>
	* to the value <code>out</code>.  Uses <code>tol</code> to provide some tolerance information for 
	* calculating the magnitude of the addition.
	*/
	protected final void addDirectiveToMinimizationValueComp(final ASGNode asg, final double[] out) {
		Mvec resv = asg.getMvec();
		Mvec min = asg.getMinimizationMvec();

		double m = resv.getBasis() - min.getBasis();
		double m1 = resv.getBasis1() - min.getBasis1();
		double m2 = resv.getBasis2() - min.getBasis2();
		double m12 = resv.getBasis12() - min.getBasis12();

		double res = Math.abs(m) + Math.abs(m1) + Math.abs(m2) + Math.abs(m12);

		int iodef = asg.getIODef();

		if (iodef >= EngineConstants.IO_DEF_OUTPUT_P1) {
			//		int subdef = iodef % EngineConstants.IODefScaleTolerance;
			//		
			//		switch( subdef )
			//			{
			//			case EngineConstants.IODefOutputP1:
			//				{
			//				out[ 1 ] += res;
			//				}
			//				break;
			//
			//			case EngineConstants.IODefOutputP2:
			//				{
			//				out[ 2 ] += res;
			//				}
			//				break;
			//
			//			default:
			//				{ } break;
			//
			//			}
		}
		else {
			if (iodef == EngineConstants.IO_DEF_OBJECTIVE) {
				out[StatSolverBase.MINIMIZING_OBJECTIVE - StatSolverBase.FINDING_SOLUTION] += res;
			}
		}

	}

	/**
	* Adds the result of an directive evaluation on <code>asg</code>
	* to the value <code>out</code>.  Uses <code>tol</code> to provide some tolerance information for 
	* calculating the magnitude of the addition.  Iff. skipCousins is true, skips any node
	* with a cousin.
	*/
	protected final void addDirectiveToMinimizationValue(final ASGNode asg, final boolean skipCousins, final double[] out) {
		if (!skipCousins || (asg.getDynCousin() == null)) {
			addDirectiveToMinimizationValueComp(asg, out);
		}
	}

	/**
	* Adds the minimization delta from all expression nodes in <code>ASGList</code>
	* to the value in <code>out</code>.  Uses <code>tol</code> to provide some tolerance information for 
	* calculating the magnitude of the addition.
	*/
	public final int deltaAllExpressions(final HighLevelList<StdLowLevelList<ASGNode>,ASGNode> ASGList, final int startIdx, final InternalVirtualArray Y) {
		boolean Done = false;
		int idx = startIdx;

		if (!(ASGList.empty())) {
			while (!Done) {
				ASGNode MyASG = ASGList.getNode();
				ExpNode MyExp = MyASG.getExpNode();
				evaluateExpression(MyExp.getCodeList(), tmp);
				tmp.sub(MyASG.getMvec(), Y.getMvec(idx));
				ASGList.right();
				Done = ASGList.getHead();
				idx++;
			}
		}

		return (idx);
	};

	/**
	* Adds the minimization delta from all expression nodes in <code>LeftList</code> and <code>RightList</code> 
	* to the value in <code>out</code>.  Uses <code>tol</code> to provide some tolerance information for 
	* calculating the magnitude of the addition.
	*/
	public final int deltaAllImplicitExpressions(
		final HighLevelList<StdLowLevelList<ExpNode>,ExpNode> LeftList,
		final HighLevelList<StdLowLevelList<ExpNode>,ExpNode> RightList,
		final int startIdx,
		final InternalVirtualArray Y) {
		int idx = startIdx;

		if (!(LeftList.empty())) {
			boolean Done = false;

			while (!Done) {
				ExpNode LeftExp = LeftList.getNode();
				ExpNode RightExp = RightList.getNode();
				evaluateExpression(LeftExp.getCodeList(), tmp);
				evaluateExpression(RightExp.getCodeList(), tmp2);
				tmp.sub(tmp2, Y.getMvec(idx));
				LeftList.right();
				RightList.right();
				Done = LeftList.getHead();
				idx++;
			}
		}

		return (idx);
	}

	/**
	* Adds the minimization directives from all ASG nodes in <code>ASGList</code> 
	* to the value in <code>out</code>.  Uses <code>tol</code> to provide some tolerance information for 
	* calculating the magnitude of the addition.
	*/
	public final void deltaAllMinimizationDirectives(final HighLevelList<StdLowLevelList<ASGNode>,ASGNode> ASGList, final boolean skipCousins, final double[] out) {
		if (!(ASGList.empty())) {
			boolean Done = false;

			while (!Done) {
				ASGNode asg = ASGList.getNode();
				addDirectiveToMinimizationValue(asg, skipCousins, out);
				ASGList.right();
				Done = ASGList.getHead();
			}

		}

	}

	/**
	* Constructs a virtual array capable of indexing both
	* GeomEngine and DynRunner variables.
	*/
	public void initXAxisArrays(
		final ASGHashMap ASGList,
		final ASGHashMap DynASGList,
		final VirtualArray varr,
		final StatSolverTolerance tol,
		final double[] epsilon,
		final double[] intStart,
		final double[] intEnd,
		final double[] guessStart,
		final double[] guessEnd,
		final int[] minimizationDefines,
		final double[] minimizationValues) {
		int idx = 0;

		Iterator<ASGNode> it = ASGList.values().iterator();
		ASGNode asg;

		while (it.hasNext()) {
			asg = it.next();
			idx =
				addInitSlots(
					asg,
					idx,
					false,
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

		if (DynASGList != null) {
			it = DynASGList.values().iterator();

			while (it.hasNext()) {
				asg = (ASGNode) (it.next());
				idx =
					addInitSlots(
						asg,
						idx,
						true,
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
		}

	}

	/**
	* Places indices pointing to the ASGNode <code>asg</code> in a series
	* of indexed slots in the array starting with index <code>ind</code>.
	* The index after the last slot added (if any) will be returned.
	* Iff. skipCousins is true, ASGNode objects with cousins will be skipped.
	*/
	protected int addInitSlots(
		final ASGNode asg,
		final int ind,
		final boolean skipCousins,
		final VirtualArray varr,
		final StatSolverTolerance tol,
		final double[] epsilon,
		final double[] intStart,
		final double[] intEnd,
		final double[] guessStart,
		final double[] guessEnd,
		final int[] minimizationDefines,
		final double[] minimizationValues) {
		int idx = ind;
		final Mvec minvect = asg.getMinimizationMvec();

		final int iod = asg.getIODef();
		final boolean outp = (iod >= EngineConstants.IO_DEF_OUTPUT_P1) || (iod == EngineConstants.IO_DEF_OBJECTIVE);

		double defaultEpsilon = tol.getNumericTolerance();
		double intervalStart = tol.getNumericIntervalStart();
		double intervalEnd = tol.getNumericIntervalEnd();

		if ((iod >= 0) && ((iod & EngineConstants.IO_DEF_SCALE_TOLERANCE) != 0)) {
			defaultEpsilon = tol.getScaleTolerance();
			intervalStart = tol.getScaleIntervalStart();
			intervalEnd = tol.getScaleIntervalEnd();
		}

		if (iod == EngineConstants.IO_DEF_OBJECTIVE) {
			defaultEpsilon = tol.getScaleTolerance();
			intervalStart = tol.getScaleIntervalStart();
			intervalEnd = tol.getScaleIntervalEnd();
		}

		double guessEpsilon = 0.45 * defaultEpsilon;

		if (outp && (!skipCousins || (asg.getDynCousin() == null))) {
			int dom = asg.getDomain();

			if ((dom & EngineConstants.DOM_SCA) != 0) {
				epsilon[idx] = defaultEpsilon;
				intStart[idx] = intervalStart;
				intEnd[idx] = intervalEnd;
				guessStart[idx] = varr.getVal(idx) - guessEpsilon;
				guessEnd[idx] = varr.getVal(idx) + guessEpsilon;
				minimizationDefines[idx] = iod;
				minimizationValues[idx] = minvect.getBasis();
				idx++;
			}

			if ((dom & EngineConstants.DOM_VECT1) != 0) {
				epsilon[idx] = defaultEpsilon;
				intStart[idx] = intervalStart;
				intEnd[idx] = intervalEnd;
				guessStart[idx] = varr.getVal(idx) - guessEpsilon;
				guessEnd[idx] = varr.getVal(idx) + guessEpsilon;
				minimizationDefines[idx] = iod;
				minimizationValues[idx] = minvect.getBasis1();
				idx++;
			}

			if ((dom & EngineConstants.DOM_VECT2) != 0) {
				epsilon[idx] = defaultEpsilon;
				intStart[idx] = intervalStart;
				intEnd[idx] = intervalEnd;
				guessStart[idx] = varr.getVal(idx) - guessEpsilon;
				guessEnd[idx] = varr.getVal(idx) + guessEpsilon;
				minimizationDefines[idx] = iod;
				minimizationValues[idx] = minvect.getBasis2();
				idx++;
			}

			if ((dom & EngineConstants.DOM_PSU) != 0) {
				epsilon[idx] = defaultEpsilon;
				intStart[idx] = intervalStart;
				intEnd[idx] = intervalEnd;
				guessStart[idx] = varr.getVal(idx) - guessEpsilon;
				guessEnd[idx] = varr.getVal(idx) + guessEpsilon;
				minimizationDefines[idx] = iod;
				minimizationValues[idx] = minvect.getBasis12();
				idx++;
			}
		}

		return (idx);
	}

}
