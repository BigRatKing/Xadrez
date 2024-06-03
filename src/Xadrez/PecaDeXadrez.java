package Xadrez;

import Tabuleiro.Campo;
import Tabuleiro.Pecas;

public class PecaDeXadrez extends Pecas {
    private Cores cores;

    public PecaDeXadrez(Campo campo,Cores cores) {
        super(campo);
        this.cores=cores;
    }

    public Cores cores() {
        return cores;
    }
}
