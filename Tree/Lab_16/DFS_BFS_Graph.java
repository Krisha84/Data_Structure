import java.util.*;

class Graph{
    private Map<Integer,List<Integer>> adjList;

    public Graph(){
        adjList = new HashMap<>();
    }

    public void addEdge(int u,int v){
        adjList.putIfAbsent(u,new ArrayList<>());
        adjList.putIfAbsent(v,new ArrayList<>());
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }

    public void dfs(int start){
        Set<Integer> visited = new HashMap<>();
        dfsHelper(start,visited);
    }

    public void dfsHelper(int vertex,Set<Integer> visited){
        visited.add(vertex);
        System.out.print(vertex + " ");
        for(int neighbor : adjList.getOrDefault(vertex,new ArrayList<>())){
            if(!visited.contains(neighbor)){
                dfsHelper(neighbor,visited);
            }
        }
    }

    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while(!queue.isEmpty()){
            int vertex = queue.poll();
            System.out.print(vertex + " ");
            for(int neighbor : adjList.getOrDefault(vertex,new ArrayList<>())) {
                if(!visited.contains(neighbor)){
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
}

public class DFS_BFS_Graph{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Graph g = new Graph();
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);

        System.out.println("DFS starting from vertex 0:");
        g.dfs(0);

        System.out.println("\nBFS starting from vertex 0:");
        g.bfs(0);
    }
}