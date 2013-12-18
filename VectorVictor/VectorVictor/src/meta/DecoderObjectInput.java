



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



/**
 * @author thorngreen
 *
 * A version of ObjectInput that is called by ExFac upon a decode request from a
 * Decoder such as XMLDecoder.
 */
public class DecoderObjectInput implements ObjectInput {
    
    protected int index = 0;
    
    protected Object[] readObjs = null;
    
    public DecoderObjectInput(Object[] _readObjs) {
        readObjs = _readObjs;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#readObject()
         */
    public Object readObject() throws IOException {
        index++;
        return (readObjs[index]);
    }
    
    public Externalizable decodeObjects()
    throws
            ClassNotFoundException,
            IOException,
            IllegalAccessException,
            InstantiationException {
        String cname = (String) (readObjs[0]);
        Object obj = ( Class.forName( cname, true, Meta.getDefaultClassLoader() ) ).newInstance();
        Externalizable ret = (Externalizable) (obj);
        ret.readExternal(this);
        return (ret);
    }
    
    protected void throwEx() {
        throw (new Meta.UndefinedOperation() );
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#read()
         */
    public int read() throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#read(byte[])
         */
    public int read(byte[] arg0) throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#read(byte[], int, int)
         */
    public int read(byte[] arg0, int arg1, int arg2) throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#skip(long)
         */
    public long skip(long arg0) throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#available()
         */
    public int available() throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.ObjectInput#close()
         */
    public void close() throws IOException {
        // Does Nothing.
        
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readFully(byte[])
         */
    public void readFully(byte[] arg0) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readFully(byte[], int, int)
         */
    public void readFully(byte[] arg0, int arg1, int arg2) throws IOException {
        throwEx();
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#skipBytes(int)
         */
    public int skipBytes(int arg0) throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readBoolean()
         */
    public boolean readBoolean() throws IOException {
        Boolean intv = (Boolean) (readObject());
        return (intv.booleanValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readByte()
         */
    public byte readByte() throws IOException {
        Byte intv = (Byte) (readObject());
        return (intv.byteValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readUnsignedByte()
         */
    public int readUnsignedByte() throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readShort()
         */
    public short readShort() throws IOException {
        Short intv = (Short) (readObject());
        return (intv.shortValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readUnsignedShort()
         */
    public int readUnsignedShort() throws IOException {
        throwEx();
        return 0;
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readChar()
         */
    public char readChar() throws IOException {
        Character intv = (Character) (readObject());
        return (intv.charValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readInt()
         */
    public int readInt() throws IOException {
        Integer intv = (Integer) (readObject());
        return (intv.intValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readLong()
         */
    public long readLong() throws IOException {
        Long intv = (Long) (readObject());
        return (intv.longValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readFloat()
         */
    public float readFloat() throws IOException {
        Float intv = (Float) (readObject());
        return (intv.floatValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readDouble()
         */
    public double readDouble() throws IOException {
        Double intv = (Double) (readObject());
        return (intv.doubleValue());
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readLine()
         */
    public String readLine() throws IOException {
        throwEx();
        return null;
    }
    
        /* (non-Javadoc)
         * @see java.io.DataInput#readUTF()
         */
    public String readUTF() throws IOException {
        throwEx();
        return null;
    }
    
}
