package aula03;

import java.util.Scanner;

public class exe10 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int numeros = input.nextInt();
        int A[] = new int[4];
        int B[] = new int[4];
        int C[] = new int[4];
        int D[] = new int[4];
        		

        for (int x = 0; x < numeros.length; x++) {
            System.out.println("Posição " + x + ": numero = " + numeros[x]);
        }
    }
}
