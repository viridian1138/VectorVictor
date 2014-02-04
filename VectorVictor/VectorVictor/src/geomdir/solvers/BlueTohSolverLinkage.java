

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
import geomdir.engine.EngineConstants;
import geomdir.engine.Executor;
import geomdir.engine.ExpNode;
import geomdir.engine.ExprHashMap;
import geomdir.engine.GEval;
import geomdir.engine.Lexeme;
import geomdir.engine.SolverLinkage;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.HighLevelList;
import meta.StdLowLevelList;
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
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed a solver linkage for Herculaneum.                             | Created a Herculaneum solver linkage using code formerly from the Linker class.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for scale tolerances in constraint solving.           | Added code for handling scale tolerances.
*    | 01/28/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need to support persistence in solver linkages.                      | Added persistence support to solver linkages.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added methods to improve performance.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | BlueToh constraint solver.                                           | Created BlueTohSolverLinkage using code from HerculaneumSolverLinkage.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Found bugs in BlueToh solver.                                        | Fixed the bugs.
*    | 09/13/2002            | Thorn Green (viridian_1138@yahoo.com)           | Rob Macduff found bug in BlueToh.                                    | Closed the bug, BlueToh now reports "Unable to solve" in this test case.  This is the right answer given BlueToh's design assumptions.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | BlueToh linked to Herculaneum.                                       | Changed BlueToh to fix this.
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
* BlueToh (pronounced "Bluto") is a simplified type-Blue propagation solver
* with solution method based loosely on the DeltaBlue system as described in:
*
* Freeman-Benson, B. N., J. Maloney, and A. Borning "An Incremental
* Constraint Solver", Communications of the ACM, Vol. 33, No. 1, Jan.
* 1990, pp. 54-63.
*/
public class BlueTohSolverLinkage extends SolverLinkage {

	public static final int ConstraintTraverseMark = 1;
	public static final int UniqueCousinMark = 2;

	/**
	* Links the SimplexSolverLinkage by constructing the simplex solver object.
	*/
	public boolean postLinkAnalyze(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList) {
		err =
			super.postLinkAnalyze(
				AlphaVarList,
				DynAlphaVarList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				DynLHSimplicitExpList,
				DynRHSimplicitExpList);

		if (!err) {
			topoList.eraseAllInfo();

			topoSort.buildInputStructure(AlphaVarList, DynAlphaVarList);
			err = topoSort.attemptTopoSort();
			topoSort.getOutputList().copyDataPlusPtrInfo(topoList);
			mStackSpaceRequired = topoSort.getMstackSpaceRequired();
			exec.setMstackSpaceRequired(mStackSpaceRequired);

			if (!(topoList.empty()))
				topoList.right();
		}

		return (err);
	}

	protected static ASGNode getASGTraverse(ExpNode exp) {
		if (exp != null) {
			HighLevelList<StdLowLevelList<Lexeme>,Lexeme> codeList = exp.getCodeList();
			if (!(codeList.empty())) {
				boolean singleNode = codeList.isSingleNode();
				if (singleNode) {
					Lexeme MyLex = codeList.getNode();
					if (MyLex.getMyMatch() == GEval.variable) {
						ASGNode exASG = (ASGNode) MyLex.getMetaPtr();
						return (exASG);
					}
				}
			}
		}

		return (null);
	}

	public static ASGNode getValidASGTraverseOneSide(ASGNode var) {
		ASGNode exASG = getASGTraverse(var.getExpNode());

		if (exASG != null) {
			if (exASG.getIODef() >= EngineConstants.IO_DEF_OUTPUT_P1) {
				if ((var.getDomain() | exASG.getDomain()) == exASG.getDomain()) {
					return (exASG);
				}
			}
		}

		return (null);
	}

