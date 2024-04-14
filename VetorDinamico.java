import java.util.Arrays;

public class VetorDinamico {
  private int qtde;
  private int cap;
  private String [] elementos;
  private static final int CAP_MINIMA = 4;


  VetorDinamico(){
    cap = CAP_MINIMA;
    qtde = 4;
    elementos = new String[CAP_MINIMA];

    elementos[0] = "Javali selvagem";
    elementos[1] = "Amora";
    elementos[2] = "Batata frita";
    elementos[3] = "Laranja";
  }

  VetorDinamico(int capMinima){
    double aux = capMinima;
    while (aux >= 2)
      aux /= 2;
    cap = aux == 1 && capMinima > 3 ? capMinima : CAP_MINIMA;

    qtde = 4;

    elementos = new String[cap];

    elementos[0] = "Javali selvagem";
    elementos[1] = "Amora";
    elementos[2] = "Batata frita";
    elementos[3] = "Laranja";
  }





  void adicionar(String elemento){
    if(estaCheio())redimensionar();
    elementos[qtde] = elemento;
    qtde++;
  }


  boolean estaCheio(){
    return qtde == cap;
  }


  private void redimensionar(){
    String [] aux = new String[cap * 2];
    for(int i = 0; i < cap; i++){
      aux[i] = elementos[i];
    }
    cap *= 2;

    elementos = aux;
  }

  




  void adicionarSemRepeticao(String e){
    if(!existe(e)) adicionar(e);
  }


  boolean existe(String e){
    for (int i = 0; i < qtde; i++)
      if (e == elementos[i])
        return true;
    return false;
  }

  int tamanho(){
    return qtde;
  }







  // void removerNoFinal(){

  // }

  // boolean estaVazio(){

  // }

  // boolean estaUmQuartoCheio(){
    
  // }

  // void reduzirTamanho(){

  // }






  String [] getElementos(){
    return Arrays.copyOf(elementos, cap);
  }






  public String toString(){
    StringBuilder sb = new StringBuilder("");
    sb.append("Qtde: ").append(qtde);
    sb.append("\n");
    sb.append("Cap: ").append(cap);
    sb.append(qtde > 0 ? "\nElementos: " : "");
    for (int i = 0; i < qtde; i++){
      sb.append(elementos[i]).append(" ");
    }
    return sb.toString();
  }
}
