
public abstract class Empregado {   
    private String nome;
    private String nomeDepto;
     
	public Empregado() {
 		this.nome = "";
 		this.nomeDepto = "";
 	}  
    public Empregado(String nome, String nomeDepto) {
		this.nome = nome;
		this.nomeDepto = nomeDepto;
	}    
     // metodo abstrato a ser reescrito e implementado nas subClasses
    public abstract double calculaSalario(); // nenhum implementacao aqui
 	
    @Override
	public String toString() {
		return "nome=" + nome + ", nomeDepto=" + nomeDepto;
	}
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNomeDepto() {
		return nomeDepto;
	}
	public void setNomeDepto(String nomeDepto) {
		this.nomeDepto = nomeDepto;
	} 
}
