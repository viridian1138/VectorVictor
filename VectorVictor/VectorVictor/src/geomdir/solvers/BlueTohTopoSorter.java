


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

import geomdir.ObjObj;
import geomdir.engine.ASGHashMap;
import geomdir.engine.ASGNode;
import geomdir.engine.ExpNode;
import geomdir.engine.GEval;
import geomdir.engine.Lexeme;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import meta.HighLevelList;
import meta.Meta;
import meta.Staque;



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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Topological sort didn't support both global and DynRunner info.      | Modified topo. sort to handle both global assertions and DynRunner assertions simultaneously.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Had bugs in the other modifications listed as made on 12/03.         | Added some print statements during debug, and then removed them.  There should be no functional changes to the code.
*    | 12/13/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | BlueToh constraint solver.                                           | Created BlueTohTopoSorter using code from TopologicalSorter.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Found bugs in BlueToh solver.                                        | Fixed the bugs.
*    | 09/13/2002            | Thorn Green (viridian_1138@yahoo.com)           | Rob Macduff found bug in BlueToh.                                    | Closed the bug, BlueToh now reports "Unable to solve" in this test case.  This is the right answer given BlueToh's design assumptions.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Minor performance improvement for BlueToh.                           | Minor performance improvement for BlueToh.
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
* A node representing an entry in the topological sort table.
*/
class BlueTohTopoEntryNode extends Meta {
	/**
	* Gets the number of direct predecessors of the node.
	*/
	public final int getPredCount() {
		return (predCount);
	}

	/**
	* Gets the list of direct successors of the node.
	*/
	public final HighLevelList getSuccList() {
		return (succList);
	}

	/**
	* Gets the ExpNode that the BlueTohTopoEntryNode represents.
	*/
	public final ExpNode getEntryExp() {
		return (entryExp);
	}

	/**
	* Gets the Object that the BlueTohTopoEntryNode represents.
	*/
	public final Object getEntryObj() {
		return (entryObj);
	}

	/**
	* Sets the number of direct predecessors of the node.
	*/
	public final void setPredCount(int in) {
		predCount = in;
	}

	/**
	* Sets the ExpNode that the BlueTohTopoEntryNode represents.
	*/
	public final void setEntryExp(ExpNode in) {
		entryExp = in;
	}

	/**
	* Sets the Object that the BlueTohTopoEntryNode represents.
	*/
	public final void setEntryObj(Object in) {
		entryObj = in;
	}

	/**
	* Makes the node Meta-compliant.
	*/
	public void wake() {}

	/**
	* The number of direct predecessors of the node.
	*/
	protected int predCount = 0;

	/**
	* The Object that the BlueTohTopoEntryNode represents.
	*/
	protected Object entryObj = null;

	/**
	* The ExpNode that the BlueTohTopoEntryNode represents.
	*/
	protected ExpNode entryExp = null;

	/**
	* The list of direct successors of the node.
	*/
	protected final HighLevelList succList = new HighLevelList();
}

/**
* BlueToh (pronounced "Bluto") is a simplified type-Blue propagation solver
* with solution method based loosely on the DeltaBlue system as described in:
*
* Freeman-Benson, B. N., J. Maloney, and A. Borning "An Incremental
* Constraint Solver", Communications of the ACM, Vol. 33, No. 1, Jan.
* 1990, pp. 54-63.
*/
public class BlueTohTopoSorter {
	/**
	* A hash map containing the set of all nodes to be sorted.
	*/
	protected final HashMap varHash = new HashMap();

	/**
	* A queue containing the set of nodes that are next on the to-be-sorted list.
	*/
	protected final Staque next_nodes = new Staque();

	/**
	* The number of input nodes to be sorted.
	*/
	protected int inputCount = 0;

	/**
	* The number of output nodes produced by a topological sort.
	*/
	protected int outputCount = 0;

	/**
	* The amount of Mstack space required.
	*/
	protected int mStackSpaceRequired = 0;

