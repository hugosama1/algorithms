/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author hugo
 */
public class Algor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            long firstFlavor =0, secondFlavor = 0;
            Flavor array [] = new Flavor[n];
            for(int a_i=0; a_i < n; a_i++){
                array[a_i] = new Flavor(a_i + 1,in.nextInt());
            }
            Arrays.sort(array, (f1,f2) -> (int)(f1.cost - f2.cost) );
            FlavorTrips:
            for (int i = 0; i < array.length - 1; i++) {
                 firstFlavor = array[i].cost;
                 int start = i + 1;
                 int end = array.length - 1;
                 while(  start <= end  ) {
                     int middle = start +  ( (end - start) / 2 ) ;
                     secondFlavor = array[middle].cost;
                     if( secondFlavor + firstFlavor  ==  m ) {
                         firstFlavor = array[i].id ;
                         secondFlavor = array[middle].id;
                         break FlavorTrips;
                     } else if( secondFlavor + firstFlavor > m ) {
                         end = middle -1;
                     } else {
                         start = middle + 1;
                     }
                 }
            }
            
            System.out.println(firstFlavor + " " + secondFlavor);         
        }
        
    }
    
    public static class Flavor {
        int id;
        long cost;
        
        public Flavor( int id, long cost) {
            this.id = id;
            this.cost = cost;
        }
    }
    
}
