package Exception;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int number = Integer.parseInt("1x");
			System.out.print(number);
		} catch (NumberFormatException e) {
			System.out.print(e);
		}

	}

}
