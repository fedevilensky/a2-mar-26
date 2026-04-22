package adts.graphs;

import java.util.Iterator;

import adts.list.LinkedList;
import adts.list.List;

public class AdjListGraph implements Graph {

   // type List<Edge>
   private Object[] arr;
   private boolean isDirected;
   private int edgeCount;

   public AdjListGraph(int vertices, boolean isDirected) {
      this.isDirected = isDirected;
      this.edgeCount = 0;

      this.arr = new Object[vertices + 1];
      for (int i = 1; i <= vertices; i++) {
         this.arr[i] = new LinkedList<Edge>();
      }
   }

   @Override
   public void addEdge(int from, int to) {
      addWeightedEdge(from, to, 1);
   }

   @Override
   public void addWeightedEdge(int from, int to, int weight) {
      removeEdge(from, to);

      Edge e = new Edge(from, to, weight);
      ((List<Edge>) this.arr[from]).add(e);
      if (!this.isDirected) {
         e = new Edge(to, from, weight);
         ((List<Edge>) this.arr[to]).add(e);
      }
      this.edgeCount++;
   }

   @Override
   public void removeEdge(int from, int to) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'removeEdge'");
   }

   @Override
   public boolean hasEdge(int from, int to) {
      Iterator<Edge> it = neighbors(from);
      while (it.hasNext()) {
         Edge e = it.next();
         if (e.to == to) {
            return true;
         }
      }

      return false;
   }

   @Override
   public int getWeight(int from, int to) {
      Iterator<Edge> it = neighbors(from);
      while (it.hasNext()) {
         Edge e = it.next();
         if (e.to == to) {
            return e.weight;
         }
      }

      throw new RuntimeException("edge does not exist");
   }

   @Override
   public int vertices() {
      return arr.length;
   }

   @Override
   public int countEdges() {
      return this.edgeCount;
   }

   @Override
   public Iterator<Edge> edges() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'edges'");
   }

   @Override
   public Iterator<Edge> neighbors(int v) {
      return ((List<Edge>) this.arr[v]).iterator();
   }

   @Override
   public int[][] buildMatrix() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'buildMatrix'");
   }

}
