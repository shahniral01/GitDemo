import childPack.*;	  //Refer to ChildAccess Class in ChildPackage


public class AccessModifier extends ChildAccess{
	
	// Refer to parent_SuperThis class
	private void getpriviate() {
		
		System.out.println("Priviate Access modifier");
	}
	
	// Refer to parent_SuperThis class
	void getdefault() {
		
		System.out.println("Default Access modifier");
		
	}
	
    public void publicAccess() {
		
		System.out.println("Public Access Modifier");
	}
	
    protected void protectedAccess() {
		
		System.out.println("Public Access Modifier");
	}
        
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Refer to ChildAccess Class in ChildPackage
		ChildAccess ca = new ChildAccess();
		ca.publicAccess();
		
		AccessModifier am  = new AccessModifier();
		am.getpriviate();
		
	}

}
