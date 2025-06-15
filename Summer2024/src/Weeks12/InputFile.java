package Weeks12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class InputFile {
	public static void main(String args[]) {
		
		ArrayList<String> name = new ArrayList<String>();
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while ((line = reader.readLine()) != null) {
			name.add(line);
			}
			reader.close();
		} catch (IOException a) {
			
			
			a.printStackTrace();
		}	
		
		
			for(String names: name) {
				System.out.println(names);
			}
		
}
}
