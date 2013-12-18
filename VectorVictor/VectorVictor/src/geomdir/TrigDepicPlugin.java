



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

import geomdir.engine.DepicPlugin;
import geomdir.engine.Lexeme;
import geomdir.engine.Mstack;
import meta.FlexString;
import meta.HighLevelBinTree;
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
*    | 01/15/2002            | Thorn Green (viridian_1138@yahoo.com)           | Plugin interface changed as part of a performance enhancement.       | Modified the plugin to be compliant.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added method to improve performance.
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
* A plugin that performs operations that are not a part of the
* base operations handled by {@link geomdir.engine.GeomEngine}
* because the algorithms for calculating them properly on multivectors
* have not (yet) been determined.  The operations defined here only work
* for special cases.  This class has not yet been finished.
* @author Thorn Green
*/
public class TrigDepicPlugin extends DepicPlugin {
	static final Mvec temp = new Mvec();
	static boolean PlugInstalled = false;
	static int PlugOffset = 0;

	static final int AcosOp = 1;
	static final int TanOp = 2;
	static final int PowlOp = 3;
	static final int PowrOp = 4;
	static final int RootlOp = 5;
	static final int RootrOp = 6;
	static final int SqrtOp = 7;

	public TrigDepicPlugin() {}
	/**
	* Installs the plugin.
	*/
	public static void installPlug() {
		installPlug(TrigDepicPlugin.class);
	}
	/**
	* Gets whether the plugin has been installed.
	*/
	public static boolean getPlugInstalled() {
		return (PlugInstalled);
	}
	/**
	* Installs the plugin.  Do not use directly.
	*/
	public void setPlugInstalled(int PlOffset) {
		PlugOffset = PlOffset;
		PlugInstalled = true;
		System.out.println("Trig Depic Plugin Installed...");
	}
	/**
	* Parses TestStr.  If it contains a function defined by this plugin, place the result in InLex.
	*/
	public HighLevelBinTree parseOps(FlexString TestStr, Lexeme InLex, HighLevelBinTree Args) {
		HighLevelBinTree ret = null;
		int ArgCnt = countArgs(Args);

		if ((TestStr.stcmp("acos(") == 0) && (ArgCnt == 1)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + AcosOp);
		}

