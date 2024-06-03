package application;

import Tabuleiro.Campo;
import Tabuleiro.Posicao;
import Xadrez.PartidaDeXadrez;
import Xadrez.PecaDeXadrez;

public class program {
    public static void main(String[] args){
        PartidaDeXadrez partida=new PartidaDeXadrez();
        UI.printCampo(partida.getPecas());
    }
}
