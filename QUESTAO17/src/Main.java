
public class Main {

	public static void main(String[] args) {
		ControleRemoto cr = new ControleRemoto();
		
		cr.imprimirStatus();
		
		cr.aumentarVolume();
		cr.imprimirStatus();
		
		cr.diminuirVolume();
		cr.imprimirStatus();
		
		cr.aumentarCanal();
		cr.imprimirStatus();
		
		cr.diminuirCanal();
		cr.imprimirStatus();
		
		cr.alterarCanal(10);
		cr.imprimirStatus();
		//System.out.println();

	}

}
