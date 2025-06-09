package aula02;

import java.util.Scanner;

public class exe03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a media do aluno 01");
		float nota1 =input.nextFloat();
		System.out.println("Digite a media do aluno 01");
		float nota2 =input.nextFloat();
	
		
		float media = (nota1 + nota2)/2;
		System.out.println(media);
		
		input.close();
	}

}
