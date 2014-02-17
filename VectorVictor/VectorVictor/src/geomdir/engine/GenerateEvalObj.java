




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
import geomdir.ObjObj;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.Vector;

import meta.HighLevelList;
import meta.Meta;
import meta.*;

import com.google.dexmaker.BinaryOp;
import com.google.dexmaker.Code;
import com.google.dexmaker.DexMaker;
import com.google.dexmaker.FieldId;
import com.google.dexmaker.Local;
import com.google.dexmaker.MethodId;
import com.google.dexmaker.TypeId;
import com.google.dexmaker.UnaryOp;





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
*    | 07/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed to make GeomEngine competitive with John Cupani's E2D.        | Created classes to improve performance.
*    | 07/24/2002            | Thorn Green (viridian_1138@yahoo.com)           | Small final changes to optimization system.                          | Small final changes to optimization system.
*    | 09/30/2002            | Thorn Green (viridian_1138@yahoo.com)           | Small bugs in plugin handling.                                       | Closed the bugs.
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
* Class for generating EvalObj instances.
* @author Thorn Green
*/
class GenerateEvalObj {
	/**
	* Unique number used to describe current class.
	*/
	protected static int glo_class_num = 1;

	/**
	* Array of all fields to be used in the class.
	*/
	protected static FieldId[] fld_info = null;

	/**
	* All fields for temporary Mvec variables used in evaluation.
	*/
	protected static FieldId<? , Mvec>[] tmp_fld_info = null;

	/**
	* Fields for all variables used in evaluation.
	*/
	protected static FieldId<?, Mvec>[] var_fld_info = null;

	/**
	* Fields for all CompObj used in the evaluation.
	*/
	protected static FieldId[] comp_fld_info = null;

	/**
	* References in the evaluation stack.  Each slot can either point to
	* a temporary, or to an input such as a variable.
	*/
	protected static FieldId<? , Mvec>[] c_ref_fld_info = null;

	/**
	* Field for temporary variable used for misc. purposes.
	*/
	protected static FieldId<?, Mvec> temp_fld = null;

	/**
	* Current index for variables parsed.
	*/
	protected static int var_index = 0;

	/**
	* Current index for CompObj instances parsed.
	*/
	protected static int comp_index = 0;

	/**
	* Generates all of the fields for an EvalObj.
	*/
	protected static void generate_c_fld_info(
		DexMaker dex,
		TypeId<?> f_class,
		HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list,
		int max_stack) {

		TypeId<Mvec> f_desc = TypeId.get( Mvec.class );
		TypeId<Object> comp_desc = TypeId.get( Object.class );
		int acc_flags = Modifier.STATIC | Modifier.PRIVATE;
		int max_var = 0;
		int max_comp = 0;

		code_list.searchHead();
		boolean done = false;
		while (!done) {
			Lexeme lx = code_list.getNode();
			int tag = lx.getMyMatch();
			if (tag == GEval.variable)
				max_var++;
			if (tag == GEval.CompObj)
				max_comp++;
			code_list.right();
			done = code_list.getHead();
		}

		tmp_fld_info = new FieldId[max_stack];
		var_fld_info = new FieldId[max_var];
		comp_fld_info = new FieldId[max_comp];
		c_ref_fld_info = new FieldId[max_stack];

		int count;
		for (count = 0; count < max_stack; count++) {
			FieldId<?,Mvec> fld = f_class.getField( f_desc , "tmp_" + count );
			dex.declare( fld , acc_flags , null );
			tmp_fld_info[count] = fld;
		}

		for (count = 0; count < max_var; count++) {
			FieldId<?,Mvec> fld = f_class.getField( f_desc , "var_" + count );
			dex.declare( fld , acc_flags , null );
			var_fld_info[count] = fld;
		}

		for (count = 0; count < max_comp; count++) {
			FieldId<?,?> fld = f_class.getField( comp_desc , "comp_" + count );
			dex.declare( fld , acc_flags , null );
			comp_fld_info[count] = fld;
		}

		int max_fld = max_stack + max_var + max_comp + 1;
		fld_info = new FieldId[max_fld];
		for (count = 0; count < max_stack; count++) {
			fld_info[count] = tmp_fld_info[count];
		}

		for (count = 0; count < max_var; count++) {
			fld_info[count + max_stack] = var_fld_info[count];
		}

		for (count = 0; count < max_comp; count++) {
			fld_info[count + max_stack + max_var] = comp_fld_info[count];
		}

		{
			FieldId<?,?> result_fld = f_class.getField( f_desc , "result" );
			dex.declare( result_fld , acc_flags , null );
			fld_info[max_fld - 1] = result_fld;
		}

		{
			temp_fld = f_class.getField( f_desc , "temp" );
			dex.declare( temp_fld , acc_flags , null );
			fld_info[max_fld - 1] = temp_fld;
		}

	}

