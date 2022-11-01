/*
 * 
 */
public class Lampada {
	
	private byte estado;
	private String tipo, marca= "lg", potencia,cor;
	
	public Lampada() {
		this.apaga();
	}
	
	public Lampada(String p, String c) {
		this.marca ="lg";
		this.potencia =p;
		this.cor=c;
	}
	
	private String estadoAsString() {
		String temp = "";
		
		if(this.estado==0) {
			temp ="apagada";
		} else if (this.estado==1){
			temp = "meia luz";
		}else if (this.estado==2) {
			temp = "acessa";
		}		
		return temp;
	}	

	private void ImprimirEstado() {
		System.out.println("estado eh "+ this.estadoAsString());
	}
	
	public void apaga() {
		this.estado=0;
	}
	public void acende() {
		this.estado=1;
	}

	@Override
	public String toString() {
		return "Lampada [estado=" + estado + "]";
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public byte getEstado() {
		return estado;
	}

	public void setEstado(byte estado) {
		this.estado = estado;
	}
	
	
	

}
