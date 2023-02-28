package repeticao;

import java.util.Scanner;

public class SomaImpares {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num1, num2;
		int impares = 0;

		System.out.println("Digite o 1° número: ");
		num1 = leia.nextInt();

		System.out.println("Digite o 2° número: ");
		num2 = leia.nextInt();

		if (num1 < num2) {
			for (int contador = num1 + 1; contador < num2; contador++) {
				if (contador % 2 != 0) {
					impares += contador;
				}
			}
		} else {
			for (int contador = num2 + 1; contador < num1; contador++) {
				if (contador % 2 != 0) {
					impares += contador;

				}
			}
		}
		System.out.println(impares);
		leia.close();

	}

}
