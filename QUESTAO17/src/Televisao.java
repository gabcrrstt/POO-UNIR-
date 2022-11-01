
public class Televisao {
	
	private int volume, canal;

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public Televisao() {
		
	}
	

	public Televisao(int volume, int canal) {
		super();
		this.volume = volume;
		this.canal = canal;
	}

	@Override
	public String toString() {
		return "Televisao [volume=" + volume + ", canal=" + canal + "]";
	}
	
	
}
