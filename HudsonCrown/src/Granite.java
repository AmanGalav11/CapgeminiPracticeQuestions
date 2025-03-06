import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Granite {

	private Map<String,String> graniteMap=new HashMap<String,String>();
	
	public Map<String, String> getGraniteMap() {
		return graniteMap;
	}

	public void setGraniteMap(Map<String, String> graniteMap) {
		this.graniteMap = graniteMap;
	}
	
	public void addGranite(String orderId, String graniteType) {
		//Fill the code
		graniteMap.put(orderId, graniteType);
	}
	
	public int findCountOfOrderIdsBasedOnTheGraniteType(String graniteType) {
		//Fill the code
		int count=0;
		for(Map.Entry<String, String> entry : graniteMap.entrySet()) {
			if(entry.getValue().equalsIgnoreCase(graniteType)) {
				count++;
			}
		}
		if(count==0) {
			return -1;
		}
		else {
			return count;
		}
	}

	public List<String> findOrderIdsBasedOnTheGraniteType(String graniteType){
	        //Fill the code
		List<String> list = new ArrayList<String>();
		for(Map.Entry<String, String> entry : graniteMap.entrySet()) {
			if(entry.getValue().equals(graniteType)) {
				list.add(entry.getKey());
			}
		}
		return list;
		
	}
}
