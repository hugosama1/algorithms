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
public class Executives {
       public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int agents = scan.nextInt();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            long startDate = scan.nextLong();
            long endDate = scan.nextLong();
            
            /**
             * I needed a little more time, but my idea was to implement a
             * max heap and a min heap
             * the min would always give me the startDate and the max the end date
             * I would only need to check thouse ranges for overlaping calls
             * that would give me O(n) time
             */
            
        }
    }
   
       
}
