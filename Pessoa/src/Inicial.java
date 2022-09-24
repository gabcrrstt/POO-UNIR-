public class Inicial{
	
	public static void main(String [] args){
	String nome = "Gabrielly";
	int idade = 20;
	double salarioMensal = 1500;
	double salarioAnual = 0;
	
	Pessoa p = new Pessoa();

	
	p.apresentarPessoa();
	
	p.setNome(nome);
	p.setIdade(idade);
	p.setSalarioMensal(salarioMensal);
	p.setSalarioAnual(salarioAnual);
	p.validarIdade();
	p.calcularSalario();
	
	p.apresentarPessoa();
	
	System.out.println("Nome: " + p.getNome());
	System.out.println("idade: " + p.getIdade());
	System.out.println("Salario Mensal: " + p.getSalarioMensal());
	System.out.println("Salario Anual: " + p.getSalarioAnual());

	}
}