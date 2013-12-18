



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

import geomdir.engine.GeomEngine;
import meta.FlexString;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;

public interface IFactoryModel {
	
	/**
	* Gets the list of variables and depictors.
	*/
	public DGPHashMap getVarList();
	
	/**
	* Gets the list of depictor types supported by the model.
	*/
	public DepicClassStore getDepicStore();
	
	/**
	* Gets the class associated with a particular depicotr mode.
	*/
	public Class<? extends DrawObj> getDepictorClass(int AltMode);
	
	/**
	*<B>Fun:</B> Returns the depictor node given the palette number of a particular depictor.
	*<P>
	*<B>In:</B> The palette number in AltMode, the list of depictor types in DepicStore.<BR>
	*<B>Out:</B> DepicNode returned.<BR>
	*<B>Pre:</B> AltMode is in the proper range.  DepicStore is valid.  DepicStore is non-empty.
	*	DepicStore is a list of DepicNode objects.<BR>
	*<B>Post:</B> The proper depictor node will be returned.<BR>
	*@author Thorn Green
	*/
	public DepicNode getDepictorNode(int altMode);
	
	/**
	* Gets the unique value to use for the fragment ID.
	*/
	public int getUnqID();
	
	/**
	* Sets the unique value to be used for the fragment ID.
	*/
	public void setUnqID(int in);
	
	/**
	*<B>Fun:</B> Creates a depiction image for a particular symbol string.
	*<P>
	*<B>In:</B> String to depict.  Color to depict string as.<BR>
	*<B>Out:</B> Depiction image returned.<BR>
	*<B>Pre:</B> Symbol depiction software is working properly.  Input string is valid.<BR>
	*<B>Post:</B> Image will be returned which depicts symbol.<BR>
	*@author Thorn Green.
	*/
	public MathImage makeDepicMathImage(String ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException;
	
	/**
	* Stores information for undo-ing the creation of a depictor.  Not implemented.
	* Reserved for future expansion.
	*/
	public void pushUndoMakeDepic(FlexString Vari);
	
	/**
	*<B>Fun:</B> Conditionally copies the value of one multivector
	*	into the value of another.
	*<P>
	*<B>In:</B> The multivectors to copy and a state flag.<BR>
	*<B>Out:</B> Output multivector modified.<BR>
	*<B>Pre:</B> Input object are valid.<BR>
	*<B>Post:</B> The fields of the output multivector which are
	*	zero will be reset to match the input multivector.<BR>
	*@author Thorn Green
	*/
	void depicCopyVector(boolean state, Mvec InVec, Mvec OutVec);
	
	/**
	* Appends a depictor to all views.
	*/
	public void displayAppend(DrawObj MyObj);
	
	/**
	* Repaints all views.
	*/
	public void globalRepaint();
	
	/**
	* Gets the engine.
	*/
	public GeomEngine getMyEngine();
	
	/**
	*<B>Fun:</B> Determines after a symbolic operation whether
	*	objects can be deleted as independent instances.
	*<P>
	*<B>In:</B> The FragNode to check.<BR>
	*<B>Out:</B> FragNode modified.<BR>
	*<B>Pre:</B> Input object is valid.<BR>
	*<B>Post:</B> If the symbol is unconstrained, objects can be
	*	deleted as independent instances.  If the
	*	symbol is constrained, then objects may be
	*	deleted as independent instances if there is
	*	more than one depictor object.<BR>
	*@author Thorn Green
	*/
	public void refigureAlloc(FragNode MyFrg);

}

