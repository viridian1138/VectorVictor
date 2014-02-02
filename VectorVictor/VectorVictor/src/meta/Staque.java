



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
 *    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
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
 * Staque stands for "stack-queue" or
 * "stack and queue".  The Staque class uses the functionality of
 * {@link HighLevelList} to implement both a linked stack and a linked queue.
 * That is to say, Staque is a single data structure which functions as both a stack and a queue.
 * Typical stack and queue operations (e.g. Push, Pop, Enq, Deq) are supported.  Both standard and
 * Alt-nodes are supported.
 * @author Thorn Green
 */
public class Staque<U extends LowLevelList, T extends Meta> extends Meta<Staque<U,T>> {
    /**
     * @see meta.Meta
     */
    public Staque<U,T> copyNode() {
        Staque<U,T> temp = new Staque<U,T>();
        qHighLevelList.copyNodeInfo(temp.dvGetQHighLevelList());
        return (temp);
    };
    /**
     * @see meta.Meta
     */
    public Staque<U,T> copySub() {
        Staque<U,T> temp = new Staque<U,T>();
        qHighLevelList.copySubInfo(temp.dvGetQHighLevelList());
        return (temp);
    };
    /**
     * @see meta.Meta
     */
    public Staque<U,T> copyAll() {
        Staque<U,T> temp = new Staque<U,T>();
        qHighLevelList.copyAllInfo(temp.dvGetQHighLevelList());
        return (temp);
    };
    /**
     * @see meta.Meta
     */
    public Staque<U,T> copyData() {
        Staque<U,T> temp = new Staque<U,T>();
        qHighLevelList.copyDataInfo(temp.dvGetQHighLevelList());
        return (temp);
    };
    /**
     * @see meta.Meta
     */
    public Staque<U,T> copyDataPlusPtr() {
        Staque<U,T> temp = new Staque<U,T>();
        qHighLevelList.copyDataPlusPtrInfo(temp.dvGetQHighLevelList());
        return (temp);
    };
    /**
     * @see meta.Meta
     */
    public void copyNodeInfo(Staque<U,T> in) {
        Staque<U,T> temp = in;
        qHighLevelList.copyNodeInfo(temp.dvGetQHighLevelList());
    };
    /**
     * @see meta.Meta
     */
    public void copySubInfo(Staque<U,T> in) {
        Staque<U,T> temp = in;
        qHighLevelList.copySubInfo(temp.dvGetQHighLevelList());
    };
    /**
     * @see meta.Meta
     */
    public void copyAllInfo(Staque<U,T> in) {
        Staque<U,T> temp = in;
        qHighLevelList.copyAllInfo(temp.dvGetQHighLevelList());
    };
    /**
     * @see meta.Meta
     */
    public void copyDataInfo(Staque<U,T> in) {
        Staque<U,T> temp = in;
        qHighLevelList.copyDataInfo(temp.dvGetQHighLevelList());
    };
    /**
     * @see meta.Meta
     */
    public void copyDataPlusPtrInfo(Staque<U,T> in) {
        Staque<U,T> temp = in;
        qHighLevelList.copyDataPlusPtrInfo(temp.dvGetQHighLevelList());
    };
    /**
     * @see meta.Meta
     */
    public void eraseNode() {
        qHighLevelList.eraseNodeInfo();
    };
    /**
     * @see meta.Meta
     */
    public void eraseSub() {
        qHighLevelList.eraseSubInfo();
    };
    /**
     * @see meta.Meta
     */
    public void eraseAll() {
        qHighLevelList.eraseAllInfo();
    };
    /**
     * @see meta.Meta
     */
    public void eraseData() {};
    /**
     * @see meta.Meta
     */
    public void eraseNodeInfo() {
        qHighLevelList.eraseNodeInfo();
    };
    /**
     * @see meta.Meta
     */
    public void eraseSubInfo() {
        qHighLevelList.eraseSubInfo();
    };
    /**
     * @see meta.Meta
     */
    public void eraseAllInfo() {
        qHighLevelList.eraseAllInfo();
    };
    /**
     * @see meta.Meta
     */
    public void erasePtrVal() {
        qHighLevelList.erasePtrVal();
    };
    /**
     * @see meta.Meta
     */
    public void wake() {};
    
    /**
     * Adds an element as if the DS is a queue.
     */
    public final void enq(T in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.insertLeft(in);
    };
    /**
     * Pushes an element as if the DS is a stack.
     */
    public final void push(T in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.insertLeft(in);
    };
    /**
     * Adds an element as if the DS is a queue.
     */
    public final void importEnq(U in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.importInsertLeft(in);
    };
    /**
     * Pushes an element as if the DS is a stack.
     */
    public final void importPush(U in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.importInsertLeft(in);
    };
    
