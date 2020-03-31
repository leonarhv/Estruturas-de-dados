/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.sort;

/**
 *
 * @author leona
 */
public class BubbleSort {
    
    
    public static boolean sort(int[] vet) {
        if(vet == null) return false;
        
        for (int i = 0; i < vet.length - 1; i++) {
            int trocas = 0;
            for (int j = 0; j < vet.length - 1 - i; j++) {
                if (vet[j] > vet[j + 1]) {
                    int temp = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = temp;
                    trocas++;
                }
            }
            if(trocas == 0) break;
        }
        
        return true;
    }
}
