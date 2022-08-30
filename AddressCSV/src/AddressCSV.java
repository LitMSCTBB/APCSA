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
 * Chapter 18 - AddressCSV Project
 * This main AddressCSV class will create a series of
 * Address data structures and write them to a file
 * in a CSV format.  It will then read the data
 * back in line-by-line and process the string
 * to break the data back apart into Addresses.
 * @author CompuScholar, Inc.
 * @version 1.0
*/

import java.io.*;
import java.util.*;


public class AddressCSV 
{

	// This method is provided partially complete in the activity
	// starter.  The student will be responsible for adding additional
	// Address entries in the area marked below.
	public static void main(String[] args) 
	{
		// create a list of Address objects
		LinkedList<Address> addresses = new LinkedList<Address>();
		
		// Add at least three different addresses to the list.  The
		// first is provided in the activity starter and the student
		// will supply the remainder.
		addresses.addLast(new Address("1600 Pennsylvania Ave NW", "Washington", "DC", "20500"));

		// ***STUDENT TO ADD AT LEAST TWO MORE ADDRESSES HERE
		addresses.addLast(new Address("1501 Taft St", "Houston", "TX", "77081"));
		addresses.addLast(new Address("5100 Maple St", "Bellaire", "TX", "77401"));

		// ***STUDENT MODIFICATIONS END HERE
		
		// call writeFile which will output all of the Address objects into
		// a file in CSV format
		writeFile(addresses);
		
		// clear the address list in preparation for reading
		addresses.clear();
		
		// call readFile which will output all of the Address objects into
		// a file in CSV format
		readFile(addresses);

		// print the addresses out to the console for verification
		for (Address addr : addresses)
		{
			System.out.println(addr.street + ", " + addr.city + ", " + addr.state + ", " + addr.zipCode);
		}

	}
	
	// This method will be implemented by the student during the activity.
	private static void writeFile(LinkedList<Address> addresses)
	{
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("myAddresses.csv")));
			for (Address addr : addresses)
			{
				bw.write(addr.street + "," + addr.city + "," + addr.state + "," + addr.zipCode + "\r\n");
			}
			bw.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// This method will be implemented by the student during the activity.
	private static void readFile(LinkedList<Address> addresses)
	{
		try {
			BufferedReader br = new BufferedReader(new FileReader("myAddresses.csv"));
			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(",");
				Address addr = new Address(parts[0], parts[1], parts[2], parts[3]);
				addresses.add(addr);
				line = br.readLine();
			}
			br.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}
