import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class BotUtility {
	
	public List<Bot> retrieveBotsByPurpose(Stream<Bot> botStream, String purpose){
		
		//Fill the code here
		
		
		return botStream.filter(x -> x.getPurpose().equals(purpose)).toList();
	}
	public Stream<Bot> retrieveBotsReleasedAfterSpecifiedDate(Stream<Bot> botStream, LocalDate releasedDate) {
	   	
	   	//Fill the code here
		int day = releasedDate.getDayOfMonth();
		return botStream.filter(x -> x.getReleasedDate().getDayOfMonth() > day);
	}

	public List<Bot> retrieveActiveBotsBasedOnMaximumUsers(Stream<Bot> botStream, int topLimit) {
		
		//Fill the code here
		return botStream.filter(x -> x.getActiveStatus().equals("Active")).sorted().toList();
		
    }

}
