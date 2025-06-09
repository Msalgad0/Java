package Aula01;

import java.util.Scanner;


public class Exercicio01 {
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero:");
		double valor = entrada.nextDouble();
		if (valor > 0) {
			System.out.println("Valor positivo");
		} else if (valor < 0){
			System.out.println("Valor negativo");
		} else {
			System.out.println("Digitou zero");
		}
	}
	

}
