import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException, IOException, InputMismatchException {
		// TODO Auto-generated method stub

		File fAJL = new File("maraton.txt");

		Scanner skaner = new Scanner(fAJL);
		String najbrziUcesnik = skaner.next();

		int najbrzeVrijeme = skaner.nextInt();

		while (skaner.hasNext()) {

			String ime = skaner.next();

			int vrijeme = skaner.nextInt();

			if (vrijeme < najbrzeVrijeme) {

				najbrzeVrijeme = vrijeme;
				najbrziUcesnik = ime;
			}
		}

		System.out.println("Najbrzi ucesnik je " + najbrziUcesnik + " sa vremenom " + najbrzeVrijeme);
		skaner.close();

	}

}
