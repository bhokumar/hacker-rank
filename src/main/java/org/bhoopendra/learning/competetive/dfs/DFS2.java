package org.bhoopendra.learning.competetive.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS2 {

    private int v;
    private LinkedList<Integer> adj[];

    public DFS2(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void  dfsUtils(int v, boolean[] visited){
            visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> iterator = adj[v].listIterator();
        while (iterator.hasNext()){
            int n= iterator.next();
            if(!visited[n]){
                dfsUtils(n,visited);
            }
        }
    }

    void dfs(int v){
        boolean[] visited = new boolean[this.v];
        visited[v] = true;
        dfsUtils(v,visited);
    }

    public static void main(String[] args) {
        DFS2  dfs2 = new DFS2(4);
        dfs2.addEdge(0, 1);
        dfs2.addEdge(0, 2);
        dfs2.addEdge(1, 2);
        dfs2.addEdge(2, 0);
        dfs2.addEdge(2, 3);
        dfs2.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        dfs2.dfs(2);
    }
}
