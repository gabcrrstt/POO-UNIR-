
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class TelaGrafica extends JFrame {
	ArrayList <Empregado> lista = new ArrayList <Empregado>();
	

	Horista h;
	h = new Horista("Joao","contabilidade",100, 150.00);
	lista.add(h);
	
	// lista[0] = new Horista("Joao", "contabi", 100, 150.00);
	
	
	lista[1] = new Comissionado(.....);
	lista[2] = new Assalariado(....);
	lista[3] = new AssalariadoComissionado(.....);
	
	String saida="";
	int i;
    for (i=0;i<lista.size();i++){
          saida += lista.get(i).toString()+
	               "  Salario:"+lista.get(i).calculaSalario()+"\n\n";
     }

}
