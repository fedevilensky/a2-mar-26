package adts.priority_queue;

public class MinHeap<E, P extends Comparable<P>> implements PriorityQueue<E, P> {

   private class Pair {
      E elem;
      P prio;

      Pair(E elem) {
         this.elem = elem;
      }

      Pair(E elem, P prio) {
         this.elem = elem;
         this.prio = prio;
      }
   }

   private Object[] arr;
   private int count;

   int leftChild(int n) {
      return n * 2;
   }

   int rightChild(int n) {
      return n * 2 + 1;
   }

   int parent(int n) {
      return n / 2;
   }

   void siftUp(int pos) {
      throw new RuntimeException("Not implemented");
   }

   void siftDown(int pos) {
      throw new RuntimeException("Not implemented");
   }

   void resize(int newSize) {
      Object[] oldArr = this.arr;
      this.arr = new Object[newSize];

      for (int i = 1; i <= this.count; i++) {
         this.arr[i] = oldArr[i];
      }

   }

   public MinHeap(int expectedSize) {
      this.arr = new Object[expectedSize + 1];
      this.count = 0;
   }

   @Override
   public boolean isEmpty() {
      return this.count == 0;
   }

   @Override
   public int size() {
      return this.count;
   }

   @Override
   public void push(E elem, P prio) {
      if (this.count > this.arr.length) {
         resize(this.count * 2);
      }

      Pair p = new Pair(elem, prio);
      this.count++;
      this.arr[this.count] = p;

      siftUp(this.count);
   }

   @Override
   public E top() {
      if (isEmpty()) {
         throw new RuntimeException("Heap is empty");
      }

      Pair ret = (Pair) this.arr[1];
      return ret.elem;
   }

   @Override
   public E pop() {
      if (isEmpty()) {
         throw new RuntimeException("Heap is empty");
      }

      Pair ret = (Pair) this.arr[1];

      this.arr[1] = this.arr[this.count];
      this.count--;
      siftDown(1);

      return ret.elem;
   }

}
