import java.util.Random;
public class Deck {
    //int random=(int)(Math.random()*52);
    private Carta[] cartas = new Carta[52]; 
    private int index;
    public Deck(){
        index = 0;
        for(Naipe naipe: Naipe.values()){
            for(Valor value : Valor.values()){
                cartas[index]=new Carta(naipe, value);
                index++;
            }
        }
    }
    public Carta[] getDeck(){return cartas;}
    public void insereEmCima(Carta carta){
        int num=51;
        while(cartas[num]==null){
            num--;
        }
        num++;
        cartas[num]=carta;
    }
    public Carta retiraDeBaixo(){
        int num=0;
        Carta c=null;
        while(cartas[num]==null){
            num++;
        }
        c=cartas[num];
        cartas[num]=null;
        int temp=cartas.length-1;
        for(int i=0;i<temp-1;i++){
            cartas[i]=cartas[i+1];
        }
        cartas[temp]=null;
        index--;
        return c;
    }
    public Carta retiraDeCima(){
        int num=51;
        Carta c=null;
        while(cartas[num]==null){
            num--;
        }
        c=cartas[num];
        cartas[num]=null;
        return c;
    }

    public void embaralha(){
        Carta aux = new Carta(null, null);
        System.out.printf("Embaralhando...\n");
        Random rn = new Random();
        for(int i=0;i<cartas.length;i++){
            int randomN = rn.nextInt(cartas.length);
            aux = cartas[i];
            cartas[i] = cartas[randomN];
            cartas[randomN] = aux;
        }
    }
}

