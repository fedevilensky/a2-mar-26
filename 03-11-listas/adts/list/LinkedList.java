package adts.list;

public class LinkedList<T> implements List<T> {
   private class node {
      T data;
      node next;
   }

   private node head = null;
   private int length = 0;

   public LinkedList() {
   }

   @Override
   public void add(T data) {
      if (this.head == null) {
         this.head = new node();
         this.head.data = data;
         this.head.next = null;
      } else {
         // rellenar
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

}
