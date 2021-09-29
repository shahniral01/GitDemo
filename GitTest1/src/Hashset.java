import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("Niral");
		hs.add("Hitachi");
		hs.add("Johnson");
		hs.add("JCI");
		hs.add("Japan");
		hs.remove(2);
		hs.remove("Niral");
		System.out.println(hs.contains("Hitachi"));
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		
		Iterator<String> i = hs.iterator();
		while (i.hasNext()) 
		{
			System.out.println(i.next());
			
		}
		
		

	}

}
