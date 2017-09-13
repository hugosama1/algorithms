/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author hugo
 */
public class Coins {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] coins = new int[m];
        for (int i = 0; i < m; i++) {
            coins[i] = in.nextInt();
        }
        System.out.println(getChange(coins,n,0));        
    }
    
    static Set<Integer> set = new HashSet<>();
    
    public static int getChange( int[] coins, int n, int change) {
        if( n == 0 ) return change + 1;
        if( n < 0 ) return change;
        if( !set.contains(n)) {
            for (int i = 0; i < coins.length; i++) {
                int coin = coins[i];
                change = getChange( coins, n - coin, change);
            }
            set.add(n);
        } else {
            System.out.println(n + " " + change);
        }
        
        return change;        
    }
    
}
