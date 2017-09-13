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
public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner scan = new Scanner(System.in);
        int square = 0;
        int rectangle= 0;
        int none= 0;
        while( scan.hasNextInt() ) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();
            
            if( a > 0 && b > 0 && c > 0 && d > 0) {
                if( a == c && d == b ) {
                    if( a == b )  {
                        square++;
                    } else {
                        rectangle++;
                    }
                    continue;
                }
            }
            none++;
        }
        System.out.println(square + " " + rectangle + " " + none);
    }
}