	public static ASGNode getDisambigASG(ASGNode var) {
		if (var.getDynCousin() == null)
			return (var);
		int m1 = var.getAuxMark() & UniqueCousinMark;
		int m2 = var.getDynCousin().getAuxMark() & UniqueCousinMark;
		if (m1 == m2)
			throw (new RuntimeException("Assertion Failed"));
		if (m1 < m2)
			return (var);
		return (var.getDynCousin());
	}

	public boolean link(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList) {
		return (false);
	}

	/**
	* Resolves constraints by evaluating the topological-ordered expressions.
	*/
	public boolean resolveConstraints() {
		if (!err) {
			exec.evaluateAllExpressions(topoList);
		}

		return (err);
	}

	/**
	* Clears memory allocaied by the linkage.
	*/
	public void releaseLinkage() {
		topoList.eraseAllInfo();
	}

	/**
	* Sets the ASG Mable.
	*/
	public final void setASGMable(ASGNode asg, boolean implicitUse) {
		if (implicitUse && (asg.getMable() == EngineConstants.MABLE_UNDEFINED)) {
			asg.setMable(EngineConstants.MABLE_BY_DIFFERENTIABLE + EngineConstants.MABLE_IMPLICIT_USE_MASK);
		}
		else {
			if (asg.getExpNode() != null) {
				if (getValidASGTraverseOneSide(asg) != null) {
					asg.setMable(EngineConstants.MABLE_BY_DIFFERENTIABLE + EngineConstants.MABLE_ASGN_MASK);
				}
				else {
					asg.setMable(EngineConstants.MABLE_FIXED + EngineConstants.MABLE_ASGN_MASK);
				}
			}
			else {
				asg.setMable(EngineConstants.MABLE_BY_DIFFERENTIABLE);
			}
		}
	}

	/**
	* Gets the current scale tolerance. This linkage provides get and
	* set methods on the scale tolerance, but ignores its value.
	*/
	public double getScaleTolerance() {
		return (scaleTolerance);
	}

	/**
	* Sets the scale tolerance of the assumed rendering system. This linkage
	* provides get and set methods on the scale tolerance, but ignores its value.
	*/
	public void setScaleTolerance(double in) {
		scaleTolerance = in;
	}

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			super.readExternal(in);

			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			HighLevelList<StdLowLevelList<ASGNode>,ASGNode> tmp = (HighLevelList<StdLowLevelList<ASGNode>,ASGNode>) (myv.getProperty("topoList"));
			VersionBuffer.chkNul(tmp);
			tmp.copyDataPlusPtrInfo(topoList);
			mStackSpaceRequired = myv.getInt("mStackSpaceRequired");
			scaleTolerance = myv.getDouble("scaleTolerance");
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
		super.writeExternal(out);

		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("topoList", topoList);
		myv.setInt("mStackSpaceRequired", mStackSpaceRequired);
		myv.setDouble("scaleTolerance", scaleTolerance);

		out.writeObject(myv);
	}

	/**
	* Optimizes.  This method may be deleted in the future.
	*/
	public void optimizeRep(ExprHashMap map) {
		optimizeAllRep(exec, map);
	}

	/**
	* Stores whether an error occurred in attempting to link the constraints.
	*/
	transient protected boolean err = false;
	/**
	* Topological list of expressions.
	*/
	protected HighLevelList<StdLowLevelList<ASGNode>,ASGNode> topoList = new HighLevelList<StdLowLevelList<ASGNode>,ASGNode>();
	/**
	* Amount of space required on the Mstack.
	*/
	protected int mStackSpaceRequired = 0;
	/**
	* Executor used to evaluate expressions.
	*/
	transient protected Executor exec = new Executor();
	/**
	* Topological sorter used to sort the expressions.
	*/
	transient protected static BlueTohTopoSorter topoSort = new BlueTohTopoSorter();
	/**
	* The scale tolerance.  This linkage provides get and set methods on the tolerance,
	* but ignores its value.
	*/
	protected double scaleTolerance = 0.0;

}
