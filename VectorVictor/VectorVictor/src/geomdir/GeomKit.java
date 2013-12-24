



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


import geomdir.config.Config;
import geomdir.engine.EngineConstants;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.HashMap;
import java.util.Properties;
import java.util.Vector;

import com.postgreen.vectorvictor.VectorVictorActivity;

import meta.DataFormatException;
import meta.FlexString;
import meta.HighLevelList;
import meta.Meta;
import meta.WrapRuntimeException;
import verdantium.EtherEvent;
import verdantium.EtherEventPropertySource;
import verdantium.mathimage.MathImage;
import verdantium.mathimage.MathImageParseException;
import verdantium.mathimage.SymMap;
import verdantium.utils.IllegalInputException;
import verdantium.utils.VTextProperties;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;


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
*    | 11/12/2000            | Thorn Green (viridian_1138@yahoo.com)           | Clustering of depictors was inefficient.                             | Changed GeomKit to be compatible with the new clustering.
*    | 11/16/2000            | Thorn Green (viridian_1138@yahoo.com)           | No mechanism existed to report when solver unable to solve equations | Added code to GeomKit to report when solver failed to solve equations.
*    | 11/17/2000            | Thorn Green (viridian_1138@yahoo.com)           | Decided that modification made on 11/16 was flawed.                  | Changed the way solver errors are reported to fix problems.
*    | 12/03/2000            | Thorn Green (viridian_1138@yahoo.com)           | Found places where class did not support constraint solving.         | Made modifications to bring the class closer to supporting constraint solvers.
*    | 01/20/2001            | Thorn Green (viridian_1138@yahoo.com)           | Compatibility problems between GeomKit and new constraint solvers.   | Made changes so that the two would be more compatible.
*    | 02/04/2001            | Thorn Green (viridian_1138@yahoo.com)           | Changes to make GeoFrame editor more Verdantium-compliant            | Switched "ToolFrame" to "GeomKitPropertyEditor", made some naming changes.
*    | 02/04/2001            | Thorn Green (viridian_1138@yahoo.com)           | handleDestroy() not getting propagated properly.                     | Added propagation code.
*    | 03/11/2001            | Thorn Green (viridian_1138@yahoo.com)           | Multiple updates to tool support in package geomdir.                 | Made modifications to support updates.
*    | 06/24/2001            | Thorn Green (viridian_1138@yahoo.com)           | New user interface to support online help.                           | Made multiple changes to support new interface.
*    | 08/12/2001            | Thorn Green (viridian_1138@yahoo.com)           | First-Cut at Error Handling.                                         | First-Cut at Error Handling.
*    | 09/10/2001            | Thorn Green (viridian_1138@yahoo.com)           | Second-Cut at Error Handling.                                        | Second-Cut at Error Handling.
*    | 10/19/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expanded window menus for GeoFrame/GeoPad.                           | Added functionality relating to window menus.
*    | 11/17/2001            | Thorn Green (viridian_1138@yahoo.com)           | Add online docs. to depictors.                                       | Added/changed some APIs to support this.
*    | 11/18/2001            | Thorn Green (viridian_1138@yahoo.com)           | Cosmetic changes to a text message.                                  | Cosmetic changes to a text message.
*    | 11/23/2001            | Thorn Green (viridian_1138@yahoo.com)           | Regressions in the PrintPreview support.                             | Fixed the regressions.
*    | 12/01/2001            | Thorn Green (viridian_1138@yahoo.com)           | Third-Cut at Error Handling.                                         | Third-Cut at Error Handling.
*    | 12/02/2001            | Thorn Green (viridian_1138@yahoo.com)           | Performance enhancement.                                             | Performance enhancement.
*    | 12/09/2001            | Thorn Green (viridian_1138@yahoo.com)           | Documentation fix.                                                   | Documentation fix.
*    | 12/13/2001            | Thorn Green (viridian_1138@yahoo.com)           | OrderedList is archaic.                                              | Switched OrderedList classes to JCF.
*    | 12/30/2001            | Thorn Green (viridian_1138@yahoo.com)           | Expand handling of MathImage parse errors.                           | Created and propagated MathImageParseException.
*    | 01/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | The experimental code for multiple graph. contexts no longer useful. | Removed the old experimental code.
*    | 01/21/2002            | Thorn Green (viridian_1138@yahoo.com)           | Bug: The GeoFrame "Open" command doesn't clear the model first.      | Fixed the bug.
*    | 03/01/2002            | Thorn Green (viridian_1138@yahoo.com)           | EtherEvent performance enhancements.                                 | EtherEvent performance enhancements.
*    | 03/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | User interface simplification.                                       | Removed unit twistor entry from Geom menu.
*    | 04/03/2002            | Thorn Green (viridian_1138@yahoo.com)           | First-cut at Status Window changes.                                  | First-cut at Status Window changes.
*    | 05/10/2002            | Thorn Green (viridian_1138@yahoo.com)           | Redundant information in persistent storage.                         | Made numerous persistence and packaging changes.
*    | 08/13/2002            | Thorn Green (viridian_1138@yahoo.com)           | Looking for GeoSlate bug.                                            | Made a minor improvement to exception handling.
*    | 08/19/2002            | Thorn Green (viridian_1138@yahoo.com)           | Translate depictors by dragging anywhere along them (GeoSlate).      | Removed some methods to support more depictors.
*    | 09/07/2002            | Thorn Green (viridian_1138@yahoo.com)           | Remove red rectangle from mouse drags.                               | Removed red rectangle from mouse drags.
*    | 09/11/2002            | Thorn Green (viridian_1138@yahoo.com)           | Some operations are not compatible with BlueToh.                     | Improved compatibility.
*    | 09/18/2002            | Thorn Green (viridian_1138@yahoo.com)           | Needed adaptive relate support for GeoCard.                          | Added adaptive relate support.
*    | 09/27/2002            | Thorn Green (viridian_1138@yahoo.com)           | Add support for setting line widths.                                 | Added support for setting line widths.
*    | 10/05/2002            | Thorn Green (viridian_1138@yahoo.com)           | Run GeoCard from web.                                                | Debugged and made changes to run GeoCard from web.
*    | 10/06/2002            | Thorn Green (viridian_1138@yahoo.com)           | Dynamic justification of depictor labels.                            | Implemented dynamic justification.
*    | 10/20/2002            | Thorn Green (viridian_1138@yahoo.com)           | Reduce web footprint.                                                | Made changes to reduce footprint.
*    | 01/12/2003            | Thorn Green (viridian_1138@yahoo.com)           | Move SystemTime to own depictor.                                     | Moved SystemTime to own depictor.
*    | 03/16/2003            | Thorn Green (viridian_1138@yahoo.com)           | ObjectPC did not use defaultClassLoader.                             | Moved defaultClassLoader into Meta to fix this.
*    | 04/06/2003            | Thorn Green (viridian_1138@yahoo.com)           | Simplify code by removing AltMode.                                   | Removed everything used for AltMode display.
*    | 04/08/2003            | Thorn Green (viridian_1138@yahoo.com)           | Discovery of depictors.                                              | Added code to implement discovery of depictors.
*    | 04/10/2003            | Thorn Green (viridian_1138@yahoo.com)           | Problem with help in discovered depictors.                           | Made a small code change to fix this.
*    | 05/11/2003            | Thorn Green (viridian_1138@yahoo.com)           | Automated optimization.                                              | Implemented automated optimization, and removed optimization GUIs.
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

/* Known object common law violator */

/**
* A canvas to display a geometry model.
* @author Thorn Green
*/
public class GeomKit
	extends View
	implements
		Externalizable,
		ToolPort,
		DepicListListener,
		GeomConstants,
		EtherEventPropertySource {
	transient boolean painted = true;
	transient float prevx, prevy;

	private int PrevToolMode;
	/* Image BlueKnob;
	Image OrangeKnob; */
	transient protected Integer BlackIndex = Color.BLACK;
	transient protected Integer WhiteIndex = Color.WHITE;
	transient protected Integer GreenIndex = Color.rgb(0, 128, 0);
	transient protected Integer GreyIndex = Color.rgb(224, 224, 224);
	transient protected Integer CyanIndex = Color.rgb(0, 255, 255);
	transient protected Integer MagentaIndex = Color.rgb(255, 0, 255);
	transient protected Integer StdBlueColor = Color.rgb(0, 0, 254);

	public final static int UndoDoNothing = 1;
	public final static int UndoPaletteChg = 2;
	public final static int UndoOrgChg = 3;
	public final static int UndoObjChg = 4;
	public final static int UndoSymChg = 5;
	public final static int UndoMakeDepic = 6;
	public final static int UndoDeleteDepic = 7;
	public final static int UndoColorChange = 8;

	final static long BlinkInt = 250;

	transient protected Vector geoTools = null;

	/**
	*<B>Fun:</B> Initializes the state of the canvas.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> State of canvas object modified.<BR>
	*<B>Pre:</B> All resources that canvas needs are available.<BR>
	*<B>Post:</B> canvas will be initialized.<BR>
	*@author Thorn Green.
	*/
	public GeomKit(Context context, String Configs, int InOriginType) {
		super(context);
		contextS = context;
		OriginType = InOriginType;
		scrollInit();
		/* BlueKnob = getImage( getDocumentBase() , "images/Icn1001.gif" );
		OrangeKnob = getImage( getDocumentBase() , "images/Icn1000.gif" ); */
	}

	/**
	*<B>Fun:</B> Initializes the state of the canvas.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> State of canvas object modified.<BR>
	*<B>Pre:</B> All resources that canvas needs are available.<BR>
	*<B>Post:</B> canvas will be initialized.<BR>
	*@author Thorn Green.
	*/
	public void geomInit(String Configs, int InOriginType, String PalType, Config config) {
		setInitialSize();
//		in.setTitleLab("Please Wait.  Software is Loading...");
//		in.showLoadFrame();
		setModelManager(null);
		setModelManager(createModel(this, Configs, config));
		geoTools = getModelManager().getGeoTools();
		getModelManager().addDepicListListener(this);
		OriginType = InOriginType;

//		in.setToFront();

		/* xs.importString( "#1" );
		ys.importString( "#2" ); */
		XOrigin.value = 1000 + 100;
		YOrigin.value = 1000 + 100;
		localSetCoordRad(80);
		getModelManager().handleCoordRenderUpdate(72.0);
		RealAng.value = 135;
		ImAng.value = 135;
		RealBar.value = 50;
		ImBar.value = 50;
		Axes[0][0] = 0.9238795325;
		Axes[0][1] = -0.3826834324;
		Axes[1][0] = -0.3826834324;
		Axes[1][1] = -0.9238795325;
		ArcToolRad.value = 20;
		AxisRad.value = 50;
		ArrLen = 6.0;
		LastClick = GeomConstants.NoMatch;
		requestPrevToolModeChange(GeomConstants.FreeTransformationMode);
		/* CurReply = NULL; */
		tFont = new Paint();
		tFont.setTextSize( 12 );
		tFont.setTypeface(Typeface.create(Typeface.SERIF,
                Typeface.NORMAL));
		PrintColor = GreenIndex;
		Active.value = 0;
		resetViewPosition(XOrigin, YOrigin, new Rect(1000, 1000, 1000, 1000));

		FlexString vari = new FlexString("c");
		/* FlexString expr = new FlexString( "a + b" );
		boolean Err = getModelManager().changeExpression( vari , expr ,
			EngineConstants.USER_MODE ); */
		boolean Err = (getModelManager().getMyEngine()).verifyVariable(vari, EngineConstants.USER_MODE);

		try {
			switch (OriginType) {
				case GeoFrameOriginType :
				case VectorOriginType :
					Ixs = makeDepicMathImage("&sigma;<SUB>1</SUB>", StdBlueColor, 15, true);
					Iys = makeDepicMathImage("&sigma;<SUB>2</SUB>", StdBlueColor, 15, true);
					break;

				case ScalarOriginType :
					Ixs = makeDepicMathImage("u", StdBlueColor, 15, true);
					break;
			}
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException(ex));
		}

		customize();
//		in.hideLoadFrame();
		/* postInvalidate(); */
	}

	/**
	*<B>Fun:</B> Initializes the state of the canvas.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> State of canvas object modified.<BR>
	*<B>Pre:</B> All resources that canvas needs are available.<BR>
	*<B>Post:</B> canvas will be initialized.<BR>
	*@author Thorn Green.
	*/
	public GeomKit(Context context) {
		super(context);
		contextS = context;
		scrollInit();
		String Configs = "geoframe.cfg";
		Config config = null; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		OriginType = GeoFrameOriginType;

//		in.setTitleLab("Please Wait.  Software is Loading...");
//		in.showLoadFrame();
		setModelManager(createModel(this, Configs, config));
		geoTools = getModelManager().getGeoTools();
		getModelManager().addDepicListListener(this);

//		in.setToFront();
//		getModelManager().setXKit(new XKit());

		/* xs.importString( "#1" );
		ys.importString( "#2" ); */
		XOrigin.value = 1000 + 100;
		YOrigin.value = 1000 + 100;
		localSetCoordRad(80);
		getModelManager().handleCoordRenderUpdate(72.0);
		RealAng.value = 135;
		ImAng.value = 135;
		RealBar.value = 50;
		ImBar.value = 50;
		Axes[0][0] = 0.9238795325;
		Axes[0][1] = -0.3826834324;
		Axes[1][0] = -0.3826834324;
		Axes[1][1] = -0.9238795325;
		ArcToolRad.value = 20;
		AxisRad.value = 50;
		ArrLen = 6.0;
		LastClick = GeomConstants.NoMatch;
		requestPrevToolModeChange(GeomConstants.FreeTransformationMode);
		resetViewPosition(XOrigin, YOrigin, new Rect(1000, 1000, 1000, 1000));

		tFont = new Paint();
		tFont.setTextSize( 12 );
		tFont.setTypeface(Typeface.create(Typeface.SERIF,
                Typeface.NORMAL));
		PrintColor = GreenIndex;
		Active.value = 0;

		FlexString vari = new FlexString("c");
		boolean Err = (getModelManager().getMyEngine()).verifyVariable(vari, EngineConstants.USER_MODE);

		try {
			switch (OriginType) {
				case GeoFrameOriginType :
				case VectorOriginType :
					Ixs = makeDepicMathImage("&sigma;<SUB>1</SUB>", StdBlueColor, 15, true);
					Iys = makeDepicMathImage("&sigma;<SUB>2</SUB>", StdBlueColor, 15, true);
					break;

				case ScalarOriginType :
					Ixs = makeDepicMathImage("u", StdBlueColor, 15, true);
					break;
			}
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException(ex));
		}

		customize();
//		in.hideLoadFrame();

	}

	/**
	*<B>Fun:</B> Initializes the state of the canvas.
	*<P>
	*<B>In:</B> None.<BR>
	*<B>Out:</B> State of canvas object modified.<BR>
	*<B>Pre:</B> All resources that canvas needs are available.<BR>
	*<B>Post:</B> canvas will be initialized.<BR>
	*@author Thorn Green.
	*/
	public GeomKit(GeomKit in) {
		super(in.contextS);
		contextS = in.contextS;
		scrollInit();
		ViewTarget = in;
		setInitialSize();
		/* xs.importString( "#1" );
		ys.importString( "#2" ); */
		Active.value = 0;
		LastClick = GeomConstants.NoMatch;
		tFont = new Paint();
		tFont.setTextSize( 12 );
		tFont.setTypeface(Typeface.create(Typeface.SERIF,
                Typeface.NORMAL));

		if (in != null) {

			setModelManager(in.getModelManager());
			getModelManager().addDepicListListener(this);
			OriginType = in.OriginType;

			/* DepicList = in.DepicList; */

			int max = in.geoTools.size();
			int count;
			geoTools = new Vector();
			geoTools.setSize(max);
			for (count = 0; count < max; ++count) {
				if (in.geoTools.elementAt(count) != null)
					try {
						Ktool tool = (Ktool) (in.geoTools.elementAt(count));
						if (tool.requiresReplication()) {
							Ktool ntool = (Ktool) (tool.getClass().newInstance());
							geoTools.setElementAt(ntool, count);
							ntool.setAliasName(tool.getAliasName());
						}
						else {
							geoTools.setElementAt(tool, count);
						}
					}
					catch (Exception e) {
						throw (new WrapRuntimeException("Ktool Load Failed", e));
					}
			}

			XOrigin.value = in.XOrigin.value;
			YOrigin.value = in.YOrigin.value;
			localSetCoordRad(in.CoordRad);
			getModelManager().handleCoordRenderUpdate(72.0);
			RealAng.value = in.RealAng.value;
			ImAng.value = in.ImAng.value;
			RealBar.value = in.RealBar.value;
			ImBar.value = in.ImBar.value;
			Axes[0][0] = in.Axes[0][0];
			Axes[0][1] = in.Axes[0][1];
			Axes[1][0] = in.Axes[1][0];
			Axes[1][1] = in.Axes[1][1];
			ArcToolRad.value = in.ArcToolRad.value;
			AxisRad.value = in.AxisRad.value;
			ArrLen = in.ArrLen;
			requestPrevToolModeChange(in.PrevToolMode);

			/* CurReply = NULL; */
			tFont = in.tFont;
			PrintColor = in.PrintColor;
			BoundMode = in.BoundMode;
			cloneDispList(in.DispList1);
			setBackgroundState(in.getBackgroundColor());

			try {
				switch (OriginType) {
					case GeoFrameOriginType :
					case VectorOriginType :
						Ixs = makeDepicMathImage("&sigma;<SUB>1</SUB>", StdBlueColor, 15, true);
						Iys = makeDepicMathImage("&sigma;<SUB>2</SUB>", StdBlueColor, 15, true);
						break;

					case ScalarOriginType :
						Ixs = makeDepicMathImage("u", StdBlueColor, 15, true);
						break;
				}
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}

			customize();
			/* postInvalidate(); */
		}
	}

	/**
	* Initializes the scroll pane.
	*/
	protected void scrollInit() {}

	/**
	*  Resets the initial view.
	*/
	protected void initResetView() {
//		invalidate();
//		validate();
	}

	/**
	* Sets the initial sizes.
	*/
	protected void setInitialSize() {
//		setMinimumSize(new Dimension(0, 0));
//		setPreferredSize(new Dimension(0, 0));
	}

	/** 
	* Override this function in a derived class to perform your
	* customizations. Usually, you would build a properties list, and
	* then call the loadProperties() method.
	*/
	protected void customize() {}

	/**
	* Creates the tool frame or tool panel for the kit.
	*/
	public ToolDisplay createToolDisplay(String PalType, Properties prop) {
		ToolDisplay MyTools = null;

		try {
			Class[] classes = { GeomKit.class, Properties.class };
			Object[] params = { this, prop };
			Class MyClass = Class.forName(PalType, true, Meta.getDefaultClassLoader());
			Constructor MyConstructor = MyClass.getConstructor(classes);
			MyTools = (ToolDisplay) (MyConstructor.newInstance(params));
			MyTools.initToolFrame(this, OriginType);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Create Tools Failed", e));
		}

		return (MyTools);
	}

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
		throws MathImageParseException {
		return (getModelManager().makeDepicMathImage(ins, col, PtSz, depic_named));
	}

	/**
	*<B>Fun:</B> Creates a depiction image for a particular symbol string.
	*<P>
	*<B>In:</B> String to depict.  Color to depict string as.<BR>
	*<B>Out:</B> Depiction image returned.<BR>
	*<B>Pre:</B> Symbol depiction software is working properly.  Input string is valid.<BR>
	*<B>Post:</B> Image will be returned which depicts symbol.<BR>
	*@author Thorn Green.
	*/
	public MathImage makeDepicMathImage(FlexString ins, Integer col, int PtSz, boolean depic_named)
		throws MathImageParseException {
		return (getModelManager().makeDepicMathImage(ins, col, PtSz, depic_named));
	}

	/**
	*<B>Fun:</B> Handles a "mouse up" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean mouserUp(MotionEvent e, float x, float y) {
		paintOff();
		boolean ClickMode = getGeoTool(PrevToolMode).getClickMode();
		boolean tmp = false;

		if (!ClickMode)
			tmp = manipEnd(e, x, y);
		if( LastClick == Match )
		{
			getParent().requestDisallowInterceptTouchEvent(true);
		}
		return (tmp);
	}

	/**
	*<B>Fun:</B> Handles a "mouse click" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public boolean mouserClick(MotionEvent e, int x, int y) {
		getGeoTool(PrevToolMode).handleSingleClick(e, this);

		return (false);
	}

	/**
	*<B>Fun:</B> Handles a "mouse down" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean mouserDown(MotionEvent e, float x, float y) {
		boolean tmp = false;
		paintOn();
		boolean ClickMode = getGeoTool(PrevToolMode).getClickMode();

		boolean sgn = ClickMode && (LastClick == Match);

		if (!sgn) {
			tmp = manipStrt(e, x, y);
			if (ClickMode && (LastClick == NoMatch))
				manipEnd(e, x, y);
		}
		else
			tmp = manipEnd(e, x, y);

		if( LastClick == Match )
		{
			getParent().requestDisallowInterceptTouchEvent(true);
		}
		return (tmp);
	}

	/**
	*<B>Fun:</B> Handles a "mouse drag" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean mouserDrag(MotionEvent e, float x, float y) {
		boolean ClickMode = getGeoTool(PrevToolMode).getClickMode();
		boolean tmp = false;

		if (!ClickMode)
			tmp = manipDrag(e, x, y);
		if( LastClick == Match )
		{
			getParent().requestDisallowInterceptTouchEvent(true);
		}
		return (tmp);
	}

	/**
	*<B>Fun:</B> Handles a "mouse drag" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean mouserMove(MotionEvent e, int x, int y) {
		boolean ClickMode = getGeoTool(PrevToolMode).getClickMode();
		boolean tmp = false;

		boolean sgn = ClickMode && (LastClick == Match);

		if (sgn)
			tmp = manipDrag(e, x, y);
		return (tmp);
	}

	/**
	*<B>Fun:</B> Handles a "end of manipulation" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean manipEnd(MotionEvent e, float x, float y) {
		/* ClickTime = e.when; */
		if (MousedDown) {
			getModelManager().setMouseUpTime(e.getEventTime());
			otherClickPostDrag(e);
		}
		MousedDown = false;
		DraggingAssign = false;
		/* Keep commented for debug support. */
		/* DrawMarkRect = false; */
