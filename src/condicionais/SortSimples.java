package condicionais;

import java.util.Arrays;
import java.util.Scanner;

public class SortSimples {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int vetor[] = new int[3];

		for (int numero = 0; numero < vetor.length; numero++) {
			System.out.println("Digite um valor para a posição [" + numero + "]");
			vetor[numero] = leia.nextInt();
		}

		Arrays.sort(vetor);

		for (var valor : vetor)
			System.out.println(valor);

		leia.close();
	}

}
