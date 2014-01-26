



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





package geomdir.applied;

import geomdir.DGMNode;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

import meta.FlexString;



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
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Migrated code from OrderedList to JCF.
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
* A "Clipboard" set containing a set of depictors
* that has been "copied" or "cut".  See the
* documentation for interface java.util.Set for
* more information on the Set interface.
* Assumes that none of the set elements are null.
*
* @author Thorn Green
*/
public class ClipSet extends Object implements Set<DGMNode>
	{
/**
* The map containing the set relations.
*/
	private TreeMap<FlexString,DGMNode> map = new TreeMap<FlexString,DGMNode>();

/**
* Adds an element to the set.
*/
	public boolean add(DGMNode tg) 
		{
		if( contains( tg ) )
			return( false );

		map.put( tg.getMyDraw().getFragID() , tg );
		return( true );
		}

/**
* Adds a collection of elements to the set.
*/
	public boolean addAll(Collection<? extends DGMNode> c)
		{
		boolean ret = false;
		Iterator<? extends DGMNode> it = c.iterator();
		while( it.hasNext() )
			{
			DGMNode nd = it.next();
			boolean rt = add( nd );
			ret = ret || rt;
			}
		return( ret );
		}

/**
* Clears the set.
*/
	public void clear()
		{ map.clear(); }

/**
* Returns true iff. the set contains object o.
*/
	public boolean contains(Object o)
		{
		DGMNode tg = (DGMNode) o;
		return( map.keySet().contains( tg.getMyDraw().getFragID() ) );
		}

/**
* Returns true iff. the set contains all objects in the collection.
*/
	public boolean containsAll(Collection<?> c)
		{
		boolean cont = true;
		Iterator<?> it = c.iterator();
		while( cont && it.hasNext() )
			{
			DGMNode nd = (DGMNode)( it.next() );
			cont = cont && ( contains( nd ) );
			}
		return( cont );
		}

/**
* Returns if the object equals this set.
*/
	public boolean equals(Object o)
		{
		if( o instanceof Set )
			{
			Set<?> st = (Set<?>) o;
			return( ( size() == st.size() ) && containsAll( st ) );
			}

		return( false );
		}

/**
* Returns the hash code for the set.
*/
	public int hashCode() 
                {
		int val = 0;
		Iterator<FlexString> it = map.keySet().iterator();
		while( it.hasNext() )
			{
			FlexString nd = it.next();
			val += nd.hashCode();
			}
		return( val );
		}

/**
* Returns whether the set is empty.
*/
	public boolean isEmpty()
		{ return( map.isEmpty() ); }

/**
* Returns an iterator for the set.
*/
	public Iterator<DGMNode> iterator()
		{ return( map.values().iterator() ); }

/**
* Removes an object from the set.
*/
	public boolean remove(Object o)
		{
		if( o == null )
			return( map.remove( null ) != null );

		DGMNode tg = (DGMNode) o;
		return( map.remove( tg ) != null );
		}

/**
* Removes a collection of objects from the set.
*/
	public boolean removeAll(Collection<?> c)
		{
		boolean ret = true; 
		Iterator<?> it = c.iterator();
		while( it.hasNext() )
			{
			DGMNode nd = (DGMNode)( it.next() );
			boolean rt = remove( nd );
			ret = ret && rt;
			}

		return( ret );
		}

/**
* Not supported.
*/
	public boolean retainAll(Collection<?> c)
		{ throw( new UnsupportedOperationException() ); }

/**
* Returns the number of elements in the set.
*/
	public int size()
		{ return( map.size() ); }

/**
* Returns an array containing the set objects.
*/
	public Object[] toArray()
		{ return( map.values().toArray() ); }

/**
* Returns an array containing the set of objects matching the array type.
*/
	public <T> T[] toArray(T[] arg0) 
		{ return( map.values().toArray( arg0 ) ); }


	}



