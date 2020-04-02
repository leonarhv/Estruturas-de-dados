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
public class QuickSort {
    
    public boolean sort(double[] vet, int inicio, int fim) {
        if (vet == null) return false;
        
        if (inicio < fim) {
            int pivo = separarMediana(vet, inicio, fim);
            sort(vet, inicio, pivo - 1);
            sort(vet, pivo + 1, fim);
        }
        return true;
    }
    
    public double medianaDeTres(double[] vetor, int esq, int dir) {
        int centro = (esq + dir) / 2;
        if (vetor[esq] > vetor[centro]) troca(vetor, esq, centro);
        if (vetor[esq] > vetor[dir]) troca(vetor, esq, dir);
        if (vetor[centro] > vetor[dir]) troca(vetor, centro, dir);
        
        double pivo = vetor[centro];
        
        troca(vetor, esq, centro);
        
        return pivo;
    }
    
    public void troca (double[] vet, int i, int j) {
        if (i == j) return;
        
        double temp = vet[j];
        vet[j] = vet[i];
        vet[i] = temp;
    }
    
    public int separarMediana(double[] vetor, int inicio, int fim) {
        double pivo = medianaDeTres(vetor, inicio, fim);
        int i = inicio + 1;
        int f = fim;
        while (i <= f) {            
            if (vetor[i] <= pivo) {
                i++;
            }
            
            else if (vetor[f] > pivo) {
                f--;
            }
            
            else {
                troca(vetor, i, f);
                i++;
                f--;
            }            
        }
        
        troca(vetor, inicio, f);
        
        return f;
    }
}
