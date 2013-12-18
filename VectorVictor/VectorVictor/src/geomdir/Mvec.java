



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

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
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
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Added methods to improve performance.
*    | 08/07/2004            | Thorn Green (viridian_1138@yahoo.com)           | Establish baseline for all changes in the last year.                 | Establish baseline for all changes in the last year.
*    | 03/21/2005            | Thorn Green (viridian_1138@yahoo.com)           | Improve Performance                                                  | Added final keyword to parameters and variables.
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

/* Known object common law violator */

/**
* A 2-D Geometric Algebra multivector.
* @author Thorn Green
*/
public class Mvec extends Meta implements Externalizable {
	/**
	* Copies the entire contents of the multivector.
	*/
	public final void mcpy(final Mvec out) {
		out.setBasis(ba);
		out.setBasis1(ba1);
		out.setBasis2(ba2);
		out.setBasis12(ba12);
	};
	public Meta copyNode() {
		final Mvec temp = new Mvec();
		mcpy(temp);
		return (temp);
	};
	public Meta copySub() {
		final Mvec temp = new Mvec();
		mcpy(temp);
		return (temp);
	};
	public Meta copyAll() {
		final Mvec temp = new Mvec();
		mcpy(temp);
		return (temp);
	};
	public void copyNodeInfo(final Meta in) {
		final Mvec temp = (Mvec) in;
		mcpy(temp);
	};
	public void copySubInfo(final Meta in) {
		final Mvec temp = (Mvec) in;
		mcpy(temp);
	};
	public void copyAllInfo(final Meta in) {
		final Mvec temp = (Mvec) in;
		mcpy(temp);
	};
	public void eraseNode() {};
	public void eraseSub() {};
	public void eraseAll() {};
	public void wake() {};
	/**
	* Adds the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void add(final Mvec in, final Mvec out) {
		out.ba = ba + in.ba;
		out.ba1 = ba1 + in.ba1;
		out.ba2 = ba2 + in.ba2;
		out.ba12 = ba12 + in.ba12;
	};
	/**
	* Adds vector component of the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void vadd(final Mvec in, final Mvec out) {
		out.ba1 = ba1 + in.ba1;
		out.ba2 = ba2 + in.ba2;
	};
	/**
	* Adds vector component of the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.  Unlike vadd, this version also zeroes the other output components.
	*/
	public final void vaddz(final Mvec in, final Mvec out) {
		out.ba = 0.0;
		out.ba1 = ba1 + in.ba1;
		out.ba2 = ba2 + in.ba2;
		out.ba12 = 0.0;
	};
	/**
	* Subtracts <code>in<code> from the multivector.  Places the result in
	* <code>out</code>.
	*/
	public final void sub(final Mvec in, final Mvec out) {
		out.ba = ba - in.ba;
		out.ba1 = ba1 - in.ba1;
		out.ba2 = ba2 - in.ba2;
		out.ba12 = ba12 - in.ba12;
	};
	/**
	* Subtracts the vector component of <code>in<code> from the multivector.  Places the result in
	* <code>out</code>.
	*/
	public final void vsub(final Mvec in, final Mvec out) {
		out.ba1 = ba1 - in.ba1;
		out.ba2 = ba2 - in.ba2;
	};
	/**
	* Subtracts the vector component of <code>in<code> from the multivector.  Places the result in
	* <code>out</code>.  Unlike vsub, this version also zeroes the other output components.
	*/
	public final void vsubz(final Mvec in, final Mvec out) {
		out.ba = 0.0;
		out.ba1 = ba1 - in.ba1;
		out.ba2 = ba2 - in.ba2;
		out.ba12 = 0.0;
	};
	/**
	* Multiplies the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void mult(final Mvec in, final Mvec out) {
		out.ba = ba * in.ba + ba1 * in.ba1 + ba2 * in.ba2 - ba12 * in.ba12;
		out.ba1 = ba * in.ba1 + ba1 * in.ba - ba2 * in.ba12 + ba12 * in.ba2;
		out.ba2 = ba * in.ba2 + ba1 * in.ba12 + ba2 * in.ba - ba12 * in.ba1;
		out.ba12 = ba * in.ba12 + ba1 * in.ba2 - ba2 * in.ba1 + ba12 * in.ba;
	};
	/**
	* Divides the multivector by <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void divide(final Mvec inv, final Mvec out) {
		final double Denom = inv.ba * inv.ba - inv.ba1 * inv.ba1 - inv.ba2 * inv.ba2 + inv.ba12 * inv.ba12;

		final double i_ba = inv.ba / Denom;
		final double i_ba1 = -inv.ba1 / Denom;
		final double i_ba2 = -inv.ba2 / Denom;
		final double i_ba12 = -inv.ba12 / Denom;

		out.ba = ba * i_ba + ba1 * i_ba1 + ba2 * i_ba2 - ba12 * i_ba12;
		out.ba1 = ba * i_ba1 + ba1 * i_ba - ba2 * i_ba12 + ba12 * i_ba2;
		out.ba2 = ba * i_ba2 + ba1 * i_ba12 + ba2 * i_ba - ba12 * i_ba1;
		out.ba12 = ba * i_ba12 + ba1 * i_ba2 - ba2 * i_ba1 + ba12 * i_ba;
	};
	/**
	* Dot-products the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void dot(final Mvec in, final Mvec out) {
		out.ba = ba1 * in.ba1 + ba2 * in.ba2 - ba12 * in.ba12;
		out.ba1 = -ba2 * in.ba12 + ba12 * in.ba2;
		out.ba2 = ba1 * in.ba12 - ba12 * in.ba1;
		out.ba12 = 0.0;
	};
	/**
	* Wedge-products the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void wedge(final Mvec in, final Mvec out) {
		out.ba = ba * in.ba;
		out.ba1 = ba * in.ba1 + ba1 * in.ba;
		out.ba2 = ba * in.ba2 + ba2 * in.ba;
		out.ba12 = ba * in.ba12 + ba1 * in.ba2 - ba2 * in.ba1 + ba12 * in.ba;
	};
	/**
	* Cross-products the multivector with <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void cross(final Mvec in, final Mvec out) {
		out.ba = ba * in.ba12 + ba1 * in.ba2 - ba2 * in.ba1 + ba12 * in.ba;
		out.ba1 = ba * in.ba2 + ba2 * in.ba;
		out.ba2 = -ba * in.ba1 - ba1 * in.ba;
		out.ba12 = -ba * in.ba;
	};
	/**
	* Scales the multivector by <code>in<code>.  Places the result in
	* <code>out</code>.
	*/
	public final void scale(final double in, final Mvec out) {
		out.ba = ba * in;
		out.ba1 = ba1 * in;
		out.ba2 = ba2 * in;
		out.ba12 = ba12 * in;
	};
	/**
	* Converts the vector to a phasor.
	*/
	public final void phasToVect(final Mvec out) {
		out.ba = ba1;
		out.ba1 = ba;
		out.ba2 = ba12;
		out.ba12 = ba2;
	}
	/**
	* Converts the phasor to a vector.
	*/
	public final void vectToPhas(final Mvec out) {
		phasToVect(out);
	};
	/**
	* Negates the multivector.
	*/
	public final void minus() {
		ba = -ba;
		ba1 = -ba1;
		ba2 = -ba2;
		ba12 = -ba12;
	};
	/**
	* Takes the reverse of the multivector.
	*/
	public final void reverse() {
		ba12 = -ba12;
	};
	/**
	* Takes the magnitude of the multivector.
	*/
	public final void magnitude() {
		final double magsq = ba * ba + ba1 * ba1 + ba2 * ba2 + ba12 * ba12;
		ba1 = 0;
		ba2 = 0;
		ba12 = 0;
		ba = Math.sqrt(magsq);
	};
	/**
	* Sets the multivector to unity.
	*/
	public final void unity() {
		ba = 1;
		ba1 = 0;
		ba2 = 0;
		ba12 = 0;
	};
	/**
	* Places the exponential of the multivector in <code>out</code>.
	*/
	public final void exp(final Mvec out) {
		final Mvec answer = new Mvec();
		final Mvec strtv = new Mvec();
		final Mvec temp = new Mvec();
		final double ex = Math.exp(ba);

		mcpy(strtv);
		strtv.ba = 0;
		strtv.dot(strtv, temp);
		final double k = temp.ba;
		final double fk = Math.abs(k);

		if (fk < 0.000001) {
			strtv.mcpy(answer);
			answer.ba += 1;
		}
		else {
			final Mvec unitv = new Mvec();
			final double Val = Math.sqrt(fk);
			final double TempV = 1 / Val;
			strtv.scale(TempV, unitv);

			if (k < 0.0) {
				final double TempV2 = Math.sin(Val);
				unitv.scale(TempV2, answer);
				answer.ba += Math.cos(Val);
			}
			else {
				final double TempV3 = sinh(Val);
				unitv.scale(TempV3, answer);
				answer.ba += Math.cos(Val);
			}
		}

		answer.scale(ex, out);
	};

