import java.util.Random;
public class Deck {
    //int random=(int)(Math.random()*52);
    private Carta[] cartas = new Carta[52]; 
    public Deck(){
        int index = 0;
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
    public Carta olhaDeCima(){
        int num=51;
        Carta c=null;
        while(cartas[num]==null){
            num--;
        }
        c=cartas[num];
        return c;
    }

    public void embaralha(){
        Carta aux = new Carta(null, null);
        System.out.printf("Embaralhando...");
        Random rn = new Random();
        for(int i=0;i<cartas.length;i++){
            int randomN = rn.nextInt(cartas.length);
            aux = cartas[i];
            cartas[i] = cartas[randomN];
            cartas[randomN] = aux;
        }
    }
}

