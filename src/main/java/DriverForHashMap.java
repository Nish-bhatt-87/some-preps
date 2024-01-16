import java.util.HashMap;
import java.util.Map;

public class DriverForHashMap {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hMap  = new HashMap<>();
        hMap.put(3,4);

        System.out.println(hMap.get(3));
        System.out.println(hMap.get(4));

        hMap.put(3,11);

        System.out.println(hMap.get(3));

        hMap.put(4,88);
        hMap.put(5,999);

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //value
        Integer remove = hMap.remove(4);
        System.out.println(remove);

        for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
