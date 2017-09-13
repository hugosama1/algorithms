/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

/**
 *
 * @author hugo
 */
public class TwoSum {
    
    
    public static void main(String[] args) {
        new TwoSum().twoSum(new int[]{3,2,4},6);
    }
    
    public int[] twoSum(int[] nums, int target) {
        int response[] = new int[2];
        Map<Integer,List<Integer>> map = new HashMap<>();
        IntStream.range(0, nums.length)
                .forEach(idx -> {
                    if( map.containsKey(nums[idx])) {
                        map.get(nums[idx]).add(idx);
                    } else {
                        map.put(nums[idx], new ArrayList<>(Arrays.asList(idx)));
                    }
                });
        for( int key : map.keySet()) {
            int searchedValue = target - key;
            if( map.containsKey(searchedValue) ) {
                response[0] = map.get(key).get(0);
                if( searchedValue == key) {
                    response[1] = map.get(key).get(1);
                } else {
                    response[1] = map.get(searchedValue).get(0);
                }
            }
        }
        return response;
    }
    
    
    
    
}
