package vetores;

import java.util.Scanner;

public class TrocaVetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int auxiliar;
		int[] n = new int[20];
		for (int i = 0; i < n.length; i++) {
			n[i] = leia.nextInt();
		}
		for (int i = 0; i < (n.length / 2); i++) {
			auxiliar = n[i];
			n[i] = n[n.length - 1 - i];
			n[n.length - 1 - i] = auxiliar;
		}
		for (int i = 0; i < n.length; i++) {
			System.out.println("n[" + i + "] = " + n[i]);
		}

		leia.close();
	}

}