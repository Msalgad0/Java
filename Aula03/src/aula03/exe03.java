package aula03;

public class exe03 {

	public static void main(String[] args) {
		for (int i=0;i<100;i++) {
			if (i>50 && i<60) {
				continue; // ELE PULA OS NUMEROS DE 50  A 60
			}
			System.out.println(i);
		}

	}

}
