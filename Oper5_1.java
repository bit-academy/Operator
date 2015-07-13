public class Oper5_1 {
	public static void main(String[] args) {
		int a = -1014;

		System.out.println("<<");
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a << 1));
		System.out.println(Integer.toBinaryString(a << 2));

		System.out.println("\n>>");
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a >> 1));
		System.out.println(Integer.toBinaryString(a >> 2));

		System.out.println("\n>>>");
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(a >>> 1));
		System.out.println(Integer.toBinaryString(a >>> 2));
	}
}
