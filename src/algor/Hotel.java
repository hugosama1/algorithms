/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author hugo
 */
public class Hotel {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String words = scan.nextLine();
        int m = scan.nextInt();
        scan.nextLine();
        Set<String> keyWords = new HashSet<>(Arrays.asList(words.split(" ")));
        Map<Integer,Integer> hotels = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int id = scan.nextInt();
            scan.nextLine();
            String reviewWords[] = scan.nextLine().split(" ");
            
            for (String reviewWord : reviewWords) {
                if( keyWords.contains(reviewWord)) {
                    if( hotels.containsKey(id)) {
                        hotels.put(id, hotels.get(id) + 1);
                    } else {
                        hotels.put(id, 1);
                    }                    
                }
            }            
        }
        hotels.entrySet()
              .stream()
              .sorted(Map.Entry.comparingByValue(Collections.reverseOrder()))
              .forEach( (entry) -> {
                  System.out.print( entry.getKey() + " ");
              });
        
    }
    
}
