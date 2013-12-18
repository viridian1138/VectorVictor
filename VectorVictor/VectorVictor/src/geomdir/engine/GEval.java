


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
import geomdir.ObjObj;
import meta.HighLevelList;
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
*    | 01/17/2002            | Thorn Green (viridian_1138@yahoo.com)           | GeomEngine was allocating too many Mvec objects.                     | Changed Executor to allocate fewer objects.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Made changes to enhance performance.
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
* GEval is a class which contains a series of member functions for performing numerical 
* operations on a stack machine.  In specific, GEval contains routines for doing computations 
* on a {@link meta.Staque} of numeric {@link geomdir.Mvec} 
* multivectors.  GEval also contains a routine 
* routine for each type of lexeme which may exist in a Herculaneum expression.  Thus, the type of a 
* lexeme may be described by the switch value.  As a result, the switch value may be used
* to either "describe" or "execute" code.
* <P>
* @author Thorn Green
*/
public class GEval extends GEsym {
	/* public static final int eof = 1; */
	public final void eof(Mstack mStack, Staque oStack) { /* never called */
	};
	/* public static final int err = 2; */
	public final void err(Mstack mStack, Staque oStack) { /* never called */
	};
	/* public static final int space = 3; */
	public final void space(Mstack mStack, Staque oStack) { /* never called */
	};

	/* public static final int plus = 4; */

	/**
	Performs an addition operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the mStack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void plus(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.add(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int minus = 5; */

	/**
	Performs a subtraction operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void minus(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.sub(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int vplus = 6; */

	/**
	Performs a vector addition operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void vplus(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.vaddz(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int vminus = 7; */

	/**
	Performs a vector subtraction operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void vminus(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.vsubz(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int prod = 8; */

	/**
	Performs a multiplication operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void prod(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.mult(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int div = 9; */

	/**
	Performs a division operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.
		The divisor is not idempotent.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void div(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.divide(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int dot = 10; */

	/**
	Performs a dot product operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void dot(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.dot(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int cross = 11; */

	/**
	Performs a cross product operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void cross(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.cross(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int wedge = 12; */

	/**
	Performs a wedge product operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void wedge(Mstack mStack, Staque oStack) {
		Mvec BVec = mStack.pop();
		Mvec AVec = mStack.pop();

		AVec.wedge(BVec, temp);

		mStack.push(temp);
	};

	/* public static final int Lparen = 13; */
	public final void lparen(Mstack mStack, Staque oStack) { /* never called */
	};
	/* public static final int Rparen = 14; */
	public final void rparen(Mstack mStack, Staque oStack) { /* never called */
	};

	/* public static final int Lbrac = 15; */
	/* Handled special. */

	/* public static final int Rbrac = 16; */
	public final void rbrac(Mstack mStack, Staque oStack) { /* never called */
	};

	/* public static final int exp = 17; */

	/**
	Performs an exponential operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void exp(Mstack mStack, Staque oStack) {
		mStack.pop().exp(temp);

		mStack.push(temp);
	};

	/* public static final int cos = 18; */

	/**
	Performs a cosine operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void cos(Mstack mStack, Staque oStack) {
		mStack.pop().cos(temp);

		mStack.push(temp);
	};

	/* public static final int sin = 19; */

	/**
	Performs a sine operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void sin(Mstack mStack, Staque oStack) {
		mStack.pop().sin(temp);

		mStack.push(temp);
	};

	/* public static final int sinh = 20; */

	/**
	Performs a hyperbolic sine operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void sinh(Mstack mStack, Staque oStack) {
		mStack.pop().sinh(temp);

		mStack.push(temp);
	};

	/* public static final int cosh = 21; */

	/**
	Performs a hyperbolic cosine operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void cosh(Mstack mStack, Staque oStack) {
		mStack.pop().cosh(temp);

		mStack.push(temp);
	};

	/* public static final int reverse = 22; */

	/**
	Performs a reversion operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void reverse(Mstack mStack, Staque oStack) {
		mStack.pop().mcpy(temp);
		temp.reverse();

		mStack.push(temp);
	};

	/* public static final int inverse = 23; */

