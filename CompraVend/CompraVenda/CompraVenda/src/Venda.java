import java.util.Date;

public class Venda {
	private Date dataVenda;
	private String tipoPag, produto;
	
	public Venda(Date dataVenda, String tipoPag, String produto) {
		this.dataVenda = dataVenda;
		this.tipoPag = tipoPag;
		this.produto = produto;
	}

	@Override
	public String toString() {
		return "Venda [dataVenda=" + dataVenda + ", tipoPag=" + tipoPag + ", produto=" + produto + "]";
	}
	
	public Date getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getTipoPag() {
		return tipoPag;
	}
	public void setTipoPag(String tipoPag) {
		this.tipoPag = tipoPag;
	}
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}

}
