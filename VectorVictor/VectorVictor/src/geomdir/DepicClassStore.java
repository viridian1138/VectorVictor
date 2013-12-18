




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

import geomdir.config.Config;

import java.lang.reflect.Method;
import java.net.URL;
import java.util.HashMap;
import java.util.Vector;

import meta.FlexString;
import meta.WrapRuntimeException;
import verdantium.utils.VTextProperties;


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
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 11/17/2001            | Thorn Green (viridian_1138@yahoo.com)           | Add online docs. to depictors.                                       | Added/changed some APIs to support this.
*    | 01/02/2002            | Thorn Green (viridian_1138@yahoo.com)           | Regressions in file loading.                                         | Added some echo printing, then removed.  Should be no real changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 04/08/2003            | Thorn Green (viridian_1138@yahoo.com)           | Discovery of depictors.                                              | Added code to implement discovery of depictors.
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
* Stores the classes of a set of depictors that allows them to be accessed by either
* name, class, or number.
*/
public class DepicClassStore extends Object {
	/**
	* HashMap that maps depictor classes to {@link DepicNode} objects.
	*/
	protected final HashMap classMap = new HashMap();

	/**
	* HashMap that maps human readable names to {@link DepicNode} objects.
	*/
	protected final HashMap nameMap = new HashMap();

	/**
	* Static HashMap that maps depictor classes to {@link DepicNode} objects, for discovery.
	*/
	protected final static HashMap staticClassMap = new HashMap();

	/**
	* Static HashMap that maps human readable names to {@link DepicNode} objects, for discovery.
	*/
	protected final static HashMap staticNameMap = new HashMap();

	/**
	* Vector that maps depictor index numbers to {@link DepicNode} objects.
	*/
	protected final Vector numberMap = new Vector();

	/**
	* Adds an element to the index structure.
	*/
	protected void addElement(DepicNode in, int slot) {
		classMap.put(in.DepicDrawObj, in);
		if (staticClassMap.get(in.DepicDrawObj) == null)
			staticClassMap.put(in.DepicDrawObj, in);
		nameMap.put(in.AliasName, in);
		if (staticNameMap.get(in.AliasName) == null)
			staticNameMap.put(in.AliasName, in);
		numberMap.setElementAt(in, slot);
	}

	/*
	<B>Fun:</B> Loads in the various depictors for the calling client.
	<P>
	<B>In:</B> The context to load across, the input properties, and the access key.
	<B>Out:</B> Elements added to the store.
	<B>Pre:</B> Depictors exist in properties list.
	<B>Post:</B> The classes for the depictors will be placed in the structure.
	@author Thorn Green
	*/
	public void doGet(Config config, int offset) {
		try {
			Config.DrawObjRec[] recs = config.getDrawObjRecs();
			
			int max = recs.length;
			int count;
			numberMap.setSize(max + offset);

			//port.setSubjectLab("Loading Depictors...");
			//port.setLoadLab("  ");
			//port.setLoadFract(0, max);

			for (count = 0; count < max; count++) {

				Class<? extends DrawObj> drCls = recs[ count ].clss;

				String aliasName = recs[ count ].aliasName;

				doGetElement(drCls, aliasName, count, offset);

				//port.setLoadLab(aliasName);
				//port.setLoadFract(count + 1, max);

			}
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException(ex));
		}
	}

	/*
	<B>Fun:</B> Loads in a particular depictor for the calling client.
	<P>
	<B>In:</B> The context to load across, the input properties, and the access key.
	<B>Out:</B> An element will be added to the store.
	<B>Pre:</B> Depictors exist in properties list.
	<B>Post:</B> The class for the depictor will be placed in the list.
	@author Thorn Green
	*/
	protected void doGetElement(Class<? extends DrawObj> drObj, String aliasName, int slot, int offset) {
		boolean selfNaming = false;
		DepicNode myD = new DepicNode();

		DepicNode xD = (DepicNode) (staticNameMap.get(aliasName));
		if (xD != null) {
			myD.DepicDrawObj = xD.DepicDrawObj;
		}
		else {
			try {
				myD.DepicDrawObj = drObj;
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException("Resource Grab Failed", ex));
			}
		}

		/* in.copyString( imgUp );
		
		imgUp.setInsertPoint( imgUp.strlen() );
		imgUp.insertJavaString( "Up.gif" );
		
		myD.DepicImageUp = port.getBaseImage( "images/" , imgUp.exportString() , GetDepics.class ); */

		Class programClass = myD.DepicDrawObj;
		Class[] paramTypes = {};
		Object[] params = {};

		if (xD != null) {
			// myD.DepicImageUp = xD.DepicImageUp;
		}
		else {
			try {
				Method objMeth = (programClass).getMethod("getUpImgUrl", paramTypes);
				URL upURL = (URL) (objMeth.invoke(null, params));
				//myD.DepicImageUp = port.getImage(upURL);
			}
			catch (Exception e) {
				throw (new WrapRuntimeException("Image Grab Failed", e));
			}
		}

		Class[] paramTypes2 = {};
		Object[] params2 = {};

		try {
			Method objMeth = (programClass).getMethod("getSelfNaming", paramTypes2);
			selfNaming = ((Boolean) (objMeth.invoke(null, params2))).booleanValue();
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Resource Grab Failed", e));
		}

		myD.SelfNaming = selfNaming;
		myD.AliasName = aliasName;

		addElement(myD, slot + offset);
	}

	/**
	* Returns the {@link DepicNode} object that is being held in
	* slot <code>slot</code>.
	*/
	public DepicNode getDepictorNode(int slot) {
		DepicNode myC = (DepicNode) (numberMap.elementAt(slot));
		return (myC);
	}

	/**
	* Returns the size of the stored collection of objects.
	*/
	public int getSize() {
		return (numberMap.size());
	}

	/**
	* Returns the human-readable name of the class stored in the list of {@link DepicNode} objects
	* whose class matches <code>inClass</code>.  Returns null if no such class
	* was found.
	*/
	public String getAliasName(Class<? extends DrawObj> inClass) {
		DepicNode myC = (DepicNode) (classMap.get(inClass));
		if (myC == null)
			myC = (DepicNode) (staticClassMap.get(inClass));
		String myStr = null;

		if (myC != null) {
			myStr = myC.AliasName;
			selfNaming = myC.SelfNaming;
		}

		return (myStr);
	}

	/**
	* Returns the class stored in the list of {@link DepicNode} objects
	* whose human-readable name matches <code>alName</code>.  Returns null if no such class
	* was found.
	*/
	public Class<? extends DrawObj> getDepictorClass(String alName) {
		DepicNode myC = (DepicNode) (nameMap.get(alName));
		if (myC == null)
			myC = (DepicNode) (staticNameMap.get(alName));
		Class<? extends DrawObj> myCl = null;

		if (myC != null) {
			myCl = myC.DepicDrawObj;
			selfNaming = myC.SelfNaming;
		}

		return (myCl);
	}

	/**
	* Returns whether the last class found by {@link String getAliasName( Class inClass )}
	* or {@link Class getDepictorClass( String alName )} was self-naming.
	*/
	public boolean getSelfName() {
		return (selfNaming);
	}

	private boolean selfNaming = false;
}
