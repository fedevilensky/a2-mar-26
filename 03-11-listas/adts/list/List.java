package adts.list;

public interface List<T> {
   public void add(T data);

   public void remove(T data);

   public void removeAt(int pos);

   public boolean exists(T data);

   public int getPos(T data);

   public T get(int pos);

   public boolean isEmpty();

   public int size();
}
