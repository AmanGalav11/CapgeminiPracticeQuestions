import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Fill the code here 
		BotUtility obj = new BotUtility();
		
		System.out.println("Enter the total number of Bots needed to add in the list");
		int num = sc.nextInt();
		sc.nextLine();
		
		List<Bot> list = new ArrayList<>();
		
		if(num>0) {
			System.out.println("Enter the Bot details");
			for(int i=0;i<num;i++) {
				String str = sc.nextLine();
				
				String arr[] = str.split(":");
				String botName = arr[0];
				String creator = arr[1];
				String purpose = arr[2];
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate date = LocalDate.parse(arr[3],formatter);
				String status = arr[4];
				int numofusers = Integer.parseInt(arr[5]);
				
				Bot bt = new Bot(botName, creator, purpose, date, status, numofusers);
				list.add(bt);
			}
			
			System.out.println("Enter the purpose");
			String pur = sc.nextLine();
			List<Bot> res1 = obj.retrieveBotsByPurpose(list.stream(), pur);
			if(!res1.isEmpty()) {
				for(Bot b : res1) {
					System.out.println(b.getBotName()+":"+b.getCreator()+":"+b.getPurpose()+":"+b.getActiveStatus());
				}
			}
			else {
				System.out.println("No Bot found for the given purpose");
			}
			
			System.out.println("Enter the released date");
			String fdate = sc.nextLine();
			
			DateTimeFormatter form = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			LocalDate fdate1 = LocalDate.parse(fdate,form);
			
			Stream<Bot> st = obj.retrieveBotsReleasedAfterSpecifiedDate(list.stream(), fdate1);
			List<Bot> res2 = st.toList();
			if(!res2.isEmpty()) {
				for(Bot b : res2) {
					System.out.println(b.getBotName()+":"+b.getCreator()+":"+b.getPurpose()+":"+b.getActiveStatus());
				}
			}
			else {
				System.out.println("No Bot found for the given releasedDate");
			}
			
			System.out.println("Enter the top limit");
			int top = sc.nextInt();
			
			List<Bot> res3 = obj.retrieveActiveBotsBasedOnMaximumUsers(list.stream(), top);
			if(!res3.isEmpty()) {
				System.out.println("The Bot details are");
				for(Bot b: res3) {
					
						System.out.println(b.getBotName()+" "+b.getNumberOfUsers()+" "+b.getActiveStatus());
					
				}
			}

		}
		
		
	}
}