import java.util.ArrayList;
import java.util.List;

public class Voo extends Assento {
		
	private List<Assento> lista  = new ArrayList<Assento>();
	private int numeroVoo;
	private Data data;
	
	public Voo() {
		
	}
	
	
	@Override
	public String toString() {
		return "Voo [lista=" + lista + ", numeroVoo=" + numeroVoo + ", data=" + data + "]";
	}


	public Voo(List<Assento> l, int nV,Data d) {
		this.lista =l;
		this.numeroVoo=nV;
		this.data=d;
		
	}
	public Voo clone() {
		Voo v = new Voo(this.lista, this.numeroVoo,this.data);
		return v;
	}
	
	public int vaga() {
		int vaga =0;
		
		for(int i=0; i< lista.size();i++) {
			if(lista.get(i).isVaga()) {
				vaga = vaga +1;
				
			}
		}
		return vaga;
	}
	public boolean ocupa(int numero) {
		if(numero > 20) {
			System.out.println("vaga n existe");
			return false;
		}else {
		if(verifica(numero)) {
			System.out.println("cadeira ocupada");
			return false;
		}else {
			lista.get(numero-1).setVaga(false);
			return true;
			}
		}
	}
	
	public boolean verifica(int numero) {
		return lista.get(numero-1).isVaga();
	}
	
	/*
	 * busca se tem assento disponivel
	 */
	
	public int proximoLivre() {
		int livreIdx = -1;
		int numero = 0;
		
		if(numero > 20) {
			System.out.println("vaga n existe");
		}else {
		for(int i=0; i<this.lista.size();i++) {
			if(lista.get(i).isVaga() == true) {
				return livreIdx=i;
				}
			}
		
		}
		return livreIdx;
	}	
	
}
