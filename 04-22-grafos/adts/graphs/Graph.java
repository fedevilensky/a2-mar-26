package adts.graphs;

import java.util.Iterator;

public interface Graph {

   // PRE: -
   // POS: se agrega la arista desde `from` hasta `to`, en caso
   // de que sea un grafo NO dirigido, se agrega en la direccion
   // contraria tambien
   public void addEdge(int from, int to);

   public void addWeightedEdge(int from, int to, int weight);

   public void removeEdge(int from, int to);

   // PRE: existen `from` y `to`
   // POS: -
   // RET: true sii existe arista desde `from` hasta `to`
   public boolean hasEdge(int from, int to);

   // PRE: existen `from` y `to`,
   // existe arista desde `from` hasta `to`
   // POS: -
   // RET: retorna el peso de dicha arista
   public int getWeight(int from, int to);

   // PRE: -
   // POS: -
   // RET: devuelve la cantidad de vertices/nodos en el grafo
   // (es decir, el tamano de la primer dimension de la matriz)
   public int vertices();

   public int countEdges();

   public Iterator<Edge> edges();

   // PRE: existe v
   // POS: -
   // RET: iterador sobre las aristas que salen de v
   public Iterator<Edge> neighbors(int v);

   // PRE: -
   // POS: -
   // RET: Una nueva matriz de adyacencia
   public int[][] buildMatrix();
};
