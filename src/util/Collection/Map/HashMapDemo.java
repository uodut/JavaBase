package util.Collection.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author UODUT
 * 基于哈希表的 Map 接口的实现
 * key和value都可以为空值,不同步，线程不安全。
 * 和Hashtable的区别：Hashtable键和值都不可以为null。线程安全。
 * 包括的方法：
 boolean containsKey(Object key) 
          如果此映射包含对于指定键的映射关系，则返回 true。 
 boolean containsValue(Object value) 
          如果此映射将一个或多个键映射到指定值，则返回 true。 
 Set<Map.Entry<K,V>> entrySet() 
          返回此映射所包含的映射关系的 Set 视图。 
 V get(Object key) 
          返回指定键所映射的值；如果对于该键来说，此映射不包含任何映射关系，则返回 null。 
 Set<K> keySet() 
          返回此映射中所包含的键的 Set 视图。 
 Collection<V> values() 
          返回此映射所包含的值的 Collection 视图。 
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("wang", 20);
        hashMap.put("zhang", 19);
        hashMap.put("liu", 20);
        hashMap.put("li", 19);
        hashMap.put("liu", 21);// 自动覆盖第一个相同的key
        hashMap.put(null, null);
        // hashMap.put(null, 0);
        System.out.println("--------第一种方式---------");
        display1(hashMap);
        System.out.println("--------第二种方式---------");
        display2(hashMap);
    }
    // 根据键找值
    static void display1(HashMap<String, Integer> hm) {
        // 得到所有的key值
        Set<String> names = hm.keySet();
        System.out.println("姓名" + '\t' + "年龄");
        for (String name : names) {
            System.out.println(name + '\t' + hm.get(name));
        }
    }
    // 根据键值对找键和值
    static void display2(HashMap<String, Integer> hm) {
        System.out.println("姓名" + '\t' + "年龄");
        String name = null;
        Integer age = null;
        // 找到set视图
        Set<Entry<String, Integer>> set = hm.entrySet();
        for (Entry<String, Integer> s : set) {
            name = s.getKey();
            age = s.getValue();
            System.out.println(name + '\t' + age);
        }
    }
}
