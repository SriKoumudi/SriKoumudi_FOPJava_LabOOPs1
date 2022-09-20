import java.util.Random;
import java.util.Scanner;

public class GenerateCredentialServices {

	static String Department11() {
		System.out.print("Enter the department code: ");
		Scanner in = new Scanner(System.in);
		int depchoice = in.nextInt();
		if (depchoice == 1) {
			return "Technical";
		} else if (depchoice == 2) {
			return "Admin";
		} else if (depchoice == 3) {
			return "HumanResource";
		} else if (depchoice == 4) {
			return "Legal";
		} else {
			return "";
		}
	}

	static void generateEmailAddress() {

		 String companyname = "GreatLearning";
		//String email=Employee.Firstname + Employee.Lastname + Department11() + "@" + companyname + ".com";
		System.out.println("Email: "+Employee.Firstname + Employee.Lastname + Department11() + "@" + companyname + ".com");


	}

	public static char[] generatePassword(int length) {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerLetters = "abcdefghijklmnopqrstuvwxyz";
		String specialCharacters = "!@#$";
		String numbers = "1234567890";
		String combinedChars = capitalLetters + lowerLetters + specialCharacters + numbers;
		Random random = new Random();
		char[] password = new char[length];

		/*
		 * password[0] = lowerLetters.charAt(random.nextInt(lowerLetters.length()));
		 * password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
		 * password[2] =
		 * specialCharacters.charAt(random.nextInt(specialCharacters.length()));
		 * password[3] = numbers.charAt(random.nextInt(numbers.length()));
		 */

		for (int i = 0; i < length; i++) {
			password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
		}
		return password;
	}


	
	void showCredentials() {
		 String companyname = "GreatLearning";
		//System.out.println("Email: "+Employee.Firstname + Employee.Lastname + Department11() + "@" + companyname + ".com");

		System.out.println("Dear " + Employee.Firstname + " your credentials are as follows");
		
	}

	class Employee extends GenerateCredentialServices {
		
		static String Firstname = "Sri";
		static String Lastname = "Satya";

		Employee(String Fname, String Lname) {
			Firstname = Fname;
			Lastname = Lname;
			
		}
	}
	

	public static void main(String[] args) {
		GenerateCredentialServices e = new GenerateCredentialServices();
		//String companyname = "GreatLearning";
		
		e.showCredentials();
		e.generateEmailAddress();
		
		System.out.println(GenerateCredentialServices.generatePassword(10));

	}

}
