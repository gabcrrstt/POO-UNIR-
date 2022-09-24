public class Pessoa {

	private String nome;
	private int idade;
	private double salarioMensal;
	private double salarioAnual;
		
	public Pessoa(){
		
	}
	
	public Pessoa(int idade){
		this.idade = idade;	
	}
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	private Pessoa (double salarioMensal){
		this.salarioMensal = salarioMensal;
	}
	private void Pessoa1 (double salarioAnual){
		this.salarioAnual = salarioAnual;
	}
	
	public double calcularSalario() {
		return(salarioAnual = salarioMensal * 12);
		
	}
	public void validarIdade(){
		if(this.idade < 18){
			System.out.println("Menor de idade");
		} else {
			System.out.println("Maior de idade");
		}
	} 
	
	
	
	public Pessoa(String nome, int idade, double salarioMensal, double salarioAnual){
		this.nome = nome;
		this.idade = idade;
		this.salarioMensal =salarioMensal;
		this.salarioAnual =salarioAnual;
		this.validarIdade();
		this.calcularSalario();
	}
	
		
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public int getIdade(){
		return this.idade;
	}
	
	public void setIdade(int idade){
		this.idade =idade;
	}
	public double getSalarioMensal(){
		return this.salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal){
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioAnual(){
		return this.salarioAnual;
	}
	
	public void setSalarioAnual(double salarioAnual){
		this.salarioAnual = salarioAnual;
	}
	
	public void apresentarPessoa(){
		System.out.println("Nome: " + this.nome + ", idade: " +this.idade +" anos."
	+ ", Salario Mensal: " +this.salarioMensal +", Salario Anual: " +this.salarioAnual);
		
		}
	
	}