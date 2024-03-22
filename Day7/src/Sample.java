import java.io.*;

public class Sample {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("나없는파일"));
			br.readLine();
			br.close();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
			System.out.println("있는파일을 찾아~!");
		}
	}
}