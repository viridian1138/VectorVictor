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
*    | 10/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Be able to drag-through negation (GeoCard).                          | Developed BluePack, as a variant of BlueToh, to do this.
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
class BluePackTopoEntryNode extends Meta {
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
	* Gets the ExpNode that the BluePackTopoEntryNode represents.
	*/
	public final ExpNode getEntryExp() {
		return (entryExp);
	}

	/**
	* Gets the Object that the BluePackTopoEntryNode represents.
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
	* Sets the ExpNode that the BluePackTopoEntryNode represents.
	*/
	public final void setEntryExp(ExpNode in) {
		entryExp = in;
	}

	/**
	* Sets the Object that the BluePackTopoEntryNode represents.
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
	* The Object that the BluePackTopoEntryNode represents.
	*/
	protected Object entryObj = null;

	/**
	* The ExpNode that the BluePackTopoEntryNode represents.
	*/
	protected ExpNode entryExp = null;

	/**
	* The list of direct successors of the node.
	*/
	protected final HighLevelList succList = new HighLevelList();
}

/**
* BluePack is a simplified type-Blue propagation solver
* with solution method based loosely on the DeltaBlue system as described in:
*
* Freeman-Benson, B. N., J. Maloney, and A. Borning "An Incremental
* Constraint Solver", Communications of the ACM, Vol. 33, No. 1, Jan.
* 1990, pp. 54-63.
*/
public class BluePackTopoSorter {
	/**
	* A hash map containing the set of all nodes to be sorted.
	*/
	protected final HashMap<ExpNode,BluePackTopoEntryNode> varHash = new HashMap<ExpNode,BluePackTopoEntryNode>();

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
	* Hash map containing all BluePack join nodes.
	*/
	protected HashMap<ASGNode,ObjObj<BluePackVarNode>> bluePackJoinMap = new HashMap<ASGNode,ObjObj<BluePackVarNode>>();

