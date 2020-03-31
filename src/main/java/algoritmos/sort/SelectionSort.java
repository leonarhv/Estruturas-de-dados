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
public class SelectionSort {
    public static boolean sort(int[] vet) {
        
        if(vet == null) return false;
        
        for (int i = 0; i < vet.length - 1; i++) {
            int min = i;
            for (int j = i+1; j < vet.length; j++) {
                if (vet[j] < vet [min]) min = j; 
            }
            int temp = vet[i];
            vet[i] = vet[min];
            vet[min] = temp;
        }
        return true;
    }
}
