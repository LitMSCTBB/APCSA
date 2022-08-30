////////////////////////////////////////////////////////////////
// Copyright 2013, CompuScholar, Inc.
//
// This source code is for use by the students and teachers who 
// have purchased the corresponding TeenCoder or KidCoder product.
// It may not be transmitted to other parties for any reason
// without the written consent of CompuScholar, Inc.
// This source is provided as-is for educational purposes only.
// CompuScholar, Inc. makes no warranty and assumes
// no liability regarding the functionality of this program.
//
////////////////////////////////////////////////////////////////

/** TeenCoder: Java Programming
 * Chapter 14 - SkyArt Project
 * This ArtPanel class will use a combination of vector and
 * bitmap graphics to generate a random scene of a cloudy
 * sky and sun.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Point2D.Double;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;

// ArtPanel extends JPanel so we can override the paintComponent method
public class ArtPanel extends JPanel
{
	// these class constants set the width and height of the overall 
	// panel, of each ellipse that make up a piece of a cloud, and
	// the starting recursion level.
	final int PANEL_WIDTH = 600;
	final int PANEL_HEIGHT = 400;

	final int ELLIPSE_WIDTH = 50;
	final int ELLIPSE_HEIGHT = 30;
	
	final int STARTING_LEVEL = 3;

	// declare a Random object for use in selecting random positions
	Random rand = new Random();
	
	// this variable will hold the bitmap image loaded from disk
	BufferedImage sunImage;

	// The student will implement this method to load the sunImage
	// ArtPanel constructor
	public ArtPanel()
	{
		try 
		{
		    sunImage = ImageIO.read(new File("sun.png"));
		} 
		catch (IOException e) 
		{
		    System.out.println(e);
		}
	}
	
	// This function is provided complete in the activity starter.
	// Returns the ArtPanel preferred size.
	public Dimension getPreferredSize() 
	{
		return new Dimension(PANEL_WIDTH,PANEL_HEIGHT);
	}	

	// The student will implement this method as part of the activity 
	// override the paintComponent() method to do 
	// all of the custom graphics work
	protected void paintComponent(Graphics g) 
	{
		// always call the base class paintComponent() first
		super.paintComponent(g);       

		// cast the Graphics object to a Graphics2D object
		Graphics2D myGraphics = (Graphics2D) g;
		
		Rectangle2D.Double bg = new Rectangle2D.Double(0,0,PANEL_WIDTH,PANEL_HEIGHT);
		myGraphics.setPaint(Color.BLUE);
		myGraphics.fill(bg);
		
		if (sunImage != null) {
			myGraphics.drawImage(sunImage,0,0,null);
		}
		
		for (int i=0; i<4; i++) {
			int startingX = rand.nextInt(PANEL_WIDTH);
			int startingY = rand.nextInt(PANEL_HEIGHT);
			Point2D.Double p = new Point2D.Double(startingX, startingY);
			drawCloud(myGraphics, p, STARTING_LEVEL);
		}
	}
	
	// The student will implement this method as part of the activity 
	// this function will draw a cloud by recursively drawing a 
	// series of overlapping white ellipses
	void drawCloud(Graphics2D myGraphics, Point2D.Double startingPoint, int level)
	{
		if (level == 0) return;
		Ellipse2D.Double el = new Ellipse2D.Double(startingPoint.x, startingPoint.y, ELLIPSE_WIDTH, ELLIPSE_HEIGHT);
		myGraphics.setPaint(Color.WHITE);
		myGraphics.fill(el);
		
		level--;
		for (int i=0; i<6; i++) {
			int newStartingX = (int)startingPoint.x+rand.nextInt(2*ELLIPSE_WIDTH)-ELLIPSE_WIDTH;
			int newStartingY = (int)startingPoint.y+rand.nextInt(2*ELLIPSE_HEIGHT)-ELLIPSE_HEIGHT;
			Point2D.Double newPoint = new Point2D.Double(newStartingX, newStartingY);
			drawCloud(myGraphics, newPoint, level);
		}
	}
}
