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
public class ReverseStringBuilder {
    
    
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("acbdef");
        System.out.println(sb);
        reverse(sb);
        System.out.println(sb);
    }
    
    public static void reverse ( StringBuilder sb ) {
        for (int i = 0; i < sb.length()/2; i++) {
            char c = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length() -i -1) );
            sb.setCharAt(sb.length() -i -1, c );
        }   
    }
}
