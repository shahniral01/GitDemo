import net.bytebuddy.implementation.bind.annotation.Super;

public class child_SuperThis extends parent_SuperThis {
	
	String name = "Child";
	
    int a = 3;
	
    //Super Method
	public void getdata() {
		super.getdata();
		System.out.println("This is in child");
	}
	
	// Super Constructer
	public child_SuperThis()
	{
		super();
		System.out.println("I am child class constructer");
	}
	
	//Super variable
	public void var() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 5;
		
		child_SuperThis c = new child_SuperThis();
		c.getdata();   //Refer to local variable
		c.var();
		
		System.out.println(b);  //Refer to local Variable
		//System.out.println(Super.b);
		
		
		

	}

}
