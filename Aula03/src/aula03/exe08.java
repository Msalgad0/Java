package aula03;
import java.util.Scanner;

public class exe08 {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int soma3=0,soma5=0,somatotal=0;
		
		 for (int x=1; x<=20 ;x++) {
			 soma3+= x%3 ==0?x:0;
			 soma5+=x%5==0?x:0;
			 
		 }
		
		 somatotal = soma3 + soma5;
		 System.out.println(soma3+" "+ soma5 +" " + somatotal);
		 
		input.close();
	}

}
