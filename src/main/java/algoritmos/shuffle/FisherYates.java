/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.shuffle;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author leona
 */
public class FisherYates {
    
    public static void shuffle(int[] vet) {
        Random rnd = new Random();
        int aux;
        for (int i = vet.length - 1; i > 1; i--) {
            int j = rnd.nextInt(i + 1);
            aux = vet[i];
            vet[i] = vet[j];
            vet[j] = aux;
        }
        System.out.println(Arrays.toString(vet));
    }
    
}
