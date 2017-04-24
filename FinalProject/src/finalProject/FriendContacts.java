package finalProject;

public class FriendContacts extends Contact
{
	// fields
	private String notes;

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
	 * @param firstName
	 *            the firstName to set
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
	 * @param lastName
	 *            the lastName to set
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
	 * @param streetAddress
	 *            the streetAddress to set
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
	 * @param city
	 *            the city to set
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
	 * @param state
	 *            the state to set
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
	 * @param zip
	 *            the zip to set
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
	 * @param homePhone
	 *            the homePhone to set
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
	 * @param mobilePhone
	 *            the mobilePhone to set
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
	 * @param notes
	 *            the notes to set
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
		if (!firstName.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if (!lastName.matches("[a-zA-Z ]+([ '-][a-zA-Z]+)*"))
		{
			return false;
		}
		if (!streetAddress.matches(".*"))
		{
			return false;
		}
		if (!city.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if (!state.matches("[A-Z][a-zA-Z]*"))
		{
			return false;
		}
		if (!zip.matches("[0-9]{5}(-[0-9]{4})*"))
		{
			return false;
		}
		if (!homePhone.matches("[ -(]*\\d{3}[ -).]*[ -.]*\\d{3}[ -.]*\\d{4}"))
		{
			return false;
		}
		if (!mobilePhone.matches("[ -(]*\\d{3}[ -).]*[ -.]*\\d{3}[ -.]*\\d{4}"))
		{
			return false;
		}
		return true;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((homePhone == null) ? 0 : homePhone.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobilePhone == null) ? 0 : mobilePhone.hashCode());
		result = prime * result + ((notes == null) ? 0 : notes.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + ((streetAddress == null) ? 0 : streetAddress.hashCode());
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
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
		if (city == null)
		{
			if (other.city != null)
				return false;
		}
		else if (!city.equals(other.city))
			return false;
		if (firstName == null)
		{
			if (other.firstName != null)
				return false;
		}
		else if (!firstName.equals(other.firstName))
			return false;
		if (homePhone == null)
		{
			if (other.homePhone != null)
				return false;
		}
		else if (!homePhone.equals(other.homePhone))
			return false;
		if (lastName == null)
		{
			if (other.lastName != null)
				return false;
		}
		else if (!lastName.equals(other.lastName))
			return false;
		if (mobilePhone == null)
		{
			if (other.mobilePhone != null)
				return false;
		}
		else if (!mobilePhone.equals(other.mobilePhone))
			return false;
		if (notes == null)
		{
			if (other.notes != null)
				return false;
		}
		else if (!notes.equals(other.notes))
			return false;
		if (state == null)
		{
			if (other.state != null)
				return false;
		}
		else if (!state.equals(other.state))
			return false;
		if (streetAddress == null)
		{
			if (other.streetAddress != null)
				return false;
		}
		else if (!streetAddress.equals(other.streetAddress))
			return false;
		if (zip == null)
		{
			if (other.zip != null)
				return false;
		}
		else if (!zip.equals(other.zip))
			return false;
		return true;
	}
}