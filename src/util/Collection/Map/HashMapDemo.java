package util.Collection.Map;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
/**
 * @author UODUT
 * ���ڹ�ϣ��� Map �ӿڵ�ʵ��
 * key��value������Ϊ��ֵ,��ͬ�����̲߳���ȫ��
 * ��Hashtable������Hashtable����ֵ��������Ϊnull���̰߳�ȫ��
 * �����ķ�����
 boolean containsKey(Object key) 
          �����ӳ���������ָ������ӳ���ϵ���򷵻� true�� 
 boolean containsValue(Object value) 
          �����ӳ�佫һ��������ӳ�䵽ָ��ֵ���򷵻� true�� 
 Set<Map.Entry<K,V>> entrySet() 
          ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ�� 
 V get(Object key) 
          ����ָ������ӳ���ֵ��������ڸü���˵����ӳ�䲻�����κ�ӳ���ϵ���򷵻� null�� 
 Set<K> keySet() 
          ���ش�ӳ�����������ļ��� Set ��ͼ�� 
 Collection<V> values() 
          ���ش�ӳ����������ֵ�� Collection ��ͼ�� 
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
        System.out.println("--------��һ�ַ�ʽ---------");
        display1(hashMap);
        System.out.println("--------�ڶ��ַ�ʽ---------");
        display2(hashMap);
    }
    // ���ݼ���ֵ
    static void display1(HashMap<String, Integer> hm) {
        // �õ����е�keyֵ
        Set<String> names = hm.keySet();
        System.out.println("����" + '\t' + "����");
        for (String name : names) {
            System.out.println(name + '\t' + hm.get(name));
        }
    }
    // ���ݼ�ֵ���Ҽ���ֵ
    static void display2(HashMap<String, Integer> hm) {
        System.out.println("����" + '\t' + "����");
        String name = null;
        Integer age = null;
        // �ҵ�set��ͼ
        Set<Entry<String, Integer>> set = hm.entrySet();
        for (Entry<String, Integer> s : set) {
            name = s.getKey();
            age = s.getValue();
            System.out.println(name + '\t' + age);
        }
    }
}
