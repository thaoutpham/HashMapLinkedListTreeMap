import com.sun.javafx.collections.MappingChange;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Thảo",20);
        hashMap.put("Hồng",20);
        hashMap.put("Sinh",21);
        hashMap.put("Join",22);
        hashMap.put("Linh",24);
        hashMap.put("Tuyên",19);
        hashMap.put("Tuấn",16);
        hashMap.put("Phạm",29);
        hashMap.put("Trang",28);
        hashMap.put("Thúy",26);
        hashMap.put("Dung",23);
        hashMap.put("Xuân",25);
        System.out.println("Diplay entries in HashMap");
        System.out.println(hashMap +"\n");

        Map<String, Integer> treeMap=new TreeMap<>();
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
