
public class Endereco {

	private String cidade = "Porto Velho",
			estado = "Rondônia",logradouro = "rua n sei",
			pais = "Brasil", 
			numero = "99", 
		 CEP = "09889909",
		 complemento = "faculdade";

	public Endereco() {

	}

	public Endereco(String cidade,String estado, String logradouro,String pais,String numero,String CEP,String complemento) {
		this.cidade = cidade;
		this.estado = estado;
		this.logradouro = logradouro;
		this.pais = pais;
		this.numero = numero;
		this.CEP = CEP;
		this.complemento = complemento;
	}
	
	@Override
	public String toString() {
		return "Endereco [\ncidade=" + cidade + ", \nestado=" + estado + ", \nlogradouro=" + logradouro + ",\n pais=" + pais
				+ ",\n numero=" + numero + ",\n CEP=" + CEP + ",\n complemento=" + complemento + "]";
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}
