package springtv;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("stv") // xml ���� ���⼭ �̷��� ���� ����
public class STV implements TV {
	String status;
	int volume;
	//�ڵ������� Speaker Ÿ���� ��ü�� ������ ��
	//Speaker Ÿ�� ��ü Component�� 2�� �̻��̸� �̰� �� ����(Autowired)
	//�̷� ���� Qualifier�̿�(�߰������� ���ֱ�)
	//�׷��� �� ���ŷο��� Resource�� ��(�ش� ��ü ������ �� �ִ�.)
	@Autowired
	Speaker speaker;
	//lose coupling: ���� ���� �� ��, ���� ��ü���� ����Ŀ�� ������ �ʾ���.
	
	
	public STV() {
		System.out.println("Constructor STV ...");
	}

	
	@Override
	public void turnOn() {
		this.status = "STV ON";
	}

	@Override
	public void turnOff() {
		this.status = "STV OFF";
	}

	@Override
	public void volumeUp(int v) {
		speaker.up();
	}

	@Override
	public void volumeDown(int v) {
		speaker.down();
	}
	@Override
	public String toString() {
		return "STV [status=" + status + ", volume=" + volume + "]";
	}
	
	
	
	
}




