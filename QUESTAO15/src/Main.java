
public class Main {

	public static void main(String[] args) {
		
		Agenda agenda = new Agenda();
	   
		Pessoa pes= new Pessoa("gabrielly", 20, "feminino", "87676567","ääaa@gmail.com");
	   

	   agenda.armazenaPessoa(pes);
	   
	    agenda.imprimeAgenda();
	    
     agenda.removePessoa("gabrielly");
     
	    agenda.imprimeAgenda();
	 

	}

}
