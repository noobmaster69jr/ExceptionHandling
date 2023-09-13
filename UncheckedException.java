package Exception;

import java.io.File;
import java.io.IOException;

public class UncheckedException {
	public static void main(String[] args) {
		// checked exception are runtime exception
		// unchecked exception/compiletime exception are exception that are not part of
		// runtime exception
		// i.e, SocketException, IoException
		try {
			File file = new File("src/foo.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
