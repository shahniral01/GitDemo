
public class ArrayMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = {{8,3,4},{5,2,7}};
		int n = a[0][0];
		int mincoloumn = 0;
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < 3; j++) {
				
				//System.out.println(a[i][j]);
				
				// Find minimum number from array
				// Find maximum number in the same coloumn
				
				if (n>a[i][j]) {
					
					n = a[i][j];
					mincoloumn=j;
					
				}
				
			}
			
		}
		int max=a[0][mincoloumn];
		int k = 0;
		while(k<2) {
			if (a[k][mincoloumn]>max) {
				max = a[k][mincoloumn];
				
			}
			k++;
		}
		
		System.out.println(max);
		//System.out.println(n);
		
		

	}

}
