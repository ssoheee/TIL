package ref;

public class Ref {
	
	int a;
	
	public void sum(int data) {
		data += 1000; // primitive data�� ����
	}
	
	public void sum2(Ref ref) {
		ref.a += 1000; // 
	}
}
