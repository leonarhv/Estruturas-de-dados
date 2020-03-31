package testes;


import algoritmos.desafios.baralho.Baralho;
import algoritmos.desafios.baralho.Carta;
import algoritmos.shuffle.FisherYates;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leona
 */
public class Test {
    
    public static void main(String[] args) {
//        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        
//        FisherYates.shuffle(num);
        Baralho b = new Baralho();
        b.imprimeBaralho();
        b.embaralha();
        b.imprimeBaralho();
        System.out.println(b.retiraCarta());
    }
    
}
