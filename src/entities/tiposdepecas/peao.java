package entities.tiposdepecas;

import entities.peca;
import entities.position;

public class peao extends peca {
    public peao(position posicao, char tipo) {
        super(posicao, tipo);
    }

    @Override
    public boolean verificador(position posicao) {
        if (posicao.posy)
    }
}