	/**
	Performs an inverse operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.
		The argument is not idempotent.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void inverse(Mstack mStack, Staque oStack) {
		mStack.pop().mcpy(temp);
		temp.inverse();

		mStack.push(temp);
	};

	/* public static final int magnitude = 24; */

	/**
	Performs a magnitude operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void magnitude(Mstack mStack, Staque oStack) {
		mStack.pop().mcpy(temp);
		temp.magnitude();

		mStack.push(temp);
	};

	/* public static final int basis12 = 25; */

	/**
	Pushes basis12 onto the stack.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack points to a valid Mstack.<BR>
	<B>Post:</B> Basis12 will be pushed onto the stack.<BR>
	@author Thorn Green
	*/
	public final void basis12(Mstack mStack, Staque oStack) {
		temp.setToBasis12();

		mStack.push(temp);
	};

	/* public static final int basis1 = 26; */

	/**
	Pushes basis1 onto the stack.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack points to a valid Mstack.<BR>
	<B>Post:</B> Basis1 will be pushed onto the stack.<BR>
	@author Thorn Green
	*/
	public final void basis1(Mstack mStack, Staque oStack) {
		temp.setToBasis1();

		mStack.push(temp);
	};

	/* public static final int basis2 = 27; */

	/**
	Pushes basis2 onto the stack.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack points to a valid Mstack.<BR>
	<B>Post:</B> Basis2 will be pushed onto the stack.<BR>
	@author Thorn Green
	*/
	public final void basis2(Mstack mStack, Staque oStack) {
		temp.setToBasis2();

		mStack.push(temp);
	};

	/* public static final int pi = 28; */

	/**
	Pushes pi onto the stack.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack points to a valid Mstack.<BR>
	<B>Post:</B> Pi will be pushed onto the stack.<BR>
	@author Thorn Green
	*/
	public final void pi(Mstack mStack, Staque oStack) {
		temp.setToPi();

		mStack.push(temp);
	};

	/* public static final int Lbrak = 29; */
	public final void lbrak(Mstack mStack, Staque oStack) { /* never called */
	};
	/* public static final int Rbrak = 30; */
	public final void rbrak(Mstack mStack, Staque oStack) { /* never called */
	};
	/* public static final int variable = 31; */
	public final void variable(Mstack mStack, Staque oStack) { /* Handled by High Level Eval Routine */
	};
	/* public static final int NumConst = 32; */
	public final void numConst(Mstack mStack, Staque oStack) { /* Handled by High Level Eval Routine */
	};

	/* public static final int negation = 33; */

	/**
	Performs a negation operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void negation(Mstack mStack, Staque oStack) {
		mStack.pop().mcpy(temp);
		temp.minus();

		mStack.push(temp);
	};

	/* public static final int PhasToVect = 34; */

	/**
	Performs a phasor to vector conversion on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B> The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void phasToVect(Mstack mStack, Staque oStack) {
		mStack.pop().phasToVect(temp);

		mStack.push(temp);
	};

	/* public static final int UnitOf = 35; */

	/**
	Performs a phasor to vector conversion on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B> The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void unitOf(Mstack mStack, Staque oStack) {
		mStack.pop().mcpy(temp);
		temp.unitOf();

		mStack.push(temp);
	};

	/* public static final int ln = 36; */

	/**
	Performs an natural log operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least one value.<BR>
	<B>Post:</B>  The argument will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void ln(Mstack mStack, Staque oStack) {
		mStack.pop().ln(temp);

		mStack.push(temp);
	};

	/* public static final int DeCastBlossomLeftComp = 37; -- Handled Separate */

	/* public static final int Comma = 38; */
	public final void comma(Mstack mStack, Staque oStack) {
		/* Never Executed. */
	}

	/* public static final int CompObj = 39; */
	public final void compObj(Mstack mStack, Staque oStack) {
		/* Never Executed. */
	}

