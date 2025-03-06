import java.text.ParseException;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        ContestManagementSystem obj = new ContestManagementSystem();
        
        System.out.println("Enter the name");
        String name = sc.nextLine();
        
        System.out.println("Enter the age");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the email");
        String email = sc.nextLine();
        
        
        System.out.println("Enter image file size (in MB)");
        double fileSize = sc.nextDouble();
        sc.nextLine();
        
        try {
        	obj.validateAge(age);
        	obj.validateEmail(email);
        	obj.validateImageFileSize(fileSize);
        }
        catch(InvalidParticipantDataException e) {
        	System.out.println(e.getMessage());
        }
        
        System.out.println("Enter the ratings");
        String rat = sc.nextLine();
        
        String strarr[] = rat.split(",");
        
        double arr[] = new double[strarr.length] ;
        for(int i=0;i<strarr.length;i++) {
        	double num = Double.parseDouble(strarr[i]);
        	arr[i] = num;
        }
        try {
        	double avg = obj.calculateAverageRating(arr);
        	System.out.println("Average Rating: "+avg);
        }
        catch(Exception e) {
        	System.out.println(e.getMessage());
        }
        
        
    }
}