    /**
     * Pops a stack node.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B> <BR>
     * <B>Pre:</B> The stack is not empty.  The stack is properly constructed.<BR>
     * <B>Post:</B> The node will be deleted, and its value returned.
     * <P>
     * @return The popped node.
     *
     * @author Thorn Green
     */
    public final T pop() {
        HighLevelList<U,T> ql = qHighLevelList;
        T temp = ql.getNode();
        
        ql.eraseNodeInfo();
        return (temp);
    };
    
    /**
     * Deqs a queue node.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B> <BR>
     * <B>Pre:</B> The queue is not empty.  The queue is properly constructed.<BR>
     * <B>Post:</B> The node will be deleted, and its value returned.
     * <P>
     * @return The deq-ed node.
     * @author Thorn Green
     */
    public final T deq() {
        T temp;
        
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        temp = ql.getNode();
        ql.eraseNodeInfo();
        return (temp);
    };
    
    /**
     * Returns true if the DS is empty.
     */
    public final boolean empty() {
        HighLevelList<U,T> ql = qHighLevelList;
        return (ql.empty());
    };
    
    /**
     * Gets the front node of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The node value will be returned.
     * <P>
     * @return The front node.
     * @author Thorn Green
     */
    public final T getFrontNode() {
        T temp;
        
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        temp = ql.getNode();
        ql.right();
        return (temp);
    };
    
    /**
     * Gets the rear node of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The node value will be returned.
     * <P>
     * @return The rear node.
     * @author Thorn Green
     */
    public final T getRearNode() {
        HighLevelList<U,T> ql = qHighLevelList;
        return (ql.getNode());
    };
    
    /**
     * Gets the front copy mode of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The copy mode value will be returned.
     * <P>
     * @return The front copy mode.
     * @author Thorn Green
     */
    public final int getFrontCopyMode() {
        int temp;
        
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        temp = ql.getCopyMode();
        ql.right();
        return (temp);
    };
    
    /**
     * Gets the rear copy mode of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The copy mode value will be returned.
     * <P>
     * @return The rear copy mode.
     * @author Thorn Green
     */
    public final int getRearCopyMode() {
        HighLevelList<U,T> ql = qHighLevelList;
        return (ql.getCopyMode());
    };
    
    /**
     * Gets the front erase mode of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The erase mode value will be returned.
     * <P>
     * @return The front erase mode.
     * @author Thorn Green
     */
    public final int getFrontEraseMode() {
        int temp;
        
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        temp = ql.getEraseMode();
        ql.right();
        return (temp);
    };
    
    /**
     * Gets the rear erase mode of a stack or queue.
     * <P>
     * <B>In:</B> None.<BR>
     * <B>Out:</B><BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The erase mode value will be returned.
     * <P>
     * @return The rear erase mode.
     * @author Thorn Green
     */
    public final int getRearEraseMode() {
        HighLevelList<U,T> ql = qHighLevelList;
        return (ql.getEraseMode());
    };
    
    /**
     * Sets the front node of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The front node will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setFrontNode(T in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        ql.setNode(in);
        ql.right();
    };
    
    /**
     * Sets the rear node of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The rear node will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setRearNode(T in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.setNode(in);
    };
    
    /**
     * Sets the front copy mode of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The copy mode will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setFrontCopyMode(int in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        ql.setCopyMode(in);
        ql.right();
    };
    
    /**
     * Sets the rear copy mode of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The copy mode will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setRearCopyMode(int in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.setCopyMode(in);
    };
    
    /**
     * Sets the front erase mode of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The erase mode will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setFrontEraseMode(int in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.left();
        ql.setEraseMode(in);
        ql.right();
    };
    
    /**
     * Sets the rear erase mode of a stack or queue.
     * <P>
     * <B>In:</B> The node value to set.<BR>
     * <B>Out:</B> Staque modified.<BR>
     * <B>Pre:</B> The Staque is not empty.  The Staque is properly constructed.<BR>
     * <B>Post:</B> The erase mode will be set.
     * <P>
     * @author Thorn Green
     */
    public final void setRearEraseMode(int in) {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.setEraseMode(in);
    };
    
    private final HighLevelList<U,T> dvGetQHighLevelList() {
        return (qHighLevelList);
    }
    public final void iStaque() {
        HighLevelList<U,T> ql = qHighLevelList;
        ql.iHighLevelList();
    };
    public Staque() {
        this.iStaque();
    };
    private final HighLevelList<U,T> qHighLevelList = new HighLevelList<U,T>();
};
