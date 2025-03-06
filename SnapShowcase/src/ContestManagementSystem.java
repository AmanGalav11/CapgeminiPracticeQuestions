import java.util.regex.Pattern;

public class ContestManagementSystem {
	public boolean validateAge(int age) throws InvalidParticipantDataException {
		// Fill the code here
		if(age<18) {
			throw new InvalidParticipantDataException("Participant must be at least 18 years old");
			
		}
		if(age>=18) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean validateEmail(String email) throws InvalidParticipantDataException {
		// Fill the code here
		if(!Pattern.matches("^[A-Za-z0-9.@]+$", email)) {
			throw new InvalidParticipantDataException("Participant email must contain both '@' and '.' to be valid");
		}
		if(Pattern.matches("[A-Za-z0-9.@]+", email)) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean validateImageFileSize(double fileSizeMB) throws InvalidParticipantDataException {
		// Fill the code here
		if(fileSizeMB <= 0 || fileSizeMB >10) {
			throw new InvalidParticipantDataException("Invalid Image file size");
		}
		
		if(fileSizeMB>0 && fileSizeMB<=10) {
			return true;
		}
		else {

		return false;
		}
	}

	public double calculateAverageRating(double[] ratings) {
		double averageRating = 0;

		// Fill the code here
		double sum=0;
		for(int i=0;i<ratings.length;i++) {
			sum+=ratings[i];
		}
		int len = ratings.length;
		
		averageRating = sum/len;

		return averageRating;
	}

}
