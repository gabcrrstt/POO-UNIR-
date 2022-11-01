
public class Aluno {
	private float nota1, nota2, trabalho;
	private float media, notaRepo;
	private double w1=0.4,w2=0.4,w3=0.2;

	public Aluno() {
		
		
	}
	
	public float calcularMedia() {
		float media =0;
		
		media = (float) (nota1*w1+nota2 *w2+trabalho*w3);
		
		return media;
	}
	
	public float calcularNotaRepositiva() {
		float valorNota=0;
		
		if (this.nota1 <= this.nota2) {
			valorNota = (float) ((this.nota2 * this.trabalho * w3-this.nota1)/w1);
			 System.out.println("nota calculada: %.3f"+valorNota);
			//valorNota = quantoFalta(this.nota1,this.nota2,this.trabalho);
		}else {
			
			//valorNota = quantoFalta(this.nota1,this.nota2,this.trabalho);
		}
		return valorNota;
	}
	/*public float quantoFalta(float nota1,float nota2, float media) {
		
	}*/
		
	
	public Aluno(float nota1, float nota2, float trabalho) {
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.trabalho = trabalho;
	}

	public float getNota1() {
		return nota1;
	}

	public void setNota1(float nota1) {
		this.nota1 = nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}

	public float getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(float trabalho) {
		this.trabalho = trabalho;
	}
	public float getMedia() {
		this.calcularMedia();
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	@Override
	public String toString() {		
		String temp ="nota1 ="+this.nota1
				+"nota 2 ="+ this.nota2
				+ "trabalho ="+this.trabalho
				+"media ="+this.calcularMedia();
		
		if(this.media >= 6.0 ) {
			float valorTemp = this.calcularNotaRepositiva();
			temp += String.format("\nrepositiva: %.1f", valorTemp);
			if(valorTemp > 10) {
				temp +="\naluno reprovara";
			}
		}else {
			temp+="\nrepositiva nao aplicavel";
		}
		return temp;
	}

}
