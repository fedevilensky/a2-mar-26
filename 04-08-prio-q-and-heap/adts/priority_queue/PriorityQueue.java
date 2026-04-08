package adts.priority_queue;

public interface PriorityQueue<E, P extends Comparable<P>> {
   public boolean isEmpty();

   public int size();

   public void push(E elem, P prio);

   public E top();

   public E pop();
}
