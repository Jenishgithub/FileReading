import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToStringExample {
	public static void main(String[] args) {
		// initialize input stream
		InputStream is = new ByteArrayInputStream(
				"file content..blah blah".getBytes());
		String result = getStringFromInputStream(is);

		System.out.println(result);
		System.out.println("DOne");
	}

	private static String getStringFromInputStream(InputStream is) {
		// TODO Auto-generated method stub
		BufferedReader br = null;
		StringBuilder sb = new StringBuilder();
		String line;
		br = new BufferedReader(new InputStreamReader(is));
		try {
			while ((line = br.readLine()) != null) {
				sb.append(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return sb.toString();
	}
}
