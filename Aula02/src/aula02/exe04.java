package aula02;

import java.util.Scanner;

public class exe04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite uma letrea F ou M : ");
		char letra = input.next().charAt(0);
		
		 letra = Character .toUpperCase(letra);
		
		if ( letra == 'F' ) {
			System.out.println("Feminino");
		} else if (letra == 'M') {
			System.out.println("Masculino");
		} else {
			System.out.println("Valor invalido!");
		}
		
		
		input.close();
	}
}
