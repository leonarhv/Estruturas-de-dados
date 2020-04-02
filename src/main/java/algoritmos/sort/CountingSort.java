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
public class CountingSort {
    public static void sort(int[] a, int[] b, int max) {
        
        int[] c = new int[max + 1];
        
        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        
        for (int i = 0; i < a.length; i++) {
            c[a[i]] += 1;
        }
        
        for (int i = 1; i <= max; i++) {
            c[i] = c[i] + c[i-1];
        }
        
        for (int i = a.length - 1; i >= 0; i--) {
            b[c[a[i]] - 1] = a[i];
            c[a[i]] -= 1;
        }
        
    }
}
