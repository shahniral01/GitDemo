
public class Childoverriding extends ParentOverriding {
	

	public void getdata()
	{
		System.out.println("I am in child class");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ParentOverriding cd = new Childoverriding();
		cd.getdata();
		
		

	}

}
