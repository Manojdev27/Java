import java.util.*;
import java.util.ArrayList;

public class CollectionsTest {

    public static void main(String[] args) {
        int[] a = {5,6,7,8,9};
        List<String> list = new ArrayList<>();
        list.add("Test");
        list.add("Testing");
        list.add("Selenium");
        System.out.println(list);

        // For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // For Each loop - customised for loop
        for(String temp: list){
            System.out.println(temp);
        }
        // Set does not maintain any insertion order and it also do not allow duplicates. It maintains alphabetical order.
        List<String> stringSet = new ArrayList();
        stringSet.add("Testing");
        stringSet.add("Selenium");
        stringSet.add("Automation Testing");
        stringSet.add("Automation Testing");
        stringSet.add("Testing");
        stringSet.add("New Testing");

        System.out.println(stringSet);

        Set<String> noDuplicates = new HashSet<>(stringSet);
        System.out.println(noDuplicates);

        //Map allows only key value pairs,
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Harry");
        map.put(2,"Hermione");
        map.put(3,"Ron");
        map.put(4,"Nevile");
        map.put(5, "Luna");
        map.put(6, "Ginny");
        map.put(7, "Harry");
        map.put(1,"Harry");
        map.put(7,"Albus");// two duplicate keys is not allowed
//        map.put("Dean");// map not allow null keys
        map.put(8, "Dean");
        System.out.println(map);



    }

}
