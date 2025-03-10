import java.util.List;
import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		// Fill the code here
		Granite obj = new Granite();

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of Granite records to be added");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num>0) {
			System.out.println("Enter the records Granite (Order Id: Granite Type)");
			
			for(int i=0 ; i<num;i++) {
				String str = sc.nextLine();
				String arr[] = str.split(":");
				String id = arr[0];
				String name = arr[1];
				
				obj.addGranite(id, name);
			}
			
			System.out.println("Enter the Granite type to be searched");
			String findname = sc.nextLine();
			
			int count = obj.findCountOfOrderIdsBasedOnTheGraniteType(findname);
			if(count==-1) {
				System.out.println("No Order Ids were found for "+findname);
			}
			else {
				System.out.println("The count of order Ids based on "+findname+" is "+count);
			}
			
			System.out.println("Enter the Granite type to identify the Order Ids");
			String fname = sc.nextLine();
			
			List<String> list = obj.findOrderIdsBasedOnTheGraniteType(fname);
			if(!list.isEmpty()) {
				System.out.println("Order Ids based on the "+fname+" are ");
				for(String s:list) {
					System.out.println(s);
				}
			}
			else {
				System.out.println("No Order Ids were found for the "+fname);
			}
		}
	
	}

}