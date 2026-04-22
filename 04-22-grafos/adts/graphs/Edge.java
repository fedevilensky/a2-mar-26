package adts.graphs;

public class Edge {
   public int from;
   public int to;
   public int weight;

   Edge(int from, int to) {
      this.from = from;
      this.to = to;
      this.weight = 1;
   }

   Edge(int from, int to, int weight) {
      this.from = from;
      this.to = to;
      this.weight = weight;
   }
};
