




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

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
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
*    | 9/24/2000             | Thorn Green (viridian_1138@yahoo.com)           | Needed to provide a standard way to document source file changes.    | Added a souce modification list to the documentation so that changes to the souce could be recorded. 
*    | 10/22/2000            | Thorn Green (viridian_1138@yahoo.com)           | Methods did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 10/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enahncement.                                             | Improved some methods.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added support for performance enhancements.
*    | 07/24/2002            | Thorn Green (viridian_1138@yahoo.com)           | Small final changes to optimization system.                          | Small final changes to optimization system.
*    | 09/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make BlueToh persistent.                                             | Added functionality to make BlueToh persistent.
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
* Node that contains an expression and its executable representation.
* @author Thorn Green
*/
public class ExpNode extends Meta implements Externalizable {
	public final void datCpy(ExpNode out) {
		out.dvCopyVarName(VarName);
		out.dvCopyExprn(Exprn);
		out.dvCopyCodeList(CodeList);
		out.dvSetExprMode(ExprMode);
		out.dvSetMstackSpaceRequired(mStackSpaceRequired);
		out.dvSetEval(eval);
	};
	public Meta copyNode() {
		ExpNode temp = new ExpNode();
		datCpy(temp);
		return (temp);
	};
	public Meta copySub() {
		ExpNode temp = new ExpNode();
		datCpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		ExpNode temp = new ExpNode();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(Meta in) {
		ExpNode temp = (ExpNode) in;
		datCpy(temp);
	};
	public void copySubInfo(Meta in) {
		ExpNode temp = (ExpNode) in;
		datCpy(temp);
	};
	public void copyAllInfo(Meta in) {
		ExpNode temp = (ExpNode) in;
		datCpy(temp);
	};
	public void eraseNode() {
		CodeGen myc = MyCodeGen;
		HighLevelList myl = CodeList;
		myc.clear();
		myl.eraseAllInfo();
		eval = null;
	};
	public void eraseSub() {
		CodeGen myc = MyCodeGen;
		HighLevelList myl = CodeList;
		myc.clear();
		myl.eraseAllInfo();
		eval = null;
	};
	public void eraseAll() {
		CodeGen myc = MyCodeGen;
		HighLevelList myl = CodeList;
		myc.clear();
		myl.eraseAllInfo();
		eval = null;
	};
	public void wake() {};

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			ExprMode = myv.getInt("ExprMode");
			mStackSpaceRequired = myv.getInt("mStackSpaceRequired");
			VarName = (FlexString) (myv.getProperty("VarName"));
			VersionBuffer.chkNul(VarName);
			Exprn = (FlexString) (myv.getProperty("Exprn"));
			VersionBuffer.chkNul(Exprn);
			CodeList = (HighLevelList) (myv.getProperty("CodeList"));
			VersionBuffer.chkNul(CodeList);

			eval = (EvalObj) (myv.getProperty("Eval"));
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

		myv.setInt("ExprMode", ExprMode);
		myv.setInt("mStackSpaceRequired", mStackSpaceRequired);
		myv.setProperty("VarName", VarName);
		myv.setProperty("Exprn", Exprn);
		myv.setProperty("CodeList", CodeList);
		if (eval != null) {
			if (eval instanceof Serializable)
				myv.setProperty("Eval", eval);
		}

		out.writeObject(myv);
	}

	private final void dvCopyVarName(FlexString in) {
		in.copyAllInfo(VarName);
	}
	private final void dvCopyExprn(FlexString in) {
		in.copyAllInfo(Exprn);
	}
	private final void dvCopyCodeList(HighLevelList in) {
		in.copyDataPlusPtrInfo(CodeList);
	}
	private final void dvSetExprMode(int in) {
		ExprMode = in;
	}
	private final void dvSetEval(EvalObj in) {
		eval = in;
	}
	public final void dvSetMstackSpaceRequired(int in) {
		mStackSpaceRequired = in;
	}
	/**
	* Gets the mark for the node.
	*/
	public final int getMark() {
		return (1);
	};
	/**
	* Gets the executable code list for the node.
	*/
	public final HighLevelList getCodeList() {
		return (CodeList);
	};
	/**
	* Gets the expression stored in the node.
	*/
	public final FlexString getExprn() {
		return (Exprn);
	};
	/**
	* Gets the variable name that the expression assigns to.
	*/
	public final FlexString getVarName() {
		return (VarName);
	};
	/**
	* Gets the code generator that the node uses.
	*/
	public final CodeGen getCodeGen() {
		return (MyCodeGen);
	};
	/**
	* Gets the mode for the expression (e.g. USER_MODE, SUPERVISOR_MODE, etc.)
	*/
	public final int getExprMode() {
		return (ExprMode);
	};
	/**
	* Gets the amount of space required on the mStack by the expression.
	* Should only be called after MyCodeGen has generated an expression.
	*/
	public final int getMstackSpaceRequired() {
		return (mStackSpaceRequired);
	}
	/**
	* Sets the mode for the expression.
	*/
	public final void setExprMode(int in) {
		ExprMode = in;
	};
	/**
	* Sets the amount of Mstack space required for the expression.
	*/
	public final void setMstackSpaceRequired(int in) {
		mStackSpaceRequired = in;
	};

	/**
	* Gets the optimized evaluation object.
	*/
	public final EvalObj getEval() {
		return (eval);
	}

	/**
	* Sets the optimized evaluation object.
	*/
	public final void setEval(EvalObj in) {
		eval = in;
	}

	private int ExprMode = 0;
	private FlexString VarName = new FlexString();
	private FlexString Exprn = new FlexString();
	private HighLevelList CodeList = new HighLevelList();
	private int mStackSpaceRequired = 0;
	private transient CodeGen MyCodeGen = new CodeGen();
	private EvalObj eval = null;
};
