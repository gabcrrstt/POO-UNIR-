import java.util.Date;

public class Produto extends Venda {
	
	private String descricao, garantia;
	private double valor;
	
	public Produto(Date dataVenda, String tipoPag, String produto) {
		super(dataVenda, tipoPag, produto);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", garantia=" + garantia + ", valor=" + valor + super.toString();
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getGarantia() {
		return garantia;
	}
	public void setGarantia(String garantia) {
		this.garantia = garantia;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

}
