import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		Data minhaDat = new Data(
				(short) 2022, (byte)10,(byte) 2);
		
		Pessoa pes = new Pessoa("Gabrielly", (float)1.75, minhaDat);
		
		String result = pes.toString();
		
		System.out.println(result);

	}

}
