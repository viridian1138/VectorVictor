




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

import meta.HighLevelList;
import meta.StdLowLevelList;



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
*    | 10/27/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner should be engine class, but knows too much about DrawObj.  | Fixed problems, and moved DynRunner to engine.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner was showing too much information to the depictors.         | Modified DynRunner so that it doesn't show engine classes to depictors.
*    | 11/16/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner.link did not report if solver was unable to find solution. | Changed DynRunner.link to return a boolean.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Needed to support the new architecture for constraint solving.       | Made modifications to support the new constraint solving architecture.
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
* Provides a way for a depictor to interact with a constrained system.
* In this mechanism, the depictor delegates the handling of mouse-drag
* events to a DynRunner with a specified set of constriants rather than
* using event-driven code in the depictor itself.  Event-handling code
* embedded in a depictor may not be "smart" enough to resolve constraints
* contained in the global constraint system.  Thus the event code may produce
* results that are inconsistent with these constraints.  With a DynRunner, the
* semantics of the drag operation are described in terms of Geometric Algebra so
* that a constraint solver can have access to them as symbolic entities.  This
* creates the potential for a constraint solver to resolve both the drag
* constraints and the global system constraints in a consistent way.  Another
* problem with putting drag-event handling code inside each depictor is that the
* depictors must handle the events in an efficient real-time fashion.  In other words,
* all drag-event handlers of all depictors would have to be time-optimized.  However, if the
* depictors delegate non-trivial event handling to a DynRunner then only the
* constraint solver of the DynRunner needs to be optimized.  This makes it much easier
* to maintain the depictors over the life-cycle of the software.
* @author Thorn Green
*/
public interface DynRunner {
	/**
	* Indicates to the constraint solver that a mouse-drag event has occurred on the
	* port <code>ThePort</code> at location <code>InPt</code>.  The
	* port is used mainly to convert the point from local to global coordinates.
	*/
	public abstract boolean dragExecute(Object ThePort, Mvec InPt);
	/**
	* Adds an "assignment" constraint to the constraint system.  This is usually used
	* to assign to predefined ports.
	*/
	public abstract boolean changeExpression(Object[] Var, Object[] Exp);
	/**
	* Adds an "assignment" constraint to the constraint system with a domain.  This is
	* usually used to assign to variables declared as part of the constraint system
	* for the drag operation.
	*/
	public abstract boolean changeExpression(Object[] Var, Object[] Exp, int Domain);
	/**
	* Constrains two ports on the depictor to be equal.
	*/
	public abstract boolean tie(String t1, String t2, Object in);
	/**
	* Links all constraints to the associated variables in the system.
	* Returns true if the solver was unable to deal with the system.
	*/
	public abstract boolean link(Object port, Mvec StrtPt);
	/**
	* returns the multivector associated with a particular variable name.
	*/
	public abstract Mvec findVect(String in);
	/**
	* Declares a constant with the name in <code>invar</code>, value
	* <code>val</code>, and domain <code>Domain</code>.
	*/
	public abstract void makeConstant(String invar, Mvec val, int Domain);
	/**
	* Informs the constraint solver that the drag operation is over, and it
	* should perform any cleanup it needs to do.
	*/
	public abstract void handlePostDrag();
	/**
	* Gets the list of unique non-engine variables to be used by the solver.
	*/
	public abstract HighLevelList<StdLowLevelList<ASGNode>,ASGNode> getUnqVarList();
	/**
	* Sets whether the view in which drag operations are to be handled
	* is a bound depiction.
	*/
	public abstract void setBound(boolean in);
	/**
	* Gets whether the view in which drag operations are to be handled
	* is a bound depiction.
	*/
	public abstract boolean getBound();
	/**
	* Sets the location in the GCS space of the dragged depictor
	* that is the center of the bound depiction, if the depiction is bound.
	*/
	public abstract void setBoundPt(Mvec in);
	/**
	* Gets the location in the GCS space of the dragged depictor
	* that is the center of the bound depiction, if the depiction is bound.
	*/
	public abstract Mvec getBoundPt();

	/**
	* Utility method to write the constraint system to the console.
	*/
	public abstract void writeConstraintSystem();
	/**
	* Utility method to write the I/O status of the variables
	* in the constraint system to the console.
	*/
	public abstract void writeSystemIODefs();
	/**
	* Utility method to write minimization parameters to the console.
	*/
	public abstract void writeSystemMinimizers();
}
