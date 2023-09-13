package Exception;

public class ThrowAndThrows {
	public static void main(String[] args) {
		System.out.print(divide(10, 0));
	}

	public static double divide(int a, int b) throws IllegalArgumentException {
		if (b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0");
		}
		return a / b;
	}

}
