import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Menu();
    }
    public static void Menu(){
        Scanner sc=new Scanner(System.in);
        int x=0;
        while(x!=5){
            System.out.println("Nova Rodada:");
            System.out.println("(1) Comprar carta");
            System.out.println("(2) Trocar carta <n> por <m>");
            System.out.println("(3) Descartar carta <n>");
            System.out.println("(4) Verificar vitória");
            System.out.println("(5) Desistir");
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
                default:
                    System.out.println("Numero invalido.");
                    break;
            }
        }
    }
}
