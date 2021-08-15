import java.util.*;

public class Main7 {
  public static void main(String[] args) {
    // Stream
    List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));
    // for (Integer sale : sales) {
    //   System.out.println(sale);
    // }

    sales
      .stream()
      // 中間処理
      .filter(e -> e % 3 == 0) 
      .map(e -> "(" + e + ")")
      // 終端処理
      .forEach(System.out::println);

  }

}
