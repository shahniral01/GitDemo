
public class ChildAbstract extends ParentAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inheritance concept
		ChildAbstract a = new ChildAbstract();
		a.abstractMethod();
		a.ParentMethod();

	}

	@Override
	public void abstractMethod() {
		// TODO Auto-generated method stub
		System.out.println("Abstract Method");
		
	}

	

}
