import java.util.Date;


public class Cliente extends Endereco {

	private String nome = "gab";
	private String telefone = "888778776744";
	private String email = "gab@unir.br";
	private String documento = "9319392199";
	Data dataNasc = new Data(0, 0, 0);


	public Cliente() {
		
	}
	
	public Cliente(String nome, String telefone, String email, String documento, Date dtNascimento) {
		this.nome = nome;
		this.telefone = telefone;
		this.documento = documento;
		this.dataNasc = dataNasc;
		this.email = email;
	}

	@Override
	public String toString() {
		return "\nnome=" + nome + "\ntelefone=" + telefone + "\nemail=" + email + "\ndocumento=" + documento
				+ ", \ndtNascimento=" + dataNasc + "]" + super.toString();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Data getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Data dataNasc) {
		this.dataNasc = dataNasc;
	}

}
