package util.concurrent;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 	//LinkedDeque,,ConcurrentSkipListSet,ConcurrentHashMap
 * @date 2016年3月1日
 * @author <a href = "wang.gaoliang@zte.com.cn">王高亮</a>
 * 原理
 * 		简单来说就是把大的HashMap切分成很多的Segment(段，大小默认为16)，
 * 		每个段它们有自己的锁。只要多个修改操作发生在不同的段上，它们就可以并发进行。
 * 		有些方法需要跨段，比如size()和containsValue()，它们可能需要锁定整个表而而不仅仅是某个段，
 * 		这需要按顺序锁定所有段，操作完毕后，又按顺序释放所有段的锁。
 * 		在ConcurrentHashMap内部，段数组是final的，并且其成员变量实际上也是final的，
 * 		但是，仅仅是将数组声明为final的并不保证数组成员也是final的，这需要实现上的保证。
 * 
 * 		用法和HashMap是一样的
 * 
 * 		ConcurrentHashMap实现技术是保证HashEntry几乎是不可变的。HashEntry代表每个hash链中的一个节点
 * ---------------------------------------------------------------------------------------------------------------------------------------------
 * ConcurrentSkipListMap：提供排序功能
 * 能
 */

public class ConcurrentHashMapDemo {
	public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> concurrentHashMap =  new ConcurrentHashMap<Integer,String>();
		//concurrentHashMap.put(key, value)
	}
}
