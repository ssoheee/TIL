package ws2;

public class Ltab extends Mobile {

	public Ltab() {
	}

	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		// 사용을 통해 배터리 감소 구현, 1분 사용 시 밧데리 10감소, 잔여 배터리 리턴
		int result = this.getBatterySize();
		result -= time * 10;
		this.setBatterySize(result);
		return result;
	}

	@Override
	public int charge(int time) {
		// 충전을 통한 배터리 증가 구현, 1분 충전 시 밧데리 10증가, 잔여 배터리 리턴
		int result = this.getBatterySize();
		result += time * 10;
		this.setBatterySize(result);
		return result;
	}

}
