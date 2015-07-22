public class RectangularPlug {
	private String rectaStem1;
	private String rectaStem2;
	public getPower() {
		RectangulrAdapter adapter = new RectangulrAdapter();
		String power = adapter.adapt(rectaStem1, rectaStem2);
		System.out.println(power);
	}
}
