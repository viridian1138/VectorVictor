


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



package geomdir.config;

import geomdir.DrawObj;
import geomdir.Ktool;
import geomdir.engine.DepicPlugin;
import geomdir.engine.SolverLinkage;

public class Config {
	
	public Config()
	{
	}
	
	public static class ToolRec
	{
		public ToolRec( Class<? extends Ktool> _clss , String _aliasName )
		{
			clss = _clss;
			aliasName = _aliasName;
		}
		public Class<? extends Ktool> clss;
		public String aliasName;
	};
	
	
	public static class SolverRec
	{
		public SolverRec( Class<? extends SolverLinkage> _clss , String _humanName )
		{
			clss = _clss;
			humanName = _humanName;
		}
		public Class<? extends SolverLinkage> clss;
		public String humanName;
	};
	
	
	
	public static class DrawObjRec
	{
		public DrawObjRec( Class<? extends DrawObj> _clss , String _aliasName )
		{
			clss = _clss;
			aliasName = _aliasName;
		}
		public Class<? extends DrawObj> clss;
		public String aliasName;
	};
	
	
	
	
	public static class DepicPluginRec
	{
		public DepicPluginRec( Class<? extends DepicPlugin> _clss )
		{
			clss = _clss;
		}
		public Class<? extends DepicPlugin> clss;
	};

	
	
	
	
	
	public ToolRec[] getToolRecs()
	{
		ToolRec[] recs = {
				null,
				new ToolRec( Ktool.GeoPadTool.class , "GeoPad Tool" ),
				new ToolRec( Ktool.SelectionTool.class , "Selection Tool" ),
				new ToolRec( Ktool.ColorTool.class , "Properties Tool" ),
				new ToolRec( Ktool.FreeTransTool.class , "Free Transformation Tool" ),
				new ToolRec( Ktool.TranslateTool.class , "Translate Tool" ),
				new ToolRec( Ktool.RotateTool.class , "Rotate Tool" ),
				new ToolRec( Ktool.DilateTool.class , "Dilate Tool" ),
				new ToolRec( Ktool.LabelTool.class , "Label Tool" )
		};
		return( recs );
	}
	
	
	
	public SolverRec[] getSolverRecs()
	{
		SolverRec[] recs = {
				new SolverRec( geomdir.solvers.BluePackSolverLinkage.class , "[Symbolic] BluePack (~DeltaBlue)" ),
				new SolverRec( geomdir.solvers.BlueTohSolverLinkage.class , "[Symbolic] BlueToh (~DeltaBlue)" ),
				new SolverRec( geomdir.solvers.StatSolverLinkageTG_B.class , "[Numerical] StatTG_B (Experimental)" )
		};
		return( recs );
	}
	
	
	
	public DrawObjRec[] getDrawObjRecs()
	{
		DrawObjRec[] recs = {
				
				new DrawObjRec( geomdir.depictors.Ssca1.class , "ModSegment Scalar Type I" ),

				new DrawObjRec( geomdir.depictors.Dsca1.class , "Oriented Scalar Type I" ),

						new DrawObjRec( geomdir.depictors.Vect1.class , "Vector Type I" ),

						new DrawObjRec( geomdir.depictors.Vect2.class , "Vector Type II" ),

						new DrawObjRec( geomdir.depictors.Angle1.class , "GA Phasor Type I" ),

						new DrawObjRec( geomdir.depictors.Angle2.class , "GA Phasor Type II" ),

						new DrawObjRec( geomdir.depictors.Para1.class , "Para. Bivector Type I" ),

						new DrawObjRec( geomdir.depictors.Lnseg1.class , "Line Segment Type I" ),

						new DrawObjRec( geomdir.depictors.Ray1.class , "Ray Type I" ),

						new DrawObjRec( geomdir.depictors.Line1.class , "Line Type I" ),

						new DrawObjRec( geomdir.depictors.Circ1.class , "Circle Type I" ),

						new DrawObjRec( geomdir.depictors.Label1.class , "Label Type I" ),

						new DrawObjRec( geomdir.depictors.Bar1.class , "Bargraph Type I" ),

						new DrawObjRec( geomdir.depictors.Twist1.class , "Twistor Type I" ),

						new DrawObjRec( geomdir.depictors.Compar1.class , "Scalar Comparison Type I" ),

						new DrawObjRec( geomdir.depictors.Direc1.class , "Directional Type I" ),

						new DrawObjRec( geomdir.depictors.DirecArc1.class , "Directional Arc Type I" ),

						new DrawObjRec( geomdir.depictors.Ruler1.class , "Ruler Type I" ),

						new DrawObjRec( geomdir.depictors.Rlax1.class , "Real Axis Type I" ),

						new DrawObjRec( geomdir.depictors.Numer1.class , "Numeric Display Type I" ),

						new DrawObjRec( geomdir.depictors.Tracer1.class , "Tracer Type I" ),

						new DrawObjRec( geomdir.depictors.Ucon1.class , "Unit Control Type I" ),

						// !!!!! new DrawObjRec( geomdir.depictors.Bez1.class , "Bezier Type I" ),

						new DrawObjRec( geomdir.depictors.Rlss1.class , "Ruled Mark Type I" ),

						new DrawObjRec( geomdir.depictors.Pdca1.class , "Proportional Diagram Constraint Type I" ),

						new DrawObjRec( geomdir.depictors.Tracer2.class , "Tracer Type II" )
								
		};
		return( recs );
	}
	
	
	
	
	public DepicPluginRec[] getDepicPluginRecs()
	{
		DepicPluginRec[] recs = {
				new DepicPluginRec( geomdir.TrigDepicPlugin.class ),
				new DepicPluginRec( geomdir.applied.WidthPlugin.class ),
				new DepicPluginRec( geomdir.depictors.Tracer2Plugin.class )
		};
		return( recs );
	}
	
	
	
	
}