//		getModelManager().globalSynchPaint();
		getModelManager().globalRepaint();
		painted = true;
		requestFocus();
		LastClick = NoMatch;
		startDelayOptimize();
		return (true);
	}

	/**
	* Performs a delayed optimization call.
	*/
	protected final void startDelayOptimize() {
		this.post( new OptCaller(getModelManager()) );
	}

	/* long ClickTime = 0; */

	/**
	*<B>Fun:</B> Handles a "start of manipulation" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean manipStrt(MotionEvent e, float x, float y) {

		prevx = x;
		prevy = y;
		MouseDownTime = e.getEventTime();
		getModelManager().setMouseDownTime(e.getEventTime());
		MousedDown = true;

		getModelManager().setTarget(this);
		clickPreDrag(e);

		/* if( ( e.when - ClickTime ) < 500 )
			{ System.out.println( e.when - ClickTime ); } */

		return true;
	}

	/**
	*<B>Fun:</B> Handles a "manipulation drag" event in the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event object, coordinates of the event.<BR>
	*<B>Out:</B> State of canvas may be changed.<BR>
	*<B>Pre:</B> Event and coordinates are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, then the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	public final boolean manipDrag(MotionEvent e, float x, float y) {
		if (!MousedDown)
			mouserDown(e, x, y);

		getModelManager().dragEventEntry(e);
		prevx = x;
		prevy = y;

		return true;
	}

	/**
	* Paints an orange knob at (x,y).
	*/
	public void paintOrangeKnob(Canvas g, Paint p, double x, double y) {
		p.setStyle(Style.FILL);
		//Integer temp = g.getColor();
		p.setColor( Color.rgb(255, 127, 0) );
		g.drawRect((float)(x - 2), (float)(y - 2), (float)( x + 2 ), (float)( y + 2 ),p);
		//g.setColor(temp);
		/* g.drawImage( OrangeKnob , x - 2 , y - 2 , 4 , 4 , this ); */
	}

	/**
	* Paints a blue knob at (x,y).
	*/
	public void paintBlueKnob(Canvas g, Paint p, double x, double y) {
		p.setStyle(Style.FILL);
		//Color temp = g.getColor();
		p.setColor(StdBlueColor);
		g.drawRect((float)(x - 2), (float)(y - 2), (float)( x + 2 ), (float)( y + 2 ),p);
		//g.setColor(temp);
		/* g.drawImage( BlueKnob , x - 2 , y - 2 , 4 , 4 , this ); */
	}

	/**
	* Paints a colored knob at (x,y).
	*/
	public void paintColorKnob(Canvas g, Paint p, Integer c, double x, double y) {
		p.setStyle(Style.FILL);
		//Color temp = g.getColor();
		p.setColor(c);
		g.drawRect((float)(x - 2), (float)(y - 2), (float)( x + 2 ), (float)( y + 2 ),p);
		//g.setColor(temp);
		/* g.drawImage( BlueKnob , x - 2 , y - 2 , 4 , 4 , this ); */
	}

	/**
	* Sets the focus to be traversable.
	*/
	public boolean isFocusTraversable() {
		return (true);
	}

	/**
	* Adjustment call for objects that want to print from the corner of the scroll pane.
	*/
	protected Mvec prePrintAdjustOrigin() {
		return (prePrintAdjustOriginLocal());
	}

	/**
	* Adjustment call for objects that want to print from the corner of the scroll pane.
	*/
	protected Mvec prePrintAdjustOriginLocal() {
		Mvec xp = new Mvec();
		xp.setBasis1(XOrigin.value);
		xp.setBasis2(YOrigin.value);
		double xp1 = retVisibleRect().left - XOrigin.value;
		double xp2 = retVisibleRect().top - YOrigin.value;
		XOrigin.value = (int) (-xp1);
		YOrigin.value = (int) (-xp2);
		return (xp);
	}

	/**
	* Adjustment call for objects that want to print from the corner of the scroll pane.
	*/
	protected Mvec prePrintAdjustOriginGlobal() {
		Mvec xp = new Mvec();
		xp.setBasis1(XOrigin.value);
		xp.setBasis2(YOrigin.value);
		double xp1 = 0.0;
		double xp2 = 0.0;
		XOrigin.value = (int) (xp1);
		YOrigin.value = (int) (xp2);
		return (xp);
	}

	/**
	* Adjustment call for objects that want to print from the corner of the scroll pane.
	*/
	public void postPrintAdjustOrigin(Mvec xp) {
		XOrigin.value = (int) (xp.getBasis1());
		YOrigin.value = (int) (xp.getBasis2());
	}

	/**
	*<B>Fun:</B> Repaints the display of the canvas to the printer.
	*<P>
	*<B>In:</B> Current state of the canvas, graphics context.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> The display of the canvas will be painted into the graphics context.<BR>
	*@author Thorn Green.
	*/
	public void print(Canvas gi) {
/*		Object prev = getModelManager().getAntialiasValue();
		Object nxt = RenderingHints.VALUE_ANTIALIAS_ON;
		if (prev != nxt)
			try {
				getModelManager().setAntialiasValue(nxt);
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}

		Canvas g = (Canvas) (gi);
		RectF VRect = g.getClipBounds();
		if (bkgndOpaque) {
			g.setColor(getBackground());
			g.fillRect(VRect.x, VRect.y, VRect.width, VRect.height);
		}

		updateDisplayDepictors(this);
		draw(g, DispList1);

		if (prev != nxt)
			try {
				getModelManager().setAntialiasValue(prev);
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			} */
	}

	/**
	* Prints the contents of the panel.
	*/
/*	public int print(Canvas gi, PageFormat pf, int pageIndex) throws PrinterException {
		Canvas g = (Canvas) gi;
		RepaintManager.currentManager(this).setDoubleBufferingEnabled(false);

		if (bkgndOpaque) {
			g.setColor(getBackground());
			RectF rect =
				new RectF(
					pf.getImageableX(),
					pf.getImageableY(),
					pf.getImageableX()+pf.getImageableWidth(),
					pf.getImageableY()+pf.getImageableHeight());
			g.fill(rect);
		}

		Mvec xp = prePrintAdjustOrigin();
		CoordTrans.setToTranslation(pf.getImageableX(), pf.getImageableY());
		AffineTransform trans = g.getTransform();
		trans.concatenate(CoordTrans);
		g.setTransform(trans);

		Object prev = getModelManager().getAntialiasValue();
		Object nxt = RenderingHints.VALUE_ANTIALIAS_ON;
		if (prev != nxt)
			try {
				getModelManager().setAntialiasValue(nxt);
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}

		updateDisplayDepictors(this);
		draw(g, DispList1);

		if (prev != nxt)
			try {
				getModelManager().setAntialiasValue(prev);
			}
			catch (Exception ex) {
				throw (new WrapRuntimeException(ex));
			}

		postPrintAdjustOrigin(xp);
		RepaintManager.currentManager(this).setDoubleBufferingEnabled(true);
		return (Printable.PAGE_EXISTS);
	} */

	/**
	* Calls the paint method.
	*/
//	public void update(Canvas g) {
//		paint(g);
//	};

	/**
	* Returns that the component is opaque.
	*/
//	public boolean isOpaque() {
//		return (bkgndOpaque);
//	}

	/**
	*<B>Fun:</B> Repaints the display of the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, graphics context.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> The display of the canvas will be painted into the graphics context.<BR>
	*@author Thorn Green.
	*/
	@Override
	   protected void onDraw(Canvas g)  {
		Paint p = new Paint();
		paintOn();

		Canvas ga = (Canvas) (g);
		Canvas gg = null;

//		if (getModelManager().getUseRigorousClipping())
//			gg =
//				new ClipGraphics(
//					ga,
//					new RectF(-30000 + XOrigin.value, -30000 + YOrigin.value, 
//							30000 + XOrigin.value, 30000 + YOrigin.value));
//		else
			gg = ga;

		gr1 = gg;
		if (/*bkgndOpaque*/ true ) {
			p.setColor( getBackgroundColor() );
			gg.drawColor( getBackgroundColor() );
		}

		/* pghdhere */

		p.setAntiAlias( /* getModelManager().getAntialiasValue().isAntiAlias() */ true );
		
		
		if( handlingPinch && coords )
		{
			try
			{
				p.setColor( Color.RED );
				p.setStyle( Style.FILL_AND_STROKE );
				p.setStrokeWidth( 5 );
			    gg.drawLine( currentPinchEvent.getX(0) , currentPinchEvent.getY(0) , 
			    		currentPinchEvent.getX(1) , currentPinchEvent.getY(1), p);
			}
			catch( Throwable ex )
			{
				ex.printStackTrace( System.out );
			}
		}

		updateDisplayDepictors(this);
		draw(gg, p, DispList1);

		paintOff();
	}

	/**
	* Handles a popup trigger by showing the property editor for the component, if
	* the component is in a mode that allows editing.
	*/
/*	public void handlePopupTrigger(MotionEvent e) {
		try {
			if ((DesignerControl.isDesignTime()) || (!isOnlyDesignerEdits())) {
				EtherEvent send = new StandardEtherEvent(this, StandardEtherEvent.showPropertiesEditor, null, this);
				send.setParameter(e.getPoint());
				ProgramDirector.fireEtherEvent(send, null);
			}
		}
		catch (Throwable ex) {
			handleThrow(ex);
		}
	} */
	
	
	protected long downEventTime = 0;
	protected long upEventTime = 1;
	protected boolean handlingPinch = false;
	protected boolean coords = false;
    protected double ix0;
    protected double ix1;
    protected double iy0;
    protected double iy1;
    protected MotionEvent currentPinchEvent = null;
	
	
	@Override
    public boolean onTouchEvent(MotionEvent e) {
		
		// Log.d( "AA" , "" + ( e.getEventTime() - upEventTime )  );
		// Log.d( "AB" , "" + ( e.getEventTime() - downEventTime )  );
		// Log.d( "AC" , "" + ( e.getAction() == MotionEvent.ACTION_UP  )  );
		
		if( ( ( e.getEventTime() - downEventTime ) < 200 ) && 
				( ( e.getEventTime() - downEventTime ) < ( e.getEventTime() - upEventTime ) ) &&
				( e.getAction() == MotionEvent.ACTION_UP ) )
			  return( true );
		
		// Log.d( "A" , "" + downEventTime );
		// Log.d( "B" , "" + upEventTime );
		// Log.d( "c" , "" + ( e.getEventTime() ) );
		
        switch (e.getAction()) {
            case MotionEvent.ACTION_DOWN:
            	    handlingPinch = false;
            		downEventTime = e.getDownTime();
            		mouserDown(e, e.getX(), e.getY());
                break;
            case MotionEvent.ACTION_UP:
            {
            	boolean tmp = handlingPinch;
            	handlingPinch = false;
            	if( tmp )
            	{
            		handlePinchEnd();
            	}
            	else
            	{
            		upEventTime = e.getEventTime();
            		if (MousedDown)
            			mouserUp(e, e.getX(), e.getY());
            	}
			}
			break;
            case MotionEvent.ACTION_POINTER_DOWN:
            case MotionEvent.ACTION_POINTER_2_DOWN:
            	handlingPinch = true;
            	coords = false;
            	currentPinchEvent = e;
            	getParent().requestDisallowInterceptTouchEvent(true);
            	invalidate();
                break;
            case MotionEvent.ACTION_CANCEL:
            	if( handlingPinch )
            	{
            		handlingPinch = false;
            		handlePinchEnd();
            	}
            	break;
            case MotionEvent.ACTION_POINTER_UP:
            case MotionEvent.ACTION_POINTER_2_UP:
            	handlingPinch = false;
            	handlePinchEnd();
                break;
            case MotionEvent.ACTION_MOVE:
            {
            	if( handlingPinch )
            	{
            		if( !coords )
            		{
            			coords = true;
            			ix0 = e.getX( 0 );
            			ix1 = e.getX( 1 );
            			iy0 = e.getY( 0 );
            			iy1 = e.getY( 1 );
            		}
            		currentPinchEvent = e;
            		getParent().requestDisallowInterceptTouchEvent(true);
            		invalidate();
            	}
            	else
            	{
            		mouserDrag(e, e.getX(), e.getY());
            	}
            }       
                break;
        }
        return true;
    }
	
	
	protected void handlePinchEnd()
	{
		
	}
	

	/**
	* Handles a mouse event.
	*/
/*	public void processMotionEvent(MotionEvent e) {
		switch (e.getID()) {
			case MotionEvent.MOUSE_PRESSED :
				if ((e.getModifiers() & InputEvent.BUTTON3_MASK) != 0)
					handlePopupTrigger(e);
				else
					mouserDown(e, e.getX(), e.getY());
				break;

			case MotionEvent.MOUSE_RELEASED :
				mouserUp(e, e.getX(), e.getY());
				break;

			case MotionEvent.MOUSE_EXITED :
				{
					if (MousedDown)
						mouserUp(e, e.getX(), e.getY());
				}
				break;

			case MotionEvent.MOUSE_CLICKED :
				mouserClick(e, e.getX(), e.getY());
				break;

		}

		super.processMouseEvent(e);
	} */

	/**
	* Handles a mouse-motion event.
	*/
