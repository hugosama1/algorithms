/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hugo
 */
public class DFS {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int bigRegion = 0;
        
        Node grid[][] = new Node[n][m];
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                grid[grid_i][grid_j] = new Node( in.nextInt() == 1);
            }
        }
        for(int grid_i=0; grid_i < n; grid_i++){
            for(int grid_j=0; grid_j < m; grid_j++){
                Node node = grid[grid_i][grid_j];
                if( node.x ) {
                    fillNode(grid, node, n, m, grid_i, grid_j);
                }
            }
        }
        for(int grid_i=0; grid_i < n; grid_i++) {
            for(int grid_j=0; grid_j < m; grid_j++){
                Node node = grid[grid_i][grid_j];
                if( node.x ) {
                    int current = getRegion(node,0);
                    bigRegion = current > bigRegion ? current : bigRegion;
                }
            }
        }
        System.out.println(bigRegion);        
    }
    
    public static int getRegion( Node node, int n ) {
        if( node == null || !node.x ) return n;
        node.x = false;
        for (Node child : node.children) {
            n = getRegion(child,n);
        }
        return n + 1;       
    }
    
    public static void fillNode( Node[][] grid, Node node,int n, int m,int grid_i,int grid_j) {
        boolean limitRight = grid_j + 1 < m ;
        boolean limitBottom = grid_i + 1 < n ;
        boolean limitTop = grid_i - 1  >= 0;
        boolean limitLeft = grid_j - 1 >= 0;
        if( limitLeft ) node.children.add(grid[grid_i][grid_j - 1]);
        if( limitRight ) node.children.add(grid[grid_i][grid_j + 1]);
        if( limitBottom ) node.children.add(grid[grid_i + 1][grid_j]);
        if( limitTop ) node.children.add(grid[grid_i - 1][grid_j]);
        if( limitLeft & limitTop) node.children.add(grid[grid_i - 1][grid_j - 1]);
        if( limitLeft & limitBottom ) node.children.add(grid[grid_i + 1][grid_j - 1]);
        if( limitRight & limitTop ) node.children.add(grid[grid_i - 1][grid_j +1]);
        if( limitRight & limitBottom ) node.children.add(grid[grid_i + 1][grid_j + 1]);
    }
    
    public static class Node {
        List<Node> children = new ArrayList<>();
        boolean x;    
        public Node(boolean x) {
            this.x = x;
        }
        
    }
}
