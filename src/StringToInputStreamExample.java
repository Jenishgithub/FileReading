import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StringToInputStreamExample {
	public static void main(String[] args) {

		String str = "This is a string GoGoGo";

		// convert string to inputstream
		InputStream is = new ByteArrayInputStream(str.getBytes());

		// read it with buffer reader
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		try {
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
