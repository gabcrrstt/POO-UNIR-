
	//Gabrielly Cristine A. Rodrigues
public class Comissionado extends Empregado{

	private double BrutoVendas;
	private double TaxaComissao;
	private double Bonus;


	public Comissionado(String nome, String nomeDepto, double brutoVendas, double taxaComissao, double bonus) {
		super(nome, nomeDepto);
		BrutoVendas = brutoVendas;
		TaxaComissao = taxaComissao;
		Bonus = bonus;
	}

	public Comissionado(){

	}

	@Override
	public double calculaSalario() {
		return(BrutoVendas * TaxaComissao *Bonus);
		
	}

	public double getBrutoVendas() {
	return BrutoVendas;
	}
	public void setBrutoVendas(double brutoVendas) {
	BrutoVendas = brutoVendas;
	}
	public double getTaxaComissao() {
	return TaxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
	TaxaComissao = taxaComissao;
	}
	public double getBonus() {
	return Bonus;
	}
	public void setBonus(double bonus) {
	Bonus = bonus;
	}
	
	public String toString() {
	return "Comissionado [ " +super.toString() + "BrutoVendas="+ BrutoVendas + ", TaxaComissao=" + TaxaComissao + ", Bonus=" + Bonus
	+ "]";
	
	}
}

