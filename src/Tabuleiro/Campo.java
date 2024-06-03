package Tabuleiro;

public class Campo {
    private int linhas;
    private int colunas;
    private Pecas[][] pecas;

    public Campo(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        pecas=new Pecas[linhas][colunas];
    }

    public int linhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public  int colunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
    public Pecas pecas(int linhas,int colunas){
        return pecas[linhas][colunas];
    }
    public Pecas pecas(Posicao posicao){
        return pecas [posicao.linhas()][posicao.colunas()];
    }
}
