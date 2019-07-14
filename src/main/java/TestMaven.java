import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Objects;
import java.util.Properties;

/**
 * Create class TestMaven to check the work of the Maven.
 * @author Shakhov Yevhen.
 */
public class TestMaven {
    public static void main(String[] args) {
        /*
        Create list fruits using the special utility class Lists.Display the list items in the console. Using the method
        reverse output in console our list.
         */
        List<String> fruits = Lists.newArrayList("orange", "banana", "kiwi");
        fruits.forEach(System.out::println);
        List<String> reverseFruits = Lists.reverse(fruits);
        reverseFruits.forEach(System.out::println);
        /*
        Check the work of the special Map - Multimap. In map add two values ​​with the same key and output in console map.
         */
        Multimap<String, String> map = ArrayListMultimap.create();
        map.put("13", "go");
        map.put("13", "stop");
        System.out.println(map);
        /*
        Implement the loading of settings at system startup. And output in console option values.
         */
        Properties prop = new Properties();   //обьект настроек
        try(InputStream resourceAsStream = TestMaven.class.getClassLoader()  //лоадер текущего класса
            .getResourceAsStream("config.properties")){          //получения йайла настроек
            prop.load(Objects.requireNonNull(resourceAsStream));       //загрузка настроек из файла
        } catch (IOException e) {
            System.err.println("Unable to load properties file: "+"config.properties");
        }
        prop.get("props.local.hello");
        prop.get("props.mvn.hello");
    }
}
