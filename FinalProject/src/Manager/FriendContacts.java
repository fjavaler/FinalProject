package Manager;

public class FriendContacts extends Contacts
{
	// fields
	private String notes;
	
	/**
	 * Constructor
	 */
	public FriendContacts(String firstName, String lastName, String streetAddress, String city, String state, String zip, String mobileNumber, String homeNumber)
	{
		super(firstName, lastName, streetAddress, city, state, zip, mobileNumber, homeNumber);
		this.notes = "";
	}

//	/**
//	 * Returns the first name.
//	 * 
//	 * @return the firstName
//	 */
//	public String getFirstName()
//	{
//		return this.firstName;
//	}
//
//	/**
//	 * Sets friend's first name.
//	 * 
//	 * @param firstName
//	 *            the firstName to set
//	 */
//	public void setFirstName(String _firstName)
//	{
//		this.firstName = _firstName;
//	}
//
//	/**
//	 * Returns the last name.
//	 * 
//	 * @return the lastName
//	 */
//	public String getLastName()
//	{
//		return this.lastName;
//	}
//
//	/**
//	 * sets friend's last name.
//	 * 
//	 * @param lastName
//	 *            the lastName to set
//	 */
//	public void setLastName(String _lastName)
//	{
//		this.lastName = _lastName;
//	}
//
//	/**
//	 * Gets friend's street address.
//	 * 
//	 * @return the streetAddress
//	 */
//	public String getStreetAddress()
//	{
//		return this.streetAddress;
//	}
//
//	/**
//	 * Sets friend's street address.
//	 * 
//	 * @param streetAddress
//	 *            the streetAddress to set
//	 */
//	public void setStreetAddress(String _streetAddress)
//	{
//		this.streetAddress = _streetAddress;
//	}
//
//	/**
//	 * Gets friend's city.
//	 * 
//	 * @return the city
//	 */
//	public String getcity()
//	{
//		return this.city;
//	}
//
//	/**
//	 * Sets friend's city.
//	 * 
//	 * @param city
//	 *            the city to set
//	 */
//	public void setcity(String _city)
//	{
//		this.city = _city;
//	}
//
//	/**
//	 * Gets friend's state.
//	 * 
//	 * @return the state
//	 */
//	public String getstate()
//	{
//		return this.state;
//	}
//
//	/**
//	 * Sets friend's state.
//	 * 
//	 * @param state
//	 *            the state to set
//	 */
//	public void setstate(String _state)
//	{
//		this.state = _state;
//	}
//
//	/**
//	 * Gets friend's zip.
//	 * 
//	 * @return the zip
//	 */
//	public String getzip()
//	{
//		return this.zip;
//	}
//
//	/**
//	 * Sets friend's zip.
//	 * 
//	 * @param zip
//	 *            the zip to set
//	 */
//	public void setzip(String _zip)
//	{
//		this.zip = _zip;
//	}
//
//	/**
//	 * Gets friend's home phone.
//	 * 
//	 * @return the homePhone
//	 */
//	public String getHomePhone()
//	{
//		return this.homePhone;
//	}
//
//	/**
//	 * Sets friend's home phone.
//	 * 
//	 * @param homePhone
//	 *            the homePhone to set
//	 */
//	public void setHomePhone(String _homePhone)
//	{
//		this.homePhone = _homePhone;
//	}
//
//	/**
//	 * Gets friend's mobile phone.
//	 * 
//	 * @return the mobilePhone
//	 */
//	public String getMobilePhone()
//	{
//		return this.mobilePhone;
//	}
//
//	/**
//	 * Sets friend's mobile phone.
//	 * 
//	 * @param mobilePhone
//	 *            the mobilePhone to set
//	 */
//	public void setMobilePhone(String _mobilePhone)
//	{
//		this.mobilePhone = _mobilePhone;
//	}

	/**
	 * Gets friend's notes.
	 * 
	 * @return the notes
	 */
	public String getNotes()
	{
		return this.notes;
	}

	/**
	 * Sets friend's notes.
	 * 
	 * @param notes
	 *            the notes to set
	 */
	public void setNotes(String _notes)
	{
		this.notes = _notes;
	}

	/**
	 * Validate friend info message text box. On a result of less
	 * than zero, an invalid entry has been made. On a result 
	 * greater than zero all entries are valid.
	 * 
	 * @param info
	 * @return int value indicating whether friend info is valid.
	 */
	public int validFriendInfo()
	{
		if (!notes.matches(".*"))
		{
			return -1;
		}
		return 1;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FriendContacts other = (FriendContacts) obj;
		if (notes == null)
		{
			if (other.notes != null)
				return false;
		}
		else if (!notes.equals(other.notes))
			return false;
		return true;
	}
}