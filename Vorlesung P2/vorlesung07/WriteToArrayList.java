import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class WriteToArrayList {

	
	public void readFromFile() {
		File file = new File("vorlesung07\\namelist");
		ArrayList<String> list = new ArrayList<>();

			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				String line = "";
				
				line = br.readLine();
				
				while (line != null) {
					if (!list.contains(line)) {
						list.add(line);
					}
					line = br.readLine();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			for(String str : list) {
				System.out.println(str);
			}
	}
	
	public static void main(String[] args) {
		WriteToArrayList obj = new WriteToArrayList();
		obj.readFromFile();
	}
	
}
