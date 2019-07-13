import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import java.util.List;

public class TestMaven {
    public static void main(String[] args) {
        List<String> fruits = Lists.newArrayList("orange","banana","kiwi");
        fruits.forEach(System.out::println);
        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);
        Multimap<String,String> map = ArrayListMultimap.create();
        map.put("13","go");
        map.put("13","stop");
        System.out.println(map);

    }
}
