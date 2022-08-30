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
 * This Address class will track 4 string components
 * of a mailing address. 
 * @author CompuScholar, Inc.
 * @version 1.0
*/

// No student modification of this class is necessary.
// It is provided complete as part of the activity starter.
public class Address 
{
	// 4 public data fields
	public String street;
	public String city;
	public String state;
	public String zipCode;
	
	// constructor will let you initialize all data fields
	public Address(String _street, String _city, 
			       String _state, String _zipCode)
	{
		street = _street;
		city = _city;
		state = _state;
		zipCode = _zipCode;
	}

}
