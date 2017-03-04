/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.a08;

/**
 *
 * @author lisdyrohmann
 */
public class SPPLRohmannMA08 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings ("empty-statement")
    public static void main(String[] args) {
    /*
        Este programa promedia las posiciones pares y suma las posiciones nones de un arreglo
        */
    int promedio, sumaPar=0, sumaNon=0, cont=0;
    int [][] matrix = {{10,30,89,48,56},
                       {32,23,84,20,10},
                       {72,108,71,402,8}};
    // i inicia en 0, el ciclo se ejectua mientras i < tamaño del arreglo 
    // i se incrementa de 2 en 2 
    for (int i=0; i<matrix.length; i++){
        for (int j=0; j<matrix[i].length ; j=j+2){
            sumaPar= sumaPar+matrix [i][j];
            cont++;    
        }                
    }
    promedio=sumaPar/cont;
        System.out.println("El promedio es:" + promedio);
        
    //j inicia en 1, el ciclo se ejecuta mientras j < tamaño del arreglo
    //j se encrementa de dos en dos.
        for (int i=0; i<matrix.length; i++){
            for (int j=1; j<matrix[i].length; j=j+2){
                sumaNon=sumaNon+matrix[i][j];
            }
        }
        System.out.println("La suma de nones es: " +sumaNon);    
    }
    
}
