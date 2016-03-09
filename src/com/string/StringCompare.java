package com.string;
import com.log.LogHandler;
/**
 * @author UODUT 比较难分析的字符串比较
 *
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc"); // new String();拷贝一个副本
        LogHandler.createUnSynInstance(StringCompare.class).info(str == str1); // true
        LogHandler.createUnSynInstance(StringCompare.class).info(str1 == "abc");// true
        LogHandler.createUnSynInstance(StringCompare.class).info(str2 == "abc"); // false
        LogHandler.createUnSynInstance(StringCompare.class).info(str1 == str2); // false
        LogHandler.createUnSynInstance(StringCompare.class).info(str1.equals(str2));// true
        LogHandler.createUnSynInstance(StringCompare.class).info(str1 == str2.intern()); // true
        LogHandler.createUnSynInstance(StringCompare.class).info(str2 == str2.intern()); // false
        LogHandler.createUnSynInstance(StringCompare.class)
                .info(str1.hashCode() == str2.hashCode()); // true
    }
}
/*
 * 输出结果 truetruefalsefalsetruetruefalsetrue
 */
