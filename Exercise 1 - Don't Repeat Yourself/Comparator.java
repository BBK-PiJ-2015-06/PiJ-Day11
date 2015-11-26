public class Comparator {
	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public int getMax(int n, int m) {
		return (int) getMax((double)n, (double)m);
	}
	public String getMax(String number1, String number2) {
		double d1 = Double.parseDouble(number1);
		double d2 = Double.parseDouble(number2);
		if((d1 % 1) > 0 || (d2 % 1) > 0) {
			return "" + getMax(d1, d2);
		} else {
			return "" + getMax((int)d1, (int)d2);
		}
	}
}