/*	public void processMouseMotionEvent(MotionEvent e) {
		switch (e.getID()) {
			case MotionEvent.MOUSE_DRAGGED :
				mouserDrag(e, e.getX(), e.getY());
				break;

			case MotionEvent.MOUSE_MOVED :
				mouserMove(e, e.getX(), e.getY());
				break;

		}

		super.processMouseMotionEvent(e);
	} */

	/**
	*<B>Fun:</B> Handles all key input events for the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, event to handle.<BR>
	*<B>Out:</B> State of the canvas may be modified.<BR>
	*<B>Pre:</B> Input event is valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has requested a change, the state of the canvas will be changed.<BR>
	*@author Thorn Green.
	*/
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent e) {
		
					int key = keyCode;

					if (key == 16) {
						getModelManager().writeConstraintSystem();
					}
					/* if( key == 1 )
						{
						System.out.println(
							getModelManager().totpct /
							( (double) ( getModelManager().pctnum ) ) );
						} */
					if (key == 23) {
						//VTextProperties MyProp = new VTextProperties();
						//saveProperties(MyProp);
						//System.out.println(" *** Current Graphics User Interface Properties: *** ");
						//try {
						//	MyProp.store(System.out, "Geometry Properties");
						//}
						//catch (Exception ex) {
						//	throw (new WrapRuntimeException("Property Store Failed", ex));
						//}
					}

					if (key == 24) {
						/* loadPropertiesFile( "tempfile.geo" ); */
						/* getModelManager().createDepictor( "ModSegment Scalar Type I" , "abc" , 40 , 20 ); */
					}
					
					return( true );

	}

	/**
	* Handles an action event indicating that the window was selected.
	*/
	public void handleWindowEvent() {
		getModelManager().setTarget(this);
	}

	/**
	*<B>Fun:</B> Repaints the display of the canvas.
	*<P>
	*<B>In:</B> Current state of the canvas, graphics context.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> The display of the canvas will be painted into the graphics context.<BR>
	*@author Thorn Green.
	*/
	public void draw(Canvas g, Paint p, HighLevelList DispList) {
		calcVisibleRect( g );
		Rect VRect = retVisibleRect();

		if (getModelManager().getDragSolverError()) {
			p.setColor(Color.RED);
			g.drawText("Unable To Solve.", VRect.left + 20, VRect.top + 20,p);
		}

		
		g.translate(XOrigin.value, YOrigin.value);
		
		
		
		p.setTextSize( tFont.getTextSize() );
		p.setTypeface( tFont.getTypeface() );

		
		
		hgr1 = /* g.create(); */
		g;
		/* hgr1.setXORMode( Color.white ); */

		p.setColor(GreenIndex);
		p.setStrokeCap( getSingleWidthStroke().getStrokeCap() );
		p.setStrokeJoin( getSingleWidthStroke().getStrokeJoin() );
		p.setStrokeMiter( getSingleWidthStroke().getStrokeMiter() );
		p.setStrokeWidth( getSingleWidthStroke().getStrokeWidth() );
		updateCurrentDisplay(this, g, p, DispList);

		(getGeoTool(PrevToolMode)).postDrawDepic(g, this);

		if (ShowDisplayControls) {
			updateDisplayControls(this, g, p, DispList);
		}
		else {
			updateSingleControl(this, g, p, DispList);
		}

		if (DraggingAssign && (/* SrcStr.strlen() != 0 */
			true)) {
			double DelX;
			double DelY;
			int ArrLen = 25;
			double DeltaX = CrPt.x - StPt.x;
			double DeltaY = CrPt.y - StPt.y;
			double ManLen = Math.abs(DeltaX) + Math.abs(DeltaY);
			if (ManLen < 0.001)
				ManLen = 5;
			DelX = ArrLen * DeltaX / ManLen;
			DelY = ArrLen * DeltaY / ManLen;
			if ((Active).value == 1)
				p.setColor(CyanIndex);
			else
				p.setColor(MagentaIndex);

			drawThkLine(g, p, StPt.x, StPt.y, CrPt.x, CrPt.y, 5, 5);

			drawThkLine(g, p, CrPt.x - DelX + DelY, CrPt.y - DelY - DelX, CrPt.x, CrPt.y, 5, 5);

			drawThkLine(g, p, CrPt.x, CrPt.y, CrPt.x - DelX - DelY, CrPt.y - DelY + DelX, 5, 5);
		}

		(getGeoTool(PrevToolMode)).postDrawTools(g, p, this);

		/* Keep commented for debug support. */
		/* if( DrawMarkRect )
			{
			g.setColor( Color.red );
			TempRect.setFrame( CrPt.x - 5 , CrPt.y - 5 , 10 , 10 );
			g.draw( TempRect );
			} */

		/* setOrigin( 0 , 0 );
		updateControls(fWindow,fWindow->visRgn); */

	};

	/**
	* Creates a rectangle enclosing the size of a knob at (x,y).
	*/
	public RectF instanceRect(double x, double y) {
		RectF TRect = new RectF((float)(x - 3), (float)(y - 3), (float)(x + 3), (float)(y + 3));
		return (TRect);
	}

	/**
	* Returns the default gravity field of a mouse-point <code>p</code> for a knob
	* at (x,y).
	*/
	public double defaultGravityField(PointF p, double x, double y) {
		double delx = Math.abs(p.x - x);
		double dely = Math.abs(p.y - y);
		double dist = delx + dely;
		if ((delx <= 12) && (dely <= 12))
			dist = ClickRec.MaxPriority;
		if (dist > 24.0)
			dist = ClickRec.MinPriority + 1;
		return (dist);
	}

	/**
	*<B>Fun:</B> Sets up a mouse-down event prior to subsequent dragging.
	*<P>
	*<B>In:</B> Current state of the canvas, input event object.<BR>
	*<B>Out:</B> State of canvas may be modified.<BR>
	*<B>Pre:</B> Event object is valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If the user has clicked on something which can be dragged, the proper initialization
	*	will be performed.<BR>
	*@author Thorn Green.
	*/
	public void clickPreDrag(MotionEvent anEvent) {
		CrPt.x = anEvent.getX() - XOrigin.value;
		CrPt.y = anEvent.getY() - YOrigin.value;
		LastClick = GeomConstants.NoMatch;
		DraggingAssign = false;

		getModelManager().setUpDrag(this, false);
		otherClickPreDrag(anEvent);

		/* Keep commented for debug support. */
		/* DrawMarkRect = ( LastClick == Match ); */
		if (LastClick == Match)
			invalidate(); // !!!!!
	};

	/**
	*<B>Fun:</B> Handles a drag event in the canvas's region.
	*<P>
	*<B>In:</B> Current state of the canvas, the event object to handle.<BR>
	*<B>Out:</B> The state of the canvas may be changed.<BR>
	*<B>Pre:</B> The canvas is in a consistent state.  The event object is valid.
	*	clickPreDrag() has allready been called.<BR>
	*<B>Post:</B> If the user is dragging an object, the state of that object will
	*	be updated to reflect it.<BR>
	*@author Thorn Green
	*/
	public void clickAndDrag(MotionEvent anEvent, CoordContext PrtCon) {
		otherClickAndDrag(anEvent, PrtCon);
	};

	/**
	*<B>Fun:</B> Draws a standard arrow for the calling client DrawObj.
	*<P>
	*<B>In:</B> Graphics context, the calling DrawObj, the start point and end point
	*	Hexars of the arrow to be drawn.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Graphics context is valid.  The other input objects exist.  The start
	*	point and end point have been de-hexed.<BR>
	*<B>Post:</B> The specified arrow will be drawn in the graphics context.<BR>
	*@author Thorn Green.
	*/
	public void externArrow(Canvas g, Paint p, DrawObj caller, Hexar HDhex, Hexar TLhex, int PrevToolMode) {
		final int CircWid = 6;
		double xa = HDhex.getPtx();
		double ya = HDhex.getPty();
		double xb = TLhex.getPtx();
		double yb = TLhex.getPty();
		p.setStrokeCap( caller.getFrontLineStroke().getStrokeCap() );
		p.setStrokeJoin( caller.getFrontLineStroke().getStrokeJoin() );
		p.setStrokeMiter( caller.getFrontLineStroke().getStrokeMiter() );
		p.setStrokeWidth( caller.getFrontLineStroke().getStrokeWidth() );
		p.setColor(caller.getFrontLineColor());

		boolean tmp = caller.getFrontLineVisible();
		if ((!tmp) && (PrevToolMode == 13)) {
			tmp = true;
			p.setColor(DrawObj.DefBack);
		}

		{
			double x1 = xa;
			double y1 = ya;
			double x2 = xb;
			double y2 = yb;

			double DelX;
			double DelY;
			double DeltaX = x2 - x1;
			double DeltaY = y2 - y1;
			double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
			if (len < 0.001)
				len = 5;
			DelX = DeltaX / len;
			DelY = DeltaY / len;

			

			if (tmp) {
				p.setStyle( Style.STROKE );
				g.drawLine((float)x1, (float)y1, (float)x2, (float)y2, p);
				
				
				Path OrigPath = getArrowheadPath();
				p.setStyle( Style.FILL_AND_STROKE );
				
				int saveCount = g.save();
				
				
				g.translate( (float)x2 , (float)y2 );
				
				
				float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
				Matrix mat = new Matrix();
				mat.setValues( matVals );
				g.concat(mat);
				
				// g.translate((float)ArrLen, 0f);
				
				g.drawPath(OrigPath,p);

		        g.restoreToCount(saveCount);
				
				
				p.setStyle( Style.FILL );
				RectF oval = new RectF((float)(x1 - CircWid / 2.0), (float)(y1 - CircWid / 2.0) ,
						(float)(x1 + CircWid / 2.0), (float)(y1 + CircWid / 2.0));
				g.drawOval( oval , p);
			}

		}
	};

	/**
	* Returns a path object that depicts the arrowhead of a vector.  Modify
	* this routine to change the shape of the arrowhead.
	*/
	public Path getArrowheadPath() {
		if (ArrowPath == null) {
			double Delta = ArrLen * 0.166666;
			ArrowPath = new Path();
			ArrowPath.moveTo(0, 0);
			ArrowPath.lineTo((float) (-ArrLen), (float) (0.5 * ArrLen - Delta));
			ArrowPath.lineTo((float) (-2 * ArrLen), (float) (ArrLen));
			ArrowPath.lineTo((float) (-1.6 * ArrLen), (float) (0));
			ArrowPath.lineTo((float) (-2 * ArrLen), (float) (-ArrLen));
			ArrowPath.lineTo((float) (-ArrLen), (float) (-0.5 * ArrLen + Delta));
			ArrowPath.close();
		}

		return (ArrowPath);
	}

	/**
	* Deletes an expression.
	*/
	public boolean deleteExpression(FlexString VarName, int MyMode) {
		boolean tmp = getModelManager().deleteExpression(VarName, MyMode);
		return (tmp);
	}

	/**
	* Adds or changes an expression.
	*/
	public boolean changeExpression(FlexString VarName, FlexString ExpressionString, int MyMode) {
		boolean tmp = getModelManager().changeExpression(VarName, ExpressionString, MyMode);
		return (tmp);
	}

	/**
	* Adds or changes an expression.
	*/
	public boolean adaptiveRelate(FlexString VarName, FlexString ExpressionString, int MyMode) {
		boolean tmp = getModelManager().adaptiveRelate(VarName, ExpressionString, MyMode);
		return (tmp);
	}

	/**
	* Adds an implicit depictor constraint.
	*/
	public boolean addImplicitConstraint(Object[] LHS, Object[] RHS, DrawObj in, int FID) {
		boolean tmp = false;

		FlexString SLHS = null;
		FlexString SRHS = null;

		FlexString FKey = in.getFragID();

		if (AdvancedHandlingImplicit) {
			SLHS = new FlexString();
			SRHS = new FlexString();

			insertFormattedString(LHS, SLHS);
			insertFormattedString(RHS, SRHS);

			tmp = getModelManager().addImplicitConstraint(SLHS, SRHS, FKey, FID);
		}

		return (tmp);
	}

	/**
	* Has the geometry engine recalculate all values.
	*/
	public void engineResolveConstraints() {
		(getModelManager().getMyEngine()).resolveConstraints();
	}
	/**
	* Gets the X-Origin of the coordinate system.
	*/
	public IntObj getXOrigin() {
		return (XOrigin);
	}
	/**
	* Gets the Y-Origin of the coordinate system.
	*/
	public IntObj getYOrigin() {
		return (YOrigin);
	}
	/**
	* Gets the radius of the twist dial control.
	*/
	public IntObj getArcToolRad() {
		return (ArcToolRad);
	}
	/**
	* Gets the orientation of the coordinate system.
	*/
	public double[][] getAxes() {
		return (Axes);
	}
	/**
	* Gets the "sigma 1" axis label.
	*/
	public MathImage getIxImg() {
		return (Ixs);
	}
	/**
	* Gets the "sigma 2" axis label.
	*/
	public MathImage getIyImg() {
		return (Iys);
	}
	/**
	* Gets the type of origin displayed.
	*/
	public int getOriginType() {
		return (OriginType);
	}
	/**
	* Gets the display list of the view.
	*/
	public HighLevelList getDispList() {
		return (DispList1);
	}
	/**
	* Gets whether the last mouse-down event was matched by some control.
	*/
	public int getLastClick() {
		return (LastClick);
	}
	/**
	* Gets the time at which the last mouse-down event orcurred.
	*/
	public long getMouseDownTime() {
		return (MouseDownTime);
	}
	/**
	* Gets the numeric type associated with the drag operation.
	*/
	public int getDragType() {
		return (DragType);
	}
	/**
	* Gets whether the view is a bound-depiction view.
	*/
	public boolean getBoundMode() {
		return (BoundMode);
	}
	/**
	* Sets the numeric type associated with the drag operation.
	*/
	public void setDragType(int in) {
		DragType = in;
	}
	/**
	* Sets whether the last mouse-down event matched some control point.
	*/
	public void setLastClick(int in) {
		LastClick = in;
	}
	/**
	* Gets an reference to whether the assignment arrow will be painted
	* using the "active" color.
	*/
	public IntObj getActive() {
		return (Active);
	}
	/**
	* If the last attempt to change or delete an expression produced an error,
	* retrieves the error code.
	*/
	public int getErrCode() {
		return ((getModelManager().getMyEngine()).getErrCode());
	}
	/**
	* Gets the list of all variables.
	*/
	public DGPHashMap getVarList() {
		return (getModelManager().getVarList());
	}
	/**
	* Gets the Mvec list map.
	*/
	public HashMap getMvecListMap() {
		return (getModelManager().getMvecListMap());
	}
	/**
	* Gets whether the view is displaying the assignment arrow.
	*/
	public boolean getDraggingAssign() {
		return (DraggingAssign);
	}
	/**
	* Sets whether the view is displaying the assignment arrow.
	*/
	public void setDraggingAssign(boolean in) {
		DraggingAssign = in;
	}
	/**
	* Gets the starting point of the assignment arrow.
	*/
	public PointF getStPt() {
		return (StPt);
	}
	/**
	* Sets the starting point of the assignment arrow.
	*/
	public PointF getCrPt() {
		return (CrPt);
	}
	/**
	* Gets the standard grey color used.
	*/
	public Integer getGreyIndex() {
		return (GreyIndex);
	}
	/**
	* Gets the standard green color used.
	*/
	public Integer getGreenIndex() {
		return (GreenIndex);
	}
	/**
	* Creates a DynRunner.
	*/
	public DynRunner createDynRunner() {
		return (getModelManager().createDynRunner());
	}
	/**
	* Creates a DynRunner, which may need to handle coordinates in a bound depiction.
	*/
	public DynRunner createDynRunner(boolean bound, Mvec Pt) {
		return (getModelManager().createDynRunner(bound, Pt));
	}
	/**
	* Gets the multivector associated with a variable name.
	*/
	public Mvec getNamedVar(FlexString in) {
		return (getModelManager().getNamedVar(in));
	}
	/**
	* Converts a formatted array to an expression string.
	*/
	public void insertFormattedString(Object[] in, FlexString out) {
		getModelManager().insertFormattedString(in, out);
	}
	/**
	* Creates a DynRunner for a one-shot action.
	*/
	public DynRunner createOneShotDyn() {
		return (getModelManager().createOneShotDyn());
	}
	/**
	* Executes a one-shot dyn created by createOneShotDyn().
	*/
	public boolean executeOneShotDyn(DynRunner in) {
		return (getModelManager().executeOneShotDyn(this, in));
	}

	/**
	* Crestes a dialog that allows the user to add or change an expression.
	*/
	protected void chgExpression() {
//		VerdantiumPropertiesEditor Nxt = DialogBoxes.chgDial(this);
//		ProgramDirector.showPropertyEditor(Nxt, this, "Add or Change Expression");
//		addWindowRecord(Nxt, GeomConstants.DialogWindow);
	};
	/**
	* Creates a dialog that allows the user to delete an expression.
	*/
	protected void delExpression() {
//		VerdantiumPropertiesEditor Nxt = DialogBoxes.delDial(this);
//		ProgramDirector.showPropertyEditor(Nxt, this, "Delete Expression");
//		addWindowRecord(Nxt, GeomConstants.DialogWindow);
	};
	/**
	* Creates a dialog that allows the user to delete a symbol.
	*/
	protected void delSymbol() {
//		VerdantiumPropertiesEditor nxt = DialogBoxes.delSymDial(this);
//		ProgramDirector.showPropertyEditor(nxt, this, "Delete Symbol");
//		addWindowRecord(nxt, GeomConstants.DialogWindow);
	};
	/**
	* Creates a dialog box that informs the user that a depictor by a particular name already exists.
	*/
	public void compDialBox(FlexString v, PointF i, Class d) {
//		DialogBoxes.compDial(this, v, i, d);
	};
	/**
	* Creates a dialog box that allows the user to set the color and properties of a depictor.
	*/
	
	public void colorDialBox(DrawObj in) throws IllegalInputException 
{
		VectorVictorActivity.activity.colorDialBox( in );
};

	/**
	* Creates a dialog that allows the user to edit a symbol.
	*/
	protected void editSymbol() {
//		VerdantiumPropertiesEditor nxt = DialogBoxes.symDial(this);
//		ProgramDirector.showPropertyEditor(nxt, this, "Build Symbol");
//		addWindowRecord(nxt, GeomConstants.DialogWindow);
	};

	/**
	*<B>Fun:</B> Handles a user request to delete an expression.
	*<P>
	*<B>In:</B> Variable name of expression to delete, dialog
	*	containing the information, current state
	*	of canvas.<BR>
	*<B>Out:</B> State of canvas may be modified.<BR>
	*<B>Pre:</B> Input objects valid.  canvas is in a consistent
	*	state.<BR>
	*<B>Post:</B> A request will be made to delete the expression.
	*	If an error is found, it will be reported in
	*	a dialog box.<BR>
	*@author Thorn Green
	*/
	protected void doDelExpression(String in) {
		boolean Err;
		FlexString Vari = new FlexString(in);

		pushUndoSymChg();
		Err = getModelManager().deleteExpression(Vari, EngineConstants.USER_MODE);

		getModelManager().globalRepaint();
		updateExpressionListeners();
		updateVariableListeners();

		if (Err) {
			int MyErr = (getModelManager().getMyEngine()).getErrCode();
			/* delExpression(); */
			stdErrorAlerts(MyErr);
		}

	};

	/**
	*<B>Fun:</B> Responds to a user request to create a depictor.
	*<P>
	*<B>In:</B> Depictor name, dialog containing request,
	*	current state of the canvas.<BR>
	*<B>Out:</B> Current state of canvas may be modified.<BR>
	*<B>Pre:</B> Input objects valid, canvas in a consistent state.<BR>
	*<B>Post:</B> Checks depictor name.  If it's invalid, puts up an
	*	error dialog box.  Otherwise creates depictor.<BR>
	*@author Thorn Green
	*/
	protected void doMakeVar(FlexString Vari2, DrawObjFactory MyFac) {
		boolean Err = false;
		int MyErr = 0;

		PointF InPt = MyFac.getPlaceAt();

		boolean SelfName = !(MyFac.getVectNamed());

		if (!SelfName) {

			Err = (getModelManager().getMyEngine()).verifyVariable(Vari2, EngineConstants.USER_MODE);
			if (!Err) {
				FlexString Vari = new FlexString();
				(getModelManager().getMyEngine()).extractVariable(Vari2, 0, Vari2.strlen(), Vari);
				Err = getModelManager().insertNewVar(Vari);
				if (!Err) {
					MyFac.setNewVectName(Vari);
					MyFac.createDepictor();
				}
				else {
					Err = false;
					Class DepicClass = MyFac.getDepicClass();
					compDialBox(Vari, InPt, DepicClass);
				}
			}
			else
				MyErr = (getModelManager().getMyEngine()).getErrCode();

			if (Err) {
				/* addDepiction( AltMode , InPt , VarList ); */
				stdErrorAlerts(MyErr);
			}

			Hexar MyHex = new Hexar();
			hexglo(InPt.x, InPt.y, null, false, MyHex);
			MyHex.getGlo().setBasis2(MyHex.getGlo().getBasis2() - 0.2);
			hexloc(null, false, MyHex);
			DepicCache = new PointF(MyHex.getLoc().x, MyHex.getLoc().y);

			updateVariableListeners();
		}
		else {
			MyFac.createDepictor();

			Hexar MyHex = new Hexar();
			hexglo(InPt.x, InPt.y, null, false, MyHex);
			MyHex.getGlo().setBasis2(MyHex.getGlo().getBasis2() - 0.2);
			hexloc(null, false, MyHex);
			DepicCache = new PointF(MyHex.getLoc().x, MyHex.getLoc().y);
		}

	};

	/**
	*<B>Fun:</B> Creates a new depictor from a user depictor request.
	*<P>
	*<B>In:</B> Depictor name, mouse position, depictor class,
	*	frame in which information was entered,
	*	current canvas state.<BR>
	*<B>Out:</B> Current canvas state modified.<BR>
	*<B>Pre:</B> Input objects valid.  The canvas is in a consistent state.<BR>
	*<B>Post:</B> A new depictor will be added to the canvas state.<BR>
	*@author Thorn Green
	*/
	protected void newVarComp(FlexString Vari, PointF InPt, Class DepicClass) {
		DrawObjFactory MyFac = new DrawObjFactory(this, getModelManager());
		MyFac.setNewVectName(Vari);
		MyFac.setDepicClass(DepicClass, false);
		MyFac.setPlaceAt(InPt);
		MyFac.createDepictor();
	};

	/**
	* Appends a depictor to the view.
	*/
	protected void localDisplayAppend(HighLevelList DisplayList, DGMNode MyNode) {
		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			DisplayList.left();
			DisplayList.insertRight(MyNode);
		}
		else
			DisplayList.insertRight(MyNode);
	}

	/**
	* Appends a depictor to the view.
	*/
	public void localDisplayAppend(DrawObj MyObj) {
		DGMNode MyNode = new DGMNode();
		MyNode.setMyDraw(MyObj);
		MyNode.setMyCoord(MyObj.makeCoordContext());
		localDisplayAppend(DispList1, MyNode);

		MyNode = new DGMNode();
		MyNode.setMyDraw(MyObj);
		MyNode.setMyCoord(MyObj.makeCoordContext());
		localDisplayAppend(DispList2, MyNode);
	}

	/**
	* Appends a depictor to all views of the model.
	*/
	public void displayAppend(DrawObj MyObj) {
		getModelManager().displayAppend(MyObj);
	}

	/**
	* Creates a new depictor with name <code>Vari</code> and mode <code>AltMode</code>.
	*/
	public DrawObj makeVar(FlexString Vari, int AltMode) {
		DrawObjFactory MyFac = new DrawObjFactory(this, getModelManager());
		MyFac.setNewVectName(Vari);
		MyFac.setDepicClass(AltMode);
		DrawObj Ret = MyFac.createDepictor();
		return (Ret);
	}

	/**
	*<B>Fun:</B> Changes an expression for the user.
	*<P>
	*<B>In:</B> Variable string, expression string, frame in which
	*	information was entered, engine context.<BR>
	*<B>Out:</B> To engine context.<BR>
	*<B>Pre:</B> Input objects valid, engine context set properly.<BR>
	*<B>Post:</B> The new expression will be sent to the engine.  If an error is found, an
	*	appropriate message will be returned to the user.<BR>
	*@author Thorn Green
	*/
	protected void doChgExpression(String inv, String ine) {
		boolean Err;
		FlexString Vari = new FlexString(inv);
		FlexString Expr = new FlexString(ine);

		pushUndoSymChg();
		Err = getModelManager().changeExpression(Vari, Expr, EngineConstants.USER_MODE);

		getModelManager().globalRepaint();
		updateExpressionListeners();
		updateVariableListeners();

		if (Err) {
			int MyErr = (getModelManager().getMyEngine()).getErrCode();
			stdErrorAlerts(MyErr);
		}

	};

	/**
	*<B>Fun:</B> Draws a standard arrow.
	*<P>
	*<B>In:</B> Graphics context, text color, start and end coordinates, text image.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Input objects are valid.<BR>
	*<B>Post:</B> The arrow will be drawn in the graphics context.<BR>
	*@author Thorn Green
	*/
	public void arrow(Canvas g, Integer TextColor, RectF line, MathImage img) {
		Paint p = new Paint();
		p.setColor( TextColor );
		double x1 = line.left;
		double y1 = line.top;
		double x2 = line.right;
		double y2 = line.bottom;
		double DX;
		double DY;
		double DelX;
		double DelY;
		double DeltaX = x2 - x1;
		double DeltaY = y2 - y1;
		double len = Math.sqrt(DeltaX * DeltaX + DeltaY * DeltaY);
		if (len < 0.001)
			len = 5;
		DelX = DeltaX / len;
		DelY = DeltaY / len;
		DX = -ArrLen * DeltaX / len;
		DY = -ArrLen * DeltaY / len;
		
		p.setStyle( Style.STROKE );
		g.drawLine(line.left, line.top, line.right, line.bottom, p);

		
		Path OrigPath = getArrowheadPath();
		p.setStyle( Style.FILL_AND_STROKE );
		
		int saveCount = g.save();
		
		
		g.translate( (float)x2 , (float)y2 );
		
		
		float[] matVals = {(float)DelX, (float)DelY,0f,(float)DelY, (float)-DelX,0f,0f, 0f,1.0f};
		Matrix mat = new Matrix();
		mat.setValues( matVals );
		g.concat(mat);
		
		// g.translate((float)ArrLen, 0f);
		
		g.drawPath(OrigPath,p);

        g.restoreToCount(saveCount);

		
		img.paintMath(hgr1, (int) (x1 - 2 * DX /* + DY */
		), (int) (y1 - 2 * DY /* - DX */
		));
	};

	/**
	*<B>Fun:</B> Draws a standard arrow.
	*<P>
	*<B>In:</B> Graphics context, text color, start and end coordinates, text image.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Input objects are valid.<BR>
	*<B>Post:</B> The arrow will be drawn in the graphics context.<BR>
	*@author Thorn Green
	*/
	public void linearSeg(Canvas g, Integer TextColor, RectF line, MathImage img) {
		Paint p = new Paint();
		p.setStyle( Style.STROKE );
		double x1 = line.left;
		double y1 = line.top;
		double x2 = line.right;
		double y2 = line.bottom;
		double DelX;
		double DelY;
		double DeltaX = x1 - x2;
		double DeltaY = y1 - y2;
		double ManLen = Math.abs(DeltaX) + Math.abs(DeltaY);
		if (ManLen < 0.001)
			ManLen = 5;
		DelX = ArrLen * DeltaX / ManLen;
		DelY = ArrLen * DeltaY / ManLen;

		p.setColor(TextColor);
		g.drawLine(line.left, line.top, line.right, line.bottom,p);

		img.paintMath(hgr1, (int) (x1 - 2 * DelX /* + DelY */
		), (int) (y1 - 2 * DelY /* - DelX */
		));
	};

	/**
	*<B>Fun:</B> Sets the input vector to the current default vector value.
	*<P>
	*<B>In:</B> The vector to modify, the current state of the position value.<BR>
	*<B>Out:</B> Input vector modified.<BR>
	*<B>Pre:</B> Input vector valid.<BR>
	*<B>Post:</B> The value of the input vector will equal the default vector value.<BR>
	*@author Thorn Green
	*/
	public void setNewDeltaVec(DrawObj depic, Mvec in) {
		double XVect = 0.0;
		double YVect = -2.0;
		double si = Math.sin(RotOffset);
		double co = Math.cos(RotOffset);
		double ln = Math.abs(co);
		if (ln < 0.4)
			ln = 0.4;
		double xv2 = ln * Math.abs(XVect * co + YVect * si);
		double yv2 = ln * (XVect * si + YVect * co);
		(in).setBasis1(xv2);
		(in).setBasis2(yv2);
		RotOffset = RotOffset - 0.5;
	};

	/**
	*<B>Fun:</B> Sets the input multivector to the current default phasor value.
	*<P>
	*<B>In:</B> The multivector to modify, the current state of the position value.<BR>
	*<B>Out:</B> Input multivector modified.<BR>
	*<B>Pre:</B> Input multivector valid.<BR>
	*<B>Post:</B> The value of the input multivector will equal the default phasor value.<BR>
	*@author Thorn Green
	*/
	public void setNewDeltaPhas(DrawObj depic, Mvec in) {
		double XVect = 0.0;
		double YVect = -2.0;
		double si = Math.sin(RotOffset);
		double co = Math.cos(RotOffset);
		double ln = Math.abs(co);
		if (ln < 0.4)
			ln = 0.4;
		double xv2 = ln * Math.abs(XVect * co + YVect * si);
		double yv2 = ln * (XVect * si + YVect * co);
		(in).setBasis(xv2);
		(in).setBasis12(yv2);
		RotOffset = RotOffset - 0.5;
	}

	/**
	*<B>Fun:</B> Sets the input vector to the current "Position A" value.
	*<P>
	*<B>In:</B> The vector to modify, the current state of the position value.<BR>
	*<B>Out:</B> Input vector modified.<BR>
	*<B>Pre:</B> Input vector valid.<BR>
	*<B>Post:</B> The value of the input vector will equal the "Position A" value.<BR>
	*@author Thorn Green
	*/
	public void setNewPosAVec(DrawObj depic, Mvec in) {
		double p = ((double) (YOffset % 8 + 1)) / 10.0;
		double q = 10 * (YOffset / 8);
		int width = retVisibleRect().width();
		int height = retVisibleRect().height();
		double xp = p * width + retVisibleRect().left;
		double yp = 0.4 * height + q + retVisibleRect().top;
		Hexar MyHex = new Hexar();
		hexglo(xp - (XOrigin.value), yp - (YOrigin.value), null, false, MyHex);
		(in).setBasis1(MyHex.getGlo().getBasis1());
		(in).setBasis2(MyHex.getGlo().getBasis2());
		YOffset++;
	}

	/**
	*<B>Fun:</B> Sets the input vector to the current "Position B" value.
	*<P>
	*<B>In:</B> The vector to modify, the current state of the position value.<BR>
	*<B>Out:</B> Input vector modified.<BR>
	*<B>Pre:</B> Input vector valid.<BR>
	*<B>Post:</B> The value of the input vector will equal the "Position B" value.<BR>
	*@author Thorn Green
	*/
	public void setNewPosBVec(DrawObj depic, Mvec in) {
		PointF MyPt = getViewportPosition();
		Hexar MyHex = new Hexar();
		(MyHex.getGlo()).setBasis1(-XOffset);
		(MyHex.getGlo()).setBasis2(MDYOffset);
		hexloc(null, false, MyHex);
		hexglo(
			MyHex.getLoc().x - XOrigin.value + MyPt.x + 100,
			MyHex.getLoc().y - YOrigin.value + MyPt.y + 100,
			null,
			false,
			MyHex);
		(in).setBasis1(MyHex.getGlo().getBasis1());
		(in).setBasis2(MyHex.getGlo().getBasis2());
		MDYOffset = MDYOffset - 0.2;
	}

	/**
	* Pulls a depictor from the drawing list of the view.
	*/
	protected DGMNode pullFromDrawingList(HighLevelList temp, DrawObj MyObj) {
		DGMNode MyDrawObj = null;
		DGMNode RetNode = null;
		HighLevelList next = new HighLevelList();

		if (!(temp.empty())) {
			temp.searchHead();
			boolean Done = false;

			while (!Done) {
				MyDrawObj = (DGMNode) temp.getNode();
				temp.copyDataPlusPtrInfo(next);
				next.right();

				if (MyDrawObj.getMyDraw() == MyObj) {
					RetNode = MyDrawObj;
					temp.eraseNodeInfo();
				}

				if (temp.empty())
					Done = true;
				else {
					next.copyDataPlusPtrInfo(temp);
					Done = temp.getHead();
				}
			}
		}

		if (RetNode == null)
			handleDListError(MyObj);

		return (RetNode);
	}

	/**
	* Handles an attempt to delete a depictor that isn't there.
	*/
	public void handleDListError(DrawObj MyObj) {
		System.out.println("Error.  Node not found.");
	}

	/**
	* Pulls a depictor from the drawing list of all views.
	*/
	public DGMNode pullFromDrawingList(DrawObj MyObj) {
		return (getModelManager().pullFromDrawingList(MyObj));
	}

	/**
	* Pulls a depictor from the drawing list of the view.
	*/
	public DGMNode localPullFromDrawingList(DrawObj MyObj) {
		DGMNode tmp = pullFromDrawingList(DispList2, MyObj);
		tmp = pullFromDrawingList(DispList1, MyObj);

		if (MyObj == LastClickDraw) {
			LastClickDraw = null;
			LocalLastClickDraw = null;
			LastClickCoord1 = null;
			LastClickCoord2 = null;
			LastClickDGM1 = null;
			LastClickDGM2 = null;
		}

		return (tmp);
	}

	/**
	* Brings a depictor to the front of all views.
	*/
	public void bringToFront(DrawObj MyObj) {
		getModelManager().bringToFront(MyObj);
	}

	/**
	* Brings a depictor to the front of the view.
	*/
	public void localBringToFront(DrawObj MyObj) {
		DGMNode DragDGM = pullFromDrawingList(DispList1, MyObj);

		if (DragDGM != null) {
			if ((!(DispList1.empty()))) {
				DispList1.searchHead();
				DispList1.left();
				DispList1.insertRight(DragDGM);
			}
			else
				DispList1.insertRight(DragDGM);
		}

		DragDGM = pullFromDrawingList(DispList2, MyObj);

		if (DragDGM != null) {
			if (!(DispList2.empty())) {
				DispList2.searchHead();
				DispList2.left();
				DispList2.insertRight(DragDGM);
			}
			else
				DispList2.insertRight(DragDGM);
		}
	}

	/**
	* Sets the coordinate context for the drag operation.
	*/
	public void setDragContext(DGMNode Node1) {
		CoordContext Node2 = null;

		if (!(DispList2.empty())) {
			boolean Done = false;
			DispList2.searchHead();

			while (!Done) {
				DGMNode TestDGM = (DGMNode) (DispList2.getNode());
				if (TestDGM.getMyDraw() == Node1.getMyDraw()) {
					Node2 = TestDGM.getMyCoord();
				}

				DispList2.right();
				Done = DispList2.getHead();
			}
		}

		setDragContext(Node1.getMyCoord(), Node2);
	}

	/**
	* Sends a depictor to the back of all views.
	*/
	public void sendToBack(DrawObj MyObj) {
		getModelManager().sendToBack(MyObj);
	}

	/**
	* Sends a depictor to the back of the view.
	*/
	public void localSendToBack(DrawObj MyObj) {
		DGMNode DragDGM = pullFromDrawingList(DispList1, MyObj);

		if (DragDGM != null) {
			if (!(DispList1.empty())) {
				DispList1.searchHead();
				DispList1.insertLeft(DragDGM);
			}
			else
				DispList1.insertRight(DragDGM);
		}

		DragDGM = pullFromDrawingList(DispList2, MyObj);

		if (DragDGM != null) {
			if (!(DispList2.empty())) {
				DispList2.searchHead();
				DispList2.insertLeft(DragDGM);
			}
			else
				DispList2.insertRight(DragDGM);
		}
	}

	/**
	* Handles the fact that a delegation link has been added or removed.  Does nothing.
	*/
	public void localDelegationEvent(boolean Add, DrawObj FromObj, DrawObj ToObj) {}

	/**
	*<B>Fun:</B> Redraws the depictional representation for a
	*	set of depictors.
	*<P>
	*<B>In:</B> Graphics context, current state of the canvas,
	*	display list DisplayList.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> All input objects valid.  DisplayList is consistent
	*	with display list structure.<BR>
	*<B>Post:</B> The depictors in DisplayList will be drawn into the
	*	grpahics context.<BR>
	*@author Thorn Green
	*/
	protected void updateCurrentDisplay(GeomKit thePort, Canvas g, Paint p, HighLevelList DisplayList) {
		boolean Done = false;
		int ThisMode = (getGeoTool(PrevToolMode)).getDrawingMode(this);

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DisplayList.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				MyDrw.drawYourself(thePort, MyDGM.getMyCoord(), BoundMode, g, p, ThisMode);
				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}
	};

	/**
	*<B>Fun:</B> Updates the depictional representation for a
	*	set of depictors.
	*<P>
	*<B>In:</B> Graphics context, current state of the canvas,
	*	display list DisplayList.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> All input objects valid.  DisplayList is consistent
	*	with display list structure.<BR>
	*<B>Post:</B> The depictors in DisplayList will be updated.<BR>
	*@author Thorn Green
	*/
	protected void updateDisplayDepictors(GeomKit thePort) {
		updateDisplayDepictors(thePort, DispList1);
	};

	/**
	*<B>Fun:</B> Updates the depictional representation for a
	*	set of depictors.
	*<P>
	*<B>In:</B> Graphics context, current state of the canvas,
	*	display list DisplayList.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> All input objects valid.  DisplayList is consistent
	*	with display list structure.<BR>
	*<B>Post:</B> The depictors in DisplayList will be updated.<BR>
	*@author Thorn Green
	*/
	protected void updateDisplayDepictors(GeomKit thePort, HighLevelList DisplayList) {
		boolean Done = false;
		int ThisMode = (getGeoTool(PrevToolMode)).getDrawingMode(this);

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DisplayList.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				MyDrw.updateYourself(this, MyDGM.getMyCoord(), BoundMode, ThisMode);
				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}
	};

	/**
	*<B>Fun:</B> Draws all the tools associated with a set of depictors for a particular mode.
	*<P>
	*<B>In:</B> Display list DisplayList, current state of the canvas.<BR>
	*<B>Out:</B> To the current graphics context.<BR>
	*<B>Pre:</B> DisplayList valid and consistent with display list structure.  Context variable valid.<BR>
	*<B>Post:</B> The depictors in DisplayList will be drawn into the context.<BR>
	*@author Thorn Green
	*/
	protected void updateDisplayControls(GeomKit thePort, Canvas g, Paint p, HighLevelList DisplayList) {
		boolean Done = false;
		int ThisMode = (getGeoTool(PrevToolMode)).getDrawingMode(this);

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DisplayList.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				MyDrw.drawYourTools(this, MyDGM.getMyCoord(), BoundMode, g, p, ThisMode);

				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}

	};

	/**
	*<B>Fun:</B> Draws all the tools associated with a set of depictors for a particular mode.
	*<P>
	*<B>In:</B> Last clicked depictors, current state of the canvas.<BR>
	*<B>Out:</B> To the current graphics context.<BR>
	*<B>Pre:</B> Context variable valid.  LastClickCoord set if LocalLastClickDraw set.<BR>
	*<B>Post:</B> The depictor LastClickDraw will be drawn into the context.<BR>
	*@author Thorn Green
	*/
	protected void updateSingleControl(GeomKit thePort, Canvas g, Paint p, HighLevelList DisplayList) {
		int ThisMode = (getGeoTool(PrevToolMode)).getDrawingMode(this);

		DrawObj MyDrw = LocalLastClickDraw;

		if (MyDrw != null) {
			if (DisplayList == DispList1)
				MyDrw.drawYourTools(this, LastClickCoord1, BoundMode, g, p, ThisMode);
			else
				MyDrw.drawYourTools(this, LastClickCoord2, BoundMode, g, p, ThisMode);
		}
	};

	/**
	*<B>Fun:</B> Responds to a user request to add a depiction of a particular type at a
	*	particular screen coordinate.
	*<P>
	*<B>In:</B> Depictor type in AltMode, mouse position in InPt, DisplayList.<BR>
	*<B>Out:</B> Dialog created and/or depictor added to current canvas state.<BR>
	*<B>Pre:</B> All input objects are valid.  canvas is in a consistent state.<BR>
	*<B>Post:</B> If depictor is self-naming, it will be created with a system name.  Otherwise, a dialog
	*	will be popped up to prompt for a depictor name.  A depictor will then be created
	*	if "OK" is clicked on the dialog and the name the user has put in is valid.<BR>
	*@author Thorn Green
	*/
	public void addDepiction(DrawObjFactory MyFac, int altMode) throws IllegalInputException {
		if (MyFac.getRawDrawObjSelfNaming() == false) {
			if (true) {
//				PointF tmp = MyFac.getPlaceAt();
//				if (tmp != null)
//					DepicCache = tmp;
//				VerdantiumPropertiesEditor nxt = DialogBoxes.newVarName(this, altMode);
//				ProgramDirector.showPropertyEditor(nxt, this, "Create Depictor");
//				addWindowRecord(nxt, GeomConstants.DialogWindow);
			}
		}
		else {
			MyFac.createDepictor();
		}
	}

	/**
	*<B>Fun:</B> Handles pre-drag mouse-down events for all modes other than AccessoryTransMode.
	*<P>
	*<B>In:</B> Current state of the canvas, input event.<BR>
	*<B>Out:</B> State of the canvas may be modified.<BR>
	*<B>Pre:</B> Event is valid, canvas is in a consistent state.<BR>
	*<B>Post:</B> An appropriate response to the mouse-down event will be produced.<BR>
	*@author Thorn Green
	*/
	protected void otherClickPreDrag(MotionEvent anEvent) {
		LastClick = NoMatch;

		boolean err = (getGeoTool(PrevToolMode)).handlePreDrag(anEvent, this);
		getModelManager().setDragSolverError(err);
	};

	/**
	*<B>Fun:</B> Handles dragging events for all modes other than AccessoryTransMode.
	*<P>
	*<B>In:</B> Current state of the canvas, input event.<BR>
	*<B>Out:</B> State of the canvas may be modified.<BR>
	*<B>Pre:</B> Event is valid, canvas is in a consistent state.<BR>
	*<B>Post:</B> An appropriate response to the drag event will be produced.<BR>
	*@author Thorn Green
	*/
	protected void otherClickAndDrag(MotionEvent anEvent, CoordContext PrtCon) {
		PointF LocEvent = new PointF(anEvent.getX() - XOrigin.value, anEvent.getY() - YOrigin.value);

		CrPt.set(LocEvent.x, LocEvent.y);

		boolean err = (getGeoTool(PrevToolMode)).handleDrag(anEvent, this, PrtCon);
		getModelManager().setDragSolverError(err);
	};

	/**
	*<B>Fun:</B> Handles whatever actions should be done on a mouse-up for all modes
	*	other than AccessoryTransMode.
	*<P>
	*<B>In:</B> The mouse-up event to handle, current state of the canvas.<BR>
	*<B>Out:</B> Current state of canvas may be modified.<BR>
	*<B>Pre:</B> The canvas is in a consistent state.  The event is valid.<BR>
	*<B>Post:</B> If an action needs to be performed, then that action will be enacted.<BR>
	*@author Thorn Green
	*/
	protected void otherClickPostDrag(MotionEvent anEvent) {
		boolean err = (getGeoTool(PrevToolMode)).handlePostDrag(anEvent, this);
		getModelManager().setDragSolverError(err);
	}

	/**
	* Displays an error dialog for a particular error code.
	*/
	public void stdErrorAlerts(int MyErr) {
		// DialogBoxes.stdErrorAlert(this, MyErr);
		Log.e("a "+MyErr, "a "+MyErr);
	};

	/**
	*<B>Fun:</B> Draws a "thick" line.
	*<P>
	*<B>In:</B> Graphics context, endpoints of line, pen width and height.<BR>
	*<B>Out:</B> To graphics context.<BR>
	*<B>Pre:</B> Width and height are greater than zero.<BR>
	*<B>Post:</B> A thick line will be drawn.<BR>
	*@author Thorn Green
	*/
	void drawThkLine(Canvas g, Paint p, double x1, double y1, double x2, double y2, int pwidth, int pheight) {
		p.setStrokeCap( Cap.SQUARE );
		p.setStrokeJoin( Join.MITER );
		p.setStrokeMiter( 1.0f );
		p.setStrokeWidth( pwidth );

		g.drawLine((float)x1, (float)y1, (float)x2, (float)y2,p);
	};

	/**
	* Clears the model, and resets the tool modes.
	*/
	public void newModel() {
		/* try {
			setBorderObject(null, null, null);
		}
		catch (Exception ex) {
			throw (new WrapRuntimeException("Default Border Failed", ex));
		} */
		getModelManager().clearModel(this);
		getModelManager().setTarget(this);
	}

	/**
	* Handles the clearing of the model.
	*/
	public void localClearModel() {
		XOffset = 1.3;
		RotOffset = 0.0;
		YOffset = 0;
		MDYOffset = -1.0;
		DispList1.eraseAllInfo();
		DispList2.eraseAllInfo();
		LastClickDraw = null;
		LocalLastClickDraw = null;
		LastClickCoord1 = null;
		LastClickCoord2 = null;
		LastClickDGM1 = null;
		LastClickDGM2 = null;
		UndoType = GeomKit.UndoDoNothing;
		UndoDragObj = null;
		XOrigin.value = 1000 + 100;
		YOrigin.value = 1000 + 100;
		localSetCoordRad(80);
		getModelManager().handleCoordRenderUpdate(72.0);
		RealAng.value = 135;
		ImAng.value = 135;
		RealBar.value = 50;
		ImBar.value = 50;
		Axes[0][0] = 0.9238795325;
		Axes[0][1] = -0.3826834324;
		Axes[1][0] = -0.3826834324;
		Axes[1][1] = -0.9238795325;
		ArcToolRad.value = 20;
		AxisRad.value = 50;
		ArrLen = 6.0;
		requestPrevToolModeChange(GeomConstants.FreeTransformationMode);
		resetViewPosition(XOrigin, YOrigin, new Rect(1000, 1000, 0, 0));
	}

	/**
	* Shows a file open dialog.
	*/
	protected void openFile() {
//		if (getXKit().getApplet() == null) {
//			EtherEventPropertySource TopObj = (EtherEventPropertySource) (getXKit().getTopObj());
//			ProgramDirectorPropertyEditor MyEdit = new ProgramDirectorPropertyEditor(TopObj, false, false, null);
//			ProgramDirector.showPropertyEditor(MyEdit, getGUI(), "Load Geometry File");
//		}

	}

	/**
	* Handles a request to load a file.
	*/
