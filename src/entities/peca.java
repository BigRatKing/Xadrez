package entities;

public abstract class peca {
    protected position posicao;
    protected char tipo;
    protected int vida;

    public peca(position posicao, char tipo) {
        this.posicao = posicao;
        this.tipo = tipo;
        this.vida = 1;
    }

    public void movimento(int poxfinal, int posyfinal, boolean verificador){
        if (verificador) {
            posicao.posx = poxfinal;
            posicao.posy = posyfinal;
        }
    }
    public abstract boolean verificador();

    public abstract boolean verificador(position posicao);
}
