



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



package meta;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Hashtable;



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
 *    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | Debugging other systems.                                             | Added some debug statements, and then removed them.  Should be essentially no functionality changes.
 *    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
 *    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Re-organize package relationships.                                   | Moved class to package meta.
 *    | 08/07/2004            | Thorn Green (viridian_1138@yahoo.com)           | Establish baseline for all changes in the last year.                 | Establish baseline for all changes in the last year.
 *    | 10/13/2005            | Thorn Green (viridian_1138@yahoo.com)           | Update copyright.                                                    | Update copyright.
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
 * VersionBuffer is a class that allows objects to support persistence in a way
 * that is relatively robust to versioning changes over a program's life cycle.
 * Although VersionBuffer can not handle something as drastic as a complete
 * schema change, it is very useful when items in a schema add or change some
 * of their properties.  VersionBuffer implements an object-oriented version of
 * a property list.  Items are read from or written to the list by assigning
 * each item to a key of type String.  One advantage of this keyed access is that
 * objects can be read in a different order from how they are written.  In many
 * complex schema the best order for writing information is not always the same
 * as the best order for reading it.  VersionBuffer insulates the application
 * from this difficulty.
 * <P>
 * Several kinds of versioning are supported by version buffer:
 * <P>
 * Case #1: a particular property changes its object type in a new version of the
 * software.  For instance, a java.awt.Point in JDK 1.1 could change to a Point2D.
 * In the new version of the software, read the tag into a variable of type Object
 * and then use the "instanceof" operator to interrogate it.  If it's a Point object
 * from the old file format, convert it.  If it's a Point2D from the new file format,
 * use it as-is.
 * <P>
 * Case #2: a piece of kluge data is not needed any more in the new version of the software.
 * Simply stop reading and writing
 * that particular tag in the new version of the software.  Older files will still work,
 * they'll simply contain a tag that you're no longer paying attention to.
 * <P>
 * Case #3: a completely new property is added to some object.  Attempt to read the
 * object using the new tag.  If the result is null, you're reading the old file format
 * and you need to insert some default for that property.  If it's non-null, you're
 * reading the new file format and you can use the object as-is.  Note that when reading
 * from an old format, the default for reading old data may not be the same as the default
 * for creating new data.  Suppose you create a program that does everything in 12 point
 * font (without saving any font data in its file format), and then somebody says "I want to be
 * able to change the font, and I want the default font on new documents to be 24 point."
 * When reading an old-format file, the default font size that you would insert into
 * your data would most likely be 12 point.  But when the user creates a new document, the
 * default for that document would be 24 point.
 * <P>
 * Due to time limitations on the author this is not a comprehensive description, but it should give
 * one some ideas about how to handle versioning with this class.
 * @author Thorn Green
 */
public class VersionBuffer extends Object implements Externalizable {
    private static Hashtable myTable = new Hashtable();
    private static int unqID = 5;
    
    public final static boolean WRITE = true;
    public final static boolean READ = false;
    
    /**
	* Version number used to support versioned persistence.
	*/
	static final long serialVersionUID = (VersionBuffer.class).getName().hashCode() + "v3/98A".hashCode();
    
    /**
     * Creates a new VersionBuffer saving data to a persistent store.  One
     * should always pass <code>true</code> to the parameter.
     */
    public VersionBuffer(boolean write) {
        myId = unqID;
        unqID++;
        
        idStr = "[" + ((new Integer(myId)).toString()) + "]";
        
        myList = new HighLevelList();
    }
    
    /**
     * This constructor exists to support serial storage only.  Do not
     * use it directly.
     */
    public VersionBuffer() {
        myId = unqID;
        unqID++;
        
        idStr = "[" + ((new Integer(myId)).toString()) + "]";
        
        myList = new HighLevelList();
    }
    
    /**
     * Reads a property from the version buffer.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public Object getProperty(String key) {
        return (getProperty(key, null));
    }
    
    /**
     * Reads a property from the version buffer.  If the property
     * does not exist, the default value will be returned.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public Object getProperty(String key, Object defaultValue) {
        Object myo = null;
        VersionBufferNode myv =
                (VersionBufferNode) (myTable.get(getHashKey(key)));
        if (myv != null)
            myo = myv.getValue();
        else
            myo = defaultValue;
        return (myo);
    }
    
    /**
     * Reads a property from the version buffer.  If the property
     * does not exist, DataFormatException will be thrown.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public Object getPropertyEx(String key) throws DataFormatException {
        Object ret = getProperty(key);
        if (ret == null)
            throw (new DataFormatException());
        return (ret);
    }
    
    /**
     * Reads a double from the buffer.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public double getDouble(String key) throws DataFormatException {
        Object myo = getProperty(key);
        try {
            return (((Number) myo).doubleValue());
        } catch (Exception ex) {
            throw (new DataFormatException(ex));
        }
    }
    
    /**
     * Reads a int from the buffer.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public int getInt(String key) throws DataFormatException {
        Object myo = getProperty(key);
        try {
            return (((Number) myo).intValue());
        } catch (Exception ex) {
            throw (new DataFormatException(ex));
        }
    }
    
    /**
     * Reads a boolean from the buffer.  This method only works when
     * the VersionBuffer has been read from serial storage.
     */
    public boolean getBoolean(String key) throws DataFormatException {
        Object myo = getProperty(key);
        try {
            return (((Boolean) myo).booleanValue());
        } catch (Exception ex) {
            throw (new DataFormatException(ex));
        }
    }
    
