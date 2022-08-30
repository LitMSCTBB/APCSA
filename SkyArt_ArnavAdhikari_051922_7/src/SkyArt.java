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
 * This main SkyArt class will create the JFrame and
 * a new ArtPanel, assign the ArtPanel to the frame,
 * and display the main window.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

import javax.swing.*;

// This class is fully implemented as part of the activity starter.
// No student modification is necessary.
public class SkyArt 
{
	// main() method
	public static void main(String[] args)
	{
		// create instance of SkyArt that will do all the work!
		new SkyArt();
	}

	// SkyArt constructor
	public SkyArt() 
	{
		// create the JFrame window
		JFrame myFrame = new JFrame(); 
	    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	    // create a new ArtPanel and add it to the frame
		ArtPanel myPanel = new ArtPanel();
		myFrame.add(myPanel); 
		
		// pack the frame around the ArtPanel's preferred
		// size and set the frame to visible
		myFrame.pack();
		myFrame.setVisible(true);
	}
	
}
