


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



package geomdir.solvers;

import geomdir.engine.EngineConstants;

import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

import meta.HighLevelList;
import meta.Meta;
import meta.Staque;
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
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Created clean-compile (but not working) version of experimental solver (StatSolver).
*    | 10/17/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Fixed several problems with StatSolver.
*    | 10/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Fixed several problems with StatSolver.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Created StatSolverBase from StatSolver.
*    | 10/29/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Changed minimization in StatSolver.
*    | 11/05/2002            | Thorn Green (viridian_1138@yahoo.com)           | Improve constraint solving.                                          | Changed minimization in StatSolver.
*    | 04/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | StatSolver struggles with vague states.                              | Added failedMethodology mode to compensate.
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
* Experimental constraint solver.
*/
public abstract class StatSolverBase extends Object {

	class ContextNode extends Meta {
		public void wake() {}

		private boolean useGuess;
		private double[] initialIntervalStart = null;
		private double[] InitialIntervalEnd = null;
		private Staque subdivStk = null;
		private SegNode lastOuterSegNode = null;
		private SegNode lastInnerSegNode = null;

		/**
		 * @return
		 */
		public boolean isUseGuess() {
			return useGuess;
		}

		/**
		 * @param b
		 */
		public void setUseGuess(final boolean b) {
			useGuess = b;
		}

		/**
		 * @return
		 */
		public double[] getInitialIntervalEnd() {
			return InitialIntervalEnd;
		}

		/**
		 * @return
		 */
		public double[] getInitialIntervalStart() {
			return initialIntervalStart;
		}

		/**
		 * @return
		 */
		public SegNode getLastInnerSegNode() {
			return lastInnerSegNode;
		}

		/**
		 * @return
		 */
		public SegNode getLastOuterSegNode() {
			return lastOuterSegNode;
		}

		/**
		 * @param ds
		 */
		public void setInitialIntervalEnd(final double[] ds) {
			InitialIntervalEnd = ds;
		}

		/**
		 * @param ds
		 */
		public void setInitialIntervalStart(final double[] ds) {
			initialIntervalStart = ds;
		}

		/**
		 * @param node
		 */
		public void setLastInnerSegNode(final SegNode node) {
			lastInnerSegNode = node;
		}

		/**
		 * @param node
		 */
		public void setLastOuterSegNode(final SegNode node) {
			lastOuterSegNode = node;
		}

		/**
		 * @return
		 */
		public Staque getSubdivStk() {
			return subdivStk;
		}

		/**
		 * @param staque
		 */
		public void setSubdivStk(final Staque staque) {
			subdivStk = staque;
		}

	}

	class PtNode extends Meta {

		public void wake() {}

		public double[] getX() {
			return (x);
		}
		public double[] getY() {
			return (y);
		}
		public double[] getMin() {
			return (minval);
		}
		public void setX(final double[] in) {
			x = in;
		}
		public void setY(final double[] in) {
			y = in;
		}
		public void setMin(final double[] in) {
			minval = in;
		}

		public double getCompY(final int in) {
			double val = 0.0;

			if (in < numEntSystemEqn)
				val = y[in];
			else
				val = minval[in - numEntSystemEqn];

			return (val);
		}

		private double[] x = null;
		private double[] y = null;
		private double[] minval = null;
	}

	public class SegNode extends Meta {
		public SegNode(final int numEqn, final int numEntVars) {
			int max = numEqn * VAR_MULT + (MINIMIZING_OUTPUT_P2 - FINDING_SOLUTION);
			total = new double[max];
			maxPoint = new PtNode[max];
			minPoint = new PtNode[max];
			maxAbsPoint = new PtNode[max];
			minAbsPoint = new PtNode[max];
		}

		public double getParamDelta() {
			if (!intervalDirty)
				return (intervalCalcVal);

			int count;
			double ret = 0.0;
			for (count = 0; count < numEntVars; count++) {
				double tmp = Math.abs(intervalEnd[count] - intervalStart[count]) / (epsilon[count]);
				if (tmp > ret)
					ret = tmp;
			}

			intervalCalcVal = ret;
			intervalDirty = false;
			return (ret);
		}

		public void wake() {}

		public double getTotal(final int idex) {
			return (total[idex]);
		}
		public void setTotal(final double in, final int idex) {
			total[idex] = in;
		}
		public int getNumElements() {
			return (numElements);
		}
		public void setNumElements(final int in) {
			numElements = in;
		}
		public double[] getIntervalStart() {
			return (intervalStart);
		}
		public void setIntervalStart(final double[] in) {
			intervalStart = in;
			intervalDirty = true;
		}
		public double[] getIntervalEnd() {
			return (intervalEnd);
		}
		public void setIntervalEnd(final double[] in) {
			intervalEnd = in;
			intervalDirty = true;
		}
		public HighLevelList getPtList() {
			return (ptList);
		}
		public PtNode getMaxPoint(final int idex) {
			return (maxPoint[idex]);
		}
		public void setMaxPoint(final PtNode in, final int idex) {
			maxPoint[idex] = in;
		}
		public PtNode getMinPoint(final int idex) {
			return (minPoint[idex]);
		}
		public void setMinPoint(final PtNode in, final int idex) {
			minPoint[idex] = in;
		}
		public PtNode getMaxAbsPoint(final int idex) {
			return (maxAbsPoint[idex]);
		}
		public void setMaxAbsPoint(final PtNode in, final int idex) {
			maxAbsPoint[idex] = in;
		}
		public PtNode getMinAbsPoint(final int idex) {
			return (minAbsPoint[idex]);
		}
		public void setMinAbsPoint(final PtNode in, final int idex) {
			minAbsPoint[idex] = in;
		}
		public PtNode getClosePoint() {
			return (closePoint);
		}
		public void setClosePoint(final PtNode in) {
			closePoint = in;
		}
		public PtNode getFarPoint() {
			return (farPoint);
		}
		public void setFarPoint(final PtNode in) {
			farPoint = in;
		}

		public SegNode getPrevBottomUpNode() {
			return (prevBottomUpNode);
		}
		public int getPrevBottomUpIndex() {
			return (prevBottomUpIndex);
		}
		public boolean getPrevBottomUpUsedGreater() {
			return (prevBottomUpUsedGreater);
		}
		public void setPrevBottomUpNode(final SegNode in) {
			prevBottomUpNode = in;
		}
		public void setPrevBottomUpIndex(final int in) {
			prevBottomUpIndex = in;
		}
		public void setPrevBottomUpUsedGreater(final boolean in) {
			prevBottomUpUsedGreater = in;
		}

		public double tmpDebugDiffValue = 0.0;

		private PtNode farPoint = null;
		private PtNode closePoint = null;
		private PtNode[] maxPoint = null;
		private PtNode[] minPoint = null;
		private PtNode[] maxAbsPoint = null;
		private PtNode[] minAbsPoint = null;
		private double[] total = null;
		private int numElements = 0;
		private double[] intervalStart = null;
		private double[] intervalEnd = null;
		private final HighLevelList ptList = new HighLevelList();

		private SegNode prevBottomUpNode = null;
		private int prevBottomUpIndex = 0;
		private boolean prevBottomUpUsedGreater = false;

		private boolean intervalDirty = true;
		private double intervalCalcVal = 0.0;
	}

	static final int MIN_POINTS = 4;
	static final double RESDBL = 1e-9;
	public static final int VAR_MULT = 4;
	
	protected final Random rand = new Random( 555 );

	protected int numEqn = 0;
	protected int numIneq = 0;
	protected int numEntVars = 0;

	/* Output vars. */

	private InternalVirtualArray commonY = null;

	private double[] sampMean = null;
	private double[] lowDeviation = null;
	private double[] highDeviation = null;
	private double[] highAbsDeviation = null;
	private double[] lowAbsDeviation = null;

	private double[] epsilon = null;
	private double[] initialIntervalStart = null;
	private double[] initialIntervalEnd = null;

	private boolean useGuess = true;
	private double[] guessIntervalStart = null;
	private double[] guessIntervalEnd = null;

	private double[] minimizationValues = null;
	private int[] minimizationDefines = null;
	private SegNode bestSeg = null;
	private boolean initialTest = true;

	private double[] mminlist = null;
	private double[] mmaxlist = null;
	private int mminlistlen = 0;

	public static final int FINDING_SOLUTION = EngineConstants.IO_DEF_OBJECTIVE - 1;
	public static final int MINIMIZING_OBJECTIVE = EngineConstants.IO_DEF_OBJECTIVE;
	public static final int MINIMIZING_OUTPUT_P1 = EngineConstants.IO_DEF_OUTPUT_P1;
	public static final int MINIMIZING_OUTPUT_P2 = EngineConstants.IO_DEF_OUTPUT_P2;

	static int minimizerMode = FINDING_SOLUTION;

