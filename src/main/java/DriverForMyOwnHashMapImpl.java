public class DriverForMyOwnHashMapImpl {

    public static void main(String[] args) {

        // TODO Auto-generated method stub
        MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();
        myHashMap.put("A", "B");
        myHashMap.put("E", "F");
        myHashMap.put("H", "P");
        myHashMap.put("P", "2");
        myHashMap.put("1",  "G");
        myHashMap.put("2", "995");
        myHashMap.put("3", "2");
        myHashMap.put("4", "4");
        myHashMap.put("1",  "H");
        System.out.println(myHashMap);

        System.out.println("---------------------------------------------");
        System.out.println(myHashMap.get("3"));

        System.out.println(myHashMap.remove("3"));
        System.out.println("---------------------------------------------");
        System.out.println(myHashMap);
    }
}
