
public class Main {

	public static void main(String[] args) {
		
		 Data dat = new Data(20, 02, 2002);
		  Data dat2 = new Data(17, 10, 2022);
		  
		  System.out.println(   dat.compara(dat2));

		    System.out.println( dat.isBissexto());
		   
		   System.out.println(dat.getMesExtenso());
		    
		    dat.clone();
		    
		    System.out.println(dat.getDia());

	}

}