	/**
	* Hash set containing all BluePack join nodes.
	*/
	protected HashSet<BluePackVarNode> bluePackVarSet = new HashSet<BluePackVarNode>();

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
			ASGNode exASG = BluePackSolverLinkage.getValidASGTraverseOneSide(var);
			boolean negate = BluePackSolverLinkage.getLastTraverseNegate();
			if (exASG != null) {
				handleValidVarVarExpr(var, exASG, negate);
				return (true);
			}
		}

		return (false);
	}

	protected final boolean isRefNegated(ObjObj<BluePackVarNode> ref, ASGNode var) {
		BluePackVarNode blNode = ref.value;
		return (blNode.isNegatedVar(var));
	}

	protected void handleValidVarVarExpr(ASGNode ivar1, ASGNode ivar2, boolean negate) {
		ASGNode var1 = BluePackSolverLinkage.getDisambigASG(ivar1);
		ASGNode var2 = BluePackSolverLinkage.getDisambigASG(ivar2);

		ObjObj<BluePackVarNode> ref1 = bluePackJoinMap.get(var1);
		ObjObj<BluePackVarNode> ref2 = bluePackJoinMap.get(var2);
		if (ref1 != null) {
			if (ref2 != null)
				handleVarJoin(ref1, ref2, negate ^ isRefNegated(ref1, var1) ^ isRefNegated(ref2, var2));
			else
				handleSingleJoin(ref1, var2, negate ^ isRefNegated(ref1, var1));
		}
		else {
			if (ref2 != null)
				handleSingleJoin(ref2, var1, isRefNegated(ref2, var2));
			else
				handleNewCreation(var1, var2, negate);
		}
	}

	protected void handleSingleJoin(ObjObj<BluePackVarNode> ref, ASGNode var, boolean negate) {
		bluePackJoinMap.put(var, ref);
		BluePackVarNode blNode = ref.value;
		blNode.addASGTwoSided(var, negate);
	}

	protected void handleNewCreation(ASGNode var1, ASGNode var2, boolean negate) {
		BluePackVarNode blVar = new BluePackVarNode(var1, var2, negate);
		ObjObj<BluePackVarNode> ref = blVar.getFirstRef();
		bluePackJoinMap.put(var1, ref);
		bluePackJoinMap.put(var2, ref);
		bluePackVarSet.add(blVar);
	}

	protected void handleVarJoin(ObjObj<BluePackVarNode> ref1, ObjObj<BluePackVarNode> ref2, boolean negate) {
		if (ref1.value != ref2.value) {
			BluePackVarNode blNode1 = ref1.value;
			BluePackVarNode blNode2 = ref2.value;
			blNode1.unifyTo(blNode2, negate);
			Iterator<ObjObj<BluePackVarNode>> it = blNode1.getRefIterator();
			while (it.hasNext()) {
				ObjObj<BluePackVarNode> ref = it.next();
				ref.value = blNode2;
			}
			bluePackVarSet.remove(blNode1);
		}
	}

	/**
	* Builds the input data needed to perform a topological sort.
	*/
	public final void buildInputStructure(ASGHashMap globalAsgList, ASGHashMap localAsgList) {
		varHash.clear();
		bluePackJoinMap.clear();
		bluePackVarSet.clear();
		next_nodes.eraseAllInfo();
		inputCount = 0;
		int mSpace = 0;

		{
		Iterator<ASGNode> it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = it.next();
			myASG.setAuxMark(0);
			if (myASG.getDynCousin() != null)
				myASG.getDynCousin().setAuxMark(BluePackSolverLinkage.UniqueCousinMark);
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = it.next();
				if (myASG.getDynCousin() == null)
					myASG.setAuxMark(0);
			}
		}

		it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = it.next();
			myASG.setAuxMark(0);
			boolean trav = handleASGTraverseOneSide(myASG);
			if (trav) {
				myASG.setAuxMark(myASG.getAuxMark() | BluePackSolverLinkage.ConstraintTraverseMark);
				if (myASG.getDynCousin() != null)
					myASG.getDynCousin().setAuxMark(
						myASG.getDynCousin().getAuxMark() | BluePackSolverLinkage.ConstraintTraverseMark);
			}
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = it.next();
				boolean trav = handleASGTraverseOneSide(myASG);
				if (trav) {
					myASG.setAuxMark(myASG.getAuxMark() | BluePackSolverLinkage.ConstraintTraverseMark);
					if (myASG.getDynCousin() != null)
						myASG.getDynCousin().setAuxMark(
							myASG.getDynCousin().getAuxMark() | BluePackSolverLinkage.ConstraintTraverseMark);
				}
			}
		}

		it = globalAsgList.values().iterator();

		while (it.hasNext()) {
			ASGNode myASG = it.next();
			ExpNode myExp = null;
			if ((myASG.getAuxMark() & BluePackSolverLinkage.ConstraintTraverseMark) == 0) {
				myExp = getPredExpOneSideStrict(myASG);
			}
			if (myExp != null)
				mSpace = Math.max(buildTopStructure(myASG, myExp), mSpace);
		}

		if (localAsgList != null) {
			it = localAsgList.values().iterator();

			while (it.hasNext()) {
				ASGNode myASG = it.next();
				ExpNode myExp = null;
				if ((myASG.getAuxMark() & BluePackSolverLinkage.ConstraintTraverseMark) == 0) {
					myExp = getPredExpOneSideStrict(myASG);
				}

				if (myExp != null)
					mSpace = Math.max(buildTopStructure(myASG, myExp), mSpace);
			}
		}
		}

		Iterator<BluePackVarNode> it = bluePackVarSet.iterator();

		while (it.hasNext()) {
			BluePackVarNode myVar = it.next();
			ExpNode myExp = getPredExp(myVar);
			if (myExp != null)
				mSpace = Math.max(buildTopStructure(myVar, myExp), mSpace);
			else {
				myVar.oneShotEval();
			}
		}

		Iterator<BluePackTopoEntryNode> en = varHash.values().iterator();
		while (en.hasNext()) {
			BluePackTopoEntryNode node = en.next();
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
			BluePackTopoEntryNode myNode = new BluePackTopoEntryNode();
			myNode.setEntryObj(asg);
			myNode.setEntryExp(exp);
			varHash.put(exp, myNode);
			mSpace = Math.max(exp.getMstackSpaceRequired(), mSpace);
			inputCount++;
		}

		BluePackTopoEntryNode succTopo = varHash.get(exp);

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
					BluePackVarNode BluePack = findBluePackVarNode((ASGNode) predASG);
					if (BluePack != null) {
						predASG = BluePack;
						predExp = getPredExp(BluePack);
					}
					else {
						predExp = getPredExpOneSideExceptionNull((ASGNode) predASG);
						// predExp = getPredExpOneSideStrict( (ASGNode) predASG );
					}

					if (predExp != null) {
						if (!(varHash.containsKey(predExp))) {
							BluePackTopoEntryNode myNode = new BluePackTopoEntryNode();
							myNode.setEntryObj(predASG);
							myNode.setEntryExp(predExp);
							varHash.put(predExp, myNode);
							mSpace = Math.max(predExp.getMstackSpaceRequired(), mSpace);
							inputCount++;
						}

						BluePackTopoEntryNode predTopo = varHash.get(predExp);
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

	protected final ExpNode getPredExp(BluePackVarNode predBlue) {
		return (predBlue.getPredExp());
	}

	protected final BluePackVarNode findBluePackVarNode(ASGNode iasg) {
		ASGNode asg = BluePackSolverLinkage.getDisambigASG(iasg);
		ObjObj<BluePackVarNode> obj = bluePackJoinMap.get(asg);
		BluePackVarNode var = null;
		if (obj != null)
			var = obj.value;
		return (var);
	}

	/**
	* Given that the input nodes the addition of a related direct predecessor and
	* direct successor respectively, updates the number of direct predecessors of
	* the successor and the list of direct successors of the predecessor.
	*/
	protected final void buildPredLink(BluePackTopoEntryNode predNode, BluePackTopoEntryNode succNode) {
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
		BluePackTopoEntryNode myNode = (BluePackTopoEntryNode) (next_nodes.deq());
		HighLevelList travList = myNode.getSuccList();
		Object entryObj = myNode.getEntryObj();

		if (entryObj instanceof ASGNode) {
			ASGNode entryASG = (ASGNode) (entryObj);
			entryASG = BluePackSolverLinkage.getDisambigASG(entryASG);
			BluePackVarNode var = findBluePackVarNode(entryASG);
			if (var != null)
				entryObj = var;
			else {
				if (entryASG.getExpNode() == null)
					entryASG = entryASG.getDynCousin();
				outputList.insertRight(entryASG);
			}
		}
		if (entryObj instanceof BluePackVarNode) {
			BluePackVarNode entryBlue = (BluePackVarNode) (entryObj);
			entryBlue.crossBuildAsgn(outputList);
			if (entryBlue.getPredExpCount() > 1)
				outputCount = -2;
		}
		outputCount++;

		if (!(travList.empty())) {
			travList.searchHead();
			boolean Done = false;

			while (!Done) {
				BluePackTopoEntryNode travNode = (BluePackTopoEntryNode) (travList.getNode());
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
