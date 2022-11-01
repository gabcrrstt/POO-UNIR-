import java.util.Calendar;
import java.util.Date;

public class Pessoa extends Data { 
	private String nome= "gabrielly"; 
	private Double altura = 1.75; 
	private int dataNasc;

	public Pessoa(short ano, byte mes, byte dia) {
		super(ano, mes, dia);
		// TODO Auto-generated constructor stub
	}

	public Pessoa() {
		
	}

	public Pessoa(String string, float f, Data minhaDat) {
		// TODO Auto-generated constructor stub
	}

	public static int calcularIdade() {
		int idade =0;
		
		Data dataAtual = new Data(
				(short) 2022, (byte)16,(byte) 10);
		
		return idade;
		
		//System.out.println(dataAtual.toString());
		
		/*idade = (int) dataAtual.getAno() - 
				(int) this.dataNasc.getAno();
		
		
		if(dataAtual.getMes()<= dataNasc.getMes()) {
			idade = idade -1;
			
			if(dataAtual.getDia() <= dataNasc.getDia()) {
				idade = idade+1;
			}
			idade = idade -1;
		}else {
			//ja fez aniversario
			
		}
		
	    return idade;
	} */
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public int getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}


	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", dataNasc=" + getDataNasc() + ", altura=" + altura 
				+  "idade" + Pessoa.calcularIdade() + super.toString();
	}

	
}
