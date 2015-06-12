package learn2;

public class ZDigit {

	private char zdigit;

	public ZDigit(char a) {
		boolean bool = ((a == 48) || (64 < a && a < 91));
		if (!bool) {

			throw new IllegalArgumentException("jsfdnsk");

		}
		this.zdigit = a;
	}
	public String toString(){
		String zd =""+zdigit;
		return zd;
	}
}
