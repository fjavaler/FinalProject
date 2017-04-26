package Manager;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BusinessContactsTest
{

	BusinessContacts friend1;
	BusinessContacts friend2;
	BusinessContacts friend3;
	BusinessContacts friend4;
	BusinessContacts friend5;
	BusinessContacts friend6;
	
	@Before
	public void setUp() throws Exception
	{
		friend1 = new BusinessContacts("Joe", "Blow", "123 West Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "joe@abc.com");
		friend2 = new BusinessContacts("Jane", "Doe", "234 West Blue Jay Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "jane@abc.com");
		friend3 = new BusinessContacts("Bob", "Bixby", "345 West Robin Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "bob@abc.com");
		friend4 = new BusinessContacts("Bill", "Jefferson", "456 West Finch Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "bill@abc.com");
		friend5 = new BusinessContacts("Jack", "Johnson", "123 West Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "jack@abc.com");
		friend6 = new BusinessContacts("John", "Smith", "567 West Cheetah Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "john@abc.com");	
	}

	@After
	public void tearDown() throws Exception
	{
		friend1 = new BusinessContacts("Joe", "Blow", "123 West Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "joe@abc.com");
		friend2 = new BusinessContacts("Jane", "Doe", "234 West Blue Jay Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "jane@abc.com");
		friend3 = new BusinessContacts("Bob", "Bixby", "345 West Robin Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "bob@abc.com");
		friend4 = new BusinessContacts("Bill", "Jefferson", "456 West Finch Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "bill@abc.com");
		friend5 = new BusinessContacts("Jack", "Johnson", "123 West Bird Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "jack@abc.com");
		friend6 = new BusinessContacts("John", "Smith", "567 West Cheetah Way", "Salt Lake City", "UT", "84116", "555-555-5555", "555-555-5555", "ABC Company", "555-555-5555", "john@abc.com");	
	}
	
	@Test
	public void testBusinessContacts()
	{
		friend1 = new BusinessContacts("Henry", "Hill", "1787 W 900 N", "Chicago", "IL", "60050", "(555)555-5555", "15555555555", "ABC Company", "555-555-5555", "john@abc.com");
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
	public void testGetCompanyName()
	{
		assertEquals("ABC Company", friend1.getCompany());
		assertEquals("ABC Company", friend2.getCompany());
		assertEquals("ABC Company", friend3.getCompany());
		assertEquals("ABC Company", friend4.getCompany());
		assertEquals("ABC Company", friend5.getCompany());
		assertEquals("ABC Company", friend6.getCompany());
	}
	
	@Test
	public void testSetCompanyName()
	{
		friend1.setCompany("Google");
		assertEquals("Google", friend1.getCompany());
		friend2.setCompany("Google");
		assertEquals("Google", friend2.getCompany());
		friend3.setCompany("Google");
		assertEquals("Google", friend3.getCompany());
		friend4.setCompany("Google");
		assertEquals("Google", friend4.getCompany());
		friend5.setCompany("Google");
		assertEquals("Google", friend5.getCompany());
		friend6.setCompany("Google");
		assertEquals("Google", friend6.getCompany());
	}
	
	@Test
	public void testGetWorkPhone()
	{
		assertEquals("555-555-5555", friend1.getWorkPhone());
		assertEquals("555-555-5555", friend2.getWorkPhone());
		assertEquals("555-555-5555", friend3.getWorkPhone());
		assertEquals("555-555-5555", friend4.getWorkPhone());
		assertEquals("555-555-5555", friend5.getWorkPhone());
		assertEquals("555-555-5555", friend6.getWorkPhone());
	}
	
	@Test
	public void testSetWorkPhone()
	{
		friend1.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend1.getWorkPhone());
		friend2.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend2.getWorkPhone());
		friend3.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend3.getWorkPhone());
		friend4.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend4.getWorkPhone());
		friend5.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend5.getWorkPhone());
		friend6.setWorkPhone("666-666-6666");
		assertEquals("666-666-6666", friend6.getWorkPhone());
	}
	
	@Test
	public void testGetWorkEmail()
	{
		assertEquals("joe@abc.com", friend1.geteMail());
		assertEquals("jane@abc.com", friend2.geteMail());
		assertEquals("bob@abc.com", friend3.geteMail());
		assertEquals("bill@abc.com", friend4.geteMail());
		assertEquals("jack@abc.com", friend5.geteMail());
		assertEquals("john@abc.com", friend6.geteMail());
	}
	
	@Test
	public void testSetWorkEmail()
	{
		friend1.seteMail("joe1@abc.com");
		assertEquals("joe1@abc.com", friend1.geteMail());
		friend2.seteMail("jane1@abc.com");
		assertEquals("jane1@abc.com", friend2.geteMail());
		friend3.seteMail("bob1@abc.com");
		assertEquals("bob1@abc.com", friend3.geteMail());
		friend4.seteMail("bill1@abc.com");
		assertEquals("bill1@abc.com", friend4.geteMail());
		friend5.seteMail("jack1@abc.com");
		assertEquals("jack1@abc.com", friend5.geteMail());
		friend6.seteMail("john1@abc.com");
		assertEquals("john1@abc.com", friend6.geteMail());
	}

	@Test
	public void testvalidBusInfo()
	{
		assertEquals(1, friend1.validBusInfo());
		friend1.setCompany("");
		assertEquals(-10, friend1.validBusInfo());
		friend2.seteMail("");
		assertEquals(-12, friend2.validBusInfo());
		friend3.setWorkPhone("");
		assertEquals(-11, friend3.validBusInfo());
	}
}