	/**
	* Places the logarithm of the multivector in <code>out</code>.
	*/
	public final void ln(final Mvec out) {
		final double ba = getBasis();
		final double ba1 = getBasis1();
		final double ba2 = getBasis2();
		final double ba12 = getBasis12();
		final double Switch = ba1 * ba1 + ba2 * ba2 - ba12 * ba12;
		if (Switch < -0.000001) {
			final double Beta = Math.sqrt(-Switch);
			final double BetaSq = -Switch;
			final double val = Math.log(Math.sqrt(ba * ba + BetaSq));
			final double TanMag = Math.atan2(Beta, ba) / Beta;
			final double val1 = ba1 * TanMag;
			final double val2 = ba2 * TanMag;
			final double val12 = ba12 * TanMag;
			out.setBasis(val);
			out.setBasis1(val1);
			out.setBasis2(val2);
			out.setBasis12(val12);
		}
		else if (Switch > 0.000001) {
			final double SwSqr = Math.sqrt(Switch);
			double val = 0.0;
			double val12 = 0.0;
			final double LogIn1 = ba * ba - Switch;
			final double sqrt1 = Math.sqrt(Math.abs(LogIn1));
			val += Math.log(sqrt1);
			if (LogIn1 < -0.000001) {
				val12 += Math.PI / 2.0;
			}

			final Mvec logsc = new Mvec();
			final double LogArg2 = (ba + SwSqr) / (ba - SwSqr);
			logsc.setBasis(Math.log(Math.abs(LogArg2)) / SwSqr);
			if (LogArg2 < -0.000001) {
				logsc.setBasis12(Math.PI / SwSqr);
			}

			final Mvec noscal = new Mvec();
			noscal.setBasis1(ba1);
			noscal.setBasis2(ba2);
			noscal.setBasis12(ba12);
			logsc.mult(noscal, out);
			out.setBasis(out.getBasis() + val);
			out.setBasis12(out.getBasis12() + val12);
		}
		else {
			out.setBasis(Math.log(Math.abs(ba)));
			out.setBasis1(ba1 / ba);
			out.setBasis2(ba2 / ba);
			out.setBasis12(ba12 / ba);
			if (ba < -0.0000001)
				out.setBasis12(out.getBasis12() + Math.PI);
		}
	};

