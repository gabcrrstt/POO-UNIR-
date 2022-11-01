
public class Elevator {
 
  private int andarAtual = 0,totalAndares = 0, capacidade = 0, pessoasPresentes = 0;

  public Elevator() {
	  
  }

  public Elevator(int capacidade, int totalAndares) {
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
  }

  public void entra() {
    if (pessoasPresentes < capacidade) {
      pessoasPresentes++;
    }
  }

  public void sai() {
    if (pessoasPresentes > 0) {
      pessoasPresentes--;
    }
  }

  public void sobe() {
    if (andarAtual < totalAndares) {
      andarAtual++;
    }
  }

  public void desce() {
    if (andarAtual > 0) {
      andarAtual--;
    }
  }

  public int getAndarAtual() {
    return andarAtual;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public int getPessoasPresentes() {
    return pessoasPresentes;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public void setPessoasPresentes(int pessoasPresentes) {
    this.pessoasPresentes = pessoasPresentes;
  }

  @Override
  public String toString() {
    return "Elevador [andarAtual=" + andarAtual + ", capacidade=" + capacidade + ", pessoasPresentes="
        + pessoasPresentes + ", totalAndares=" + totalAndares + "]";
  }

}
