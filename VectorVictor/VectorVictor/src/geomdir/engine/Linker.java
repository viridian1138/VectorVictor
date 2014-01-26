package geomdir.engine;

import geomdir.IntObj;
import geomdir.Mvec;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;

import meta.Callback;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import meta.WrapRuntimeException;


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
*    | 10/26/2000            | Thorn Green (viridian_1138@yahoo.com)           | Engine classes had names that were outside the Java standard.        | Changed the class names.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Linker did not support topological linking of DynRunner to global.   | Modified Linker so that DynRunner assertions and global assertions are integrated by topo. sort.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed to support the new architecture for constraint solving.       | Made modifications to support the new constraint solving architecture.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
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
* Performs the operations necessary to link a set of expresions given
* additions, changes, or deletions in the set.
* @author Thorn Green
*/
public class Linker extends Callback /* DBN */ {

	/**
	Links variable and topological lists so that they are up to date with the
		current expression list.
	<P>
	<B>In:</B> Expression list, variable list, topological variable list, 
		application data structure creation request procedure, application data
		structure deletion request procedure.<BR>
	<B>Out:</B> alphaVarList, linkage modified.  CreateVisit, DeleteVisit called on
		external data structures.<BR>
	<B>Pre:</B> expList is an expression list.  alphaVarList and linkage are variable lists.
		expList, alphaVarList, linkage point to the heads of their respective lists.<BR>
	<B>Post:</B> linkage will get the new topological list.  alphaVarList will get the new
		variable list.  CreateVisit and DeleteVisit will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	public final boolean doLink(
		ExprHashMap ExpList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ASGHashMap AlphaVarList,
		SolverLinkage linkage,
		Object CreateObj,
		Method CreateVisit,
		Object DeleteObj,
		Method DeleteVisit) {
		boolean Err;
		gloLinkage = linkage;

		clearMarks(AlphaVarList);
		evalMDef(ExpList, AlphaVarList, CreateObj, CreateVisit);
		evalMUsed(ExpList, AlphaVarList, true, CreateObj, CreateVisit);
		evalMUsed(LHSimplicitExpList, AlphaVarList, false, CreateObj, CreateVisit);
		evalMUsed(RHSimplicitExpList, AlphaVarList, false, CreateObj, CreateVisit);
		Err = linkSolver(AlphaVarList, null, LHSimplicitExpList, RHSimplicitExpList, null, null, linkage);

		if (!Err)
			Err = postLink(AlphaVarList, null, LHSimplicitExpList, RHSimplicitExpList, null, null, linkage);

		if (!Err)
			delAllUnmarkedAndFinalMarkASG(AlphaVarList, DeleteObj, DeleteVisit);

		return (Err);
	};

	/**
	Links variable and topological lists so that they are up to date with the
		current expression list.
	<P>
	<B>In:</B> Expression list, variable list, topological variable list, 
		application data structure creation request procedure, application data
		structure deletion request procedure.<BR>
	<B>Out:</B> alphaVarList, linkage modified.  CreateVisit, DeleteVisit called on
		external data structures.<BR>
	<B>Pre:</B> expList is an expression list.  alphaVarList and linkage are variable lists.
		expList, alphaVarList, linkage point to the heads of their respective lists.<BR>
	<B>Post:</B> linkage will get the new topological list.  alphaVarList will get the new
		variable list.  CreateVisit and DeleteVisit will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	public final boolean doLightLink(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap DynExpList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList,
		HighLevelList UnqVarList,
		SolverLinkage linkage,
		Object CreateObj,
		Method CreateVisit,
		Object DeleteObj,
		Method DeleteVisit) {
		boolean Err = false;
		gloLinkage = linkage;
		lightEvalMUsed(
			DynExpList,
			DynLHSimplicitExpList,
			DynRHSimplicitExpList,
			DynAlphaVarList,
			AlphaVarList,
			UnqVarList,
			CreateObj,
			CreateVisit);
		Err =
			linkSolver(
				AlphaVarList,
				DynAlphaVarList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				DynLHSimplicitExpList,
				DynRHSimplicitExpList,
				linkage);

		return (Err);
	};

	/**
	Sets the mark field of each variable in a list to zero.  Sets other
		fields to initial values to prepare for linking.
	<P>
	<B>In:</B> List alphaVarList.<BR>
	<B>Out:</B> alphaVarList modified.<BR>
	<B>Pre:</B> alphaVarList is a variable list.  alphaVarList points to the head of the list.<BR>
	<B>Post:</B> All nodes in alphaVarList will have a mark field of 0, a movable field of MableByAny,
		and a ExpNode field of NULL.<BR>
	@author Thorn Green.
	*/
	private final void clearMarks(ASGHashMap AlphaVarList) {
		ASGNode MyASG;

		Iterator<ASGNode> it = AlphaVarList.values().iterator();
		while (it.hasNext()) {
			MyASG = it.next();
			MyASG.setMark(0);
			MyASG.setMable(EngineConstants.MABLE_UNDEFINED);
			MyASG.setExpNode(null);
		}
	};

