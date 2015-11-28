

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

import java.util.ArrayList;
import java.util.Iterator;

import com.google.dexmaker.BinaryOp;
import com.google.dexmaker.Code;
import com.google.dexmaker.Comparison;
import com.google.dexmaker.FieldId;
import com.google.dexmaker.Label;
import com.google.dexmaker.Local;
import com.google.dexmaker.MethodId;
import com.google.dexmaker.TypeId;
import com.google.dexmaker.UnaryOp;

/**
 * @author thorngreen
 *
 */
public class CodeFacade {
	
	Code code;
	
	final ArrayList<Runnable> actions = new ArrayList<Runnable>();
	

	/**
	 * 
	 */
	public CodeFacade( Code _code ) {
		code = _code;
	}
	
	
	
	public void write()
	{
		for( final Runnable ii : actions )
		{
			ii.run();
		}
	}
	
	
	
	/**
     * Allocates a new local variable of type {@code type}. It is an error to
     * allocate a local after instructions have been emitted.
     */
    public <T> Local<T> newLocal(TypeId<T> type) {
        return( code.newLocal(type) );
    }

    /**
     * Returns the local for the parameter at index {@code index} and of type
     * {@code type}.
     */
    public <T> Local<T> getParameter(int index, TypeId<T> type) {
        return( code.getParameter(index, type) );
    }

    /**
     * Returns the local for {@code this} of type {@code type}. It is an error
     * to call {@code getThis()} if this is a static method.
     */
    public <T> Local<T> getThis(TypeId<T> type) {
        return( code.getThis(type) );
    }

   

