package adts.bst;

interface BST<T extends Comparable<T>> {
   public void insert(T data);

   public void remove(T data);

   public void printInOrder();

   public int size();

   public int height();
}
