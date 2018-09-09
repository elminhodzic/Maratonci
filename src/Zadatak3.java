import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner unos = new Scanner(System.in);

		File fajl = new File("maraton.txt");
		Scanner skaner = new Scanner(fajl);

		ArrayList<Lista> lista = new ArrayList<>();

		int prekid = 1;
		while (skaner.hasNext()) {

			Lista podaci = new Lista();
			String imeLika = skaner.next();
			int brzina = skaner.nextInt();

			podaci.setIme(imeLika);
			podaci.setBroj(brzina);

			lista.add(podaci);

		}

		while (prekid != 0) {
			
			System.out.println("Unesi ime: ");
			String ime = unos.next();

			for (Lista e : lista) {

				if (ime.equals(e.getIme())) {

					System.out.println(e.getIme() + " " + e.getBroj());
				}
			}

			System.out.println("za prekid unesite 0 za nastavak 1: ");

			prekid = unos.nextInt();
		}
		
		unos.close();
		skaner.close();
	}

}
