


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
import geomdir.ObjObj;
import geomdir.engine.ASGNode;
import geomdir.engine.EvalObj;
import geomdir.engine.ExpNode;

import java.util.HashSet;
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
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Implement BlueToh solver.                                            | Created BlueTohVarNode class to use with BlueToh.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Found bugs in BlueToh solver.                                        | Fixed the bugs.
*    | 09/13/2002            | Thorn Green (viridian_1138@yahoo.com)           | Rob Macduff found bug in BlueToh.                                    | Closed the bug, BlueToh now reports "Unable to solve" in this test case.  This is the right answer given BlueToh's design assumptions.
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
* A node containing associative information for the BluePack solver.
*/
public class BluePackVarNode extends Object {
	public BluePackVarNode(ASGNode asg1, ASGNode asg2, boolean negateBool) {
		addASGTwoSided(asg1, false);
		addASGTwoSided(asg2, negateBool);

		firstRef.value = this;
		refSet.add(firstRef);
	}

	public ObjObj<BluePackVarNode> getFirstRef() {
		return (firstRef);
	}

	public void addASGTwoSided(ASGNode inv, boolean negate) {
		ASGNode in = BluePackSolverLinkage.getDisambigASG(inv);
		boolean chk = false;
		if (negate)
			chk = asgMnsSet.add(in);
		else
			chk = asgCpySet.add(in);

		if (chk) {
			if (in.getExpNode() != null) {
				if (BluePackSolverLinkage.getValidASGTraverseOneSide(in) == null) {
					predExp = in.getExpNode();
					predMns = negate;
					predExpCount++;
				}
			}

			if (in.getDynCousin() != null) {
				in = in.getDynCousin();
				if (in.getExpNode() != null) {
					if (BluePackSolverLinkage.getValidASGTraverseOneSide(in) == null) {
						predExp = in.getExpNode();
						predMns = negate;
						predExpCount++;
					}
				}
			}
		}
	}

	public void addRef(ObjObj<BluePackVarNode> in) {
		refSet.add(in);
	}

	public void addASGCpyRaw(ASGNode inv) {
		asgCpySet.add(inv);
	}

	public void addASGMnsRaw(ASGNode inv) {
		asgMnsSet.add(inv);
	}

	public void unifyTo(BluePackVarNode out, boolean negate) {
		{
		Iterator<ObjObj<BluePackVarNode>> it = refSet.iterator();
		while (it.hasNext()) {
			ObjObj<BluePackVarNode> ob = it.next();
			ob.value = out;
			out.addRef(ob);
		}
		}

		Iterator<ASGNode> it;
		if (negate) {
			it = asgCpySet.iterator();
			while (it.hasNext()) {
				out.addASGMnsRaw(it.next());
			}

			it = asgMnsSet.iterator();
			while (it.hasNext()) {
				out.addASGCpyRaw(it.next());
			}

		}
		else {
			it = asgCpySet.iterator();
			while (it.hasNext()) {
				out.addASGCpyRaw(it.next());
			}

			it = asgMnsSet.iterator();
			while (it.hasNext()) {
				out.addASGMnsRaw(it.next());
			}

		}

		out.setPredExpCount(predExpCount + out.getPredExpCount());
		if (out.getPredExp() == null) {
			boolean outPredMns = negate ^ predMns;
			out.setPredExp(predExp, outPredMns);
		}

	}

	public Iterator<ASGNode> getASGCpyIterator() {
		return (asgCpySet.iterator());
	}

	public Iterator<ASGNode> getASGMnsIterator() {
		return (asgMnsSet.iterator());
	}

	public Iterator<ObjObj<BluePackVarNode>> getRefIterator() {
		return (refSet.iterator());
	}

	public boolean isNegatedVar(ASGNode var) {
		return (asgMnsSet.contains(var));
	}

	protected void addNodeToList(ASGNode inputNode, ASGNode outputNode, boolean negate, HighLevelList<StdLowLevelList<ASGNode>,ASGNode> outputList) {
		EvalObj copyObj = null;
		if (negate)
			copyObj = new NegateEvalObj(inputNode.getMvec());
		else
			copyObj = new CopyEvalObj(inputNode.getMvec());
		ASGNode dummyNode = new ASGNode();
		ExpNode dummyExp = new ExpNode();
		dummyNode.setMvec(outputNode.getMvec());
		dummyNode.setExpNode(dummyExp);
		dummyExp.setEval(copyObj);
		outputList.insertRight(dummyNode);
	}

	protected void addNodeToList(ExpNode inputNode, ASGNode outputNode, HighLevelList<StdLowLevelList<ASGNode>,ASGNode> outputList) {
		ASGNode dummyNode = new ASGNode();
		dummyNode.setMvec(outputNode.getMvec());
		dummyNode.setExpNode(inputNode);
		outputList.insertRight(dummyNode);
	}

