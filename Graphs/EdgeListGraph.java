import java.util.ArrayList;

public class EdgeListGraph {
    public static class Edge{
        int src;
        int dest;
        int wt;

        public Edge(int src, int dest, int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
        public static void edgeGraph(ArrayList<Edge> graph){
          graph.add(new Edge(0, 2, 2));

          graph.add(new Edge(1, 2, 10));
          
          graph.add(new Edge(1, 3, 0));
          
          graph.add(new Edge(2, 3, -1));
          
        }
        public static void bubbleSort(ArrayList<Edge> graph) {
        int n=graph.size();
        for (int i = 0;i < n;i++) {
          for (int j = 0;j < n-i-1;j++) {
            Edge e1=graph.get(j);
            Edge e2=graph.get(j+1);
            if(e1.wt > e2.wt){
                 graph.set(j, e2);
                 graph.set(j+1, e1);
            }
          }   
        }
            
        }
    public static void main(String[] args) {
        ArrayList<Edge> graph=new ArrayList<>();
        edgeGraph(graph);
        bubbleSort(graph);
        for(int i=0;i<graph.size();i++){
            System.out.println(graph.get(i).src +","+ graph.get(i).dest+","+graph.get(i).wt);
        }
    }
}
