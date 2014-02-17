




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

import java.util.Vector;

import meta.*;
import meta.Callback;
import meta.FlexString;
import meta.HighLevelBinTree;
import meta.HighLevelList;
import meta.Meta;



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
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 07/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | Optimizer no longer needed; optimizations now performed elsewhere.   | Changed CodeGen to no longer use Optimizer.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Small bugs in plugin handling.                                       | Closed the bugs.
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
* The CodeGen class generates "code" which can be used by a stack machine to 
* execute a Herculaneum expression.  This is done by taking the expression
* tree that is input, and converting it to a linear set of nodes in postfix
* notation.  The expresison defined by the 
* (Herculaneum EBNF-- put link here) as a string of type 
* {@link meta.FlexString}.  CodeGen passes the input 
* expression to the {@link GEparser} class, which generates 
* a parse tree for the expression.  The parse tree is a 
* {@link meta.HighLevelBinTree} of appropriate lexemes of 
* type {@link Lexeme}.  More precisely, the {@link meta.HighLevelBinTree} stores a
* binary tree representation of a parse tree.  CodeGen then traverses this parse tree to 
* produce a {@link meta.HighLevelList} of {@link Lexeme} 
* nodes.  This HighLevelList is the "code" that is generated.  Each lexeme in the list 
* corresponds to an instruction for the stack machine to execute.
* <P>
* Please note that this class handles code generation, but not linkage issues.  Any 
* variables used in the expression must be linked to particular memory pointers by 
* another class.  This is done by going through the code list generated, and making 
* modifications to each usage of a variable in the list.
* @author Thorn Green
*/
public class CodeGen extends Callback<Lexeme> /* DBN */ {

	/**
	Converts the expression into a series of instructions that can be executed
		by the Executor class (once properly linked by the Linker class).
	<P>
	<B>In:</B> The input expression in the string Instr.<BR>
	<B>Out:</B> Instructions are placed in InList.  The routine returns true if an error
		happened (such as a syntax error).  Otherwise it returns false.<BR>
	<B>Pre:</B> The input string must be terminated by a null character.<BR>
	<B>Post:</B> If an error happened, the output list will be empty.<BR>
	@author Thorn Green.
	*/
	public final boolean generateCode(FlexString instr, HighLevelList<StdLowLevelList<Lexeme>,Lexeme> codeList, int myMode) {
		boolean err;
		HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> myTree = new HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme>();
		GEparser myo = myGEparser;

		err = myo.parseAll(instr, myTree, myMode);
		if (!err)
			genFromTree(myTree, codeList);
		return (err);
	};

	/**
	Converts the parse tree into a series of instructions that can be executed
		by the Executor class (once properly linked by the Linker class).
	<P>
	<B>In:</B> The input expression tree in MyTree.<BR>
	<B>Out:</B> Instructions are placed in InList.<BR>
	<B>Pre:</B> The input tree is valid.  The output list is empty.<BR>
	<B>Post:</B> The output list will be generated.<BR>
	@author Thorn Green.
	*/
	public final void genFromTree(HighLevelBinTree<StdLowLevelBinTree<Lexeme>,Lexeme> myTree, HighLevelList<StdLowLevelList<Lexeme>,Lexeme> inList) {
		mStackSpaceRequired = 0;
		mStackSpaceCurrent = 0;
		HighLevelList<StdLowLevelList<Lexeme>,Lexeme> myl = myList;
		inList.eraseAllInfo();
		inList.copyDataPlusPtrInfo(myl);
		myTree.inOrder(myTree, this);
		myTree.eraseAllInfo();
		if (!myl.empty())
			myl.right();
		myl.copyDataPlusPtrInfo(inList);
		if (mStackSpaceCurrent != 1)
			throw (new RuntimeException("Assertion Violated: Stack does not match. " + mStackSpaceCurrent));
	};

	/**
	Erases all data structures of this code generator.
	<P>
	<B>In:</B> None.<BR>
	<B>Out:</B> None.<BR>
	<B>Pre:</B> None.<BR>
	<B>Post:</B> All nodes allocated by this class are deleted.<BR>
	@author Thorn Green.
	*/
	public final void clear() {
		GEparser myo = myGEparser;
		myo.clear();
	};

	/**
	Verifies that VarStr contains a valid name for a variable.
	<P>
	<B>In:</B> String VarStr, and the parsing mode.<BR>
	<B>Out:</B> Boolean value.<BR>
	<B>Pre:</B> VarStr, MyMode valid.<BR>
	<B>Post:</B> If VarStr holds a variable, the value one will be returned.  Otherwise zero
		will be returned.<BR>
	@author Thorn Green
	*/
	public final boolean verifyVariable(FlexString varStr, int myMode) {
		GEparser myo = myGEparser;
		return (myo.verifyVariable(varStr, myMode));
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
		GEparser myo = myGEparser;
		myo.extractVariable(instr, strt, endloc, outstr);
	};

	/**
	* Returns the code number associated with the last error found.
	*/
	public final int getErrCode() {
		GEparser myo = myGEparser;
		return (myo.getErrCode());
	};

	/**
	This is an auxiliary routine used by CodeGen::GenerateCode.  It adds a node to
		the list myList.  Do not call this routine except from inside CodeGen.
	<P>
	<B>In:</B> Meta pointer for next instruction.<BR>
	<B>Out:</B> To global myList.<BR>
	<B>Pre:</B> None.<BR>
	<B>Post:</B> Pointer in added to myList.<BR>
	@author Thorn Green.
	*/
	@Override
	public void callback(Lexeme in) {
		HighLevelList<StdLowLevelList<Lexeme>,Lexeme> myl = myList;
		myl.insertRight( in );
		myl.setCopyMode(Meta.COPY_DO_NOTHING);
		myl.setEraseMode(Meta.WAKE);

		Lexeme myLex = in;
		int match = myLex.getMyMatch();
		int mStackDelta = 0;

		if (match != GEval.PlugOp)
			mStackDelta = GEval.getMstackOffset(match, myl);
		else {
			int val = myLex.getPlugMatch();
			int plugID = val / GeomEngine.PlugOffsetBase;
			Vector<DepicPlugin> plugs = GeomEngine.getPlugins();
			DepicPlugin myPlug = plugs.elementAt(plugID);
			mStackDelta = myPlug.getMstackOffset(val);
		}

		mStackSpaceCurrent += mStackDelta;
		mStackSpaceRequired = Math.max(mStackSpaceCurrent, mStackSpaceRequired);
	};

	/**
	* Returns the amount of stack space required by the tree expression.  Only valid when
	* called after generateCode( ) is called.
	*/
	public int getMstackSpaceRequired() {
		return (mStackSpaceRequired);
	}

	/**
	* The current amount of mStack space "allocated" during code generation.
	*/
	private int mStackSpaceCurrent = 0;

	/**
	* The total amount of mStack space required for allocation.
	*/
	private int mStackSpaceRequired = 0;

	/**
	* The GEparser used to generate a parse tree.
	*/
	private static final GEparser myGEparser = new GEparser();

	/**
	* The generated code list.
	*/
	private final HighLevelList<StdLowLevelList<Lexeme>,Lexeme> myList = new HighLevelList<StdLowLevelList<Lexeme>,Lexeme>();
};
