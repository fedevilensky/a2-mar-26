package adts.list;

import java.util.Iterator;

public class LinkedList<T> implements List<T> {
   private class node {
      T data;
      node next;
   }

   private node head = null;
   private int length = 0;

   private class LinkedListIterator implements Iterator<T> {
      node curr;

      LinkedListIterator(node head) {
         this.curr = head;
      }

      @Override
      public boolean hasNext() {
         return this.curr != null;
      }

      @Override
      public T next() {
         if (this.curr == null) {
            throw new RuntimeException("iterator has reached the end");
         }
         T ret = this.curr.data;
         this.curr = this.curr.next;
         return ret;
      }
   }

   public LinkedList() {
   }

   @Override
   public void add(T data) {
      if (this.head == null) {
         this.head = new node();
         this.head.data = data;
         this.head.next = null;
      } else {
         // ESTO ESTA MAL NO SE AGREGA AL PPIO. SE TIENE QUE AGREGAR AL FINAL
         node newN = new node();
         newN.data = data;
         newN.next = this.head;
         this.head = newN;
      }
      this.length++;
   }

   @Override
   public void remove(T data) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'remove'");
   }

   @Override
   public void removeAt(int pos) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'removeAt'");
   }

   @Override
   public boolean exists(T data) {
      node aux = this.head;
      while (aux != null) {
         if (aux.data == data) {
            return true;
         }

         aux = aux.next;
      }

      return false;
   }

   @Override
   public int getPos(T data) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getPos'");
   }

   @Override
   public T get(int pos) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'get'");
   }

   @Override
   public boolean isEmpty() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
   }

   @Override
   public int size() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'size'");
   }

   @Override
   public Iterator<T> iterator() {
      return new LinkedListIterator(this.head);
   }

}
