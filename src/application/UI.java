package application;

import Tabuleiro.Pecas;
import Xadrez.PecaDeXadrez;

public class UI {
    public static void printCampo(PecaDeXadrez[][] pecas){
        for (int i=0;i < pecas.length;i++){
            System.out.print((8-i)+" ");
            for (int c=0;c<pecas.length;c++){
                printpeca(pecas[i][c]);
            }
            System.out.println();
        }
        System.out.print("  A B C D E F G H");
    }
    private static void printpeca(PecaDeXadrez peca){
        if(peca==null){
            System.out.print("-");
        }else{
            System.out.print(peca);
        }
        System.out.print(" ");
    }
}
