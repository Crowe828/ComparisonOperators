
public class Comparisons {

	public static void main(String[] args) {
		
		double a = 2.4;
		int b = 4;
		
		boolean c = (a == b);
		boolean d = (a <= b);
		boolean e = (a >= b);
		boolean f = (a > b);
		boolean g = (a < b);
		boolean h = (a != b);
		
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		if (a == 2.4) {
			System.out.println("They are equal");
		}
		
		if (a > 7) {
			System.out.println("Greater than seven");
		} else {
			System.out.println("Less than seven");
		}
		
		if (a == 2.4 || a == 2.5) {
			System.out.println("a is 2.4 or 2.5");
		}
		
		if (a > 0 && a < 100) {
			System.out.println("a is between 0 and 100");
		}
	}

}
