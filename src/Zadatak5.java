import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		File fajl = new File ("maraton.txt");
		Scanner skaner = new Scanner (fajl);
		File fajl2 = new File ("NajboljiMaratonci.txt");
		PrintWriter printanje = new PrintWriter(fajl2);
		ArrayList<Lista> lista = new ArrayList<>();
		
		while (skaner.hasNext()) {
			
			Lista podaci = new Lista();
			String ime = skaner.next();
			int brzina = skaner.nextInt();
			
			podaci.setIme(ime);
			podaci.setBroj(brzina);
			
			lista.add(podaci);
		}
		
		for (Lista e : lista) {
			
			if (e.getBroj() <= 300) {
				
				System.out.println(e.getIme() + " " + e.getBroj());
				
				printanje.println(e.getIme() + " " + e.getBroj());
			}
			
		}
		
		skaner.close();
		printanje.close();

	}

}
