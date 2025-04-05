import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphs {
    private LinkedList<Integer>[ ]adj;
    private int V;
    private int E;

    public Graphs(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for(int v=0;v<V;v++) {
            adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u,int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb  = new StringBuilder();
        sb.append(V + "Vertices" + E + "Edges" + "\n");
        for(int v=0;v<V;v++) {
            sb.append(v + ":");
            for(int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public void bfs(int s) {
        boolean[] visited = new boolean[V];

        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;
        q.offer(s);

        while(!q.isEmpty()) {
            int u = q.poll();
            System.out.print(u + " ");

            for(int v: adj[u]) {
                if(!visited[v]) {
                    visited[v] = true;
                    q.offer(v);
                }
            }
        }
    }

    public void dfs(int s) {
        boolean[] visited = new boolean[V];

        Stack<Integer> stk = new Stack<>();
        stk.push(s);

        while(!stk.isEmpty()) {
            int u = stk.pop();
            if(!visited[u]) {
                visited[u] = true;
            System.out.print(u + " ");
            for(int v: adj[u]) {
                if(!visited[v]) {
                    stk.push(v);
                }
                }
            }
        }
    }

    public static void main(String[] args) {
        Graphs g = new Graphs(4);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.bfs(0);
        System.out.println(g);
        g.dfs(0);
        System.out.println(g);
    }
}