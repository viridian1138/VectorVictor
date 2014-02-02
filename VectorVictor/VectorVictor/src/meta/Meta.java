



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
 *    | 09/29/2001            | Thorn Green (viridian_1138@yahoo.com)           | Meta contained anachronisms from C++ that could hurt performance.    | Removed a number of the anachronisms.
 *    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
 *    | 03/16/2003            | Thorn Green (viridian_1138@yahoo.com)           | ObjectPC did not use defaultClassLoader.                             | Moved defaultClassLoader into Meta to fix this.
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
 * The <code>Meta</code> class defines the class of all data structures.  For more
 * information, see the <A HREF="package.html">Package Docs</A>.
 * @author Thorn Green
 */
public abstract class Meta<T extends Meta> extends Object {
    /**
     * Safety parameter for the checking of illegal operations.  Does nothing in the current version.
     */
    final public static boolean SAFETY = true;
    /**
     * UndefinedOperation error.  Reserved for future expansion.
     */
    public static class UndefinedOperation extends RuntimeException {
        public UndefinedOperation() { super(); } };
        
        /**
         * EmptyData error.  Reserved for future expansion.
         */
        public static class EmptyData extends RuntimeException {
            public EmptyData() { super(); } };
            
            /**
             * TypeMismatch error.  Reserved for future expansion.
             */
            public static class TypeMismatch extends RuntimeException {
                public TypeMismatch() { super(); } };
                