	/**
	* Generates and returns the constructor for an EvalObj.
	*/
	protected static void generate_constructor(
		DexMaker dex,
		TypeId<? extends EvalObj> f_class,
		HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list,
		int max_stack)
		throws IOException {
		
		TypeId<Mvec> mvec_class = TypeId.get( Mvec.class );
		TypeId<Mstack> mstk_class = TypeId.get( Mstack.class );
		TypeId<HighLevelList> hlst_class = TypeId.get( HighLevelList.class );
		TypeId<Lexeme> lexm_class = TypeId.get( Lexeme.class );
		TypeId<EvalObj> eval_class = TypeId.get( EvalObj.class );
		TypeId<ASGNode> asg_class = TypeId.get( ASGNode.class );
		TypeId<Meta> meta_class = TypeId.get( Meta.class );
		TypeId<Object> obj_class = TypeId.get( Object.class );
		// TypeId<Vector> vect_class = TypeId.get( Vector.class );
		
		MethodId<? extends EvalObj,Void> cnst = f_class.getConstructor( mstk_class , hlst_class );
		
		Code codeA = dex.declare( cnst , Modifier.PUBLIC );
		
		CodeFacade code = new CodeFacade( codeA );
		
		

		MethodId<EvalObj, Void> m_super = eval_class.getConstructor( );

		
		MethodId<HighLevelList, Meta> m_gnod = hlst_class.getMethod(meta_class, "getNode");

		
		MethodId<HighLevelList, Void> m_srch = hlst_class.getMethod(TypeId.VOID, "searchHead");

		
		MethodId<HighLevelList, Void> m_right = hlst_class.getMethod(TypeId.VOID, "right");

		
		MethodId<Mstack, Object> m_gobj = mstk_class.getMethod(obj_class, "elementAt", TypeId.INT);

		
		MethodId<Lexeme, Meta> m_gmet = lexm_class.getMethod(meta_class, "getMetaPtr");


		MethodId<ASGNode, Mvec> m_gamv = asg_class.getMethod(mvec_class, "getMvec");
		
		
		code.invokeDirect( m_super , null , code.getThis( f_class ) );
		


		{
			Local<Integer> t0 = code.newLocal(TypeId.INT);
			code.loadConstant( t0 , 0 );
			Local<Object> t1 = code.newLocal( obj_class );
			code.invokeVirtual( m_gobj , t1 , code.getParameter( 0 , mstk_class ) , t0 );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.cast( t2 , t1 );
			code.sput( temp_fld , t2 );
		}

		int count;
		for (count = 1; count < max_stack; count++) {
			Local<Integer> t0 = code.newLocal(TypeId.INT);
			code.loadConstant( t0 , count );
			Local<Object> t1 = code.newLocal( obj_class );
			code.invokeVirtual( m_gobj , t1 , code.getParameter( 0 , mstk_class ) , t0 );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.cast( t2 , t1 );
			code.sput( tmp_fld_info[count] , t2 );
		}

		count = 0;
		int comp_count = 0;
		code_list.searchHead();
		code.invokeVirtual( m_srch , null , code.getParameter( 1 , hlst_class )  );
		boolean done = false;
		while (!done) {
			Lexeme lexm = code_list.getNode();
			int tag = lexm.getMyMatch();
			if (tag == GEval.variable) {
				Local<Meta> t0 = code.newLocal( meta_class );
				code.invokeVirtual( m_gnod , t0 , code.getParameter( 1 , hlst_class ) );
				Local<Lexeme> t1 = code.newLocal( lexm_class );
				code.cast( t1 , t0 );
				Local<Meta> t2 = code.newLocal( meta_class );
				code.invokeVirtual( m_gmet , t2 , t1 );
				Local<ASGNode> t3 = code.newLocal( asg_class );
				code.cast( t3 , t2 );
				Local<Mvec> t4 = code.newLocal( mvec_class );
				code.invokeVirtual( m_gamv , t4 , t3 );
				code.sput( var_fld_info[count] , t4 );
				count++;
			}
			if (tag == GEval.CompObj) {
				TypeId<ObjObj> objc = TypeId.get( ObjObj.class );
				Local<Meta> t0 = code.newLocal( meta_class );
				code.invokeVirtual( m_gnod , t0 , code.getParameter( 1 , hlst_class ) );
				Local<Lexeme> t1 = code.newLocal( lexm_class );
				code.cast( t1 , t0 );
				Local<Meta> t2 = code.newLocal( meta_class );
				code.invokeVirtual( m_gmet , t2 , t1 );
				Local<ObjObj> t3 = code.newLocal( objc );
				code.cast( t3 , t2 );
				FieldId<ObjObj,Object> valFld = objc.getField( obj_class , "value" );
				Local<Object> t4 = code.newLocal( obj_class );
				code.iget( valFld , t4, t3 );
				code.sput( comp_fld_info[comp_count] , t4 );
				comp_count++;
			}
			code_list.right();
			code.invokeVirtual( m_right , null , code.getParameter( 1 , hlst_class )  );
			done = code_list.getHead();
		}

		code.returnVoid();
		code.write();
	}

