import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveDataToFile {
	public static void main(String[] args) {
		File file = new File("text.bin");
		try {
			file.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DataOutputStream stream = null;
		try {
			stream = new DataOutputStream(new FileOutputStream(file));
			stream.writeBoolean(true);
			stream.writeInt(1234);
			stream.close();

			// reading from the file
			File file2 = new File("text.bin");
			DataInputStream stream2 = new DataInputStream(new FileInputStream(
					file));
			boolean isTrue = stream2.readBoolean();
			int value = stream2.readInt();
			stream.close();
			System.out.println(isTrue + " " + value);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO: handle exception
		}

	}
}