//	protected void handleProgramDirectorEvent(ProgramDirectorEvent e)
//		throws ClassNotFoundException, IOException, ResourceNotFoundException {
//		newModel();

		/* getXKit().showLoadFrame();
		getXKit().setSubjectLab( "Loading Persistent Store..." );
		getXKit().setLoadLab( MyFile.getName() );
		getXKit().setLoadFract( 5 , 10 ); */

//		try {
//			URL u = e.getProgramURL();
//			URLConnection MyCon = u.openConnection();
//			InputStream MyStream = MyCon.getInputStream();
//			Transferable trans = ProgramDirector.getTransferable(MyCon);
//			loadPersistentData(trans.getTransferDataFlavors()[0], trans);
//			MyStream.close();
//		}
//		catch (ClassNotFoundException ex) {
//			throw (ex);
//		}
//		catch (ResourceNotFoundException ex) {
//			throw (ex);
//		}
//		catch (IOException ex) {
//			throw (ex);
//		}
//
//		/* getXKit().hideLoadFrame(); */
//
//		getModelManager().globalRepaint();
//	}

	/**
	* Saves stream data to a Transferable object.
	*/
/*	protected Transferable saveStreamData(DataFlavor flavor) throws IOException {
		Transferable trans = null;

		if (flavor.getMimeType().equals("application/x-geometric-algebra; class=java.io.ByteArrayOutputStream")) {
			DataFlavor[] flavors = { flavor };
			ByteArrayOutputStream stream = new ByteArrayOutputStream();
			try {
				VTextProperties MyProp = new VTextProperties();
				saveProperties(MyProp);
				MyProp.store(stream, "Geom. Properties Header");
				stream.close();
				trans = new GenericStreamOutputTrans(flavors, stream);
			}
			catch (IOException e) {
				throw (e);
			}
		}

		return (trans);
	} */

	/**
	* Saves object data to a Transferable object.
	*/
