package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		List<Employee> list2 = new ArrayList<>();
		String path = "C:\\temp\\interfComp.txt";
		String path2 = "C:\\temp\\interfComp.csv";

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
		
		System.out.println("-----------------------------------");
		System.out.println("-----------------------------------");
		
		try(FileReader fr = new FileReader(path2); BufferedReader br = new BufferedReader(fr)){
			
			String name = br.readLine();
			String[] vect;
			
			while (name != null) {
				vect = name.split(",");
				
				list2.add(new Employee(vect[0], Double.parseDouble(vect[1])));
				name = br.readLine();

			}
			
			Collections.sort(list2);
			for (Employee em : list2) {
				System.out.println(em.getName() + ", " + em.getSalary());
			}

		}
		catch(IOException e) {
			System.out.println("Error :" + e.getMessage());
		}
		
	}
}
