import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOMain {

	
	//PrintWriter
//	BufferedWriter
	
//	Scanner
//	BufferedReader
	
	public FileIOMain() {
		
//		Integer.valueOf("H");
		
		try {
			FileWriter fw = new FileWriter("text.txt");
			fw.write("Huhu");
			BufferedWriter bw = new BufferedWriter(fw);		
			bw.write("Huhu");

			PrintWriter pw = new PrintWriter(fw);
			pw.format("%2d", 9);
			pw.println("Huhu");
			
			//ist beim schreiben alles gut gegangen?
			if (pw.checkError()) {
				System.out.println("ohh nooo");
			}
		
		
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//alles was hier steht wird immer ausgeführt
		}
		
		
		File file = new File("Text.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try (FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr)) {
			
			System.out.println(br.readLine());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
	}
}
