package Weeks12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyFile {
	public static void main (String args[]) {
		
		Scanner  scan = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println("Write the file name");
		String name = scan.nextLine();
		
		
		
		
		try {
		//copy from a file
		BufferedReader reader = new BufferedReader(new FileReader(name));
		String line;
		while((line = reader.readLine()) != null) {
			list.add(line);
		}
		reader.close();
		
		//paste to a file
		BufferedWriter writer = new BufferedWriter(new FileWriter("copyfile.txt"));
		for (String names: list) {
			writer.write("\n" + names);
		
		}
		writer.close();
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		finally {
			scan.close();
		}
		
		
	}
}
