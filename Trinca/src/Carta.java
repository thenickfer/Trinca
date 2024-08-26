class Carta{
    Naipe naipe;
    Valor valor;

    public Carta(Naipe naipe,Valor valor){
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public int getValor() {
        return valor.getValorV();
    }
    @Override
    public String toString() {
        //return "Carta [naipe=" + naipe + ", valor=" + valor + "]";
        //ToString pra printar a carta bonitinha, mas fica mto ruim de fazer teste;
        return ("\n"+valor.getValorV()+"--------+\n"+"|        |\n"+"|        |\n  "+naipe+"\n|        |\n"+"|        |\n"+"+--------"+valor.getValorV());
    }
}