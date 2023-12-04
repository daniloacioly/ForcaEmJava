package forca;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jogodaforca {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palavras = {"banana", "maçã", "pera", "uva", "melão"};
        Random random = new Random();
        String palavraSorteada = palavras[random.nextInt(palavras.length)];

        char[] tabuleiro = new char[6];
        Arrays.fill(tabuleiro, '-');

        int erros = 0;
        System.out.println("Bem-vindo ao jogo da forca!");
        System.out.println("A palavra secreta tem " + palavraSorteada.length() + " letras.");

        while (erros < 6 && !Arrays.equals(palavraSorteada.toCharArray(), tabuleiro)) {
    
            System.out.print("Digite uma letra: ");
            char letra = scanner.next().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraSorteada.length(); i++) {
                if (palavraSorteada.charAt(i) == letra) {
                    tabuleiro[i] = letra;
                    acertou = true;
                }
            }

            if (acertou) {
                System.out.println("Acertou! A palavra está assim:");
                System.out.println(tabuleiro);
            } else {
                System.out.println("Errou! A palavra está assim:");
                System.out.println(tabuleiro);
                erros++;
            }
        }

        if (erros < 6) {
            System.out.println("Parabéns! Você acertou a palavra secreta!");
        } else {
            System.out.println("Que pena! Você perdeu. A palavra secreta era " + palavraSorteada);
        }
    }
}