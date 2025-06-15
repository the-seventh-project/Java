package Weeks12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class OutputFile {
	public static void main (String args[]) {
		
		String[] names = {"Val" , "Janssen", "Rosario"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			for (String name: names) {
				writer.write("\n" + name);
			}
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
