package Manager;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class FamilyContacts extends Contacts
{
	private String relationship;
	private String birthDay;

	public FamilyContacts(String fName, String lName, String strtAdrs, String cty, String st, String zip, String mNum,
			String hNum, String relationship, String birthDay)
	{
		super(fName, lName, strtAdrs, cty, st, zip, mNum, hNum);
		this.relationship = relationship;
		this.birthDay = birthDay;
	}

	public String getRelationship()
	{
		return relationship;
	}

	public void setRelationship(String relationship)
	{
		this.relationship = relationship;
	}

	public String getBirthDay()
	{
		return birthDay;
	}

	public void setBirthDay(String birthDay)
	{
		this.birthDay = birthDay;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((birthDay == null) ? 0 : birthDay.hashCode());
		result = prime * result + ((relationship == null) ? 0 : relationship.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FamilyContacts other = (FamilyContacts) obj;
		if (birthDay == null)
		{
			if (other.birthDay != null)
				return false;
		}
		else if (!birthDay.equals(other.birthDay))
			return false;
		if (relationship == null)
		{
			if (other.relationship != null)
				return false;
		}
		else if (!relationship.equals(other.relationship))
			return false;
		return true;
	}

	public int validFamInfo(FamilyContacts contact)
	{
		int result = 1;
		if (contact.validInfo() > 0)
		{

			if (!birthDay.matches("[0-9]{2}(-)[0-9]{2}(-)[0-9]{4}"))
			{
				result = -10;
			}
			switch (result)
			{
				case -10:
					JOptionPane.showMessageDialog(null, "Error: Re-enter birthdate in form" + "mm-dd-yyy", "WARNING",
							JOptionPane.ERROR_MESSAGE);
					break;
				default:
					result = -11;
					break;
			}
		}
		return result;
	}
}
