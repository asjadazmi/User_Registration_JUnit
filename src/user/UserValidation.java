package user;

public class UserValidation {
	
//	firstName 
	
	public  boolean firstNameValidation(String name) {
		String firstNameRegex="^[A-Z]{1}[a-z]{2,}$";
		return name.matches(firstNameRegex);
	}
	
//	lastName
	
	public boolean lastNameValidation(String lName) {
	String lastNameRegex="^[A-Z]{1}[a-z]{2,}$";
	return lName.matches(lastNameRegex);
    }
	
//	email validation
	
	public boolean emailValidation(String email) {
		String emailRegex="^[a-zA-Z]+[a-zA-Z0-9]*[- . + _]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
		return email.matches(emailRegex);
	}
	
//	mobile validation
	
	public boolean mobileValidation(String mobile) {
		String mobileRegex="^(91|0)?[7-9]{1}+[0-9]{9}$";
		return mobile.matches(mobileRegex);
	}
	
//	password validation
	
	public boolean passwordValidation(String password) {
		String passwordRegex="^([A-Za-z0-9]*[//!//@//#//$//%//^//&//*//(//)//_//-//+//=//{//}//[//]//?//>//.//<//,//]*){8}$";
		return password.matches(passwordRegex);
	}

	
}