/*	protected void saveObjectData(TransVersionBuffer in) throws IOException {
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		try {
			VTextProperties MyProp = new VTextProperties();
			saveProperties(MyProp);
			MyProp.store(stream, "Geom. Properties Header");
			stream.close();
			in.setProperty("StreamData", stream.toByteArray());
		}
		catch (IOException e) {
			throw (e);
		}

	} */

	/**
	* Loads properties for a multivector.
	*/
	public void loadMvecProperties(VTextProperties MyProp, String key, Mvec chg) throws DataFormatException {

		chg.setBasis(MyProp.getDouble(key + ".Basis"));

		chg.setBasis1(MyProp.getDouble(key + ".Basis1"));

		chg.setBasis2(MyProp.getDouble(key + ".Basis2"));

		chg.setBasis12(MyProp.getDouble(key + ".Basis12"));

	};

	/**
	* Saves properties for a multivector.
	*/
	public void saveMvecProperties(VTextProperties MyProp, String key, Mvec chg) {

		MyProp.putDouble(key + ".Basis", chg.getBasis());

		MyProp.putDouble(key + ".Basis1", chg.getBasis1());

		MyProp.putDouble(key + ".Basis2", chg.getBasis2());

		MyProp.putDouble(key + ".Basis12", chg.getBasis12());
	};

	/**
	* Gets the property prefix for a depictor.
	*/
	public String getPersistencePrefix(DrawObj in) {
		String tmp = getModelManager().globalPersistencePrefix() + ".DepictorDefs";
		String tmp2 = "." + (in.getFragID()).exportString() + (in.getVectName()).exportString();
		String out = tmp + tmp2;
		return (out);
	}

	/**
	* Creates a property save dialog.
	*/
	protected void handleSave() throws Throwable {
/* 		VerdantiumComponent target = (VerdantiumComponent) (getXKit().getTopObj());
		EtherEvent s2 = new StandardEtherEvent(this, StandardEtherEvent.getUrlLocn, null, target);
		Object o2 = ProgramDirector.fireEtherEvent(s2, null);
		Object[] param = (Object[]) (o2);

		boolean chk = param != null;
		if (chk)
			chk = param[0] != null;

		if (chk) {
			DataFlavor inf = (DataFlavor) (param[1]);
			param[1] = ProgramDirector.mapDataFlavorToOutput(inf);
			EtherEvent s3 = new StandardEtherEvent(this, StandardEtherEvent.objSaveAsEvent, null, target);
			s3.setParameter(param);
			ProgramDirector.fireEtherEvent(s3, null);
		}
		else {
			handleSaveAs();
		} */
	}

	/**
	* Creates a property save dialog.
	*/
	protected void handleSaveAs() {
//		VerdantiumComponent target = (VerdantiumComponent) (getXKit().getTopObj());
//		ProgramDirectorSaveEditor MySave = new ProgramDirectorSaveEditor((VerdantiumComponent) (target), null, true);
//		Component MyC = ProgramDirector.getEnclosingContainer(getGUI());
//		ProgramDirector.showComponent(MySave, (Container) MyC, "Save Dialog");
	}

	/**
	* Creates a property save dialog.
	*/
	protected void handleSaveACopyAs() {
//		VerdantiumComponent target = (VerdantiumComponent) (getXKit().getTopObj());
//		EtherEvent send = new StandardEtherEvent(this, StandardEtherEvent.objSaveACopyAsEvent, null, target);
//		ProgramDirectorSaveEditor MySave =
//			new ProgramDirectorSaveEditor((VerdantiumComponent) (target), null, true, send);
//		Component MyC = ProgramDirector.getEnclosingContainer(getGUI());
//		ProgramDirector.showComponent(MySave, (Container) MyC, "Save Dialog");
	}

	/**
	* Loads a ".geo" properties file, where <code>res</code> indicates whether to load
	* the file from a resource.
	*/
//	public void loadPropertiesFile(String filename, boolean res)
//		throws IOException, ResourceNotFoundException, ClassNotFoundException, DataFormatException {
//		getXKit().showLoadFrame();
//		getXKit().setSubjectLab("Loading Persistent Store...");
//		getXKit().setLoadLab(filename);
//		getXKit().setLoadFract(5, 10);
//
//		try {
//			VTextProperties MyProp = new VTextProperties();
//
//			URL MyLoc = getXKit().getBaseURL("temp/" + filename, res, GeomConstants.class);
//			URLConnection MyCon = MyLoc.openConnection();
//			InputStream MyStream = MyCon.getInputStream();
//			MyProp.load(MyStream);
//			MyStream.close();
//
//			/* InputStream MyStream = getXKit().getBaseStream(
//				"temp/" + filename , res );
//			MyProp.load( MyStream );
//			MyStream.close(); */
//
//			loadProperties(MyProp);
//		}
//		catch (ClassNotFoundException e) {
//			throw (e);
//		}
//		catch (IOException e) {
//			throw (e);
//		}
//		catch (ResourceNotFoundException e) {
//			throw (e);
//		}
//
//		getXKit().hideLoadFrame();
//
//		getModelManager().globalRepaint();
//	}

	/**
	* Loads a ".geo" properties file from the disk.
	*/
//	public void loadPropertiesFile(String filename)
//		throws IOException, ClassNotFoundException, ResourceNotFoundException {
//		try {
//			loadPropertiesFile(filename, false);
//		}
//		catch (IOException ex) {
//			throw (ex);
//		}
//		catch (ClassNotFoundException ex) {
//			throw (ex);
//		}
//		catch (ResourceNotFoundException ex) {
//			throw (ex);
//		}
//	}

	/**
	* Loads ".geo" properties from a properties list.
	*/
/*	protected void loadProperties(VTextProperties MyProp)
		throws ClassNotFoundException, ResourceNotFoundException, DataFormatException {
		int num_ele = 0;
		String key = getModelManager().globalPersistencePrefix();

		getModelManager().newEngine();
		getModelManager().getVarList().clear();

		getXKit().setSubjectLab("Loading Atomic Properties...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		try {
			loadAtomicProperties(MyProp, key + ".Atomic");
		}
		catch (ClassNotFoundException ex) {
			throw (ex);
		}
		catch (ResourceNotFoundException ex) {
			throw (ex);
		}

		getXKit().setSubjectLab("Creating Depictors...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		num_ele = getModelManager().performDepictorCreation(MyProp);

		getXKit().setSubjectLab("Configuring Depictors...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		getModelManager().loadDepictorProperties(this, MyProp, num_ele);

		getXKit().setSubjectLab("Creating Display List...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		getModelManager().performDisplayCreation(MyProp);

		getXKit().setSubjectLab("Applying Constraint Equations...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		loadConstraintProperties(MyProp);

		getXKit().setSubjectLab("Loading Atomic Properties...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		try {
			loadAtomicProperties(MyProp, key + ".Atomic");
		}
		catch (ClassNotFoundException ex) {
			throw (ex);
		}
		catch (ResourceNotFoundException ex) {
			throw (ex);
		}

		DialogBoxes.loadProperties(key, MyProp);

		getXKit().setSubjectLab("Loading Defined Symbols...");
		getXKit().setLoadLab("  ");
		getXKit().setLoadFract(0, 10);
		getModelManager().loadSymbolProperties(key, MyProp);

		getModelManager().getMyEngine().optimizeRep();

		updateExpressionListeners();
		updateVariableListeners();
	} */

	/**
	* Saves properties to the properties list.
	*/
/*	protected void saveProperties(VTextProperties MyProp) {
		String key = getModelManager().globalPersistencePrefix();

		ConstNum = 0;
		saveAtomicProperties(MyProp, key + ".Atomic");
		getModelManager().saveDepictorProperties(this, MyProp);
		saveDisplayProperties(this, DispList1, MyProp);

		String MyStr = getModelManager().globalPersistencePrefix() + ".Constraints";
		MyProp.putInt(MyStr + ".NumConstraints", ConstNum);
		DialogBoxes.saveProperties(key, MyProp);
		getModelManager().saveSymbolProperties(key, MyProp);
	} */

	/**
	* Loads all properties represented by simple atomic values.
	*/
/*	protected void loadAtomicProperties(VTextProperties MyProp, String key)
		throws ClassNotFoundException, ResourceNotFoundException, DataFormatException {

		Axes[0][0] = MyProp.getDouble(key + ".axisX");

		Axes[0][1] = MyProp.getDouble(key + ".axisY");

		Axes[1][0] = Axes[0][1];
		Axes[1][1] = -Axes[0][0];

		String tmp = MyProp.getProperty(key + ".XView");
		String tmp2 = MyProp.getProperty(key + ".YView");
		int tmpval = 0;
		int tmp2val = 0;
		if (tmp != null)
			tmpval = MyProp.getInt(key + ".XView");
		if (tmp2 != null)
			tmp2val = MyProp.getInt(key + ".YView");

		XOrigin.value = MyProp.getInt(key + ".XOrigin") + tmpval;

		YOrigin.value = MyProp.getInt(key + ".YOrigin") + tmp2val;

		resetViewPosition(XOrigin, YOrigin, new Rectangle(tmpval, tmp2val, 10, 10));

		localSetCoordRad(MyProp.getDouble(key + ".CoordRad"));

		RealAng.value = MyProp.getInt(key + ".realAng");

		ImAng.value = MyProp.getInt(key + ".imAng");

		RealBar.value = MyProp.getInt(key + ".realBar");

		ImBar.value = MyProp.getInt(key + ".imBar");

		XOffset = MyProp.getDouble(key + ".XOffset"); */

		/* YOffset = MyProp.getDouble( key + ".YOffset" ); */

		/* MDYOffset = MyProp.getDouble(key + ".MDYOffset");

		getModelManager().setUseRigorousClipping(MyProp.getBoolean(key + ".RigorousClipping"));

		getModelManager().setUnqID(MyProp.getInt(key + ".unqID"));

		String only = MyProp.getProperty(key + ".OnlyDesignerEdits");
		if (only != null)
			getModelManager().setOnlyDesignerEdits(MyProp.getBoolean(key + ".OnlyDesignerEdits"));

		boolean bkOpaque = true;
		String opaq = MyProp.getProperty(key + ".BkgndOpaque");
		if (opaq != null)
			bkOpaque = MyProp.getBoolean(key + ".BkgndOpaque");

		Integer bkColor = getBackground();
		String bkgc = MyProp.getProperty(key + ".BkgndColor");
		if (bkgc != null)
			bkColor = new Color(MyProp.getInt(key + ".BkgndColor"));

		setBackgroundState(bkColor, bkOpaque);

		String clss = MyProp.getProperty(key + ".BorderClass");
		if (clss != null) {
			try {
				BorderClass = clss;
				BorderTypes =
					(Class[]) (BorderPropertyEditor.getTypeObjArray(readStringArray(MyProp, key + ".BorderTypes")));
				BorderParam = (Object[]) (readSimpleObjectArray(MyProp, key + ".BorderParam"));
				if (BorderParam != null)
					setBorderObject(BorderClass, BorderTypes, BorderParam);
			}
			catch (ResourceNotFoundException e) {
				throw (e);
			}
			catch (ClassNotFoundException e) {
				throw (e);
			}
		}

		getModelManager().handleCoordRenderUpdate(72.0);
	} */

	/**
	* Saves properties related to scrolling, if any.
	*/
	protected void saveScrollProperties(VTextProperties MyProp, String key) {}

	/**
	* Saves all properties represented by simple atomic values.
	*/
	protected void saveAtomicProperties(VTextProperties MyProp, String key) {

/*		MyProp.putDouble(key + ".axisX", Axes[0][0]);

		MyProp.putDouble(key + ".axisY", Axes[0][1]);

		saveScrollProperties(MyProp, key);

		MyProp.putInt(key + ".XOrigin", XOrigin.value - getViewportPosition().x);

		MyProp.putInt(key + ".YOrigin", YOrigin.value - getViewportPosition().y);

		MyProp.putDouble(key + ".CoordRad", CoordRad);

		MyProp.putInt(key + ".realAng", RealAng.value);

		MyProp.putInt(key + ".imAng", ImAng.value);

		MyProp.putInt(key + ".realBar", RealBar.value);

		MyProp.putInt(key + ".imBar", ImBar.value);

		MyProp.putDouble(key + ".XOffset", XOffset);

		MyProp.putDouble(key + ".YOffset", YOffset);

		MyProp.putDouble(key + ".MDYOffset", MDYOffset);

		MyProp.putBoolean(key + ".RigorousClipping", getModelManager().getUseRigorousClipping());

		MyProp.putInt(key + ".unqID", getModelManager().getUnqID());

		MyProp.putBoolean(key + ".OnlyDesignerEdits", getModelManager().isOnlyDesignerEdits());

		MyProp.putBoolean(key + ".BkgndOpaque", bkgndOpaque);

		MyProp.putInt(key + ".BkgndColor", getBackground().getRGB());

		if (BorderClass != null) {
			MyProp.setProperty(key + ".BorderClass", BorderClass);
			writeStringArray(MyProp, key + ".BorderTypes", BorderPropertyEditor.getTypeStrArray(BorderTypes));
			writeSimpleObjectArray(MyProp, key + ".BorderParam", BorderParam);
		} */

	}

	/**
	* Saves the contents of the display list of the view.
	*/
	protected void saveDisplayProperties(GeomKit thePort, HighLevelList DisplayList, VTextProperties MyProp) {
		boolean Done = false;
		String key = getModelManager().globalPersistencePrefix();
		IntObj MyIntObj = new IntObj();
		MyIntObj.value = 0;

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DrawObj MyDrw = ((DGMNode) (DisplayList.getNode())).getMyDraw();
				FlexString FrgID = new FlexString();
				MyDrw.getFragID().copyAllInfo(FrgID);

				String key2 =
					getModelManager().globalPersistencePrefix()
						+ ".DispList"
						+ ".Depic_"
						+ (new Integer(MyIntObj.value)).toString();

				MyProp.put(key2 + ".UnqID", FrgID.exportString());
				MyProp.put(key2 + ".DepictorName", (MyDrw.getVectName()).exportString());

				MyIntObj.value = MyIntObj.value + 1;
				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}

		String MyKey = key + ".DispList.NumDepics";
		MyProp.putInt(MyKey, MyIntObj.value);
	};

	/**
	* Loads all constraints from the properties list.
	*/
	protected void loadConstraintProperties(VTextProperties MyProp) throws DataFormatException {
		String key = getModelManager().globalPersistencePrefix() + ".Constraints";

		int NumConst = MyProp.getInt(key + ".NumConstraints");

		int count;

		getModelManager().engineSetLinkOn(false);
		for (count = 0; count < NumConst; count++) {
			String MyPrefix =
				getModelManager().globalPersistencePrefix()
					+ ".Constraints"
					+ ".Constraint_"
					+ (new Integer(count)).toString();

			FlexString vari = new FlexString(MyProp.getPropertyNonNull(MyPrefix + ".LHS"));

			FlexString expr = new FlexString(MyProp.getPropertyNonNull(MyPrefix + ".RHS"));

			int Mode = MyProp.getInt(MyPrefix + ".Mode");

			vari.setInsertPoint(0);
			vari.insertChar('\'');
			vari.setInsertPoint(vari.strlen());
			vari.insertChar('\'');

			boolean Err = getModelManager().changeExpression(vari, expr, Mode);
			// getXKit().setLoadFract(count + 1, NumConst + 1);

		}
		getModelManager().engineSetLinkOn(true);
		// getXKit().setLoadFract(NumConst + 1, NumConst + 1);
	}

	/**
	* Saves a constraint on a depictor port to the properties list.
	*/
	public void registerPersistentConstraint(VTextProperties MyProp, FlexString ConstraintName) {
		FlexString MyExp = new FlexString();
		IntObj OutMode = new IntObj();
		FlexString vari = new FlexString();
		ConstraintName.copyString(vari);

		String MyPrefix =
			getModelManager().globalPersistencePrefix()
				+ ".Constraints"
				+ ".Constraint_"
				+ (new Integer(ConstNum)).toString();

		/* vari.setInsertPoint( 0 );
		vari.insertChar( '\'' );
		vari.setInsertPoint( vari.strlen() );
		vari.insertChar( '\'' ); */

		boolean MyBool = (getModelManager().getMyEngine()).getExprn(vari, MyExp, OutMode);

		if (MyBool) {
			MyProp.put(MyPrefix + ".LHS", ConstraintName.exportString());

			MyProp.put(MyPrefix + ".RHS", MyExp.exportString());

			MyProp.putInt(MyPrefix + ".Mode", OutMode.value);

			ConstNum++;
		}
	}

	/**
	* Writes a string array to the properties list.
	*/
	protected void writeStringArray(VTextProperties MyProp, String key, String[] arr) {
		int count;
		int max = arr.length;

		MyProp.putInt(key + ".Length", max);

		for (count = 0; count < max; count++) {
			MyProp.setProperty(key + ".Ele_" + count + ".Val", arr[count]);
		}
	}

	/**
	* Writes an array of simple objects to the properties list.
	*/
	protected void writeSimpleObjectArray(VTextProperties MyProp, String key, Object[] arr) {
		int count;
		int max = arr.length;

		MyProp.putInt(key + ".Length", max);

		for (count = 0; count < max; count++) {
			MyProp.setProperty(key + ".Ele_" + count + ".Class", arr[count].getClass().getName());
			MyProp.setProperty(key + ".Ele_" + count + ".Val", arr[count].toString());
		}
	}

	/**
	* Reads a string array from the properties list.
	*/
	protected String[] readStringArray(VTextProperties MyProp, String key) throws DataFormatException {
		int count;

		int max = MyProp.getInt(key + ".Length");
		String[] arr = new String[max];

		for (count = 0; count < max; count++) {
			arr[count] = MyProp.getPropertyNonNull(key + ".Ele_" + count + ".Val");
		}

		return (arr);
	}

	/**
	* Reads an array of simple objects from the properties list.
	*/
