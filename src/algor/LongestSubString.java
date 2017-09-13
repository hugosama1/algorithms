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
public class LongestSubString {
    
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("epfvryouvrlbaoogoblwwamyrmgeexvjnagebuyynjzoznwnqjln"));
    }
        
        public static int lengthOfLongestSubstring(String s) {
        StringBuilder buffer = new StringBuilder();
        StringBuilder answer = new StringBuilder();
        for( int i = 0; i < s.length(); i++ ) {
            if( buffer.indexOf( s.charAt(i) + "" ) < 0 ) {
                buffer.append(s.charAt(i));
            } else if( buffer.length() > answer.length() ){
                answer = new StringBuilder(buffer);
                buffer.delete(0, buffer.indexOf( s.charAt(i) + "" ) + 1);
                buffer = new StringBuilder(buffer).append(s.charAt(i));  
            } else {
                buffer.delete(0, buffer.indexOf( s.charAt(i) + "" ) + 1);
                buffer = new StringBuilder(buffer).append(s.charAt(i));  
            }          
        }
        if( buffer.length() > answer.length() ) {
                answer = new StringBuilder(buffer);            
        }
        return answer.length();
    }
}
