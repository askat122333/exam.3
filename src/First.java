import java.util.HashMap;
import java.util.Map;

public class First {
    public static void main(String[] args) {
        Map<String , String> toys = new HashMap<>();
        toys.put("Теди","Плюшевая игрушка");
        toys.put("Маквин","Машинки");
        toys.put("Барби","Куклы");
        toys.put("Мяч","Мячи");
        getAll(toys);
        System.out.println("_____________");
        getName(toys);
        System.out.println("_____________");
        getValues(toys);

    }
    static void getAll(Map<String,String>toys){
        for(Map.Entry<String, String> entry: toys.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+" , "+value);
        }
    }
    static void getName(Map<String,String>toys){
        for(Map.Entry<String, String> entry: toys.entrySet()) {
            String key = entry.getKey();
            System.out.println(key);
        }
    }
    static void getValues(Map<String,String>toys){
        for(Map.Entry<String, String> entry: toys.entrySet()) {
            String value = entry.getValue();
            System.out.println(value);
        }
    }
}