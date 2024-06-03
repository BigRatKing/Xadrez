package Tabuleiro;

public class Pecas {
    protected Posicao pos;
    protected Campo campo;

    public Pecas(Campo campo) {
        this.campo = campo;
    }
    protected Campo getCampo(){
        return campo;
    }
}
