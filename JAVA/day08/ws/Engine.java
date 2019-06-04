package ws;

public class Engine {

	private int displacement;
	private int enginetype;

	public Engine() {
	}

	public Engine(int displacement, int enginetype) throws Exception {
		this.displacement = displacement;
		this.enginetype = enginetype;

		if (enginetype != 4 && enginetype != 6) {
			throw new Exception();
		}
	}

	@Override
	public String toString() {
		return "Engine [displacement=" + displacement + ", enginetype=" + enginetype + "]";
	}

}
