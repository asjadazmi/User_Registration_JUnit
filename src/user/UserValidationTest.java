package user;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class UserValidationTest {
//	private static final String True = null;
	private UserValidation valid;
	
	@Before
	public void setUp() {
		valid=new UserValidation();
	}
	@Test
	public void firstNameTest() {
		boolean isValid=valid.firstNameValidation("Asjad");
		Assert.assertEquals(true, isValid);		
	}
	@Test
	public void lastNameTest() {
		boolean isValid=valid.lastNameValidation("Azmi");
		Assert.assertEquals(true, isValid);
	}
	@Test
	public void emailTest() {
		boolean isValid=valid.emailValidation("xyz.abc@bl.co.in");
		Assert.assertEquals(true, isValid);
	}
	@Test
	public void mobileTest() {
		boolean isValid=valid.mobileValidation("918748835815");
		Assert.assertEquals(true, isValid);
	}
	@Test
	public void passwordTest() {
		boolean isValid=valid.passwordValidation("ASj@#$>/");
		Assert.assertEquals(true, isValid);
	}

}
