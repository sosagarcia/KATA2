/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class JavaApplication2 {

    
 
    public static void main(String[] args) {
       Integer[] array ={1, 4, 7, 1, 1, 8, 4, 1, 9, 100, 2 -4};
       String[] vector = {"Maria", "Juan", "Pepe","Pepe"};
       Histogram <String> histogram = CalculaHistograma.calcHisto(vector);
       
       for(Object key : histogram.keySet()){
           System.out.println(key + "->" + histogram.get(key));
                
       }
       
       


       
       
       
    }}
    