	/**
	* Places the sine of the multivector in <code>out</code>.
	*/
	public final void sin(final Mvec out) {
		final Mvec Scl1 = new Mvec();
		final Mvec Scl2 = new Mvec();
		final Mvec VecSin = new Mvec();
		final Mvec VecCos = new Mvec();
		final double FltSin = Math.sin(ba);
		final double FltCos = Math.cos(ba);

		sinComp(VecSin, VecCos);
		VecSin.scale(FltCos, Scl1);
		VecCos.scale(FltSin, Scl2);
		Scl1.add(Scl2, out);
	};

	/**
	* Places the cosine of the multivector in <code>out</code>.
	*/
	public final void cos(final Mvec out) {
		final Mvec Scl1 = new Mvec();
		final Mvec Scl2 = new Mvec();
		final Mvec VecSin = new Mvec();
		final Mvec VecCos = new Mvec();
		final double FltSin = Math.sin(ba);
		final double FltCos = Math.cos(ba);

		sinComp(VecSin, VecCos);
		VecCos.scale(FltCos, Scl1);
		VecSin.scale(FltSin, Scl2);
		Scl1.sub(Scl2, out);
	};

	/**
	* Places the sinh of the multivector in <code>out</code>.
	*/
	public final void sinh(final Mvec out) {
		final Mvec posexp = new Mvec();
		final Mvec negvec = new Mvec();
		final Mvec negexp = new Mvec();
		final Mvec sum = new Mvec();
		final double multiplier = 0.5;

		exp(posexp);
		mcpy(negvec);
		negvec.minus();
		negvec.exp(negexp);
		posexp.sub(negexp, sum);
		sum.scale(multiplier, out);
	};

	/**
	* Places the cosh of the multivector in <code>out</code>.
	*/
	public final void cosh(final Mvec out) {
		final Mvec posexp = new Mvec();
		final Mvec negvec = new Mvec();
		final Mvec negexp = new Mvec();
		final Mvec sum = new Mvec();
		final double multiplier = 0.5;

		exp(posexp);
		mcpy(negvec);
		negvec.minus();
		negvec.exp(negexp);
		posexp.add(negexp, sum);
		sum.scale(multiplier, out);
	};

	/**
	* Calculates the inverse of the multivector.
	*/
	public final void inverse() {
		final double Denom = ba * ba - ba1 * ba1 - ba2 * ba2 + ba12 * ba12;

		ba = ba / Denom;
		ba1 = -ba1 / Denom;
		ba2 = -ba2 / Denom;
		ba12 = -ba12 / Denom;
	};

