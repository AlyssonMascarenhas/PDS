import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

// Essa classe sorteia a palavra
public class Sorteador {
	
	public static ArrayList<String> palavras = new ArrayList<String>();
	
	public static String palavra() throws FileNotFoundException {
		//Pega o arquivo
		File file = new File("Palavras.txt");
		Scanner inputFile = new Scanner(file);
		
		//Preencha o array
		while(inputFile.hasNext()) {
			palavras.add(inputFile.next());
		}
		inputFile.close();
		
		String palavra = palavras.get((int) (Math.random() * palavras.size()));
		
		return palavra;
	}
	

}
