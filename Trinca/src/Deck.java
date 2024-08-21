public class Deck {
    private Carta[] cartas = new Carta[54]; 
    public Deck(){
        int index = 0;
        Naipe naipe = null;
        Valor valor;
        for(int i=0;i<4;i++){
            switch(i){
                case 0: naipe=Naipe.COPAS;break;
                case 1: naipe=Naipe.ESPADAS;break;
                case 2: naipe=Naipe.OUROS;break;
                case 3: naipe=Naipe.PAUS;break;
                default: break;
            }
            for(Valor value : Valor.values()){
                cartas[index]=new Carta(naipe, value);
                index++;
            }
        }
    }

    public void insereEmCima(Carta carta){}
    public Carta retiraDeBaixo(){return null;};
    public Carta retiraDeCima(){return null;};
    public Carta olhaDeCima(){return null;};
}

