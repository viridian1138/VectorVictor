



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

import java.beans.PropertyChangeListener;

import meta.*;
import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import verdantium.EtherEvent;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.mathimage.SymMap;
import verdantium.utils.VTextProperties;
import android.view.MotionEvent;
import android.graphics.RectF;
import android.graphics.PointF;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;

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
*    | 10/29/2000            | Thorn Green (viridian_1138@yahoo.com)           | DynRunner was showing too much information to the depictors.         | Modified DynRunner so that it doesn't show engine classes to depictors.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Compatibility problems between GeomKit and new constraint solvers.   | Made changes so that the two would be more compatible.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Origin changes not supported at the depictor level.                  | Added methods to support origin changes.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/13/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Switched OrderedList classes to JCF.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Removed some methods to support more depictors.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Some operations are not compatible with BlueToh.                     | Improved compatibility.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
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
* A class that implements DepictorPort, but all its methods to some other
* ToolPort except those that draws tools.  By finding the closest control know to
* a particular point, the class estimates the closest depictor to a certain mouse
* click.  This is used to "select" a depictor with the mouse.
* @author Thorn Green
*/
class PointTracker implements DepictorPort {

	protected ToolPort tar;
	protected double MouseX;
	protected double MouseY;
	protected double ShrtDist;
	protected DrawObj ShrtObj;
	protected DrawObj CurObj;
	protected DGMNode CurDGM;

	/**
	* Creates the tracker with the port to delegate methods to.
	*/
	public PointTracker(ToolPort in) {
		tar = in;
	}

	/**
	* Sets the (x,y) of the mouse point, the current mode, and the initial distance
	* to compare against.
	*/
	public DrawObj trackPoints(double inX, double inY, int ThisMode, double Dist) {
		MouseX = inX;
		MouseY = inY;
		ShrtDist = Dist;
		ShrtObj = null;

		Canvas g = null;
		Paint p = new Paint();

		HighLevelList<StdLowLevelList<DGMNode>,DGMNode> DisplayList = new HighLevelList<StdLowLevelList<DGMNode>,DGMNode>();
		tar.getDispList().copyDataPlusPtrInfo(DisplayList);
		boolean Done = false;
		boolean BoundMode = tar.getBoundMode();

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = DisplayList.getNode();
				CurDGM = MyDGM;
				DrawObj MyDrw = MyDGM.getMyDraw();
				CurObj = MyDrw;
				MyDrw.drawYourTools(this, MyDGM.getMyCoord(), BoundMode, g, p, ThisMode);

				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}

		return (ShrtObj);
	}

	/**
	* Checks the orange know location.
	*/
	public void paintOrangeKnob(Canvas g, Paint p, double x, double y) {
		double dx = x - MouseX;
		double dy = y - MouseY;
		double Dist = dx * dx + dy * dy;
		if ((ShrtDist - Dist) > 0.0001) {
			ShrtDist = Dist;
			ShrtObj = CurObj;
		}
	};

	/**
	* Checks the blue knob location.
	*/
	public void paintBlueKnob(Canvas g, Paint p, double x, double y) {
		double dx = x - MouseX;
		double dy = y - MouseY;
		double Dist = dx * dx + dy * dy;
		if ((ShrtDist - Dist) > 0.0001) {
			ShrtDist = Dist;
			ShrtObj = CurObj;
		}
	};
	/**
	* Checks the color knob location.
	*/
	public void paintColorKnob(Canvas g, Paint p, Integer c, double x, double y) {
		double dx = x - MouseX;
		double dy = y - MouseY;
		double Dist = dx * dx + dy * dy;
		if ((ShrtDist - Dist) > 0.0001) {
			ShrtDist = Dist;
			ShrtObj = CurObj;
		}
	};

	public Object processObjEtherEvent(EtherEvent in, Object refcon) throws Throwable {
		return (tar.processObjEtherEvent(in, refcon));
	}
