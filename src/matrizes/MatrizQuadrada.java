package matrizes;

import java.util.Scanner;

public class MatrizQuadrada {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int n = leia.nextInt();
		while (n != 0) {
			for (int i = 1; i <= n; i++) {
				int x = Math.min(Math.min(i, n - i + 1), Math.min(i, n - i + 1));
				for (int j = 1; j <= n; j++) {
					System.out.printf("%3d", x);
					if (j < n)
						System.out.print(" ");
					else
						System.out.print("\n");
				}
			}
			System.out.print("\n");
			n = leia.nextInt();
		}

		leia.close();
	}

}
