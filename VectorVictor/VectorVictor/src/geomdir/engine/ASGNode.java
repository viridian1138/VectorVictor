



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

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import meta.DataFormatException;
import meta.FlexString;
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
*    | 10/26/2000            | Thorn Green (viridian_1138@yahoo.com)           | Engine classes had names that were outside the Java standard.        | Changed the class names.
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | Classes did not have names that followed standard Java conventions.  | Performed a global modification to bring the names within spec.
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | A global ASG couldn't take the place of a DynRunner ASG in topo sort.| Allowed an ASG node to have another ASG node as a cousin that could be linked into a topological sort.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 10/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enahncement.                                             | Improved some methods.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 09/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Make changes to support the BlueToh constraint solver.               | Made changes to support the BlueToh constraint solver.
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
* A node that represents a variable, and stores the assignment to that variable
* if one exists.  It also stores the variable's domain, the variable's multivector,
* and input/output information for the variable.
* @author Thorn Green
*/
public class ASGNode extends Meta<ASGNode> implements Externalizable {
	/**
	* Copies the node's contents to the node <code>out</code>.
	*/
	public final void datCpy(ASGNode out) {
		out.dvSetMark(mark);
		out.dvCopyStr(myStr);
		out.dvSetDrawObj(myDrawObj);
		out.dvSetExpNode(myExpNode);
		out.dvSetMableVal(myMable.value);
		out.setRefCon(refCon);
		myMvec.copyAllInfo(out.dvGetMvec());
		minimizationMvec.copyAllInfo(out.dvGetMinimizationMvec());
	};
	public ASGNode copyNode() {
		ASGNode temp = new ASGNode();
		datCpy(temp);
		return (temp);
	};
	public ASGNode copySub() {
		ASGNode temp = new ASGNode();
		datCpy(temp);
		return (temp);
	};
	public ASGNode copyAll() {
		ASGNode temp = new ASGNode();
		datCpy(temp);
		return (temp);
	};
	public void copyNodeInfo(ASGNode in) {
		ASGNode temp = in;
		datCpy(temp);
	};
	public void copySubInfo(ASGNode in) {
		ASGNode temp = in;
		datCpy(temp);
	};
	public void copyAllInfo(ASGNode in) {
		ASGNode temp = in;
		datCpy(temp);
	};
	public void eraseNode() {};
	public void eraseSub() {};
	public void eraseAll() {};
	public void wake() {};

