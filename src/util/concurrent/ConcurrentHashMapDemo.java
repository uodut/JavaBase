package util.concurrent;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 	//LinkedDeque,,ConcurrentSkipListSet,ConcurrentHashMap
 * @date 2016��3��1��
 * @author <a href = "wang.gaoliang@zte.com.cn">������</a>
 * ԭ��
 * 		����˵���ǰѴ��HashMap�зֳɺܶ��Segment(�Σ���СĬ��Ϊ16)��
 * 		ÿ�����������Լ�������ֻҪ����޸Ĳ��������ڲ�ͬ�Ķ��ϣ����ǾͿ��Բ������С�
 * 		��Щ������Ҫ��Σ�����size()��containsValue()�����ǿ�����Ҫ���������������������ĳ���Σ�
 * 		����Ҫ��˳���������жΣ�������Ϻ��ְ�˳���ͷ����жε�����
 * 		��ConcurrentHashMap�ڲ�����������final�ģ��������Ա����ʵ����Ҳ��final�ģ�
 * 		���ǣ������ǽ���������Ϊfinal�Ĳ�����֤�����ԱҲ��final�ģ�����Ҫʵ���ϵı�֤��
 * 
 * 		�÷���HashMap��һ����
 * 
 * 		ConcurrentHashMapʵ�ּ����Ǳ�֤HashEntry�����ǲ��ɱ�ġ�HashEntry����ÿ��hash���е�һ���ڵ�
 * ---------------------------------------------------------------------------------------------------------------------------------------------
 * ConcurrentSkipListMap���ṩ������
 * ��
 */

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> concurrentHashMap =  new ConcurrentHashMap<Integer,String>();
		//concurrentHashMap.put(key, value)
	}
}
