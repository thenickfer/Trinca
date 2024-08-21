import java.util.ArrayList;

public class Mao {
    private ArrayList<Carta> mao;
    private Deck deck;
    public Mao(){
        deck=new Deck();
        mao=new ArrayList<>();
        for(int i=0;i<9;i++){
            mao.add(deck.retiraDeBaixo());
        }
    }
    public ArrayList<Carta> getMao(){return mao;}
    public void compraCartaCima(){
        mao.add(deck.retiraDeCima());
    }
    public void compraCartaBaixo(){
        mao.add(deck.retiraDeBaixo());
    }
    public void organizaMao(int x,int y){
        Carta aux=mao.get(x);
        mao.add(x,mao.get(y));
        mao.add(y,aux);
    }
    public void devolveCartaCima(int num){
        mao.remove(num);
        //n usar metodo insere em cima pq quando for retirar outra vai ser a msm
        //ou toda vez que devolver uma, embaralha o deck
    }
    public boolean comparaNaipe(int x){
        return (mao.get(x).naipe==mao.get(x+1).naipe)&&(mao.get(x).naipe==mao.get(x+2).naipe);
    }
    public boolean verificaOrdem(int x){
        return (mao.get(x).getValor().getValorV()==mao.get(x+1).getValor().getValorV()+1)&&(mao.get(x).getValor().getValorV()==mao.get(x+2).getValor().getValorV()+2);
    }
    public boolean verificaVitoria(){
        boolean pt1=true; 
        boolean pt2=true; 
        boolean pt3=true;
        if(comparaNaipe(0)&&verificaOrdem(0)){pt1=true;}
        else{pt1=false;}
        if(comparaNaipe(3)&&verificaOrdem(3)){pt2=true;}
        else{pt2=false;}
        if(comparaNaipe(6)&&verificaOrdem(6)){pt3=true;}
        else{pt3=false;}
        return pt1&&pt2&&pt3;
    }
}