                /**
                 * Switch value for the {@link #copyNode()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_NODE = 1;
                /**
                 * Copies a high-level structure, or the particular node of a low-level structure on which the
                 * method is called.  Internal data is also copied.
                 */
                public T copyNode() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copySub()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_SUB = 2;
                /**
                 * Copies a high-level structure, or the particular node of a low-level structure on which the
                 * method is called and its sub-nodes (if they are defined).  Internal data is also copied  For instance if
                 * called on a low-level list implementation, the method will return a copy of the sub-list starting at the
                 * node on which the method was called.  For a data structure such as a digraph with loops where there is
                 * no clear hierarchy, this operation is undefined.
                 */
                public T copySub() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyAll()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_ALL = 3;
                /**
                 * Copies a high-level structure, or all nodes in a low-level structure.  Internal data is also
                 * copied.
                 */
                public T copyAll() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyData()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_DATA = 4;
                /**
                 * Copies a high-level structure without copying its internal data, returning an empty structure
                 * of identical type.  Undefined for a low-level structure.
                 */
                public T copyData() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyDataPlusPtr()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_DATA_PLUS_PTR = 5;
                /**
                 * For a high-level pointer-oriented data structure such as a high-level linked list, copies the
                 * data structure and gives the new data structure a pointer to the same data as the original structure.
                 * This results in both structures "sharing" the internal data.
                 */
                public T copyDataPlusPtr() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyUser1()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_1 = 6;
                /**
                 * Certain data structures may have "important" copy operations that do not appear in the
                 * list of operations for class Meta.  As a result, methods for "user-defined" copy
                 * operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public T copyUser1() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyUser2()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_2 = 7;
                /**
                 * Certain data structures may have "important" copy operations that do not appear in the
                 * list of operations for class Meta.  As a result, methods for "user-defined" copy
                 * operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public T copyUser2() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyUser3()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_3 = 8;
                /**
                 * Certain data structures may have "important" copy operations that do not appear in the
                 * list of operations for class Meta.  As a result, methods for "user-defined" copy
                 * operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public T copyUser3() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyUser4()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_4 = 9;
                /**
                 * Certain data structures may have "important" copy operations that do not appear in the
                 * list of operations for class Meta.  As a result, methods for "user-defined" copy
                 * operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public T copyUser4() {
                    throwEx();
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyDoNothing()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_DO_NOTHING = 10;
                /**
                 * Returns a pointer to the data structure to which the message was sent.  Makes no other
                 * attempts to copy the data structure.
                 */
                public T copyDoNothing() {
                    return ( (T) this );
                };
                /**
                 * Switch value for the {@link #copyReturnNull()} operation.  Use as a parameter for setCopyMode()
                 * in a high-level DS.
                 */
                final public static int COPY_RETURN_NULL = 11;
                /**
                 * Returns NULL.  Makes no other attempts to copy the data structure.
                 */
                public T copyReturnNull() {
                    return (null);
                };
                /**
                 * Switch value for the {@link #copyNodeInfo(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_NODE_INFO = 12;
                /**
                 * Copies the current node of the internal data of a high level data structure to the
                 * data structure pointed to by "in."  Undefined for most low-level structures.  Tuples are a notable
                 * exception.
                 */
                public void copyNodeInfo(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copySubInfo(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_SUB_INFO = 13;
                /**
                 * Copies the current node of the internal data of a high level data structure and its
                 * sub-nodes (i.e. it copies a sub-list for a list class, a sub-tree for a tree class, etc.) to
                 * the data structure pointed to by "in."  Undefined for most low-level structures.  Tuples are a
                 * notable exception.
                 */
                public void copySubInfo(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyAllInfo(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_ALL_INFO = 14;
                /**
                 * Copies all nodes of the internal data of a high level data structure to the data
                 * structure pointed to by "in."  Undefined for most low-level structures.  Tuples are a notable
                 * exception.
                 */
                public void copyAllInfo(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyDataInfo(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_DATA_INFO = 15;
                /**
                 * This operation actually does nothing because it copies only the internal information
                 * of an empty high-level data structure.  There is no such information.  This method is useful for
                 * certain kinds of propagation control.  Note: one could also call this operation
                 * copyDoNothingInfo().
                 */
                public void copyDataInfo(T in) {};
                /**
                 * Switch value for the {@link #copyDataPlusPtrInfo(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_DATA_PLUS_PTR_INFO = 16;
                /**
                 * For pointer-oriented high-level data structure operations, copies the pointer to one
                 * data structure's internal data to another data structure.
                 */
                public void copyDataPlusPtrInfo(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyUser1info(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_1_INFO = 17;
                /**
                 * Certain data structures may have "important" high-level copy operations that do not
                 * appear in the list of operations for class Meta.  As a result, these four methods for "user-defined"
                 * copy operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public void copyUser1info(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyUser2info(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_2_INFO = 18;
                /**
                 * Certain data structures may have "important" high-level copy operations that do not
                 * appear in the list of operations for class Meta.  As a result, these four methods for "user-defined"
                 * copy operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public void copyUser2info(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyUser3info(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_3_INFO = 19;
                /**
                 * Certain data structures may have "important" high-level copy operations that do not
                 * appear in the list of operations for class Meta.  As a result, these four methods for "user-defined"
                 * copy operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public void copyUser3info(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #copyUser4info(meta.Meta)} operation.  Use as a parameter for setCopyInfoMode()
                 * in a high-level DS.
                 */
                final public static int COPY_USER_4_INFO = 20;
                /**
                 * Certain data structures may have "important" high-level copy operations that do not
                 * appear in the list of operations for class Meta.  As a result, these four methods for "user-defined"
                 * copy operations are provided.  The implementation of a certain data structure can override them in an
                 * application-specific way.
                 */
                public void copyUser4info(T in) {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseNode()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_NODE = 21;
                /**
                 * Erases a high-level structure, or the particular node of a low-level structure on which
                 * the method is called.  Internal data is also erased.
                 */
                public void eraseNode() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseSub()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_SUB = 22;
                /**
                 * Erases a high-level structure, or the particular node of a low-level structure on which
                 * the method is called and its sub-nodes (if they are defined).  Internal data is also erased.  For
                 * instance if called on a low-level list implementation, the method will erase the sub-list starting
                 * at the node on which the method was called.  For a data structure such as a digraph with loops where
                 * there is no clear hierarchy, this operation is undefined.
                 */
                public void eraseSub() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseAll()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_ALL = 23;
                /**
                 * Erases a high-level structure, or all nodes in a low-level structure.  Internal
                 * data is also erased.
                 */
                public void eraseAll() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseData()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_DATA = 24;
                /**
                 * Erases a high-level structure without erasing its internal data.  This operation
                 * is undefined for low-level data structures.
                 */
                public void eraseData() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseNodeInfo()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_NODE_INFO = 25;
                /**
                 * Erases the current node of the internal data of a high-level structure.  This operation
                 * is undefined for a low-level structure.
                 */
                public void eraseNodeInfo() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseSubInfo()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_SUB_INFO = 26;
                /**
                 * Erases the current node and its sub-nodes from the internal data of a high-level
                 * structure.  This operation is undefined for a low-level structure.  For instance if called on a
                 * high-level list implementation, the method will erase the current sub-list of that list.  For a
                 * data structure such as a digraph with loops where there is no clear hierarchy, this operation is
                 * undefined.
                 */
                public void eraseSubInfo() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseAllInfo()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_ALL_INFO = 27;
                /**
                 * Erases all nodes of the internal data of a high-level structure.  This operation is
                 * undefined for a low-level structure.
                 */
                public void eraseAllInfo() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #erasePtrVal()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_PTR_VAL = 28;
                /**
                 * For a pointer-oriented high-level structure, sets the pointer to the structure's
                 * internal data to NULL.  This effectively empties the structure without erasing the internal
                 * data.  This method is undefined for a low-level structure.
                 */
                public void erasePtrVal() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser1()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_1 = 29;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser1() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser2()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_2 = 30;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser2() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser3()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_3 = 31;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser3() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser4()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_4 = 32;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser4() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser1info()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_1_INFO = 33;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser1info() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser2info()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_2_INFO = 34;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser2info() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser3info()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_3_INFO = 35;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser3info() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #eraseUser4info()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int ERASE_USER_4_INFO = 36;
                /**
                 * Certain data structures may have "important" erasure operations that do not appear in
                 * the list of operations for class Meta.  As a result, methods for "user-defined"
                 * erasure operations are provided.  The implementation of a certain data structure can override
                 * them in an application-specific way.
                 */
                public void eraseUser4info() {
                    throwEx();
                };
                /**
                 * Switch value for the {@link #wake()} operation.  Use as a parameter for setEraseMode()
                 * in a high-level DS.
                 */
                final public static int WAKE = 37;
                /**
                 * Doubles as a "eraseDoNothing" operation.
                 */
                public abstract void wake();
                /**
                 * Reserved for future exception-handling purposes.
                 */
                final void throwEx() {
                    throw( new UndefinedOperation() );
                }
                
                protected static ClassLoader defaultClassLoader = Meta.class.getClassLoader();
                
                public static ClassLoader getDefaultClassLoader() {
                    return (defaultClassLoader);
                }
                
                public static void setDefaultClassLoader(ClassLoader in) {
                    defaultClassLoader = in;
                }
                
        /*
         * Applies the mode <code>CopyMode</code> to this object.
         * @return Copy created according to the specified mode.
         */
                public final T exeCopy(int CopyMode) {
                    
                    T temp = null;
                    switch (CopyMode) {
                        case COPY_NODE : /* 1 */
                            temp = copyNode();
                            break;
                        case COPY_SUB : /* 2 */
                            temp = copySub();
                            break;
                        case COPY_ALL : /* 3 */
                            temp = copyAll();
                            break;
                        case COPY_DATA : /* 4 */
                            temp = copyData();
                            break;
                        case COPY_DATA_PLUS_PTR : /* 5 */
                            temp = copyDataPlusPtr();
                            break;
                        case COPY_USER_1 : /* 6 */
                            temp = copyUser1();
                            break;
                        case COPY_USER_2 : /* 7 */
                            temp = copyUser2();
                            break;
                        case COPY_USER_3 : /* 8 */
                            temp = copyUser3();
                            break;
                        case COPY_USER_4 : /* 9 */
                            temp = copyUser4();
                            break;
                        case COPY_DO_NOTHING : /* 10 */
                            temp = copyDoNothing();
                            break;
                        case COPY_RETURN_NULL : /* 11 */
                            temp = copyReturnNull();
                            break;
                    }
                    
                    return (temp);
                }
                
        /*
         * Applies the mode <code>CopyInfoMode</code> to this object,
         * and placing the result in <code>in</code>.
         */
                public final void exeCopyInfo(int CopyInfoMode, T in) {
                    
                    switch (CopyInfoMode) {
                        case COPY_NODE_INFO : /* 12 */
                            copyNodeInfo(in);
                            break;
                        case COPY_SUB_INFO : /* 13 */
                            copySubInfo(in);
                            break;
                        case COPY_ALL_INFO : /* 14 */
                            copyAllInfo(in);
                            break;
                        case COPY_DATA_INFO : /* 15 */
                            copyDataInfo(in);
                            break;
                        case COPY_DATA_PLUS_PTR_INFO : /* 16 */
                            copyDataPlusPtrInfo(in);
                            break;
                        case COPY_USER_1_INFO : /* 17 */
                            copyUser1info(in);
                            break;
                        case COPY_USER_2_INFO : /* 18 */
                            copyUser2info(in);
                            break;
                        case COPY_USER_3_INFO : /* 19 */
                            copyUser3info(in);
                            break;
                        case COPY_USER_4_INFO : /* 20 */
                            copyUser4info(in);
                            break;
                    }
                }
                
                /**
                 * Erases this object (or its internal data) according to
                 * the mode in <code>EraseMode</code>.
                 */
                public final void exeErase(int EraseMode) {
                    
                    switch (EraseMode) {
                        case ERASE_NODE : /* 21 */
                            eraseNode();
                            break;
                        case ERASE_SUB : /* 22 */
                            eraseSub();
                            break;
                        case ERASE_ALL : /* 23 */
                            eraseAll();
                            break;
                        case ERASE_DATA : /* 24 */
                            eraseData();
                            break;
                        case ERASE_NODE_INFO : /* 25 */
                            eraseNodeInfo();
                            break;
                        case ERASE_SUB_INFO : /* 26 */
                            eraseSubInfo : break;
                        case ERASE_ALL_INFO : /* 27 */
                            eraseAllInfo();
                            break;
                        case ERASE_PTR_VAL : /* 28 */
                            erasePtrVal();
                            break;
                        case ERASE_USER_1 : /* 29 */
                            eraseUser1();
                            break;
                        case ERASE_USER_2 : /* 30 */
                            eraseUser2();
                            break;
                        case ERASE_USER_3 : /* 31 */
                            eraseUser3();
                            break;
                        case ERASE_USER_4 : /* 32 */
                            eraseUser4();
                            break;
                        case ERASE_USER_1_INFO : /* 33 */
                            eraseUser1info();
                            break;
                        case ERASE_USER_2_INFO : /* 34 */
                            eraseUser2info();
                            break;
                        case ERASE_USER_3_INFO : /* 35 */
                            eraseUser3info();
                            break;
                        case ERASE_USER_4_INFO : /* 36 */
                            eraseUser4info();
                            break;
                        case WAKE : /* 37 */
                            wake();
                            break;
                    }
                }
                
};