	/* public static final int DeCastBlossomRightComp = 40; -- Handled Separate */

	/* public static final int DeCastBlossomLeft = 41; -- Handled Separate */

	/* public static final int DeCastBlossomRight = 42; -- Handled Separate */

	/* public static final int DeCastLeft = 43; -- Handled Separate */

	/* public static final int DeCastRight = 44; -- Handled Separate */

	/**
	Emulates a C++ pointer to member function dereference on the parameter in.
	<P>
	<B>In:</B> "Pointer" parameter, and parameters to call the member function on.<BR>
	<B>Out:</B> Undefined.<BR>
	<B>Pre:</B> In must be valid.<BR>
	<B>Post:</B> The proper method will be executed with the parameters.<BR>
	@author Thorn Green
	*/
	public final void exeGE(int in, Mstack mStack, Staque oStack) {
		switch (in) {
			case vplus : /* 6 */
				vplus(mStack, oStack);
				break;

			case vminus : /* 7 */
				vminus(mStack, oStack);
				break;

			case plus : /* 4 */
				plus(mStack, oStack);
				break;

			case minus : /* 5 */
				minus(mStack, oStack);
				break;

			case magnitude : /* 24 */
				magnitude(mStack, oStack);
				break;

			case UnitOf : /* 35 */
				unitOf(mStack, oStack);
				break;

			case prod : /* 8 */
				prod(mStack, oStack);
				break;

			case div : /* 9 */
				div(mStack, oStack);
				break;

			case dot : /* 10 */
				dot(mStack, oStack);
				break;

			case wedge : /* 12 */
				wedge(mStack, oStack);
				break;

			case negation : /* 33 */
				negation(mStack, oStack);
				break;

			case cross : /* 11 */
				cross(mStack, oStack);
				break;

			case inverse : /* 23 */
				inverse(mStack, oStack);
				break;

			case eof : /* 1 */
				eof(mStack, oStack);
				break;

			case err : /* 2 */
				err(mStack, oStack);
				break;

			case space : /* 3 */
				space(mStack, oStack);
				break;

			case Lparen : /* 13 */
				lparen(mStack, oStack);
				break;

			case Rparen : /* 14 */
				rparen(mStack, oStack);
				break;

			case Rbrac : /* 16 */
				rbrac(mStack, oStack);
				break;

			case exp : /* 17 */
				exp(mStack, oStack);
				break;

			case cos : /* 18 */
				cos(mStack, oStack);
				break;

			case sin : /* 19 */
				sin(mStack, oStack);
				break;

			case sinh : /* 20 */
				sinh(mStack, oStack);
				break;

			case cosh : /* 21 */
				cosh(mStack, oStack);
				break;

			case reverse : /* 22 */
				reverse(mStack, oStack);
				break;

			case basis12 : /* 25 */
				basis12(mStack, oStack);
				break;

			case basis1 : /* 26 */
				basis1(mStack, oStack);
				break;

			case basis2 : /* 27 */
				basis2(mStack, oStack);
				break;

			case pi : /* 28 */
				pi(mStack, oStack);
				break;

			case Lbrak : /* 29 */
				lbrak(mStack, oStack);
				break;

			case Rbrak : /* 30 */
				rbrak(mStack, oStack);
				break;

			case variable : /* 31 */
				variable(mStack, oStack);
				break;

			case NumConst : /* 32 */
				numConst(mStack, oStack);
				break;

			case PhasToVect : /* 34 */
				phasToVect(mStack, oStack);
				break;

			case ln : /* 36 */
				ln(mStack, oStack);
				break;

			case Comma : /* 38 */
				comma(mStack, oStack);
				break;

			case CompObj : /* 39 */
				compObj(mStack, oStack);
				break;

		}
	}

