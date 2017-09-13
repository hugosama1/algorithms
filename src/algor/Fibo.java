/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

/**
 *
 * @author hugo
 */
public class Fibo {
    
    public static void main(String[] args) {
        
        int fib1 = 0;
        int fib2 = 1;
        int n = 50;
        System.out.println(0);
        System.out.println(1);
        for (int i = 0; i < n; i++) {
            int nextFib = fib1 + fib2;
            System.out.println(nextFib);
            fib1 = fib2;
            fib2 = nextFib;
        }
        
        
    }
    
    	public static int printFib( int n ) { 
		if( n == 0 ) { 
                    System.out.println( 0 );
                    return 0;
		}
                if( n == 1 ) { 
		     System.out.println( 1 );
                    return 1;
		}	
		int fib = printFib( n-2 ) + printFib( n -1 );
                System.out.println( fib ) ;
		return fib;
	}	
}
