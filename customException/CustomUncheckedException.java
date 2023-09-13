package Exception.customException;

public class CustomUncheckedException {
	public static void main(String[] args) {
		System.out.print(divide(5, 0));
	}

	public static double divide(int a, int b) {

		if (b == 0) {
			throw new MyUncheckedException("Custom Unchecked Exception");
		}
		return a / b;
	}
}
