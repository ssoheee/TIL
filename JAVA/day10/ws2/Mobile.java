package ws2;

public abstract class Mobile {

	private String mobileName;
	private int batterySize;
	private String osType;

	public Mobile() {
	}

	public Mobile(String mobileName, int batterySize, String osType) {
		this.mobileName = mobileName;
		this.batterySize = batterySize;
		this.osType = osType;
	}

	public int getBatterySize() {
		return batterySize;
	}

	public void setBatterySize(int batterySize) {
		this.batterySize = batterySize;
	}

	@Override
	public String toString() {
		return "Mobile [mobileName=" + mobileName + ", batterySize=" + batterySize + ", osType=" + osType + "]";
	}

	public abstract int operate(int time); // ����� ���� ���͸� ����(�д����� �Է�)

	public abstract int charge(int time); // ������ ���� ���͸� ����(�д����� �Է�)

}
