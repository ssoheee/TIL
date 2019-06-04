package ws2;

public class Otab extends Mobile {

	public Otab() {
	}

	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		// 사용을 통해 배터리 감소 구현, 1분 사용 시 밧데리 12감소, 잔여 배터리 리턴
		int result = this.getBatterySize();
		result -= time * 12;
		this.setBatterySize(result);
		return result;

	}

	@Override
	public int charge(int time) {
		// 충전을 통한 배터리 증가 구현, 1분 충전 시 밧데리 8증가, 잔여 배터리 리턴
		int result = this.getBatterySize();
		result += time * 8;
		this.setBatterySize(result);
		return result;
	}

}
