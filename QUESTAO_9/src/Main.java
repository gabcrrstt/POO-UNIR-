/*
 * gabrielly cristine
 * questao 9
 */
public class Main {

	public static void main(String[] args) {
		Data dat = new Data(20,2,2002);
		
		boolean result = dat.VemAntes(21, 3, 2010);
		boolean result2 = dat.VemDepois(21, 3, 2010);

		System.out.println("resultado\n "+dat.getDia()+dat.getMes()+dat.getAno()
		+ "<" + "21/3/2010" + "\nresposta\n" + result);
		

	}

}
