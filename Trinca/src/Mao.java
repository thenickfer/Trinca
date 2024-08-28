import java.util.ArrayList;

public class Mao {
    private ArrayList<Carta> mao;
    public Mao(){
        mao=new ArrayList<>();
    }
    public void criarMao(Deck deck){
        for(int i=0;i<9;i++){
            mao.add(deck.retiraDeBaixo());
        }
    }
    public ArrayList<Carta> getMao(){return mao;}
    public void compraCartaCima(Deck deck){
        Carta temp = deck.retiraDeCima();
        mao.add(temp);
        System.out.println("Voce pegou a carta: \n"+temp);
    }
    public void compraCartaBaixo(Deck deck){
        Carta temp = deck.retiraDeBaixo();
        mao.add(temp);
        System.out.println("Voce pegou a carta: \n"+temp);
    }
    public void organizaMao(int x,int y){
        if((x<1||x>9)||(y<1||y>9)||x==y){
            throw new IndexOutOfBoundsException("Numero Invalido");
        }
        Carta aux=mao.get(x);
        mao.set(x,mao.get(y));
        mao.set(y,aux);
    }
    public Carta devolveCartaCima(int num,Deck deck){
        Carta c=mao.get(num);
        mao.remove(num);
        deck.insereEmCima(c);
        return c;
    }
    public boolean comparaNaipe(int x){
        return (mao.get(x).naipe==mao.get(x+1).naipe)&&(mao.get(x).naipe==mao.get(x+2).naipe);
    }
    public boolean verificaOrdem(int x){
        int um=mao.get(x).getValor();
        int dois=mao.get(x+1).getValor();
        int tres=mao.get(x+2).getValor();
        return (um+1==dois)&&(um+2==tres);
    }
    public boolean verificaVitoria(){
        boolean pt1=true; 
        boolean pt2=true; 
        boolean pt3=true;
        if(comparaNaipe(0)&&verificaOrdem(0)){System.out.println("Primeiro conjunto certo");}
        else{pt1=false;}
        if(comparaNaipe(3)&&verificaOrdem(3)){System.out.println("Segundo conjunto certo");}
        else{pt2=false;}
        if(comparaNaipe(6)&&verificaOrdem(6)){System.out.println("Terceiro conjunto certo");}
        else{pt3=false;}
        return pt1&&pt2&&pt3;
    }
    @Override
    public String toString(){
        StringBuffer a=new StringBuffer();
        int ind=1;
        for(Carta card : mao){
            a.append(ind);
            a.append(card.toString());
            a.append("\n");
            ind++;
        }
        return a.toString();
    }
}
