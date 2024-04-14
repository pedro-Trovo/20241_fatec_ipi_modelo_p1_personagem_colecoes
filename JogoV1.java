import java.util.Random;
 
public class JogoV1 {
    public static void main(String[] args) throws Exception{
        var jogadorUm = new Personagem(10,10,10);
        var jogadorDois = new Personagem(4,4,4);
        var gerador = new Random();

        int rodada = 1;
 
        jogadorUm.nome = "Danilo";
        jogadorDois.nome = "Shakelle";
        
        System.out.println("\n\n\n\nJoguinho de Sobrevivencia\n\n");
        while(!jogadorUm.estarSemEnergia() && !jogadorDois.estarSemEnergia()){
            System.out.printf("\n\n------------------------------------------------------------------------------\n\n");
            System.out.printf(">->-> RODADA #%d <-<-<\n\n\n", rodada);

            System.out.println("Acao do Jogador Um: ");
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

            System.out.println("\nStatus do Jogador Um: ");
            System.out.println(jogadorUm);



            System.out.println("\n\n\n");
            Thread.sleep(1500);



            System.out.println("Acao do Jogador Dois: ");
            oQueFazer = gerador.nextInt(3);
            switch(oQueFazer){
                case 0:
                    jogadorDois.comer();
                    break;
 
                case 1:
                    jogadorDois.dormir();
                    break;
 
                case 2:
                    jogadorDois.cacar();
                    break;
            }
            
            System.out.println("\nStatus do Jogador Dois: ");
            System.out.println(jogadorDois);
            System.out.printf("\n\n------------------------------------------------------------------------------\n\n");
            System.out.println("\n\n\n\n\n");


            Thread.sleep(3000);

            rodada++;
        }    
       
        if(jogadorUm.estarSemEnergia()){
            System.out.printf(">>>> %s morreu de fadiga <<<<\n\n\n", jogadorUm.nome);
        }

        if(jogadorDois.estarSemEnergia()){
            System.out.printf(">>>> %s morreu de fadiga <<<<\n\n\n", jogadorDois.nome);
        }
    }
}
 
 