



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

import geomdir.engine.ASGHashMap;
import geomdir.engine.ASGNode;
import geomdir.engine.CodeGen;
import geomdir.engine.DynRunnerImpl;
import geomdir.engine.EngineConstants;
import geomdir.engine.ExpNode;
import geomdir.engine.ExprHashMap;
import geomdir.engine.GeomEngine;

import java.lang.reflect.Method;
import java.util.Iterator;

import meta.FlexString;
import meta.HighLevelList;
import meta.WrapRuntimeException;

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
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner was showing too much information to the depictors.         | Modified DynRunner so that it doesn't show engine classes to depictors.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed GeoDynRunner to be compatible with the new clustering.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Global assertions were not integrated with DynRunner assertions.     | Changed GeoDynRunner so that global and DynRunner assertions are integrated by topological sort.
*    | 11/16/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner.link did not report if solver was unable to find solution. | Changed DynRunner.link to return a boolean.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed to support new constraint architecture in geomdir.engine.     | Modified GeoDynRunner to support the new architecture.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/22/2002            | Thorn Green (viridian_1138@yahoo.com)           | Serious bug in depictor handling (found in GeoSlate).                | Made corrective changes.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
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
* Implements a {@link DynRunner} compatible with {@link Model}.  This DynRunner does not do a very
* good job of actually "solving" the system of equations presented to it.  In fact, the current version
* requires the expressions to be entered in topological assignment order.
* @author Thorn Green
*/
public class GeoDynRunner implements geomdir.DynRunner, DynRunnerImpl {

	public GeoDynRunner(Model in1, GeomEngine in2) {
		MyModel = in1;
		MyEngine = in2;
	}

	/**
	* Instructs the DynRunner to handle a mouse-drag event.
	*/
	public boolean dragExecute(Object port, Mvec InPt) {
		DepictorPort thePort = (DepictorPort) (port);
		thePort.hexglo(InPt.getBasis1(), InPt.getBasis2(), BoundPt, bound, TmpHex);

		if (propagateDragValue) {
			LocVec.setBasis1(TmpHex.getPtx());
			LocVec.setBasis2(TmpHex.getPty());
			TmpHex.getGlo().mcpy(GloMinVec);
			LocVec.mcpy(LocMinVec);
		}
		else {
			LocMinVec.setBasis1(TmpHex.getPtx());
			LocMinVec.setBasis2(TmpHex.getPty());
			TmpHex.getGlo().mcpy(GloMinVec);
		}

		boolean ret = MyEngine.resolveDynConstraints();
		return (ret);
	}

	DrawObj ActiveObj = null;

	/**
	*<B>Fun:</B> Changes an expression.  If the expression does currently exist, a new one is
	*	inserted.  This particular method is usually used when assigning to a port variable.
	*<P>
	*<B>In:</B> Name of the dependent variable of the expression to change, and the expression to use.
	*<B>Out:</B> Returns true iff. there is an error.
	*<B>Pre:</B> VarName must be valid.  VarName must be a valid variable.
	*<B>Post:</B> Iff. there is not an error in the expression, the expression will be changed.
	*@author Thorn Green.
	*/
	public final boolean changeExpression(Object[] Var, Object[] Exp) {
		boolean temp;
		CodeGen MyCodeGen = new CodeGen();

		FlexString VarName = new FlexString();
		insertFormattedString(Var, VarName);

		int len = Var.length;
		int cnt;

		for (cnt = 0; cnt < len; cnt++) {
			if (Var[cnt] instanceof DrawObj) {
				DrawObj MyObj = (DrawObj) (Var[cnt]);
				addNewDepictor(MyObj);
				ActiveObj = MyObj;
			}
		}

		len = Exp.length;

		for (cnt = 0; cnt < len; cnt++) {
			if (Exp[cnt] instanceof DrawObj) {
				DrawObj MyObj = (DrawObj) (Exp[cnt]);
				addNewDepictor(MyObj);
			}
		}

		if (MyCodeGen.verifyVariable(VarName, EngineConstants.SUPERVISOR_MODE)) {
			FlexString Vari2 = new FlexString();
			MyCodeGen.extractVariable(VarName, 0, VarName.strlen(), Vari2);
			temp = vAddExpression(Vari2, ActiveObj, Exp);
		}
		else {
			temp = true;
			ErrCode = EngineConstants.VARIABLE_NOT_VALID;
		}

		return (temp);
	};

