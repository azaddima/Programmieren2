package fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public void write (String text) {
		
//		File file = new File("C:\\User\\Stephi\\Desktop\\name.txt");
		File file = new File("name.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			//der bufferedWriter benutzt den unterliegenden FileWriter um zu schreiben
			fw = new FileWriter(file, true);
			bw = new BufferedWriter(fw);
			bw.write(text);
			bw.newLine();
			
		} catch (Exception e) {
			e.printStackTrace();//zeigt uns die exception an
		} finally {
			try {
				bw.close();
				fw.close();			
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public String readFile () {
		File file = new File("name.txt");
		String text = "";
		try (
				FileReader in = new FileReader(file);
				BufferedReader br = new BufferedReader(in);
		) {
			String tmp = "";
			
			do {
				text += tmp + "\n";
				tmp = br.readLine();
			} while (tmp != null);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return text;
	}
	
	public static void main(String[] args) {
		WriteInFile writer = new WriteInFile();
		writer.write("Hallo");
		writer.write("Welt");
		
		System.out.println(writer.readFile());
	}
	
}
