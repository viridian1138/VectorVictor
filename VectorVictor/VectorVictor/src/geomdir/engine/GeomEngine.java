



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

import geomdir.IntObj;
import geomdir.Mvec;
import geomdir.solvers.BluePackSolverLinkage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Vector;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import meta.VersionBuffer;
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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner and global assertions were not integrated.                 | Provided functionality so that DynRunner and global assertions are topologically sorted together.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed to support the new architecture for constraint solving.       | Made modifications to support the new constraint solving architecture.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed support for scale tolerances in constraint solving.           | Added code for handling scale tolerances.
*    | 01/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Needed to support the ability to set the constraint solver.          | Added a method for setting the constraint solver.
*    | 01/26/2001            | Thorn Green (viridian_1138@yahoo.com)           | Previous name re-map caused DomVect to be spelled DoMvect            | Fixed the error in spelling.
*    | 01/28/2001            | Thorn Green (viridian_1138@yahoo.com)           | Need to support persistence in solver linkages.                      | Added persistence support to solver linkages.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added code to support performance enhancements.
*    | 07/24/2002            | Thorn Green (viridian_1138@yahoo.com)           | Small final changes to optimization system.                          | Small final changes to optimization system.
*    | 08/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | Found nit-pick issue with registerDynRunner.                         | Made a small change to close it.
*    | 08/31/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Improved constraint solving.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make BlueToh the default solver.                                     | Made BlueToh the default solver.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Provide support for auto. construction of compound diagrams.         | Added adaptiveRelate() method to make compound diagrams easier to construct.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Added support for experimental solver (StatSolver).
*    | 10/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Be able to drag-through negation (GeoCard).                          | Developed BluePack, as a variant of BlueToh, to do this.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Reduce web footprint.                                                | Made changes to reduce web footprint.
*    | 11/05/2002            | Thorn Green (viridian_1138@yahoo.com)           | Looking for continuous graphing problem.                             | Changed some domain printing.
*    | 05/11/2003            | Thorn Green (viridian_1138@yahoo.com)           | Automated optimization.                                              | Implemented automated optimization, and removed optimization GUIs.
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
* The GeomEngine geometric engine.  This class maintains geometric
* constraints for the calling client code.
*
* @author Thorn Green
*/
public class GeomEngine implements Externalizable {

	public static int CurSyntax = EngineConstants.SYNTAX_DEBUG;

