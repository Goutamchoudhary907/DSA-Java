import java.util.ArrayList;

public class WeightedGraph {
     static class Edge{
        int src ;
        int dest;
        int wt;
    
        public Edge(int src, int dest, int wt){
           this.src=src;
           this.dest=dest;
           this.wt=wt;
        }
    }
    public static void weightedGraph(ArrayList<Edge> graph[]){
        for (int i = 0;i < graph.length;i++) {
             graph[i]=new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2,2));

        graph[1].add(new Edge(1, 2,10));
        graph[1].add(new Edge(1, 3,0));

        graph[2].add(new Edge(2, 0,2));
        graph[2].add(new Edge(2, 1,10));
        graph[2].add(new Edge(2, 3,-1));

        graph[3].add(new Edge(3, 1,0));
        graph[3].add(new Edge(3, 2,-1));

    }

    public static void main(String[] args) {
        int v=4;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[]=new ArrayList[v];
        weightedGraph(graph);
        
        // 
        for (int i = 0;i <graph.length;i++) {
            for (int j = 0;j < graph[i].size();j++) {
                 Edge e=graph[i].get(j);
                 System.out.println("src: "+e.src+" dest: "+e.dest+" wt: "+e.wt);
            }
            System.out.println();
        } 
    }
}
