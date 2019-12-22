package nuigalway.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
Student student = new Student("Noel", 22, "20/12/1997", 12345678);

String userName = student.getUsername();
String expectedUsername = "Noel22";

int ID = student.getID();
int expectedID = 12345678;

@Test
public void testUserName() {
	assertEquals(userName, expectedUsername);
}


@Test
public void testUserID() {
	assertEquals(ID, expectedID);
}
}
