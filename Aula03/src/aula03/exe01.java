package aula03;

import java.util.Scanner;

public class exe01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite quantos alunos tem na classe");
		int alunos = input.nextInt();
		
		double soma=0, nota;
		int cont =0;
		
		
	while (cont < alunos) {
		System.out.println("Digite a nota dos alunos: ");
		nota = input.nextDouble();
		cont= cont +1;
		soma = soma + nota;
		
	}
	
	double media = soma / alunos;
	System.out.println(media);
		input.close();
	}

}
