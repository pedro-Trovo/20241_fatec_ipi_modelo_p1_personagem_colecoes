import java.util.Random;
 
public class JogoV1 {
    public static void main(String[] args) throws Exception{
        var jogadorUm = new Personagem(10,10,10);
        var jogadorDois = new Personagem(10,10,10);
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



            Thread.sleep(1000);
            System.out.println("\n\n\n\n");



            System.out.println("Hora da Batalha: ");
            oQueFazer = gerador.nextInt(2);
            switch(oQueFazer){
                case 0:
                    jogadorDois.energia = jogadorUm.atacar(jogadorDois.energia);
                    System.out.printf("%s ataca %s com um golpe e deixa seu inimigo com %d pt(s) de energia!", 
                                                    jogadorUm.nome, jogadorDois.nome, jogadorDois.energia);
                    break;
 
                case 1:
                    jogadorUm.energia = jogadorDois.atacar(jogadorUm.energia);
                    System.out.printf("%s ataca %s com um golpe e deixa seu inimigo com %d pt(s) de energia!", 
                                                    jogadorDois.nome, jogadorUm.nome, jogadorUm.energia);
                    break;
            }




            System.out.printf("\n\n\n------------------------------------------------------------------------------\n\n");
            System.out.println("\n\n\n\n\n");


            Thread.sleep(1200);

            rodada++;
        }





        if(jogadorUm.estarSemEnergia() && jogadorDois.estarSemEnergia()){
            System.out.printf("\t\tINFELIZMENTE AMBOS OS JOGADORES MORRERAM\n\n\n\n\n");
        }

        else if(jogadorUm.estarSemEnergia()){
            System.out.printf("\t\t>>>> %s morreu de fadiga <<<<\n\n\n", jogadorUm.nome);
            System.out.printf("\t\tO GRANDE CAMPEAO EH %s\n\n", jogadorDois.nome);
            System.out.println("\n\n\n");
            

            while(!jogadorDois.estarSemEnergia()){
                System.out.printf("\n\n------------------------------------------------------------------------------\n\n");
                System.out.printf(">->-> RODADA #%d <-<-<\n\n\n", rodada);


                int oQueFazer = gerador.nextInt(3);
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

                Thread.sleep(1000);

                rodada++;
            }

            System.out.printf("\n\n\n>>>> %s morreu de fadiga <<<<\n\n\n", jogadorDois.nome);
        }
        
        else if(jogadorDois.estarSemEnergia()){
            System.out.printf("\t\t>>>> %s morreu de fadiga <<<<\n\n\n", jogadorDois.nome);
            System.out.printf("\t\tO GRANDE CAMPEAO EH %s\n\n", jogadorUm.nome);
            System.out.println("\n\n\n");

            

            while(!jogadorUm.estarSemEnergia()){
                System.out.printf("\n\n------------------------------------------------------------------------------\n\n");
                System.out.printf(">->-> RODADA #%d <-<-<\n\n\n", rodada);


                int oQueFazer = gerador.nextInt(3);
                System.out.println("Acao do Jogador Um: ");
                oQueFazer = gerador.nextInt(3);
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

                Thread.sleep(1000);

                rodada++;
            }

            System.out.printf("\n\n\n>>>> %s morreu de fadiga <<<<\n\n\n", jogadorUm.nome);
        }



        System.out.printf("\n\n\n\n--- --- --- --- Fim de Jogo. Todo mundo morreu! --- --- --- ---\n\n\n\n");
    }
}
 
 