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
		double dsalario,ddesconto,dvalorHora, brutovend,taxaCom,bonus;
		Assalariado a;
		Horista h;
		Comissionado c;
		while (opte!='3'){
			opcao= JOptionPane.showInputDialog(null,
			   "\n1 - Insere um assalariado"+
		       "\n2 - Insere um horista"+
			   "\n3 - Insere um comissionado"+
			   "\n4 - Exibe todos os empregados"+
			   "\n5 - Sair");
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

			case '3': nome = JOptionPane.showInputDialog(null,"Entre com o nome:");
	                 nomedepto = JOptionPane.showInputDialog(null,"Entre com o depto:");
	                 brutovend = JOptionPane.showInputDialog(null,"Entre com o bruto das vendas");
	                 taxaCom = JOptionPane.showInputDialog(null,"Entre com a taxa de  comissao");
					 bonus = JOptionPane.showInputDialog(null,"Entre com o bonus");
			         c = new Comissionado(nome,nomedepto,brutovend,taxaCom,bonus);
			         lista.add(c);
			         saida=c.toString()+String.format("  Salario Mensalista: $ %.2f",c.calculaSalario());
			         JOptionPane.showMessageDialog(null,saida);
				      break;

			case '4': saida="\nExibe Todos Empregados\n";
			          int i;
		              for (i=0;i<lista.size();i++)
		                    saida += lista.get(i).toString()+
			               "  Salario:"+lista.get(i).calculaSalario()+"\n\n";
		              JOptionPane.showMessageDialog(null, saida);
		              break; 

			}//switch
		}//while
	}//main
}//class
