package com.util.collection.map;
import java.util.Comparator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import com.dao.PersonTreeMap;
import org.apache.log4j.Logger;
/**
 * �ײ�ʵ��Ϊ�������һ����ƽ��Ķ����������
 * 1��TreeMap�����������Ȼ˳��������򣬻��߸��ݴ���ӳ��ʱ�ṩ�� Comparator ��������
������
Map.Entry<K,V> ceilingEntry(K key) 
          ����һ����-ֵӳ���ϵ��������ڵ��ڸ���������С����������������������ļ����򷵻� null�� 
 K ceilingKey(K key) 
          ���ش��ڵ��ڸ���������С������������������ļ����򷵻� null�� 
 void clear() 
          �Ӵ�ӳ�����Ƴ�����ӳ���ϵ�� 
 Object clone() 
          ���ش� TreeMap ʵ����ǳ������ 
 Comparator<? super K> comparator() 
          ���ضԴ�ӳ���еļ���������ıȽ����������ӳ��ʹ�ü�����Ȼ˳���򷵻� null�� 
 boolean containsKey(Object key) 
          �����ӳ�����ָ������ӳ���ϵ���򷵻� true�� 
 boolean containsValue(Object value) 
          �����ӳ��Ϊָ��ֵӳ��һ�����������򷵻� true�� 
 NavigableSet<K> descendingKeySet() 
          ���ش�ӳ������������������ NavigableSet ��ͼ�� 
 NavigableMap<K,V> descendingMap() 
          ���ش�ӳ����������ӳ���ϵ��������ͼ�� 
 Set<Map.Entry<K,V>> entrySet() 
          ���ش�ӳ���а�����ӳ���ϵ�� Set ��ͼ�� 
 Map.Entry<K,V> firstEntry() 
          ����һ�����ӳ���е���С�������ļ�-ֵӳ���ϵ�����ӳ��Ϊ�գ��򷵻� null�� 
 K firstKey() 
          ���ش�ӳ���е�ǰ��һ������ͣ����� 
 Map.Entry<K,V> floorEntry(K key) 
          ����һ����-ֵӳ���ϵ������С�ڵ��ڸ�������������������������������ļ����򷵻� null�� 
 K floorKey(K key) 
          ����С�ڵ��ڸ���������������������������ļ����򷵻� null�� 
 V get(Object key) 
          ����ָ������ӳ���ֵ��������ڸü����ԣ���ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� 
 SortedMap<K,V> headMap(K toKey) 
          ���ش�ӳ��Ĳ�����ͼ�����ֵ�ϸ�С�� toKey�� 
 NavigableMap<K,V> headMap(K toKey, boolean inclusive) 
          ���ش�ӳ��Ĳ�����ͼ�����С�ڣ�����ڣ���� inclusive Ϊ true��toKey�� 
 Map.Entry<K,V> higherEntry(K key) 
          ����һ����-ֵӳ���ϵ�������ϸ���ڸ���������С����������������������ļ����򷵻� null�� 
 K higherKey(K key) 
          �����ϸ���ڸ���������С������������������ļ����򷵻� null�� 
 Set<K> keySet() 
          ���ش�ӳ������ļ��� Set ��ͼ�� 
 Map.Entry<K,V> lastEntry() 
          �������ӳ���е����������ļ�-ֵӳ���ϵ�����ӳ��Ϊ�գ��򷵻� null�� 
 K lastKey() 
          ����ӳ���е�ǰ���һ������ߣ����� 
 Map.Entry<K,V> lowerEntry(K key) 
          ����һ����-ֵӳ���ϵ�������ϸ�С�ڸ�������������������������������ļ����򷵻� null�� 
 K lowerKey(K key) 
          �����ϸ�С�ڸ���������������������������ļ����򷵻� null�� 
 NavigableSet<K> navigableKeySet() 
          ���ش�ӳ�������������� NavigableSet ��ͼ�� 
 Map.Entry<K,V> pollFirstEntry() 
          �Ƴ����������ӳ���е���С�������ļ�-ֵӳ���ϵ�����ӳ��Ϊ�գ��򷵻� null�� 
 Map.Entry<K,V> pollLastEntry() 
          �Ƴ����������ӳ���е����������ļ�-ֵӳ���ϵ�����ӳ��Ϊ�գ��򷵻� null�� 
 V put(K key, V value) 
          ��ָ��ֵ���ӳ���е�ָ�������й����� 
 void putAll(Map<? extends K,? extends V> map) 
          ��ָ��ӳ���е�����ӳ���ϵ���Ƶ���ӳ���С� 
 V remove(Object key) 
          ����� TreeMap �д��ڸü���ӳ���ϵ������ɾ���� 
 int size() 
          ���ش�ӳ���еļ�-ֵӳ���ϵ���� 
 NavigableMap<K,V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) 
          ���ش�ӳ��Ĳ�����ͼ������ķ�Χ�� fromKey �� toKey�� 
 SortedMap<K,V> subMap(K fromKey, K toKey) 
          ���ش�ӳ��Ĳ�����ͼ�����ֵ�ķ�Χ�� fromKey���������� toKey������������ 
 SortedMap<K,V> tailMap(K fromKey) 
          ���ش�ӳ��Ĳ�����ͼ��������ڵ��� fromKey�� 
 NavigableMap<K,V> tailMap(K fromKey, boolean inclusive) 
          ���ش�ӳ��Ĳ�����ͼ��������ڣ�����ڣ���� inclusive Ϊ true��fromKey�� 
 Collection<V> values() 
          ���ش�ӳ�������ֵ�� Collection ��ͼ�� 
 *
 */
public class TreeMapDemo {
    private static String message = null;
    public static void main(String[] args) {
        // �������
        TreeMap<PersonTreeMap, String> tm = new TreeMap<PersonTreeMap, String>(
                new Comparator<PersonTreeMap>() {
                    @Override
                    public int compare(PersonTreeMap pt1, PersonTreeMap pt2) {
                        int ageCompareResult = pt1.getScore() - pt2.getScore();
                        int nameCompareResult = pt1.getName().compareTo(pt2.getName());
                        // �������ֵ��Ⱥ�˳������
                        int result = nameCompareResult == 0 ? ageCompareResult : nameCompareResult;
                        return result;
                    }
                });
        tm.put(new PersonTreeMap(95, "tudou"), "��һ��");
        tm.put(new PersonTreeMap(92, "tiny"), "�ڶ���");
        tm.put(new PersonTreeMap(90, "monica"), "������");
        tm.put(new PersonTreeMap(59, "zack"), "������");
        // ��һ�ַ���
        Logger.getLogger(HashMapDemo.class).info("---------��һ�ַ���-----------");
        display1(tm);
        Logger.getLogger(HashMapDemo.class).info("---------�ڶ��ַ���-----------");
        display2(tm);
    }
    // ����key��value������
    static void display1(TreeMap<PersonTreeMap, String> tm) {
        Set<PersonTreeMap> set = tm.keySet();
        message = "����" + '\t' + "����" + '\t' + "����";
        Logger.getLogger(HashMapDemo.class).info(message);
        for (PersonTreeMap pt : set) {
            Logger.getLogger(HashMapDemo.class).info(
                    pt.getName() + '\t' + pt.getScore() + '\t' + tm.get(pt));
        }
    }
    // ������ͼ����
    static void display2(TreeMap<PersonTreeMap, String> tm) {
        Set<Entry<PersonTreeMap, String>> set = tm.entrySet();
        String name = null;
        Integer score = null;
        String level = null;
        message = "����" + '\t' + "����" + '\t' + "����";
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
