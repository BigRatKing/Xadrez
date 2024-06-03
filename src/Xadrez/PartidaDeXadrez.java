package Xadrez;

import Tabuleiro.Campo;

public class PartidaDeXadrez {
    private Campo campo;

    public PartidaDeXadrez(){
        campo=new Campo(8,8);
    }
    public PecaDeXadrez[][] getPecas(){
        PecaDeXadrez[][] mat=new PecaDeXadrez[campo.linhas()][campo.colunas()];
        for(int i=0;i<campo.linhas();i++){
            for (int c=0;c< campo.colunas();c++){
                mat[i][c]=(PecaDeXadrez)campo.pecas(i,c);
            }
        }
        return mat;
    }
}
