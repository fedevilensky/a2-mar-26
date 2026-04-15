import java.util.Iterator;

import adts.list.LinkedList;
import adts.list.List;

public class Main {
   public static void main(String[] args) {
      List<String> l = new LinkedList<String>();

      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");
      l.add("hola");

      // for (String s : l) {
      // System.out.println(s);
      // }

      int maxPrintCount = 2;
      Iterator<String> it = l.iterator();
      while (it.hasNext() && maxPrintCount > 0) {
         String s = it.next();
         System.out.println(s);
         maxPrintCount--;
      }
   }
}
