package Exception.customException;

public class CustomCheckedException {
	public static void main(String[] args) {
		try {
			System.out.print(divide(5, 0));
		} catch (MyCheckedException e) {
			e.printStackTrace();
		}
	}

	// in checked Exception we need specify exception by "throws" or "handle
	// Exception"
	public static double divide(int a, int b) throws MyCheckedException {
		if (b == 0) {
			throw new MyCheckedException("Custom checked Exception");
		}
		return a / b;
	}
}
