
public class ControleRemoto extends Televisao{
	
	public ControleRemoto() {
			super();
	}
	public ControleRemoto(int volume, int canal) {
		super(volume, canal);
		// TODO Auto-generated constructor stub
	}
	public void imprimirStatus() {
		System.out.println("canal: "+ getCanal()+ "volume" + getVolume()+ super.toString());
	}
	
	public void aumentarVolume() {
		this.setVolume(getVolume()+1);
	}
	public void diminuirVolume() {
		this.setVolume(getVolume()-1);
	}
	public void aumentarCanal() {
		this.setCanal(getCanal()+1);
	}
	public void diminuirCanal() {
		this.setCanal(getCanal()-1);
	}
	
	public void alterarCanal(int canal) {
		setCanal(canal);
	}

}
