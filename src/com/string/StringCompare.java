package com.string;
import org.apache.log4j.Logger;
/**
 * @author UODUT �Ƚ��ѷ������ַ����Ƚ�
 *
 */
public class StringCompare {
    public static void main(String[] args) {
        String str = "abc";
        String str1 = "abc";
        String str2 = new String("abc"); // new String();����һ������
        Logger.getLogger(StringCompare.class).info(str == str1); // true
        Logger.getLogger(StringCompare.class).info(str1 == "abc");// true
        Logger.getLogger(StringCompare.class).info(str2 == "abc"); // false
        Logger.getLogger(StringCompare.class).info(str1 == str2); // false
        Logger.getLogger(StringCompare.class).info(str1.equals(str2));// true
        Logger.getLogger(StringCompare.class).info(str1 == str2.intern()); // true
        Logger.getLogger(StringCompare.class).info(str2 == str2.intern()); // false
        Logger.getLogger(StringCompare.class)
                .info(str1.hashCode() == str2.hashCode()); // true
    }
}
/*
 * ������ truetruefalsefalsetruetruefalsetrue
 */
