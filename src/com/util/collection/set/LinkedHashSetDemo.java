package com.util.collection.set;
import java.util.LinkedHashSet;
import com.log.LogHandler;
/**
 * @author UODUT 如果模块通过输入得到一个 set，复制这个 set，然后返回由此副本决定了顺序的结果，
 *         这种情况下这项技术特别有用。（客户通常期望内容返回的顺序与它们出现的顺序相同。）
 * 
 *         既保证了元素的唯一性，有保证了元素的有序性（区别于TreeSet,这里的有序指的是和添加顺序是相同的）
 *
 */
public class LinkedHashSetDemo {
    private static String message = null;
    public static void main(String[] args) {
        LinkedHashSet<String> ls = new LinkedHashSet<String>();
        ls.add("john snow");
        ls.add("evil");
        ls.add("joxiya");
        ls.add("hunt");
        message = "--------显示顺序和插入顺序一致--------";
        LogHandler.createUnSynInstance(LinkedHashSetDemo.class).info(message);
        display(ls);
        ls.add("test");
        message = "--------插入元素后显示顺序不变--------";
        LogHandler.createUnSynInstance(LinkedHashSetDemo.class).info(message);
        display(ls);
        ls.remove("evil");
        message = "---------删除元素后原元素显示顺序依然不变-------";
        LogHandler.createUnSynInstance(LinkedHashSetDemo.class).info(message);
        display(ls);
    }
    static void display(LinkedHashSet<String> ls) {
        for (String s : ls) {
            LogHandler.createUnSynInstance(LinkedHashSetDemo.class).info(s);
        }
    }
}
