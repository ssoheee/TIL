package ifswitch;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 3 Numbers:");
		int n1 = Integer.parseInt(sc.next());
		int n2 = Integer.parseInt(sc.next());
		int n3 = Integer.parseInt(sc.next());
		
		int min=0, max=0;
		
		// min
		/*min = Math.min(n1, n2);
		if (min>n3) {
			min = n3;
		}*/
		
		if (n1<n2)
		{
			if (n1<n3) {
				min = n1;
			}
			else {
				min = n3;
			}
		}
		else {
			if (n2<n3) {
				min = n2;
			}
			else {
				min = n3;
			}
		}
				
		// max				
		max = (n1>n2) ? ((n1>n3) ? n1:n3) : ((n2>n3) ? n2:n3);
		
		System.out.printf("Min: %d, Max: %d",  min, max);
		
		sc.close();

	}

}