	/**
	* Calculates the unit of the multivector.
	*/
	public final void unitOf() {
		final double magsq = ba * ba + ba1 * ba1 + ba2 * ba2 + ba12 * ba12;
		final double InVal = Math.sqrt(magsq);
		double OutVal;
		if (InVal > 0.0001)
			OutVal = 1.0 / InVal;
		else
			OutVal = 0.0001;

		ba = ba * OutVal;
		ba1 = ba1 * OutVal;
		ba2 = ba2 * OutVal;
		ba12 = ba12 * OutVal;
	}

	/**
	* Sets the multivector to Pi.
	*/
	public final void setToPi() {
		ba = Math.PI;
		ba1 = 0.0;
		ba2 = 0.0;
		ba12 = 0.0;
	}

	/**
	* Sets the multivector to Basis12.
	*/
	public final void setToBasis12() {
		ba = 0.0;
		ba1 = 0.0;
		ba2 = 0.0;
		ba12 = 1.0;
	}

	/**
	* Sets the multivector to Basis1.
	*/
	public final void setToBasis1() {
		ba = 0.0;
		ba1 = 1.0;
		ba2 = 0.0;
		ba12 = 0.0;
	}

	/**
	* Sets the multivector to Basis2.
	*/
	public final void setToBasis2() {
		ba = 0.0;
		ba1 = 0.0;
		ba2 = 1.0;
		ba12 = 0.0;
	}

	/**
	* Calculates the Blossom algorithm multiplying the parameter on the left with multiple
	* sets of parameters so that a derivative can be calculated from the systolic array.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public static void deCastBlossomLeftComp(
		final int steps,
		final int pow,
		final Mvec bi[],
		final Mvec paramlo[],
		final Mvec paramhi[],
		final Mvec temp[],
		final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		Mvec plo = null;
		Mvec phi = null;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			plo = paramlo[0];
			phi = paramhi[0];

			for (count2 = 0; count2 < pow; ++count2) {
				plo.mult(bi[count2], t1);
				phi.mult(bi[count2 + 1], t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			plo = paramlo[count1];
			phi = paramhi[count1];

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				plo.mult(mytmp[count2], t1);
				phi.mult(mytmp[count2 + 1], t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Calculates the Blossom algorithm multiplying the parameter on the right with multiple
	* sets of parameters so that a derivative can be calculated from the systolic array.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public static void deCastBlossomRightComp(
		final int steps,
		final int pow,
		final Mvec bi[],
		final Mvec paramlo[],
		final Mvec paramhi[],
		final Mvec temp[],
		final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		Mvec plo = null;
		Mvec phi = null;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			plo = paramlo[0];
			phi = paramhi[0];

			for (count2 = 0; count2 < pow; ++count2) {
				(bi[count2]).mult(plo, t1);
				(bi[count2 + 1]).mult(phi, t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			plo = paramlo[count1];
			phi = paramhi[count1];

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				(mytmp[count2]).mult(plo, t1);
				(mytmp[count2 + 1]).mult(phi, t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Calculates the Blossom algorithm multiplying the parameter on the left.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public static void deCastBlossomLeft(final int steps, final int pow, final Mvec bi[], final Mvec paramhi[], final Mvec temp[], final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();
		final Mvec plo = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		Mvec phi = null;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			phi = paramhi[0];
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < pow; ++count2) {
				plo.mult(bi[count2], t1);
				phi.mult(bi[count2 + 1], t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			phi = paramhi[count1];
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				plo.mult(mytmp[count2], t1);
				phi.mult(mytmp[count2 + 1], t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Calculates the Blossom algorithm multiplying the parameter on the right.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public static void deCastBlossomRight(final int steps, final int pow, final Mvec bi[], final Mvec paramhi[], final Mvec temp[], final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();
		final Mvec plo = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		Mvec phi = null;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			phi = paramhi[0];
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < pow; ++count2) {
				(bi[count2]).mult(plo, t1);
				(bi[count2 + 1]).mult(phi, t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			phi = paramhi[count1];
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				(mytmp[count2]).mult(plo, t1);
				(mytmp[count2 + 1]).mult(phi, t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Calculates the De-Cast algorithm multiplying the parameter on the left.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public final void deCastLeft(final int steps, final int pow, final Mvec bi[], final Mvec phi, final Mvec temp[], final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();
		final Mvec plo = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < pow; ++count2) {
				plo.mult(bi[count2], t1);
				phi.mult(bi[count2 + 1], t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				plo.mult(mytmp[count2], t1);
				phi.mult(mytmp[count2 + 1], t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Calculates the De-Cast algorithm multiplying the parameter on the right.  The side
	* of the parameter is important only if the parameter does not commute with what it's
	* being multiplied by.
	*/
	public final void deCastRight(final int steps, final int pow, final Mvec bi[], final Mvec phi, final Mvec temp[], final Mvec result[]) {
		Mvec myres[] = result;
		Mvec mytmp[] = temp;
		Mvec swp[] = null;
		final int NumBi = pow + 1;

		final Mvec t1 = new Mvec();
		final Mvec t2 = new Mvec();
		final Mvec plo = new Mvec();

		if ((steps % 2) == 1) {
			myres = temp;
			mytmp = result;
		}

		int count1;
		int count2;
		if (steps == 0) {
			for (count2 = 0; count2 < NumBi; count2++) {
				(bi[count2]).copyAllInfo(result[count2]);
			}
		}
		else {
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < pow; ++count2) {
				(bi[count2]).mult(plo, t1);
				(bi[count2 + 1]).mult(phi, t2);
				t1.add(t2, mytmp[count2]);
			}
		}

