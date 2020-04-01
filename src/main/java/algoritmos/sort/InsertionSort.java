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
public class InsertionSort {
    public static boolean sortFor(int[] vet) {
        if (vet == null) return false;
        
        for (int i = 1; i < vet.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (vet[j] > vet[j+1]) {
                    int aux = vet[j];
                    vet[j] = vet[j+1];
                    vet[j+1] = aux;
                }
            }
        }
        
        return true;
    }
    
    public static boolean sortWhile(int[] vet) {
        if (vet == null) return false;
        
        for (int i = 1; i < vet.length; i++) {
            
            int key = vet[i];
            int j = i-1;
            
            while(j >= 0 && vet[j] > key) {
                vet[j+1] = vet[j];
                j = j - 1;
            }
            
            vet[j+1] = key;
        }
        
        return true;
    }
}
