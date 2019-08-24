import java.io.FileNotFoundException;

//Classe main, onde ocorre a bruxaria
public class Principal {

	public static void main(String[] args) throws FileNotFoundException {
		Jogo jogoForca = new Jogo();
		jogoForca.iniciar();
	}

}
