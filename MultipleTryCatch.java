package Exception;

public class MultipleTryCatch {

	public static void main(String[] args) {

		try {
			int number = Integer.parseInt("1x");
			System.out.print(number);
			System.out.print(10 / 0);
		} catch (NumberFormatException | ArithmeticException e) {
			System.out.print(e.getMessage());

		} catch (Exception e) {
			// catch all exception
			System.out.print(e.getMessage());
			e.printStackTrace();
		}
	}

}
