



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

import geomdir.Mvec;

import java.util.Vector;

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
*    | 10/26/2000            | Thorn Green (viridian_1138@yahoo.com)           | Engine classes had names that were outside the Java standard.        | Changed the class names.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Had bugs in the other modifications listed as made on 11/12.         | Added some print statements during debug, and then removed them.  There should be no functional changes to the code.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Had bugs in the other modifications listed as made on 12/03.         | Added some print statements during debug, and then removed them.  There should be no functional changes to the code.
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine allocating too many Mvec objects on the heap.             | Changed Executor to reduce the number of memory allocations.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Changed Executor to support performance enhancements.
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
* Stack machine that evaluates an ordered set of expressions.
* @author Thorn Green
*/
public class Executor extends Object {

	/**
	Evaluate an expression, and place the result in a multivector.
	<P>
	<B>In:</B> The instructions for the expression to be evaluated in CodeList.<BR>
	<B>Out:</B> The multivector result is placed in DestVect.<BR>
	<B>Pre:</B> The expression is correct, and has been properly linked by the Linker class.<BR>
	<B>Post:</B> DestVect is set to the proper value.<BR>
	@author Thorn Green.
	*/
	protected final void evaluateExpression(HighLevelList CodeList, Mvec DestVect) {
		boolean Done = false;
		mStack.clearSp();
		if (!(CodeList.empty())) {
			while (!Done) {
				Meta MyMeta = CodeList.getNode();
				Lexeme MyLex = (Lexeme) MyMeta;
				int MyMatch = MyLex.getMyMatch();
				switch (MyMatch) {
					case GEval.variable :
						{
							ASGNode MyASG = (ASGNode) MyLex.getMetaPtr();
							mStack.push((Mvec) (MyASG.getMvec()));
						}
						break;
					case GEval.NumConst :
						{
							mStack.push((Mvec) (MyLex.getMvec()));
						}
						break;
					case GEval.Lbrac :
						{
							MyGEval.lbrac(MyLex, mStack, oStack);
						}
						break;
					case GEval.CompObj :
						{
							oStack.push(MyLex.getMetaPtr());
							oStack.setRearCopyMode(Meta.COPY_DO_NOTHING);
							oStack.setRearEraseMode(Meta.WAKE);
						}
						break;
					case GEval.DeCastLeft :
						{
							MyGEval.deCastLeft(MyLex, mStack, oStack);
						}
						break;
					case GEval.DeCastRight :
						{
							MyGEval.deCastRight(MyLex, mStack, oStack);
						}
						break;
					case GEval.DeCastBlossomLeft :
						{
							MyGEval.deCastBlossomLeft(MyLex, mStack, oStack);
						}
						break;
					case GEval.DeCastBlossomRight :
						{
							MyGEval.deCastBlossomRight(MyLex, mStack, oStack);
						}
						break;
					case GEval.DeCastBlossomLeftComp :
						{
							MyGEval.deCastBlossomLeftComp(MyLex, mStack, oStack);
						}
						break;
					case GEval.DeCastBlossomRightComp :
						{
							MyGEval.deCastBlossomRightComp(MyLex, mStack, oStack);
						}
						break;
					case GEval.PlugOp :
						{
							int val = MyLex.getPlugMatch();
							int PlugID = val / GeomEngine.PlugOffsetBase;
							Vector Plugs = GeomEngine.getPlugins();
							DepicPlugin MyPlug = (DepicPlugin) (Plugs.elementAt(PlugID));
							MyPlug.evalOp(val, mStack, oStack);
						}
						break;
					default :
						{
							MyGEval.exeGE(MyMatch, mStack, oStack);
						}
						break;
				}
				CodeList.right();
				Done = CodeList.getHead();
			}
		}

		mStack.pop().mcpy(DestVect);

		if (!(mStack.zeroSp())) {
			throw (new RuntimeException("mStack not zero."));
		}

		if (!(oStack.empty())) {
			throw (new RuntimeException("oStack not zero."));
		}

	};

	/**
	Evaluate the values of all dependent variables in topological order.
	<P>
	<B>In:</B> A list of all dependent variables in topological order.<BR>
	<B>Out:</B> The multivector value of the dependent variables is altered.<BR>
	<B>Pre:</B> All expressions are correct, and have been properly linked by the Linker class.<BR>
	<B>Post:</B> The multivector value of all dependent variables is set to the proper value.<BR>
	@author Thorn Green.
	*/
	public final void evaluateAllExpressions(HighLevelList ASGList) {
		boolean Done = false;

		if (!(ASGList.empty())) {
			while (!Done) {
				Meta MyMeta = ASGList.getNode();
				ASGNode MyASG = (ASGNode) MyMeta;
				ExpNode MyExp = MyASG.getExpNode();
				EvalObj eval = MyExp.getEval();
				if (eval != null) {
					try {
						eval.eval(MyASG.getMvec());
					}
					catch (Throwable ex) {
						ex.printStackTrace(System.out);
					}
				}
				else
					evaluateExpression(MyExp.getCodeList(), MyASG.getMvec());
				ASGList.right();
				Done = ASGList.getHead();
			}
		}
	};

	/**
	* Sets the required size of the Mstack.
	*/
	public final void setMstackSpaceRequired(int in) {
		mStack.setSize(in);
	}

	/**
	* Attempts to generate an optimized evaluation object for the passed ExpNode.
	*/
	public final void attachEvalObj(ExpNode exp) {
		GenerateEvalObj.attachEvalObj(exp, mStack);
	}

	/**
	* The evaluation stack of Mvec objects.
	*/
	private final Mstack mStack = new Mstack();

	/**
	* The evaluation stack of non-Mvec objects.
	*/
	private final Staque oStack = new Staque();

	/**
	* Object used to evaluate expressions.
	*/
	private final GEval MyGEval = new GEval();
};