		if ((TestStr.stcmp("tan(") == 0) && (ArgCnt == 1)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + TanOp);
		}

		if ((TestStr.stcmp("powl(") == 0) && (ArgCnt == 2)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + PowlOp);
		}

		if ((TestStr.stcmp("powr(") == 0) && (ArgCnt == 2)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + PowrOp);
		}

		if ((TestStr.stcmp("rootl(") == 0) && (ArgCnt == 2)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + RootlOp);
		}

		if ((TestStr.stcmp("rootr(") == 0) && (ArgCnt == 2)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + RootrOp);
		}

		if ((TestStr.stcmp("sqrt(") == 0) && (ArgCnt == 1)) {
			ret = buildUnary(InLex, Args);
			InLex.setPlugMatch(PlugOffset + SqrtOp);
		}

		return (ret);
	}

	/**
	* Returns the mStack offset used by the operation.
	*/
	public int getMstackOffset(int Match) {
		int ret = 0;
		int RMatch = Match - PlugOffset;

		switch (RMatch) {
			case AcosOp :
			case TanOp :
			case SqrtOp :
				ret = 0;
				break;

			case PowlOp :
			case PowrOp :
			case RootlOp :
			case RootrOp :
				ret = -1;
				break;

		}

		return (ret);
	}

	/**
	* Builds a unary parameter list.
	*/
	private HighLevelBinTree buildUnary(Lexeme FunLex, HighLevelBinTree TempTree) {
		HighLevelBinTree MyTree = new HighLevelBinTree();

		MyTree.addRight(FunLex);
		MyTree.setCopyMode(Meta.COPY_DO_NOTHING);
		MyTree.setEraseMode(Meta.WAKE);
		TempTree.pasteLeft(MyTree);
		TempTree.eraseAllInfo();

		return (MyTree);
	}

	/**
	* Evaluates the operation for the geometry engine.
	*/
	public void evalOp(int Match, Mstack mStack, Staque oStack) {
		int RMatch = Match - PlugOffset;

		switch (RMatch) {
			case AcosOp :
				exAcosOp(mStack, oStack);
				break;
			case TanOp :
				exTanOp(mStack, oStack);
				break;
			case PowlOp :
				exPowlOp(mStack, oStack);
				break;
			case PowrOp :
				exPowrOp(mStack, oStack);
				break;
			case RootlOp :
				exRootlOp(mStack, oStack);
				break;
			case RootrOp :
				exRootrOp(mStack, oStack);
				break;
			case SqrtOp :
				exSqrtOp(mStack, oStack);
				break;

		}

	}

	/**
	* Gets the static method name for generating compiled forms of the operation.
	*/
	public String getStaticMethodName(int Match) {
		int RMatch = Match - PlugOffset;
		String ret = null;

		switch (RMatch) {
			case AcosOp :
				ret = "acos";
				break;
			case TanOp :
				ret = "tan";
				break;
			case PowlOp :
				ret = "powl";
				break;
			case PowrOp :
				ret = "powr";
				break;
			case RootlOp :
				ret = "rootl";
				break;
			case RootrOp :
				ret = "rootr";
				break;
			case SqrtOp :
				ret = "sqrt";
				break;

		}

		return (ret);
	}

	/**
	* Pops a multivector from the stack, then pushes its arc-cosine.
	*/
	public void exAcosOp(Mstack mStack, Staque oStack) {
		Mvec in = mStack.pop();
		acos(in, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its tangeant.
	*/
	public void exTanOp(Mstack mStack, Staque oStack) {
		Mvec in = mStack.pop();
		tan(in, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its square root.
	*/
	public void exSqrtOp(Mstack mStack, Staque oStack) {
		Mvec in = mStack.pop();
		sqrt(in, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its left power function.
	*/
	public void exPowlOp(Mstack mStack, Staque oStack) {
		Mvec avec = mStack.pop();
		Mvec bvec = mStack.pop();
		powl(avec, bvec, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its left power function.
	*/
	public void exPowrOp(Mstack mStack, Staque oStack) {
		Mvec avec = mStack.pop();
		Mvec bvec = mStack.pop();
		powr(avec, bvec, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its left root function.
	*/
	public void exRootlOp(Mstack mStack, Staque oStack) {
		Mvec avec = mStack.pop();
		Mvec bvec = mStack.pop();
		rootl(avec, bvec, temp);
		mStack.push(temp);
	}
	/**
	* Pops a multivector from the stack, then pushes its right root function.
	*/
	public void exRootrOp(Mstack mStack, Staque oStack) {
		Mvec avec = mStack.pop();
		Mvec bvec = mStack.pop();
		rootr(avec, bvec, temp);
		mStack.push(temp);
	}
	/**
	* Calculates the arc-cosine of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void acos(Mvec in, Mvec out) {
		out.setBasis(Math.acos(in.getBasis()));
		out.setBasis1(0.0);
		out.setBasis2(0.0);
		out.setBasis12(0.0);
	}
	/**
	* Calculates the tangeant of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void tan(Mvec in, Mvec out) {
		Mvec tmp = new Mvec();
		in.sin(out);
		in.cos(tmp);
		double tmp1 = tmp.getBasis();
		out.setBasis(out.getBasis() / tmp1);
		out.setBasis1(out.getBasis1() / tmp1);
		out.setBasis2(out.getBasis2() / tmp1);
		out.setBasis12(out.getBasis12() / tmp1);
	}
	/**
	* Calculates the right power function of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void powr(Mvec avec, Mvec bvec, Mvec out) {
		Mvec aln = new Mvec();
		Mvec res = new Mvec();
		avec.ln(aln);
		aln.mult(bvec, res);
		res.exp(out);
	}
	/**
	* Calculates the left power function of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void powl(Mvec avec, Mvec bvec, Mvec out) {
		Mvec aln = new Mvec();
		Mvec res = new Mvec();
		avec.ln(aln);
		bvec.mult(aln, res);
		res.exp(out);
	}
	/**
	* Calculates the square root of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void sqrt(Mvec avec, Mvec out) {
		Mvec bvec = new Mvec();
		bvec.setBasis(0.5);
		powr(avec, bvec, out);
	}
	/**
	* Calculates the right root of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void rootr(Mvec avec, Mvec bvec, Mvec out) {
		Mvec aln = new Mvec();
		Mvec bin = new Mvec();
		Mvec res = new Mvec();
		avec.ln(aln);
		bvec.mcpy(bin);
		bin.inverse();
		aln.mult(bin, res);
		res.exp(out);
	}
	/**
	* Calculates the left root of <code>in</code>, and places the result
	* in <code>out</code>.
	*/
	public static void rootl(Mvec avec, Mvec bvec, Mvec out) {
		Mvec aln = new Mvec();
		Mvec bin = new Mvec();
		Mvec res = new Mvec();
		avec.ln(aln);
		bvec.mcpy(bin);
		bin.inverse();
		bin.mult(aln, res);
		res.exp(out);
	}

}
