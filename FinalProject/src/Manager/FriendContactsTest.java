package Manager;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FriendContactsTest
{

	FriendContacts friend1;
	FriendContacts friend2;
	FriendContacts friend3;
	FriendContacts friend4;
	FriendContacts friend5;
	FriendContacts friend6;
	
	@Before
	public void setUp() throws Exception
	{
		friend1 = new FriendContacts("Joe", "Blow", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend2 = new FriendContacts("Jane", "Doe", "234 Blue Jay Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend3 = new FriendContacts("Bob", "Bixby", "345 Robin Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend4 = new FriendContacts("Bill", "Jefferson", "456 Finch Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend5 = new FriendContacts("Jack", "Johnson", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend6 = new FriendContacts("John", "Smith", "567 Cheetah Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");		
	}

	@After
	public void tearDown() throws Exception
	{
		friend1 = new FriendContacts("Joe", "Blow", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend2 = new FriendContacts("Jane", "Doe", "234 Blue Jay Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend3 = new FriendContacts("Bob", "Bixby", "345 Robin Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend4 = new FriendContacts("Bill", "Jefferson", "456 Finch Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend5 = new FriendContacts("Jack", "Johnson", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		friend6 = new FriendContacts("John", "Smith", "567 Cheetah Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
	}

	@Test
	public void testFriendContacts()
	{
		friend1 = new FriendContacts("Henry", "Hill", "1787 W 900 N", "Chicago", "IL", "60050", "(555)555-5555", "15555555555");
		assertEquals("Chicago", friend1.getCity());
	}

	@Test
	public void testGetFirstName()
	{
		assertEquals("Joe", friend1.getFirstName());
		assertEquals("Jane", friend2.getFirstName());
		assertEquals("Bob", friend3.getFirstName());
		assertEquals("Bill", friend4.getFirstName());
		assertEquals("Jack", friend5.getFirstName());
		assertEquals("John", friend6.getFirstName());		
	}

	@Test
	public void testSetFirstName()
	{
		friend1.setFirstName("Bob1");
		friend2.setFirstName("Bob2");
		friend3.setFirstName("Bob3");
		friend4.setFirstName("Bob4");
		friend5.setFirstName("Bob5");
		friend6.setFirstName("Bob6");
		assertEquals("Bob1", friend1.getFirstName());
		assertEquals("Bob2", friend2.getFirstName());
		assertEquals("Bob3", friend3.getFirstName());
		assertEquals("Bob4", friend4.getFirstName());
		assertEquals("Bob5", friend5.getFirstName());
		assertEquals("Bob6", friend6.getFirstName());
	}

	@Test
	public void testNotes()
	{
		friend1.setNotes("Note1");
		friend2.setNotes("Note2");
		friend3.setNotes("Note3");
		friend4.setNotes("Note4");
		friend5.setNotes("Note5");
		friend6.setNotes("Note6");
		assertEquals("Note1", friend1.getNotes());
		assertEquals("Note2", friend2.getNotes());
		assertEquals("Note3", friend3.getNotes());
		assertEquals("Note4", friend4.getNotes());
		assertEquals("Note5", friend5.getNotes());
		assertEquals("Note6", friend6.getNotes());
	}

	@Test
	public void testValidFriendInfo()
	{
		assertEquals(1, friend1.validInfo());
		assertEquals(1, friend1.validFriendInfo());
		friend1.setFirstName("");
		assertEquals(-1, friend1.validInfo());
		friend1.setFirstName("Joe");
		friend1.setMobileNumber("180186705678");
		assertEquals(-8, friend1.validInfo());
	}

	@Test
	public void testFriendEquals()
	{
		FriendContacts friend7 = friend1 = new FriendContacts("Joe", "Blow", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		assertTrue(friend7.friendEquals(friend1));
		assertTrue(friend1.friendEquals(friend2));
		assertTrue(friend3.friendEquals(friend4));
	}
	
	@Test
	public void testEquals()
	{
		Contacts friend7 = friend1 = new FriendContacts("Joe", "Blow", "123 Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555");
		assertTrue(friend7.equals(friend1));
		assertFalse(friend1.equals(friend2));
		assertFalse(friend3.equals(friend4));
	}

}
