import java.util.Collections;
import java.util.Scanner;
import java.util.Arrays;

public class ArraysMultidimensionais {
	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		Scanner input = new Scanner(System.in);

		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.printf("Digite o valor da matriz[%d][%d]: ", l, c);
				matriz[l][c] = input.nextInt();
			}
			System.out.println();
		}
		System.out.println("Matriz: ");
		System.out.println("\n" + "// for (int i=0; i<3; i++)\n");
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println();
		}
		System.out.println("\n" + "// for (int num: array)\n");
		for (int[] arrBase:  matriz) {
			for (int num: arrBase){
				System.out.print(num + " ");
			}
			System.out.println();
		}

	}
}