	private SegNode lastOuterSegNode = null;
	private SegNode lastInnerSegNode = null;

	int numEntEqn = numEqn * VAR_MULT;
	int numEntIneq = numIneq * VAR_MULT;

	private int numSystemEqn = 0;
	private int numEntSystemEqn = 0;
	private int numMaxEntSystemEqn = 0;
	private int firstCount;
	private int secondCount;
	private double[] firstHiDev = null;
	private double[] firstLoDev = null;
	private double[] secondHiDev = null;
	private double[] secondLoDev = null;

	private Staque aggressiveRejectStack = null;
	private boolean[] aggressiveSearch = null;
	private boolean failedMethodology = false;

	private int subdivCount = 0;
	private int rejectCount = 0;
	private int addedCount = 0;
	private int failedMethodologyCount = 0;
	private int aggressiveStoreCount = 0;

	private static FileOutputStream fout = null;
	private static PrintStream pout = null;
	public static IStatDebug deb = null;

	private File agStoreFile;
	private DataOutputStream agStoreOut = null;
	private DataInputStream agStoreIn = null;

	static {
		try {
			fout = new FileOutputStream(new File("/tmp/fout.txt"));
			pout = new PrintStream(fout);
		}
		catch (Exception ex) {
			ex.printStackTrace(pout);
		}
	}

	private double[] cloneIntervalStart(final SegNode in) {
		double[] ret = new double[numEntVars];
		System.arraycopy(in.getIntervalStart(), 0, ret, 0, numEntVars);
		return (ret);
	}

	private double[] cloneIntervalEnd(final SegNode in) {
		double[] ret = new double[numEntVars];
		System.arraycopy(in.getIntervalEnd(), 0, ret, 0, numEntVars);
		return (ret);
	}

