package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		String path = "C:\\temp\\interfComp.txt";

		try(FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)){
			String name = br.readLine();
			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			
			Collections.sort(list);
			for (String str : list) {
				System.out.println(str);
			}

		}
		catch(IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
	}
}