	/**
	* Generates bytecode for a typical binary operation.
	*/
	protected static int stdBinaryOp(
		String opname,
		int cur_index,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname, mvec_class, mvec_class);

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);
		
		Local<Mvec> t0 = code.newLocal( mvec_class );
		Local<Mvec> t1 = code.newLocal( mvec_class );
		Local<Mvec> t2 = code.newLocal( mvec_class );
		code.sget( c_ref_fld_info[cur_index - 2] , t0 );
		code.sget( c_ref_fld_info[cur_index - 1] , t1 );
		code.sget( temp_fld , t2 );
		code.invokeVirtual( m_op , null , t0 , t1 , t2 );
		Local<Mvec> t3 = code.newLocal( mvec_class );
		code.sget( tmp_fld_info[cur_index - 2] , t3 );
		code.invokeVirtual( m_mcpy , null , t2 , t3 );
		c_ref_fld_info[cur_index - 2] = tmp_fld_info[cur_index - 2];
		int ret = cur_index - 1;
		return (ret);
	}

	/**
	* Handles a unary op. that in Mvec modifies a separate multivector.
	*/
	protected static int biUnaryOp(String opname, int cur_index, TypeId<Mvec> mvec_class, 
			CodeFacade code)
		throws IOException {
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname, mvec_class);

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

		Local<Mvec> t0 = code.newLocal( mvec_class );
		Local<Mvec> t1 = code.newLocal( mvec_class );
		code.sget( c_ref_fld_info[cur_index - 1] , t0 );
		code.sget( temp_fld , t1 );
		code.invokeVirtual( m_op , null , t0 , t1 );
		Local<Mvec> t2 = code.newLocal( mvec_class );
		code.sget( tmp_fld_info[cur_index - 1] , t2 );
		code.invokeVirtual( m_mcpy , null , t1 , t2 );
		c_ref_fld_info[cur_index - 1] = tmp_fld_info[cur_index - 1];
		int ret = cur_index;
		return (ret);
	}

	/**
	* Handles a unary op. that in Mvec modifies the original multivector.
	*/
	protected static int monoUnaryOp(
		String opname,
		int cur_index,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname);

		if (c_ref_fld_info[cur_index - 1] == tmp_fld_info[cur_index - 1]) {
			Local<Mvec> t0 = code.newLocal( mvec_class );
			code.sget( c_ref_fld_info[cur_index - 1] , t0 );
			code.invokeVirtual( m_op , null , t0 );
		}
		else {
			MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

			Local<Mvec> t0 = code.newLocal( mvec_class );
			Local<Mvec> t1 = code.newLocal( mvec_class );
			code.sget( c_ref_fld_info[cur_index - 1] , t0 );
			code.sget( tmp_fld_info[cur_index - 1] , t1 );
			code.invokeVirtual( m_mcpy , null , t0 , t1 );
			c_ref_fld_info[cur_index - 1] = tmp_fld_info[cur_index - 1];
			code.invokeVirtual( m_op , null , t1 );
		}

		int ret = cur_index;
		return (ret);
	}

	/**
	* Handles an operation for setting a particular "canned" constant value.
	*/
	protected static int setValOp(String opname, int cur_index, TypeId<Mvec> mvec_class, 
			CodeFacade code )
		throws IOException {
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname);

		c_ref_fld_info[cur_index] = tmp_fld_info[cur_index];
		Local<Mvec> t0 = code.newLocal( mvec_class );
		code.sget( c_ref_fld_info[cur_index] , t0 );
		code.invokeVirtual( m_op , null , t0 );

		int ret = cur_index + 1;
		return (ret);
	}

	/**
	* Handles the copying of a single input parameter for DeCastBlossom.
	*/
	protected static void handleSingleDcbParmCopy(
		String getOpname,
		String setOpname,
		int mode,
		int cur_index,
		int NumBi,
		int scnt,
		FieldId<?, Object> paramlo,
		TypeId<Mvec[]> c_marr,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, setOpname, TypeId.DOUBLE);

		TypeId<Object> obj_class = TypeId.get( Object.class );
		Local<Object> t0 = code.newLocal( obj_class );
		code.sget( paramlo , t0 );
		Local<Mvec[]> t1 = code.newLocal( c_marr );
		code.cast(t1, t0);
		Local<Integer> t2 = code.newLocal( TypeId.INT );
		code.loadConstant(t2, scnt);
		Local<Mvec> t2a = code.newLocal( mvec_class );
		code.aget(t2a, t1, t2);

		MethodId<Mvec, Double> m_get = mvec_class.getMethod(TypeId.DOUBLE, getOpname);

		Local<Double> t3 = code.newLocal( TypeId.DOUBLE );
		switch (mode) {
			case 0 :
			{
				Local<Mvec> t4 = code.newLocal( mvec_class );
				code.sget( c_ref_fld_info[cur_index - NumBi - scnt - 1] , t4 );
				code.invokeVirtual(m_get, t3, t4);
			}
				break;

			case 1 :
			{
				Local<Mvec> t4 = code.newLocal( mvec_class );
				code.sget( c_ref_fld_info[cur_index - NumBi - scnt - 1] , t4 );
				Local<Double> t5 = code.newLocal( TypeId.DOUBLE );
				code.invokeVirtual(m_get, t5, t4);
				Local<Double> t6 = code.newLocal( TypeId.DOUBLE );
				code.loadConstant(t6, 1.0);
				code.op(BinaryOp.SUBTRACT, t3, t6, t5);
			}
				break;

			case 2 :
			{
				Local<Mvec> t4 = code.newLocal( mvec_class );
				code.sget( c_ref_fld_info[cur_index - NumBi - scnt - 1] , t4 );
				Local<Double> t5 = code.newLocal( TypeId.DOUBLE );
				code.invokeVirtual(m_get, t5, t4);
				code.op(UnaryOp.NEGATE, t3, t5);
			}
				break;
		}

		code.invokeVirtual( m_op , null, t2a, t3 );
		
	}

	/**
	* Handles taking the graded part on a single basis vector.
	*/
	protected static void handleSingleSequest(
		String getOpname,
		String setOpname,
		boolean sequest,
		int cur_index,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		if (!sequest && (tmp_fld_info[cur_index - 1] == c_ref_fld_info[cur_index - 1]))
			return;

		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, setOpname, TypeId.DOUBLE);

		Local<Mvec> t0 = code.newLocal( mvec_class );
		code.sget( tmp_fld_info[cur_index - 1] , t0 );

		Local<Double> t1 = code.newLocal( TypeId.DOUBLE );
		if (sequest)
			code.loadConstant( t1 , 0.0 );
		else {
			MethodId<Mvec, Double> m_get = mvec_class.getMethod(TypeId.DOUBLE, getOpname);

			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget( c_ref_fld_info[cur_index - 1] , t2 );
			code.invokeVirtual(m_get, t1, t2);
		}

		code.invokeVirtual(m_op, null, t0, t1);
	}

	/**
	* Handles an operation for taking the graded part of an expression.
	*/
	protected static int handleSequest(
		Lexeme lexm,
		int cur_index,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		int SwCase = lexm.getPlugMatch();

		handleSingleSequest("getBasis", "setBasis", (SwCase & 1) == 0, cur_index, mvec_class, code);

		handleSingleSequest("getBasis1", "setBasis1", (SwCase & 2) == 0, cur_index, mvec_class, code);

		handleSingleSequest("getBasis2", "setBasis2", (SwCase & 4) == 0, cur_index, mvec_class, code);

		handleSingleSequest("getBasis12", "setBasis12", (SwCase & 8) == 0, cur_index, mvec_class, code);

		c_ref_fld_info[cur_index - 1] = tmp_fld_info[cur_index - 1];
		int ret = cur_index;
		return (ret);
	}

	/**
	* Handles a single basis vector of a numeric constant.
	*/
	protected static void handleSingleConst(
		String setOpname,
		double val,
		int cur_index,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, setOpname, TypeId.DOUBLE);
		Local<Mvec> t0 = code.newLocal( mvec_class );
		code.sget( tmp_fld_info[cur_index] , t0 );
		Local<Double> t1 = code.newLocal( TypeId.DOUBLE );
		code.loadConstant( t1 , val );
		code.invokeVirtual(m_op, null, t0, t1);
	}

	/**
	* Generates opcodes for the use of a GeomEngine variable.
	*/
	protected static int stdVar(int cur_index, CodeFacade stream) throws IOException {
		c_ref_fld_info[cur_index] = var_fld_info[var_index];
		var_index++;
		int ret = cur_index + 1;
		return (ret);
	}

	/**
	* Generates opcodes for a numeric constant.
	*/
	protected static int stdNumConst(
		int cur_index,
		TypeId<Mvec> mvec_class,
		Mvec numConst,
		CodeFacade code)
		throws IOException {
		c_ref_fld_info[cur_index] = tmp_fld_info[cur_index];
		handleSingleConst("setBasis", numConst.getBasis(), cur_index, mvec_class, code);
		handleSingleConst("setBasis1", numConst.getBasis1(), cur_index, mvec_class, code);
		handleSingleConst("setBasis2", numConst.getBasis2(), cur_index, mvec_class, code);
		handleSingleConst("setBasis12", numConst.getBasis12(), cur_index, mvec_class, code);
		int ret = cur_index + 1;
		return (ret);
	}

	/**
	* Generates opcodes for DeCast.
	*/
	protected static int stdDeCast(
		String opname,
		int cur_index,
		Lexeme lexm,
		TypeId<Mvec> mvec_class,
		CodeFacade code )
		throws IOException {
		ObjObj<int[]> tp = (ObjObj<int[]>) (lexm.getMetaPtr());
		int[] vl = tp.value;
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

		TypeId<Mvec[]> c_marr = TypeId.get( "[Lgeomdir/Mvec;" );

		FieldId<?, Object> MyBi = comp_fld_info[comp_index - 1];
		FieldId<?, Object> MyTmp = comp_fld_info[comp_index - 2];
		FieldId<?, Object> MyResult = comp_fld_info[comp_index - 3];

		for (count = 0; count < NumBi; ++count) {
			TypeId<Object> obj_class = TypeId.get( Object.class );
			Local<Object> t0 = code.newLocal( obj_class );
			code.sget( MyBi , t0 );
			Local<Mvec[]> t1 = code.newLocal( c_marr );
			code.cast(t1, t0);
			Local<Integer> nid = code.newLocal( TypeId.INT );
			code.loadConstant( nid , count );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - count - 1], t2);
			code.aput(t1, nid, t2);
		}

		int nret = cur_index - NumBi;
		int nreta = nret - 1;

		FieldId<?, Mvec> phi = c_ref_fld_info[nreta];
		
		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname, 
				TypeId.INT , TypeId.INT , c_marr , mvec_class , c_marr , c_marr );

		
		Local<Mvec> i0 = code.newLocal( mvec_class );
		code.sget( phi , i0 );
		
		
		TypeId<Object> obj_class = TypeId.get( Object.class );
		
		
		Local<Integer> tn0 = code.newLocal( TypeId.INT );
		code.loadConstant( tn0 , NumStep );
		Local<Integer> tn1 = code.newLocal( TypeId.INT );
		code.loadConstant( tn1 , NumBi - 1 );
		
		Local<Object> an2 = code.newLocal( obj_class );
		code.sget( MyBi , an2 );
		Local<Mvec[]> tn2 = code.newLocal( c_marr );
		code.cast(tn2, an2);
		
		Local<Mvec> tn3 = code.newLocal( mvec_class );
		code.sget( phi , tn3 );
		
		Local<Object> an4 = code.newLocal( obj_class );
		code.sget( MyTmp , an4 );
		Local<Mvec[]> tn4 = code.newLocal( c_marr );
		code.cast(tn4, an4);
		
		Local<Object> an5 = code.newLocal( obj_class );
		code.sget( MyResult , an5 );
		Local<Mvec[]> tn5 = code.newLocal( c_marr );
		code.cast(tn5, an5);
		
		code.invokeVirtual(m_op, null, i0, tn0 , tn1 , tn2 , tn3 , tn4 , tn5 );
		
		
		Local<Object> ai6 = code.newLocal( obj_class );
		code.sget( MyResult , ai6 );
		Local<Mvec[]> ti6 = code.newLocal( c_marr );
		code.cast(ti6, ai6);

		Local<Integer> aa7 = code.newLocal( TypeId.INT );
		code.loadConstant( aa7 , MyIndex );
		Local<Mvec> ai7 = code.newLocal( mvec_class );
		code.aget(ai7, ti6, aa7);
		
		c_ref_fld_info[nreta] = tmp_fld_info[nreta];
		
		
		Local<Mvec> ai8 = code.newLocal( mvec_class );
		code.sget(c_ref_fld_info[nreta], ai8);
		
		code.invokeVirtual( m_mcpy , null, ai7 , ai8 );

		return (nret);
	}

	/**
	* Generates opcodes for DeCastBlossom.
	*/
	protected static int stdDeCastBlossom(
		String opname,
		int cur_index,
		Lexeme lexm,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		ObjObj<int[]> tp = (ObjObj<int[]>) (lexm.getMetaPtr());
		int[] vl = tp.value;
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

		TypeId<Mvec[]> c_marr = TypeId.get( "[Lgeomdir/Mvec;" );

		FieldId<?, Object> MyBi = comp_fld_info[comp_index - 1];
		FieldId<?, Object> MyTmp = comp_fld_info[comp_index - 2];
		FieldId<?, Object> MyResult = comp_fld_info[comp_index - 3];
		FieldId<?, Object> paramhi = comp_fld_info[comp_index - 4];

		for (count = 0; count < NumBi; ++count) {
			TypeId<Object> obj_class = TypeId.get( Object.class );
			Local<Object> t0 = code.newLocal( obj_class );
			code.sget( MyBi , t0 );
			Local<Mvec[]> t1 = code.newLocal( c_marr );
			code.cast(t1, t0);
			Local<Integer> nid = code.newLocal( TypeId.INT );
			code.loadConstant( nid , count );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - count - 1], t2);
			code.aput(t1, nid, t2);
		}

		for (count = 0; count < NumStep; ++count) {
			TypeId<Object> obj_class = TypeId.get( Object.class );
			Local<Object> t0 = code.newLocal( obj_class );
			code.sget( paramhi , t0 );
			Local<Mvec[]> t1 = code.newLocal( c_marr );
			code.cast(t1, t0);
			Local<Integer> nid = code.newLocal( TypeId.INT );
			code.loadConstant( nid , count );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - NumBi - count - 1], t2);
			code.aput(t1, nid, t2);
		}

		int nret = cur_index - NumBi - NumStep + 1;
		int nreta = nret - 1;

		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname, 
				TypeId.INT , TypeId.INT , c_marr , c_marr , c_marr , c_marr );
		
		TypeId<Object> obj_class = TypeId.get( Object.class );
		

		Local<Integer> tn0 = code.newLocal( TypeId.INT );
		code.loadConstant( tn0 , NumStep );
		Local<Integer> tn1 = code.newLocal( TypeId.INT );
		code.loadConstant( tn1 , NumBi - 1 );
		
		Local<Object> an2 = code.newLocal( obj_class );
		code.sget( MyBi , an2 );
		Local<Mvec[]> tn2 = code.newLocal( c_marr );
		code.cast(tn2, an2);
		
		Local<Object> an3 = code.newLocal( obj_class );
		code.sget( paramhi , an3 );
		Local<Mvec[]> tn3 = code.newLocal( c_marr );
		code.cast(tn3, an3);
		
		Local<Object> an4 = code.newLocal( obj_class );
		code.sget( MyTmp , an4 );
		Local<Mvec[]> tn4 = code.newLocal( c_marr );
		code.cast(tn4, an4);
		
		Local<Object> an5 = code.newLocal( obj_class );
		code.sget( MyResult , an5 );
		Local<Mvec[]> tn5 = code.newLocal( c_marr );
		code.cast(tn5, an5);
		
		code.invokeStatic(m_op, null, tn0 , tn1 , tn2 , tn3 , tn4 , tn5);
		

		Local<Object> ai6 = code.newLocal( obj_class );
		code.sget( MyResult , ai6 );
		Local<Mvec[]> ti6 = code.newLocal( c_marr );
		code.cast(ti6, ai6);

		Local<Integer> aa7 = code.newLocal( TypeId.INT );
		code.loadConstant( aa7 , MyIndex );
		Local<Mvec> ai7 = code.newLocal( mvec_class );
		code.aget(ai7, ti6, aa7);

		
		c_ref_fld_info[nreta] = tmp_fld_info[nreta];
		
		
		Local<Mvec> ai8 = code.newLocal( mvec_class );
		code.sget(c_ref_fld_info[nreta], ai8);
		
		code.invokeVirtual( m_mcpy , null, ai7 , ai8 );

		return (nret);
	}

	/**
	* Generates opcodes for DeCastBlossomComp.
	*/
	protected static int stdDeCastBlossomComp(
		String opname,
		int cur_index,
		Lexeme lexm,
		TypeId<Mvec> mvec_class,
		CodeFacade code)
		throws IOException {
		ObjObj<int[]> tp = (ObjObj<int[]>) (lexm.getMetaPtr());
		int[] vl = tp.value;
		int NumBi = vl[0];
		int NumStep = vl[1];
		int MyIndex = vl[2];
		int count = 0;

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);
		
		TypeId<Mvec[]> c_marr = TypeId.get( "[Lgeomdir/Mvec;" );
		
		FieldId<?, Object> MyBi = comp_fld_info[comp_index - 1];
		FieldId<?, Object> MyTmp = comp_fld_info[comp_index - 2];
		FieldId<?, Object> MyResult = comp_fld_info[comp_index - 3];
		FieldId<?, Object> paramlo = comp_fld_info[comp_index - 4];
		FieldId<?, Object> paramhi = comp_fld_info[comp_index - 5];

		for (count = 0; count < NumBi; ++count) {
			TypeId<Object> obj_class = TypeId.get( Object.class );
			Local<Object> t0 = code.newLocal( obj_class );
			code.sget( MyBi , t0 );
			Local<Mvec[]> t1 = code.newLocal( c_marr );
			code.cast(t1, t0);
			Local<Integer> nid = code.newLocal( TypeId.INT );
			code.loadConstant( nid , count );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - count - 1], t2);
			code.aput(t1, nid, t2);
		}

		for (count = 0; count < NumStep; ++count) {
			TypeId<Object> obj_class = TypeId.get( Object.class );
			Local<Object> t0 = code.newLocal( obj_class );
			code.sget( paramhi , t0 );
			Local<Mvec[]> t1 = code.newLocal( c_marr );
			code.cast(t1, t0);
			Local<Integer> nid = code.newLocal( TypeId.INT );
			code.loadConstant( nid , count );
			Local<Mvec> t2 = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - NumBi - count - 1], t2);
			code.aput(t1, nid, t2);

			int mode = 1;
			if (vl[count + 3] != 0)
				mode = 2;

			handleSingleDcbParmCopy(
				"getBasis",
				"setBasis",
				mode,
				cur_index,
				NumBi,
				count,
				paramlo,
				c_marr,
				mvec_class,
				code);

			handleSingleDcbParmCopy(
				"getBasis1",
				"setBasis1",
				0,
				cur_index,
				NumBi,
				count,
				paramlo,
				c_marr,
				mvec_class,
				code);

			handleSingleDcbParmCopy(
				"getBasis2",
				"setBasis2",
				0,
				cur_index,
				NumBi,
				count,
				paramlo,
				c_marr,
				mvec_class,
				code);

			handleSingleDcbParmCopy(
				"getBasis12",
				"setBasis12",
				0,
				cur_index,
				NumBi,
				count,
				paramlo,
				c_marr,
				mvec_class,
				code);

			// stream.getstatic(paramlo, 1); ???????????????????????????????
			// stream.checkcast(c_marr); ?????????????????????????????????????????
		}

		int nret = cur_index - NumBi - NumStep + 1;
		int nreta = nret - 1;

		MethodId<Mvec, Void> m_op = mvec_class.getMethod(TypeId.VOID, opname, 
				TypeId.INT , TypeId.INT , c_marr , c_marr , c_marr , c_marr , c_marr );
		
		TypeId<Object> obj_class = TypeId.get( Object.class );

		
		Local<Integer> tn0 = code.newLocal( TypeId.INT );
		code.loadConstant( tn0 , NumStep );
		Local<Integer> tn1 = code.newLocal( TypeId.INT );
		code.loadConstant( tn1 , NumBi - 1 );
		
		Local<Object> an2 = code.newLocal( obj_class );
		code.sget( MyBi , an2 );
		Local<Mvec[]> tn2 = code.newLocal( c_marr );
		code.cast(tn2, an2);
		
		Local<Object> an3 = code.newLocal( obj_class );
		code.sget( paramlo , an3 );
		Local<Mvec[]> tn3 = code.newLocal( c_marr );
		code.cast(tn3, an3);
		
		Local<Object> an4 = code.newLocal( obj_class );
		code.sget( paramhi , an4 );
		Local<Mvec[]> tn4 = code.newLocal( c_marr );
		code.cast(tn4, an4);
		
		Local<Object> an5 = code.newLocal( obj_class );
		code.sget( MyTmp , an5 );
		Local<Mvec[]> tn5 = code.newLocal( c_marr );
		code.cast(tn5, an5);
		
		Local<Object> an6 = code.newLocal( obj_class );
		code.sget( MyResult , an6 );
		Local<Mvec[]> tn6 = code.newLocal( c_marr );
		code.cast(tn6, an6);
		
		code.invokeStatic(m_op, null, tn0 , tn1 , tn2 , tn3 , tn4 , tn5, tn6);

		
		Local<Object> ai7 = code.newLocal( obj_class );
		code.sget( MyResult , ai7 );
		Local<Mvec[]> ti7 = code.newLocal( c_marr );
		code.cast(ti7, ai7);

		Local<Integer> aa8 = code.newLocal( TypeId.INT );
		code.loadConstant( aa8 , MyIndex );
		Local<Mvec> ai8 = code.newLocal( mvec_class );
		code.aget(ai8, ti7, aa8);
		
		
		c_ref_fld_info[nreta] = tmp_fld_info[nreta];
		
		
		Local<Mvec> ai9 = code.newLocal( mvec_class );
		code.sget(c_ref_fld_info[nreta], ai9);
		
		code.invokeVirtual( m_mcpy , null, ai8 , ai9 );

		return (nret);
	}

	/**
	* Generates opcodes for the use of a GeomEngine plugin.
	*/
	protected static int stdPlugOp(int cur_index, Lexeme lexm, TypeId<Mvec> mvec_class, CodeFacade code)
		throws IOException {
		int count = 0;
		int val = lexm.getPlugMatch();
		int PlugID = val / GeomEngine.PlugOffsetBase;
		Vector<DepicPlugin> Plugs = GeomEngine.getPlugins();
		DepicPlugin MyPlug = Plugs.elementAt(PlugID);
		String methodName = MyPlug.getStaticMethodName(val);
		int numArgs = MyPlug.getNumStaticArgs(val);
		int offset = MyPlug.getMstackOffset(val);

		MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

		TypeId<? extends DepicPlugin> plug_class = TypeId.get( MyPlug.getClass() );

		TypeId<Mvec>[] argTypes = new TypeId[ numArgs ];
		for (count = 0; count < numArgs; count++)
			argTypes[ count ] = mvec_class;
		
		Local<Mvec>[] args = new Local[ numArgs ];
		int na1 = numArgs - 1;
		for (count = 0; count < na1; ++count) {
			Local<Mvec> mv = code.newLocal( mvec_class );
			code.sget(c_ref_fld_info[cur_index - na1 + count], mv);
			args[ count ] = mv;
		}
		Local<Mvec> mv = code.newLocal( mvec_class );
		code.sget(temp_fld, mv);
		args[ count ] = mv;
		
		MethodId<? extends DepicPlugin, Void> m_plug = plug_class.getMethod(TypeId.VOID, methodName, argTypes );
		
		code.invokeStatic(m_plug, null, args);
		

		int idx = cur_index + offset - 1;
		c_ref_fld_info[idx] = tmp_fld_info[idx];
		Local<Mvec> a0 = code.newLocal( mvec_class );
		code.sget(temp_fld, a0);
		Local<Mvec> a1 = code.newLocal( mvec_class );
		code.sget(c_ref_fld_info[idx], a1);
		
		code.invokeVirtual(m_mcpy, null, a0, a1);

		int ret = cur_index + offset;

		return (ret);
	}

	/**
	* Handled a single operation in the code list.  Analyzes the input Lexeme, and
	* sends appropriate opcodes to the code stream.
	*/
	protected static int handleOp(
		int cur_index,
		Lexeme lexm,
		CodeFacade stream,
		TypeId<? extends EvalObj> f_class,
		TypeId<Mvec> mvec_class)
		throws IOException {
		int ret = cur_index;
		int op = lexm.getMyMatch();

		switch (op) {
			case GEval.vplus : /* 6 */
				ret = stdBinaryOp("vaddz", cur_index, mvec_class, stream);
				break;

			case GEval.vminus : /* 7 */
				ret = stdBinaryOp("vsubz", cur_index, mvec_class, stream);
				break;

			case GEval.plus : /* 4 */
				ret = stdBinaryOp("add", cur_index, mvec_class, stream);
				break;

			case GEval.minus : /* 5 */
				ret = stdBinaryOp("sub", cur_index, mvec_class, stream);
				break;

			case GEval.variable : /* 31 */
				ret = stdVar(cur_index, stream);
				break;

			case GEval.NumConst : /* 32 */
				ret = stdNumConst(cur_index, mvec_class, lexm.getMvec(), stream);
				break;

			case GEval.Lbrac : /* 15 */
				ret = handleSequest(lexm, cur_index, mvec_class, stream);
				break;

			case GEval.magnitude : /* 24 */
				ret = monoUnaryOp("magnitude", cur_index, mvec_class, stream);
				break;

			case GEval.UnitOf : /* 35 */
				ret = monoUnaryOp("unitOf", cur_index, mvec_class, stream);
				break;

			case GEval.prod : /* 8 */
				ret = stdBinaryOp("mult", cur_index, mvec_class, stream);
				break;

			case GEval.div : /* 9 */
				ret = stdBinaryOp("divide", cur_index, mvec_class, stream);
				break;

			case GEval.dot : /* 10 */
				ret = stdBinaryOp("dot", cur_index, mvec_class, stream);
				break;

			case GEval.wedge : /* 12 */
				ret = stdBinaryOp("wedge", cur_index, mvec_class, stream);
				break;

			case GEval.negation : /* 33 */
				ret = monoUnaryOp("minus", cur_index, mvec_class, stream);
				break;

			case GEval.cross : /* 11 */
				ret = stdBinaryOp("cross", cur_index, mvec_class, stream);
				break;

			case GEval.inverse : /* 23 */
				ret = monoUnaryOp("inverse", cur_index, mvec_class, stream);
				break;

			case GEval.exp : /* 17 */
				ret = biUnaryOp("exp", cur_index, mvec_class, stream);
				break;

			case GEval.cos : /* 18 */
				ret = biUnaryOp("cos", cur_index, mvec_class, stream);
				break;

			case GEval.sin : /* 19 */
				ret = biUnaryOp("sin", cur_index, mvec_class, stream);
				break;

			case GEval.sinh : /* 20 */
				ret = biUnaryOp("sinh", cur_index, mvec_class, stream);
				break;

			case GEval.cosh : /* 21 */
				ret = biUnaryOp("cosh", cur_index, mvec_class, stream);
				break;

			case GEval.reverse : /* 22 */
				ret = monoUnaryOp("reverse", cur_index, mvec_class, stream);
				break;

			case GEval.basis12 : /* 25 */
				ret = setValOp("setToBasis12", cur_index, mvec_class, stream);
				break;

			case GEval.basis1 : /* 26 */
				ret = setValOp("setToBasis1", cur_index, mvec_class, stream);
				break;

			case GEval.basis2 : /* 27 */
				ret = setValOp("setToBasis2", cur_index, mvec_class, stream);
				break;

			case GEval.pi : /* 28 */
				ret = setValOp("setToPi", cur_index, mvec_class, stream);
				break;

			case GEval.PhasToVect : /* 34 */
				ret = biUnaryOp("phasToVect", cur_index, mvec_class, stream);
				break;

			case GEval.ln : /* 36 */
				ret = biUnaryOp("ln", cur_index, mvec_class, stream);
				break;

			case GEval.DeCastBlossomLeftComp : /* 37 */
				ret = stdDeCastBlossomComp("deCastBlossomLeftComp", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.CompObj : /* 39 */
				comp_index++;
				break;

			case GEval.DeCastBlossomRightComp : /* 40 */
				ret = stdDeCastBlossomComp("deCastBlossomRightComp", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.DeCastBlossomLeft : /* 41 */
				ret = stdDeCastBlossom("deCastBlossomLeft", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.DeCastBlossomRight : /* 42 */
				ret = stdDeCastBlossom("deCastBlossomRight", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.DeCastLeft : /* 43 */
				ret = stdDeCast("deCastLeft", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.DeCastRight : /* 44 */
				ret = stdDeCast("deCastRight", cur_index, lexm, mvec_class, stream);
				break;

			case GEval.PlugOp :
				ret = stdPlugOp(cur_index, lexm, mvec_class, stream);
				break;

			default :
				{
					throw (new RuntimeException("Don't know how to do that. " + cur_index));
				}
				//			break;

		}

		return (ret);
	}

	/**
	* Generates an EvalObj given the describing class file object,
	* stack and original code list.
	*/
	protected static EvalObj createEvalObj(DexMaker dexMaker, String cname, Mstack stk, HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list)
		throws Exception {
		
		File dataDirectory = null; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		ClassLoader loader = dexMaker.generateAndLoad(
			       Meta.getDefaultClassLoader(), dataDirectory );
		
		Class<? extends EvalObj> clss = (Class<? extends EvalObj>)( loader.loadClass( cname ) );
		Class[] typ = { Mstack.class, HighLevelList.class };
		Object[] param = { stk, code_list };
		Constructor<? extends EvalObj> cnst = clss.getConstructor(typ);
		EvalObj eval = cnst.newInstance(param);
		if (eval == null)
			throw (new RuntimeException("createEvalObj Failed."));
		return (eval);
	}

	/**
	* Generates the method for an EvalObj that actually performs the evaluation.
	*/
	protected static void generate_evaluator(
		DexMaker dex,
		TypeId<? extends EvalObj> f_class,
		HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list)
		throws IOException {
		
		TypeId<Mvec> mvec_class = TypeId.get( Mvec.class );
		
		MethodId<? extends EvalObj,Void> eval = f_class.getMethod(TypeId.VOID, "eval", mvec_class);
		
		Code codeA = dex.declare( eval , Modifier.PUBLIC | Modifier.FINAL );
		
		CodeFacade code = new CodeFacade( codeA );

		
		/* Have the bottom of the stack point to the result, so there's no need
			to perform a post-copy. */
		Local<Mvec> t0 = code.getParameter(0, mvec_class);
		code.sput(tmp_fld_info[0], t0);

		int cur_index = 0;

		code_list.searchHead();
		boolean done = false;
		while (!done) {
			Lexeme lexm = code_list.getNode();
			cur_index = handleOp(cur_index, lexm, code, f_class, mvec_class);
			code_list.right();
			done = code_list.getHead();
		}

		if (c_ref_fld_info[0] != tmp_fld_info[0]) {
			MethodId<Mvec, Void> m_mcpy = mvec_class.getMethod(TypeId.VOID, "mcpy", mvec_class);

			Local<Mvec> tn0 = code.newLocal( mvec_class );
			code.sget(var_fld_info[0], tn0);			
			Local<Mvec> tn1 = code.newLocal( mvec_class );
			code.sget(tmp_fld_info[0], tn1);
			code.invokeVirtual(m_mcpy, null, tn0, tn1);
		}

		code.returnVoid();
		code.write();
	}

	/**
	* Produces an optimized EvalObj given the current stack, and a code list describing
	* what to evaluate.
	*/
	protected static EvalObj createEvalObj(int max_stack, Mstack stk, HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list) throws Exception {
		int class_num = glo_class_num;
		glo_class_num++;

		DexMaker dex = new DexMaker();
		
		TypeId<? extends EvalObj> this_class = TypeId.get( "Lgeomdir/engine/ctp_" + class_num + ";" );
		TypeId<EvalObj> super_class = TypeId.get( EvalObj.class );
		
		String fileName = "ctp_" + class_num;
		
		dex.declare( this_class , fileName , Modifier.PUBLIC | Modifier.FINAL , super_class );

		String cname = "geomdir.engine.ctp_" + class_num;

		generate_c_fld_info(dex, this_class, code_list, max_stack);

		generate_constructor(dex, this_class, code_list, max_stack);
		generate_evaluator(dex, this_class, code_list);

		return (createEvalObj(dex, cname, stk, code_list));
	}

	/**
	* Attaches an optimized EvalObj to the ExpNode <code>exp</code>
	* using stack data in <code>stk</code>.
	*/
	public static void attachEvalObj(ExpNode exp, Mstack stk) {
		if (exp.getEval() == null) {
			int max_stack = exp.getMstackSpaceRequired();
			HighLevelList<StdLowLevelList<Lexeme>,Lexeme> code_list = exp.getCodeList();
			EvalObj eval = null;
			try {
				eval = createEvalObj(max_stack, stk, code_list);
				exp.setEval(eval);
				/* System.out.println( "Generate seems to have worked." ); */
			}
			catch (Throwable ex) {
				ex.printStackTrace(System.out);
			}

			fld_info = null;

			tmp_fld_info = null;
			var_fld_info = null;
			comp_fld_info = null;

			temp_fld = null;

			var_index = 0;
			comp_index = 0;
		}
	}

} /* End GenerateEvalObj */