    /**
     * Writes a object to the buffer.  This method only works if
     * the boolean constructor was used with a parameter of <code>true</code>.
     */
    public void setProperty(String key, Object in) {
        if (in != null) {
            String hashKey = getHashKey(key);
            VersionBufferNode vbn = new VersionBufferNode(myId, key, hashKey, in);
            myList.insertRight(vbn);
            myTable.put(hashKey, vbn);
        } else
            throw (new RuntimeException("Disallowed Null Ref Set"));
    }
    
    /**
     * Writes a double to the buffer.  This method only works if
     * the boolean constructor was used with a parameter of <code>true</code>.
     */
    public void setDouble(String key, double in) {
        setProperty(key, new Double(in));
    }
    
    /**
     * Writes a int to the buffer.  This method only works if
     * the boolean constructor was used with a parameter of <code>true</code>.
     */
    public void setInt(String key, int in) {
        setProperty(key, new Integer(in));
    }
    
    /**
     * Writes a boolean to the buffer.  This method only works if
     * the boolean constructor was used with a parameter of <code>true</code>.
     */
    public void setBoolean(String key, boolean in) {
        setProperty(key, new Boolean(in));
    }
    
    /**
     * Throws a data format exception if the input reference is null.  Otherwise, does nothing.
     */
    public static void chkNul(Object in) throws DataFormatException {
        if (in == null)
            throw (new DataFormatException());
    }
    
    /**
     * Writes the buffer data to serial storage.  This method only works if
     * the boolean constructor was used with a parameter of <code>true</code>.
     * <P>
     * @serialData TBD.
     */
    public void writeExternal(ObjectOutput out) throws IOException {
        if (!(myList.empty())) {
            boolean Done = false;
            myList.searchHead();
            
            while (!Done) {
                VersionBufferNode myo = (VersionBufferNode) (myList.getNode());
                
                if (myo.getCallerId() == myId) {
                    out.writeObject( myo.getUserKey());
                    Object ob = myo.getValue();
                    if (ob == null) {
                        throw (new RuntimeException("Output Value Is Null."));
                    }
                    out.writeObject(ob);
                }
                
                myList.right();
                Done = myList.getHead();
            }
            
        }
        
        out.writeObject( new Integer(-1)); /* stop */
    }
    
    /**
     * Reads the buffer data from serial storage.
     */
    public void readExternal(ObjectInput in)
    throws IOException, ClassNotFoundException {
        /* System.out.println( "Start Read External" ); */
        if (myId == 0) {
            myId = unqID;
            unqID++;
            idStr = "[" + ((new Integer(myId)).toString()) + "]";
        }
        if (myList == null)
            myList = new HighLevelList();
        if (myTable == null)
            myTable = new Hashtable();
        
        Object okey = in.readObject();
        VersionBuffer.chkNul(okey);
        
        while (okey instanceof String) {
            String key = (String) (okey);
            VersionBuffer.chkNul(key);
            /* System.out.println( key ); */
            Object myo = in.readObject();
            VersionBuffer.chkNul(myo);
            String Hash = getHashKey(key);
            VersionBufferNode vbn = new VersionBufferNode(myId, key, Hash, myo);
            myTable.put(Hash, vbn);
            myList.insertRight(vbn);
            
            okey = in.readObject();
        }
        
        if (okey instanceof Integer) {
            Integer kv = (Integer) okey;
            VersionBuffer.chkNul(kv);
            if (kv.intValue() != -1) {
                throw (new DataFormatException());
            }
        } else {
            throw (new DataFormatException());
        }
        
        /* System.out.println( "End Read External" ); */
    }
    
    private final String getHashKey(String userKey) {
        return (idStr + userKey);
    }
    
    /**
     * Flushes the buffer after it's no longer needed.
     */
    protected void handleRemove() {
        if (myList != null) {
            
            if ((myTable != null) && !(myList.empty())) {
                boolean done = false;
                myList.searchHead();
                
                while (!done) {
                    VersionBufferNode vbn =
                            (VersionBufferNode) (myList.getNode());
                    
                    myTable.remove(vbn.getHashKey());
                    
                    myList.right();
                    done = myList.getHead();
                }
            }
            
            myList.eraseAllInfo();
        }
    }
    
    public static Hashtable getMyTable() {
        return( myTable );
    }
    
    public String getIdStr() {
        return( idStr );
    }
    
    /**
     * Flushes the buffer after it's no longer needed.
     */
    protected void finalize() {
        handleRemove();
    }
    
    private HighLevelList myList = null;
    public String idStr = null;
    private int myId = 0;
}
