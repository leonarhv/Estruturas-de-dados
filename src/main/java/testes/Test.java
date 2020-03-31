package testes;


import algoritmos.desafios.baralho.Baralho;
import algoritmos.desafios.baralho.Carta;
import algoritmos.shuffle.FisherYates;
import algoritmos.sort.BubbleSort;
import algoritmos.sort.SelectionSort;
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
        int[] num = {10, 7, 23, 4, 5, 12, 2, 8, 9, 1};
//        
//        FisherYates.shuffle(num);
//        Baralho b = new Baralho();
//        b.imprimeBaralho();
//        b.embaralha();
//        b.imprimeBaralho();
//        System.out.println(b.retiraCarta());


//        BubbleSort.sort(num);
//        System.out.println(Arrays.toString(num));

        SelectionSort.sort(num);
        System.out.println(Arrays.toString(num));
    }
    
}
