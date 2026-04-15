package functions.hash;

public class IntHash implements HashFunc<Integer> {

   @Override
   public int hash(Integer data) {
      return data;
   }

}
