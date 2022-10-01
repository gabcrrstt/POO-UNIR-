import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Cliente cl = new Cliente ("gabrielly", "telefone", "documento", "email","","","");
		Produto prod = new Produto (new Date(), " ", " ");
		Venda vend = new Venda (new Date(), " ", " ");
		
		
		String s = cl.toString();
		String a = prod.toString();
		String b = vend.toString();
		System.out.println(s);
		System.out.println(a);
		System.out.println(b);


	}

}
