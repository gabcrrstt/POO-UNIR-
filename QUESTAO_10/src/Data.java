import java.util.Calendar;
import java.util.Date;

public class Data {
	private short ano;
	private byte mes; 
	private byte dia;

	public Data(short ano, byte mes, byte dia) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		this.ValidarData();
	}
	
	public Data() {
		
	}

	@Override
	public String toString() {
		return "Data [dia=" + dia + ", mes=" + mes + ", ano=" + ano + "]";
	}
	
	public boolean VemAntes(int dia, int mes, int ano) {
		if(ano >= this.ano) {
			if (mes >= this.mes) {
				if (dia >= this.dia) {
					return false;
			}else {
				return true;
				}
			}
			return false;
		}
		return true;
	}
	
	public boolean VemDepois(int dia, int mes, int ano) {
		if(ano >= this.ano) {
			if (mes >= this.mes) {
				if (dia >= this.dia) {
					return true;
			}else {
				return false;
				}
			}
			return true;
		}
		return false;
	}
	
	public boolean ValidarData() {
		
		if((mes==1)||(mes==3)||(mes==5)||
                (mes==7)||(mes==8)||(mes==10)||(mes==12)){
            if(dia==31){
                return true;
            }
            else{
                return false;
            }
        }
        else{
           if((mes==4)||(mes==6)||(mes==9)||(mes==11)){
               if(dia==30){
                   return true;
               }
           }
           else{
               if(mes==2){
                   if(ano%4==0 && ano%100!=0 || ano%400==0){
                       if(dia==29){
                           return true;
                       }
                       else{
                           return false;
                       }
                   }
                   else{
                       if(dia==28){
                           return true;
                       }
                       else{
                           return false;
                       }
                   }
               }
               else{
                   return false;
               }
           }
        }
		return false;
	}
	

	public int getDia() {
		return dia;
	}

	public void setDia(byte dia) {
	
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(byte mes) {
		
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(short ano) {
		this.ano = ano;
	}
	
}
