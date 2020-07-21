package Practice;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
  public static void main(String[] args) {

    List<Integer> listTest = new ArrayList();

    listTest.add(1);
    listTest.add(2);
    listTest.add(3);
    listTest.add(4);
    listTest.add(5);
    listTest.add(6);
    listTest.add(7);
    listTest.add(8);
    listTest.add(9);

    for (int i = 0; i < listTest.size(); i++) {

      if (listTest.get(i) < 4) {
        System.out.println((listTest.get(i)));
      }

    }
  }
}
