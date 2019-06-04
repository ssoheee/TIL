package ws2;

public class Ltab extends Mobile {

	public Ltab() {
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		// ����� ���� ���͸� ���� ����, 1�� ��� �� �嵥�� 10����, �ܿ� ���͸� ����
		int result = this.getBatterySize();
		result -= time * 10;
		this.setBatterySize(result);
		return result;
	}

	@Override
	public int charge(int time) {
		// ������ ���� ���͸� ���� ����, 1�� ���� �� �嵥�� 10����, �ܿ� ���͸� ����
		int result = this.getBatterySize();
		result += time * 10;
		this.setBatterySize(result);
		return result;
	}

}
