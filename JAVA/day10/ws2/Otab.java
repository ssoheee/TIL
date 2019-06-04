package ws2;

public class Otab extends Mobile {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		// ����� ���� ���͸� ���� ����, 1�� ��� �� �嵥�� 12����, �ܿ� ���͸� ����
		int result = this.getBatterySize();
		result -= time * 12;
		this.setBatterySize(result);
		return result;

	}

	@Override
	public int charge(int time) {
		// ������ ���� ���͸� ���� ����, 1�� ���� �� �嵥�� 8����, �ܿ� ���͸� ����
		int result = this.getBatterySize();
		result += time * 8;
		this.setBatterySize(result);
		return result;
	}

}
