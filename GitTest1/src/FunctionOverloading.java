
public class FunctionOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionOverloading fl = new FunctionOverloading();
		fl.getdata(2);
		fl.getdata("Method with same name is called as function Overloading");

	}
	
	public void getdata(int a)
	{
		System.out.println(a);
	}
	
	public void getdata(String a)
	{
		System.out.println(a);
	}

}
