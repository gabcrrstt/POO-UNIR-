
public class Assalariado  extends Empregado {
     private double salarioMensal;
     private double descontos;
    
    @Override 
    public double calculaSalario(){
    	return this.getSalarioMensal() - this.getDescontos();
    }
    public Assalariado() {
 		super();
 		this.salarioMensal = 0.0;
 		this.descontos = 0.0;
 	} 
    public Assalariado(String nome, String ndepto, double salarioMensal, double descontos) {
		super(nome,ndepto);
		this.salarioMensal = salarioMensal;
		this.descontos = descontos;
	} 
    @Override
	public String toString() {
		return "Assalariado "+ super.toString()+ 
				"[salarioMensal=" + salarioMensal + ", descontos="+ descontos+ "]";
	}    
    public double getSalarioMensal() {
		return salarioMensal;
	}
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	public double getDescontos() {
		return descontos;
	}
	public void setDescontos(double descontos) {
		this.descontos = descontos;
	}     
}