	/**
	*<B>Fun:</B> Changes an expression.  If the expression does currently exist, a new one is
	*	inserted.  This particular method is usually used when declaring a new
	*	variable by assigmnent expression.
	*<P>
	*<B>In:</B> Name of the dependent variable of the expression to change, the expression to use, 
	*	and the domain of the variable.
	*<B>Out:</B> Returns true iff. there is an error.
	*<B>Pre:</B> VarName must be valid.  VarName must be a valid variable.
	*<B>Post:</B> Iff. there is not an error in the expression, the expression will be changed.
	*@author Thorn Green.
	*/
	public final boolean changeExpression(Object[] Var, Object[] Exp, int Domain) {
		boolean temp;
		CodeGen MyCodeGen = new CodeGen();

		FlexString VarName = new FlexString();
		insertFormattedString(Var, VarName);

		int len = Var.length;
		int cnt;

		for (cnt = 0; cnt < len; cnt++) {
			if (Var[cnt] instanceof DrawObj) {
				DrawObj MyObj = (DrawObj) (Var[cnt]);
				addNewDepictor(MyObj);
				ActiveObj = MyObj;
			}
		}

		len = Exp.length;

		for (cnt = 0; cnt < len; cnt++) {
			if (Exp[cnt] instanceof DrawObj) {
				DrawObj MyObj = (DrawObj) (Exp[cnt]);
				addNewDepictor(MyObj);
			}
		}

		if (MyCodeGen.verifyVariable(VarName, EngineConstants.SUPERVISOR_MODE)) {
			FlexString Vari2 = new FlexString();
			MyCodeGen.extractVariable(VarName, 0, VarName.strlen(), Vari2);
			temp = vAddExpression(Vari2, ActiveObj, Exp);
			ASGNode MyASG = AlphaVarList.getASG(Vari2);
			MyASG.setDomain(Domain);
			MyASG.setIODef(EngineConstants.IO_DEF_OUTPUT_P2);
			IntObj SelfAlloc = new IntObj();
			MyASG.setRefCon(SelfAlloc);
			SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
			UnqVarList.insertRight(MyASG);
		}
		else {
			temp = true;
			ErrCode = EngineConstants.VARIABLE_NOT_VALID;
		}

		return (temp);
	}

