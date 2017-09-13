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
public class StringPermutations {
    
    
    public static void main(String[] args) {
        findPermutations( "" , "abcde");
    }
    
    public static void findPermutations(String prefix,String str) {
       if( str.isEmpty()) {
            System.out.println(prefix);
            return;
       }       
        for (int i = 0; i < str.length(); i++) {
            String end = i+1 == str.length() ? "" : str.substring(i + 1);
            String start = str.substring(0,i);
            findPermutations( prefix + str.charAt(i), start + end );
        }
    }
    
}
