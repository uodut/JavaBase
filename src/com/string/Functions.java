package com.string;
import org.apache.log4j.Logger;
/**
 * ���ú���
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
        char[] cstr = str2.toCharArray();// ת��Ϊ�ַ�����
        // �����ײ���β���ո񣬶��м�Ŀո�������
        Logger.getLogger(Functions.class).info(str2.trim());
        Logger.getLogger(Functions.class).info(str2.split(" ")[4]);
    }
}