	/**
	*<B>Fun:</B> Changes an expression.  If the expression does currently exist, a new one is
	*	inserted.
	*<P>
	*<B>In:</B> Name of the dependent variable of the expression to change, depictor associated
	*	with the expression, the expression to use, and a flag indicating whether
	*	the variable is to be inserted onto the "topological" assignment list.
	*<B>Out:</B> Returns true iff. there is an error.
	*<B>Pre:</B> VarName must be valid.  VarName must be a valid variable.
	*<B>Post:</B> Iff. there is not an error in the expression, the expression will be changed.
	*@author Thorn Green.
	*/
	private final boolean vAddExpression(FlexString VarName, DrawObj VarDrawObj, Object[] Exp) {
		/* boolean Found = false; */
		ExpNode MyExp;
		FlexString CacheExp = new FlexString();
		boolean Err = false;
		boolean Err2 = false;

		FlexString ExpressionString = new FlexString();
		insertFormattedString(Exp, ExpressionString);

		if (!(ExpList.isEmpty())) {
			MyExp = ExpList.getExp(VarName);
			boolean Found = (MyExp != null);
			if (Found) {
				(MyExp.getExprn()).copyString(CacheExp);
				Err = MyEngine.dataCopy(MyExp, VarName, ExpressionString, EngineConstants.SUPERVISOR_MODE);
			}
			else {
				MyExp = new ExpNode();
				Err = MyEngine.dataCopy(MyExp, VarName, ExpressionString, EngineConstants.SUPERVISOR_MODE);
				if (!Err) {
					ExpList.putExp(MyExp);
				}
				/* else delete MyExp; */
			}
		}
		else {
			MyExp = new ExpNode();
			Err = MyEngine.dataCopy(MyExp, VarName, ExpressionString, EngineConstants.SUPERVISOR_MODE);
			if (!Err)
				ExpList.putExp(MyExp);
			/* else delete MyExp; */
		}

		if (!Err) {
			AlphaVarList.insertNode(VarName);
			ASGNode MyASG = AlphaVarList.getASG(VarName);

			MyASG.setDrawObj(null);
			MyASG.setExpNode(MyExp);
			MyASG.setMable(EngineConstants.MABLE_FIXED + EngineConstants.MABLE_ASGN_MASK);

			if (VarDrawObj != null) {
				FlexString Prefix = getPrefix(VarName);
				VarDrawObj.setValuePort(Prefix);
				MyASG.setMvec(VarDrawObj.portGetVect());
				MyASG.getDomainPtr().value = VarDrawObj.portGetExtDomain();
				MyASG.getIODefPtr().value = VarDrawObj.portGetExtIODef();
				MyASG.setRefCon(VarDrawObj.portGetSelfAlloc());
			}

			if ((MyASG.getIODef() != EngineConstants.IO_DEF_INPUT)) {
				IntObj RefCon = (IntObj) MyASG.getRefCon();
				if (RefCon != null) {
					if ((RefCon.value & EngineConstants.SELF_ALLOC_ENGINE_IGNORE) != 0) {
						UnqVarList.insertRight(MyASG);
					}
				}
				else {
					UnqVarList.insertRight(MyASG);
				}
			}
		}

		ErrCode = MyEngine.getErrCode();

		Err = Err || Err2;
		return (Err);
	};

	/**
	* Constrains two ports on the same depictor to each other.  Note: this can only
	* be solved by a "smart" constraint solver.
	*/
	public boolean tie(String t1, String t2, Object ino) {
		DrawObj in = (DrawObj) (ino);
		boolean Err = false;

		Object[] LHS = { t1, in };
		Object[] RHS = { t2, in };

		FlexString LeftExpression = new FlexString();
		FlexString RightExpression = new FlexString();

		insertFormattedString(LHS, LeftExpression);
		insertFormattedString(RHS, RightExpression);

		FlexString id = new FlexString("id" + lastId);
		lastId++;

		ExpNode LeftExp = new ExpNode();
		ExpNode RightExp = new ExpNode();
		Err = MyEngine.dataCopy(LeftExp, id, LeftExpression, EngineConstants.SUPERVISOR_MODE);
		Err = Err || MyEngine.dataCopy(RightExp, id, RightExpression, EngineConstants.SUPERVISOR_MODE);

		if (!Err) {
			RHSimplicitExpList.putExp(RightExp);
			LHSimplicitExpList.putExp(LeftExp);
		}

		return (Err);
	}

