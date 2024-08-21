import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Mao mao=new Mao();
        System.out.println(Arrays.toString(mao.getMao().toArray()));
    }
    public static void Menu(){
        Scanner sc=new Scanner(System.in);
        int x=0;
        while(x!=5){
            System.out.println("Nova Rodada:");
            System.out.println("(1) Olhar carta de cima");
            System.out.println("(2) Comprar carta de cima");
            System.out.println("(3) Comprar carta de baixo");
            System.out.println("(4) Trocar carta <n> por <m>");
            System.out.println("(5) Descartar carta <n>");
            System.out.println("(6) Verificar vitória");
            System.out.println("(7) Desistir");
            x=Integer.parseInt(sc.nextLine());
            switch (x) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Numero invalido.");
                    break;
            }
        }
        sc.close();
    }
}
