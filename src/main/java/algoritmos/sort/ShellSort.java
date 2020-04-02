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
public class ShellSort {
    public static boolean sort(int[] vet) {
        
        if(vet == null) return false;
        
        int h = 1;
        int n = vet.length;
        
        while(h < n) {
            h = h * 3 + 1;
        }
        
        h = h / 3;       
                
        while (h > 0) {       
            for (int i = h; i < n; i++) {
                int aux = vet[i];
                int j = i;
                while (j >= h && vet[j - h] > aux) {                    
                    vet[j] = vet[j - h];
                    j = j - h;
                }
                vet[j] = aux;
            }
            h = h / 2;
        }
        
        return true;
    }
    
    public static boolean sortString(String[] vet) {
        
        if(vet == null) return false;
        
        int h = 1;
        int n = vet.length;
        
        while(h < n) {
            h = h * 3 + 1;
        }
        
        h = h / 3;       
                
        while (h > 0) {       
            for (int i = h; i < n; i++) {
                String aux = vet[i];
                int j = i;
                while (j >= h && vet[j - h].compareToIgnoreCase(aux) > 0) {                    
                    vet[j] = vet[j - h];
                    j = j - h;
                }
                vet[j] = aux;
            }
            h = h / 2;
        }
        
        return true;
    }
}