//	public Image makeDepicImage(String ins, Color col, int PtSz) {
//		return (tar.makeDepicImage(ins, col, PtSz));
//	}
	public MathImage makeDepicMathImage(String ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException {
		return (tar.makeDepicMathImage(ins, col, PtSz, depic_named));
	}
	public RectF instanceRect(double x, double y) {
		return (tar.instanceRect(x, y));
	}
	public double defaultGravityField(PointF p, double x, double y) {
		return (tar.defaultGravityField(p, x, y));
	}
	public void externArrow(Canvas g, Paint p, DrawObj caller, Hexar HDhex, Hexar TLhex, int ToolMode) {
		tar.externArrow(g, p, caller, HDhex, TLhex, ToolMode);
	};
//	public void loadMvecProperties(VTextProperties in, String key, Mvec chg) throws DataFormatException {
//		tar.loadMvecProperties(in, key, chg);
//	};
//	public void saveMvecProperties(VTextProperties in, String key, Mvec chg) {
//		tar.saveMvecProperties(in, key, chg);
//	};
	public String getPersistencePrefix(DrawObj in) {
		return (tar.getPersistencePrefix(in));
	}
//	public void registerPersistentConstraint(VTextProperties MyProp, FlexString ConstraintName) {
//		tar.registerPersistentConstraint(MyProp, ConstraintName);
//	}
	public void setNewDeltaVec(DrawObj depic, Mvec in) {
		tar.setNewDeltaVec(depic, in);
	};
	public void setNewDeltaPhas(DrawObj depic, Mvec in) {
		tar.setNewDeltaPhas(depic, in);
	};
	public void setNewPosAVec(DrawObj depic, Mvec in) {
		tar.setNewPosAVec(depic, in);
	};
	public void setNewPosBVec(DrawObj depic, Mvec in) {
		tar.setNewPosBVec(depic, in);
	};
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Hexar hex) {
		tar.hexglo(x, y, cntr, bound, hex);
	};
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Mvec glo, Hexar hex) {
		tar.hexglo(x, y, cntr, bound, glo, hex);
	};
	public void hexloc(Mvec cntr, boolean bound, Hexar hex) {
		tar.hexloc(cntr, bound, hex);
	};
	public void hexloc(Mvec cntr, boolean bound, Mvec glo, Hexar hex) {
		tar.hexloc(cntr, bound, glo, hex);
	};
	public IntObj getRealAng() {
		return (tar.getRealAng());
	};
	public IntObj getImAng() {
		return (tar.getImAng());
	};
	public IntObj getRealBar() {
		return (tar.getRealBar());
	};
	public IntObj getImBar() {
		return (tar.getImBar());
	};
	public Integer getCyanIndex() {
		return (tar.getCyanIndex());
	};
	public Integer getMagentaIndex() {
		return (tar.getMagentaIndex());
	};
	public boolean getAdvancedControls() {
		return (tar.getAdvancedControls());
	};
	public void addPropertyChangeListener(PropertyChangeListener in) {
		tar.addPropertyChangeListener(in);
	};
	public void removePropertyChangeListener(PropertyChangeListener in) {
		tar.removePropertyChangeListener(in);
	};
	public SymMap getGloSymMap() {
		return (tar.getGloSymMap());
	};
	public Paint getDepictorFont() {
		return (tar.getDepictorFont());
	};
	public int getGeomKitType() {
		return (tar.getGeomKitType());
	};
	public double getCoordRad() {
		return (tar.getCoordRad());
	}
	public IntObj getXOrigin() {
		return (tar.getXOrigin());
	}
	public IntObj getYOrigin() {
		return (tar.getYOrigin());
	}
//	public PointF getSize() {
//		return (tar.getSize());
//	};
	public DynRunner createDynRunner() {
		return (tar.createDynRunner());
	}
	public DynRunner createOneShotDyn() {
		return (tar.createOneShotDyn());
	}
	public boolean executeOneShotDyn(DynRunner in) {
		return (tar.executeOneShotDyn(in));
	}
	public DynRunner createDynRunner(boolean bound, Mvec Pt) {
		return (tar.createDynRunner(bound, Pt));
	}
	public void insertFormattedString(Object[] in, FlexString out) {
		tar.insertFormattedString(in, out);
	}
	public boolean addImplicitConstraint(Object[] LHS, Object[] RHS, DrawObj in, int FID) {
		return (tar.addImplicitConstraint(LHS, RHS, in, FID));
	}
	public void handleCoordAdjust(DrawObj InDrw, boolean ChgDelta, boolean activeAdjust) {
		tar.handleCoordAdjust(InDrw, ChgDelta, activeAdjust);
	}
	public void setCoordRad(double in) {
		tar.setCoordRad(in);
	}
	public Path getArrowheadPath() {
		return (tar.getArrowheadPath());
	}

}
