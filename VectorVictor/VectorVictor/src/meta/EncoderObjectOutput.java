


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
import java.io.ObjectOutput;
import java.util.Vector;



/**
 * @author thorngreen
 *
 * A version of ObjectOutput for supporting Encoders such as XMLEncoder.
 */
public class EncoderObjectOutput implements ObjectOutput {
    
    public EncoderObjectOutput() {
    }
    
    protected final Vector objs = new Vector();
    
        /* (non-Javadoc)
         * @see java.io.ObjectOutput#writeObject(java.lang.Object)
         */
    public void writeObject(Object arg0) throws IOException {
        objs.add(arg0);
        
    }
    
    public Object[] encodeObjects(Externalizable in) throws IOException {
        objs.add(in.getClass().getName());
        in.writeExternal(this);
        return (objs.toArray());
    }
    
    protected void throwEx() {
        throw ( new Meta.UndefinedOperation() );
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#write(int)
         */
    public void write(int arg0) throws IOException {
        throwEx();
        
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#write(byte[])
         */
    public void write(byte[] arg0) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#write(byte[], int, int)
         */
    public void write(byte[] arg0, int arg1, int arg2) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectOutput#flush()
         */
    public void flush() throws IOException {
        // Does Nothing.
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectOutput#close()
         */
    public void close() throws IOException {
        // Does Nothing.
        
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeBoolean(boolean)
         */
    public void writeBoolean(boolean arg0) throws IOException {
        writeObject(new Boolean(arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeByte(int)
         */
    public void writeByte(int arg0) throws IOException {
        writeObject(new Byte((byte) arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeShort(int)
         */
    public void writeShort(int arg0) throws IOException {
        writeObject(new Short((short) arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeChar(int)
         */
    public void writeChar(int arg0) throws IOException {
        writeObject(new Character((char) arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeInt(int)
         */
    public void writeInt(int arg0) throws IOException {
        writeObject(new Integer(arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeLong(long)
         */
    public void writeLong(long arg0) throws IOException {
        writeObject(new Long(arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeFloat(float)
         */
    public void writeFloat(float arg0) throws IOException {
        writeObject(new Float(arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeDouble(double)
         */
    public void writeDouble(double arg0) throws IOException {
        writeObject(new Double(arg0));
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeBytes(java.lang.String)
         */
    public void writeBytes(String arg0) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeChars(java.lang.String)
         */
    public void writeChars(String arg0) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.DataOutput#writeUTF(java.lang.String)
         */
    public void writeUTF(String arg0) throws IOException {
        throwEx();
    }
    
}
