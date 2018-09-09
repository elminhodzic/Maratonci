import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL stranica = new URL("http://www.textfiles.com/science/astronau.txt");

		try {

			Scanner skaner = new Scanner(stranica.openStream());
			int brojacLinija = 0;

			while (skaner.hasNext()) {

				String linije = skaner.nextLine();
				brojacLinija++;
			}

			System.out.println(brojacLinija);
			skaner.close();
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
