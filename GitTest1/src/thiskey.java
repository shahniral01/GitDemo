
public class thiskey {
	
	int a=5;
	
	public void getdata() {
		
		int a=8;
		
		System.out.println(a);
		//This refer to current object and object scope lines to class
		System.out.println(this.a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thiskey t=new thiskey();
		t.getdata();
		
	}

}
