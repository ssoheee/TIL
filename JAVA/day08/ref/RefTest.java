package ref;

public class RefTest {

	public static void main(String[] args) {

		Ref ref = new Ref();
		System.out.println(ref.a); // call by reference
		
		ref.sum2(ref);
		System.out.println(ref.a);
		
		int data = 100; // call by value
		ref.sum(100);
		System.out.println(data);

	}

}
