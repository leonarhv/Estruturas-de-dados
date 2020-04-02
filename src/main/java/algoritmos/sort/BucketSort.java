/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.sort;

import java.util.ArrayList;

/**
 *
 * @author leona
 */
public class BucketSort {
    public static void sort(int[] vet, int k) {
        ArrayList[] b = new ArrayList[k+1];
        ArrayList output = new ArrayList();
        
        for (int i = 0; i < k + 1; i++) {
            b[i] = new ArrayList();
        }
        
        for (int i = 0; i < vet.length; i++) {
            b[vet[i]].add(vet[i]);
        }
        

        // Insertion Sort
        
        for (int i = 0; i < b.length; i++) {
            for (int iterator = 1; iterator < b[i].size(); i++) {
                for (int j = iterator-1; j >= 0; j--) {
                    if ((int) b[i].get(j) > (int) b[i].get(j+1)) {
                        int aux = (int) b[i].get(j);
                        b[i].set(j, b[i].get(j+1));
                        b[i].set((j+1), aux);
                    }
                }
            }
        }
        
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].size(); j++) {
                output.add(b[i].get(j));
            }
        }
        
        System.out.println(output.toString());
    }
}
