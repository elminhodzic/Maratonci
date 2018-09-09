import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File fajl = new File("maraton.txt");
		Scanner skaner = new Scanner(fajl);

		ArrayList<Lista> lista = new ArrayList<>();;

		while (skaner.hasNext()) {

			Lista podaci = new Lista();

			String ime = skaner.next();
			int broj = skaner.nextInt();

			podaci.setIme(ime);
			podaci.setBroj(broj);

			lista.add(new Lista(ime, broj));

		}

		Collections.sort(lista, new Comparator<Lista>() {

			public int compare(Lista broj1, Lista broj2) {
				// TODO Auto-generated method stub
				return Integer.valueOf(broj1.getBroj()).compareTo(broj2.getBroj());
			}

		});

		for (Lista e : lista) {

			System.out.println(e.getIme() + " " + e.getBroj());

		}
		
		skaner.close();
	}

}
