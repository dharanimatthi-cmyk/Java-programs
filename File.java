package CIET;
import java.util.BufferedReader;
import java.io.FileReader;
import java.io.IoException;
public class File {
	public static void readFile() throws IoException{
		FileReader file=new FileReader("./data.txt");
		BuffereReader reader=new BufferedReader(file);
		String Line;
		while((Line=reader.readLine())!=null) {
			System.out.println(Line);
		}
		reader.close();
		file.close();
	}
	public static void main(String[] args) {
		throws IoException{
			readFile();
		}
	}

}
