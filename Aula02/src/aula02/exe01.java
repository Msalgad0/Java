package aula02;

/* Fazer essa questão com if , ternario e bibliotaca math.max(n1,n2)*/
import java.util.Scanner;
public class exe01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um numero 1:");
		int valor1 = input.nextInt();
		System.out.println("Digite um numero 2:");
		int valor2 = input.nextInt();
		System.out.println("Digite um numero 3:");
		int valor3 = input.nextInt();
		
		int resultado = valor1> valor2 && valor1 > valor3? valor1: valor2> valor2 && valor2 > valor3? valor2:valor3;
		System.out.println (resultado);
		
		int resposta2 = Math.max(valor1, Math.max(valor2,valor3));
		System.out.println(resposta2);
		
		/*if  (valor1 > valor2){
		System.out.println(valor1);
		
		}	else if (valor2 > valor3){
		System.out.println(valor2);
		
		}	else if (valor3 > valor1) {
		System.out.println(valor3);
		}
		*/
		input.close();
	}

}
