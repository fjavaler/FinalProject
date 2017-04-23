package finalProject;

public class FriendContacts //extends Contact
{
	//fields
	private String notes;
	/*
	 * Fields below inherited
	 */
	private String firstName;
	private String lastName;
	private String streetAddress;
	private String city;
	private String state;
	private String zip;
	private String homePhone;
	private String mobilePhone;
	
	/**
	 * Constructor
	 */
	public FriendContacts()
	{
		this.notes = "";
	}
	
	/**
	 * Returns the first name.
	 * 
	 * @return the firstName
	 */
	public String getFirstName()
	{
		return this.firstName;
	}

	/**
	 * Sets friend's first name.
	 * 
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String _firstName)
	{
		this.firstName = _firstName;
	}

	/**
	 * Returns the last name. 
	 * 
	 * @return the lastName
	 */
	public String getLastName()
	{
		return this.lastName;
	}

	/**
	 * sets friend's last name.
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String _lastName)
	{
		this.lastName = _lastName;
	}

	/**
	 * Gets friend's street address.
	 * 
	 * @return the streetAddress
	 */
	public String getStreetAddress()
	{
		return this.streetAddress;
	}

	/**
	 * Sets friend's street address.
	 * 
	 * @param streetAddress the streetAddress to set
	 */
	public void setStreetAddress(String _streetAddress)
	{
		this.streetAddress = _streetAddress;
	}

	/**
	 * Gets friend's city.
	 * 
	 * @return the city
	 */
	public String getcity()
	{
		return this.city;
	}

	/**
	 * Sets friend's city.
	 * 
	 * @param city the city to set
	 */
	public void setcity(String _city)
	{
		this.city = _city;
	}

	/**
	 * Gets friend's state.
	 * 
	 * @return the state
	 */
	public String getstate()
	{
		return this.state;
	}

	/**
	 * Sets friend's state.
	 * 
	 * @param state the state to set
	 */
	public void setstate(String _state)
	{
		this.state = _state;
	}

	/**
	 * Gets friend's zip.
	 * 
	 * @return the zip
	 */
	public String getzip()
	{
		return this.zip;
	}

	/**
	 * Sets friend's zip.
	 * 
	 * @param zip the zip to set
	 */
	public void setzip(String _zip)
	{
		this.zip = _zip;
	}

	/**
	 * Gets friend's home phone.
	 * 
	 * @return the homePhone
	 */
	public String getHomePhone()
	{
		return this.homePhone;
	}

	/**
	 * Sets friend's home phone.
	 * 
	 * @param homePhone the homePhone to set
	 */
	public void setHomePhone(String _homePhone)
	{
		this.homePhone = _homePhone;
	}

	/**
	 * Gets friend's mobile phone.
	 * 
	 * @return the mobilePhone
	 */
	public String getMobilePhone()
	{
		return this.mobilePhone;
	}

	/**
	 * Sets friend's mobile phone.
	 * 
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String _mobilePhone)
	{
		this.mobilePhone = _mobilePhone;
	}

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
	 * @param notes the notes to set
	 */
	public void setNotes(String _notes)
	{
		this.notes = _notes;
	}
	
	/**
	 * Validate friend info message text box.
	 * 
	 * @param info
	 * @return whether valid or not.
	 */
	public boolean validFriendInfo(String regex)
	{
		if(!firstName.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!lastName.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!streetAddress.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!city.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!state.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!zip.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!homePhone.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if(!mobilePhone.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		return true;
	}
	 
	/**
	 * Determines whether or not this equals friend.
	 * 
	 * @param friend
	 * @return whether this equals friend.
	 */
	public boolean equals(FriendContacts friend)
	{
		if(firstName.equals(friend.getFirstName()) && 
				lastName.equals(friend.getLastName()) && 
				streetAddress.equals(friend.getStreetAddress()) && 
				city.equals(friend.getcity()) && 
				state.equals(friend.getstate()) && 
				zip.equals(friend.getzip()) && 
				homePhone.equals(friend.getHomePhone()) && 
				mobilePhone.equals(friend.getMobilePhone()))
		{
			return true;
		}
		return false;
	}
	
	/**
	 * Returns hashCode.
	 */
	public int hashCode()
	{
		return 0;
	}
}