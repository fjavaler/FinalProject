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
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetLastName()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetLastName()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetStreetAddress()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetStreetAddress()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetcity()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetcity()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetstate()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetstate()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetzip()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetzip()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetHomePhone()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetHomePhone()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetMobilePhone()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetMobilePhone()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testGetNotes()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testSetNotes()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testValidFriendInfo()
	{
		fail("Not yet implemented");
	}

	@Test
	public void testEquals()
	{
		fail("Not yet implemented");
	}

}
