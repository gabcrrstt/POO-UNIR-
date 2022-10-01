import java.util.Date;

public class Endereco {
	
	private String cep, pais, estado, cidade, logradouro, numero, complemento;
	
	
	public Endereco(String cep, String pais, String estado, String cidade, String logradouro, String numero,
			String complemento) {
			this.cep=cep;
			this.pais = pais;
			this.estado = estado;
			this.cidade = cidade;
			this.logradouro = logradouro;
			this.numero = numero;
			this.complemento = complemento;
	}

	@Override
	public String toString() {
		return "Endereco [cep=" + cep + ", pais=" + pais + ", estado=" + estado + ", cidade=" + cidade + ", logradouro="
				+ logradouro + ", numero=" + numero + ", complemento=" + complemento + "]" ;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
}
