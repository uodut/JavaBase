package com.util.collection.map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.log4j.Logger;
/**
 * @author UODUT ���ڹ�ϣ��� Map �ӿڵ�ʵ�� key��value������Ϊ��ֵ,��ͬ�����̲߳���ȫ��
 *         ��Hashtable������Hashtable����ֵ��������Ϊnull���̰߳�ȫ�� �����ķ����� boolean
 *         containsKey(Object key) �����ӳ���������ָ������ӳ���ϵ���򷵻� true�� boolean
 *         containsValue(Object value) �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true��
 *         Set<Map.Entry<K,V>> entrySet() ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ�� V get(Object
 *         key) ����ָ������ӳ���ֵ��������ڸü���˵����ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� Set<K> keySet()
 *         ���ش�ӳ�����������ļ��� Set ��ͼ�� Collection<V> values() ���ش�ӳ����������ֵ�� Collection
 *         ��ͼ��
 *
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("wang", 20);
        hashMap.put("zhang", 19);
        hashMap.put("liu", 20);
        hashMap.put("li", 19);
        hashMap.put("liu", 21);// �Զ����ǵ�һ����ͬ��key
        hashMap.put(null, null);
        // hashMap.put(null, 0);
        Logger.getLogger(HashMapDemo.class).info("--------��һ�ַ�ʽ---------");
        display1(hashMap);
        Logger.getLogger(HashMapDemo.class).info("--------�ڶ��ַ�ʽ---------");
        display2(hashMap);
    }
    // ���ݼ���ֵ
    static void display1(HashMap<String, Integer> hm) {
        // �õ����е�keyֵ
        Set<String> names = hm.keySet();
        Logger.getLogger(HashMapDemo.class).info("����" + '\t' + "����");
        for (String name : names) {
            Logger.getLogger(HashMapDemo.class).info(name + '\t' + hm.get(name));
        }
    }
    // ���ݼ�ֵ���Ҽ���ֵ
    static void display2(HashMap<String, Integer> hm) {
        Logger.getLogger(HashMapDemo.class).info("����" + '\t' + "����");
        String name = null;
        Integer age = null;
        // �ҵ�set��ͼ
        Set<Entry<String, Integer>> set = hm.entrySet();
        for (Entry<String, Integer> s : set) {
            name = s.getKey();
            age = s.getValue();
            Logger.getLogger(HashMapDemo.class).info(name + '\t' + age);
        }
    }
}
