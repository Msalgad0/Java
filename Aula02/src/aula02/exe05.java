package aula02;

import java. util.Scanner;
public class exe05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite 0 para 'Não' e 1 para 'Sim'");
		System.out.println("Telefonou para a vítima?");
		int r1 = input.nextInt();
		System.out.println("Esteve no local do crime?");
		int r2 = input.nextInt();
		System.out.println("Mora perto da vítima?");
		int r3 = input.nextInt();
		System.out.println("Devia para a vítima?");
		int r4 = input.nextInt();
		System.out.println("Já trabalhou com a vítima?");
		int r5 = input.nextInt();
		
		int soma = r1+r2+r3+r4+r5;
		
		if (soma == 2) {
			System.out.println("Suspeita");
		} else if(soma == 3 || soma == 4) {
			System.out.println("Cúmplice");
		} else if ( soma == 5) {
			System.out.println("Assasino");
		} else {
			System.out.println("Inocente");
		}
		
		
		
		
		input.close();
	
	}

}
