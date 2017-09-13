/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class Prime {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int p = in.nextInt();
            boolean isPrime = true;
            for( int j = 2; j <= Math.sqrt(p); j++) {
                if( p % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            String output = isPrime ? "Prime" : "Not prime";
            System.out.println(output);
        }
    }
            
            
}
