public enum Naipe {
    OUROS(0),
    COPAS(1),
    PAUS(2),
    ESPADAS(3);
    private int v;
    Naipe(int v) {
       this.v=v;
    }
    public int getNaipe(){return v;}
}
