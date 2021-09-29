
public class Interclass implements InterfaceDemo1,InterfaceDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To implement method Interclass create object of that
		Interclass a = new Interclass();
		a.sefMethod();
		
		//To implement method present in interclass1 then create object of that
		InterfaceDemo1 id1 = new Interclass();
		id1.inmethod1();
		
		//To implement method present in interclass1 then create object of that
		InterfaceDemo2 id2 = new Interclass();
		id2.inmethod2();
		

	}
	
	public void inmethod1() {
		
		System.out.println("This is interface Demo 1");
	}
	
	public void inmethod2() {
		
		System.out.println("This is interface Demo 2");
	}
	
	public void sefMethod() {
		
		System.out.println("Method present on Interclass");
	}


}
