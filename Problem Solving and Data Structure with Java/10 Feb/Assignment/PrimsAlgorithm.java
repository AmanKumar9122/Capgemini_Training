import java.util.*;

public class PrimsAlgorithm {

    static int minKey(int[] key, boolean[] mst) {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < key.length; i++) {
            if (!mst[i] && key[i] < min) {
                min = key[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[][] graph = {
                { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 }
        };

        int V = graph.length;

        int[] parent = new int[V];
        int[] key = new int[V];
        boolean[] mst = new boolean[V];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[0] = 0;
        parent[0] = -1;

        for (int i = 0; i < V - 1; i++) {
            int u = minKey(key, mst);
            mst[u] = true;

            for (int v = 0; v < V; v++) {
                if (graph[u][v] != 0 && !mst[v] && graph[u][v] < key[v]) {
                    parent[v] = u;
                    key[v] = graph[u][v];
                }
            }
        }

        for (int i = 1; i < V; i++) {
            System.out.println(parent[i] + "-" + i + " " + graph[i][parent[i]]);
        }
    }
}