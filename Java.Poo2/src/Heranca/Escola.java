package Heranca;

public class Escola {

	public static void main(String[] args) {
		Aluno A1 = new Aluno("Carlos", "12345678900", "(81)99712-4944");
		 System.out.printf("Aluno: %s, CPF: %s, Telefone: %s\n", A1.nome, A1.cpf, A1.telefone);
		
		Professor P1 = new Professor("Jose", "12345678901", "(81)99712-4944");
		System.out.printf("Professor: %s, CPF: %s, Telefone: %s\n", P1.nome, P1.cpf, P1.telefone);
		
		Funcionario F1 = new Funcionario("Lucas", "12345678902", "(81)99712-4944");
		System.out.printf("Funcionário: %s, CPF: %s, Telefone: %s\n", F1.nome, F1.cpf, F1.telefone);
}
}