package javapoo;

public class Pessoa {
	String nome;
	int idade;
	double altura;
	String genero;
	
	
	public void comer(String comida) {
		System.out.println(nome + " Começou a comer " + comida);
		
	}
	public void exibirAtributos() {
		System.out.printf("Nome:%s Idade: %d Altura: %.2f Genero: %s", nome,idade,altura,genero);
	}

}
