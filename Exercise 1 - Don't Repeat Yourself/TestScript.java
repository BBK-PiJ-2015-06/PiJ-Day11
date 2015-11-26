public class TestScript {
	public static void main(String[] args) {
		Comparator test = new Comparator();
		System.out.print("Enter first number: ");
		String s1 = System.console().readLine();
		System.out.print("Enter second number: ");
		String s2 = System.console().readLine();
		System.out.println(test.getMax(s1, s2));
	}
}