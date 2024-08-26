import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Mao mao=new Mao();
        Deck deck=new Deck();
        deck.embaralha();
        mao.criarMao(deck);
        Menu(mao,deck);
    }
    public static void Menu(Mao mao,Deck deck){
        Scanner sc=new Scanner(System.in);
        int x=0;
        int rodada = 0;
        boolean game = true;
        while(game){
            rodada++;
            System.out.println("Nova Rodada:");
            System.out.println("(1) Comprar carta de cima");
            System.out.println("(2) Comprar carta de baixo");
            System.out.println("(3) Trocar carta <n> por <m>");
            System.out.println("(4) Descartar carta <n>");
            System.out.println("(5) Verificar vitória");
            System.out.println("(6) Desistir");
            x=Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    mao.compraCartaCima(deck);
                    break;
                case 2:
                    mao.compraCartaBaixo(deck);
                    break;
                case 3:
                    System.out.println(mao+"\nQuais os indices das cartas gostaria de trocar de lugar? \n");
                    int y = Integer.parseInt(sc.nextLine())-1;
                    int z = Integer.parseInt(sc.nextLine())-1;
                    mao.organizaMao(y, z);
                    System.out.println(mao);

                    break;
                case 4:
                    System.out.println(mao+"\nQual e o indice da carta gostaria de descartar? \n");
                    int ind = Integer.parseInt(sc.nextLine())-1;
                    mao.devolveCartaCima(ind,deck);
                    //deck.embaralha();
                    break;
                case 5:
                    if(mao.verificaVitoria()){
                        System.out.println("Voce ganhou em "+rodada+" rodadas!");
                        game = false;
                        break;
                    }
                    System.out.println("Voce ainda nao ganhou");
                    break;
                case 6:
                    System.out.println("Que pena! Voce jogou "+rodada+" rodadas.");
                    game = false;
                    break;
                default:
                    System.out.println("Numero invalido.");
                    break;
            }
        }
        sc.close();
    }
}
