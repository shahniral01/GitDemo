
public class tryCathFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int a = 0;
			int b = 5;
			int arr[] = new int[5];
			
			
		//	System.out.println(b/a);
			System.out.println(arr[7]);
		}
		
		catch (ArithmeticException ae) {
			System.out.println("Arithmatic Exception found");
		}
		
		catch (Exception e) {
			System.out.println("Error handled by Parent");
		}
		
		finally {
			
			System.out.println("Finally Blocks Executed");
			
		}
		

	}

}
