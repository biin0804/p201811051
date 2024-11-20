package p201811051;

public class World {
	public static long factorial(int n) {
		long result = 1;
		for (int i = 1; i <= n; ++i) {
			result *= i;
		}
		return result;
	}
}