	/**
	* The list of sorted output nodes resulting from a topological sort.
	*/
	protected final HighLevelList outputList = new HighLevelList();

	/**
	* Hash map containing all BlueToh join nodes.
	*/
	protected HashMap blueTohJoinMap = new HashMap();

	/**
	* Hash set containing all BlueToh join nodes.
	*/
	protected HashSet blueTohVarSet = new HashSet();

	/**
	* Gets the output list.
	*/
	public HighLevelList getOutputList() {
		return (outputList);
	}

	/**
	* Gets the amount of space required in the Mstack.
	*/
	public int getMstackSpaceRequired() {
		return (mStackSpaceRequired);
	}

	protected boolean handleASGTraverseOneSide(ASGNode var) {
		ExpNode exp = var.getExpNode();
		if (exp != null) {
			ASGNode exASG = BlueTohSolverLinkage.getValidASGTraverseOneSide(var);
			if (exASG != null) {
				handleValidVarVarExpr(var, exASG);
				return (true);
			}
		}

		return (false);
	}

	protected void handleValidVarVarExpr(ASGNode ivar1, ASGNode ivar2) {
		ASGNode var1 = BlueTohSolverLinkage.getDisambigASG(ivar1);
		ASGNode var2 = BlueTohSolverLinkage.getDisambigASG(ivar2);

		ObjObj ref1 = (ObjObj) (blueTohJoinMap.get(var1));
		ObjObj ref2 = (ObjObj) (blueTohJoinMap.get(var2));
		if (ref1 != null) {
			if (ref2 != null)
				handleVarJoin(ref1, ref2);
			else
				handleSingleJoin(ref1, var2);
		}
		else {
			if (ref2 != null)
				handleSingleJoin(ref2, var1);
			else
				handleNewCreation(var1, var2);
		}
	}

	protected void handleSingleJoin(ObjObj ref, ASGNode var) {
		blueTohJoinMap.put(var, ref);
		BlueTohVarNode blNode = (BlueTohVarNode) (ref.value);
		blNode.addASGTwoSided(var);
	}

	protected void handleNewCreation(ASGNode var1, ASGNode var2) {
		BlueTohVarNode blVar = new BlueTohVarNode(var1, var2);
		ObjObj ref = blVar.getFirstRef();
		blueTohJoinMap.put(var1, ref);
		blueTohJoinMap.put(var2, ref);
		blueTohVarSet.add(blVar);
	}

	protected void handleVarJoin(ObjObj ref1, ObjObj ref2) {
		if (ref1.value != ref2.value) {
			BlueTohVarNode blNode1 = (BlueTohVarNode) (ref1.value);
			BlueTohVarNode blNode2 = (BlueTohVarNode) (ref2.value);
			blNode1.unifyTo(blNode2);
			Iterator it = blNode1.getRefIterator();
			while (it.hasNext()) {
				ObjObj ref = (ObjObj) (it.next());
				ref.value = blNode2;
			}
			blueTohVarSet.remove(blNode1);
		}
	}

