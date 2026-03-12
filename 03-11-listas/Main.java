import adts.list.LinkedList;
import adts.list.List;

public class Main {
   public static void main(String[] args) {
      List<String> lStr = new LinkedList<>();

      System.out.println(lStr.exists("hola"));

      lStr.add("hola");

      System.out.println(lStr.exists("hola"));
   }

}
