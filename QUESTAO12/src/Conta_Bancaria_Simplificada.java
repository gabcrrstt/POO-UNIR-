
public class Conta_Bancaria_Simplificada {
	private String nomeDoCorrentista, saldo, ContaEspecial;

	
	@Override
	public String toString() {
		return "Conta_Bancaria_Simplificada [nomeDoCorrentista=" + nomeDoCorrentista + ", saldo=" + saldo
				+ ", ContaEspecial=" + ContaEspecial + "]";
	}

	public String getNomeDoCorrentista() {
		return nomeDoCorrentista;
	}

	public void setNomeDoCorrentista(String nomeDoCorrentista) {
		this.nomeDoCorrentista = nomeDoCorrentista;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getContaEspecial() {
		return ContaEspecial;
	}

	public void setContaEspecial(String contaEspecial) {
		ContaEspecial = contaEspecial;
	}
	
	
	
}