	/**
	* Reads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			myStr = (FlexString) (myv.getProperty("myStr"));
			VersionBuffer.chkNul(myStr);
			myDrawObj = (Meta) (myv.getProperty("myDrawObj"));
			myExpNode = (ExpNode) (myv.getProperty("myExpNode"));
			myMable = (IntObj) (myv.getProperty("myMable"));
			VersionBuffer.chkNul(myMable);
			myDomain = (IntObj) (myv.getProperty("myDomain"));
			VersionBuffer.chkNul(myDomain);
			myIODef = (IntObj) (myv.getProperty("myIODef"));
			VersionBuffer.chkNul(myIODef);
			myMvec = (Mvec) (myv.getProperty("myMvec"));
			VersionBuffer.chkNul(myMvec);
		}
		catch (ClassCastException e) {
			throw (new DataFormatException(e));
		}
	}

	/**
	* Writes persistent data.
	*
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setProperty("myStr", myStr);
		if (myDrawObj != null)
			myv.setProperty("myDrawObj", myDrawObj);
		if (myExpNode != null)
			myv.setProperty("myExpNode", myExpNode);
		myv.setProperty("myMable", myMable);
		myv.setProperty("myDomain", myDomain);
		myv.setProperty("myIODef", myIODef);
		myv.setProperty("myMvec", myMvec);

		out.writeObject(myv);
	}

	private final void dvSetMark(int in) {
		mark = in;
	}
	private final void dvCopyStr(FlexString in) {
		in.copyAllInfo(myStr);
	}
	private final void dvSetDrawObj(Meta in) {
		myDrawObj = in;
	}
	private final void dvSetExpNode(ExpNode in) {
		myExpNode = in;
	}
	private final void dvSetMableVal(int in) {
		myMable.value = in;
	}
	private final Mvec dvGetMvec() {
		return (myMvec);
	}
	private final Mvec dvGetMinimizationMvec() {
		return (minimizationMvec);
	}
	/**
	* Gets the "mark" of the node.  This is used by the Linker to determine if
	* the node was visited by a particular operation.
	*/
	public final int getMark() {
		return (mark);
	};
	/**
	* Gets the "mark" of the node.  This is used by the Linker to determine if
	* the node was visited by a particular operation.
	*/
	public final int getAuxMark() {
		return (auxMark);
	};
	/**
	* Sets the "mark" of the node.  This is used by the Linker to determine if
	* the node was visited by a particular operation.
	*/
	public final void setMark(int InMark) {
		mark = InMark;
	};
	/**
	* Sets the "mark" of the node.  This is used by the Linker to determine if
	* the node was visited by a particular operation.
	*/
	public final void setAuxMark(int InMark) {
		auxMark = InMark;
	};
	/**
	* Gets the node's variable name.
	*/
	public final FlexString getStr() {
		return (myStr);
	};
	/**
	* Gets the expression to which the variable is assigned.  If no such
	* expression exists, null is returned.
	*/
	public final ExpNode getExpNode() {
		return (myExpNode);
	};
	/**
	* Sets the expression to which the variable is assigned, or "null"
	* for no expression.
	*/
	public final void setExpNode(ExpNode InExp) {
		myExpNode = InExp;
	};
	/**
	* Gets the multivector that a solver should minimize to.
	*/
	public final Mvec getMinimizationMvec() {
		return (minimizationMvec);
	};
	/**
	* Gets the multivector for the variable.
	*/
	public final Mvec getMvec() {
		return (myMvec);
	};
	/**
	* Sets the multivector for the variable.
	*/
	public final void setMvec(Mvec in) {
		myMvec = in;
	};
	/**
	* Gets the "display list object" for the variable.  This is an abstract
	* used by the application calling {@link GeomEngine}.  It can store
	* any application-specific data.  Usually, it either contains a depictoral
	* object directly using the variable, or a clustering index that points
	* to the holder of the variable in an efficient fashion.
	*/
	public final Meta getDrawObj() {
		return (myDrawObj);
	};
	/**
	* Sets the "display list object" for the variable.  This is an abstract
	* used by the application calling {@link GeomEngine}.  It can store
	* any application-specific data.  Usually, it either contains a depictoral
	* object directly using the variable, or a clustering index that points
	* to the holder of the variable in an efficient fashion.
	*/
	public final void setDrawObj(Meta in) {
		myDrawObj = in;
	};
	/**
	* Gets whether the variable is "movable" (e.g. not fixed).  Mable is
	* an abbreviation for "movable".
	*/
	public final int getMable() {
		return (myMable.value);
	};
	/**
	* Sets whether the variable is "movable".
	*/
	public final void setMable(int in) {
		myMable.value = in;
	};
	/**
	* Gets a reference to whether the variable is "movable".
	*/
	public final IntObj getMablePtr() {
		return (myMable);
	};
	/**
	* Gets the domain of the variable.
	*/
	public final int getDomain() {
		return (myDomain.value);
	};
	/**
	* Sets the domain of the variable.
	*/
	public final void setDomain(int in) {
		myDomain.value = in;
	};
	/**
	* Gets a reference to the domain of the variable.
	*/
	public final IntObj getDomainPtr() {
		return (myDomain);
	};
	/**
	* Gets the input/output status of the variable.
	*/
	public final int getIODef() {
		return (myIODef.value);
	};
	/**
	* Sets the input/output status of the variable.
	*/
	public final void setIODef(int in) {
		myIODef.value = in;
	};
	/**
	* Gets a reference to the input/output status of the variable.
	*/
	public final IntObj getIODefPtr() {
		return (myIODef);
	};
	/**
	* Sets an aux. reference for misc. uses.
	*/
	public final void setRefCon(Object in) {
		refCon = in;
	}
	/**
	* Gets an aux. reference for misc. uses.
	*/
	public final Object getRefCon() {
		return (refCon);
	}
	/**
	* Gets the cousin of this node when a DynRunner is executing.
	*/
	public ASGNode getDynCousin() {
		return (dynCousin);
	}

	/**
	* Sets the cousin of this node when a DynRunner is executing.
	*/
	public void setDynCousin(ASGNode in) {
		dynCousin = in;
	}

	private transient int mark;
	private transient int auxMark;
	private transient final Mvec minimizationMvec = new Mvec();
	private FlexString myStr = new FlexString();
	private Meta myDrawObj;
	private ExpNode myExpNode;
	private IntObj myMable = new IntObj();
	private IntObj myDomain = new IntObj();
	private IntObj myIODef = new IntObj();
	private Mvec myMvec = new Mvec();
	private Object refCon = null;

	private ASGNode dynCousin = null;
};
