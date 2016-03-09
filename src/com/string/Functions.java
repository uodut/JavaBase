package com.string;
import org.apache.log4j.Logger;
/**
 * 常用函数
 * 
 * @author UODUT
 *
 */
public class Functions {
    public static void main(String[] args) {
        String str1 = "sdfsdfsdjfk121";
        String str2 = "  Sd  rf  d";
        char[] c = { 's', 'd', 'r', 'f' };
        Logger.getLogger(Functions.class).info(str2.compareTo(str1));
        byte[] b = str2.getBytes();
        String str3 = "";
        Logger.getLogger(Functions.class).info(str3.isEmpty());
        Logger.getLogger(Functions.class).info(str2.toUpperCase());
        char[] cstr = str2.toCharArray();// 转换为字符数组
        // 忽略首部和尾部空格，对中间的空格不做处理
        Logger.getLogger(Functions.class).info(str2.trim());
        Logger.getLogger(Functions.class).info(str2.split(" ")[4]);
    }
}
