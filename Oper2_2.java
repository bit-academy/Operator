public class Oper2_2 {
	public static void main(String[] args) {
		boolean b = false;
		int i = 20020531;

		b = !b;
		System.out.println(b);

		System.out.println(Integer.toBinaryString(i));
		i = ~i;
		System.out.println(Integer.toBinaryString(i));
	}
}