	/**
	* Builds the input data needed to perform a topological sort.
	*/
	public final void buildInputStructure(ASGHashMap globalAsgList, ASGHashMap localAsgList) {
		varHash.clear();
		blueTohJoinMap.clear();
		blueTohVarSet.clear();
		next_nodes.eraseAllInfo();
		inputCount = 0;
		int mSpace = 0;

		Iterator it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = (ASGNode) (it.next());
			myASG.setAuxMark(0);
			if (myASG.getDynCousin() != null)
				myASG.getDynCousin().setAuxMark(BlueTohSolverLinkage.UniqueCousinMark);
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = (ASGNode) (it.next());
				if (myASG.getDynCousin() == null)
					myASG.setAuxMark(0);
			}
		}

		it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = (ASGNode) (it.next());
			myASG.setAuxMark(0);
			boolean trav = handleASGTraverseOneSide(myASG);
			if (trav) {
				myASG.setAuxMark(myASG.getAuxMark() | BlueTohSolverLinkage.ConstraintTraverseMark);
				if (myASG.getDynCousin() != null)
					myASG.getDynCousin().setAuxMark(
						myASG.getDynCousin().getAuxMark() | BlueTohSolverLinkage.ConstraintTraverseMark);
			}
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = (ASGNode) (it.next());
				boolean trav = handleASGTraverseOneSide(myASG);
				if (trav) {
					myASG.setAuxMark(myASG.getAuxMark() | BlueTohSolverLinkage.ConstraintTraverseMark);
					if (myASG.getDynCousin() != null)
						myASG.getDynCousin().setAuxMark(
							myASG.getDynCousin().getAuxMark() | BlueTohSolverLinkage.ConstraintTraverseMark);
				}
			}
		}

		it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = (ASGNode) (it.next());
			ExpNode myExp = null;
			if ((myASG.getAuxMark() & BlueTohSolverLinkage.ConstraintTraverseMark) == 0) {
				myExp = getPredExpOneSideStrict(myASG);
			}
			if (myExp != null)
				mSpace = Math.max(buildTopStructure(myASG, myExp), mSpace);
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = (ASGNode) (it.next());
				ExpNode myExp = null;
				if ((myASG.getAuxMark() & BlueTohSolverLinkage.ConstraintTraverseMark) == 0) {
					myExp = getPredExpOneSideStrict(myASG);
				}

				if (myExp != null)
					mSpace = Math.max(buildTopStructure(myASG, myExp), mSpace);
			}
		}

		it = blueTohVarSet.iterator();

		while (it.hasNext()) {
			BlueTohVarNode myVar = (BlueTohVarNode) (it.next());
			ExpNode myExp = getPredExp(myVar);
			if (myExp != null)
				mSpace = Math.max(buildTopStructure(myVar, myExp), mSpace);
			else {
				myVar.oneShotEval();
			}
		}

		Iterator en = varHash.values().iterator();
		while (en.hasNext()) {
			BlueTohTopoEntryNode node = (BlueTohTopoEntryNode) (en.next());
			if (node.getPredCount() == 0)
				next_nodes.enq(node);
		}

		mStackSpaceRequired = mSpace;
	}

	/**
	* Builds the predecessor/successor relationships for the ExpNode <code>exp</code>.
	*/
	protected final int buildTopStructure(Object asg, ExpNode exp) {
		int mSpace = 0;

		if (!(varHash.containsKey(exp))) {
			BlueTohTopoEntryNode myNode = new BlueTohTopoEntryNode();
			myNode.setEntryObj(asg);
			myNode.setEntryExp(exp);
			varHash.put(exp, myNode);
			mSpace = Math.max(exp.getMstackSpaceRequired(), mSpace);
			inputCount++;
		}

		BlueTohTopoEntryNode succTopo = (BlueTohTopoEntryNode) (varHash.get(exp));

		HighLevelList CodeList = exp.getCodeList();
		boolean Done1 = false;
		if (!(CodeList.empty())) {
			CodeList.searchHead();

			while (!Done1) {
				Meta MyMeta2 = CodeList.getNode();
				Lexeme MyLex = (Lexeme) MyMeta2;
				if (MyLex.getMyMatch() == GEval.variable) {
					Meta link = MyLex.getMetaPtr();
					Object predASG = link;
					ExpNode predExp = null;
					BlueTohVarNode BlueToh = findBlueTohVarNode((ASGNode) predASG);
					if (BlueToh != null) {
						predASG = BlueToh;
						predExp = getPredExp(BlueToh);
					}
					else {
						predExp = getPredExpOneSideExceptionNull((ASGNode) predASG);
						// predExp = getPredExpOneSideStrict( (ASGNode) predASG );
					}

					if (predExp != null) {
						if (!(varHash.containsKey(predExp))) {
							BlueTohTopoEntryNode myNode = new BlueTohTopoEntryNode();
							myNode.setEntryObj(predASG);
							myNode.setEntryExp(predExp);
							varHash.put(predExp, myNode);
							mSpace = Math.max(predExp.getMstackSpaceRequired(), mSpace);
							inputCount++;
						}

						BlueTohTopoEntryNode predTopo = (BlueTohTopoEntryNode) (varHash.get(predExp));
						buildPredLink(predTopo, succTopo);
					}
				}
				CodeList.right();
				Done1 = CodeList.getHead();
			}
		}

		return (mSpace);
	}

	protected final ExpNode getPredExpOneSideStrict(ASGNode predASG) {
		ExpNode predExp = predASG.getExpNode();
		return (predExp);
	}

	protected final ExpNode getPredExpOneSideExceptionNull(ASGNode predASG) {
		ExpNode predExp = predASG.getExpNode();
		ASGNode cousin = predASG.getDynCousin();
		if ((predExp == null) && (cousin != null)) {
			predExp = cousin.getExpNode();
		}

		return (predExp);
	}

	protected final ExpNode getPredExp(BlueTohVarNode predBlue) {
		return (predBlue.getPredExp());
	}

	protected final BlueTohVarNode findBlueTohVarNode(ASGNode iasg) {
		ASGNode asg = BlueTohSolverLinkage.getDisambigASG(iasg);
		ObjObj obj = (ObjObj) (blueTohJoinMap.get(asg));
		BlueTohVarNode var = null;
		if (obj != null)
			var = (BlueTohVarNode) (obj.value);
		return (var);
	}

	/**
	* Given that the input nodes the addition of a related direct predecessor and
	* direct successor respectively, updates the number of direct predecessors of
	* the successor and the list of direct successors of the predecessor.
	*/
	protected final void buildPredLink(BlueTohTopoEntryNode predNode, BlueTohTopoEntryNode succNode) {
		succNode.setPredCount(succNode.getPredCount() + 1);
		predNode.getSuccList().insertRight(succNode);
	}

	/**
	* Attempts to perform a topological sort on the elements, placing the sorted results
	* in the output list.  Returns true if a cycle is found.  Otherwise returns false.
	*/
	public final boolean attemptTopoSort() {
		outputCount = 0;
		outputList.erasePtrVal();

		while (!(next_nodes.empty()))
			topoSortIteration();

		boolean err = outputCount != inputCount;

		return (err);
	}

	/**
	* Performs one iteration of the topological sort process, moving one node into the sorted output list.
	*/
	protected final void topoSortIteration() {
		BlueTohTopoEntryNode myNode = (BlueTohTopoEntryNode) (next_nodes.deq());
		HighLevelList travList = myNode.getSuccList();
		Object entryObj = myNode.getEntryObj();

		if (entryObj instanceof ASGNode) {
			ASGNode entryASG = (ASGNode) (entryObj);
			entryASG = BlueTohSolverLinkage.getDisambigASG(entryASG);
			BlueTohVarNode var = findBlueTohVarNode(entryASG);
			if (var != null)
				entryObj = var;
			else {
				if (entryASG.getExpNode() == null)
					entryASG = entryASG.getDynCousin();
				outputList.insertRight(entryASG);
			}
		}
		if (entryObj instanceof BlueTohVarNode) {
			BlueTohVarNode entryBlue = (BlueTohVarNode) (entryObj);
			entryBlue.crossBuildAsgn(outputList);
			if (entryBlue.getPredExpCount() > 1)
				outputCount = -2;
		}
		outputCount++;

		if (!(travList.empty())) {
			travList.searchHead();
			boolean Done = false;

			while (!Done) {
				BlueTohTopoEntryNode travNode = (BlueTohTopoEntryNode) (travList.getNode());
				travNode.setPredCount(travNode.getPredCount() - 1);

				if (travNode.getPredCount() == 0) {
					next_nodes.enq(travNode);
				}

				travList.right();
				Done = travList.getHead();
			}
		}
	}

}
