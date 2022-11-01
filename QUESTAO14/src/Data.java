
public class Data {
	private int dia=10, mes=2, ano=2000;

	public Data(int dia, int mes, int ano) {
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
	public int compara(Data data) {
	    if (this.ano > data.getAno()) {
	      return 1;
	    } else if (this.ano < data.getAno()) {
	      return -1;
	    } else {
	      if (this.mes > data.getMes()) {
	        return 1;
	      } else if (this.mes < data.getMes()) {
	        return -1;
	      } else {
	        if (this.dia > data.getDia()) {
	          return 1;
	        } else if (this.dia < data.getDia()) {
	          return -1;
	        } else {
	          return 0;
	        }
	      }
	    }
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

	public void setDia(int dia) {

		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
	
		this.mes = mes;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	public boolean isBissexto() {
	    if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
	      return true;
	    } else {
	      return false;
	    }
	  }

	  public String getMesExtenso() {
	    String mesExtenso = "";
	    switch (mes) {
	      case 1:
	        mesExtenso = "Janeiro";
	        break;
	      case 2:
	        mesExtenso = "Fevereiro";
	        break;
	      case 3:
	        mesExtenso = "Março";
	        break;
	      case 4:
	        mesExtenso = "Abril";
	        break;
	      case 5:
	        mesExtenso = "Maio";
	        break;
	      case 6:
	        mesExtenso = "Junho";
	        break;
	      case 7:
	        mesExtenso = "Julho";
	        break;
	      case 8:
	        mesExtenso = "Agosto";
	        break;
	      case 9:
	        mesExtenso = "Setembro";
	        break;
	      case 10:
	        mesExtenso = "Outubro";
	        break;
	      case 11:
	        mesExtenso = "Novembro";
	        break;
	      case 12:
	        mesExtenso = "Dezembro";
	        break;
	    }
	    return mesExtenso;
	  }
	  
	  public Data clone() {
	    return new Data(this.dia, this.mes, this.ano);
	  }

	}