/*	protected Object[] readSimpleObjectArray(VTextProperties MyProp, String key)
		throws ClassNotFoundException, ResourceNotFoundException, DataFormatException {
		int count;

		int max = MyProp.getInt(key + ".Length");
		Object[] arr = new Object[max];
		Object[] ret = arr;

		for (count = 0; count < max; count++) {
			try {
				String cname = MyProp.getPropertyNonNull(key + ".Ele_" + count + ".Class");
				String vname = MyProp.getPropertyNonNull(key + ".Ele_" + count + ".Val");
				Class clss = Class.forName(cname, true, Meta.getDefaultClassLoader());
				Class[] typ = { String.class };
				Object[] val = { vname };
				arr[count] = clss.getConstructor(typ).newInstance(val);
			}
			catch (ClassNotFoundException e) {
				throw (e);
			}
			catch (Exception e) {
				throw (new ResourceNotFoundException(e));
			}
		}

		return (ret);
	} */

	/**
	*<B>Fun:</B> Performs an undo operation for the user.
	*<P>
	*<B>In:</B> Current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas may be modified.<BR>
	*<B>Pre:</B> The canvas is in a consistent state.  The proper "push" operations have been called.<BR>
	*<B>Post:</B> The previous operation will be un-done.  Not fully implemented.  Reserved for future expansion.<BR>
	*@author Thorn Green
	*/
	public void popUndo() throws MathImageParseException {
		switch (UndoType) {
			case GeomKit.UndoDoNothing :
				break;
			case GeomKit.UndoPaletteChg :
				/* !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!1 */
				break;
			case GeomKit.UndoOrgChg :
				popUndoOrgChg();
				break;
			case GeomKit.UndoObjChg :
				popUndoObjChg();
				break;
			case GeomKit.UndoSymChg :
				popUndoSymChg();
				break;
			case UndoMakeDepic :
				popUndoMakeDepic();
				break;
			case UndoDeleteDepic :
				popUndoDeleteDepic();
				break;
			case UndoColorChange :
				popUndoColorChange();
				break;
		}
	}

	/**
	* Gets the virtual position of the current viewport.
	*/
	protected PointF getViewportPosition() {
		return (new PointF(0, 0));
	}

	/**
	* Sets the horizontal scroll bar policy, if a scroll bar is being used.
	*/
	public void setHorizontalScrollBarPolicy(int in) {}

	/**
	* Sets the vertical scroll bar policy, if a scroll bar is being used.
	*/
	public void setVerticalScrollBarPolicy(int in) {}

	/**
	* Reserved for future expansion.
	*/
	void popUndoMakeDepic() /* Will be reworked !!!!!!! */ {
		/* UndoDragObj = ( (DGMNode) getModelManager().getVarList().getFrag( UndoDepicName ) ).getMyDraw();
		getModelManager().getVarList().clear();
		UndoType = GeomKit.UndoDeleteDepic; */
	}

	/**
	* Reserved for future expansion.
	*/
	public void pushUndoMakeDepic(FlexString VarName) /* Will be reworked !!!!!!! */ {
		/* popOthers();
		UndoDepicName = new FlexString();
		VarName.copyString( UndoDepicName );
		UndoType = GeomKit.UndoMakeDepic; */
	}

	/**
	* Reserved for future expansion.
	*/
	void popUndoDeleteDepic() /* Will be reworked !!!!!!! */ {
		/* getModelManager().getVarList().insertNode( UndoDragObj.getVectName() );
		DrawObj Und = ( (DGMNode) getModelManager().getVarList().getFrag( UndoDragObj.getVectName() ) ).getMyDraw();
		getModelManager().getVarList().setNode( UndoDragObj ); */
		/* Und.eraseNode() */

		/* if( UndoDepicName == null )
			{
			UndoDepicName = new FlexString();
			( UndoDragObj.getVectName() )
				.copyString( UndoDepicName );
			} */
		UndoType = GeomKit.UndoMakeDepic;
	}

	/**
	* Reserved for future expansion.
	*/
	public void pushUndoDeleteDepic(DrawObj in) /* Will be reworked !!!!!!! */ {
		/* popOthers();
		UndoDragObj = in;
		UndoType = GeomKit.UndoDeleteDepic; */
	}

	/**
	* Reserved for future expansion.
	*/
	public void pushUndoObjChg(DrawObj in) {
		popOthers();
		UndoDragObj = in;
		in.pushDragUndo();
		UndoType = GeomKit.UndoObjChg;
	}

	/**
	* Reserved for future expansion.
	*/
	public void pushUndoSymChg() /* Will be reworked !!!!!!! */ {
		popOthers();
		UndoType = GeomKit.UndoSymChg;
	}

	/**
	* Reserved for future expansion.
	*/
	void popUndoObjChg() {
		if (UndoDragObj != null) {
			UndoDragObj.popDragUndo();
			(getModelManager().getMyEngine()).resolveConstraints();
			getModelManager().globalRepaint();
		}
	}

	/**
	* Reserved for future expansion.
	*/
	void popUndoSymChg() /* Will be reworked !!!!!!! */ {
		getModelManager().popUndo();
		(getModelManager().getMyEngine()).resolveConstraints();
		getModelManager().globalRepaint();
		updateExpressionListeners();
		updateVariableListeners();
	}

	/**
	*<B>Fun:</B> Stacks information necessary to undo a coordinate system change.
	*<P>
	*<B>In:</B> Current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas modified.<BR>
	*<B>Pre:</B> canvas is in a consistent state.  The coord. sys. of a depictor is about to be changed.<BR>
	*<B>Post:</B> The original coord. sys. values will be stored.  Not fully implemented.  Reserved for future expansion.<BR>
	*@author Thorn Green
	*/
	public void pushUndoOrgChg() {
		int count1;
		int count2;

		popOthers();
		for (count1 = 0; count1 < 2; count1++)
			for (count2 = 0; count2 < 2; count2++) {
				UndoAxes[count1][count2] = Axes[count1][count2];
			}
		UndoArcToolRad = ArcToolRad.value;
		UndoAxisRad = AxisRad.value;
		UndoXOrigin = XOrigin.value;
		UndoYOrigin = YOrigin.value;
		UndoCoordRad = CoordRad;
		UndoRealAng = RealAng.value;
		UndoImAng = ImAng.value;
		UndoRealBar = RealBar.value;
		UndoImBar = ImBar.value;
		UndoArrLen = ArrLen;
		UndoBoundMode = BoundMode;
		UndoAdvancedControls = AdvancedControls;
		// UndoBkgndOpaque = bkgndOpaque;
		UndoBkgndColor = getBackgroundColor();

		UndoType = GeomKit.UndoOrgChg;
	}

	/**
	*<B>Fun:</B> Performs an undo operation on the state of the origin coordinate system.
	*<P>
	*<B>In:</B> Current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas modified.<BR>
	*<B>Pre:</B> Coord. sys. has recently happened.  Push-undo on coord. sys. change has been done.<BR>
	*<B>Post:</B> The coord. sys. values will be changed back to the original versions.  Not filly implemented.
	*	Reserved for future expansion.<BR>
	*@author Thorn Green
	*/
	void popUndoOrgChg() {
		int count1;
		int count2;
		double TmpAxes[][] = new double[2][2];
		int TmpArcToolRad = 0;
		int TmpAxisRad = 0;
		int TmpXOrigin = 0;
		int TmpYOrigin = 0;
		double TmpCoordRad = 0;
		int TmpRealAng = 0;
		int TmpImAng = 0;
		int TmpRealBar = 0;
		int TmpImBar = 0;
		double TmpArrLen = 0;
		boolean TmpBoundMode = false;
		boolean TmpAdvancedControls = false;
		boolean TmpBkgndOpaque = false;
		Integer TmpBkgndColor = null;

		for (count1 = 0; count1 < 2; count1++)
			for (count2 = 0; count2 < 2; count2++) {
				TmpAxes[count1][count2] = Axes[count1][count2];
			}
		TmpArcToolRad = ArcToolRad.value;
		TmpAxisRad = AxisRad.value;
		TmpXOrigin = XOrigin.value;
		TmpYOrigin = YOrigin.value;
		TmpCoordRad = CoordRad;
		TmpRealAng = RealAng.value;
		TmpImAng = ImAng.value;
		TmpRealBar = RealBar.value;
		TmpImBar = ImBar.value;
		TmpArrLen = ArrLen;
		TmpBoundMode = BoundMode;
		TmpAdvancedControls = AdvancedControls;
		// TmpBkgndOpaque = bkgndOpaque;
		TmpBkgndColor = getBackgroundColor();

		for (count1 = 0; count1 < 2; count1++)
			for (count2 = 0; count2 < 2; count2++) {
				Axes[count1][count2] = UndoAxes[count1][count2];
			}
		ArcToolRad.value = UndoArcToolRad;
		AxisRad.value = UndoAxisRad;
		XOrigin.value = UndoXOrigin;
		YOrigin.value = UndoYOrigin;
		localSetCoordRad(UndoCoordRad);
		RealAng.value = UndoRealAng;
		ImAng.value = UndoImAng;
		RealBar.value = UndoRealBar;
		ImBar.value = UndoImBar;
		ArrLen = UndoArrLen;
		BoundMode = UndoBoundMode;
		AdvancedControls = UndoAdvancedControls;
		setBackgroundState(UndoBkgndColor);

		for (count1 = 0; count1 < 2; count1++)
			for (count2 = 0; count2 < 2; count2++) {
				UndoAxes[count1][count2] = TmpAxes[count1][count2];
			}
		UndoArcToolRad = TmpArcToolRad;
		UndoAxisRad = TmpAxisRad;
		UndoXOrigin = TmpXOrigin;
		UndoYOrigin = TmpYOrigin;
		UndoCoordRad = TmpCoordRad;
		UndoRealAng = TmpRealAng;
		UndoImAng = TmpImAng;
		UndoRealBar = TmpRealBar;
		UndoImBar = TmpImBar;
		UndoArrLen = TmpArrLen;
		UndoBoundMode = TmpBoundMode;
		UndoAdvancedControls = TmpAdvancedControls;
		UndoBkgndOpaque = TmpBkgndOpaque;
		UndoBkgndColor = TmpBkgndColor;
		/* !!!!!!!!!!!!!!!!!!!!! solv. coord rad. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!! */

		getModelManager().globalRepaint();
	}

	/**
	*<B>Fun:</B> Stacks information necessary to undo a color change.
	*<P>
	*<B>In:</B> Current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas modified.<BR>
	*<B>Pre:</B> canvas is in a consistent state.  The color of a depictor is about to be changed.<BR>
	*<B>Post:</B> The original color values will be stored.  Not fully implewmented.  Reserved for future expansion.<BR>
	*@author Thorn Green
	*/
	public void pushUndoColorChange(DrawObj in) {
		popOthers();
		UndoType = GeomKit.UndoColorChange;

		UndoDragObj = in;
		UndoFrontLineColor = in.getFrontLineColor();
		UndoBackLineColor = in.getBackLineColor();
		UndoTextColor = in.getTextColor();
		UndoFrontLineVisible = in.getFrontLineVisible();
		UndoBackLineVisible = in.getBackLineVisible();
		UndoTextVisible = in.getTextVisible();
		UndoControlsVisible = in.getControlsVisible();
		UndoTextPtSz = in.getTextPtSz();
	}

	/**
	*<B>Fun:</B> Performs an undo operation on a color change.
	*<P>
	*<B>In:</B> Current state of the canvas.<BR>
	*<B>Out:</B> Current state of the canvas modified.<BR>
	*<B>Pre:</B> Color change has recently happened.  Push-undo on color change has been done.<BR>
	*<B>Post:</B> The color values will be changed back to the original versions.  Not fully implemented.<BR>
	*	Reserved for future expansion.
	*@author Thorn Green
	*/
	void popUndoColorChange() throws MathImageParseException {
		DrawObj in = UndoDragObj;

		Integer TmpFrontLineColor = in.getFrontLineColor();
		Integer TmpBackLineColor = in.getBackLineColor();
		Integer TmpTextColor = in.getTextColor();
		boolean TmpFrontLineVisible = in.getFrontLineVisible();
		boolean TmpBackLineVisible = in.getBackLineVisible();
		boolean TmpTextVisible = in.getTextVisible();
		boolean TmpControlsVisible = in.getControlsVisible();
		int TmpTextPtSz = in.getTextPtSz();

		in.setFrontLineColor(UndoFrontLineColor);
		in.setBackLineColor(UndoBackLineColor);
		in.setTextColor(UndoTextColor);
		in.setFrontLineVisible(UndoFrontLineVisible);
		in.setBackLineVisible(UndoBackLineVisible);
		in.setTextVisible(UndoTextVisible);
		in.setControlsVisible(UndoControlsVisible);
		in.setTextPtSz(UndoTextPtSz);

		UndoFrontLineColor = TmpFrontLineColor;
		UndoBackLineColor = TmpBackLineColor;
		UndoTextColor = TmpTextColor;
		UndoFrontLineVisible = TmpFrontLineVisible;
		UndoBackLineVisible = TmpBackLineVisible;
		UndoTextVisible = TmpTextVisible;
		UndoControlsVisible = TmpControlsVisible;
		UndoTextPtSz = TmpTextPtSz;

		String Str = (in.getVectName()).exportString();
		in.setDepicImage(makeDepicMathImage(Str, in.getTextColor(), in.getTextPtSz(), in.getNamedVar()));

		EtherEvent send = new DrawObjEtherEvent(this, DrawObjEtherEvent.undoTypeControl, null, in);
		send.setParameter(this);
		in.processObjEtherEvent(send, null);

		send = new DrawObjEtherEvent(this, DrawObjEtherEvent.undoCustomControl, null, in);
		send.setParameter(this);
		in.processObjEtherEvent(send, null);

		getModelManager().globalRepaint();
	}

	/**
	* Not fully implemented.  Reserved for future expansion.
	*/
	public void popOthers() {
		UndoFrontLineColor = null;
		UndoBackLineColor = null;
		UndoTextColor = null;
		UndoDragObj = null;
		(getModelManager().getUndoVarList()).clear();
		if (UndoDragObj != null) {
			UndoDragObj.popOthers();
			UndoDragObj = null;
		}

		if (UndoDepicName != null) {
			UndoDepicName.eraseAll();
			UndoDepicName = null;
		}
	}

	/**
	* Handles a change in the coordinate system by a depictor.
	*/
	public void handleCoordAdjust(DrawObj InDrw, boolean ChgDelta, boolean activeAdjust) {
		if (activeAdjust) {
			boolean Done = false;
			HighLevelList DisplayList = getDispList();

			if (!(DisplayList.empty())) {
				DisplayList.searchHead();
				while (!Done) {
					DGMNode MyDGM = (DGMNode) DisplayList.getNode();
					DrawObj MyDrw = MyDGM.getMyDraw();
					if (MyDrw != InDrw)
						MyDrw.handleCoordAdjust(this, MyDGM.getMyCoord(), MyDGM.getTmpCoord(), BoundMode, ChgDelta);

					DisplayList.right();
					Done = DisplayList.getHead();
				}
			}
		}

		getModelManager().handleCoordRenderUpdate(72.0);
		engineResolveConstraints();
	};

	/**
	* Informs the view that changes to the coordinate system have ended.
	*/
	public void endCoordAdjust() {
		boolean Done = false;
		HighLevelList DisplayList = getDispList();

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DisplayList.getNode();
				MyDGM.setTmpCoord(null);

				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}

	};

	/**
	* Informs the view that changes to the coordinate system have started.
	*/
	public void startCoordAdjust() {
		boolean Done = false;
		HighLevelList DisplayList = getDispList();

		if (!(DisplayList.empty())) {
			DisplayList.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DisplayList.getNode();
				MyDGM.setTmpCoord((CoordContext) (MyDGM.getMyCoord().copyAll()));

				DisplayList.right();
				Done = DisplayList.getHead();
			}
		}

	};

	/**
	*<B>Fun:</B> Performs a local to global coordinate conversion on the input Hexar.
	*<P>
	*<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
	*<B>Out:</B> Hexar modified.<BR>
	*<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
	*<B>Post:</B> The global coordinate values of the Hexar will be updated.<BR>
	*@author Thorn Green.
	*/
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Hexar hex) {
		double xval;
		double yval;
		double InMat[][] = { { -Axes[1][1], Axes[0][1] }, {
				Axes[1][0], -Axes[0][0] }
		};
		hex.getLoc().set((float)x, (float)y);
		xval = ((x * InMat[0][0] + y * InMat[0][1]) / CoordRad);
		yval = ((x * InMat[1][0] + y * InMat[1][1]) / CoordRad);

		if (bound) {
			xval += cntr.getBasis1();
			yval += cntr.getBasis2();
		}

		hex.getGlo().setBasis1(xval);
		hex.getGlo().setBasis2(yval);
	}

	/**
	*<B>Fun:</B> Performs a local to global coordinate conversion on the input Hexar.
	*<P>
	*<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
	*<B>Out:</B> Hexar modified.<BR>
	*<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
	*<B>Post:</B> The global coordinate values of the Hexar will be updated.<BR>
	*@author Thorn Green.
	*/
	public void hexglo(double x, double y, Mvec cntr, boolean bound, Mvec glo, Hexar hex) {
		double xval;
		double yval;
		double InMat[][] = { { -Axes[1][1], Axes[0][1] }, {
				Axes[1][0], -Axes[0][0] }
		};
		hex.getLoc().set((float)x, (float)y);
		xval = ((x * InMat[0][0] + y * InMat[0][1]) / CoordRad);
		yval = ((x * InMat[1][0] + y * InMat[1][1]) / CoordRad);

		if (bound) {
			xval += cntr.getBasis1();
			yval += cntr.getBasis2();
		}

		glo.setBasis1(xval);
		glo.setBasis2(yval);
	}

	/**
	*<B>Fun:</B> Performs a global to local coordinate conversion on the input Hexar.
	*<P>
	*<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
	*<B>Out:</B> Hexar modified.<BR>
	*<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
	*<B>Post:</B> The local coordinate values of the Hexar will be updated.<BR>
	*@author Thorn Green.
	*/
	public void hexloc(Mvec cntr, boolean bound, Hexar hex) {
		double x = hex.getGlo().getBasis1();
		double y = hex.getGlo().getBasis2();

		if (bound) {
			x = x - cntr.getBasis1();
			y = y - cntr.getBasis2();
		}

		double ptx = (x * Axes[0][0] + y * Axes[0][1]) * CoordRad;
		double pty = (x * Axes[1][0] + y * Axes[1][1]) * CoordRad;

		/* double max = Math.max( Math.abs( ptx ) , Math.abs( pty ) );
		if( max > 32000.0 )
			{
			ptx = 32000.0 * ptx / max;
			pty = 32000.0 * pty / max;
			} */

		hex.getLoc().set((float)ptx, (float)pty);
	}

	/**
	*<B>Fun:</B> Performs a global to local coordinate conversion on the input Hexar.
	*<P>
	*<B>In:</B> Input Hexar, coordinate system for conversion.<BR>
	*<B>Out:</B> Hexar modified.<BR>
	*<B>Pre:</B> Hexar valid, coordinate system consistent.<BR>
	*<B>Post:</B> The local coordinate values of the Hexar will be updated.<BR>
	*@author Thorn Green.
	*/
	public void hexloc(Mvec cntr, boolean bound, Mvec glo, Hexar hex) {
		double x = glo.getBasis1();
		double y = glo.getBasis2();

		if (bound) {
			x = x - cntr.getBasis1();
			y = y - cntr.getBasis2();
		}

		double ptx = (x * Axes[0][0] + y * Axes[0][1]) * CoordRad;
		double pty = (x * Axes[1][0] + y * Axes[1][1]) * CoordRad;

		/* double max = Math.max( Math.abs( ptx ) , Math.abs( pty ) );
		if( max > 32000.0 )
			{
			ptx = 32000.0 * ptx / max;
			pty = 32000.0 * pty / max;
			} */

		hex.getLoc().set((float)ptx, (float)pty);
	}

	/**
	* Gets the unit angle for the scalar twist dial control.
	*/
	public IntObj getRealAng() {
		return RealAng;
	};
	/**
	* Gets the unit angle for the imaginary twist dial control.
	*/
	public IntObj getImAng() {
		return ImAng;
	};
	/**
	* Gets the height of the unit scalar bargraph.
	*/
	public IntObj getRealBar() {
		return RealBar;
	};
	/**
	* Gets the height of the unit imaginary bargraph.
	*/
	public IntObj getImBar() {
		return ImBar;
	};
	/**
	* Gets the default magenta color for depictors.
	*/
	public Integer getMagentaIndex() {
		return MagentaIndex;
	};
	/**
	* Gets the default cyan color for depictors.
	*/
	public Integer getCyanIndex() {
		return CyanIndex;
	};
	/**
	* Makes the view a bound depiction.
	*/
	public void setBoundDepiction() {
		BoundMode = true;
		invalidate(); // postInvalidate();
		firePropertyChange(ToolPortLocalDepicMode, null, null);
	};
	/**
	* Makes the view a free depiction.
	*/
	public void setFreeDepiction() {
		BoundMode = false;
		invalidate(); // postInvalidate();
		firePropertyChange(ToolPortLocalDepicMode, null, null);
	};
	/**
	* Gets whether advanced controls are displayed.
	*/
	public boolean getAdvancedControls() {
		return (AdvancedControls);
	};
	/**
	* Sets whether advanced controls are displayed.
	*/
	protected void setAdvancedControls(boolean in) {
		AdvancedControls = in;
		firePropertyChange(ToolPortLocalAdvMode, null, null);
	};
	/**
	* Gets the mode for the display controls.
	*/
	public boolean getDisplayControlMode() {
		return (ShowDisplayControls);
	}
	/**
	* Shows display controls for all depictors.
	*/
	protected void showDisplayControls() {
		ShowDisplayControls = true;
		firePropertyChange(ToolPortLocalDisplayControlMode, null, null);
	}
	/**
	* Hides display controls for all depictors except the selected depictor.
	*/
	protected void hideDisplayControls() {
		ShowDisplayControls = false;
		firePropertyChange(ToolPortLocalDisplayControlMode, null, null);
	}
	/**
	* Repaints all views.
	*/
	public void globalRepaint() {
		getModelManager().globalRepaint();
	}
	/**
	* Gets the list of depictor types.
	*/
	public DepicClassStore getDepicStore() {
		return (getModelManager().getDepicStore());
	}
	/**
	* Deletes a depictor.
	*/
	public boolean deleteDepictor(DrawObj SelDrw) {
		return (getModelManager().deleteDepictor(SelDrw));
	}
	/**
	* Gets the list of user-defined symbols.
	*/
	public SymMap getGloSymMap() {
		return (getModelManager().getGloSymMap());
	}

	/**
	* Sets the tool mode.
	*/
	public final boolean requestPrevToolModeChange(int in) {
		boolean ret = false;
		if (getGeoTool(in) != null) {
			Ktool tool = getGeoTool(in);
			ret = tool.requestToolModeChange(this);
			if (ret) {
				int tmp = PrevToolMode;
				PrevToolMode = in;
				if (in != tmp)
					firePropertyChange(ToolPortLocalPrevToolMode, null, null);
				//if (geoTools != null)
				//	setCursor(new Cursor((getGeoTool(PrevToolMode)).getCursorType()));
				invalidate(); // postInvalidate();
			}
		}
		return (ret);
	}
	/**
	* Gets the tool mode.
	*/
	public final int getPrevToolMode() {
		return (PrevToolMode);
	}

	/**
	* Displays help on a particular mode.
	*/
	public void displayModeHelp(int InMode) {
//		Class ProgramClass = (getGeoTool(InMode)).getClass();
//		Class[] types = { VerdantiumComponent.class };
//		Object[] param = { this };
//		try {
//			Method ClassMeth = (ProgramClass).getMethod("displayVerdantiumHelp", types);
//			ClassMeth.invoke(null, param);
//		}
//		catch (Exception e) {
//			VerdantiumUtils.produceMessageWindow(
//				e,
//				"No Help Available On This Tool",
//				"No Help Available On This Tool : ",
//				"There is no help available on this tool.",
//				this,
//				this);
//		}
	}

	/**
	* Displays help on a particular mode.
	*/
	public void displayDepicHelp(int InAltMode) {
//		Class ProgramClass = getDepicStore().getDepictorNode(InAltMode).DepicDrawObj;
//		Class[] types = { VerdantiumComponent.class };
//		Object[] param = { this };
//		try {
//			Method ClassMeth = (ProgramClass).getMethod("displayVerdantiumHelp", types);
//			ClassMeth.invoke(null, param);
//		}
//		catch (Exception e) {
//			VerdantiumUtils.produceMessageWindow(
//				e,
//				"No Help Available On This Depictor",
//				"No Help Available On This Depictor : ",
//				"There is no help available on this depictor.",
//				this,
//				this);
//		}
	}

	/**
	* Gets the up image button url on a particular mode.
	*/
	public URL getUpImgUrl(int InMode) {
		Object myo = null;
		Class ProgramClass = (getGeoTool(InMode)).getClass();
		Class[] types = {};
		Object[] param = {};
		try {
			Method ClassMeth = (ProgramClass).getMethod("getUpImgUrl", types);
			myo = ClassMeth.invoke(null, param);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Img Failed ( " + ProgramClass + " )", e));
		}
		return ((URL) (myo));
	}

	/**
	* Gets the up image button url on a particular mode.
	*/
	public URL getDnImgUrl(int InMode) {
		Object myo = null;
		Class ProgramClass = (getGeoTool(InMode)).getClass();
		Class[] types = {};
		Object[] param = {};
		try {
			Method ClassMeth = (ProgramClass).getMethod("getDnImgUrl", types);
			myo = ClassMeth.invoke(null, param);
		}
		catch (Exception e) {
			throw (new WrapRuntimeException("Img Failed ( " + ProgramClass + " )", e));
		}
		return ((URL) (myo));
	}

	/**
	* Gets the type of the geometry kit instance.
	*/
	public int getGeomKitType() {
		return (1);
	}
	/**
	* Gets the tool set for the view.
	*/
	public Vector getGeoTools() {
		return (geoTools);
	}

	protected final Ktool getGeoTool(int mode) {
		return ((Ktool) (geoTools.elementAt(mode)));
	}

	/**
	* Sets the tool set for the view.
	*/
	public void setGeoTools(Vector in) {
		geoTools = in;
		// setCursor(new Cursor((getGeoTool(PrevToolMode)).getCursorType()));
		invalidate(); // postInvalidate();
	}
	/**
	* Returns whether all depictor display controls are shown.
	*/
	public boolean getDisplayControlsShown() {
		return (ShowDisplayControls);
	}
	/**
	* Creates a new model getModelManager().
	*/
	protected Model createModel(ToolPort inT, String Configs, Config config) {
		return (new Model(inT, Configs, config));
	}
	/**
	* Gets whether rigorous clipping is in use.
	*/
	public boolean getUseRigorousClipping() {
		return (getModelManager().getUseRigorousClipping());
	}
	/**
	* Gets the antialias object.
	*/
	public Paint getAntialiasValue() {
		return (getModelManager().getAntialiasValue());
	}
	/**
	* Sets the antialias object.
	*/
	public void setAntialiasValue(Paint in) throws MathImageParseException {
		getModelManager().setAntialiasValue(in);
	}
	/**
	* Gets the rendering quality.
	*/