	/**
	* Links expressions with the associated variables.
	* Returns true if the solver was unable to handle the set of expressions.
	*/
	public boolean link(Object port, Mvec InPt) {
		boolean err = false;

		if (!Linked) {
			MyEngine.registerDynRunner(this);
			propagateDragValue = MyEngine.dynPropagateDragValue();

			ASGNode MyNode = null;

			Class[] CreateType = { FlexString.class, IntObj.class, IntObj.class, IntObj.class };
			Method CreateVisit = null;
			try {
				CreateVisit = (GeoDynRunner.class).getMethod("createVisit", CreateType);
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Create Failed", e));
			}

			err =
				MyEngine.doDynLink(
					ExpList,
					LHSimplicitExpList,
					RHSimplicitExpList,
					AlphaVarList,
					UnqVarList,
					this,
					CreateVisit,
					this,
					null);

			MyNode = AlphaVarList.getASG(new FlexString("~loc"));
			if (MyNode != null) {
				LocVec = (MyNode).getMvec();
				LocMinVec = (MyNode).getMinimizationMvec();
				MyNode.getDomainPtr().value = EngineConstants.DOM_VECT1 + EngineConstants.DOM_VECT2;
				MyNode.getIODefPtr().value = EngineConstants.IO_DEF_OBJECTIVE;
				((IntObj) (MyNode.getRefCon())).value =
					DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
			}
			else {
				LocVec = TmpVec;
				LocMinVec = TmpVec;
			}

			MyNode = AlphaVarList.getASG(new FlexString("~glo"));
			if (MyNode != null) {
				GloVec = (MyNode).getMvec();
				GloMinVec = (MyNode).getMinimizationMvec();
				MyNode.getDomainPtr().value = EngineConstants.DOM_VECT1 + EngineConstants.DOM_VECT2;
				MyNode.getIODefPtr().value = EngineConstants.IO_DEF_OBJECTIVE;
				((IntObj) (MyNode.getRefCon())).value =
					DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
			}
			else {
				GloVec = TmpVec;
				GloMinVec = TmpVec;
			}

			Iterator it = ConstVarList.values().iterator();
			while (it.hasNext()) {
				ASGNode cnl = (ASGNode) (it.next());
				ASGNode alpha = AlphaVarList.getASG(cnl.getStr());
				if (alpha != null) {
					cnl.getMvec().mcpy(alpha.getMvec());
					alpha.setDomain(cnl.getDomain());
					alpha.setIODef(cnl.getIODef());
					alpha.setRefCon(cnl.getRefCon());
				}
			}

			if (propagateDragValue) {
				TmpHex.setGlo(GloVec);
			}
			else {
				DepictorPort thePort = (DepictorPort) (port);
				thePort.hexglo(InPt.getBasis1(), InPt.getBasis2(), BoundPt, bound, TmpHex);
				LocVec.setBasis1(TmpHex.getPtx());
				LocVec.setBasis2(TmpHex.getPty());
				TmpHex.getGlo().mcpy(GloVec);
			}

			if (!err)
				err = MyEngine.doDynPostLink(ExpList, LHSimplicitExpList, RHSimplicitExpList, AlphaVarList);

			Linked = true;
		}

		return (err);
	}

	/**
	* Handles the end of the drag operation.
	*/
	public void handlePostDrag() {
		/* Un-Register with MyEngine here. */

		MyEngine.registerDynRunner(null);

		Iterator it = AlphaVarList.values().iterator();

		while (it.hasNext()) {
			ASGNode asg = (ASGNode) (it.next());
			ASGNode cousin = asg.getDynCousin();

			if (cousin != null) {
				cousin.setDynCousin(null);
				asg.setDynCousin(null);
			}
		}

	}

	/**
	* Gets the list of unique non-engine variables to be used by the solver.
	*/
	public HighLevelList getUnqVarList() {
		return (UnqVarList);
	}

	/**
	* Gets the LHS tie symbol list used by the solver.
	*/
	public ExprHashMap getLHSimplicitExpList() {
		return (LHSimplicitExpList);
	}

	/**
	* Gets the RHS tie symbol list used by the solver.
	*/
	public ExprHashMap getRHSimplicitExpList() {
		return (RHSimplicitExpList);
	}

	/**
	* Returns the multivector associated with a particular variable.
	*/
	public Mvec findVect(String in) {
		ASGNode MyNode = AlphaVarList.getASG(new FlexString(in));
		Mvec ret = null;

		if (MyNode != null) {
			ret = MyNode.getMvec();
		}

		return (ret);
	}

