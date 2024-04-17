package JavaSet;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map中的方法：
 * 1.put(key,value)  添加数据
 * 2.get(key)  根据key取值
 * 3.remove(key)  根据key移除键值对
 * 4.size()  map集合的长度
 * 5.containsKey(key)   判断当前的map集合是否包含指定的key
 * 6.containsValue(value)  判断当前的map集合是否包含指定的value
 * 7.clear()   清空集合
 * 8.map.keySet();   获取集合的key集合
 * 9.map.values();   获取集合的所有value值
 */
public class TestHashMap {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("b", 1);//添加数据
        map.put("c", 2);
        map.put("s", 2);
        System.out.println(map);
        System.out.println(map.get("b"));//根据key取值
        map.remove("c");//根据key移除键值对
        System.out.println(map);
        System.out.println(map.size());//map集合的长度
        System.out.println(map.containsKey("a"));//判断当前的map集合是否包含指定的key
        System.out.println(map.containsValue(22));//判断当前的map集合是否包含指定的value

        Set<String> keys = map.keySet();//获取集合的key集合
        map.values();//获取集合的所有value值
//        遍历map集合，通过map.keySet();
        for (String key : keys) {
            System.out.println("key:" + key + "\t" + "value:" + map.get(key));
        }
//        通过map.entrySet();遍历
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> en : entries) {
            System.out.println("key:" + en.getKey() + "\t" + "value:" + en.getValue());
        }
    }
}
