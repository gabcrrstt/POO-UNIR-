
public class Cliente extends Endereco{
	private String nome, telefone, documento, email;

	public Cliente( String cep, String pais,String estado, String cidade, String logradouro,String numero,String complemento) {
		super(cep, pais, estado,cidade,logradouro,numero,complemento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", telefone=" + telefone + ", documento=" + documento + ", email=" + email
				+ super.toString();
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

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
