import java.io.FileNotFoundException;
import java.util.Scanner;

//Aqui fica todo o código
public class Jogo {
	
	public void iniciar() throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		boolean jogar = true;
		
		do {
			System.out.println(" - Jogo da Forca - ");
			
			//Escolhe a palavra
			String palavra = Sorteador.palavra();
			System.out.println("\n\n");
			
			boolean jogo = true;
			do {
				char letras[] = new char[palavra.length()];
				for(int x = 0; x < palavra.length(); x++) {
					letras[x] = palavra.charAt(x);
					System.out.println("_ ");
				}
				boolean tentativas = true;
                int erro = 0;
                char certas[] = new char[palavra.length()];
                while (tentativas) {
                    if (erro < 6) {
                        System.out.println("\nDigite uma letra.");
                        int letraErrada = 0;

                        // procura na palavra a letra inserida
                        char letra = scan.next().charAt(0);
                        String PalavraNova = "";

                        for (int i = 0; i < palavra.length(); i++) {
                            if (letra == letras[i]) {
                                // certo
                                certas[i] = letra;
                            } else {
                                // errado
                                letraErrada++;
                            }
                            if (certas[i] == letras[i]) {
                                PalavraNova += certas[i];
                                System.out.print(" " + certas[i] + " ");

                            } else {
                                System.out.print("_ ");
                            }
                        }
                        if (letraErrada >= palavra.length()) {
                            erro++;
                            System.out.println("\nErrado (" + erro + "/6)");
                        }
                        if (palavra.equals(PalavraNova)) {
                            // todas certas
                            System.out.println("\n\nBINGO!  '" + palavra + "'.");
                            tentativas = false;
                        } else {
                            new Visual(erro);
                        }
                    } else {
                        System.out.println("\nEsgotou as tentativas! ");
                        System.out.println("A palavra era: " + palavra);
                        tentativas = false;
                    }
                }
                jogo = false;
			}while(jogo);
		}while(jogar);
		scan.close();
	}
}
		