	/**
	* Makes a particular variable declared by the DynRunner's client constant.
	*/
	public void makeConstant(String invar, Mvec val, int Domain) {
		ASGNode MyNode = new ASGNode();
		FlexString str = MyNode.getStr();
		str.setInsertPoint(0);
		str.insertJavaString(invar);
		ConstVarList.putASG(MyNode);

		IntObj SelfAlloc = new IntObj();
		Mvec ret = MyNode.getMvec();
		val.mcpy(ret);
		MyNode.setDomain(Domain);
		MyNode.setIODef(EngineConstants.IO_DEF_INPUT);
		MyNode.setRefCon(SelfAlloc);
		SelfAlloc.value = DepictorPort.SELF_ALLOC_DROPABLE + DepictorPort.SELF_ALLOC_ENGINE_IGNORE;
	}

	/**
	* Handles the Linker's declaration of a new variable from reading an expression.
	*/
	public Mvec createVisit(FlexString VectName, IntObj Domain, IntObj IODef, IntObj SelfAlloc) {
		Mvec ret = null;

		if (VectName.getChar(0) == '_') {
			FlexString Prefix = getPrefix(VectName);
			FlexString FragID = getFragName(VectName);
			FlexString BaseName = new FlexString();
			removePrefix(VectName, BaseName);
			FragNode MyNode = VarList.getFrag(BaseName);
			DGMHashMap MyList = MyNode.getFragMap();
			DrawObj MyObj = ((MyList.getDGM(FragID))).getMyDraw();
			MyObj.setValuePort(Prefix);
			ret = MyObj.portGetVect();
			Domain.value = MyObj.portGetExtDomain();
			IODef.value = MyObj.portGetExtIODef();
			SelfAlloc.value = MyObj.portGetSelfAlloc().value;
		}
		else {
			VarList.insertNode(VectName);
			FragNode MyNode = VarList.getFrag(VectName);
			ret = MyNode.getVect();
			Domain.value = MyNode.getDomain().value;
			IODef.value = MyNode.getIODef().value;
			SelfAlloc.value = MyNode.getSelfAlloc().value;
		}

		return (ret);
	}

	/**
	* Handles the addition of a new depictor name to the system.
	*/
	protected void addNewDepictor(DrawObj in) {
		FragNode MyNode = VarList.getFrag(in.getVectName());
		boolean Found = (MyNode != null);

		if (Found) {
			addNewInstance(in);
		}
		else {
			VarList.insertNode(in.getVectName());
			MyNode = VarList.getFrag(in.getVectName());
			in.setValuePort(1);
			MyNode.setVect(in.portGetVect());
			addNewInstance(in);
		}
	}

	/**
	* Handles the addition of a new depictor of a particular name to the system.
	*/
	protected void addNewInstance(DrawObj in) {
		FragNode MyNode = VarList.getFrag(in.getVectName());
		DGMHashMap MyList = MyNode.getFragMap();
		DGMNode tmp = new DGMNode();
		tmp.setMyDraw(in);
		MyList.putDGM(tmp);
	}

	/**
	* Returns the full prefix of the input string.
	*/
	protected FlexString getPrefix(FlexString instr) {
		return (MyModel.getPrefix(instr));
	}

	/**
	* Reomves the full prefix from the input string, and places the result in the output string.
	*/
	protected void removePrefix(FlexString instr, FlexString outstr) {
		MyModel.removePrefix(instr, outstr);
	}

	/**
	* Returns the fragment name of the input string.
	*/
	protected FlexString getFragName(FlexString instr) {
		return (MyModel.getFragName(instr));
	}

	/**
	* Reomves one prefix from the port variable name in <code>instr</code>.  Pleces the
	* result in <code>outstr</code>.
	*/
	protected void removeOnePrefix(FlexString instr, FlexString outstr) {
		MyModel.removeOnePrefix(instr, outstr);
	}

	/**
	* Converts a formatted object list to an expression string.
	*/
	public void insertFormattedString(Object[] in, FlexString out) {
		MyModel.insertFormattedString(in, out);
	}

