import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Niral");
		hm.put(1, "Hitachi");
		hm.put(2, "Johnson");
		hm.put(3, "JCI");
		hm.remove(3);
		System.out.println(hm.get(1));
		
		Set sn = hm.entrySet();		
		
		Iterator it = sn.iterator();
		while (it.hasNext()) 
		{
			Map.Entry mp = (Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
			
		}
		
	}

}
