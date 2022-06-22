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
	public void firstNameTesthappy() {
//		for happy test case
		boolean isValid=valid.firstNameValidation("Asjad");
		Assert.assertEquals(true, isValid);		
	}
	@Test
	public void firstNameTestsad() {
//		for sad test case
		boolean isValid=valid.firstNameValidation("asjad");
		Assert.assertEquals(false, isValid);		
	}
	
	@Test
	public void lastNameTestHappy() {
//		happy test case
		boolean isValid=valid.lastNameValidation("Azmi");
		Assert.assertEquals(true, isValid);
	}
	@Test
	public void lastNameTestSad() {
//		sad test case
		boolean isValid=valid.lastNameValidation("azmi");
		Assert.assertEquals(false, isValid);
	}
	@Test
	public void emailTestHappy() {
//		happy test case
		boolean isValid=valid.emailValidation("xyz.abc@bl.co.in");
		Assert.assertEquals(true, isValid);
	}
	public void emailTestSad() {
//		sad test case
		boolean isValid=valid.emailValidation("xyz.abcbl.co.in");
		Assert.assertEquals(false, isValid);
	}
	@Test
	public void mobileTestHappy() {
//		Happy test case
		boolean isValid=valid.mobileValidation("918748835815");
		Assert.assertEquals(true, isValid);
	}
	public void mobileTestSad() {
//		Sad test case
		boolean isValid=valid.mobileValidation("910048835815");
		Assert.assertEquals(false, isValid);
	}
	@Test
	public void passwordTestHappy() {
//		Happy test case
		boolean isValid=valid.passwordValidation("ASj@#$>/");
		Assert.assertEquals(true, isValid);
	}
	@Test
	public void passwordTestSad() {
//		Sad test case
		boolean isValid=valid.passwordValidation("ASj@#$>/");
		Assert.assertEquals(true, isValid);
	}

}