		for (count1 = 1; count1 < steps; ++count1) {
			phi.mcpy(plo);
			plo.setBasis(1.0 - plo.getBasis());

			for (count2 = 0; count2 < (pow - count1); ++count2) {
				(mytmp[count2]).mult(plo, t1);
				(mytmp[count2 + 1]).mult(phi, t2);
				t1.add(t2, myres[count2]);
			}

			swp = myres;
			myres = mytmp;
			mytmp = swp;
		}

	}

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			ba = myv.getDouble("Basis");
			ba1 = myv.getDouble("Basis1");
			ba2 = myv.getDouble("Basis2");
			ba12 = myv.getDouble("Basis12");
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

		myv.setDouble("Basis", ba);
		myv.setDouble("Basis1", ba1);
		myv.setDouble("Basis2", ba2);
		myv.setDouble("Basis12", ba12);

		out.writeObject(myv);
	}

	/**
	* Gets the scalar basis of the multivector.
	*/
	public final double getBasis() {
		return (ba);
	};
	/**
	* Gets the "sigma one" vector basis of the multivector.
	*/
	public final double getBasis1() {
		return (ba1);
	};
	/**
	* Gets the "sigma two" vector basis of the multivector.
	*/
	public final double getBasis2() {
		return (ba2);
	};
	/**
	* Gets the imaginary basis of the multivector.
	*/
	public final double getBasis12() {
		return (ba12);
	};
	/**
	* Sets the scalar basis of the multivector.
	*/
	public final void setBasis(final double in) {
		ba = in;
	};
	/**
	* Sets the "sigma one" vector basis of the multivector.
	*/
	public final void setBasis1(final double in) {
		ba1 = in;
	};
	/**
	* Sets the "sigma two" vector basis of the multivector.
	*/
	public final void setBasis2(final double in) {
		ba2 = in;
	};
	/**
	* Sets the imaginary basis of the multivector.
	*/
	public final void setBasis12(final double in) {
		ba12 = in;
	};
	public Mvec() {
		ba = 0;
		ba1 = 0;
		ba2 = 0;
		ba12 = 0;
	};
	private final void sinComp(final Mvec answer1, final Mvec answer2) {
		final Mvec strtv = new Mvec();
		final Mvec temp = new Mvec();

		mcpy(strtv);
		strtv.ba = 0;
		strtv.dot(strtv, temp);
		final double k = temp.ba;
		final double fk = Math.abs(k);

		if (fk < 0.000001) {
			strtv.mcpy(answer1);
			answer2.unity();
		}
		else {
			final Mvec unitv = new Mvec();
			final double Val = Math.sqrt(fk);
			final double TempV = 1 / Val;
			strtv.scale(TempV, unitv);

			if (k >= 0.0) {
				final double TempV2 = Math.sin(Val);
				unitv.scale(TempV2, answer1);
				answer2.unity();
				answer2.ba = Math.cos(Val);
			}
			else {
				final double TempV3 = sinh(Val);
				unitv.scale(TempV3, answer1);
				answer2.unity();
				answer2.ba = cosh(Val);
			}
		}

	};

	private final double cosh(final double in) {
		return (Math.exp(in) + Math.exp(-in));
	};
	private final double sinh(final double in) {
		return (Math.exp(in) - Math.exp(-in));
	};
	private double ba;
	private double ba1;
	private double ba2;
	private double ba12;
};