//	public Object getRenderValue() {
//		return (getModelManager().getRenderValue());
//	}
	/**
	* Sets the rendering quality.
	*/
//	public void setRenderValue(Object in) throws MathImageParseException {
//		getModelManager().setRenderValue(in);
//	}

	/**
	* Creates a copy of the list of expressions.
	*/
	public HighLevelList formUserExpList() {
		return (getModelManager().formUserExpList());
	}

	/**
	* Creates a copy of the list of variables.
	*/
	public HighLevelList formUserVarList() {
		return (getModelManager().formUserVarList());
	}

	/**
	* Updates all listeners of a change in the list of expressions.
	*/
	public void updateExpressionListeners() {
		getModelManager().updateExpressionListeners();
	}

	/**
	* Updates all listener of a change in the list of variables.
	*/
	public void updateVariableListeners() {
		getModelManager().updateVariableListeners();
	}

	/**
	* Adds a Window Record to the model.
	*/
//	public void addWindowRecord(Object in, int winType) {
//		getModelManager().addWindowRecord(in, winType);
//	}

	/**
	* Adds a DepicListListener to the model.
	*/
	public void addDepicListListener(DepicListListener in) {
		getModelManager().addDepicListListener(in);
	}

	/**
	* Removes a Window Record from the model.
	*/
//	public void removeWindowRecord(Object in) {
//		getModelManager().removeWindowRecord(in);
//	}

	/**
	* Removes a DepicListListener from the model.
	*/
	public void removeDepicListListener(DepicListListener in) {
		getModelManager().removeDepicListListener(in);
	}

	/**
	* Gets the list of window titles from the model.
	*/
//	public HighLevelList getWindowList() {
//		return (getModelManager().getWindowList());
//	}
	/**
	* Prepares for a subsquent drag operation.
	*/
	public void setUpDrag(boolean GlobalUpdate) {
		getModelManager().setUpDrag(this, GlobalUpdate);
	}

	/**
	* Gets the human-readable name for the type of the depictor.
	*/
	public String getAliasName(DrawObj in) {
		return (getModelManager().getDepicStore().getAliasName(in.getClass()));
	};

	/**
	* Creates a dialog for editing the background.
	*/
	protected void requestBkgndChg() {
//		VerdantiumPropertiesEditor nxt = DialogBoxes.bkgndDial(this, getBackground());
//		ProgramDirector.showPropertyEditor(nxt, this, "Change Background");
//		addWindowRecord(nxt, GeomConstants.DialogWindow);
	}

	/**
	* Sets the coordinate context for a future drag operation.
	*/
	public void setDragContext(CoordContext in1, CoordContext in2) {
		getModelManager().setDragContext(in1, in2);
	}

	/**
	* Handles a drag event entering the viewport.
	*/
	public void dragEventEntry(MotionEvent e) {
		getModelManager().dragEventEntry(e);
	}

	/**
	* Gets the default font for depictor labels.
	*/
	public Paint getDepictorFont() {
		return (tFont);
	}

	/**
	* Gets the length of the unit vector in this view.
	*/
	public double getCoordRad() {
		return (CoordRad);
	}

	/**
	* Sets the length of the unit vector in this view.
	*/
	public void setCoordRad(double in) {
		localSetCoordRad(in);
	}

	/**
	* Sets the length of the unit vector in this view.
	*/
	public void localSetCoordRad(double in) {
		CoordRad = in;
	}

	/**
	* Sets the identity of the last depictor clicked.
	*/
	public void setLastClickDepic(DrawObj InDrw) {
		getModelManager().setLastClickDepic(InDrw);
	}

	/**
	* Prepares the model manager for a subsequent drag operation.
	*/
	public void setUpDrag(DepicListListener target, boolean GloRedraw) {
		getModelManager().setUpDrag(target, GloRedraw);
	}

	/**
	* Gets the XKit for the kit.
	*/
//	public XKit getXKit() {
//		return (getModelManager().getXKit());
//	}

	/**
	* Gets the viewport position.
	*/
	public PointF getViewPosition() {
		PointF pos = getViewportPosition();
		return (new PointF(pos.x, pos.y));
	}
	/**
	* Gets the expression assigning to the variable <code>InStr</code>.
	*/
	public final boolean getExprn(FlexString InStr, FlexString OutStr, IntObj OutMode) {
		return (getModelManager().getMyEngine().getExprn(InStr, OutStr, OutMode));
	}

	public boolean insertNewVar(FlexString Vari) {
		return (getModelManager().insertNewVar(Vari));
	}
	/**
	* Gets the class that the numeric mode represents.
	*/
	public Class<? extends DrawObj> getDepictorClass(int AltMode) {
		return (getModelManager().getDepictorClass(AltMode));
	}

	/**
	* Sets the undo operation to be supported.  Reserved for future expansion.
	*/
	public void setUndoType(int in) {
		UndoType = in;
	}

	/**
	* Closes down all windows.
	*/
//	public void stopAllWindows(Object in) {
//		getModelManager().stopAllWindows(in);
//	}

	/**
	* Create a new DrawObjFactory for the view.
	*/
	public DrawObjFactory createDrawObjFactory() {
		return (new DrawObjFactory(this, getModelManager()));
	}

//	public void setUrlLocn(URL inU, DataFlavor inD) {
//		getModelManager().setUrlLocn(inU, inD);
//	}

	/**
	* Sets the origin and coordinate radius to a default value.
	*/
	protected void toolHomeOrigin() {
		MotionEvent xx = null;
		boolean err = getGeoTool(5).handlePreDrag(xx, this);
	}

	/**
	* Sets the last depictor clicked for the view.
	*/
	public void localSetLastClickDepic(DrawObj InDrw) {
		LastClickDraw = InDrw;
		LocalLastClickDraw = InDrw;
		LastClickCoord1 = null;
		LastClickCoord2 = null;
		boolean Done = false;

		if (!(DispList1.empty())) {
			DispList1.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DispList1.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				if (InDrw == MyDrw) {
					LastClickDGM1 = MyDGM;
					LastClickCoord1 = MyDGM.getMyCoord();
					Done = true;
				}

				DispList1.right();
				Done = Done || DispList1.getHead();
			}
		}

		Done = false;

		if (!(DispList2.empty())) {
			DispList2.searchHead();
			while (!Done) {
				DGMNode MyDGM = (DGMNode) DispList2.getNode();
				DrawObj MyDrw = MyDGM.getMyDraw();
				if (InDrw == MyDrw) {
					LastClickDGM2 = MyDGM;
					LastClickCoord2 = MyDGM.getMyCoord();
					Done = true;
				}

				DispList2.right();
				Done = Done || DispList2.getHead();
			}
		}

		if ((LastClickCoord1 == null) || (LastClickCoord2 == null))
			LocalLastClickDraw = null;
	}

	/**
	* Sets the background.
	*/
	protected void setBackgroundState(Integer InC) {
		setBackgroundColor(InC);
		BkgndColor = InC;
//		bkgndOpaque = Opaque;
//		firePropertyChange(BackgroundPropertyEditor.AppBackground, null, null);
		invalidate(); // postInvalidate();
	}

	/**
	* Sets the background color and transparency.
	*/
	protected void dialSetBkgnd(Integer inCol) throws Throwable {
		setBackgroundState(inCol);
	}

	/**
	* Crestes a geometry kit that is a view of the current one.
	*/
	public GeomKit createViewGeomKit() {
		return (new GeomKit(this));
	}

	/**
	* Creates and displays a new view.
	*/
	protected GeomKit createNewView() {
		GeomKit MyKit = createViewGeomKit();

		//Dimension NewSize = getGUI().getSize();
		//Rect bounds = new Rect(10, 10, 10+ NewSize.width, 10+ NewSize.height);
		// ProgramDirector.showPropertyEditor(MyKit, bounds, this, "Model View");
		return (MyKit);
	}

	/**
	* Instructs the view to repaint its visible rectangle.
	*/
	public void updateYourself1() {
		invalidate(); // postInvalidate();
	}

	/**
	* Clones the display list of the view.
	*/
	void cloneDispList(HighLevelList in) {
		if (!(in.empty())) {
			in.searchHead();
			boolean Done = false;

			while (!Done) {
				DGMNode InNode = (DGMNode) in.getNode();

				DGMNode MyNode = new DGMNode();
				DispList1.insertRight(MyNode);

				MyNode.setMyDraw(InNode.getMyDraw());
				MyNode.setMyCoord(MyNode.getMyDraw().makeCoordContext());

				MyNode = new DGMNode();
				DispList2.insertRight(MyNode);

				MyNode.setMyDraw(InNode.getMyDraw());
				MyNode.setMyCoord(MyNode.getMyDraw().makeCoordContext());

				in.right();
				Done = in.getHead();
			}
		}
	}

	/**
	* Loads persistent data.
	*/
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		/* try {
			VersionBuffer myv = (VersionBuffer) (in.readObject());
			VersionBuffer.chkNul(myv);

			Axes[0][0] = myv.getDouble("axisX");
			Axes[0][1] = myv.getDouble("axisY");
			Axes[1][0] = Axes[0][1];
			Axes[1][1] = -Axes[0][0];

			ArcToolRad = (IntObj) (myv.getProperty("ArcToolRad"));
			VersionBuffer.chkNul(ArcToolRad);
			AxisRad = (IntObj) (myv.getProperty("AxisRad"));
			VersionBuffer.chkNul(AxisRad);
			XOrigin = (IntObj) (myv.getProperty("XOrigin"));
			VersionBuffer.chkNul(XOrigin);
			YOrigin = (IntObj) (myv.getProperty("YOrigin"));
			VersionBuffer.chkNul(YOrigin);
			localSetCoordRad(myv.getDouble("CoordRad"));
			RealAng = (IntObj) (myv.getProperty("RealAng"));
			VersionBuffer.chkNul(RealAng);
			ImAng = (IntObj) (myv.getProperty("ImAng"));
			VersionBuffer.chkNul(ImAng);
			RealBar = (IntObj) (myv.getProperty("RealBar"));
			VersionBuffer.chkNul(RealBar);
			ImBar = (IntObj) (myv.getProperty("ImBar"));
			VersionBuffer.chkNul(ImBar);
			ArrLen = myv.getDouble("ArrLen");
			Model tmpmod = (Model) (myv.getProperty("Manager"));
			VersionBuffer.chkNul(tmpmod);
			setModelManager(tmpmod);
			ShowDisplayControls = myv.getBoolean("ShowDisplayControls");
			ToolType = myv.getInt("ToolType");
			DispList1 = (HighLevelList) (myv.getProperty("DispList1"));
			VersionBuffer.chkNul(DispList1);
			DispList2 = (HighLevelList) (myv.getProperty("DispList2"));
			VersionBuffer.chkNul(DispList2);
			PrintColor = (Integer) (myv.getProperty("PrintColor"));
			VersionBuffer.chkNul(PrintColor);
			XOffset = myv.getDouble("XOffset");
			RotOffset = myv.getDouble("RotOffset");
			YOffset = myv.getInt("YOffset");
			MDYOffset = myv.getDouble("MDYOffset");
			OriginType = myv.getInt("OriginType");
			BoundMode = myv.getBoolean("BoundMode");
			AdvancedControls = myv.getBoolean("AdvancedControls");
			requestPrevToolModeChange(myv.getInt("PrevToolMode"));

			Rectangle VisRect = (Rectangle) (myv.getProperty("VisRect"));
			VersionBuffer.chkNul(VisRect);
			resetViewPosition(XOrigin, YOrigin, VisRect);
			boolean bkg = myv.getBoolean("BkgndOpaque");
			Integer tmpcol = (Integer) (myv.getProperty("BkgndColor"));
			setBackgroundState(tmpcol, bkg);

			Object myo = myv.getProperty("BorderClass");
			if (myo != null) {
				try {
					BorderClass = (String) myo;
					VersionBuffer.chkNul(BorderClass);
					BorderTypes = (Class[]) (BorderPropertyEditor.getTypeObjArray(myv.getProperty("BorderTypes")));
					VersionBuffer.chkNul(BorderTypes);
					BorderParam = (Object[]) (myv.getProperty("BorderParam"));
					VersionBuffer.chkNul(BorderParam);
					setBorderObject(BorderClass, BorderTypes, BorderParam);
				}
				catch (ResourceNotFoundException ex) {
					throw (new IOResourceNotFoundException(ex));
				}
			}
		}
		catch (ClassCastException ex) {
			throw (new DataFormatException(ex));
		} */
	}

	/**
	* Resets the current view position.
	*/
	protected void resetViewPosition(IntObj XOrigin, IntObj YOrigin, Rect VisRect) {
		XOrigin.value -= VisRect.left;
		YOrigin.value -= VisRect.top;
	}

	/**
	* Saves persistent data.
	* @serialData TBD.
	*/
	public void writeExternal(ObjectOutput out) throws IOException {
		/* VersionBuffer myv = new VersionBuffer(VersionBuffer.WRITE);

		myv.setDouble("axisX", Axes[0][0]);
		myv.setDouble("axisY", Axes[0][1]);

		myv.setProperty("ArcToolRad", ArcToolRad);
		myv.setProperty("AxisRad", AxisRad);
		myv.setProperty("XOrigin", XOrigin);
		myv.setProperty("YOrigin", YOrigin);
		myv.setProperty("CoordRad", new Double(CoordRad));
		myv.setProperty("RealAng", RealAng);
		myv.setProperty("ImAng", ImAng);
		myv.setProperty("RealBar", RealBar);
		myv.setProperty("ImBar", ImBar);
		myv.setDouble("ArrLen", ArrLen);
		myv.setProperty("Manager", getModelManager());
		myv.setBoolean("ShowDisplayControls", ShowDisplayControls);
		myv.setInt("ToolType", ToolType);
		myv.setProperty("DispList1", DispList1);
		myv.setProperty("DispList2", DispList2);
		myv.setProperty("PrintColor", PrintColor);
		myv.setDouble("XOffset", XOffset);
		myv.setDouble("RotOffset", RotOffset);
		myv.setInt("YOffset", YOffset);
		myv.setDouble("MDYOffset", MDYOffset);
		myv.setInt("OriginType", OriginType);
		myv.setBoolean("BoundMode", BoundMode);
		myv.setBoolean("AdvancedControls", AdvancedControls);
		myv.setInt("PrevToolMode", PrevToolMode);
		myv.setProperty("VisRect", retVisibleRect());
		myv.setProperty("BkgndColor", getBackground());
		myv.setBoolean("BkgndOpaque", getOpaqueFlag());

		if (BorderClass != null) {
			myv.setProperty("BorderClass", BorderClass);
			myv.setProperty("BorderTypes", BorderPropertyEditor.getTypeStrArray(BorderTypes));
			myv.setProperty("BorderParam", BorderParam);
		} */

	}

	/**
	* Gets the GUI of the view.
	*/
	public View getGUI() {
		return (this);
	}

	/**
	* Handles the destruction of the view.
	*/
	public void handleDestroy() {
//		if (getXKit().getTopObj() == this)
//			getModelManager().stopAllWindows(this);
		getModelManager().removeDepicListListener(this);
//		getModelManager().removeWindowRecord(this);
	}

	/**
	* Handles Ether Events.
	*/
	public Object processObjEtherEvent(EtherEvent in, Object refcon) throws Throwable {
		boolean handled = false;

//		if ((in instanceof ProgramDirectorEvent) && (ViewTarget == null)) {
//			if (in.getEtherID().equals(ProgramDirectorEvent.isProgramDirectorEventSupported)) {
//				/* No reply.  Not supported. */
//			}
//			else {
//				handleProgramDirectorEvent((ProgramDirectorEvent) in);
//			}
//
//			handled = true;
//		}

/*		if (in instanceof StandardEtherEvent) {
			if (in.getEtherID().equals(StandardEtherEvent.makePropertiesEditor))
				return (makePropertiesEditor());

			if (in.getEtherID().equals(StandardEtherEvent.showPropertiesEditor))
				showPropertiesEditor(in);

			if (in.getEtherID().equals(StandardEtherEvent.objUndoEvent)) {
				popUndo();
				handled = true;
			}
		}

		if ((in instanceof StandardEtherEvent) && (ViewTarget == null)) {
			if (in.getEtherID().equals(StandardEtherEvent.getUrlLocn)) {
				Object[] param = { fileSaveURL, fileSaveFlavor };
				return (param);
			}

			if (in.getEtherID().equals(StandardEtherEvent.setUrlLocn)) {
				Object[] param = (Object[]) (in.getParameter());
				fileSaveURL = (URL) (param[0]);
				fileSaveFlavor = (DataFlavor) (param[1]);
			}

		}

		if (in instanceof PropertyEditEtherEvent) {
			if (in.getEtherID().equals(PropertyEditEtherEvent.isBorderSupported)) {
				handled = true;
				return (PropertyEditEtherEvent.isBorderSupported);
			}

			if (in.getEtherID().equals(PropertyEditEtherEvent.setBorderObject)) {
				Object[] myo = (Object[]) (in.getParameter());
				setBorderObject((String) (myo[0]), (Class[]) (myo[1]), (Object[]) (myo[2]));
				handled = true;
			}

			if (in.getEtherID().equals(PropertyEditEtherEvent.isBackgroundSupported)) {
				handled = true;
				return (PropertyEditEtherEvent.isBackgroundSupported);
			}

			if (in.getEtherID().equals(PropertyEditEtherEvent.setBackgroundState)) {
				Object[] params = (Object[]) (in.getParameter());
				Integer s1 = (Integer) (params[0]);
				boolean s2 = ((Boolean) (params[1])).booleanValue();
				dialSetBkgnd(s1, s2);
				handled = true;
			}

		} */

		if (in instanceof GeomKitEtherEvent) {

			if (in.getEtherID().equals(GeomKitEtherEvent.addDepiction)) {
				Object[] params = (Object[]) (in.getParameter());
				PointF anEvent = (PointF) (params[0]);
				Integer altMode = (Integer) (params[1]);

				PointF LocEvent =
					new PointF(anEvent.x - getXOrigin().value, anEvent.y - getYOrigin().value);

				DrawObjFactory MyFac = createDrawObjFactory();
				MyFac.setDepicClass(altMode.intValue());
				MyFac.setPlaceAt(LocEvent);

				addDepiction(MyFac, altMode.intValue());
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.doMakeVar)) {
				Object[] params = (Object[]) (in.getParameter());
				String s1 = (String) (params[0]);
				Boolean s2 = (Boolean) (params[1]);
				Integer s3 = (Integer) (params[2]);
				int AltMode = s3.intValue();
				boolean Named = s2.booleanValue();
				DrawObjFactory MyFac = new DrawObjFactory(this, getModelManager());
				MyFac.setDepicClass(AltMode);
				if (!Named)
					MyFac.setNewVectNotNamed();
				else
					MyFac.setNewVectName("Trans");
				PointF InPt = DepicCache;
				MyFac.setPlaceAt(InPt);
				doMakeVar(new FlexString(s1), MyFac);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.newVarComp)) {
				Object[] params = (Object[]) (in.getParameter());
				FlexString s1 = (FlexString) (params[0]);
				PointF s2 = (PointF) (params[1]);
				Class s3 = (Class) (params[2]);
				newVarComp(s1, s2, s3);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setBkgnd)) {
				Object[] params = (Object[]) (in.getParameter());
				Integer s1 = (Integer) (params[0]);
				//boolean s2 = ((Boolean) (params[1])).booleanValue();
				setBackgroundState(s1);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.showColorDialBox)) {
				Object[] params = (Object[]) (in.getParameter());
				colorDialBox((DrawObj) (params[1]));
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.showStdErrorAlerts)) {
				Object[] params = (Object[]) (in.getParameter());
				stdErrorAlerts(((Integer) (params[0])).intValue());
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestBkgndChg)) {
				requestBkgndChg();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setFreeDepiction)) {
				pushUndoOrgChg();
				setFreeDepiction();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setBoundDepiction)) {
				pushUndoOrgChg();
				setBoundDepiction();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.showDisplayControls)) {
				pushUndoOrgChg();
				showDisplayControls();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.hideDisplayControls)) {
				pushUndoOrgChg();
				hideDisplayControls();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.showAdvancedControls)) {
				pushUndoOrgChg();
				setAdvancedControls(true);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.hideAdvancedControls)) {
				pushUndoOrgChg();
				setAdvancedControls(false);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestExpressionChg)) {
				chgExpression();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestExpressionDel)) {
				delExpression();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestSymbolDel)) {
				delSymbol();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestSymbolEdit)) {
				editSymbol();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.createNewView)) {
				GeomKit MyK = createNewView();
				handled = true;
				return (MyK);
			}

			if ((in.getEtherID().equals(GeomKitEtherEvent.requestOpenDialog)) && (ViewTarget == null)) {
				openFile();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestSave)) {
				handleSave();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestSaveAs)) {
				handleSaveAs();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.requestSaveACopyAs)) {
				handleSaveACopyAs();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.setHomeOrigin)) {
				pushUndoOrgChg();
				toolHomeOrigin();
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.changeExpression)) {
				Object[] params = (Object[]) (in.getParameter());
				String s1 = (String) (params[0]);
				String s2 = (String) (params[1]);
				doChgExpression(s1, s2);
				handled = true;
			}

			if (in.getEtherID().equals(GeomKitEtherEvent.delExpression)) {
				String s1 = (String) (in.getParameter());
				doDelExpression(s1);
				handled = true;
			}

		}

		invalidate(); // postInvalidate();

		if (!handled) {
			if (ViewTarget != null)
				return (ViewTarget.processObjEtherEvent(in, refcon));
			else
				return (getModelManager().processObjEtherEvent(in, refcon));
		}

		return (null);
	}

	/**
	* Creates a property editor for the component.
	*/
