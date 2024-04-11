import java.util.Random;
 
public class JogoV1 {
    public static void main(String[] args) throws Exception{
        var jogadorUm = new Personagem(10,10,10);
        var gerador = new Random();
 
        jogadorUm.nome = "Danilo";
 
        while(!jogadorUm.estarSemEnergia()){
            int oQueFazer = gerador.nextInt(3);
           
            switch(oQueFazer){
                case 0:
                default:
                    jogadorUm.comer();
                    break;
 
                case 1:
                    jogadorUm.dormir();
                    break;
 
                case 2:
                    jogadorUm.cacar();
                    break;
            }
 
            Thread.sleep(700);
        }    
       
        if(jogadorUm.estarSemEnergia()){
            System.out.printf("%s morreu de fadiga", jogadorUm.nome);
        }
    }
}
 
 