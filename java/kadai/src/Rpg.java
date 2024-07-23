import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class Rpg {
    public static void main(String[] args) {

        int money = 300;//所持金

        //アイテムの金額(Intergetでkey,valueをつけれる)
        Map<String, Integer> items = new HashMap<>();

        items.put("yakusou", 10);
        items.put("seisui", 100);
        items.put("kinobou", 50);

        //入力例1
        //1対1対応の関係が格納されるもの(item=yakusou, quantity=5)
        List<Map<String, Object>> orders = new ArrayList<>();

        orders.add(Map.of("item", "yakusou","quantity", 5));
        orders.add(Map.of("item", "seisui", "quantity", 3));
        orders.add(Map.of("item", "kinobou","quantity", 1));
        orders.add(Map.of("item", "seisui", "quantity", 1));
        orders.add(Map.of("item", "yakusou","quantity", 3));

        RPG(money, items, orders);
    }

    public static void RPG(int money, Map<String, Integer> items, List<Map<String, Object>> orders){
        for(int i = 0; i < orders.size(); i++){
            Map<String, Object> order = orders.get(i);
            String item = (String) order.get("item");
            int quantity = (int) order.get("quantity");

            int cost = items.get(item) * quantity;
            if(money >= cost){
                money -= cost;
            }
        }
        System.out.println("最終的な残金は" + money + "G");
    }
}