/*	public VerdantiumPropertiesEditor makePropertiesEditor() {
		Properties prop = new Properties();
		prop.put("NoEditControl", this);
		if (isScrolling())
			prop.put("Scrolling", this);
		VerdantiumPropertiesEditor MyEdit =
			(VerdantiumPropertiesEditor) (createToolDisplay("geomdir.GeomKitPropertyEditor", prop));
		return (MyEdit);
	} */

	/**
	* Shows the property editor for the component.
	*/
	public void showPropertiesEditor(EtherEvent e) {
		/* VerdantiumPropertiesEditor MyEdit = makePropertiesEditor();
		((DefaultPropertyEditor) MyEdit).setClickPoint((PointF) (e.getParameter()));
		ProgramDirector.showPropertyEditor(MyEdit, getGUI(), "GeoFrame App Property Editor");
		addWindowRecord(MyEdit, GeomConstants.DialogWindow); */
	}

	/**
	* Sets the border.
	*/
/*	protected void setBorderObject(String CName, Class[] types, Object[] params) throws ResourceNotFoundException {
		try {
			Border MyBorder = BorderPropertyEditor.createBorder(CName, types, params);

			BorderClass = CName;
			BorderTypes = types;
			BorderParam = params;

			getGUI().setBorder(MyBorder);
			getGUI().revalidate();
			getGUI().postInvalidate();
		}
		catch (ResourceNotFoundException ex) {
			throw (ex);
		}
	} */

	/**
	* Fires a property change.
	*/
	public void firePropertyChg(String name, Object oldVal, Object newVal) {
		firePropertyChange(name, oldVal, newVal);
	}

	public boolean isScrolling() {
		return (false);
	}

	/**
	* Sets the model manager.
	*/
	public final void setModelManager(Model in) {
		Manager = in;
		//if (in != null)
		//	firePropertyChange(DesignerPropertyEditor.AppOnlyDesignerEdits, null, null);
	}

	/**
	* Gets the model manager.
	*/
	public final Model getModelManager() {
		return (Manager);
	}

	/**
	* Gets the target tool display.
	*/
	public ToolPort getTarget() {
		return (getModelManager().getTarget());
	}

	/**
	* Loads persistent data.
	*/
/*	public void loadPersistentData(DataFlavor flavor, Transferable trans)
		throws IOException, ClassNotFoundException, ResourceNotFoundException {
		if (ViewTarget != null)
			try {
				ViewTarget.loadPersistentData(flavor, trans);
			}
			catch (ClassNotFoundException e) {
				throw (e);
			}
			catch (IOException e) {
				throw (e);
			}
			catch (ResourceNotFoundException e) {
				throw (e);
			}
		else {
			if (trans instanceof UrlHolder) {
				getModelManager().setUrlLocn(((UrlHolder) trans).getUrl(), flavor);
			}

			if (trans == null) {
				newModel();
			}
			else {

				if (flavor instanceof TransVersionBufferFlavor) {
					try {
						TransVersionBuffer MyT = (TransVersionBuffer) trans;
						VersionBuffer.chkNul(MyT);
						byte[] MyB = (byte[]) (MyT.getProperty("StreamData"));
						VersionBuffer.chkNul(MyB);
						InputStream s = new ByteArrayInputStream(MyB);
						VTextProperties MyProp = new VTextProperties();
						MyProp.load(s);
						newModel();
						loadProperties(MyProp);
					}
					catch (ClassNotFoundException e) {
						throw (e);
					}
					catch (IOException e) {
						throw (e);
					}
					catch (ResourceNotFoundException e) {
						throw (e);
					}
					catch (ClassCastException e) {
						throw (new DataFormatException(e));
					}
				}

				if (flavor.getMimeType().equals("application/x-geometric-algebra; class=java.io.InputStream")) {
					try {
						System.out.println("Loading data stream");
						VTextProperties MyProp = new VTextProperties();
						InputStream s = ((InputStream) trans.getTransferData(flavor));
						MyProp.load(s);
						newModel();
						loadProperties(MyProp);
					}
					catch (ClassNotFoundException e) {
						throw (e);
					}
					catch (IOException e) {
						throw (e);
					}
					catch (ResourceNotFoundException e) {
						throw (e);
					}
					catch (UnsupportedFlavorException e) {
						throw (new WrapRuntimeException("Something Inconsistent In Flavor Handling", e));
					}
					catch (ClassCastException e) {
						throw (new DataFormatException(e));
					}
				}

				if (flavor
					.getMimeType()
					.equals("application/x-extensible-nomenclature-list; class=java.io.InputStream")) {
					URL url = null;
					if (trans instanceof UrlHolder);
					url = ((UrlHolder) trans).getUrl();

					if (url == null)
						throw (new DataFormatException("Starting URL Not Available"));

					try {
						VTextProperties vtext = new VTextProperties();
						vtext.load((InputStream) (trans.getTransferData(flavor)));
						loadCpntText(vtext, url);
					}
					catch (IOException ex) {
						throw (ex);
					}
					catch (UnsupportedFlavorException ex) {
						throw (new WrapRuntimeException("Something Inconsistent In Flavor Handling", ex));
					}
					return;
				}
			}
		}

	} */

	/**
	* Saves persistent data.
	*/
//	public Transferable savePersistentData(DataFlavor flavor) throws IOException {
//		return (null);
//	}

	protected void loadCpntText(VTextProperties vtext, URL url) throws DataFormatException, IOException {
		try {
			URL[] urls = null;
			String numArchives = vtext.getProperty("xnl.numArchive");
			if( numArchives != null )
			{
				int numArch = vtext.getInt("xnl.numArchive");
				urls = new URL[ numArch ];
				int count;
				for( count = 0 ; count < numArch ; count++ )
				{
					String key = "xnl.archive_" + count;
					String archiveName = vtext.getPropertyNonNull(key);
					urls[ count ] = new URL(url, archiveName);
				}
			}
			else
			{
				String archiveName = vtext.getPropertyNonNull("xnl.archive");
				URL url2 = new URL(url, archiveName);
				URL[] urla = { url2 };
				urls = urla;
			}
			
			
			String configName = vtext.getPropertyNonNull("xnl.gconfig");
			
			URLClassLoader loader = new URLClassLoader(urls, Meta.getDefaultClassLoader());
			URLClassLoader is_loader = new URLClassLoader(urls, GeomKit.class.getClassLoader());
			InputStream is = is_loader.getResourceAsStream(configName);
			VTextProperties otext = new VTextProperties();
			otext.load(is);
			getModelManager().installXnlConfig(loader, otext);
			Meta.setDefaultClassLoader(loader);
//			stopAllWindows(getXKit().getTopObj());
		}
		catch (MalformedURLException ex) {
			throw (new DataFormatException(ex));
		}
	}

	/**
	* Drag-and-drop event.
	*/
//	public void dragEnter(DropTargetDragEvent dtde) {}

	/**
	* Drag-and-drop event.
	*/
//	public void dragExit(DropTargetEvent dte) {}

	/**
	* Drag-and-drop event.
	*/
//	public void dragOver(DropTargetDragEvent dtde) {}

	/**
	* Drag-and-drop event.
	*/
/*	public void drop(DropTargetDropEvent dtde) {
		Transferable trans = dtde.getTransferable();
		boolean handled = false;
		EtherEvent event = null;
		PointF locn = dtde.getLocation();
		PointF serpt = new PointF(locn.getX(), locn.getY());
		System.out.println("**** " + dtde.getSource());

		try {
			DataFlavor dat = new DataFlavor("application/x-geoframe-ether-event; class=verdantium.EtherEvent");
			if (trans.isDataFlavorSupported(dat)) {
				dtde.acceptDrop(DnDConstants.ACTION_MOVE);
				event = (EtherEvent) (trans.getTransferData(dat));
				handled = true;
			}
			else {
				dtde.rejectDrop();
			}
		}
		catch (Exception ex) {
			handleThrow(new WrapRuntimeException("Flavor Failed", ex));
		}

		if (event instanceof GeomKitEtherEvent) {
			if (event.getEtherID().equals(GeomKitEtherEvent.addDepiction)) {
				Object[] parm = (Object[]) (event.getParameter());
				parm[0] = serpt;
			}
		}

		if (handled) {
			dtde.dropComplete(true);
			try {
				ProgramDirector.fireEtherEvent(event, null);
			}
			catch (Throwable ex) {
				handleThrow(ex);
			}
		}
		else {
			dtde.dropComplete(false);
		}
	} */

	/**
	* Drag-and-drop event.
	*/
//	public void dropActionChanged(DropTargetDragEvent dtde) {}

	/**
	* Performs animation in a view.
	*/
	void doAnimation(HighLevelList ChgList, HighLevelList SrcList, HighLevelList DstList, int NumFrame) {
		/* int count;

		for (count = 0; count < NumFrame; count++) {
			double u = ((double) count) / ((double) (NumFrame - 1));

			if (!(ChgList.empty())) {
				ChgList.searchHead();
				SrcList.searchHead();
				DstList.searchHead();
				boolean Done = false;
				while (!Done) {
					Mvec chg = (Mvec) ChgList.getNode();
					Mvec src = (Mvec) SrcList.getNode();
					Mvec dst = (Mvec) DstList.getNode();
					Mvec tmp1 = new Mvec();
					Mvec tmp2 = new Mvec();

					src.scale(1 - u, tmp1);
					dst.scale(u, tmp2);
					tmp1.add(tmp2, chg);

					ChgList.right();
					SrcList.right();
					DstList.right();
					Done = ChgList.getHead();
				}
			}

			getModelManager().globalSynchPaint();
		} */
	}

	/**
	* Sets whether the kit is a scalar or vector kit.  Deprecated.
	*/
	public void setToolType(int in) {
		ToolType = in;
	}

	/**
	* Gets whether the kit is a scalar or vector kit.  Deprecated.
	*/
	public int getToolType() {
		return (ToolType);
	}

	/**
	* Gets the background color of the view.
	*/
	public Integer getBackgroundColor() {
		return ( BkgndColor );
	}

	/**
	* Gets whether the view is opaque.
	*/
//	public boolean getOpaqueFlag() {
//		return (bkgndOpaque);
//	}

	/**
	* Gets whether only the designer edits.
	*/
	public boolean isOnlyDesignerEdits() {
		return (getModelManager().isOnlyDesignerEdits());
	}
	
	/**
	 * Sends a request to the engine asking for optimizzation.
	 */
	public void optimizeRep()
	{
		getModelManager().getMyEngine().optimizeRep();
	}

	/**
	* Used to signal that the visible rect. should stay a constant size.
	*/
	protected void paintOn() {
		if (TmpVisRectDirty == 0) {
			// TmpVisRect = new Rect();
			// getHitRect( TmpVisRect );
		}
		TmpVisRectDirty++;
	}

	/**
	* Used to signal that the visible rect. may no longer stay a constant size.
	*/
	protected void paintOff() {
		TmpVisRectDirty--;
		// if (TmpVisRectDirty == 0)
			// TmpVisRect = null;
	}

	
	
	
	   
	protected void calcVisibleRect( Canvas cn )
	{
		TmpVisRect = cn.getClipBounds(); 
	}
	
	
	public void retVisibleRect( final Rect in )
	{
		final Rect r = retVisibleRect();
		in.bottom = r.bottom;
		in.left = r.left;
		in.right = r.right;
		in.top = r.top;
	}
	
	
	/**
	* Gets the visible rect. in a way that wastes less computational time than getVisibleRect().
	*/
	protected Rect retVisibleRect() {
		/* if (TmpVisRect != null)
			return (TmpVisRect);
		else
		{
			Rect rct = new Rect();
			getHitRect( rct );
			return( rct );
		} */
		if( TmpVisRect != null )
		{
			return( TmpVisRect );
		}
		Rect rct = new Rect(); // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		rct.left = 1000-300+100;
		rct.top = 1000-150+100;
		rct.right = 1000-300+100+600;
		rct.bottom = 1000-150+100+300;
		return( rct );
	}
	
	public Rect bounds()
	{
		return( new Rect( getLeft() , getTop() , getRight() , getBottom() ) );
	}

	/**
	* Gets a basic single-width stroke.
	*/
	public final Paint getSingleWidthStroke() {
		if( SingleWidthStroke == null )
		{
			Paint pnt = new Paint();
			pnt.setStrokeCap( Cap.SQUARE );
			pnt.setStrokeJoin( Join.MITER );
			pnt.setStrokeMiter( 1.0f );
			pnt.setStrokeWidth( 1.0f );
			SingleWidthStroke = pnt;
		}
		return (SingleWidthStroke);
	}
	
	@Override
	public void onMeasure( int x , int y )
	{
		setMeasuredDimension(600,200);
	}

	/**
	* Adds a property change listener.
	*/
	public void addPropertyChangeListener(PropertyChangeListener in) {
		if (PropL == null)
			PropL = new PropertyChangeSupport(this);
		PropL.addPropertyChangeListener(in);
		getModelManager().addPropertyChangeListener(in);
	}
	/**
	* Removes a property change listener.
	*/
	public void removePropertyChangeListener(PropertyChangeListener in) {
		if (PropL == null)
			PropL = new PropertyChangeSupport(this);
		PropL.removePropertyChangeListener(in);
		getModelManager().removePropertyChangeListener(in);
	}
	/**
	* Fires a property change.
	*/
	protected void firePropertyChange(String name, Object old_obj, Object new_obj) {
		if (PropL == null)
			PropL = new PropertyChangeSupport(this);
		PropL.firePropertyChange(name, old_obj, new_obj);
	}

	public DrawObj getDepicForVarName(FlexString name) {
		return (getModelManager().getDepicForVarName(name));
	}

	/**
	* Handles the throwing of an error or exception.
	*/
	public void handleThrow(Throwable in) {
		Log.e("tag", "msg",in);
//		VerdantiumPropertiesEditor prop = VerdantiumUtils.handleThrow(in, this, this);
//		addWindowRecord(prop, GeomConstants.DialogWindow);
	}
	
	
	public void playBeep( )
	{
		try{
			Context context = this.contextS;
			Uri soundUri = RingtoneManager.getDefaultUri( RingtoneManager.TYPE_NOTIFICATION );
			MediaPlayer mMediaPlayer = new MediaPlayer();
			mMediaPlayer.setDataSource(context, soundUri);
			final AudioManager audioManager = (AudioManager)( context.getSystemService( Context.AUDIO_SERVICE ) );
			if( audioManager.getStreamVolume( AudioManager.STREAM_ALARM ) != 0 )
			{
				mMediaPlayer.setAudioStreamType( AudioManager.STREAM_ALARM );
				mMediaPlayer.setLooping(false);
				mMediaPlayer.prepare();
				mMediaPlayer.start();
			}
		}
		catch( Throwable ex )
		{
			Log.e("tag", "msg", ex);
		}
	}

	/**
	* The class for the current border.
	*/
	protected String BorderClass = null;
	/**
	* The constructor types for the current border.
	*/
	protected Class[] BorderTypes = null;
	/**
	* The constructor parameters for the current border.
	*/
	protected Object[] BorderParam = null;
	/**
	* Stores whether only the designer can edit the component.
	*/
	private boolean OnlyDesignerEdits = false;
	/**
	* Basic single-width stroke.
	*/
	private static Paint SingleWidthStroke;

	protected PropertyChangeSupport PropL = null;

	protected Rect TmpVisRect = null;
	private int TmpVisRectDirty = 0;

	protected double Axes[][] = new double[2][2];
	protected IntObj ArcToolRad = new IntObj();
	protected IntObj AxisRad = new IntObj();
	protected IntObj XOrigin = new IntObj();
	protected IntObj YOrigin = new IntObj();
	protected double CoordRad = 10.0;
	public IntObj RealAng = new IntObj();
	public IntObj ImAng = new IntObj();
	public IntObj RealBar = new IntObj();
	public IntObj ImBar = new IntObj();
	protected double ArrLen;
	protected transient int LastClick;
	protected transient boolean MousedDown = false;
	private Model Manager = null;
	protected boolean ShowDisplayControls = false;
	protected int ToolType = 0;

	protected HighLevelList DispList1 = new HighLevelList();
	protected HighLevelList DispList2 = new HighLevelList();
	/* protected transient FlexString xs = new FlexString();
	protected transient FlexString ys = new FlexString(); */
	protected transient MathImage Ixs = null;
	protected transient MathImage Iys = null;
	protected transient Paint tFont;
	protected transient Canvas gr1;
	protected transient Canvas hgr1;
	protected transient int DragType;
	public Integer PrintColor;
	protected double XOffset = 1.3;
	protected double RotOffset = 0.0;
	protected int YOffset = 0;
	protected double MDYOffset = -1.0;
	/* Keep commented for debug support. */
	/* protected transient boolean DrawMarkRect = false; */
	protected int OriginType = ScalarOriginType;
	/* SFReply *CurReply; */

	transient protected boolean DraggingAssign = false;
	transient protected PointF StPt = new PointF(0, 0);
	transient protected PointF CrPt = new PointF(0, 0);
	transient protected IntObj Active = new IntObj();

	transient protected int ConstNum = 0;
	transient protected long MouseDownTime;
	transient protected DrawObj LastClickDraw = null;
	transient protected DrawObj LocalLastClickDraw = null;
	transient protected CoordContext LastClickCoord1 = null;
	transient protected CoordContext LastClickCoord2 = null;
	transient protected DGMNode LastClickDGM1 = null;
	transient protected DGMNode LastClickDGM2 = null;

	transient int UndoType = GeomKit.UndoDoNothing;
	transient double UndoAxes[][] = new double[2][2];
	transient int UndoArcToolRad = 0;
	transient int UndoAxisRad = 0;
	transient int UndoXOrigin = 0;
	transient int UndoYOrigin = 0;
	transient double UndoCoordRad = 0;
	transient int UndoRealAng = 0;
	transient int UndoImAng = 0;
	transient int UndoRealBar = 0;
	transient int UndoImBar = 0;
	transient boolean UndoBoundMode = false;
	transient double UndoArrLen = 0;
	transient DrawObj UndoDragObj = null;
	transient Integer UndoFrontLineColor;
	transient Integer UndoBackLineColor;
	transient Integer UndoTextColor;
	transient boolean UndoFrontLineVisible;
	transient boolean UndoBackLineVisible;
	transient boolean UndoTextVisible;
	transient boolean UndoControlsVisible;
	transient boolean UndoAdvancedControls;
	transient FlexString UndoDepicName = null;
	transient boolean UndoBkgndOpaque = false;
	transient Integer UndoBkgndColor = Color.rgb( 192 , 224 , 224 );
	transient int UndoTextPtSz = 0;

	transient protected final Matrix CoordTrans = new Matrix();
	transient private Path ArrowPath = null;

	protected boolean BoundMode = false;
	protected boolean AdvancedControls = false;
	private boolean AdvancedHandlingImplicit = true;

	protected Integer BkgndColor = Color.rgb( 192 , 224 , 224 );

	transient protected PointF DepicCache;
	transient protected GeomKit ViewTarget = null;
	
	protected Context contextS;

};
