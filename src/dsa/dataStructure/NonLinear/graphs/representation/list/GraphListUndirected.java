package dsa.dataStructure.NonLinear.graphs.representation.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListUndirected {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //n -> number of nodes
        //m -> number of edges
        //We cover all the node, so time complexity is O(n)
        int n = sc.nextInt();
        int m = sc.nextInt();
        //Adjacency List Representation
        List<List<Integer>> adjList = new ArrayList<>();
        //If we use this structure List<List<>>, we need to initialize to empty list first
        //Mode 1: {}, Node 2: {}, Node 3: {} and so on
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }
        //Read the edges from the user
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            //Undirected Graph u <--> v
            adjList.get(u).add(v);
            adjList.get(v).add(u); //skip this line for directed
        }
        //Print the adjacency list
        for(int i=0;i<=n;i++){
            System.out.print("Node: "+i+": Neighbours: ");
            for(int v: adjList.get(i)){
                System.out.print(v+" ");
            }
            System.out.println();
        }sc.close();
    }
}
