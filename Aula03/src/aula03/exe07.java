package aula03;

import java.util.Scanner;

public class exe07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite as notas dos alunos: ");
		int alunos = input.nextInt();
		
		double nota,soma=0, media;
		
		for ( int i=0 ;i < alunos ; i++) {
			System.out.println("Digite a nota: ");
			 nota = input.nextDouble();		
			 soma = soma + nota; 
		}
		
		media= soma / alunos;
		System.out.println(media);
		
		input.close();
	}

}
