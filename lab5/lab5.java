import java.util.*;

public class Main {

    // Method to find minimum distance vertex
    public static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;

        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] <= min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to run Dijkstra’s algorithm
    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            dist[i] = Integer.MAX_VALUE;
            visited[i] = false;
        }

        dist[source] = 0;

        for (int count = 0; count < n - 1; count++) {

            int u = minDistance(dist, visited);

            visited[u] = true;

            for (int v = 0; v < n; v++) {

                if (!visited[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print result
        System.out.println("Vertex Distance from Source");
        for (int i = 0; i < n; i++) {
            System.out.println(i + " \t " + dist[i]);
        }
    }

    public static void main(String[] args) {

        int[][] graph = {
                {0, 4, 0, 0, 0},
                {4, 0, 8, 0, 0},
                {0, 8, 0, 7, 2},
                {0, 0, 7, 0, 9},
                {0, 0, 2, 9, 0}
        };

        int source = 0;

        dijkstra(graph, source);
    }
}
