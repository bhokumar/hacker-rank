package org.bhoopendra.learning.competetive.bfs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS2 {
    private int v;
    private LinkedList<Integer> adj[];

    public BFS2(int v){
        this.v = v;
        adj = new LinkedList[v];

        for (int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void bfs(int v){
        boolean visited[] = new boolean[this.v];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while (queue.size()!=0){
            int s= queue.poll();
            System.out.print(s+" ");

            Iterator<Integer> iterator = adj[s].listIterator();
            while (iterator.hasNext()){
                int n = iterator.next();
                if (!visited[n]){
                    visited[n] =true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS2 bfs2 = new BFS2(4);
        bfs2.addEdge(0, 1);
        bfs2.addEdge(0, 2);
        bfs2.addEdge(1, 2);
        bfs2.addEdge(2, 0);
        bfs2.addEdge(2, 3);
        bfs2.addEdge(3, 3);

        System.out.println("########################");
        bfs2.bfs(2);
    }
}
