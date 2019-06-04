package day01;

// Java Application (메인이 반드시 있음)

public class Variable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a=10;
	int b=20;
	int c=30;

	/*int temp = 0;
	
	if (a<b) {
		temp=b;
		if(c>temp) {
			temp=c;
		}
		else {
			temp=a;
			if(c>temp) {
				temp=c;
			}
		}
	}*/
	
	if(a<b) {a=b;}
	if(a<c) {a=c;}

	System.out.println(a);
	
	}

}
