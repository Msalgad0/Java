package javapoo;

public class teste {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Matheus";
		p1.idade = 25;
		p1.altura = 1.72;
		p1.genero = "Masculino";
		p1.comer("Macarrão");
		p1.exibirAtributos();
		
		
	}

}
