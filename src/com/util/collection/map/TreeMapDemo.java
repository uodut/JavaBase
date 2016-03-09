package com.util.collection.map;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import com.dao.PersonTreeMap;
import org.apache.log4j.Logger;
/**
 * 底层实现为红黑树（一种自平衡的二叉查找树）
 * 1、TreeMap根据其键的自然顺序进行排序，或者根据创建映射时提供的 Comparator 进行排序
方法：
Map.Entry<K,V> ceilingEntry(K key) 
          返回一个键-值映射关系，它与大于等于给定键的最小键关联；如果不存在这样的键，则返回 null。 
 K ceilingKey(K key) 
          返回大于等于给定键的最小键；如果不存在这样的键，则返回 null。 
 void clear() 
          从此映射中移除所有映射关系。 
 Object clone() 
          返回此 TreeMap 实例的浅表副本。 
 Comparator<? super K> comparator() 
          返回对此映射中的键进行排序的比较器；如果此映射使用键的自然顺序，则返回 null。 
 boolean containsKey(Object key) 
          如果此映射包含指定键的映射关系，则返回 true。 
 boolean containsValue(Object value) 
          如果此映射为指定值映射一个或多个键，则返回 true。 
 NavigableSet<K> descendingKeySet() 
          返回此映射中所包含键的逆序 NavigableSet 视图。 
 NavigableMap<K,V> descendingMap() 
          返回此映射中所包含映射关系的逆序视图。 
 Set<Map.Entry<K,V>> entrySet() 
          返回此映射中包含的映射关系的 Set 视图。 
 Map.Entry<K,V> firstEntry() 
          返回一个与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。 
 K firstKey() 
          返回此映射中当前第一个（最低）键。 
 Map.Entry<K,V> floorEntry(K key) 
          返回一个键-值映射关系，它与小于等于给定键的最大键关联；如果不存在这样的键，则返回 null。 
 K floorKey(K key) 
          返回小于等于给定键的最大键；如果不存在这样的键，则返回 null。 
 V get(Object key) 
          返回指定键所映射的值，如果对于该键而言，此映射不包含任何映射关系，则返回 null。 
 SortedMap<K,V> headMap(K toKey) 
          返回此映射的部分视图，其键值严格小于 toKey。 
 NavigableMap<K,V> headMap(K toKey, boolean inclusive) 
          返回此映射的部分视图，其键小于（或等于，如果 inclusive 为 true）toKey。 
 Map.Entry<K,V> higherEntry(K key) 
          返回一个键-值映射关系，它与严格大于给定键的最小键关联；如果不存在这样的键，则返回 null。 
 K higherKey(K key) 
          返回严格大于给定键的最小键；如果不存在这样的键，则返回 null。 
 Set<K> keySet() 
          返回此映射包含的键的 Set 视图。 
 Map.Entry<K,V> lastEntry() 
          返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。 
 K lastKey() 
          返回映射中当前最后一个（最高）键。 
 Map.Entry<K,V> lowerEntry(K key) 
          返回一个键-值映射关系，它与严格小于给定键的最大键关联；如果不存在这样的键，则返回 null。 
 K lowerKey(K key) 
          返回严格小于给定键的最大键；如果不存在这样的键，则返回 null。 
 NavigableSet<K> navigableKeySet() 
          返回此映射中所包含键的 NavigableSet 视图。 
 Map.Entry<K,V> pollFirstEntry() 
          移除并返回与此映射中的最小键关联的键-值映射关系；如果映射为空，则返回 null。 
 Map.Entry<K,V> pollLastEntry() 
          移除并返回与此映射中的最大键关联的键-值映射关系；如果映射为空，则返回 null。 
 V put(K key, V value) 
          将指定值与此映射中的指定键进行关联。 
 void putAll(Map<? extends K,? extends V> map) 
          将指定映射中的所有映射关系复制到此映射中。 
 V remove(Object key) 
          如果此 TreeMap 中存在该键的映射关系，则将其删除。 
 int size() 
          返回此映射中的键-值映射关系数。 
 NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) 
          返回此映射的部分视图，其键的范围从 fromKey 到 toKey。 
 SortedMap<K,V> subMap(K fromKey, K toKey) 
          返回此映射的部分视图，其键值的范围从 fromKey（包括）到 toKey（不包括）。 
 SortedMap<K,V> tailMap(K fromKey) 
          返回此映射的部分视图，其键大于等于 fromKey。 
 NavigableMap<K,V> tailMap(K fromKey, boolean inclusive) 
          返回此映射的部分视图，其键大于（或等于，如果 inclusive 为 true）fromKey。 
 Collection<V> values() 
          返回此映射包含的值的 Collection 视图。 
 *
 */
public class TreeMapDemo {
    private static String message = null;
    public static void main(String[] args) {
        // 排序规则
        TreeMap<PersonTreeMap, String> tm = new TreeMap<PersonTreeMap, String>(
                new Comparator<PersonTreeMap>() {
                    @Override
                    public int compare(PersonTreeMap pt1, PersonTreeMap pt2) {
                        int ageCompareResult = pt1.getScore() - pt2.getScore();
                        int nameCompareResult = pt1.getName().compareTo(pt2.getName());
                        // 根据名字的先后顺序排序
                        int result = nameCompareResult == 0 ? ageCompareResult : nameCompareResult;
                        return result;
                    }
                });
        tm.put(new PersonTreeMap(95, "tudou"), "第一名");
        tm.put(new PersonTreeMap(92, "tiny"), "第二名");
        tm.put(new PersonTreeMap(90, "monica"), "第三名");
        tm.put(new PersonTreeMap(59, "zack"), "第四名");
        // 第一种方法
        Logger.getLogger(HashMapDemo.class).info("---------第一种方法-----------");
        display1(tm);
        Logger.getLogger(HashMapDemo.class).info("---------第二种方法-----------");
        display2(tm);
    }
    // 根据key找value，遍历
    static void display1(TreeMap<PersonTreeMap, String> tm) {
        Set<PersonTreeMap> set = tm.keySet();
        message = "姓名" + '\t' + "分数" + '\t' + "排名";
        Logger.getLogger(HashMapDemo.class).info(message);
        for (PersonTreeMap pt : set) {
            Logger.getLogger(HashMapDemo.class).info(
                    pt.getName() + '\t' + pt.getScore() + '\t' + tm.get(pt));
        }
    }
    // 根据视图遍历
    static void display2(TreeMap<PersonTreeMap, String> tm) {
        Set<Entry<PersonTreeMap, String>> set = tm.entrySet();
        String name = null;
        Integer score = null;
        String level = null;
        message = "姓名" + '\t' + "分数" + '\t' + "排名";
        Logger.getLogger(HashMapDemo.class).info(message);
        for (Entry<PersonTreeMap, String> s : set) {
            name = s.getKey().getName();
            score = s.getKey().getScore();
            level = s.getValue();
            Logger.getLogger(HashMapDemo.class).info(
                    name + '\t' + score + '\t' + level);
        }
    }
}
