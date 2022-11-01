import java.util.ArrayList;
import javax.swing.*;

public class Menu {
	public static void main(String[] args) {
		ArrayList <Empregado> lista = new ArrayList <Empregado>();
		String nome, nomedepto, salmensal,desconto;
		String hstrab,valorHora;
		String opcao,saida;
	    char opte='0';
	    int ihstrab;
		double dsalario,ddesconto,dvalorHora;
		Assalariado a;
		Horista h;
		while (opte!='7'){
			opcao= JOptionPane.showInputDialog(null,
			   "\n1 - Insere um assalariado"+
		       "\n2 - Insere um horista"+
			   "\n3 - Insere um comissionado"+
			   "\n4 - Exibe todos os empregados"+
			   "\n5 - Exibe somente os assalariados"+
			   "\n6 - Exibe somente os horistas"+
			   "\n7 - Sair");
			opte=opcao.charAt(0);
			switch(opte){
			case '1':nome = JOptionPane.showInputDialog(null,"Entre com o nome:");
			         nomedepto = JOptionPane.showInputDialog(null,"Entre com o depto:");
			         salmensal = JOptionPane.showInputDialog(null,"Entre com o salario Mensal:");
			         dsalario = Double.parseDouble(salmensal);
			         desconto = JOptionPane.showInputDialog(null,"Entre com o desconto:");
			         ddesconto = Double.parseDouble(desconto);
			         a = new Assalariado(nome,nomedepto,dsalario,ddesconto);
			         lista.add(a);
			         saida=a.toString()+String.format("  Salario Mensalista: $%5.2f",a.calculaSalario());
			         JOptionPane.showMessageDialog(null,saida);
			         break;
			case '2':nome = JOptionPane.showInputDialog(null,"Entre com o nome:");
	                 nomedepto = JOptionPane.showInputDialog(null,"Entre com o depto:");
	                 hstrab = JOptionPane.showInputDialog(null,"Entre com qtdade hs trabalhadas:");
	                 ihstrab = Integer.parseInt(hstrab);
	                 valorHora = JOptionPane.showInputDialog(null,"Entre com o valor hora $:");
			         dvalorHora = Double.parseDouble(valorHora);
			         h = new Horista(nome,nomedepto,ihstrab,dvalorHora);
			         lista.add(h);
			         saida=h.toString()+String.format("  Salario Mensalista: $ %.2f",h.calculaSalario());
			         JOptionPane.showMessageDialog(null,saida);
			case '3': // trabalho
				      break;
			case '4': saida="\nExibe Todos Empregados\n";
			          int i;
		              for (i=0;i<lista.size();i++)
		                    saida += lista.get(i).toString()+
			               "  Salario:"+lista.get(i).calculaSalario()+"\n\n";
		              JOptionPane.showMessageDialog(null, saida);
		              break;
		    case '5': saida="\nExibe somente Assalariados\n";
                      for (Empregado emp:lista){
              				if (emp instanceof Assalariado){
                               saida += emp.toString()+
	                            "  Salario $"+emp.calculaSalario()+"\n\n";}
                      }
                      JOptionPane.showMessageDialog(null, saida);
                      break;  
            case '6': saida="\nExibe somente Horistas\n";
                      for (Empregado emp:lista){
              				if (emp instanceof Horista){
                               saida += emp.toString()+
	                            "  Salario $:"+emp.calculaSalario()+"\n\n";}
                      }
                      JOptionPane.showMessageDialog(null, saida);
                      break;           
			}//switch
		}//while
	}//main
}//class