	/**
	Gets the Mstack offset of a particular execution code.
	<P>
	<B>In:</B> The execution code to get the offset for.<BR>
	<B>Out:</B> Offset value returned.<BR>
	<B>Pre:</B> In must be valid.<BR>
	<B>Post:</B> The proper value will be returned.<BR>
	@author Thorn Green
	*/
	public static final int getMstackOffset(int in, HighLevelList codeList) {
		int ret = 0;

		switch (in) {
			case vplus : /* 6 */
			case vminus : /* 7 */
			case plus : /* 4 */
			case minus : /* 5 */
			case prod : /* 8 */
			case div : /* 9 */
			case dot : /* 10 */
			case wedge : /* 12 */
			case cross : /* 11 */
				ret = -1;
				break;

			case Lbrac : /* 15 */
			case magnitude : /* 24 */
			case UnitOf : /* 35 */
			case negation : /* 33 */
			case inverse : /* 23 */
			case exp : /* 17 */
			case cos : /* 18 */
			case sin : /* 19 */
			case sinh : /* 20 */
			case cosh : /* 21 */
			case reverse : /* 22 */
			case PhasToVect : /* 34 */
			case ln : /* 36 */
			case CompObj : /* 39 */
				ret = 0;
				break;

			case basis12 : /* 25 */
			case basis1 : /* 26 */
			case basis2 : /* 27 */
			case pi : /* 28 */
			case variable : /* 31 */
			case NumConst : /* 32 */
				ret = 1;
				break;

			case DeCastBlossomLeftComp : /* 37 */
			case DeCastBlossomRightComp : /* 40 */
			case DeCastBlossomLeft : /* 41 */
			case DeCastBlossomRight : /* 42 */
				ret = getMstackOffsetDeCastBlossom(codeList);
				break;

			case DeCastLeft : /* 43 */
			case DeCastRight : /* 44 */
				ret = getMstackOffsetDeCast(codeList);
				break;

			case eof : /* 1 */
			case err : /* 2 */
			case space : /* 3 */
			case Lparen : /* 13 */
			case Rparen : /* 14 */
			case Rbrac : /* 16 */
			case Rbrak : /* 30 */
			case Lbrak : /* 29 */
			case Comma : /* 38 */
				ret = 0; /* Never Called */
				break;

		}

		return (ret);
	}

	/**
	* Returns the Mstack offset used by a blossom operation.
	*/
	public static final int getMstackOffsetDeCastBlossom(HighLevelList codeList) {
		HighLevelList tmp = new HighLevelList();
		codeList.copyDataPlusPtrInfo(tmp);
		Lexeme node = (Lexeme) (tmp.getNode());
		ObjObj obj = (ObjObj) (node.getMetaPtr());
		int[] vi = (int[]) (obj.value);
		int numBi = vi[0];
		int numStep = vi[1];
		int ret = 1 - numBi - numStep;
		return (ret);
	}

	/**
	* Returns the Mstack offset used by a DeCast operation.
	*/
	public static final int getMstackOffsetDeCast(HighLevelList codeList) {
		HighLevelList tmp = new HighLevelList();
		codeList.copyDataPlusPtrInfo(tmp);
		Lexeme node = (Lexeme) (tmp.getNode());
		ObjObj obj = (ObjObj) (node.getMetaPtr());
		int[] vi = (int[]) (obj.value);
		int numBi = vi[0];
		int ret = -numBi;
		return (ret);
	}

