public class Oper5_2 {
	public static void main(String[] args) {
		int a = -1014;
		int b = 1014;

		System.out.println(a + ":\t\t" + Integer.toBinaryString(a));
		System.out.println((a >> 1) + ": >>\t" + Integer.toBinaryString(a >> 2));
		System.out.println((a >>> 1) + ": >>>\t00" + Integer.toBinaryString(a >>> 2));

		System.out.println("");
		System.out.println(b + ":\t\t" + Integer.toBinaryString(b));
		System.out.println((b >> 1) + ": >>\t\t00" + Integer.toBinaryString(b >> 2));
		System.out.println((b >>> 1) + ": >>>\t00" + Integer.toBinaryString(b >>> 2));
	}
}
