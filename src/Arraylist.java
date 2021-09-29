import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("Niral");
		a.add("Hitachi");
		a.add("Johnson");
		a.add("JCI");
		a.remove(2);
		a.remove("Niral");
		System.out.println(a);
		System.out.println(a.get(1));
		System.out.println(a.contains("Hitachi"));
		System.out.println(a.indexOf("JCI"));
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		
	}

}
