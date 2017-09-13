/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algor;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hugo
 */
public class Graph {
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner line = null;
        TreeMap<Integer,Node> tree = new TreeMap<>();
        int nq = in.nextInt();
        in.nextLine();
        while( in.hasNextInt() ) {
            int a = 0;
            int b = 0;
            Node n1 = null;
            Node n2 = null;
            line = new Scanner(in.nextLine());
            a = line.nextInt();
            n1 =  tree.containsKey(a) ? tree.get(a) : new Node(a);
            if( !tree.containsKey(a))tree.put(a, n1);    
            if( line.hasNextInt()) {
                b = line.nextInt();
                n2 = tree.containsKey(b) ? tree.get(b) : new Node(b);
                n1.nodes.add(n2);                                    
                if( !tree.containsKey(b))tree.put(b, n2);                    
            } else {
                for (Integer key : tree.keySet()) {
                    if( key == a ) continue;
                    bfs( tree.get(a) , key );
                }
                System.out.println("");
                tree = new TreeMap<>();
            }            
            
        }
        
    }
    
    public static void bfs(Node s, int v ) {
        for (Node node : s.nodes) {
            if( node.data == v ) {
                System.out.print(6 + " ");
                return;
            }
        }
        System.out.print(-1 + " ");
    }
    
    public static class Node {
        int data;
        Set<Node> nodes;

        public Node(int data) {
            this.data = data;
            nodes = new HashSet<>();
        }
        
        
    }
    
}