    /**
     * Throws the throwable in {@code toThrow}.
     */
    public void throwValue(final Local<? extends Throwable> toThrow) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.throwValue(toThrow);
        	}
        });
    }

    


    // instructions: locals

    /**
     * Copies the constant value {@code value} to {@code target}. The constant
     * must be a primitive, String, Class, TypeId, or null.
     */
    public <T> void loadConstant(final Local<T> target, final T value) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.loadConstant(target, value);
        	}
        });
    }

    /**
     * Copies the value in {@code source} to {@code target}.
     */
    public <T> void move(final Local<T> target, final Local<T> source) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.move(target, source);
        	}
        });
    }

    // instructions: unary and binary

    /**
     * Executes {@code op} and sets {@code target} to the result.
     */
    public <T> void op(final UnaryOp op, final Local<T> target, final Local<T> source) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.op(op, target, source);
        	}
        });
    }

    /**
     * Executes {@code op} and sets {@code target} to the result. For most
     * binary operations, the types of {@code a} and {@code b} must be the same.
     * Shift operations (like {@link BinaryOp#SHIFT_LEFT}) require {@code b} to
     * be an {@code int}, even when {@code a} is a {@code long}.
     */
    public <T1, T2> void op(final BinaryOp op, final Local<T1> target, final Local<T1> a, final Local<T2> b) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.op(op, target, a, b);
        	}
        });
    }

    // instructions: branches

    /**
     * Compare ints or references. If the comparison is true, execution jumps to
     * {@code trueLabel}. If it is false, execution continues to the next
     * instruction.
     */
    public <T> void compare(final Comparison comparison, final Label trueLabel, final Local<T> a, final Local<T> b) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.compare(comparison, trueLabel, a, b);
        	}
        });
    }

    /**
     * Compare floats or doubles. This stores -1 in {@code target} if {@code
     * a < b}, 0 in {@code target} if {@code a == b} and 1 in target if {@code
     * a > b}. This stores {@code nanValue} in {@code target} if either value
     * is {@code NaN}.
     */
    public <T extends Number> void compareFloatingPoint(
            final Local<Integer> target, final Local<T> a, final Local<T> b, final int nanValue) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.compareFloatingPoint(target, a, b, nanValue);
        	}
        });
    }

    /**
     * Compare longs. This stores -1 in {@code target} if {@code
     * a < b}, 0 in {@code target} if {@code a == b} and 1 in target if {@code
     * a > b}.
     */
    public void compareLongs(final Local<Integer> target, final Local<Long> a, final Local<Long> b) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.compareLongs(target, a, b);
        	}
        });
    }

    // instructions: fields

    /**
     * Copies the value in instance field {@code fieldId} of {@code instance} to
     * {@code target}.
     */
    public <D, V> void iget(final FieldId<D, V> fieldId, final Local<V> target, final Local<D> instance) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.iget(fieldId, target, instance);
        	}
        });
    }

    /**
     * Copies the value in {@code source} to the instance field {@code fieldId}
     * of {@code instance}.
     */
   public <D, V> void iput(final FieldId<D, V> fieldId, final Local<D> instance, final Local<V> source) {
	   actions.add( new Runnable()
       {
       	public void run()
       	{
       		code.iput(fieldId, instance, source);
       	}
       });
    }

    /**
     * Copies the value in the static field {@code fieldId} to {@code target}.
     */
    public <V> void sget(final FieldId<?, V> fieldId, final Local<V> target) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.sget(fieldId, target);
        	}
        });
    }

    /**
     * Copies the value in {@code source} to the static field {@code fieldId}.
     */
    public <V> void sput(final FieldId<?, V> fieldId, final Local<V> source) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.sput(fieldId, source);
        	}
        });
    }

    // instructions: invoke

    /**
     * Calls the constructor {@code constructor} using {@code args} and assigns
     * the new instance to {@code target}.
     */
    public <T> void newInstance(final Local<T> target, final MethodId<T, Void> constructor, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.newInstance(target, constructor, args);
        	}
        });
    }

    /**
     * Calls the static method {@code method} using {@code args} and assigns the
     * result to {@code target}.
     *
     * @param target the local to receive the method's return value, or {@code
     *     null} if the return type is {@code void} or if its value not needed.
     */
    public <R> void invokeStatic(final MethodId<?, R> method, final Local<? super R> target, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.invokeStatic(method, target, args);
        	}
        });
    }

    /**
     * Calls the non-private instance method {@code method} of {@code instance}
     * using {@code args} and assigns the result to {@code target}.
     *
     * @param method a non-private, non-static, method declared on a class. May
     *     not be an interface method or a constructor.
     * @param target the local to receive the method's return value, or {@code
     *     null} if the return type is {@code void} or if its value not needed.
     */
    public <D, R> void invokeVirtual(final MethodId<D, R> method, final Local<? super R> target,
            final Local<? extends D> instance, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.invokeVirtual(method, target, instance, args);
        	}
        });
    }

    /**
     * Calls {@code method} of {@code instance} using {@code args} and assigns
     * the result to {@code target}.
     *
     * @param method either a private method or the superclass's constructor in
     *     a constructor's call to {@code super()}.
     * @param target the local to receive the method's return value, or {@code
     *     null} if the return type is {@code void} or if its value not needed.
     */
    public <D, R> void invokeDirect(final MethodId<D, R> method, final Local<? super R> target,
            final Local<? extends D> instance, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.invokeDirect(method, target, instance, args);
        	}
        });
    }

    /**
     * Calls the closest superclass's virtual method {@code method} of {@code
     * instance} using {@code args} and assigns the result to {@code target}.
     *
     * @param target the local to receive the method's return value, or {@code
     *     null} if the return type is {@code void} or if its value not needed.
     */
    public <D, R> void invokeSuper(final MethodId<D, R> method, final Local<? super R> target,
            final Local<? extends D> instance, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.invokeSuper(method, target, instance, args);
        	}
        });
    }

    /**
     * Calls the interface method {@code method} of {@code instance} using
     * {@code args} and assigns the result to {@code target}.
     *
     * @param method a method declared on an interface.
     * @param target the local to receive the method's return value, or {@code
     *     null} if the return type is {@code void} or if its value not needed.
     */
    public <D, R> void invokeInterface(final MethodId<D, R> method, final Local<? super R> target,
            final Local<? extends D> instance, final Local<?>... args) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.invokeInterface(method, target, instance, args);
        	}
        });
    }

    // instructions: types

    /**
     * Tests if the value in {@code source} is assignable to {@code type}. If it
     * is, {@code target} is assigned to 1; otherwise {@code target} is assigned
     * to 0.
     */
    public void instanceOfType(final Local<?> target, final Local<?> source, final TypeId<?> type) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.instanceOfType(target, source, type);
        	}
        });
    }

    /**
     * Performs either a numeric cast or a type cast.
     *
     * <h3>Numeric Casts</h3>
     * Converts a primitive to a different representation. Numeric casts may
     * be lossy. For example, converting the double {@code 1.8d} to an integer
     * yields {@code 1}, losing the fractional part. Converting the integer
     * {@code 0x12345678} to a short yields {@code 0x5678}, losing the high
     * bytes. The following numeric casts are supported:
     *
     * <p><table border="1">
     * <tr><th>From</th><th>To</th></tr>
     * <tr><td>int</td><td>byte, char, short, long, float, double</td></tr>
     * <tr><td>long</td><td>int, float, double</td></tr>
     * <tr><td>float</td><td>int, long, double</td></tr>
     * <tr><td>double</td><td>int, long, float</td></tr>
     * </table>
     *
     * <p>For some primitive conversions it will be necessary to chain multiple
     * cast operations. For example, to go from float to short one would first
     * cast float to int and then int to short.
     *
     * <p>Numeric casts never throw {@link ClassCastException}.
     *
     * <h3>Type Casts</h3>
     * Checks that a reference value is assignable to the target type. If it is
     * assignable it is copied to the target local. If it is not assignable a
     * {@link ClassCastException} is thrown.
     */
    public void cast(final Local<?> target, final Local<?> source) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.cast(target, source);
        	}
        });
    }

    // instructions: arrays

    /**
     * Sets {@code target} to the length of the array in {@code array}.
     */
    public <T> void arrayLength(final Local<Integer> target, final Local<T> array) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.arrayLength(target, array);
        	}
        });
    }

    /**
     * Assigns {@code target} to a newly allocated array of length {@code
     * length}. The array's type is the same as {@code target}'s type.
     */
    public <T> void newArray(final Local<T> target, final Local<Integer> length) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.newArray(target, length);
        	}
        });
    }

    /**
     * Assigns the element at {@code index} in {@code array} to {@code target}.
     */
    public void aget(final Local<?> target, final Local<?> array, final Local<Integer> index) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.aget(target, array, index);
        	}
        });
    }

    /**
     * Assigns {@code source} to the element at {@code index} in {@code array}.
     */
    public void aput(final Local<?> array, final Local<Integer> index, final Local<?> source) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.aput(array, index, source);
        	}
        });
    }

    // instructions: return

    /**
     * Returns from a {@code void} method. After a return it is an error to
     * define further instructions after a return without first {@link #mark
     * marking} an existing unmarked label.
     */
    public void returnVoid() {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.returnVoid();
        	}
        });
    }

    /**
     * Returns the value in {@code result} to the calling method. After a return
     * it is an error to define further instructions after a return without
     * first {@link #mark marking} an existing unmarked label.
     */
    public void returnValue(final Local<?> result) {
    	actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.returnValue(result);
        	}
        });
    }

    // instructions; synchronized

    /**
     * Awaits the lock on {@code monitor}, and acquires it.
     */
    public void monitorEnter(final Local<?> monitor) {
        actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.monitorEnter(monitor);
        	}
        });
    }

    /**
     * Releases the held lock on {@code monitor}.
     */
    public void monitorExit(final Local<?> monitor) {
        actions.add( new Runnable()
        {
        	public void run()
        	{
        		code.monitorExit(monitor);
        	}
        });
    }

   
    

	

}
