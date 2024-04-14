import java.util.Random;
 
public class JogoV1 {
    public static void main(String[] args) throws Exception{
        var jogadorUm = new Personagem(10,10,10);
        var gerador = new Random();
 
        jogadorUm.nome = "Danilo";
        
        System.out.println("\n\n\n\nJoguinho de Sobrevivencia\n\n");
        while(!jogadorUm.estarSemEnergia()){
            System.out.println("Acao do Jogador: ");
            int oQueFazer = gerador.nextInt(3);
            switch(oQueFazer){
                case 0:
                    jogadorUm.comer();
                    break;
 
                case 1:
                    jogadorUm.dormir();
                    break;
 
                case 2:
                    jogadorUm.cacar();
                    break;
            }

            System.out.println("\nStatus do Jogador: ");
            System.out.println(jogadorUm);
            System.out.println("\n\n\n\n\n\n\n");
 
            Thread.sleep(5000);
        }    
       
        if(jogadorUm.estarSemEnergia()){
            System.out.printf(">>>> %s morreu de fadiga <<<<\n\n\n", jogadorUm.nome);
        }
    }
}
 
 