	/**
	Performs a bracket operation on the stack arguments.
	<P>
	<B>In:</B> Stacks mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> mStack holds at least two values.
		The second argument really should be a scalar integer.<BR>
	<B>Post:</B>  The arguments will be popped from the stack, then the result
		will be pushed onto it.<BR>
	@author Thorn Green
	*/
	public final void lbrac(Lexeme lexm, Mstack mStack, Staque oStack) {
		int SwCase;
		Mvec AVec = mStack.pop();

		SwCase = lexm.getPlugMatch();

		if ((SwCase & 1) != 0) {
			temp.setBasis(AVec.getBasis());
		}
		else
			temp.setBasis(0.0);

		if ((SwCase & 2) != 0) {
			temp.setBasis1(AVec.getBasis1());
		}
		else
			temp.setBasis1(0.0);

		if ((SwCase & 4) != 0) {
			temp.setBasis2(AVec.getBasis2());
		}
		else
			temp.setBasis2(0.0);

		if ((SwCase & 8) != 0) {
			temp.setBasis12(AVec.getBasis12());
		}
		else
			temp.setBasis12(0.0);

		mStack.push(temp);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastLeft(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];

		Mvec phi;

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		phi = mStack.pop();

		phi.deCastLeft(NumStep, NumBi - 1, MyBi, phi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastRight(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];

		Mvec phi;

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		phi = mStack.pop();

		phi.deCastRight(NumStep, NumBi - 1, MyBi, phi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastBlossomLeft(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];
		Mvec paramhi[];

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramhi = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		for (count = 0; count < NumStep; ++count) {
			Mvec MyM = mStack.pop();
			paramhi[count] = MyM;
		}

		Mvec.deCastBlossomLeft(NumStep, NumBi - 1, MyBi, paramhi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastBlossomRight(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];
		Mvec paramhi[];

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramhi = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		for (count = 0; count < NumStep; ++count) {
			Mvec MyM = mStack.pop();
			paramhi[count] = MyM;
		}

		Mvec.deCastBlossomRight(NumStep, NumBi - 1, MyBi, paramhi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastBlossomLeftComp(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];
		Mvec paramlo[];
		Mvec paramhi[];

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramlo = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramhi = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		for (count = 0; count < NumStep; ++count) {
			Mvec MyM = mStack.pop();
			paramhi[count] = MyM;
			Mvec MyLo = paramlo[count];

			if (vl[count + 3] != 0)
				MyLo.setBasis(- (MyM.getBasis()));
			else
				MyLo.setBasis(1.0 - MyM.getBasis());

			MyLo.setBasis1(MyM.getBasis1());
			MyLo.setBasis2(MyM.getBasis2());
			MyLo.setBasis12(MyM.getBasis12());
		}

		Mvec.deCastBlossomLeftComp(NumStep, NumBi - 1, MyBi, paramlo, paramhi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	Performs a De Casteljau operation on the stack arguments.
	<P>
	<B>In:</B> Stack mStack, oStack.<BR>
	<B>Out:</B> Stacks modified.<BR>
	<B>Pre:</B> Stacks are properly formatted.  Both stacks hold multiple values.<BR>
	<B>Post:</B>  The arguments will be popped from the stacks, then the result
		will be pushed onto the mStack.<BR>
	@author Thorn Green
	*/
	public final void deCastBlossomRightComp(Lexeme lex, Mstack mStack, Staque oStack) {
		ObjObj tp = (ObjObj) (lex.getMetaPtr());
		int[] vl = (int[]) (tp.value);
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		Mvec MyBi[];
		Mvec MyTmp[];
		Mvec MyResult[];
		Mvec paramlo[];
		Mvec paramhi[];

		MyBi = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyTmp = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		MyResult = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramlo = (Mvec[]) (((ObjObj) (oStack.pop())).value);
		paramhi = (Mvec[]) (((ObjObj) (oStack.pop())).value);

		for (count = 0; count < NumBi; ++count) {
			MyBi[count] = mStack.pop();
		}

		for (count = 0; count < NumStep; ++count) {
			Mvec MyM = mStack.pop();
			paramhi[count] = MyM;
			Mvec MyLo = paramlo[count];

			if (vl[count + 3] != 0)
				MyLo.setBasis(- (MyM.getBasis()));
			else
				MyLo.setBasis(1.0 - MyM.getBasis());

			MyLo.setBasis1(MyM.getBasis1());
			MyLo.setBasis2(MyM.getBasis2());
			MyLo.setBasis12(MyM.getBasis12());
		}

		Mvec.deCastBlossomRightComp(NumStep, NumBi - 1, MyBi, paramlo, paramhi, MyTmp, MyResult);

		mStack.push(MyResult[MyIndex]);
	};

	/**
	* Temporary multivector shared between multiple methods.
	*/
	private final Mvec temp = new Mvec();
	/**
	* Temporary multivector shared between multiple methods.
	*/
	private final Mvec temp2 = new Mvec();
};