	/**
	* Sets whether the coordinate system of the view is bound.
	*/
	public void setBound(boolean in) {
		bound = in;
	};

	/**
	* Gets whether the coordinate system of the view is bound.
	*/
	public boolean getBound() {
		return (bound);
	};

	/**
	* Sets the center of the bound coordinate system for the depictor being dragged.
	*/
	public void setBoundPt(Mvec in) {
		BoundPt = in;
	};

	/**
	* Gets the center of the bound coordinate system for the depictor being dragged.
	*/
	public Mvec getBoundPt() {
		return (BoundPt);
	};

	/**
	* Writes the constraint system associated with the DynRunner.
	*/
	public void writeConstraintSystem() {
		Iterator it = ExpList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyNode = (ExpNode) (it.next());
			MyEngine.writeStdConstraint(MyNode);
		}

		Iterator itl = LHSimplicitExpList.values().iterator();
		Iterator itr = RHSimplicitExpList.values().iterator();

		while (itl.hasNext()) {
			ExpNode LHS = (ExpNode) (itl.next());
			ExpNode RHS = (ExpNode) (itr.next());
			MyEngine.writeImplicitConstraint(LHS, RHS);
		}

		if (GeomEngine.CurSyntax != EngineConstants.SYNTAX_AMPL_LIKE) {
			it = AlphaVarList.values().iterator();

			while (it.hasNext()) {
				ASGNode MyNode = (ASGNode) (it.next());
				IntObj SelfAlloc = (IntObj) (MyNode.getRefCon());
				if ((SelfAlloc.value & DepictorPort.SELF_ALLOC_ENGINE_IGNORE) != 0)
					MyEngine.printDomain(MyNode.getStr(), MyNode.getDomain());
			}
		}

	}

	/**
	* Writes the I/O definitions associated with the DynRunner.
	*/
	public void writeSystemIODefs() {
		Iterator it = AlphaVarList.values().iterator();

		while (it.hasNext()) {
			ASGNode MyNode = (ASGNode) (it.next());
			IntObj SelfAlloc = (IntObj) (MyNode.getRefCon());
			if ((SelfAlloc.value & DepictorPort.SELF_ALLOC_ENGINE_IGNORE) != 0)
				MyEngine.printIODef(MyNode);
		}

	}

	/**
	* Writes the norm. minimizers associated with the DynRunner.
	*/
	public void writeSystemMinimizers() {
		Iterator it = AlphaVarList.values().iterator();

		while (it.hasNext()) {
			ASGNode MyNode = (ASGNode) (it.next());
			IntObj SelfAlloc = (IntObj) (MyNode.getRefCon());
			if ((SelfAlloc.value & DepictorPort.SELF_ALLOC_ENGINE_IGNORE) != 0)
				MyEngine.writeNextMinimizer(MyNode.getStr(), MyNode.getIODef(), MyNode.getMvec());
		}

	}

	private final DGPHashMap VarList = new DGPHashMap();
	private final ASGHashMap AlphaVarList = new ASGHashMap();
	private final ASGHashMap ConstVarList = new ASGHashMap();
	private final HighLevelList UnqVarList = new HighLevelList();
	private final ExprHashMap ExpList = new ExprHashMap();
	private final ExprHashMap LHSimplicitExpList = new ExprHashMap();
	private final ExprHashMap RHSimplicitExpList = new ExprHashMap();
	private int ErrCode;

	protected Mvec LocVec = null;
	protected Mvec GloVec = null;
	protected Mvec LocMinVec = null;
	protected Mvec GloMinVec = null;
	protected final Hexar TmpHex = new Hexar();
	protected final Mvec TmpVec = new Mvec();
	protected boolean Linked = false;
	protected int lastId = 0;
	protected boolean propagateDragValue = true;

	protected boolean bound = false;
	protected Mvec BoundPt = null;
	protected Model MyModel = null;
	protected GeomEngine MyEngine = null;
}
