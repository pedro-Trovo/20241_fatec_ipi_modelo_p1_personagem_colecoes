import java.util.Random;
 
public class Personagem{

  String nome;
  int energia;
  private int fome;
  private int sono;
  VetorDinamico inventarioItems = new VetorDinamico();



  Personagem(){
    nome = null;
    energia = 10;
    fome = 0;
    sono = 0;
  }

  Personagem(int energia, int fome, int sono){
    if (energia >= 0 && energia <= 10)
      this.energia = energia;
    if (fome >= 0 && fome <= 10)
      this.fome = fome;
    if (sono >= 0 && sono <= 10)
      this.sono = sono;
  }





  void cacar(){
    if(energia > 0){
      System.out.printf("%s esta cacando...\n", nome);
      energia -= 2;
    }


    fome = Math.min(fome + 1, 10);
    sono = sono < 10 ? sono + 1 : sono;


    
    var gerador = new Random();
    int oQueFazer = gerador.nextInt(5);
           
    switch(oQueFazer){
      case 0:
        inventarioItems.adicionar("Javali selvagem");
        break;

      case 1:
        inventarioItems.adicionar("Amora");
        break;

      case 2:
        inventarioItems.adicionar("Batata Frita");
        break;

      case 3:
        inventarioItems.adicionar("Laranja");
        break;

      case 4:
        inventarioItems.adicionar("Rambutao");
        break;
    }
  }


  boolean estarSemEnergia(){
    return energia <= 0;
  }






  void comer() {
      switch(fome){
        case 0:
          System.out.printf("%s sem fome....\n", nome);
          break;
        default:
          System.out.printf("%s comendo...\n", nome);
          --fome;
          energia = (energia == 10 ? energia : energia + 1);
      }
  }






  void dormir(){
    if(sono >= 1){
      System.out.printf("%s esta dormindo...\n", nome);
      sono -= 1;
      energia = Math.min(energia + 1, 10);
    }
    else{
      System.out.printf("%s sem sono...\n", nome);
    }
  }


  




  public String toString(){
    int count=0;

    StringBuilder sb = new StringBuilder("");
    sb.append(String.format("%s: (e:%d, f:%d, s:%d)", nome, energia, fome, sono));
    sb.append("\n\n");

    sb.append(inventarioItems.tamanho() > 0 ? "Alimentos do Inventario: " : "");
    sb.append("\n  ");
    for(int i=0; i<inventarioItems.tamanho(); i++){
      sb.append(String.format("%-" + 16 + "s | ", inventarioItems.getElementos()[i]));

      if(count == 3){
        sb.append("\n  ");
        count = 0;
      }
      else{
        count++;
      }
    }

    return sb.toString();
  }
}