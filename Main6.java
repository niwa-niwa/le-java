import java.util.*;

public class Main6 {
    public static void main(String[] args){
        // ArrayList
        // LinkedList ☓ 検索 ◯ 追加／削除

        // ArrayList<Integer> sales = new ArrayList<>();
        List<Integer> sales = new ArrayList<>();
        
        sales.add(10);
        sales.add(20);
        sales.add(30);
        
        for (int i = 0; i < sales.size(); i++ ){
            System.out.println(sales.get(i));
        }
        
        sales.set(0, 100);
        sales.remove(2);
        
        for (Integer sale : sales){
            System.out.println(sale);
        }
        
        
        // HashMap: key value
        // TreeMap
        // LinkedHashMap

        // HashMap<String, Integer> sales = new HashMap<>();
        Map<String, Integer> sales2 = new HashMap<>();
        
        sales2.put("tom", 10);
        sales2.put("bob", 20);
        sales2.put("steave", 30);
        
        System.out.print(sales2.get("tom"));
        System.out.println(sales2.size());
        
        for (Map.Entry<String, Integer> sale : sales2.entrySet()){
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }
        
        sales2.put("tom", 100);
        sales2.remove("steave");
        
        for (Map.Entry<String, Integer> sale : sales2.entrySet()){
            System.out.println(sale.getKey() + ":" + sale.getValue());
        }
        
    }
}
