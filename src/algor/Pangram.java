/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

/**
 *
 * @author hugo
 */
public class Pangram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        Set<Character> letters = new HashSet<>();
        IntStream.range(0, 26).forEach(c -> letters.add((char)(c+97)));
        for( int i = 0; i <s.length(); i++) {
            char current = Character.toLowerCase(s.charAt(i));
            if( letters.contains(current) ) letters.remove(current);
            if( letters.isEmpty()) break;
        }
        String answer = letters.isEmpty() ? "pangram" : "not pangram";
        System.out.println(answer);
    }
}
