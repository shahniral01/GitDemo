
public class parent_SuperThis {
	
	int a = 2;
	String name = "Parent";
	
	public void getdata() {
		
		System.out.println("This is in Parent");
	}
	
	public parent_SuperThis()
	{
		System.out.println("I am parent class constructer");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Refer to AccessModifier class
		AccessModifier am = new AccessModifier();
		//am.getpriviate();  //In came class only
		am.getdefault();
		am.publicAccess();
		am.protectedAccess();

	}

}
