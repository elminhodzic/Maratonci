import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File fajl = new File ("imena.txt");
		Scanner skaner = new Scanner (fajl);
		ArrayList<String> lista = new ArrayList<>();
		
		while (skaner.hasNext()) {
			
			String imena = skaner.nextLine();
			
			lista.add(imena);
		}
		
		Collections.sort(lista);
		
		for (String e : lista) {
			
			System.out.println(e);
		}
		
		skaner.close();

	}

}
