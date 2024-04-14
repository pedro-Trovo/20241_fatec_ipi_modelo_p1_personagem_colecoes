import java.util.Random;
 
public class JogoV1 {
    public static void main(String[] args) throws Exception{
        var jogadorUm = new Personagem();
        var jogadorDois = new Personagem(10, 5, 2, 16, "Pirarucu", "Pato no tucupi", "Pe de moleque", "Tucunare");
        var gerador = new Random();

        Personagem vencedor, perdedor;

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
            Thread.sleep(600);



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



            Thread.sleep(800);
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


            Thread.sleep(3000);

            rodada++;
        }





        if(jogadorUm.estarSemEnergia() && jogadorDois.estarSemEnergia()){
            System.out.printf("\t\tINFELIZMENTE AMBOS OS JOGADORES MORRERAM\n\n\n\n\n");
            return;
        }

        else if(!jogadorUm.estarSemEnergia()){
            vencedor = jogadorUm;
            perdedor = jogadorDois;
        }
        else{
            vencedor = jogadorDois;
            perdedor = jogadorUm;
        }


        System.out.printf("\t\t>>>> %s morreu de fadiga <<<<\n\n\n", perdedor.nome);
        System.out.printf("\t\tO GRANDE CAMPEAO EH %s\n\n", vencedor.nome);
        System.out.println("\n\n\n");
        

        while(!vencedor.estarSemEnergia()){
            System.out.printf("\n\n------------------------------------------------------------------------------\n\n");
            System.out.printf(">->-> RODADA #%d <-<-<\n\n\n", rodada);


            int oQueFazer = gerador.nextInt(3);
            System.out.println("Acao do Jogador Vencedor: ");
            oQueFazer = gerador.nextInt(3);
            switch(oQueFazer){
                case 0:
                    vencedor.comer();
                    break;

                case 1:
                    vencedor.dormir();
                    break;

                case 2:
                    vencedor.cacar();
                    break;
            }
            
            System.out.println("\nStatus do Jogador Vencedor: ");
            System.out.println(vencedor);

            Thread.sleep(1500);

            rodada++;
        }

        System.out.printf("\n\n\n\n\n\n\t\t>>>> %s morreu de fadiga <<<<\n\n\n", vencedor.nome);



        System.out.printf("\n\n\n\n\n--- --- --- Fim de Jogo. Todo mundo morreu! Total de rodadas: %d --- --- ---\n\n\n\n", rodada-1);
    }
}
 
 