	private void pushToAgStore(final SegNode seg) {
		aggressiveRejectStack.push(seg);
		aggressiveStoreCount++;
		if (aggressiveStoreCount > 250) {
			try {
				if (agStoreOut == null) {
					pout.println("Writing Ag Stream!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					agStoreFile = File.createTempFile("abc", "def");
					agStoreOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(agStoreFile)));
				}

				SegNode sg = (SegNode) (aggressiveRejectStack.deq());

				double[] strt = sg.getIntervalStart();
				double[] end = sg.getIntervalEnd();

				int count;
				for (count = 0; count < numEntVars; count++) {
					agStoreOut.writeDouble(strt[count]);
					agStoreOut.writeDouble(end[count]);
				}

			}
			catch (Exception ex) {
				ex.printStackTrace(pout);
			}
		}
	}

	private SegNode popFromAgStore() {
		SegNode ret = null;
		if (!(aggressiveRejectStack.empty())) {
			ret = (SegNode) (aggressiveRejectStack.pop());
		}
		else {
			try {

				if (agStoreOut != null) {
					pout.println("Reading Stream!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					agStoreOut.close();
					agStoreOut = null;
					agStoreIn = new DataInputStream(new FileInputStream(agStoreFile));
				}

				if (agStoreIn != null) {
					try {
						ret = new SegNode(numSystemEqn, numEntVars);
						double[] strt = new double[numEntVars];
						double[] end = new double[numEntVars];
						ret.setIntervalStart(strt);
						ret.setIntervalEnd(end);

						int count;
						for (count = 0; count < numEntVars; count++) {
							strt[count] = agStoreIn.readDouble();
							end[count] = agStoreIn.readDouble();
						}
					}
					catch (EOFException ex) {
						agStoreIn.close();
						agStoreIn = null;
						pout.println("Got EOF !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
					}
				}

			}
			catch (Exception ex) {
				throw (new WrapRuntimeException("AgFileFailed", ex));
			}
		}

		return (ret);
	}

	/**
	* The linkage object used to evaluate the minimization value.
	*/
	protected StatSolverLinkageBase link;

	public StatSolverBase( final StatSolverLinkageBase in) {
		link = in;
	}

	protected void evalAllMinFun( final double[] X, final InternalVirtualArray Y, final double[] minval) {
		link.evalAllMinFun(X, Y, minval);
	}

	protected void initXAxisArrays(
		final double[] epsilon,
		final double[] intStart,
		final double[] intEnd,
		final double[] guessStart,
	    final double[] guessEnd,
		final int[] minimizationDefines,
		final double[] minimizationValues) {
		link.initXAxisArrays(epsilon, intStart, intEnd, guessStart, guessEnd, minimizationDefines, minimizationValues);
		if( deb != null )
			deb.setMin( minimizationValues );
	}

	public int getNumEntVars() {
		return (numEntVars);
	}
	public void setNumEntVars(final int in) {
		numEntVars = in;
	}
	public int getNumEqn() {
		return (numEqn);
	}
	public void setNumEqn(final int in) {
		numEqn = in;
		numEntEqn = numEqn * VAR_MULT;
	}
	public int getNumIneq() {
		return (numIneq);
	}
	public void setNumIneq(final int in) {
		numIneq = in;
		numEntIneq = numIneq * VAR_MULT;
	}

	double[] tpval = new double[6];
	int xpval = 0;

	//	public void handleTempConsider(SegNode in) { // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//		return;
	//		
	//		tpval[0] = MinimizationValues[0];
	//		tpval[1] = MinimizationValues[1];
	//		tpval[2] = MinimizationValues[4] - MinimizationValues[0];
	//		tpval[3] = MinimizationValues[5] - MinimizationValues[1];
	//		tpval[4] = MinimizationValues[4];
	//		tpval[5] = MinimizationValues[5];
	//
	//		boolean cons = true;
	//
	//		xpval++;
	//
	//		int count2;
	//		for (count2 = 0; count2 < numEntVars; count2++) {
	//			if (tpval[count2] < in.getIntervalStart()[count2])
	//				cons = false;
	//
	//			if (tpval[count2] > in.getIntervalEnd()[count2])
	//				cons = false;
	//		}
	//
	//		if (/* cons */
	//			false /* || ( ( xpval % 10000 ) == 0 ) */
	//			) {
	//			pout.println("Considering ");
	//
	//			for (count2 = 0; count2 < numEntVars; count2++) {
	//				pout.println(
	//					in.getIntervalStart()[count2] + "  " + tpval[count2] + "  " + in.getIntervalEnd()[count2]);
	//			}
	//		}
	//	}

	boolean tmpBadSample = true;

	public void handleTempReject(final SegNode in) {
		tpval[0] = minimizationValues[0];
		tpval[1] = minimizationValues[1];
		tpval[2] = minimizationValues[4] - minimizationValues[0];
		tpval[3] = minimizationValues[5] - minimizationValues[1];
		tpval[4] = minimizationValues[4];
		tpval[5] = minimizationValues[5];

		boolean cons = true;

		int count2;
		for (count2 = 0; count2 < numEntVars; count2++) {
			if (tpval[count2] < in.getIntervalStart()[count2])
				cons = false;

			if (tpval[count2] > in.getIntervalEnd()[count2])
				cons = false;
		}

		if (cons) {
			pout.println("Falsely Rejecting ");

			if (tmpBadSample) {
				pout.println("Bad Sample Outcome!!!!!!!!!!!!!");
			}
			else {
				pout.println("Data Table Over Length!!!!!!!!!");
			}

			for (count2 = 0; count2 < numEntVars; count2++) {
				pout.println(in.getIntervalStart()[count2] + "  " + in.getIntervalEnd()[count2]);
			}
		}
	}

	public void postLinkInitialize(final int numEqn, final VirtualArray varr) {
		setNumEntVars(varr.getSize());
		setNumEqn(numEqn);

		numSystemEqn = numEqn + numIneq;
		numEntSystemEqn = numEntEqn + numEntIneq;
		numMaxEntSystemEqn = numEntSystemEqn + (MINIMIZING_OUTPUT_P2 - FINDING_SOLUTION);

		sampMean = new double[numMaxEntSystemEqn];
		lowDeviation = new double[numMaxEntSystemEqn];
		highDeviation = new double[numMaxEntSystemEqn];
		lowAbsDeviation = new double[numMaxEntSystemEqn];
		highAbsDeviation = new double[numMaxEntSystemEqn];
		firstHiDev = new double[numMaxEntSystemEqn];
		firstLoDev = new double[numMaxEntSystemEqn];
		secondHiDev = new double[numMaxEntSystemEqn];
		secondLoDev = new double[numMaxEntSystemEqn];

		int numXvals = varr.getSize();
		epsilon = new double[numXvals];
		initialIntervalStart = new double[numXvals];
		initialIntervalEnd = new double[numXvals];
		guessIntervalStart = new double[numXvals];
		guessIntervalEnd = new double[numXvals];
		minimizationDefines = new int[numXvals];
		minimizationValues = new double[numXvals];
		commonY = new InternalVirtualArray(numSystemEqn);
	}

	public void initialize(final int numEqn, final VirtualArray varr) {
		mminlist = getMinList();
		mmaxlist = getMaxList();
		mminlistlen = mminlist.length;

		failedMethodology = false;

		bestSeg = null;
		minimizerMode = FINDING_SOLUTION;
		lastOuterSegNode = null;
		lastInnerSegNode = null;
		initialTest = true;
		subdivCount = 0;
		rejectCount = 0;
		addedCount = 0;
		failedMethodologyCount = 0;
		aggressiveStoreCount = 0;

		aggressiveRejectStack = new Staque();
		aggressiveSearch = new boolean[MINIMIZING_OUTPUT_P2 - FINDING_SOLUTION + 1];

		initXAxisArrays(
			epsilon,
			initialIntervalStart,
			initialIntervalEnd,
			guessIntervalStart,
			guessIntervalEnd,
			minimizationDefines,
			minimizationValues);

	}

	void calcDevInterval(final SegNode in) {
		int n = in.getNumElements();

		int count;
		for (count = 0; count < numMaxEntSystemEqn; ++count) {
			sampMean[count] = in.getTotal(count) / (double) (n);

			lowDeviation[count] = in.getMinPoint(count).getCompY(count);
			highDeviation[count] = in.getMaxPoint(count).getCompY(count);
			lowAbsDeviation[count] = in.getMinAbsPoint(count).getCompY(count);
			highAbsDeviation[count] = in.getMaxAbsPoint(count).getCompY(count);
		}

		/* pout.println( HighDeviation );
		pout.println( LowDeviation ); */
	}

	void handleDataPointInsertion(final SegNode in, final PtNode inp) {
		// boolean err = false;
		final int max = numMaxEntSystemEqn;
		int count;
		double compY;
		double absCompY;

		/* for( count = 0 ; count < numEntVars ; ++count )
			{
			double x = inp.getX().getVal( count );
			double strt = in.getIntervalStart()[ count ];
			double end = in.getIntervalEnd()[ count ];
			if( ( x < strt ) || ( x > end ) )
				{
				err = true;
				pout.println( "Error!!!!!!!!!!!!!!!!!!" );
				pout.println( strt );
				pout.println( end );
				pout.println( x );
				pout.println( count );
				}
			} */

		//	if (!err) {
		in.getPtList().insertRight(inp);
		in.setNumElements(in.getNumElements() + 1);

		if (in.getMinPoint(0) != null) {
			for (count = 0; count < max; count++) {
				compY = inp.getCompY(count);

				in.setTotal(in.getTotal(count) + compY, count);

				if (compY < (in.getMinPoint(count).getCompY(count)))
					in.setMinPoint(inp, count);

				if (compY > (in.getMaxPoint(count).getCompY(count)))
					in.setMaxPoint(inp, count);

				absCompY = Math.abs(compY);

				if (absCompY < Math.abs(in.getMinAbsPoint(count).getCompY(count)))
					in.setMinAbsPoint(inp, count);

				if (absCompY > Math.abs(in.getMaxAbsPoint(count).getCompY(count)))
					in.setMaxAbsPoint(inp, count);
			}
		}
		else {
			for (count = 0; count < max; count++) {
				compY = inp.getCompY(count);

				in.setTotal(compY, count);

				in.setMinPoint(inp, count);
				in.setMaxPoint(inp, count);
				in.setMinAbsPoint(inp, count);
				in.setMaxAbsPoint(inp, count);
			}
		}

		//		}
	}

	PtNode getDataPointFromBottomUpNode(final SegNode in) {
		PtNode MyNode = null;
		HighLevelList PtList = in.getPtList();

		if (!(PtList.getHead())) {
			MyNode = (PtNode) (PtList.getNode());
			PtList.right();
		}
		else {
			MyNode = getDataPointComp(in);
			addedCount++;
		}

		return (MyNode);
	}

	PtNode getDataPointFromTopDown(final SegNode in) {
		final PtNode MyNode = new PtNode();
		final double[] strt = in.getIntervalStart();
		final double[] end = in.getIntervalEnd();
		final int max = numEntVars;

		int count;
		final double[] X = new double[max];
		double dstrt;

		for (count = 0; count < max; ++count) {
			dstrt = strt[count];
			X[count] = ((end[count] - dstrt) * rand.nextDouble() ) + dstrt;
		}

		final double[] minval = new double[MINIMIZING_OUTPUT_P2 - FINDING_SOLUTION + 1];
		evalAllMinFun(X, commonY, minval);
		final double[] Y = commonY.copy();

		MyNode.setX(X);
		MyNode.setY(Y);
		MyNode.setMin(minval);
		return (MyNode);
	}

	PtNode getOtherBottomUp(final SegNode in, final SegNode prevSeg ) {
		final PtNode MyNode = new PtNode();
		final double[] strt = in.getIntervalStart();
		final double[] end = in.getIntervalEnd();
		final int idex = in.getPrevBottomUpIndex();
		final boolean top = in.getPrevBottomUpUsedGreater();
		final int max = numEntVars;

		int count;
		final double[] X = new double[max];
		double dstrt;
		double dend;
		
		for( count = 0 ; count < idex ; count++)
		{
			dstrt = strt[ count ];
			X[count] = ((end[count] - dstrt) * rand.nextDouble() ) + dstrt;
		}
		
		if( top )
		{
			dstrt = ( prevSeg.getIntervalEnd() )[ idex ];
			dend = end[ idex ];
		}
		else
		{
			dstrt = strt[ idex ];
			dend = ( prevSeg.getIntervalStart() )[ idex ];
		}
		X[idex] = ((dend - dstrt) * rand.nextDouble() ) + dstrt;
		
		for( count = idex + 1 ; count < max ; count++ )
		{
			dstrt = strt[ count ];
			X[count] = ((end[count] - dstrt) * rand.nextDouble() ) + dstrt;
		}

		double[] minval = new double[MINIMIZING_OUTPUT_P2 - FINDING_SOLUTION + 1];
		evalAllMinFun(X, commonY, minval);
		double[] Y = commonY.copy();

		MyNode.setX(X);
		MyNode.setY(Y);
		MyNode.setMin(minval);
		return (MyNode);
	}

	PtNode getDataPointComp(final SegNode in) {
		SegNode BottomUp = in.getPrevBottomUpNode();
		PtNode MyNode = null;

		if (BottomUp == null) {
			MyNode = getDataPointFromTopDown(in);
			addedCount++;
		}
		else {
			final int idex = in.getPrevBottomUpIndex();
			final double ist = ( in.getIntervalStart() )[ idex ];
			final double ied = ( in.getIntervalEnd() )[ idex ];
			final double bst = ( BottomUp.getIntervalStart() )[ idex ];
			final double bed = ( BottomUp.getIntervalEnd() )[ idex ];
			final double statp = Math.abs( ( bed - bst ) / ( ied - ist ) );
			if ( rand.nextDouble() <= statp ) {
				MyNode = getDataPointFromBottomUpNode(BottomUp);
			}
			else {
				MyNode = getOtherBottomUp(in, BottomUp);
				addedCount++;
			}
		}

		return (MyNode);
	}

	void addDataPoint(final SegNode in) {
		PtNode MyNode = getDataPointComp(in);
		handleDataPointInsertion(in, MyNode);
	}

	public double getMinDeltaValue(final SegNode in, final int idex) {
		double val = 0.0;
		HighLevelList MyList = in.getPtList();
		firstCount = 0;
		secondCount = 0;
		int count;

		int max = getCurPtNodeNormIndex();

		for (count = 0; count < max; ++count) {
			firstHiDev[count] = -1e10;
			firstLoDev[count] = 1e10;
			secondHiDev[count] = -1e10;
			secondLoDev[count] = 1e10;
		}

		double SplitPoint =
			(in.getIntervalEnd()[idex] - in.getIntervalStart()[idex]) / 2.0 + in.getIntervalStart()[idex];

		if (!(MyList.empty())) {
			MyList.getHead();
			boolean Done = false;

			while (!Done) {
				PtNode MyNode = (PtNode) (MyList.getNode());
				double[] X = MyNode.getX();

				if (X[idex] < SplitPoint) {
					firstCount++;
					for (count = 0; count < max; ++count) {
						if (MyNode.getCompY(count) > firstHiDev[count]) {
							firstHiDev[count] = MyNode.getCompY(count);
						}

						if (MyNode.getCompY(count) < firstLoDev[count]) {
							firstLoDev[count] = MyNode.getCompY(count);
						}
					}
				}
				else {
					secondCount++;
					for (count = 0; count < max; ++count) {
						if (MyNode.getCompY(count) > secondHiDev[count]) {
							secondHiDev[count] = MyNode.getCompY(count);
						}

						if (MyNode.getCompY(count) < secondLoDev[count]) {
							secondLoDev[count] = MyNode.getCompY(count);
						}
					}
				}

				MyList.right();
				Done = MyList.getHead();
			}
		}

		if ((firstCount > 1) && (secondCount > 1)) {
			for (count = 0; count < max; count++) {
				double tmp = 0;
				double FirstHiD = firstHiDev[count];
				double FirstLoD = firstLoDev[count];
				double SecondHiD = secondHiDev[count];
				double SecondLoD = secondLoDev[count];
				double delta = highAbsDeviation[count] / lowAbsDeviation[count];

				tmp += FirstHiD - FirstLoD;
				tmp += SecondHiD - SecondLoD;

				tmp = tmp /* * ( in.getIntervalEnd()[ idex ] - in.getIntervalStart()[ idex ] ) */
				/ delta;

				if (tmp > val)
					val = tmp;
			}
		}
		else {
			val = 1e+10;
		}

		return (val);
	}

	public double getDeltaValue(final SegNode in, final int idex) {
		double val = 0.0;
		HighLevelList MyList = in.getPtList();
		firstCount = 0;
		secondCount = 0;
		int count;

		final int max = getCurPtNodeNormIndex();

		for (count = 0; count < max; ++count) {
			firstHiDev[count] = -1e10;
			firstLoDev[count] = 1e10;
			secondHiDev[count] = -1e10;
			secondLoDev[count] = 1e10;
		}

		final double SplitPoint =
			(in.getIntervalEnd()[idex] - in.getIntervalStart()[idex]) / 2.0 + in.getIntervalStart()[idex];
			
		double compY;
		PtNode MyNode;
		double[] X;

		if (!(MyList.empty())) {
			MyList.getHead();
			boolean Done = false;

			while (!Done) {
				MyNode = (PtNode) (MyList.getNode());
				X = MyNode.getX();

				if (X[idex] < SplitPoint) {
					firstCount++;
					for (count = 0; count < max; ++count) {
						compY = MyNode.getCompY(count);
						if (compY > firstHiDev[count]) {
							firstHiDev[count] = compY;
						}

						if (compY < firstLoDev[count]) {
							firstLoDev[count] = compY;
						}
					}
				}
				else {
					secondCount++;
					for (count = 0; count < max; ++count) {
						compY = MyNode.getCompY(count);
						if (compY > secondHiDev[count]) {
							secondHiDev[count] = compY;
						}

						if (compY < secondLoDev[count]) {
							secondLoDev[count] = compY;
						}
					}
				}

				MyList.right();
				Done = MyList.getHead();
			}
		}

		if ((firstCount > 1) && (secondCount > 1)) {
			for (count = 0; count < max; count++) {
				double tmp = 0;
				double FirstHiD = firstHiDev[count];
				double FirstLoD = firstLoDev[count];
				double SecondHiD = secondHiDev[count];
				double SecondLoD = secondLoDev[count];

				if (FirstLoD > 0.0) {
					tmp += Math.abs(FirstLoD / (FirstHiD - FirstLoD));
				}

				if (FirstHiD < 0.0) {
					tmp += Math.abs(FirstHiD / (FirstHiD - FirstLoD));
				}

				if (SecondLoD > 0.0) {
					tmp += Math.abs(SecondLoD / (SecondHiD - SecondLoD));
				}

				if (SecondHiD < 0.0) {
					tmp += Math.abs(SecondHiD / (SecondHiD - SecondLoD));
				}

				if (tmp > val)
					val = tmp;
			}
		}

		return (val);
	}

	int getSplitPoint(final SegNode in) {
		int count;
		int idex = -1;
		double max = 0.0;
		double MaxInterval = 0.0;
		double MaxDelta = 0.0;
		PtNode ClosePoint = in.getClosePoint();
		PtNode FarPoint = in.getFarPoint();
		double[] end = in.getIntervalEnd();
		double[] strt = in.getIntervalStart();
		double[] CloseX = ClosePoint.getX();
		double[] FarX = FarPoint.getX();

		if (true) {
			for (count = 0; count < numEntVars; ++count) {
				double tmp = Math.abs(end[count] - strt[count]);
				double tmp2 = getDeltaValue(in, count);
				if (((tmp - epsilon[count]) > 1e-10) && ((tmp2 - MaxDelta) > 1e-10)) {
					MaxDelta = tmp2;
					idex = count;
				}
			}
		}

		if (idex == -1) {
			for (count = 0; count < numEntVars; ++count) {
				double tmp = Math.abs(end[count] - strt[count]);
				if ((tmp - epsilon[count]) > 1e-10) {
					double tmp3 = Math.abs((CloseX[count] - FarX[count]) / tmp);
					boolean swork = true;

					if (swork && (tmp3 > max)) {
						idex = count;
						max = tmp3;
					}
				}
			}
		}

		if (idex == -1) {
			for (count = 0; count < numEntVars; ++count) {
				double tmpx = Math.abs(end[count] - strt[count]) / (epsilon[count]);
				if (tmpx > MaxInterval) {
					MaxInterval = tmpx;
					idex = count;
				}
			}
		}

		/* pout.println( idex ); */
		return (idex);
	}

	void subdivide(final SegNode in, final Staque stk) {
		int SplitPoint = getSplitPoint(in);
		PtNode ClosePoint = in.getClosePoint();
		PtNode FarPoint = in.getFarPoint();
		int splitpref = 0;

		SegNode Node1 = new SegNode(numSystemEqn, numEntVars);
		SegNode Node2 = new SegNode(numSystemEqn, numEntVars);

		double split = 0.0;
		double[] strt = in.getIntervalStart();
		double[] end = in.getIntervalEnd();
		double[] strt_split = cloneIntervalStart(in);
		double[] end_split = cloneIntervalEnd(in);

		double istart = strt[SplitPoint];
		double iend = end[SplitPoint];
		double s1 = (ClosePoint.getX())[SplitPoint];
		double s2 = (FarPoint.getX())[SplitPoint];
		double s = (s1 + s2) / 2.0;
		double param = (s - istart) / (iend - istart);
		if ((param > 0.1) && (param < 0.9))
			split = s;
		else
			split = (strt[SplitPoint] + end[SplitPoint]) / 2.0;
		strt_split[SplitPoint] = split;
		end_split[SplitPoint] = split;

		Node1.setIntervalStart(strt);
		Node1.setIntervalEnd(end_split);
		Node2.setIntervalStart(strt_split);
		Node2.setIntervalEnd(end);

		boolean Done = false;
		HighLevelList PtList = in.getPtList();

		if (!(PtList.empty())) {
			PtList.searchHead();

			while (!Done) {
				PtNode MyNode = (PtNode) (PtList.getNode());
				double X = (MyNode.getX())[SplitPoint];
				if (X <= split) {
					handleDataPointInsertion(Node1, MyNode);
				}
				else {
					handleDataPointInsertion(Node2, MyNode);
					if (MyNode == ClosePoint)
						splitpref = 1;
				}

				PtList.right();
				Done = PtList.getHead();
			}
		}

		stk.pop();
		initialTest = true;
		if (splitpref == 0) {
			stk.push(Node2);
			stk.push(Node1);
		}
		else {
			stk.push(Node1);
			stk.push(Node2);
		}

		subdivCount++;
		if ((subdivCount % 500) == 0) {
			pout.print("Subdiv Count : ");
			pout.println(subdivCount);
		}
		/* pout.print( "Subdivided " ); */
	}

	double calcPtNodeNorm(final PtNode MyNode, final int max) {
		int count;
		double val = 0.0;
		double denom;
		double tmp;
		for (count = 0; count < max; count++) {
			denom = Math.max( lowAbsDeviation[ count ] , RESDBL );
			tmp = (MyNode.getCompY(count)) / denom;
			val += tmp * tmp;
		}

		return (val);
	}

	int getCurPtNodeNormIndex() {
		int dmax;
		if (minimizerMode > FINDING_SOLUTION)
			dmax = minimizerMode - FINDING_SOLUTION;
		else
			dmax = 0; /* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */
		int max = numEntSystemEqn + dmax;
		return (max);
	}

	void updateSubdivisionData(final SegNode in) {
		in.setClosePoint(null);
		in.setFarPoint(null);

		HighLevelList PtList = in.getPtList();

		// pout.println( in.getNumElements() );

		int emax = getCurPtNodeNormIndex();

		if (!(PtList.empty())) {
			PtList.searchHead();
			boolean Done = false;
			double maxval = 0.0;
			double minval = 0.0;

			while (!Done) {
				PtNode MyNode = (PtNode) (PtList.getNode());

				double val = calcPtNodeNorm(MyNode, emax);

				if (in.getClosePoint() == null) {
					in.setClosePoint(MyNode);
					minval = val;
				}
				else {
					if (val < minval) {
						in.setClosePoint(MyNode);
						minval = val;
					}
				}

				if (in.getFarPoint() == null) {
					in.setFarPoint(MyNode);
					maxval = val;
				}
				else {
					if (val > maxval) {
						in.setFarPoint(MyNode);
						maxval = val;
					}
				}

				PtList.right();
				Done = PtList.getHead();
			}
		}

	}

	void updateSubdivisionData(
		final SegNode in1,
		final SegNode InPrev,
		final SegNode out) { // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		out.setClosePoint(null);
		out.setFarPoint(null);

		double maxval = 0.0;
		double minval = 0.0;
		HighLevelList PtList1 = in1.getPtList();

		int emax = getCurPtNodeNormIndex();

		if (!(PtList1.empty())) {
			PtList1.searchHead();
			boolean Done = false;

			while (!Done) {
				PtNode MyNode = (PtNode) (PtList1.getNode());

				double val = calcPtNodeNorm(MyNode, emax);

				if (out.getClosePoint() == null) {
					out.setClosePoint(MyNode);
					minval = val;
				}
				else {
					if (val < minval) {
						out.setClosePoint(MyNode);
						minval = val;
					}
				}

				if (out.getFarPoint() == null) {
					out.setFarPoint(MyNode);
					maxval = val;
				}
				else {
					if (val > maxval) {
						out.setFarPoint(MyNode);
						maxval = val;
					}
				}

				PtList1.right();
				Done = PtList1.getHead();
			}
		}

		if (InPrev != null) {
			PtNode MyNode = InPrev.getClosePoint();

			if (MyNode != null) {
				double val = calcPtNodeNorm(MyNode, emax);

				if (out.getClosePoint() == null) {
					out.setClosePoint(MyNode);
					minval = val;
				}
				else {
					if (val < minval) {
						out.setClosePoint(MyNode);
						minval = val;
					}
				}

				if (out.getFarPoint() == null) {
					out.setFarPoint(MyNode);
					maxval = val;
				}
				else {
					if (val > maxval) {
						out.setFarPoint(MyNode);
						maxval = val;
					}
				}
			}
		}

		if (InPrev != null) {
			PtNode MyNode = InPrev.getFarPoint();

			if (MyNode != null) {
				double val = calcPtNodeNorm(MyNode, emax);

				if (out.getClosePoint() == null) {
					out.setClosePoint(MyNode);
					minval = val;
				}
				else {
					if (val < minval) {
						out.setClosePoint(MyNode);
						minval = val;
					}
				}

				if (out.getFarPoint() == null) {
					out.setFarPoint(MyNode);
					maxval = val;
				}
				else {
					if (val > maxval) {
						out.setFarPoint(MyNode);
						maxval = val;
					}
				}
			}
		}

	}

	boolean testMinimizers(final SegNode in) {
		int count;
		boolean ret = true;

		double bestObjVal = 0.0;
		double curObjVal = 0.0;

		if (minimizerMode > FINDING_SOLUTION) {

			for (count = 0; count < numEntVars; ++count) {
				if (minimizationDefines[count] == MINIMIZING_OBJECTIVE) {
					if (aggressiveSearch[minimizationDefines[count] - FINDING_SOLUTION]) {
						double minPt = minimizationValues[count];

						boolean newContainsZero =
							((in.getIntervalStart()[count]) <= minPt) && ((in.getIntervalEnd()[count]) >= minPt);

						if (!newContainsZero) {
							ret = false;
						}
					}
					else {
						double minPt = minimizationValues[count];

						boolean bestContainsZero =
							((bestSeg.getIntervalStart()[count]) <= minPt)
								&& ((bestSeg.getIntervalEnd()[count]) >= minPt);

						if (!bestContainsZero) {
							double cDela = (bestSeg.getIntervalStart()[count]) - minPt;
							double cDelb = (bestSeg.getIntervalEnd()[count]) - minPt;
							bestObjVal += Math.min(cDela * cDela, cDelb * cDelb);
						}

						boolean newContainsZero =
							((in.getIntervalStart()[count]) <= minPt) && ((in.getIntervalEnd()[count]) >= minPt);

						if (!newContainsZero) {
							double cDela = (in.getIntervalStart()[count]) - minPt;
							double cDelb = (in.getIntervalEnd()[count]) - minPt;
							curObjVal += Math.min(cDela * cDela, cDelb * cDelb);
						}
					}
				}
			}

			if (!(aggressiveSearch[minimizerMode - FINDING_SOLUTION])) {
				in.tmpDebugDiffValue = curObjVal;

				if (curObjVal >= bestObjVal)
					ret = false;
			}

		}
		else {
			ret = true;
		}

		return (ret);
	}

	/* !!!!!!!!!!!!!!!!!!!!!!!11 Refactor if going beyond objective !!!!!!!!!!!!!!!!!!!!!!!!1 */
	Object createNegMinimizationDistanceKey(final SegNode in) {
		int count;
		double curObjVal = 0.0;

		if (minimizerMode > FINDING_SOLUTION) {
			for (count = 0; count < numEntVars; ++count) {
				if (minimizationDefines[count] == MINIMIZING_OBJECTIVE) {
					double minPt = minimizationValues[count];

					boolean newContainsZero =
						((in.getIntervalStart()[count]) <= minPt) && ((in.getIntervalEnd()[count]) >= minPt);

					if (!newContainsZero) {
						double cDela = (in.getIntervalStart()[count]) - minPt;
						double cDelb = (in.getIntervalEnd()[count]) - minPt;
						curObjVal += Math.min(cDela * cDela, cDelb * cDelb);
					}
				}
			}
		}

		Double ret = new Double(-curObjVal);
		return (ret);
	}

	boolean testDataSet(final SegNode in, final Staque stk) {
		boolean ret = false;
		boolean initial = initialTest;
		initialTest = false;
		boolean TestMinimizerResult = false;

		//		handleTempConsider(in); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		if (initial)
			TestMinimizerResult = testMinimizers(in);
		else
			TestMinimizerResult = true;

		if (TestMinimizerResult) {
			while (in.getNumElements() < MIN_POINTS) {
				addDataPoint(in);
			}

			ret = testDataSetComp(in, stk);
		}
		else {
			if (aggressiveSearch[minimizerMode - FINDING_SOLUTION] /*false!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!*/
				) {
				SegNode popNd = (SegNode) (stk.pop());
				// pout.println( "Agg Stk Push" );
				pushToAgStore(popNd);
				initialTest = true;
			}
			else {
				SegNode rej = (SegNode) (stk.pop());
				// pout.println( "Agg Stk Pop" );
				// handleTempReject(rej); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				initialTest = true;
				rejectCount++;
				if( deb != null )
					deb.handleReject( rej );
			}
		}

		return (ret);
	}

	final static int RejectCode = 1;
	final static int AddDataPointCode = 2;
	final static int SubdivideCode = 3;
	final static int DoneCode = 4;

	boolean testDataSetComp(final SegNode in, final Staque stk) {
		int count;
		int tmp = RejectCode;

		calcDevInterval(in);

		int tmp2 = DoneCode;
		// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!11 pout.println( "Test Val" );
		tmpBadSample = true;
		for (count = 0; count < numEntSystemEqn; ++count) {
			int val = testOuterRegionConstr(in, stk, count);
			/* pout.println( val ); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */

			if (val < tmp2)
				tmp2 = val;
		}

		tmp = tmp2;

		// tmp = RejectCode; test !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

		if (failedMethodology) {
			return (false);
		}

		switch (tmp) {
			case AddDataPointCode :
				addDataPoint(in);
				break;

			case RejectCode :
				SegNode rej = (SegNode) (stk.pop());
				// handleTempReject(rej); !!!!!!!!!!!!!!!!!!!!!!!!!!!
				initialTest = true;
				rejectCount++;
			    if( deb != null )
					deb.handleReject( rej );

				break;

			case SubdivideCode :
				updateSubdivisionData(in);
				subdivide(in, stk);
				//pout.println( "Subdivide " );
				break;

			default :
				break;
		}

		return (tmp == DoneCode);
	}

	boolean checkMinimizers(final int val) {
		if (val == FINDING_SOLUTION)
			return (true);

		int count;
		boolean ret = true;

		pout.println("Checking IODef");

		for (count = 0; count < numEntVars; ++count) {
			if (minimizerMode == minimizationDefines[count]) {
				double minPt = minimizationValues[count];

				boolean bestContainsZero =
					((bestSeg.getIntervalStart()[count]) <= minPt) && ((bestSeg.getIntervalEnd()[count]) >= minPt);

				ret = ret && bestContainsZero;
			}

		}

		//if (ret)
		//	java.awt.Toolkit.getDefaultToolkit().beep();

		return (ret);
	}

	boolean checkMinimizationSatisfied(final SegNode in) {
		boolean ret = false;

		if (minimizerMode == FINDING_SOLUTION) {
			ret = false;
		}
		else {
			double LowDeviation = 1e8;
			double HighDeviation = -1e8;
			double SampMean = 0.0;

			HighLevelList PtList = in.getPtList();

			if (!(PtList.empty())) {
				boolean Done = false;
				PtList.searchHead();

				while (!Done) {
					double val = 0.0;
					PtNode MyNode = (PtNode) (PtList.getNode());

					int count;
					for (count = 0; count < numEntVars; ++count) {
						if (minimizationDefines[count] == EngineConstants.IO_DEF_OBJECTIVE) {
							double tmp = ((MyNode.getX())[count] - minimizationValues[count]);
							val += tmp * tmp;
						}
					}

					SampMean += val;
					if (val < LowDeviation)
						val = LowDeviation;
					if (val > HighDeviation)
						val = HighDeviation;

					PtList.right();
					Done = PtList.getHead();
				}
			}

			int num = in.getNumElements();

			SampMean = SampMean / ((double) (num));

			double LoDelta = 0.0;
			if (num < mminlistlen) {
				LoDelta = Math.abs(LowDeviation - SampMean) * (mminlist[num]);
			}
			else {
				/* Note: this is an extremely rough approximation. */
				LoDelta = 1E+6;
				// LoDelta = Math.abs( LowDeviation - SampMean ) * ( mminlist[ mminlistlen - 1 ] ) 
				//	* Math.exp( -0.01 * ( num - ( mminlistlen - 1 ) ) );
			}

			double delta = (SampMean - LowDeviation) * (LoDelta);
			double yb = SampMean - delta;

			if (yb <= 0.0)
				ret = true;
		}

		return (ret);
	}

	int testOuterRegionConstr(final SegNode in, final Staque stk, final int idex) {
		double yb = sampMean[idex];
		int ret = AddDataPointCode;

		if (0.0 >= yb) {
			double HiDev = highDeviation[idex];
			int max = in.getNumElements();
			double HiDelta;
			if (max < mminlistlen) {
				HiDelta = Math.abs(HiDev - yb) * (mmaxlist[max]);
			}
			else {
				/* Note: this is an extremely rough approximation. */
				HiDelta = 1E+6;
				//			HiDelta = Math.abs( HiDev - yb ) * ( mmaxlist[ mminlistlen - 1 ] ) 
				//				* Math.exp( -0.01 * ( max - ( mminlistlen - 1 ) ) );
			}

			double HiMark = yb + HiDelta;

			if (0.0 > HiMark) {
				ret = RejectCode;
			}
			else {
				ret = testInnerRegionConstr(in, stk, idex);
			}
		}
		else {
			double LoDev = lowDeviation[idex];
			int max = in.getNumElements();
			double LoDelta;
			if (max < mminlistlen) {
				LoDelta = Math.abs(LoDev - yb) * (mmaxlist[max]);
			}
			else {
				/* Note: this is an extremely rough approximation. */
				LoDelta = 1E+6;
				//			LoDelta = Math.abs( LoDev - yb ) * ( mmaxlist[ mminlistlen - 1 ] ) 
				//				* Math.exp( -0.01 * ( max - ( mminlistlen - 1 ) ) );
			}

			double HiMark = yb - LoDelta;

			if (0.0 < HiMark) {
				ret = RejectCode;
			}
			else {
				ret = testInnerRegionConstr(in, stk, idex);
			}

		}

		return (ret);
	}

	int testInnerRegionConstr(final SegNode in, final Staque stk, final int idex) {
		int ret = AddDataPointCode;
		double yb = sampMean[idex];

		if (in.getNumElements() >= mminlistlen) {
			if (!(in.getParamDelta() <= 1.0)) {
				// !!!!!!!!!!!!!!!!!!!!! Depends On Minimization Mode !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				tmpBadSample = false;
				failedMethodology = true;
				return (RejectCode);
			}

		}

		if (in.getParamDelta() <= 1.0) {
			ret = DoneCode;
		}
		else {
			if (0.0 >= yb) {
				double HiDev = highDeviation[idex];
				int max = in.getNumElements();
				double HiDelta;
				if (max < mminlistlen) {
					HiDelta = Math.abs(HiDev - yb) * (mminlist[max]);
				}
				else {
					HiDelta = 1E+6;
					// HiDelta = Math.abs( HiDev - yb );
				}

				double LoMark = yb + HiDelta;

				if (0.0 > LoMark) {
					ret = AddDataPointCode;
				}
				else {
					ret = SubdivideCode;
				}
			}
			else {
				double LoDev = lowDeviation[idex];
				int max = in.getNumElements();
				double LoDelta;
				if (max < mminlistlen) {
					LoDelta = Math.abs(LoDev - yb) * (mminlist[max]);
				}
				else {
					LoDelta = 1E+6;
					// LoDelta = Math.abs( LoDev - yb );
				}

				double LoMark = yb - LoDelta;

				if (0.0 < LoMark) {
					ret = AddDataPointCode;
				}
				else {
					ret = SubdivideCode;
				}
			}

		}

		return (ret);
	}

	private boolean useGreaterInterval;

	//	int getBottomUpGuessIndex() { !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! better guess !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	//		double max = 0.0;
	//		int count;
	//		int BestIdex = -1;
	//		boolean BestGreater = false;
	//		double BestDelta = 1e20;
	//		double outerEnd[] = LastOuterSegNode.getIntervalEnd();
	//		double outerStrt[] = LastOuterSegNode.getIntervalStart();
	//		double innerEnd[] = LastInnerSegNode.getIntervalEnd();
	//		double innerStrt[] = LastInnerSegNode.getIntervalStart();
	//		PtNode ClosePt = LastInnerSegNode.getClosePoint();
	//
	//		if (ClosePt == null) {
	//			if (MinimizerMode > FindingSolution) {
	//				for (count = 0; count < numEntVars; ++count) {
	//					if (MinimizationDefines[count] == MinimizingObjective) {
	//						if (aggressiveSearch[MinimizationDefines[count] - FindingSolution]) {
	//							double minPt = MinimizationValues[count];
	//
	//							boolean newContainsZero =
	//								((LastOuterSegNode.getIntervalStart()[count]) <= minPt)
	//									&& ((LastOuterSegNode.getIntervalEnd()[count]) >= minPt);
	//
	//							if (!newContainsZero) {
	//								BestIdex = count;
	//								BestGreater = ((LastOuterSegNode.getIntervalEnd()[count]) <= minPt);
	//							}
	//						}
	//					}
	//				}
	//			}
	//		}
	//
	//		if ((BestIdex == -1) && (ClosePt != null)) {
	//			double[] CloseX = ClosePt.getX();
	//
	//			for (count = 0; count < numEntVars; ++count) {
	//				double tmp = Math.abs(outerEnd[count] - outerStrt[count]);
	//
	//				if (tmp > (0.001 * epsilon[count])) {
	//					double tmp1 = Math.abs(CloseX[count] - innerStrt[count]);
	//					double tmp2 = (innerEnd[count] - innerStrt[count]);
	//					double tmp4 = tmp1 / tmp2;
	//					double tmp3 = 1.0 - tmp4;
	//
	//					double tval = tmp2 * (outerEnd[count] - outerStrt[count]);
	//					if (tmp2 < 0.0) {
	//						tmp3 = 1.0 - tmp3;
	//						tmp4 = 1.0 - tmp4;
	//					}
	//
	//					double delta1 = outerStrt[count] - InitialIntervalStart[count];
	//					double delta2 = InitialIntervalEnd[count] - outerEnd[count];
	//
	//					if ((delta1 > epsilon[count]) && (tmp3 > max)) {
	//						BestIdex = count;
	//						max = tmp3;
	//						BestGreater = false;
	//					}
	//
	//					if ((delta2 > epsilon[count]) && (tmp4 > max)) {
	//						BestIdex = count;
	//						max = tmp3;
	//						BestGreater = true;
	//					}
	//				}
	//			}
	//		}
	//
	//		if (BestIdex == -1) {
	//			for (count = 0; count < numEntVars; ++count) {
	//				double tmp = Math.abs(outerEnd[count] - outerStrt[count]);
	//				double tmp2 = (outerEnd[count] + outerStrt[count]) / 2.0;
	//				if (tmp > (0.001 * epsilon[count])) {
	//					double tmp3 = (epsilon[count]) / tmp;
	//
	//					double delta1 = outerStrt[count] - InitialIntervalStart[count];
	//					double delta2 = InitialIntervalEnd[count] - outerEnd[count];
	//
	//					if ((delta1 > epsilon[count]) && (delta2 > epsilon[count]) && (tmp3 > max)) {
	//						BestIdex = count;
	//						max = tmp3;
	//						if ((MinimizationValues[BestIdex]) > tmp2)
	//							BestGreater = true;
	//						else
	//							BestGreater = false;
	//					}
	//					else {
	//						if ((delta1 > epsilon[count]) && (tmp3 > max)) {
	//							BestIdex = count;
	//							max = tmp3;
	//							BestGreater = false;
	//						}
	//
	//						if ((delta2 > epsilon[count]) && (tmp3 > max)) {
	//							BestIdex = count;
	//							max = tmp3;
	//							BestGreater = true;
	//						}
	//					}
	//				}
	//			}
	//		}
	//
	//		if (BestIdex == -1) {
	//			for (count = 0; count < numEntVars; ++count) {
	//				double delta = outerEnd[count] - outerStrt[count];
	//
	//				double delta1 = outerStrt[count] - InitialIntervalStart[count];
	//
	//				if ((delta1 > epsilon[count]) && (delta < BestDelta)) {
	//					BestIdex = count;
	//					BestDelta = delta;
	//					BestGreater = false;
	//				}
	//
	//				double delta2 = InitialIntervalEnd[count] - outerEnd[count];
	//
	//				if ((delta2 > epsilon[count]) && (delta < BestDelta)) {
	//					BestIdex = count;
	//					BestDelta = delta;
	//					BestGreater = true;
	//				}
	//			}
	//		}
	//
	//		useGreaterInterval = BestGreater;
	//		return (BestIdex);
	//	}

	int getBottomUpGuessIndex() { // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! better guess !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		int count;
		int BestIdex = -1;
		boolean BestGreater = false;
		double outerEnd[] = lastOuterSegNode.getIntervalEnd();
		double outerStrt[] = lastOuterSegNode.getIntervalStart();
		//		pout.println("Entered Guess Bottom Up");

		if (minimizerMode > FINDING_SOLUTION) {
			for (count = 0; count < numEntVars; ++count) {
				if (minimizationDefines[count] == MINIMIZING_OBJECTIVE) {
					if (aggressiveSearch[minimizationDefines[count] - FINDING_SOLUTION]) {
						double minPt = minimizationValues[count];

						boolean newContainsZero =
							((lastOuterSegNode.getIntervalStart()[count]) <= minPt)
								&& ((lastOuterSegNode.getIntervalEnd()[count]) >= minPt);

						if (!newContainsZero) {
							BestIdex = count;
							BestGreater = ((lastOuterSegNode.getIntervalEnd()[count]) <= minPt);
						}
					}
				}
			}
		}

		if (BestIdex == -1) {
			double bestVal = 0.0;

			int emax = getCurPtNodeNormIndex();
			SegNode msg = new SegNode(numSystemEqn, numEntVars);
			SegNode[] sarr = new SegNode[2 * numEntVars];

			for (count = 0; count < numEntVars; ++count) {
				SegNode sg = null;

				if ((initialIntervalEnd[count] - outerEnd[count]) > RESDBL) {
					sg = new SegNode(numSystemEqn, numEntVars);

					double[] NewInnerStart = cloneIntervalStart(lastOuterSegNode);
					double[] NewInnerEnd = cloneIntervalEnd(lastOuterSegNode);
					sg.setIntervalStart(NewInnerStart);
					sg.setIntervalEnd(NewInnerEnd);

					double delta = NewInnerEnd[count] - NewInnerStart[count];

					double d1 = NewInnerEnd[count] + delta;
					if (d1 > initialIntervalEnd[count])
						d1 = initialIntervalEnd[count];
					NewInnerStart[count] += delta;
					NewInnerEnd[count] = d1;

					//		for (count2 = 0; count2 < numEntVars; count2++) {
					//			pout.println((NewInnerStart[count2]) + " " + (NewInnerEnd[count2]));
					//		}

					int count2;
					for (count2 = 0; count2 < 4; count2++) {
						addDataPoint(sg);
					}
					sarr[count * 2 + 1] = sg;
				}

				if ((outerStrt[count] - initialIntervalStart[count]) > RESDBL) {
					sg = new SegNode(numSystemEqn, numEntVars);

					double[] NewInnerStart = cloneIntervalStart(lastOuterSegNode);
					double[] NewInnerEnd = cloneIntervalEnd(lastOuterSegNode);
					sg.setIntervalStart(NewInnerStart);
					sg.setIntervalEnd(NewInnerEnd);

					double delta = NewInnerEnd[count] - NewInnerStart[count];

					double d1 = NewInnerStart[count] - delta;
					if (d1 < initialIntervalStart[count])
						d1 = initialIntervalStart[count];
					NewInnerStart[count] = d1;
					NewInnerEnd[count] -= delta;

					//		for (count2 = 0; count2 < numEntVars; count2++) {
					//			pout.println((NewInnerStart[count2]) + " " + (NewInnerEnd[count2]));
					//		}

					int count2;
					for (count2 = 0; count2 < 4; count2++) {
						addDataPoint(sg);
					}
					sarr[count * 2] = sg;

				}
			}

			boolean foundOne = false;
			for( count = 0; count < ( 2 * numEntVars ); count++ ) {
				SegNode sg = sarr[count];
				if (sg != null) {
					foundOne = true;
					HighLevelList lst = sg.getPtList();
					lst.searchHead();
					boolean done = false;
					while (!done) {
						PtNode nd = (PtNode) (lst.getNode());
						handleDataPointInsertion(msg, nd);
						lst.right();
						done = lst.getHead();
					}
				}
			}

			if (foundOne) {
				calcDevInterval(msg);
				updateSubdivisionData(msg);

				for (count = 0; count < (2 * numEntVars); count++) {
					SegNode sg = sarr[count];
					if (sg != null) {
						updateSubdivisionData(sg);
						PtNode MyNode = sg.getClosePoint();
						double val = calcPtNodeNorm(MyNode, emax);
						//pout.println(MinimizerMode + " " + val);
						// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
						if ( (BestIdex == -1 ) || ( val < bestVal ) ) {
							bestVal = val;
							BestIdex = count / 2;
							BestGreater = (count % 2) != 0;
						}
					}
				}
			}
		}

		useGreaterInterval = BestGreater;
		//		pout.println(BestIdex);
		return (BestIdex);
	}

	boolean handlePointFoundComp(final SegNode TestNode) {
		double val = 0.0;
		boolean AcptCond = false;
		boolean LastFound = false;

		if (minimizerMode > FINDING_SOLUTION) {
			AcptCond = true;
		}
		else {
			AcptCond = true;
		}

		if (AcptCond) {
			if (minimizerMode > FINDING_SOLUTION)
				pout.println("Changed Best Seg Min : " + TestNode.tmpDebugDiffValue);

			if (bestSeg != null) {
				rejectCount++;
				if( deb != null )
					deb.handleReject( bestSeg );
				// handleTempReject(bestSeg); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
			}
			bestSeg = TestNode;

			boolean Done1 = !(checkMinimizers(minimizerMode));
			while (!Done1) {
				minimizerMode++;

				if (minimizerMode > /* MinimizingOutputP2 */
					MINIMIZING_OBJECTIVE)
					Done1 = true;
				else {
					aggressiveSearch[minimizerMode - FINDING_SOLUTION] = true;
					Done1 = !(checkMinimizers(minimizerMode));
				}
			}

			if (minimizerMode > /* MinimizingOutputP2 */
				MINIMIZING_OBJECTIVE) {
				pout.println("Last Found");
				LastFound = true;
			}
		}

		return (LastFound);
	}

	boolean handlePointFound(final SegNode TestNode) {
		boolean val = false;
		if (minimizerMode <= EngineConstants.IO_DEF_OUTPUT_P2)
			val = handlePointFoundComp(TestNode);
		else
			val = true;

		return (val);
		/* bestSeg = TestNode; return( true ); */
	}

	void guessBottomUp(final Staque stk) {
		if (lastOuterSegNode == null) {
			//pout.println("Used Switch");
			lastOuterSegNode = lastInnerSegNode;
		}

		updateSubdivisionData(lastInnerSegNode, lastOuterSegNode.getPrevBottomUpNode(), lastOuterSegNode);
		int idex = getBottomUpGuessIndex();
		// pout.println( "idex " + idex );
		boolean greater = useGreaterInterval;

		if (idex > -1) {
			SegNode NewInnerNode = new SegNode(numSystemEqn, numEntVars);
			SegNode NewOuterNode = new SegNode(numSystemEqn, numEntVars);
			double[] NewInnerStart = cloneIntervalStart(lastOuterSegNode);
			double[] NewInnerEnd = cloneIntervalEnd(lastOuterSegNode);
			double[] NewOuterStart = cloneIntervalStart(lastOuterSegNode);
			double[] NewOuterEnd = cloneIntervalEnd(lastOuterSegNode);
			NewInnerNode.setIntervalStart(NewInnerStart);
			NewInnerNode.setIntervalEnd(NewInnerEnd);
			NewOuterNode.setIntervalStart(NewOuterStart);
			NewOuterNode.setIntervalEnd(NewOuterEnd);

			double delta = NewInnerEnd[idex] - NewInnerStart[idex];
			if (greater) {
				double d1 = NewInnerEnd[idex] + delta;
				if (d1 > initialIntervalEnd[idex])
					d1 = initialIntervalEnd[idex];
				NewInnerStart[idex] += delta;
				NewInnerEnd[idex] = d1;
				NewOuterEnd[idex] = d1;
			}
			else {
				double d1 = NewInnerStart[idex] - delta;
				if (d1 < initialIntervalStart[idex])
					d1 = initialIntervalStart[idex];
				NewInnerStart[idex] = d1;
				NewInnerEnd[idex] -= delta;
				NewOuterStart[idex] = d1;
			}

			NewOuterNode.setPrevBottomUpNode(lastOuterSegNode);
			lastOuterSegNode.setPrevBottomUpNode(null);
			NewOuterNode.setPrevBottomUpUsedGreater(greater);
			NewOuterNode.setPrevBottomUpIndex(idex);
			if (!(NewOuterNode.getPtList().empty())) {
				NewOuterNode.getPtList().searchHead();
				NewOuterNode.getPtList().right();
			}
			initialTest = true;
			stk.push(NewInnerNode);
			/* stk.Push( NewOuterNode ); */
			lastOuterSegNode = NewOuterNode;
			lastInnerSegNode = NewInnerNode;
			// pout.println( "Used New Outer Node" );
		}
	}

	public void handleAggressiveSearchGrab(final Staque stk) {
		pout.println("Grabbing from aggressive search stack!!!!!!!!!!!!!!!!!!!!");
		aggressiveSearch[minimizerMode - FINDING_SOLUTION] = false;
		TreeMap tm = new TreeMap();

		SegNode agStkNode = popFromAgStore();
		while (agStkNode != null) {
			SegNode seg = agStkNode;
			if (testMinimizers(seg)) {
				Object key = createNegMinimizationDistanceKey(seg);
				HighLevelList hl = (HighLevelList) (tm.get(key));
				if (hl == null) {
					hl = new HighLevelList();
					tm.put(key, hl);
				}
				hl.insertRight(seg);
			}
			else {
				// handleTempReject(seg); !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				rejectCount++;
				if( deb != null )
					deb.handleReject( seg );
			}
			agStkNode = popFromAgStore();
		}

		boolean Done = false;
		Iterator it = tm.values().iterator();
		while (it.hasNext()) {
			HighLevelList lst = (HighLevelList) (it.next());
			if (!(lst.empty())) {
				lst.searchHead();
				Done = false;
				while (!Done) {
					SegNode seg = (SegNode) (lst.getNode());
					stk.push(seg);
					lst.right();
					Done = lst.getHead();
				}

				lst.eraseAllInfo();
			}
		}

		initialTest = true;
		pout.println("Grabbed from aggressive search stack!!!!!!!!!!!!!!!!!!!!");
	}

	public Staque handleFailedMethodology(final Staque subdivStk, final Staque contextStk, final int numXvals) {
		SegNode segn = (SegNode) (subdivStk.pop());
		updateSubdivisionData(segn);
		PtNode ptnd = segn.getClosePoint();

		ContextNode context = new ContextNode();
		context.setUseGuess(useGuess);
		context.setInitialIntervalStart(initialIntervalStart);
		context.setInitialIntervalEnd(initialIntervalEnd);
		context.setSubdivStk(subdivStk);
		context.setLastOuterSegNode(lastOuterSegNode);
		context.setLastInnerSegNode(lastInnerSegNode);
		contextStk.push(context);

		useGuess = true;
		initialIntervalStart = segn.getIntervalStart();
		initialIntervalEnd = segn.getIntervalEnd();

		Staque newSubdiv = new Staque();
		double[] newGuessIntervalStart = new double[numXvals];
		double[] newGuessIntervalEnd = new double[numXvals];
		double[] strt = ptnd.getX();
		int count;

		for (count = 0; count < numXvals; count++) {
			newGuessIntervalStart[count] = (strt[count]) - 0.45 * (epsilon[count]);
			newGuessIntervalEnd[count] = (strt[count]) + 0.45 * (epsilon[count]);
		}

		SegNode MyNode = new SegNode(numSystemEqn, numEntVars);
		newSubdiv.push(MyNode);
		initialTest = true;
		lastInnerSegNode = MyNode;
		lastOuterSegNode = null;
		MyNode.setIntervalStart(newGuessIntervalStart);
		MyNode.setIntervalEnd(newGuessIntervalEnd);

		return (newSubdiv);
	}

	public Staque handleContextStackPop(final ContextNode context) {
		useGuess = context.isUseGuess();
		initialIntervalStart = context.getInitialIntervalStart();
		initialIntervalEnd = context.getInitialIntervalEnd();
		lastOuterSegNode = context.getLastOuterSegNode();
		lastInnerSegNode = context.getLastInnerSegNode();
		initialTest = true;
		return (context.getSubdivStk());
	}

	public boolean findRoot(final VirtualArray varr) {
		Staque contextStk = new Staque();
		Staque subdivStk = new Staque();
		boolean Done = false;
		boolean Found = false;
		boolean FoundNow = false;
		boolean LastFound = false;
		double[] temp = new double[numEntVars];
		int cnt;

		if (numMaxEntSystemEqn == 0)
			return (false);

		try {
			for (cnt = 0; cnt < numEntVars; cnt++)
				temp[cnt] = varr.getVal(cnt);

			SegNode MyNode = new SegNode(numSystemEqn, numEntVars);
			subdivStk.push(MyNode);
			initialTest = true;
			if (useGuess) {
				lastInnerSegNode = MyNode;
				MyNode.setIntervalStart(guessIntervalStart);
				MyNode.setIntervalEnd(guessIntervalEnd);
			}
			else {
				MyNode.setIntervalStart(initialIntervalStart);
				MyNode.setIntervalEnd(initialIntervalEnd);
			}

			while (!Done) {
				SegNode TestNode = (SegNode) (subdivStk.getRearNode());
				if( deb != null )
				    deb.handleSeg( TestNode );
				FoundNow = testDataSet(TestNode, subdivStk);

				if (FoundNow) {
					// pout.println( "Found Now!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" );

					subdivStk.pop();
					initialTest = true;
					FoundNow = false;
					Found = true;

					LastFound = handlePointFound(TestNode);
				}
				
				//pout.println( "empty" + subdivStk.empty() );
				//pout.println( "use guess" + UseGuess );
				//pout.println( "!LastFound " + !LastFound );
				//pout.println( "!failedMathodology " + !failedMethodology );

				if ((subdivStk.empty()) && useGuess && (!LastFound) && (!failedMethodology)) {
					if (!(checkMinimizationSatisfied(TestNode))) {
						guessBottomUp(subdivStk);
					}
				}

				while ((subdivStk.empty()) && (!LastFound) && (!failedMethodology) && !(contextStk.empty())) {
					ContextNode context = (ContextNode) (contextStk.pop());
					subdivStk = handleContextStackPop(context);
				}

				if ((subdivStk.empty())
					&& (!LastFound)
					&& (!failedMethodology)
					&& !(minimizerMode > MINIMIZING_OUTPUT_P2)
					&& !(aggressiveRejectStack.empty())) {
					handleAggressiveSearchGrab(subdivStk);
				}

				if (failedMethodology) {
					subdivStk = handleFailedMethodology(subdivStk, contextStk, varr.getSize());
					failedMethodologyCount++;
					failedMethodology = false;
				}

				Done = subdivStk.empty() || LastFound;
			}
		}
		catch (Throwable ex) {
			contextStk.eraseAllInfo();
			subdivStk.eraseAllInfo();
			aggressiveRejectStack.eraseAllInfo();
			pout.println("Fail On System Error");
			ex.printStackTrace(pout);
			// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		}

		try {
			if (agStoreOut != null) {
				agStoreOut.close();
				agStoreOut = null;
			}
		}
		catch (Exception ex) {
			ex.printStackTrace(pout);
		}

		if (Found) {
			pout.println("Result Displayed");
			int count;
			for (count = 0; count < numEntVars; ++count) {
				double val;
				val = (bestSeg.getIntervalStart()[count] + bestSeg.getIntervalEnd()[count]) / 2.0;
				varr.setVal(count, val);
			}
		}
		else {
			pout.println("Result Not Found");
			int count;
			for (count = 0; count < numEntVars; ++count)
				varr.setVal(count, temp[count]);
		}

		pout.println("Subdivisions: ");
		pout.println(subdivCount);
		pout.println("Rejections: ");
		pout.println(rejectCount);
		pout.println("Aggressive Stores: ");
		pout.println(aggressiveStoreCount);
		pout.println("Failed Methodologies: ");
		pout.println(failedMethodologyCount);
		pout.println("Points Calculated: ");
		pout.println(addedCount * numEntSystemEqn);

		return (!Found);
	}

	public abstract double[] getMinList();

	public abstract double[] getMaxList();

} /* StatSolver */