	/**
	Deletes all nodes in a variable list with a mark field of zero.
	<P>
	<B>In:</B> List to check, application data structure deletion routine.<BR>
	<B>Out:</B> MyList modified.  DeleteVisit called on external data.<BR>
	<B>Pre:</B> MyList is a variable list.  All nodes in MyList should have allocated drawing
		objects.  MyList points to the head of the list.<BR>
	<B>Post:</B> The mark field of each node will be checked.  If the field is zero, the node is
		deleted.  However, each node has an external drawing object associated with it.
		Hence before the node can be deleted, DeleteVisit must be called on the node's
		drawing object to request the deletion of that object.  This request mechanism
		gives the calling application a chance to not only delete the object, but also all
		application-created data structures (e.g. display lists) which point to the object.<BR>
	@author Thorn Green.
	*/
	private final void delAllUnmarkedAndFinalMarkASG(ASGHashMap MyList, Object DeleteObj, Method DeleteVisit) {
		ASGNode myASG;
		HashSet<ASGNode> tmp = new HashSet<ASGNode>();
		Iterator<ASGNode> it = MyList.values().iterator();

		while (it.hasNext()) {
			myASG = it.next();
			if (myASG.getMark() == 0) {
				tmp.add(myASG);
				it.remove();
			}
			else {
				int mable = myASG.getMable();
				if ((mable & EngineConstants.MABLE_IMPLICIT_USE_MASK) == 0)
					gloLinkage.setASGMable(myASG, false);
			}
		}

		it = tmp.iterator();

		while (it.hasNext()) {
			myASG = it.next();
			Object[] CallLst = { myASG.getDrawObj(), myASG.getStr()};
			try {
				DeleteVisit.invoke(DeleteObj, CallLst);
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Visit Failed", e));
			}
			myASG.eraseNode();
		}

	};

	/**
	Takes the list of all variables, and forms a list of dependent variables
		in topological order.
	<P>
	<B>In:</B> List of all variables, list of topological variables.<BR>
	<B>Out:</B> linkage modified.<BR>
	<B>Pre:</B> alphaVarList must be a variable list.  alphaVarList must point to the head
		of the list.<BR>
	<B>Post:</B> The dependencies will be sorted into topological order, and the results put into
		the linkage.<BR>
	@author Thorn Green.
	*/
	private final boolean linkSolver(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList,
		SolverLinkage linkage) {
		boolean err =
			linkage.link(
				AlphaVarList,
				DynAlphaVarList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				DynLHSimplicitExpList,
				DynRHSimplicitExpList);

		return (err);
	};

	/**
	Takes the list of all variables, and forms a list of dependent variables
		in topological order.
	<P>
	<B>In:</B> List of all variables, list of topological variables.<BR>
	<B>Out:</B> linkage modified.<BR>
	<B>Pre:</B> alphaVarList must be a variable list.  alphaVarList must point to the head
		of the list.<BR>
	<B>Post:</B> The dependencies will be sorted into topological order, and the results put into
		the linkage.<BR>
	@author Thorn Green.
	*/
	public final boolean postLink(
		ASGHashMap AlphaVarList,
		ASGHashMap DynAlphaVarList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ExprHashMap DynLHSimplicitExpList,
		ExprHashMap DynRHSimplicitExpList,
		SolverLinkage linkage) {
		boolean err =
			linkage.postLinkAnalyze(
				AlphaVarList,
				DynAlphaVarList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				DynLHSimplicitExpList,
				DynRHSimplicitExpList);

		return (err);
	};

