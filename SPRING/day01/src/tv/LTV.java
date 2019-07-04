package tv;

public class LTV {
	int volume;
	String status;
	public LTV() {}
	
	public void turnOn() {
		this.status = "LTV On";
	}
	public void turnOff() {
		this.status = "LTV Off";
	}
	public void volumeUp(int v) {
		this.volume += v;
	}
	public void volumeDown(int v) {
		this.volume -= v;
	}

	@Override
	public String toString() {
		return "LTV [volume=" + volume + ", status=" + status + "]";
	}
	
}