	public void crossBuildAsgn(HighLevelList<StdLowLevelList<ASGNode>,ASGNode> outputList) {
		if (predMns) {
			Iterator<ASGNode> it = asgMnsSet.iterator();
			ASGNode inputNode = null;

			if (it.hasNext()) {
				inputNode = it.next();
				addNodeToList(predExp, inputNode, outputList);
			}

			while (it.hasNext()) {
				ASGNode nd = it.next();
				addNodeToList(inputNode, nd, false, outputList);
			}

			it = asgCpySet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				addNodeToList(inputNode, nd, true, outputList);
			}
		}
		else {
			Iterator<ASGNode> it = asgCpySet.iterator();
			ASGNode inputNode = null;

			if (it.hasNext()) {
				inputNode = it.next();
				addNodeToList(predExp, inputNode, outputList);
			}

			while (it.hasNext()) {
				ASGNode nd = it.next();
				addNodeToList(inputNode, nd, false, outputList);
			}

			it = asgMnsSet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				addNodeToList(inputNode, nd, true, outputList);
			}
		}

	}

	/**
	* Performs a single evaluation to tie together 
	* a set of coincident Mvecs with no predecessor
	* expression.  Note: the implementation of this
	* method has some complexity that wouldn't
	* otherwise be necessary because it picks the
	* inputMvec in a way that emulates Herculaneum.
	*/
	public void oneShotEval() {
		Iterator<ASGNode> it = asgCpySet.iterator();
		Mvec inputMvec = null;
		boolean negateInput = false;
		boolean foundInput = false;

		if (it.hasNext()) {
			ASGNode inputNode = it.next();
			inputMvec = inputNode.getMvec();
			if ((inputNode.getExpNode()) == null) {
				if (inputNode.getDynCousin() != null) {
					inputNode = inputNode.getDynCousin();
					if ((inputNode.getExpNode()) == null) {
						foundInput = true;
						negateInput = false;
					}
				}
				else {
					foundInput = true;
					negateInput = false;
				}
			}
		}

		while (it.hasNext()) {
			ASGNode inputNode = it.next();
			if ((inputNode.getExpNode()) == null) {
				if (inputNode.getDynCousin() != null) {
					inputNode = inputNode.getDynCousin();
					if ((inputNode.getExpNode()) == null) {
						inputMvec = inputNode.getMvec();
						foundInput = true;
						negateInput = false;
					}
				}
				else {
					inputMvec = inputNode.getMvec();
					foundInput = true;
					negateInput = false;
				}
			}
		}

		it = asgMnsSet.iterator();

		while (it.hasNext()) {
			ASGNode inputNode = it.next();
			if ((inputNode.getExpNode()) == null) {
				if (inputNode.getDynCousin() != null) {
					inputNode = inputNode.getDynCousin();
					if ((inputNode.getExpNode()) == null) {
						inputMvec = inputNode.getMvec();
						foundInput = true;
						negateInput = true;
					}
				}
				else {
					inputMvec = inputNode.getMvec();
					foundInput = true;
					negateInput = true;
				}
			}
		}

		if (negateInput) {
			it = asgCpySet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				Mvec outputMvec = nd.getMvec();
				if (outputMvec != inputMvec) {
					inputMvec.mcpy(outputMvec);
					outputMvec.minus();
				}
			}

			it = asgMnsSet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				Mvec outputMvec = nd.getMvec();
				if (outputMvec != inputMvec)
					inputMvec.mcpy(outputMvec);
			}
		}
		else {
			it = asgCpySet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				Mvec outputMvec = nd.getMvec();
				if (outputMvec != inputMvec)
					inputMvec.mcpy(outputMvec);
			}

			it = asgMnsSet.iterator();

			while (it.hasNext()) {
				ASGNode nd = it.next();
				Mvec outputMvec = nd.getMvec();
				if (outputMvec != inputMvec) {
					inputMvec.mcpy(outputMvec);
					outputMvec.minus();
				}
			}
		}

	}

	public ExpNode getPredExp() {
		return (predExp);
	}

	public boolean getPredMns() {
		return (predMns);
	}

	public void setPredExp(ExpNode in, boolean inPredMns) {
		predExp = in;
		predMns = inPredMns;
	}

	public int getPredExpCount() {
		return (predExpCount);
	}

	public void setPredExpCount(int in) {
		predExpCount = in;
	}

	protected int predExpCount = 0;
	protected ExpNode predExp = null;
	protected boolean predMns = false;
	protected HashSet<ObjObj<BluePackVarNode>> refSet = new HashSet<ObjObj<BluePackVarNode>>();
	protected HashSet<ASGNode> asgCpySet = new HashSet<ASGNode>();
	protected HashSet<ASGNode> asgMnsSet = new HashSet<ASGNode>();
	protected ObjObj<BluePackVarNode> firstRef = new ObjObj<BluePackVarNode>();
}
