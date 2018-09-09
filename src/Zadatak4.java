import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File fajl = new File("maraton.txt");
		Scanner skaner = new Scanner(fajl);

		ArrayList<Integer> lista = new ArrayList<>();

		while (skaner.hasNext()) {

			String ime = skaner.next();
			int vrijeme = skaner.nextInt();

			lista.add(vrijeme);
		}

		int rezultat = 0, brojac = 0;
		double prosjecno;

		for (int i = 0; i < lista.size(); i++) {

			rezultat += lista.get(i);
			brojac++;

		}
		System.out.println(rezultat);
		prosjecno = (double) rezultat / brojac;

		System.out.println("Prosjecno vrijeme je: " + prosjecno);

		skaner.close();

	}

}
