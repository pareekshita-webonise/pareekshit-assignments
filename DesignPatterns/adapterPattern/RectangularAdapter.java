public class RectangularAdapter {
	private CylindricalSocket socket;

	public String adapt(String rectaStem1, Sting rectaStem2) {
		//some conversion logic
		socket = new CylindricalSocket();
		String cylinStem1 = rectaStem1;
		String cylinStem2 = rectaStem2;
		return socket.supply(cylinStem1, cylinStem2);
	}
}
