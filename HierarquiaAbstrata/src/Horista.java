
public class Horista  extends Empregado {
	private int horasTrabalhadas;
	private double valorHora;
	
	@Override
	public double calculaSalario(){
		return  this.horasTrabalhadas * this.valorHora;
	}
	public Horista() {
		super();
		this.horasTrabalhadas = 0;
		this.valorHora = 0.0;
	}
	public Horista(String nome, String ndepto, int horasTrabalhadas, double valorHora) {
		super(nome,ndepto);
		this.horasTrabalhadas = horasTrabalhadas;
		this.valorHora = valorHora;
	}	
    @Override
	public String toString() {
		return "Horista "+ super.toString()+ 
				"[horasTrabalhadas=" + horasTrabalhadas + ", valorHora="+ valorHora +
				"]";
	}   
    public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}
	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}    
}
