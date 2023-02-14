package last.node;

import java.util.LinkedList;

public class LastNodeMain {
  public static void main(String[] args) {
    LinkedList<Integer> integers = new LinkedList<>();
    for (int i = 1; i <= 10; i++) {
      integers.add(i);
    }
    System.out.println(kthToLastNode(integers, 4));
  }
  private static Integer kthToLastNode(LinkedList<Integer> list,  int k) {
    return list.get(list.size() - k);
  }
}
