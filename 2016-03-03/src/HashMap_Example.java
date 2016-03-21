import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMap_Example {

	public static void main(String[] args) {
		HashMap map = new HashMap(20);
		
		map.put("First Name", "Joe");
		map.put("Last Name", "Smith");
		map.put("Age", 18);
		map.put(new Integer(32), 64);
		map.put("Address", null);
		
		
		String p1 = (String) map.get("First Name");
		System.out.println("First name: " + p1);
		
		
		//list all keys in map
		//search for a specific key using containsKey
		//finds out if key exists, if exists - will print whatever is there, including null
		
		if (map.containsKey("Address")){
			String a1 = (String) map.get("Address");
			System.out.println("Address: " + a1);
		}
		
		//search for a specific key using null
		//find out if key is null, will not print null.
		map.put("City", null);
		
		String city = (String) map.get("City");
		if (city != null){
			System.out.println("City: " + city);
		}
		
		//list all keys
		Set keyset = map.keySet();
		System.out.println("List of keys:");
		
		for (Object k : keyset) {
			System.out.println(k);
		}
		
		System.out.println("List of keys through iterator:");
		for (Iterator ix = keyset.iterator(); ix.hasNext();){
			Object k =  ix.next();
			System.out.println(k);
		}
		
		
		

	}

}
