package com.goofans.gootool.leveledit.tools;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Tool to select an item.
 *
 * @author David Croft (davidc@goofans.com)
 * @version $Id$
 */
public class SelectTool implements Tool
{
  // Gets the cursor at the given point, in world coordinates
  public Cursor getCursorAtPoint(Point2D.Double p)
  {
    return Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR);
  }
}