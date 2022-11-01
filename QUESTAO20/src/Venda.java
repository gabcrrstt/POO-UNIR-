import java.util.ArrayList;
import java.util.List;

public class Venda {

	private List<Integer> assentos = new ArrayList<Integer>();
	private List<Passagem> passagens = new ArrayList<Passagem>();
	Data dataVend = new Data(0, 0, 0);
	private double valor = 0;
	private double valorPassagemFix = 1000;
	private List<Integer> assentosDisponiveis = new ArrayList<Integer>();
	
	
	
	
	@Override
	public String toString() {
		return "Venda [assentos=" + assentos + ", passagens=" + passagens + ", dataVend=" + dataVend + ", valor="
				+ valor + ", valorPassagemFix=" + valorPassagemFix + ", assentosDisponiveis=" + assentosDisponiveis
				+ "]";
	}
	public Venda(List<Integer> assentos, List<Passagem> passagens, Data dataVend, double valor, double valorPassagemFix,
			List<Integer> assentosDisponiveis) {
		super();
		this.assentos = assentos;
		this.passagens = passagens;
		this.dataVend = dataVend;
		this.valor = valor;
		this.valorPassagemFix = valorPassagemFix;
		this.assentosDisponiveis = assentosDisponiveis;
	}
	public Venda() {
		super();
		// TODO Auto-generated constructor stub
	}
	public List<Integer> getAssentos() {
		return assentos;
	}
	public void setAssentos(List<Integer> assentos) {
		this.assentos = assentos;
	}
	public List<Passagem> getPassagens() {
		return passagens;
	}
	public void setPassagens(List<Passagem> passagens) {
		this.passagens = passagens;
	}
	public Data getDataVend() {
		return dataVend;
	}
	public void setDataVend(Data dataVend) {
		this.dataVend = dataVend;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public double getValorPassagemFix() {
		return valorPassagemFix;
	}
	public void setValorPassagemFix(double valorPassagemFix) {
		this.valorPassagemFix = valorPassagemFix;
	}
	public List<Integer> getAssentosDisponiveis() {
		return assentosDisponiveis;
	}
	public void setAssentosDisponiveis(List<Integer> assentosDisponiveis) {
		this.assentosDisponiveis = assentosDisponiveis;
	}

	
}
