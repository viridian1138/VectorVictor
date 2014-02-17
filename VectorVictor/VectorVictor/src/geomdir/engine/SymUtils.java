



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

import meta.FlexString;
import meta.HighLevelList;
import meta.*;


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
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Ability to make compound diagrams (GeoCard).                         | Created SymUtils class to handle simplified cross-assign issues for compound diagrams.
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

class SymUtils extends Object {

	private static FlexString getASGTraverse(ExpNode exp) {
		if (exp != null) {
			HighLevelList<StdLowLevelList<Lexeme>,Lexeme> codeList = exp.getCodeList();
			if (!(codeList.empty())) {
				boolean singleNode = codeList.isSingleNode();
				if (singleNode) {
					Lexeme MyLex = codeList.getNode();
					if (MyLex.getMyMatch() == GEval.variable) {
						return (exp.getExprn());
					}
				}
			}
		}

		return (null);
	}

	private static FlexString getValidASGTraverseOneSide(ASGNode var, int MyMode, ASGHashMap AlphaVarList) {
		ASGNode exASG = null;
		FlexString exVarName = getASGTraverse(var.getExpNode());
		FlexString Vari2 = new FlexString();

		if (exVarName != null) {
			CodeGen MyCodeGen = new CodeGen();
			if (MyCodeGen.verifyVariable(exVarName, MyMode)) {
				MyCodeGen.extractVariable(exVarName, 0, exVarName.strlen(), Vari2);
				exASG = AlphaVarList.getASG(Vari2);
			}
		}

		if (exASG != null) {
			if (exASG.getMable() == EngineConstants.MABLE_UNDEFINED)
				return (exVarName);

			if (exASG.getIODef() >= EngineConstants.IO_DEF_OUTPUT_P1) {
				if ((var.getDomain() | exASG.getDomain()) == exASG.getDomain())
					return (exVarName);
			}
		}
		else {
			return (exVarName);
		}

		return (null);
	}

	private static FlexString getAdaptiveBackRel(
		FlexString Vari,
		int MyMode,
		ASGHashMap AlphaVarList,
		ExprHashMap ExpList) {
		ASGNode asg = AlphaVarList.getASG(Vari);
		return (getValidASGTraverseOneSide(asg, MyMode, AlphaVarList));
	}

	private static FlexString checkInitialAdaptiveOk(
		FlexString VarName,
		int MyMode,
		ASGHashMap AlphaVarList,
		FlexString Vari2) {
		CodeGen MyCodeGen = new CodeGen();
		if (MyCodeGen.verifyVariable(VarName, MyMode)) {
			MyCodeGen.extractVariable(VarName, 0, VarName.strlen(), Vari2);
			ASGNode asg = AlphaVarList.getASG(Vari2);
			if (asg == null)
				return (VarName);
			ExpNode exp = asg.getExpNode();
			if (exp == null)
				return (VarName);
		}

		return (null);
	}

	private static FlexString checkTraverseAdaptiveOk(
		FlexString VarName,
		int MyMode,
		ASGHashMap AlphaVarList,
		ExprHashMap ExpList) {
		FlexString Vari2 = new FlexString();
		FlexString chk = checkInitialAdaptiveOk(VarName, MyMode, AlphaVarList, Vari2);
		if (chk != null)
			return (chk);
		FlexString back = getAdaptiveBackRel(Vari2, MyMode, AlphaVarList, ExpList);
		while ((chk == null) && (back != null)) {
			Vari2.eraseAllInfo();
			chk = checkInitialAdaptiveOk(back, MyMode, AlphaVarList, Vari2);
			if (chk == null)
				back = getAdaptiveBackRel(Vari2, MyMode, AlphaVarList, ExpList);
		}

		return (chk);
	}

	public static FlexString adaptiveRelate(
		FlexString VarName,
		FlexString ExpressionString,
		int MyMode,
		ASGHashMap AlphaVarList,
		ExprHashMap ExpList) {
		FlexString iret = checkTraverseAdaptiveOk(VarName, MyMode, AlphaVarList, ExpList);
		if (iret == VarName)
			return (iret);

		FlexString ret = null;
		if (iret != null) {
			ret = new FlexString();
			iret.copyAllInfo(ret);
		}
		return (ret);
	}

}