	/**
	Links all dependent variables from the expression list into the variable list.
	<P>
	<B>In:</B> Expression list, variable list, application data structure creation routine.<BR>
	<B>Out:</B> Variable list modified.  Data structure creation routine called.<BR>
	<B>Pre:</B> expList is an expression list.  AlphaList is a variable list.  expList
		points to the head of the expression list.<BR>
	<B>Post:</B> The dependent varaibles in expList will be added to AlphaList.  CreateVisit
		will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	private final void evalMDef(ExprHashMap ExpList, ASGHashMap AlphaList, Object CreateObj, Method CreateVisit) {
		FlexString InStr = new FlexString();

		Iterator<ExpNode> it = ExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyExp = it.next();
			GloExpNode = MyExp;
			(MyExp.getVarName()).copyString(InStr);
			markInsert(InStr, AlphaList, false, true, CreateObj, CreateVisit);
		}

	};

	/**
	Links all independent variables from the expression list into the variable list.
	<P>
	<B>In:</B> Expression list, variable list, application data structure creation routine.<BR>
	<B>Out:</B> Variable list modified.  Data structure creation routine called.<BR>
	<B>Pre:</B> expList is an expression list.  AlphaList is a variable list.  expList
		points to the head of the expression list.<BR>
	<B>Post:</B> The independent varaibles in expList will be added to AlphaList.  CreateVisit
		will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	private final void evalMUsed(
		ExprHashMap ExpList,
		ASGHashMap AlphaList,
		boolean AddDigraphEdges,
		Object CreateObj,
		Method CreateVisit) {
		FlexString InStr = new FlexString();
		CodeGen MyCodeGen = new CodeGen();

		Iterator<ExpNode> it = ExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyExp = it.next();
			HighLevelList CodeList = MyExp.getCodeList();
			boolean Done1 = false;
			if (!(CodeList.empty())) {
				CodeList.searchHead();

				while (!Done1) {
					Meta MyMeta2 = CodeList.getNode();
					Lexeme MyLex = (Lexeme) MyMeta2;
					if (MyLex.getMyMatch() == GEval.variable) {
						if (MyLex.getEndLoc() > MyLex.getStartLoc())
							MyCodeGen.extractVariable(MyExp.getExprn(), MyLex.getStartLoc(), MyLex.getEndLoc(), InStr);
						ASGNode tmp = markInsert(InStr, AlphaList, !AddDigraphEdges, false, CreateObj, CreateVisit);
						MyLex.setMetaPtr(tmp);
						/* if( AddDigraphEdges ) newDigraphEdge( MyExp , AlphaList.getNode() , AlphaList ); */
					}
					CodeList.right();
					Done1 = CodeList.getHead();
				}
			}

		}

	};

	/**
	Links all independent variables from the expression list into the variable list.
	<P>
	<B>In:</B> Expression list, variable list, application data structure creation routine.<BR>
	<B>Out:</B> Variable list modified.  Data structure creation routine called.<BR>
	<B>Pre:</B> expList is an expression list.  AlphaList is a variable list.  expList
		points to the head of the expression list.<BR>
	<B>Post:</B> The independent varaibles in expList will be added to AlphaList.  CreateVisit
		will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	private final void lightEvalMUsed(
		ExprHashMap ExpList,
		ExprHashMap LHSimplicitExpList,
		ExprHashMap RHSimplicitExpList,
		ASGHashMap LocalAlphaList,
		ASGHashMap GlobalAlphaList,
		HighLevelList UnqVarList,
		Object CreateObj,
		Method CreateVisit) {
		FlexString InStr = new FlexString();
		CodeGen MyCodeGen = new CodeGen();

		Iterator<ExpNode> it = ExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyExp = it.next();

			HighLevelList CodeList = MyExp.getCodeList();
			boolean Done1 = false;
			if (!(CodeList.empty())) {
				CodeList.searchHead();

				while (!Done1) {
					Meta MyMeta2 = CodeList.getNode();
					Lexeme MyLex = (Lexeme) MyMeta2;
					if (MyLex.getMyMatch() == GEval.variable) {
						if (MyLex.getEndLoc() > MyLex.getStartLoc())
							MyCodeGen.extractVariable(MyExp.getExprn(), MyLex.getStartLoc(), MyLex.getEndLoc(), InStr);
						ASGNode tmp =
							lightMarkInsert(InStr, LocalAlphaList, GlobalAlphaList, UnqVarList, CreateObj, CreateVisit);
						MyLex.setMetaPtr(tmp);
					}
					CodeList.right();
					Done1 = CodeList.getHead();
				}
			}

		}

		it = LHSimplicitExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyExp = (ExpNode) (it.next());
			HighLevelList CodeList = MyExp.getCodeList();
			boolean Done1 = false;
			if (!(CodeList.empty())) {
				CodeList.searchHead();

				while (!Done1) {
					Meta MyMeta2 = CodeList.getNode();
					Lexeme MyLex = (Lexeme) MyMeta2;
					if (MyLex.getMyMatch() == GEval.variable) {
						if (MyLex.getEndLoc() > MyLex.getStartLoc())
							MyCodeGen.extractVariable(MyExp.getExprn(), MyLex.getStartLoc(), MyLex.getEndLoc(), InStr);
						ASGNode tmp =
							lightMarkInsert(InStr, LocalAlphaList, GlobalAlphaList, UnqVarList, CreateObj, CreateVisit);
						MyLex.setMetaPtr(tmp);
					}
					CodeList.right();
					Done1 = CodeList.getHead();
				}
			}

		}

		it = RHSimplicitExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyExp = (ExpNode) (it.next());
			HighLevelList CodeList = MyExp.getCodeList();
			boolean Done1 = false;
			if (!(CodeList.empty())) {
				CodeList.searchHead();

				while (!Done1) {
					Meta MyMeta2 = CodeList.getNode();
					Lexeme MyLex = (Lexeme) MyMeta2;
					if (MyLex.getMyMatch() == GEval.variable) {
						if (MyLex.getEndLoc() > MyLex.getStartLoc())
							MyCodeGen.extractVariable(MyExp.getExprn(), MyLex.getStartLoc(), MyLex.getEndLoc(), InStr);
						ASGNode tmp =
							lightMarkInsert(InStr, LocalAlphaList, GlobalAlphaList, UnqVarList, CreateObj, CreateVisit);
						MyLex.setMetaPtr(tmp);
					}
					CodeList.right();
					Done1 = CodeList.getHead();
				}
			}
		}

		Iterator ita = LocalAlphaList.values().iterator();

		while (ita.hasNext()) {
			ASGNode myASG = (ASGNode) (ita.next());
			FlexString name = myASG.getStr();
			ASGNode gloASG = GlobalAlphaList.getASG(name);
			if (gloASG != null) {
				myASG.setMark(2);
				gloASG.setDynCousin(myASG);
				myASG.setDynCousin(gloASG);
			}
		}

	};

	/**
	Finds the variable with name InStr in VarList.  If InStr does not exist
		in VarList, a new node is inserted at the proper spot.  Once the variable is
		found or inserted, it is marked and its link fields are set by MyLinkVisit.
	<P>
	<B>In:</B> Variable name to be matched, variable list, application data structure
		creation routine.<BR>
	<B>Out:</B> VarList modified.  CreateVisit called.<BR>
	<B>Pre:</B> InStr is valid.  VarList is a variable list.  VarList is
		ascending ordered by variable name.<BR>
	<B>Post:</B> The mark field for variable InStr is set to 1.  All other considerations are
		handled by calling MyLinkVisit.<BR>
	@author Thorn Green.
	*/
	private final ASGNode markInsert(
		FlexString InStr,
		ASGHashMap VarList,
		boolean implicitUse,
		boolean gloVisit,
		Object CreateObj,
		Method CreateVisit) {
		ASGNode MyASG;

		if (!(VarList.isEmpty())) {
			MyASG = VarList.getASG(InStr);
			boolean Found = !(MyASG == null);
			if (Found) {
				MyASG.setMark(1);
				if (gloVisit)
					MyASG.setExpNode(GloExpNode);
				gloLinkage.setASGMable(MyASG, implicitUse);
			}
			else {
				MyASG = new ASGNode();
				MyASG.setMark(1);
				MyASG.setMable(EngineConstants.MABLE_UNDEFINED);
				InStr.copyString(MyASG.getStr());
				if (gloVisit)
					MyASG.setExpNode(GloExpNode);
				gloLinkage.setASGMable(MyASG, implicitUse);
				Object CallLst[] =
					{ MyASG.getStr(), MyASG.getMvec(), MyASG.getMablePtr(), MyASG.getDomainPtr(), MyASG.getIODefPtr()};
				try {
					MyASG.setDrawObj((Meta) (CreateVisit.invoke(CreateObj, CallLst)));
				}
				catch (Exception e) {
					throw (new WrapRuntimeException("Visit Failed", e));
				}
				VarList.putASG(MyASG);
			}
		}
		else {
			MyASG = new ASGNode();
			MyASG.setMark(1);
			MyASG.setMable(EngineConstants.MABLE_UNDEFINED);
			InStr.copyString(MyASG.getStr());
			if (gloVisit)
				MyASG.setExpNode(GloExpNode);
			gloLinkage.setASGMable(MyASG, implicitUse);
			Object CallLst[] =
				{ MyASG.getStr(), MyASG.getMvec(), MyASG.getMablePtr(), MyASG.getDomainPtr(), MyASG.getIODefPtr()};
			try {
				MyASG.setDrawObj((Meta) (CreateVisit.invoke(CreateObj, CallLst)));
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Visit Failed", e));
			}
			VarList.putASG(MyASG);
		}

		return (MyASG);
	};

	/**
	Finds the variable with name InStr in VarList.  If InStr does not exist
		in VarList, a new node is inserted at the proper spot.
	<P>
	<B>In:</B> Variable name to be matched, variable list.<BR>
	<B>Out:</B> VarList modified.<BR>
	<B>Pre:</B> InStr is valid.  VarList is a variable list.  VarList is
		ascending ordered by variable name.<BR>
	<B>Post:</B> The mark field for variable InStr is set to 1.<BR>
	@author Thorn Green.
	*/
	private final ASGNode lightMarkInsert(
		FlexString InStr,
		ASGHashMap LocalVarList,
		ASGHashMap GlobalVarList,
		HighLevelList UnqVarList,
		Object CreateObj,
		Method CreateVisit) {
		ASGNode MyASG;
		boolean Found = false;

		MyASG = LocalVarList.getASG(InStr);
		Found = !(MyASG == null);
		if (Found) {
			/* MyASG.setMark( 1 ); */
		}
		else {
			MyASG = new ASGNode();
			MyASG.setMark(1);
			MyASG.setMable(EngineConstants.MABLE_UNDEFINED);
			InStr.copyString(MyASG.getStr());
			IntObj RefCon = new IntObj();
			MyASG.setRefCon(RefCon);
			Object CallLst[] = { MyASG.getStr(), MyASG.getDomainPtr(), MyASG.getIODefPtr(), RefCon };
			try {
				MyASG.setMvec((Mvec) (CreateVisit.invoke(CreateObj, CallLst)));
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Visit Failed", e));
			}
			LocalVarList.putASG(MyASG);

			if ((MyASG.getIODef() != EngineConstants.IO_DEF_INPUT)
				&& ((RefCon.value & EngineConstants.SELF_ALLOC_ENGINE_IGNORE) != 0))
				UnqVarList.insertRight(MyASG);
		}

		return (MyASG);
	};

	private static SolverLinkage gloLinkage;
	private static ExpNode GloExpNode;

};