	/**
	Changes an expression.  If the expression doesn't currently exist, a new one is
		inserted.  To be more specific, changeExpression() processes an assignment
		expression which assigns a G-2 multivector expression in ExpressionString
		to a variable identified in VarName.  In processing this sxpression, GeomEngine
		does not give any consideration to the <I>type</I> of the epxression.  For instance,
		if the variable in VarName is really a vector then it would not be appropriate to 
		pass a bivector value into it.  GeomEngine does <B>not</B> take these considerations
		into account.  It is assumes that this has already been takes into account by other parts
		of the MWS, notably the Model Manager.  As far as GeomEngine is concerned everything is a
		special case of a G-2 multivector.  In general, GeomEngine also performs all calculations as
		general G-2 multivector calculations.  It may at first appear that computing everything as a
		multivector operation will slow the engine down.  In most cases, though, the exact opposite
		is true.  It takes the stack code interpreter less time to simply execute a multivector
		operation than it would to examine the type of operands, then examine the type of variable to
		which the expression is assigned, then pick the variation of the operation to be performed
		(vector operatrion, scalar operation, bivector operation, etc.) and then execute the operation.
	
		<P> Another consideratrion is that of which kind of variable name is used in VarName and
		ExpressionString.  The user of the software sees <I>external names</I> which are names for
		graphical entities which may contain superscripts and subscripts.  These external names are then
		converted to <I>internal names</I>, which are multi-character strings inside MWS which correspond
		to external names.  Special parts of the MWS take take in external names from the user and convert
		them to internal names for the various computational engines.  The user usually does not get to see
		internal names.  Unlike other parts of the MWS, GeomEngine understands and works with only internal
		names.  It has no comprehension of external names whatsoever.
	
		<P> The language of internal names that changeExpression() accepts is dependent on the ParsingMode
		parameter.  GeomEngine makes certain assumptions about internal names.  Certain internal names
		are simply the names of symbols which have been translated from external names to internal names.
		Other internal names are names of certain parts of a depictor.  These names do not have an equivalent
		in the SUI because they are depictor implementation-dependent.  For instance, an equation that constrains
		the tails of two vector depictions together needs an internal name for the value of the location of the tail
		of each vector depiction.  
	
	
	<P>
	<B>In:</B> Name of the dependent variable of the expression to change, application data
		structure creation/insertion routine CreateVisit, application data 
		structure deletion routine DeleteVisit.<BR>
	<B>Out:</B> Returns true iff. there is an error.<BR>
	<B>Pre:</B> VarName must be valid.<BR>
	<B>Post:</B> Iff. there is not an error in the expression, the expression will be changed.<BR>
	@author Thorn Green.
	*/
	public final boolean changeExpression(
		FlexString VarName,
		FlexString ExpressionString,
		Object CreateObj,
		String CreateVst,
		Object DeleteObj,
		String DeleteVst,
		int MyMode) {
		boolean temp;
		CodeGen MyCodeGen = new CodeGen();

		Class[] CreateType = { FlexString.class, Mvec.class, IntObj.class, IntObj.class, IntObj.class };
		Method CreateVisit = null;
		try {
			CreateVisit = (CreateObj.getClass()).getMethod(CreateVst, CreateType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		Class[] DeleteType = { Meta.class, FlexString.class };
		Method DeleteVisit = null;
		try {
			DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		UndoMode = UndoDoNothing;
		UndoRedoMode = UndoDoNothing;
		UndoVarName.clearString();
		UndoExprn.clearString();
		UndoRedoExprn.clearString();

		if (MyCodeGen.verifyVariable(VarName, MyMode)) {
			FlexString Vari2 = new FlexString();
			MyCodeGen.extractVariable(VarName, 0, VarName.strlen(), Vari2);
			undoPushChange(Vari2, ExpressionString, MyMode);
			temp = vChangeExpression(Vari2, ExpressionString, CreateObj, CreateVisit, DeleteObj, DeleteVisit, MyMode);
		}
		else {
			temp = true;
			errCode = EngineConstants.VARIABLE_NOT_VALID;
		}

		if (temp) {
			UndoMode = UndoDoNothing;
			UndoRedoMode = UndoDoNothing;
		}

		return (temp);
	};

	/**
	Deletes an expression.
	<P>
	<B>In:</B> Name of the dependent variable of the expression to delete, application data 
		structure deletion routine DeleteVisit.<BR>
	<B>Out:</B> Returns true iff. there is an error.<BR>
	<B>Pre:</B> VarName must be valid.<BR>
	<B>Post:</B> If the expression exists, it will be deleted.<BR>
	@author Thorn Green
	*/
	public final boolean deleteExpression(FlexString VarName, Object DeleteObj, String DeleteVst, int MyMode) {
		boolean temp;
		CodeGen MyCodeGen = new CodeGen();

		Class[] DeleteType = { Meta.class, FlexString.class };
		Method DeleteVisit = null;
		try {
			DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		UndoMode = UndoDoNothing;
		UndoRedoMode = UndoDoNothing;
		UndoVarName.clearString();
		UndoExprn.clearString();
		UndoRedoExprn.clearString();

		if (MyCodeGen.verifyVariable(VarName, MyMode)) {
			FlexString Vari2 = new FlexString();
			MyCodeGen.extractVariable(VarName, 0, VarName.strlen(), Vari2);
			undoPushDelete(Vari2);
			temp = vDeleteExpression(Vari2, DeleteObj, DeleteVisit);
		}
		else {
			temp = true;
			errCode = EngineConstants.VARIABLE_NOT_VALID;
		}

		if (temp) {
			UndoMode = UndoDoNothing;
			UndoRedoMode = UndoDoNothing;
		}

		return (temp);
	};

	/**
	Recalculate the values of all dependent variables.
	<P>
	<B>In:</B> None.<BR>
	<B>Out:</B> None.<BR>
	<B>Pre:</B> None.<BR>
	<B>Post:</B> All variables in the TopoVarList will be recalculated.<BR>
	@author Thorn Green.
	*/
	public final boolean resolveConstraints() {
		return (linkage.resolveConstraints());
	};

	/**
	Recalculate the values of all dependent variables.
	<P>
	<B>In:</B> None.<BR>
	<B>Out:</B> None.<BR>
	<B>Pre:</B> None.<BR>
	<B>Post:</B> All variables in the TopoVarList will be recalculated.<BR>
	@author Thorn Green.
	*/
	public final boolean resolveDynConstraints() {
		return (dynLinkage.resolveConstraints());
	};

	public final boolean dynPropagateDragValue() {
		return (dynLinkage.propagateDragValue());
	}

	/**
	Gets the expression and the parsing mode for the variable in InStr.
	<P>
	<B>In:</B> Variable InStr to collect the information about.<BR>
	<B>Out:</B> OutStr and OutMode modified.  Boolean value returned.<BR>
	<B>Pre:</B> Instr valid.  expList contains an ordered list of expression nodes.<BR>
	<B>Post:</B> If InStr is the name of an expression, the expression and its mode will be
		returned and a 1 will be returned by the function.  Otherwise, a 0 will be returned
		by the function.  Note: all variables are currently stored as supervisor mode.<BR>
	@author Thorn Green
	*/
	public final boolean getExprn(FlexString InStr, FlexString OutStr, IntObj OutMode) {
		ExpNode MyExp = expList.getExp(InStr);
		boolean Found = (MyExp != null);

		if (Found) {
			(MyExp.getExprn()).copyString(OutStr);
			OutMode.value = MyExp.getExprMode();
		}

		return (Found);
	};

	/**
	* Gets the error code number for the last error.
	*/
	public final int getErrCode() {
		return (errCode);
	};

	/**
	Changes an expression.  If the expression does currently exist, a new one is
		inserted.
	<P>
	<B>In:</B> Name of the dependent variable of the expression to change, application data
		structure creation/insertion routine CreateVisit, application data 
		structure deletion routine DeleteVisit.<BR>
	<B>Out:</B> Returns true iff. there is an error.<BR>
	<B>Pre:</B> VarName must be valid.  VarName must be a valid variable.<BR>
	<B>Post:</B> Iff. there is not an error in the expression, the expression will be changed.<BR>
	@author Thorn Green.
	*/
	protected final boolean vChangeExpression(
		FlexString VarName,
		FlexString ExpressionString,
		Object CreateObj,
		Method CreateVisit,
		Object DeleteObj,
		Method DeleteVisit,
		int MyMode) {
		int status;
		boolean CacheFound = false;
		Linker MyLink = new Linker();
		/* boolean Found = false; */
		ExpNode MyExp;
		FlexString CacheExp = new FlexString();
		int CacheMode = 0;
		boolean Err = false;
		boolean Err2 = false;

		if (!(expList.isEmpty())) {
			MyExp = expList.getExp(VarName);
			boolean Found = (MyExp != null);
			if (Found) {
				CacheFound = true;
				CacheMode = MyExp.getExprMode();
				(MyExp.getExprn()).copyString(CacheExp);
				Err = dataCopy(MyExp, VarName, ExpressionString, MyMode);
			}
			else {
				MyExp = new ExpNode();
				Err = dataCopy(MyExp, VarName, ExpressionString, MyMode);
				if (!Err) {
					expList.putExp(MyExp);
				}
				/* else delete MyExp; */
			}
		}
		else {
			MyExp = new ExpNode();
			Err = dataCopy(MyExp, VarName, ExpressionString, MyMode);
			if (!Err)
				expList.putExp(MyExp);
			/* else delete MyExp; */
		}

		if (LinkOn)
			Err2 =
				MyLink.doLink(
					expList,
					LHSimplicitExpList,
					RHSimplicitExpList,
					alphaVarList,
					linkage,
					CreateObj,
					CreateVisit,
					DeleteObj,
					DeleteVisit);

		if (Err2) {
			if (CacheFound)
				vChangeExpression(VarName, CacheExp, CreateObj, CreateVisit, DeleteObj, DeleteVisit, CacheMode);
			else
				vDeleteExpression(VarName, DeleteObj, DeleteVisit);
			errCode = EngineConstants.CIRCULAR_REFERENCE;
		}

		Err = Err || Err2;
		if (LinkOn)
			linkage.resolveConstraints();
		return (Err);
	};

	/**
	Deletes an expression.
	<P>
	<B>In:</B> Name of the dependent variable of the expression to delete, application data 
		structure deletion routine DeleteVisit.<BR>
	<B>Out:</B> Returns true iff. there is an error.<BR>
	<B>Pre:</B> VarName must be valid.  VarName is the name of a valid variable.<BR>
	<B>Post:</B> If the expression exists, it will be deleted.<BR>
	@author Thorn Green.
	*/
	protected final boolean vDeleteExpression(FlexString VarName, Object DeleteObj, Method DeleteVisit) {
		Linker MyLink = new Linker();

		errCode = EngineConstants.EXPRESSION_NOT_FOUND;
		ExpNode MyExp = expList.getExp(VarName);
		boolean Found = (MyExp != null);
		if (Found) {
			MyExp.eraseNode();
			expList.remove(VarName);
		}

		if (LinkOn)
			MyLink.doLink(
				expList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				alphaVarList,
				linkage,
				null,
				null,
				DeleteObj,
				DeleteVisit);
		linkage.resolveConstraints();
		return (!Found);
	};

	/**
	* Adds an implicit constraint using a unique combination of
	* a key and an ID.
	*/
	public final boolean addImplicitConstraint(
		FlexString LHS,
		FlexString RHS,
		FlexString FKey,
		int FID,
		Object CreateObj,
		String CreateVst,
		Object DeleteObj,
		String DeleteVst) {
		boolean Err = false;
		boolean Err2 = false;
		FlexString MyKey = new FlexString();

		Class[] CreateType = { FlexString.class, Mvec.class, IntObj.class, IntObj.class, IntObj.class };
		Method CreateVisit = null;
		try {
			CreateVisit = (CreateObj.getClass()).getMethod(CreateVst, CreateType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		Class[] DeleteType = { Meta.class, FlexString.class };
		Method DeleteVisit = null;
		try {
			DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		if (true) {
			int status;
			boolean CacheFound = false;
			Linker MyLink = new Linker();
			/* boolean Found = false; */
			ExpNode MyExp;
			ExpNode ThisExp;
			String FidStr = (new Integer(FID)).toString();

			MyKey.setInsertPoint(0);
			MyKey.insertChar('<');
			FKey.insertString(MyKey);
			MyKey.insertChar('>');
			MyKey.insertChar('<');
			MyKey.insertJavaString(FidStr);
			MyKey.insertChar('>');

			if (!(LHSimplicitExpList.isEmpty())) {
				ThisExp = LHSimplicitExpList.getExp(MyKey);
				boolean Found = (ThisExp != null);

				MyExp = new ExpNode();
				Err = dataCopy(MyExp, MyKey, LHS, EngineConstants.SUPERVISOR_MODE);
				if (!Err) {
					LHSimplicitExpList.putExp(MyExp);
				}
				/* else delete MyExp; */
			}
			else {
				MyExp = new ExpNode();
				Err = dataCopy(MyExp, MyKey, LHS, EngineConstants.SUPERVISOR_MODE);
				if (!Err)
					LHSimplicitExpList.putExp(MyExp);
				/* else delete MyExp; */
			}

			if (!(RHSimplicitExpList.isEmpty())) {
				ThisExp = RHSimplicitExpList.getExp(MyKey);
				boolean Found = (ThisExp != null);

				MyExp = new ExpNode();
				Err2 = dataCopy(MyExp, MyKey, RHS, EngineConstants.SUPERVISOR_MODE);
				if (!Err2) {
					RHSimplicitExpList.putExp(MyExp);
				}
				/* else delete MyExp; */
			}
			else {
				MyExp = new ExpNode();
				Err2 = dataCopy(MyExp, MyKey, RHS, EngineConstants.SUPERVISOR_MODE);
				if (!Err2)
					RHSimplicitExpList.putExp(MyExp);
				/* else delete MyExp; */
			}

			Err = Err || Err2;

			if (LinkOn && !Err)
				Err =
					MyLink.doLink(
						expList,
						LHSimplicitExpList,
						RHSimplicitExpList,
						alphaVarList,
						linkage,
						CreateObj,
						CreateVisit,
						DeleteObj,
						DeleteVisit);

		}

		if (Err) {
			ExpNode MyNode = LHSimplicitExpList.getExp(MyKey);
			boolean Found = (MyNode != null);

			if (Found) {
				MyNode.eraseNode();
				LHSimplicitExpList.remove(MyKey);
			}

			MyNode = RHSimplicitExpList.getExp(MyKey);
			Found = (MyNode != null);

			if (Found) {
				MyNode.eraseNode();
				RHSimplicitExpList.remove(MyKey);
			}

		}

		return (Err);
	}

	/**
	* Deletes all implicit constraints that have a particular key.
	*/
	public final boolean dropAllImplicitConstraints(FlexString InKey, Object DeleteObj, String DeleteVst) {
		ExpNode MyExp;

		if (true) {
			Linker MyLink = new Linker();
			FlexString FKey = new FlexString();

			Class[] DeleteType = { Meta.class, FlexString.class };
			Method DeleteVisit = null;
			try {
				DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Visit Failed", e));
			}

			FKey.setInsertPoint(0);
			FKey.insertChar('<');
			InKey.insertString(FKey);
			FKey.insertChar('>');

			Iterator<?> it = LHSimplicitExpList.values().iterator();
			while (it.hasNext()) {
				MyExp = (ExpNode) (it.next());
				if (MyExp.getVarName().baseCmp(FKey, 0)) {
					MyExp.eraseNode();
					it.remove();
				}
			}

			it = RHSimplicitExpList.values().iterator();
			while (it.hasNext()) {
				MyExp = (ExpNode) (it.next());
				if (MyExp.getVarName().baseCmp(FKey, 0)) {
					MyExp.eraseNode();
					it.remove();
				}
			}

			if (LinkOn)
				MyLink.doLink(
					expList,
					LHSimplicitExpList,
					RHSimplicitExpList,
					alphaVarList,
					linkage,
					null,
					null,
					DeleteObj,
					DeleteVisit);
		}

		return (false);
	}

	protected final static int UndoDoNothing = 1;
	protected final static int UndoDelete = 2;
	protected final static int UndoChange = 3;
	transient int UndoMode = UndoDoNothing;
	transient int UndoRedoMode = UndoDoNothing;
	transient int UndoExprMode = EngineConstants.SUPERVISOR_MODE;
	transient int UndoRedoExprMode = EngineConstants.SUPERVISOR_MODE;
	transient final FlexString UndoVarName = new FlexString();
	transient final FlexString UndoExprn = new FlexString();
	transient final FlexString UndoRedoExprn = new FlexString();

	/** 
	Performs an undo on the previous symbolic operation.
	<P>
	<B>In:</B> Create visit object, delete visit object.<BR>
	<B>Out:</B> Internal state of GeomEngine changed.<BR>
	<B>Pre:</B> GeomEngine must be in a consistent state.<BR>
	<B>Post:</B> The previous operation will be undone to the symbolic level.<BR>
	@author Thorn Green
	*/
	public final void popUndo(Object CreateObj, String CreateVst, Object DeleteObj, String DeleteVst) {
		Class[] CreateType = { FlexString.class, Mvec.class, IntObj.class, IntObj.class, IntObj.class };
		Method CreateVisit = null;
		try {
			CreateVisit = (CreateObj.getClass()).getMethod(CreateVst, CreateType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		Class[] DeleteType = { Meta.class, FlexString.class };
		Method DeleteVisit = null;
		try {
			DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		switch (UndoMode) {
			case UndoDoNothing :
				break;
			case UndoDelete :
				vDeleteExpression(UndoVarName, DeleteObj, DeleteVisit);
				break;
			case UndoChange :
				vChangeExpression(UndoVarName, UndoExprn, CreateObj, CreateVisit, DeleteObj, DeleteVisit, UndoExprMode);
				break;
		}

		FlexString TempExp = new FlexString();
		int TempMd;

		TempMd = UndoMode;
		UndoMode = UndoRedoMode;
		UndoRedoMode = TempMd;
		TempMd = UndoExprMode;
		UndoExprMode = UndoRedoExprMode;
		UndoRedoExprMode = TempMd;
		UndoExprn.copyString(TempExp);
		UndoRedoExprn.copyString(UndoExprn);
		TempExp.copyString(UndoRedoExprn);
	};

	/**
	Prepares for a subsequent undo operation after an expression change.
	<P>
	<B>In:</B> Variable name, expression.<BR>
	<B>Out:</B> State variables set.<BR>
	<B>Pre:</B> GeomEngine must be in a consistent state.<BR>
	<B>Post:</B> The state variables will be set so that a subsequent undo will work
		properly.<BR>
	@author Thorn Green
	*/
	protected final void undoPushChange(FlexString VarName, FlexString Exprn, int MyMode) {
		UndoRedoMode = UndoChange;
		UndoRedoExprMode = MyMode;
		VarName.copyString(UndoVarName);
		Exprn.copyString(UndoRedoExprn);
		ExpNode MyNode = expList.getExp(VarName);
		boolean Found = (MyNode != null);
		if (Found) {
			UndoMode = UndoChange;
			MyNode.getExprn().copyString(UndoExprn);
			UndoExprMode = MyNode.getExprMode();
		}
		else {
			UndoMode = UndoDelete;
		}
	};

	/**
	Prepares for a subsequent undo operation after an expression deletion.
	<P>
	<B>In:</B> Variable name, expression.<BR>
	<B>Out:</B> State variables set.<BR>
	<B>Pre:</B> GeomEngine must be in a consistent state.<BR>
	<B>Post:</B> The state variables will be set so that a subsequent undo will work
		properly.<BR>
	@author Thorn Green
	*/
	protected final void undoPushDelete(FlexString VarName) {
		UndoRedoMode = UndoDelete;
		/* UndoRedoExprMode blank */
		VarName.copyString(UndoVarName);
		ExpNode MyNode = expList.getExp(VarName);
		boolean Found = (MyNode != null);
		if (Found) {
			UndoMode = UndoChange;
			MyNode.getExprn().copyString(UndoExprn);
			UndoExprMode = MyNode.getExprMode();
		}
		else {}
	};

	/**
	Verifies that VarStr contains a valid name for a variable.
	<P>
	<B>In:</B> String VarStr, and the parsing mode.<BR>
	<B>Out:</B> Boolean value.<BR>
	<B>Pre:</B> VarStr, MyMode valid.<BR>
	<B>Post:</B> If VarStr holds a variable, true will be returned.  Otherwise false
		will be returned.<BR>
	@author Thorn Green
	*/
	public final boolean verifyVariable(FlexString VarName, int MyMode) {
		CodeGen MyCodeGen = new CodeGen();
		boolean tp = MyCodeGen.verifyVariable(VarName, MyMode);
		boolean temp = !tp;
		if (temp) {
			errCode = EngineConstants.VARIABLE_NOT_VALID;
		}

		return temp;
	};

	/**
	Extracts an machine variable name from a string containing a variable name.
	<P>
	<B>In:</B> The string containing the variable name, the start of the variable name, the
		end of the variable name.<BR>
	<B>Out:</B> Output string.<BR>
	<B>Pre:</B> The string must contain a variable name at position [ strt , endloc ].<BR>
	<B>Post:</B> The machine name of the variable will be placed in outstr.<BR>
	@author Thorn Green
	*/
	public final void extractVariable(FlexString instr, int strt, int endloc, FlexString outstr) {
		CodeGen MyCodeGen = new CodeGen();
		MyCodeGen.extractVariable(instr, strt, endloc, outstr);
	};

	/**
	Changes the expression assigned to a particular expression node.
	<P>
	<B>In:</B> Expression node InExp, variable name VarName, expression ExpressionString.<BR>
	<B>Out:</B> Iff. there is an error, the routine returns true.<BR>
	<B>Pre:</B> VarName and ExpressionString must be valid.  InExp must point to an
		expression node.<BR>
	<B>Post:</B> If there's an error, the node will be unchanged.<BR>
	@author Thorn Green.
	*/
	public final boolean dataCopy(Meta InExp, FlexString VarName, FlexString ExpressionString, int MyMode) {
		boolean Err;
		HighLevelList MyCodeList = new HighLevelList();
		ExpNode MyExp = (ExpNode) InExp;
		Err = (MyExp.getCodeGen()).generateCode(ExpressionString, MyCodeList, MyMode);
		if (!Err) {
			MyExp.setExprMode(MyMode);
			VarName.copyString(MyExp.getVarName());
			ExpressionString.copyString(MyExp.getExprn());
			(MyExp.getCodeList()).eraseAllInfo();
			MyCodeList.copyDataPlusPtrInfo(MyExp.getCodeList());
			MyExp.setMstackSpaceRequired(MyExp.getCodeGen().getMstackSpaceRequired());
			MyExp.setEval(null);
		}
		else
			errCode = (MyExp.getCodeGen()).getErrCode();
		return (Err);
	};

	/**
	Turns auto linking on or off.  Warning: turning auto-link off is dangerous,
		and should be used with extreme caution.
	<P>
	<B>In:</B> Value for autolink, link parameters.<BR>
	<B>Out:</B> Link state modified.  If link set to true, a re-link is performed.  If an error
		is found in re-link, true is returned.  Otherwise, false is returned.<BR>
	<B>Pre:</B> CreateObj, CreateVisit, DeleteObj, and DeleteVisit must be valid.<BR>
	<B>Post:</B> The link state will be set to the desired value.  Note: if linking is off and
		an operation is performed which causes a circular reference, GeomEngine will
		be left in an inconsistent state.<BR>
	@author Thorn Green.
	*/
	public boolean setLinkOn(boolean in, Object CreateObj, String CreateVst, Object DeleteObj, String DeleteVst) {
		Class[] CreateType = { FlexString.class, Mvec.class, IntObj.class, IntObj.class, IntObj.class };
		Method CreateVisit = null;
		try {
			CreateVisit = (CreateObj.getClass()).getMethod(CreateVst, CreateType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		Class[] DeleteType = { Meta.class, FlexString.class };
		Method DeleteVisit = null;
		try {
			DeleteVisit = (DeleteObj.getClass()).getMethod(DeleteVst, DeleteType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Visit Failed", e));
		}

		boolean Err = false;
		LinkOn = in;
		if (LinkOn) {
			Linker MyLink = new Linker();
			Err =
				MyLink.doLink(
					expList,
					LHSimplicitExpList,
					RHSimplicitExpList,
					alphaVarList,
					linkage,
					CreateObj,
					CreateVisit,
					DeleteObj,
					DeleteVisit);
		}

		return (Err);
	};

	/**
	Links variable and topological lists so that they are up to date with the
		current expression list.
	<P>
	<B>In:</B> Expression list, variable list, topological variable list, 
		application data structure creation request procedure, application data
		structure deletion request procedure.<BR>
	<B>Out:</B> alphaVarList, TopoVarList modified.  CreateVisit, DeleteVisit called on
		external data structures.<BR>
	<B>Pre:</B> expList is an expression list.  alphaVarList and TopoVarList are variable lists.
		expList, alphaVarList, TopoVarList point to the heads of their respective lists.<BR>
	<B>Post:</B> TopoVarList will get the new topological list.  alphaVarList will get the new
		variable list.  CreateVisit and DeleteVisit will be called as appropriate.<BR>
	@author Thorn Green.
	*/
	public final boolean doDynLink(
		ExprHashMap LocalExpList,
		ExprHashMap LocalLHSimplicitExpList,
		ExprHashMap LocalRHSimplicitExpList,
		ASGHashMap LocalVarList,
		HighLevelList UnqVarList,
		Object CreateObj,
		Method CreateVisit,
		Object DeleteObj,
		Method DeleteVisit) {
		Linker myLink = new Linker();
		boolean err =
			myLink.doLightLink(
				alphaVarList,
				LocalVarList,
				LocalExpList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				LocalLHSimplicitExpList,
				LocalRHSimplicitExpList,
				UnqVarList,
				dynLinkage,
				CreateObj,
				CreateVisit,
				DeleteObj,
				DeleteVisit);

		return (err);
	}

	public final boolean doDynPostLink(
		ExprHashMap LocalExpList,
		ExprHashMap LocalLHSimplicitExpList,
		ExprHashMap LocalRHSimplicitExpList,
		ASGHashMap LocalVarList) {
		Linker myLink = new Linker();
		boolean err =
			myLink.postLink(
				alphaVarList,
				LocalVarList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				LocalLHSimplicitExpList,
				LocalRHSimplicitExpList,
				dynLinkage);

		return (err);
	}

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			ASGHashMap tmp = (ASGHashMap) (myv.getProperty("alphaVarList"));
			VersionBuffer.chkNul(tmp);
			alphaVarList.putAll(tmp);

			ExprHashMap tmp2 = (ExprHashMap) (myv.getProperty("expList"));
			VersionBuffer.chkNul(tmp2);
			expList.putAll(tmp2);

			linkage = (SolverLinkage) (myv.getProperty("linkage"));
			VersionBuffer.chkNul(linkage);
			dynLinkage = (SolverLinkage) (myv.getProperty("dynLinkage"));
			VersionBuffer.chkNul(dynLinkage);
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

		myv.setProperty("alphaVarList", alphaVarList);
		myv.setProperty("linkage", linkage);
		myv.setProperty("dynLinkage", dynLinkage);
		myv.setProperty("expList", expList);

		out.writeObject(myv);
	}

	/**
	* Gets the names of all variables that depend on <code>InStr</code>.
	*/
	public void getDependentVariables(FlexString InStr, HighLevelList in) {
		FlexString VarName = new FlexString();
		extractVariable(InStr, 0, InStr.strlen(), VarName);
		ExpNode MyNode = expList.getExp(VarName);
		boolean Found = (MyNode != null);

		if (Found) {
			HighLevelList CList = MyNode.getCodeList();

			if (!(CList.empty())) {
				CList.searchHead();
				boolean Done = false;

				while (!Done) {
					Lexeme MyLex = (Lexeme) (CList.getNode());
					if (MyLex.getMyMatch() == GEval.variable) {
						ASGNode MyASG = (ASGNode) (MyLex.getMetaPtr());
						in.insertRight(MyASG.getStr());
					}

					CList.right();
					Done = CList.getHead();
				}
			}
		}
	}

	/**
	* Gets the names of all variables used by <code>InStr</code>.
	*/
	public void getUsageVariables(FlexString InStr, HighLevelList in) {
		FlexString VarName = new FlexString();
		extractVariable(InStr, 0, InStr.strlen(), VarName);
		Iterator<?> it = expList.values().iterator();
		while (it.hasNext()) {
			ExpNode MyNode = (ExpNode) (it.next());
			HighLevelList CList = MyNode.getCodeList();

			if (!(CList.empty())) {
				CList.searchHead();
				boolean Done1 = false;

				while (!Done1) {
					Lexeme MyLex = (Lexeme) (CList.getNode());
					if (MyLex.getMyMatch() == GEval.variable) {
						ASGNode MyASG = (ASGNode) (MyLex.getMetaPtr());
						FlexString test = MyASG.getStr();
						if (VarName.stcmp(test) == 0) {
							in.insertRight(MyNode.getVarName());
						}
					}

					CList.right();
					Done1 = CList.getHead();
				}
			}

		}
	}

	/**
	* Prints the domain of a particular variable.
	*/
	public void printDomain(FlexString Var, int Domain) {
		boolean prev = false;
		int AllDom =
			EngineConstants.DOM_SCA + EngineConstants.DOM_VECT1 + EngineConstants.DOM_VECT2 + EngineConstants.DOM_PSU;
		if (Domain != AllDom) {
			System.out.print("'");
			Var.writeString();
			System.out.print("' = ");

			if ((Domain & EngineConstants.DOM_SCA) != 0) {
				if (prev)
					System.out.print(" + ");
				prev = true;
				System.out.print("< '");
				Var.writeString();
				System.out.print("' >{ 0 }");
			}

			if (((Domain & EngineConstants.DOM_VECT1) != 0) && ((Domain & EngineConstants.DOM_VECT2) != 0)) {
				if (prev)
					System.out.print(" + ");
				prev = true;
				System.out.print("< '");
				Var.writeString();
				System.out.print("' >{ 1 }");
			}

			if (!((Domain & EngineConstants.DOM_VECT1) != 0) && ((Domain & EngineConstants.DOM_VECT2) != 0)) {
				if (prev)
					System.out.print(" + ");
				prev = true;
				System.out.print("( < '");
				Var.writeString();
				System.out.print("' >{ 1 } dot #2 ) * #2");
			}

			if (((Domain & EngineConstants.DOM_VECT1) != 0) && !((Domain & EngineConstants.DOM_VECT2) != 0)) {
				if (prev)
					System.out.print(" + ");
				prev = true;
				System.out.print("( < '");
				Var.writeString();
				System.out.print("' >{ 1 } dot #1 ) * #1");
			}

			if ((Domain & EngineConstants.DOM_PSU) != 0) {
				if (prev)
					System.out.print(" + ");
				prev = true;
				System.out.print("< '");
				Var.writeString();
				System.out.print("' >{ 2 }");
			}

			if (Domain == 0)
				System.out.print(" 0.0 ");

			System.out.println("");
		}
	}

	/**
	* Prints the I/O status of a variable.
	*/
	public void printIODef(ASGNode MyNode) {
		FlexString Var = MyNode.getStr();
		int IODef = MyNode.getIODef();
		Mvec Val = MyNode.getMvec();
		int Domain = MyNode.getDomain();

		if (CurSyntax == EngineConstants.SYNTAX_DEBUG) {
			System.out.print("'");
			Var.writeString();
			System.out.print("' is ");

			switch (IODef) {
				case EngineConstants.IO_DEF_OBJECTIVE :
					System.out.print("Objective");
					break;

				case EngineConstants.IO_DEF_INPUT :
					System.out.print("Input");
					break;

				case EngineConstants.IO_DEF_OUTPUT_P1 :
					System.out.print("Output (Priority 1) at Standard Tolerance");
					break;

				case EngineConstants.IO_DEF_OUTPUT_P2 :
					System.out.print("Output (Priority 2) at Standard Tolerance");
					break;

				case EngineConstants.IO_DEF_OUTPUT_P1 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
					System.out.print("Output (Priority 1) at Scale Tolerance");
					break;

				case EngineConstants.IO_DEF_OUTPUT_P2 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
					System.out.print("Output (Priority 2) at Scale Tolerance");
					break;
			}

			System.out.println("");
		}

		if (CurSyntax == EngineConstants.SYNTAX_AMPL_LIKE) {
			switch (IODef) {
				case EngineConstants.IO_DEF_INPUT :
					System.out.print("param ");
					break;

				case EngineConstants.IO_DEF_OBJECTIVE :
				case EngineConstants.IO_DEF_OUTPUT_P1 :
				case EngineConstants.IO_DEF_OUTPUT_P2 :
				case EngineConstants.IO_DEF_OUTPUT_P1 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
				case EngineConstants.IO_DEF_OUTPUT_P2 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
					System.out.print("var ");
					break;
			}

			System.out.print("'");
			Var.writeString();
			System.out.print("'");

			switch (IODef) {
				case EngineConstants.IO_DEF_INPUT :
					System.out.print(" := [ ");
					System.out.print(Val.getBasis());
					System.out.print(" , ");
					System.out.print(Val.getBasis1());
					System.out.print(" , ");
					System.out.print(Val.getBasis2());
					System.out.print(" , ");
					System.out.print(Val.getBasis12());
					System.out.print(" ] ");
					break;

				case EngineConstants.IO_DEF_OBJECTIVE :
					System.out.print(" in domain ");
					System.out.print(Domain);
					break;

				case EngineConstants.IO_DEF_OUTPUT_P1 :
					System.out.print(" in domain ");
					System.out.print(Domain);
					break;

				case EngineConstants.IO_DEF_OUTPUT_P2 :
					System.out.print(" in domain ");
					System.out.print(Domain);
					break;

				case EngineConstants.IO_DEF_OUTPUT_P1 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
					System.out.print(" in domain ");
					System.out.print(Domain);
					break;

				case EngineConstants.IO_DEF_OUTPUT_P2 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
					System.out.print(" in domain ");
					System.out.print(Domain);
					break;
			}

			System.out.println(";");
		}
	}

	/**
	* Prints a constraint.
	*/
	public void writeStdConstraint(ExpNode MyNode) {
		if (CurSyntax == EngineConstants.SYNTAX_DEBUG) {
			System.out.print("'");
			MyNode.getVarName().writeString();
			System.out.print("' = ");
			MyNode.getExprn().writelnString();
		}

		if (CurSyntax == EngineConstants.SYNTAX_AMPL_LIKE) {
			System.out.print("subject to '");
			MyNode.getVarName().writeString();
			System.out.print("' = ");
			MyNode.getExprn().writeString();
			System.out.println(";");
		}
	}

	/**
	* Prints an implicit constraint.
	*/
	public void writeImplicitConstraint(ExpNode LHS, ExpNode RHS) {
		if (CurSyntax == EngineConstants.SYNTAX_DEBUG) {
			LHS.getExprn().writeString();
			System.out.print(" = ");
			RHS.getExprn().writelnString();
		}

		if (CurSyntax == EngineConstants.SYNTAX_AMPL_LIKE) {
			System.out.print("subject to ");
			LHS.getExprn().writeString();
			System.out.print(" = ");
			RHS.getExprn().writelnString();
			System.out.println(";");
		}
	}

	/**
	* Prints a minimizer.
	*/
	public void writeNextMinimizer(FlexString var, int IODef, Mvec InitialVal) {
		boolean skip = true;
		String Mult = null;

		switch (IODef) {
			case EngineConstants.IO_DEF_OBJECTIVE :
				skip = false;
				Mult = "1000";
				break;

			case EngineConstants.IO_DEF_OUTPUT_P2 :
			case EngineConstants.IO_DEF_OUTPUT_P2 + EngineConstants.IO_DEF_SCALE_TOLERANCE :
				skip = false;
				Mult = "1";
				break;
		}

		if (!skip) {
			System.out.print("minimize-delta " + Mult + " * '");
			var.writeString();
			System.out.println("';");
		}

	}

	/**
	* Prints a constraint system.
	*/
	public void writeConstraintSystem() {
		System.out.println("### Input/Output Definitions: ###");

		Iterator<?> it = alphaVarList.values().iterator();

		while (it.hasNext()) {
			ASGNode MyNode = (ASGNode) (it.next());
			printIODef(MyNode);
		}

		if (RegDynRunner != null)
			RegDynRunner.writeSystemIODefs();

		if (CurSyntax == EngineConstants.SYNTAX_AMPL_LIKE) {
			System.out.println("");
			System.out.println("### Objective Function: ###");
			System.out.println("minimize");

			it = alphaVarList.values().iterator();

			while (it.hasNext()) {
				ASGNode MyNode = (ASGNode) (it.next());
				writeNextMinimizer(MyNode.getStr(), MyNode.getIODef(), MyNode.getMvec());
			}

			if (RegDynRunner != null)
				RegDynRunner.writeSystemMinimizers();

			System.out.println(";");
		}

		System.out.println("");
		System.out.println("### Constraints: ###");

		it = expList.values().iterator();

		while (it.hasNext()) {
			ExpNode MyNode = (ExpNode) (it.next());
			writeStdConstraint(MyNode);
		}

		Iterator<?> itl = LHSimplicitExpList.values().iterator();
		Iterator<?> itr = RHSimplicitExpList.values().iterator();

		while (itl.hasNext()) {
			ExpNode LHS = (ExpNode) (itl.next());
			ExpNode RHS = (ExpNode) (itr.next());
			writeImplicitConstraint(LHS, RHS);
		}

		it = alphaVarList.values().iterator();

		if (CurSyntax != EngineConstants.SYNTAX_AMPL_LIKE) {
			while (it.hasNext()) {
				ASGNode MyNode = (ASGNode) (it.next());
				printDomain(MyNode.getStr(), MyNode.getDomain());
			}
		}

		if (RegDynRunner != null)
			RegDynRunner.writeConstraintSystem();
	}

	/**
	* Registers a DynRunner with the engine.
	*/
	public void registerDynRunner(DynRunnerImpl in) {
		if (in == null) {
			RegDynRunner = in;
			dynLinkage.releaseLinkage();
		}
		else {
			if ((RegDynRunner != null) && (RegDynRunner != in))
				dynLinkage.releaseLinkage();
			RegDynRunner = in;
		}
	}

	/**
	* Installs a plugin.
	*/
	public static void installPlugin(Class<? extends DepicPlugin> plug) {
		int sz = plugins.size();
		if (sz < 0)
			sz = 0;
		int off = PlugOffsetBase * (sz);
		DepicPlugin myo = null;
		try {
			myo = plug.newInstance();
			myo.setPlugInstalled(off);

			if ((sz + 1) > plugins.size())
				plugins.setSize(sz + 1);

			plugins.setElementAt(myo, sz);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Plug Install Failed", e));
		}
	}

	/**
	* Installs a solver.
	*/
	public void installSolver(String HumanName, Class<? extends SolverLinkage> clss) {
		int sz = solverHnameVect.size();
		if (sz < 0)
			sz = 0;

		if ((sz + 1) > solverHnameVect.size())
			solverHnameVect.setSize(sz + 1);

		solverHnameVect.setElementAt(HumanName, sz);
		solverMap.put(HumanName, clss);
	}

	/**
	* Gets the set of plugins.
	*/
	public static final Vector<DepicPlugin> getPlugins() {
		return (plugins);
	}

	/**
	* Gets the current scale tolerance.
	*/
	public double getScaleTolerance() {
		return (linkage.getScaleTolerance());
	}

	/**
	* Sets the scale tolerance of the assumed rendering system.  Assumes that the number passed in
	* the parameter is the pixel tolerance divided by two (i.e. divided to deal with Nyquist considerations).
	*/
	public void setScaleTolerance(double in) {
		if (in > 1.0E-12) {
			linkage.setScaleTolerance(in);
			dynLinkage.setScaleTolerance(in);
		}
	}

	/**
	* Preliminary method to get the set of constraint solvers.  This will be changed
	* in the future.  Don't count on anything in this method being fixed as far as future
	* revisions are concerned.
	*/
	public String[] getConstraintSolvers() {
		int count;
		int sz = solverHnameVect.size();
		String[] solvers = new String[sz];

		for (count = 0; count < sz; count++) {
			solvers[count] = solverHnameVect.elementAt(count);
		}

		return (solvers);
	}

	/**
	* Preliminary method to set the desired constraint solver.  This will be changed
	* in the future.  Don't count on anything in this method being fixed as far as future
	* revisions are concerned.
	*/
	public boolean setConstraintSolver(String stype) {
		Class<? extends SolverLinkage> clss = solverMap.get(stype);

		try {
			if (clss != null) {
				linkage = clss.newInstance();
				dynLinkage = clss.newInstance();
			}
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException("Linkage Instance Failed", ex));
		}

		Linker MyLink = new Linker();

		boolean link =
			MyLink.doLink(
				expList,
				LHSimplicitExpList,
				RHSimplicitExpList,
				alphaVarList,
				linkage,
				null,
				null,
				null,
				null);

		return (link);
	}

	/**
	* Optimizes performance of the evaluation expressions in the engine.
	*/
	public void optimizeRep() {
		if (!LinkOn)
			throw (new RuntimeException("Please turn link on first."));

		linkage.optimizeRep(expList);
		// dynLinkage.optimizeRep( expList );
	}

	/**
	* Like changeExpression, but handles assignments to assigned-to variables by
	* attempting to trace the assignment chain for find an appropriate insertion
	* point.  This is something of a kluge to support compound diagram generation
	* in applied/OpHandler.
	*/
	public boolean adaptiveRelate(
		FlexString VarName,
		FlexString ExpressionString,
		Object CreateObj,
		String CreateVst,
		Object DeleteObj,
		String DeleteVst,
		int MyMode) {
		FlexString Vname = SymUtils.adaptiveRelate(VarName, ExpressionString, MyMode, alphaVarList, expList);

		if (Vname == null)
			return (true);

		boolean err = changeExpression(Vname, ExpressionString, CreateObj, CreateVst, DeleteObj, DeleteVst, MyMode);

		return (err);
	}

	protected static Vector<DepicPlugin> plugins = new Vector<DepicPlugin>();
	public static final int PlugOffsetBase = 10000;

	protected transient SolverLinkage linkage = new BluePackSolverLinkage();
	protected transient SolverLinkage dynLinkage = new BluePackSolverLinkage();
	protected transient DynRunnerImpl RegDynRunner = null;
	protected transient boolean LinkOn = true;
	protected final ASGHashMap alphaVarList = new ASGHashMap();
	protected final ExprHashMap expList = new ExprHashMap();
	protected final ExprHashMap LHSimplicitExpList = new ExprHashMap();
	protected final ExprHashMap RHSimplicitExpList = new ExprHashMap();
	protected final Vector<String> solverHnameVect = new Vector<String>();
	protected final HashMap<String,Class<? extends SolverLinkage>> solverMap 
		= new HashMap<String,Class<? extends SolverLinkage>>();
	protected transient int errCode;

};
